package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements p000.xl0 {
    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: α */
    public final java.util.List mo461() {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // p000.xl0
    /* JADX INFO: renamed from: β */
    public final java.lang.Object mo462(android.content.Context r3) {
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            ij1 r1 = new ij1
            r1.<init>(r2, r3)
            r0.postFrameCallback(r1)
            rk0 r2 = new rk0
            r3 = 15
            r2.<init>(r3)
            return r2
    }
}
