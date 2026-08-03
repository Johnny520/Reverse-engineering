package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a implements h6.o {
    public a() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.o
    public final h6.n a(h6.f r3, n6.a r4) {
            r2 = this;
            java.lang.reflect.Type r4 = r4.f9029b
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L15
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto L13
            r1 = r4
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isArray()
            if (r1 != 0) goto L15
        L13:
            r3 = 0
            return r3
        L15:
            if (r0 == 0) goto L1e
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            goto L24
        L1e:
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class r4 = r4.getComponentType()
        L24:
            n6.a r0 = new n6.a
            r0.<init>(r4)
            h6.n r0 = r3.b(r0)
            k6.b r1 = new k6.b
            java.lang.Class r4 = j6.h.f(r4)
            r1.<init>(r3, r0, r4)
            return r1
    }
}
