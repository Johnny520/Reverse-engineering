package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p003a2.C0014a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p243q9.C3472h;
import p259r9.AbstractC3754e0;
import p261rb.C3797m;
import p276sf.C3967n;
import p343x6.AbstractC5700d;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.fi */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4883fi implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17181g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f17182h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f17183i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f17184j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17185k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4883fi(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, SharedPreferences sharedPreferences) {
        this.f17181g = 2;
        this.f17183i = context;
        this.f17184j = interfaceC1809a1;
        this.f17185k = interfaceC1809a12;
        this.f17182h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f17181g) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                AbstractC4855en.m9269m(this.f17184j, bool, this.f17182h, "zombie_check_enable", zBooleanValue);
                if (!zBooleanValue) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f17185k;
                    if (((C3797m) interfaceC1809a1.getValue()).f12467b || ((C3797m) interfaceC1809a1.getValue()).f12474i) {
                        AbstractC4955ho.m9670t4(this.f17183i, interfaceC1809a1, AbstractC1184v0.m3182I());
                    }
                }
                return C3967n.f12976a;
            case 1:
                List list = (List) obj;
                list.getClass();
                InterfaceC1809a1 interfaceC1809a12 = this.f17184j;
                interfaceC1809a12.setValue(AbstractC4955ho.m9655r7((List) interfaceC1809a12.getValue(), list));
                this.f17182h.edit().putString("group_rename_template_bindings", AbstractC5700d.m10293t((List) interfaceC1809a12.getValue())).apply();
                AbstractC4855en.m9271o("模板已套用到 ", list.size(), " 个群", this.f17183i, 0);
                this.f17185k.setValue(C4935h4.f17523b);
                break;
            case 2:
                List list2 = (List) obj;
                list2.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C5292s0) it.next()).f20550a);
                }
                InterfaceC1809a1 interfaceC1809a13 = this.f17184j;
                String strM9316D5 = AbstractC4955ho.m9316D5(AbstractC4156d0.m8352T(AbstractC4955ho.m9715y6((String) interfaceC1809a13.getValue()), hashSet));
                InterfaceC1809a1 interfaceC1809a14 = this.f17185k;
                List list3 = (List) interfaceC1809a14.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (!hashSet.contains(((C3472h) obj2).f11264a)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    AbstractC4955ho.m9581j5(this.f17182h, (String) it2.next(), strM9316D5, arrayList);
                }
                interfaceC1809a13.setValue(strM9316D5);
                interfaceC1809a14.setValue(arrayList);
                AbstractC4855en.m9271o("已删除 ", list2.size(), " 个监听群", this.f17183i, 0);
                break;
            case 3:
                List list4 = (List) obj;
                list4.getClass();
                InterfaceC1809a1 interfaceC1809a15 = this.f17184j;
                List listM9664s7 = AbstractC4955ho.m9664s7((List) interfaceC1809a15.getValue(), list4);
                interfaceC1809a15.setValue(listM9664s7);
                this.f17182h.edit().putString("message_block_bindings", C0014a.m175e(listM9664s7)).apply();
                AbstractC4855en.m9271o("已保存 ", list4.size(), " 个名单项", this.f17183i, 0);
                this.f17185k.setValue(null);
                break;
            default:
                List list5 = (List) obj;
                list5.getClass();
                InterfaceC1809a1 interfaceC1809a16 = this.f17184j;
                List listM9646q7 = AbstractC4955ho.m9646q7((List) interfaceC1809a16.getValue(), list5);
                interfaceC1809a16.setValue(listM9646q7);
                this.f17182h.edit().putString("group_member_reply_template_bindings", AbstractC3754e0.m7858A(listM9646q7)).apply();
                AbstractC4855en.m9271o("模板已套用到 ", list5.size(), " 个群", this.f17183i, 0);
                this.f17185k.setValue(Boolean.FALSE);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4883fi(int i9, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f17181g = i9;
        this.f17182h = sharedPreferences;
        this.f17183i = context;
        this.f17184j = interfaceC1809a1;
        this.f17185k = interfaceC1809a12;
    }

    public /* synthetic */ C4883fi(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context) {
        this.f17181g = 0;
        this.f17182h = sharedPreferences;
        this.f17184j = interfaceC1809a1;
        this.f17185k = interfaceC1809a12;
        this.f17183i = context;
    }
}
