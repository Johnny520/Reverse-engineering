package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i6 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.j1 f16722h;

    public /* synthetic */ i6(i0.j1 r1, int r2) {
            r0 = this;
            r0.f16721g = r2
            r0.f16722h = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r2 = this;
            int r0 = r2.f16721g
            switch(r0) {
                case 0: goto L72;
                case 1: goto L6a;
                case 2: goto L5e;
                case 3: goto L52;
                case 4: goto L3c;
                case 5: goto L35;
                case 6: goto L2e;
                case 7: goto L26;
                case 8: goto L1f;
                case 9: goto L17;
                case 10: goto Lf;
                default: goto L5;
            }
        L5:
            i0.j1 r0 = r2.f16722h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
        Lc:
            sf.n r0 = sf.n.f12433a
            return r0
        Lf:
            i0.j1 r0 = r2.f16722h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto Lc
        L17:
            i0.j1 r0 = r2.f16722h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto Lc
        L1f:
            i0.j1 r0 = r2.f16722h
            r1 = 0
            r0.setValue(r1)
            goto Lc
        L26:
            i0.j1 r0 = r2.f16722h
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            goto Lc
        L2e:
            i0.j1 r0 = r2.f16722h
            r1 = 0
            r0.setValue(r1)
            goto Lc
        L35:
            i0.j1 r0 = r2.f16722h
            r1 = 0
            r0.setValue(r1)
            goto Lc
        L3c:
            i0.j1 r0 = r2.f16722h
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            goto Lc
        L52:
            wb.v2 r0 = new wb.v2
            r1 = 0
            r0.<init>(r1)
            i0.j1 r1 = r2.f16722h
            r1.setValue(r0)
            goto Lc
        L5e:
            wb.u2 r0 = new wb.u2
            r1 = 0
            r0.<init>(r1)
            i0.j1 r1 = r2.f16722h
            r1.setValue(r0)
            goto Lc
        L6a:
            i0.j1 r0 = r2.f16722h
            wb.w2 r1 = wb.w2.f19857a
            r0.setValue(r1)
            goto Lc
        L72:
            i0.j1 r0 = r2.f16722h
            r1 = 0
            r0.setValue(r1)
            goto Lc
    }
}
