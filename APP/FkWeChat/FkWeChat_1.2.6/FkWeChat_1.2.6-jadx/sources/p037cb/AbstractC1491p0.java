package p037cb;

import p143ja.EnumC3778k;
import p143ja.EnumC3792y;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.InterfaceC5986b;

/* JADX INFO: renamed from: cb.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1491p0 {

    /* JADX INFO: renamed from: cb.p0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4428a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f4429b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f4430c;

        static {
            int[] iArr = new int[EnumC3778k.values().length];
            try {
                iArr[EnumC3778k.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3778k.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3778k.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3778k.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4428a = iArr;
            int[] iArr2 = new int[InterfaceC5986b.a.values().length];
            try {
                iArr2[InterfaceC5986b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC5986b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC5986b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC5986b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f4429b = iArr2;
            int[] iArr3 = new int[EnumC3792y.values().length];
            try {
                iArr3[EnumC3792y.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC3792y.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC3792y.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC3792y.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC3792y.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC3792y.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f4430c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC6043u m5876a(C1489o0 c1489o0, EnumC3792y enumC3792y) {
        c1489o0.getClass();
        switch (enumC3792y == null ? -1 : a.f4430c[enumC3792y.ordinal()]) {
            case 1:
                AbstractC6043u abstractC6043u = AbstractC6040t.f18985d;
                abstractC6043u.getClass();
                return abstractC6043u;
            case 2:
                AbstractC6043u abstractC6043u2 = AbstractC6040t.f18982a;
                abstractC6043u2.getClass();
                return abstractC6043u2;
            case 3:
                AbstractC6043u abstractC6043u3 = AbstractC6040t.f18983b;
                abstractC6043u3.getClass();
                return abstractC6043u3;
            case 4:
                AbstractC6043u abstractC6043u4 = AbstractC6040t.f18984c;
                abstractC6043u4.getClass();
                return abstractC6043u4;
            case 5:
                AbstractC6043u abstractC6043u5 = AbstractC6040t.f18986e;
                abstractC6043u5.getClass();
                return abstractC6043u5;
            case 6:
                AbstractC6043u abstractC6043u6 = AbstractC6040t.f18987f;
                abstractC6043u6.getClass();
                return abstractC6043u6;
            default:
                AbstractC6043u abstractC6043u7 = AbstractC6040t.f18982a;
                abstractC6043u7.getClass();
                return abstractC6043u7;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5986b.a m5877b(C1489o0 c1489o0, EnumC3778k enumC3778k) {
        c1489o0.getClass();
        int i10 = enumC3778k == null ? -1 : a.f4428a[enumC3778k.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? InterfaceC5986b.a.DECLARATION : InterfaceC5986b.a.SYNTHESIZED : InterfaceC5986b.a.DELEGATION : InterfaceC5986b.a.FAKE_OVERRIDE : InterfaceC5986b.a.DECLARATION;
    }
}
