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
import androidx.compose.runtime.internal.C2086;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.C3165;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.load.engine.C3837;
import com.bumptech.glide.load.resource.bitmap.C3864;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.util.C4597;
import com.kongzue.dialogx.util.views.C4594;
import com.kongzue.dialogx.util.views.RunnableC4593;
import java.lang.reflect.Method;
import kotlin.AbstractC6017;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.C6180;
import lin.xposed.hook.javaplugin.view.C6373;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.javaplugin.view.DownloadPluginItemView;
import p026.AbstractC7017;
import p053.C7197;
import p169.C8426;
import p177.AbstractC8471;
import p178.AbstractC8483;
import p178.C8484;
import p185.C8546;
import p238.AbstractC8818;
import p245.ThreadFactoryC8874;
import p248.ViewTreeObserverOnDrawListenerC8888;
import p273.AbstractC9030;
import p273.C9027;
import p273.C9029;
import p273.C9037;
import p273.C9050;
import p273.C9056;
import p273.C9069;
import p273.RunnableC9028;
import p273.RunnableC9063;
import p402.C9904;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.plugin.sdk.online.presenter.C6636;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.hook.item.chat.C6686;
import top.suzhelan.sticker.sdk.presenter.C6815;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4574 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f11952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f11953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11954;

    public RunnableC4574(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f11954 = 18;
        this.f11953 = swipeDismissBehavior;
        this.f11952 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        int i2 = 0;
        int i3 = 1;
        switch (this.f11954) {
            case 0:
                C4573 c4573 = (C4573) this.f11953;
                View view = c4573.f11950;
                if (view.getParent() == c4573.f11951.m8616()) {
                    AbstractC4570.m8599(((AbstractC4570) view.getTag()).mo8609().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                    return;
                }
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((FrameLayout) this.f11952).addView(view);
                return;
            case 1:
                AbstractC4570 abstractC4570 = (AbstractC4570) this.f11952;
                AbstractC4581 abstractC4581 = (AbstractC4581) this.f11953;
                if (abstractC4581.fragment != null && (abstractC4581.getCustomView() instanceof FrameLayout) && (abstractC4570.m8617() instanceof AppCompatActivity)) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) abstractC4570.m8617();
                    AbstractC3146 supportFragmentManager = appCompatActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C3165 c3165 = new C3165(supportFragmentManager);
                    c3165.m4987(AbstractC4581.access$200(abstractC4581), abstractC4581.fragment, null, 1);
                    c3165.m4988(false);
                    abstractC4581.onFragmentBind(abstractC4570, abstractC4581.getCustomView(), abstractC4581.fragment, appCompatActivity.getSupportFragmentManager());
                }
                if (abstractC4581.supportFragment == null || !(abstractC4581.getCustomView() instanceof FrameLayout) || abstractC4570.m8617() == null) {
                    return;
                }
                Activity activityM8617 = abstractC4570.m8617();
                FragmentTransaction fragmentTransactionBeginTransaction = activityM8617.getFragmentManager().beginTransaction();
                fragmentTransactionBeginTransaction.add(AbstractC4581.access$200(abstractC4581), abstractC4581.supportFragment);
                fragmentTransactionBeginTransaction.commit();
                abstractC4581.onFragmentBind(abstractC4570, abstractC4581.getCustomView(), abstractC4581.supportFragment, activityM8617.getFragmentManager());
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f11952;
                AbstractC4581 abstractC45812 = (AbstractC4581) this.f11953;
                if (abstractC45812.getCustomView() == null) {
                    abstractC45812.bindParent(viewGroup);
                    return;
                }
                return;
            case 3:
                break;
            case 4:
                AbstractC3400.m5624((InterfaceC5189) this.f11952).resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770((Throwable) this.f11953)));
                return;
            case 5:
                C2086 c2086 = ((C6637) this.f11952).f16272;
                String stackTraceString = Log.getStackTraceString((Throwable) this.f11953);
                stackTraceString.getClass();
                ((C9069) c2086.f3973).m14323();
                C9037.m14288(stackTraceString, "错误").mo14278("确定", new C6380(i));
                return;
            case 6:
                C9904 c9904 = ((C6636) this.f11952).f16268;
                String message = ((Throwable) this.f11953).getMessage();
                if (message == null) {
                    message = "未知错误";
                }
                c9904.m15212(message);
                return;
            case 7:
                C3837 c3837 = ((C6635) this.f11952).f16265;
                String stackTraceString2 = Log.getStackTraceString((Throwable) this.f11953);
                stackTraceString2.getClass();
                C9027.m14269();
                C9056 c9056 = (C9056) c3837.f9882;
                c9056.getClass();
                AbstractC4570.m8589(new RunnableC9063(c9056, i3));
                C9037.m14288(stackTraceString2, "错误").mo14278("确定", new C6380(i));
                return;
            case 8:
                C3837 c38372 = ((C6815) this.f11952).f16650;
                String stackTraceString3 = Log.getStackTraceString((Throwable) this.f11953);
                stackTraceString3.getClass();
                c38372.m7054(stackTraceString3);
                return;
            case 9:
                C7197 c7197 = (C7197) this.f11953;
                try {
                    DownloadPluginItemView.lambda$setDownloadClick$0(((C6373) this.f11952).f15640);
                    if (c7197.f17869 != null) {
                        new Handler(Looper.getMainLooper()).post(c7197.f17869);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    String str = AbstractC7017.f17361;
                    AbstractC7017.m12164("DownloadPluginItemView", e.toString(), e, true);
                    return;
                }
            case 10:
                C6686 c6686 = (C6686) this.f11952;
                Typeface typeface = (Typeface) this.f11953;
                AbstractC8471 abstractC8471 = (AbstractC8471) c6686.f16359;
                if (abstractC8471 != null) {
                    abstractC8471.mo1296(typeface);
                    return;
                }
                return;
            case 11:
                ((C8426) this.f11952).accept(this.f11953);
                return;
            case 12:
                ((C8484) this.f11952).f21129 = this.f11953;
                return;
            case 13:
                ((Application) this.f11952).unregisterActivityLifecycleCallbacks((C8484) this.f11953);
                return;
            case 14:
                Object obj = this.f11953;
                Object obj2 = this.f11952;
                try {
                    Method method = AbstractC8483.f21119;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC8483.f21118.invoke(obj2, obj, Boolean.FALSE);
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
                ThreadFactoryC8874 threadFactoryC8874 = (ThreadFactoryC8874) this.f11953;
                if (threadFactoryC8874.f22554) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f11952).run();
                    return;
                } catch (Throwable th2) {
                    threadFactoryC8874.f22555.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                        return;
                    }
                    return;
                }
            case 16:
                C3864 c3864M7104 = C3864.m7104();
                c3864M7104.getClass();
                AbstractC8818.m14032();
                c3864M7104.f9999.set(true);
                ((ViewTreeObserverOnDrawListenerC8888) this.f11953).f22583.f22581 = true;
                View view2 = ((ViewTreeObserverOnDrawListenerC8888) this.f11953).f22584;
                view2.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC8888) this.f11952);
                ((ViewTreeObserverOnDrawListenerC8888) this.f11953).f22583.f22582.clear();
                return;
            case 17:
                C9029 c9029 = (C9029) this.f11953;
                C9027 c9027 = c9029.f22937;
                WaitDialog$TYPE waitDialog$TYPE = (WaitDialog$TYPE) this.f11952;
                c9027.f22923 = waitDialog$TYPE.ordinal();
                if (c9029.f22929 == null) {
                    return;
                }
                int i4 = AbstractC9030.f22938[waitDialog$TYPE.ordinal()];
                if (i4 == 1) {
                    C4594 c4594 = c9029.f22929;
                    int i5 = c4594.f12054;
                    if (i5 != 2) {
                        if (i5 == 4) {
                            c4594.m8643(1.0f);
                            c4594.f12028 = new RunnableC4593(c4594, 3);
                        } else {
                            c4594.m8644(2, new AccelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 2) {
                    C4594 c45942 = c9029.f22929;
                    int i6 = c45942.f12054;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            c45942.m8643(1.0f);
                            c45942.f12028 = new RunnableC4593(c45942, 2);
                        } else {
                            c45942.m8644(1, new AccelerateDecelerateInterpolator());
                        }
                    }
                } else if (i4 == 3) {
                    C4594 c45943 = c9029.f22929;
                    int i7 = c45943.f12054;
                    if (i7 != 3) {
                        if (i7 == 4) {
                            c45943.m8643(1.0f);
                            c45943.f12028 = new RunnableC4593(c45943, 4);
                        } else {
                            c45943.m8644(3, new DecelerateInterpolator(2.0f));
                        }
                    }
                } else if (i4 == 4) {
                    C4594 c45944 = c9029.f22929;
                    if (c45944.f12054 == 0) {
                        return;
                    }
                    c45944.f12027 = false;
                    c45944.f12044 = 0;
                    c45944.f12040 = 0;
                    c45944.f12031 = 0;
                    c45944.f12054 = 0;
                    C4597 c4597 = c45944.f12047;
                    if (c4597 != null) {
                        c4597.f12060 = false;
                    }
                    C4597 c45972 = c45944.f12046;
                    if (c45972 != null) {
                        c45972.f12060 = false;
                    }
                    c45944.f12037 = false;
                    c45944.m8645();
                    return;
                }
                RelativeLayout relativeLayout = c9029.f22930;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    c9029.f22929.f12029 = new RunnableC9028(this, 0);
                    return;
                }
                new C9050(i).mo8625(c9027);
                c9029.m14274();
                long j = c9027.f22915;
                if (j > 0) {
                    AbstractC4570.m8588(j, new RunnableC9028(this, 1));
                    return;
                }
                return;
            default:
                C8546 c8546 = ((SwipeDismissBehavior) this.f11953).f10359;
                if (c8546 == null || !c8546.m13577(true)) {
                    return;
                }
                ((View) this.f11952).postOnAnimation(this);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f11952).run();
            } catch (Throwable th3) {
                AbstractC6231.m11055(EmptyCoroutineContext.INSTANCE, th3);
            }
            Runnable runnableM10901 = ((C6180) this.f11953).m10901();
            if (runnableM10901 == null) {
                return;
            }
            try {
                this.f11952 = runnableM10901;
                i2++;
                if (i2 >= 16) {
                    C6180 c6180 = (C6180) this.f11953;
                    if (AbstractC6185.m10934(c6180.f15258, c6180)) {
                        C6180 c61802 = (C6180) this.f11953;
                        AbstractC6185.m10933(c61802.f15258, c61802, this);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C6180 c61803 = (C6180) this.f11953;
                synchronized (c61803.f15256) {
                    C6180.f15253.decrementAndGet(c61803);
                    throw th4;
                }
            }
        }
    }

    public /* synthetic */ RunnableC4574(Object obj, int i, Object obj2) {
        this.f11954 = i;
        this.f11953 = obj;
        this.f11952 = obj2;
    }

    public /* synthetic */ RunnableC4574(int i, Object obj, Object obj2, boolean z) {
        this.f11954 = i;
        this.f11952 = obj;
        this.f11953 = obj2;
    }
}
