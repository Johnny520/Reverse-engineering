package y8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y8.d f22312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f22313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22314j;

    public c(y8.d r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f22312h = r1
            r0.f22313i = r2
            r0.f22314j = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            y8.d r0 = r12.f22312h
            android.os.Handler r1 = r0.f22319c
            java.util.WeakHashMap r2 = r0.f22321e
            java.util.WeakHashMap r3 = r0.f22322f
            java.util.WeakHashMap r4 = r0.f22320d
            android.content.SharedPreferences r0 = r0.f22318b
            java.lang.String r5 = "auto_view_original_enable"
            r6 = 0
            boolean r0 = r0.getBoolean(r5, r6)
            android.app.Activity r5 = r12.f22313i
            if (r0 == 0) goto Le5
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto Le5
            boolean r0 = r5.isDestroyed()
            if (r0 == 0) goto L25
            goto Le5
        L25:
            java.lang.Object r0 = r2.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L2f
            goto Le1
        L2f:
            int r0 = r0.intValue()
            int r2 = r12.f22314j
            if (r0 != r2) goto Le1
            java.lang.Object r0 = r3.get(r5)
            java.util.Set r0 = (java.util.Set) r0
            r7 = 1
            if (r0 == 0) goto L4c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r8)
            if (r0 != r7) goto L4c
            goto Le1
        L4c:
            java.util.List r0 = y8.d.f22315j
            if (r0 == 0) goto L57
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L57
            goto Laf
        L57:
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Laf
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            android.content.res.Resources r9 = r5.getResources()
            java.lang.String r10 = "id"
            java.lang.String r11 = r5.getPackageName()
            int r8 = r9.getIdentifier(r8, r10, r11)
            if (r8 != 0) goto L79
        L77:
            r8 = r6
            goto Lac
        L79:
            android.view.View r8 = r5.findViewById(r8)
            if (r8 == 0) goto L77
            boolean r9 = r8.isShown()
            if (r9 == 0) goto L77
            boolean r9 = r8.isEnabled()
            if (r9 == 0) goto L77
            boolean r9 = r8.hasOnClickListeners()
            if (r9 != 0) goto L92
            goto L77
        L92:
            int r9 = r8.getWidth()
            if (r9 <= 0) goto L77
            int r9 = r8.getHeight()
            if (r9 <= 0) goto L77
            float r9 = r8.getAlpha()
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto La8
            goto L77
        La8:
            boolean r8 = r8.performClick()
        Lac:
            if (r8 == 0) goto L5b
            r6 = r7
        Laf:
            if (r6 == 0) goto Lcc
            java.lang.Object r0 = r3.get(r5)
            if (r0 != 0) goto Lbf
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.put(r5, r0)
        Lbf:
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
            r4.remove(r5)
            return
        Lcc:
            int r0 = r12.f22311g
            long[] r2 = y8.d.f22316k
            int r3 = r2.length
            if (r0 >= r3) goto Ldd
            int r3 = r0 + 1
            r12.f22311g = r3
            r3 = r2[r0]
            r1.postDelayed(r12, r3)
            return
        Ldd:
            r4.remove(r5)
            return
        Le1:
            r4.remove(r5)
            return
        Le5:
            java.lang.Object r0 = r4.remove(r5)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto Lf0
            r1.removeCallbacks(r0)
        Lf0:
            r2.remove(r5)
            r3.remove(r5)
            return
    }
}
