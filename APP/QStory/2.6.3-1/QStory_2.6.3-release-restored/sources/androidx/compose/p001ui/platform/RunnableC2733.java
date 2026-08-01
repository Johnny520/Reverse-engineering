package androidx.compose.p001ui.platform;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.activity.RunnableC0899;
import androidx.collection.C1091;
import androidx.compose.foundation.C1868;
import androidx.window.area.C3391;
import bsh.C3466;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import com.bumptech.glide.C3902;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.p008io.C5212;
import kotlin.p008io.FileWalkDirection;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.sequences.C5947;
import kotlin.sequences.C5948;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.Update;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p038.AbstractC7125;
import p040.AbstractC7137;
import p040.AbstractC7138;
import p041.InterfaceC7139;
import p042.AbstractC7143;
import p043.InterfaceC7146;
import p046.AbstractC7151;
import p052.AbstractC7187;
import p055.C7243;
import p080.C7694;
import p091.C7790;
import p105.C8009;
import p246.C8878;
import p267.C9012;
import p273.AbstractC9040;
import p273.C9027;
import p337.C9517;
import p338.C9528;
import p338.C9530;
import p338.C9531;
import p338.C9535;
import p348.C9614;
import p351.AbstractC9618;
import p353.AbstractC9632;
import p361.C9663;
import p402.C9909;
import p407.C9924;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2733 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5910;

    public /* synthetic */ RunnableC2733(int i) {
        this.f5910 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List listM9356;
        Handler handler;
        RunnableC2733 runnableC2733;
        int i = 2;
        int i2 = 24;
        int i3 = 3;
        int i4 = 15;
        boolean zBooleanValue = false;
        switch (this.f5910) {
            case 0:
                C1091 c1091 = ViewTreeObserverOnGlobalLayoutListenerC2719.f5757;
                synchronized (c1091) {
                    try {
                        int i5 = Build.VERSION.SDK_INT;
                        Object[] objArr = c1091.f1350;
                        int i6 = c1091.f1349;
                        if (i5 < 30) {
                            for (int i7 = 0; i7 < i6; i7++) {
                                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) objArr[i7];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC2719.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC2719.f5759;
                                viewTreeObserverOnGlobalLayoutListenerC2719.setShowLayoutBounds(AbstractC2751.m4190());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC2719.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC2719.post(new RunnableC2732(viewTreeObserverOnGlobalLayoutListenerC2719, i));
                                }
                            }
                        } else {
                            for (int i8 = 0; i8 < i6; i8++) {
                                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = (ViewTreeObserverOnGlobalLayoutListenerC2719) objArr[i8];
                                viewTreeObserverOnGlobalLayoutListenerC27192.post(new RunnableC2732(viewTreeObserverOnGlobalLayoutListenerC27192, i3));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            case 2:
                ClearLoginInformation.getOnClick$lambda$0$0();
                return;
            case 3:
                Update.lambda$detectUpdates$0();
                return;
            case 4:
                int i9 = AbstractC6634.f16260;
                LinkedHashSet linkedHashSet = AbstractC6634.f16259;
                synchronized (linkedHashSet) {
                    listM9356 = AbstractC5176.m9356(linkedHashSet);
                }
                Iterator it = listM9356.iterator();
                while (it.hasNext()) {
                    try {
                        ((C9909) it.next()).m15216(i9);
                    } catch (Exception e) {
                        Log.e("MessageBadgeManager", "Error notifying listener", e);
                    }
                }
                return;
            case 5:
                SettingActivity.onResume$lambda$0();
                return;
            case 6:
                AbstractC7014.m12151("刷新失败");
                return;
            case 7:
                MainSettingActivity.onResume$lambda$0();
                return;
            case 8:
                C9924 c9924 = AbstractC7137.f17765;
                AbstractC3897.m7383(new C8009(i2));
                if (C9924.f25833.length() == 0) {
                    C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                    return;
                }
                new C9012(C9924.f25833, "DexKitCache").m14232().clear();
                AbstractC7137.m12387("START");
                try {
                    c9924.m15236(AbstractC7017.m12166(), "startTime");
                    JSONObject jSONObject = new JSONObject();
                    AtomicInteger atomicInteger = new AtomicInteger();
                    LinkedHashMap linkedHashMap = AbstractC7138.f17769;
                    int size = linkedHashMap.size() - 1;
                    for (AbstractC7143 abstractC7143 : linkedHashMap.values()) {
                        int andIncrement = atomicInteger.getAndIncrement();
                        Message message = new Message();
                        message.obj = new int[]{andIncrement, size};
                        AbstractC7137.f17766.sendMessage(message);
                        AbstractC7137.m12387("正在解析\n" + abstractC7143.getItemPath());
                        if (abstractC7143 instanceof InterfaceC7139) {
                            ((InterfaceC7139) abstractC7143).run();
                        }
                        if (abstractC7143 instanceof InterfaceC7146) {
                            InterfaceC7146 interfaceC7146 = (InterfaceC7146) abstractC7143;
                            try {
                                C3902 c3902 = new C3902(2);
                                interfaceC7146.mo11796(c3902);
                                jSONObject.put(abstractC7143.getItemPath(), c3902.m7450());
                            } catch (Exception e2) {
                                abstractC7143.getExceptionCollectionToolInstance().m12391(e2);
                            }
                        }
                    }
                    AbstractC7137.m12387("所有方法查找完成 准备保存与重启");
                    c9924.m15236(jSONObject.toString(), "MethodCache");
                    AbstractC7137.f17767.set(false);
                    c9924.m15236(AbstractC7151.f17779 + ":" + AbstractC7187.f17854, "moduleVersionAndHostAppVersion");
                    c9924.m15236(AbstractC7017.m12166(), "time");
                    Thread.sleep(500L);
                    AbstractC7137.m12387("END");
                    break;
                } catch (Exception e3) {
                    XposedBridge.log(e3);
                    AbstractC7017.m12165(e3);
                }
                AbstractC3887.m7199(AbstractC7187.f17852);
                return;
            case 9:
                try {
                    AbstractC9618.f25101.execute(new RunnableC2733(new C7790(), 18));
                    C5317 c5317 = new C5317(3);
                    if (!"F621AA19C7A5F139F315853F40A7E24F".equals(c5317.m9613())) {
                        AbstractC7014.m12151("[QS]模块遭到篡改 请重新下载");
                        new C7694(new C3391(i2)).start();
                    }
                    new C7694(new C1868(c5317, i2)).start();
                    return;
                } catch (Exception e4) {
                    String strM14532 = "doStep";
                    String str = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14532, e4.toString(), e4, true);
                    return;
                }
            case 10:
                C7243.m12529();
                return;
            case 11:
                AbstractC7125.m12384(false);
                return;
            case 12:
                AbstractC7125.m12384(true);
                return;
            case 13:
                int i10 = C9531.f24873;
                try {
                    String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                    while (Hook_cookie.getPskey("qzone.qq.com") == null) {
                        Thread.sleep(1000L);
                    }
                    String strM14980 = "QStory每日打卡:" + str2;
                    LinkedHashMap linkedHashMap2 = AbstractC7138.f17769;
                    C9528 c9528 = (C9528) linkedHashMap2.get(C9528.class);
                    if (c9528 == null ? false : c9528.f17770.booleanValue()) {
                        strM14980 = C9528.m14980();
                    }
                    C9535 c9535 = (C9535) linkedHashMap2.get(C9535.class);
                    if (c9535 != null) {
                        zBooleanValue = c9535.f17770.booleanValue();
                    }
                    String strM14983 = C9531.m14983(strM14980, zBooleanValue);
                    int i11 = C9530.f24872;
                    if (((AbstractC9632) linkedHashMap2.get(C9530.class)).f17770.booleanValue()) {
                        C9530.m14982(strM14983);
                    }
                    AbstractC7014.m12151("发送成功");
                    C9027.m14269();
                    return;
                } catch (Exception e5) {
                    AbstractC7017.m12164("AutoSendQZOne", "发送QQ空间异常", e5, true);
                    C9027.m14269();
                    AbstractC7014.m12151("发送QQ空间异常:" + e5.getMessage());
                    return;
                }
            case 14:
                C9517.f24851.getClass();
                File file = new File(C9517.m14969());
                if (!file.exists() || !file.isDirectory()) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2733(i4));
                    return;
                }
                ArrayList<File> arrayList = new ArrayList();
                ArrayList<File> arrayList2 = new ArrayList();
                FileWalkDirection fileWalkDirection = FileWalkDirection.TOP_DOWN;
                fileWalkDirection.getClass();
                C5948 c5948 = new C5948(new C5947(new C5212(file, 0, fileWalkDirection), true, new C8009(i4)));
                while (c5948.hasNext()) {
                    arrayList2.add((File) c5948.next());
                }
                if (arrayList2.size() == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2733(16));
                    return;
                }
                Set setM9404 = AbstractC5179.m9404(new String[]{".jpg", ".jpeg", ".png", ".gif", ".bmp", ".tif", ".tiff", ".webp"});
                for (File file2 : arrayList2) {
                    String name = file2.getName();
                    "getName(...)";
                    name.getClass();
                    String lowerCase = name.toLowerCase(Locale.ROOT);
                    "toLowerCase(...)";
                    lowerCase.getClass();
                    Set<String> set = setM9404;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str3 : set) {
                            str3.getClass();
                            if (lowerCase.endsWith(str3)) {
                            }
                            break;
                        }
                    }
                    arrayList.add(file2);
                }
                final int size2 = arrayList.size();
                if (size2 == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2733(17));
                    return;
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                Handler handler2 = new Handler(Looper.getMainLooper());
                final int i12 = 0;
                for (final File file3 : arrayList) {
                    int i13 = i12 + 1;
                    final float f = i13 / size2;
                    handler2.post(new Runnable() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲兰苏世
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9027.m14267("正在整理 (" + (i12 + 1) + '/' + size2 + ")\n" + file3.getName(), f);
                        }
                    });
                    try {
                        String strM7414 = AbstractC3898.m7414(file3.getAbsolutePath());
                        if (AbstractC5971.m10698(strM7414, ".", false)) {
                            File file4 = new File(file3.getParent(), file3.getName() + strM7414);
                            if (file4.exists()) {
                                ref$IntRef2.element++;
                            } else if (file3.renameTo(file4)) {
                                ref$IntRef.element++;
                            } else {
                                ref$IntRef2.element++;
                            }
                        } else {
                            ref$IntRef2.element++;
                        }
                    } catch (Exception unused) {
                        ref$IntRef2.element++;
                    }
                    i12 = i13;
                }
                handler2.post(new RunnableC0899(size2, 3, ref$IntRef2, ref$IntRef));
                return;
            case 15:
                AbstractC9040.m14294("表情目录不存在", WaitDialog$TYPE.WARNING);
                return;
            case 16:
                AbstractC9040.m14294("没有找到表情文件", WaitDialog$TYPE.WARNING);
                return;
            case 17:
                AbstractC9040.m14294("所有表情文件都已有后缀，无需整理", WaitDialog$TYPE.SUCCESS);
                return;
            case 18:
                try {
                    C7790.m12830();
                    Object obj = C9663.m15047().m15067().execute().f16101;
                    obj.getClass();
                    C9614 c9614 = (C9614) ((QSResult) obj).getData();
                    c9614.getClass();
                    "user";
                    new C8878(15).m14092(c9614, "user_info");
                    if (AbstractC5227.m9466(QQEnvTool.getCurrentUin(), AbstractC3888.m7268().f25087)) {
                        return;
                    }
                    AbstractC3888.m7240();
                    C7790.m12830();
                    return;
                } catch (Exception e6) {
                    String strM145322 = "login";
                    String str4 = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM145322, e6.toString(), e6, true);
                    return;
                }
            case 19:
                int i14 = 21;
                try {
                    try {
                        Update.detectUpdates();
                        C7790.m12833();
                        new Handler(Looper.getMainLooper()).post(new RunnableC2733(20));
                        handler = new Handler(Looper.getMainLooper());
                        runnableC2733 = new RunnableC2733(i14);
                    } catch (Exception e7) {
                        String strM14531 = "onPaySuccess";
                        String str5 = AbstractC7017.f17361;
                        AbstractC7017.m12164(strM14531, e7.toString(), e7, true);
                        new Handler(Looper.getMainLooper()).post(new RunnableC2733(22));
                        handler = new Handler(Looper.getMainLooper());
                        runnableC2733 = new RunnableC2733(i14);
                    }
                    handler.post(runnableC2733);
                    return;
                } catch (Throwable th2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC2733(i14));
                    throw th2;
                }
            case 20:
                AbstractC7014.m12151("更新用户信息成功");
                return;
            case 21:
                C9027.m14269();
                return;
            default:
                AbstractC7014.m12151("更新用户信息失败,请重新刷新");
                return;
        }
    }

    public /* synthetic */ RunnableC2733(Object obj, int i) {
        this.f5910 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m4152() {
    }
}
