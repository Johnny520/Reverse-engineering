package p332wb;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import gb.C1379c;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.json.JSONException;
import p007a7.AbstractC0018a;
import p009a9.C0026c;
import p011ab.C0045e;
import p036c9.C0416a1;
import p036c9.C0482r0;
import p051db.C0768f;
import p065eb.C0859c0;
import p080fb.C1113d1;
import p080fb.C1168r0;
import p080fb.EnumC1182u2;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p127ib.C2034b;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p266s0.C3874d;
import p276sf.C3959f;
import p276sf.C3967n;
import p315v8.C4521a;
import p343x6.AbstractC5700d;
import p345x8.C5726s;
import p345x8.C5728u;
import p346x9.C5738e;
import p347xa.C5748i;
import p347xa.C5749j;
import p347xa.C5752m;
import p357y1.C5868c1;
import p357y1.C5928r1;
import p365y9.C6008d;
import p365y9.C6009e;
import p365y9.C6010f;
import tf.C4173t;

/* JADX INFO: renamed from: wb.zh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5538zh implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22425g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f22426h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f22427i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f22428j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5538zh(C5752m c5752m, C5748i c5748i, String str) {
        this.f22425g = 15;
        this.f22426h = c5752m;
        this.f22428j = c5748i;
        this.f22427i = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws JSONException {
        Activity activity;
        Object c3959f;
        String strM3716a;
        Object c3959f2;
        Object c3959f3;
        String str;
        Activity activity2;
        Activity activity3;
        switch (this.f22425g) {
            case 0:
                String str2 = (String) this.f22427i;
                Context context = (Context) this.f22426h;
                ((InterfaceC1809a1) this.f22428j).setValue(str2);
                Toast.makeText(context, "已选择 " + str2, 0).show();
                break;
            case 1:
                C4521a c4521a = (C4521a) this.f22427i;
                Context context2 = (Context) this.f22426h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f22428j;
                Set<String> set = c4521a.f14901e;
                if ((set instanceof Collection) && set.isEmpty()) {
                    Toast.makeText(context2, "请先选择监听群聊", 0).show();
                } else {
                    for (String str3 : set) {
                        if (AbstractC3156t.m6733W(str3, "@chatroom", false) || AbstractC3156t.m6733W(str3, "@im.chatroom", false)) {
                            interfaceC1231l.invoke(c4521a);
                        }
                    }
                    Toast.makeText(context2, "请先选择监听群聊", 0).show();
                }
                return C3967n.f12976a;
            case 2:
                C5728u c5728u = (C5728u) this.f22427i;
                Context context3 = (Context) this.f22426h;
                ((InterfaceC1809a1) this.f22428j).setValue(c5728u.f23333a);
                Toast.makeText(context3, "已选择 " + c5728u.f23333a, 0).show();
                break;
            case 3:
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f22427i;
                C5726s c5726s = (C5726s) this.f22426h;
                interfaceC1231l2.invoke(new C4737b3(AbstractC4955ho.m9395N4(c5726s.f23313b), c5726s.f23314c, new C5047kj((InterfaceC1231l) this.f22428j, c5726s, 3), true, ";;;"));
                break;
            case 4:
                Context context4 = (Context) this.f22426h;
                C5726s c5726s2 = (C5726s) this.f22427i;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f22428j;
                Activity activity4 = context4 instanceof Activity ? (Activity) context4 : null;
                if (activity4 != null) {
                    C5192p c5192p = C5192p.f19533a;
                    int i9 = c5726s2.f23313b;
                    C4819dj c4819dj = new C4819dj(c5726s2, interfaceC1231l3, context4);
                    synchronized (c5192p) {
                        C5192p.f19535c = c4819dj;
                        C5192p.f19536d = activity4;
                        c5192p.m9736a(activity4.getClass());
                        c5192p.m9736a(Activity.class);
                        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("*/*");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.addFlags(1);
                        intent.addFlags(64);
                        AbstractC4955ho.m9299B4(activity4, intent);
                        try {
                            activity4.startActivityForResult(intent, 1212371543);
                        } catch (Throwable unused) {
                            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                            intent2.addCategory("android.intent.category.OPENABLE");
                            intent2.setType("*/*");
                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                            intent2.addFlags(1);
                            activity4.startActivityForResult(Intent.createChooser(intent2, AbstractC4955ho.m9395N4(i9)), 1212371543);
                        }
                        break;
                    }
                } else {
                    Toast.makeText(context4, "当前页面无法打开文件选择器", 0).show();
                }
                return C3967n.f12976a;
            case 5:
                Context context5 = (Context) this.f22426h;
                AbstractC4955ho.m9368K1((C5738e) this.f22427i, (InterfaceC1809a1) this.f22428j, C4173t.f13710g);
                Toast.makeText(context5, "已清空关键词", 0).show();
                break;
            case 6:
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f22427i;
                C1379c c1379c = (C1379c) this.f22426h;
                ((InterfaceC1809a1) this.f22428j).setValue(null);
                interfaceC1231l4.invoke(c1379c);
                break;
            case 7:
                Context context6 = (Context) this.f22426h;
                C0859c0 c0859c0 = (C0859c0) this.f22427i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f22428j;
                Context baseContext = context6;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = baseContext instanceof Activity ? (Activity) baseContext : null;
                    } else if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                if (activity != null) {
                    C4857ep c4857ep = C4857ep.f16968a;
                    C5053kp c5053kp = new C5053kp(c0859c0, interfaceC1809a1, 3);
                    synchronized (c4857ep) {
                        C4857ep.f16970c = new C4824dp(activity, c5053kp);
                        c4857ep.m9274a(activity.getClass());
                        c4857ep.m9274a(Activity.class);
                        Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent3.addCategory("android.intent.category.OPENABLE");
                        intent3.setType("*/*");
                        intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent3.addFlags(1);
                        intent3.addFlags(64);
                        AbstractC4955ho.m9299B4(activity, intent3);
                        try {
                            activity.startActivityForResult(intent3, 1212371551);
                        } catch (Throwable unused2) {
                            Intent intent4 = new Intent("android.intent.action.GET_CONTENT");
                            intent4.addCategory("android.intent.category.OPENABLE");
                            intent4.setType("*/*");
                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                            intent4.addFlags(1);
                            activity.startActivityForResult(Intent.createChooser(intent4, "选择插件附加文件"), 1212371551);
                        }
                        break;
                    }
                } else {
                    Toast.makeText(context6, "无法打开文件选择器", 0).show();
                }
                return C3967n.f12976a;
            case 8:
                C0045e c0045e = (C0045e) this.f22427i;
                ViewGroup viewGroup = (ViewGroup) this.f22426h;
                C1425u c1425u = (C1425u) this.f22428j;
                WeakHashMap weakHashMap = C4892fr.f17281c;
                synchronized (weakHashMap) {
                    Object obj = weakHashMap.get(viewGroup);
                    Object obj2 = c1425u.f4738g;
                    if (obj2 == null) {
                        AbstractC1416l.m3831g("handle");
                        throw null;
                    }
                    if (obj == ((ViewOnAttachStateChangeListenerC4826dr) obj2)) {
                        weakHashMap.remove(viewGroup);
                    }
                }
                c0045e.invoke();
                break;
            case 9:
                C1113d1 c1113d1 = (C1113d1) this.f22427i;
                Context context7 = (Context) this.f22426h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f22428j;
                if (c1113d1.f3648m) {
                    Toast.makeText(context7, "请先解锁该对话", 0).show();
                } else {
                    interfaceC1809a12.setValue(c1113d1.f3636a);
                }
                return C3967n.f12976a;
            case 10:
                InterfaceC1231l interfaceC1231l5 = (InterfaceC1231l) this.f22427i;
                List list = (List) this.f22426h;
                C1168r0 c1168r0 = (C1168r0) this.f22428j;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!((C1168r0) obj3).f3897a.equals(c1168r0.f3897a)) {
                        arrayList.add(obj3);
                    }
                }
                interfaceC1231l5.invoke(arrayList);
                break;
            case 11:
                C4731au c4731au = (C4731au) this.f22427i;
                C1845j1 c1845j1 = (C1845j1) this.f22426h;
                C1845j1 c1845j12 = (C1845j1) this.f22428j;
                c1845j1.setValue(Boolean.FALSE);
                c1845j12.setValue(null);
                c4731au.m9244a(EnumC1182u2.f3972g);
                break;
            case 12:
                InterfaceC1231l interfaceC1231l6 = (InterfaceC1231l) this.f22427i;
                C1113d1 c1113d12 = (C1113d1) this.f22426h;
                ((InterfaceC1809a1) this.f22428j).setValue(null);
                interfaceC1231l6.invoke(c1113d12);
                break;
            case 13:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f22427i;
                InterfaceC1231l interfaceC1231l7 = (InterfaceC1231l) this.f22426h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f22428j;
                if (atomicBoolean.compareAndSet(false, true)) {
                    interfaceC1231l7.invoke(Boolean.FALSE);
                }
                interfaceC1220a.invoke();
                break;
            case 14:
                C5752m c5752m = (C5752m) this.f22427i;
                Activity activity5 = (Activity) this.f22426h;
                String str4 = ((C5749j) this.f22428j).f23410b;
                c5752m.getClass();
                if (C5752m.m10441a(activity5)) {
                    Toast.makeText(activity5, str4, 0).show();
                }
                return C3967n.f12976a;
            case 15:
                C5752m c5752m2 = (C5752m) this.f22426h;
                C5748i c5748i = (C5748i) this.f22428j;
                String str5 = (String) this.f22427i;
                String str6 = c5748i.f23407b;
                c5752m2.getClass();
                Object obj4 = C4173t.f13710g;
                C1368i c1368iContacts = WeChatApis.contacts();
                if (c1368iContacts == null) {
                    return new C5749j(false, "联系人标签不可用");
                }
                try {
                    c3959f = c1368iContacts.m3727p();
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = obj4;
                }
                List list2 = (List) c3959f;
                if (list2.isEmpty()) {
                    strM3716a = c1368iContacts.m3716a(str5);
                    strM3716a.getClass();
                    if (!AbstractC3149m.m6721t0(strM3716a)) {
                        return new C5749j(false, "创建好友标签失败");
                    }
                    int i10 = 0;
                    while (i10 < 15) {
                        if (!list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                if (AbstractC1416l.m3825a(((ContactLabelBean) it.next()).labelName, str5)) {
                                }
                            }
                        }
                        i10++;
                        try {
                            Thread.sleep(1000L);
                            break;
                        } catch (Throwable unused3) {
                        }
                        try {
                            c3959f2 = c1368iContacts.m3727p();
                        } catch (Throwable th3) {
                            c3959f2 = new C3959f(th3);
                        }
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = obj4;
                        }
                        list2 = (List) c3959f2;
                        break;
                    }
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC1416l.m3825a(((ContactLabelBean) it2.next()).labelName, str5)) {
                        }
                    }
                    strM3716a = c1368iContacts.m3716a(str5);
                    strM3716a.getClass();
                    if (!AbstractC3149m.m6721t0(strM3716a)) {
                    }
                }
                if (!list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC1416l.m3825a(((ContactLabelBean) it3.next()).labelName, str5)) {
                            try {
                                c3959f3 = Boolean.valueOf(c1368iContacts.m3708O(str6, str5));
                                break;
                            } catch (Throwable th4) {
                                c3959f3 = new C3959f(th4);
                            }
                            Object obj5 = Boolean.FALSE;
                            if (c3959f3 instanceof C3959f) {
                                c3959f3 = obj5;
                            }
                            boolean zBooleanValue = ((Boolean) c3959f3).booleanValue();
                            return new C5749j(zBooleanValue, zBooleanValue ? "标签已创建并添加" : "添加好友标签失败");
                        }
                    }
                }
                return new C5749j(false, "标签尚未同步，请稍后重试");
            default:
                C6009e c6009e = (C6009e) this.f22427i;
                C0026c c0026c = (C0026c) this.f22426h;
                C6008d c6008d = (C6008d) this.f22428j;
                String str7 = c6008d.f24389b;
                String str8 = c6008d.f24388a;
                TextView textView = c0026c.f82a;
                SharedPreferences sharedPreferences = c6009e.f24391b.f6870a;
                String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
                C1363d c1363dM5159f = AbstractC2091b.m5159f();
                if (c1363dM5159f != null) {
                    int iM3678j = c1363dM5159f.m3678j(str8, str7);
                    str = iM3678j == 2 ? "群主" : iM3678j == 1 ? "管理员" : "群员";
                } else {
                    str = null;
                }
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String string = sharedPreferences.getString("custom_title_".concat(C2034b.m4987a(str8, str7)), HttpUrl.FRAGMENT_ENCODE_SET);
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM247k = AbstractC0018a.m247k(string);
                String string2 = sharedPreferences.getString("custom_color_".concat(C2034b.m4987a(str8, str7)), HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                C6010f c6010fM219G = AbstractC0018a.m219G(string2);
                String strM10770a = c6010fM219G != null ? c6010fM219G.m10770a() : null;
                String str9 = strM10770a == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM10770a;
                String string3 = sharedPreferences.getString("custom_text_color_".concat(C2034b.m4987a(str8, str7)), HttpUrl.FRAGMENT_ENCODE_SET);
                if (string3 == null) {
                    string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                C6010f c6010fM219G2 = AbstractC0018a.m219G(string3);
                String strM10770a2 = c6010fM219G2 != null ? c6010fM219G2.m10770a() : null;
                String str10 = strM10770a2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM10770a2;
                if (str.length() > 0) {
                    strConcat = " · ".concat(str);
                }
                String strConcat2 = str7.concat(strConcat);
                C0768f c0768f = new C0768f(c6009e, 22, c6008d);
                C5475xi c5475xi = new C5475xi(c6009e, 28, c6008d);
                Context context8 = textView.getContext();
                while (true) {
                    if (context8 instanceof ContextWrapper) {
                        if (context8 instanceof Activity) {
                            activity3 = (Activity) context8;
                        } else {
                            context8 = ((ContextWrapper) context8).getBaseContext();
                        }
                    } else if (context8 instanceof Activity) {
                        activity3 = (Activity) context8;
                    } else {
                        activity2 = null;
                    }
                    break;
                }
                if (activity2 != null) {
                    Window window = activity2.getWindow();
                    View decorView = window != null ? window.getDecorView() : null;
                    ViewGroup viewGroup2 = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                    if (viewGroup2 != null) {
                        C0416a1 c0416a1 = new C0416a1(3);
                        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                        FrameLayout frameLayout = new FrameLayout(activity2);
                        frameLayout.setBackgroundColor(0);
                        frameLayout.setClickable(true);
                        frameLayout.setFocusable(true);
                        frameLayout.setFocusableInTouchMode(true);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        AbstractC5700d.m10251H(viewGroup2, c0416a1, c0416a1, c0416a1, c0416a1);
                        AbstractC5700d.m10251H(frameLayout, c0416a1, c0416a1, c0416a1, c0416a1);
                        C0114s c0114s = c0416a1.f1194h;
                        if (!c0416a1.f1198l) {
                            c0416a1.f1195i.m7017F(Bundle.EMPTY);
                            c0416a1.f1198l = true;
                        }
                        EnumC0107l enumC0107l = EnumC0107l.f291i;
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(enumC0107l);
                        EnumC0107l enumC0107l2 = EnumC0107l.f292j;
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(enumC0107l2);
                        EnumC0107l enumC0107l3 = EnumC0107l.f293k;
                        c0114s.m554c("setCurrentState");
                        c0114s.m556e(enumC0107l3);
                        C1425u c1425u2 = new C1425u();
                        C0482r0 c0482r0 = new C0482r0(atomicBoolean2, frameLayout, viewGroup2, c0416a1, c1425u2, 7);
                        C5868c1 c5868c1 = new C5868c1(activity2);
                        AbstractC5700d.m10251H(c5868c1, c0416a1, c0416a1, c0416a1, c0416a1);
                        c5868c1.setViewCompositionStrategy(C5928r1.f24042h);
                        c5868c1.setContent(new C3874d(-63225563, new C4772c5(c0416a1, activity2, strM247k, str9, str10, strConcat2, c0482r0, c0768f, c5475xi, 0), true));
                        c1425u2.f4738g = c5868c1;
                        frameLayout.addView(c5868c1, new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(frameLayout);
                        frameLayout.requestFocus();
                    }
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5538zh(Object obj, Object obj2, Object obj3, int i9) {
        this.f22425g = i9;
        this.f22427i = obj;
        this.f22426h = obj2;
        this.f22428j = obj3;
    }

    public /* synthetic */ C5538zh(int i9, Context context, Object obj, Object obj2) {
        this.f22425g = i9;
        this.f22426h = context;
        this.f22427i = obj;
        this.f22428j = obj2;
    }
}
