package p095g6;

import ke.C4264a;
import p010a9.InterfaceC0184l;
import p299ub.AbstractC8610a;
import p299ub.C8622g;
import p299ub.C8632n;
import p299ub.InterfaceC8624h;
import p299ub.InterfaceC8626i;

/* JADX INFO: renamed from: g6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2535b {

    /* JADX INFO: renamed from: a */
    public static final C2535b f6796a = new C2535b();

    /* JADX INFO: renamed from: b */
    public static final C8632n f6797b;

    /* JADX INFO: renamed from: c */
    public static final C8632n f6798c;

    /* JADX INFO: renamed from: d */
    public static final int f6799d;

    static {
        C8632n c8632n = new C8632n("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])");
        f6797b = c8632n;
        f6798c = new C8632n(c8632n.m33214f() + "|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])");
        f6799d = 8;
    }

    /* JADX INFO: renamed from: a */
    public static CharSequence m9037a(boolean z10, InterfaceC8626i interfaceC8626i) {
        String strValueOf;
        interfaceC8626i.getClass();
        InterfaceC8624h interfaceC8624hMo33183c = interfaceC8626i.mo33183c();
        if (interfaceC8624hMo33183c.size() > 5 && interfaceC8624hMo33183c.get(5) != null) {
            C8622g c8622g = interfaceC8624hMo33183c.get(5);
            c8622g.getClass();
            return String.valueOf(c8622g.m33172a().charAt(0));
        }
        if (interfaceC8624hMo33183c.get(4) != null) {
            return interfaceC8626i.getValue();
        }
        Integer numValueOf = null;
        if (z10) {
            if (interfaceC8624hMo33183c.get(1) != null) {
                numValueOf = (Integer) C4264a.f12468a.m16755a().get(interfaceC8626i.getValue());
            } else if (interfaceC8624hMo33183c.get(2) != null) {
                C8622g c8622g2 = interfaceC8624hMo33183c.get(2);
                c8622g2.getClass();
                numValueOf = Integer.valueOf(Integer.parseInt(c8622g2.m33172a()));
            } else if (interfaceC8624hMo33183c.get(3) != null) {
                C8622g c8622g3 = interfaceC8624hMo33183c.get(3);
                c8622g3.getClass();
                numValueOf = Integer.valueOf(Integer.parseInt(c8622g3.m33172a(), AbstractC8610a.m33053a(16)));
            }
        }
        return (numValueOf == null || (strValueOf = String.valueOf((char) numValueOf.intValue())) == null) ? "&".concat(interfaceC8626i.getValue().substring(1)) : strValueOf;
    }

    /* JADX INFO: renamed from: b */
    public final String m9038b(CharSequence charSequence, final boolean z10, boolean z11) {
        charSequence.getClass();
        return (z11 ? f6798c : f6797b).m33218j(charSequence, new InterfaceC0184l() { // from class: g6.a
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C2535b.m9037a(z10, (InterfaceC8626i) obj);
            }
        });
    }
}
