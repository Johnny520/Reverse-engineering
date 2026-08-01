package io.ktor.util;

import android.content.Context;
import android.widget.ImageView;
import androidx.activity.C0016;
import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.C0760;
import androidx.compose.foundation.lazy.C0761;
import androidx.compose.runtime.internal.C1242;
import com.bumptech.glide.AbstractC3057;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4354;
import kotlin.jvm.internal.AbstractC4390;
import kotlin.jvm.internal.C4391;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.sequences.InterfaceC5127;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.AbstractC5485;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import org.luckypray.dexkit.query.enums.StringMatchType;
import org.luckypray.dexkit.query.matchers.C5709;
import org.luckypray.dexkit.query.matchers.C5714;
import org.luckypray.dexkit.query.matchers.C5717;
import org.luckypray.dexkit.util.AbstractC5731;
import org.slf4j.Marker;
import p013.C6228;
import p034.AbstractC6347;
import p048.C6519;
import p052.InterfaceC6558;
import p056.C6631;
import p088.AbstractC7176;
import p088.C7167;
import p088.C7172;
import p088.C7174;
import p089.C7182;
import p089.InterfaceC7184;
import p091.C7195;
import p287.AbstractC8405;
import p362.C8926;
import p362.C8927;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4207 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12696;

    public /* synthetic */ C4207(int i) {
        this.f12696 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12696;
        int i2 = 17;
        int i3 = 20;
        int i4 = 3;
        int i5 = 2;
        Object obj2 = null;
        C5176 c5176 = C5176.f14739;
        z = false;
        boolean z = false;
        int i6 = 1;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return new C4205(str);
            case 1:
                ((Throwable) obj).getClass();
                return c5176;
            case 2:
                ((Throwable) obj).getClass();
                return c5176;
            case 3:
                C7174 c7174 = (C7174) obj;
                c7174.getClass();
                c7174.f19144 = true;
                c7174.f19146 = true;
                c7174.f19143 = true;
                ClassDiscriminatorMode classDiscriminatorMode = ClassDiscriminatorMode.NONE;
                classDiscriminatorMode.getClass();
                c7174.f19147 = classDiscriminatorMode;
                c7174.f19145 = false;
                return c5176;
            case 4:
                C5085 c5085 = (C5085) obj;
                c5085.getClass();
                KVariance kVariance = c5085.f14638;
                if (kVariance == null) {
                    return Marker.ANY_MARKER;
                }
                InterfaceC5087 interfaceC5087 = c5085.f14637;
                C4391 c4391 = interfaceC5087 instanceof C4391 ? (C4391) interfaceC5087 : null;
                String strM8897 = c4391 != null ? c4391.m8897(true) : String.valueOf(interfaceC5087);
                int i7 = AbstractC4390.f12965[kVariance.ordinal()];
                if (i7 == 1) {
                    return strM8897;
                }
                if (i7 == 2) {
                    return "in ".concat(strM8897);
                }
                if (i7 == 3) {
                    return "out ".concat(strM8897);
                }
                C4211.m8611();
                return null;
            case 5:
                InterfaceC5127 interfaceC5127 = (InterfaceC5127) obj;
                interfaceC5127.getClass();
                return interfaceC5127.iterator();
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
                InterfaceC4354 interfaceC4354 = (InterfaceC4354) obj;
                if (interfaceC4354 instanceof AbstractC5432) {
                    return (AbstractC5432) interfaceC4354;
                }
                return null;
            case 14:
                ((String) obj).getClass();
                return c5176;
            case 15:
                C5709 c5709 = (C5709) obj;
                AbstractC8405.m13972(2088); /* decoded: m13972(2088)=$this$matcher */
                c5709.getClass();
                String[] strArr = {AbstractC8405.m13973("喵喵喵喵喵呜呜喵"), AbstractC8405.m13973("喵喵喵喵喵呜喵呜")}; /* decoded-inline: u ; v */
                ArrayList arrayList = new ArrayList(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    arrayList.add(new C8926(strArr[i8], StringMatchType.Equals, false));
                }
                c5709.f15652 = new ArrayList(arrayList);
                C5717 c5717 = new C5717();
                AbstractC8405.m13972(2087); /* decoded: m13972(2087)=$this$methods */
                C4207 c4207 = new C4207(16);
                C5714 c5714 = new C5714();
                c4207.invoke(c5714);
                c5717.m11123(c5714);
                C4207 c42072 = new C4207(i2);
                C5714 c57142 = new C5714();
                c42072.invoke(c57142);
                c5717.m11123(c57142);
                c5709.f15653 = c5717;
                return c5176;
            case 16:
                C5714 c57143 = (C5714) obj;
                AbstractC8405.m13972(2086); /* decoded: m13972(2086)=$this$add */
                c57143.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                Number number = new Number[]{4194303}[0];
                C8927 c8927 = new C8927();
                c8927.m14549(number);
                arrayList2.add(c8927);
                c57143.f15668 = new ArrayList(arrayList2);
                return c5176;
            case 17:
                C5714 c57144 = (C5714) obj;
                AbstractC8405.m13972(2086); /* decoded: m13972(2086)=$this$add */
                c57144.getClass();
                C5709 c57092 = new C5709();
                c57092.m11121(AbstractC5731.m11132(Map.class), StringMatchType.Equals, false);
                c57144.f15661 = c57092;
                ArrayList<Number> arrayListM8790 = AbstractC4344.m8790(new C6519(1, 17, 1), new C6519(20, 24, 1));
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayListM8790, 10));
                for (Number number2 : arrayListM8790) {
                    C8927 c89272 = new C8927();
                    c89272.m14549(number2);
                    arrayList3.add(c89272);
                }
                c57144.f15668 = new ArrayList(arrayList3);
                return c5176;
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 19:
                return Integer.valueOf((-((Integer) obj).intValue()) / 2);
            case 20:
                return Integer.valueOf((-((Integer) obj).intValue()) / 4);
            case 21:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 22:
                C0760 c0760 = (C0760) obj;
                AbstractC8405.m13972(2966); /* decoded: m13972(2966)=$this$LazyColumn */
                c0760.getClass();
                c0760.f2224.m1477(1, new C0108(obj2, new C0016(i3), new C1242(-857469575, true, new C0761(false ? 1 : 0)), i5));
                return c5176;
            case 23:
                Context context = (Context) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜"); /* decoded-inline: it */
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return imageView;
            case 24:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 25:
                C6228 c6228 = (C6228) obj;
                c6228.getClass();
                AbstractC6347 abstractC6347 = c6228.f17162;
                if (abstractC6347 instanceof C6228) {
                    return (C6228) abstractC6347;
                }
                return null;
            case 26:
                C6228 c62282 = (C6228) obj;
                c62282.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(c62282.f17164);
                sb.append(SignatureVisitor.INSTANCEOF);
                sb.append(c62282.f17163);
                return sb.toString();
            case 27:
                C7195 c7195 = (C7195) obj;
                c7195.getClass();
                C7195.m12437(c7195, "JsonPrimitive", new C7172(new C6631(29)));
                C7195.m12437(c7195, "JsonNull", new C7172(new C7167(false ? 1 : 0)));
                C7195.m12437(c7195, "JsonLiteral", new C7172(new C7167(i6)));
                C7195.m12437(c7195, "JsonObject", new C7172(new C7167(i5)));
                C7195.m12437(c7195, "JsonArray", new C7172(new C7167(i4)));
                return c5176;
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                AbstractC7176 abstractC7176 = (AbstractC7176) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                AbstractC5485.m10642(sb2, str2);
                sb2.append(':');
                sb2.append(abstractC7176);
                return sb2.toString();
            default:
                InterfaceC5093 interfaceC5093 = (InterfaceC5093) obj;
                interfaceC5093.getClass();
                InterfaceC7184 interfaceC7184M9870 = AbstractC4922.m9870(interfaceC5093);
                if (interfaceC7184M9870 != null) {
                    return interfaceC7184M9870;
                }
                if (AbstractC3057.m6756(interfaceC5093).isInterface()) {
                    return new C7182(interfaceC5093);
                }
                return null;
        }
    }

    public /* synthetic */ C4207(Object obj, int i) {
        this.f12696 = i;
    }
}
