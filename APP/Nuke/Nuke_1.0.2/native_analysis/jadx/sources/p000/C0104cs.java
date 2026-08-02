package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: cs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0104cs extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0104cs f1702d = new C0104cs(false);

    /* JADX INFO: renamed from: e */
    public static final int f1703e = R.string.chat_avatar_rotator;

    /* JADX INFO: renamed from: f */
    public static final boolean f1704f = true;

    /* JADX INFO: renamed from: g */
    public static final wm0 f1705g = wm0.f12579m;

    /* JADX INFO: renamed from: h */
    public static final boolean f1706h = true;

    /* JADX INFO: renamed from: i */
    public static final String f1707i = "ChatAvatarRotator";

    /* JADX INFO: renamed from: q */
    public static C0066bs m884q() {
        pp1 pp1Var = pp1.f8445a;
        C0066bs c0066bs = (C0066bs) pp1.m3931c().m3605b(AbstractC0691se.m4815D(C0066bs.Companion.serializer()), new C0066bs(), "ChatAvatarRotator/config");
        return c0066bs == null ? new C0066bs() : c0066bs;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f1707i;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: e */
    public final boolean mo139e() {
        return f1706h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Constructor<?>[] constructors = up0.m5529H("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView").getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            constructor.getClass();
            XposedBridge.hookMethod(constructor, new kg3(f1702d, null, new C0829w(28))).getClass();
        }
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        m884q();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        String string = context.getString(R.string.chat_avatar_rotator_duration_summary, Long.valueOf(m884q().f1000a));
        string.getClass();
        return string;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f1704f;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f1703e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f1705g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: p */
    public final void mo323p(View view, xm0 xm0Var) {
        Activity activity;
        view.getClass();
        xm0Var.getClass();
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(-854319483, true, new C0866x(7, String.valueOf(m884q().f1000a), xm0Var))));
    }
}
