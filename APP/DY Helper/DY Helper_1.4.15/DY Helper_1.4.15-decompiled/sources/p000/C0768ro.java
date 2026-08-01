package p000;

/* JADX INFO: renamed from: ro */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0768ro extends p000.C0805so {

    /* JADX INFO: renamed from: ε */
    public final p000.po1 f9423;

    /* JADX INFO: renamed from: ζ */
    public final p000.po1 f9424;

    /* JADX INFO: renamed from: η */
    public final float[] f9425;

    public C0768ro(p000.po1 r9, p000.po1 r10) {
            r8 = this;
            r0 = 0
            r8.<init>(r10, r9, r10, r0)
            r8.f9423 = r9
            r8.f9424 = r10
            n r0 = p000.C0568n.f7334
            java.lang.Object r0 = r0.f7336
            float[] r0 = (float[]) r0
            nb2 r1 = r9.f8625
            float[] r9 = r9.f8630
            nb2 r2 = r10.f8625
            float[] r3 = r10.f8631
            boolean r4 = p000.ln0.m3634(r1, r2)
            if (r4 == 0) goto L21
            float[] r9 = p000.ln0.m3614(r3, r9)
            goto L5c
        L21:
            float[] r4 = r1.m4018()
            float[] r5 = r2.m4018()
            nb2 r6 = p000.AbstractC0782s1.f9645
            boolean r1 = p000.ln0.m3634(r1, r6)
            r7 = 3
            if (r1 != 0) goto L3f
            float[] r1 = new float[r7]
            r1 = {x0060: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r1 = p000.ln0.m3630(r0, r4, r1)
            float[] r9 = p000.ln0.m3614(r1, r9)
        L3f:
            boolean r1 = p000.ln0.m3634(r2, r6)
            if (r1 != 0) goto L58
            float[] r1 = new float[r7]
            r1 = {x006a: FILL_ARRAY_DATA , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r0 = p000.ln0.m3630(r0, r5, r1)
            float[] r10 = r10.f8630
            float[] r10 = p000.ln0.m3614(r0, r10)
            float[] r3 = p000.ln0.m3607(r10)
        L58:
            float[] r9 = p000.ln0.m3614(r3, r9)
        L5c:
            r8.f9425 = r9
            return
    }

    @Override // p000.C0805so
    /* JADX INFO: renamed from: α */
    public final long mo4939(long r7) {
            r6 = this;
            float r0 = p000.C0114ci.m1197(r7)
            float r1 = p000.C0114ci.m1196(r7)
            float r2 = p000.C0114ci.m1194(r7)
            float r7 = p000.C0114ci.m1193(r7)
            po1 r8 = r6.f9423
            lo1 r8 = r8.f8637
            double r3 = (double) r0
            double r3 = r8.mo1800(r3)
            float r0 = (float) r3
            double r3 = (double) r1
            double r3 = r8.mo1800(r3)
            float r1 = (float) r3
            double r2 = (double) r2
            double r2 = r8.mo1800(r2)
            float r8 = (float) r2
            r2 = 0
            float[] r3 = r6.f9425
            r2 = r3[r2]
            float r2 = r2 * r0
            r4 = 3
            r4 = r3[r4]
            float r4 = r4 * r1
            float r4 = r4 + r2
            r2 = 6
            r2 = r3[r2]
            float r2 = r2 * r8
            float r2 = r2 + r4
            r4 = 1
            r4 = r3[r4]
            float r4 = r4 * r0
            r5 = 4
            r5 = r3[r5]
            float r5 = r5 * r1
            float r5 = r5 + r4
            r4 = 7
            r4 = r3[r4]
            float r4 = r4 * r8
            float r4 = r4 + r5
            r5 = 2
            r5 = r3[r5]
            float r5 = r5 * r0
            r0 = 5
            r0 = r3[r0]
            float r0 = r0 * r1
            float r0 = r0 + r5
            r1 = 8
            r1 = r3[r1]
            float r1 = r1 * r8
            float r1 = r1 + r0
            po1 r6 = r6.f9424
            lo1 r8 = r6.f8634
            double r2 = (double) r2
            double r2 = r8.mo1800(r2)
            float r8 = (float) r2
            lo1 r0 = r6.f8634
            double r2 = (double) r4
            double r2 = r0.mo1800(r2)
            float r2 = (float) r2
            double r3 = (double) r1
            double r0 = r0.mo1800(r3)
            float r0 = (float) r0
            long r6 = p000.kn0.m3358(r8, r2, r0, r7, r6)
            return r6
    }
}
