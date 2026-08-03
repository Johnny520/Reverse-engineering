package ad;

import javax.xml.parsers.DocumentBuilderFactory;
import p012ah.C0086a;

/* JADX INFO: renamed from: ad.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0067a {

    /* JADX INFO: renamed from: a */
    public static final DocumentBuilderFactory f222a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/dom/create-entity-ref-nodes", false);
            documentBuilderFactoryNewInstance.setXIncludeAware(false);
            documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
            f222a = documentBuilderFactoryNewInstance;
        } catch (Exception e6) {
            C0086a.m457p("Fail to build secure XML DocumentBuilderFactory", e6);
        }
    }
}
