package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0131;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C0676;
import androidx.compose.foundation.lazy.layout.C0683;
import androidx.compose.foundation.lazy.staggeredgrid.C0736;
import androidx.compose.foundation.text.C0998;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1398;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3924;
import java.util.Map;
import kotlin.C5175;
import kotlin.Pair;
import kotlin.coroutines.C4355;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.InterfaceC5418;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.C5353;
import p052.InterfaceC6553;
import p236.AbstractC8114;
import p236.C8098;
import p241.C8139;
import p253.AbstractC8189;
import top.suzhelan.qstory.ui.components.AbstractC5960;
import top.suzhelan.qstory.ui.components.AbstractC5963;
import top.yukonga.miuix.kmp.basic.AbstractC6026;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0753 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2178;

    public /* synthetic */ C0753(int i) {
        this.f2178 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.f2178;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                C0741 c0741 = (C0741) obj2;
                return AbstractC8189.m13659(Integer.valueOf(c0741.f2104.m1550()), Integer.valueOf(c0741.f2104.m1548()));
            case 1:
                C0676 c0676 = (C0676) obj2;
                return AbstractC8189.m13659(Integer.valueOf(((AbstractC1346) ((InterfaceC1398) c0676.f1880.f319)).m2422()), Integer.valueOf(((AbstractC1346) ((InterfaceC1398) c0676.f1880.f320)).m2422()));
            case 2:
                Map mapMo1474 = ((C0683) obj2).mo1474();
                if (mapMo1474.isEmpty()) {
                    return null;
                }
                return mapMo1474;
            case 3:
                C0131 c0131 = ((C0736) obj2).f2076;
                return AbstractC8189.m13659((int[]) c0131.f578, (int[]) c0131.f577);
            case 4:
                C0998 c0998 = (C0998) obj2;
                return AbstractC8189.m13659(Float.valueOf(c0998.m1909()), Boolean.valueOf(((Orientation) ((AbstractC1347) c0998.f2924).getValue()) == Orientation.Vertical));
            case 5:
                ((AbstractC3924) obj).getClass();
                ((C8139) obj2).getClass();
                return c5175;
            case 6:
                AbstractC0053.m137(obj);
                ((Integer) obj2).intValue();
                throw null;
            case 7:
                AbstractC0053.m137(obj);
                ((Integer) obj2).getClass();
                throw null;
            case 8:
                Pair pair = (Pair) obj;
                int iIntValue = ((Integer) obj2).intValue();
                pair.getClass();
                return Character.valueOf(((String) pair.getFirst()).charAt(iIntValue));
            case 9:
                ((Character) obj).getClass();
                ((Integer) obj2).getClass();
                return Boolean.FALSE;
            case 10:
                char cCharValue = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(cCharValue == ' ');
            case 11:
                char cCharValue2 = ((Character) obj).charValue();
                ((Integer) obj2).intValue();
                return Boolean.valueOf(cCharValue2 == ' ');
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                return Character.valueOf(charSequence.charAt(iIntValue2));
            case 13:
                C8098 c8098 = (C8098) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c8098.getClass();
                return Character.valueOf(c8098.f22376.charAt(iIntValue3));
            case 14:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                String[] strArr = AbstractC8114.f22415;
                return Boolean.valueOf(!r0.equalsIgnoreCase("Content-Length"));
            case 15:
                return CombinedContext.toString$lambda$0((String) obj, (InterfaceC4353) obj2);
            case 16:
                InterfaceC4359 interfaceC4359 = (InterfaceC4359) obj;
                InterfaceC4353 interfaceC4353 = (InterfaceC4353) obj2;
                interfaceC4359.getClass();
                interfaceC4353.getClass();
                InterfaceC4359 interfaceC4359MinusKey = interfaceC4359.minusKey(interfaceC4353.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (interfaceC4359MinusKey == emptyCoroutineContext) {
                    return interfaceC4353;
                }
                C4355 c4355 = C4355.f12932;
                InterfaceC4354 interfaceC4354 = (InterfaceC4354) interfaceC4359MinusKey.get(c4355);
                if (interfaceC4354 == null) {
                    combinedContext = new CombinedContext(interfaceC4359MinusKey, interfaceC4353);
                } else {
                    InterfaceC4359 interfaceC4359MinusKey2 = interfaceC4359MinusKey.minusKey(c4355);
                    if (interfaceC4359MinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(interfaceC4353, interfaceC4354);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(interfaceC4359MinusKey2, interfaceC4353), interfaceC4354);
                }
                return combinedContext;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 18:
                return ((InterfaceC4359) obj).plus((InterfaceC4353) obj2);
            case 19:
                return ((InterfaceC4359) obj).plus((InterfaceC4353) obj2);
            case 20:
                return Boolean.valueOf(AbstractC4394.m8917(obj, obj2));
            case 21:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (InterfaceC4353) obj2));
            case 22:
                InterfaceC4353 interfaceC43532 = (InterfaceC4353) obj2;
                if (!(interfaceC43532 instanceof InterfaceC5418)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue4 = num != null ? num.intValue() : 1;
                return iIntValue4 == 0 ? interfaceC43532 : Integer.valueOf(iIntValue4 + 1);
            case 23:
                InterfaceC5418 interfaceC5418 = (InterfaceC5418) obj;
                InterfaceC4353 interfaceC43533 = (InterfaceC4353) obj2;
                if (interfaceC5418 != null) {
                    return interfaceC5418;
                }
                if (interfaceC43533 instanceof InterfaceC5418) {
                    return (InterfaceC5418) interfaceC43533;
                }
                return null;
            case 24:
                C5353 c5353 = (C5353) obj;
                InterfaceC4353 interfaceC43534 = (InterfaceC4353) obj2;
                if (interfaceC43534 instanceof InterfaceC5418) {
                    InterfaceC4359 interfaceC43592 = c5353.f14936;
                    Trace.beginSection(null);
                    Object[] objArr = c5353.f14935;
                    int i2 = c5353.f14933;
                    objArr[i2] = c5175;
                    InterfaceC5418[] interfaceC5418Arr = c5353.f14934;
                    c5353.f14933 = i2 + 1;
                    interfaceC5418Arr[i2] = (InterfaceC5418) interfaceC43534;
                }
                return c5353;
            case 25:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                "C25@862L12:NewMainActivity.kt#itusog";
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2333(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC5960.m11279(c1324, 0);
                } else {
                    c1324.m2329();
                }
                return c5175;
            case 26:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                "C60@2666L44:MainScreen.kt#ndgvs9";
                C1324 c13242 = (C1324) interfaceC13732;
                if (c13242.m2333(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC6026.m11325(null, null, null, null, 0, null, 0, null, null, 0L, null, AbstractC5963.f16175, c13242, 0, 2047);
                } else {
                    c13242.m2329();
                }
                return c5175;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC5960.m11279((InterfaceC1373) obj, AbstractC1367.m2460(1));
                return c5175;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC5960.m11281((InterfaceC1373) obj, AbstractC1367.m2460(1));
                return c5175;
            default:
                ((Integer) obj2).getClass();
                AbstractC5960.m11280((InterfaceC1373) obj, AbstractC1367.m2460(1));
                return c5175;
        }
    }
}
