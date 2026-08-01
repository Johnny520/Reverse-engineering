package p000;

/* JADX INFO: renamed from: ar */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0050ar {

    /* JADX INFO: renamed from: α */
    public static final p000.InterfaceC0845tr f1286 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = p000.j22.f5301
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L17
            kotlinx.coroutines.β r0 = kotlinx.coroutines.RunnableC0480.f6067
            goto L21
        L17:
            jr r0 = p000.AbstractC0524lt.f6767
            nc0 r0 = p000.qw0.f9151
            nc0 r1 = r0.f7516
            if (r0 != 0) goto L21
            kotlinx.coroutines.β r0 = kotlinx.coroutines.RunnableC0480.f6067
        L21:
            p000.AbstractC0050ar.f1286 = r0
            return
    }
}
