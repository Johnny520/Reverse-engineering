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
import io.ktor.client.plugins.AbstractC3925;
import java.util.Map;
import kotlin.C5176;
import kotlin.Pair;
import kotlin.coroutines.C4356;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4355;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5419;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.internal.C5354;
import p034.AbstractC6347;
import p052.InterfaceC6554;
import p236.AbstractC8115;
import p236.C8099;
import p241.C8140;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.components.AbstractC5966;
import top.suzhelan.qstory.ui.components.AbstractC5969;
import top.yukonga.miuix.kmp.basic.AbstractC6032;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0753 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2179;

    public /* synthetic */ C0753(int i) {
        this.f2179 = i;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        int i = this.f2179;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                C0741 c0741 = (C0741) obj2;
                return AbstractC6347.m11931(Integer.valueOf(c0741.f2105.m1560()), Integer.valueOf(c0741.f2105.m1558()));
            case 1:
                C0676 c0676 = (C0676) obj2;
                return AbstractC6347.m11931(Integer.valueOf(((AbstractC1346) ((InterfaceC1398) c0676.f1881.f319)).m2432()), Integer.valueOf(((AbstractC1346) ((InterfaceC1398) c0676.f1881.f320)).m2432()));
            case 2:
                Map mapMo1484 = ((C0683) obj2).mo1484();
                if (mapMo1484.isEmpty()) {
                    return null;
                }
                return mapMo1484;
            case 3:
                C0131 c0131 = ((C0736) obj2).f2077;
                return AbstractC6347.m11931((int[]) c0131.f578, (int[]) c0131.f577);
            case 4:
                C0998 c0998 = (C0998) obj2;
                return AbstractC6347.m11931(Float.valueOf(c0998.m1919()), Boolean.valueOf(((Orientation) ((AbstractC1347) c0998.f2925).getValue()) == Orientation.Vertical));
            case 5:
                ((AbstractC3925) obj).getClass();
                ((C8140) obj2).getClass();
                return c5176;
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
                C8099 c8099 = (C8099) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c8099.getClass();
                return Character.valueOf(c8099.f22374.charAt(iIntValue3));
            case 14:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                String[] strArr = AbstractC8115.f22413;
                return Boolean.valueOf(!r0.equalsIgnoreCase("Content-Length"));
            case 15:
                return CombinedContext.toString$lambda$0((String) obj, (InterfaceC4354) obj2);
            case 16:
                InterfaceC4360 interfaceC4360 = (InterfaceC4360) obj;
                InterfaceC4354 interfaceC4354 = (InterfaceC4354) obj2;
                interfaceC4360.getClass();
                interfaceC4354.getClass();
                InterfaceC4360 interfaceC4360MinusKey = interfaceC4360.minusKey(interfaceC4354.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (interfaceC4360MinusKey == emptyCoroutineContext) {
                    return interfaceC4354;
                }
                C4356 c4356 = C4356.f12936;
                InterfaceC4355 interfaceC4355 = (InterfaceC4355) interfaceC4360MinusKey.get(c4356);
                if (interfaceC4355 == null) {
                    combinedContext = new CombinedContext(interfaceC4360MinusKey, interfaceC4354);
                } else {
                    InterfaceC4360 interfaceC4360MinusKey2 = interfaceC4360MinusKey.minusKey(c4356);
                    if (interfaceC4360MinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(interfaceC4354, interfaceC4355);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(interfaceC4360MinusKey2, interfaceC4354), interfaceC4355);
                }
                return combinedContext;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 18:
                return ((InterfaceC4360) obj).plus((InterfaceC4354) obj2);
            case 19:
                return ((InterfaceC4360) obj).plus((InterfaceC4354) obj2);
            case 20:
                return Boolean.valueOf(AbstractC4395.m8907(obj, obj2));
            case 21:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (InterfaceC4354) obj2));
            case 22:
                InterfaceC4354 interfaceC43542 = (InterfaceC4354) obj2;
                if (!(interfaceC43542 instanceof InterfaceC5419)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue4 = num != null ? num.intValue() : 1;
                return iIntValue4 == 0 ? interfaceC43542 : Integer.valueOf(iIntValue4 + 1);
            case 23:
                InterfaceC5419 interfaceC5419 = (InterfaceC5419) obj;
                InterfaceC4354 interfaceC43543 = (InterfaceC4354) obj2;
                if (interfaceC5419 != null) {
                    return interfaceC5419;
                }
                if (interfaceC43543 instanceof InterfaceC5419) {
                    return (InterfaceC5419) interfaceC43543;
                }
                return null;
            case 24:
                C5354 c5354 = (C5354) obj;
                InterfaceC4354 interfaceC43544 = (InterfaceC4354) obj2;
                if (interfaceC43544 instanceof InterfaceC5419) {
                    InterfaceC4360 interfaceC43602 = c5354.f14936;
                    Trace.beginSection(null);
                    Object[] objArr = c5354.f14935;
                    int i2 = c5354.f14933;
                    objArr[i2] = c5176;
                    InterfaceC5419[] interfaceC5419Arr = c5354.f14934;
                    c5354.f14933 = i2 + 1;
                    interfaceC5419Arr[i2] = (InterfaceC5419) interfaceC43544;
                }
                return c5354;
            case 25:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                AbstractC8405.m13972(2871); /* decoded: m13972(2871)=C25@862L12:NewMainActivity.kt#itusog */
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2343(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC5966.m11339(c1324, 0);
                } else {
                    c1324.m2339();
                }
                return c5176;
            case 26:
                InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                AbstractC8405.m13972(2941); /* decoded: m13972(2941)=C60@2666L44:MainScreen.kt#ndgvs9 */
                C1324 c13242 = (C1324) interfaceC13732;
                if (c13242.m2343(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    AbstractC6032.m11385(null, null, null, null, 0, null, 0, null, null, 0L, null, AbstractC5969.f16184, c13242, 0, 2047);
                } else {
                    c13242.m2339();
                }
                return c5176;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC5966.m11339((InterfaceC1373) obj, AbstractC1367.m2471(1));
                return c5176;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC5966.m11341((InterfaceC1373) obj, AbstractC1367.m2471(1));
                return c5176;
            default:
                ((Integer) obj2).getClass();
                AbstractC5966.m11340((InterfaceC1373) obj, AbstractC1367.m2471(1));
                return c5176;
        }
    }
}
