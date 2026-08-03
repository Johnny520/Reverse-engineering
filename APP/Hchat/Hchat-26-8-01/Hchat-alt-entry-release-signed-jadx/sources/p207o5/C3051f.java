package p207o5;

import androidx.lifecycle.C0119x;
import p005a5.C0016a;
import p150k5.C2270u;
import p271s5.InterfaceC3929a;
import p342x5.C5691b;
import p342x5.C5692c;
import p342x5.C5693d;
import p342x5.C5694e;
import p342x5.C5695f;
import p342x5.C5696g;

/* JADX INFO: renamed from: o5.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3051f extends AbstractC3065t {

    /* JADX INFO: renamed from: j */
    public int f9874j;

    /* JADX INFO: renamed from: k */
    public int f9875k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9876l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC3929a[] f9877m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C3053h f9878n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3051f(C3053h c3053h, C0119x c0119x, int i9, int i10, int i11, InterfaceC3929a[] interfaceC3929aArr) {
        super(c0119x, i9);
        this.f9878n = c3053h;
        this.f9876l = i11;
        this.f9877m = interfaceC3929aArr;
        this.f9874j = 0;
        this.f9875k = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3065t
    /* JADX INFO: renamed from: a */
    public final Object mo5492a(C0016a c0016a) {
        InterfaceC3929a interfaceC3929a;
        C2270u c2270u = this.f9878n.f9885g;
        while (true) {
            int i9 = this.f9874j;
            int i10 = this.f9876l;
            if (i9 > i10) {
                this.f9909g = 3;
                return null;
            }
            int iM210n = c0016a.m210n();
            InterfaceC3929a interfaceC3929a2 = C3053h.f9884j;
            InterfaceC3929a[] interfaceC3929aArr = this.f9877m;
            boolean z9 = true;
            boolean z10 = false;
            switch (iM210n) {
                case 0:
                    this.f9909g = 3;
                    return null;
                case 1:
                    this.f9874j += c0016a.m211o(false);
                    break;
                case 2:
                    this.f9875k += c0016a.m209m();
                    break;
                case 3:
                    int iM211o = c0016a.m211o(false);
                    C5696g c5696g = new C5696g(this.f9874j, iM211o, c2270u.f7548r.m5523d(c0016a.m211o(false) - 1), c2270u.f7549s.m5523d(c0016a.m211o(false) - 1), null);
                    if (iM211o >= 0 && iM211o < interfaceC3929aArr.length) {
                        interfaceC3929aArr[iM211o] = c5696g;
                    }
                    return c5696g;
                case 4:
                    int iM211o2 = c0016a.m211o(false);
                    C5696g c5696g2 = new C5696g(this.f9874j, iM211o2, c2270u.f7548r.m5523d(c0016a.m211o(false) - 1), c2270u.f7549s.m5523d(c0016a.m211o(false) - 1), c2270u.f7548r.m5523d(c0016a.m211o(false) - 1));
                    if (iM211o2 >= 0 && iM211o2 < interfaceC3929aArr.length) {
                        interfaceC3929aArr[iM211o2] = c5696g2;
                    }
                    return c5696g2;
                case 5:
                    int iM211o3 = c0016a.m211o(false);
                    if (iM211o3 < 0 || iM211o3 >= interfaceC3929aArr.length) {
                        interfaceC3929a = interfaceC3929a2;
                        z9 = false;
                    } else {
                        interfaceC3929a = interfaceC3929aArr[iM211o3];
                    }
                    if (!(interfaceC3929a instanceof C5691b)) {
                        interfaceC3929a2 = interfaceC3929a;
                        z10 = z9;
                    }
                    C5691b c5691b = new C5691b(this.f9874j, iM211o3, interfaceC3929a2.getName(), interfaceC3929a2.getType(), interfaceC3929a2.mo5873e());
                    if (z10) {
                        interfaceC3929aArr[iM211o3] = c5691b;
                    }
                    return c5691b;
                case 6:
                    int iM211o4 = c0016a.m211o(false);
                    if (iM211o4 >= 0 && iM211o4 < interfaceC3929aArr.length) {
                        interfaceC3929a2 = interfaceC3929aArr[iM211o4];
                    }
                    C5694e c5694e = new C5694e(this.f9874j, iM211o4, interfaceC3929a2.getName(), interfaceC3929a2.getType(), interfaceC3929a2.mo5873e());
                    if (iM211o4 >= 0 && iM211o4 < interfaceC3929aArr.length) {
                        interfaceC3929aArr[iM211o4] = c5694e;
                    }
                    return c5694e;
                case 7:
                    return new C5692c(this.f9874j, 1);
                case 8:
                    return new C5692c(this.f9874j, 0);
                case 9:
                    return new C5695f(this.f9874j, c2270u.f7548r.m5523d(c0016a.m211o(false) - 1));
                default:
                    int i11 = ((iM210n - 10) / 15) + this.f9874j;
                    this.f9874j = i11;
                    int i12 = ((r3 % 15) - 4) + this.f9875k;
                    this.f9875k = i12;
                    if (i11 <= i10) {
                        return new C5693d(i11, i12);
                    }
                    this.f9909g = 3;
                    return null;
            }
        }
    }
}
