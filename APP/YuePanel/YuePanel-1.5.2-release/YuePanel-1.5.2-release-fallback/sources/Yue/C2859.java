package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2310
public final class C2859 implements java.lang.reflect.GenericArrayType, Yue.InterfaceC6465 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Type f9215;

    public C2859(@Yue.InterfaceC4418 java.lang.reflect.Type r2) {
            r1 = this;
            java.lang.String r0 = "elementType"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f9215 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L16
            java.lang.reflect.Type r0 = r1.getGenericComponentType()
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            boolean r2 = Yue.C3329.m13897(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // java.lang.reflect.GenericArrayType
    @Yue.InterfaceC4418
    public java.lang.reflect.Type getGenericComponentType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f9215
            return r0
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC6465
    @Yue.InterfaceC4418
    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r2.f9215
            java.lang.String r1 = Yue.C6501.m24006(r1)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.getGenericComponentType()
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
