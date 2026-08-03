package sh;

import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p057e1.C0807b;
import p057e1.C0810e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p102h2.EnumC1571a;
import p117i0.AbstractC1874r;
import p117i0.C1829f1;
import p117i0.C1836h0;
import p117i0.InterfaceC1854l2;
import p266s0.C3874d;
import p276sf.C3967n;
import p276sf.InterfaceC3955b;
import p315v8.C4521a;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5163o3;
import p332wb.C5292s0;
import p332wb.C5491y2;
import p348xb.C5763i;
import p356y0.InterfaceC5853o;
import th.C4218j;

/* JADX INFO: renamed from: sh.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4018j implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13161g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f13162h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13163i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13164j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f13165k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4018j(EnumC1571a enumC1571a, InterfaceC5853o interfaceC5853o, C4015i c4015i, boolean z9, int i9) {
        this.f13161g = 0;
        this.f13163i = enumC1571a;
        this.f13164j = interfaceC5853o;
        this.f13165k = c4015i;
        this.f13162h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.f13161g) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4045s.m8240d((EnumC1571a) this.f13163i, (InterfaceC5853o) this.f13164j, (C4015i) this.f13165k, this.f13162h, (C1836h0) obj, AbstractC1874r.m4617C(433));
                break;
            case 1:
                C5763i c5763i = (C5763i) this.f13163i;
                C1829f1 c1829f1 = (C1829f1) this.f13164j;
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f13165k;
                C0810e c0810e = (C0810e) obj;
                return new C0807b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c0810e.f2428a & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(this.f13162h ? AbstractC5163o3.m9732b(interfaceC1854l2) + (c1829f1.m4488g() * (c5763i.m10457c() + 0.5f)) : (Float.intBitsToFloat((int) (c0810e.f2428a >> 32)) - (c1829f1.m4488g() * (c5763i.m10457c() + 0.5f))) + AbstractC5163o3.m9732b(interfaceC1854l2))) << 32));
            case 2:
                ((Integer) obj2).getClass();
                AbstractC5163o3.m9734d((C4218j) this.f13163i, this.f13162h, (InterfaceC5853o) this.f13164j, (C3874d) this.f13165k, (C1836h0) obj, AbstractC1874r.m4617C(3073));
                break;
            case 3:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f13163i;
                List list = (List) this.f13164j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f13165k;
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i9 = 0;
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC4955ho.m9410P3(this.f13162h, "启用消息自动转发", "默认不转发自己发送的消息，可在每条规则中单独开启", false, interfaceC1231l, c1836h0, 432, 8);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    if (list.isEmpty()) {
                        str = "暂无规则";
                    } else {
                        int size = list.size();
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((C4521a) it.next()).f14899c && (i9 = i9 + 1) < 0) {
                                    AbstractC0000a.m30P0();
                                    throw null;
                                }
                            }
                        }
                        str = size + " 条规则，" + i9 + " 条启用";
                    }
                    AbstractC4955ho.m9503b("转发规则", str, interfaceC1220a, c1836h0, 6);
                } else {
                    c1836h0.m4519V();
                }
                return C3967n.f12976a;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9708y((String) this.f13163i, (String) this.f13164j, this.f13162h, (InterfaceC1220a) this.f13165k, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4955ho.m9464W1((C5292s0) this.f13163i, (String) this.f13164j, this.f13162h, (InterfaceC1220a) this.f13165k, (C1836h0) obj, AbstractC1874r.m4617C(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f13163i).m9871N(this.f13162h, (String) this.f13164j, (InterfaceC1231l) this.f13165k, (C1836h0) obj, AbstractC1874r.m4617C(3121));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C5491y2) this.f13163i).m9867K((String) this.f13164j, this.f13162h, (InterfaceC1220a) this.f13165k, (C1836h0) obj, AbstractC1874r.m4617C(3079));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4018j(int i9, Object obj, Object obj2, Object obj3, boolean z9) {
        this.f13161g = i9;
        this.f13162h = z9;
        this.f13163i = obj;
        this.f13164j = obj2;
        this.f13165k = obj3;
    }

    public /* synthetic */ C4018j(int i9, int i10, Object obj, Object obj2, InterfaceC3955b interfaceC3955b, boolean z9) {
        this.f13161g = i10;
        this.f13163i = obj;
        this.f13162h = z9;
        this.f13164j = obj2;
        this.f13165k = interfaceC3955b;
    }

    public /* synthetic */ C4018j(Object obj, String str, boolean z9, InterfaceC1220a interfaceC1220a, int i9, int i10) {
        this.f13161g = i10;
        this.f13163i = obj;
        this.f13164j = str;
        this.f13162h = z9;
        this.f13165k = interfaceC1220a;
    }
}
