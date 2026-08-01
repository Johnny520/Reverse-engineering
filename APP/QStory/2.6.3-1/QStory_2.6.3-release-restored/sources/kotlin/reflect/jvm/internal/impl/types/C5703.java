package kotlin.reflect.jvm.internal.impl.types;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import androidx.activity.AbstractC0900;
import androidx.cardview.widget.CardView;
import androidx.collection.C1104;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.foundation.text.C1850;
import androidx.compose.p001ui.text.input.C2853;
import androidx.compose.runtime.C2157;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.InterfaceC3038;
import androidx.fragment.app.RunnableC3179;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.C3326;
import androidx.recyclerview.widget.C3327;
import androidx.viewpager2.widget.RunnableC3381;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import de.robv.android.xposed.XC_MethodHook;
import io.ktor.util.C5043;
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
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5472;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import kotlin.reflect.jvm.internal.impl.types.checker.C5682;
import kotlin.reflect.jvm.internal.impl.types.checker.C5689;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import net.bytebuddy.pool.TypePool;
import org.xmlpull.v1.XmlPullParserException;
import p020.InterfaceC6929;
import p020.InterfaceC6930;
import p020.InterfaceC6932;
import p023.C6960;
import p023.InterfaceC6965;
import p025.AbstractC7012;
import p027.C7022;
import p027.C7023;
import p027.C7032;
import p028.InterfaceC7044;
import p042.InterfaceC7141;
import p054.C7206;
import p065.AbstractC7359;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p085.C7726;
import p089.C7762;
import p089.C7764;
import p089.C7766;
import p089.C7769;
import p089.C7771;
import p091.C7790;
import p095.AbstractC7818;
import p098.C7859;
import p098.C7863;
import p103.C7898;
import p103.C7903;
import p103.C7946;
import p103.C7952;
import p103.C7976;
import p103.InterfaceC7965;
import p105.InterfaceC8013;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8052;
import p113.InterfaceC8053;
import p113.InterfaceC8055;
import p113.InterfaceC8056;
import p113.InterfaceC8057;
import p113.InterfaceC8059;
import p113.InterfaceC8060;
import p114.C8068;
import p114.C8069;
import p132.C8170;
import p132.InterfaceC8175;
import p142.InterfaceC8259;
import p166.AbstractC8412;
import p169.C8425;
import p182.C8513;
import p182.C8516;
import p183.C8518;
import p183.C8528;
import p183.C8529;
import p183.InterfaceC8536;
import p213.InterfaceC8675;
import p215.C8684;
import p215.C8692;
import p215.C8699;
import p222.C8738;
import p232.C8788;
import p233.C8797;
import p238.AbstractC8818;
import p239.C8822;
import p246.C8879;
import p246.C8880;
import p359.C9648;
import retrofit2.AbstractC6615;
import retrofit2.C6585;
import retrofit2.C6598;
import retrofit2.C6623;
import retrofit2.ExecutorC6612;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
import retrofit2.InterfaceC6626;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.CallableC6741;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5703 implements InterfaceC6626, InterfaceC6625, InterfaceC6965, InterfaceC6929, InterfaceC7141, InterfaceC5685, InterfaceC7965, InterfaceC8175, InterfaceC8259, InterfaceC3038, InterfaceC8536, InterfaceC8675 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f14509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14511;

    public C5703(int i) {
        this.f14511 = i;
        switch (i) {
            case 19:
                this.f14509 = Choreographer.getInstance();
                this.f14510 = Looper.myLooper();
                break;
            case 24:
                break;
            case 27:
                this.f14509 = new AtomicReference();
                this.f14510 = new C1104(0);
                break;
            case 28:
                this.f14509 = new ArrayList();
                this.f14510 = new HashMap();
                break;
            case 29:
                this.f14509 = new HashMap();
                this.f14510 = new C8879(0);
                break;
            default:
                this.f14509 = new ArrayList();
                this.f14510 = new ArrayList();
                break;
        }
    }

    @Override // retrofit2.InterfaceC6625
    public void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        ((C6623) this.f14510).f16236.execute(new RunnableC3179(this, (InterfaceC6625) this.f14509, th, 3));
    }

    @Override // retrofit2.InterfaceC6625
    public void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        ((C6623) this.f14510).f16236.execute(new RunnableC3179(this, (InterfaceC6625) this.f14509, c6585, 2));
    }

    public String toString() {
        switch (this.f14511) {
            case 25:
                String string = "[ ";
                if (((C8738) this.f14509) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM700 = AbstractC0900.m700(string);
                        sbM700.append(((C8738) this.f14509).f22231[i]);
                        sbM700.append(" ");
                        string = sbM700.toString();
                    }
                }
                StringBuilder sbM12143 = AbstractC7012.m12143(string, "] ");
                sbM12143.append((C8738) this.f14509);
                return sbM12143.toString();
            default:
                return super.toString();
        }
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public InterfaceC8060 mo10161(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8048 interfaceC8048M10265 = AbstractC5692.m10265(interfaceC8049);
        if (interfaceC8048M10265 == null) {
            interfaceC8048M10265 = mo10164(interfaceC8049);
        }
        return AbstractC5692.m10278(interfaceC8048M10265);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public /* bridge */ AbstractC5710 mo10150(AbstractC5714 abstractC5714) {
        return AbstractC5692.m10265(abstractC5714);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public /* bridge */ boolean mo10162(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10244(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public boolean mo10163(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return interfaceC8049 instanceof C7769;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public InterfaceC8048 mo10164(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10226;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 != null && (abstractC5710M10226 = AbstractC5692.m10226(abstractC5728M10266)) != null) {
            return abstractC5710M10226;
        }
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        abstractC5710M10265.getClass();
        return abstractC5710M10265;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public /* bridge */ boolean mo10165(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10241(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public /* bridge */ boolean mo10166(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10242(interfaceC8049);
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public Object mo9602() {
        return (C8518) this.f14509;
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int mo10302(int i) {
        CharSequence charSequence = (CharSequence) this.f14509;
        do {
            i = ((C2853) this.f14510).m4285(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p183.InterfaceC8536
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public boolean mo9603(CharSequence charSequence, int i, int i2, C8528 c8528) {
        if ((c8528.f21229 & 4) > 0) {
            return true;
        }
        if (((C8518) this.f14509) == null) {
            this.f14509 = new C8518(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C7790) this.f14510).getClass();
        ((C8518) this.f14509).setSpan(new C8529(c8528), i, i2, 33);
        return true;
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int mo10303(int i) {
        do {
            i = ((C2853) this.f14510).m4286(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14509).charAt(i - 1)));
        return i;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo10167(InterfaceC8052 interfaceC8052) {
        return interfaceC8052 instanceof C7726;
    }

    @Override // retrofit2.InterfaceC6626
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Type mo10304() {
        return (Type) this.f14509;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo10168(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        AbstractC5692.m10266(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public InterfaceC8052 mo10169(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10248(this, m10307(interfaceC8048));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public InterfaceC8048 mo10170(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10276;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 != null && (abstractC5710M10276 = AbstractC5692.m10276(abstractC5728M10266)) != null) {
            return abstractC5710M10276;
        }
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        abstractC5710M10265.getClass();
        return abstractC5710M10265;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public /* bridge */ InterfaceC8052 mo10171(InterfaceC8056 interfaceC8056) {
        return AbstractC5692.m10248(this, interfaceC8056);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public boolean mo10172(InterfaceC8048 interfaceC8048) {
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8048);
        return (abstractC5710M10265 != null ? AbstractC5692.m10248(this, m10307(abstractC5710M10265)) : null) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public /* bridge */ InterfaceC8059 mo10173(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10269(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public boolean mo10174(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10241(mo10161(interfaceC8048)) && !AbstractC5692.m10232(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public /* bridge */ InterfaceC8049 mo10175(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10271(this, interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public /* bridge */ boolean mo10176(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10233(interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC8049 mo10177(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10228(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public /* bridge */ boolean mo10178(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10237(interfaceC8060);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set m10305(C5751 c5751, List list, C7863 c7863) {
        AbstractC5746 abstractC5746M10381;
        AbstractC5748 abstractC5748 = c5751.f14594;
        SetBuilder setBuilder = new SetBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC5714 abstractC5714 = (AbstractC5714) it.next();
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
            if (interfaceC5309Mo9770 instanceof AbstractC7818) {
                Set set = c7863.f19220;
                AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
                if (abstractC5746Mo10331 instanceof AbstractC5728) {
                    AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5746Mo10331;
                    AbstractC5710 abstractC5710M10381 = abstractC5728.f14561;
                    if (!abstractC5710M10381.mo10281().getParameters().isEmpty() && abstractC5710M10381.mo10281().mo9770() != null) {
                        List<InterfaceC5295> parameters = abstractC5710M10381.mo10281().getParameters();
                        parameters.getClass();
                        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(parameters, 10));
                        for (InterfaceC5295 interfaceC5295 : parameters) {
                            AbstractC5702 c5717 = (AbstractC5702) AbstractC5176.m9377(interfaceC5295.getIndex(), abstractC5714.mo10285());
                            boolean z = set != null && set.contains(interfaceC5295);
                            if (c5717 == null || z) {
                                c5717 = new C5717(interfaceC5295);
                            } else {
                                AbstractC5714 abstractC5714Mo10300 = c5717.mo10300();
                                abstractC5714Mo10300.getClass();
                                if (abstractC5748.mo10291(abstractC5714Mo10300) == null) {
                                }
                            }
                            arrayList.add(c5717);
                        }
                        abstractC5710M10381 = AbstractC5725.m10381(abstractC5710M10381, arrayList, null, 2);
                    }
                    AbstractC5710 abstractC5710M103812 = abstractC5728.f14562;
                    if (!abstractC5710M103812.mo10281().getParameters().isEmpty() && abstractC5710M103812.mo10281().mo9770() != null) {
                        List<InterfaceC5295> parameters2 = abstractC5710M103812.mo10281().getParameters();
                        parameters2.getClass();
                        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(parameters2, 10));
                        for (InterfaceC5295 interfaceC52952 : parameters2) {
                            AbstractC5702 c57172 = (AbstractC5702) AbstractC5176.m9377(interfaceC52952.getIndex(), abstractC5714.mo10285());
                            boolean z2 = set != null && set.contains(interfaceC52952);
                            if (c57172 == null || z2) {
                                c57172 = new C5717(interfaceC52952);
                            } else {
                                AbstractC5714 abstractC5714Mo103002 = c57172.mo10300();
                                abstractC5714Mo103002.getClass();
                                if (abstractC5748.mo10291(abstractC5714Mo103002) == null) {
                                }
                            }
                            arrayList2.add(c57172);
                        }
                        abstractC5710M103812 = AbstractC5725.m10381(abstractC5710M103812, arrayList2, null, 2);
                    }
                    abstractC5746M10381 = AbstractC5725.m10368(abstractC5710M10381, abstractC5710M103812);
                } else {
                    if (!(abstractC5746Mo10331 instanceof AbstractC5710)) {
                        C5043.m9170();
                        return null;
                    }
                    AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5746Mo10331;
                    if (abstractC5710.mo10281().getParameters().isEmpty() || abstractC5710.mo10281().mo9770() == null) {
                        abstractC5746M10381 = abstractC5710;
                    } else {
                        List<InterfaceC5295> parameters3 = abstractC5710.mo10281().getParameters();
                        parameters3.getClass();
                        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(parameters3, 10));
                        for (InterfaceC5295 interfaceC52953 : parameters3) {
                            AbstractC5702 c57173 = (AbstractC5702) AbstractC5176.m9377(interfaceC52953.getIndex(), abstractC5714.mo10285());
                            boolean z3 = set != null && set.contains(interfaceC52953);
                            if (c57173 == null || z3) {
                                c57173 = new C5717(interfaceC52953);
                            } else {
                                AbstractC5714 abstractC5714Mo103003 = c57173.mo10300();
                                abstractC5714Mo103003.getClass();
                                if (abstractC5748.mo10291(abstractC5714Mo103003) == null) {
                                }
                            }
                            arrayList3.add(c57173);
                        }
                        abstractC5746M10381 = AbstractC5725.m10381(abstractC5710, arrayList3, null, 2);
                    }
                }
                setBuilder.add(c5751.m10420(AbstractC5725.m10383(abstractC5746M10381, abstractC5746Mo10331), Variance.OUT_VARIANCE));
            } else if (interfaceC5309Mo9770 instanceof InterfaceC5295) {
                Set set2 = c7863.f19220;
                if (set2 == null || !set2.contains(interfaceC5309Mo9770)) {
                    List upperBounds = ((InterfaceC5295) interfaceC5309Mo9770).getUpperBounds();
                    upperBounds.getClass();
                    setBuilder.addAll(m10305(c5751, upperBounds, c7863));
                } else {
                    setBuilder.add(m10315(c7863));
                }
            }
        }
        return setBuilder.build();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public boolean mo10179(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return AbstractC5692.m10242(mo10164(interfaceC8049)) != AbstractC5692.m10242(mo10170(interfaceC8049));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪 */
    public /* bridge */ int mo10180(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10227(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public boolean mo10181(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10244(AbstractC5692.m10278(interfaceC8048));
    }

    @Override // p103.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public InterfaceC8013 mo10306(InterfaceC5925 interfaceC5925) {
        Object obj = ((C7946) this.f14510).get(AbstractC3889.m7316(interfaceC5925));
        obj.getClass();
        C7898 c7898 = (C7898) obj;
        Object c7952 = c7898.f19316.get();
        if (c7952 == null) {
            synchronized (c7898) {
                c7952 = c7898.f19316.get();
                if (c7952 == null) {
                    c7952 = new C7952((InterfaceC8013) ((InterfaceC7387) this.f14509).invoke(interfaceC5925));
                    c7898.f19316 = new SoftReference(c7952);
                }
            }
        }
        return ((C7952) c7952).f19405;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public /* bridge */ AbstractC5746 mo10151(InterfaceC8056 interfaceC8056, InterfaceC8056 interfaceC80562) {
        return AbstractC5692.m10260(this, interfaceC8056, interfaceC80562);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public /* bridge */ InterfaceC8060 mo10182(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10278(interfaceC8048);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public InterfaceC8056 m10307(InterfaceC8048 interfaceC8048) {
        AbstractC5710 abstractC5710;
        C5738 c5738M10247 = AbstractC5692.m10247(interfaceC8048);
        return (c5738M10247 == null || (abstractC5710 = c5738M10247.f14575) == null) ? (InterfaceC8056) interfaceC8048 : abstractC5710;
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
    */
    public void m10308(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C8699 c8699M13775;
        C8692 c8692 = new C8692();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c8699M13775 = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e2) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e2);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (c8699M13775 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c8699M13775.f21985.m13784(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (c8699M13775 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c8699M13775.f21986.m13785(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c8699M13775 = C8692.m13775(context, Xml.asAttributeSet(xmlResourceParser), true);
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (c8699M13775 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c8699M13775.f21987.m13773(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (c8699M13775 == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c8699M13775.f21984.m13772(context, Xml.asAttributeSet(xmlResourceParser));
                                } else {
                                    continue;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c8699M13775 = C8692.m13775(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c8699M13775.f21985.f21923 = true;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (c8699M13775 != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C8684.m13770(context, xmlResourceParser, c8699M13775.f21983);
                                } else {
                                    continue;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c8699M13775 = C8692.m13775(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c8699M13775.f21985.f21942 = 1;
                                }
                                break;
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (c8699M13775 != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c8699M13775 = C8692.m13775(context, Xml.asAttributeSet(xmlResourceParser), false);
                                }
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c8692.f21877.put(Integer.valueOf(c8699M13775.f21988), c8699M13775);
                                    c8699M13775 = null;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c8692.f21877.put(Integer.valueOf(c8699M13775.f21988), c8699M13775);
                                    c8699M13775 = null;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c8692.f21877.put(Integer.valueOf(c8699M13775.f21988), c8699M13775);
                                    c8699M13775 = null;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f14510).put(identifier, c8692);
                                    return;
                                }
                                break;
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f14510).put(identifier, c8692);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public C5704 m10309() {
        return new C5704(true, true, true, this, C5682.f14477, C5681.f14476);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public void m10310(C8425 c8425) {
        ExecutorC6612 executorC6612 = (ExecutorC6612) this.f14510;
        C6686 c6686 = (C6686) this.f14509;
        int i = c8425.f20937;
        if (i != 0) {
            executorC6612.execute(new RunnableC3381(c6686, i, 2));
        } else {
            executorC6612.execute(new RunnableC4574(10, c6686, c8425.f20938, false));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public void m10311(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f14510;
        cardView.f1215.set(i, i2, i3, i4);
        Rect rect = cardView.f1217;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public void m10312(String str) {
        C8880 c8880;
        synchronized (this) {
            try {
                c8880 = (C8880) ((HashMap) this.f14509).get(str);
                AbstractC8818.m14028(c8880, "Argument must not be null");
                int i = c8880.f22567;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c8880.f22567);
                }
                int i2 = i - 1;
                c8880.f22567 = i2;
                if (i2 == 0) {
                    C8880 c88802 = (C8880) ((HashMap) this.f14509).remove(str);
                    if (!c88802.equals(c8880)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c8880 + ", but actually removed: " + c88802 + ", safeKey: " + str);
                    }
                    C8879 c8879 = (C8879) this.f14510;
                    synchronized (c8879.f22566) {
                        try {
                            if (c8879.f22566.size() < 10) {
                                c8879.f22566.offer(c88802);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c8880.f22568.unlock();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public int mo10183(InterfaceC8055 interfaceC8055) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8048) {
            return AbstractC5692.m10250((InterfaceC8049) interfaceC8055);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC8055).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return 0;
    }

    @Override // p023.InterfaceC6965
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public void mo1540(C7032 c7032, C6960 c6960) {
        InterfaceC6625 interfaceC6625 = (InterfaceC6625) this.f14509;
        C6598 c6598 = (C6598) this.f14510;
        try {
            try {
                interfaceC6625.onResponse(c6598, c6598.m11717(c6960));
            } catch (Throwable th) {
                AbstractC6615.m11743(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC6615.m11743(th2);
            try {
                interfaceC6625.onFailure(c6598, th2);
            } catch (Throwable th3) {
                AbstractC6615.m11743(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // retrofit2.InterfaceC6626
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public Object mo10313(C6598 c6598) {
        Executor executor = (Executor) this.f14510;
        return executor == null ? c6598 : new C6623(executor, c6598);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public /* bridge */ boolean mo10184(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10243(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public /* bridge */ InterfaceC8050 mo10185(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10266(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public /* bridge */ InterfaceC8048 mo10186(InterfaceC8048 interfaceC8048, CaptureStatus captureStatus) {
        return AbstractC5692.m10270(interfaceC8048, captureStatus);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public AbstractC5714 m10314(InterfaceC5295 interfaceC5295, C7863 c7863) {
        interfaceC5295.getClass();
        c7863.getClass();
        return (AbstractC5714) ((C5669) this.f14510).invoke(new C5700(interfaceC5295, c7863));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public AbstractC5746 m10315(C7863 c7863) {
        AbstractC5746 abstractC5746M6898;
        AbstractC5710 abstractC5710 = c7863.f19219;
        return (abstractC5710 == null || (abstractC5746M6898 = AbstractC3738.m6898(abstractC5710)) == null) ? (C8068) ((InterfaceC6016) this.f14509).getValue() : abstractC5746M6898;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public synchronized ArrayList m10316(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f14509).iterator();
        while (it.hasNext()) {
            List<C8822> list = (List) ((HashMap) this.f14510).get((String) it.next());
            if (list != null) {
                for (C8822 c8822 : list) {
                    if ((c8822.f22426.isAssignableFrom(cls) && cls2.isAssignableFrom(c8822.f22425)) && !arrayList.contains(c8822.f22425)) {
                        arrayList.add(c8822.f22425);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public synchronized List m10317(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f14509).contains(str)) {
                ((ArrayList) this.f14509).add(str);
            }
            arrayList = (List) ((HashMap) this.f14510).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f14510).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public void m10318(String str, String str2, InterfaceC7387 interfaceC7387) {
        LinkedHashMap linkedHashMap = ((C7766) this.f14510).f18849;
        C7762 c7762 = new C7762(this, str, str2);
        interfaceC7387.invoke(c7762);
        String str3 = (String) this.f14509;
        ArrayList arrayList = c7762.f18840;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        String strM12149 = (String) c7762.f18839.getFirst();
        strM12149.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(AbstractC5176.m9369(arrayList2, "", null, null, C5472.f13911, 30));
        sb.append(')');
        if (strM12149.length() > 1) {
            strM12149 = AbstractC7012.m12149(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", strM12149);
        }
        sb.append(strM12149);
        String strM724 = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str3, sb.toString());
        C7764 c7764 = (C7764) c7762.f18839.getSecond();
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((C7764) ((Pair) it2.next()).getSecond());
        }
        Pair pair = new Pair(strM724, new C7771(c7764, arrayList3, c7762.f18841));
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public Object m10319(InterfaceC5925 interfaceC5925, ArrayList arrayList) {
        Object objM723;
        Object objM7232;
        Object objPutIfAbsent;
        switch (this.f14511) {
            case 11:
                Object obj = ((C7946) this.f14510).get(AbstractC3889.m7316(interfaceC5925));
                obj.getClass();
                C7898 c7898 = (C7898) obj;
                Object c7976 = c7898.f19316.get();
                if (c7976 == null) {
                    synchronized (c7898) {
                        c7976 = c7898.f19316.get();
                        if (c7976 == null) {
                            c7976 = new C7976();
                            c7898.f19316 = new SoftReference(c7976);
                        }
                    }
                }
                C7976 c79762 = (C7976) c7976;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C7903((InterfaceC5919) it.next()));
                }
                ConcurrentHashMap concurrentHashMap = c79762.f19455;
                Object obj2 = concurrentHashMap.get(arrayList2);
                if (obj2 == null) {
                    try {
                        objM723 = Result.m9304constructorimpl((InterfaceC8013) ((InterfaceC7383) this.f14509).invoke(interfaceC5925, arrayList));
                    } catch (Throwable th) {
                        objM723 = AbstractC0900.m723(th);
                    }
                    Result resultM9303boximpl = Result.m9303boximpl(objM723);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, resultM9303boximpl);
                    obj2 = objPutIfAbsent2 == null ? resultM9303boximpl : objPutIfAbsent2;
                    break;
                }
                obj2.getClass();
                return ((Result) obj2).getValue();
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f14510;
                Class clsM7316 = AbstractC3889.m7316(interfaceC5925);
                Object c79763 = concurrentHashMap2.get(clsM7316);
                if (c79763 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsM7316, (c79763 = new C7976()))) != null) {
                    c79763 = objPutIfAbsent;
                }
                C7976 c79764 = (C7976) c79763;
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C7903((InterfaceC5919) it2.next()));
                }
                ConcurrentHashMap concurrentHashMap3 = c79764.f19455;
                Object obj3 = concurrentHashMap3.get(arrayList3);
                if (obj3 == null) {
                    try {
                        objM7232 = Result.m9304constructorimpl((InterfaceC8013) ((InterfaceC7383) this.f14509).invoke(interfaceC5925, arrayList));
                    } catch (Throwable th2) {
                        objM7232 = AbstractC0900.m723(th2);
                    }
                    Result resultM9303boximpl2 = Result.m9303boximpl(objM7232);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, resultM9303boximpl2);
                    obj3 = objPutIfAbsent3 == null ? resultM9303boximpl2 : objPutIfAbsent3;
                    break;
                }
                obj3.getClass();
                return ((Result) obj3).getValue();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ AbstractC5710 mo10152(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10276(interfaceC8050);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ AbstractC5710 mo10153(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10226(interfaceC8050);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ AbstractC5710 mo10154(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10272(interfaceC8048, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public AbstractC7359 mo10155() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC6930 mo942() {
        return (C7022) this.f14510;
    }

    @Override // p042.InterfaceC7141
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = ((Method) this.f14509).invoke(methodHookParam.thisObject, null);
        ((List) methodHookParam.getResult()).add(C7206.m12520(objInvoke, "保存到QS", C0328R.mipmap.ic_launcher_round, new CallableC6741((ClassLoader) this.f14510, 2, objInvoke)));
    }

    @Override // p132.InterfaceC8175
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public Object mo4320(Object obj) {
        return ((InterfaceC7387) this.f14510).invoke(obj);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public /* bridge */ void mo10189(InterfaceC8048 interfaceC8048) {
        AbstractC5692.m10229(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public /* bridge */ CaptureStatus mo10190(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10267(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public /* bridge */ InterfaceC8055 mo10191(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10249(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public /* bridge */ int mo10192(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10250(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public boolean mo10193(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return !AbstractC5227.m9466(AbstractC5692.m10278(mo10164(interfaceC8049)), AbstractC5692.m10278(mo10170(interfaceC8049)));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public boolean mo10194(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        return (abstractC5710M10265 != null ? AbstractC5692.m10247(abstractC5710M10265) : null) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public /* bridge */ void mo10195(InterfaceC8048 interfaceC8048) {
        AbstractC5692.m10230(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public /* bridge */ boolean mo10197(InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        return AbstractC5692.m10239(interfaceC8048, interfaceC80482);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public boolean mo10198(InterfaceC8060 interfaceC8060, InterfaceC8060 interfaceC80602) {
        interfaceC8060.getClass();
        interfaceC80602.getClass();
        if (!(interfaceC8060 instanceof InterfaceC5705)) {
            C6755.m11869("Failed requirement.");
            return false;
        }
        if (!(interfaceC80602 instanceof InterfaceC5705)) {
            C6755.m11869("Failed requirement.");
            return false;
        }
        if (AbstractC5692.m10251(interfaceC8060, interfaceC80602)) {
            return true;
        }
        InterfaceC5705 interfaceC5705 = (InterfaceC5705) interfaceC8060;
        InterfaceC5705 interfaceC57052 = (InterfaceC5705) interfaceC80602;
        Map map = (Map) this.f14509;
        if (((InterfaceC5684) this.f14510).mo10149(interfaceC5705, interfaceC57052)) {
            return true;
        }
        if (map != null) {
            InterfaceC5705 interfaceC57053 = (InterfaceC5705) map.get(interfaceC5705);
            InterfaceC5705 interfaceC57054 = (InterfaceC5705) map.get(interfaceC57052);
            if (interfaceC57053 != null && interfaceC57053.equals(interfaceC57052)) {
                return true;
            }
            if (interfaceC57054 != null && interfaceC57054.equals(interfaceC5705)) {
                return true;
            }
        }
        return false;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public /* bridge */ InterfaceC8049 mo10199(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10253(this, interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public /* bridge */ InterfaceC8048 mo10200(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10265(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public /* bridge */ InterfaceC8053 mo10201(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10275(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public /* bridge */ TypeVariance mo10202(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10258(interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public InterfaceC8059 mo10203(InterfaceC8048 interfaceC8048, int i) {
        if (i < 0 || i >= AbstractC5692.m10250(interfaceC8048)) {
            return null;
        }
        return AbstractC5692.m10263(interfaceC8048, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public /* bridge */ AbstractC5725 mo10204(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10273(this, interfaceC8048);
    }

    @Override // p023.InterfaceC6965
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo1552(C7032 c7032, IOException iOException) {
        try {
            ((InterfaceC6625) this.f14509).onFailure((C6598) this.f14510, iOException);
        } catch (Throwable th) {
            AbstractC6615.m11743(th);
            th.printStackTrace();
        }
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int mo10320(int i) {
        do {
            i = ((C2853) this.f14510).m4285(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14509).charAt(i - 1)));
        return i;
    }

    @Override // p213.InterfaceC8675
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int mo10321(int i) {
        do {
            i = ((C2853) this.f14510).m4286(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f14509).charAt(i)));
        return i;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public /* bridge */ boolean mo10206(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10238(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public /* bridge */ boolean mo10207(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10246(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public InterfaceC8059 mo10208(InterfaceC8055 interfaceC8055, int i) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8056) {
            return AbstractC5692.m10263((InterfaceC8049) interfaceC8055, i);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            InterfaceC8059 interfaceC8059 = ((ArgumentList) interfaceC8055).get(i);
            interfaceC8059.getClass();
            return interfaceC8059;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return null;
    }

    @Override // p132.InterfaceC8175
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public Object mo4321(C8170 c8170, Object obj) {
        return ((InterfaceC7383) this.f14509).invoke(c8170, obj);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public /* bridge */ InterfaceC8049 mo10209(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10225(interfaceC8052);
    }

    @Override // p142.InterfaceC8259
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲 */
    public boolean mo2859() {
        return ((InterfaceC8259) this.f14509).mo2859();
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public /* bridge */ boolean mo10210(InterfaceC8057 interfaceC8057, InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10240(interfaceC8057, interfaceC8060);
    }

    @Override // p020.InterfaceC6929
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public InterfaceC6932 mo961() {
        return (C7023) this.f14509;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public /* bridge */ boolean mo10211(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10236(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public /* bridge */ InterfaceC8057 mo10212(InterfaceC8060 interfaceC8060, int i) {
        return AbstractC5692.m10261(interfaceC8060, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public boolean mo10213(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10247(interfaceC8048) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public /* bridge */ boolean mo10214(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10235(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public /* bridge */ boolean mo10215(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10234(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public /* bridge */ InterfaceC8059 mo10216(InterfaceC8053 interfaceC8053) {
        return AbstractC5692.m10224(interfaceC8053);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public /* bridge */ TypeVariance mo10217(InterfaceC8057 interfaceC8057) {
        return AbstractC5692.m10255(interfaceC8057);
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public C3058 mo863(View view, C3058 c3058) {
        AbstractC8412 abstractC8412 = (AbstractC8412) this.f14510;
        C3058 c3058M4810 = AbstractC3103.m4810(view, c3058);
        if (c3058M4810.f6866.mo4579()) {
            return c3058M4810;
        }
        Rect rect = (Rect) this.f14509;
        rect.left = c3058M4810.m4627();
        rect.top = c3058M4810.m4625();
        rect.right = c3058M4810.m4626();
        rect.bottom = c3058M4810.m4628();
        int childCount = abstractC8412.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3058 c3058M4796 = AbstractC3103.m4796(abstractC8412.getChildAt(i), c3058M4810);
            rect.left = Math.min(c3058M4796.m4627(), rect.left);
            rect.top = Math.min(c3058M4796.m4625(), rect.top);
            rect.right = Math.min(c3058M4796.m4626(), rect.right);
            rect.bottom = Math.min(c3058M4796.m4628(), rect.bottom);
        }
        return c3058M4810.m4624(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public /* bridge */ Collection mo10218(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10277(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public /* bridge */ InterfaceC8059 mo10219(InterfaceC8049 interfaceC8049, int i) {
        return AbstractC5692.m10263(interfaceC8049, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public InterfaceC8049 mo10220(ArrayList arrayList) {
        AbstractC5710 abstractC5710;
        int size = arrayList.size();
        if (size == 0) {
            C6755.m11870("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC5746) AbstractC5176.m9339(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC5746 abstractC5746 = (AbstractC5746) it.next();
            z = z || AbstractC5725.m10388(abstractC5746);
            if (abstractC5746 instanceof AbstractC5710) {
                abstractC5710 = (AbstractC5710) abstractC5746;
            } else {
                if (!(abstractC5746 instanceof AbstractC5728)) {
                    C5043.m9170();
                    return null;
                }
                abstractC5710 = ((AbstractC5728) abstractC5746).f14561;
                z2 = true;
            }
            arrayList2.add(abstractC5710);
        }
        if (z) {
            return C8069.m13029(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C5689 c5689 = C5689.f14484;
        if (!z2) {
            return c5689.m10160(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC5725.m10366((AbstractC5746) it2.next()));
        }
        return AbstractC5725.m10368(c5689.m10160(arrayList2), c5689.m10160(arrayList3));
    }

    @Override // p142.InterfaceC8259
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public List mo2860(Integer num) {
        List listMo2860 = ((InterfaceC8259) this.f14509).mo2860(null);
        C2070 c2070 = (C2070) this.f14510;
        int i = c2070.f3920;
        return i < 0 ? listMo2860 : AbstractC5176.m9352(listMo2860, AbstractC5754.m10438(c2070, num, i, Integer.valueOf(c2070.m2672(c2070.f3913, i))));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public /* bridge */ Collection mo10221(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10223(this, interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public boolean mo10222(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10237(AbstractC5692.m10278(interfaceC8048));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public /* bridge */ InterfaceC8048 mo10152(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10276(interfaceC8050);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public /* bridge */ InterfaceC8048 mo10153(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10226(interfaceC8050);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public /* bridge */ InterfaceC8048 mo10154(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10272(interfaceC8048, false);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo10196(InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
    }

    public /* synthetic */ C5703(Object obj, int i) {
        this.f14511 = i;
        this.f14510 = obj;
    }

    public /* synthetic */ C5703(Object obj, int i, Object obj2) {
        this.f14511 = i;
        this.f14509 = obj;
        this.f14510 = obj2;
    }

    public C5703(HashMap map, InterfaceC5684 interfaceC5684) {
        this.f14511 = 8;
        interfaceC5684.getClass();
        this.f14509 = map;
        this.f14510 = interfaceC5684;
    }

    public C5703(C7859 c7859) {
        this.f14511 = 0;
        C5677 c5677 = new C5677("Type parameter upper bound erasure results");
        this.f14509 = AbstractC6019.m10773(new C2157(this, 9));
        this.f14510 = c5677.m10138(new C1850(this, 18));
    }

    public C5703(InterfaceC7387 interfaceC7387) {
        this.f14511 = 10;
        this.f14509 = interfaceC7387;
        this.f14510 = new C7946();
    }

    public C5703(C9648 c9648, C8788 c8788, C3327 c3327) {
        this.f14511 = 26;
        this.f14509 = c8788;
        new ArrayList(0);
        new ArrayList(0);
        C3326 c3326 = new C3326(c3327, new AbstractC3283[0]);
        this.f14510 = c3326;
        c3326.m5497(c9648);
        c3326.m5497(c8788);
        C8797 c8797 = new C8797();
        List arrayList = c9648.f22389;
        arrayList = arrayList == null ? new ArrayList() : arrayList;
        if (!arrayList.contains(c8797)) {
            arrayList.add(c8797);
        }
        c9648.f22389 = arrayList;
    }

    public /* synthetic */ C5703(int i, Object obj, Object obj2, boolean z) {
        this.f14511 = i;
        this.f14510 = obj;
        this.f14509 = obj2;
    }

    public C5703(int i, InterfaceC7383 interfaceC7383) {
        this.f14511 = i;
        switch (i) {
            case 12:
                this.f14509 = interfaceC7383;
                this.f14510 = new ConcurrentHashMap();
                break;
            default:
                this.f14509 = interfaceC7383;
                this.f14510 = new C7946();
                break;
        }
    }

    public C5703(C1575 c1575) {
        this.f14511 = 5;
        InterfaceC7044 interfaceC7044 = (InterfaceC7044) c1575.f2414;
        this.f14509 = new C7023(c1575, interfaceC7044.mo12225().mo961(), -1L, true);
        this.f14510 = new C7022(c1575, interfaceC7044.mo12225().mo942(), -1L, true);
    }

    public C5703(EditText editText) {
        this.f14511 = 20;
        this.f14509 = editText;
        C8516 c8516 = new C8516(editText);
        this.f14510 = c8516;
        editText.addTextChangedListener(c8516);
        if (C8513.f21208 == null) {
            synchronized (C8513.f21209) {
                try {
                    if (C8513.f21208 == null) {
                        C8513 c8513 = new C8513();
                        try {
                            C8513.f21207 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C8513.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C8513.f21208 = c8513;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C8513.f21208);
    }

    public C5703(AbstractC8412 abstractC8412) {
        this.f14511 = 15;
        this.f14510 = abstractC8412;
        this.f14509 = new Rect();
    }
}
