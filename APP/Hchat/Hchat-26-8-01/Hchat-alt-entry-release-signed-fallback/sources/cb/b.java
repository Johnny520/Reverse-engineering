package cb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cb.b f1609a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f1610b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.WeakHashMap f1611c = null;

    static {
            cb.b r0 = new cb.b
            r0.<init>()
            cb.b.f1609a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            cb.b.f1610b = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            cb.b.f1611c = r0
            return
    }

    public final synchronized android.graphics.Bitmap a(android.graphics.Bitmap r17, float r18) {
            r16 = this;
            r1 = r17
            java.lang.String r2 = "[Hchat:RoundAvatar] 处理通知头像失败: "
            monitor-enter(r16)
            boolean r0 = r1.isRecycled()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Lff
            int r0 = r1.getWidth()     // Catch: java.lang.Throwable -> L37
            if (r0 <= 0) goto Lff
            int r0 = r1.getHeight()     // Catch: java.lang.Throwable -> L37
            if (r0 > 0) goto L19
            goto Lff
        L19:
            java.util.WeakHashMap r0 = cb.b.f1611c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L37
            r4 = 0
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L37
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L3a
            boolean r5 = r3.isRecycled()     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L33
            goto L34
        L33:
            r3 = r4
        L34:
            if (r3 == 0) goto L3a
            goto L3b
        L37:
            r0 = move-exception
            goto L101
        L3a:
            r3 = r1
        L3b:
            r5 = 1036831949(0x3dcccccd, float:0.1)
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = r18
            float r5 = r9.e0.q(r7, r5, r6)     // Catch: java.lang.Throwable -> L37
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r6
            int r5 = ig.a.X(r5)     // Catch: java.lang.Throwable -> L37
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L37
            float r5 = r5 / r6
            java.util.WeakHashMap r6 = cb.b.f1610b     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r6.get(r3)     // Catch: java.lang.Throwable -> L37
            cb.a r7 = (cb.a) r7     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L78
            float r8 = r7.f1607a     // Catch: java.lang.Throwable -> L37
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L60
            goto L61
        L60:
            r7 = r4
        L61:
            if (r7 == 0) goto L78
            java.lang.ref.WeakReference r7 = r7.f1608b     // Catch: java.lang.Throwable -> L37
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L37
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L78
            boolean r8 = r7.isRecycled()     // Catch: java.lang.Throwable -> L37
            if (r8 != 0) goto L74
            r4 = r7
        L74:
            if (r4 == 0) goto L78
            monitor-exit(r16)
            return r4
        L78:
            int r4 = r3.getWidth()     // Catch: java.lang.Throwable -> Lda
            int r7 = r3.getHeight()     // Catch: java.lang.Throwable -> Lda
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> Lda
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r7, r8)     // Catch: java.lang.Throwable -> Lda
            r4.getClass()     // Catch: java.lang.Throwable -> Lda
            int r7 = r3.getDensity()     // Catch: java.lang.Throwable -> Lda
            r4.setDensity(r7)     // Catch: java.lang.Throwable -> Lda
            android.graphics.Paint r15 = new android.graphics.Paint     // Catch: java.lang.Throwable -> Lda
            r7 = 3
            r15.<init>(r7)     // Catch: java.lang.Throwable -> Lda
            android.graphics.BitmapShader r7 = new android.graphics.BitmapShader     // Catch: java.lang.Throwable -> Lda
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP     // Catch: java.lang.Throwable -> Lda
            r7.<init>(r3, r8, r8)     // Catch: java.lang.Throwable -> Lda
            r15.setShader(r7)     // Catch: java.lang.Throwable -> Lda
            int r7 = r3.getWidth()     // Catch: java.lang.Throwable -> Lda
            int r8 = r3.getHeight()     // Catch: java.lang.Throwable -> Lda
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> Lda
            float r7 = (float) r7     // Catch: java.lang.Throwable -> Lda
            float r13 = r7 * r5
            android.graphics.Canvas r8 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> Lda
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lda
            int r7 = r3.getWidth()     // Catch: java.lang.Throwable -> Lda
            float r11 = (float) r7     // Catch: java.lang.Throwable -> Lda
            int r7 = r3.getHeight()     // Catch: java.lang.Throwable -> Lda
            float r12 = (float) r7     // Catch: java.lang.Throwable -> Lda
            r9 = 0
            r10 = 0
            r14 = r13
            r8.drawRoundRect(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lda
            cb.a r7 = new cb.a     // Catch: java.lang.Throwable -> Lda
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lda
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lda
            r7.<init>(r5, r8)     // Catch: java.lang.Throwable -> Lda
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> Lda
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lda
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lda
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> Lda
            goto Le0
        Lda:
            r0 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L37
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L37
        Le0:
            java.lang.Throwable r0 = sf.g.b(r4)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto Le8
            r1 = r4
            goto Lfb
        Le8:
            java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L37
            r4.append(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L37
            fb.v0.n(r2, r0)     // Catch: java.lang.Throwable -> L37
        Lfb:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L37
            monitor-exit(r16)
            return r1
        Lff:
            monitor-exit(r16)
            return r1
        L101:
            monitor-exit(r16)     // Catch: java.lang.Throwable -> L37
            throw r0
    }
}
