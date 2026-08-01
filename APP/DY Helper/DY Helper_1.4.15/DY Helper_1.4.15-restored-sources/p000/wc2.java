package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wc2 implements p000.vc2 {

    /* JADX INFO: renamed from: β */
    public final p000.C0966x f11683;

    public wc2() {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            x r0 = p000.C0966x.f11919
            goto Lb
        L9:
            x r0 = p000.C0966x.f11920
        Lb:
            r8.<init>()
            r8.f11683 = r0
            r8 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r8 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r8 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r8 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r8 = 16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r8 = 32
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r8 = 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r8 = 128(0x80, float:1.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r8 = new java.lang.Integer[]{r0, r1, r2, r3, r4, r5, r6, r7}
            p000.AbstractC1021yh.m6879(r8)
            return
    }
}
