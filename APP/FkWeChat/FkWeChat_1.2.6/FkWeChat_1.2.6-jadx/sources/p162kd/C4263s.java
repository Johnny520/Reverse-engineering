package p162kd;

import android.view.View;
import cd.C1517b;
import java.lang.reflect.Method;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;

/* JADX INFO: renamed from: kd.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C4263s extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Class f12466e;

    /* JADX INFO: renamed from: f */
    public Method f12467f;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16754m(InterfaceC5154i interfaceC5154i) {
        String str;
        try {
            View view = (View) interfaceC5154i.getResult();
            if (view == null) {
                return;
            }
            Integer num = (Integer) interfaceC5154i.getArgs()[0];
            num.intValue();
            Object objCallMethod = AbstractC5161p.callMethod(interfaceC5154i.getThisObject(), "getItem", num);
            if (objCallMethod != null && (str = (String) AbstractC5161p.callMethod(objCallMethod, "j1", new Object[0])) != null && !str.isEmpty()) {
                View viewFindViewById = view.findViewById(2131315124);
                if (!str.equals("notifymessage") || viewFindViewById == null) {
                    return;
                }
                AbstractC5161p.callMethod(viewFindViewById, "setText", "泥嚎");
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f12466e = C1517b.findClass().usingStrings("[onClickItem] position:%s username:%s").superClass("android.widget.BaseAdapter").get();
        Method method = C1517b.findMethod().modifiers(1).inClass(this.f12466e).returnType("android.view.View").params("int", "android.view.View", "android.view.ViewGroup").get();
        this.f12467f = method;
        return (this.f12466e == null || method == null) ? false : true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(this.f12467f, new InterfaceC5156k() { // from class: kd.r
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                C4263s.m16754m(interfaceC5154i);
            }
        });
    }
}
