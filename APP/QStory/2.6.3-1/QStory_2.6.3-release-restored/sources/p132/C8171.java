package p132;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0909;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import com.davemorrissey.labs.subscaleview.C0328R;
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
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p068.InterfaceC7372;
import p128.C8155;
import p135.C8205;
import p135.C8210;
import p158.C8367;
import p158.C8371;
import p158.InterfaceC8366;
import p161.C8390;
import p163.C8401;
import p224.C8744;
import p233.AbstractC8798;
import p273.C9041;
import p273.C9062;
import p339.C9548;
import p359.C9648;
import p402.C9904;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8171 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f19907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19908;

    public /* synthetic */ C8171(Object obj, int i) {
        this.f19908 = i;
        this.f19907 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        Pair[] pairArr;
        int i = this.f19908;
        C6008 c6008 = C6008.f15084;
        char c = 1;
        int i2 = 0;
        Object obj = this.f19907;
        switch (i) {
            case 0:
                C8170 c8170 = (C8170) obj;
                InterfaceC8175 interfaceC8175 = c8170.f19906;
                Object obj2 = c8170.f19901;
                if (obj2 != null) {
                    return interfaceC8175.mo4321(c8170, obj2);
                }
                C6755.m11869("Value should be initialized");
                return null;
            case 1:
                C8367 c8367 = ((C8178) obj).f19921;
                if (c8367 == null) {
                    return null;
                }
                Map mapM9335 = AbstractC5171.m9335();
                if (mapM9335.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM9335.size());
                    for (Map.Entry entry : mapM9335.entrySet()) {
                        arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleM10437 = AbstractC5754.m10437((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                c8367.m13316(bundleM10437);
                if (bundleM10437.isEmpty()) {
                    return null;
                }
                return bundleM10437;
            case 2:
                C8210 c8210 = (C8210) obj;
                c8210.f20350 = null;
                AbstractC2620.m3914(c8210);
                AbstractC2620.m3910(c8210);
                AbstractC2620.m3911(c8210);
                return Boolean.TRUE;
            case 3:
                C8205 c8205 = (C8205) obj;
                c8205.f20326 = null;
                AbstractC2620.m3914(c8205);
                AbstractC2620.m3910(c8205);
                AbstractC2620.m3911(c8205);
                return Boolean.TRUE;
            case 4:
                InterfaceC8366 interfaceC8366 = (InterfaceC8366) obj;
                interfaceC8366.getLifecycle().mo5063(new C8371(interfaceC8366, i2));
                return c6008;
            case 5:
                ClassLoader classLoader = ((C8390) obj).f20815;
                Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                clsLoadClass.getClass();
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass2.getClass();
                declaredMethod.getClass();
                return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass2) && Modifier.isPublic(declaredMethod.getModifiers()));
            case 6:
                C8401 c8401 = (C8401) obj;
                return BigInteger.valueOf(c8401.f20842).shiftLeft(32).or(BigInteger.valueOf(c8401.f20840)).shiftLeft(32).or(BigInteger.valueOf(c8401.f20841));
            case 7:
                C8744 c8744 = (C8744) obj;
                InterfaceC2230 interfaceC2230 = c8744.f22276;
                if (((C8155) ((AbstractC2182) interfaceC2230).getValue()).f19872 == 9205357640488583168L || C8155.m13072(((C8155) ((AbstractC2182) interfaceC2230).getValue()).f19872)) {
                    return null;
                }
                return c8744.f22277.mo3428(((C8155) ((AbstractC2182) interfaceC2230).getValue()).f19872);
            default:
                C9904 c9904 = (C9904) obj;
                C9648 c9648 = c9904.f25788;
                if (c9648 == null) {
                    AbstractC5227.m9467("adapter");
                    throw null;
                }
                List list = c9648.f22387;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Message.m11764((Message) it.next()));
                }
                C9648 c96482 = c9904.f25788;
                if (c96482 == null) {
                    AbstractC5227.m9467("adapter");
                    throw null;
                }
                AbstractC8798.m14017(c96482, arrayList2);
                try {
                    View viewInflate = LayoutInflater.from(c9904.f25777).inflate(C0328R.layout.layout_glow_tip, (ViewGroup) null);
                    ((TextView) viewInflate.findViewById(C0328R.id.tv_glow_tip_text)).setText("已标记全部为已读");
                    C9062 c9062M14311 = C9062.m14311();
                    c9062M14311.f23067 = new C9548(viewInflate, c == true ? 1 : 0);
                    c9062M14311.m14312();
                    c9062M14311.f23061 = CustomDialog$ALIGN.CENTER;
                    c9062M14311.m14312();
                    c9062M14311.f23069 = BaseDialog$BOOLEAN.TRUE;
                    c9062M14311.m14312();
                    c9062M14311.m14313();
                    break;
                } catch (Exception unused) {
                    C9041.m14296("已标记全部为已读");
                }
                Handler handler = c9904.f25780;
                Runnable runnable = c9904.f25781;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                RunnableC0909 runnableC0909 = new RunnableC0909(c9904, 29);
                c9904.f25781 = runnableC0909;
                handler.post(runnableC0909);
                return c6008;
        }
    }
}
