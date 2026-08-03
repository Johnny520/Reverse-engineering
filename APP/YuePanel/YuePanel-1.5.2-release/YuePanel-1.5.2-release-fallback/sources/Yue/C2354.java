package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2354 extends Yue.C2372 {
    public C2354(@Yue.InterfaceC4418 java.io.File r2, @Yue.InterfaceC4543 java.io.File r3, @Yue.InterfaceC4543 java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2, r3, r4)
            return
    }

    public /* synthetic */ C2354(java.io.File r2, java.io.File r3, java.lang.String r4, int r5, Yue.C1769 r6) {
            r1 = this;
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            r1.<init>(r2, r3, r4)
            return
    }
}
