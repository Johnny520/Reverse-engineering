package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t11 extends p000.cx0 implements p000.oo0 {

    /* JADX INFO: renamed from: θ */
    public final p000.ka1 f10135;

    /* JADX INFO: renamed from: ι */
    public java.lang.Object f10136;

    public t11(p000.ka1 r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0, r4)
            r1.f10135 = r2
            r1.f10136 = r4
            return
    }

    @Override // p000.cx0, java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f10136
            return r0
    }

    @Override // p000.cx0, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.f10136
            r5.f10136 = r6
            ka1 r1 = r5.f10135
            ia1 r1 = r1.f5826
            fa1 r2 = r1.f4973
            java.lang.Object r5 = r5.f2793
            boolean r3 = r2.containsKey(r5)
            if (r3 != 0) goto L13
            return r0
        L13:
            boolean r3 = r1.f4670
            if (r3 == 0) goto L3c
            if (r3 == 0) goto L37
            a62[] r3 = r1.f4668
            int r4 = r1.f4669
            r3 = r3[r4]
            java.lang.Object[] r4 = r3.f78
            int r3 = r3.f80
            r3 = r4[r3]
            r2.put(r5, r6)
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.hashCode()
            goto L31
        L30:
            r6 = r5
        L31:
            z52 r4 = r2.f3840
            r1.m2700(r6, r4, r3, r5)
            goto L3f
        L37:
            p000.C1080.m7277()
            r5 = 0
            return r5
        L3c:
            r2.put(r5, r6)
        L3f:
            int r5 = r2.f3842
            r1.f4976 = r5
            return r0
    }
}
