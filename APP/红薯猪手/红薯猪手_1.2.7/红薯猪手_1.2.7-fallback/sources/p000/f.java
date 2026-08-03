package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.z7 f313;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final p000.w8 f314;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.f.a f315;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f316;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int f317;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final int f318;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f319;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable f320;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final java.lang.String f321;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final java.lang.Object f322;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f323;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public boolean f324;

    public static class a<M> extends java.lang.ref.WeakReference<M> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final p000.f f325;

        public a(p000.f r1, M r2, java.lang.ref.ReferenceQueue<? super M> r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.f325 = r1
                return
        }
    }

    public f(p000.z7 r1, java.lang.Object r2, p000.w8 r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f313 = r1
            r0.f314 = r3
            ۟.f$a r3 = new ۟.f$a
            java.lang.ref.ReferenceQueue<java.lang.Object> r1 = r1.f1258
            r3.<init>(r0, r2, r1)
            r0.f315 = r3
            r1 = 0
            r0.f317 = r1
            r0.f318 = r1
            r0.f316 = r5
            r0.f319 = r1
            r1 = 0
            r0.f320 = r1
            r0.f321 = r4
            r0.f322 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo63() {
            r1 = this;
            r0 = 1
            r1.f324 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo64(android.graphics.Bitmap r1, ۟.z7.e r2);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract void mo65();

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final T m145() {
            r1 = this;
            ۟.f$a r0 = r1.f315
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.Object r0 = r0.get()
        La:
            return r0
    }
}
