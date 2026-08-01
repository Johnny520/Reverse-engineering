package p197m;

import me.dartcv.nuke.BuildConfig;
import p027E4.C0330q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p203n.InterfaceC2637U;
import p203n.InterfaceC2677v;

/* JADX INFO: renamed from: m.E */
/* JADX INFO: loaded from: classes.dex */
public final class C2520E extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8057e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2528M f8058f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2529N f8059g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2520E(C2528M c2528m, C2529N c2529n, int i5) {
        super(1);
        this.f8057e = i5;
        this.f8058f = c2528m;
        this.f8059g = c2529n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        InterfaceC2677v interfaceC2677v;
        InterfaceC2677v interfaceC2677v2;
        switch (this.f8057e) {
            case 0:
                InterfaceC2637U interfaceC2637U = (InterfaceC2637U) obj;
                EnumC2517B enumC2517B = EnumC2517B.f8039d;
                EnumC2517B enumC2517B2 = EnumC2517B.f8040e;
                if (interfaceC2637U.m4585b(enumC2517B, enumC2517B2)) {
                    C2530O c2530o = this.f8058f.f8089a.f8107a;
                    return (c2530o == null || (interfaceC2677v2 = c2530o.f8093a) == null) ? AbstractC2523H.f8064b : interfaceC2677v2;
                }
                if (!interfaceC2637U.m4585b(enumC2517B2, EnumC2517B.f8041f)) {
                    return AbstractC2523H.f8064b;
                }
                C2530O c2530o2 = this.f8059g.f8092a.f8107a;
                return (c2530o2 == null || (interfaceC2677v = c2530o2.f8093a) == null) ? AbstractC2523H.f8064b : interfaceC2677v;
            case BuildConfig.VERSION_CODE /* 1 */:
                int iOrdinal = ((EnumC2517B) obj).ordinal();
                float f2 = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new C0330q();
                        }
                        if (this.f8059g.f8092a.f8107a == null) {
                        }
                    }
                } else if (this.f8058f.f8089a.f8107a == null) {
                }
                return Float.valueOf(f2);
            case 2:
                InterfaceC2637U interfaceC2637U2 = (InterfaceC2637U) obj;
                EnumC2517B enumC2517B3 = EnumC2517B.f8039d;
                EnumC2517B enumC2517B4 = EnumC2517B.f8040e;
                if (interfaceC2637U2.m4585b(enumC2517B3, enumC2517B4)) {
                    C2535U c2535u = this.f8058f.f8089a.f8109c;
                    return c2535u != null ? c2535u.f8102c : AbstractC2523H.f8064b;
                }
                if (!interfaceC2637U2.m4585b(enumC2517B4, EnumC2517B.f8041f)) {
                    return AbstractC2523H.f8064b;
                }
                C2535U c2535u2 = this.f8059g.f8092a.f8109c;
                return c2535u2 != null ? c2535u2.f8102c : AbstractC2523H.f8064b;
            default:
                int iOrdinal2 = ((EnumC2517B) obj).ordinal();
                float f5 = 1.0f;
                if (iOrdinal2 == 0) {
                    C2535U c2535u3 = this.f8058f.f8089a.f8109c;
                    if (c2535u3 != null) {
                        f5 = c2535u3.f8100a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new C0330q();
                    }
                    C2535U c2535u4 = this.f8059g.f8092a.f8109c;
                    if (c2535u4 != null) {
                        f5 = c2535u4.f8100a;
                    }
                }
                return Float.valueOf(f5);
        }
    }
}
