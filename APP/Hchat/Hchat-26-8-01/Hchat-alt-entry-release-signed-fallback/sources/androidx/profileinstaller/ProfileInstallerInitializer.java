package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements x3.b {
    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // x3.b
    public final java.util.List a() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // x3.b
    public final java.lang.Object b(android.content.Context r3) {
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            n2.x r1 = new n2.x
            r1.<init>(r2, r3)
            r0.postFrameCallback(r1)
            l3.w r3 = new l3.w
            r0 = 26
            r3.<init>(r0)
            return r3
    }
}
