package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements p000.iv1 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.kv1 f5592;

    public jv1(p000.kv1 r1) {
            r0 = this;
            r0.<init>()
            r0.f5592 = r1
            return
    }

    @Override // p000.iv1
    /* JADX INFO: renamed from: α */
    public final p000.u81 mo2812(long r4, p000.np0 r6, p000.InterfaceC1031yr r7) {
            r3 = this;
            r6.getClass()
            r7.getClass()
            kv1 r3 = r3.f5592
            p70 r0 = r3.f6123
            java.lang.Object r0 = r0.invoke()
            iv1 r0 = (p000.iv1) r0
            iv1 r1 = r3.f6124
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 != 0) goto L1d
            r3.f6124 = r0
            r1 = 0
            r3.f6125 = r1
        L1d:
            u81 r1 = r3.f6125
            if (r1 == 0) goto L3e
            long r1 = r3.f6126
            boolean r1 = p000.jw1.m2997(r1, r4)
            if (r1 == 0) goto L3e
            np0 r1 = r3.f6127
            if (r1 != r6) goto L3e
            java.lang.Float r1 = r3.f6128
            float r2 = r7.mo586()
            if (r1 == 0) goto L3e
            float r1 = r1.floatValue()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3e
            goto L52
        L3e:
            r3.f6126 = r4
            r3.f6127 = r6
            float r1 = r7.mo586()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r3.f6128 = r1
            u81 r4 = r0.mo2812(r4, r6, r7)
            r3.f6125 = r4
        L52:
            u81 r3 = r3.f6125
            r3.getClass()
            return r3
    }
}
