package p273s9;

import gb.EnumC2691m2;
import okhttp3.internal.url._UrlKt;
import p082fb.InterfaceC2412n;
import p213oa.C5695f;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6012j1;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: s9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7203b extends AbstractC7215h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7203b(InterfaceC2412n interfaceC2412n, InterfaceC6019m interfaceC6019m, InterfaceC6333h interfaceC6333h, C5695f c5695f, EnumC2691m2 enumC2691m2, boolean z10, int i10, InterfaceC6003g1 interfaceC6003g1, InterfaceC6012j1 interfaceC6012j1) {
        super(interfaceC2412n, interfaceC6019m, interfaceC6333h, c5695f, enumC2691m2, z10, i10, interfaceC6003g1, interfaceC6012j1);
        if (interfaceC2412n == null) {
            m28449N(0);
        }
        if (interfaceC6019m == null) {
            m28449N(1);
        }
        if (interfaceC6333h == null) {
            m28449N(2);
        }
        if (c5695f == null) {
            m28449N(3);
        }
        if (enumC2691m2 == null) {
            m28449N(4);
        }
        if (interfaceC6003g1 == null) {
            m28449N(5);
        }
        if (interfaceC6012j1 == null) {
            m28449N(6);
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m28449N(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p273s9.AbstractC7225m
    public String toString() {
        boolean zMo23993K = mo23993K();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        String str2 = zMo23993K ? "reified " : _UrlKt.FRAGMENT_ENCODE_SET;
        if (mo23995s() != EnumC2691m2.f7042u) {
            str = mo23995s() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
