package defpackage;

/* JADX INFO: renamed from: ᲈᛴᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2235 extends defpackage.AbstractC0758 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C2235 f9531 = null;

    static {
            ᲈᛴᲇᲀ r0 = new ᲈᛴᲇᲀ
            r0.<init>()
            defpackage.C2235.f9531 = r0
            return
    }

    private C2235() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m3627(defpackage.C0353 r2, defpackage.AbstractC0638 r3) {
            if (r3 == 0) goto La8
            boolean r0 = r3 instanceof defpackage.C1271
            if (r0 == 0) goto L8
            goto La8
        L8:
            boolean r0 = r3 instanceof defpackage.C2151
            if (r0 == 0) goto L3f
            ᲇᲇᛸᛸ r3 = (defpackage.C2151) r3
            java.io.Serializable r0 = r3.f9138
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1c
            java.lang.Number r3 = r3.m3564()
            r2.m1076(r3)
            return
        L1c:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L37
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L2b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            goto L33
        L2b:
            java.lang.String r3 = r3.mo1474()
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
        L33:
            r2.m1079(r3)
            return
        L37:
            java.lang.String r3 = r3.mo1474()
            r2.m1075(r3)
            return
        L3f:
            boolean r0 = r3 instanceof defpackage.C1281
            if (r0 == 0) goto L62
            r2.m1082()
            ᛷᛵᲁᛱ r3 = (defpackage.C1281) r3
            java.util.ArrayList r3 = r3.f5710
            java.util.Iterator r3 = r3.iterator()
        L4e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r3.next()
            ᛴᛳᛶᛶ r0 = (defpackage.AbstractC0638) r0
            m3627(r2, r0)
            goto L4e
        L5e:
            r2.m1068()
            return
        L62:
            boolean r0 = r3 instanceof defpackage.C1036
            if (r0 == 0) goto L9e
            r2.m1069()
            ᛶᛳᛵᛷ r3 = (defpackage.C1036) r3
            ᛵᲇᛳᛳ r3 = r3.f4609
            java.util.Set r3 = r3.entrySet()
            ᛳᛶᛳᛷ r3 = (defpackage.C0499) r3
            java.util.Iterator r3 = r3.iterator()
        L77:
            r0 = r3
            ᲀᲀᛲ r0 = (defpackage.C1731) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L9a
            r0 = r3
            ᲀᲀᛲ r0 = (defpackage.C1731) r0
            ᛳᛸᛶᛷ r0 = r0.m3109()
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.m1072(r1)
            java.lang.Object r0 = r0.getValue()
            ᛴᛳᛶᛶ r0 = (defpackage.AbstractC0638) r0
            m3627(r2, r0)
            goto L77
        L9a:
            r2.m1073()
            return
        L9e:
            java.lang.String r2 = "Couldn't write "
            java.lang.Class r3 = r3.getClass()
            defpackage.C0086.m556(r3, r2)
            return
        La8:
            r2.m1067()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static defpackage.AbstractC0638 m3628(int r2, defpackage.C1103 r3) {
            int r0 = defpackage.AbstractC0225.m812(r2)
            r1 = 5
            if (r0 == r1) goto L43
            r1 = 6
            if (r0 == r1) goto L34
            r1 = 7
            if (r0 == r1) goto L26
            r1 = 8
            if (r0 != r1) goto L17
            r3.m2108()
            ᛷᛵᛲᛲ r2 = defpackage.C1271.f5694
            return r2
        L17:
            java.lang.String r2 = defpackage.AbstractC0225.m824(r2)
            java.lang.String r3 = "Unexpected token: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.C2264.m3676(r2)
            r2 = 0
            return r2
        L26:
            ᲇᲇᛸᛸ r2 = new ᲇᲇᛸᛸ
            boolean r3 = r3.m2100()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r3)
            return r2
        L34:
            java.lang.String r2 = r3.m2096()
            ᲇᲇᛸᛸ r3 = new ᲇᲇᛸᛸ
            ᛷᛲᛳᛷ r0 = new ᛷᛲᛳᛷ
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
        L43:
            ᲇᲇᛸᛸ r2 = new ᲇᲇᛸᛸ
            java.lang.String r3 = r3.m2096()
            r2.<init>(r3)
            return r2
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final /* bridge */ /* synthetic */ void mo561(defpackage.C0353 r1, java.lang.Object r2) {
            r0 = this;
            ᛴᛳᛶᛶ r2 = (defpackage.AbstractC0638) r2
            m3627(r1, r2)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r8) {
            r7 = this;
            int r7 = r8.m2090()
            int r0 = defpackage.AbstractC0225.m812(r7)
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L19
            if (r0 == r1) goto L10
            r0 = r2
            goto L21
        L10:
            r8.m2110()
            ᛶᛳᛵᛷ r0 = new ᛶᛳᛵᛷ
            r0.<init>()
            goto L21
        L19:
            r8.m2101()
            ᛷᛵᲁᛱ r0 = new ᛷᛵᲁᛱ
            r0.<init>()
        L21:
            if (r0 != 0) goto L28
            ᛴᛳᛶᛶ r7 = m3628(r7, r8)
            return r7
        L28:
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
        L2d:
            boolean r3 = r8.m2082()
            if (r3 == 0) goto L83
            boolean r3 = r0 instanceof defpackage.C1036
            if (r3 == 0) goto L3c
            java.lang.String r3 = r8.m2102()
            goto L3d
        L3c:
            r3 = r2
        L3d:
            int r4 = r8.m2090()
            int r5 = defpackage.AbstractC0225.m812(r4)
            if (r5 == 0) goto L54
            if (r5 == r1) goto L4b
            r5 = r2
            goto L5c
        L4b:
            r8.m2110()
            ᛶᛳᛵᛷ r5 = new ᛶᛳᛵᛷ
            r5.<init>()
            goto L5c
        L54:
            r8.m2101()
            ᛷᛵᲁᛱ r5 = new ᛷᛵᲁᛱ
            r5.<init>()
        L5c:
            if (r5 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = 0
        L61:
            if (r5 != 0) goto L67
            ᛴᛳᛶᛶ r5 = m3628(r4, r8)
        L67:
            boolean r4 = r0 instanceof defpackage.C1281
            if (r4 == 0) goto L74
            r3 = r0
            ᛷᛵᲁᛱ r3 = (defpackage.C1281) r3
            java.util.ArrayList r3 = r3.f5710
            r3.add(r5)
            goto L7c
        L74:
            r4 = r0
            ᛶᛳᛵᛷ r4 = (defpackage.C1036) r4
            ᛵᲇᛳᛳ r4 = r4.f4609
            r4.put(r3, r5)
        L7c:
            if (r6 == 0) goto L2d
            r7.addLast(r0)
            r0 = r5
            goto L2d
        L83:
            boolean r3 = r0 instanceof defpackage.C1281
            if (r3 == 0) goto L8b
            r8.m2083()
            goto L8e
        L8b:
            r8.m2093()
        L8e:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L95
            return r0
        L95:
            java.lang.Object r0 = r7.removeLast()
            ᛴᛳᛶᛶ r0 = (defpackage.AbstractC0638) r0
            goto L2d
    }
}
