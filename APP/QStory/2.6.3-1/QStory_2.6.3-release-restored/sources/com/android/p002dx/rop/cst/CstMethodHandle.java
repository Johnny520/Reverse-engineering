package com.android.p002dx.rop.cst;

import com.android.p002dx.rop.type.Type;
import p025.AbstractC7012;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    public static boolean isAccessor(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

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
                C8376.m13323(constant.getClass(), "ref has wrong type: ");
                return null;
            }
        } else {
            if (!isInvocation(i)) {
                C6755.m11869(AbstractC7012.m12147(i, "type is out of range: "));
                return null;
            }
            if (!(constant instanceof CstBaseMethodRef)) {
                C8376.m13323(constant.getClass(), "ref has wrong type: ");
                return null;
            }
        }
        return new CstMethodHandle(i, constant);
    }

    @Override // com.android.p002dx.rop.cst.Constant
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

    @Override // com.android.p002dx.rop.type.TypeBearer
    public Type getType() {
        return Type.METHOD_HANDLE;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return getMethodHandleTypeName(this.type) + "," + this.ref.toString();
    }

    public String toString() {
        return "method-handle{" + toHuman() + "}";
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "method handle";
    }

    public boolean isInvocation() {
        return isInvocation(this.type);
    }

    public boolean isAccessor() {
        return isAccessor(this.type);
    }
}
