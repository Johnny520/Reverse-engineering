package p112hb;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2706r0;

/* JADX INFO: renamed from: hb.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2965x {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10962a(int i10) {
        String str = (i10 == 7 || i10 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 10) ? 2 : 3];
        switch (i10) {
            case 1:
            case 3:
            case Opcodes.LDC /* 18 */:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case Opcodes.SIPUSH /* 17 */:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case Opcodes.FLOAD /* 23 */:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "type1";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[0] = "type2";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[0] = "typeParameter";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case Opcodes.ILOAD /* 21 */:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getOutType";
        } else if (i10 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i10) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
                objArr[2] = "equalTypes";
                break;
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.FLOAD /* 23 */:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2706r0 m10963b(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        if (abstractC2706r0 == null) {
            m10962a(0);
        }
        if (abstractC2706r02 == null) {
            m10962a(1);
        }
        return m10964c(abstractC2706r0, abstractC2706r02, new C2964w());
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2706r0 m10964c(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, InterfaceC2966y interfaceC2966y) {
        if (abstractC2706r0 == null) {
            m10962a(2);
        }
        if (abstractC2706r02 == null) {
            m10962a(3);
        }
        if (interfaceC2966y == null) {
            m10962a(4);
        }
        return AbstractC2943b0.m10757d(abstractC2706r0, abstractC2706r02, interfaceC2966y);
    }
}
