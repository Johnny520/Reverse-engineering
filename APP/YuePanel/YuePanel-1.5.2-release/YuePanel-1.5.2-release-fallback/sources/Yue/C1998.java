package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1998 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final boolean f6342 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String f6343 = "DrawableContainerCompat";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final boolean f6344 = true;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C1998.AbstractC2002 f6345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.graphics.Rect f6346;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f6347;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable f6348;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f6349;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f6350;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f6351;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f6352;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.lang.Runnable f6353;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public long f6354;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public long f6355;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C1998.C2001 f6356;

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ, reason: contains not printable characters */
    public class RunnableC1999 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1998 f6357;

        public RunnableC1999(Yue.C1998 r1) {
                r0 = this;
                r0.f6357 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                Yue.ۥ۠۠۠ۦ r0 = r2.f6357
                r1 = 1
                r0.m9248(r1)
                Yue.ۥ۠۠۠ۦ r0 = r2.f6357
                r0.invalidateSelf()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C2000 {
        public C2000() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m9257(android.graphics.drawable.Drawable.ConstantState r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m9258(android.graphics.drawable.Drawable r0, android.graphics.Outline r1) {
                r0.getOutline(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.content.res.Resources m9259(android.content.res.Resources.Theme r0) {
                android.content.res.Resources r0 = r0.getResources()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C2001 implements android.graphics.drawable.Drawable.Callback {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public android.graphics.drawable.Drawable.Callback f6358;

        public C2001() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4410 java.lang.Runnable r3, long r4) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f6358
                if (r0 == 0) goto L7
                r0.scheduleDrawable(r2, r3, r4)
            L7:
                return
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4410 java.lang.Runnable r3) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.f6358
                if (r0 == 0) goto L7
                r0.unscheduleDrawable(r2, r3)
            L7:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.drawable.Drawable.Callback m9260() {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.f6358
                r1 = 0
                r2.f6358 = r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C1998.C2001 m9261(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                r0.f6358 = r1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠۠ۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC2002 extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C1998 f6359;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.content.res.Resources f6360;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f6361;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f6362;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f6363;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.util.SparseArray<android.graphics.drawable.Drawable.ConstantState> f6364;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public android.graphics.drawable.Drawable[] f6365;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f6366;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f6367;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f6368;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public android.graphics.Rect f6369;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f6370;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public boolean f6371;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f6372;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f6373;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f6374;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f6375;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public boolean f6376;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int f6377;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f6378;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public boolean f6379;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f6380;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f6381;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f6382;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f6383;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int f6384;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f6385;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f6386;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public boolean f6387;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public android.graphics.ColorFilter f6388;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public boolean f6389;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public android.content.res.ColorStateList f6390;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public android.graphics.PorterDuff.Mode f6391;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public boolean f6392;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public boolean f6393;

        public AbstractC2002(Yue.C1998.AbstractC2002 r4, Yue.C1998 r5, android.content.res.Resources r6) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.f6367 = r0
                r3.f6370 = r0
                r1 = 1
                r3.f6382 = r1
                r3.f6385 = r0
                r3.f6386 = r0
                r3.f6359 = r5
                r5 = 0
                if (r6 == 0) goto L16
                r2 = r6
                goto L1c
            L16:
                if (r4 == 0) goto L1b
                android.content.res.Resources r2 = r4.f6360
                goto L1c
            L1b:
                r2 = r5
            L1c:
                r3.f6360 = r2
                if (r4 == 0) goto L23
                int r2 = r4.f6361
                goto L24
            L23:
                r2 = r0
            L24:
                int r6 = Yue.C1998.m9247(r6, r2)
                r3.f6361 = r6
                if (r4 == 0) goto Led
                int r2 = r4.f6362
                r3.f6362 = r2
                int r2 = r4.f6363
                r3.f6363 = r2
                r3.f6380 = r1
                r3.f6381 = r1
                boolean r2 = r4.f6367
                r3.f6367 = r2
                boolean r2 = r4.f6370
                r3.f6370 = r2
                boolean r2 = r4.f6382
                r3.f6382 = r2
                boolean r2 = r4.f6383
                r3.f6383 = r2
                int r2 = r4.f6384
                r3.f6384 = r2
                int r2 = r4.f6385
                r3.f6385 = r2
                int r2 = r4.f6386
                r3.f6386 = r2
                boolean r2 = r4.f6387
                r3.f6387 = r2
                android.graphics.ColorFilter r2 = r4.f6388
                r3.f6388 = r2
                boolean r2 = r4.f6389
                r3.f6389 = r2
                android.content.res.ColorStateList r2 = r4.f6390
                r3.f6390 = r2
                android.graphics.PorterDuff$Mode r2 = r4.f6391
                r3.f6391 = r2
                boolean r2 = r4.f6392
                r3.f6392 = r2
                boolean r2 = r4.f6393
                r3.f6393 = r2
                int r2 = r4.f6361
                if (r2 != r6) goto L9d
                boolean r6 = r4.f6368
                if (r6 == 0) goto L87
                android.graphics.Rect r6 = r4.f6369
                if (r6 == 0) goto L83
                android.graphics.Rect r5 = new android.graphics.Rect
                android.graphics.Rect r6 = r4.f6369
                r5.<init>(r6)
            L83:
                r3.f6369 = r5
                r3.f6368 = r1
            L87:
                boolean r5 = r4.f6371
                if (r5 == 0) goto L9d
                int r5 = r4.f6372
                r3.f6372 = r5
                int r5 = r4.f6373
                r3.f6373 = r5
                int r5 = r4.f6374
                r3.f6374 = r5
                int r5 = r4.f6375
                r3.f6375 = r5
                r3.f6371 = r1
            L9d:
                boolean r5 = r4.f6376
                if (r5 == 0) goto La7
                int r5 = r4.f6377
                r3.f6377 = r5
                r3.f6376 = r1
            La7:
                boolean r5 = r4.f6378
                if (r5 == 0) goto Lb1
                boolean r5 = r4.f6379
                r3.f6379 = r5
                r3.f6378 = r1
            Lb1:
                android.graphics.drawable.Drawable[] r5 = r4.f6365
                int r6 = r5.length
                android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]
                r3.f6365 = r6
                int r6 = r4.f6366
                r3.f6366 = r6
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r4.f6364
                if (r4 == 0) goto Lc7
                android.util.SparseArray r4 = r4.clone()
                r3.f6364 = r4
                goto Ld0
            Lc7:
                android.util.SparseArray r4 = new android.util.SparseArray
                int r6 = r3.f6366
                r4.<init>(r6)
                r3.f6364 = r4
            Ld0:
                int r4 = r3.f6366
            Ld2:
                if (r0 >= r4) goto Lf5
                r6 = r5[r0]
                if (r6 == 0) goto Lea
                android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()
                if (r6 == 0) goto Le4
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r1 = r3.f6364
                r1.put(r0, r6)
                goto Lea
            Le4:
                android.graphics.drawable.Drawable[] r6 = r3.f6365
                r1 = r5[r0]
                r6[r0] = r1
            Lea:
                int r0 = r0 + 1
                goto Ld2
            Led:
                r4 = 10
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                r3.f6365 = r4
                r3.f6366 = r0
            Lf5:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @Yue.InterfaceC5336(21)
        public boolean canApplyTheme() {
                r6 = this;
                int r0 = r6.f6366
                android.graphics.drawable.Drawable[] r1 = r6.f6365
                r2 = 0
                r3 = r2
            L6:
                if (r3 >= r0) goto L28
                r4 = r1[r3]
                r5 = 1
                if (r4 == 0) goto L14
                boolean r4 = Yue.C1995.m9219(r4)
                if (r4 == 0) goto L25
                return r5
            L14:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r4 = r6.f6364
                java.lang.Object r4 = r4.get(r3)
                android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
                if (r4 == 0) goto L25
                boolean r4 = Yue.C1998.C2000.m9257(r4)
                if (r4 == 0) goto L25
                return r5
            L25:
                int r3 = r3 + 1
                goto L6
            L28:
                return r2
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r2 = this;
                int r0 = r2.f6362
                int r1 = r2.f6363
                r0 = r0 | r1
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m9262(android.graphics.drawable.Drawable r5) {
                r4 = this;
                int r0 = r4.f6366
                android.graphics.drawable.Drawable[] r1 = r4.f6365
                int r1 = r1.length
                if (r0 < r1) goto Lc
                int r1 = r0 + 10
                r4.mo9279(r0, r1)
            Lc:
                r5.mutate()
                r1 = 0
                r2 = 1
                r5.setVisible(r1, r2)
                Yue.ۥ۠۠۠ۦ r3 = r4.f6359
                r5.setCallback(r3)
                android.graphics.drawable.Drawable[] r3 = r4.f6365
                r3[r0] = r5
                int r3 = r4.f6366
                int r3 = r3 + r2
                r4.f6366 = r3
                int r2 = r4.f6363
                int r5 = r5.getChangingConfigurations()
                r5 = r5 | r2
                r4.f6363 = r5
                r4.m9280()
                r5 = 0
                r4.f6369 = r5
                r4.f6368 = r1
                r4.f6371 = r1
                r4.f6380 = r1
                return r0
        }

        @Yue.InterfaceC5336(21)
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m9263(android.content.res.Resources.Theme r6) {
                r5 = this;
                if (r6 == 0) goto L30
                r5.m9267()
                int r0 = r5.f6366
                android.graphics.drawable.Drawable[] r1 = r5.f6365
                r2 = 0
            La:
                if (r2 >= r0) goto L29
                r3 = r1[r2]
                if (r3 == 0) goto L26
                boolean r3 = Yue.C1995.m9219(r3)
                if (r3 == 0) goto L26
                r3 = r1[r2]
                Yue.C1995.m9218(r3, r6)
                int r3 = r5.f6363
                r4 = r1[r2]
                int r4 = r4.getChangingConfigurations()
                r3 = r3 | r4
                r5.f6363 = r3
            L26:
                int r2 = r2 + 1
                goto La
            L29:
                android.content.res.Resources r6 = Yue.C1998.C2000.m9259(r6)
                r5.m9289(r6)
            L30:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m9264() {
                r6 = this;
                boolean r0 = r6.f6380
                if (r0 == 0) goto L7
                boolean r0 = r6.f6381
                return r0
            L7:
                r6.m9267()
                r0 = 1
                r6.f6380 = r0
                int r1 = r6.f6366
                android.graphics.drawable.Drawable[] r2 = r6.f6365
                r3 = 0
                r4 = r3
            L13:
                if (r4 >= r1) goto L23
                r5 = r2[r4]
                android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
                if (r5 != 0) goto L20
                r6.f6381 = r3
                return r3
            L20:
                int r4 = r4 + 1
                goto L13
            L23:
                r6.f6381 = r0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m9265() {
                r1 = this;
                r0 = 0
                r1.f6383 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m9266() {
                r6 = this;
                r0 = 1
                r6.f6371 = r0
                r6.m9267()
                int r0 = r6.f6366
                android.graphics.drawable.Drawable[] r1 = r6.f6365
                r2 = -1
                r6.f6373 = r2
                r6.f6372 = r2
                r2 = 0
                r6.f6375 = r2
                r6.f6374 = r2
            L14:
                if (r2 >= r0) goto L43
                r3 = r1[r2]
                int r4 = r3.getIntrinsicWidth()
                int r5 = r6.f6372
                if (r4 <= r5) goto L22
                r6.f6372 = r4
            L22:
                int r4 = r3.getIntrinsicHeight()
                int r5 = r6.f6373
                if (r4 <= r5) goto L2c
                r6.f6373 = r4
            L2c:
                int r4 = r3.getMinimumWidth()
                int r5 = r6.f6374
                if (r4 <= r5) goto L36
                r6.f6374 = r4
            L36:
                int r3 = r3.getMinimumHeight()
                int r4 = r6.f6375
                if (r3 <= r4) goto L40
                r6.f6375 = r3
            L40:
                int r2 = r2 + 1
                goto L14
            L43:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m9267() {
                r6 = this;
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r6.f6364
                if (r0 == 0) goto L2d
                int r0 = r0.size()
                r1 = 0
            L9:
                if (r1 >= r0) goto L2a
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r6.f6364
                int r2 = r2.keyAt(r1)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r3 = r6.f6364
                java.lang.Object r3 = r3.valueAt(r1)
                android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
                android.graphics.drawable.Drawable[] r4 = r6.f6365
                android.content.res.Resources r5 = r6.f6360
                android.graphics.drawable.Drawable r3 = r3.newDrawable(r5)
                android.graphics.drawable.Drawable r3 = r6.m9283(r3)
                r4[r2] = r3
                int r1 = r1 + 1
                goto L9
            L2a:
                r0 = 0
                r6.f6364 = r0
            L2d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final int m9268() {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.f6365
                int r0 = r0.length
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final android.graphics.drawable.Drawable m9269(int r5) {
                r4 = this;
                android.graphics.drawable.Drawable[] r0 = r4.f6365
                r0 = r0[r5]
                if (r0 == 0) goto L7
                return r0
            L7:
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r0 = r4.f6364
                r1 = 0
                if (r0 == 0) goto L38
                int r0 = r0.indexOfKey(r5)
                if (r0 < 0) goto L38
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r2 = r4.f6364
                java.lang.Object r2 = r2.valueAt(r0)
                android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
                android.content.res.Resources r3 = r4.f6360
                android.graphics.drawable.Drawable r2 = r2.newDrawable(r3)
                android.graphics.drawable.Drawable r2 = r4.m9283(r2)
                android.graphics.drawable.Drawable[] r3 = r4.f6365
                r3[r5] = r2
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f6364
                r5.removeAt(r0)
                android.util.SparseArray<android.graphics.drawable.Drawable$ConstantState> r5 = r4.f6364
                int r5 = r5.size()
                if (r5 != 0) goto L37
                r4.f6364 = r1
            L37:
                return r2
            L38:
                return r1
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final int m9270() {
                r1 = this;
                int r0 = r1.f6366
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final int m9271() {
                r1 = this;
                boolean r0 = r1.f6371
                if (r0 != 0) goto L7
                r1.m9266()
            L7:
                int r0 = r1.f6373
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final int m9272() {
                r1 = this;
                boolean r0 = r1.f6371
                if (r0 != 0) goto L7
                r1.m9266()
            L7:
                int r0 = r1.f6375
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final int m9273() {
                r1 = this;
                boolean r0 = r1.f6371
                if (r0 != 0) goto L7
                r1.m9266()
            L7:
                int r0 = r1.f6374
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final android.graphics.Rect m9274() {
                r8 = this;
                boolean r0 = r8.f6367
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                android.graphics.Rect r0 = r8.f6369
                if (r0 != 0) goto L57
                boolean r2 = r8.f6368
                if (r2 == 0) goto Lf
                goto L57
            Lf:
                r8.m9267()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                int r2 = r8.f6366
                android.graphics.drawable.Drawable[] r3 = r8.f6365
                r4 = 0
                r5 = r4
            L1d:
                if (r5 >= r2) goto L51
                r6 = r3[r5]
                boolean r6 = r6.getPadding(r0)
                if (r6 == 0) goto L4e
                if (r1 != 0) goto L2e
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>(r4, r4, r4, r4)
            L2e:
                int r6 = r0.left
                int r7 = r1.left
                if (r6 <= r7) goto L36
                r1.left = r6
            L36:
                int r6 = r0.top
                int r7 = r1.top
                if (r6 <= r7) goto L3e
                r1.top = r6
            L3e:
                int r6 = r0.right
                int r7 = r1.right
                if (r6 <= r7) goto L46
                r1.right = r6
            L46:
                int r6 = r0.bottom
                int r7 = r1.bottom
                if (r6 <= r7) goto L4e
                r1.bottom = r6
            L4e:
                int r5 = r5 + 1
                goto L1d
            L51:
                r0 = 1
                r8.f6368 = r0
                r8.f6369 = r1
                return r1
            L57:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final int m9275() {
                r1 = this;
                boolean r0 = r1.f6371
                if (r0 != 0) goto L7
                r1.m9266()
            L7:
                int r0 = r1.f6372
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final int m9276() {
                r1 = this;
                int r0 = r1.f6385
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final int m9277() {
                r1 = this;
                int r0 = r1.f6386
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final int m9278() {
                r6 = this;
                boolean r0 = r6.f6376
                if (r0 == 0) goto L7
                int r0 = r6.f6377
                return r0
            L7:
                r6.m9267()
                int r0 = r6.f6366
                android.graphics.drawable.Drawable[] r1 = r6.f6365
                if (r0 <= 0) goto L18
                r2 = 0
                r2 = r1[r2]
                int r2 = r2.getOpacity()
                goto L19
            L18:
                r2 = -2
            L19:
                r3 = 1
                r4 = r3
            L1b:
                if (r4 >= r0) goto L2a
                r5 = r1[r4]
                int r5 = r5.getOpacity()
                int r2 = android.graphics.drawable.Drawable.resolveOpacity(r2, r5)
                int r4 = r4 + 1
                goto L1b
            L2a:
                r6.f6377 = r2
                r6.f6376 = r3
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo9279(int r3, int r4) {
                r2 = this;
                android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
                android.graphics.drawable.Drawable[] r0 = r2.f6365
                if (r0 == 0) goto La
                r1 = 0
                java.lang.System.arraycopy(r0, r1, r4, r1, r3)
            La:
                r2.f6365 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m9280() {
                r1 = this;
                r0 = 0
                r1.f6376 = r0
                r1.f6378 = r0
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final boolean m9281() {
                r1 = this;
                boolean r0 = r1.f6370
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final boolean m9282() {
                r6 = this;
                boolean r0 = r6.f6378
                if (r0 == 0) goto L7
                boolean r0 = r6.f6379
                return r0
            L7:
                r6.m9267()
                int r0 = r6.f6366
                android.graphics.drawable.Drawable[] r1 = r6.f6365
                r2 = 0
                r3 = r2
            L10:
                r4 = 1
                if (r3 >= r0) goto L20
                r5 = r1[r3]
                boolean r5 = r5.isStateful()
                if (r5 == 0) goto L1d
                r2 = r4
                goto L20
            L1d:
                int r3 = r3 + 1
                goto L10
            L20:
                r6.f6379 = r2
                r6.f6378 = r4
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
        public void mo1470() {
                r4 = this;
                int r0 = r4.f6366
                android.graphics.drawable.Drawable[] r1 = r4.f6365
                r2 = 0
            L5:
                if (r2 >= r0) goto L11
                r3 = r1[r2]
                if (r3 == 0) goto Le
                r3.mutate()
            Le:
                int r2 = r2 + 1
                goto L5
            L11:
                r0 = 1
                r4.f6383 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final android.graphics.drawable.Drawable m9283(android.graphics.drawable.Drawable r2) {
                r1 = this;
                int r0 = r1.f6384
                Yue.C1995.m9230(r2, r0)
                android.graphics.drawable.Drawable r2 = r2.mutate()
                Yue.ۥ۠۠۠ۦ r0 = r1.f6359
                r2.setCallback(r0)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final void m9284(boolean r1) {
                r0 = this;
                r0.f6370 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final void m9285(int r1) {
                r0 = this;
                r0.f6385 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final void m9286(int r1) {
                r0 = this;
                r0.f6386 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final boolean m9287(int r6, int r7) {
                r5 = this;
                int r0 = r5.f6366
                android.graphics.drawable.Drawable[] r1 = r5.f6365
                r2 = 0
                r3 = r2
            L6:
                if (r2 >= r0) goto L16
                r4 = r1[r2]
                if (r4 == 0) goto L13
                boolean r4 = Yue.C1995.m9230(r4, r6)
                if (r2 != r7) goto L13
                r3 = r4
            L13:
                int r2 = r2 + 1
                goto L6
            L16:
                r5.f6384 = r6
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final void m9288(boolean r1) {
                r0 = this;
                r0.f6367 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final void m9289(android.content.res.Resources r2) {
                r1 = this;
                if (r2 == 0) goto L15
                r1.f6360 = r2
                int r0 = r1.f6361
                int r2 = Yue.C1998.m9247(r2, r0)
                int r0 = r1.f6361
                r1.f6361 = r2
                if (r0 == r2) goto L15
                r2 = 0
                r1.f6371 = r2
                r1.f6368 = r2
            L15:
                return
        }
    }

    public C1998() {
            r1 = this;
            r1.<init>()
            r0 = 255(0xff, float:3.57E-43)
            r1.f6349 = r0
            r0 = -1
            r1.f6351 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m9247(@Yue.InterfaceC4544 android.content.res.Resources r0, int r1) {
            if (r0 != 0) goto L3
            goto L9
        L3:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
        L9:
            if (r1 != 0) goto Ld
            r1 = 160(0xa0, float:2.24E-43)
        Ld:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(21)
    public void applyTheme(@Yue.InterfaceC4410 android.content.res.Resources.Theme r2) {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            r0.m9263(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(21)
    public boolean canApplyTheme() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@Yue.InterfaceC4410 android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L7
            r0.draw(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.f6348
            if (r0 == 0) goto Le
            r0.draw(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            int r0 = r1.f6349
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r1 = r2.f6345
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            boolean r0 = r0.m9264()
            if (r0 == 0) goto L13
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            int r1 = r2.getChangingConfigurations()
            r0.f6362 = r1
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC4410
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@Yue.InterfaceC4410 android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.f6346
            if (r0 == 0) goto L8
            r2.set(r0)
            goto Lb
        L8:
            super.getHotspotBounds(r2)
        Lb:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.m9281()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            int r0 = r0.m9271()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicHeight()
            goto L19
        L18:
            r0 = -1
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.m9281()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            int r0 = r0.m9275()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L18
            int r0 = r0.getIntrinsicWidth()
            goto L19
        L18:
            r0 = -1
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.m9281()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            int r0 = r0.m9272()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L18
            int r0 = r0.getMinimumHeight()
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.m9281()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            int r0 = r0.m9273()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L18
            int r0 = r0.getMinimumWidth()
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L12
            boolean r0 = r0.isVisible()
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            int r0 = r0.m9278()
            goto L13
        L12:
            r0 = -2
        L13:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    @Yue.InterfaceC5336(21)
    public void getOutline(@Yue.InterfaceC4410 android.graphics.Outline r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L7
            Yue.C1998.C2000.m9258(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@Yue.InterfaceC4410 android.graphics.Rect r4) {
            r3 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r3.f6345
            android.graphics.Rect r0 = r0.m9274()
            if (r0 == 0) goto L1c
            r4.set(r0)
            int r1 = r0.left
            int r2 = r0.top
            r1 = r1 | r2
            int r2 = r0.bottom
            r1 = r1 | r2
            int r0 = r0.right
            r0 = r0 | r1
            if (r0 == 0) goto L1a
            r0 = 1
            goto L29
        L1a:
            r0 = 0
            goto L29
        L1c:
            android.graphics.drawable.Drawable r0 = r3.f6347
            if (r0 == 0) goto L25
            boolean r0 = r0.getPadding(r4)
            goto L29
        L25:
            boolean r0 = super.getPadding(r4)
        L29:
            boolean r1 = r3.m9251()
            if (r1 == 0) goto L37
            int r1 = r4.left
            int r2 = r4.right
            r4.left = r2
            r4.right = r1
        L37:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            if (r0 == 0) goto L7
            r0.m9280()
        L7:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r2 != r0) goto L18
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L18
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.invalidateDrawable(r1)
        L18:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.f6387
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            boolean r0 = r0.m9282()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f6348
            r1 = 1
            if (r0 == 0) goto Ld
            r0.jumpToCurrentState()
            r0 = 0
            r6.f6348 = r0
            r0 = r1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.drawable.Drawable r2 = r6.f6347
            if (r2 == 0) goto L20
            r2.jumpToCurrentState()
            boolean r2 = r6.f6350
            if (r2 == 0) goto L20
            android.graphics.drawable.Drawable r2 = r6.f6347
            int r3 = r6.f6349
            r2.setAlpha(r3)
        L20:
            long r2 = r6.f6355
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2b
            r6.f6355 = r4
            r0 = r1
        L2b:
            long r2 = r6.f6354
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            r6.f6354 = r4
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3a
            r6.invalidateSelf()
        L3a:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.f6352
            if (r0 != 0) goto L17
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L17
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.mo1455()
            r0.mo1470()
            r1.mo1456(r0)
            r0 = 1
            r1.f6352 = r0
        L17:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6348
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto Le
            r0.setBounds(r2)
        Le:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            int r1 = r2.m9249()
            boolean r3 = r0.m9287(r3, r1)
            return r3
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6348
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L12
            boolean r2 = r0.setLevel(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@Yue.InterfaceC4410 int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6348
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L12
            boolean r2 = r0.setState(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4410 java.lang.Runnable r3, long r4) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.scheduleDrawable(r1, r3, r4)
        L11:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r6) {
            r5 = this;
            boolean r0 = r5.f6350
            if (r0 == 0) goto L8
            int r0 = r5.f6349
            if (r0 == r6) goto L21
        L8:
            r0 = 1
            r5.f6350 = r0
            r5.f6349 = r6
            android.graphics.drawable.Drawable r0 = r5.f6347
            if (r0 == 0) goto L21
            long r1 = r5.f6354
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            r0.setAlpha(r6)
            goto L21
        L1d:
            r6 = 0
            r5.m9248(r6)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            boolean r1 = r0.f6387
            if (r1 == r3) goto Lf
            r0.f6387 = r3
            android.graphics.drawable.Drawable r0 = r2.f6347
            if (r0 == 0) goto Lf
            Yue.C1995.m9227(r0, r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            r1 = 1
            r0.f6389 = r1
            android.graphics.ColorFilter r1 = r0.f6388
            if (r1 == r3) goto L12
            r0.f6388 = r3
            android.graphics.drawable.Drawable r0 = r2.f6347
            if (r0 == 0) goto L12
            r0.setColorFilter(r3)
        L12:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            boolean r1 = r0.f6382
            if (r1 == r3) goto Lf
            r0.f6382 = r3
            android.graphics.drawable.Drawable r0 = r2.f6347
            if (r0 == 0) goto Lf
            r0.setDither(r3)
        Lf:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L7
            Yue.C1995.m9228(r0, r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.Rect r0 = r1.f6346
            if (r0 != 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2, r3, r4, r5)
            r1.f6346 = r0
            goto Lf
        Lc:
            r0.set(r2, r3, r4, r5)
        Lf:
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r0 == 0) goto L16
            Yue.C1995.m9229(r0, r2, r3, r4, r5)
        L16:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            r1 = 1
            r0.f6392 = r1
            android.content.res.ColorStateList r1 = r0.f6390
            if (r1 == r3) goto L10
            r0.f6390 = r3
            android.graphics.drawable.Drawable r0 = r2.f6347
            Yue.C1995.m9232(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Yue.InterfaceC4410 android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r2.f6345
            r1 = 1
            r0.f6393 = r1
            android.graphics.PorterDuff$Mode r1 = r0.f6391
            if (r1 == r3) goto L10
            r0.f6391 = r3
            android.graphics.drawable.Drawable r0 = r2.f6347
            Yue.C1995.m9233(r0, r3)
        L10:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            android.graphics.drawable.Drawable r1 = r2.f6348
            if (r1 == 0) goto Lb
            r1.setVisible(r3, r4)
        Lb:
            android.graphics.drawable.Drawable r1 = r2.f6347
            if (r1 == 0) goto L12
            r1.setVisible(r3, r4)
        L12:
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2, @Yue.InterfaceC4410 java.lang.Runnable r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6347
            if (r2 != r0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            if (r2 == 0) goto L11
            android.graphics.drawable.Drawable$Callback r2 = r1.getCallback()
            r2.unscheduleDrawable(r1, r3)
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m9248(boolean r14) {
            r13 = this;
            r0 = 1
            r13.f6350 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6347
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f6354
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f6349
            r3.setAlpha(r9)
            r13.f6354 = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r10 = r13.f6345
            int r10 = r10.f6385
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f6349
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f6354 = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f6348
            if (r9 == 0) goto L61
            long r10 = r13.f6355
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f6348 = r0
            r13.f6355 = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r4 = r13.f6345
            int r4 = r4.f6386
            int r3 = r3 / r4
            int r4 = r13.f6349
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f6355 = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f6353
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1454() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            r0.m9265()
            r0 = 0
            r1.f6352 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.C1998.AbstractC2002 mo1455() {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m9249() {
            r1 = this;
            int r0 = r1.f6351
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m9250(android.graphics.drawable.Drawable r5) {
            r4 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r0 = r4.f6356
            if (r0 != 0) goto Lb
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r0 = new Yue.ۥ۠۠۠ۦ$ۥ۟۟
            r0.<init>()
            r4.f6356 = r0
        Lb:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r0 = r4.f6356
            android.graphics.drawable.Drawable$Callback r1 = r5.getCallback()
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r0 = r0.m9261(r1)
            r5.setCallback(r0)
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r4.f6345     // Catch: java.lang.Throwable -> L28
            int r0 = r0.f6385     // Catch: java.lang.Throwable -> L28
            if (r0 > 0) goto L2a
            boolean r0 = r4.f6350     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            int r0 = r4.f6349     // Catch: java.lang.Throwable -> L28
            r5.setAlpha(r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L95
        L2a:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r4.f6345     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.f6389     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L36
            android.graphics.ColorFilter r0 = r0.f6388     // Catch: java.lang.Throwable -> L28
            r5.setColorFilter(r0)     // Catch: java.lang.Throwable -> L28
            goto L4a
        L36:
            boolean r1 = r0.f6392     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L3f
            android.content.res.ColorStateList r0 = r0.f6390     // Catch: java.lang.Throwable -> L28
            Yue.C1995.m9232(r5, r0)     // Catch: java.lang.Throwable -> L28
        L3f:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r4.f6345     // Catch: java.lang.Throwable -> L28
            boolean r1 = r0.f6393     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L4a
            android.graphics.PorterDuff$Mode r0 = r0.f6391     // Catch: java.lang.Throwable -> L28
            Yue.C1995.m9233(r5, r0)     // Catch: java.lang.Throwable -> L28
        L4a:
            boolean r0 = r4.isVisible()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            r5.setVisible(r0, r1)     // Catch: java.lang.Throwable -> L28
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r4.f6345     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.f6382     // Catch: java.lang.Throwable -> L28
            r5.setDither(r0)     // Catch: java.lang.Throwable -> L28
            int[] r0 = r4.getState()     // Catch: java.lang.Throwable -> L28
            r5.setState(r0)     // Catch: java.lang.Throwable -> L28
            int r0 = r4.getLevel()     // Catch: java.lang.Throwable -> L28
            r5.setLevel(r0)     // Catch: java.lang.Throwable -> L28
            android.graphics.Rect r0 = r4.getBounds()     // Catch: java.lang.Throwable -> L28
            r5.setBounds(r0)     // Catch: java.lang.Throwable -> L28
            int r0 = Yue.C1995.m9223(r4)     // Catch: java.lang.Throwable -> L28
            Yue.C1995.m9230(r5, r0)     // Catch: java.lang.Throwable -> L28
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r4.f6345     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.f6387     // Catch: java.lang.Throwable -> L28
            Yue.C1995.m9227(r5, r0)     // Catch: java.lang.Throwable -> L28
            android.graphics.Rect r0 = r4.f6346     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L8b
            int r1 = r0.left     // Catch: java.lang.Throwable -> L28
            int r2 = r0.top     // Catch: java.lang.Throwable -> L28
            int r3 = r0.right     // Catch: java.lang.Throwable -> L28
            int r0 = r0.bottom     // Catch: java.lang.Throwable -> L28
            Yue.C1995.m9229(r5, r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L28
        L8b:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r0 = r4.f6356
            android.graphics.drawable.Drawable$Callback r0 = r0.m9260()
            r5.setCallback(r0)
            return
        L95:
            Yue.ۥ۠۠۠ۦ$ۥ۟۟ r1 = r4.f6356
            android.graphics.drawable.Drawable$Callback r1 = r1.m9260()
            r5.setCallback(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m9251() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            if (r0 == 0) goto Le
            int r0 = Yue.C1995.m9223(r2)
            r1 = 1
            if (r0 != r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m9252(int r10) {
            r9 = this;
            int r0 = r9.f6351
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r9.f6345
            int r0 = r0.f6386
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f6348
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f6347
            if (r0 == 0) goto L29
            r9.f6348 = r0
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r9.f6345
            int r0 = r0.f6386
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6355 = r0
            goto L35
        L29:
            r9.f6348 = r4
            r9.f6355 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f6347
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r9.f6345
            int r1 = r0.f6366
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m9269(r10)
            r9.f6347 = r0
            r9.f6351 = r10
            if (r0 == 0) goto L5a
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r10 = r9.f6345
            int r10 = r10.f6385
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6354 = r2
        L51:
            r9.m9250(r0)
            goto L5a
        L55:
            r9.f6347 = r4
            r10 = -1
            r9.f6351 = r10
        L5a:
            long r0 = r9.f6354
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f6355
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f6353
            if (r10 != 0) goto L73
            Yue.ۥ۠۠۠ۦ$ۥ r10 = new Yue.ۥ۠۠۠ۦ$ۥ
            r10.<init>(r9)
            r9.f6353 = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m9248(r0)
        L79:
            r9.invalidateSelf()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo1456(Yue.C1998.AbstractC2002 r2) {
            r1 = this;
            r1.f6345 = r2
            int r0 = r1.f6351
            if (r0 < 0) goto L11
            android.graphics.drawable.Drawable r2 = r2.m9269(r0)
            r1.f6347 = r2
            if (r2 == 0) goto L11
            r1.m9250(r2)
        L11:
            r2 = 0
            r1.f6348 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m9253(int r1) {
            r0 = this;
            r0.m9252(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m9254(int r2) {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            r0.f6385 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m9255(int r2) {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            r0.f6386 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m9256(android.content.res.Resources r2) {
            r1 = this;
            Yue.ۥ۠۠۠ۦ$ۥ۟۟۟ r0 = r1.f6345
            r0.m9289(r2)
            return
    }
}
