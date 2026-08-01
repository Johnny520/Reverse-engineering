package p112hb;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.InterfaceC2716u1;

/* JADX INFO: renamed from: hb.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2964w implements InterfaceC2966y {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10960b(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p112hb.InterfaceC2966y
    /* JADX INFO: renamed from: a */
    public boolean mo10961a(InterfaceC2716u1 interfaceC2716u1, InterfaceC2716u1 interfaceC2716u12) {
        if (interfaceC2716u1 == null) {
            m10960b(3);
        }
        if (interfaceC2716u12 == null) {
            m10960b(4);
        }
        return interfaceC2716u1.equals(interfaceC2716u12);
    }
}
