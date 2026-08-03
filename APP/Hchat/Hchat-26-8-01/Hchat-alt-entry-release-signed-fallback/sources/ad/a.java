package ad;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final javax.xml.parsers.DocumentBuilderFactory f222a = null;

    static {
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "http://apache.org/xml/features/disallow-doctype-decl"
            r2 = 1
            r0.setFeature(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "http://apache.org/xml/features/nonvalidating/load-external-dtd"
            r2 = 0
            r0.setFeature(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "http://xml.org/sax/features/external-general-entities"
            r0.setFeature(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "http://xml.org/sax/features/external-parameter-entities"
            r0.setFeature(r1, r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r1 = "http://apache.org/xml/features/dom/create-entity-ref-nodes"
            r0.setFeature(r1, r2)     // Catch: java.lang.Exception -> L28
            r0.setXIncludeAware(r2)     // Catch: java.lang.Exception -> L28
            r0.setExpandEntityReferences(r2)     // Catch: java.lang.Exception -> L28
            ad.a.f222a = r0
            return
        L28:
            r0 = move-exception
            java.lang.String r1 = "Fail to build secure XML DocumentBuilderFactory"
            ah.a.p(r1, r0)
            return
    }
}
