package mysql

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import groovy.sql.Sql
public class DB {
	@Keyword
	def DBconnect(url,userName,password){
		return Sql.newInstance(url,userName,password,"com.mysql.jdbc.Driver")
	}

	@Keyword
	def executeSql_Core(sql){
		def db_url=GlobalVariable.G_dbUrl
		def userName=GlobalVariable.G_dbUser
		def password=GlobalVariable.G_dbPassword
		//def ss=GlobalVariable
		Sql con=new DB().DBconnect(db_url,userName,password)
		con.execute(sql)
		con.close()
		con=null
	}

	@Keyword
	def DBclose(Sql db){
		db.close()
		db=null
	}
}