package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.ToIntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227a;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.f227a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f227a
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L69;
                case 2: goto L60;
                case 3: goto L57;
                case 4: goto L50;
                case 5: goto L43;
                case 6: goto L3c;
                case 7: goto L37;
                case 8: goto L2e;
                case 9: goto L29;
                case 10: goto L22;
                case 11: goto L1d;
                case 12: goto L18;
                case 13: goto L13;
                case 14: goto La;
                default: goto L5;
            }
        L5:
            ud.r r2 = (ud.r) r2
            int r2 = r2.f13721o
            return r2
        La:
            ud.e r2 = (ud.e) r2
            java.util.List r2 = r2.f13697t
            int r2 = r2.size()
            return r2
        L13:
            qd.s r2 = (qd.s) r2
            int r2 = r2.f10926h
            return r2
        L18:
            qd.s r2 = (qd.s) r2
            int r2 = r2.f10925g
            return r2
        L1d:
            ke.l r2 = (ke.l) r2
            int r2 = r2.f7608d
            return r2
        L22:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L29:
            nd.b0 r2 = (nd.b0) r2
            int r2 = r2.f9389i
            return r2
        L2e:
            ed.b r2 = (ed.b) r2
            java.util.Map r2 = r2.f2709d
            int r2 = r2.size()
            return r2
        L37:
            ef.c r2 = (ef.c) r2
            int r2 = r2.f2753a
            return r2
        L3c:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        L43:
            qd.r r2 = (qd.r) r2
            if (r2 == 0) goto L4e
            ud.p r2 = r2.f10903j
            if (r2 == 0) goto L4e
            int r2 = r2.f13716n
            goto L4f
        L4e:
            r2 = -1
        L4f:
            return r2
        L50:
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            int r2 = r2.getLineNumber()
            return r2
        L57:
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            int r2 = r2.size()
            return r2
        L60:
            ae.f r2 = (ae.f) r2
            java.util.ArrayList r2 = r2.f235d
            int r2 = r2.size()
            return r2
        L69:
            nd.b0 r2 = (nd.b0) r2
            int r2 = r2.f9389i
            return r2
        L6e:
            ae.f r2 = (ae.f) r2
            int r2 = r2.f233b
            return r2
    }
}
