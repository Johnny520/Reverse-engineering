package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0160 implements defpackage.InterfaceC1405 {
    public C0160() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r2, defpackage.C1949 r3) {
            r1 = this;
            java.lang.reflect.Type r1 = r3.f8477
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
            ᲁᲇᛸᲈ r3 = new ᲁᲇᛸᲈ
            r3.<init>(r1)
            ᛴᲀᲈᛴ r3 = r2.m3367(r3)
            ᛱᲁᛶᲈ r0 = new ᛱᲁᛶᲈ
            java.lang.Class r1 = defpackage.AbstractC0209.m763(r1)
            r0.<init>(r2, r3, r1)
            return r0
    }
}
