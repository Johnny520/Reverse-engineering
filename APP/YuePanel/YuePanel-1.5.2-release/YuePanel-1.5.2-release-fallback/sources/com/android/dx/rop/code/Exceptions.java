package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class Exceptions {
    public static final com.android.dx.rop.type.StdTypeList LIST_Error = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_ArithmeticException = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_ClassCastException = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_NegativeArraySizeException = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_NullPointerException = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_Null_ArrayIndexOutOfBounds = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_Null_ArrayIndex_ArrayStore = null;
    public static final com.android.dx.rop.type.StdTypeList LIST_Error_Null_IllegalMonitorStateException = null;
    public static final com.android.dx.rop.type.Type TYPE_ArithmeticException = null;
    public static final com.android.dx.rop.type.Type TYPE_ArrayIndexOutOfBoundsException = null;
    public static final com.android.dx.rop.type.Type TYPE_ArrayStoreException = null;
    public static final com.android.dx.rop.type.Type TYPE_ClassCastException = null;
    public static final com.android.dx.rop.type.Type TYPE_Error = null;
    public static final com.android.dx.rop.type.Type TYPE_IllegalMonitorStateException = null;
    public static final com.android.dx.rop.type.Type TYPE_NegativeArraySizeException = null;
    public static final com.android.dx.rop.type.Type TYPE_NullPointerException = null;

    static {
            java.lang.String r0 = "Ljava/lang/ArithmeticException;"
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            com.android.dx.rop.code.Exceptions.TYPE_ArithmeticException = r0
            java.lang.String r1 = "Ljava/lang/ArrayIndexOutOfBoundsException;"
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.intern(r1)
            com.android.dx.rop.code.Exceptions.TYPE_ArrayIndexOutOfBoundsException = r1
            java.lang.String r2 = "Ljava/lang/ArrayStoreException;"
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.intern(r2)
            com.android.dx.rop.code.Exceptions.TYPE_ArrayStoreException = r2
            java.lang.String r3 = "Ljava/lang/ClassCastException;"
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.intern(r3)
            com.android.dx.rop.code.Exceptions.TYPE_ClassCastException = r3
            java.lang.String r4 = "Ljava/lang/Error;"
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.intern(r4)
            com.android.dx.rop.code.Exceptions.TYPE_Error = r4
            java.lang.String r5 = "Ljava/lang/IllegalMonitorStateException;"
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.intern(r5)
            com.android.dx.rop.code.Exceptions.TYPE_IllegalMonitorStateException = r5
            java.lang.String r6 = "Ljava/lang/NegativeArraySizeException;"
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.intern(r6)
            com.android.dx.rop.code.Exceptions.TYPE_NegativeArraySizeException = r6
            java.lang.String r7 = "Ljava/lang/NullPointerException;"
            com.android.dx.rop.type.Type r7 = com.android.dx.rop.type.Type.intern(r7)
            com.android.dx.rop.code.Exceptions.TYPE_NullPointerException = r7
            com.android.dx.rop.type.StdTypeList r8 = com.android.dx.rop.type.StdTypeList.make(r4)
            com.android.dx.rop.code.Exceptions.LIST_Error = r8
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r0)
            com.android.dx.rop.code.Exceptions.LIST_Error_ArithmeticException = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r3)
            com.android.dx.rop.code.Exceptions.LIST_Error_ClassCastException = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r6)
            com.android.dx.rop.code.Exceptions.LIST_Error_NegativeArraySizeException = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r7)
            com.android.dx.rop.code.Exceptions.LIST_Error_NullPointerException = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r7, r1)
            com.android.dx.rop.code.Exceptions.LIST_Error_Null_ArrayIndexOutOfBounds = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r7, r1, r2)
            com.android.dx.rop.code.Exceptions.LIST_Error_Null_ArrayIndex_ArrayStore = r0
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.make(r4, r7, r5)
            com.android.dx.rop.code.Exceptions.LIST_Error_Null_IllegalMonitorStateException = r0
            return
    }

    private Exceptions() {
            r0 = this;
            r0.<init>()
            return
    }
}
