package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f19884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19886j;

    public /* synthetic */ w8(java.util.ArrayList r1, android.content.Context r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19883g = r4
            r0.f19884h = r1
            r0.f19885i = r2
            r0.f19886j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f19883g
            switch(r0) {
                case 0: goto Lde;
                case 1: goto Lbf;
                case 2: goto La0;
                case 3: goto L81;
                case 4: goto L62;
                case 5: goto L43;
                case 6: goto L24;
                default: goto L5;
            }
        L5:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "请先选择监听群"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L21
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        L21:
            sf.n r0 = sf.n.f12433a
            return r0
        L24:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L39
            java.lang.String r0 = "请先选择会话规则"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L40
        L39:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        L40:
            sf.n r0 = sf.n.f12433a
            return r0
        L43:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L58
            java.lang.String r0 = "请先选择适用聊天"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L5f
        L58:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        L5f:
            sf.n r0 = sf.n.f12433a
            return r0
        L62:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L77
            java.lang.String r0 = "请先选择名单"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L7e
        L77:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        L7e:
            sf.n r0 = sf.n.f12433a
            return r0
        L81:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L96
            java.lang.String r0 = "请先选择规则"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto L9d
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        L9d:
            sf.n r0 = sf.n.f12433a
            return r0
        La0:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "请先选择监听群"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto Lbc
        Lb5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        Lbc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lbf:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld4
            java.lang.String r0 = "请先选择适用聊天"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto Ldb
        Ld4:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        Ldb:
            sf.n r0 = sf.n.f12433a
            return r0
        Lde:
            java.util.ArrayList r0 = r3.f19884h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf3
            java.lang.String r0 = "请先选择规则"
            r1 = 0
            android.content.Context r2 = r3.f19885i
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
            goto Lfa
        Lf3:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.a1 r1 = r3.f19886j
            r1.setValue(r0)
        Lfa:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
