package p036c9;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p010aa.C0033a;
import p010aa.C0035c;
import p020b5.C0184c;
import p070f0.C0970b;
import p080fb.C1183v;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p211o9.C3104q;
import p211o9.C3105r;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p243q9.C3465a;
import p243q9.C3472h;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p307v0.C4362b;
import p307v0.InterfaceC4365e;
import p307v0.InterfaceC4366f;
import p307v0.InterfaceC4370j;
import p331wa.AbstractC4699j;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5065l4;
import p332wb.C4771c4;
import p332wb.C4849eh;
import p332wb.C4935h4;
import p332wb.C4936h5;
import p332wb.C4957hq;
import p332wb.C4999j4;
import p332wb.C5292s0;
import p332wb.C5384uq;
import p332wb.C5391v0;
import p332wb.C5491y2;
import p332wb.C5518yt;
import p332wb.EnumC5358u0;
import p345x8.C5725r;
import p345x8.C5728u;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4175v;

/* JADX INFO: renamed from: c9.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0475p0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1405g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1406h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1407i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1408j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1409k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1410l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1411m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0475p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f1405g = i9;
        this.f1406h = obj;
        this.f1407i = obj2;
        this.f1408j = obj3;
        this.f1409k = obj4;
        this.f1410l = obj5;
        this.f1411m = obj6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean z9;
        Object next;
        String str;
        switch (this.f1405g) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1406h;
                Activity activity = (Activity) this.f1407i;
                C0416a1 c0416a1 = (C0416a1) this.f1408j;
                FrameLayout frameLayout = (FrameLayout) this.f1409k;
                ViewGroup viewGroup = (ViewGroup) this.f1410l;
                C1425u c1425u = (C1425u) this.f1411m;
                if (atomicBoolean.compareAndSet(false, true)) {
                    C0482r0 c0482r0 = new C0482r0(c0416a1, frameLayout, viewGroup, activity, c1425u, 0);
                    if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
                        c0482r0.invoke();
                    } else {
                        activity.runOnUiThread(new RunnableC0003a(c0482r0, 4));
                    }
                }
                break;
            case 1:
                break;
            case 2:
                C4362b c4362b = (C4362b) this.f1406h;
                InterfaceC4370j interfaceC4370j = (InterfaceC4370j) this.f1407i;
                InterfaceC4366f interfaceC4366f = (InterfaceC4366f) this.f1408j;
                String str2 = (String) this.f1409k;
                Object[] objArr = (Object[]) this.f1411m;
                boolean z10 = true;
                if (c4362b.f14561h != interfaceC4366f) {
                    c4362b.f14561h = interfaceC4366f;
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (AbstractC1416l.m3825a(c4362b.f14562i, str2)) {
                    z10 = z9;
                } else {
                    c4362b.f14562i = str2;
                }
                c4362b.f14560g = interfaceC4370j;
                c4362b.f14563j = this.f1410l;
                c4362b.f14564k = objArr;
                InterfaceC4365e interfaceC4365e = c4362b.f14565l;
                if (interfaceC4365e != null && z10) {
                    ((C0184c) interfaceC4365e).m805Z();
                    c4362b.f14565l = null;
                    c4362b.m8801a();
                }
                break;
            case 3:
                Context context = (Context) this.f1406h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f1407i;
                C4936h5 c4936h5 = (C4936h5) this.f1408j;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f1411m;
                if (((Set) interfaceC1809a1.getValue()).isEmpty()) {
                    Toast.makeText(context, "请先选择模板", 0).show();
                } else {
                    ArrayList arrayList = c4936h5.f17527b;
                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C0033a.m290a((C0033a) it.next(), null, null, null, ((Boolean) interfaceC1809a12.getValue()).booleanValue(), (String) interfaceC1809a13.getValue(), (Set) interfaceC1809a1.getValue(), false, false, C4175v.f13712g, HttpUrl.FRAGMENT_ENCODE_SET, 15));
                    }
                    interfaceC1231l.invoke(arrayList2);
                }
                break;
            case 4:
                Context context2 = (Context) this.f1406h;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f1407i;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1410l;
                List list = (List) this.f1411m;
                if (AbstractC3149m.m6721t0((String) interfaceC1809a14.getValue())) {
                    Toast.makeText(context2, "请先选择模板", 0).show();
                } else if (((Set) interfaceC1809a15.getValue()).isEmpty()) {
                    Toast.makeText(context2, "请先选择群", 0).show();
                } else {
                    List<C5292s0> list2 = (List) interfaceC1809a16.getValue();
                    int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list2));
                    if (iM8438a0 < 16) {
                        iM8438a0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                    for (C5292s0 c5292s0 : list2) {
                        String str3 = c5292s0.f20550a;
                        String str4 = c5292s0.f20551b;
                        if (AbstractC3149m.m6721t0(str4)) {
                            str4 = c5292s0.f20550a;
                        }
                        linkedHashMap.put(str3, str4);
                    }
                    Set<String> set = (Set) interfaceC1809a15.getValue();
                    ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(set));
                    for (String str5 : set) {
                        String str6 = (String) linkedHashMap.get(str5);
                        if (str6 == null) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (AbstractC1416l.m3825a(((C3472h) next).f11264a, str5)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            C3472h c3472h = (C3472h) next;
                            str6 = c3472h != null ? c3472h.f11265b : null;
                            if (str6 == null) {
                                str6 = str5;
                            }
                        }
                        arrayList3.add(new C3472h(str5, str6, (String) interfaceC1809a14.getValue()));
                    }
                    interfaceC1231l2.invoke(arrayList3);
                }
                break;
            case 5:
                Context context3 = (Context) this.f1406h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1407i;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a110 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a111 = (InterfaceC1809a1) this.f1411m;
                Integer numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a17.getValue());
                Integer numM6742f02 = AbstractC3156t.m6742f0((String) interfaceC1809a18.getValue());
                int iIntValue = numM6742f02 != null ? numM6742f02.intValue() : 0;
                Integer numM6742f03 = AbstractC3156t.m6742f0((String) interfaceC1809a19.getValue());
                int iIntValue2 = numM6742f03 != null ? numM6742f03.intValue() : 0;
                if (numM6742f0 == null) {
                    Toast.makeText(context3, "Type 必须是数字", 0).show();
                } else {
                    AbstractC4699j.m9237a(AbstractC3149m.m6703R0((String) interfaceC1809a110.getValue()).toString(), numM6742f0.intValue(), iIntValue, iIntValue2, (String) interfaceC1809a111.getValue(), new C3465a(context3, 11));
                }
                break;
            case 6:
                C5292s0 c5292s02 = (C5292s0) this.f1406h;
                C5292s0 c5292s03 = (C5292s0) this.f1407i;
                String str7 = (String) this.f1408j;
                InterfaceC1809a1 interfaceC1809a112 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a113 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a114 = (InterfaceC1809a1) this.f1411m;
                if (c5292s02 == null) {
                    interfaceC1809a112.setValue(c5292s03);
                } else if (((Set) interfaceC1809a113.getValue()).contains(str7)) {
                    interfaceC1809a113.setValue(AbstractC4156d0.m8351S((Set) interfaceC1809a113.getValue(), str7));
                    interfaceC1809a114.setValue(Boolean.TRUE);
                } else {
                    interfaceC1809a113.setValue(AbstractC4156d0.m8354V((Set) interfaceC1809a113.getValue(), str7));
                    interfaceC1809a114.setValue(Boolean.TRUE);
                }
                break;
            case 7:
                InterfaceC1809a1 interfaceC1809a115 = (InterfaceC1809a1) this.f1406h;
                InterfaceC1809a1 interfaceC1809a116 = (InterfaceC1809a1) this.f1407i;
                InterfaceC1809a1 interfaceC1809a117 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a118 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a119 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a120 = (InterfaceC1809a1) this.f1411m;
                interfaceC1809a115.setValue(44);
                interfaceC1809a116.setValue("#FFFFFF");
                interfaceC1809a117.setValue(44);
                interfaceC1809a118.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                interfaceC1809a119.setValue(14);
                interfaceC1809a120.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 8:
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1406h;
                InterfaceC1809a1 interfaceC1809a121 = (InterfaceC1809a1) this.f1407i;
                InterfaceC1809a1 interfaceC1809a122 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a123 = (InterfaceC1809a1) this.f1409k;
                Context context4 = (Context) this.f1410l;
                InterfaceC1809a1 interfaceC1809a124 = (InterfaceC1809a1) this.f1411m;
                String str8 = (String) interfaceC1809a121.getValue();
                String str9 = (String) interfaceC1809a122.getValue();
                interfaceC1809a123.setValue("正在拉取模型...");
                AbstractC3603v.m7563q(interfaceC3599t, null, new C0970b(context4, str8, str9, interfaceC1809a124, interfaceC1809a123, null, 8), 3);
                break;
            case 9:
                C5725r c5725r = (C5725r) this.f1406h;
                Context context5 = (Context) this.f1407i;
                InterfaceC1809a1 interfaceC1809a125 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a126 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a127 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a128 = (InterfaceC1809a1) this.f1411m;
                List list3 = (List) interfaceC1809a125.getValue();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : list3) {
                    C5728u c5728u = (C5728u) obj;
                    if (!AbstractC1416l.m3825a(c5728u.f23333a, (String) interfaceC1809a126.getValue()) && !AbstractC1416l.m3825a(c5728u.f23333a, (String) interfaceC1809a127.getValue())) {
                        arrayList4.add(obj);
                    }
                }
                C5728u c5728u2 = (C5728u) AbstractC4166m.m8424v1(arrayList4);
                if (c5728u2 == null || (str = c5728u2.f23333a) == null) {
                    str = "默认配置";
                }
                c5725r.m10394n(str, arrayList4);
                interfaceC1809a125.setValue(c5725r.m10396p());
                interfaceC1809a126.setValue(c5725r.m10382b());
                interfaceC1809a128.setValue((String) interfaceC1809a126.getValue());
                Toast.makeText(context5, "已删除当前配置", 0).show();
                break;
            case 10:
                AbstractC5065l4 abstractC5065l4 = (AbstractC5065l4) this.f1406h;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f1407i;
                Context context6 = (Context) this.f1408j;
                InterfaceC1809a1 interfaceC1809a129 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a130 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a131 = (InterfaceC1809a1) this.f1411m;
                Set setM9715y6 = AbstractC4955ho.m9715y6((String) interfaceC1809a129.getValue());
                String str10 = ((C4999j4) abstractC5065l4).f18045a;
                interfaceC1809a129.setValue(AbstractC4955ho.m9316D5(AbstractC4156d0.m8351S(setM9715y6, str10)));
                List list4 = (List) interfaceC1809a130.getValue();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!AbstractC1416l.m3825a(((C3472h) obj2).f11264a, str10)) {
                        arrayList5.add(obj2);
                    }
                }
                interfaceC1809a130.setValue(arrayList5);
                AbstractC4955ho.m9581j5(sharedPreferences, str10, (String) interfaceC1809a129.getValue(), (List) interfaceC1809a130.getValue());
                Toast.makeText(context6, "群配置已删除", 0).show();
                interfaceC1809a131.setValue(C4935h4.f17523b);
                break;
            case 11:
                ((InterfaceC1809a1) this.f1411m).setValue(new C5391v0("选择适用聊天", EnumC5358u0.f20980i, true, HttpUrl.FRAGMENT_ENCODE_SET, new C4849eh((InterfaceC1809a1) this.f1406h, (InterfaceC1809a1) this.f1407i, (InterfaceC1809a1) this.f1408j, (SharedPreferences) this.f1409k, (InterfaceC1809a1) this.f1410l), true, Opcodes.CHECKCAST));
                break;
            case 12:
                C4771c4 c4771c4 = (C4771c4) this.f1406h;
                SharedPreferences sharedPreferences2 = (SharedPreferences) this.f1407i;
                Context context7 = (Context) this.f1408j;
                InterfaceC1809a1 interfaceC1809a132 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a133 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a134 = (InterfaceC1809a1) this.f1411m;
                int size = ((List) interfaceC1809a132.getValue()).size();
                int i9 = c4771c4.f16187a;
                if (i9 >= 0 && i9 < size) {
                    String str11 = ((C3104q) ((List) interfaceC1809a132.getValue()).get(i9)).f10045a;
                    ArrayList arrayListM8409R1 = AbstractC4166m.m8409R1((List) interfaceC1809a132.getValue());
                    arrayListM8409R1.remove(i9);
                    List list5 = (List) interfaceC1809a133.getValue();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : list5) {
                        if (!AbstractC1416l.m3825a(((C3105r) obj3).f10073c, str11)) {
                            arrayList6.add(obj3);
                        }
                    }
                    interfaceC1809a132.setValue(arrayListM8409R1);
                    interfaceC1809a133.setValue(arrayList6);
                    sharedPreferences2.edit().putString("group_member_reply_templates", AbstractC3754e0.m7861D(arrayListM8409R1)).putString("group_member_reply_template_bindings", AbstractC3754e0.m7858A(arrayList6)).apply();
                    Toast.makeText(context7, "模板已删除", 0).show();
                }
                interfaceC1809a134.setValue(null);
                break;
            case 13:
                C5384uq c5384uq = (C5384uq) this.f1406h;
                InterfaceC1809a1 interfaceC1809a135 = (InterfaceC1809a1) this.f1407i;
                InterfaceC1809a1 interfaceC1809a136 = (InterfaceC1809a1) this.f1408j;
                InterfaceC1809a1 interfaceC1809a137 = (InterfaceC1809a1) this.f1409k;
                SharedPreferences sharedPreferences3 = (SharedPreferences) this.f1410l;
                InterfaceC1809a1 interfaceC1809a138 = (InterfaceC1809a1) this.f1411m;
                int size2 = ((List) interfaceC1809a135.getValue()).size();
                int i10 = c5384uq.f21198a;
                if (i10 >= 0 && i10 < size2) {
                    String str12 = ((C2922j) ((List) interfaceC1809a135.getValue()).get(i10)).f9512a;
                    ArrayList arrayListM8409R12 = AbstractC4166m.m8409R1((List) interfaceC1809a135.getValue());
                    arrayListM8409R12.remove(i10);
                    List<C2921i> list6 = (List) interfaceC1809a136.getValue();
                    ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(list6));
                    for (C2921i c2921iM6338a : list6) {
                        if (AbstractC1416l.m3825a(c2921iM6338a.f9497e, str12)) {
                            c2921iM6338a = C2921i.m6338a(c2921iM6338a, null, null, null, false, HttpUrl.FRAGMENT_ENCODE_SET, 111);
                        }
                        arrayList7.add(c2921iM6338a);
                    }
                    String str13 = (String) interfaceC1809a137.getValue();
                    if (AbstractC1416l.m3825a(str13, str12) || arrayListM8409R12.isEmpty()) {
                        str13 = null;
                        if (str13 == null) {
                            C2922j c2922j = (C2922j) AbstractC4166m.m8424v1(arrayListM8409R12);
                            str13 = c2922j != null ? c2922j.f9512a : null;
                            if (str13 == null) {
                                str13 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                        }
                        interfaceC1809a135.setValue(arrayListM8409R12);
                        interfaceC1809a136.setValue(arrayList7);
                        interfaceC1809a137.setValue(str13);
                        AbstractC4955ho.m9473X2(sharedPreferences3, arrayListM8409R12, arrayList7, str13);
                    } else {
                        Iterator it3 = arrayListM8409R12.iterator();
                        while (it3.hasNext()) {
                            if (((C2922j) it3.next()).f9512a.equals(str13)) {
                                if (str13 == null) {
                                }
                                interfaceC1809a135.setValue(arrayListM8409R12);
                                interfaceC1809a136.setValue(arrayList7);
                                interfaceC1809a137.setValue(str13);
                                AbstractC4955ho.m9473X2(sharedPreferences3, arrayListM8409R12, arrayList7, str13);
                            }
                        }
                        str13 = null;
                        if (str13 == null) {
                        }
                        interfaceC1809a135.setValue(arrayListM8409R12);
                        interfaceC1809a136.setValue(arrayList7);
                        interfaceC1809a137.setValue(str13);
                        AbstractC4955ho.m9473X2(sharedPreferences3, arrayListM8409R12, arrayList7, str13);
                    }
                }
                interfaceC1809a138.setValue(null);
                break;
            case 14:
                C4957hq c4957hq = (C4957hq) this.f1406h;
                InterfaceC1809a1 interfaceC1809a139 = (InterfaceC1809a1) this.f1407i;
                SharedPreferences sharedPreferences4 = (SharedPreferences) this.f1408j;
                InterfaceC1809a1 interfaceC1809a140 = (InterfaceC1809a1) this.f1409k;
                InterfaceC1809a1 interfaceC1809a141 = (InterfaceC1809a1) this.f1410l;
                InterfaceC1809a1 interfaceC1809a142 = (InterfaceC1809a1) this.f1411m;
                int size3 = ((List) interfaceC1809a139.getValue()).size();
                int i11 = c4957hq.f17731a;
                if (i11 >= 0 && i11 < size3) {
                    ArrayList arrayListM8409R13 = AbstractC4166m.m8409R1((List) interfaceC1809a139.getValue());
                    arrayListM8409R13.remove(i11);
                    interfaceC1809a139.setValue(arrayListM8409R13);
                    AbstractC4955ho.m9481Y2(sharedPreferences4, interfaceC1809a140, interfaceC1809a139, interfaceC1809a141, null, arrayListM8409R13, null, 80);
                }
                interfaceC1809a142.setValue(null);
                break;
            case 15:
                C5491y2.m9827f0((InterfaceC3599t) this.f1406h, (InterfaceC1809a1) this.f1407i, (InterfaceC1809a1) this.f1408j, (C1183v) this.f1409k, (InterfaceC1809a1) this.f1410l, (InterfaceC1809a1) this.f1411m);
                break;
            case 16:
                C5491y2.m9836n1((AtomicBoolean) this.f1406h, (String) this.f1407i, (InterfaceC1809a1) this.f1408j, (Context) this.f1409k, (C5518yt) this.f1410l, (InterfaceC1809a1) this.f1411m);
                break;
            default:
                AbstractC3603v.m7563q((InterfaceC3599t) this.f1406h, null, new C0970b((InterfaceC1809a1) this.f1407i, (InterfaceC1809a1) this.f1408j, (C0035c) this.f1409k, (InterfaceC1809a1) this.f1410l, (InterfaceC1809a1) this.f1411m, null, 11), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
