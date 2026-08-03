package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n1549#2:231\n1620#2,3:232\n37#3,2:235\n26#4:237\n26#4:238\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypeVariableImpl\n*L\n116#1:231\n116#1:232,3\n116#1:235,2\n134#1:237\n137#1:238\n*E\n"})
@Yue.InterfaceC2310
public final class C6475 implements java.lang.reflect.TypeVariable<java.lang.reflect.GenericDeclaration>, Yue.InterfaceC6465 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC3476 f22784;

    public C6475(@Yue.InterfaceC4418 Yue.InterfaceC3476 r2) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f22784 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.getName()
            java.lang.reflect.TypeVariable r3 = (java.lang.reflect.TypeVariable) r3
            java.lang.String r1 = r3.getName()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.GenericDeclaration r0 = r2.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r3.getGenericDeclaration()
            boolean r3 = Yue.C3329.m13897(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Override // java.lang.reflect.TypeVariable
    @Yue.InterfaceC4418
    public java.lang.reflect.Type[] getBounds() {
            r4 = this;
            Yue.ۥ۠ۦۤۥ r0 = r4.f22784
            java.util.List r0 = r0.getUpperBounds()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = Yue.C1210.m6231(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠ۦۣۤ r2 = (Yue.InterfaceC3473) r2
            r3 = 1
            java.lang.reflect.Type r2 = Yue.C6501.m24005(r2, r3)
            r1.add(r2)
            goto L15
        L2a:
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    @Override // java.lang.reflect.TypeVariable
    @Yue.InterfaceC4418
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getGenericDeclaration() is not yet supported for type variables created from KType: "
            r0.append(r1)
            Yue.ۥ۠ۦۤۥ r1 = r4.f22784
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            Yue.ۥۡۢۥ۟ r1 = new Yue.ۥۡۢۥ۟
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "An operation is not implemented: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.reflect.TypeVariable
    @Yue.InterfaceC4418
    public java.lang.String getName() {
            r1 = this;
            Yue.ۥ۠ۦۤۥ r0 = r1.f22784
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC6465
    @Yue.InterfaceC4418
    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.getName()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            int r0 = r0.hashCode()
            java.lang.reflect.GenericDeclaration r1 = r2.getGenericDeclaration()
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final <T extends java.lang.annotation.Annotation> T m23867(@Yue.InterfaceC4418 java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "annotationClass"
            Yue.C3329.m13906(r2, r0)
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.annotation.Annotation[] m23868() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.annotation.Annotation[] m23869() {
            r1 = this;
            r0 = 0
            java.lang.annotation.Annotation[] r0 = new java.lang.annotation.Annotation[r0]
            return r0
    }
}
