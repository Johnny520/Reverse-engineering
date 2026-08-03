package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230a;

    public /* synthetic */ d(int r1) {
            r0 = this;
            r0.f230a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f230a
            r1 = 1
            switch(r0) {
                case 0: goto Lfa;
                case 1: goto Lef;
                case 2: goto Le8;
                case 3: goto Le0;
                case 4: goto Ld9;
                case 5: goto Ld4;
                case 6: goto Lcd;
                case 7: goto Lc4;
                case 8: goto Lbc;
                case 9: goto Lb7;
                case 10: goto Lb2;
                case 11: goto Lab;
                case 12: goto La0;
                case 13: goto L99;
                case 14: goto L8e;
                case 15: goto L74;
                case 16: goto L6c;
                case 17: goto L60;
                case 18: goto L59;
                case 19: goto L52;
                case 20: goto L4b;
                case 21: goto L44;
                case 22: goto L3b;
                case 23: goto L2d;
                case 24: goto L24;
                case 25: goto L1c;
                case 26: goto L17;
                case 27: goto L12;
                case 28: goto Ld;
                default: goto L6;
            }
        L6:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getDeclaringClass()
            return r3
        Ld:
            ud.a r3 = (ud.a) r3
            java.util.List r3 = r3.f13676n
            return r3
        L12:
            ud.a r3 = (ud.a) r3
            java.util.List r3 = r3.f13675m
            return r3
        L17:
            ae.f r3 = (ae.f) r3
            ud.a r3 = r3.f234c
            return r3
        L1c:
            ae.f r3 = (ae.f) r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L24:
            ae.f r3 = (ae.f) r3
            java.util.ArrayList r3 = r3.f235d
            java.util.stream.Stream r3 = r3.stream()
            return r3
        L2d:
            ae.f r3 = (ae.f) r3
            ud.a r3 = r3.f234c
            ud.p r3 = a.a.c0(r3)
            java.util.Objects.requireNonNull(r3)
            qd.r r3 = r3.f13714l
            return r3
        L3b:
            ud.a r3 = (ud.a) r3
            java.util.List r3 = r3.f13676n
            java.util.stream.Stream r3 = r3.stream()
            return r3
        L44:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = bsh.classpath.BshClassPath.canonicalizeClassName(r3)
            return r3
        L4b:
            java.nio.file.Path r3 = (java.nio.file.Path) r3
            java.lang.String r3 = r3.toString()
            return r3
        L52:
            qd.l r3 = (qd.l) r3
            qd.l r3 = r3.H()
            return r3
        L59:
            qd.l r3 = (qd.l) r3
            java.lang.String r3 = r3.X()
            return r3
        L60:
            java.lang.String r3 = (java.lang.String) r3
            qd.g r0 = qd.j.f10868b
            qd.c r0 = new qd.c
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.<init>(r3, r1)
            return r0
        L6c:
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        L74:
            qe.l r3 = (qe.l) r3
            boolean r0 = r3.b()
            if (r0 != 0) goto L89
            boolean r0 = r3.c()
            if (r0 == 0) goto L83
            goto L89
        L83:
            qe.l r0 = qe.l.f10968k
            if (r3 != r0) goto L88
            goto L89
        L88:
            r1 = 0
        L89:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L8e:
            qe.l r3 = (qe.l) r3
            boolean r3 = r3.b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L99:
            qd.s r3 = (qd.s) r3
            qd.j r3 = r3.d()
            return r3
        La0:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            ud.g r3 = (ud.g) r3
            od.c r3 = r3.f13707l
            return r3
        Lab:
            be.r r3 = (be.r) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            return r3
        Lb2:
            be.r r3 = (be.r) r3
            ud.g r3 = r3.f840a
            return r3
        Lb7:
            be.r r3 = (be.r) r3
            ud.g r3 = r3.f840a
            return r3
        Lbc:
            ud.g r3 = (ud.g) r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
        Lc4:
            bc.n r3 = (bc.n) r3
            ud.r r3 = r3.f756a
            od.d r3 = r3.f13717k
            java.lang.String r3 = r3.f9784n
            return r3
        Lcd:
            java.io.File r3 = (java.io.File) r3
            java.nio.file.Path r3 = r3.toPath()
            return r3
        Ld4:
            java.lang.ClassCastException r3 = eh.a.j(r3)
            throw r3
        Ld9:
            java.util.List r3 = (java.util.List) r3
            java.util.stream.Stream r3 = r3.stream()
            return r3
        Le0:
            fc.b r0 = new fc.b
            bc.g r3 = (bc.g) r3
            r0.<init>(r3)
            return r0
        Le8:
            b8.j r3 = (b8.j) r3
            java.util.Iterator r3 = r3.iterator()
            return r3
        Lef:
            ae.h r3 = (ae.h) r3
            int r3 = r3.f243g
            java.lang.String r0 = "#"
            java.lang.String r3 = eh.a.l(r3, r0)
            return r3
        Lfa:
            od.a r3 = (od.a) r3
            java.lang.String r3 = r3.f9766h
            return r3
    }
}
