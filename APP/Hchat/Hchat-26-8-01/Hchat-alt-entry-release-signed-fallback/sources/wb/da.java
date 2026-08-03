package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class da implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f15662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15663i;

    public /* synthetic */ da(fg.l r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f15661g = r3
            r0.f15662h = r1
            r0.f15663i = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f15661g
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L32;
                default: goto L5;
            }
        L5:
            r1 = r8
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L2f
            r5 = 0
            r6 = 62
            java.lang.String r2 = "|"
            r3 = 0
            r4 = 0
            java.lang.String r8 = tf.m.A1(r1, r2, r3, r4, r5, r6)
            fg.l r0 = r7.f15662h
            r0.invoke(r8)
            int r8 = r1.size()
            java.lang.String r0 = " 个文件"
            r1 = 0
            java.lang.String r2 = "已选择 "
            android.content.Context r3 = r7.f15663i
            wb.en.o(r2, r8, r0, r3, r1)
        L2f:
            sf.n r8 = sf.n.f12433a
            return r8
        L32:
            r0 = r8
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L5c
            r4 = 0
            r5 = 62
            java.lang.String r1 = "|"
            r2 = 0
            r3 = 0
            java.lang.String r8 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            fg.l r1 = r7.f15662h
            r1.invoke(r8)
            int r8 = r0.size()
            java.lang.String r0 = " 个文件"
            r1 = 0
            java.lang.String r2 = "已选择 "
            android.content.Context r3 = r7.f15663i
            wb.en.o(r2, r8, r0, r3, r1)
        L5c:
            sf.n r8 = sf.n.f12433a
            return r8
        L5f:
            k9.g r8 = (k9.g) r8
            r8.getClass()
            boolean r0 = r8 instanceof k9.f
            if (r0 == 0) goto L72
            k9.f r8 = (k9.f) r8
            java.lang.String r8 = r8.f7494a
            fg.l r0 = r7.f15662h
            r0.invoke(r8)
            goto L8f
        L72:
            k9.e r0 = k9.e.f7493b
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L87
            java.lang.String r8 = "图标读取失败"
            r0 = 0
            android.content.Context r1 = r7.f15663i
            android.widget.Toast r8 = android.widget.Toast.makeText(r1, r8, r0)
            r8.show()
            goto L8f
        L87:
            k9.e r0 = k9.e.f7492a
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L92
        L8f:
            sf.n r8 = sf.n.f12433a
            goto L96
        L92:
            okio.a.k()
            r8 = 0
        L96:
            return r8
    }
}
