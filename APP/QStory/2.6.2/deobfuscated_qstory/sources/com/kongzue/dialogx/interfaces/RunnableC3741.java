package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.C1251;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.C2332;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.load.engine.C3004;
import com.bumptech.glide.load.resource.bitmap.C3031;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.util.C3764;
import com.kongzue.dialogx.util.views.C3761;
import com.kongzue.dialogx.util.views.RunnableC3760;
import java.lang.reflect.Method;
import kotlin.AbstractC5184;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.C5347;
import lin.xposed.hook.javaplugin.view.C5541;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.javaplugin.view.DownloadPluginItemView;
import p010.AbstractC6157;
import p036.C6351;
import p153.C7596;
import p161.AbstractC7641;
import p162.AbstractC7653;
import p162.C7654;
import p169.C7716;
import p222.AbstractC7988;
import p229.ThreadFactoryC8044;
import p232.ViewTreeObserverOnDrawListenerC8058;
import p257.AbstractC8200;
import p257.C8197;
import p257.C8199;
import p257.C8207;
import p257.C8220;
import p257.C8226;
import p257.C8239;
import p257.RunnableC8198;
import p257.RunnableC8233;
import p385.C9088;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.qstory.hook.item.chat.C5851;
import top.suzhelan.sticker.sdk.presenter.C5979;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3741 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f11602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f11603;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11604;

    public RunnableC3741(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f11604 = 18;
        this.f11603 = swipeDismissBehavior;
        this.f11602 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        int i2 = 0;
        int i3 = 1;
        switch (this.f11604) {
            case 0:
                C3740 c3740 = (C3740) this.f11603;
                View view = c3740.f11600;
                if (view.getParent() == c3740.f11601.m8070()) {
                    AbstractC3737.m8053(((AbstractC3737) view.getTag()).mo8063().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                    return;
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((FrameLayout) this.f11602).addView(view);
                return;
            case 1:
                AbstractC3737 abstractC3737 = (AbstractC3737) this.f11602;
                AbstractC3748 abstractC3748 = (AbstractC3748) this.f11603;
                if (abstractC3748.fragment != null && (abstractC3748.getCustomView() instanceof FrameLayout) && (abstractC3737.m8071() instanceof AppCompatActivity)) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) abstractC3737.m8071();
                    AbstractC2313 supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C2332 c2332 = new C2332(supportFragmentManager);
                    c2332.m4417(AbstractC3748.access$200(abstractC3748), abstractC3748.fragment, null, 1);
                    c2332.m4418(false);
                    abstractC3748.onFragmentBind(abstractC3737, abstractC3748.getCustomView(), abstractC3748.fragment, appCompatActivity.getSupportFragmentManager());
                }
                if (abstractC3748.supportFragment == null || !(abstractC3748.getCustomView() instanceof FrameLayout) || abstractC3737.m8071() == null) {
                    return;
                }
                Activity activityM8071 = abstractC3737.m8071();
                FragmentTransaction fragmentTransactionBeginTransaction = activityM8071.getFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(AbstractC3748.access$200(abstractC3748), abstractC3748.supportFragment);
                fragmentTransactionBeginTransaction.commit();
                abstractC3748.onFragmentBind(abstractC3737, abstractC3748.getCustomView(), abstractC3748.supportFragment, activityM8071.getFragmentManager());
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f11602;
                AbstractC3748 abstractC37482 = (AbstractC3748) this.f11603;
                if (abstractC37482.getCustomView() == null) {
                    abstractC37482.bindParent(viewGroup);
                    return;
                }
                return;
            case 3:
                break;
            case 4:
                AbstractC3054.m6602((InterfaceC4356) this.f11602).resumeWith(Result.m8755constructorimpl(AbstractC5184.m10207((Throwable) this.f11603)));
                return;
            case 5:
                C1251 c1251 = ((C5806) this.f11602).f15927;
                String stackTraceString = Log.getStackTraceString((Throwable) this.f11603);
                stackTraceString.getClass();
                ((C8239) c1251.f3627).m13747();
                C8207.m13712(stackTraceString, "错误").mo13702("确定", new C5548(i));
                return;
            case 6:
                C9088 c9088 = ((C5805) this.f11602).f15923;
                String message = ((Throwable) this.f11603).getMessage();
                if (message == null) {
                    message = "未知错误";
                }
                c9088.m14596(message);
                return;
            case 7:
                C3004 c3004 = ((C5804) this.f11602).f15920;
                String stackTraceString2 = Log.getStackTraceString((Throwable) this.f11603);
                stackTraceString2.getClass();
                C8197.m13693();
                C8226 c8226 = (C8226) c3004.f9535;
                c8226.getClass();
                AbstractC3737.m8043(new RunnableC8233(c8226, i3));
                C8207.m13712(stackTraceString2, "错误").mo13702("确定", new C5548(i));
                return;
            case 8:
                C3004 c30042 = ((C5979) this.f11602).f16296;
                String stackTraceString3 = Log.getStackTraceString((Throwable) this.f11603);
                stackTraceString3.getClass();
                c30042.m6434(stackTraceString3);
                return;
            case 9:
                C6351 c6351 = (C6351) this.f11603;
                try {
                    DownloadPluginItemView.lambda$setDownloadClick$0(((C5541) this.f11602).f15295);
                    if (c6351.f17478 != null) {
                        new Handler(Looper.getMainLooper()).post(c6351.f17478);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    String str = AbstractC6157.f16779;
                    AbstractC6157.m11574("DownloadPluginItemView", e.toString(), e, true);
                    return;
                }
            case 10:
                C5851 c5851 = (C5851) this.f11602;
                Typeface typeface = (Typeface) this.f11603;
                AbstractC7641 abstractC7641 = (AbstractC7641) c5851.f16007;
                if (abstractC7641 != null) {
                    abstractC7641.mo735(typeface);
                    return;
                }
                return;
            case 11:
                ((C7596) this.f11602).accept(this.f11603);
                return;
            case 12:
                ((C7654) this.f11602).f20789 = this.f11603;
                return;
            case 13:
                ((Application) this.f11602).unregisterActivityLifecycleCallbacks((C7654) this.f11603);
                return;
            case 14:
                Object obj = this.f11603;
                Object obj2 = this.f11602;
                try {
                    Method method = AbstractC7653.f20779;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC7653.f20778.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 15:
                ThreadFactoryC8044 threadFactoryC8044 = (ThreadFactoryC8044) this.f11603;
                if (threadFactoryC8044.f22212) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f11602).run();
                    return;
                } catch (Throwable th2) {
                    threadFactoryC8044.f22213.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 16:
                C3031 c3031M6484 = C3031.m6484();
                c3031M6484.getClass();
                AbstractC7988.m13445();
                c3031M6484.f9652.set(true);
                ((ViewTreeObserverOnDrawListenerC8058) this.f11603).f22240.f22238 = true;
                View view2 = ((ViewTreeObserverOnDrawListenerC8058) this.f11603).f22241;
                view2.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC8058) this.f11602);
                ((ViewTreeObserverOnDrawListenerC8058) this.f11603).f22240.f22239.clear();
                return;
            case 17:
                C8199 c8199 = (C8199) this.f11603;
                C8197 c8197 = c8199.f22593;
                WaitDialog$TYPE waitDialog$TYPE = (WaitDialog$TYPE) this.f11602;
                c8197.f22579 = waitDialog$TYPE.ordinal();
                if (c8199.f22585 == null) {
                    return;
                }
                int i4 = AbstractC8200.f22594[waitDialog$TYPE.ordinal()];
                if (i4 == 1) {
                    C3761 c3761 = c8199.f22585;
                    int i5 = c3761.f11704;
                    if (i5 != 2) {
                        if (i5 == 4) {
                            c3761.m8097(1.0f);
                            c3761.f11678 = new RunnableC3760(c3761, 3);
                        } else {
                            c3761.m8098(2, new AccelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 2) {
                    C3761 c37612 = c8199.f22585;
                    int i6 = c37612.f11704;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            c37612.m8097(1.0f);
                            c37612.f11678 = new RunnableC3760(c37612, 2);
                        } else {
                            c37612.m8098(1, new AccelerateDecelerateInterpolator());
                        }
                    }
                } else if (i4 == 3) {
                    C3761 c37613 = c8199.f22585;
                    int i7 = c37613.f11704;
                    if (i7 != 3) {
                        if (i7 == 4) {
                            c37613.m8097(1.0f);
                            c37613.f11678 = new RunnableC3760(c37613, 4);
                        } else {
                            c37613.m8098(3, new DecelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 4) {
                    C3761 c37614 = c8199.f22585;
                    if (c37614.f11704 == 0) {
                        return;
                    }
                    c37614.f11677 = false;
                    c37614.f11694 = 0;
                    c37614.f11690 = 0;
                    c37614.f11681 = 0;
                    c37614.f11704 = 0;
                    C3764 c3764 = c37614.f11697;
                    if (c3764 != null) {
                        c3764.f11710 = false;
                    }
                    C3764 c37642 = c37614.f11696;
                    if (c37642 != null) {
                        c37642.f11710 = false;
                    }
                    c37614.f11687 = false;
                    c37614.m8099();
                    return;
                }
                RelativeLayout relativeLayout = c8199.f22586;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    c8199.f22585.f11679 = new RunnableC8198(this, 0);
                    return;
                }
                new C8220(i).mo8079(c8197);
                c8199.m13698();
                long j = c8197.f22571;
                if (j > 0) {
                    AbstractC3737.m8042(j, new RunnableC8198(this, 1));
                    return;
                }
                return;
            default:
                C7716 c7716 = ((SwipeDismissBehavior) this.f11603).f10009;
                if (c7716 == null || !c7716.m12988(true)) {
                    return;
                }
                ((View) this.f11602).postOnAnimation(this);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f11602).run();
            } catch (Throwable th3) {
                AbstractC5398.m10492(EmptyCoroutineContext.INSTANCE, th3);
            }
            Runnable runnableM10339 = ((C5347) this.f11603).m10339();
            if (runnableM10339 == null) {
                return;
            }
            try {
                this.f11602 = runnableM10339;
                i2++;
                if (i2 >= 16) {
                    C5347 c5347 = (C5347) this.f11603;
                    if (AbstractC5352.m10371(c5347.f14913, c5347)) {
                        C5347 c53472 = (C5347) this.f11603;
                        AbstractC5352.m10370(c53472.f14913, c53472, this);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C5347 c53473 = (C5347) this.f11603;
                synchronized (c53473.f14911) {
                    C5347.f14908.decrementAndGet(c53473);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC3741(Object obj, int i, Object obj2) {
        this.f11604 = i;
        this.f11603 = obj;
        this.f11602 = obj2;
    }

    public /* synthetic */ RunnableC3741(int i, Object obj, Object obj2, boolean z) {
        this.f11604 = i;
        this.f11602 = obj;
        this.f11603 = obj2;
    }
}
