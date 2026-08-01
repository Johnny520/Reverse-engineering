package p116;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.node.AbstractC1785;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.CustomDialog$ALIGN;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C5176;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p052.InterfaceC6543;
import p112.C7326;
import p119.C7376;
import p119.C7381;
import p142.C7538;
import p142.C7542;
import p142.InterfaceC7537;
import p145.C7561;
import p147.C7572;
import p208.C7915;
import p217.AbstractC7969;
import p257.C8212;
import p257.C8233;
import p323.C8719;
import p343.C8819;
import p386.C9075;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7342 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f19562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19563;

    public /* synthetic */ C7342(Object obj, int i) {
        this.f19563 = i;
        this.f19562 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        Pair[] pairArr;
        int i = this.f19563;
        C5176 c5176 = C5176.f14739;
        char c = 1;
        int i2 = 0;
        Object obj = this.f19562;
        switch (i) {
            case 0:
                C7341 c7341 = (C7341) obj;
                InterfaceC7346 interfaceC7346 = c7341.f19561;
                Object obj2 = c7341.f19556;
                if (obj2 != null) {
                    return interfaceC7346.mo3761(c7341, obj2);
                }
                C5925.m11310("Value should be initialized");
                return null;
            case 1:
                C7538 c7538 = ((C7349) obj).f19576;
                if (c7538 == null) {
                    return null;
                }
                Map mapM8776 = AbstractC4339.m8776();
                if (mapM8776.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM8776.size());
                    for (Map.Entry entry : mapM8776.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleM9878 = AbstractC4922.m9878((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                c7538.m12757(bundleM9878);
                if (bundleM9878.isEmpty()) {
                    return null;
                }
                return bundleM9878;
            case 2:
                C7381 c7381 = (C7381) obj;
                c7381.f20005 = null;
                AbstractC1785.m3354(c7381);
                AbstractC1785.m3350(c7381);
                AbstractC1785.m3351(c7381);
                return Boolean.TRUE;
            case 3:
                C7376 c7376 = (C7376) obj;
                c7376.f19981 = null;
                AbstractC1785.m3354(c7376);
                AbstractC1785.m3350(c7376);
                AbstractC1785.m3351(c7376);
                return Boolean.TRUE;
            case 4:
                InterfaceC7537 interfaceC7537 = (InterfaceC7537) obj;
                interfaceC7537.getLifecycle().mo4503(new C7542(interfaceC7537, i2));
                return c5176;
            case 5:
                ClassLoader classLoader = ((C7561) obj).f20470;
                Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 6:
                C7572 c7572 = (C7572) obj;
                return BigInteger.valueOf(c7572.f20497).shiftLeft(32).or(BigInteger.valueOf(c7572.f20495)).shiftLeft(32).or(BigInteger.valueOf(c7572.f20496));
            case 7:
                C7915 c7915 = (C7915) obj;
                InterfaceC1395 interfaceC1395 = c7915.f21931;
                if (((C7326) ((AbstractC1347) interfaceC1395).getValue()).f19527 == 9205357640488583168L || C7326.m12513(((C7326) ((AbstractC1347) interfaceC1395).getValue()).f19527)) {
                    return null;
                }
                return c7915.f21932.mo2868(((C7326) ((AbstractC1347) interfaceC1395).getValue()).f19527);
            default:
                C9075 c9075 = (C9075) obj;
                C8819 c8819 = c9075.f25443;
                if (c8819 == null) {
                    AbstractC4395.m8908("adapter");
                    throw null;
                }
                List list = c8819.f22042;
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Message.m11205((Message) it.next()));
                }
                C8819 c88192 = c9075.f25443;
                if (c88192 == null) {
                    AbstractC4395.m8908("adapter");
                    throw null;
                }
                AbstractC7969.m13458(c88192, arrayList2);
                try {
                    View viewInflate = LayoutInflater.from(c9075.f25432).inflate(R.layout.layout_glow_tip, (ViewGroup) null);
                    ((TextView) viewInflate.findViewById(R.id.tv_glow_tip_text)).setText("已标记全部为已读");
                    C8233 c8233M13752 = C8233.m13752();
                    c8233M13752.f22722 = new C8719(viewInflate, c == true ? 1 : 0);
                    c8233M13752.m13753();
                    c8233M13752.f22716 = CustomDialog$ALIGN.CENTER;
                    c8233M13752.m13753();
                    c8233M13752.f22724 = BaseDialog$BOOLEAN.TRUE;
                    c8233M13752.m13753();
                    c8233M13752.m13754();
                    break;
                } catch (Exception unused) {
                    C8212.m13737("已标记全部为已读");
                }
                Handler handler = c9075.f25435;
                Runnable runnable = c9075.f25436;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                RunnableC0062 runnableC0062 = new RunnableC0062(c9075, 29);
                c9075.f25436 = runnableC0062;
                handler.post(runnableC0062);
                return c5176;
        }
    }
}
