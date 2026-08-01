package p000;

/* JADX INFO: renamed from: g4 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0309g4 implements java.lang.CharSequence {

    /* JADX INFO: renamed from: ε */
    public final java.util.List f4227;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f4228;

    /* JADX INFO: renamed from: η */
    public final java.util.ArrayList f4229;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f4230;

    static {
            n5 r0 = p000.rq1.f9445
            return
    }

    public /* synthetic */ C0309g4(java.lang.String r2) {
            r1 = this;
            jz r0 = p000.C0450jz.f5672
            r1.<init>(r2, r0)
            return
    }

    public C0309g4(java.lang.String r2, java.util.List r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            r3 = 0
        L7:
            r1.<init>(r3, r2)
            return
    }

    public C0309g4(java.util.List r8, java.lang.String r9) {
            r7 = this;
            r7.<init>()
            r7.f4227 = r8
            r7.f4228 = r9
            r9 = 0
            if (r8 == 0) goto L3b
            int r0 = r8.size()
            r1 = 0
            r2 = r9
            r3 = r2
        L11:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            f4 r4 = (p000.C0272f4) r4
            java.lang.Object r5 = r4.f3745
            boolean r6 = r5 instanceof p000.ux1
            if (r6 == 0) goto L2a
            if (r2 != 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L26:
            r2.add(r4)
            goto L38
        L2a:
            boolean r5 = r5 instanceof p000.r91
            if (r5 == 0) goto L38
            if (r3 != 0) goto L35
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L35:
            r3.add(r4)
        L38:
            int r1 = r1 + 1
            goto L11
        L3b:
            r2 = r9
            r3 = r2
        L3d:
            r7.f4229 = r2
            r7.f4230 = r3
            if (r3 == 0) goto L4d
            d50 r7 = new d50
            r8 = 5
            r7.<init>(r8)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r3, r7)
        L4d:
            if (r9 == 0) goto Lba
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L56
            goto Lba
        L56:
            java.lang.Object r7 = p000.AbstractC0984xh.m6638(r9)
            f4 r7 = (p000.C0272f4) r7
            int r7 = r7.f3747
            int r8 = p000.rm0.f9403
            m11 r8 = new m11
            r0 = 1
            r8.<init>(r0)
            r8.m3701(r7)
            int r7 = r9.size()
        L6d:
            if (r0 >= r7) goto Lba
            java.lang.Object r1 = r9.get(r0)
            f4 r1 = (p000.C0272f4) r1
        L75:
            int r2 = r8.f6888
            if (r2 == 0) goto Lb2
            if (r2 == 0) goto Laa
            int[] r3 = r8.f6887
            int r4 = r2 + (-1)
            r3 = r3[r4]
            int r4 = r1.f3746
            int r5 = r1.f3747
            if (r4 < r3) goto L8d
            int r2 = r2 + (-1)
            r8.m3703(r2)
            goto L75
        L8d:
            if (r5 > r3) goto L90
            goto Lb2
        L90:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Paragraph overlap not allowed, end "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " should be less than or equal to "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p000.bm0.m982(r2)
            goto Lb2
        Laa:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r8 = "IntList is empty."
            r7.<init>(r8)
            throw r7
        Lb2:
            int r1 = r1.f3747
            r8.m3701(r1)
            int r0 = r0 + 1
            goto L6d
        Lba:
            return
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            java.lang.String r0 = r0.f4228
            char r0 = r0.charAt(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0309g4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g4 r5 = (p000.C0309g4) r5
            java.lang.String r1 = r5.f4228
            java.lang.String r3 = r4.f4228
            boolean r1 = p000.ln0.m3626(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r4 = r4.f4227
            java.util.List r5 = r5.f4227
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4228
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r1.f4227
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            java.lang.String r0 = r0.f4228
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r10, int r11) {
            r9 = this;
            r0 = 41
            java.lang.String r1 = "start ("
            if (r10 > r11) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            java.lang.String r3 = ") should be less or equal to end ("
            r2.append(r3)
            r2.append(r11)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            p000.bm0.m982(r2)
        L21:
            java.lang.String r2 = r9.f4228
            if (r10 != 0) goto L2c
            int r3 = r2.length()
            if (r11 != r3) goto L2c
            return r9
        L2c:
            java.lang.String r2 = r2.substring(r10, r11)
            int r3 = p000.AbstractC0346h4.f4568
            if (r10 > r11) goto L35
            goto L4f
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r10)
            java.lang.String r1 = ") should be less than or equal to end ("
            r3.append(r1)
            r3.append(r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.bm0.m982(r0)
        L4f:
            java.util.List r9 = r9.f4227
            if (r9 != 0) goto L54
            goto L95
        L54:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r3 = 0
        L62:
            if (r3 >= r1) goto L8f
            java.lang.Object r4 = r9.get(r3)
            f4 r4 = (p000.C0272f4) r4
            int r5 = r4.f3746
            int r6 = r4.f3747
            boolean r5 = p000.AbstractC0346h4.m2359(r10, r11, r5, r6)
            if (r5 == 0) goto L8c
            f4 r5 = new f4
            java.lang.Object r7 = r4.f3745
            int r8 = r4.f3746
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.f3748
            r5.<init>(r7, r8, r6, r4)
            r0.add(r5)
        L8c:
            int r3 = r3 + 1
            goto L62
        L8f:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L96
        L95:
            r0 = 0
        L96:
            g4 r9 = new g4
            r9.<init>(r0, r2)
            return r9
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f4228
            return r0
    }
}
