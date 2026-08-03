package p332wb;

import p065eb.C0859c0;
import p085fg.InterfaceC1231l;
import p117i0.C1845j1;
import p276sf.C3967n;
import p317vb.InterfaceC4544a;

/* JADX INFO: renamed from: wb.h6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4937h6 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17528g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1845j1 f17529h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4937h6(C1845j1 c1845j1, int i9) {
        this.f17528g = i9;
        this.f17529h = c1845j1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f17528g) {
            case 0:
                EnumC5329t4 enumC5329t4 = (EnumC5329t4) obj;
                enumC5329t4.getClass();
                this.f17529h.setValue(enumC5329t4);
                break;
            case 1:
                C0859c0 c0859c0 = (C0859c0) obj;
                c0859c0.getClass();
                this.f17529h.setValue(c0859c0);
                break;
            case 2:
                InterfaceC4544a interfaceC4544a = (InterfaceC4544a) obj;
                interfaceC4544a.getClass();
                this.f17529h.setValue(new C5294s2(interfaceC4544a, (C4770c3) null, 6));
                break;
            case 3:
                C4770c3 c4770c3 = (C4770c3) obj;
                c4770c3.getClass();
                this.f17529h.setValue(new C5327t2(c4770c3));
                break;
            case 4:
                C0859c0 c0859c02 = (C0859c0) obj;
                c0859c02.getClass();
                this.f17529h.setValue(c0859c02);
                break;
            case 5:
                String str = (String) obj;
                str.getClass();
                this.f17529h.setValue(str);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f17529h.setValue(bool);
                break;
        }
        return C3967n.f12976a;
    }
}
