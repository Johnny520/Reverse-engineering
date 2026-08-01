package kotlin.reflect.jvm.internal.impl.types;

import android.graphics.Rect;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import androidx.activity.AbstractC0053;
import androidx.cardview.widget.CardView;
import androidx.collection.C0257;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.ui.text.input.C2019;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.InterfaceC2205;
import androidx.fragment.app.RunnableC2346;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.C2493;
import androidx.recyclerview.widget.C2494;
import androidx.viewpager2.widget.RunnableC2548;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C4210;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4639;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4859;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import kotlin.reflect.jvm.internal.impl.types.checker.C4856;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import net.bytebuddy.pool.TypePool;
import p005.InterfaceC6109;
import p005.InterfaceC6110;
import p005.InterfaceC6112;
import p007.AbstractC6136;
import p013.C6168;
import p013.C6169;
import p013.C6177;
import p015.C6204;
import p015.InterfaceC6209;
import p021.InterfaceC6253;
import p026.InterfaceC6294;
import p037.C6360;
import p049.AbstractC6529;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p069.C6896;
import p073.C6932;
import p073.C6934;
import p073.C6936;
import p073.C6939;
import p073.C6941;
import p075.C6960;
import p082.C7029;
import p082.C7033;
import p087.C7068;
import p087.C7073;
import p087.C7116;
import p087.C7122;
import p087.C7146;
import p087.InterfaceC7135;
import p089.InterfaceC7183;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7225;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p098.C7238;
import p098.C7239;
import p116.C7340;
import p116.InterfaceC7345;
import p126.InterfaceC7429;
import p150.AbstractC7582;
import p153.C7595;
import p166.C7683;
import p166.C7686;
import p167.C7688;
import p167.C7698;
import p167.C7699;
import p167.InterfaceC7706;
import p175.AbstractC7738;
import p197.InterfaceC7845;
import p206.C7908;
import p216.C7958;
import p217.C7967;
import p222.AbstractC7988;
import p223.C7992;
import p230.C8049;
import p230.C8050;
import p341.C8816;
import retrofit2.AbstractC5784;
import retrofit2.C5754;
import retrofit2.C5767;
import retrofit2.C5792;
import retrofit2.ExecutorC5781;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.CallableC5905;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4870 implements InterfaceC5795, InterfaceC5794, InterfaceC6209, InterfaceC6109, InterfaceC6294, InterfaceC4852, InterfaceC7135, InterfaceC7345, InterfaceC7429, InterfaceC2205, InterfaceC7706, InterfaceC7845 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14160;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14161;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14162;

    public C4870(int i) {
        this.f14162 = i;
        switch (i) {
            case 19:
                this.f14160 = Choreographer.getInstance();
                this.f14161 = Looper.myLooper();
                break;
            case 24:
                break;
            case 27:
                this.f14160 = new AtomicReference();
                this.f14161 = new C0257(0);
                break;
            case 28:
                this.f14160 = new ArrayList();
                this.f14161 = new HashMap();
                break;
            case 29:
                this.f14160 = new HashMap();
                this.f14161 = new C8049(0);
                break;
            default:
                this.f14160 = new ArrayList();
                this.f14161 = new ArrayList();
                break;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        ((C5792) this.f14161).f15891.execute(new RunnableC2346(this, (InterfaceC5794) this.f14160, th, 3));
    }

    @Override // retrofit2.InterfaceC5794
    public void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        ((C5792) this.f14161).f15891.execute(new RunnableC2346(this, (InterfaceC5794) this.f14160, c5754, 2));
    }

    public String toString() {
        switch (this.f14162) {
            case 25:
                String string = "[ ";
                if (((C7908) this.f14160) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM149 = AbstractC0053.m149(string);
                        sbM149.append(((C7908) this.f14160).f21889[i]);
                        sbM149.append(" ");
                        string = sbM149.toString();
                    }
                }
                StringBuilder sbM11553 = AbstractC6136.m11553(string, "] ");
                sbM11553.append((C7908) this.f14160);
                return sbM11553.toString();
            default:
                return super.toString();
        }
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC7230 mo9612(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7218 interfaceC7218M9716 = AbstractC4859.m9716(interfaceC7219);
        if (interfaceC7218M9716 == null) {
            interfaceC7218M9716 = mo9615(interfaceC7219);
        }
        return AbstractC4859.m9729(interfaceC7218M9716);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public /* bridge */ AbstractC4877 mo9601(AbstractC4881 abstractC4881) {
        return AbstractC4859.m9716(abstractC4881);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public /* bridge */ boolean mo9613(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9695(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo9614(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return interfaceC7219 instanceof C6939;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC7218 mo9615(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9677;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 != null && (abstractC4877M9677 = AbstractC4859.m9677(abstractC4895M9717)) != null) {
            return abstractC4877M9677;
        }
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        abstractC4877M9716.getClass();
        return abstractC4877M9716;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public /* bridge */ boolean mo9616(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9692(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public /* bridge */ boolean mo9617(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9693(interfaceC7219);
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public Object mo9053() {
        return (C7688) this.f14160;
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public int mo8324(int i) {
        CharSequence charSequence = (CharSequence) this.f14160;
        do {
            i = ((C2019) this.f14161).m3715(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p167.InterfaceC7706
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public boolean mo9054(CharSequence charSequence, int i, int i2, C7698 c7698) {
        if ((c7698.f20889 & 4) > 0) {
            return true;
        }
        if (((C7688) this.f14160) == null) {
            this.f14160 = new C7688(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C6960) this.f14161).getClass();
        ((C7688) this.f14160).setSpan(new C7699(c7698), i, i2, 33);
        return true;
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public int mo8325(int i) {
        do {
            i = ((C2019) this.f14161).m3716(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14160).charAt(i - 1)));
        return i;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo9618(InterfaceC7222 interfaceC7222) {
        return interfaceC7222 instanceof C6896;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public /* bridge */ boolean mo9619(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9688(interfaceC7230);
    }

    @Override // retrofit2.InterfaceC5795
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public Type mo9753() {
        return (Type) this.f14160;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public void mo9620(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        AbstractC4859.m9717(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC7222 mo9621(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9699(this, m9756(interfaceC7218));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public InterfaceC7218 mo9622(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9727;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 != null && (abstractC4877M9727 = AbstractC4859.m9727(abstractC4895M9717)) != null) {
            return abstractC4877M9727;
        }
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        abstractC4877M9716.getClass();
        return abstractC4877M9716;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public /* bridge */ InterfaceC7222 mo9623(InterfaceC7226 interfaceC7226) {
        return AbstractC4859.m9699(this, interfaceC7226);
    }

    @Override // p015.InterfaceC6209
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo973(C6177 c6177, C6204 c6204) {
        InterfaceC5794 interfaceC5794 = (InterfaceC5794) this.f14160;
        C5767 c5767 = (C5767) this.f14161;
        try {
            try {
                interfaceC5794.onResponse(c5767, c5767.m11101(c6204));
            } catch (Throwable th) {
                AbstractC5784.m11127(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC5784.m11127(th2);
            try {
                interfaceC5794.onFailure(c5767, th2);
            } catch (Throwable th3) {
                AbstractC5784.m11127(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public /* bridge */ InterfaceC7229 mo9624(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9720(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public boolean mo9625(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9692(mo9612(interfaceC7218)) && !AbstractC4859.m9683(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public /* bridge */ InterfaceC7219 mo9626(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9722(this, interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public /* bridge */ boolean mo9627(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9684(interfaceC7229);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public InterfaceC7219 mo9628(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9679(interfaceC7219);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set m9754(kotlin.reflect.jvm.internal.impl.types.C4918 r17, java.util.List r18, p082.C7033 r19) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4870.m9754(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲世兰, java.util.List, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰):java.util.Set");
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo9629(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4859.m9693(mo9615(interfaceC7219)) != AbstractC4859.m9693(mo9622(interfaceC7219));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public /* bridge */ int mo9630(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9678(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo9631(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9695(AbstractC4859.m9729(interfaceC7218));
    }

    @Override // p087.InterfaceC7135
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public InterfaceC7183 mo9755(InterfaceC5092 interfaceC5092) {
        Object obj = ((C7116) this.f14161).get(AbstractC6560.m12029(interfaceC5092));
        obj.getClass();
        C7068 c7068 = (C7068) obj;
        Object c7122 = c7068.f18976.get();
        if (c7122 == null) {
            synchronized (c7068) {
                c7122 = c7068.f18976.get();
                if (c7122 == null) {
                    c7122 = new C7122((InterfaceC7183) ((InterfaceC6557) this.f14160).invoke(interfaceC5092));
                    c7068.f18976 = new SoftReference(c7122);
                }
            }
        }
        return ((C7122) c7122).f19065;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public /* bridge */ AbstractC4913 mo9602(InterfaceC7226 interfaceC7226, InterfaceC7226 interfaceC72262) {
        return AbstractC4859.m9711(this, interfaceC7226, interfaceC72262);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public /* bridge */ InterfaceC7230 mo9632(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9729(interfaceC7218);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public InterfaceC7226 m9756(InterfaceC7218 interfaceC7218) {
        AbstractC4877 abstractC4877;
        C4905 c4905M9698 = AbstractC4859.m9698(interfaceC7218);
        return (c4905M9698 == null || (abstractC4877 = c4905M9698.f14226) == null) ? (InterfaceC7226) interfaceC7218 : abstractC4877;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9757(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4870.m9757(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public C4871 m9758() {
        return new C4871(true, true, true, this, C4849.f14128, C4848.f14127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public void m9759(C7595 c7595) {
        ExecutorC5781 executorC5781 = (ExecutorC5781) this.f14161;
        C5851 c5851 = (C5851) this.f14160;
        int i = c7595.f20597;
        if (i != 0) {
            executorC5781.execute(new RunnableC2548(c5851, i, 2));
        } else {
            executorC5781.execute(new RunnableC3741(10, c5851, c7595.f20598, false));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public void m9760(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f14161;
        cardView.f870.set(i, i2, i3, i4);
        Rect rect = cardView.f872;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void m9761(String str) {
        C8050 c8050;
        synchronized (this) {
            try {
                c8050 = (C8050) ((HashMap) this.f14160).get(str);
                AbstractC7988.m13441(c8050, "Argument must not be null");
                int i = c8050.f22224;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c8050.f22224);
                }
                int i2 = i - 1;
                c8050.f22224 = i2;
                if (i2 == 0) {
                    C8050 c80502 = (C8050) ((HashMap) this.f14160).remove(str);
                    if (!c80502.equals(c8050)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c8050 + ", but actually removed: " + c80502 + ", safeKey: " + str);
                    }
                    C8049 c8049 = (C8049) this.f14161;
                    synchronized (c8049.f22223) {
                        try {
                            if (c8049.f22223.size() < 10) {
                                c8049.f22223.offer(c80502);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c8050.f22225.unlock();
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo9633(InterfaceC7225 interfaceC7225) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7218) {
            return AbstractC4859.m9701((InterfaceC7219) interfaceC7225);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7225).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return 0;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public /* bridge */ boolean mo9634(InterfaceC7227 interfaceC7227, InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9691(interfaceC7227, interfaceC7230);
    }

    @Override // retrofit2.InterfaceC5795
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public Object mo9762(C5767 c5767) {
        Executor executor = (Executor) this.f14161;
        return executor == null ? c5767 : new C5792(executor, c5767);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public /* bridge */ boolean mo9635(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9694(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public /* bridge */ InterfaceC7220 mo9636(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9717(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public /* bridge */ InterfaceC7218 mo9637(InterfaceC7218 interfaceC7218, CaptureStatus captureStatus) {
        return AbstractC4859.m9721(interfaceC7218, captureStatus);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public AbstractC4881 m9763(InterfaceC4462 interfaceC4462, C7033 c7033) {
        interfaceC4462.getClass();
        c7033.getClass();
        return (AbstractC4881) ((C4836) this.f14161).invoke(new C4867(interfaceC4462, c7033));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public AbstractC4913 m9764(C7033 c7033) {
        AbstractC4913 abstractC4913M13033;
        AbstractC4877 abstractC4877 = c7033.f18879;
        return (abstractC4877 == null || (abstractC4913M13033 = AbstractC7738.m13033(abstractC4877)) == null) ? (C7238) ((InterfaceC5183) this.f14160).getValue() : abstractC4913M13033;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public synchronized ArrayList m9765(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f14160).iterator();
        while (it.hasNext()) {
            List<C7992> list = (List) ((HashMap) this.f14161).get((String) it.next());
            if (list != null) {
                for (C7992 c7992 : list) {
                    if ((c7992.f22084.isAssignableFrom(cls) && cls2.isAssignableFrom(c7992.f22083)) && !arrayList.contains(c7992.f22083)) {
                        arrayList.add(c7992.f22083);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public synchronized List m9766(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f14160).contains(str)) {
                ((ArrayList) this.f14160).add(str);
            }
            arrayList = (List) ((HashMap) this.f14161).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f14161).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public void m9767(String str, String str2, InterfaceC6557 interfaceC6557) {
        LinkedHashMap linkedHashMap = ((C6936) this.f14161).f18509;
        C6932 c6932 = new C6932(this, str, str2);
        interfaceC6557.invoke(c6932);
        String str3 = (String) this.f14160;
        ArrayList arrayList = c6932.f18500;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        String strM11558 = (String) c6932.f18499.getFirst();
        strM11558.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC4343.m8813(arrayList2, "", null, null, C4639.f13562, 30));
        sb.append(')');
        if (strM11558.length() > 1) {
            strM11558 = AbstractC6136.m11558(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", strM11558);
        }
        sb.append(strM11558);
        String strM163 = AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str3, sb.toString());
        C6934 c6934 = (C6934) c6932.f18499.getSecond();
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C6934) ((Pair) it2.next()).getSecond());
        }
        Pair pair = new Pair(strM163, new C6941(c6934, arrayList3, c6932.f18501));
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public Object m9768(InterfaceC5092 interfaceC5092, ArrayList arrayList) {
        Object objM162;
        Object objM1622;
        Object objPutIfAbsent;
        switch (this.f14162) {
            case 11:
                Object obj = ((C7116) this.f14161).get(AbstractC6560.m12029(interfaceC5092));
                obj.getClass();
                C7068 c7068 = (C7068) obj;
                Object c7146 = c7068.f18976.get();
                if (c7146 == null) {
                    synchronized (c7068) {
                        c7146 = c7068.f18976.get();
                        if (c7146 == null) {
                            c7146 = new C7146();
                            c7068.f18976 = new SoftReference(c7146);
                        }
                    }
                }
                C7146 c71462 = (C7146) c7146;
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C7073((InterfaceC5086) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = c71462.f19115;
                Object obj2 = concurrentHashMap.get(arrayList2);
                if (obj2 == null) {
                    try {
                        objM162 = Result.m8755constructorimpl((InterfaceC7183) ((InterfaceC6553) this.f14160).invoke(interfaceC5092, arrayList));
                    } catch (Throwable th) {
                        objM162 = AbstractC0053.m162(th);
                    }
                    Result resultM8754boximpl = Result.m8754boximpl(objM162);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, resultM8754boximpl);
                    obj2 = objPutIfAbsent2 == null ? resultM8754boximpl : objPutIfAbsent2;
                    break;
                }
                obj2.getClass();
                return ((Result) obj2).getValue();
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f14161;
                Class clsM12029 = AbstractC6560.m12029(interfaceC5092);
                Object c71463 = concurrentHashMap2.get(clsM12029);
                if (c71463 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsM12029, (c71463 = new C7146()))) != null) {
                    c71463 = objPutIfAbsent;
                }
                C7146 c71464 = (C7146) c71463;
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C7073((InterfaceC5086) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = c71464.f19115;
                Object obj3 = concurrentHashMap3.get(arrayList3);
                if (obj3 == null) {
                    try {
                        objM1622 = Result.m8755constructorimpl((InterfaceC7183) ((InterfaceC6553) this.f14160).invoke(interfaceC5092, arrayList));
                    } catch (Throwable th2) {
                        objM1622 = AbstractC0053.m162(th2);
                    }
                    Result resultM8754boximpl2 = Result.m8754boximpl(objM1622);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, resultM8754boximpl2);
                    obj3 = objPutIfAbsent3 == null ? resultM8754boximpl2 : objPutIfAbsent3;
                    break;
                }
                obj3.getClass();
                return ((Result) obj3).getValue();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ AbstractC4877 mo9603(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9727(interfaceC7220);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ AbstractC4877 mo9604(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9677(interfaceC7220);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ AbstractC4877 mo9605(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9723(interfaceC7218, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public AbstractC6529 mo9606() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6110 mo381() {
        return (C6168) this.f14161;
    }

    @Override // p026.InterfaceC6294
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = ((Method) this.f14160).invoke(methodHookParam.thisObject, null);
        ((List) methodHookParam.getResult()).add(C6360.m11913(objInvoke, AbstractC3056.m6668(-3937575491062728103L), R.mipmap.ic_launcher_round, new CallableC5905((ClassLoader) this.f14161, 2, objInvoke)));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public /* bridge */ int mo9640(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9701(interfaceC7219);
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public Object mo3750(Object obj) {
        return ((InterfaceC6557) this.f14161).invoke(obj);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public /* bridge */ InterfaceC7225 mo9642(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9700(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public boolean mo9643(InterfaceC7218 interfaceC7218) {
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7218);
        return (abstractC4877M9716 != null ? AbstractC4859.m9699(this, m9756(abstractC4877M9716)) : null) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo9644(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return !AbstractC4394.m8917(AbstractC4859.m9729(mo9615(interfaceC7219)), AbstractC4859.m9729(mo9622(interfaceC7219)));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public /* bridge */ CaptureStatus mo9645(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9718(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo9646(InterfaceC7230 interfaceC7230, InterfaceC7230 interfaceC72302) {
        interfaceC7230.getClass();
        interfaceC72302.getClass();
        if (!(interfaceC7230 instanceof InterfaceC4872)) {
            C5919.m11249("Failed requirement.");
            return false;
        }
        if (!(interfaceC72302 instanceof InterfaceC4872)) {
            C5919.m11249("Failed requirement.");
            return false;
        }
        if (AbstractC4859.m9702(interfaceC7230, interfaceC72302)) {
            return true;
        }
        InterfaceC4872 interfaceC4872 = (InterfaceC4872) interfaceC7230;
        InterfaceC4872 interfaceC48722 = (InterfaceC4872) interfaceC72302;
        Map map = (Map) this.f14160;
        if (((InterfaceC4851) this.f14161).mo9600(interfaceC4872, interfaceC48722)) {
            return true;
        }
        if (map != null) {
            InterfaceC4872 interfaceC48723 = (InterfaceC4872) map.get(interfaceC4872);
            InterfaceC4872 interfaceC48724 = (InterfaceC4872) map.get(interfaceC48722);
            if (interfaceC48723 != null && interfaceC48723.equals(interfaceC48722)) {
                return true;
            }
            if (interfaceC48724 != null && interfaceC48724.equals(interfaceC4872)) {
                return true;
            }
        }
        return false;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public boolean mo9647(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        return (abstractC4877M9716 != null ? AbstractC4859.m9698(abstractC4877M9716) : null) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public /* bridge */ boolean mo9648(InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        return AbstractC4859.m9690(interfaceC7218, interfaceC72182);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public /* bridge */ void mo9649(InterfaceC7218 interfaceC7218) {
        AbstractC4859.m9680(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public /* bridge */ InterfaceC7219 mo9650(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9704(this, interfaceC7229);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public /* bridge */ InterfaceC7218 mo9652(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9716(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public /* bridge */ InterfaceC7223 mo9653(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9726(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public InterfaceC7229 mo9654(InterfaceC7218 interfaceC7218, int i) {
        if (i < 0 || i >= AbstractC4859.m9701(interfaceC7218)) {
            return null;
        }
        return AbstractC4859.m9714(interfaceC7218, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public /* bridge */ void mo9655(InterfaceC7218 interfaceC7218) {
        AbstractC4859.m9681(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public /* bridge */ AbstractC4892 mo9656(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9724(this, interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public /* bridge */ TypeVariance mo9657(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9709(interfaceC7229);
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public int mo8333(int i) {
        do {
            i = ((C2019) this.f14161).m3715(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14160).charAt(i - 1)));
        return i;
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public int mo8334(int i) {
        do {
            i = ((C2019) this.f14161).m3716(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14160).charAt(i)));
        return i;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public /* bridge */ boolean mo9658(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9689(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public /* bridge */ boolean mo9659(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9697(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC7229 mo9660(InterfaceC7225 interfaceC7225, int i) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7226) {
            return AbstractC4859.m9714((InterfaceC7219) interfaceC7225, i);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            InterfaceC7229 interfaceC7229 = ((ArgumentList) interfaceC7225).get(i);
            interfaceC7229.getClass();
            return interfaceC7229;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return null;
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public Object mo3751(C7340 c7340, Object obj) {
        return ((InterfaceC6553) this.f14160).invoke(c7340, obj);
    }

    @Override // p015.InterfaceC6209
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public void mo991(C6177 c6177, IOException iOException) {
        try {
            ((InterfaceC5794) this.f14160).onFailure((C5767) this.f14161, iOException);
        } catch (Throwable th) {
            AbstractC5784.m11127(th);
            th.printStackTrace();
        }
    }

    @Override // p126.InterfaceC7429
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public boolean mo2289() {
        return ((InterfaceC7429) this.f14160).mo2289();
    }

    @Override // p005.InterfaceC6109
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public InterfaceC6112 mo400() {
        return (C6169) this.f14160;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public /* bridge */ InterfaceC7219 mo9661(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9676(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public /* bridge */ boolean mo9662(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9687(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public /* bridge */ InterfaceC7227 mo9663(InterfaceC7230 interfaceC7230, int i) {
        return AbstractC4859.m9712(interfaceC7230, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo9664(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9698(interfaceC7218) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public /* bridge */ boolean mo9665(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9686(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public /* bridge */ boolean mo9666(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9685(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public /* bridge */ InterfaceC7229 mo9667(InterfaceC7223 interfaceC7223) {
        return AbstractC4859.m9675(interfaceC7223);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public /* bridge */ TypeVariance mo9668(InterfaceC7227 interfaceC7227) {
        return AbstractC4859.m9706(interfaceC7227);
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo302(View view, C2225 c2225) {
        AbstractC7582 abstractC7582 = (AbstractC7582) this.f14161;
        C2225 c2225M4240 = AbstractC2270.m4240(view, c2225);
        if (c2225M4240.f6520.mo4009()) {
            return c2225M4240;
        }
        Rect rect = (Rect) this.f14160;
        rect.left = c2225M4240.m4057();
        rect.top = c2225M4240.m4055();
        rect.right = c2225M4240.m4056();
        rect.bottom = c2225M4240.m4058();
        int childCount = abstractC7582.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2225 c2225M4226 = AbstractC2270.m4226(abstractC7582.getChildAt(i), c2225M4240);
            rect.left = Math.min(c2225M4226.m4057(), rect.left);
            rect.top = Math.min(c2225M4226.m4055(), rect.top);
            rect.right = Math.min(c2225M4226.m4056(), rect.right);
            rect.bottom = Math.min(c2225M4226.m4058(), rect.bottom);
        }
        return c2225M4240.m4054(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public /* bridge */ Collection mo9669(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9728(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public /* bridge */ InterfaceC7229 mo9670(InterfaceC7219 interfaceC7219, int i) {
        return AbstractC4859.m9714(interfaceC7219, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC7219 mo9671(ArrayList arrayList) {
        AbstractC4877 abstractC4877;
        int size = arrayList.size();
        if (size == 0) {
            C5919.m11250("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC4913) AbstractC4343.m8822(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC4913 abstractC4913 = (AbstractC4913) it.next();
            z = z || AbstractC4892.m9835(abstractC4913);
            if (abstractC4913 instanceof AbstractC4877) {
                abstractC4877 = (AbstractC4877) abstractC4913;
            } else {
                if (!(abstractC4913 instanceof AbstractC4895)) {
                    C4210.m8621();
                    return null;
                }
                abstractC4877 = ((AbstractC4895) abstractC4913).f14212;
                z2 = true;
            }
            arrayList2.add(abstractC4877);
        }
        if (z) {
            return C7239.m12443(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C4856 c4856 = C4856.f14135;
        if (!z2) {
            return c4856.m9611(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4892.m9813((AbstractC4913) it2.next()));
        }
        return AbstractC4892.m9815(c4856.m9611(arrayList2), c4856.m9611(arrayList3));
    }

    @Override // p126.InterfaceC7429
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public List mo2290(Integer num) {
        List listMo2290 = ((InterfaceC7429) this.f14160).mo2290(null);
        C1235 c1235 = (C1235) this.f14161;
        int i = c1235.f3574;
        return i < 0 ? listMo2290 : AbstractC4343.m8825(listMo2290, AbstractC4921.m9903(c1235, num, i, Integer.valueOf(c1235.m2102(c1235.f3567, i))));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public /* bridge */ Collection mo9672(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9674(this, interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo9673(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9688(AbstractC4859.m9729(interfaceC7218));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ InterfaceC7218 mo9603(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9727(interfaceC7220);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ InterfaceC7218 mo9604(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9677(interfaceC7220);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ InterfaceC7218 mo9605(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9723(interfaceC7218, false);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo9651(InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
    }

    public /* synthetic */ C4870(Object obj, int i) {
        this.f14162 = i;
        this.f14161 = obj;
    }

    public /* synthetic */ C4870(Object obj, int i, Object obj2) {
        this.f14162 = i;
        this.f14160 = obj;
        this.f14161 = obj2;
    }

    public C4870(HashMap map, InterfaceC4851 interfaceC4851) {
        this.f14162 = 8;
        interfaceC4851.getClass();
        this.f14160 = map;
        this.f14161 = interfaceC4851;
    }

    public C4870(C7029 c7029) {
        this.f14162 = 0;
        C4844 c4844 = new C4844("Type parameter upper bound erasure results");
        this.f14160 = AbstractC5186.m10210(new C1322(this, 9));
        this.f14161 = c4844.m9589(new C1012(this, 18));
    }

    public C4870(InterfaceC6557 interfaceC6557) {
        this.f14162 = 10;
        this.f14160 = interfaceC6557;
        this.f14161 = new C7116();
    }

    public C4870(C8816 c8816, C7958 c7958, C2494 c2494) {
        this.f14162 = 26;
        this.f14160 = c7958;
        new ArrayList(0);
        new ArrayList(0);
        C2493 c2493 = new C2493(c2494, new AbstractC2450[0]);
        this.f14161 = c2493;
        c2493.m4927(c8816);
        c2493.m4927(c7958);
        C7967 c7967 = new C7967();
        List arrayList = c8816.f22047;
        arrayList = arrayList == null ? new ArrayList() : arrayList;
        if (!arrayList.contains(c7967)) {
            arrayList.add(c7967);
        }
        c8816.f22047 = arrayList;
    }

    public /* synthetic */ C4870(int i, Object obj, Object obj2, boolean z) {
        this.f14162 = i;
        this.f14161 = obj;
        this.f14160 = obj2;
    }

    public C4870(int i, InterfaceC6553 interfaceC6553) {
        this.f14162 = i;
        switch (i) {
            case 12:
                this.f14160 = interfaceC6553;
                this.f14161 = new ConcurrentHashMap();
                break;
            default:
                this.f14160 = interfaceC6553;
                this.f14161 = new C7116();
                break;
        }
    }

    public C4870(C0734 c0734) {
        this.f14162 = 4;
        InterfaceC6253 interfaceC6253 = (InterfaceC6253) c0734.f2068;
        this.f14160 = new C6169(c0734, interfaceC6253.mo11733().mo400(), -1L, true);
        this.f14161 = new C6168(c0734, interfaceC6253.mo11733().mo381(), -1L, true);
    }

    public C4870(EditText editText) {
        this.f14162 = 20;
        this.f14160 = editText;
        C7686 c7686 = new C7686(editText);
        this.f14161 = c7686;
        editText.addTextChangedListener(c7686);
        if (C7683.f20868 == null) {
            synchronized (C7683.f20869) {
                try {
                    if (C7683.f20868 == null) {
                        C7683 c7683 = new C7683();
                        try {
                            C7683.f20867 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7683.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C7683.f20868 = c7683;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C7683.f20868);
    }

    public C4870(AbstractC7582 abstractC7582) {
        this.f14162 = 15;
        this.f14161 = abstractC7582;
        this.f14160 = new Rect();
    }
}
