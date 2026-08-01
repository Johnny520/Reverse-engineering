package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class t31 {

    /* JADX INFO: renamed from: α */
    public final p000.k21 f10166;

    /* JADX INFO: renamed from: β */
    public final p000.v11 f10167;

    public t31() {
            r2 = this;
            r2.<init>()
            k21 r0 = new k21
            r1 = 16
            h31[] r1 = new p000.h31[r1]
            r0.<init>(r1)
            r2.f10166 = r0
            v11 r0 = new v11
            r1 = 10
            r0.<init>(r1)
            r2.f10167 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public boolean mo2353(p000.zv0 r6, p000.mp0 r7, p000.C0574n5 r8, boolean r9) {
            r5 = this;
            k21 r5 = r5.f10166
            java.lang.Object[] r0 = r5.f5716
            int r5 = r5.f5718
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r5) goto L1e
            r4 = r0[r2]
            h31 r4 = (p000.h31) r4
            boolean r4 = r4.mo2353(r6, r7, r8, r9)
            if (r4 != 0) goto L1a
            if (r3 == 0) goto L18
            goto L1a
        L18:
            r3 = r1
            goto L1b
        L1a:
            r3 = 1
        L1b:
            int r2 = r2 + 1
            goto L9
        L1e:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public void mo2354(p000.C0574n5 r2) {
            r1 = this;
            k21 r1 = r1.f10166
            int r2 = r1.f5718
            int r2 = r2 + (-1)
        L6:
            r0 = -1
            if (r0 >= r2) goto L1b
            java.lang.Object[] r0 = r1.f5716
            r0 = r0[r2]
            h31 r0 = (p000.h31) r0
            v r0 = r0.f4558
            int r0 = r0.f11044
            if (r0 != 0) goto L18
            r1.m3136(r2)
        L18:
            int r2 = r2 + (-1)
            goto L6
        L1b:
            return
    }
}
