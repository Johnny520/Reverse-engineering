package com.android.p001dx.rop.cst;

import com.android.p001dx.rop.type.Type;

/* JADX INFO: loaded from: classes.dex */
public final class CstMethodHandle extends TypedConstant {
    public static final int METHOD_HANDLE_TYPE_INSTANCE_GET = 3;
    public static final int METHOD_HANDLE_TYPE_INSTANCE_PUT = 2;
    public static final int METHOD_HANDLE_TYPE_INVOKE_CONSTRUCTOR = 6;
    public static final int METHOD_HANDLE_TYPE_INVOKE_DIRECT = 7;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INSTANCE = 5;
    public static final int METHOD_HANDLE_TYPE_INVOKE_INTERFACE = 8;
    public static final int METHOD_HANDLE_TYPE_INVOKE_STATIC = 4;
    public static final int METHOD_HANDLE_TYPE_STATIC_GET = 1;
    public static final int METHOD_HANDLE_TYPE_STATIC_PUT = 0;
    private static final String[] TYPE_NAMES = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};
    private final Constant ref;
    private final int type;

    private CstMethodHandle(int i, Constant constant) {
        this.type = i;
        this.ref = constant;
    }

    public static String getMethodHandleTypeName(int i) {
        return TYPE_NAMES[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isAccessor(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isInvocation(int i) {
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static CstMethodHandle make(int i, Constant constant) {
        if (isAccessor(i)) {
            if (!(constant instanceof CstFieldRef)) {
                throw new IllegalArgumentException("ref has wrong type: " + constant.getClass());
            }
        } else {
            if (!isInvocation(i)) {
                throw new IllegalArgumentException("type is out of range: " + i);
            }
            if (!(constant instanceof CstBaseMethodRef)) {
                throw new IllegalArgumentException("ref has wrong type: " + constant.getClass());
            }
        }
        return new CstMethodHandle(i, constant);
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstMethodHandle cstMethodHandle = (CstMethodHandle) constant;
        return getMethodHandleType() == cstMethodHandle.getMethodHandleType() ? getRef().compareTo(cstMethodHandle.getRef()) : Integer.compare(getMethodHandleType(), cstMethodHandle.getMethodHandleType());
    }

    public int getMethodHandleType() {
        return this.type;
    }

    public Constant getRef() {
        return this.ref;
    }

    @Override // com.android.p001dx.rop.type.TypeBearer
    public Type getType() {
        return Type.METHOD_HANDLE;
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p001dx.util.ToHuman
    public String toHuman() {
        return getMethodHandleTypeName(this.type) + "," + this.ref.toString();
    }

    public String toString() {
        return "method-handle{" + toHuman() + "}";
    }

    @Override // com.android.p001dx.rop.cst.Constant
    public String typeName() {
        return "method handle";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean isAccessor() {
        return isAccessor(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public boolean isInvocation() {
        return isInvocation(this.type);
    }
}
