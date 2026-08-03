package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
public class C0584 {
    public C0584() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T[] m2097(@Yue.InterfaceC4418 T[] r1, int r2) {
            java.lang.String r0 = "reference"
            Yue.C3329.m13906(r1, r0)
            java.lang.Class r1 = r1.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>"
            Yue.C3329.m13904(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC3421(name = "contentDeepHashCode")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final <T> int m2098(@Yue.InterfaceC4543 T[] r0) {
            int r0 = java.util.Arrays.deepHashCode(r0)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m2099(int r3, int r4) {
            if (r3 > r4) goto L3
            return
        L3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "toIndex ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") is greater than size ("
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ")."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ <T> T[] m2100(T[] r1) {
            if (r1 != 0) goto La
            java.lang.String r1 = "T?"
            r0 = 0
            Yue.C3329.m13915(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
        La:
            return r1
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m2101(byte[] r1, java.nio.charset.Charset r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ <T> T[] m2102(java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "T?"
            r1 = 0
            Yue.C3329.m13915(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r2.toArray(r0)
            return r2
    }
}
