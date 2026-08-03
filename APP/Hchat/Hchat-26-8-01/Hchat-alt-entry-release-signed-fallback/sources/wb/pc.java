package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pc implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18432j;

    public /* synthetic */ pc(android.content.Context r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f18429g = r4
            r0.f18430h = r1
            r0.f18431i = r2
            r0.f18432j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f18429g
            sf.n r1 = sf.n.f12433a
            r2 = 0
            i0.a1 r3 = r8.f18432j
            i0.a1 r4 = r8.f18431i
            android.content.Context r5 = r8.f18430h
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L42;
                default: goto Le;
            }
        Le:
            java.util.List r0 = wb.ho.f16653u
            jg.a r6 = jg.d.f6902g
            int r6 = r0.size()
            jg.a r7 = jg.d.f6902g
            int r6 = r7.g(r6)
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            r4.setValue(r0)
            java.util.List r0 = wb.ho.f16654v
            int r4 = r0.size()
            int r4 = r7.g(r4)
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            r3.setValue(r0)
            java.lang.String r0 = "已随机填充本群文本"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
            return r1
        L42:
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L4a
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r0 != 0) goto L57
            java.lang.String r0 = "当前页面无法打开铃声选择器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
            goto L7a
        L57:
            wb.oc r2 = new wb.oc
            r2.<init>(r5, r4, r3)
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 1
            if (r4 != r5) goto L6f
            wb.vq r3 = wb.vq.f19807a
            r3.c(r0, r2)
            goto L7a
        L6f:
            wb.vq r4 = wb.vq.f19807a
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r4.d(r0, r3, r2)
        L7a:
            return r1
        L7b:
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.setValue(r0)
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "已选择模型: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r5, r0, r2)
            r0.show()
            return r1
    }
}
