package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eq1 implements p000.hq1 {

    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 f3643;

    /* JADX INFO: renamed from: β */
    public boolean f3644;

    /* JADX INFO: renamed from: γ */
    public android.os.Bundle f3645;

    /* JADX INFO: renamed from: δ */
    public final p000.h22 f3646;

    public eq1(p000.C0574n5 r2, p000.r92 r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f3643 = r2
            dq1 r2 = new dq1
            r0 = 0
            r2.<init>(r0, r3)
            h22 r3 = new h22
            r3.<init>(r2)
            r1.f3646 = r3
            return
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: α */
    public final android.os.Bundle mo1949() {
            r4 = this;
            r0 = 0
            l91[] r1 = new p000.l91[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            l91[] r1 = (p000.l91[]) r1
            android.os.Bundle r1 = p000.jx0.m3044(r1)
            android.os.Bundle r2 = r4.f3645
            if (r2 == 0) goto L14
            r1.putAll(r2)
        L14:
            h22 r2 = r4.f3646
            java.lang.Object r2 = r2.getValue()
            fq1 r2 = (p000.fq1) r2
            java.util.LinkedHashMap r2 = r2.f4067
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L2f
            r4.f3644 = r0
            return r1
        L2f:
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r4.getValue()
            zp1 r4 = (p000.zp1) r4
            r4.getClass()
            r4 = 0
            throw r4
    }
}
