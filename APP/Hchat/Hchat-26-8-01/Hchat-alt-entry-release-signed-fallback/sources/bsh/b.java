package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f927a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f927a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f927a
            switch(r0) {
                case 0: goto L72;
                case 1: goto L6b;
                case 2: goto L64;
                case 3: goto L5d;
                case 4: goto L56;
                case 5: goto L4d;
                case 6: goto L46;
                case 7: goto L3f;
                case 8: goto L38;
                case 9: goto L2d;
                case 10: goto L26;
                case 11: goto L1f;
                case 12: goto L18;
                case 13: goto L13;
                case 14: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = bsh.StringUtil.a(r2)
            return r2
        Lc:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Object r2 = bsh.Reflect.f(r2)
            return r2
        L13:
            java.lang.String r2 = r2.toString()
            return r2
        L18:
            java.util.List r2 = (java.util.List) r2
            java.util.stream.Stream r2 = bsh.NameSpace.g(r2)
            return r2
        L1f:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Integer r2 = bsh.Invocable.a(r2)
            return r2
        L26:
            char[] r2 = (char[]) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        L2d:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            char[] r2 = java.lang.Character.toChars(r2)
            return r2
        L38:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r2 = bsh.StringUtil.methodString(r2)
            return r2
        L3f:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r2 = bsh.StringUtil.variableString(r2)
            return r2
        L46:
            bsh.BshMethod r2 = (bsh.BshMethod) r2
            java.lang.String r2 = bsh.StringUtil.methodString(r2)
            return r2
        L4d:
            java.lang.String r0 = "    "
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r0.concat(r2)
            return r2
        L56:
            bsh.Variable r2 = (bsh.Variable) r2
            java.lang.String r2 = bsh.StringUtil.variableString(r2)
            return r2
        L5d:
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r2 = bsh.BshMethod.b(r2)
            return r2
        L64:
            java.lang.Class r2 = (java.lang.Class) r2
            bsh.BshClassManager$MemberCache r2 = bsh.BshClassManager.a(r2)
            return r2
        L6b:
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = bsh.BSHType.getTypeDescriptor(r2)
            return r2
        L72:
            bsh.BlockNameSpace$UniqueBlock r2 = (bsh.BlockNameSpace.UniqueBlock) r2
            bsh.BlockNameSpace r2 = bsh.BlockNameSpace.h(r2)
            return r2
    }
}
