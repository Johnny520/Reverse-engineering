package p000;

/* JADX INFO: renamed from: sm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0803sm {

    /* JADX INFO: renamed from: α */
    public final java.util.HashMap f9955;

    /* JADX INFO: renamed from: β */
    public final java.util.HashMap f9956;

    /* JADX INFO: renamed from: γ */
    public final java.util.HashMap f9957;

    /* JADX INFO: renamed from: δ */
    public java.util.ArrayList f9958;

    /* JADX INFO: renamed from: ε */
    public final transient java.util.HashMap f9959;

    /* JADX INFO: renamed from: ζ */
    public final java.util.HashMap f9960;

    /* JADX INFO: renamed from: η */
    public final android.os.Bundle f9961;

    public C0803sm() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9955 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9956 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9957 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f9958 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9959 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9960 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f9961 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m5522(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            java.util.HashMap r0 = r3.f9955
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.HashMap r0 = r3.f9959
            java.lang.Object r0 = r0.get(r4)
            m r0 = (p000.C0531m) r0
            if (r0 == 0) goto L33
            t60 r1 = r0.f6878
            java.util.ArrayList r2 = r3.f9958
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L33
            s1 r0 = r0.f6879
            java.lang.Object r5 = r0.mo3431(r5, r6)
            r1.m5608(r5)
            java.util.ArrayList r3 = r3.f9958
            r3.remove(r4)
            goto L42
        L33:
            java.util.HashMap r0 = r3.f9960
            r0.remove(r4)
            k r0 = new k
            r0.<init>(r5, r6)
            android.os.Bundle r3 = r3.f9961
            r3.putParcelable(r4, r0)
        L42:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final p000.C0574n5 m5523(java.lang.String r7, p000.AbstractC0782s1 r8, p000.t60 r9) {
            r6 = this;
            java.util.HashMap r0 = r6.f9956
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            в r1 = p000.mk1.f7196
            в r1 = p000.mk1.f7196
            java.util.Random r1 = r1.mo2342()
            r2 = 2147418112(0x7fff0000, float:NaN)
            int r1 = r1.nextInt(r2)
            r3 = 65536(0x10000, float:9.1835E-41)
        L1b:
            int r1 = r1 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r5 = r6.f9955
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto L35
            в r1 = p000.mk1.f7196
            в r1 = p000.mk1.f7196
            java.util.Random r1 = r1.mo2342()
            int r1 = r1.nextInt(r2)
            goto L1b
        L35:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r5.put(r2, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r1)
        L43:
            m r0 = new m
            r0.<init>(r9, r8)
            java.util.HashMap r1 = r6.f9959
            r1.put(r7, r0)
            java.util.HashMap r0 = r6.f9960
            boolean r1 = r0.containsKey(r7)
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.get(r7)
            r0.remove(r7)
            r9.m5608(r1)
        L5f:
            android.os.Bundle r0 = r6.f9961
            android.os.Parcelable r1 = r0.getParcelable(r7)
            k r1 = (p000.C0451k) r1
            if (r1 == 0) goto L77
            r0.remove(r7)
            int r0 = r1.f5679
            android.content.Intent r1 = r1.f5680
            java.lang.Object r8 = r8.mo3431(r0, r1)
            r9.m5608(r8)
        L77:
            n5 r8 = new n5
            r9 = 1
            r8.<init>(r6, r9, r7)
            return r8
    }
}
