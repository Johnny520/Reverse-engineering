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
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.load.engine.C3005;
import com.bumptech.glide.load.resource.bitmap.C3032;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.util.C3765;
import com.kongzue.dialogx.util.views.C3762;
import com.kongzue.dialogx.util.views.RunnableC3761;
import java.lang.reflect.Method;
import kotlin.AbstractC5185;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.C5348;
import lin.xposed.hook.javaplugin.view.C5542;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.javaplugin.view.DownloadPluginItemView;
import p010.AbstractC6188;
import p037.C6368;
import p153.C7597;
import p161.AbstractC7642;
import p162.AbstractC7654;
import p162.C7655;
import p169.C7717;
import p222.AbstractC7989;
import p229.ThreadFactoryC8045;
import p232.ViewTreeObserverOnDrawListenerC8059;
import p257.AbstractC8201;
import p257.C8198;
import p257.C8200;
import p257.C8208;
import p257.C8221;
import p257.C8227;
import p257.C8240;
import p257.RunnableC8199;
import p257.RunnableC8234;
import p386.C9075;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.qstory.hook.item.chat.C5856;
import top.suzhelan.sticker.sdk.presenter.C5985;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3742 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f11607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f11608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11609;

    public RunnableC3742(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f11609 = 18;
        this.f11608 = swipeDismissBehavior;
        this.f11607 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        int i2 = 0;
        int i3 = 1;
        switch (this.f11609) {
            case 0:
                C3741 c3741 = (C3741) this.f11608;
                View view = c3741.f11605;
                if (view.getParent() == c3741.f11606.m8057()) {
                    AbstractC3738.m8040(((AbstractC3738) view.getTag()).mo8050().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                    return;
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((FrameLayout) this.f11607).addView(view);
                return;
            case 1:
                AbstractC3738 abstractC3738 = (AbstractC3738) this.f11607;
                AbstractC3749 abstractC3749 = (AbstractC3749) this.f11608;
                if (abstractC3749.fragment != null && (abstractC3749.getCustomView() instanceof FrameLayout) && (abstractC3738.m8058() instanceof AppCompatActivity)) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) abstractC3738.m8058();
                    AbstractC2313 supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C2332 c2332 = new C2332(supportFragmentManager);
                    c2332.m4427(AbstractC3749.access$200(abstractC3749), abstractC3749.fragment, null, 1);
                    c2332.m4428(false);
                    abstractC3749.onFragmentBind(abstractC3738, abstractC3749.getCustomView(), abstractC3749.fragment, appCompatActivity.getSupportFragmentManager());
                }
                if (abstractC3749.supportFragment == null || !(abstractC3749.getCustomView() instanceof FrameLayout) || abstractC3738.m8058() == null) {
                    return;
                }
                Activity activityM8058 = abstractC3738.m8058();
                FragmentTransaction fragmentTransactionBeginTransaction = activityM8058.getFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(AbstractC3749.access$200(abstractC3749), abstractC3749.supportFragment);
                fragmentTransactionBeginTransaction.commit();
                abstractC3749.onFragmentBind(abstractC3738, abstractC3749.getCustomView(), abstractC3749.supportFragment, activityM8058.getFragmentManager());
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f11607;
                AbstractC3749 abstractC37492 = (AbstractC3749) this.f11608;
                if (abstractC37492.getCustomView() == null) {
                    abstractC37492.bindParent(viewGroup);
                    return;
                }
                return;
            case 3:
                break;
            case 4:
                AbstractC2567.m5064((InterfaceC4357) this.f11607).resumeWith(Result.m8745constructorimpl(AbstractC5185.m10211((Throwable) this.f11608)));
                return;
            case 5:
                C1251 c1251 = ((C5807) this.f11607).f15927;
                String stackTraceString = Log.getStackTraceString((Throwable) this.f11608);
                stackTraceString.getClass();
                ((C8240) c1251.f3628).m13764();
                C8208.m13729(stackTraceString, "错误").mo13719("确定", new C5549(i));
                return;
            case 6:
                C9075 c9075 = ((C5806) this.f11607).f15923;
                String message = ((Throwable) this.f11608).getMessage();
                if (message == null) {
                    message = "未知错误";
                }
                c9075.m14653(message);
                return;
            case 7:
                C3005 c3005 = ((C5805) this.f11607).f15920;
                String stackTraceString2 = Log.getStackTraceString((Throwable) this.f11608);
                stackTraceString2.getClass();
                C8198.m13710();
                C8227 c8227 = (C8227) c3005.f9537;
                c8227.getClass();
                AbstractC3738.m8030(new RunnableC8234(c8227, i3));
                C8208.m13729(stackTraceString2, "错误").mo13719("确定", new C5549(i));
                return;
            case 8:
                C3005 c30052 = ((C5985) this.f11607).f16305;
                String stackTraceString3 = Log.getStackTraceString((Throwable) this.f11608);
                stackTraceString3.getClass();
                c30052.m6494(stackTraceString3);
                return;
            case 9:
                C6368 c6368 = (C6368) this.f11608;
                try {
                    DownloadPluginItemView.lambda$setDownloadClick$0(((C5542) this.f11607).f15295);
                    if (c6368.f17524 != null) {
                        new Handler(Looper.getMainLooper()).post(c6368.f17524);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    String str = AbstractC6188.f17016;
                    AbstractC6188.m11605("DownloadPluginItemView", e.toString(), e, true);
                    return;
                }
            case 10:
                C5856 c5856 = (C5856) this.f11607;
                Typeface typeface = (Typeface) this.f11608;
                AbstractC7642 abstractC7642 = (AbstractC7642) c5856.f16014;
                if (abstractC7642 != null) {
                    abstractC7642.mo736(typeface);
                    return;
                }
                return;
            case 11:
                ((C7597) this.f11607).accept(this.f11608);
                return;
            case 12:
                ((C7655) this.f11607).f20784 = this.f11608;
                return;
            case 13:
                ((Application) this.f11607).unregisterActivityLifecycleCallbacks((C7655) this.f11608);
                return;
            case 14:
                Object obj = this.f11608;
                Object obj2 = this.f11607;
                try {
                    Method method = AbstractC7654.f20774;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC7654.f20773.invoke(obj2, obj, Boolean.FALSE);
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
                ThreadFactoryC8045 threadFactoryC8045 = (ThreadFactoryC8045) this.f11608;
                if (threadFactoryC8045.f22209) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f11607).run();
                    return;
                } catch (Throwable th2) {
                    threadFactoryC8045.f22210.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 16:
                C3032 c3032M6544 = C3032.m6544();
                c3032M6544.getClass();
                AbstractC7989.m13473();
                c3032M6544.f9654.set(true);
                ((ViewTreeObserverOnDrawListenerC8059) this.f11608).f22238.f22236 = true;
                View view2 = ((ViewTreeObserverOnDrawListenerC8059) this.f11608).f22239;
                view2.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC8059) this.f11607);
                ((ViewTreeObserverOnDrawListenerC8059) this.f11608).f22238.f22237.clear();
                return;
            case 17:
                C8200 c8200 = (C8200) this.f11608;
                C8198 c8198 = c8200.f22592;
                WaitDialog$TYPE waitDialog$TYPE = (WaitDialog$TYPE) this.f11607;
                c8198.f22578 = waitDialog$TYPE.ordinal();
                if (c8200.f22584 == null) {
                    return;
                }
                int i4 = AbstractC8201.f22593[waitDialog$TYPE.ordinal()];
                if (i4 == 1) {
                    C3762 c3762 = c8200.f22584;
                    int i5 = c3762.f11709;
                    if (i5 != 2) {
                        if (i5 == 4) {
                            c3762.m8084(1.0f);
                            c3762.f11683 = new RunnableC3761(c3762, 3);
                        } else {
                            c3762.m8085(2, new AccelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 2) {
                    C3762 c37622 = c8200.f22584;
                    int i6 = c37622.f11709;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            c37622.m8084(1.0f);
                            c37622.f11683 = new RunnableC3761(c37622, 2);
                        } else {
                            c37622.m8085(1, new AccelerateDecelerateInterpolator());
                        }
                    }
                } else if (i4 == 3) {
                    C3762 c37623 = c8200.f22584;
                    int i7 = c37623.f11709;
                    if (i7 != 3) {
                        if (i7 == 4) {
                            c37623.m8084(1.0f);
                            c37623.f11683 = new RunnableC3761(c37623, 4);
                        } else {
                            c37623.m8085(3, new DecelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 4) {
                    C3762 c37624 = c8200.f22584;
                    if (c37624.f11709 == 0) {
                        return;
                    }
                    c37624.f11682 = false;
                    c37624.f11699 = 0;
                    c37624.f11695 = 0;
                    c37624.f11686 = 0;
                    c37624.f11709 = 0;
                    C3765 c3765 = c37624.f11702;
                    if (c3765 != null) {
                        c3765.f11715 = false;
                    }
                    C3765 c37652 = c37624.f11701;
                    if (c37652 != null) {
                        c37652.f11715 = false;
                    }
                    c37624.f11692 = false;
                    c37624.m8086();
                    return;
                }
                RelativeLayout relativeLayout = c8200.f22585;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    c8200.f22584.f11684 = new RunnableC8199(this, 0);
                    return;
                }
                new C8221(i).mo8066(c8198);
                c8200.m13715();
                long j = c8198.f22570;
                if (j > 0) {
                    AbstractC3738.m8029(j, new RunnableC8199(this, 1));
                    return;
                }
                return;
            default:
                C7717 c7717 = ((SwipeDismissBehavior) this.f11608).f10014;
                if (c7717 == null || !c7717.m13018(true)) {
                    return;
                }
                ((View) this.f11607).postOnAnimation(this);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f11607).run();
            } catch (Throwable th3) {
                AbstractC5399.m10496(EmptyCoroutineContext.INSTANCE, th3);
            }
            Runnable runnableM10342 = ((C5348) this.f11608).m10342();
            if (runnableM10342 == null) {
                return;
            }
            try {
                this.f11607 = runnableM10342;
                i2++;
                if (i2 >= 16) {
                    C5348 c5348 = (C5348) this.f11608;
                    if (AbstractC5353.m10375(c5348.f14913, c5348)) {
                        C5348 c53482 = (C5348) this.f11608;
                        AbstractC5353.m10374(c53482.f14913, c53482, this);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C5348 c53483 = (C5348) this.f11608;
                synchronized (c53483.f14911) {
                    C5348.f14908.decrementAndGet(c53483);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC3742(Object obj, int i, Object obj2) {
        this.f11609 = i;
        this.f11608 = obj;
        this.f11607 = obj2;
    }

    public /* synthetic */ RunnableC3742(int i, Object obj, Object obj2, boolean z) {
        this.f11609 = i;
        this.f11607 = obj;
        this.f11608 = obj2;
    }
}
