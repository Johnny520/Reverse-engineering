package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1880a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f1880a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f1880a
            switch(r0) {
                case 0: goto Le3;
                case 1: goto Ldc;
                case 2: goto Ld5;
                case 3: goto Lce;
                case 4: goto Lc7;
                case 5: goto Lc0;
                case 6: goto Lb9;
                case 7: goto Lb2;
                case 8: goto Lab;
                case 9: goto La4;
                case 10: goto La1;
                case 11: goto L99;
                case 12: goto L94;
                case 13: goto L8f;
                case 14: goto L8a;
                case 15: goto L82;
                case 16: goto L79;
                case 17: goto L70;
                case 18: goto L68;
                case 19: goto L61;
                case 20: goto L5a;
                case 21: goto L4d;
                case 22: goto L48;
                case 23: goto L41;
                case 24: goto L3a;
                case 25: goto L32;
                case 26: goto L29;
                case 27: goto L20;
                case 28: goto L17;
                default: goto L5;
            }
        L5:
            m7.j r2 = (m7.j) r2
            r0 = 16842755(0x1010003, float:2.3693566E-38)
            m7.c r2 = r2.X(r0)
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.S()
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
        L17:
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 1
            r2.<init>(r0)
            return r2
        L20:
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 2
            r2.<init>(r0)
            return r2
        L29:
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            java.util.stream.Stream r2 = r2.stream()
            return r2
        L32:
            java.lang.String r2 = (java.lang.String) r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            return r2
        L3a:
            nc.a r2 = (nc.a) r2
            java.lang.Object r2 = r2.f9342h
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L41:
            java.nio.file.Path r2 = (java.nio.file.Path) r2
            java.io.File r2 = r2.toFile()
            return r2
        L48:
            ud.r r2 = (ud.r) r2
            ud.e r2 = r2.f13718l
            return r2
        L4d:
            ud.m r2 = (ud.m) r2
            od.d r2 = r2.q()
            od.a r2 = r2.f9780j
            java.lang.String r2 = r2.f()
            return r2
        L5a:
            od.a r2 = (od.a) r2
            java.lang.String r2 = r2.k()
            return r2
        L61:
            od.a r2 = (od.a) r2
            java.lang.String r2 = r2.f()
            return r2
        L68:
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            return r2
        L70:
            ud.a r2 = (ud.a) r2
            java.util.List r2 = r2.f13675m
            java.util.stream.Stream r2 = r2.stream()
            return r2
        L79:
            ud.p r2 = (ud.p) r2
            pd.k r2 = r2.f13713k
            java.lang.String r2 = r2.toString()
            return r2
        L82:
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
        L8a:
            ef.c r2 = (ef.c) r2
            java.lang.String r2 = r2.f2756d
            return r2
        L8f:
            ef.c r2 = (ef.c) r2
            java.lang.String r2 = r2.f2755c
            return r2
        L94:
            ef.c r2 = (ef.c) r2
            java.lang.String r2 = r2.f2757e
            return r2
        L99:
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        La1:
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        La4:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
            return r2
        Lab:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r2 = r2.getName()
            return r2
        Lb2:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getDeclaringClass()
            return r2
        Lb9:
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            java.lang.String r2 = r2.getMethodName()
            return r2
        Lc0:
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            java.lang.String r2 = r2.getClassName()
            return r2
        Lc7:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getRawType()
            return r2
        Lce:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getOwnerType()
            return r2
        Ld5:
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            java.lang.String r2 = r2.getFileName()
            return r2
        Ldc:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            return r2
        Le3:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r2 = r2.getName()
            return r2
    }
}
