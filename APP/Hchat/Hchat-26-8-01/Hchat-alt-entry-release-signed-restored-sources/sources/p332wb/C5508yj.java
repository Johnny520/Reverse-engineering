package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p065eb.C0886p;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;
import tf.AbstractC4167n;
import ua.C4297h;

/* JADX INFO: renamed from: wb.yj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5508yj implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22181g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f22182h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f22183i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f22184j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f22185k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f22186l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f22187m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5508yj(SharedPreferences sharedPreferences, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f22182h = sharedPreferences;
        this.f22183i = context;
        this.f22184j = interfaceC1809a1;
        this.f22185k = interfaceC1809a12;
        this.f22186l = interfaceC1809a13;
        this.f22187m = interfaceC1809a14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f22181g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f22184j;
                List list = (List) interfaceC1809a1.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (AbstractC1416l.m3825a(((C4297h) obj2).f14292e, str)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C4297h) it.next()).f14289b);
                }
                this.f22187m.setValue(new C5391v0("批量套用收款模板", EnumC5358u0.f20980i, true, AbstractC4955ho.m9316D5(arrayList2), new C0886p(this.f22183i, interfaceC1809a1, str, this.f22182h, this.f22185k, this.f22186l), true, Opcodes.CHECKCAST));
                break;
            default:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19888v2, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1772312925, new C4833e1((Object) this.f22182h, (Object) this.f22183i, this.f22184j, this.f22185k, (Object) this.f22186l, (Object) this.f22187m, 14), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19895w2, 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19909y2, 3);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5508yj(InterfaceC1809a1 interfaceC1809a1, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14) {
        this.f22184j = interfaceC1809a1;
        this.f22183i = context;
        this.f22182h = sharedPreferences;
        this.f22185k = interfaceC1809a12;
        this.f22186l = interfaceC1809a13;
        this.f22187m = interfaceC1809a14;
    }
}
