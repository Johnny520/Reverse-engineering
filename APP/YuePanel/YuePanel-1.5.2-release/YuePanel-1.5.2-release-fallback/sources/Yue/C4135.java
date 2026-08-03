package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class C4135 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ$ۥ, reason: contains not printable characters */
    public static final class C4136 implements Yue.InterfaceC5609<android.view.MenuItem> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.view.Menu f12701;

        public C4136(android.view.Menu r1) {
                r0 = this;
                r0.f12701 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<android.view.MenuItem> iterator() {
                r1 = this;
                android.view.Menu r0 = r1.f12701
                java.util.Iterator r0 = Yue.C4135.m16219(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    public static final class C4137 implements java.util.Iterator<android.view.MenuItem>, Yue.InterfaceC3446 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f12702;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.view.Menu f12703;

        public C4137(android.view.Menu r1) {
                r0 = this;
                r0.f12703 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f12702
                android.view.Menu r1 = r2.f12703
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.MenuItem next() {
                r1 = this;
                android.view.MenuItem r0 = r1.m16222()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                android.view.Menu r0 = r2.f12703
                int r1 = r2.f12702
                int r1 = r1 + (-1)
                r2.f12702 = r1
                android.view.MenuItem r1 = r0.getItem(r1)
                if (r1 == 0) goto L18
                int r1 = r1.getItemId()
                r0.removeItem(r1)
                Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
                goto L19
            L18:
                r0 = 0
            L19:
                if (r0 == 0) goto L1c
                return
            L1c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.MenuItem m16222() {
                r3 = this;
                android.view.Menu r0 = r3.f12703
                int r1 = r3.f12702
                int r2 = r1 + 1
                r3.f12702 = r2
                android.view.MenuItem r0 = r0.getItem(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m16211(@Yue.InterfaceC4418 android.view.Menu r4, @Yue.InterfaceC4418 android.view.MenuItem r5) {
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L17
            android.view.MenuItem r3 = r4.getItem(r2)
            boolean r3 = Yue.C3329.m13897(r3, r5)
            if (r3 == 0) goto L14
            r4 = 1
            return r4
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m16212(@Yue.InterfaceC4418 android.view.Menu r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.MenuItem, Yue.C6593> r4) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.MenuItem r2 = r3.getItem(r1)
            r4.invoke(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m16213(@Yue.InterfaceC4418 android.view.Menu r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super android.view.MenuItem, Yue.C6593> r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.MenuItem r3 = r4.getItem(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.view.MenuItem m16214(@Yue.InterfaceC4418 android.view.Menu r0, int r1) {
            android.view.MenuItem r0 = r0.getItem(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<android.view.MenuItem> m16215(@Yue.InterfaceC4418 android.view.Menu r1) {
            Yue.ۥۡ۠ۦۦ$ۥ r0 = new Yue.ۥۡ۠ۦۦ$ۥ
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m16216(@Yue.InterfaceC4418 android.view.Menu r0) {
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean m16217(@Yue.InterfaceC4418 android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m16218(@Yue.InterfaceC4418 android.view.Menu r0) {
            int r0 = r0.size()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.util.Iterator<android.view.MenuItem> m16219(@Yue.InterfaceC4418 android.view.Menu r1) {
            Yue.ۥۡ۠ۦۦ$ۥ۟ r0 = new Yue.ۥۡ۠ۦۦ$ۥ۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m16220(@Yue.InterfaceC4418 android.view.Menu r0, @Yue.InterfaceC4418 android.view.MenuItem r1) {
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m16221(@Yue.InterfaceC4418 android.view.Menu r0, int r1) {
            android.view.MenuItem r1 = r0.getItem(r1)
            if (r1 == 0) goto L10
            int r1 = r1.getItemId()
            r0.removeItem(r1)
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            return
        L14:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
    }
}
