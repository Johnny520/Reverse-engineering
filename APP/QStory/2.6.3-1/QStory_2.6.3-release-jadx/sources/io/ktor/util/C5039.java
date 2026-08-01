package io.ktor.util;

import android.content.Context;
import android.widget.ImageView;
import androidx.activity.C0863;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.lazy.C1601;
import androidx.compose.foundation.lazy.C1602;
import androidx.compose.runtime.internal.C2077;
import com.bumptech.glide.AbstractC3889;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5186;
import kotlin.jvm.internal.AbstractC5222;
import kotlin.jvm.internal.C5223;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.sequences.InterfaceC5959;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC6317;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C6539;
import org.luckypray.dexkit.query.matchers.C6544;
import org.luckypray.dexkit.query.matchers.C6547;
import org.luckypray.dexkit.util.AbstractC6561;
import org.slf4j.Marker;
import p029.C7057;
import p050.AbstractC7176;
import p064.C7348;
import p068.InterfaceC7387;
import p072.C7460;
import p104.AbstractC8005;
import p104.C7996;
import p104.C8001;
import p104.C8003;
import p105.C8011;
import p105.InterfaceC8013;
import p107.C8024;
import p303.AbstractC9234;
import p378.C9755;
import p378.C9756;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5039 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13041;

    public /* synthetic */ C5039(int i) {
        this.f13041 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f13041;
        int i2 = 17;
        int i3 = 20;
        int i4 = 3;
        int i5 = 2;
        Object obj2 = null;
        C6008 c6008 = C6008.f15084;
        z = false;
        boolean z = false;
        int i6 = 1;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return new C5037(str);
            case 1:
                ((Throwable) obj).getClass();
                return c6008;
            case 2:
                ((Throwable) obj).getClass();
                return c6008;
            case 3:
                C8003 c8003 = (C8003) obj;
                c8003.getClass();
                c8003.f19489 = true;
                c8003.f19491 = true;
                c8003.f19488 = true;
                ClassDiscriminatorMode classDiscriminatorMode = ClassDiscriminatorMode.NONE;
                classDiscriminatorMode.getClass();
                c8003.f19492 = classDiscriminatorMode;
                c8003.f19490 = false;
                return c6008;
            case 4:
                C5917 c5917 = (C5917) obj;
                c5917.getClass();
                KVariance kVariance = c5917.f14983;
                if (kVariance == null) {
                    return Marker.ANY_MARKER;
                }
                InterfaceC5919 interfaceC5919 = c5917.f14982;
                C5223 c5223 = interfaceC5919 instanceof C5223 ? (C5223) interfaceC5919 : null;
                String strM9456 = c5223 != null ? c5223.m9456(true) : String.valueOf(interfaceC5919);
                int i7 = AbstractC5222.f13310[kVariance.ordinal()];
                if (i7 == 1) {
                    return strM9456;
                }
                if (i7 == 2) {
                    return "in ".concat(strM9456);
                }
                if (i7 == 3) {
                    return "out ".concat(strM9456);
                }
                C5043.m9170();
                return null;
            case 5:
                InterfaceC5959 interfaceC5959 = (InterfaceC5959) obj;
                interfaceC5959.getClass();
                return interfaceC5959.iterator();
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
                InterfaceC5186 interfaceC5186 = (InterfaceC5186) obj;
                if (interfaceC5186 instanceof AbstractC6264) {
                    return (AbstractC6264) interfaceC5186;
                }
                return null;
            case 14:
                ((String) obj).getClass();
                return c6008;
            case 15:
                C6539 c6539 = (C6539) obj;
                AbstractC9234.m14531(2088);
                c6539.getClass();
                String[] strArr = {AbstractC9234.m14532("喵喵喵喵喵呜呜喵"), AbstractC9234.m14532("喵喵喵喵喵呜喵呜")};
                ArrayList arrayList = new ArrayList(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    arrayList.add(new C9755(strArr[i8], StringMatchType.Equals, false));
                }
                c6539.f15997 = new ArrayList(arrayList);
                C6547 c6547 = new C6547();
                AbstractC9234.m14531(2087);
                C5039 c5039 = new C5039(16);
                C6544 c6544 = new C6544();
                c5039.invoke(c6544);
                c6547.m11682(c6544);
                C5039 c50392 = new C5039(i2);
                C6544 c65442 = new C6544();
                c50392.invoke(c65442);
                c6547.m11682(c65442);
                c6539.f15998 = c6547;
                return c6008;
            case 16:
                C6544 c65443 = (C6544) obj;
                AbstractC9234.m14531(2086);
                c65443.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                Number number = new Number[]{4194303}[0];
                C9756 c9756 = new C9756();
                c9756.m15108(number);
                arrayList2.add(c9756);
                c65443.f16013 = new ArrayList(arrayList2);
                return c6008;
            case 17:
                C6544 c65444 = (C6544) obj;
                AbstractC9234.m14531(2086);
                c65444.getClass();
                C6539 c65392 = new C6539();
                c65392.m11680(AbstractC6561.m11691(Map.class), StringMatchType.Equals, false);
                c65444.f16006 = c65392;
                ArrayList<Number> arrayListM9349 = AbstractC5176.m9349(new C7348(1, 17, 1), new C7348(20, 24, 1));
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayListM9349, 10));
                for (Number number2 : arrayListM9349) {
                    C9756 c97562 = new C9756();
                    c97562.m15108(number2);
                    arrayList3.add(c97562);
                }
                c65444.f16013 = new ArrayList(arrayList3);
                return c6008;
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 19:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 20:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 22:
                C1601 c1601 = (C1601) obj;
                AbstractC9234.m14531(2966);
                c1601.getClass();
                c1601.f2569.m2037(1, new C0955(obj2, new C0863(i3), new C2077(-857469575, true, new C1602(false ? 1 : 0)), i5));
                return c6008;
            case 23:
                Context context = (Context) obj;
                AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜");
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 24:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 25:
                C7057 c7057 = (C7057) obj;
                c7057.getClass();
                AbstractC7176 abstractC7176 = c7057.f17507;
                if (abstractC7176 instanceof C7057) {
                    return (C7057) abstractC7176;
                }
                return null;
            case 26:
                C7057 c70572 = (C7057) obj;
                c70572.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(c70572.f17509);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(c70572.f17508);
                return sb.toString();
            case 27:
                C8024 c8024 = (C8024) obj;
                c8024.getClass();
                C8024.m12996(c8024, "JsonPrimitive", new C8001(new C7460(29)));
                C8024.m12996(c8024, "JsonNull", new C8001(new C7996(false ? 1 : 0)));
                C8024.m12996(c8024, "JsonLiteral", new C8001(new C7996(i6)));
                C8024.m12996(c8024, "JsonObject", new C8001(new C7996(i5)));
                C8024.m12996(c8024, "JsonArray", new C8001(new C7996(i4)));
                return c6008;
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                AbstractC8005 abstractC8005 = (AbstractC8005) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                AbstractC6317.m11201(sb2, str2);
                sb2.append(':');
                sb2.append(abstractC8005);
                return sb2.toString();
            default:
                InterfaceC5925 interfaceC5925 = (InterfaceC5925) obj;
                interfaceC5925.getClass();
                InterfaceC8013 interfaceC8013M10429 = AbstractC5754.m10429(interfaceC5925);
                if (interfaceC8013M10429 != null) {
                    return interfaceC8013M10429;
                }
                if (AbstractC3889.m7316(interfaceC5925).isInterface()) {
                    return new C8011(interfaceC5925);
                }
                return null;
        }
    }

    public /* synthetic */ C5039(Object obj, int i) {
        this.f13041 = i;
    }
}
