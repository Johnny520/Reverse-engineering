package p290u;

import p070f0.C0971c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import tg.C4200r;
import tg.InterfaceC4196n;

/* JADX INFO: renamed from: u.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4226c implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13896g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f13897h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f13898i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4226c(boolean z9, C0971c c0971c) {
        this.f13896g = 4;
        this.f13898i = z9;
        this.f13897h = c0971c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        InterfaceC4196n interfaceC4196nM2402i;
        switch (this.f13896g) {
            case 0:
                ((InterfaceC1231l) this.f13897h).invoke(Boolean.valueOf(!this.f13898i));
                break;
            case 1:
                ((InterfaceC1231l) this.f13897h).invoke(Boolean.valueOf(!this.f13898i));
                break;
            case 2:
                ((InterfaceC1231l) this.f13897h).invoke(Boolean.valueOf(!this.f13898i));
                break;
            case 3:
                ((InterfaceC1231l) this.f13897h).invoke(Boolean.valueOf(!this.f13898i));
                break;
            default:
                C0971c c0971c = (C0971c) this.f13897h;
                boolean z9 = this.f13898i;
                C3967n c3967n = C3967n.f12976a;
                if (z9 && (interfaceC4196nM2402i = c0971c.m2402i()) != null) {
                    ((C4200r) interfaceC4196nM2402i).m8457p(c3967n);
                }
                return c3967n;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4226c(int i9, InterfaceC1231l interfaceC1231l, boolean z9) {
        this.f13896g = i9;
        this.f13897h = interfaceC1231l;
        this.f13898i = z9;
    }
}
