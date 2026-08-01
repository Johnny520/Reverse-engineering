package defpackage;

/* JADX INFO: renamed from: ᛶᲀᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacksC1146 implements android.content.ComponentCallbacks {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f5238;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f5239;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r13) {
            r12 = this;
            int r0 = r12.f5239
            int r13 = r13.orientation
            if (r0 != r13) goto L7
            goto L25
        L7:
            r12.f5239 = r13
            java.lang.ref.WeakReference r12 = r12.f5238
            if (r12 != 0) goto Le
            goto L25
        Le:
            java.lang.Object r12 = r12.get()
            ᲁᛶᲁ r12 = (defpackage.C1876) r12
            if (r12 != 0) goto L17
            goto L25
        L17:
            boolean r13 = r12.f8147
            if (r13 != 0) goto L1c
            goto L25
        L1c:
            ᛶᛵᛵᲇ r1 = r12.f8139
            if (r1 != 0) goto L21
            goto L25
        L21:
            ᛲᛵᲈᲈ r12 = r1.f4815
            if (r12 != 0) goto L26
        L25:
            return
        L26:
            int r13 = r1.f4817
            int r0 = r1.f4808
            int r13 = r13 - r0
            int r0 = r1.f4809
            int r2 = r1.f4811
            int r0 = r0 - r2
            float r2 = r1.m2047()
            float r3 = (float) r13
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r5 = 0
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 0
            if (r4 > 0) goto L40
            r3 = r8
            goto L77
        L40:
            int r4 = r1.f4819
            ᲁᛶᲁ r10 = r1.f4816
            if (r10 != 0) goto L47
            goto L4b
        L47:
            ᛲᛵᲈᲈ r10 = r10.f8143
            if (r10 != 0) goto L4d
        L4b:
            r10 = r5
            goto L51
        L4d:
            int r10 = r10.getWidth()
        L51:
            int r10 = r10 + r13
            int r4 = r4 - r10
            int r13 = java.lang.Math.abs(r4)
            float r13 = (float) r13
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 >= 0) goto L5e
            r3 = r6
            goto L77
        L5e:
            ᲁᛶᲁ r13 = r1.f4816
            if (r13 != 0) goto L63
            goto L67
        L63:
            ᛲᛵᲈᲈ r13 = r13.f8143
            if (r13 != 0) goto L69
        L67:
            r13 = r5
            goto L6d
        L69:
            int r13 = r13.getWidth()
        L6d:
            float r13 = (float) r13
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r4
            float r13 = r13 + r3
            double r3 = (double) r13
            int r13 = r1.f4819
            double r10 = (double) r13
            double r3 = r3 / r10
        L77:
            float r13 = (float) r0
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 > 0) goto L7e
            r6 = r8
            goto Lb4
        L7e:
            int r13 = r1.f4821
            ᲁᛶᲁ r8 = r1.f4816
            if (r8 != 0) goto L85
            goto L89
        L85:
            ᛲᛵᲈᲈ r8 = r8.f8143
            if (r8 != 0) goto L8b
        L89:
            r8 = r5
            goto L8f
        L8b:
            int r8 = r8.getHeight()
        L8f:
            int r8 = r8 + r0
            int r13 = r13 - r8
            int r13 = java.lang.Math.abs(r13)
            float r13 = (float) r13
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 >= 0) goto L9b
            goto Lb4
        L9b:
            double r6 = (double) r0
            ᲁᛶᲁ r13 = r1.f4816
            if (r13 != 0) goto La1
            goto Laa
        La1:
            ᛲᛵᲈᲈ r13 = r13.f8143
            if (r13 != 0) goto La6
            goto Laa
        La6:
            int r5 = r13.getHeight()
        Laa:
            double r8 = (double) r5
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 / r10
            double r8 = r8 + r6
            int r13 = r1.f4821
            double r5 = (double) r13
            double r6 = r8 / r5
        Lb4:
            ᛶᛳᲀᲈ r0 = new ᛶᛳᲀᲈ
            r2 = r3
            r4 = r6
            r0.<init>(r1, r2, r4)
            r12.addOnLayoutChangeListener(r0)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }
}
