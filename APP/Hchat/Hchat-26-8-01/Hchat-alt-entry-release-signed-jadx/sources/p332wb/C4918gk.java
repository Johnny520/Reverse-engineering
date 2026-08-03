package p332wb;

import android.content.Context;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import p063e9.C0832c;
import p063e9.C0847r;
import p063e9.C0848s;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: wb.gk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4918gk implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17442g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f17443h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f17444i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0848s f17445j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17446k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4918gk(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, C0848s c0848s) {
        this.f17442g = 2;
        this.f17443h = context;
        this.f17444i = interfaceC1809a1;
        this.f17446k = interfaceC1809a12;
        this.f17445j = c0848s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        boolean z9;
        int i9 = this.f17442g;
        C3967n c3967n = C3967n.f12976a;
        C0848s c0848s = this.f17445j;
        InterfaceC1809a1 interfaceC1809a1 = this.f17446k;
        InterfaceC1809a1 interfaceC1809a12 = this.f17444i;
        Context context = this.f17443h;
        switch (i9) {
            case 0:
                C5030k2 c5030k2 = (C5030k2) obj;
                c5030k2.getClass();
                boolean z10 = c5030k2.f18294y;
                boolean z11 = c5030k2.f18290u;
                boolean z12 = c5030k2.f18288s;
                boolean z13 = c5030k2.f18286q;
                boolean z14 = c5030k2.f18284o;
                boolean z15 = c5030k2.f18282m;
                boolean z16 = c5030k2.f18280k;
                boolean z17 = c5030k2.f18278i;
                boolean z18 = c5030k2.f18276g;
                boolean z19 = c5030k2.f18274e;
                boolean z20 = c5030k2.f18272c;
                boolean z21 = c5030k2.f18270a;
                if (z21 || z20 || z19 || z18 || z17 || z16 || z15 || z14 || z13 || z12 || z11 || z10) {
                    List list = (List) interfaceC1809a12.getValue();
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C0832c c0832cM2114a = (C0832c) it.next();
                        c0832cM2114a.getClass();
                        Iterator it2 = it;
                        if (z21) {
                            c0832cM2114a = C0832c.m2114a(c0832cM2114a, null, null, null, false, false, c5030k2.f18271b, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388575);
                        }
                        C0832c c0832cM2114a2 = c0832cM2114a;
                        if (z20) {
                            c0832cM2114a2 = C0832c.m2114a(c0832cM2114a2, null, null, null, false, false, false, !c5030k2.f18273d ? 1 : 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388543);
                        }
                        C0832c c0832cM2114a3 = c0832cM2114a2;
                        if (z19) {
                            c0832cM2114a3 = C0832c.m2114a(c0832cM2114a3, null, null, null, false, false, false, 0, c5030k2.f18275f, false, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388479);
                        }
                        C0832c c0832cM2114a4 = c0832cM2114a3;
                        if (z18) {
                            c0832cM2114a4 = C0832c.m2114a(c0832cM2114a4, null, null, null, false, false, false, 0, false, c5030k2.f18277h, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388351);
                        }
                        C0832c c0832cM2114a5 = c0832cM2114a4;
                        if (z17) {
                            c0832cM2114a5 = C0832c.m2114a(c0832cM2114a5, null, null, null, false, false, false, 0, false, false, c5030k2.f18279j, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388095);
                        }
                        C0832c c0832cM2114a6 = c0832cM2114a5;
                        if (z16) {
                            c0832cM2114a6 = C0832c.m2114a(c0832cM2114a6, null, null, null, false, false, false, 0, false, false, false, c5030k2.f18281l, false, false, false, false, false, null, null, null, false, false, null, null, 8387583);
                        }
                        C0832c c0832cM2114a7 = c0832cM2114a6;
                        if (z15) {
                            c0832cM2114a7 = C0832c.m2114a(c0832cM2114a7, null, null, null, false, false, false, 0, false, false, false, false, c5030k2.f18283n, false, false, false, false, null, null, null, false, false, null, null, 8386559);
                        }
                        C0832c c0832cM2114a8 = c0832cM2114a7;
                        if (z14) {
                            c0832cM2114a8 = C0832c.m2114a(c0832cM2114a8, null, null, null, false, false, false, 0, false, false, false, false, false, c5030k2.f18285p, false, false, false, null, null, null, false, false, null, null, 8384511);
                        }
                        C0832c c0832cM2114a9 = c0832cM2114a8;
                        if (z13) {
                            c0832cM2114a9 = C0832c.m2114a(c0832cM2114a9, null, null, null, false, false, false, 0, false, false, false, false, false, false, c5030k2.f18287r, false, false, null, null, null, false, false, null, null, 8380415);
                        }
                        C0832c c0832cM2114a10 = c0832cM2114a9;
                        if (z12) {
                            c0832cM2114a10 = C0832c.m2114a(c0832cM2114a10, null, null, null, false, false, false, 0, false, false, false, false, false, false, false, c5030k2.f18289t, false, null, null, null, false, false, null, null, 8372223);
                        }
                        C0832c c0832cM2114a11 = c0832cM2114a10;
                        if (z11) {
                            boolean z22 = c5030k2.f18291v;
                            Set set = C0848s.f2595b;
                            z9 = z10;
                            c0832cM2114a11 = C0832c.m2114a(c0832cM2114a11, null, null, null, false, false, false, 0, false, false, false, false, false, false, false, false, z22, C0847r.m2146e(c5030k2.f18292w, "23:00:00"), C0847r.m2146e(c5030k2.f18293x, "07:00:00"), null, false, false, null, null, 8159231);
                        } else {
                            z9 = z10;
                        }
                        C0832c c0832c = c0832cM2114a11;
                        arrayList.add((z9 && c0832c.f2513d) ? C0832c.m2114a(c0832c, null, null, null, false, false, false, 0, false, false, false, false, false, false, false, false, false, null, null, null, c5030k2.f18295z, c5030k2.f18269A, null, null, 6815743) : c0832c);
                        it = it2;
                        z10 = z9;
                    }
                    AbstractC4955ho.m9603m0(c0848s, interfaceC1809a12, arrayList);
                    Toast.makeText(context, "批量配置已应用", 0).show();
                    interfaceC1809a1.setValue(C5096m2.f18833c);
                } else {
                    Toast.makeText(context, "请选择要应用的配置", 0).show();
                }
                break;
            case 1:
                C0832c c0832c2 = (C0832c) obj;
                c0832c2.getClass();
                List<C0832c> list2 = (List) interfaceC1809a12.getValue();
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
                for (C0832c c0832c3 : list2) {
                    if (AbstractC1416l.m3825a(c0832c3.f2511b, c0832c2.f2511b)) {
                        c0832c3 = c0832c2;
                    }
                    arrayList2.add(c0832c3);
                }
                AbstractC4955ho.m9603m0(c0848s, interfaceC1809a12, arrayList2);
                Toast.makeText(context, "规则已保存", 0).show();
                interfaceC1809a1.setValue(C5096m2.f18833c);
                break;
            default:
                List<C5292s0> list3 = (List) obj;
                C5096m2 c5096m2 = C5096m2.f18833c;
                list3.getClass();
                if (list3.isEmpty()) {
                    Toast.makeText(context, "未选择会话", 0).show();
                    interfaceC1809a12.setValue(c5096m2);
                } else {
                    List list4 = (List) interfaceC1809a1.getValue();
                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list4));
                    if (iM8438a0 < 16) {
                        iM8438a0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                    for (Object obj2 : list4) {
                        linkedHashMap.put(((C0832c) obj2).f2511b, obj2);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                    int i10 = 0;
                    int i11 = 0;
                    for (C5292s0 c5292s0 : list3) {
                        String str = c5292s0.f20550a;
                        C0832c c0832c4 = (C0832c) linkedHashMap2.get(str);
                        if (c0832c4 == null) {
                            i10++;
                            String str2 = c5292s0.f20550a;
                            String str3 = c5292s0.f20551b;
                            linkedHashMap2.put(str2, new C0832c(str2, str2, AbstractC3149m.m6721t0(str3) ? str : str3, c5292s0.f20552c, c5292s0.f20556g, 8388576));
                        } else {
                            i11++;
                            linkedHashMap2.put(str, C0832c.m2114a(c0832c4, null, null, c5292s0.f20551b, c5292s0.f20552c, c5292s0.f20556g, false, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, null, null, 8388579));
                        }
                    }
                    AbstractC4955ho.m9603m0(c0848s, interfaceC1809a1, AbstractC4166m.m8402K1(linkedHashMap2.values(), new C5051kn(new C4834e2(4), 1)));
                    Toast.makeText(context, (i10 <= 0 || i11 <= 0) ? i10 > 0 ? AbstractC0921a.m2250m(i10, "已添加 ", " 个会话") : AbstractC0921a.m2250m(i11, "已更新 ", " 个会话") : AbstractC0921a.m2248k(i10, i11, "已添加 ", " 个会话，更新 ", " 个会话"), 0).show();
                    interfaceC1809a12.setValue(c5096m2);
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C4918gk(Context context, InterfaceC1809a1 interfaceC1809a1, C0848s c0848s, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f17442g = i9;
        this.f17443h = context;
        this.f17444i = interfaceC1809a1;
        this.f17445j = c0848s;
        this.f17446k = interfaceC1809a12;
    }
}
