package p332wb;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p345x8.C5709b;
import p345x8.C5726s;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.o1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5161o1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19308g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f19309h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19310i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5161o1(InterfaceC1231l interfaceC1231l, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f19308g = i9;
        this.f19309h = interfaceC1231l;
        this.f19310i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f19308g) {
            case 0:
                this.f19309h.invoke(AbstractC4166m.m8407P1((Set) this.f19310i.getValue()));
                break;
            case 1:
                this.f19309h.invoke((Set) this.f19310i.getValue());
                break;
            case 2:
                this.f19309h.invoke(AbstractC4955ho.m9475X4((List) this.f19310i.getValue()));
                break;
            case 3:
                this.f19309h.invoke((C5709b) this.f19310i.getValue());
                break;
            case 4:
                this.f19309h.invoke((C5709b) this.f19310i.getValue());
                break;
            case 5:
                List list = (List) this.f19310i.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    C5726s c5726s = (C5726s) obj;
                    int i9 = c5726s.f23313b;
                    if (i9 == 10 || i9 == 11 || i9 == 12 || !AbstractC3149m.m6721t0(c5726s.f23314c)) {
                        arrayList.add(obj);
                    }
                }
                this.f19309h.invoke(arrayList);
                break;
            case 6:
                Boolean bool = (Boolean) this.f19310i.getValue();
                bool.booleanValue();
                this.f19309h.invoke(bool);
                break;
            case 7:
                Boolean bool2 = (Boolean) this.f19310i.getValue();
                bool2.booleanValue();
                this.f19309h.invoke(bool2);
                break;
            case 8:
                this.f19309h.invoke(Integer.valueOf(((Number) this.f19310i.getValue()).intValue()));
                break;
            case 9:
                this.f19309h.invoke((String) this.f19310i.getValue());
                break;
            case 10:
                this.f19309h.invoke((String) this.f19310i.getValue());
                break;
            case 11:
                this.f19309h.invoke((String) this.f19310i.getValue());
                break;
            case 12:
                this.f19309h.invoke(Integer.valueOf(((Number) this.f19310i.getValue()).intValue()));
                break;
            default:
                Boolean bool3 = (Boolean) this.f19310i.getValue();
                bool3.booleanValue();
                this.f19309h.invoke(bool3);
                break;
        }
        return C3967n.f12976a;
    }
}
