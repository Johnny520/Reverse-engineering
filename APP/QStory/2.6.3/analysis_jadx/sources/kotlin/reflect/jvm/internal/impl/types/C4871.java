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
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C4211;
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
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4640;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import kotlin.reflect.jvm.internal.impl.types.checker.C4850;
import kotlin.reflect.jvm.internal.impl.types.checker.C4857;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import net.bytebuddy.pool.TypePool;
import p004.InterfaceC6100;
import p004.InterfaceC6101;
import p004.InterfaceC6103;
import p007.C6131;
import p007.InterfaceC6136;
import p009.AbstractC6183;
import p011.C6193;
import p011.C6194;
import p011.C6203;
import p012.InterfaceC6215;
import p026.InterfaceC6312;
import p038.C6377;
import p049.AbstractC6530;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p069.C6897;
import p073.C6933;
import p073.C6935;
import p073.C6937;
import p073.C6940;
import p073.C6942;
import p075.C6961;
import p082.C7030;
import p082.C7034;
import p087.C7069;
import p087.C7074;
import p087.C7117;
import p087.C7123;
import p087.C7147;
import p087.InterfaceC7136;
import p089.InterfaceC7184;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7223;
import p097.InterfaceC7224;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7230;
import p097.InterfaceC7231;
import p098.C7239;
import p098.C7240;
import p116.C7341;
import p116.InterfaceC7346;
import p126.InterfaceC7430;
import p150.AbstractC7583;
import p153.C7596;
import p166.C7684;
import p166.C7687;
import p167.C7689;
import p167.C7699;
import p167.C7700;
import p167.InterfaceC7707;
import p197.InterfaceC7846;
import p206.C7909;
import p216.C7959;
import p217.C7968;
import p222.AbstractC7989;
import p223.C7993;
import p230.C8050;
import p230.C8051;
import p287.AbstractC8405;
import p343.C8819;
import retrofit2.AbstractC5785;
import retrofit2.C5755;
import retrofit2.C5768;
import retrofit2.C5793;
import retrofit2.ExecutorC5782;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import retrofit2.InterfaceC5796;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.CallableC5911;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4871 implements InterfaceC5796, InterfaceC5795, InterfaceC6136, InterfaceC6100, InterfaceC6312, InterfaceC4853, InterfaceC7136, InterfaceC7346, InterfaceC7430, InterfaceC2205, InterfaceC7707, InterfaceC7846 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14166;

    public C4871(int i) {
        this.f14166 = i;
        switch (i) {
            case 19:
                this.f14164 = Choreographer.getInstance();
                this.f14165 = Looper.myLooper();
                break;
            case 24:
                break;
            case 27:
                this.f14164 = new AtomicReference();
                this.f14165 = new C0257(0);
                break;
            case 28:
                this.f14164 = new ArrayList();
                this.f14165 = new HashMap();
                break;
            case 29:
                this.f14164 = new HashMap();
                this.f14165 = new C8050(0);
                break;
            default:
                this.f14164 = new ArrayList();
                this.f14165 = new ArrayList();
                break;
        }
    }

    @Override // retrofit2.InterfaceC5795
    public void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        ((C5793) this.f14165).f15891.execute(new RunnableC2346(this, (InterfaceC5795) this.f14164, th, 3));
    }

    @Override // retrofit2.InterfaceC5795
    public void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        ((C5793) this.f14165).f15891.execute(new RunnableC2346(this, (InterfaceC5795) this.f14164, c5755, 2));
    }

    public String toString() {
        switch (this.f14166) {
            case 25:
                String string = "[ ";
                if (((C7909) this.f14164) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM140 = AbstractC0053.m140(string);
                        sbM140.append(((C7909) this.f14164).f21886[i]);
                        sbM140.append(" ");
                        string = sbM140.toString();
                    }
                }
                StringBuilder sbM11584 = AbstractC6183.m11584(string, "] ");
                sbM11584.append((C7909) this.f14164);
                return sbM11584.toString();
            default:
                return super.toString();
        }
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC7231 mo9602(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7219 interfaceC7219M9706 = AbstractC4860.m9706(interfaceC7220);
        if (interfaceC7219M9706 == null) {
            interfaceC7219M9706 = mo9605(interfaceC7220);
        }
        return AbstractC4860.m9719(interfaceC7219M9706);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public /* bridge */ AbstractC4878 mo9591(AbstractC4882 abstractC4882) {
        return AbstractC4860.m9706(abstractC4882);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public /* bridge */ boolean mo9603(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9685(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo9604(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return interfaceC7220 instanceof C6940;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC7219 mo9605(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9667;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 != null && (abstractC4878M9667 = AbstractC4860.m9667(abstractC4896M9707)) != null) {
            return abstractC4878M9667;
        }
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        abstractC4878M9706.getClass();
        return abstractC4878M9706;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public /* bridge */ boolean mo9606(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9682(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public /* bridge */ boolean mo9607(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9683(interfaceC7220);
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public Object mo9043() {
        return (C7689) this.f14164;
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int mo9743(int i) {
        CharSequence charSequence = (CharSequence) this.f14164;
        do {
            i = ((C2019) this.f14165).m3725(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p167.InterfaceC7707
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public boolean mo9044(CharSequence charSequence, int i, int i2, C7699 c7699) {
        if ((c7699.f20884 & 4) > 0) {
            return true;
        }
        if (((C7689) this.f14164) == null) {
            this.f14164 = new C7689(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C6961) this.f14165).getClass();
        ((C7689) this.f14164).setSpan(new C7700(c7699), i, i2, 33);
        return true;
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int mo9744(int i) {
        do {
            i = ((C2019) this.f14165).m3726(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14164).charAt(i - 1)));
        return i;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo9608(InterfaceC7223 interfaceC7223) {
        return interfaceC7223 instanceof C6897;
    }

    @Override // retrofit2.InterfaceC5796
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Type mo9745() {
        return (Type) this.f14164;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo9609(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        AbstractC4860.m9707(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public InterfaceC7223 mo9610(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9689(this, m9748(interfaceC7219));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC7219 mo9611(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9717;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 != null && (abstractC4878M9717 = AbstractC4860.m9717(abstractC4896M9707)) != null) {
            return abstractC4878M9717;
        }
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        abstractC4878M9706.getClass();
        return abstractC4878M9706;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public /* bridge */ InterfaceC7223 mo9612(InterfaceC7227 interfaceC7227) {
        return AbstractC4860.m9689(this, interfaceC7227);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo9613(InterfaceC7219 interfaceC7219) {
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7219);
        return (abstractC4878M9706 != null ? AbstractC4860.m9689(this, m9748(abstractC4878M9706)) : null) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public /* bridge */ InterfaceC7230 mo9614(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9710(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public boolean mo9615(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9682(mo9602(interfaceC7219)) && !AbstractC4860.m9673(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public /* bridge */ InterfaceC7220 mo9616(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9712(this, interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public /* bridge */ boolean mo9617(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9674(interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC7220 mo9618(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9669(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public /* bridge */ boolean mo9619(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9678(interfaceC7231);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set m9746(kotlin.reflect.jvm.internal.impl.types.C4919 r17, java.util.List r18, p082.C7034 r19) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4871.m9746(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪哲世兰, java.util.List, 飘花落叶言世楪苏兰子哲.飘花落叶言子楪世苏哲兰):java.util.Set");
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo9620(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return AbstractC4860.m9683(mo9605(interfaceC7220)) != AbstractC4860.m9683(mo9611(interfaceC7220));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public /* bridge */ int mo9621(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9668(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo9622(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9685(AbstractC4860.m9719(interfaceC7219));
    }

    @Override // p087.InterfaceC7136
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public InterfaceC7184 mo9747(InterfaceC5093 interfaceC5093) {
        Object obj = ((C7117) this.f14165).get(AbstractC3057.m6756(interfaceC5093));
        obj.getClass();
        C7069 c7069 = (C7069) obj;
        Object c7123 = c7069.f18971.get();
        if (c7123 == null) {
            synchronized (c7069) {
                c7123 = c7069.f18971.get();
                if (c7123 == null) {
                    c7123 = new C7123((InterfaceC7184) ((InterfaceC6558) this.f14164).invoke(interfaceC5093));
                    c7069.f18971 = new SoftReference(c7123);
                }
            }
        }
        return ((C7123) c7123).f19060;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public /* bridge */ AbstractC4914 mo9592(InterfaceC7227 interfaceC7227, InterfaceC7227 interfaceC72272) {
        return AbstractC4860.m9701(this, interfaceC7227, interfaceC72272);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public /* bridge */ InterfaceC7231 mo9623(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9719(interfaceC7219);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public InterfaceC7227 m9748(InterfaceC7219 interfaceC7219) {
        AbstractC4878 abstractC4878;
        C4906 c4906M9688 = AbstractC4860.m9688(interfaceC7219);
        return (c4906M9688 == null || (abstractC4878 = c4906M9688.f14230) == null) ? (InterfaceC7227) interfaceC7219 : abstractC4878;
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
    public void m9749(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C4871.m9749(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public C4872 m9750() {
        return new C4872(true, true, true, this, C4850.f14132, C4849.f14131);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public void m9751(C7596 c7596) {
        ExecutorC5782 executorC5782 = (ExecutorC5782) this.f14165;
        C5856 c5856 = (C5856) this.f14164;
        int i = c7596.f20592;
        if (i != 0) {
            executorC5782.execute(new RunnableC2548(c5856, i, 2));
        } else {
            executorC5782.execute(new RunnableC3742(10, c5856, c7596.f20593, false));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public void m9752(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f14165;
        cardView.f870.set(i, i2, i3, i4);
        Rect rect = cardView.f872;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void m9753(String str) {
        C8051 c8051;
        synchronized (this) {
            try {
                c8051 = (C8051) ((HashMap) this.f14164).get(str);
                AbstractC7989.m13469(c8051, "Argument must not be null");
                int i = c8051.f22222;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c8051.f22222);
                }
                int i2 = i - 1;
                c8051.f22222 = i2;
                if (i2 == 0) {
                    C8051 c80512 = (C8051) ((HashMap) this.f14164).remove(str);
                    if (!c80512.equals(c8051)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c8051 + ", but actually removed: " + c80512 + ", safeKey: " + str);
                    }
                    C8050 c8050 = (C8050) this.f14165;
                    synchronized (c8050.f22221) {
                        try {
                            if (c8050.f22221.size() < 10) {
                                c8050.f22221.offer(c80512);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c8051.f22223.unlock();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo9624(InterfaceC7226 interfaceC7226) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7219) {
            return AbstractC4860.m9691((InterfaceC7220) interfaceC7226);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7226).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return 0;
    }

    @Override // p007.InterfaceC6136
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public void mo980(C6203 c6203, C6131 c6131) {
        InterfaceC5795 interfaceC5795 = (InterfaceC5795) this.f14164;
        C5768 c5768 = (C5768) this.f14165;
        try {
            try {
                interfaceC5795.onResponse(c5768, c5768.m11158(c6131));
            } catch (Throwable th) {
                AbstractC5785.m11184(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC5785.m11184(th2);
            try {
                interfaceC5795.onFailure(c5768, th2);
            } catch (Throwable th3) {
                AbstractC5785.m11184(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // retrofit2.InterfaceC5796
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public Object mo9754(C5768 c5768) {
        Executor executor = (Executor) this.f14165;
        return executor == null ? c5768 : new C5793(executor, c5768);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public /* bridge */ boolean mo9625(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9684(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public /* bridge */ InterfaceC7221 mo9626(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9707(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public /* bridge */ InterfaceC7219 mo9627(InterfaceC7219 interfaceC7219, CaptureStatus captureStatus) {
        return AbstractC4860.m9711(interfaceC7219, captureStatus);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public AbstractC4882 m9755(InterfaceC4463 interfaceC4463, C7034 c7034) {
        interfaceC4463.getClass();
        c7034.getClass();
        return (AbstractC4882) ((C4837) this.f14165).invoke(new C4868(interfaceC4463, c7034));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public AbstractC4914 m9756(C7034 c7034) {
        AbstractC4914 abstractC4914M6338;
        AbstractC4878 abstractC4878 = c7034.f18874;
        return (abstractC4878 == null || (abstractC4914M6338 = AbstractC2905.m6338(abstractC4878)) == null) ? (C7239) ((InterfaceC5184) this.f14164).getValue() : abstractC4914M6338;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public synchronized ArrayList m9757(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f14164).iterator();
        while (it.hasNext()) {
            List<C7993> list = (List) ((HashMap) this.f14165).get((String) it.next());
            if (list != null) {
                for (C7993 c7993 : list) {
                    if ((c7993.f22081.isAssignableFrom(cls) && cls2.isAssignableFrom(c7993.f22080)) && !arrayList.contains(c7993.f22080)) {
                        arrayList.add(c7993.f22080);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public synchronized List m9758(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f14164).contains(str)) {
                ((ArrayList) this.f14164).add(str);
            }
            arrayList = (List) ((HashMap) this.f14165).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f14165).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public void m9759(String str, String str2, InterfaceC6558 interfaceC6558) {
        LinkedHashMap linkedHashMap = ((C6937) this.f14165).f18504;
        C6933 c6933 = new C6933(this, str, str2);
        interfaceC6558.invoke(c6933);
        String str3 = (String) this.f14164;
        ArrayList arrayList = c6933.f18495;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        String strM11590 = (String) c6933.f18494.getFirst();
        strM11590.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC4344.m8810(arrayList2, "", null, null, C4640.f13566, 30));
        sb.append(')');
        if (strM11590.length() > 1) {
            strM11590 = AbstractC6183.m11590(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", strM11590);
        }
        sb.append(strM11590);
        String strM164 = AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str3, sb.toString());
        C6935 c6935 = (C6935) c6933.f18494.getSecond();
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C6935) ((Pair) it2.next()).getSecond());
        }
        Pair pair = new Pair(strM164, new C6942(c6935, arrayList3, c6933.f18496));
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public Object m9760(InterfaceC5093 interfaceC5093, ArrayList arrayList) {
        Object objM163;
        Object objM1632;
        Object objPutIfAbsent;
        switch (this.f14166) {
            case 11:
                Object obj = ((C7117) this.f14165).get(AbstractC3057.m6756(interfaceC5093));
                obj.getClass();
                C7069 c7069 = (C7069) obj;
                Object c7147 = c7069.f18971.get();
                if (c7147 == null) {
                    synchronized (c7069) {
                        c7147 = c7069.f18971.get();
                        if (c7147 == null) {
                            c7147 = new C7147();
                            c7069.f18971 = new SoftReference(c7147);
                        }
                    }
                }
                C7147 c71472 = (C7147) c7147;
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C7074((InterfaceC5087) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = c71472.f19110;
                Object obj2 = concurrentHashMap.get(arrayList2);
                if (obj2 == null) {
                    try {
                        objM163 = Result.m8745constructorimpl((InterfaceC7184) ((InterfaceC6554) this.f14164).invoke(interfaceC5093, arrayList));
                    } catch (Throwable th) {
                        objM163 = AbstractC0053.m163(th);
                    }
                    Result resultM8744boximpl = Result.m8744boximpl(objM163);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, resultM8744boximpl);
                    obj2 = objPutIfAbsent2 == null ? resultM8744boximpl : objPutIfAbsent2;
                    break;
                }
                obj2.getClass();
                return ((Result) obj2).getValue();
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f14165;
                Class clsM6756 = AbstractC3057.m6756(interfaceC5093);
                Object c71473 = concurrentHashMap2.get(clsM6756);
                if (c71473 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsM6756, (c71473 = new C7147()))) != null) {
                    c71473 = objPutIfAbsent;
                }
                C7147 c71474 = (C7147) c71473;
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C7074((InterfaceC5087) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = c71474.f19110;
                Object obj3 = concurrentHashMap3.get(arrayList3);
                if (obj3 == null) {
                    try {
                        objM1632 = Result.m8745constructorimpl((InterfaceC7184) ((InterfaceC6554) this.f14164).invoke(interfaceC5093, arrayList));
                    } catch (Throwable th2) {
                        objM1632 = AbstractC0053.m163(th2);
                    }
                    Result resultM8744boximpl2 = Result.m8744boximpl(objM1632);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, resultM8744boximpl2);
                    obj3 = objPutIfAbsent3 == null ? resultM8744boximpl2 : objPutIfAbsent3;
                    break;
                }
                obj3.getClass();
                return ((Result) obj3).getValue();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ AbstractC4878 mo9593(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9717(interfaceC7221);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ AbstractC4878 mo9594(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9667(interfaceC7221);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ AbstractC4878 mo9595(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9713(interfaceC7219, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public AbstractC6530 mo9596() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6101 mo382() {
        return (C6193) this.f14165;
    }

    @Override // p026.InterfaceC6312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = ((Method) this.f14164).invoke(methodHookParam.thisObject, null);
        ((List) methodHookParam.getResult()).add(C6377.m11961(objInvoke, AbstractC8405.m13972(180), R.mipmap.ic_launcher_round, new CallableC5911((ClassLoader) this.f14165, 2, objInvoke)));
    }

    @Override // p116.InterfaceC7346
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public Object mo3760(Object obj) {
        return ((InterfaceC6558) this.f14165).invoke(obj);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public /* bridge */ void mo9630(InterfaceC7219 interfaceC7219) {
        AbstractC4860.m9670(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public /* bridge */ CaptureStatus mo9631(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9708(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public /* bridge */ InterfaceC7226 mo9632(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9690(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public /* bridge */ int mo9633(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9691(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo9634(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return !AbstractC4395.m8907(AbstractC4860.m9719(mo9605(interfaceC7220)), AbstractC4860.m9719(mo9611(interfaceC7220)));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo9635(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        return (abstractC4878M9706 != null ? AbstractC4860.m9688(abstractC4878M9706) : null) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public /* bridge */ void mo9636(InterfaceC7219 interfaceC7219) {
        AbstractC4860.m9671(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public /* bridge */ boolean mo9638(InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        return AbstractC4860.m9680(interfaceC7219, interfaceC72192);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo9639(InterfaceC7231 interfaceC7231, InterfaceC7231 interfaceC72312) {
        interfaceC7231.getClass();
        interfaceC72312.getClass();
        if (!(interfaceC7231 instanceof InterfaceC4873)) {
            C5925.m11310("Failed requirement.");
            return false;
        }
        if (!(interfaceC72312 instanceof InterfaceC4873)) {
            C5925.m11310("Failed requirement.");
            return false;
        }
        if (AbstractC4860.m9692(interfaceC7231, interfaceC72312)) {
            return true;
        }
        InterfaceC4873 interfaceC4873 = (InterfaceC4873) interfaceC7231;
        InterfaceC4873 interfaceC48732 = (InterfaceC4873) interfaceC72312;
        Map map = (Map) this.f14164;
        if (((InterfaceC4852) this.f14165).mo9590(interfaceC4873, interfaceC48732)) {
            return true;
        }
        if (map != null) {
            InterfaceC4873 interfaceC48733 = (InterfaceC4873) map.get(interfaceC4873);
            InterfaceC4873 interfaceC48734 = (InterfaceC4873) map.get(interfaceC48732);
            if (interfaceC48733 != null && interfaceC48733.equals(interfaceC48732)) {
                return true;
            }
            if (interfaceC48734 != null && interfaceC48734.equals(interfaceC4873)) {
                return true;
            }
        }
        return false;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public /* bridge */ InterfaceC7220 mo9640(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9694(this, interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public /* bridge */ InterfaceC7219 mo9641(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9706(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public /* bridge */ InterfaceC7224 mo9642(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9716(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public /* bridge */ TypeVariance mo9643(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9699(interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC7230 mo9644(InterfaceC7219 interfaceC7219, int i) {
        if (i < 0 || i >= AbstractC4860.m9691(interfaceC7219)) {
            return null;
        }
        return AbstractC4860.m9704(interfaceC7219, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public /* bridge */ AbstractC4893 mo9645(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9714(this, interfaceC7219);
    }

    @Override // p007.InterfaceC6136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo992(C6203 c6203, IOException iOException) {
        try {
            ((InterfaceC5795) this.f14164).onFailure((C5768) this.f14165, iOException);
        } catch (Throwable th) {
            AbstractC5785.m11184(th);
            th.printStackTrace();
        }
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int mo9761(int i) {
        do {
            i = ((C2019) this.f14165).m3725(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14164).charAt(i - 1)));
        return i;
    }

    @Override // p197.InterfaceC7846
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int mo9762(int i) {
        do {
            i = ((C2019) this.f14165).m3726(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14164).charAt(i)));
        return i;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public /* bridge */ boolean mo9647(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9679(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public /* bridge */ boolean mo9648(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9687(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC7230 mo9649(InterfaceC7226 interfaceC7226, int i) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7227) {
            return AbstractC4860.m9704((InterfaceC7220) interfaceC7226, i);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            InterfaceC7230 interfaceC7230 = ((ArgumentList) interfaceC7226).get(i);
            interfaceC7230.getClass();
            return interfaceC7230;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return null;
    }

    @Override // p116.InterfaceC7346
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public Object mo3761(C7341 c7341, Object obj) {
        return ((InterfaceC6554) this.f14164).invoke(c7341, obj);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public /* bridge */ InterfaceC7220 mo9650(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9666(interfaceC7223);
    }

    @Override // p126.InterfaceC7430
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public boolean mo2299() {
        return ((InterfaceC7430) this.f14164).mo2299();
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public /* bridge */ boolean mo9651(InterfaceC7228 interfaceC7228, InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9681(interfaceC7228, interfaceC7231);
    }

    @Override // p004.InterfaceC6100
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public InterfaceC6103 mo401() {
        return (C6194) this.f14164;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public /* bridge */ boolean mo9652(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9677(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public /* bridge */ InterfaceC7228 mo9653(InterfaceC7231 interfaceC7231, int i) {
        return AbstractC4860.m9702(interfaceC7231, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo9654(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9688(interfaceC7219) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public /* bridge */ boolean mo9655(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9676(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public /* bridge */ boolean mo9656(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9675(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public /* bridge */ InterfaceC7230 mo9657(InterfaceC7224 interfaceC7224) {
        return AbstractC4860.m9665(interfaceC7224);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public /* bridge */ TypeVariance mo9658(InterfaceC7228 interfaceC7228) {
        return AbstractC4860.m9696(interfaceC7228);
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C2225 mo303(View view, C2225 c2225) {
        AbstractC7583 abstractC7583 = (AbstractC7583) this.f14165;
        C2225 c2225M4250 = AbstractC2270.m4250(view, c2225);
        if (c2225M4250.f6521.mo4019()) {
            return c2225M4250;
        }
        Rect rect = (Rect) this.f14164;
        rect.left = c2225M4250.m4067();
        rect.top = c2225M4250.m4065();
        rect.right = c2225M4250.m4066();
        rect.bottom = c2225M4250.m4068();
        int childCount = abstractC7583.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C2225 c2225M4236 = AbstractC2270.m4236(abstractC7583.getChildAt(i), c2225M4250);
            rect.left = Math.min(c2225M4236.m4067(), rect.left);
            rect.top = Math.min(c2225M4236.m4065(), rect.top);
            rect.right = Math.min(c2225M4236.m4066(), rect.right);
            rect.bottom = Math.min(c2225M4236.m4068(), rect.bottom);
        }
        return c2225M4250.m4064(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public /* bridge */ Collection mo9659(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9718(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public /* bridge */ InterfaceC7230 mo9660(InterfaceC7220 interfaceC7220, int i) {
        return AbstractC4860.m9704(interfaceC7220, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC7220 mo9661(ArrayList arrayList) {
        AbstractC4878 abstractC4878;
        int size = arrayList.size();
        if (size == 0) {
            C5925.m11311("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC4914) AbstractC4344.m8780(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC4914 abstractC4914 = (AbstractC4914) it.next();
            z = z || AbstractC4893.m9829(abstractC4914);
            if (abstractC4914 instanceof AbstractC4878) {
                abstractC4878 = (AbstractC4878) abstractC4914;
            } else {
                if (!(abstractC4914 instanceof AbstractC4896)) {
                    C4211.m8611();
                    return null;
                }
                abstractC4878 = ((AbstractC4896) abstractC4914).f14216;
                z2 = true;
            }
            arrayList2.add(abstractC4878);
        }
        if (z) {
            return C7240.m12470(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C4857 c4857 = C4857.f14139;
        if (!z2) {
            return c4857.m9601(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4893.m9807((AbstractC4914) it2.next()));
        }
        return AbstractC4893.m9809(c4857.m9601(arrayList2), c4857.m9601(arrayList3));
    }

    @Override // p126.InterfaceC7430
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public List mo2300(Integer num) {
        List listMo2300 = ((InterfaceC7430) this.f14164).mo2300(null);
        C1235 c1235 = (C1235) this.f14165;
        int i = c1235.f3575;
        return i < 0 ? listMo2300 : AbstractC4344.m8793(listMo2300, AbstractC4922.m9879(c1235, num, i, Integer.valueOf(c1235.m2112(c1235.f3568, i))));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public /* bridge */ Collection mo9662(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9664(this, interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo9663(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9678(AbstractC4860.m9719(interfaceC7219));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ InterfaceC7219 mo9593(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9717(interfaceC7221);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ InterfaceC7219 mo9594(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9667(interfaceC7221);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ InterfaceC7219 mo9595(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9713(interfaceC7219, false);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo9637(InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
    }

    public /* synthetic */ C4871(Object obj, int i) {
        this.f14166 = i;
        this.f14165 = obj;
    }

    public /* synthetic */ C4871(Object obj, int i, Object obj2) {
        this.f14166 = i;
        this.f14164 = obj;
        this.f14165 = obj2;
    }

    public C4871(HashMap map, InterfaceC4852 interfaceC4852) {
        this.f14166 = 8;
        interfaceC4852.getClass();
        this.f14164 = map;
        this.f14165 = interfaceC4852;
    }

    public C4871(C7030 c7030) {
        this.f14166 = 0;
        C4845 c4845 = new C4845("Type parameter upper bound erasure results");
        this.f14164 = AbstractC5187.m10214(new C1322(this, 9));
        this.f14165 = c4845.m9579(new C1012(this, 18));
    }

    public C4871(InterfaceC6558 interfaceC6558) {
        this.f14166 = 10;
        this.f14164 = interfaceC6558;
        this.f14165 = new C7117();
    }

    public C4871(C8819 c8819, C7959 c7959, C2494 c2494) {
        this.f14166 = 26;
        this.f14164 = c7959;
        new ArrayList(0);
        new ArrayList(0);
        C2493 c2493 = new C2493(c2494, new AbstractC2450[0]);
        this.f14165 = c2493;
        c2493.m4937(c8819);
        c2493.m4937(c7959);
        C7968 c7968 = new C7968();
        List arrayList = c8819.f22044;
        arrayList = arrayList == null ? new ArrayList() : arrayList;
        if (!arrayList.contains(c7968)) {
            arrayList.add(c7968);
        }
        c8819.f22044 = arrayList;
    }

    public /* synthetic */ C4871(int i, Object obj, Object obj2, boolean z) {
        this.f14166 = i;
        this.f14165 = obj;
        this.f14164 = obj2;
    }

    public C4871(int i, InterfaceC6554 interfaceC6554) {
        this.f14166 = i;
        switch (i) {
            case 12:
                this.f14164 = interfaceC6554;
                this.f14165 = new ConcurrentHashMap();
                break;
            default:
                this.f14164 = interfaceC6554;
                this.f14165 = new C7117();
                break;
        }
    }

    public C4871(C0734 c0734) {
        this.f14166 = 5;
        InterfaceC6215 interfaceC6215 = (InterfaceC6215) c0734.f2069;
        this.f14164 = new C6194(c0734, interfaceC6215.mo11666().mo401(), -1L, true);
        this.f14165 = new C6193(c0734, interfaceC6215.mo11666().mo382(), -1L, true);
    }

    public C4871(EditText editText) {
        this.f14166 = 20;
        this.f14164 = editText;
        C7687 c7687 = new C7687(editText);
        this.f14165 = c7687;
        editText.addTextChangedListener(c7687);
        if (C7684.f20863 == null) {
            synchronized (C7684.f20864) {
                try {
                    if (C7684.f20863 == null) {
                        C7684 c7684 = new C7684();
                        try {
                            C7684.f20862 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C7684.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C7684.f20863 = c7684;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C7684.f20863);
    }

    public C4871(AbstractC7583 abstractC7583) {
        this.f14166 = 15;
        this.f14165 = abstractC7583;
        this.f14164 = new Rect();
    }
}
