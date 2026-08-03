package p109hb;

import android.app.Activity;
import android.os.Handler;
import ca.C0529p;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p222p.AbstractC3199a;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.C5026jv;
import p332wb.C5491y2;
import p332wb.InterfaceC5059kv;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hb.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1678f0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5554g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f5555h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f5556i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1684i0 f5557j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0126e f5558k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1678f0(Activity activity, List list, C1684i0 c1684i0, C0126e c0126e) {
        this.f5554g = 1;
        this.f5555h = activity;
        this.f5556i = list;
        this.f5557j = c1684i0;
        this.f5558k = c0126e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean z9;
        Activity activity;
        int i9;
        String strM4293j;
        switch (this.f5554g) {
            case 0:
                Activity activity2 = this.f5555h;
                C1684i0 c1684i0 = this.f5557j;
                List list = this.f5556i;
                C0126e c0126e = this.f5558k;
                int iIntValue = ((Integer) obj).intValue();
                if (!activity2.isFinishing()) {
                    if (iIntValue == 0) {
                        c1684i0.getClass();
                        c1684i0.m4287d(activity2, new C1678f0(3, activity2, c0126e, c1684i0, list), "选择群发对象", "发送", false);
                    } else {
                        List listM4305o = c1684i0.f5590i.m4305o(list);
                        if (listM4305o.isEmpty()) {
                            String strM4293j2 = C1687k.m4293j(list);
                            if (strM4293j2 != null) {
                                c1684i0.m4288e(activity2, strM4293j2);
                            } else {
                                c1684i0.m4287d(activity2, new C1678f0(2, activity2, c0126e, c1684i0, list), "选择官方群发好友", "发送", true);
                            }
                        } else {
                            c1684i0.m4288e(activity2, "原生群发不支持: ".concat(AbstractC4166m.m8392A1(listM4305o, "、", null, null, null, 62)));
                        }
                    }
                }
                break;
            case 1:
                Activity activity3 = this.f5555h;
                List list2 = this.f5556i;
                C1684i0 c1684i02 = this.f5557j;
                C0126e c0126e2 = this.f5558k;
                int iIntValue2 = ((Integer) obj).intValue();
                if (!activity3.isFinishing()) {
                    if (iIntValue2 == 1) {
                        z9 = false;
                        activity = activity3;
                        i9 = 1;
                    } else {
                        z9 = false;
                        activity = activity3;
                        i9 = 0;
                    }
                    if (list2.isEmpty()) {
                        strM4293j = "请选择发送内容";
                    } else {
                        C1688k0 c1688k0 = AbstractC0000a.f0g;
                        if (c1688k0 == null) {
                            strM4293j = "群发助手尚未就绪";
                        } else if (i9 != 1) {
                            strM4293j = null;
                        } else if (c1688k0.f5612c.m4300g()) {
                            List listM4305o2 = c1688k0.f5612c.m4305o(list2);
                            if (listM4305o2.isEmpty()) {
                                c1688k0.f5612c.getClass();
                                strM4293j = C1687k.m4293j(list2);
                            } else {
                                strM4293j = "微信原生群发助手不支持: ".concat(AbstractC4166m.m8392A1(listM4305o2, "、", null, null, null, 62));
                            }
                        } else {
                            strM4293j = "微信原生群发助手通道不可用";
                        }
                    }
                    if (strM4293j != null) {
                        c1684i02.m4288e(activity, strM4293j);
                    } else {
                        c1684i02.getClass();
                        if (i9 == 1) {
                            z9 = true;
                        }
                        c1684i02.m4287d(activity, new C1700w(i9, activity, c0126e2, c1684i02, list2), z9 ? "选择定时群发好友" : "选择定时发送对象", "下一步", z9);
                    }
                }
                break;
            case 2:
                final Activity activity4 = this.f5555h;
                final C1684i0 c1684i03 = this.f5557j;
                List list3 = this.f5556i;
                C0126e c0126e3 = this.f5558k;
                List list4 = (List) obj;
                list4.getClass();
                C1425u c1425u = new C1425u();
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final InterfaceC5059kv interfaceC5059kvM9813X1 = AbstractC4302b.m8640c(activity4, "Hchat_selected_messages_config").getBoolean("selected_messages_background_silent_send", false) ? null : C5491y2.m9813X1(activity4, new C0529p(atomicBoolean, c1425u, 3), "微信原生群发助手", "正在发送...");
                C1687k c1687k = c1684i03.f5590i;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list4));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C5026jv) it.next()).f18249a);
                }
                final int i10 = 1;
                C1696s c1696sM4299f = c1687k.m4299f(list3, arrayList, new InterfaceC1236q() { // from class: hb.y
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                        int i11 = i10;
                        final int iIntValue3 = ((Integer) obj2).intValue();
                        final int iIntValue4 = ((Integer) obj3).intValue();
                        final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        switch (i11) {
                            case 0:
                                final C1684i0 c1684i04 = c1684i03;
                                Handler handler = c1684i04.f5584c;
                                final int i12 = 1;
                                final AtomicBoolean atomicBoolean2 = atomicBoolean;
                                final InterfaceC5059kv interfaceC5059kv = interfaceC5059kvM9813X1;
                                final Activity activity5 = activity4;
                                handler.post(new Runnable() { // from class: hb.b0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                atomicBoolean2.set(true);
                                                InterfaceC5059kv interfaceC5059kv2 = interfaceC5059kv;
                                                if (interfaceC5059kv2 != null) {
                                                    interfaceC5059kv2.close();
                                                }
                                                boolean z10 = zBooleanValue;
                                                int i13 = iIntValue3;
                                                int i14 = iIntValue4;
                                                c1684i04.m4288e(activity5, AbstractC3199a.m6837j(i13, z10 ? "原生群发已取消: " : i13 == i14 ? "原生群发完成: " : "原生群发部分失败: ", "/", i14));
                                                break;
                                            default:
                                                atomicBoolean2.set(true);
                                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv;
                                                if (interfaceC5059kv3 != null) {
                                                    interfaceC5059kv3.close();
                                                }
                                                boolean z11 = zBooleanValue;
                                                int i15 = iIntValue3;
                                                int i16 = iIntValue4;
                                                c1684i04.m4288e(activity5, AbstractC3199a.m6837j(i15, z11 ? "模块群发已取消: " : i15 == i16 ? "模块群发完成: " : "模块群发部分失败: ", "/", i16));
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final C1684i0 c1684i05 = c1684i03;
                                Handler handler2 = c1684i05.f5584c;
                                final int i13 = 0;
                                final AtomicBoolean atomicBoolean3 = atomicBoolean;
                                final InterfaceC5059kv interfaceC5059kv2 = interfaceC5059kvM9813X1;
                                final Activity activity6 = activity4;
                                handler2.post(new Runnable() { // from class: hb.b0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                atomicBoolean3.set(true);
                                                InterfaceC5059kv interfaceC5059kv22 = interfaceC5059kv2;
                                                if (interfaceC5059kv22 != null) {
                                                    interfaceC5059kv22.close();
                                                }
                                                boolean z10 = zBooleanValue;
                                                int i132 = iIntValue3;
                                                int i14 = iIntValue4;
                                                c1684i05.m4288e(activity6, AbstractC3199a.m6837j(i132, z10 ? "原生群发已取消: " : i132 == i14 ? "原生群发完成: " : "原生群发部分失败: ", "/", i14));
                                                break;
                                            default:
                                                atomicBoolean3.set(true);
                                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv2;
                                                if (interfaceC5059kv3 != null) {
                                                    interfaceC5059kv3.close();
                                                }
                                                boolean z11 = zBooleanValue;
                                                int i15 = iIntValue3;
                                                int i16 = iIntValue4;
                                                c1684i05.m4288e(activity6, AbstractC3199a.m6837j(i15, z11 ? "模块群发已取消: " : i15 == i16 ? "模块群发完成: " : "模块群发部分失败: ", "/", i16));
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                        return C3967n.f12976a;
                    }
                });
                c1425u.f4738g = c1696sM4299f;
                if (c1696sM4299f == null) {
                    atomicBoolean.set(true);
                    if (interfaceC5059kvM9813X1 != null) {
                        interfaceC5059kvM9813X1.close();
                    }
                    c1684i03.m4288e(activity4, "微信原生群发助手启动失败");
                } else {
                    c0126e3.m640r(c1684i03.f5583b);
                    c1684i03.m4288e(activity4, "已开始微信原生群发");
                }
                break;
            default:
                final Activity activity5 = this.f5555h;
                final C1684i0 c1684i04 = this.f5557j;
                List list5 = this.f5556i;
                C0126e c0126e4 = this.f5558k;
                List list6 = (List) obj;
                list6.getClass();
                C1425u c1425u2 = new C1425u();
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final InterfaceC5059kv interfaceC5059kvM9813X12 = AbstractC4302b.m8640c(activity5, "Hchat_selected_messages_config").getBoolean("selected_messages_background_silent_send", false) ? null : C5491y2.m9813X1(activity5, new C0529p(atomicBoolean2, c1425u2, 2), "模块群发", "正在发送...");
                C1695r c1695r = c1684i04.f5588g;
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list6));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C5026jv) it2.next()).f18249a);
                }
                final int i11 = 0;
                InterfaceC1236q interfaceC1236q = new InterfaceC1236q() { // from class: hb.y
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1236q
                    /* JADX INFO: renamed from: b */
                    public final Object mo734b(Object obj2, Object obj3, Object obj4) {
                        int i112 = i11;
                        final int iIntValue3 = ((Integer) obj2).intValue();
                        final int iIntValue4 = ((Integer) obj3).intValue();
                        final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        switch (i112) {
                            case 0:
                                final C1684i0 c1684i042 = c1684i04;
                                Handler handler = c1684i042.f5584c;
                                final int i12 = 1;
                                final AtomicBoolean atomicBoolean22 = atomicBoolean2;
                                final InterfaceC5059kv interfaceC5059kv = interfaceC5059kvM9813X12;
                                final Activity activity52 = activity5;
                                handler.post(new Runnable() { // from class: hb.b0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i12) {
                                            case 0:
                                                atomicBoolean22.set(true);
                                                InterfaceC5059kv interfaceC5059kv22 = interfaceC5059kv;
                                                if (interfaceC5059kv22 != null) {
                                                    interfaceC5059kv22.close();
                                                }
                                                boolean z10 = zBooleanValue;
                                                int i132 = iIntValue3;
                                                int i14 = iIntValue4;
                                                c1684i042.m4288e(activity52, AbstractC3199a.m6837j(i132, z10 ? "原生群发已取消: " : i132 == i14 ? "原生群发完成: " : "原生群发部分失败: ", "/", i14));
                                                break;
                                            default:
                                                atomicBoolean22.set(true);
                                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv;
                                                if (interfaceC5059kv3 != null) {
                                                    interfaceC5059kv3.close();
                                                }
                                                boolean z11 = zBooleanValue;
                                                int i15 = iIntValue3;
                                                int i16 = iIntValue4;
                                                c1684i042.m4288e(activity52, AbstractC3199a.m6837j(i15, z11 ? "模块群发已取消: " : i15 == i16 ? "模块群发完成: " : "模块群发部分失败: ", "/", i16));
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final C1684i0 c1684i05 = c1684i04;
                                Handler handler2 = c1684i05.f5584c;
                                final int i13 = 0;
                                final AtomicBoolean atomicBoolean3 = atomicBoolean2;
                                final InterfaceC5059kv interfaceC5059kv2 = interfaceC5059kvM9813X12;
                                final Activity activity6 = activity5;
                                handler2.post(new Runnable() { // from class: hb.b0
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i13) {
                                            case 0:
                                                atomicBoolean3.set(true);
                                                InterfaceC5059kv interfaceC5059kv22 = interfaceC5059kv2;
                                                if (interfaceC5059kv22 != null) {
                                                    interfaceC5059kv22.close();
                                                }
                                                boolean z10 = zBooleanValue;
                                                int i132 = iIntValue3;
                                                int i14 = iIntValue4;
                                                c1684i05.m4288e(activity6, AbstractC3199a.m6837j(i132, z10 ? "原生群发已取消: " : i132 == i14 ? "原生群发完成: " : "原生群发部分失败: ", "/", i14));
                                                break;
                                            default:
                                                atomicBoolean3.set(true);
                                                InterfaceC5059kv interfaceC5059kv3 = interfaceC5059kv2;
                                                if (interfaceC5059kv3 != null) {
                                                    interfaceC5059kv3.close();
                                                }
                                                boolean z11 = zBooleanValue;
                                                int i15 = iIntValue3;
                                                int i16 = iIntValue4;
                                                c1684i05.m4288e(activity6, AbstractC3199a.m6837j(i15, z11 ? "模块群发已取消: " : i15 == i16 ? "模块群发完成: " : "模块群发部分失败: ", "/", i16));
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                        return C3967n.f12976a;
                    }
                };
                c1695r.getClass();
                C1696s c1696sM4323g = c1695r.m4323g(list5, arrayList2, interfaceC1236q);
                c1425u2.f4738g = c1696sM4323g;
                if (c1696sM4323g == null) {
                    atomicBoolean2.set(true);
                    if (interfaceC5059kvM9813X12 != null) {
                        interfaceC5059kvM9813X12.close();
                    }
                    c1684i04.m4288e(activity5, "模块群发启动失败");
                } else {
                    c0126e4.m640r(c1684i04.f5583b);
                    c1684i04.m4288e(activity5, "已开始模块群发");
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1678f0(int i9, Activity activity, C0126e c0126e, C1684i0 c1684i0, List list) {
        this.f5554g = i9;
        this.f5555h = activity;
        this.f5557j = c1684i0;
        this.f5556i = list;
        this.f5558k = c0126e;
    }
}
