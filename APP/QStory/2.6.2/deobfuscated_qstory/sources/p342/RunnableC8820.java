package p342;

import android.content.Context;
import android.content.res.Resources;
import android.location.LocationManager;
import android.os.Handler;
import android.util.Log;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import lin.xposed.hook.util.qq.QQNTTroopSettingTool;
import p000.AbstractC6087;
import p087.C7067;
import p089.C7179;
import p162.AbstractC7652;
import p193.C7827;
import p257.AbstractC8210;
import p257.C8197;
import p257.C8207;
import p329.C8786;
import p338.C8810;
import p352.C8873;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8820 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24808;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24810;

    public /* synthetic */ RunnableC8820(C7179 c7179, String str) {
        this.f24810 = 2;
        this.f24809 = c7179;
        this.f24808 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24810;
        final int i2 = 1;
        Object obj = this.f24809;
        Object obj2 = this.f24808;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                C7179 c7179 = (C7179) obj;
                Handler handler = AbstractC8817.f24803;
                try {
                    if (((AbstractC7652.m12891(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC7652.m12891(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) ? 1 : 0) == 0) {
                        return;
                    }
                    while (!AbstractC8817.m14461(context)) {
                        Thread.sleep(1000L);
                    }
                    Object systemService = context.getSystemService("location");
                    "null cannot be cast to non-null type android.location.LocationManager";
                    systemService.getClass();
                    LocationManager locationManager = (LocationManager) systemService;
                    if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
                        return;
                    }
                    while (AbstractC8817.m14461(context)) {
                        Thread.sleep(1800000L);
                        AbstractC8817.f24803.post(new RunnableC8820(c7179, AbstractC8817.m14464(context)));
                        break;
                    }
                    return;
                } catch (Exception e) {
                    "<this>";
                    Log.e(e.getClass().getSimpleName(), "error: ", e);
                    return;
                }
            case 1:
                Context context2 = (Context) obj2;
                C7067 c7067 = (C7067) obj;
                Handler handler2 = AbstractC8817.f24803;
                try {
                    handler2.post(new RunnableC8820(c7067, 3, AbstractC8817.m14464(context2)));
                    return;
                } catch (Exception e2) {
                    "<this>";
                    Log.e(e2.getClass().getSimpleName(), "error: ", e2);
                    handler2.post(new RunnableC8819(c7067, i));
                    return;
                }
            case 2:
                ((C7179) obj).invoke((String) obj2);
                return;
            case 3:
                ((C7067) obj2).invoke((String) obj);
                return;
            case 4:
                final List<String> list = (List) obj2;
                Handler handler3 = ((C8873) obj).f25009;
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                final int i3 = 0;
                for (final String str : list) {
                    int i4 = i3 + 1;
                    final float size = i4 / list.size();
                    final int i5 = 0;
                    handler3.post(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世苏兰哲
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i6 = i5;
                            float f = size;
                            String str2 = str;
                            List list2 = list;
                            int i7 = i3;
                            switch (i6) {
                                case 0:
                                    C8197.m13691("\u6b63\u5728\u5220\u9664\u597d\u53cb (" + (i7 + 1) + '/' + list2.size() + ")\nQQ\u53f7: " + str2, f);
                                    break;
                                default:
                                    C8197.m13691("\u6b63\u5728\u9000\u51fa\u7fa4 (" + (i7 + 1) + '/' + list2.size() + ")\n\u7fa4\u53f7: " + str2, f);
                                    break;
                            }
                        }
                    });
                    try {
                        C8810.f24796.getClass();
                        C8810.m14458(str);
                        ref$IntRef.element++;
                    } catch (Exception unused) {
                        ref$IntRef2.element++;
                    }
                    i3 = i4;
                }
                handler3.postDelayed(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世哲苏兰
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = i;
                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                        List list2 = list;
                        Ref$IntRef ref$IntRef4 = ref$IntRef2;
                        switch (i6) {
                            case 0:
                                StringBuilder sb = new StringBuilder();
                                sb.append("\u5220\u9664\u5b8c\u6210\uff01\n");
                                sb.append("\u5171\u5904\u7406 " + list2.size() + " \u4f4d\u597d\u53cb\n");
                                sb.append("\u6210\u529f " + ref$IntRef3.element + " \u4e2a");
                                if (ref$IntRef4.element > 0) {
                                    sb.append("\uff0c\u5931\u8d25 " + ref$IntRef4.element + " \u4e2a");
                                }
                                String string = sb.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC8210.m13719(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC8210.m13719(string, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("\u9000\u51fa\u5b8c\u6210\uff01\n");
                                sb2.append("\u5171\u5904\u7406 " + list2.size() + " \u4e2a\u7fa4\n");
                                sb2.append("\u6210\u529f " + ref$IntRef3.element + " \u4e2a");
                                if (ref$IntRef4.element > 0) {
                                    sb2.append("\uff0c\u5931\u8d25 " + ref$IntRef4.element + " \u4e2a");
                                }
                                String string2 = sb2.toString();
                                if (ref$IntRef4.element <= 0) {
                                    AbstractC8210.m13719(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                } else {
                                    AbstractC8210.m13719(string2, WaitDialog$TYPE.WARNING, 3500L);
                                }
                                break;
                        }
                    }
                }, 200L);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) obj2;
                C7827 c7827 = (C7827) obj;
                C8197.m13693();
                if (arrayList.isEmpty()) {
                    AbstractC8210.m13718("\u7fa4\u5217\u8868\u4e3a\u7a7a", WaitDialog$TYPE.WARNING);
                    return;
                }
                C8207 c8207 = new C8207();
                c8207.f22615 = "\u6279\u91cf\u7ba1\u7406\u7fa4 (" + arrayList.size() + ')';
                c8207.mo13704();
                c8207.f22627 = "\u52fe\u9009\u9700\u8981\u9000\u51fa\u7684\u7fa4\uff08\u6211\u521b\u5efa\u7684\u7fa4\u4e0d\u53ef\u52fe\u9009\uff09";
                c8207.mo13704();
                c8207.mo13703(true);
                c8207.mo13706(new C8786(c7827, arrayList));
                c8207.f22626 = "\u5173\u95ed";
                c8207.mo13704();
                c8207.m13714();
                c7827.f21369 = c8207;
                return;
            case 6:
                final List list2 = (List) obj2;
                Handler handler4 = (Handler) ((C7827) obj).f21370;
                final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                final Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                Iterator it = list2.iterator();
                while (true) {
                    final int i6 = i;
                    if (!it.hasNext()) {
                        handler4.postDelayed(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世哲苏兰
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i62 = i2;
                                Ref$IntRef ref$IntRef32 = ref$IntRef3;
                                List list22 = list2;
                                Ref$IntRef ref$IntRef42 = ref$IntRef4;
                                switch (i62) {
                                    case 0:
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("\u5220\u9664\u5b8c\u6210\uff01\n");
                                        sb.append("\u5171\u5904\u7406 " + list22.size() + " \u4f4d\u597d\u53cb\n");
                                        sb.append("\u6210\u529f " + ref$IntRef32.element + " \u4e2a");
                                        if (ref$IntRef42.element > 0) {
                                            sb.append("\uff0c\u5931\u8d25 " + ref$IntRef42.element + " \u4e2a");
                                        }
                                        String string = sb.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC8210.m13719(string, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC8210.m13719(string, WaitDialog$TYPE.WARNING, 3500L);
                                        }
                                        break;
                                    default:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("\u9000\u51fa\u5b8c\u6210\uff01\n");
                                        sb2.append("\u5171\u5904\u7406 " + list22.size() + " \u4e2a\u7fa4\n");
                                        sb2.append("\u6210\u529f " + ref$IntRef32.element + " \u4e2a");
                                        if (ref$IntRef42.element > 0) {
                                            sb2.append("\uff0c\u5931\u8d25 " + ref$IntRef42.element + " \u4e2a");
                                        }
                                        String string2 = sb2.toString();
                                        if (ref$IntRef42.element <= 0) {
                                            AbstractC8210.m13719(string2, WaitDialog$TYPE.SUCCESS, 2500L);
                                        } else {
                                            AbstractC8210.m13719(string2, WaitDialog$TYPE.WARNING, 3500L);
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
                    handler4.post(new Runnable() { // from class: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世苏兰哲
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i62 = i7;
                            float f = size2;
                            String str22 = str2;
                            List list22 = list2;
                            int i72 = i6;
                            switch (i62) {
                                case 0:
                                    C8197.m13691("\u6b63\u5728\u5220\u9664\u597d\u53cb (" + (i72 + 1) + '/' + list22.size() + ")\nQQ\u53f7: " + str22, f);
                                    break;
                                default:
                                    C8197.m13691("\u6b63\u5728\u9000\u51fa\u7fa4 (" + (i72 + 1) + '/' + list22.size() + ")\n\u7fa4\u53f7: " + str22, f);
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
                    resources.addLoaders(AbstractC6087.f16639);
                    AbstractC6087.m11397(resources, str3);
                    return;
                } catch (IllegalArgumentException e3) {
                    if (!"Cannot modify resource loaders of ResourcesImpl not registered with ResourcesManager".equals(e3.getMessage())) {
                        throw e3;
                    }
                    Log.e("ActivityProxy", Log.getStackTraceString(e3));
                    AbstractC6087.m11397(resources, str3);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC8820(Object obj, int i, Object obj2) {
        this.f24810 = i;
        this.f24808 = obj;
        this.f24809 = obj2;
    }
}
