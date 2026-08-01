package androidx.compose.ui.platform;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.activity.RunnableC0052;
import androidx.collection.C0244;
import androidx.compose.foundation.C1030;
import androidx.window.area.C2558;
import bsh.C2633;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.AbstractC3066;
import com.bumptech.glide.C3070;
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
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.io.C4380;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.sequences.C5115;
import kotlin.sequences.C5116;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.Update;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p022.AbstractC6296;
import p024.AbstractC6308;
import p024.AbstractC6309;
import p025.InterfaceC6310;
import p026.AbstractC6314;
import p027.InterfaceC6317;
import p030.AbstractC6322;
import p036.AbstractC6358;
import p039.C6414;
import p064.C6865;
import p075.C6961;
import p089.C7180;
import p230.C8049;
import p251.C8183;
import p257.AbstractC8211;
import p257.C8198;
import p287.AbstractC8405;
import p321.C8688;
import p322.C8699;
import p322.C8701;
import p322.C8702;
import p322.C8706;
import p332.C8785;
import p335.AbstractC8789;
import p337.AbstractC8803;
import p345.C8834;
import p386.C9080;
import p391.C9095;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5804;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1898 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5565;

    public /* synthetic */ RunnableC1898(int i) {
        this.f5565 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List listM8797;
        Handler handler;
        RunnableC1898 runnableC1898;
        int i = 2;
        int i2 = 24;
        int i3 = 3;
        int i4 = 15;
        boolean zBooleanValue = false;
        switch (this.f5565) {
            case 0:
                C0244 c0244 = ViewTreeObserverOnGlobalLayoutListenerC1884.f5412;
                synchronized (c0244) {
                    try {
                        int i5 = Build.VERSION.SDK_INT;
                        Object[] objArr = c0244.f1005;
                        int i6 = c0244.f1004;
                        if (i5 < 30) {
                            for (int i7 = 0; i7 < i6; i7++) {
                                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) objArr[i7];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC1884.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5414;
                                viewTreeObserverOnGlobalLayoutListenerC1884.setShowLayoutBounds(AbstractC1916.m3630());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC1884.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC1884.post(new RunnableC1897(viewTreeObserverOnGlobalLayoutListenerC1884, i));
                                }
                            }
                        } else {
                            for (int i8 = 0; i8 < i6; i8++) {
                                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = (ViewTreeObserverOnGlobalLayoutListenerC1884) objArr[i8];
                                viewTreeObserverOnGlobalLayoutListenerC18842.post(new RunnableC1897(viewTreeObserverOnGlobalLayoutListenerC18842, i3));
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
                int i9 = AbstractC5804.f15915;
                LinkedHashSet linkedHashSet = AbstractC5804.f15914;
                synchronized (linkedHashSet) {
                    listM8797 = AbstractC4344.m8797(linkedHashSet);
                }
                Iterator it = listM8797.iterator();
                while (it.hasNext()) {
                    try {
                        ((C9080) it.next()).m14657(i9);
                    } catch (Exception e) {
                        Log.e("MessageBadgeManager", "Error notifying listener", e);
                    }
                }
                return;
            case 5:
                SettingActivity.onResume$lambda$0();
                return;
            case 6:
                AbstractC6185.m11592(AbstractC8405.m13972(1292));
                return;
            case 7:
                MainSettingActivity.onResume$lambda$0();
                return;
            case 8:
                C9095 c9095 = AbstractC6308.f17420;
                AbstractC3065.m6823(new C7180(i2));
                if (C9095.f25488.length() == 0) {
                    C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                    return;
                }
                new C8183(C9095.f25488, "DexKitCache").m13673().clear();
                AbstractC6308.m11828(AbstractC8405.m13973("喵喵呜喵喵喵喵喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜"));
                try {
                    c9095.m14677(AbstractC6188.m11607(), AbstractC8405.m13972(770));
                    JSONObject jSONObject = new JSONObject();
                    AtomicInteger atomicInteger = new AtomicInteger();
                    LinkedHashMap linkedHashMap = AbstractC6309.f17424;
                    int size = linkedHashMap.size() - 1;
                    for (AbstractC6314 abstractC6314 : linkedHashMap.values()) {
                        int andIncrement = atomicInteger.getAndIncrement();
                        Message message = new Message();
                        message.obj = new int[]{andIncrement, size};
                        AbstractC6308.f17421.sendMessage(message);
                        AbstractC6308.m11828(AbstractC8405.m13972(771) + abstractC6314.getItemPath());
                        if (abstractC6314 instanceof InterfaceC6310) {
                            ((InterfaceC6310) abstractC6314).run();
                        }
                        if (abstractC6314 instanceof InterfaceC6317) {
                            InterfaceC6317 interfaceC6317 = (InterfaceC6317) abstractC6314;
                            try {
                                C3070 c3070 = new C3070(2);
                                interfaceC6317.mo11237(c3070);
                                jSONObject.put(abstractC6314.getItemPath(), c3070.m6890());
                            } catch (Exception e2) {
                                abstractC6314.getExceptionCollectionToolInstance().m11832(e2);
                            }
                        }
                    }
                    AbstractC6308.m11828(AbstractC8405.m13972(772));
                    c9095.m14677(jSONObject.toString(), AbstractC8405.m13972(769));
                    AbstractC6308.f17422.set(false);
                    c9095.m14677(AbstractC6322.f17434 + AbstractC8405.m13973("喵呜喵喵呜喵喵呜") + AbstractC6358.f17509, AbstractC8405.m13972(767));
                    c9095.m14677(AbstractC6188.m11607(), AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"));
                    Thread.sleep(500L);
                    AbstractC6308.m11828(AbstractC8405.m13973("喵喵呜呜喵呜呜喵~喵喵呜呜呜喵呜呜~喵喵呜呜呜呜呜喵"));
                    break;
                } catch (Exception e3) {
                    XposedBridge.log(e3);
                    AbstractC6188.m11606(e3);
                }
                AbstractC3055.m6639(AbstractC6358.f17507);
                return;
            case 9:
                try {
                    AbstractC8789.f24756.execute(new RunnableC1898(new C6961(), 18));
                    C4485 c4485 = new C4485(3);
                    if (!AbstractC8405.m13972(1271).equals(c4485.m9054())) {
                        AbstractC6185.m11592(AbstractC8405.m13972(1272));
                        new C6865(new C2558(i2)).start();
                    }
                    new C6865(new C1030(c4485, i2)).start();
                    return;
                } catch (Exception e4) {
                    String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵");
                    String str = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM13973, e4.toString(), e4, true);
                    return;
                }
            case 10:
                C6414.m11970();
                return;
            case 11:
                AbstractC6296.m11825(false);
                return;
            case 12:
                AbstractC6296.m11825(true);
                return;
            case 13:
                int i10 = C8702.f24528;
                try {
                    String str2 = new SimpleDateFormat(AbstractC8405.m13972(1168), Locale.getDefault()).format(new Date());
                    while (Hook_cookie.getPskey(AbstractC8405.m13972(946)) == null) {
                        Thread.sleep(1000L);
                    }
                    String strM14421 = AbstractC8405.m13972(1187) + str2;
                    LinkedHashMap linkedHashMap2 = AbstractC6309.f17424;
                    C8699 c8699 = (C8699) linkedHashMap2.get(C8699.class);
                    if (c8699 == null ? false : c8699.f17425.booleanValue()) {
                        strM14421 = C8699.m14421();
                    }
                    C8706 c8706 = (C8706) linkedHashMap2.get(C8706.class);
                    if (c8706 != null) {
                        zBooleanValue = c8706.f17425.booleanValue();
                    }
                    String strM14424 = C8702.m14424(strM14421, zBooleanValue);
                    int i11 = C8701.f24527;
                    if (((AbstractC8803) linkedHashMap2.get(C8701.class)).f17425.booleanValue()) {
                        C8701.m14423(strM14424);
                    }
                    AbstractC6185.m11592(AbstractC8405.m13972(1188));
                    C8198.m13710();
                    return;
                } catch (Exception e5) {
                    AbstractC6188.m11605(AbstractC8405.m13972(1170), AbstractC8405.m13972(1189), e5, true);
                    C8198.m13710();
                    AbstractC6185.m11592(AbstractC8405.m13972(1190) + e5.getMessage());
                    return;
                }
            case 14:
                C8688.f24506.getClass();
                File file = new File(C8688.m14410());
                if (!file.exists() || !file.isDirectory()) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(i4));
                    return;
                }
                ArrayList<File> arrayList = new ArrayList();
                ArrayList<File> arrayList2 = new ArrayList();
                FileWalkDirection fileWalkDirection = FileWalkDirection.TOP_DOWN;
                fileWalkDirection.getClass();
                C5116 c5116 = new C5116(new C5115(new C4380(file, 0, fileWalkDirection), true, new C7180(i4)));
                while (c5116.hasNext()) {
                    arrayList2.add((File) c5116.next());
                }
                if (arrayList2.size() == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(16));
                    return;
                }
                Set setM8845 = AbstractC4347.m8845(new String[]{AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜呜呜"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵喵呜喵"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜呜"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵喵呜喵~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜呜喵"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜呜喵"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵呜呜"), AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜喵呜喵呜")});
                for (File file2 : arrayList2) {
                    String name = file2.getName();
                    AbstractC8405.m13972(1820);
                    name.getClass();
                    String lowerCase = name.toLowerCase(Locale.ROOT);
                    AbstractC8405.m13972(1322);
                    lowerCase.getClass();
                    Set<String> set = setM8845;
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
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(17));
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
                            C8198.m13708(AbstractC8405.m13972(2770) + (i12 + 1) + '/' + size2 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵~喵呜呜呜呜呜呜呜") + file3.getName(), f);
                        }
                    });
                    try {
                        String strM6854 = AbstractC3066.m6854(file3.getAbsolutePath());
                        if (AbstractC5139.m10139(strM6854, AbstractC8405.m13973("喵呜喵呜呜呜喵呜"), false)) {
                            File file4 = new File(file3.getParent(), file3.getName() + strM6854);
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
                handler2.post(new RunnableC0052(size2, 3, ref$IntRef2, ref$IntRef));
                return;
            case 15:
                AbstractC8211.m13735(AbstractC8405.m13972(2767), WaitDialog$TYPE.WARNING);
                return;
            case 16:
                AbstractC8211.m13735(AbstractC8405.m13972(2768), WaitDialog$TYPE.WARNING);
                return;
            case 17:
                AbstractC8211.m13735(AbstractC8405.m13972(2769), WaitDialog$TYPE.SUCCESS);
                return;
            case 18:
                try {
                    C6961.m12271();
                    Object obj = C8834.m14488().m14508().execute().f15756;
                    obj.getClass();
                    C8785 c8785 = (C8785) ((QSResult) obj).getData();
                    c8785.getClass();
                    AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵");
                    new C8049(15).m13533(c8785, AbstractC8405.m13972(1490));
                    if (AbstractC4395.m8907(QQEnvTool.getCurrentUin(), AbstractC3056.m6708().f24742)) {
                        return;
                    }
                    AbstractC3056.m6680();
                    C6961.m12271();
                    return;
                } catch (Exception e6) {
                    String strM139732 = AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜");
                    String str4 = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM139732, e6.toString(), e6, true);
                    return;
                }
            case 19:
                int i14 = 21;
                try {
                    try {
                        Update.detectUpdates();
                        C6961.m12274();
                        new Handler(Looper.getMainLooper()).post(new RunnableC1898(20));
                        handler = new Handler(Looper.getMainLooper());
                        runnableC1898 = new RunnableC1898(i14);
                    } catch (Exception e7) {
                        String strM13972 = AbstractC8405.m13972(3152);
                        String str5 = AbstractC6188.f17016;
                        AbstractC6188.m11605(strM13972, e7.toString(), e7, true);
                        new Handler(Looper.getMainLooper()).post(new RunnableC1898(22));
                        handler = new Handler(Looper.getMainLooper());
                        runnableC1898 = new RunnableC1898(i14);
                    }
                    handler.post(runnableC1898);
                    return;
                } catch (Throwable th2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(i14));
                    throw th2;
                }
            case 20:
                AbstractC6185.m11592(AbstractC8405.m13972(3150));
                return;
            case 21:
                C8198.m13710();
                return;
            default:
                AbstractC6185.m11592(AbstractC8405.m13972(3151));
                return;
        }
    }

    public /* synthetic */ RunnableC1898(Object obj, int i) {
        this.f5565 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m3592() {
    }
}
