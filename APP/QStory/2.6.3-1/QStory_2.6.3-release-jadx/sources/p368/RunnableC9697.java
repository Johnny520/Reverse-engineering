package p368;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Handler;
import android.util.Log;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import lin.xposed.hook.util.p011qq.QQNTTroopSettingTool;
import p103.C7897;
import p105.C8009;
import p178.AbstractC8482;
import p209.C8657;
import p273.AbstractC9040;
import p273.C9027;
import p273.C9037;
import p303.AbstractC9234;
import p346.C9606;
import p355.C9637;
import p371.C9719;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9697 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f25357;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f25358;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25359;

    public /* synthetic */ RunnableC9697(C8009 c8009, String str) {
        this.f25359 = 2;
        this.f25358 = c8009;
        this.f25357 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f25359;
        final int i2 = 1;
        Object obj = this.f25358;
        Object obj2 = this.f25357;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                C8009 c8009 = (C8009) obj;
                Handler handler = AbstractC9694.f25352;
                try {
                    if (((AbstractC8482.m13479(context, AbstractC9234.m14531(3262)) == 0 || AbstractC8482.m13479(context, AbstractC9234.m14531(3263)) == 0) ? 1 : 0) == 0) {
                        return;
                    }
                    while (!AbstractC9694.m15091(context)) {
                        Thread.sleep(1000L);
                    }
                    Object systemService = context.getSystemService(AbstractC9234.m14531(1235));
                    AbstractC9234.m14531(3261);
                    systemService.getClass();
                    LocationManager locationManager = (LocationManager) systemService;
                    if (!locationManager.isProviderEnabled(AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵喵呜")) && !locationManager.isProviderEnabled(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵呜喵"))) {
                        return;
                    }
                    while (AbstractC9694.m15091(context)) {
                        Thread.sleep(1800000L);
                        AbstractC9694.f25352.post(new RunnableC9697(c8009, AbstractC9694.m15094(context)));
                        break;
                    }
                    return;
                } catch (Exception e) {
                    AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    Log.e(e.getClass().getSimpleName(), AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"), e);
                    return;
                }
            case 1:
                Context context2 = (Context) obj2;
                C7897 c7897 = (C7897) obj;
                Handler handler2 = AbstractC9694.f25352;
                try {
                    handler2.post(new RunnableC9697(c7897, 3, AbstractC9694.m15094(context2)));
                    return;
                } catch (Exception e2) {
                    AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
                    Log.e(e2.getClass().getSimpleName(), AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵呜喵呜喵呜呜喵~喵呜喵喵喵喵喵呜"), e2);
                    handler2.post(new RunnableC9696(c7897, i));
                    return;
                }
            case 2:
                ((C8009) obj).invoke((String) obj2);
                return;
            case 3:
                ((C7897) obj2).invoke((String) obj);
                return;
            case 4:
                final List<String> list = (List) obj2;
                Handler handler3 = ((C9719) obj).f25405;
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
                                    C9027.m14267(AbstractC9234.m14531(3112) + (i7 + 1) + '/' + list2.size() + AbstractC9234.m14531(3113) + str2, f);
                                    break;
                                default:
                                    C9027.m14267(AbstractC9234.m14531(3127) + (i7 + 1) + '/' + list2.size() + AbstractC9234.m14531(3128) + str2, f);
                                    break;
                            }
                        }
                    });
                    try {
                        C9637.f25139.getClass();
                        C9637.m15040(str);
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
                                sb.append(AbstractC9234.m14531(3114));
                                sb.append(AbstractC9234.m14531(2772) + list2.size() + AbstractC9234.m14531(3115));
                                sb.append(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef3.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                if (ref$IntRef4.element > 0) {
                                    sb.append(AbstractC9234.m14531(2774) + ref$IntRef4.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                }
                                String string = sb.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC9040.m14295(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC9040.m14295(string, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(AbstractC9234.m14531(3129));
                                sb2.append(AbstractC9234.m14531(2772) + list2.size() + AbstractC9234.m14531(3130));
                                sb2.append(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef3.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                if (ref$IntRef4.element > 0) {
                                    sb2.append(AbstractC9234.m14531(2774) + ref$IntRef4.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                }
                                String string2 = sb2.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC9040.m14295(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC9040.m14295(string2, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                        }
                    }
                }, 200L);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                C8657 c8657 = (C8657) obj;
                C9027.m14269();
                if (arrayList.isEmpty()) {
                    AbstractC9040.m14294(AbstractC9234.m14531(3126), WaitDialog$TYPE.WARNING);
                    return;
                }
                C9037 c9037 = new C9037();
                c9037.f22959 = AbstractC9234.m14531(3118) + arrayList.size() + ')';
                c9037.mo14280();
                c9037.f22971 = AbstractC9234.m14531(3119);
                c9037.mo14280();
                c9037.mo14279(true);
                c9037.mo14282(new C9606(c8657, arrayList));
                c9037.f22970 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
                c9037.mo14280();
                c9037.m14290();
                c8657.f21711 = c9037;
                return;
            case 6:
                final List list2 = (List) obj2;
                Handler handler4 = (Handler) ((C8657) obj).f21712;
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
                                        sb.append(AbstractC9234.m14531(3114));
                                        sb.append(AbstractC9234.m14531(2772) + list22.size() + AbstractC9234.m14531(3115));
                                        sb.append(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef32.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        if (ref$IntRef42.element > 0) {
                                            sb.append(AbstractC9234.m14531(2774) + ref$IntRef42.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        }
                                        String string = sb.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC9040.m14295(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC9040.m14295(string, WaitDialog$TYPE.WARNING, 3500L);
                                        }
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(AbstractC9234.m14531(3129));
                                        sb2.append(AbstractC9234.m14531(2772) + list22.size() + AbstractC9234.m14531(3130));
                                        sb2.append(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ref$IntRef32.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        if (ref$IntRef42.element > 0) {
                                            sb2.append(AbstractC9234.m14531(2774) + ref$IntRef42.element + AbstractC9234.m14532("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                                        }
                                        String string2 = sb2.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC9040.m14295(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC9040.m14295(string2, WaitDialog$TYPE.WARNING, 3500L);
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
                                    C9027.m14267(AbstractC9234.m14531(3112) + (i72 + 1) + '/' + list22.size() + AbstractC9234.m14531(3113) + str22, f);
                                    break;
                                default:
                                    C9027.m14267(AbstractC9234.m14531(3127) + (i72 + 1) + '/' + list22.size() + AbstractC9234.m14531(3128) + str22, f);
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
                    resources.addLoaders(AbstractC4765.f12495);
                    AbstractC4765.m8869(resources, str3);
                    return;
                } catch (IllegalArgumentException e3) {
                    if (!"Cannot modify resource loaders of ResourcesImpl not registered with ResourcesManager".equals(e3.getMessage())) {
                        throw e3;
                    }
                    Log.e("ActivityProxy", Log.getStackTraceString(e3));
                    AbstractC4765.m8869(resources, str3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC9697(Object obj, int i, Object obj2) {
        this.f25359 = i;
        this.f25357 = obj;
        this.f25358 = obj2;
    }
}
