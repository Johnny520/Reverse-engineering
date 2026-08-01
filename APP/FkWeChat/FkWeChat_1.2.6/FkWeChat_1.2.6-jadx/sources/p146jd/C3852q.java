package p146jd;

import android.app.Activity;
import cd.C1517b;
import java.lang.reflect.Method;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.core.config.ConfigRepo;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2422b;
import p084fd.AbstractC2424d;
import p315vd.AbstractC8921a;

/* JADX INFO: renamed from: jd.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3852q extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Class f11036e;

    /* JADX INFO: renamed from: f */
    public Method f11037f;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m15282m(Activity activity) {
        try {
            Object objectField = AbstractC5161p.getObjectField(activity, "e");
            if (objectField != null) {
                AbstractC5161p.callMethod(objectField, "notifyDataSetChanged", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m15283n(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        ConfigRepo.setString(str, str2);
        final Activity activityM34259a = AbstractC8921a.m34259a();
        if (activityM34259a == null || !activityM34259a.getClass().getName().contains("SeeRoomMemberUI")) {
            return;
        }
        activityM34259a.runOnUiThread(new Runnable() { // from class: jd.p
            @Override // java.lang.Runnable
            public final void run() {
                C3852q.m15282m(activityM34259a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m15285p(InterfaceC5154i interfaceC5154i) {
        String str = (String) interfaceC5154i.getArgs()[0];
        if (m7967c("show_real_name", false)) {
            String strM8747t = (String) interfaceC5154i.getResult();
            Object thisObject = interfaceC5154i.getThisObject();
            if (str == null || str.isEmpty() || thisObject == null) {
                return;
            }
            final String strConcat = "real_name_".concat(str);
            String string = ConfigRepo.getString(strConcat, _UrlKt.FRAGMENT_ENCODE_SET);
            if (string.isEmpty()) {
                String str2 = (String) AbstractC5161p.getObjectField(thisObject, "field_chatroomname");
                if (str2 == null || str2.trim().isEmpty()) {
                    str2 = str;
                }
                if (str2.isEmpty()) {
                    return;
                }
                AbstractC2422b.m8721e(str2, str, new AbstractC2422b.a() { // from class: jd.o
                    @Override // p084fd.AbstractC2422b.a
                    /* JADX INFO: renamed from: a */
                    public final void mo8727a(String str3) {
                        C3852q.m15283n(strConcat, str3);
                    }
                });
                return;
            }
            if ((strM8747t != null && !strM8747t.trim().isEmpty()) || ((strM8747t = AbstractC2424d.m8747t(str)) != null && !strM8747t.trim().isEmpty())) {
                str = strM8747t;
            }
            interfaceC5154i.setResult(str + " (" + string + ")");
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        Class<?> cls = C1517b.findClass().usingStrings("RoomData.Member.DisplayName").get();
        this.f11036e = cls;
        if (cls != null) {
            this.f11037f = C1517b.findMethod().inClass(this.f11036e).modifiers(1).params("java.lang.String").returnType("java.lang.String").get();
        }
        return (this.f11036e == null || this.f11037f == null) ? false : true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(this.f11037f, new InterfaceC5156k() { // from class: jd.n
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f11033a.m15285p(interfaceC5154i);
            }
        });
    }
}
