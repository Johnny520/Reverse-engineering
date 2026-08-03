package p332wb;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p315v8.C4521a;
import p315v8.C4538r;

/* JADX INFO: renamed from: wb.rk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5279rk implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20474g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20475h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20476i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4538r f20477j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5279rk(Context context, InterfaceC1809a1 interfaceC1809a1, C4538r c4538r) {
        this.f20474g = 0;
        this.f20477j = c4538r;
        this.f20475h = context;
        this.f20476i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f20474g) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                this.f20476i.setValue(bool);
                this.f20477j.getClass();
                AbstractC4302b.m8640c(this.f20475h, "Hchat_auto_message_forward_config").edit().putBoolean("enabled", zBooleanValue).apply();
                break;
            case 1:
                C4521a c4521a = (C4521a) obj;
                c4521a.getClass();
                InterfaceC1809a1 interfaceC1809a1 = this.f20476i;
                List list = (List) interfaceC1809a1.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((C4521a) obj2).f14897a.equals(c4521a.f14897a)) {
                        arrayList.add(obj2);
                    }
                }
                C4538r c4538r = this.f20477j;
                Context context = this.f20475h;
                AbstractC4955ho.m9584k(c4538r, context, interfaceC1809a1, arrayList);
                Toast.makeText(context, "规则已删除", 0).show();
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C4521a) it.next()).f14897a);
                }
                InterfaceC1809a1 interfaceC1809a12 = this.f20476i;
                List list3 = (List) interfaceC1809a12.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (!hashSet.contains(((C4521a) obj3).f14897a)) {
                        arrayList2.add(obj3);
                    }
                }
                C4538r c4538r2 = this.f20477j;
                Context context2 = this.f20475h;
                AbstractC4955ho.m9584k(c4538r2, context2, interfaceC1809a12, arrayList2);
                AbstractC4855en.m9271o("已删除 ", list2.size(), " 条规则", context2, 0);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5279rk(Context context, InterfaceC1809a1 interfaceC1809a1, C4538r c4538r, int i9) {
        this.f20474g = i9;
        this.f20475h = context;
        this.f20476i = interfaceC1809a1;
        this.f20477j = c4538r;
    }
}
