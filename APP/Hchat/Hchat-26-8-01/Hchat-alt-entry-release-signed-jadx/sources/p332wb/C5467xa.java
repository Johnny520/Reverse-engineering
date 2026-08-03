package p332wb;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p198nb.C2937g0;
import p198nb.C2939h0;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.xa */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5467xa implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21896g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f21897h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f21898i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f21899j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f21900k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5467xa(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, int i9) {
        this.f21896g = i9;
        this.f21897h = interfaceC1809a1;
        this.f21898i = interfaceC1809a12;
        this.f21899j = interfaceC1809a13;
        this.f21900k = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        String str;
        String str2;
        switch (this.f21896g) {
            case 0:
                C2937g0 c2937g0 = (C2937g0) obj;
                c2937g0.getClass();
                List<C2939h0> list = c2937g0.f9630a;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                for (C2939h0 c2939h0 : list) {
                    arrayList.add(new C4825dq(c2939h0.f9639a, c2939h0.f9640b));
                }
                this.f21897h.setValue(arrayList);
                this.f21898i.setValue(c2937g0.f9631b);
                if (c2937g0.f9633d) {
                    str = c2937g0.f9632c;
                    if (AbstractC3149m.m6721t0(str)) {
                        str = "其它可用引擎";
                    }
                } else {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.f21899j.setValue(str);
                this.f21900k.setValue(Boolean.FALSE);
                break;
            case 1:
                C2937g0 c2937g02 = (C2937g0) obj;
                c2937g02.getClass();
                List<C2939h0> list2 = c2937g02.f9630a;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
                for (C2939h0 c2939h02 : list2) {
                    arrayList2.add(new C4825dq(c2939h02.f9639a, c2939h02.f9640b));
                }
                this.f21897h.setValue(arrayList2);
                this.f21898i.setValue(c2937g02.f9631b);
                if (c2937g02.f9633d) {
                    str2 = c2937g02.f9632c;
                    if (AbstractC3149m.m6721t0(str2)) {
                        str2 = "其它可用引擎";
                    }
                } else {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                this.f21899j.setValue(str2);
                this.f21900k.setValue(Boolean.FALSE);
                break;
            default:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19728b0, 3);
                InterfaceC1809a1 interfaceC1809a1 = this.f21897h;
                C3623h.m7604a(c3623h, null, new C3874d(-2108340708, new C5293s1(interfaceC1809a1, 4), true), 3);
                if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19736c0, 3);
                    C3623h.m7604a(c3623h, null, new C3874d(1926505271, new C5200p7(this.f21898i, this.f21899j, this.f21900k, 0), true), 3);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }
}
