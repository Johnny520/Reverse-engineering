package androidx.compose.ui.platform;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.activity.RunnableC0052;
import androidx.collection.C0244;
import androidx.compose.foundation.C1030;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.profileinstaller.AbstractC2442;
import androidx.window.area.C2558;
import bsh.C2632;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3064;
import com.bumptech.glide.C3069;
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
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.io.C4379;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.sequences.C5114;
import kotlin.sequences.C5115;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.Update;
import p009.InterfaceC6152;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p024.AbstractC6290;
import p024.AbstractC6291;
import p025.InterfaceC6292;
import p026.AbstractC6296;
import p029.AbstractC6303;
import p035.AbstractC6340;
import p038.C6397;
import p040.AbstractC6429;
import p064.C6864;
import p075.C6957;
import p075.C6960;
import p089.C7179;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p251.C8182;
import p257.AbstractC8210;
import p257.C8197;
import p321.C8717;
import p321.C8718;
import p321.C8720;
import p321.C8721;
import p324.C8738;
import p331.C8799;
import p333.AbstractC8802;
import p335.AbstractC8804;
import p336.AbstractC8805;
import p342.C8821;
import p349.C8865;
import p385.C9093;
import p391.C9114;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5803;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1898 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5564;

    public /* synthetic */ RunnableC1898(int i) {
        this.f5564 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        List listM8804;
        Handler handler;
        RunnableC1898 runnableC1898;
        int i = 2;
        int i2 = 3;
        boolean zBooleanValue = false;
        switch (this.f5564) {
            case 0:
                C0244 c0244 = ViewTreeObserverOnGlobalLayoutListenerC1884.f5411;
                synchronized (c0244) {
                    try {
                        int i3 = Build.VERSION.SDK_INT;
                        Object[] objArr = c0244.f1005;
                        int i4 = c0244.f1004;
                        if (i3 < 30) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) objArr[i5];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC1884.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC1884.f5413;
                                viewTreeObserverOnGlobalLayoutListenerC1884.setShowLayoutBounds(AbstractC1916.m3620());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC1884.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC1884.post(new RunnableC1897(viewTreeObserverOnGlobalLayoutListenerC1884, i));
                                }
                            }
                        } else {
                            for (int i6 = 0; i6 < i4; i6++) {
                                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC18842 = (ViewTreeObserverOnGlobalLayoutListenerC1884) objArr[i6];
                                viewTreeObserverOnGlobalLayoutListenerC18842.post(new RunnableC1897(viewTreeObserverOnGlobalLayoutListenerC18842, i2));
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
                int i7 = AbstractC5803.f15915;
                LinkedHashSet linkedHashSet = AbstractC5803.f15914;
                synchronized (linkedHashSet) {
                    listM8804 = AbstractC4343.m8804(linkedHashSet);
                }
                Iterator it = listM8804.iterator();
                while (it.hasNext()) {
                    try {
                        ((C9093) it.next()).m14600(i7);
                    } catch (Exception e) {
                        Log.e("MessageBadgeManager", "Error notifying listener", e);
                    }
                }
                return;
            case 5:
                SettingActivity.onResume$lambda$0();
                return;
            case 6:
                MainSettingActivity.onResume$lambda$0();
                return;
            case 7:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937690815229592999L));
                return;
            case 8:
                C9114 c9114 = AbstractC6290.f17371;
                AbstractC0455.m1152(new C7179(25));
                if (C9114.f25484.length() == 0) {
                    C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
                    return;
                }
                new C8182(C9114.f25484, "DexKitCache").m13649().clear();
                AbstractC6290.m11800(AbstractC3056.m6668(-3937638283484595623L));
                try {
                    c9114.m14640(AbstractC6157.m11576(), AbstractC3056.m6668(-3937638111685903783L));
                    JSONObject jSONObject = new JSONObject();
                    AtomicInteger atomicInteger = new AtomicInteger();
                    LinkedHashMap linkedHashMap = AbstractC6291.f17375;
                    int size = linkedHashMap.size() - 1;
                    for (AbstractC6296 abstractC6296 : linkedHashMap.values()) {
                        int andIncrement = atomicInteger.getAndIncrement();
                        Message message = new Message();
                        message.obj = new int[]{andIncrement, size};
                        AbstractC6290.f17372.sendMessage(message);
                        AbstractC6290.m11800(AbstractC3056.m6668(-3937638154635576743L) + abstractC6296.getItemPath());
                        if (abstractC6296 instanceof InterfaceC6292) {
                            ((InterfaceC6292) abstractC6296).run();
                        }
                        if (abstractC6296 instanceof InterfaceC6152) {
                            InterfaceC6152 interfaceC6152 = (InterfaceC6152) abstractC6296;
                            try {
                                C3069 c3069 = new C3069(2);
                                interfaceC6152.mo11180(c3069);
                                jSONObject.put(abstractC6296.getItemPath(), c3069.m6903());
                            } catch (Exception e2) {
                                abstractC6296.getExceptionCollectionToolInstance().m11804(e2);
                            }
                        }
                    }
                    AbstractC6290.m11800(AbstractC3056.m6668(-3937638042966427047L));
                    c9114.m14640(jSONObject.toString(), AbstractC3056.m6668(-3937638231944988071L));
                    AbstractC6290.f17373.set(false);
                    c9114.m14640(AbstractC6303.f17385 + AbstractC3056.m6668(-3937609910930638247L) + AbstractC6340.f17462, AbstractC3056.m6668(-3937638442398385575L));
                    c9114.m14640(AbstractC6157.m11576(), AbstractC3056.m6668(-3937637978541917607L));
                    Thread.sleep(500L);
                    AbstractC6290.m11800(AbstractC3056.m6668(-3937638300664464807L));
                    break;
                } catch (Exception e3) {
                    XposedBridge.log(e3);
                    AbstractC6157.m11575(e3);
                }
                AbstractC7738.m13038(AbstractC6340.f17460);
                return;
            case 9:
                try {
                    AbstractC8804.f24777.execute(new RunnableC1898(new C6960(), 18));
                    AbstractC3064.m6765();
                    C4484 c4484 = new C4484(3);
                    int i8 = 24;
                    if (!AbstractC3056.m6668(-3937692808094418343L).equals(c4484.m9064())) {
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937692640590693799L));
                        new C6864(new C2558(i8)).start();
                    }
                    new C6864(new C1030(c4484, i8)).start();
                    ArrayList arrayList = AbstractC8802.f24775;
                    C8865.m14510().m14506().mo11106(new C6957(i8));
                    return;
                } catch (Exception e4) {
                    String strM6668 = AbstractC3056.m6668(-3937554879514674599L);
                    String str = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, e4.toString(), e4, true);
                    return;
                }
            case 10:
                C6397.m11922();
                return;
            case 11:
                AbstractC6429.m11933(false);
                return;
            case 12:
                AbstractC6429.m11933(true);
                return;
            case 13:
                C8738.f24639.getClass();
                File file = new File(C8738.m14405());
                if (!file.exists() || !file.isDirectory()) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(14));
                    return;
                }
                ArrayList<File> arrayList2 = new ArrayList();
                ArrayList<File> arrayList3 = new ArrayList();
                FileWalkDirection fileWalkDirection = FileWalkDirection.TOP_DOWN;
                fileWalkDirection.getClass();
                C4379 c4379 = new C4379(file, 0, fileWalkDirection);
                int i9 = 15;
                C5115 c5115 = new C5115(new C5114(c4379, true, new C7179(i9)));
                while (c5115.hasNext()) {
                    arrayList3.add((File) c5115.next());
                }
                if (arrayList3.size() == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(i9));
                    return;
                }
                Set setM8852 = AbstractC4346.m8852(new String[]{AbstractC3056.m6668(-3937561197411567015L), AbstractC3056.m6668(-3937828975737570727L), AbstractC3056.m6668(-3937561347735422375L), AbstractC3056.m6668(-3937561141576992167L), AbstractC3056.m6668(-3937560961188365735L), AbstractC3056.m6668(-3937561021317907879L), AbstractC3056.m6668(-3937829001507374503L), AbstractC3056.m6668(-3937828992917439911L)});
                for (File file2 : arrayList3) {
                    String name = file2.getName();
                    AbstractC3056.m6668(-3937741817966232999L);
                    name.getClass();
                    String strM4563 = AbstractC2442.m4563(name, Locale.ROOT, -3937688152349869479L);
                    Set<String> set = setM8852;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        for (String str2 : set) {
                            str2.getClass();
                            if (strM4563.endsWith(str2)) {
                            }
                            break;
                        }
                    }
                    arrayList2.add(file2);
                }
                final int size2 = arrayList2.size();
                if (size2 == 0) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(16));
                    return;
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                Handler handler2 = new Handler(Looper.getMainLooper());
                final int i10 = 0;
                for (final File file3 : arrayList2) {
                    int i11 = i10 + 1;
                    final float f = i11 / size2;
                    handler2.post(new Runnable() { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰世苏哲
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8197.m13691(AbstractC3056.m6668(-3937829267795346855L) + (i10 + 1) + '/' + size2 + AbstractC3056.m6668(-3937668416975144359L) + file3.getName(), f);
                        }
                    });
                    try {
                        String strM13614 = AbstractC8174.m13614(file3.getAbsolutePath());
                        if (AbstractC5138.m10125(strM13614, AbstractC3056.m6668(-3937562159484241319L), false)) {
                            File file4 = new File(file3.getParent(), file3.getName() + strM13614);
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
                    i10 = i11;
                }
                handler2.post(new RunnableC0052(size2, i2, ref$IntRef2, ref$IntRef));
                return;
            case 14:
                AbstractC8210.m13718(AbstractC3056.m6668(-3937829418119202215L), WaitDialog$TYPE.WARNING);
                return;
            case 15:
                AbstractC8210.m13718(AbstractC3056.m6668(-3937829293565150631L), WaitDialog$TYPE.WARNING);
                return;
            case 16:
                AbstractC8210.m13718(AbstractC3056.m6668(-3937829332219856295L), WaitDialog$TYPE.SUCCESS);
                return;
            case 17:
                int i12 = C8721.f24585;
                try {
                    String str3 = new SimpleDateFormat(AbstractC3056.m6668(-3937683122943165863L), Locale.getDefault()).format(new Date());
                    while (Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)) == null) {
                        Thread.sleep(1000L);
                    }
                    String strM14394 = AbstractC3056.m6668(-3937681503740495271L) + str3;
                    LinkedHashMap linkedHashMap2 = AbstractC6291.f17375;
                    C8718 c8718 = (C8718) linkedHashMap2.get(C8718.class);
                    if (c8718 == null ? false : c8718.f17376.booleanValue()) {
                        strM14394 = C8718.m14394();
                    }
                    C8717 c8717 = (C8717) linkedHashMap2.get(C8717.class);
                    if (c8717 != null) {
                        zBooleanValue = c8717.f17376.booleanValue();
                    }
                    String strM14397 = C8721.m14397(strM14394, zBooleanValue);
                    int i13 = C8720.f24584;
                    if (((AbstractC8805) linkedHashMap2.get(C8720.class)).f17376.booleanValue()) {
                        C8720.m14396(strM14397);
                    }
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937681520920364455L));
                    C8197.m13693();
                    return;
                } catch (Exception e5) {
                    AbstractC6157.m11574(AbstractC3056.m6668(-3937683097173362087L), AbstractC3056.m6668(-3937681404956247463L), e5, true);
                    C8197.m13693();
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937681443610953127L) + e5.getMessage());
                    return;
                }
            case 18:
                try {
                    C6960.m12247();
                    Object obj = C8865.m14507().m14493().execute().f15756;
                    obj.getClass();
                    C8799 c8799 = (C8799) ((QSResult) obj).getData();
                    c8799.getClass();
                    AbstractC3056.m6668(-3937706779623032231L);
                    new C8821().m14465(c8799, AbstractC3056.m6668(-3937706766738130343L));
                    if (C6960.m12245()) {
                        return;
                    }
                    C8821 c8821 = new C8821();
                    String strM66682 = AbstractC3056.m6668(-3937626811626948007L);
                    AbstractC3056.m6668(-3937803416387192231L);
                    c8821.f24812.remove(strM66682);
                    C6960.m12247();
                    return;
                } catch (Exception e6) {
                    String strM66683 = AbstractC3056.m6668(-3937635702209250727L);
                    String str4 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM66683, e6.toString(), e6, true);
                    return;
                }
            case 19:
                int i14 = 21;
                try {
                    try {
                        Update.detectUpdates();
                        C6960.m12246();
                        new Handler(Looper.getMainLooper()).post(new RunnableC1898(20));
                        handler = new Handler(Looper.getMainLooper());
                        runnableC1898 = new RunnableC1898(i14);
                    } catch (Throwable th2) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC1898(i14));
                        throw th2;
                    }
                } catch (Exception e7) {
                    String strM66684 = AbstractC3056.m6668(-3937325914808124839L);
                    String str5 = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM66684, e7.toString(), e7, true);
                    new Handler(Looper.getMainLooper()).post(new RunnableC1898(22));
                    handler = new Handler(Looper.getMainLooper());
                    runnableC1898 = new RunnableC1898(i14);
                }
                handler.post(runnableC1898);
                return;
            case 20:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937325949167863207L));
                return;
            case 21:
                C8197.m13693();
                return;
            default:
                AbstractC6154.m11561(AbstractC3056.m6668(-3937325953462830503L));
                return;
        }
    }

    public /* synthetic */ RunnableC1898(Object obj, int i) {
        this.f5564 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m3582() {
    }
}
