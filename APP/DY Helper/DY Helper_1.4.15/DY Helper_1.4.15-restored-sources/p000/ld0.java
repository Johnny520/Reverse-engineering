package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld0 implements android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6560;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f6561;

    public /* synthetic */ ld0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6560 = r1
            r0.f6561 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
            r1 = this;
            int r2 = r1.f6560
            java.lang.Object r1 = r1.f6561
            switch(r2) {
                case 0: goto L5a;
                default: goto L7;
            }
        L7:
            li0 r1 = (p000.li0) r1
            boolean r2 = r1.f6648
            if (r2 != 0) goto L59
            boolean r2 = r1.f6649
            if (r2 == 0) goto L12
            goto L59
        L12:
            java.lang.Object r2 = r1.f6681
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r4, r2)
            xi0 r2 = (p000.xi0) r2
            if (r2 != 0) goto L1d
            goto L59
        L1d:
            boolean r4 = r2.m6673()
            if (r4 != 0) goto L30
            android.app.Activity r1 = r1.f6659
            java.lang.String r2 = "名称尚未解析，暂不能选择"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
            goto L59
        L30:
            r4 = 3
            r3.performHapticFeedback(r4)
            ij0 r3 = r1.f6677
            monitor-enter(r3)
            boolean r4 = r2.m6673()     // Catch: java.lang.Throwable -> L56
            if (r4 != 0) goto L3f
            monitor-exit(r3)
            goto L52
        L3f:
            java.util.LinkedHashSet r4 = r3.f5096     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r2.f12180     // Catch: java.lang.Throwable -> L56
            boolean r4 = r4.remove(r5)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L4a
            goto L51
        L4a:
            java.util.LinkedHashSet r4 = r3.f5096     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = r2.f12180     // Catch: java.lang.Throwable -> L56
            r4.add(r2)     // Catch: java.lang.Throwable -> L56
        L51:
            monitor-exit(r3)
        L52:
            r1.m3575()
            goto L59
        L56:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L56
            throw r1
        L59:
            return
        L5a:
            nd0 r1 = (p000.nd0) r1
            java.util.List r2 = r1.f7532
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r4, r2)
            xd0 r2 = (p000.xd0) r2
            if (r2 != 0) goto L67
            goto Lc8
        L67:
            ad0 r3 = r1.f7528
            ad0 r4 = p000.ad0.f188
            if (r3 != r4) goto L71
            r1.m4026(r2)
            goto Lc8
        L71:
            java.lang.String r3 = r2.f12137
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L81
            java.lang.String r3 = r2.f12133
            java.lang.String r4 = "UID "
            java.lang.String r3 = p000.lz1.m3687(r4, r3)
        L81:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            android.app.Activity r5 = r1.f7534
            r4.<init>(r5)
            java.lang.String r5 = "恢复联系人"
            android.app.AlertDialog$Builder r4 = r4.setTitle(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "恢复显示 "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r6 = "？"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.app.AlertDialog$Builder r4 = r4.setMessage(r5)
            java.lang.String r5 = "取消"
            r6 = 0
            android.app.AlertDialog$Builder r4 = r4.setNegativeButton(r5, r6)
            java.lang.String r5 = "恢复"
            dd0 r6 = new dd0
            r0 = 0
            r6.<init>(r2, r1, r3, r0)
            android.app.AlertDialog$Builder r2 = r4.setPositiveButton(r5, r6)
            android.app.AlertDialog r2 = r2.create()
            ed0 r3 = new ed0
            r4 = 0
            r3.<init>(r1, r2, r4)
            r2.setOnShowListener(r3)
            r2.show()
        Lc8:
            return
    }
}
