package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛱᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0836 implements xhss.InterfaceC0979, xhss.InterfaceC0901 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2717;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2718;

    public native /* synthetic */ C0836(java.lang.String r1, xhss.C1191 r2);

    public /* synthetic */ C0836(java.lang.reflect.GenericDeclaration r1, int r2) {
            r0 = this;
            r0.f2717 = r2
            r0.f2718 = r1
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0979
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public java.lang.Object mo964() {
            r5 = this;
            int r0 = r5.f2717
            java.lang.Object r5 = r5.f2718
            switch(r0) {
                case 0: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Class r5 = (java.lang.Class) r5
            xhss.ᲇᛴᛲᲁ r0 = xhss.AbstractC1029.f3332     // Catch: java.lang.Exception -> L10
            java.lang.Object r5 = r0.mo621(r5)     // Catch: java.lang.Exception -> L10
            return r5
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create instance of "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L2a:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r0 = "' with no args"
            java.lang.String r1 = "Failed to invoke constructor '"
            r2 = 0
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L41 java.lang.InstantiationException -> L5f
            return r5
        L36:
            r5 = move-exception
            xhss.ᲈᲀᲀᛱ r0 = xhss.AbstractC1031.f3335
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r0.<init>(r1, r5)
            throw r0
        L41:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = xhss.AbstractC1031.m1676(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r0 = r2.getCause()
            r3.<init>(r5, r0)
            throw r3
        L5f:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = xhss.AbstractC1031.m1676(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
    }

    @Override // xhss.InterfaceC0901
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public void mo965(com.kongzue.dialogx.interfaces.AbstractC0001 r6) {
            r5 = this;
            java.lang.Object r5 = r5.f2718
            java.lang.String r5 = (java.lang.String) r5
            xhss.ᛱᛴᛳᛴ r6 = (xhss.C0036) r6
            int r6 = xhss.C1191.f3845
            r0 = 0
            if (r6 <= 0) goto L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = -348129035913285(0xfffec360e47a77bb, double:NaN)
            java.lang.String r2 = "刷新提示期间合并重复触发: "
            r1.<init>(r2)
            java.lang.String r2 = xhss.C1191.f3843
            if (r2 != 0) goto L1e
            goto L1f
        L1e:
            r5 = r2
        L1f:
            r1.append(r5)
            r2 = -348193460422725(0xfffec351e47a77bb, double:NaN)
            java.lang.String r5 = ", "
            r1.append(r5)
            r1.append(r6)
            r5 = -348206345324613(0xfffec34ee47a77bb, double:NaN)
            java.lang.String r5 = " 次"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = -278078119315525(0xffff0316e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            int r6 = r5.length()
            if (r6 != 0) goto L58
            goto L7a
        L58:
            int r6 = r5.length()
            r1 = r0
        L5d:
            if (r1 >= r6) goto L7a
            int r2 = r1 + 2000
            if (r2 <= r6) goto L64
            r2 = r6
        L64:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -278112479053893(0xffff030ee47a77bb, double:NaN)
        /* removed unused decoded string */ 
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497
            r3.getClass()
            xhss.C1085.m1750(r1)
            r1 = r2
            goto L5d
        L7a:
            xhss.C1191.f3839 = r0
            r5 = 0
            xhss.C1191.f3843 = r5
            xhss.C1191.f3845 = r0
            return
    }
}
