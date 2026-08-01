package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1366 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config[] f5969 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config[] f5970 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config[] f5971 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config[] f5972 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final android.graphics.Bitmap.Config[] f5973 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f5974;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0325 f5975;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f5976;

    static {
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1 = 0
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[]{r0, r1}
            r1 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.graphics.Bitmap$Config[] r0 = (android.graphics.Bitmap.Config[]) r0
            int r1 = r0.length
            int r1 = r1 + (-1)
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGBA_F16
            r0[r1] = r2
            defpackage.C1366.f5971 = r0
            defpackage.C1366.f5970 = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[]{r0}
            defpackage.C1366.f5972 = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[]{r0}
            defpackage.C1366.f5973 = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap$Config[] r0 = new android.graphics.Bitmap.Config[]{r0}
            defpackage.C1366.f5969 = r0
            return
    }

    public C1366() {
            r2 = this;
            r2.<init>()
            ᛲᛷᲀᛷ r0 = new ᛲᛷᲀᛷ
            r1 = 1
            r0.<init>(r1)
            r2.f5975 = r0
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r1 = 25
            r0.<init>(r1)
            r2.f5976 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f5974 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m2535(int r2, android.graphics.Bitmap.Config r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "]("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SizeConfigStrategy{groupedMap="
            r0.append(r1)
            ᛴᛵᲇᲇ r1 = r4.f5976
            r0.append(r1)
            java.lang.String r1 = ", sortedSizes=("
            r0.append(r1)
            java.util.HashMap r4 = r4.f5974
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            r0.append(r3)
            r3 = 91
            r0.append(r3)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = "], "
            r0.append(r2)
            goto L1e
        L43:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L58
            int r4 = r0.length()
            int r4 = r4 + (-2)
            int r1 = r0.length()
            java.lang.String r2 = ""
            r0.replace(r4, r1, r2)
        L58:
            java.lang.String r4 = ")}"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2536(android.graphics.Bitmap r5) {
            r4 = this;
            int r0 = defpackage.AbstractC1754.m3136(r5)
            android.graphics.Bitmap$Config r1 = r5.getConfig()
            ᛲᛷᲀᛷ r2 = r4.f5975
            java.lang.Object r3 = r2.f7642
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            java.lang.Object r3 = r3.poll()
            ᛶᛷᛶᛵ r3 = (defpackage.InterfaceC1111) r3
            if (r3 != 0) goto L1a
            ᛶᛷᛶᛵ r3 = r2.m998()
        L1a:
            ᲀᛸᲀᛴ r3 = (defpackage.C1726) r3
            r3.f7648 = r0
            r3.f7646 = r1
            ᛴᛵᲇᲇ r0 = r4.f5976
            r0.m1548(r3, r5)
            android.graphics.Bitmap$Config r5 = r5.getConfig()
            java.util.NavigableMap r4 = r4.m2537(r5)
            int r5 = r3.f7648
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r4.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r0 = r3.f7648
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            if (r5 != 0) goto L43
            goto L48
        L43:
            int r5 = r5.intValue()
            int r1 = r1 + r5
        L48:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4.put(r0, r5)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.NavigableMap m2537(android.graphics.Bitmap.Config r2) {
            r1 = this;
            java.util.HashMap r1 = r1.f5974
            java.lang.Object r0 = r1.get(r2)
            java.util.NavigableMap r0 = (java.util.NavigableMap) r0
            if (r0 != 0) goto L12
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.put(r2, r0)
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2538(java.lang.Integer r4, android.graphics.Bitmap r5) {
            r3 = this;
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            java.util.NavigableMap r0 = r3.m2537(r0)
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L28
            int r3 = r1.intValue()
            r5 = 1
            if (r3 != r5) goto L1b
            r0.remove(r4)
            return
        L1b:
            int r3 = r1.intValue()
            int r3 = r3 - r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r3)
            return
        L28:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Tried to decrement empty size, size: "
            r1.<init>(r2)
            r1.append(r4)
            int r4 = defpackage.AbstractC1754.m3136(r5)
            android.graphics.Bitmap$Config r5 = r5.getConfig()
            java.lang.String r4 = m2535(r4, r5)
            java.lang.String r5 = ", removed: "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = ", this: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Bitmap m2539(int r12, int r13, android.graphics.Bitmap.Config r14) {
            r11 = this;
            int r0 = r12 * r13
            int r1 = defpackage.AbstractC1754.m3137(r14)
            int r1 = r1 * r0
            ᛲᛷᲀᛷ r0 = r11.f5975
            java.lang.Object r2 = r0.f7642
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            java.lang.Object r3 = r2.poll()
            ᛶᛷᛶᛵ r3 = (defpackage.InterfaceC1111) r3
            if (r3 != 0) goto L19
            ᛶᛷᛶᛵ r3 = r0.m998()
        L19:
            ᲀᛸᲀᛴ r3 = (defpackage.C1726) r3
            r3.f7648 = r1
            r3.f7646 = r14
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGBA_F16
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L2a
            android.graphics.Bitmap$Config[] r4 = defpackage.C1366.f5970
            goto L4e
        L2a:
            int[] r4 = defpackage.AbstractC2216.f9463
            int r5 = r14.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L4c
            r5 = 2
            if (r4 == r5) goto L49
            r5 = 3
            if (r4 == r5) goto L46
            r5 = 4
            if (r4 == r5) goto L43
            android.graphics.Bitmap$Config[] r4 = new android.graphics.Bitmap.Config[]{r14}
            goto L4e
        L43:
            android.graphics.Bitmap$Config[] r4 = defpackage.C1366.f5969
            goto L4e
        L46:
            android.graphics.Bitmap$Config[] r4 = defpackage.C1366.f5973
            goto L4e
        L49:
            android.graphics.Bitmap$Config[] r4 = defpackage.C1366.f5972
            goto L4e
        L4c:
            android.graphics.Bitmap$Config[] r4 = defpackage.C1366.f5971
        L4e:
            int r5 = r4.length
            r6 = 0
        L50:
            if (r6 >= r5) goto L9b
            r7 = r4[r6]
            java.util.NavigableMap r8 = r11.m2537(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.ceilingKey(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L98
            int r9 = r8.intValue()
            int r10 = r1 * 8
            if (r9 > r10) goto L98
            int r4 = r8.intValue()
            if (r4 != r1) goto L7d
            if (r7 != 0) goto L77
            if (r14 == 0) goto L9b
            goto L7d
        L77:
            boolean r1 = r7.equals(r14)
            if (r1 != 0) goto L9b
        L7d:
            r0.m3106(r3)
            int r1 = r8.intValue()
            java.lang.Object r2 = r2.poll()
            ᛶᛷᛶᛵ r2 = (defpackage.InterfaceC1111) r2
            if (r2 != 0) goto L90
            ᛶᛷᛶᛵ r2 = r0.m998()
        L90:
            r3 = r2
            ᲀᛸᲀᛴ r3 = (defpackage.C1726) r3
            r3.f7648 = r1
            r3.f7646 = r7
            goto L9b
        L98:
            int r6 = r6 + 1
            goto L50
        L9b:
            ᛴᛵᲇᲇ r0 = r11.f5976
            java.lang.Object r0 = r0.m1546(r3)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lb1
            int r1 = r3.f7648
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.m2538(r1, r0)
            r0.reconfigure(r12, r13, r14)
        Lb1:
            return r0
    }
}
