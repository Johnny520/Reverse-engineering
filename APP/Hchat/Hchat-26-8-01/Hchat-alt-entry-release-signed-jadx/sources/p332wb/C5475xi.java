package p332wb;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.widget.Toast;
import ci.C0575c;
import gb.C1379c;
import gb.C1384h;
import gb.C1391o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.HttpUrl;
import p036c9.C0467n0;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p080fb.C1099a;
import p080fb.C1107c;
import p080fb.C1113d1;
import p080fb.C1165q1;
import p080fb.C1168r0;
import p080fb.C1176t0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.C1836h0;
import p117i0.C1848k0;
import p117i0.InterfaceC1809a1;
import p127ib.C2034b;
import p159l0.AbstractC2428j;
import p159l0.C2425g;
import p159l0.C2426h;
import p210o8.C3086j;
import p218og.AbstractC3156t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p261rb.RunnableC3791g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3967n;
import p338x0.C5571a;
import p338x0.C5574d;
import p338x0.C5579i;
import p347xa.C5748i;
import p347xa.C5749j;
import p365y9.C6008d;
import p365y9.C6009e;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: wb.xi */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5475xi implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21942g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f21943h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f21944i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5475xi(Object obj, int i9, Object obj2) {
        this.f21942g = i9;
        this.f21943h = obj;
        this.f21944i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
    
        r6 = new p338x0.C5579i(java.lang.Integer.valueOf(r8), r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Map map;
        Object c3959f;
        ClipboardManager clipboardManager;
        C5579i c5579i;
        List listM8397F1;
        String strM3719c;
        switch (this.f21942g) {
            case 0:
                ((InterfaceC1231l) this.f21943h).invoke((EnumC4966i2) this.f21944i);
                break;
            case 1:
                ((InterfaceC1231l) this.f21943h).invoke((EnumC4704a3) this.f21944i);
                break;
            case 2:
                ((InterfaceC1231l) this.f21943h).invoke((EnumC5033k5) this.f21944i);
                break;
            case 3:
                ((InterfaceC1809a1) this.f21944i).setValue(new C5228q2(((C5195p2) ((AbstractC5261r2) this.f21943h)).f19924a));
                break;
            case 4:
                ((InterfaceC1231l) this.f21943h).invoke(((C5296s4) this.f21944i).f20566a);
                break;
            case 5:
                C5328t3 c5328t3 = (C5328t3) ((AbstractC5394v3) this.f21943h);
                ((InterfaceC1809a1) this.f21944i).setValue(new C5295s3(c5328t3.f20743a, c5328t3.f20744b));
                break;
            case 6:
                C3958e c3958e = (C3958e) this.f21943h;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f21944i;
                if (c3958e != null) {
                    interfaceC1235p.invoke(c3958e.f12961g, c3958e.f12962h);
                }
                return C3967n.f12976a;
            case 7:
                ((InterfaceC1231l) this.f21943h).invoke((C1384h) this.f21944i);
                break;
            case 8:
                C1391o c1391o = (C1391o) this.f21944i;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f21943h;
                if (c1391o != null) {
                    interfaceC1231l.invoke(c1391o);
                }
                return C3967n.f12976a;
            case 9:
                ((InterfaceC1231l) this.f21943h).invoke((C1379c) this.f21944i);
                break;
            case 10:
                C0859c0 c0859c0 = (C0859c0) this.f21943h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f21944i;
                Map map2 = (Map) interfaceC1809a1.getValue();
                String str = c0859c0.f2626a;
                map2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.remove(str);
                int size = linkedHashMap.size();
                if (size != 0) {
                    map = linkedHashMap;
                    if (size == 1) {
                        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                        mapSingletonMap.getClass();
                        map = mapSingletonMap;
                    }
                } else {
                    map = C4174u.f13711g;
                }
                interfaceC1809a1.setValue(map);
                break;
            case 11:
                ((InterfaceC1809a1) this.f21944i).setValue((C1391o) this.f21943h);
                break;
            case 12:
                ((InterfaceC1231l) this.f21943h).invoke(((C1099a) this.f21944i).f3540b);
                break;
            case 13:
                ((InterfaceC1231l) this.f21943h).invoke((C1113d1) this.f21944i);
                break;
            case 14:
                ((InterfaceC1809a1) this.f21944i).setValue(((C1113d1) this.f21943h).f3636a);
                break;
            case 15:
                ((InterfaceC1231l) this.f21943h).invoke((C1176t0) this.f21944i);
                break;
            case 16:
                ((InterfaceC1809a1) this.f21944i).setValue(((C1107c) this.f21943h).f3586c);
                break;
            case 17:
                List list = (List) this.f21944i;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f21943h;
                int size2 = list.size() + 1;
                String string = UUID.randomUUID().toString();
                string.getClass();
                interfaceC1231l2.invoke(AbstractC4166m.m8398G1(list, new C1168r0(AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false), AbstractC0921a.m2249l(size2, "MCP "), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true)));
                break;
            case 18:
                ((InterfaceC1809a1) this.f21944i).setValue((C1165q1) this.f21943h);
                break;
            case 19:
                ((InterfaceC1231l) this.f21943h).invoke(((C1165q1) this.f21944i).f3878e);
                break;
            case 20:
                Activity activity = (Activity) this.f21943h;
                String str2 = (String) this.f21944i;
                Object obj = C3967n.f12976a;
                try {
                    Object systemService = activity.getSystemService("clipboard");
                    clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (clipboardManager == null) {
                    throw new IllegalStateException("剪贴板服务不可用");
                }
                clipboardManager.setPrimaryClip(ClipData.newPlainText("检测到微信异常", str2));
                c3959f = obj;
                Toast.makeText(activity, !(c3959f instanceof C3959f) ? "异常日志已复制" : "复制失败，请稍后重试", 0).show();
                return obj;
            case 21:
                ((InterfaceC1231l) this.f21943h).invoke((Set) this.f21944i);
                break;
            case 22:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f21943h;
                C0467n0 c0467n0 = (C0467n0) this.f21944i;
                interfaceC1220a.invoke();
                c0467n0.invoke();
                break;
            case 23:
                ((InterfaceC1231l) this.f21943h).invoke((EnumC4993iv) this.f21944i);
                break;
            case 24:
                C1836h0 c1836h0 = ((C5574d) this.f21943h).f22701g;
                C2426h c2426h = c1836h0.f6099c;
                C2425g c2425gM5783d = c2426h.m5783d();
                int i9 = 0;
                while (true) {
                    try {
                        c5579i = null;
                        if (i9 < c2426h.f7950h) {
                            boolean zM5771l = c2425gM5783d.m5771l(i9);
                            Object obj2 = this.f21944i;
                            if (zM5771l) {
                                Object objM5773n = c2425gM5783d.m5773n(i9);
                                if (objM5773n != obj2) {
                                    C1848k0 c1848k0 = objM5773n instanceof C1848k0 ? (C1848k0) objM5773n : null;
                                    if ((c1848k0 != null ? c1848k0.f6147a : null) == obj2) {
                                    }
                                }
                            }
                            int[] iArr = c2425gM5783d.f7936b;
                            int i10 = i9 + 1;
                            int iM5788b = (i10 < c2425gM5783d.f7937c ? iArr[(i10 * 5) + 4] : c2425gM5783d.f7939e) - AbstractC2428j.m5788b(iArr, i9);
                            int i11 = 0;
                            while (i11 < iM5788b) {
                                Object objM5767h = c2425gM5783d.m5767h(i9, i11);
                                if (objM5767h != obj2) {
                                    C1848k0 c1848k02 = objM5767h instanceof C1848k0 ? (C1848k0) objM5767h : null;
                                    if ((c1848k02 != null ? c1848k02.f6147a : null) != obj2) {
                                        i11++;
                                    }
                                }
                                break;
                            }
                            i9 = i10;
                        }
                    } finally {
                    }
                    break;
                }
                C5579i c5579i2 = new C5579i(null, i9);
                c2425gM5783d.m5762c();
                c5579i = c5579i2;
                if (c5579i != null) {
                    int i12 = c5579i.f22705a;
                    Integer num = c5579i.f22706b;
                    C2425g c2425gM5783d2 = c2426h.m5783d();
                    try {
                        ArrayList arrayListM3582M = AbstractC1341a.m3582M(c2425gM5783d2, i12, num);
                        c2425gM5783d2.m5762c();
                        listM8397F1 = AbstractC4166m.m8397F1(arrayListM3582M, c1836h0.m4507I());
                    } finally {
                    }
                } else {
                    listM8397F1 = C4173t.f13710g;
                }
                return new C5571a(listM8397F1, c1836h0.f6078C);
            case 25:
                C5748i c5748i = (C5748i) this.f21943h;
                ArrayList arrayList = (ArrayList) this.f21944i;
                C1368i c1368iContacts = WeChatApis.contacts();
                boolean z9 = false;
                if (c1368iContacts != null) {
                    String str3 = c5748i.f23407b;
                    if (!TextUtils.isEmpty(str3)) {
                        String strM3723l = c1368iContacts.m3723l("rcontact", C1368i.f4537n);
                        boolean zM3717b = (TextUtils.isEmpty(strM3723l) || (strM3719c = c1368iContacts.m3719c(HttpUrl.FRAGMENT_ENCODE_SET, arrayList)) == null) ? false : c1368iContacts.m3717b(str3, strM3723l, strM3719c);
                        if (zM3717b) {
                            z9 = true;
                        }
                    }
                }
                return new C5749j(z9, z9 ? "好友标签已更新" : "更新好友标签失败");
            case 26:
                C5748i c5748i2 = (C5748i) this.f21943h;
                String str4 = (String) this.f21944i;
                C1368i c1368iContacts2 = WeChatApis.contacts();
                boolean z10 = false;
                if (c1368iContacts2 != null && c1368iContacts2.m3710Q(c5748i2.f23407b, str4)) {
                    z10 = true;
                }
                return new C5749j(z10, z10 ? "好友备注已更新" : "修改好友备注失败");
            case 27:
                AbstractC3603v.m7563q((InterfaceC3599t) this.f21944i, null, new C0575c((InterfaceC1231l) this.f21943h, null, 13), 3);
                break;
            default:
                C6009e c6009e = (C6009e) this.f21943h;
                C6008d c6008d = (C6008d) this.f21944i;
                C2034b c2034b = c6009e.f24391b;
                String strM4987a = C2034b.m4987a(c6008d.f24388a, c6008d.f24389b);
                if (strM4987a.length() != 0) {
                    c2034b.f6870a.edit().remove("custom_title_".concat(strM4987a)).remove("custom_color_".concat(strM4987a)).remove("custom_text_color_".concat(strM4987a)).apply();
                }
                C3086j c3086jTasks = WeChatApis.tasks();
                if (c3086jTasks != null) {
                    c3086jTasks.m6554e(new RunnableC3791g(c6009e, 22, c6008d));
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5475xi(Object obj, InterfaceC1231l interfaceC1231l, int i9) {
        this.f21942g = i9;
        this.f21944i = obj;
        this.f21943h = interfaceC1231l;
    }
}
