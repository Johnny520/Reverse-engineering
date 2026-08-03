package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstMethodHandle extends com.android.dx.rop.cst.TypedConstant {
    public static final int METHOD_HANDLE_TYPE_INSTANCE_GET = 3;
    public static final int METHOD_HANDLE_TYPE_INSTANCE_PUT = 2;
    public static final int METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = 6;
    public static final int METHOD_HANDLE_TYPE_INVOKE_DIRECT = 7;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INSTANCE = 5;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INTERFACE = 8;
    public static final int METHOD_HANDLE_TYPE_INVOKE_STATIC = 4;
    public static final int METHOD_HANDLE_TYPE_STATIC_GET = 1;
    public static final int METHOD_HANDLE_TYPE_STATIC_PUT = 0;
    private static final java.lang.String[] TYPE_NAMES = null;
    private final com.android.dx.rop.cst.Constant ref;
    private final int type;

    static {
            java.lang.String r7 = "invoke-direct"
            java.lang.String r8 = "invoke-interface"
            java.lang.String r0 = "static-put"
            java.lang.String r1 = "static-get"
            java.lang.String r2 = "instance-put"
            java.lang.String r3 = "instance-get"
            java.lang.String r4 = "invoke-static"
            java.lang.String r5 = "invoke-instance"
            java.lang.String r6 = "invoke-constructor"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            com.android.dx.rop.cst.CstMethodHandle.TYPE_NAMES = r0
            return
    }

    private CstMethodHandle(int r1, com.android.dx.rop.cst.Constant r2) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            r0.ref = r2
            return
    }

    public static java.lang.String getMethodHandleTypeName(int r1) {
            java.lang.String[] r0 = com.android.dx.rop.cst.CstMethodHandle.TYPE_NAMES
            r1 = r0[r1]
            return r1
    }

    public static boolean isAccessor(int r2) {
            r0 = 1
            if (r2 == 0) goto Ld
            if (r2 == r0) goto Ld
            r1 = 2
            if (r2 == r1) goto Ld
            r1 = 3
            if (r2 == r1) goto Ld
            r2 = 0
            return r2
        Ld:
            return r0
    }

    public static boolean isInvocation(int r0) {
            switch(r0) {
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 1
            return r0
    }

    public static com.android.dx.rop.cst.CstMethodHandle make(int r2, com.android.dx.rop.cst.Constant r3) {
            boolean r0 = isAccessor(r2)
            java.lang.String r1 = "ref has wrong type: "
            if (r0 == 0) goto L26
            boolean r0 = r3 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r0 == 0) goto Ld
            goto L30
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L26:
            boolean r0 = isInvocation(r2)
            if (r0 == 0) goto L4f
            boolean r0 = r3 instanceof com.android.dx.rop.cst.CstBaseMethodRef
            if (r0 == 0) goto L36
        L30:
            com.android.dx.rop.cst.CstMethodHandle r0 = new com.android.dx.rop.cst.CstMethodHandle
            r0.<init>(r2, r3)
            return r0
        L36:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L4f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "type is out of range: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r3) {
            r2 = this;
            com.android.dx.rop.cst.CstMethodHandle r3 = (com.android.dx.rop.cst.CstMethodHandle) r3
            int r0 = r2.getMethodHandleType()
            int r1 = r3.getMethodHandleType()
            if (r0 != r1) goto L19
            com.android.dx.rop.cst.Constant r0 = r2.getRef()
            com.android.dx.rop.cst.Constant r3 = r3.getRef()
            int r3 = r0.compareTo2(r3)
            return r3
        L19:
            int r0 = r2.getMethodHandleType()
            int r3 = r3.getMethodHandleType()
            int r3 = java.lang.Integer.compare(r0, r3)
            return r3
    }

    public int getMethodHandleType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }

    public com.android.dx.rop.cst.Constant getRef() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.ref
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.METHOD_HANDLE
            return r0
    }

    public boolean isAccessor() {
            r1 = this;
            int r0 = r1.type
            boolean r0 = isAccessor(r0)
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isInvocation() {
            r1 = this;
            int r0 = r1.type
            boolean r0 = isInvocation(r0)
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.type
            java.lang.String r1 = getMethodHandleTypeName(r1)
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            com.android.dx.rop.cst.Constant r1 = r2.ref
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "method-handle{"
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "method handle"
            return r0
    }
}
