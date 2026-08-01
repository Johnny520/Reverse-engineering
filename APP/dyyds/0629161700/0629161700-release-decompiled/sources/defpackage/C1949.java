package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1949<T> {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f8475;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f8476;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Type f8477;

    public C1949() {
            r4 = this;
            r4.<init>()
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            java.lang.Class<ᲁᲇᛸᲈ> r3 = defpackage.C1949.class
            if (r1 == 0) goto L45
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            if (r1 != r3) goto L59
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type r0 = defpackage.AbstractC0209.m773(r0)
            java.lang.String r1 = "gson.allowCapturingTypeVariables"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "true"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 != 0) goto L36
            m3364(r0)
        L36:
            r4.f8477 = r0
            java.lang.Class r1 = defpackage.AbstractC0209.m763(r0)
            r4.f8476 = r1
            int r0 = r0.hashCode()
            r4.f8475 = r0
            return
        L45:
            if (r0 != r3) goto L59
            java.lang.String r4 = "type-token-raw"
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee "
            java.lang.String r4 = r0.concat(r4)
            defpackage.C2264.m3676(r4)
            throw r2
        L59:
            java.lang.String r4 = "Must only create direct subclasses of TypeToken"
            defpackage.C2264.m3676(r4)
            throw r2
    }

    public C1949(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type r2 = defpackage.AbstractC0209.m773(r2)
            r1.f8477 = r2
            java.lang.Class r0 = defpackage.AbstractC0209.m763(r2)
            r1.f8476 = r0
            int r2 = r2.hashCode()
            r1.f8475 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3364(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto L60
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L12
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            m3364(r5)
            return
        L12:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getOwnerType()
            if (r0 == 0) goto L22
            m3364(r0)
        L22:
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
        L27:
            if (r1 >= r0) goto L56
            r2 = r5[r1]
            m3364(r2)
            int r1 = r1 + 1
            goto L27
        L31:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L57
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = r5.getLowerBounds()
            int r2 = r0.length
            r3 = r1
        L3d:
            if (r3 >= r2) goto L47
            r4 = r0[r3]
            m3364(r4)
            int r3 = r3 + 1
            goto L3d
        L47:
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            int r0 = r5.length
        L4c:
            if (r1 >= r0) goto L56
            r2 = r5[r1]
            m3364(r2)
            int r1 = r1 + 1
            goto L4c
        L56:
            return
        L57:
            if (r5 == 0) goto L5a
            return
        L5a:
            java.lang.String r5 = "TypeToken captured `null` as type argument; probably a compiler / runtime bug"
            defpackage.C2264.m3684(r5)
            return
        L60:
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TypeToken type argument must not contain a type variable; captured type variable "
            r1.<init>(r2)
            java.lang.String r2 = r5.getName()
            r1.append(r2)
            java.lang.String r2 = " declared by "
            r1.append(r2)
            java.lang.reflect.GenericDeclaration r5 = r5.getGenericDeclaration()
            r1.append(r5)
            java.lang.String r5 = "typetoken-type-variable"
            java.lang.String r2 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r5 = r2.concat(r5)
            java.lang.String r2 = "\nSee "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1949
            if (r0 == 0) goto L12
            ᲁᲇᛸᲈ r2 = (defpackage.C1949) r2
            java.lang.reflect.Type r2 = r2.f8477
            java.lang.reflect.Type r1 = r1.f8477
            boolean r1 = defpackage.AbstractC0209.m779(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f8475
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f8477
            java.lang.String r0 = defpackage.AbstractC0209.m771(r0)
            return r0
    }
}
