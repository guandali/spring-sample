// Place your Spring DSL code here
import com.bosap.gisp.PropertyConfig;

import grails.util.Holders;
beans = {
	propertyConfig(PropertyConfig){
		
			adminemail='adminemail'
			applicationemail= 'applicationemail'
			contactemail = 'contactemail'
			mailpostfix = 'mailpostfix'
			helppage = 'helppage'
			gispip = 'gispip'
			getscanrequestsservice = 'getscanrequestsservice'
			getscanstatsservice='getscanstatsservice'
			getallanalystservice='getallanalystservice'
			assignAnalystsToRequest='assignAnalystsToRequest'
			getapprovalformservice='getapprovalformservice'
			aproveApprovalFormService='aproveApprovalFormService'
			saveApprovalFormService='saveApprovalFormService'
			approveScanStepService='approveScanStepService'
			
	 
			//ipApprovalSteps='ipApprovalSteps'
			//exportApprovalSteps='exportApprovalSteps'
			progressupload='progressupload'
			progresscodecenter1='progresscodecenter1'
			progresscodecenter2='progresscodecenter2'
			progressprotex1='progressprotex1'
			progressprotex2='progressprotex2'
			progressprotex3='progressprotex3'
			progressapproved='progressapproved'
			requestprogress='requestprogress'
			delimiter='delimiter'
			supportedUploadTypes='supportedUploadTypes'
			nexusurl='nexusurl'
			nexushttpport='nexushttpport'
			nexushttpsport='nexushttpsport'
			
			gerritport='gerritport'
			gitport='gitport'
			githubport='githubport'
			hdbgerritport='hdbgerritport'
			productiongitport='productiongitport'
			stashport='stashport'
			gispScripts='gispScripts'
			knowngithosts='knowngithosts'
			//shipnotship='shipnotship'
			environmenttype='environmenttype'
			proddownloadlocation='proddownloadlocation'
			//devdownloadlocation='devdownloadlocation'
	
			codecenterserver='codecenterserver'
			//username='username'
			//password='password'
			//defaultlicense='defaultlicense'
			applicationname='applicationname'
			//mobileapplicationname='mobileapplicationname'
			applicationversion='applicationversion'
			componentversionprefix='componentversionprefix'
			approver='approver'
			approver2='approver2'
			//databaseaddress='databaseaddress'
			//databaseaddressproduction='databaseaddressproduction'
			//databasename='databasename'
			//databaseschema='databaseschema'
			//databaseusername='databaseusername'
			//databasepassword='databasepassword'
			//programidname='programidname'
			requestername='requestername'
			engcontactname='engcontactname'
			productnamename='productnamename'
			productversionname='productversionname'
			previousname='previousname'
			protexscanname='protexscanname'
			protexscanvalue='protexscanvalue'
			exportscanname='exportscanname'
			exportscanvalue='exportscanvalue'
			ignorePreviousScanAID='ignorePreviousScanAID'
			ignorePreviousScanOptionValue='ignorePreviousScanOptionValue'
			srcshippedname='srcshippedname'
			isBackLogProcessAID='isBackLogProcessAID'
			rtcDateAID ='rtcDateAID'
			devStartDateAID='devStartDateAID'
			devEndDateAID='devEndDateAID'
			deliveryIsSoldAID='deliveryIsSoldAID'
			deliveryModeAID='deliveryModeAID'
			codetreeAID='codetreeAID'
			scantypename='scantypename'
			scantypecomments='scantypecomments'
			scantypevalue='scantypevalue'
			//totalmbname='totalmbname'
			//totalsrcmbname='totalsrcmbname'
			//totalsloccountname='totalsloccountname'
			//protexprojectname='protexprojectname'
			//protexprojectid='protexprojectid'
			componentcodetree='componentcodetree'
			componentcodetreeId='componentcodetreeId'
			//componentprid='componentprid'
			componentprogramname='componentprogramname'
			protexservername='protexservername'
			//onetimescangroup='onetimescangroup'
			//totalcodematchesname='totalcodematchesname'
			//totalstringsearchesname='totalstringsearchesname'
			//totalpattermatchesname='totalpattermatchesname'
			requiredapprovals='requiredapprovals'
			actualapprovalname='actualapprovalname'
			//protexapprovalname='protexapprovalname'
			protexworkflow='protexworkflow'
			exportworkflow='exportworkflow'
			workflowlegend='workflowlegend'
			allvalidapplications='allvalidapplications'
	 
	 
	
			//Protex service...
			protexusername='protexusername'
			protexpassword='protexpassword'
			//serverport='serverport'
			destinationfolderbasepath='destinationfolderbasepath'
			destinationfoldernobase='destinationfoldernobase'
			destinationfolder='destinationfolder'
			sshusername='sshusername'
			sshpassword='sshpassword'
			//sizecommand='sizecommand'
			//sloccommand='sloccommand'
			//lastUsedProtexServer='lastUsedProtexServer'
			blacklistedprotexservers='blacklistedprotexservers'
			getprojectidservice='getprojectidservice'
			updatepathservice='updatepathservice'
			cloneprojectservice='cloneprojectservice'
			createprojectservice='createprojectservice'
			scanstatsservice='scanstatsservice'
			logerrorservice='logerrorservice'
			bomComponentsService='bomComponentsService'
			projectCodeTreeService='projectCodeTreeService'
			scanProjectService='scanProjectService'
			getRequestFormService='getRequestFormService'
			
			//CCSDK...
			createRequestAttachmentByFilePath='createRequestAttachmentByFilePath'
			createRequestAttachmentByContent='createRequestAttachmentByContent'
			
			//TrakingSystem...
			getAttributeAllowedValues='getAttributeAllowedValues'
			getComponentAttributeValue='getComponentAttributeValue'
			getUserIdForName='getUserIdForName'
			getComponentByName='getComponentByName'
			getComponents='getComponents'
			getComponentsProduction='getComponentsProduction'
			getPermittedUsersForRequest='getPermittedUsersForRequest'
			createComponent='createComponent'
			createRequest='createRequest'
			updateInboundBomSnapshotRequestStatus='updateInboundBomSnapshotRequestStatus'
			
			updateComponentAttribute='updateComponentAttribute'
			createRequestAttachment='createRequestAttachment'
			
			createRequestsForComponentCollection='createRequestsForComponentCollection'
			getAllLicense='getAllLicense'
			getImproperLicense='getImproperLicense'
			getSuggestedComponents='getSuggestedComponents'
			getSuggestedComponentVersion='getSuggestedComponentVersion'
			setSuggestedComponentLicenses='setSuggestedComponentLicenses'
			updateGenericKBComponentIdLicensesByName='updateGenericKBComponentIdLicensesByName'
		  
			getScanRequestByProgramId='getScanRequestByProgramId'
			getRequestIdForComponentApplication='getRequestIdForComponentApplication'
			getComponentByNameVersion='getComponentByNameVersion'
			updateBomSnapShot='updateBomSnapShot'
			removeUserRoleFromRequest='removeUserRoleFromRequest'
			addUserRoleToRequest='addUserRoleToRequest'
			createUser='createUser'
			programRepositoryId='programRepositoryId'
			getBomSnapShotByRequest='getBomSnapShotByRequest'
			componentprogramId='componentprogramId'
			applicationid='applicationid'
			getInboundBomSnapshotService='getInboundBomSnapshotService'
			updateProtexBomService='updateProtexBomService'
			updateInboundBomSnapshotService='updateInboundBomSnapshotService'
			checkViewBomConditions='checkViewBomConditions'
			queryIsBackLogProcessByRequestId='queryIsBackLogProcessByRequestId'
			
			ccSDKUrl='ccSDKUrl'
			tsUrl='tsUrl'
			protexUrl = 'protexUrl'
			inboundUrl='inboundUrl'
			trackingSystemBomProcessUrl='trackingSystemBomProcessUrl'
			gispUtilsUrl='gispUtilsUrl'
			sendEmail='sendEmail'
					getPMs='getPMs'
			
			siriusServiceUrl='siriusServiceUrl'
			getSuggestProgramDeliveriesByName='getSuggestProgramDeliveriesByName'
		}
}
