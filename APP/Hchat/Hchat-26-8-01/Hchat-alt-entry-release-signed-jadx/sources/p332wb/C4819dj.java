package p332wb;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0106k;
import androidx.lifecycle.InterfaceC0110o;
import androidx.lifecycle.InterfaceC0112q;
import ba.EnumC0222b;
import ba.EnumC0234n;
import bsh.org.objectweb.asm.Opcodes;
import gg.C1421q;
import gg.C1422r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import okio.C3193a;
import p024b9.RunnableC0217c;
import p036c9.C0443h0;
import p051db.C0765c;
import p080fb.C1101a1;
import p080fb.C1107c;
import p080fb.C1113d1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p117i0.C1808a0;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p126ia.C2020n;
import p136j8.AbstractC2091b;
import p144k.C2209s1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p251r.C3623h;
import p256r6.C3709c;
import p256r6.EnumC3708b;
import p266s0.C3874d;
import p272s6.AbstractC3931b;
import p276sf.C3967n;
import p288tb.C4143c;
import p315v8.C4521a;
import p332wb.C5475xi;
import p332wb.C5538zh;
import p336wh.C5567d;
import p345x8.C5726s;
import p347xa.C5748i;
import p347xa.C5752m;
import p362y6.AbstractC5998b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.dj */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4819dj implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16647g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16648h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f16649i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16650j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4819dj(Object obj, InterfaceC1235p interfaceC1235p, C3709c c3709c, String str) {
        this.f16647g = 10;
        this.f16648h = obj;
        this.f16649i = interfaceC1235p;
        this.f16650j = c3709c;
    }

    /* JADX DEBUG: Class process forced to load method for inline: wb.y2.c2(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, fg.l, fg.a, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v35, resolved type: androidx.lifecycle.s */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.lifecycle.p, wh.b] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean z9;
        Sensor defaultSensor;
        boolean zBooleanValue;
        String str;
        String string;
        switch (this.f16647g) {
            case 0:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f16648h;
                C0765c c0765c = (C0765c) this.f16649i;
                List list = (List) this.f16650j;
                Long l10 = (Long) obj;
                l10.getClass();
                interfaceC1231l.invoke(AbstractC4955ho.m9637p7(c0765c, AbstractC4166m.m8398G1(list, l10)));
                break;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f16648h;
                Context context = (Context) this.f16649i;
                EnumC0234n enumC0234n = (EnumC0234n) this.f16650j;
                EnumC0222b enumC0222b = (EnumC0222b) obj;
                enumC0222b.getClass();
                int iOrdinal = enumC0222b.ordinal();
                if (iOrdinal == 0) {
                    interfaceC1220a.invoke();
                    Toast.makeText(context, enumC0234n.f615h.concat("已更新"), 0).show();
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                    } else {
                        Toast.makeText(context, "气泡图片无效或读取失败", 0).show();
                    }
                }
                break;
            case 2:
                C5726s c5726s = (C5726s) this.f16649i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f16648h;
                Context context2 = (Context) this.f16650j;
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(AbstractC4955ho.m9411P4(c5726s.f23314c), list2);
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayListM8397F1));
                Iterator it = arrayListM8397F1.iterator();
                while (it.hasNext()) {
                    AbstractC2091b.m5171r((String) it.next(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((String) obj2).length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
                if (!listM8407P1.isEmpty()) {
                    interfaceC1231l2.invoke(C5726s.m10397a(c5726s, 0, AbstractC4166m.m8392A1(listM8407P1, ";;;", null, null, null, 62), 0L, false, 27));
                    AbstractC4855en.m9271o("已选择 ", list2.size(), " 个文件", context2, 0);
                }
                break;
            case 3:
                C4521a c4521a = (C4521a) this.f16648h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f16649i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f16650j;
                Set set = (Set) obj;
                set.getClass();
                interfaceC1809a1.setValue(C4521a.m8946a(c4521a, null, false, false, null, null, null, set, false, 0L, false, null, false, null, 16255));
                interfaceC1809a12.setValue(EnumC4897g.f17315i);
                break;
            case 4:
                Context context3 = (Context) this.f16648h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f16649i;
                InterfaceC1220a interfaceC1220a3 = (InterfaceC1220a) this.f16650j;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19696W4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-646396665, new C0443h0(context3, interfaceC1220a2, interfaceC1220a3, 7), true), 3);
                break;
            case 5:
                C1113d1 c1113d1 = (C1113d1) this.f16648h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f16649i;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f16650j;
                ArrayList arrayListM9814Y = C5491y2.m9814Y(interfaceC1809a13, c1113d1, ((Integer) obj).intValue());
                if (arrayListM9814Y != null) {
                    interfaceC1809a13.setValue(arrayListM9814Y);
                    interfaceC1809a14.setValue(Boolean.TRUE);
                    z9 = true;
                } else {
                    z9 = false;
                }
                break;
            case 6:
                C2020n c2020n = (C2020n) this.f16648h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f16649i;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f16650j;
                ((C1808a0) obj).getClass();
                c2020n.invoke(new C5020jp(interfaceC1809a15, 23));
                break;
            case 7:
                Context context4 = (Context) this.f16648h;
                C1845j1 c1845j1 = (C1845j1) this.f16649i;
                C1845j1 c1845j12 = (C1845j1) this.f16650j;
                C1107c c1107c = (C1107c) AbstractC4166m.m8425w1(((Integer) obj).intValue(), (List) c1845j1.getValue());
                if (c1107c != null) {
                    String string2 = AbstractC3149m.m6703R0(c1107c.f3585b).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        Toast.makeText(context4, "当前消息没有可引用内容", 0).show();
                    } else {
                        c1845j12.setValue(new C1101a1(c1107c.f3596m, c1107c.f3584a, AbstractC3149m.m6701P0(C4143c.DEFAULT_HZ, string2)));
                    }
                }
                break;
            case 8:
                List list3 = (List) this.f16650j;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f16648h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f16649i;
                EnumC4993iv enumC4993iv = (EnumC4993iv) obj;
                enumC4993iv.getClass();
                interfaceC1809a17.setValue(enumC4993iv);
                if (enumC4993iv == EnumC4993iv.f18017m && AbstractC3149m.m6721t0((String) interfaceC1809a18.getValue())) {
                    String str2 = (String) AbstractC4166m.m8424v1(list3);
                    if (str2 == null) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    interfaceC1809a18.setValue(str2);
                }
                break;
            case 9:
                Context context5 = (Context) this.f16648h;
                InterfaceC0112q interfaceC0112q = (InterfaceC0112q) this.f16649i;
                InterfaceC1809a1 interfaceC1809a19 = (InterfaceC1809a1) this.f16650j;
                ((C1808a0) obj).getClass();
                Object systemService = context5.getSystemService("sensor");
                Sensor defaultSensor2 = null;
                SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                if (sensorManager != null && (defaultSensor = sensorManager.getDefaultSensor(15)) != null) {
                    defaultSensor2 = defaultSensor;
                } else if (sensorManager != null) {
                    defaultSensor2 = sensorManager.getDefaultSensor(11);
                }
                if (sensorManager != null && defaultSensor2 != null) {
                    C1422r c1422r = new C1422r();
                    C1422r c1422r2 = new C1422r();
                    C1422r c1422r3 = new C1422r();
                    C1422r c1422r4 = new C1422r();
                    final C1421q c1421q = new C1421q();
                    final C1421q c1421q2 = new C1421q();
                    final C5567d c5567d = new C5567d(new float[9], new float[3], c1421q, c1422r, c1422r2, c1422r3, c1422r4, interfaceC1809a19);
                    final Sensor sensor = defaultSensor2;
                    final SensorManager sensorManager2 = sensorManager;
                    ?? r72 = new InterfaceC0110o() { // from class: wh.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // androidx.lifecycle.InterfaceC0110o
                        /* JADX INFO: renamed from: b */
                        public final void mo548b(InterfaceC0112q interfaceC0112q2, EnumC0106k enumC0106k) {
                            int i9 = AbstractC5566c.f22674a[enumC0106k.ordinal()];
                            C1421q c1421q3 = c1421q2;
                            SensorManager sensorManager3 = sensorManager2;
                            C5567d c5567d2 = c5567d;
                            if (i9 == 1) {
                                if (c1421q3.f4734g) {
                                    return;
                                }
                                sensorManager3.registerListener(c5567d2, sensor, 1);
                                c1421q3.f4734g = true;
                                return;
                            }
                            if (i9 == 2 && c1421q3.f4734g) {
                                sensorManager3.unregisterListener(c5567d2);
                                c1421q3.f4734g = false;
                                c1421q.f4734g = false;
                            }
                        }
                    };
                    C0114s c0114sMo550f = interfaceC0112q.mo550f();
                    c0114sMo550f.m552a(r72);
                }
                break;
            case 10:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f16649i;
                C3709c c3709c = (C3709c) this.f16650j;
                Object obj3 = this.f16648h;
                if ((obj3 instanceof Collection) && ((Collection) obj3).isEmpty()) {
                    obj3 = null;
                }
                if (obj3 != null) {
                    zBooleanValue = ((Boolean) interfaceC1235p.invoke(obj3, obj)).booleanValue();
                    if (c3709c.f12065b != EnumC3708b.f12062i && AbstractC5998b.f24364a.ordinal() <= 0) {
                        String strM8122a = AbstractC3931b.m8122a(obj3);
                        if (strM8122a != null) {
                            AbstractC3156t.m6737a0(strM8122a.toString(), " (Kotlin reflection is not available)", HttpUrl.FRAGMENT_ENCODE_SET, false);
                        }
                        if (obj != null) {
                            AbstractC3156t.m6737a0(obj.toString(), " (Kotlin reflection is not available)", HttpUrl.FRAGMENT_ENCODE_SET, false);
                        }
                        AbstractC5998b.f24364a.ordinal();
                    }
                } else {
                    zBooleanValue = true;
                }
                break;
            case 11:
                final C5752m c5752m = (C5752m) this.f16648h;
                final C5748i c5748i = (C5748i) this.f16649i;
                Activity activity = c5748i.f23406a;
                WeChatContact weChatContact = (WeChatContact) this.f16650j;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    String str3 = weChatContact.remarkName;
                    c5752m.getClass();
                    if (C5752m.m10441a(activity)) {
                        final int i9 = 1;
                        C5491y2.m9824c2(activity, "修改好友备注", "留空并确定可清除备注", str3, "输入好友备注", 100, true, new InterfaceC1231l() { // from class: xa.e
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                String str4 = (String) obj4;
                                switch (i9) {
                                    case 0:
                                        str4.getClass();
                                        C5748i c5748i2 = c5748i;
                                        Activity activity2 = c5748i2.f23406a;
                                        C5752m c5752m2 = c5752m;
                                        c5752m2.m10447g(activity2, "正在创建并添加标签...", new C5538zh(c5752m2, c5748i2, str4));
                                        break;
                                    default:
                                        str4.getClass();
                                        C5748i c5748i3 = c5748i;
                                        c5752m.m10447g(c5748i3.f23406a, "正在修改好友备注...", new C5475xi(c5748i3, 26, str4));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        }, new C2209s1(7), Opcodes.ACC_INTERFACE);
                    }
                } else if (iIntValue == 1) {
                    c5752m.getClass();
                    if (C5752m.m10441a(activity)) {
                        new Thread(new RunnableC0217c(c5752m, C5491y2.m9813X1(activity, new C2209s1(7), "设置好友标签", "正在载入好友标签..."), activity, c5748i, 26), "Hchat-QuickContactLabels").start();
                    }
                } else if (iIntValue == 2) {
                    c5752m.getClass();
                    if (C5752m.m10441a(activity)) {
                        final int i10 = 0;
                        C5491y2.m9824c2(activity, "新建并添加标签", "标签创建后会自动添加给当前好友", null, "输入标签名称", 32, false, new InterfaceC1231l() { // from class: xa.e
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1231l
                            public final Object invoke(Object obj4) {
                                String str4 = (String) obj4;
                                switch (i10) {
                                    case 0:
                                        str4.getClass();
                                        C5748i c5748i2 = c5748i;
                                        Activity activity2 = c5748i2.f23406a;
                                        C5752m c5752m2 = c5752m;
                                        c5752m2.m10447g(activity2, "正在创建并添加标签...", new C5538zh(c5752m2, c5748i2, str4));
                                        break;
                                    default:
                                        str4.getClass();
                                        C5748i c5748i3 = c5748i;
                                        c5752m.m10447g(c5748i3.f23406a, "正在修改好友备注...", new C5475xi(c5748i3, 26, str4));
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        }, new C2209s1(7), 520);
                    }
                }
                break;
            default:
                C5752m c5752m2 = (C5752m) this.f16648h;
                C5748i c5748i2 = (C5748i) this.f16649i;
                List list4 = (List) this.f16650j;
                Set set2 = (Set) obj;
                set2.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    ContactLabelBean contactLabelBean = (ContactLabelBean) AbstractC4166m.m8425w1(((Number) it2.next()).intValue(), list4);
                    String str4 = null;
                    if (contactLabelBean != null && (str = contactLabelBean.labelName) != null && (string = AbstractC3149m.m6703R0(str).toString()) != null && string.length() > 0) {
                        str4 = string;
                    }
                    if (str4 != null) {
                        arrayList3.add(str4);
                    }
                }
                c5752m2.m10447g(c5748i2.f23406a, "正在更新好友标签...", new C5475xi(c5748i2, 25, arrayList3));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4819dj(Object obj, Object obj2, Object obj3, int i9) {
        this.f16647g = i9;
        this.f16648h = obj;
        this.f16649i = obj2;
        this.f16650j = obj3;
    }

    public /* synthetic */ C4819dj(List list, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f16647g = 8;
        this.f16650j = list;
        this.f16648h = interfaceC1809a1;
        this.f16649i = interfaceC1809a12;
    }

    public /* synthetic */ C4819dj(C5726s c5726s, InterfaceC1231l interfaceC1231l, Context context) {
        this.f16647g = 2;
        this.f16649i = c5726s;
        this.f16648h = interfaceC1231l;
        this.f16650j = context;
    }
}
