package p036c9;

import java.util.List;
import p020b5.C0184c;
import p080fb.C1176t0;
import p085fg.InterfaceC1231l;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.C5158nv;
import p332wb.C5191ov;
import p332wb.C5319sr;

/* JADX INFO: renamed from: c9.y0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0503y0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1537g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f1538h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1231l f1539i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f1540j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0503y0(List list, InterfaceC1231l interfaceC1231l, String str) {
        this.f1537g = 1;
        this.f1538h = list;
        this.f1539i = interfaceC1231l;
        this.f1540j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C3623h c3623h = (C3623h) obj;
        switch (this.f1537g) {
            case 0:
                c3623h.getClass();
                InterfaceC1231l interfaceC1231l = this.f1539i;
                String str = this.f1540j;
                C3623h.m7604a(c3623h, "root", new C3874d(1238036053, new C0439g0(0, interfaceC1231l, str), true), 2);
                for (C0424c1 c0424c1 : this.f1538h) {
                    String str2 = c0424c1.f1216a;
                    if (str2 == null) {
                        str2 = "__wechat_home__";
                    }
                    C3623h.m7604a(c3623h, str2, new C3874d(-1156669043, new C0443h0(c0424c1, str, interfaceC1231l, 0), true), 2);
                }
                break;
            case 1:
                c3623h.getClass();
                for (C1176t0 c1176t0 : this.f1538h) {
                    C3623h.m7604a(c3623h, c1176t0.f3936a, new C3874d(629202757, new C0443h0(this.f1539i, (Object) c1176t0, (Object) this.f1540j, 27), true), 2);
                }
                break;
            default:
                c3623h.getClass();
                C5319sr c5319sr = new C5319sr(13);
                List list = this.f1538h;
                c3623h.f11683a.m352b(list.size(), new C0184c(new C5158nv(c5319sr, list), new C5158nv(list), new C3874d(802480018, new C5191ov(list, this.f1540j, this.f1539i), true)));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0503y0(List list, String str, InterfaceC1231l interfaceC1231l, int i9) {
        this.f1537g = i9;
        this.f1538h = list;
        this.f1540j = str;
        this.f1539i = interfaceC1231l;
    }
}
