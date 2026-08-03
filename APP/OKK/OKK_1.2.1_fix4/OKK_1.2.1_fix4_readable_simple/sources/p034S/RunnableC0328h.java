package p034S;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.abc.core.features.C0581D1;
import com.abc.core.features.C0588G;
import com.abc.core.features.C0613O0;
import com.abc.core.features.C0615P;
import com.abc.core.features.RealNameTailHook;
import com.abc.core.features.ViewTreeObserverOnPreDrawListenerC0587F1;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.runtime.C0797H;
import com.abc.ui.FloatingBottomTabView;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p009E0.AbstractC0188s;
import p029P0.InterfaceC0275a;
import p029P0.InterfaceC0290p;
import p031Q0.AbstractC0307g;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: S.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0328h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f642c;

    public /* synthetic */ RunnableC0328h(Object r1, Object r2, int r3) {
        this.f640a = r3;
        this.f641b = r1;
        this.f642c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r4 = 1;
        Object r5 = this.f642c;
        Object r6 = this.f641b;
        switch(this.f640a) {
            case 0: goto L42;
            case 1: goto L40;
            case 2: goto L38;
            case 3: goto L34;
            case 4: goto L23;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        ((AbstractC1083b) r6).mo2164g((Typeface) r5);
        return;
    L6:
        C0797H r62 = (C0797H) r6;
        AbstractC0307g.m703e(r62, "$item");
        Activity r52 = (Activity) r5;
        AbstractC0307g.m703e(r52, "$host");
        InterfaceC0290p r02 = r62.f2897f;
        if (r02 == null) goto L50;
        r02.mo518b(r52, new C0581D1(r4));
        return;
    L50:
        return;
    L10:
        TextView r63 = (TextView) r6;
        AbstractC0307g.m703e(r63, "$v");
        FloatingBottomTabView r53 = (FloatingBottomTabView) r5;
        AbstractC0307g.m703e(r53, "this$0");
        r63.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180).setInterpolator(r53.f2639E).start();
        return;
    L12:
        Activity r64 = (Activity) r6;
        AbstractC0307g.m703e(r64, "$activity");
        InterfaceC0275a r54 = (InterfaceC0275a) r5;
        AbstractC0307g.m703e(r54, "$action");
        if (r64.isFinishing() == true) goto L52;
        r54.invoke();     // Catch: Throwable -> L17
        Object r03 = C0146l.f339a;     // Catch: Throwable -> L17
    L20:
        if (AbstractC0141g.m465a(r03) == null) goto L51;
        Toast.makeText(r64, "打开失败", 0).show();
        return;
    L51:
        return;
    L17:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L20
    L52:
        return;
    L23:
        Activity r65 = (Activity) r6;
        AbstractC0307g.m703e(r65, "$act");
        ViewTreeObserverOnPreDrawListenerC0587F1 r55 = (ViewTreeObserverOnPreDrawListenerC0587F1) r5;
        AbstractC0307g.m703e(r55, "this$0");
        if (r65.isFinishing() == true) goto L53;
        Object r04 = WallpaperOverlayHook.f1792a;
        Long r05 = (Long) WallpaperOverlayHook.f1801j.get(r65);
        if (r05 == null) goto L31;
        if (r05.longValue() <= SystemClock.uptimeMillis()) goto L31;
    L32:
        WallpaperOverlayHook.m1460r(r55.f1766c);
        return;
    L31:
        if (WallpaperOverlayHook.m1458p(r65) == false) goto L32;
        return;
    L53:
        return;
    L34:
        C0613O0 r66 = (C0613O0) r6;
        AbstractC0307g.m703e(r66, "$identity");
        String r56 = (String) r5;
        AbstractC0307g.m703e(r56, "$name");
        RealNameTailHook r06 = RealNameTailHook.f2163a;
        ConcurrentHashMap r07 = RealNameTailHook.f2172j;
        String r1 = r66.f1892b;
        CopyOnWriteArrayList r08 = (CopyOnWriteArrayList) r07.get(r1);
        if (r08 == null) goto L55;
        AbstractC0188s.m562n0(r08, new C0615P(r4, r1, r56));
        return;
    L55:
        return;
    L38:
        Activity r67 = (Activity) r6;
        AbstractC0307g.m703e(r67, "$activity");
        String r57 = (String) r5;
        AbstractC0307g.m703e(r57, "$name");
        Toast.makeText(r67, "实名: ".concat(r57), 0).show();
        RealNameTailHook r09 = RealNameTailHook.f2163a;
        ClassLoader r010 = r67.getClassLoader();
        AbstractC0307g.m702d(r010, "getClassLoader(...)");
        RealNameTailHook.m1770f(r67, r010);
        return;
    L40:
        FloatingBottomTabView r68 = (FloatingBottomTabView) r6;
        AbstractC0307g.m703e(r68, "$bar");
        ViewGroup r58 = (ViewGroup) r5;
        AbstractC0307g.m703e(r58, "$parent");
        C0588G.m1419f(r68, r58, 20);
        return;
    L42:
        ((ProfileInstallerInitializer) r6).getClass();
        if (Build.VERSION.SDK_INT < 28) goto L45;
        Handler r011 = AbstractC0332l.m750a(Looper.getMainLooper());
    L46:
        int r12 = new Random().nextInt(Math.max(1000, 1));
        r011.postDelayed(new RunnableC0329i((Context) r5, 0), r12 + 5000);
        return;
    L45:
        r011 = new Handler(Looper.getMainLooper());
        goto L46
    }
}
