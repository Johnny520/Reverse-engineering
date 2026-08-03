package p126ia;

import ac.AbstractC0063p;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p011ab.C0042b;
import p020b5.C0184c;
import p027c0.C0361f;
import p063e9.C0830a;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1634c;
import p108ha.C1651k0;
import p230p8.C3351d0;
import p230p8.C3357i;
import p230p8.C3358j;
import p230p8.C3363o;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: ia.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2027u extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C2007a0 f6852e;

    /* JADX INFO: renamed from: f */
    public C2014h f6853f;

    /* JADX INFO: renamed from: g */
    public C3363o f6854g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_fake_interaction";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("moments_fake_like", "朋友圈伪集赞", "长按朋友圈选择或凭空生成本地点赞", "practical"));
        m7751h(new C1651k0("moments_fake_comment", "朋友圈伪评论", "长按朋友圈添加带时间和顺序的本地评论", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo299g(C3742g c3742g) {
        boolean z9;
        int i9;
        Object c3959f;
        boolean zBooleanValue;
        c3742g.getClass();
        C0184c c0184c = new C0184c(c3742g.f12143a, 7);
        int i10 = 0;
        int i11 = 2;
        int i12 = 0;
        C2014h c2014h = new C2014h(c3742g, new C0042b(i11, this, AbstractC0921a.m2246i(C2027u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", i12, i10, 26));
        final C2007a0 c2007a0 = new C2007a0(c3742g, c0184c, c2014h, new C0042b(i11, this, AbstractC0921a.m2246i(C2027u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", i12, i10, 29));
        C2023q c2023q = new C2023q(c3742g.f12143a, c0184c, c2007a0, new C0042b(i11, this, AbstractC0921a.m2246i(C2027u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", i12, i10, 27));
        C3363o c3363o = new C3363o(c3742g, new C0042b(i11, this, AbstractC0921a.m2246i(C2027u.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", i12, i10, 28));
        this.f6853f = c2014h;
        this.f6852e = c2007a0;
        this.f6854g = c3363o;
        AbstractC0063p.f216b = c2007a0;
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi != null) {
            c3351d0SnsApi.m7080n(new C1634c(c2007a0, 4));
        }
        Set set = c2007a0.f6763f;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.plugin.sns.storage.SnsInfo", c3742g.f12145c);
        final int i13 = 0;
        int i14 = 1;
        if (clsLoadClass != null) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(clsLoadClass);
            ArrayList<Method> arrayList = new ArrayList();
            for (Object obj : listDeclaredMethods) {
                Method method = (Method) obj;
                if (!Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getName(), "convertFrom") && method.getParameterTypes().length == 1) {
                    Class<?> cls = method.getParameterTypes()[0];
                    if (Cursor.class.isAssignableFrom(cls) || ContentValues.class.isAssignableFrom(cls)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                i9 = 0;
            } else {
                i9 = 0;
                for (Method method2 : arrayList) {
                    if (set.add(method2)) {
                        try {
                            C3744i c3744i = C3744i.f12154b;
                            Method methodAccessible = KavaReflector.accessible(method2);
                            if (methodAccessible == null) {
                                methodAccessible = method2;
                            }
                            c3744i.m7763b(methodAccessible, new C2032z(c2007a0, i14));
                            c3959f = Boolean.TRUE;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            set.remove(method2);
                            c2007a0.f6761d.invoke("安装朋友圈伪互动记录Hook失败: " + method2.toGenericString(), thM8182b);
                            c3959f = Boolean.FALSE;
                        }
                        zBooleanValue = ((Boolean) c3959f).booleanValue();
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue && (i9 = i9 + 1) < 0) {
                        AbstractC0000a.m30P0();
                        throw null;
                    }
                }
            }
            z9 = i9 > 0;
        }
        if (!z9) {
            m7750e("朋友圈伪互动记录Hook未安装", null);
        }
        final SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_fake_interaction_config");
        C3358j c3358j = C3358j.f10833a;
        int i15 = 0;
        int i16 = 2;
        C3357i c3357i = new C3357i("moments_fake_like", 1212368460, "伪集赞[H]", 20, new C2024r(this, sharedPreferencesM8640c, i13), "icons_filled_like", new InterfaceC1220a() { // from class: ia.s
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C2007a0 c2007a02 = c2007a0;
                        SharedPreferences sharedPreferences = sharedPreferencesM8640c;
                        boolean z10 = false;
                        if (c2007a02.f6771n && !sharedPreferences.getBoolean("fake_like_hide_menu", false) && sharedPreferences.getBoolean("fake_like_enable", false)) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    default:
                        C2007a0 c2007a03 = c2007a0;
                        SharedPreferences sharedPreferences2 = sharedPreferencesM8640c;
                        boolean z11 = false;
                        if (c2007a03.f6771n && c2007a03.f6772o && !sharedPreferences2.getBoolean("fake_comment_hide_menu", false) && sharedPreferences2.getBoolean("fake_comment_enable", false)) {
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }, new C0361f(1, this, AbstractC0921a.m2246i(C2027u.class), "isNormalMomentsPost", "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z", 0, i15, 22), new C0042b(i16, c2023q, AbstractC0921a.m2246i(C2023q.class), "showFakeLikes", "showFakeLikes(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V", 0, 0, 24));
        ConcurrentHashMap concurrentHashMap = C3358j.f10834b;
        concurrentHashMap.put("moments_fake_like", c3357i);
        final int i17 = 1;
        concurrentHashMap.put("moments_fake_comment", new C3357i("moments_fake_comment", 1212368451, "伪评论[H]", 30, new C2024r(this, sharedPreferencesM8640c, i17), "icons_filled_comment", new InterfaceC1220a() { // from class: ia.s
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        C2007a0 c2007a02 = c2007a0;
                        SharedPreferences sharedPreferences = sharedPreferencesM8640c;
                        boolean z10 = false;
                        if (c2007a02.f6771n && !sharedPreferences.getBoolean("fake_like_hide_menu", false) && sharedPreferences.getBoolean("fake_like_enable", false)) {
                            z10 = true;
                        }
                        return Boolean.valueOf(z10);
                    default:
                        C2007a0 c2007a03 = c2007a0;
                        SharedPreferences sharedPreferences2 = sharedPreferencesM8640c;
                        boolean z11 = false;
                        if (c2007a03.f6771n && c2007a03.f6772o && !sharedPreferences2.getBoolean("fake_comment_hide_menu", false) && sharedPreferences2.getBoolean("fake_comment_enable", false)) {
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }, new C0361f(1, this, AbstractC0921a.m2246i(C2027u.class), "isNormalMomentsPost", "isNormalMomentsPost(Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)Z", 0, i15, 23), new C0042b(i16, c2023q, AbstractC0921a.m2246i(C2023q.class), "showFakeComments", "showFakeComments(Landroid/app/Activity;Lh/Hchat/hooks/api/sns/SnsContextMenuTarget;)V", 0, 0, 25)));
        C3740e.m7759f(12, new C0035c(this, 18, c3742g), "moments_fake_interaction_sns_menu", "朋友圈伪互动", null);
        m7752i(C1085e.class, new C0830a(this, 1, c3742g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈伪互动";
    }
}
