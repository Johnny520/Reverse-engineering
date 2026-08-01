package bsh;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1178g extends AbstractC1195i4 implements InterfaceC1230o3 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: y */
    public Integer f3554y;

    public C1178g(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: k */
    public final Object m4325k(Object obj, Object obj2, int i10) throws C1279w4 {
        if ((obj instanceof String) || obj.getClass().isArray()) {
            return AbstractC1200j3.m4441a(obj, obj2, i10);
        }
        if (obj2 == Primitive.NULL) {
            throw new C1279w4("Illegal use of null object or 'null' literal");
        }
        if (((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof Primitive)) && ((obj2 instanceof Boolean) || (obj2 instanceof Character) || (obj2 instanceof Number) || (obj2 instanceof Primitive))) {
            return AbstractC1200j3.m4446f(obj, obj2, i10);
        }
        StringBuilder sb2 = new StringBuilder("Non primitive value in operator: ");
        sb2.append(obj.getClass());
        String str = InterfaceC1230o3.f3729d[i10];
        Class<?> cls = obj2.getClass();
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(cls);
        throw new C1279w4(sb2.toString());
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        Object objM5101d;
        if (this.f3554y == null) {
            try {
                return mo4051s(0).mo4048p(c1174f1, runnableC1205k2);
            } catch (C1183g4 unused) {
                return Primitive.NULL;
            }
        }
        C1133b0 c1133b0 = (C1133b0) mo4051s(0);
        boolean zM4499v = runnableC1205k2.m4499v();
        C1265u2 c1265u2M4105v = c1133b0.m4105v(c1174f1, runnableC1205k2);
        if (this.f3554y.intValue() != 84) {
            try {
                objM5101d = c1265u2M4105v.m5101d();
            } catch (C1279w4 e10) {
                throw e10.mo5167a(this, c1174f1);
            }
        } else {
            objM5101d = null;
        }
        if (this.f3554y.intValue() == 145 && Primitive.NULL != objM5101d) {
            return objM5101d;
        }
        Object objMo4048p = mo4051s(1).mo4048p(c1174f1, runnableC1205k2);
        if (objMo4048p == Primitive.VOID) {
            throw new C1169e2("illegal void assignment", this, c1174f1);
        }
        try {
            int iIntValue = this.f3554y.intValue();
            if (iIntValue == 84) {
                if (!c1265u2M4105v.m5104g()) {
                    return c1265u2M4105v.m5099b(objMo4048p, zM4499v);
                }
                c1265u2M4105v.m5103f().m5229k(objMo4048p, 1);
                return objMo4048p;
            }
            if (iIntValue == 145) {
                return c1265u2M4105v.m5099b(objMo4048p, zM4499v);
            }
            switch (iIntValue) {
                case Opcodes.LSHR /* 123 */:
                    if (Primitive.NULL == objM5101d && c1265u2M4105v.m5100c() == String.class) {
                        objM5101d = "null";
                    }
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, HttpStatusCodesKt.HTTP_EARLY_HINTS), zM4499v);
                case Opcodes.IUSHR /* 124 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.IMUL), zM4499v);
                case Opcodes.LUSHR /* 125 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.LMUL), zM4499v);
                case 126:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, 106), zM4499v);
                case 127:
                case 128:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, 107), zM4499v);
                case Opcodes.LOR /* 129 */:
                case Opcodes.IXOR /* 130 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.LDIV), zM4499v);
                case Opcodes.LXOR /* 131 */:
                case Opcodes.IINC /* 132 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, 111), zM4499v);
                case Opcodes.I2L /* 133 */:
                case Opcodes.I2F /* 134 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.LREM), zM4499v);
                case Opcodes.I2D /* 135 */:
                case Opcodes.L2I /* 136 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, 115), zM4499v);
                case 137:
                case 138:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.LNEG), zM4499v);
                case Opcodes.F2I /* 139 */:
                case Opcodes.F2L /* 140 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.DNEG), zM4499v);
                case 141:
                case Opcodes.D2I /* 142 */:
                    return c1265u2M4105v.m5099b(m4325k(objM5101d, objMo4048p, Opcodes.LSHL), zM4499v);
                default:
                    throw new C1211l2("unimplemented operator in assignment BSH");
            }
        } catch (C1279w4 e11) {
            throw e11.mo5167a(this, c1174f1);
        }
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.f3554y == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str = ": " + InterfaceC1230o3.f3729d[this.f3554y.intValue()];
        }
        sb2.append(str);
        return sb2.toString();
    }
}
