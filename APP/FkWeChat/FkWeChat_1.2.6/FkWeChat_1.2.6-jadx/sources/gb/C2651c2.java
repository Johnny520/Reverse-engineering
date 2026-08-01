package gb;

import p112hb.AbstractC2949h;

/* JADX INFO: renamed from: gb.c2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2651c2 extends AbstractC2647b2 {

    /* JADX INFO: renamed from: a */
    public final EnumC2691m2 f6964a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2706r0 f6965b;

    public C2651c2(EnumC2691m2 enumC2691m2, AbstractC2706r0 abstractC2706r0) {
        if (enumC2691m2 == null) {
            m9350d(0);
        }
        if (abstractC2706r0 == null) {
            m9350d(1);
        }
        this.f6964a = enumC2691m2;
        this.f6965b = abstractC2706r0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9350d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: a */
    public InterfaceC2643a2 mo9334a(AbstractC2949h abstractC2949h) {
        if (abstractC2949h == null) {
            m9350d(6);
        }
        return new C2651c2(this.f6964a, abstractC2949h.mo9586a(this.f6965b));
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: b */
    public EnumC2691m2 mo9335b() {
        EnumC2691m2 enumC2691m2 = this.f6964a;
        if (enumC2691m2 == null) {
            m9350d(4);
        }
        return enumC2691m2;
    }

    @Override // gb.InterfaceC2643a2
    /* JADX INFO: renamed from: c */
    public boolean mo9336c() {
        return false;
    }

    @Override // gb.InterfaceC2643a2
    public AbstractC2706r0 getType() {
        AbstractC2706r0 abstractC2706r0 = this.f6965b;
        if (abstractC2706r0 == null) {
            m9350d(5);
        }
        return abstractC2706r0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2651c2(AbstractC2706r0 abstractC2706r0) {
        this(EnumC2691m2.f7042u, abstractC2706r0);
        if (abstractC2706r0 == null) {
            m9350d(2);
        }
    }
}
