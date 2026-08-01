package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0978;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C1517;
import androidx.compose.foundation.lazy.layout.C1524;
import androidx.compose.foundation.lazy.staggeredgrid.C1577;
import androidx.compose.foundation.text.C1836;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2233;
import io.ktor.client.plugins.AbstractC4757;
import java.util.Map;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.coroutines.C5188;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5187;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6251;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.C6186;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p252.AbstractC8944;
import p252.C8928;
import p257.C8969;
import p303.AbstractC9234;
import top.suzhelan.qstory.p015ui.components.AbstractC6796;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;
import top.yukonga.miuix.kmp.basic.AbstractC6862;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1594 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2524;

    public /* synthetic */ C1594(int i) {
        this.f2524 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.f2524;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                C1582 c1582 = (C1582) obj2;
                return AbstractC7176.m12490(Integer.valueOf(c1582.f2450.m2120()), Integer.valueOf(c1582.f2450.m2118()));
            case 1:
                C1517 c1517 = (C1517) obj2;
                return AbstractC7176.m12490(Integer.valueOf(((AbstractC2181) ((InterfaceC2233) c1517.f2226.f664)).m2992()), Integer.valueOf(((AbstractC2181) ((InterfaceC2233) c1517.f2226.f665)).m2992()));
            case 2:
                Map mapMo2044 = ((C1524) obj2).mo2044();
                if (mapMo2044.isEmpty()) {
                    return null;
                }
                return mapMo2044;
            case 3:
                C0978 c0978 = ((C1577) obj2).f2422;
                return AbstractC7176.m12490((int[]) c0978.f923, (int[]) c0978.f922);
            case 4:
                C1836 c1836 = (C1836) obj2;
                return AbstractC7176.m12490(Float.valueOf(c1836.m2479()), Boolean.valueOf(((Orientation) ((AbstractC2182) c1836.f3270).getValue()) == Orientation.Vertical));
            case 5:
                ((AbstractC4757) obj).getClass();
                ((C8969) obj2).getClass();
                return c6008;
            case 6:
                AbstractC0900.m697(obj);
                ((Integer) obj2).intValue();
                throw null;
            case 7:
                AbstractC0900.m697(obj);
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
                C8928 c8928 = (C8928) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c8928.getClass();
                return Character.valueOf(c8928.f22719.charAt(iIntValue3));
            case 14:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                String[] strArr = AbstractC8944.f22758;
                return Boolean.valueOf(!r0.equalsIgnoreCase("Content-Length"));
            case 15:
                return CombinedContext.toString$lambda$0((String) obj, (InterfaceC5186) obj2);
            case 16:
                InterfaceC5192 interfaceC5192 = (InterfaceC5192) obj;
                InterfaceC5186 interfaceC5186 = (InterfaceC5186) obj2;
                interfaceC5192.getClass();
                interfaceC5186.getClass();
                InterfaceC5192 interfaceC5192MinusKey = interfaceC5192.minusKey(interfaceC5186.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (interfaceC5192MinusKey == emptyCoroutineContext) {
                    return interfaceC5186;
                }
                C5188 c5188 = C5188.f13281;
                InterfaceC5187 interfaceC5187 = (InterfaceC5187) interfaceC5192MinusKey.get(c5188);
                if (interfaceC5187 == null) {
                    combinedContext = new CombinedContext(interfaceC5192MinusKey, interfaceC5186);
                } else {
                    InterfaceC5192 interfaceC5192MinusKey2 = interfaceC5192MinusKey.minusKey(c5188);
                    if (interfaceC5192MinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(interfaceC5186, interfaceC5187);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(interfaceC5192MinusKey2, interfaceC5186), interfaceC5187);
                }
                return combinedContext;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 18:
                return ((InterfaceC5192) obj).plus((InterfaceC5186) obj2);
            case 19:
                return ((InterfaceC5192) obj).plus((InterfaceC5186) obj2);
            case 20:
                return Boolean.valueOf(AbstractC5227.m9466(obj, obj2));
            case 21:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (InterfaceC5186) obj2));
            case 22:
                InterfaceC5186 interfaceC51862 = (InterfaceC5186) obj2;
                if (!(interfaceC51862 instanceof InterfaceC6251)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue4 = num != null ? num.intValue() : 1;
                return iIntValue4 == 0 ? interfaceC51862 : Integer.valueOf(iIntValue4 + 1);
            case 23:
                InterfaceC6251 interfaceC6251 = (InterfaceC6251) obj;
                InterfaceC5186 interfaceC51863 = (InterfaceC5186) obj2;
                if (interfaceC6251 != null) {
                    return interfaceC6251;
                }
                if (interfaceC51863 instanceof InterfaceC6251) {
                    return (InterfaceC6251) interfaceC51863;
                }
                return null;
            case 24:
                C6186 c6186 = (C6186) obj;
                InterfaceC5186 interfaceC51864 = (InterfaceC5186) obj2;
                if (interfaceC51864 instanceof InterfaceC6251) {
                    InterfaceC5192 interfaceC51922 = c6186.f15281;
                    Trace.beginSection(null);
                    Object[] objArr = c6186.f15280;
                    int i2 = c6186.f15278;
                    objArr[i2] = c6008;
                    InterfaceC6251[] interfaceC6251Arr = c6186.f15279;
                    c6186.f15278 = i2 + 1;
                    interfaceC6251Arr[i2] = (InterfaceC6251) interfaceC51864;
                }
                return c6186;
            case 25:
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                AbstractC9234.m14531(2871);
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC6796.m11898(c2159, 0);
                } else {
                    c2159.m2899();
                }
                return c6008;
            case 26:
                InterfaceC2208 interfaceC22082 = (InterfaceC2208) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                AbstractC9234.m14531(2941);
                C2159 c21592 = (C2159) interfaceC22082;
                if (c21592.m2903(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC6862.m11944(null, null, null, null, 0, null, 0, null, null, 0L, null, AbstractC6799.f16529, c21592, 0, 2047);
                } else {
                    c21592.m2899();
                }
                return c6008;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC6796.m11898((InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC6796.m11900((InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
            default:
                ((Integer) obj2).getClass();
                AbstractC6796.m11899((InterfaceC2208) obj, AbstractC2202.m3031(1));
                return c6008;
        }
    }
}
