package p332wb;

import java.util.List;
import okhttp3.HttpUrl;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import tf.AbstractC4166m;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4802d2 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f16491h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f16492i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f16493j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f16494k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4802d2(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f16491h = i9;
        this.f16492i = list;
        this.f16493j = interfaceC1809a1;
        this.f16494k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f16491h) {
            case 0:
                return new C4802d2(this.f16492i, this.f16493j, this.f16494k, interfaceC5557c, 0);
            case 1:
                return new C4802d2(this.f16492i, this.f16493j, this.f16494k, interfaceC5557c, 1);
            case 2:
                return new C4802d2(this.f16492i, this.f16493j, this.f16494k, interfaceC5557c, 2);
            default:
                return new C4802d2(this.f16492i, this.f16493j, this.f16494k, interfaceC5557c, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f16491h) {
            case 0:
                C4802d2 c4802d2 = (C4802d2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c4802d2.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C4802d2 c4802d22 = (C4802d2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c4802d22.invokeSuspend(c3967n2);
                return c3967n2;
            case 2:
                C4802d2 c4802d23 = (C4802d2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c4802d23.invokeSuspend(c3967n3);
                return c3967n3;
            default:
                C4802d2 c4802d24 = (C4802d2) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c4802d24.invokeSuspend(c3967n4);
                return c3967n4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f16491h;
        EnumC5325t0 enumC5325t0 = EnumC5325t0.f20734l;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        C3967n c3967n = C3967n.f12976a;
        List list = this.f16492i;
        InterfaceC1809a1 interfaceC1809a1 = this.f16493j;
        InterfaceC1809a1 interfaceC1809a12 = this.f16494k;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                C4933h2 c4933h2 = C4933h2.f17518a;
                if (((EnumC5325t0) interfaceC1809a1.getValue()) != enumC5325t0) {
                    if (!AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                        interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                } else if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue()) || !list.contains((String) interfaceC1809a12.getValue())) {
                    String str2 = (String) AbstractC4166m.m8424v1(list);
                    if (str2 != null) {
                        str = str2;
                    }
                    interfaceC1809a12.setValue(str);
                }
                break;
            case 1:
                AbstractC1089i.m2732I0(obj);
                C3147k c3147k = AbstractC4955ho.f17686a;
                if (((EnumC5325t0) interfaceC1809a1.getValue()) != enumC5325t0) {
                    if (!AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                        interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                } else if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue()) || !list.contains((String) interfaceC1809a12.getValue())) {
                    String str3 = (String) AbstractC4166m.m8424v1(list);
                    if (str3 != null) {
                        str = str3;
                    }
                    interfaceC1809a12.setValue(str);
                }
                break;
            case 2:
                AbstractC1089i.m2732I0(obj);
                if (((String) interfaceC1809a1.getValue()) == null) {
                    interfaceC1809a12.setValue(list);
                }
                break;
            default:
                AbstractC1089i.m2732I0(obj);
                if (((EnumC4993iv) interfaceC1809a1.getValue()) == EnumC4993iv.f18017m && AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                    String str4 = (String) AbstractC4166m.m8424v1(list);
                    if (str4 != null) {
                        str = str4;
                    }
                    interfaceC1809a12.setValue(str);
                }
                break;
        }
        return c3967n;
    }
}
