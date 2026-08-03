package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5361j;

    public /* synthetic */ e0(int r2, n9.a r3, i0.a1 r4) {
            r1 = this;
            r0 = 5
            r1.f5358g = r0
            r1.<init>()
            r1.f5359h = r2
            r1.f5360i = r3
            r1.f5361j = r4
            return
    }

    public /* synthetic */ e0(java.lang.Object r1, int r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f5358g = r4
            r0.f5360i = r1
            r0.f5359h = r2
            r0.f5361j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r8 = this;
            int r0 = r8.f5358g
            switch(r0) {
                case 0: goto L132;
                case 1: goto L119;
                case 2: goto L106;
                case 3: goto Lf3;
                case 4: goto Le0;
                case 5: goto Lb0;
                case 6: goto L9d;
                case 7: goto L8b;
                case 8: goto L79;
                case 9: goto L67;
                case 10: goto L55;
                case 11: goto L27;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f5360i
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r8.f5361j
            r6 = r0
            hb.z r6 = (hb.z) r6
            r0 = 59
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            k.s1 r7 = new k.s1
            r0 = 25
            r7.<init>(r0)
            java.lang.String r2 = "设置秒数"
            int r3 = r8.f5359h
            r4 = 0
            wb.y2.a2(r1, r2, r3, r4, r5, r6, r7)
        L24:
            sf.n r0 = sf.n.f12433a
            return r0
        L27:
            java.lang.Object r0 = r8.f5360i
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r8.f5361j
            fg.l r1 = (fg.l) r1
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L37
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            goto L38
        L37:
            r2 = 0
        L38:
            if (r2 != 0) goto L45
            java.lang.String r1 = "当前页面无法打开文件选择器"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L52
        L45:
            wb.iq r3 = wb.iq.f16906a
            wb.da r4 = new wb.da
            r5 = 2
            r4.<init>(r1, r0, r5)
            int r0 = r8.f5359h
            r3.b(r2, r0, r4)
        L52:
            sf.n r0 = sf.n.f12433a
            return r0
        L55:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            ua.i r1 = (ua.i) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L67:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            q9.g r1 = (q9.g) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L79:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            na.j r1 = (na.j) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L8b:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            aa.h r1 = (aa.h) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L9d:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            ua.h r1 = (ua.h) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        Lb0:
            java.lang.Object r0 = r8.f5360i
            n9.a r0 = (n9.a) r0
            java.lang.Object r1 = r8.f5361j
            i0.a1 r1 = (i0.a1) r1
            java.util.Set r0 = r0.f9071c
            int r2 = r0.size()
            int r3 = r8.f5359h
            if (r3 != r2) goto Lcf
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = tf.d0.T(r2, r0)
            goto Ldb
        Lcf:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashSet r0 = tf.d0.U(r2, r0)
        Ldb:
            r1.setValue(r0)
            goto L24
        Le0:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            o9.q r1 = (o9.q) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        Lf3:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            aa.a r1 = (aa.a) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L106:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            na.i r1 = (na.i) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r2, r1)
            goto L24
        L119:
            java.lang.Object r0 = r8.f5360i
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r8.f5361j
            db.a r1 = (db.a) r1
            int r2 = r8.f5359h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r1 = r1.f2166a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r2, r1)
            goto L24
        L132:
            java.lang.Object r0 = r8.f5360i
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r8.f5361j
            r6 = r0
            hb.z r6 = (hb.z) r6
            r0 = 59
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            k.s1 r7 = new k.s1
            r0 = 7
            r7.<init>(r0)
            java.lang.String r2 = "设置秒数"
            int r3 = r8.f5359h
            r4 = 0
            wb.y2.a2(r1, r2, r3, r4, r5, r6, r7)
            goto L24
    }
}
