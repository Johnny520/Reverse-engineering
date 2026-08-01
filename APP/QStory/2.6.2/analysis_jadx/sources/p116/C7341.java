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
import kotlin.C5175;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p112.C7325;
import p119.C7375;
import p119.C7380;
import p142.C7537;
import p142.C7541;
import p142.InterfaceC7536;
import p145.C7560;
import p147.C7571;
import p208.C7914;
import p217.AbstractC7968;
import p257.C8211;
import p257.C8232;
import p319.C8696;
import p341.C8816;
import p385.C9088;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7341 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f19567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19568;

    public /* synthetic */ C7341(Object obj, int i) {
        this.f19568 = i;
        this.f19567 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        Pair[] pairArr;
        int i = this.f19568;
        C5175 c5175 = C5175.f14739;
        char c = 1;
        int i2 = 0;
        Object obj = this.f19567;
        switch (i) {
            case 0:
                C7340 c7340 = (C7340) obj;
                InterfaceC7345 interfaceC7345 = c7340.f19566;
                Object obj2 = c7340.f19561;
                if (obj2 != null) {
                    return interfaceC7345.mo3751(c7340, obj2);
                }
                C5919.m11249("Value should be initialized");
                return null;
            case 1:
                C7537 c7537 = ((C7348) obj).f19581;
                if (c7537 == null) {
                    return null;
                }
                Map mapM8781 = AbstractC4338.m8781();
                if (mapM8781.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM8781.size());
                    for (Map.Entry entry : mapM8781.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleM11400 = AbstractC6087.m11400((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                c7537.m12728(bundleM11400);
                if (bundleM11400.isEmpty()) {
                    return null;
                }
                return bundleM11400;
            case 2:
                C7380 c7380 = (C7380) obj;
                c7380.f20010 = null;
                AbstractC1785.m3344(c7380);
                AbstractC1785.m3340(c7380);
                AbstractC1785.m3341(c7380);
                return Boolean.TRUE;
            case 3:
                C7375 c7375 = (C7375) obj;
                c7375.f19986 = null;
                AbstractC1785.m3344(c7375);
                AbstractC1785.m3340(c7375);
                AbstractC1785.m3341(c7375);
                return Boolean.TRUE;
            case 4:
                InterfaceC7536 interfaceC7536 = (InterfaceC7536) obj;
                interfaceC7536.getLifecycle().mo4493(new C7541(interfaceC7536, i2));
                return c5175;
            case 5:
                ClassLoader classLoader = ((C7560) obj).f20475;
                Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 6:
                C7571 c7571 = (C7571) obj;
                return BigInteger.valueOf(c7571.f20502).shiftLeft(32).or(BigInteger.valueOf(c7571.f20500)).shiftLeft(32).or(BigInteger.valueOf(c7571.f20501));
            case 7:
                C7914 c7914 = (C7914) obj;
                InterfaceC1395 interfaceC1395 = c7914.f21934;
                if (((C7325) ((AbstractC1347) interfaceC1395).getValue()).f19532 == 9205357640488583168L || C7325.m12486(((C7325) ((AbstractC1347) interfaceC1395).getValue()).f19532)) {
                    return null;
                }
                return c7914.f21935.mo2858(((C7325) ((AbstractC1347) interfaceC1395).getValue()).f19532);
            default:
                C9088 c9088 = (C9088) obj;
                C8816 c8816 = c9088.f25393;
                if (c8816 == null) {
                    AbstractC4394.m8918("adapter");
                    throw null;
                }
                List list = c8816.f22045;
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Message.m11148((Message) it.next()));
                }
                C8816 c88162 = c9088.f25393;
                if (c88162 == null) {
                    AbstractC4394.m8918("adapter");
                    throw null;
                }
                AbstractC7968.m13430(c88162, arrayList2);
                try {
                    View viewInflate = LayoutInflater.from(c9088.f25382).inflate(R.layout.layout_glow_tip, (ViewGroup) null);
                    ((TextView) viewInflate.findViewById(R.id.tv_glow_tip_text)).setText("已标记全部为已读");
                    C8232 c8232M13736 = C8232.m13736();
                    c8232M13736.f22723 = new C8696(viewInflate, c == true ? 1 : 0);
                    c8232M13736.m13737();
                    c8232M13736.f22717 = CustomDialog$ALIGN.CENTER;
                    c8232M13736.m13737();
                    c8232M13736.f22725 = BaseDialog$BOOLEAN.TRUE;
                    c8232M13736.m13737();
                    c8232M13736.m13738();
                    break;
                } catch (Exception unused) {
                    C8211.m13720("已标记全部为已读");
                }
                Handler handler = c9088.f25385;
                Runnable runnable = c9088.f25386;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                RunnableC0062 runnableC0062 = new RunnableC0062(c9088, 29);
                c9088.f25386 = runnableC0062;
                handler.post(runnableC0062);
                return c5175;
        }
    }
}
