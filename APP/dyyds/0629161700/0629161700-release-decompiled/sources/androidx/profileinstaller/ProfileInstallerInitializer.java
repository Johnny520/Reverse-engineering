package androidx.profileinstaller;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements defpackage.InterfaceC0485 {
    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.List mo102() {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // defpackage.InterfaceC0485
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo103(android.content.Context r3) {
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            ᛴᛱᛸᛶ r1 = new ᛴᛱᛸᛶ
            r1.<init>(r2, r3)
            r0.postFrameCallback(r1)
            ᛸᛵᛴᛲ r2 = new ᛸᛵᛴᛲ
            r2.<init>()
            return r2
    }
}
