package yyds;

/* JADX INFO: renamed from: yyds.ᲇᛶᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2465 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC2800 f12170;

    static {
        String property;
        InterfaceC2800 interfaceC2800;
        int i = AbstractC1445.f6859;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C1158 c11582 = c1158.f5340;
            interfaceC2800 = c1158;
            if (c1158 == null) {
                interfaceC2800 = RunnableC1433.f6788;
            }
        } else {
            interfaceC2800 = RunnableC1433.f6788;
        }
        f12170 = interfaceC2800;
    }
}
