package p251;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.C0225;
import androidx.collection.C0276;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.draganddrop.C1431;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.colorspace.C1489;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1771;
import androidx.core.os.AbstractC2179;
import androidx.core.widget.ActionModeCallbackC2299;
import androidx.lifecycle.AbstractC2425;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.util.C4210;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.km.C4529;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4804;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.type.TypeDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C5726;
import p013.C6177;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6224;
import p053.AbstractC6560;
import p085.C7051;
import p085.C7054;
import p085.C7055;
import p085.C7056;
import p086.C7062;
import p097.AbstractC7224;
import p112.C7327;
import p152.C7592;
import p175.AbstractC7738;
import p205.C7904;
import p236.C8091;
import p236.C8092;
import p236.C8100;
import p236.C8104;
import p253.AbstractC8189;
import p345.C8839;
import p345.C8843;
import p383.AbstractC9032;
import p396.C9141;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏哲世.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1543 f22511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static volatile ExecutorService f22512;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static ActionMode.Callback m13594(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof ActionModeCallbackC2299) || callback == null) ? callback : new ActionModeCallbackC2299(callback, textView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static TypedValue m13595(Context context, String str, int i) {
        TypedValue typedValueM13597 = m13597(context.getTheme(), i);
        if (typedValueM13597 != null) {
            return typedValueM13597;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m13596(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueM13597 = m13597(theme, i);
        return (typedValueM13597 == null || typedValueM13597.type != 18) ? z : typedValueM13597.data != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static TypedValue m13597(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final void m13598(C8100 c8100, C8092 c8092) {
        c8100.getClass();
        c8100.f22381 = c8092.f22334;
        String str = c8092.f22331;
        str.getClass();
        c8100.f22384 = str;
        c8100.m13541(c8092.m13538());
        AbstractC7738.m13023(c8100, (String) c8092.f22339.getValue());
        c8100.f22380 = (String) c8092.f22337.getValue();
        c8100.f22379 = (String) c8092.f22333.getValue();
        C8104 c8104 = new C8104(2);
        c8104.m2415(AbstractC6560.m12008(0, 6, (String) c8092.f22336.getValue()));
        c8100.f22387 = c8104;
        c8100.f22388 = new C8091(c8104);
        String str2 = (String) c8092.f22332.getValue();
        str2.getClass();
        c8100.f22386 = str2;
        c8100.f22383 = c8092.f22327;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static void m13599(TextView textView, int i) {
        AbstractC6560.m12037(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m13600(TextView textView, int i) {
        AbstractC6560.m12037(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m13601(TextView textView, int i) {
        AbstractC6560.m12037(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2179.m3965(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final C7904 m13602(C7327 c7327) {
        return new C7904(Math.round(c7327.f19545), Math.round(c7327.f19544), Math.round(c7327.f19543), Math.round(c7327.f19542));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static TypedValue m13603(View view, int i) {
        return m13595(view.getContext(), view.getClass().getCanonicalName(), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13604(int i, int i2) {
        if (i <= i2) {
            return;
        }
        C4210.m8628("toIndex (", i, ") is greater than size (", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final TypeVariance m13605(Variance variance) {
        int i = AbstractC7224.f19273[variance.ordinal()];
        if (i == 1) {
            return TypeVariance.INV;
        }
        if (i == 2) {
            return TypeVariance.IN;
        }
        if (i == 3) {
            return TypeVariance.OUT;
        }
        C4210.m8621();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object[] m13606(Object[]... objArr) {
        if (objArr.length == 0) {
            C2632.m5298("There is no arrays to concat!");
            return null;
        }
        if (objArr.length == 1) {
            return objArr[0];
        }
        int length = 0;
        for (Object[] objArr2 : objArr) {
            length += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), length);
        int length2 = 0;
        for (Object[] objArr4 : objArr) {
            System.arraycopy(objArr4, 0, objArr3, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return objArr3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13607(C1431 c1431, long j) {
        if (!c1431.f6291.f6278) {
            return false;
        }
        C1771 c1771 = AbstractC1785.m3336(c1431).f5093.f5285;
        if (!c1771.f5202.f6278) {
            return false;
        }
        long jMo3066 = c1771.mo3066(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3066 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3066 & 4294967295L));
        long j2 = c1431.f4111;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4686 m13608(String str, C4686 c4686) {
        return c4686.m9331(C4690.m9340(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C7592 m13609(C0225 c0225) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C7592(AbstractC2179.m3966(c0225));
        }
        TextPaint textPaint = new TextPaint(c0225.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0225.getBreakStrategy();
        int hyphenationFrequency = c0225.getHyphenationFrequency();
        if (c0225.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c0225.getInputType() & 15) != 3) {
            boolean z = c0225.getLayoutDirection() == 1;
            switch (c0225.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC2179.m3968(DecimalFormatSymbols.getInstance(c0225.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C7592(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7051 m13610(C4535 c4535) {
        c4535.getClass();
        C7062 c7062 = C7051.f18943;
        c7062.getClass();
        return (C7051) AbstractC8189.m13664(c4535.f13217, c7062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static C6224 m13611(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            C5919.m11249("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                C5919.m11249("Headers cannot be null");
                return null;
            }
            strArr3[i2] = AbstractC5143.m10150(strArr2[i2]).toString();
        }
        int iM1155 = AbstractC0455.m1155(0, strArr3.length - 1, 2);
        if (iM1155 >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                AbstractC3065.m6819(str);
                AbstractC3065.m6818(str2, str);
                if (i == iM1155) {
                    break;
                }
                i += 2;
            }
        }
        return new C6224(strArr3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8839 m13612(C8843 c8843, boolean z) {
        long j;
        long j2;
        float f;
        long j3 = c8843.f24916;
        long j4 = c8843.f24917;
        long j5 = c8843.f24915;
        long jM13625 = m13625(C1599.m2940(0.8f, j5), j3);
        long jM136252 = m13625(C1599.m2940(0.8f, j5), j4);
        long j6 = c8843.f24914;
        long jM136253 = m13625(C1599.m2940(0.2f, j6), j3);
        long jM136254 = m13625(C1599.m2940(0.38f, j6), j3);
        long j7 = c8843.f24913;
        long jM136255 = m13625(C1599.m2940(0.38f, j7), jM136254);
        long jM136256 = m13625(C1599.m2940(0.38f, j6), j3);
        long jM136257 = m13625(C1599.m2940(0.6f, j7), jM136256);
        long jM136258 = m13625(C1599.m2940(0.38f, j6), j3);
        long jM136259 = m13625(C1599.m2940(0.5f, c8843.f24907), j3);
        long jM1362510 = m13625(C1599.m2940(0.38f, j5), jM136259);
        long jM1362511 = m13625(C1599.m2940(0.6f, j4), j3);
        long jM1362512 = m13625(C1599.m2940(0.38f, j5), jM1362511);
        long j8 = c8843.f24914;
        long j9 = c8843.f24913;
        long j10 = c8843.f24912;
        long j11 = c8843.f24911;
        long j12 = c8843.f24910;
        long j13 = c8843.f24909;
        long j14 = c8843.f24928;
        long j15 = c8843.f24927;
        long j16 = c8843.f24931;
        long j17 = c8843.f24932;
        long j18 = c8843.f24907;
        long j19 = c8843.f24908;
        long j20 = c8843.f24917;
        long j21 = c8843.f24915;
        long j22 = c8843.f24922;
        long j23 = c8843.f24921;
        long j24 = c8843.f24918;
        long j25 = c8843.f24906;
        long j26 = c8843.f24925;
        long j27 = c8843.f24926;
        long j28 = c8843.f24923;
        long j29 = c8843.f24924;
        long j30 = c8843.f24916;
        long j31 = c8843.f24919;
        long j32 = c8843.f24920;
        if (z) {
            j = j32;
            j2 = C1599.f4695;
            f = 0.6f;
        } else {
            j = j32;
            j2 = C1599.f4695;
            f = 0.3f;
        }
        return new C8839(j8, j9, j10, j11, j12, j13, j14, j15, jM136254, jM136255, jM136256, jM136257, jM136258, j16, j17, j18, j19, j20, j21, jM136259, jM1362510, jM1362511, jM1362512, j22, j23, j24, j25, j26, j27, j27, j28, j29, j8, j30, j21, j31, jM13625, j25, j25, j21, j, j21, j25, j20, jM136252, j24, j21, j19, j18, C1599.m2940(f, j2), c8843.f24914, c8843.f24917, jM136253);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final CallableMemberDescriptor$Kind m13613(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i = protoBuf$MemberKind == null ? -1 : AbstractC4804.f14008[protoBuf$MemberKind.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? CallableMemberDescriptor$Kind.DECLARATION : CallableMemberDescriptor$Kind.SYNTHESIZED : CallableMemberDescriptor$Kind.DELEGATION : CallableMemberDescriptor$Kind.FAKE_OVERRIDE : CallableMemberDescriptor$Kind.DECLARATION;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static String m13614(String str) {
        if (!str.startsWith(AbstractC3056.m6668(-3937561291900847527L))) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                try {
                    byte[] bArr = new byte[6];
                    if (bufferedInputStream.read(bArr) < 6) {
                        throw new IOException(AbstractC3056.m6668(-3937561231771305383L));
                    }
                    String strM13618 = m13618(bArr);
                    bufferedInputStream.close();
                    return strM13618;
                } finally {
                }
            } catch (IOException e) {
                C5919.m11252(e);
                return null;
            }
        }
        C6200 c6200 = new C6200();
        C1245 c1245 = new C1245(6);
        c1245.m2141(str);
        try {
            C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
            try {
                String strGuessContentTypeFromStream = URLConnection.guessContentTypeFromStream(new BufferedInputStream(c6204M11615.f17009.m11647()));
                if (strGuessContentTypeFromStream == null || !strGuessContentTypeFromStream.contains(AbstractC3056.m6668(-3937561854541563303L))) {
                    c6204M11615.close();
                    return AbstractC3056.m6668(-3937561347735422375L);
                }
                String strConcat = AbstractC3056.m6668(-3937562159484241319L).concat(strGuessContentTypeFromStream.substring(strGuessContentTypeFromStream.lastIndexOf(AbstractC3056.m6668(-3937561854541563303L)) + 1));
                c6204M11615.close();
                return strConcat;
            } finally {
            }
        } catch (IOException e2) {
            C5919.m11252(e2);
            return null;
        }
        C5919.m11252(e2);
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m13615(C8092 c8092) {
        StringBuilder sb = new StringBuilder();
        String str = (String) c8092.f22339.getValue();
        String str2 = (String) c8092.f22336.getValue();
        boolean z = c8092.f22327;
        str.getClass();
        str2.getClass();
        if (!AbstractC5143.m10164(str) && !AbstractC5138.m10125(str, "/", false)) {
            sb.append('/');
        }
        sb.append((CharSequence) str);
        if (str2.length() > 0 || z) {
            sb.append((CharSequence) TypeDescription.Generic.OfWildcardType.SYMBOL);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7055 m13616(C4529 c4529) {
        c4529.getClass();
        C7062 c7062 = C7055.f18954;
        c7062.getClass();
        return (C7055) AbstractC8189.m13664(c4529.f13191, c7062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7054 m13617(C4537 c4537) {
        c4537.getClass();
        C7062 c7062 = C7054.f18952;
        c7062.getClass();
        return (C7054) AbstractC8189.m13664(c4537.f13236, c7062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m13618(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        String upperCase = sb.toString().toUpperCase();
        return upperCase.startsWith(AbstractC3056.m6668(-3937561167346795943L)) ? AbstractC3056.m6668(-3937561197411567015L) : upperCase.startsWith(AbstractC3056.m6668(-3937561184526665127L)) ? AbstractC3056.m6668(-3937561347735422375L) : upperCase.startsWith(AbstractC3056.m6668(-3937561077152482727L)) ? AbstractC3056.m6668(-3937561141576992167L) : upperCase.startsWith(AbstractC3056.m6668(-3937561025612875175L)) ? AbstractC3056.m6668(-3937561021317907879L) : upperCase.startsWith(AbstractC3056.m6668(-3937561042792744359L)) ? AbstractC3056.m6668(-3937560961188365735L) : upperCase.startsWith(AbstractC3056.m6668(-3937560948303463847L)) ? AbstractC3056.m6668(-3937560978368234919L) : AbstractC3056.m6668(-3937560896763856295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7056 m13619(C4548 c4548) {
        c4548.getClass();
        C7062 c7062 = C7056.f18956;
        c7062.getClass();
        return (C7056) AbstractC8189.m13664(c4548.f13289, c7062);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4489 m13620(ProtoBuf$Visibility protoBuf$Visibility) {
        switch (protoBuf$Visibility == null ? -1 : AbstractC4804.f14007[protoBuf$Visibility.ordinal()]) {
            case 1:
                C4489 c4489 = AbstractC4488.f13113;
                c4489.getClass();
                return c4489;
            case 2:
                C4489 c44892 = AbstractC4488.f13116;
                c44892.getClass();
                return c44892;
            case 3:
                C4489 c44893 = AbstractC4488.f13115;
                c44893.getClass();
                return c44893;
            case 4:
                C4489 c44894 = AbstractC4488.f13114;
                c44894.getClass();
                return c44894;
            case 5:
                C4489 c44895 = AbstractC4488.f13112;
                c44895.getClass();
                return c44895;
            case 6:
                C4489 c44896 = AbstractC4488.f13111;
                c44896.getClass();
                return c44896;
            default:
                C4489 c44897 = AbstractC4488.f13116;
                c44897.getClass();
                return c44897;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC2425 m13621(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                C2632.m5294(AbstractC9032.m14590(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (AbstractC2425) objNewInstance;
            } catch (IllegalAccessException e) {
                C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            C0276.m847(AbstractC9032.m14590(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C5726 m13622(DexKitBridge dexKitBridge, C9141 c9141) {
        dexKitBridge.getClass();
        int iM7302 = c9141.m7302(4);
        int i = iM7302 != 0 ? c9141.f10849.getInt(iM7302 + c9141.f10850) : 0;
        int iM73022 = c9141.m7302(6);
        int i2 = iM73022 != 0 ? c9141.f10849.getInt(iM73022 + c9141.f10850) : 0;
        int iM73023 = c9141.m7302(8);
        int i3 = iM73023 != 0 ? c9141.f10849.getInt(iM73023 + c9141.f10850) : 0;
        int iM73024 = c9141.m7302(10);
        int i4 = iM73024 != 0 ? c9141.f10849.getInt(iM73024 + c9141.f10850) : 0;
        int iM73025 = c9141.m7302(12);
        String strM7300 = iM73025 != 0 ? c9141.m7300(iM73025 + c9141.f10850) : null;
        strM7300.getClass();
        int iM73026 = c9141.m7302(14);
        return new C5726(dexKitBridge, i, i2, i3, i4, strM7300, iM73026 != 0 ? c9141.f10849.getInt(iM73026 + c9141.f10850) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Executor m13623() {
        if (f22512 == null) {
            synchronized (AbstractC8174.class) {
                try {
                    if (f22512 == null) {
                        f22512 = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f22512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final byte[] m13624(CharsetEncoder charsetEncoder, CharSequence charSequence, int i, int i2) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i == 0) {
                String str = (String) charSequence;
                if (i2 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i, i2).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i, i2));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final long m13625(long j, long j2) {
        long jM2873;
        if (C1599.m2938(j) >= 1.0f) {
            return j;
        }
        float fM2938 = C1599.m2938(j);
        float fM29382 = C1599.m2938(j2);
        float f = 1.0f - fM2938;
        float f2 = (fM29382 * f) + fM2938;
        if (f2 == 0.0f) {
            jM2873 = AbstractC1581.m2873(0.0f, 0.0f, 0.0f, 0.0f, C1489.f4211);
        } else {
            jM2873 = AbstractC1581.m2873((((C1599.m2942(j2) * fM29382) * f) + (C1599.m2942(j) * fM2938)) / f2, (((C1599.m2943(j2) * fM29382) * f) + (C1599.m2943(j) * fM2938)) / f2, (((C1599.m2937(j2) * fM29382) * f) + (C1599.m2937(j) * fM2938)) / f2, f2, C1489.f4211);
        }
        return AbstractC1581.m2873(C1599.m2942(jM2873), C1599.m2943(jM2873), C1599.m2937(jM2873), 1.0f, C1489.f4211);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract void mo13626();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo12961(C0325 c0325);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public abstract void mo12962(Throwable th);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract String mo9998();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract void mo13627();
}
