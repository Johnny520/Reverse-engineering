package p062L3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1924f;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import me.dartcv.nuke.R;
import p000A.C0071l;
import p021D3.C0274k;
import p026E3.C0286b;
import p044H3.AbstractC0648c;
import p047I0.C0755p0;
import p047I0.C0775z0;
import p056K2.C0887m;
import p104U3.EnumC1477a;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p136b0.C1843e;

/* JADX INFO: renamed from: L3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0991e extends AbstractC0648c {

    /* JADX INFO: renamed from: d */
    public static final C0991e f3061d = new C0991e(false);

    /* JADX INFO: renamed from: e */
    public static final int f3062e = R.string.chat_avatar_rotator;

    /* JADX INFO: renamed from: f */
    public static final EnumC1477a f3063f = EnumC1477a.f5163e;

    /* JADX INFO: renamed from: g */
    public static final String f3064g = "ChatAvatarRotator";

    /* JADX INFO: renamed from: h */
    public static final ArrayList f3065h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public static C0990d m2039i() {
        C0887m c0887m = C0274k.f881a;
        C0990d c0990d = (C0990d) C0274k.m467j().m448b("ChatAvatarRotator/config", AbstractC1922d.m3431l(C0990d.Companion.serializer()), new C0990d());
        return c0990d == null ? new C0990d() : c0990d;
    }

    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: c */
    public final String mo1118c() {
        return f3064g;
    }

    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: d */
    public final void mo1119d() {
        Constructor<?>[] constructors = AbstractC1924f.m3512z("com.tencent.mm.ui.chatting.view.ChattingAvatarImageView").getConstructors();
        AbstractC1665j.m2984d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            AbstractC1665j.m2982b(constructor);
            XC_MethodHook.Unhook unhookHookMethod = XposedBridge.hookMethod(constructor, new C0286b(null, f3061d, new C0071l(22)));
            AbstractC1665j.m2984d(unhookHookMethod, "hookMethod(...)");
            f3065h.add(unhookHookMethod);
        }
    }

    @Override // p044H3.AbstractC0646a
    /* JADX INFO: renamed from: e */
    public final void mo1120e() {
        ArrayList arrayList = f3065h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((XC_MethodHook.Unhook) it.next()).unhook();
        }
        arrayList.clear();
    }

    @Override // p044H3.AbstractC0648c
    /* JADX INFO: renamed from: f */
    public final int mo1122f() {
        return f3062e;
    }

    @Override // p044H3.AbstractC0648c
    /* JADX INFO: renamed from: g */
    public final EnumC1477a mo1123g() {
        return f3063f;
    }

    @Override // p044H3.AbstractC0648c
    /* JADX INFO: renamed from: h */
    public final void mo1124h(View view) {
        Activity activity;
        AbstractC1665j.m2985e(view, "v");
        Context context = view.getContext();
        AbstractC1665j.m2984d(context, "getContext(...)");
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                AbstractC1665j.m2984d(context, "getBaseContext(...)");
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        String strValueOf = String.valueOf(m2039i().f3060a);
        C1675t c1675t = new C1675t();
        C0755p0 c0755p0 = new C0755p0(activity);
        c0755p0.setViewCompositionStrategy(C0775z0.f2517e);
        c0755p0.setContent(new C1843e(-1419359716, true, new C0987a(strValueOf, c1675t, viewGroup, 1)));
        c1675t.f5710e = c0755p0;
        viewGroup.addView(c0755p0, new ViewGroup.LayoutParams(-1, -1));
    }
}
