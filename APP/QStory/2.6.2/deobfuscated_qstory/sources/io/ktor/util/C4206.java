package io.ktor.util;

import android.content.Context;
import android.widget.ImageView;
import androidx.activity.C0016;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.C0760;
import androidx.compose.foundation.lazy.C0761;
import androidx.compose.runtime.internal.C1242;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4353;
import kotlin.jvm.internal.AbstractC4389;
import kotlin.jvm.internal.C4390;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.KVariance;
import kotlin.sequences.InterfaceC5126;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC5484;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5708;
import org.luckypray.dexkit.query.matchers.C5713;
import org.luckypray.dexkit.query.matchers.C5716;
import org.luckypray.dexkit.util.AbstractC5730;
import org.slf4j.Marker;
import p017.C6236;
import p048.C6518;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p056.C6630;
import p088.AbstractC7175;
import p088.C7166;
import p088.C7171;
import p088.C7173;
import p089.C7181;
import p089.InterfaceC7183;
import p091.C7194;
import p366.C8945;
import p366.C8946;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4206 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12692;

    public /* synthetic */ C4206(int i) {
        this.f12692 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12692;
        int i2 = 17;
        int i3 = 20;
        int i4 = 3;
        int i5 = 2;
        Object obj2 = null;
        C5175 c5175 = C5175.f14739;
        z = false;
        boolean z = false;
        int i6 = 1;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return new C4204(str);
            case 1:
                ((Throwable) obj).getClass();
                return c5175;
            case 2:
                ((Throwable) obj).getClass();
                return c5175;
            case 3:
                C7173 c7173 = (C7173) obj;
                c7173.getClass();
                c7173.f19149 = true;
                c7173.f19151 = true;
                c7173.f19148 = true;
                ClassDiscriminatorMode classDiscriminatorMode = ClassDiscriminatorMode.NONE;
                classDiscriminatorMode.getClass();
                c7173.f19152 = classDiscriminatorMode;
                c7173.f19150 = false;
                return c5175;
            case 4:
                C5084 c5084 = (C5084) obj;
                c5084.getClass();
                KVariance kVariance = c5084.f14638;
                if (kVariance == null) {
                    return Marker.ANY_MARKER;
                }
                InterfaceC5086 interfaceC5086 = c5084.f14637;
                C4390 c4390 = interfaceC5086 instanceof C4390 ? (C4390) interfaceC5086 : null;
                String strM8907 = c4390 != null ? c4390.m8907(true) : String.valueOf(interfaceC5086);
                int i7 = AbstractC4389.f12961[kVariance.ordinal()];
                if (i7 == 1) {
                    return strM8907;
                }
                if (i7 == 2) {
                    return "in ".concat(strM8907);
                }
                if (i7 == 3) {
                    return "out ".concat(strM8907);
                }
                C4210.m8621();
                return null;
            case 5:
                InterfaceC5126 interfaceC5126 = (InterfaceC5126) obj;
                interfaceC5126.getClass();
                return interfaceC5126.iterator();
            case 6:
                return Boolean.valueOf(obj == null);
            case 7:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 9:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 10:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 11:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 12:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                InterfaceC4353 interfaceC4353 = (InterfaceC4353) obj;
                if (interfaceC4353 instanceof AbstractC5431) {
                    return (AbstractC5431) interfaceC4353;
                }
                return null;
            case 14:
                ((String) obj).getClass();
                return c5175;
            case 15:
                C5708 c5708 = (C5708) obj;
                "$this$matcher";
                c5708.getClass();
                String[] strArr = {"u", "v"};
                ArrayList arrayList = new ArrayList(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    arrayList.add(new C8945(strArr[i8], StringMatchType.Equals, false));
                }
                c5708.f15653 = new ArrayList(arrayList);
                C5716 c5716 = new C5716();
                "$this$methods";
                C4206 c4206 = new C4206(16);
                C5713 c5713 = new C5713();
                c4206.invoke(c5713);
                c5716.m11066(c5713);
                C4206 c42062 = new C4206(i2);
                C5713 c57132 = new C5713();
                c42062.invoke(c57132);
                c5716.m11066(c57132);
                c5708.f15647 = c5716;
                return c5175;
            case 16:
                C5713 c57133 = (C5713) obj;
                "$this$add";
                c57133.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                Number number = new Number[]{4194303}[0];
                C8946 c8946 = new C8946();
                c8946.m14540(number);
                arrayList2.add(c8946);
                c57133.f15666 = new ArrayList(arrayList2);
                return c5175;
            case 17:
                C5713 c57134 = (C5713) obj;
                "$this$add";
                c57134.getClass();
                C5708 c57082 = new C5708();
                c57082.m11064(AbstractC5730.m11075(Map.class), StringMatchType.Equals, false);
                c57134.f15662 = c57082;
                ArrayList<Number> arrayListM8808 = AbstractC4343.m8808(new C6518(1, 17, 1), new C6518(20, 24, 1));
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayListM8808, 10));
                for (Number number2 : arrayListM8808) {
                    C8946 c89462 = new C8946();
                    c89462.m14540(number2);
                    arrayList3.add(c89462);
                }
                c57134.f15666 = new ArrayList(arrayList3);
                return c5175;
            case 18:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 19:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 22:
                C0760 c0760 = (C0760) obj;
                "$this$LazyColumn";
                c0760.getClass();
                c0760.f2223.m1467(1, new C0108(obj2, new C0016(i3), new C1242(-857469575, true, new C0761(false ? 1 : 0)), i5));
                return c5175;
            case 23:
                Context context = (Context) obj;
                "it";
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 24:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 25:
                C6236 c6236 = (C6236) obj;
                c6236.getClass();
                AbstractC3055 abstractC3055 = c6236.f17185;
                if (abstractC3055 instanceof C6236) {
                    return (C6236) abstractC3055;
                }
                return null;
            case 26:
                C6236 c62362 = (C6236) obj;
                c62362.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(c62362.f17187);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(c62362.f17186);
                return sb.toString();
            case 27:
                C7194 c7194 = (C7194) obj;
                c7194.getClass();
                C7194.m12410(c7194, "JsonPrimitive", new C7171(new C6630(29)));
                C7194.m12410(c7194, "JsonNull", new C7171(new C7166(false ? 1 : 0)));
                C7194.m12410(c7194, "JsonLiteral", new C7171(new C7166(i6)));
                C7194.m12410(c7194, "JsonObject", new C7171(new C7166(i5)));
                C7194.m12410(c7194, "JsonArray", new C7171(new C7166(i4)));
                return c5175;
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                AbstractC7175 abstractC7175 = (AbstractC7175) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                AbstractC5484.m10638(sb2, str2);
                sb2.append(':');
                sb2.append(abstractC7175);
                return sb2.toString();
            default:
                InterfaceC5092 interfaceC5092 = (InterfaceC5092) obj;
                interfaceC5092.getClass();
                InterfaceC7183 interfaceC7183M6704 = AbstractC3056.m6704(interfaceC5092);
                if (interfaceC7183M6704 != null) {
                    return interfaceC7183M6704;
                }
                if (AbstractC6560.m12029(interfaceC5092).isInterface()) {
                    return new C7181(interfaceC5092);
                }
                return null;
        }
    }

    public /* synthetic */ C4206(Object obj, int i) {
        this.f12692 = i;
    }
}
