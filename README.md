# Knime
A workflow is a sequence of computational steps applied to a single or multiple input data sets to process and 
analyze the data. In KNIME such workflows are implemented graphically by combining so-called nodes.
A node represents a single analysis step in a workflow.
Nodes have input and output ports where the data enters the node or the results are provided for other nodes after
processing, respectively.

# KNIME Setup in eclipse:
  In order to start developing KNIME source code, you need to set up a KNIME SDK. A KNIME SDK in a
  configured Eclipse installation which contains KNIME Analytics Platform dependencies.
  
## 1. KNIME SDK setup:
      To setup your KNIME SDK, we start with an "Eclipse IDE for RCP and RAP Developers"
      installation and add all KNIME Analytics Platfrom dependencies
     - Setup guide link:: https://github.com/knime/knime-sdk-setup

## Create a New KNIME Extension Project:
    After Eclipse is set up and configured, create a new KNIME Extension project.

### The KNIME Node Wizard:
#### 1. Install the KNIME Node Wizard:
  - Open the Eclipse installation wizard at **Help → Install New Software...**,        
  - Enter the following update site location: http://update.knime.com/analytics-platform/4.1/ 
      in the location box labelled Work with:.
  - Hit the **Enter key**, and put KNIME Node Wizard in the search box.              
  - Tick the KNIME Node Wizard under the category KNIME Node Development Tools ,    
  - Click the Next button and follow the instructions. 
  - Finally, restart Eclipse.
 
 #### Note: 
 Replace the version number in the update site location with the latest version of KNIME analytics Platform.

#### 2. Start the KNIME Node Wizard:
  - After Eclipse has restarted, start the KNIME Node Wizard at ** File → New → Other... ** ,
  - Select **Create a new KNIME Node-Extension** (can be found in the category Other ),
  - Hit the Next button.
    
#### 3. Create a KNIME Extension Project
  In the **Create new KNIME Node-Extension0** dialog window enter the following values:   
  - New Project Name: *org.knime.examples.numberformatter*
  - Node class name: *NumberFormatter*
  - Package name: *org.knime.examples.numberformatter*
  - Node vendor: *<your_name>*
  - Node type: Select *Manipulator* in the drop down menu.
  Replace **<your_name>** with the name that you like to be the author of the created
    extension. Leave all other options as is and click **Finish**. 

##### After some processing, a new project will be displayed in the Package Explorer view of Eclipse with the project name you gave it in the wizard dialog.
