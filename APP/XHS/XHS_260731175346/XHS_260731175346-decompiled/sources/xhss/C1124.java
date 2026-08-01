package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1124 implements xhss.InterfaceC0341 {
    public C1124() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r2, xhss.C0032 r3) {
            r1 = this;
            java.lang.reflect.Type r1 = r3.f209
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 != 0) goto L15
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            r0 = r1
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L15
        L13:
            r1 = 0
            return r1
        L15:
            if (r3 == 0) goto L1e
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            goto L24
        L1e:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r1.getComponentType()
        L24:
            xhss.ᛱᛳᲈᛷ r3 = new xhss.ᛱᛳᲈᛷ
            r3.<init>(r1)
            xhss.ᛲᛱᛶᛴ r3 = r2.m1815(r3)
            xhss.ᛲᛵᲈᲁ r0 = new xhss.ᛲᛵᲈᲁ
            java.lang.Class r1 = xhss.C0915.m1501(r1)
            r0.<init>(r2, r3, r1)
            return r0
    }
}
