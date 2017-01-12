package io.github.devbhuwan.spagobi.web.jsp.integration.util;

import it.eng.spagobi.sdk.documents.bo.SDKDocument;
import it.eng.spagobi.sdk.proxy.DocumentsServiceProxy;

import java.rmi.RemoteException;

/**
 * @author Bhuwan Prasad Upadhyay
 * @date 1/4/2017
 */
public class DocumentUtil {

    public static SDKDocument[] listSdkDocuments() throws RemoteException {
        DocumentsServiceProxy proxy = new DocumentsServiceProxy("biadmin", "biadmin");
        proxy.setEndpoint("http://localhost:8080/SpagoBI/sdk/DocumentsService");
        return proxy.getDocumentsAsList(null, null, null);
    }

}
