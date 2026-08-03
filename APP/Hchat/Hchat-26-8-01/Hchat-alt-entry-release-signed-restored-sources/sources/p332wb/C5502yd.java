package p332wb;

import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.yd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5502yd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22153g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f22154h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22155i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22156j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5502yd(String str, boolean z9, InterfaceC1220a interfaceC1220a) {
        this.f22155i = str;
        this.f22154h = z9;
        this.f22156j = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f22153g) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f22155i;
                List list = (List) this.f22156j;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(427485979, new C5536zf(this.f22154h, interfaceC1231l, list), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                String str = (String) this.f22155i;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22156j;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(715358498, new C5536zf(str, this.f22154h, interfaceC1220a), c1836h02), c1836h02, 48, 1);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5502yd(boolean z9, InterfaceC1231l interfaceC1231l, List list) {
        this.f22154h = z9;
        this.f22155i = interfaceC1231l;
        this.f22156j = list;
    }
}
