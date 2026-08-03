package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class C5295 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۦ$ۥ, reason: contains not printable characters */
    public static final class C5296 implements java.util.Iterator<android.graphics.Rect>, Yue.InterfaceC3443 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final android.graphics.RegionIterator f19829;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final android.graphics.Rect f19830;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f19831;

        public C5296(android.graphics.Region r2) {
                r1 = this;
                r1.<init>()
                android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
                r0.<init>(r2)
                r1.f19829 = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.f19830 = r2
                boolean r2 = r0.next(r2)
                r1.f19831 = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.f19831
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.graphics.Rect next() {
                r1 = this;
                android.graphics.Rect r0 = r1.m20004()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Rect m20004() {
                r3 = this;
                boolean r0 = r3.f19831
                if (r0 == 0) goto L16
                android.graphics.Rect r0 = new android.graphics.Rect
                android.graphics.Rect r1 = r3.f19830
                r0.<init>(r1)
                android.graphics.RegionIterator r1 = r3.f19829
                android.graphics.Rect r2 = r3.f19830
                boolean r1 = r1.next(r2)
                r3.f19831 = r1
                return r0
            L16:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Region m19989(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.graphics.Region m19990(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m19991(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m19992(@Yue.InterfaceC4418 android.graphics.Region r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Rect, Yue.C6593> r3) {
            android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
            r0.<init>(r2)
        L5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r1 = r0.next(r2)
            if (r1 != 0) goto L11
            return
        L11:
            r3.invoke(r2)
            goto L5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.Iterator<android.graphics.Rect> m19993(@Yue.InterfaceC4418 android.graphics.Region r1) {
            Yue.ۥۡۦۣۦ$ۥ r0 = new Yue.ۥۡۦۣۦ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final android.graphics.Region m19994(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final android.graphics.Region m19995(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final android.graphics.Region m19996(@Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Region m19997(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final android.graphics.Region m19998(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final android.graphics.Region m19999(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final android.graphics.Region m20000(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final android.graphics.Region m20001(@Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final android.graphics.Region m20002(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final android.graphics.Region m20003(@Yue.InterfaceC4418 android.graphics.Region r1, @Yue.InterfaceC4418 android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
