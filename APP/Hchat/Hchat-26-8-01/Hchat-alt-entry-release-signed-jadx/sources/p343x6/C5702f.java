package p343x6;

import gg.AbstractC1426v;
import gg.C1410f;
import p085fg.InterfaceC1231l;
import p089g1.C1275d;
import p297u6.C4274a;
import p297u6.C4275b;
import p297u6.C4276c;
import p297u6.C4277d;

/* JADX INFO: renamed from: x6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5702f implements InterfaceC1231l {

    /* JADX INFO: renamed from: h */
    public static final C5702f f23172h = new C5702f(0);

    /* JADX INFO: renamed from: i */
    public static final C5702f f23173i = new C5702f(1);

    /* JADX INFO: renamed from: j */
    public static final C5702f f23174j = new C5702f(2);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23175g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [x6.f.<clinit>():void] */
    public /* synthetic */ C5702f(int i9) {
        this.f23175g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        C4276c c4274a;
        C4276c c4274a2;
        C4276c c4274a3;
        switch (this.f23175g) {
            case 0:
                C4276c c4276c = (C4276c) obj;
                C1410f c1410fM3834a = AbstractC1426v.m3834a(C4274a.class);
                if (c1410fM3834a.equals(AbstractC1426v.m3834a(C4275b.class))) {
                    c4274a = new C4275b(c4276c.mo8594a());
                } else if (c1410fM3834a.equals(AbstractC1426v.m3834a(C4277d.class))) {
                    c4274a = new C4277d(c4276c.mo8594a());
                } else if (!c1410fM3834a.equals(AbstractC1426v.m3834a(C4274a.class))) {
                    C1275d.m3414h(AbstractC1426v.m3834a(C4274a.class), "Unsupported accessor type: ");
                } else {
                    c4274a = new C4274a(c4276c.mo8594a());
                }
                break;
            case 1:
                C4276c c4276c2 = (C4276c) obj;
                C1410f c1410fM3834a2 = AbstractC1426v.m3834a(C4275b.class);
                if (c1410fM3834a2.equals(AbstractC1426v.m3834a(C4275b.class))) {
                    c4274a2 = new C4275b(c4276c2.mo8594a());
                } else if (c1410fM3834a2.equals(AbstractC1426v.m3834a(C4277d.class))) {
                    c4274a2 = new C4277d(c4276c2.mo8594a());
                } else if (!c1410fM3834a2.equals(AbstractC1426v.m3834a(C4274a.class))) {
                    C1275d.m3414h(AbstractC1426v.m3834a(C4275b.class), "Unsupported accessor type: ");
                } else {
                    c4274a2 = new C4274a(c4276c2.mo8594a());
                }
                break;
            default:
                C4276c c4276c3 = (C4276c) obj;
                C1410f c1410fM3834a3 = AbstractC1426v.m3834a(C4277d.class);
                if (c1410fM3834a3.equals(AbstractC1426v.m3834a(C4275b.class))) {
                    c4274a3 = new C4275b(c4276c3.mo8594a());
                } else if (c1410fM3834a3.equals(AbstractC1426v.m3834a(C4277d.class))) {
                    c4274a3 = new C4277d(c4276c3.mo8594a());
                } else if (!c1410fM3834a3.equals(AbstractC1426v.m3834a(C4274a.class))) {
                    C1275d.m3414h(AbstractC1426v.m3834a(C4277d.class), "Unsupported accessor type: ");
                } else {
                    c4274a3 = new C4274a(c4276c3.mo8594a());
                }
                break;
        }
        return null;
    }
}
