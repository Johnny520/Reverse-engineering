package androidx.compose.foundation.layout;

import android.content.res.Resources;
import android.graphics.RectF;
import androidx.compose.foundation.C1868;
import androidx.compose.p001ui.C2964;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.text.C2878;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.snapshots.C2110;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.engine.AbstractC4708;
import io.ktor.http.cio.C4799;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6268;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.C6192;
import p050.AbstractC7176;
import p064.C7348;
import p068.InterfaceC7383;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7996;
import p128.C8157;
import p132.C8170;
import p132.InterfaceC8174;
import p221.C8735;
import p221.C8737;
import p252.AbstractC8944;
import p252.C8930;
import p348.C9614;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;
import top.yukonga.miuix.kmp.basic.AbstractC6862;
import top.yukonga.miuix.kmp.basic.C6856;
import top.yukonga.miuix.kmp.utils.C6901;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1481 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2142;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2143;

    public /* synthetic */ C1481(Object obj, int i) {
        this.f2143 = i;
        this.f2142 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e0  */
    @Override // p068.InterfaceC7383
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object objM9352;
        boolean zM13082;
        Object next;
        Pair pair;
        Object next2;
        InterfaceC8174 interfaceC8174;
        int i = this.f2143;
        InterfaceC6284 interfaceC6284 = null;
        C6008 c6008 = C6008.f15084;
        Object obj3 = this.f2142;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC1484.m2014((InterfaceC2962) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 1:
                return new C8737(((C2964) obj3).mo4419(0L, ((C8735) obj).f22224, (LayoutDirection) obj2));
            case 2:
                float fFloatValue = ((Float) obj2).floatValue();
                ((C2478) obj).m3584();
                ((Ref$FloatRef) obj3).element = fFloatValue;
                return c6008;
            case 3:
                C2110 c2110 = (C2110) obj3;
                Set set = (Set) obj;
                AtomicReference atomicReference = c2110.f4057;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        objM9352 = set;
                    } else if (obj4 instanceof Set) {
                        objM9352 = AbstractC7176.m12490(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            AbstractC2209.m3066("Unexpected notification");
                            C5043.m9161();
                            return null;
                        }
                        objM9352 = AbstractC5176.m9352(AbstractC7176.m12487(set), (Collection) obj4);
                    }
                    while (!atomicReference.compareAndSet(obj4, objM9352)) {
                        if (atomicReference.get() != obj4) {
                        }
                        break;
                    }
                    if (c2110.m2807()) {
                        c2110.f4058.invoke(new C1868(c2110, 6));
                    }
                    return c6008;
                }
                break;
            case 4:
                C8157 c8157M3431 = AbstractC2416.m3431((RectF) obj);
                C8157 c8157M34312 = AbstractC2416.m3431((RectF) obj2);
                switch (((C2878) obj3).f6392) {
                    case 0:
                        zM13082 = c8157M3431.m13082(c8157M34312);
                        break;
                    default:
                        zM13082 = c8157M34312.m13080(c8157M3431.m13079());
                        break;
                }
                return Boolean.valueOf(zM13082);
            case 5:
                C1481 c1481 = (C1481) obj3;
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                String[] strArr = AbstractC8944.f22758;
                if (!"Content-Length".equals(str) && !"Content-Type".equals(str)) {
                    if (AbstractC4708.f12436.contains(str)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            c1481.invoke(str, (String) it.next());
                        }
                    } else {
                        c1481.invoke(str, AbstractC5176.m9369(list, "Cookie".equals(str) ? "; " : ",", null, null, null, 62));
                    }
                }
                return c6008;
            case 6:
                C4799 c4799 = (C4799) obj3;
                String str2 = (String) obj;
                String str3 = (String) obj2;
                str2.getClass();
                str3.getClass();
                String[] strArr2 = AbstractC8944.f22758;
                if (!str2.equals("Content-Length") && !str2.equals("Expect")) {
                    c4799.m8918(str2, str3);
                }
                return c6008;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iM10732 = AbstractC5976.m10732(charSequence, (char[]) obj3, iIntValue, false);
                if (iM10732 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iM10732), 1);
            case 8:
                List list2 = (List) obj3;
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence2.getClass();
                if (list2.size() == 1) {
                    String str4 = (String) AbstractC5176.m9339(list2);
                    int iM10729 = AbstractC5976.m10729(charSequence2, str4, iIntValue2, false, 4);
                    pair = iM10729 < 0 ? null : new Pair(Integer.valueOf(iM10729), str4);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    C7348 c7348 = new C7348(iIntValue2, charSequence2.length(), 1);
                    boolean z = charSequence2 instanceof String;
                    int i2 = c7348.f18162;
                    int i3 = c7348.f18161;
                    if (z) {
                        if ((i2 > 0 && iIntValue2 <= i3) || (i2 < 0 && i3 <= iIntValue2)) {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        String str5 = (String) next2;
                                        if (str5.regionMatches(0, (String) charSequence2, iIntValue2, str5.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str6 = (String) next2;
                                if (str6 != null) {
                                    pair = new Pair(Integer.valueOf(iIntValue2), str6);
                                } else if (iIntValue2 != i3) {
                                    iIntValue2 += i2;
                                }
                            }
                        }
                    } else if ((i2 > 0 && iIntValue2 <= i3) || (i2 < 0 && i3 <= iIntValue2)) {
                        int i4 = iIntValue2;
                        while (true) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    String str7 = (String) next;
                                    if (AbstractC5976.m10707(str7, 0, charSequence2, i4, str7.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str8 = (String) next;
                            if (str8 != null) {
                                pair = new Pair(Integer.valueOf(i4), str8);
                            } else if (i4 != i3) {
                                i4 += i2;
                            }
                        }
                    }
                }
                if (pair != null) {
                    return new Pair(pair.getFirst(), Integer.valueOf(((String) pair.getSecond()).length()));
                }
                return null;
            case 9:
                int iIntValue3 = ((Integer) obj).intValue();
                InterfaceC5186 interfaceC5186 = (InterfaceC5186) obj2;
                InterfaceC5193 key = interfaceC5186.getKey();
                InterfaceC5186 interfaceC51862 = ((SafeCollector) obj3).collectContext.get(key);
                if (key != C6285.f15450) {
                    iIntValue3 = interfaceC5186 != interfaceC51862 ? Integer.MIN_VALUE : iIntValue3 + 1;
                } else {
                    InterfaceC6284 interfaceC62842 = (InterfaceC6284) interfaceC51862;
                    InterfaceC6284 parent = (InterfaceC6284) interfaceC5186;
                    while (parent != null) {
                        if (parent != interfaceC62842 && (parent instanceof C6192)) {
                            InterfaceC6268 interfaceC6268M11151 = ((C6192) parent).m11151();
                            parent = interfaceC6268M11151 != null ? interfaceC6268M11151.getParent() : null;
                        } else {
                            interfaceC6284 = parent;
                            if (interfaceC6284 == interfaceC62842) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC6284 + ", expected child of " + interfaceC62842 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC62842 != null) {
                            }
                        }
                    }
                    if (interfaceC6284 == interfaceC62842) {
                    }
                }
                return Integer.valueOf(iIntValue3);
            case 10:
                return SettingActivity.onCreate$lambda$0((SettingActivity) obj3, (InterfaceC2208) obj, ((Integer) obj2).intValue());
            case 11:
                C6856 c6856 = (C6856) obj3;
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                "C72@2877L41,71@2842L139:MainScreen.kt#ndgvs9";
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC6862.m11948(((Resources) c2159.m2943(AbstractC2670.f5680)).getString(C0328R.string.module_name), null, 0L, 0L, null, 0L, null, null, c6856, false, 0.0f, c2159, 0);
                } else {
                    c2159.m2899();
                }
                return c6008;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC6799.m11911((String) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC6799.m11908((C9614) obj3, (InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 14:
                ((Integer) obj2).getClass();
                ((C6901) obj3).m11986((InterfaceC2208) obj, AbstractC2202.m3031(7));
                return c6008;
            case 15:
                C8170 c8170 = (C8170) obj;
                List list3 = (List) ((InterfaceC7383) obj3).invoke(c8170, obj2);
                int size = list3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj5 = list3.get(i5);
                    if (obj5 != null && (interfaceC8174 = c8170.f19904) != null && !interfaceC8174.mo2045(obj5)) {
                        throw new IllegalArgumentException(("item at index " + i5 + " can't be saved: " + obj5).toString());
                    }
                }
                if (list3.isEmpty()) {
                    return null;
                }
                return new ArrayList(list3);
            case 16:
                String str9 = (String) obj;
                List list4 = (List) obj2;
                str9.getClass();
                list4.getClass();
                ((C8930) obj3).f22730.mo2969(str9, list4);
                return c6008;
            case 17:
                "<unused var>";
                ((C7981) obj).getClass();
                return AbstractC3738.m6853(((C7996) obj3).invoke(), (AbstractC8005) obj2);
            default:
                ((StringBuilder) obj3).append(((String) obj) + ':' + obj2 + '\n');
                return c6008;
        }
    }

    public /* synthetic */ C1481(Object obj, int i, int i2) {
        this.f2143 = i2;
        this.f2142 = obj;
    }
}
