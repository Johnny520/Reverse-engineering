package defpackage;

/* JADX INFO: renamed from: ᛵᲀᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0963 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1380 f4271;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4272;

    public /* synthetic */ C0963(defpackage.C1380 r1, int r2) {
            r0 = this;
            r0.f4272 = r2
            r0.f4271 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f4272
            java.lang.Class<ᛶᛲᲇ> r1 = defpackage.C1027.class
            r2 = 0
            r3 = 0
            r4 = 1
            ᛷᲇᛱᲈ r10 = r10.f4271
            switch(r0) {
                case 0: goto L28f;
                case 1: goto L226;
                case 2: goto L214;
                case 3: goto L1af;
                case 4: goto L1a5;
                case 5: goto L19b;
                case 6: goto L191;
                case 7: goto L143;
                case 8: goto L139;
                case 9: goto L12f;
                case 10: goto L125;
                case 11: goto L11b;
                case 12: goto L111;
                case 13: goto Lbf;
                case 14: goto L6e;
                case 15: goto L48;
                case 16: goto L21;
                default: goto Lc;
            }
        Lc:
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            java.lang.Class r12 = r12.getType()
            java.lang.String r0 = "Field: type"
            java.lang.Class r10 = defpackage.AbstractC0849.m1782(r11, r10, r0)
            boolean r10 = defpackage.AbstractC0498.m1280(r12, r10)
        L1c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L21:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Member r12 = (java.lang.reflect.Member) r12
            java.lang.annotation.Annotation[] r12 = defpackage.AbstractC0849.m1792(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
        L30:
            if (r3 >= r1) goto L42
            r2 = r12[r3]
            ᛲᲀᲈᛳ r2 = defpackage.AbstractC1533.m2778(r2)
            java.lang.Class r2 = r2.mo1084()
            r0.add(r2)
            int r3 = r3 + 1
            goto L30
        L42:
            boolean r10 = defpackage.AbstractC0849.m1785(r11, r0, r10)
            r10 = r10 ^ r4
            goto L1c
        L48:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Member r12 = (java.lang.reflect.Member) r12
            java.lang.annotation.Annotation[] r12 = defpackage.AbstractC0849.m1792(r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
        L57:
            if (r3 >= r1) goto L69
            r2 = r12[r3]
            ᛲᲀᲈᛳ r2 = defpackage.AbstractC1533.m2778(r2)
            java.lang.Class r2 = r2.mo1084()
            r0.add(r2)
            int r3 = r3 + 1
            goto L57
        L69:
            boolean r10 = defpackage.AbstractC0849.m1785(r11, r0, r10)
            goto L1c
        L6e:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.Class[] r12 = r12.getExceptionTypes()
            java.util.List r12 = defpackage.AbstractC2315.m3771(r12)
            int r0 = r11.size()
            int r5 = r12.size()
            if (r0 == r5) goto L85
            goto Lbb
        L85:
            java.util.Iterator r11 = r11.iterator()
            r0 = r3
        L8a:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r11.next()
            int r6 = r0 + 1
            java.lang.Object r0 = r12.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r5 = defpackage.AbstractC0849.m1782(r5, r10, r2)
            ᛲᲀᲈᛳ r7 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r7 = defpackage.AbstractC1533.m2785(r7)
            if (r7 != 0) goto Lab
            r7 = r1
        Lab:
            boolean r7 = defpackage.AbstractC0498.m1280(r5, r7)
            if (r7 != 0) goto Lb8
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r5)
            if (r0 != 0) goto Lb8
            goto Lbb
        Lb8:
            r0 = r6
            goto L8a
        Lba:
            r3 = r4
        Lbb:
            r10 = r3 ^ 1
            goto L1c
        Lbf:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.Class[] r12 = r12.getExceptionTypes()
            java.util.List r12 = defpackage.AbstractC2315.m3771(r12)
            int r0 = r11.size()
            int r5 = r12.size()
            if (r0 == r5) goto Ld6
            goto L10c
        Ld6:
            java.util.Iterator r11 = r11.iterator()
            r0 = r3
        Ldb:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L10b
            java.lang.Object r5 = r11.next()
            int r6 = r0 + 1
            java.lang.Object r0 = r12.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r5 = defpackage.AbstractC0849.m1782(r5, r10, r2)
            ᛲᲀᲈᛳ r7 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r7 = defpackage.AbstractC1533.m2785(r7)
            if (r7 != 0) goto Lfc
            r7 = r1
        Lfc:
            boolean r7 = defpackage.AbstractC0498.m1280(r5, r7)
            if (r7 != 0) goto L109
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r5)
            if (r0 != 0) goto L109
            goto L10c
        L109:
            r0 = r6
            goto Ldb
        L10b:
            r3 = r4
        L10c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L111:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1783(r10, r11, r12)
            goto L1c
        L11b:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1791(r10, r11, r12)
            goto L1c
        L125:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1786(r10, r11, r12)
            goto L1c
        L12f:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1780(r10, r11, r12)
            goto L1c
        L139:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1779(r10, r11, r12)
            goto L1c
        L143:
            java.util.List r11 = (java.util.List) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.Class[] r12 = r12.getParameterTypes()
            java.util.List r12 = defpackage.AbstractC2315.m3771(r12)
            int r0 = r11.size()
            int r5 = r12.size()
            if (r0 == r5) goto L15b
            goto Lbb
        L15b:
            java.util.Iterator r11 = r11.iterator()
            r0 = r3
        L160:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r11.next()
            int r6 = r0 + 1
            java.lang.Object r0 = r12.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r5 = defpackage.AbstractC0849.m1782(r5, r10, r2)
            ᛲᲀᲈᛳ r7 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r7 = defpackage.AbstractC1533.m2785(r7)
            if (r7 != 0) goto L181
            r7 = r1
        L181:
            boolean r7 = defpackage.AbstractC0498.m1280(r5, r7)
            if (r7 != 0) goto L18f
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r5)
            if (r0 != 0) goto L18f
            goto Lbb
        L18f:
            r0 = r6
            goto L160
        L191:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1790(r10, r11, r12)
            goto L1c
        L19b:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1781(r10, r11, r12)
            goto L1c
        L1a5:
            java.util.Set r11 = (java.util.Set) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            boolean r10 = defpackage.AbstractC0849.m1778(r10, r11, r12)
            goto L1c
        L1af:
            java.util.List r11 = (java.util.List) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.annotation.Annotation[][] r12 = r12.getParameterAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
            r2 = r3
        L1bf:
            if (r2 >= r1) goto L1e5
            r5 = r12[r2]
            java.lang.annotation.Annotation[] r5 = (java.lang.annotation.Annotation[]) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.length
            r6.<init>(r7)
            int r7 = r5.length
            r8 = r3
        L1cd:
            if (r8 >= r7) goto L1df
            r9 = r5[r8]
            ᛲᲀᲈᛳ r9 = defpackage.AbstractC1533.m2778(r9)
            java.lang.Class r9 = r9.mo1084()
            r6.add(r9)
            int r8 = r8 + 1
            goto L1cd
        L1df:
            r0.add(r6)
            int r2 = r2 + 1
            goto L1bf
        L1e5:
            int r12 = r11.size()
            int r1 = r0.size()
            if (r12 == r1) goto L1f1
            goto Lbb
        L1f1:
            java.util.Iterator r11 = r11.iterator()
            r12 = r3
        L1f6:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r11.next()
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r12 + 1
            java.lang.Object r12 = r0.get(r12)
            java.util.List r12 = (java.util.List) r12
            boolean r12 = defpackage.AbstractC0849.m1785(r1, r12, r10)
            if (r12 != 0) goto L212
            goto Lbb
        L212:
            r12 = r2
            goto L1f6
        L214:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.Class r12 = r12.getReturnType()
            java.lang.String r0 = "Method: returnType"
            java.lang.Class r10 = defpackage.AbstractC0849.m1782(r11, r10, r0)
            boolean r10 = defpackage.AbstractC0498.m1280(r12, r10)
            goto L1c
        L226:
            java.util.List r11 = (java.util.List) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.annotation.Annotation[][] r12 = r12.getParameterAnnotations()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
            r2 = r3
        L236:
            if (r2 >= r1) goto L25c
            r5 = r12[r2]
            java.lang.annotation.Annotation[] r5 = (java.lang.annotation.Annotation[]) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.length
            r6.<init>(r7)
            int r7 = r5.length
            r8 = r3
        L244:
            if (r8 >= r7) goto L256
            r9 = r5[r8]
            ᛲᲀᲈᛳ r9 = defpackage.AbstractC1533.m2778(r9)
            java.lang.Class r9 = r9.mo1084()
            r6.add(r9)
            int r8 = r8 + 1
            goto L244
        L256:
            r0.add(r6)
            int r2 = r2 + 1
            goto L236
        L25c:
            int r12 = r11.size()
            int r1 = r0.size()
            if (r12 == r1) goto L267
            goto L28a
        L267:
            java.util.Iterator r11 = r11.iterator()
            r12 = r3
        L26c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L289
            java.lang.Object r1 = r11.next()
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r12 + 1
            java.lang.Object r12 = r0.get(r12)
            java.util.List r12 = (java.util.List) r12
            boolean r12 = defpackage.AbstractC0849.m1785(r1, r12, r10)
            if (r12 != 0) goto L287
            goto L28a
        L287:
            r12 = r2
            goto L26c
        L289:
            r3 = r4
        L28a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
        L28f:
            java.util.List r11 = (java.util.List) r11
            java.lang.reflect.Executable r12 = (java.lang.reflect.Executable) r12
            java.lang.Class[] r12 = r12.getParameterTypes()
            java.util.List r12 = defpackage.AbstractC2315.m3771(r12)
            int r0 = r11.size()
            int r5 = r12.size()
            if (r0 == r5) goto L2a6
            goto L2dc
        L2a6:
            java.util.Iterator r11 = r11.iterator()
            r0 = r3
        L2ab:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L2db
            java.lang.Object r5 = r11.next()
            int r6 = r0 + 1
            java.lang.Object r0 = r12.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r5 = defpackage.AbstractC0849.m1782(r5, r10, r2)
            ᛲᲀᲈᛳ r7 = defpackage.AbstractC1168.m2249(r1)
            java.lang.Class r7 = defpackage.AbstractC1533.m2785(r7)
            if (r7 != 0) goto L2cc
            r7 = r1
        L2cc:
            boolean r7 = defpackage.AbstractC0498.m1280(r5, r7)
            if (r7 != 0) goto L2d9
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r5)
            if (r0 != 0) goto L2d9
            goto L2dc
        L2d9:
            r0 = r6
            goto L2ab
        L2db:
            r3 = r4
        L2dc:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            return r10
    }
}
