package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jq0 implements p000.f12 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.kq0 f5545;

    public jq0(p000.kq0 r1) {
            r0 = this;
            r0.<init>()
            r0.f5545 = r1
            int[] r0 = p000.an0.f333
            o11 r0 = new o11
            r0.<init>()
            return
    }

    @Override // p000.f12
    /* JADX INFO: renamed from: α */
    public final void mo1993() {
            r7 = this;
            kq0 r7 = r7.f5545
            yp0 r0 = r7.f6080
            r7.m3406()
            b21 r1 = r7.f6088
            s62 r2 = p000.s62.f9751
            java.lang.Object r1 = r1.m699(r2)
            yp0 r1 = (p000.yp0) r1
            r3 = 1
            if (r1 == 0) goto L6d
            int r4 = r7.f6093
            if (r4 <= 0) goto L19
            goto L1e
        L19:
            java.lang.String r4 = "No pre-composed items to dispose"
            p000.am0.m178(r4)
        L1e:
            java.util.List r4 = r0.m7000()
            h21 r4 = (p000.h21) r4
            k21 r4 = r4.f4540
            int r4 = r4.m3134(r1)
            java.util.List r5 = r0.m7000()
            h21 r5 = (p000.h21) r5
            k21 r5 = r5.f4540
            int r5 = r5.f5718
            int r6 = r7.f6093
            int r5 = r5 - r6
            if (r4 < r5) goto L3a
            goto L3f
        L3a:
            java.lang.String r5 = "Item is not in pre-composed item range"
            p000.am0.m178(r5)
        L3f:
            int r5 = r7.f6092
            int r5 = r5 + r3
            r7.f6092 = r5
            int r5 = r7.f6093
            int r5 = r5 + (-1)
            r7.f6093 = r5
            b21 r5 = r7.f6084
            java.lang.Object r1 = r5.m695(r1)
            dq0 r1 = (p000.dq0) r1
            if (r1 == 0) goto L57
            r1.getClass()
        L57:
            java.util.List r1 = r0.m7000()
            h21 r1 = (p000.h21) r1
            k21 r1 = r1.f4540
            int r1 = r1.f5718
            int r5 = r7.f6093
            int r1 = r1 - r5
            int r5 = r7.f6092
            int r1 = r1 - r5
            r7.m3408(r4, r1)
            r7.m3405(r1)
        L6d:
            k21 r7 = r7.f6091
            boolean r7 = r7.m3133(r2)
            if (r7 == 0) goto L79
            r7 = 6
            p000.yp0.m6968(r0, r3, r7)
        L79:
            return
    }
}
