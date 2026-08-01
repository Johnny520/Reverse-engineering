package p352;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Handler;
import android.util.Log;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import lin.xposed.hook.util.qq.QQNTTroopSettingTool;
import p087.C7068;
import p089.C7180;
import p162.AbstractC7653;
import p193.C7828;
import p257.AbstractC8211;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p330.C8777;
import p339.C8808;
import p355.C8890;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8868 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f25013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25014;

    public /* synthetic */ RunnableC8868(C7180 c7180, String str) {
        this.f25014 = 2;
        this.f25013 = c7180;
        this.f25012 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25014;
        final int i2 = 1;
        Object obj = this.f25013;
        Object obj2 = this.f25012;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                C7180 c7180 = (C7180) obj;
                Handler handler = AbstractC8865.f25007;
                try {
                    if (((AbstractC7653.m12920(context, AbstractC8405.m13972(3262)) == 0 || AbstractC7653.m12920(context, AbstractC8405.m13972(3263)) == 0) ? 1 : 0) == 0) {
                        return;
                    }
                    while (!AbstractC8865.m14532(context)) {
                        Thread.sleep(1000L);
                    }
                    Object systemService = context.getSystemService(AbstractC8405.m13972(1235));
                    AbstractC8405.m13972(3261);
                    systemService.getClass();
                    LocationManager locationManager = (LocationManager) systemService;
                    if (!locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵喵呜")) && !locationManager.isProviderEnabled(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵呜喵"))) {
                        return;
                    }
                    while (AbstractC8865.m14532(context)) {
                        Thread.sleep(1800000L);
                        AbstractC8865.f25007.post(new RunnableC8868(c7180, AbstractC8865.m14535(context)));
                        break;
                    }
                    return;
                } catch (Exception e) {
                    AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    Log.e(e.getClass().getSimpleName(), AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"), e);
                    return;
                }
            case 1:
                Context context2 = (Context) obj2;
                C7068 c7068 = (C7068) obj;
                Handler handler2 = AbstractC8865.f25007;
                try {
                    handler2.post(new RunnableC8868(c7068, 3, AbstractC8865.m14535(context2)));
                    return;
                } catch (Exception e2) {
                    AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    Log.e(e2.getClass().getSimpleName(), AbstractC8405.m13973("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"), e2);
                    handler2.post(new RunnableC8867(c7068, i));
                    return;
                }
            case 2:
                ((C7180) obj).invoke((String) obj2);
                return;
            case 3:
                ((C7068) obj2).invoke((String) obj);
                return;
            case 4:
                final List<String> list = (List) obj2;
                Handler handler3 = ((C8890) obj).f25060;
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                final int i3 = 0;
                for (final String str : list) {
                    int i4 = i3 + 1;
                    final float size = i4 / list.size();
                    final int i5 = 0;
                    handler3.post(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏兰哲
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = i5;
                            float f = size;
                            String str2 = str;
                            List list2 = list;
                            int i7 = i3;
                            switch (i6) {
                                case 0:
                                    C8198.m13708(AbstractC8405.m13972(3112) + (i7 + 1) + '/' + list2.size() + AbstractC8405.m13972(3113) + str2, f);
                                    break;
                                default:
                                    C8198.m13708(AbstractC8405.m13972(3127) + (i7 + 1) + '/' + list2.size() + AbstractC8405.m13972(3128) + str2, f);
                                    break;
                            }
                        }
                    });
                    try {
                        C8808.f24794.getClass();
                        C8808.m14481(str);
                        ref$IntRef.element++;
                    } catch (Exception unused) {
                        ref$IntRef2.element++;
                    }
                    i3 = i4;
                }
                handler3.postDelayed(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世哲苏兰
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i;
                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                        List list2 = list;
                        Ref$IntRef ref$IntRef4 = ref$IntRef2;
                        switch (i6) {
                            case 0:
                                StringBuilder sb = new StringBuilder();
                                sb.append(AbstractC8405.m13972(3114));
                                sb.append(AbstractC8405.m13972(2772) + list2.size() + AbstractC8405.m13972(3115));
                                sb.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef3.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                if (ref$IntRef4.element > 0) {
                                    sb.append(AbstractC8405.m13972(2774) + ref$IntRef4.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                }
                                String string = sb.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC8211.m13736(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC8211.m13736(string, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(AbstractC8405.m13972(3129));
                                sb2.append(AbstractC8405.m13972(2772) + list2.size() + AbstractC8405.m13972(3130));
                                sb2.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef3.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                if (ref$IntRef4.element > 0) {
                                    sb2.append(AbstractC8405.m13972(2774) + ref$IntRef4.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                }
                                String string2 = sb2.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC8211.m13736(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC8211.m13736(string2, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                        }
                    }
                }, 200L);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                C7828 c7828 = (C7828) obj;
                C8198.m13710();
                if (arrayList.isEmpty()) {
                    AbstractC8211.m13735(AbstractC8405.m13972(3126), WaitDialog$TYPE.WARNING);
                    return;
                }
                C8208 c8208 = new C8208();
                c8208.f22614 = AbstractC8405.m13972(3118) + arrayList.size() + ')';
                c8208.mo13721();
                c8208.f22626 = AbstractC8405.m13972(3119);
                c8208.mo13721();
                c8208.mo13720(true);
                c8208.mo13723(new C8777(c7828, arrayList));
                c8208.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
                c8208.mo13721();
                c8208.m13731();
                c7828.f21366 = c8208;
                return;
            case 6:
                final List list2 = (List) obj2;
                Handler handler4 = (Handler) ((C7828) obj).f21367;
                final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                final Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                Iterator it = list2.iterator();
                while (true) {
                    final int i6 = i;
                    if (!it.hasNext()) {
                        handler4.postDelayed(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世哲苏兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i62 = i2;
                                Ref$IntRef ref$IntRef32 = ref$IntRef3;
                                List list22 = list2;
                                Ref$IntRef ref$IntRef42 = ref$IntRef4;
                                switch (i62) {
                                    case 0:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(AbstractC8405.m13972(3114));
                                        sb.append(AbstractC8405.m13972(2772) + list22.size() + AbstractC8405.m13972(3115));
                                        sb.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef32.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        if (ref$IntRef42.element > 0) {
                                            sb.append(AbstractC8405.m13972(2774) + ref$IntRef42.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        }
                                        String string = sb.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC8211.m13736(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC8211.m13736(string, WaitDialog$TYPE.WARNING, 3500L);
                                        }
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(AbstractC8405.m13972(3129));
                                        sb2.append(AbstractC8405.m13972(2772) + list22.size() + AbstractC8405.m13972(3130));
                                        sb2.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef32.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        if (ref$IntRef42.element > 0) {
                                            sb2.append(AbstractC8405.m13972(2774) + ref$IntRef42.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        }
                                        String string2 = sb2.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC8211.m13736(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC8211.m13736(string2, WaitDialog$TYPE.WARNING, 3500L);
                                        }
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    i = i6 + 1;
                    final String str2 = (String) it.next();
                    final float size2 = i / list2.size();
                    final int i7 = 1;
                    handler4.post(new Runnable() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏兰哲
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i62 = i7;
                            float f = size2;
                            String str22 = str2;
                            List list22 = list2;
                            int i72 = i6;
                            switch (i62) {
                                case 0:
                                    C8198.m13708(AbstractC8405.m13972(3112) + (i72 + 1) + '/' + list22.size() + AbstractC8405.m13972(3113) + str22, f);
                                    break;
                                default:
                                    C8198.m13708(AbstractC8405.m13972(3127) + (i72 + 1) + '/' + list22.size() + AbstractC8405.m13972(3128) + str22, f);
                                    break;
                            }
                        }
                    });
                    try {
                        QQNTTroopSettingTool.quitGroup(str2);
                        ref$IntRef3.element++;
                    } catch (Exception unused2) {
                        ref$IntRef4.element++;
                    }
                }
                break;
            default:
                Resources resources = (Resources) obj2;
                String str3 = (String) obj;
                try {
                    resources.addLoaders(AbstractC3933.f12150);
                    AbstractC3933.m8310(resources, str3);
                    return;
                } catch (IllegalArgumentException e3) {
                    if (!"Cannot modify resource loaders of ResourcesImpl not registered with ResourcesManager".equals(e3.getMessage())) {
                        throw e3;
                    }
                    Log.e("ActivityProxy", Log.getStackTraceString(e3));
                    AbstractC3933.m8310(resources, str3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC8868(Object obj, int i, Object obj2) {
        this.f25014 = i;
        this.f25012 = obj;
        this.f25013 = obj2;
    }
}
