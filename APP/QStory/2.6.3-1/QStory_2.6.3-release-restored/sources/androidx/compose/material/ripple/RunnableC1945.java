package androidx.compose.material.ripple;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.RunnableC0946;
import androidx.collection.C1130;
import androidx.compose.animation.C1232;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1604;
import androidx.compose.p001ui.platform.C2743;
import androidx.core.os.AbstractC3010;
import androidx.core.util.InterfaceC3021;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.profileinstaller.ChoreographerFrameCallbackC3279;
import androidx.window.layout.C3431;
import com.alibaba.fastjson2.AbstractC3738;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.C4011;
import com.google.android.material.textfield.C4031;
import com.google.android.material.textfield.TextInputLayout;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import lin.xposed.hook.javaplugin.controller.AutoLoadPlugin;
import lin.xposed.hook.javaplugin.dialog.PluginMenuDialog;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p040.AbstractC7138;
import p050.AbstractC7174;
import p050.C7179;
import p052.AbstractC7187;
import p052.C7185;
import p053.AbstractC7199;
import p055.C7250;
import p069.AbstractC7390;
import p091.C7787;
import p167.C8414;
import p167.C8415;
import p169.C8431;
import p178.AbstractC8483;
import p178.C8484;
import p180.AbstractC8492;
import p181.AbstractC8500;
import p181.C8504;
import p181.C8505;
import p181.C8506;
import p181.C8507;
import p183.C8535;
import p185.C8546;
import p191.AbstractC8568;
import p231.C8786;
import p232.C8788;
import p246.C8878;
import p267.AbstractC9004;
import p337.C9517;
import p337.C9527;
import p338.C9528;
import p338.C9530;
import p338.C9531;
import p338.C9533;
import p338.C9535;
import p353.AbstractC9632;
import p402.C9904;
import p402.C9909;
import p407.C9924;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.qstory.hook.item.C6746;
import top.suzhelan.qstory.hook.item.chat.C6672;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;

/* JADX INFO: renamed from: androidx.compose.material.ripple.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1945 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3598;

    public /* synthetic */ RunnableC1945(Object obj, int i) {
        this.f3598 = i;
        this.f3597 = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 9, insns: 0 */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        long j;
        long j2;
        boolean z;
        boolean z2 = true;
        boolean zBooleanValue = false;
        switch (this.f3598) {
            case 0:
                C1949.setRippleState$lambda$1((C1949) this.f3597);
                return;
            case 1:
                AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = (AbstractComponentCallbacksC3171) this.f3597;
                abstractComponentCallbacksC3171.f7260.f7310.m13317(abstractComponentCallbacksC3171.f7247);
                abstractComponentCallbacksC3171.f7247 = null;
                return;
            case 2:
                ((InterfaceC3021) this.f3597).accept(new C3431(EmptyList.INSTANCE));
                return;
            case 3:
                MaterialButton.m7595((MaterialButton) this.f3597);
                return;
            case 4:
                ((CarouselLayoutManager) this.f3597).m5561();
                return;
            case 5:
                ((C4011) this.f3597).m7785(true);
                return;
            case 6:
                C4031 c4031 = (C4031) this.f3597;
                boolean zIsPopupShowing = c4031.f11138.isPopupShowing();
                c4031.m7836(zIsPopupShowing);
                c4031.f11133 = zIsPopupShowing;
                return;
            case 7:
                ((TextInputLayout) this.f3597).f10979.requestLayout();
                return;
            case 8:
                ((AutoLoadPlugin) this.f3597).lambda$loadHook$0();
                return;
            case 9:
                ((PluginMenuDialog) this.f3597).lambda$noticeViewUpdate$0();
                return;
            case 10:
                ((C9909) this.f3597).m15216(AbstractC6634.f16260);
                return;
            case 11:
                C6746 c6746 = (C6746) this.f3597;
                if (c6746.m11857()) {
                    return;
                }
                AbstractC7199.m12510("https://suzhelan.top/api/pan/direct/private/如果有人能懂我的忧郁.txt", c6746.f16450);
                return;
            case 12:
                ((LinearLayout) this.f3597).removeViewAt(1);
                return;
            case 13:
                C6672 c6672 = (C6672) this.f3597;
                File file = new File(AbstractC4765.m8874().concat("/+1.png"));
                if (!file.exists()) {
                    AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.repeat), file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
                    AbstractC7014.m12151("+1图标初始化完毕");
                }
                c6672.f16340 = AbstractC4765.m8862(AbstractC7187.f17852, file.getAbsolutePath());
                return;
            case 14:
                ((SettingActivity) this.f3597).applyImmersiveSystemBars();
                return;
            case 15:
                ((C1604) this.f3597).invoke();
                return;
            case 16:
                WindowManager windowManager = (WindowManager) this.f3597;
                try {
                    WeakReference weakReference = AbstractC7014.f17356;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    windowManager.removeView((View) AbstractC7014.f17356.get());
                    AbstractC7014.f17356.clear();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
                ((C7179) this.f3597).f17835.m5306(C7179.f17832);
                return;
            case 18:
                C7185 c7185 = (C7185) this.f3597;
                while (true) {
                    try {
                        Looper.loop();
                    } catch (Throwable th) {
                        new Thread(new RunnableC0946(c7185, 14, th)).start();
                    }
                }
                break;
            case 19:
                int i = 0;
                C7250 c7250 = (C7250) this.f3597;
                File file2 = new File(AbstractC7174.f17823);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                for (File file3 : file2.listFiles()) {
                    if (!file3.getAbsolutePath().equals(file2.getAbsolutePath()) && file3.isDirectory()) {
                        i++;
                    }
                }
                if (i == 0) {
                    String strM14531 = "https://gitee.com/suzhelan/test/raw/master/DefaultEmoticon.zip";
                    String str = AbstractC4765.m8870("zip") + "/emotion.zip";
                    File file4 = new File(str);
                    AbstractC7199.m12510(strM14531, str);
                    try {
                        AbstractC7390.m12622(str, AbstractC7174.f17823 + "默认");
                        file4.delete();
                        break;
                    } catch (Exception unused2) {
                    }
                }
                c7250.m12532();
                return;
            case 20:
                C8415 c8415 = ((C8414) this.f3597).f20898;
                ViewParent parent = c8415.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c8415);
                    return;
                }
                return;
            case 21:
                Activity activity = (Activity) this.f3597;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = AbstractC8483.f21123;
                Method method = AbstractC8483.f21117;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28) {
                    activity.recreate();
                    return;
                }
                if ((i2 != 27 || method != null) && (AbstractC8483.f21118 != null || AbstractC8483.f21119 != null)) {
                    try {
                        Object obj2 = AbstractC8483.f21120.get(activity);
                        if (obj2 != null && (obj = AbstractC8483.f21121.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C8484 c8484 = new C8484(activity);
                            application.registerActivityLifecycleCallbacks(c8484);
                            handler.post(new RunnableC4574(12, c8484, obj2, false));
                            int i3 = 13;
                            try {
                                if (i2 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC4574(i3, application, c8484, false));
                                return;
                            } finally {
                                handler.post(new RunnableC4574(i3, application, c8484, false));
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
                activity.recreate();
                return;
            case 22:
                C8504 c8504 = (C8504) ((C8504) this.f3597).f21178.f16359;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = c8504.f21179;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i4 = 0;
                while (i4 < arrayList.size()) {
                    AbstractC8500 abstractC8500 = (AbstractC8500) arrayList.get(i4);
                    if (abstractC8500 == null) {
                        j2 = jUptimeMillis;
                    } else {
                        C1130 c1130 = c8504.f21180;
                        Long l = (Long) c1130.get(abstractC8500);
                        if (l != null) {
                            if (l.longValue() < jUptimeMillis2) {
                                c1130.remove(abstractC8500);
                                j = abstractC8500.f21170;
                                if (j != 0) {
                                    abstractC8500.f21170 = jUptimeMillis;
                                    abstractC8500.m13541(abstractC8500.f21167);
                                } else {
                                    long j3 = jUptimeMillis - j;
                                    abstractC8500.f21170 = jUptimeMillis;
                                    float f = AbstractC8500.m13540().f21182;
                                    long j4 = f == 0.0f ? 2147483647L : (long) (j3 / f);
                                    C8507 c8507 = (C8507) abstractC8500;
                                    boolean z3 = c8507.f21194;
                                    float f2 = c8507.f21196;
                                    if (z3) {
                                        if (f2 != Float.MAX_VALUE) {
                                            j2 = jUptimeMillis;
                                            c8507.f21195.f21192 = f2;
                                            c8507.f21196 = Float.MAX_VALUE;
                                        } else {
                                            j2 = jUptimeMillis;
                                        }
                                        c8507.f21167 = (float) c8507.f21195.f21192;
                                        c8507.f21168 = 0.0f;
                                        c8507.f21194 = zBooleanValue;
                                        z = z2;
                                    } else {
                                        j2 = jUptimeMillis;
                                        C8506 c8506 = c8507.f21195;
                                        float f3 = c8507.f21167;
                                        float f4 = c8507.f21168;
                                        if (f2 != Float.MAX_VALUE) {
                                            long j5 = j4 / 2;
                                            C1232 c1232M13542 = c8506.m13542(f3, f4, j5);
                                            C8506 c85062 = c8507.f21195;
                                            c85062.f21192 = c8507.f21196;
                                            c8507.f21196 = Float.MAX_VALUE;
                                            C1232 c1232M135422 = c85062.m13542(c1232M13542.f1643, c1232M13542.f1642, j5);
                                            c8507.f21167 = c1232M135422.f1643;
                                            c8507.f21168 = c1232M135422.f1642;
                                        } else {
                                            C1232 c1232M135423 = c8506.m13542(f3, f4, j4);
                                            c8507.f21167 = c1232M135423.f1643;
                                            c8507.f21168 = c1232M135423.f1642;
                                        }
                                        float fMax = Math.max(c8507.f21167, c8507.f21163);
                                        c8507.f21167 = fMax;
                                        c8507.f21167 = Math.min(fMax, Float.MAX_VALUE);
                                        float f5 = c8507.f21168;
                                        C8506 c85063 = c8507.f21195;
                                        c85063.getClass();
                                        if (Math.abs(f5) >= c85063.f21185 || Math.abs(r2 - ((float) c85063.f21192)) >= c85063.f21186) {
                                            z = false;
                                        } else {
                                            c8507.f21167 = (float) c8507.f21195.f21192;
                                            c8507.f21168 = 0.0f;
                                            z = true;
                                        }
                                    }
                                    float fMin = Math.min(abstractC8500.f21167, Float.MAX_VALUE);
                                    abstractC8500.f21167 = fMin;
                                    float fMax2 = Math.max(fMin, abstractC8500.f21163);
                                    abstractC8500.f21167 = fMax2;
                                    abstractC8500.m13541(fMax2);
                                    if (z) {
                                        ArrayList arrayList2 = abstractC8500.f21171;
                                        abstractC8500.f21164 = false;
                                        C8504 c8504M13540 = AbstractC8500.m13540();
                                        c8504M13540.f21180.remove(abstractC8500);
                                        ArrayList arrayList3 = c8504M13540.f21179;
                                        int iIndexOf = arrayList3.indexOf(abstractC8500);
                                        if (iIndexOf >= 0) {
                                            arrayList3.set(iIndexOf, null);
                                            c8504M13540.f21175 = true;
                                        }
                                        abstractC8500.f21170 = 0L;
                                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                            if (arrayList2.get(i5) != null) {
                                                arrayList2.get(i5).getClass();
                                                C3775.m6954();
                                                return;
                                            }
                                        }
                                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                            if (arrayList2.get(size) == null) {
                                                arrayList2.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            j2 = jUptimeMillis;
                        } else {
                            j = abstractC8500.f21170;
                            if (j != 0) {
                            }
                        }
                    }
                    i4++;
                    jUptimeMillis = j2;
                    z2 = true;
                    zBooleanValue = false;
                }
                if (c8504.f21175) {
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        if (arrayList.get(size2) == null) {
                            arrayList.remove(size2);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        C5703 c5703 = c8504.f21181;
                        ValueAnimator.unregisterDurationScaleChangeListener((C8505) c5703.f14509);
                        c5703.f14509 = null;
                    }
                    c8504.f21175 = false;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) c8504.f21176.f14509).postFrameCallback(new ChoreographerFrameCallbackC3279(c8504.f21177));
                    return;
                }
                return;
            case 23:
                C8535 c8535 = (C8535) this.f3597;
                synchronized (c8535.f21248) {
                    try {
                        if (c8535.f21249 == null) {
                            return;
                        }
                        try {
                            C8431 c8431M13564 = c8535.m13564();
                            int i6 = c8431M13564.f20958;
                            if (i6 == 2) {
                                synchronized (c8535.f21248) {
                                }
                            }
                            if (i6 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                            }
                            try {
                                Method method2 = AbstractC3010.f6795;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C7787 c7787 = c8535.f21253;
                                Context context = c8535.f21254;
                                c7787.getClass();
                                C8431[] c8431Arr = {c8431M13564};
                                AbstractC7390 abstractC7390 = AbstractC8492.f21148;
                                AbstractC9004.m14210("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo12631 = AbstractC8492.f21148.mo12631(context, c8431Arr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM13621 = AbstractC8568.m13621(c8535.f21254, c8431M13564.f20963);
                                    if (mappedByteBufferM13621 == null || typefaceMo12631 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C1171 c1171 = new C1171(typefaceMo12631, AbstractC3738.m6900(mappedByteBufferM13621));
                                        Trace.endSection();
                                        synchronized (c8535.f21248) {
                                            try {
                                                AbstractC1298 abstractC1298 = c8535.f21249;
                                                if (abstractC1298 != null) {
                                                    abstractC1298.mo1740(c1171);
                                                }
                                            } finally {
                                            }
                                            break;
                                        }
                                        c8535.m13565();
                                        return;
                                    } finally {
                                        Method method3 = AbstractC3010.f6795;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c8535.f21248) {
                                try {
                                    AbstractC1298 abstractC12982 = c8535.f21249;
                                    if (abstractC12982 != null) {
                                        abstractC12982.mo1739(th2);
                                    }
                                    c8535.m13565();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 24:
                C8788 c8788 = (C8788) this.f3597;
                c8788.f22376 = false;
                c8788.m14009(C8786.f22368);
                C8878 c8878 = c8788.f22373;
                if (c8878 != null) {
                    C9904.m15209((C9904) c8878.f22564);
                    return;
                }
                return;
            case 25:
                C2743 c2743 = (C2743) this.f3597;
                c2743.f5971 = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c2743.f5968;
                C8546 c8546 = sideSheetBehavior.f10914;
                if (c8546 != null && c8546.m13577(true)) {
                    c2743.m4166(c2743.f5970);
                    return;
                } else {
                    if (sideSheetBehavior.f10910 == 2) {
                        sideSheetBehavior.m7750(c2743.f5970);
                        return;
                    }
                    return;
                }
            case 26:
                C9527 c9527 = (C9527) this.f3597;
                C7787 c77872 = C9527.f24865;
                C9517.f24851.getClass();
                File file5 = new File(C9517.m14969());
                if (!file5.exists()) {
                    file5.mkdirs();
                }
                c9527.m14979();
                return;
            case 27:
                C9924 c9924 = ((C9533) this.f3597).f24878;
                try {
                    String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                    if (str2.equals(c9924.m15237("last_like_date", ""))) {
                        return;
                    }
                    while (Hook_cookie.getPskey("qzone.qq.com") == null) {
                        Thread.sleep(1000L);
                    }
                    Thread.sleep(3000L);
                    Pair pairM14985 = C9533.m14985();
                    if (C9533.m14984((String) pairM14985.first, (String) pairM14985.second)) {
                        c9924.m15236(str2, "last_like_date");
                        return;
                    }
                    return;
                } catch (Exception e) {
                    AbstractC7017.m12164("AutoSendQZOne", "定时任务异常", e, true);
                    return;
                }
            case 28:
                C9924 c99242 = ((C9531) this.f3597).f24874;
                try {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                    if (str3.equals(c99242.m15237("last_send_date", ""))) {
                        return;
                    }
                    while (Hook_cookie.getPskey("qzone.qq.com") == null) {
                        Thread.sleep(1000L);
                    }
                    String strM14980 = "QStory每日打卡:" + str3;
                    LinkedHashMap linkedHashMap = AbstractC7138.f17769;
                    C9528 c9528 = (C9528) linkedHashMap.get(C9528.class);
                    if (c9528 == null ? false : c9528.f17770.booleanValue()) {
                        strM14980 = C9528.m14980();
                    }
                    C9535 c9535 = (C9535) linkedHashMap.get(C9535.class);
                    if (c9535 != null) {
                        zBooleanValue = c9535.f17770.booleanValue();
                    }
                    String strM14983 = C9531.m14983(strM14980, zBooleanValue);
                    int i7 = C9530.f24872;
                    if (((AbstractC9632) linkedHashMap.get(C9530.class)).f17770.booleanValue()) {
                        C9530.m14982(strM14983);
                    }
                    c99242.m15236(str3, "last_send_date");
                    return;
                } catch (Exception e2) {
                    AbstractC7017.m12164("AutoSendQZOne", "定时任务异常", e2, true);
                    return;
                }
            default:
                C9528 c95282 = (C9528) this.f3597;
                if (c95282.m14981()) {
                    return;
                }
                AbstractC7199.m12510("https://suzhelan.top/api/pan/direct/private/如果有人能懂我的忧郁.txt", c95282.f24870);
                return;
        }
    }
}
