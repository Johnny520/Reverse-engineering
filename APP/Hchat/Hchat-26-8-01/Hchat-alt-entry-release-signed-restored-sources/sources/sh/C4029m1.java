package sh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p051db.C0763a;
import p051db.C0765c;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p276sf.C3958e;
import p276sf.C3967n;
import p315v8.C4521a;
import p332wb.AbstractC4955ho;
import p332wb.C4737b3;
import p332wb.C4797cu;
import p332wb.C4829du;
import p332wb.C5233q7;
import p332wb.C5292s0;
import p332wb.C5483xq;
import p332wb.C5491y2;
import p332wb.C5515yq;
import p332wb.EnumC4897g;
import p332wb.EnumC4997j2;
import p332wb.EnumC5325t0;
import p345x8.C5709b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import ua.C4298i;

/* JADX INFO: renamed from: sh.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4029m1 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13263g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f13264h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f13265i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4029m1(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f13263g = i9;
        this.f13264h = interfaceC1809a1;
        this.f13265i = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f13263g) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f13264h.getValue();
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(bool);
                }
                ((C2864c) ((InterfaceC2862a) this.f13265i.getValue())).m6283a(zBooleanValue ? 21 : 22);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                this.f13264h.setValue(str);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 2:
                EnumC5325t0 enumC5325t0 = (EnumC5325t0) obj;
                enumC5325t0.getClass();
                this.f13264h.setValue(enumC5325t0);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                this.f13264h.setValue(str2);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                this.f13264h.setValue(str3);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                this.f13264h.setValue(str4);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                this.f13264h.setValue(num);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 7:
                Integer num2 = (Integer) obj;
                int iIntValue = num2.intValue();
                this.f13264h.setValue(num2);
                if (iIntValue == 0) {
                    this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 8:
                Integer num3 = (Integer) obj;
                int iIntValue2 = num3.intValue();
                this.f13264h.setValue(num3);
                if (iIntValue2 == 0) {
                    this.f13265i.setValue("0");
                }
                return C3967n.f12976a;
            case 9:
                Integer num4 = (Integer) obj;
                num4.intValue();
                this.f13264h.setValue(num4);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 10:
                EnumC5325t0 enumC5325t02 = (EnumC5325t0) obj;
                enumC5325t02.getClass();
                this.f13264h.setValue(enumC5325t02);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 11:
                Boolean bool2 = (Boolean) obj;
                boolean zBooleanValue2 = bool2.booleanValue();
                this.f13264h.setValue(bool2);
                if (zBooleanValue2) {
                    this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 12:
                Boolean bool3 = (Boolean) obj;
                boolean zBooleanValue3 = bool3.booleanValue();
                this.f13264h.setValue(bool3);
                if (zBooleanValue3) {
                    this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 13:
                String str5 = (String) obj;
                str5.getClass();
                this.f13264h.setValue(str5);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 14:
                Integer num5 = (Integer) obj;
                if (num5.intValue() == 0) {
                    this.f13264h.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                this.f13265i.setValue(num5);
                break;
            case 15:
                Boolean bool4 = (Boolean) obj;
                boolean zBooleanValue4 = bool4.booleanValue();
                this.f13264h.setValue(bool4);
                if (zBooleanValue4) {
                    this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                return C3967n.f12976a;
            case 16:
                EnumC5325t0 enumC5325t03 = (EnumC5325t0) obj;
                enumC5325t03.getClass();
                this.f13264h.setValue(enumC5325t03);
                this.f13265i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 17:
                List list = (List) obj;
                list.getClass();
                this.f13264h.setValue(list);
                this.f13265i.setValue(Boolean.FALSE);
                break;
            case 18:
                Integer num6 = (Integer) obj;
                int iIntValue3 = num6.intValue();
                InterfaceC1809a1 interfaceC1809a1 = this.f13264h;
                if (iIntValue3 != ((Number) interfaceC1809a1.getValue()).intValue()) {
                    interfaceC1809a1.setValue(num6);
                    InterfaceC1809a1 interfaceC1809a12 = this.f13265i;
                    interfaceC1809a12.setValue(C0765c.m1980a((C0765c) interfaceC1809a12.getValue(), 0, null, null, null, C4173t.f13710g, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4194271));
                }
                return C3967n.f12976a;
            case 19:
                int iIntValue4 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a13 = this.f13264h;
                C0763a c0763a = (C0763a) AbstractC4166m.m8425w1(iIntValue4, AbstractC4955ho.m9445T6((C0765c) interfaceC1809a13.getValue()));
                if (c0763a != null) {
                    this.f13265i.setValue(new C4829du(new C4737b3(AbstractC4955ho.m9493Z6(c0763a.f2286a), c0763a.f2287b, new C5233q7(iIntValue4, interfaceC1809a13, 0), false, "|")));
                }
                return C3967n.f12976a;
            case 20:
                List list2 = (List) obj;
                list2.getClass();
                InterfaceC1809a1 interfaceC1809a14 = this.f13264h;
                C0765c c0765c = (C0765c) interfaceC1809a14.getValue();
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5292s0) it.next()).f20550a);
                }
                interfaceC1809a14.setValue(C0765c.m1980a(c0765c, 0, null, null, null, arrayList, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4194271));
                this.f13265i.setValue(C4797cu.f16465b);
                break;
            case 21:
                C4521a c4521a = (C4521a) obj;
                c4521a.getClass();
                this.f13264h.setValue(c4521a);
                this.f13265i.setValue(EnumC4897g.f17317k);
                break;
            case 22:
                C4521a c4521a2 = (C4521a) obj;
                c4521a2.getClass();
                this.f13264h.setValue(c4521a2);
                this.f13265i.setValue(EnumC4897g.f17318l);
                break;
            case 23:
                C4521a c4521a3 = (C4521a) obj;
                c4521a3.getClass();
                this.f13264h.setValue(c4521a3);
                this.f13265i.setValue(EnumC4897g.f17315i);
                break;
            case 24:
                List list3 = (List) obj;
                list3.getClass();
                InterfaceC1809a1 interfaceC1809a15 = this.f13264h;
                C0765c c0765c2 = (C0765c) interfaceC1809a15.getValue();
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list3));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5292s0) it2.next()).f20550a);
                }
                interfaceC1809a15.setValue(C0765c.m1980a(c0765c2, 0, null, null, null, arrayList2, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, null, 0, null, 4194271));
                this.f13265i.setValue(C5483xq.f22028b);
                break;
            case 25:
                int iIntValue5 = ((Integer) obj).intValue();
                InterfaceC1809a1 interfaceC1809a16 = this.f13264h;
                C0763a c0763a2 = (C0763a) AbstractC4166m.m8425w1(iIntValue5, AbstractC4955ho.m9445T6((C0765c) interfaceC1809a16.getValue()));
                if (c0763a2 != null) {
                    this.f13265i.setValue(new C5515yq(iIntValue5, new C4737b3(AbstractC4955ho.m9493Z6(c0763a2.f2286a), c0763a2.f2287b, new C5233q7(iIntValue5, interfaceC1809a16, 3), false, "|")));
                }
                return C3967n.f12976a;
            case 26:
                C5709b c5709b = (C5709b) obj;
                c5709b.getClass();
                this.f13264h.setValue(c5709b);
                this.f13265i.setValue(new C3958e("规则回复", c5709b.f23217s));
                break;
            case 27:
                List list4 = (List) obj;
                list4.getClass();
                C5292s0 c5292s0 = (C5292s0) AbstractC4166m.m8424v1(list4);
                if (c5292s0 != null) {
                    this.f13264h.setValue(c5292s0.f20550a);
                }
                this.f13265i.setValue(EnumC4997j2.f18033g);
                break;
            case 28:
                List list5 = (List) obj;
                list5.getClass();
                InterfaceC1809a1 interfaceC1809a17 = this.f13264h;
                interfaceC1809a17.setValue(C4298i.m8633a((C4298i) interfaceC1809a17.getValue(), null, false, 0, 0L, 0L, 0L, null, 0, null, null, false, 0, null, 0, 0, null, false, 0, 0, false, list5, false, false, false, 0, false, null, null, null, false, null, -2097153, 1));
                this.f13265i.setValue(Boolean.FALSE);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                if (!C5491y2.m9778H(this.f13264h)) {
                    this.f13265i.setValue(str6);
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }
}
