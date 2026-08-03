package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5480 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f20297 = ":all";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Set<Yue.C5480.C5484> f20298;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.Map<Yue.C5480.C5484, java.util.Set<Yue.C5480.C5481>> f20299;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.Map<Yue.C5480.C5484, java.util.Map<Yue.C5480.C5481, Yue.C5480.C5482>> f20300;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.Map<Yue.C5480.C5484, java.util.Map<Yue.C5480.C5481, java.util.Set<Yue.C5480.C5483>>> f20301;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f20302;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ, reason: contains not printable characters */
    public static class C5481 extends Yue.C5480.AbstractC5485 {
        public C5481(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C5480.C5481 m20656(java.lang.String r1) {
                Yue.ۥۡۧۢۧ$ۥ r0 = new Yue.ۥۡۧۢۧ$ۥ
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟, reason: contains not printable characters */
    public static class C5482 extends Yue.C5480.AbstractC5485 {
        public C5482(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C5480.C5482 m20657(java.lang.String r1) {
                Yue.ۥۡۧۢۧ$ۥ۟ r0 = new Yue.ۥۡۧۢۧ$ۥ۟
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟, reason: contains not printable characters */
    public static class C5483 extends Yue.C5480.AbstractC5485 {
        public C5483(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C5480.C5483 m20658(java.lang.String r1) {
                Yue.ۥۡۧۢۧ$ۥ۟۟ r0 = new Yue.ۥۡۧۢۧ$ۥ۟۟
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5484 extends Yue.C5480.AbstractC5485 {
        public C5484(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static Yue.C5480.C5484 m20659(java.lang.String r1) {
                Yue.ۥۡۧۢۧ$ۥ۟۟۟ r0 = new Yue.ۥۡۧۢۧ$ۥ۟۟۟
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC5485 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f20303;

        public AbstractC5485(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                Yue.C6657.m25635(r1)
                r0.f20303 = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                Yue.ۥۡۧۢۧ$ۥ۟۟۟۟ r5 = (Yue.C5480.AbstractC5485) r5
                java.lang.String r2 = r4.f20303
                if (r2 != 0) goto L20
                java.lang.String r5 = r5.f20303
                if (r5 != 0) goto L1e
                goto L1f
            L1e:
                r0 = r1
            L1f:
                return r0
            L20:
                java.lang.String r5 = r5.f20303
                boolean r5 = r2.equals(r5)
                return r5
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f20303
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.hashCode()
            La:
                r1 = 31
                int r1 = r1 + r0
                return r1
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.f20303
                return r0
        }
    }

    public C5480() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f20298 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f20299 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f20300 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f20301 = r0
            r0 = 0
            r1.f20302 = r0
            return
    }

    public C5480(Yue.C5480 r8) {
            r7 = this;
            r7.<init>()
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r0 = r7.f20298
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r1 = r8.f20298
            r0.addAll(r1)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r0 = r8.f20299
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r2 = r7.f20299
            java.lang.Object r3 = r1.getKey()
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r3 = (Yue.C5480.C5484) r3
            java.util.HashSet r4 = new java.util.HashSet
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r4.<init>(r1)
            r2.put(r3, r4)
            goto L14
        L37:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r0 = r8.f20300
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r2 = r7.f20300
            java.lang.Object r3 = r1.getKey()
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r3 = (Yue.C5480.C5484) r3
            java.util.HashMap r4 = new java.util.HashMap
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            r4.<init>(r1)
            r2.put(r3, r4)
            goto L41
        L64:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r0 = r8.f20301
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Object r3 = r1.getValue()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lae
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            Yue.ۥۡۧۢۧ$ۥ r5 = (Yue.C5480.C5481) r5
            java.util.HashSet r6 = new java.util.HashSet
            java.lang.Object r4 = r4.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            r6.<init>(r4)
            r2.put(r5, r6)
            goto L8d
        Lae:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r3 = r7.f20301
            java.lang.Object r1 = r1.getKey()
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r1 = (Yue.C5480.C5484) r1
            r3.put(r1, r2)
            goto L6e
        Lba:
            boolean r8 = r8.f20302
            r7.f20302 = r8
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C5480 m20637() {
            Yue.ۥۡۧۢۧ r0 = new Yue.ۥۡۧۢۧ
            r0.<init>()
            java.lang.String r23 = "u"
            java.lang.String r24 = "ul"
            java.lang.String r1 = "a"
            java.lang.String r2 = "b"
            java.lang.String r3 = "blockquote"
            java.lang.String r4 = "br"
            java.lang.String r5 = "cite"
            java.lang.String r6 = "code"
            java.lang.String r7 = "dd"
            java.lang.String r8 = "dl"
            java.lang.String r9 = "dt"
            java.lang.String r10 = "em"
            java.lang.String r11 = "i"
            java.lang.String r12 = "li"
            java.lang.String r13 = "ol"
            java.lang.String r14 = "p"
            java.lang.String r15 = "pre"
            java.lang.String r16 = "q"
            java.lang.String r17 = "small"
            java.lang.String r18 = "span"
            java.lang.String r19 = "strike"
            java.lang.String r20 = "strong"
            java.lang.String r21 = "sub"
            java.lang.String r22 = "sup"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            Yue.ۥۡۧۢۧ r0 = r0.m20645(r1)
            java.lang.String r1 = "href"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            java.lang.String r3 = "a"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r3, r2)
            java.lang.String r2 = "cite"
            java.lang.String[] r4 = new java.lang.String[]{r2}
            java.lang.String r5 = "blockquote"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r5, r4)
            java.lang.String r4 = "q"
            java.lang.String[] r6 = new java.lang.String[]{r2}
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r4, r6)
            java.lang.String r4 = "mailto"
            java.lang.String r6 = "ftp"
            java.lang.String r7 = "http"
            java.lang.String r8 = "https"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r8, r4}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r3, r1, r4)
            java.lang.String[] r1 = new java.lang.String[]{r7, r8}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r5, r2, r1)
            java.lang.String[] r1 = new java.lang.String[]{r7, r8}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r2, r2, r1)
            java.lang.String r1 = "rel"
            java.lang.String r2 = "nofollow"
            Yue.ۥۡۧۢۧ r0 = r0.m20643(r3, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C5480 m20638() {
            Yue.ۥۡۧۢۧ r0 = m20637()
            java.lang.String r1 = "img"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            Yue.ۥۡۧۢۧ r0 = r0.m20645(r2)
            java.lang.String r6 = "title"
            java.lang.String r7 = "width"
            java.lang.String r2 = "align"
            java.lang.String r3 = "alt"
            java.lang.String r4 = "height"
            java.lang.String r5 = "src"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r1, r2)
            java.lang.String r2 = "http"
            java.lang.String r3 = "https"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.String r3 = "src"
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r1, r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Yue.C5480 m20639() {
            Yue.ۥۡۧۢۧ r0 = new Yue.ۥۡۧۢۧ
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Yue.C5480 m20640() {
            Yue.ۥۡۧۢۧ r0 = new Yue.ۥۡۧۢۧ
            r0.<init>()
            java.lang.String r41 = "u"
            java.lang.String r42 = "ul"
            java.lang.String r1 = "a"
            java.lang.String r2 = "b"
            java.lang.String r3 = "blockquote"
            java.lang.String r4 = "br"
            java.lang.String r5 = "caption"
            java.lang.String r6 = "cite"
            java.lang.String r7 = "code"
            java.lang.String r8 = "col"
            java.lang.String r9 = "colgroup"
            java.lang.String r10 = "dd"
            java.lang.String r11 = "div"
            java.lang.String r12 = "dl"
            java.lang.String r13 = "dt"
            java.lang.String r14 = "em"
            java.lang.String r15 = "h1"
            java.lang.String r16 = "h2"
            java.lang.String r17 = "h3"
            java.lang.String r18 = "h4"
            java.lang.String r19 = "h5"
            java.lang.String r20 = "h6"
            java.lang.String r21 = "i"
            java.lang.String r22 = "img"
            java.lang.String r23 = "li"
            java.lang.String r24 = "ol"
            java.lang.String r25 = "p"
            java.lang.String r26 = "pre"
            java.lang.String r27 = "q"
            java.lang.String r28 = "small"
            java.lang.String r29 = "span"
            java.lang.String r30 = "strike"
            java.lang.String r31 = "strong"
            java.lang.String r32 = "sub"
            java.lang.String r33 = "sup"
            java.lang.String r34 = "table"
            java.lang.String r35 = "tbody"
            java.lang.String r36 = "td"
            java.lang.String r37 = "tfoot"
            java.lang.String r38 = "th"
            java.lang.String r39 = "thead"
            java.lang.String r40 = "tr"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42}
            Yue.ۥۡۧۢۧ r0 = r0.m20645(r1)
            java.lang.String r1 = "title"
            java.lang.String r2 = "href"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}
            java.lang.String r3 = "a"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r3, r1)
            java.lang.String r1 = "cite"
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.String r5 = "blockquote"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r5, r4)
            java.lang.String r4 = "span"
            java.lang.String r6 = "width"
            java.lang.String[] r7 = new java.lang.String[]{r4, r6}
            java.lang.String r8 = "col"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r8, r7)
            java.lang.String r7 = "colgroup"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r7, r4)
            java.lang.String r11 = "title"
            java.lang.String r12 = "width"
            java.lang.String r7 = "align"
            java.lang.String r8 = "alt"
            java.lang.String r9 = "height"
            java.lang.String r10 = "src"
            java.lang.String[] r4 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
            java.lang.String r7 = "img"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r7, r4)
            java.lang.String r4 = "start"
            java.lang.String r8 = "type"
            java.lang.String[] r4 = new java.lang.String[]{r4, r8}
            java.lang.String r9 = "ol"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r9, r4)
            java.lang.String[] r4 = new java.lang.String[]{r1}
            java.lang.String r9 = "q"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r9, r4)
            java.lang.String r4 = "summary"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.lang.String r10 = "table"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r10, r4)
            java.lang.String r4 = "colspan"
            java.lang.String r10 = "rowspan"
            java.lang.String r11 = "abbr"
            java.lang.String r12 = "axis"
            java.lang.String[] r4 = new java.lang.String[]{r11, r12, r4, r10, r6}
            java.lang.String r6 = "td"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r6, r4)
            java.lang.String r14 = "scope"
            java.lang.String r15 = "width"
            java.lang.String r10 = "abbr"
            java.lang.String r11 = "axis"
            java.lang.String r12 = "colspan"
            java.lang.String r13 = "rowspan"
            java.lang.String[] r4 = new java.lang.String[]{r10, r11, r12, r13, r14, r15}
            java.lang.String r6 = "th"
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r6, r4)
            java.lang.String r4 = "ul"
            java.lang.String[] r6 = new java.lang.String[]{r8}
            Yue.ۥۡۧۢۧ r0 = r0.m20642(r4, r6)
            java.lang.String r4 = "mailto"
            java.lang.String r6 = "ftp"
            java.lang.String r8 = "http"
            java.lang.String r10 = "https"
            java.lang.String[] r4 = new java.lang.String[]{r6, r8, r10, r4}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r3, r2, r4)
            java.lang.String[] r2 = new java.lang.String[]{r8, r10}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r5, r1, r2)
            java.lang.String[] r2 = new java.lang.String[]{r8, r10}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r1, r1, r2)
            java.lang.String r2 = "src"
            java.lang.String[] r3 = new java.lang.String[]{r8, r10}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r7, r2, r3)
            java.lang.String[] r2 = new java.lang.String[]{r8, r10}
            Yue.ۥۡۧۢۧ r0 = r0.m20644(r9, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Yue.C5480 m20641() {
            Yue.ۥۡۧۢۧ r0 = new Yue.ۥۡۧۢۧ
            r0.<init>()
            java.lang.String r1 = "strong"
            java.lang.String r2 = "u"
            java.lang.String r3 = "b"
            java.lang.String r4 = "em"
            java.lang.String r5 = "i"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            Yue.ۥۡۧۢۧ r0 = r0.m20645(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C5480 m20642(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            Yue.C6657.m25632(r5)
            Yue.C6657.m25635(r6)
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.String r2 = "No attribute names supplied."
            Yue.C6657.m25629(r0, r2)
            java.lang.String[] r0 = new java.lang.String[]{r5}
            r4.m20645(r0)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r5 = Yue.C5480.C5484.m20659(r5)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r6.length
        L23:
            if (r1 >= r2) goto L34
            r3 = r6[r1]
            Yue.C6657.m25632(r3)
            Yue.ۥۡۧۢۧ$ۥ r3 = Yue.C5480.C5481.m20656(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L23
        L34:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r6 = r4.f20299
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L48
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r6 = r4.f20299
            java.lang.Object r5 = r6.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            r5.addAll(r0)
            goto L4d
        L48:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r6 = r4.f20299
            r6.put(r5, r0)
        L4d:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C5480 m20643(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            Yue.C6657.m25632(r2)
            Yue.C6657.m25632(r3)
            Yue.C6657.m25632(r4)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r2 = Yue.C5480.C5484.m20659(r2)
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r0 = r1.f20298
            r0.add(r2)
            Yue.ۥۡۧۢۧ$ۥ r3 = Yue.C5480.C5481.m20656(r3)
            Yue.ۥۡۧۢۧ$ۥ۟ r4 = Yue.C5480.C5482.m20657(r4)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r0 = r1.f20300
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L2e
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r0 = r1.f20300
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r3, r4)
            goto L3b
        L2e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r3, r4)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r3 = r1.f20300
            r3.put(r2, r0)
        L3b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C5480 m20644(java.lang.String r3, java.lang.String r4, java.lang.String... r5) {
            r2 = this;
            Yue.C6657.m25632(r3)
            Yue.C6657.m25632(r4)
            Yue.C6657.m25635(r5)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r3 = Yue.C5480.C5484.m20659(r3)
            Yue.ۥۡۧۢۧ$ۥ r4 = Yue.C5480.C5481.m20656(r4)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r0 = r2.f20301
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L22
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r0 = r2.f20301
            java.lang.Object r3 = r0.get(r3)
            java.util.Map r3 = (java.util.Map) r3
            goto L2d
        L22:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r1 = r2.f20301
            r1.put(r3, r0)
            r3 = r0
        L2d:
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L3a
            java.lang.Object r3 = r3.get(r4)
            java.util.Set r3 = (java.util.Set) r3
            goto L43
        L3a:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.put(r4, r0)
            r3 = r0
        L43:
            int r4 = r5.length
            r0 = 0
        L45:
            if (r0 >= r4) goto L56
            r1 = r5[r0]
            Yue.C6657.m25632(r1)
            Yue.ۥۡۧۢۧ$ۥ۟۟ r1 = Yue.C5480.C5483.m20658(r1)
            r3.add(r1)
            int r0 = r0 + 1
            goto L45
        L56:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C5480 m20645(java.lang.String... r6) {
            r5 = this;
            Yue.C6657.m25635(r6)
            int r0 = r6.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L23
            r2 = r6[r1]
            Yue.C6657.m25632(r2)
            java.lang.String r3 = "noscript"
            boolean r3 = r2.equalsIgnoreCase(r3)
            java.lang.String r4 = "noscript is unsupported in Safelists, due to incompatibilities between parsers with and without script-mode enabled"
            Yue.C6657.m25627(r3, r4)
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r3 = r5.f20298
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r2 = Yue.C5480.C5484.m20659(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto L5
        L23:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C0648 m20646(java.lang.String r4) {
            r3 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = new Yue.ۥ۟ۢ۠ۤ
            r0.<init>()
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r4 = Yue.C5480.C5484.m20659(r4)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r1 = r3.f20300
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L45
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r1 = r3.f20300
            java.lang.Object r4 = r1.get(r4)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L21:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            Yue.ۥۡۧۢۧ$ۥ r2 = (Yue.C5480.C5481) r2
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.getValue()
            Yue.ۥۡۧۢۧ$ۥ۟ r1 = (Yue.C5480.C5482) r1
            java.lang.String r1 = r1.toString()
            r0.m4294(r2, r1)
            goto L21
        L45:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m20647(java.lang.String r6, Yue.C2104 r7, Yue.C0646 r8) {
            r5 = this;
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r0 = Yue.C5480.C5484.m20659(r6)
            java.lang.String r1 = r8.m4219()
            Yue.ۥۡۧۢۧ$ۥ r1 = Yue.C5480.C5481.m20656(r1)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r2 = r5.f20299
            java.lang.Object r2 = r2.get(r0)
            java.util.Set r2 = (java.util.Set) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L43
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r6 = r5.f20301
            boolean r6 = r6.containsKey(r0)
            if (r6 == 0) goto L42
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r6 = r5.f20301
            java.lang.Object r6 = r6.get(r0)
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.containsKey(r1)
            if (r0 == 0) goto L40
            java.lang.Object r6 = r6.get(r1)
            java.util.Set r6 = (java.util.Set) r6
            boolean r6 = r5.m20655(r7, r8, r6)
            if (r6 == 0) goto L41
        L40:
            r3 = r4
        L41:
            return r3
        L42:
            return r4
        L43:
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r1 = r5.f20300
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L68
            Yue.ۥ۟ۢ۠ۤ r0 = r5.m20646(r6)
            java.lang.String r1 = r8.m4219()
            boolean r2 = r0.m4287(r1)
            if (r2 == 0) goto L68
            java.lang.String r6 = r0.m4282(r1)
            java.lang.String r7 = r8.m4220()
            boolean r6 = r6.equals(r7)
            return r6
        L68:
            java.lang.String r0 = ":all"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L77
            boolean r6 = r5.m20647(r0, r7, r8)
            if (r6 == 0) goto L77
            r3 = r4
        L77:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m20648(java.lang.String r2) {
            r1 = this;
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r0 = r1.f20298
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r2 = Yue.C5480.C5484.m20659(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m20649(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "#"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = ".*\\s.*"
            boolean r2 = r2.matches(r0)
            if (r2 != 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C5480 m20650(boolean r1) {
            r0 = this;
            r0.f20302 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C5480 m20651(java.lang.String r6, java.lang.String... r7) {
            r5 = this;
            Yue.C6657.m25632(r6)
            Yue.C6657.m25635(r7)
            int r0 = r7.length
            r1 = 0
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.String r2 = "No attribute names supplied."
            Yue.C6657.m25629(r0, r2)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r0 = Yue.C5480.C5484.m20659(r6)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int r3 = r7.length
        L1c:
            if (r1 >= r3) goto L2d
            r4 = r7[r1]
            Yue.C6657.m25632(r4)
            Yue.ۥۡۧۢۧ$ۥ r4 = Yue.C5480.C5481.m20656(r4)
            r2.add(r4)
            int r1 = r1 + 1
            goto L1c
        L2d:
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r7 = r5.f20298
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L53
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r7 = r5.f20299
            boolean r7 = r7.containsKey(r0)
            if (r7 == 0) goto L53
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r7 = r5.f20299
            java.lang.Object r7 = r7.get(r0)
            java.util.Set r7 = (java.util.Set) r7
            r7.removeAll(r2)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L53
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r7 = r5.f20299
            r7.remove(r0)
        L53:
            java.lang.String r7 = ":all"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L84
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r6 = r5.f20299
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            r7.removeAll(r2)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L65
            r6.remove()
            goto L65
        L84:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.C5480 m20652(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.C6657.m25632(r2)
            Yue.C6657.m25632(r3)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r2 = Yue.C5480.C5484.m20659(r2)
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r0 = r1.f20298
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L34
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r0 = r1.f20300
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L34
            Yue.ۥۡۧۢۧ$ۥ r3 = Yue.C5480.C5481.m20656(r3)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r0 = r1.f20300
            java.lang.Object r0 = r0.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            r0.remove(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L34
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r3 = r1.f20300
            r3.remove(r2)
        L34:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C5480 m20653(java.lang.String r6, java.lang.String r7, java.lang.String... r8) {
            r5 = this;
            Yue.C6657.m25632(r6)
            Yue.C6657.m25632(r7)
            Yue.C6657.m25635(r8)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r6 = Yue.C5480.C5484.m20659(r6)
            Yue.ۥۡۧۢۧ$ۥ r7 = Yue.C5480.C5481.m20656(r7)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r0 = r5.f20301
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = "Cannot remove a protocol that is not set."
            Yue.C6657.m25629(r0, r1)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r0 = r5.f20301
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            boolean r2 = r0.containsKey(r7)
            Yue.C6657.m25629(r2, r1)
            java.lang.Object r1 = r0.get(r7)
            java.util.Set r1 = (java.util.Set) r1
            int r2 = r8.length
            r3 = 0
        L33:
            if (r3 >= r2) goto L44
            r4 = r8[r3]
            Yue.C6657.m25632(r4)
            Yue.ۥۡۧۢۧ$ۥ۟۟ r4 = Yue.C5480.C5483.m20658(r4)
            r1.remove(r4)
            int r3 = r3 + 1
            goto L33
        L44:
            boolean r8 = r1.isEmpty()
            if (r8 == 0) goto L58
            r0.remove(r7)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L58
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r7 = r5.f20301
            r7.remove(r6)
        L58:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C5480 m20654(java.lang.String... r5) {
            r4 = this;
            Yue.C6657.m25635(r5)
            int r0 = r5.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            r2 = r5[r1]
            Yue.C6657.m25632(r2)
            Yue.ۥۡۧۢۧ$ۥ۟۟۟ r2 = Yue.C5480.C5484.m20659(r2)
            java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟۟> r3 = r4.f20298
            boolean r3 = r3.remove(r2)
            if (r3 == 0) goto L27
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Set<Yue.ۥۡۧۢۧ$ۥ>> r3 = r4.f20299
            r3.remove(r2)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, Yue.ۥۡۧۢۧ$ۥ۟>> r3 = r4.f20300
            r3.remove(r2)
            java.util.Map<Yue.ۥۡۧۢۧ$ۥ۟۟۟, java.util.Map<Yue.ۥۡۧۢۧ$ۥ, java.util.Set<Yue.ۥۡۧۢۧ$ۥ۟۟>>> r3 = r4.f20301
            r3.remove(r2)
        L27:
            int r1 = r1 + 1
            goto L5
        L2a:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m20655(Yue.C2104 r3, Yue.C0646 r4, java.util.Set<Yue.C5480.C5483> r5) {
            r2 = this;
            java.lang.String r0 = r4.m4219()
            java.lang.String r3 = r3.mo14512(r0)
            int r0 = r3.length()
            if (r0 != 0) goto L12
            java.lang.String r3 = r4.m4220()
        L12:
            boolean r0 = r2.f20302
            if (r0 != 0) goto L19
            r4.m4226(r3)
        L19:
            java.util.Iterator r4 = r5.iterator()
        L1d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            Yue.ۥۡۧۢۧ$ۥ۟۟ r5 = (Yue.C5480.C5483) r5
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "#"
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 == 0) goto L3d
            boolean r5 = r2.m20649(r3)
            if (r5 == 0) goto L1d
            return r1
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = ":"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = Yue.C4415.m17326(r3)
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L1d
            return r1
        L59:
            r3 = 0
            return r3
    }
}
