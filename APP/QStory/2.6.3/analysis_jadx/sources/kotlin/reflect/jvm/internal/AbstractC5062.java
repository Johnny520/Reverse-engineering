package kotlin.reflect.jvm.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import androidx.activity.AbstractC0053;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.platform.AbstractC1835;
import androidx.core.os.AbstractC2171;
import androidx.core.os.AbstractC2173;
import androidx.core.widget.AbstractC2291;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3057;
import com.google.protobuf.DescriptorProtos$Edition;
import com.kongzue.dialogx.util.views.C3762;
import de.robv.android.xposed.XposedBridge;
import io.ktor.util.internal.C4189;
import io.ktor.util.internal.C4190;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4470;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4805;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C5728;
import p010.C6191;
import p010.InterfaceC6190;
import p018.AbstractC6253;
import p019.C6263;
import p049.AbstractC6526;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p066.AbstractC6879;
import p079.AbstractC6989;
import p087.AbstractC7144;
import p089.C7182;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7189;
import p164.AbstractC7667;
import p194.C7832;
import p194.C7833;
import p205.C7899;
import p205.C7901;
import p205.InterfaceC7896;
import p263.AbstractC8256;
import p263.C8255;
import p287.AbstractC8405;
import p344.AbstractC8826;
import p344.C8821;
import p344.C8825;
import p344.C8829;
import p344.C8832;
import p364.C8941;
import top.suzhelan.qstory.hook.item.C5925;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5062 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C4190 m10010(Object obj) {
        obj.getClass();
        C4189 c4189 = obj instanceof C4189 ? (C4189) obj : null;
        return c4189 != null ? c4189.f12656 : (C4190) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m10011(String str, byte[] bArr) {
        File file = new File(str);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
            } finally {
            }
        } catch (IOException e2) {
            C5925.m11313(e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final long m10012(Context context, int i) {
        return AbstractC1581.m2882(context.getResources().getColor(i, context.getTheme()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m10013(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final long m10014(long j, double d) {
        C8255 c8255 = new C8255(AbstractC1581.m2873(j));
        return AbstractC1581.m2882(AbstractC8256.m13823(c8255.f22856, c8255.f22855, d).f22857);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final String m10015(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final void m10016(Spannable spannable, C7832 c7832, int i, int i2) {
        if (c7832 != null) {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c7832, 10));
            Iterator it = c7832.f21374.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7833) it.next()).f21375);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m10017(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC2291.m4304(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m10018(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC1581.m2873(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final float m10019(long j, float f, InterfaceC7896 interfaceC7896) {
        float fM13343;
        long jM13344 = C7899.m13344(j);
        if (C7901.m13346(jM13344, 4294967296L)) {
            if (interfaceC7896.mo1257() <= 1.05d) {
                return interfaceC7896.mo1335(j);
            }
            fM13343 = C7899.m13343(j) / C7899.m13343(interfaceC7896.mo1334(f));
        } else {
            if (!C7901.m13346(jM13344, 8589934592L)) {
                return Float.NaN;
            }
            fM13343 = C7899.m13343(j);
        }
        return fM13343 * f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m10020(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC2173.m3956(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC2173.m3956(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            m10013(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m10013(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m10013(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        m10013(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m10021(Spannable spannable, long j, InterfaceC7896 interfaceC7896, int i, int i2) {
        long jM13344 = C7899.m13344(j);
        if (C7901.m13346(jM13344, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC6561.m12058(interfaceC7896.mo1335(j)), false), i, i2, 33);
        } else if (C7901.m13346(jM13344, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C7899.m13343(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final CallableMemberDescriptor$Kind m10022(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i = protoBuf$MemberKind == null ? -1 : AbstractC4805.f14012[protoBuf$MemberKind.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? CallableMemberDescriptor$Kind.DECLARATION : CallableMemberDescriptor$Kind.SYNTHESIZED : CallableMemberDescriptor$Kind.DELEGATION : CallableMemberDescriptor$Kind.FAKE_OVERRIDE : CallableMemberDescriptor$Kind.DECLARATION;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ThemePaletteStyle m10023(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -2057695229:
                if (upperCase.equals("TONAL_SPOT")) {
                    return ThemePaletteStyle.TonalSpot;
                }
                break;
            case -1842350374:
                if (upperCase.equals("SPRITZ")) {
                    return ThemePaletteStyle.Neutral;
                }
                break;
            case -1732662873:
                if (upperCase.equals("NEUTRAL")) {
                    return ThemePaletteStyle.Neutral;
                }
                break;
            case -1420885219:
                if (upperCase.equals("MONOCHROME")) {
                    return ThemePaletteStyle.Monochrome;
                }
                break;
            case -1310359704:
                if (upperCase.equals("EXPRESSIVE")) {
                    return ThemePaletteStyle.Expressive;
                }
                break;
            case -766121898:
                if (upperCase.equals("FRUIT_SALAD")) {
                    return ThemePaletteStyle.FruitSalad;
                }
                break;
            case -181226682:
                if (upperCase.equals("FIDELITY")) {
                    return ThemePaletteStyle.Fidelity;
                }
                break;
            case 1169293476:
                if (upperCase.equals("VIBRANT")) {
                    return ThemePaletteStyle.Vibrant;
                }
                break;
            case 1606074037:
                if (upperCase.equals("MONOCHROMATIC")) {
                    return ThemePaletteStyle.Monochrome;
                }
                break;
            case 1669513305:
                if (upperCase.equals("CONTENT")) {
                    return ThemePaletteStyle.Content;
                }
                break;
            case 1691559318:
                if (upperCase.equals("RAINBOW")) {
                    return ThemePaletteStyle.Rainbow;
                }
                break;
        }
        return ThemePaletteStyle.TonalSpot;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static int m10024(int i, float f, int i2) {
        return AbstractC7667.m12975(AbstractC7667.m12973(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m10025(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static int m10026(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final boolean m10027(AbstractC4882 abstractC4882) {
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        if (interfaceC4477Mo9211 != null) {
            if (AbstractC6879.m12156(interfaceC4477Mo9211) && AbstractC6879.m12155(interfaceC4477Mo9211) && !AbstractC4773.m9505((AbstractC6989) interfaceC4477Mo9211).equals(AbstractC6526.f17850)) {
                return true;
            }
            InterfaceC4477 interfaceC4477Mo92112 = abstractC4882.mo9722().mo9211();
            if (interfaceC4477Mo92112 != null && (interfaceC4477Mo92112 instanceof AbstractC6989) && (((AbstractC6989) interfaceC4477Mo92112).mo9020() instanceof C4470) && !AbstractC4917.m9844(abstractC4882)) {
                return true;
            }
        }
        InterfaceC4477 interfaceC4477Mo92113 = abstractC4882.mo9722().mo9211();
        InterfaceC4463 interfaceC4463 = interfaceC4477Mo92113 instanceof InterfaceC4463 ? (InterfaceC4463) interfaceC4477Mo92113 : null;
        return interfaceC4463 != null && m10027(AbstractC2905.m6299(interfaceC4463));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static String m10028(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            C6263.m11778(AbstractC8405.m13972(16), file.getAbsolutePath());
            return null;
        }
        if (file.isDirectory()) {
            C6263.m11778(AbstractC8405.m13972(17), file.getAbsolutePath());
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bufferedReader.close();
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static byte[] m10029(File file) {
        FileInputStream fileInputStream;
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            fileInputStream = new FileInputStream(file);
            file.length();
            try {
                bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e2) {
            C5925.m11313(e2);
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
            C5925.m11313(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m10030(C1235 c1235, InterfaceC1356 interfaceC1356, int i) {
        while (true) {
            int i2 = c1235.f3575;
            if (i > i2 && i < c1235.f3574) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c1235.m2101();
            if (c1235.m2106(c1235.f3575)) {
                interfaceC1356.mo946();
            }
            c1235.m2135();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C8825 m10031(boolean z, InterfaceC1373 interfaceC1373) {
        boolean z2;
        C8829 c8829;
        C8829 c88292;
        long jM10012;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2392(1238673096);
        Context context = (Context) c1324.m2383(AbstractC1835.f5336);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 33) {
            C8832 c8832 = null;
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "theme_customization_overlay_packages");
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("android.theme.customization.system_palette", "");
                    strOptString.getClass();
                    if (AbstractC5144.m10172(strOptString)) {
                        jM10012 = m10012(context, R.color.system_accent1_500);
                    } else {
                        if (!AbstractC5139.m10139(strOptString, "#", false)) {
                            strOptString = "#".concat(strOptString);
                        }
                        jM10012 = AbstractC1581.m2882(Color.parseColor(strOptString));
                    }
                    String strOptString2 = jSONObject.optString("android.theme.customization.theme_style", "TONAL_SPOT");
                    strOptString2.getClass();
                    c8832 = new C8832(jM10012, m10023(strOptString2), i >= 36 ? ThemeColorSpec.Spec2025 : ThemeColorSpec.Spec2021);
                }
            } catch (Exception unused) {
            }
            Log.d("DynamicColors", "System palette info: " + c8832);
            if (c8832 != null) {
                C8825 c8825M14487 = AbstractC8826.m14487(c8832.f24920, c8832.f24918, c8832.f24919, z);
                c1324.m2377(false);
                return c8825M14487;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            C1334 c1334 = AbstractC8826.f24886;
            C8825 c8825M144872 = AbstractC8826.m14487(AbstractC1581.m2880(4284960932L), ThemeColorSpec.Spec2021, ThemePaletteStyle.TonalSpot, z);
            c1324.m2377(false);
            return c8825M144872;
        }
        Integer numValueOf = Integer.valueOf(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        C8821 c8821 = new C8821(context, i2);
        C8821 c88212 = new C8821(context, 1);
        C8821 c88213 = new C8821(context, 2);
        C8821 c88214 = new C8821(context, 3);
        C8821 c88215 = new C8821(context, 4);
        boolean z3 = i3 >= 34;
        if (z) {
            if (!z3) {
                long j = ((C1599) c88215.invoke(600)).f4700;
                long jM10014 = m10014(j, 6.0d);
                long jM100142 = m10014(j, 12.0d);
                long jM100143 = m10014(j, 17.0d);
                long jM100144 = m10014(j, 22.0d);
                long j2 = ((C1599) c88215.invoke(100)).f4700;
                C8829 c88293 = new C8829(((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(800)).f4700, ((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(800)).f4700, AbstractC1581.m2880(4289930782L), AbstractC1581.m2880(4294967295L), AbstractC1581.m2880(4287372568L), AbstractC1581.m2880(4294565596L), ((C1599) c8821.invoke(700)).f4700, ((C1599) c8821.invoke(100)).f4700, ((C1599) c88212.invoke(200)).f4700, ((C1599) c88212.invoke(800)).f4700, ((C1599) c88212.invoke(700)).f4700, ((C1599) c88212.invoke(100)).f4700, ((C1599) c88213.invoke(700)).f4700, ((C1599) c88213.invoke(100)).f4700, jM10014, j2, jM10014, j2, ((C1599) c88215.invoke(700)).f4700, jM100142, jM100143, jM100144, ((C1599) c88215.invoke(400)).f4700, ((C1599) c88215.invoke(700)).f4700, ((C1599) c88215.invoke(200)).f4700);
                z2 = z;
                c8829 = c88293;
                C8825 c8825M11753 = AbstractC6253.m11753(c8829, z2);
                c1324.m2377(false);
                return c8825M11753;
            }
            c88292 = new C8829(((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(800)).f4700, ((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(800)).f4700, AbstractC1581.m2880(4289930782L), AbstractC1581.m2880(4294967295L), AbstractC1581.m2880(4287372568L), AbstractC1581.m2880(4294565596L), ((C1599) c8821.invoke(700)).f4700, ((C1599) c8821.invoke(100)).f4700, ((C1599) c88212.invoke(200)).f4700, ((C1599) c88212.invoke(800)).f4700, ((C1599) c88212.invoke(700)).f4700, ((C1599) c88212.invoke(100)).f4700, ((C1599) c88213.invoke(700)).f4700, ((C1599) c88213.invoke(100)).f4700, m10014(((C1599) c88214.invoke(10)).f4700, 6.0d), m10014(((C1599) c88214.invoke(10)).f4700, 90.0d), m10014(((C1599) c88214.invoke(10)).f4700, 6.0d), m10014(((C1599) c88214.invoke(10)).f4700, 90.0d), m10014(((C1599) c88215.invoke(700)).f4700, 30.0d), m10014(((C1599) c88214.invoke(10)).f4700, 12.0d), m10014(((C1599) c88214.invoke(10)).f4700, 17.0d), m10014(((C1599) c88214.invoke(10)).f4700, 22.0d), m10014(((C1599) c88215.invoke(700)).f4700, 60.0d), m10014(((C1599) c88215.invoke(700)).f4700, 30.0d), m10014(((C1599) c88215.invoke(700)).f4700, 80.0d));
        } else if (z3) {
            c88292 = new C8829(((C1599) c8821.invoke(600)).f4700, ((C1599) c8821.invoke(0)).f4700, ((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(0)).f4700, AbstractC1581.m2880(4289930782L), AbstractC1581.m2880(4294967295L), AbstractC1581.m2880(4294565596L), AbstractC1581.m2880(4282453515L), ((C1599) c8821.invoke(100)).f4700, ((C1599) c8821.invoke(numValueOf)).f4700, ((C1599) c88212.invoke(600)).f4700, ((C1599) c88212.invoke(0)).f4700, ((C1599) c88212.invoke(100)).f4700, ((C1599) c88212.invoke(numValueOf)).f4700, ((C1599) c88213.invoke(100)).f4700, ((C1599) c88213.invoke(numValueOf)).f4700, m10014(((C1599) c88214.invoke(100)).f4700, 98.0d), m10014(((C1599) c88214.invoke(100)).f4700, 10.0d), m10014(((C1599) c88214.invoke(100)).f4700, 98.0d), m10014(((C1599) c88214.invoke(100)).f4700, 10.0d), m10014(((C1599) c88215.invoke(200)).f4700, 90.0d), m10014(((C1599) c88214.invoke(100)).f4700, 94.0d), m10014(((C1599) c88214.invoke(100)).f4700, 92.0d), m10014(((C1599) c88214.invoke(100)).f4700, 90.0d), m10014(((C1599) c88215.invoke(200)).f4700, 50.0d), m10014(((C1599) c88215.invoke(200)).f4700, 80.0d), m10014(((C1599) c88215.invoke(200)).f4700, 30.0d));
        } else {
            long j3 = ((C1599) c88215.invoke(600)).f4700;
            long jM100145 = m10014(j3, 98.0d);
            long jM100146 = m10014(j3, 94.0d);
            long jM100147 = m10014(j3, 92.0d);
            long j4 = ((C1599) c88215.invoke(numValueOf)).f4700;
            c88292 = new C8829(((C1599) c8821.invoke(600)).f4700, ((C1599) c8821.invoke(0)).f4700, ((C1599) c8821.invoke(200)).f4700, ((C1599) c8821.invoke(0)).f4700, AbstractC1581.m2880(4289930782L), AbstractC1581.m2880(4294967295L), AbstractC1581.m2880(4294565596L), AbstractC1581.m2880(4282453515L), ((C1599) c8821.invoke(100)).f4700, ((C1599) c8821.invoke(numValueOf)).f4700, ((C1599) c88212.invoke(600)).f4700, ((C1599) c88212.invoke(0)).f4700, ((C1599) c88212.invoke(100)).f4700, ((C1599) c88212.invoke(numValueOf)).f4700, ((C1599) c88213.invoke(100)).f4700, ((C1599) c88213.invoke(numValueOf)).f4700, jM100145, j4, jM100145, j4, ((C1599) c88215.invoke(100)).f4700, jM100146, jM100147, ((C1599) c88215.invoke(100)).f4700, ((C1599) c88215.invoke(500)).f4700, ((C1599) c88215.invoke(200)).f4700, ((C1599) c88215.invoke(700)).f4700);
        }
        z2 = z;
        c8829 = c88292;
        C8825 c8825M117532 = AbstractC6253.m11753(c8829, z2);
        c1324.m2377(false);
        return c8825M117532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m10032(AbstractC4953 abstractC4953) {
        return !AbstractC4917.m9844(abstractC4953.mo9949().mo9942().getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.AbstractC6494 m10033(kotlin.reflect.jvm.internal.AbstractC4953 r5, boolean r6, java.lang.reflect.Field r7) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5062.m10033(kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, boolean, java.lang.reflect.Field):飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m10034(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() <= 128) {
            return str;
        }
        int i = 0;
        String strSubstring = str.substring(0, 64);
        String strSubstring2 = str.substring(str.length() - 64);
        int length = str.length();
        long j = 0;
        long j2 = 0;
        while (i < length) {
            long jCharAt = str.charAt(i);
            j2 = (((j2 << 7) - j2) + (jCharAt << 1)) & 4294967295L;
            i++;
            j = (((j << 5) - j) + jCharAt) & 4294967295L;
        }
        return strSubstring + strSubstring2 + String.format("%012x", Arrays.copyOf(new Object[]{Long.valueOf((j ^ j2) & 281474976710655L)}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String m10035(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.InterfaceC6489 m10036(kotlin.reflect.jvm.internal.AbstractC4953 r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.AbstractC5062.m10036(kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10037(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final boolean m10038(InterfaceC5064 interfaceC5064) {
        interfaceC5064.getClass();
        return m10040(interfaceC5064) && interfaceC5064.mo9943().mo8879().isAnnotation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m10039(Method method, InterfaceC6190 interfaceC6190) {
        XposedBridge.hookMethod(method, new C6191(interfaceC6190, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m10040(InterfaceC5064 interfaceC5064) {
        interfaceC5064.getClass();
        return AbstractC4395.m8907(interfaceC5064.getName(), MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m10041(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final boolean m10042(InterfaceC5064 interfaceC5064) {
        interfaceC5064.getClass();
        return interfaceC5064.mo9945() != CallableReference.NO_RECEIVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m10043(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC7667.f20811;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            C5925.m11310("outXyz must have a length of 3.");
            return false;
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC7184 m10044(C7182 c7182, InterfaceC7186 interfaceC7186, Object obj) {
        c7182.getClass();
        obj.getClass();
        C1245 c1245Mo10646 = interfaceC7186.mo10646();
        InterfaceC5093 interfaceC5093 = c7182.f19169;
        InterfaceC7184 interfaceC7184M2157 = c1245Mo10646.m2157(interfaceC5093, obj);
        if (interfaceC7184M2157 != null) {
            return interfaceC7184M2157;
        }
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(obj.getClass());
        String simpleName = interfaceC5093Mo8917.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(interfaceC5093Mo8917);
        }
        AbstractC7144.m12421(simpleName, interfaceC5093);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC7184 m10045(C7182 c7182, InterfaceC7189 interfaceC7189, String str) {
        InterfaceC7184 interfaceC7184;
        c7182.getClass();
        C1245 c1245Mo10677 = interfaceC7189.mo10677();
        InterfaceC5093 interfaceC5093 = c7182.f19169;
        c1245Mo10677.getClass();
        interfaceC5093.getClass();
        Map map = (Map) ((Map) c1245Mo10677.f3617).get(interfaceC5093);
        InterfaceC7184 interfaceC71842 = map != null ? (InterfaceC7184) map.get(str) : null;
        if (!(interfaceC71842 instanceof InterfaceC7184)) {
            interfaceC71842 = null;
        }
        if (interfaceC71842 != null) {
            interfaceC7184 = interfaceC71842;
        } else {
            Object obj = ((Map) c1245Mo10677.f3619).get(interfaceC5093);
            InterfaceC6558 interfaceC6558 = AbstractC4388.m8894(1, obj) ? (InterfaceC6558) obj : null;
            interfaceC7184 = interfaceC6558 != null ? (InterfaceC7184) interfaceC6558.invoke(str) : null;
        }
        if (interfaceC7184 != null) {
            return interfaceC7184;
        }
        AbstractC7144.m12421(str, interfaceC5093);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Integer m10046(Context context, int i) {
        TypedValue typedValueM12040 = AbstractC6561.m12040(context.getTheme(), i);
        if (typedValueM12040 != null) {
            return Integer.valueOf(m10026(context, typedValueM12040));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m10047(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2171.m3954(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C5728 m10048(DexKitBridge dexKitBridge, C8941 c8941) {
        dexKitBridge.getClass();
        int iM7289 = c8941.m7289(10);
        int i = iM7289 != 0 ? c8941.f10854.getInt(iM7289 + c8941.f10855) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM72892 = c8941.m7289(4);
        int i3 = iM72892 != 0 ? c8941.f10854.getInt(iM72892 + c8941.f10855) : 0;
        int iM72893 = c8941.m7289(6);
        int i4 = iM72893 != 0 ? c8941.f10854.getInt(iM72893 + c8941.f10855) : 0;
        int iM72894 = c8941.m7289(8);
        int i5 = iM72894 != 0 ? c8941.f10854.getInt(iM72894 + c8941.f10855) : 0;
        int iM72895 = c8941.m7289(12);
        String strM7287 = iM72895 != 0 ? c8941.m7287(iM72895 + c8941.f10855) : null;
        if (strM7287 == null) {
            strM7287 = "";
        }
        String str = strM7287;
        int iM72896 = c8941.m7289(14);
        int i6 = iM72896 != 0 ? c8941.f10854.getInt(iM72896 + c8941.f10855) : 0;
        ArrayList arrayList = new ArrayList();
        int iM72897 = c8941.m7289(16);
        int iM7285 = iM72897 != 0 ? c8941.m7285(iM72897) : 0;
        for (int i7 = 0; i7 < iM7285; i7++) {
            int iM72898 = c8941.m7289(16);
            arrayList.add(Integer.valueOf(iM72898 != 0 ? c8941.f10854.getInt((i7 * 4) + c8941.m7286(iM72898)) : 0));
        }
        return new C5728(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object m10049(InterfaceC5064 interfaceC5064) {
        Class clsM1144;
        interfaceC5064.getClass();
        Object objMo9945 = interfaceC5064.mo9945();
        if (!(interfaceC5064 instanceof InterfaceC5075) || !AbstractC0455.m1147((InterfaceC5075) interfaceC5064)) {
            Iterator it = interfaceC5064.mo9961().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next = it.next();
                    if (((InterfaceC5108) next).getKind() != KParameter$Kind.VALUE) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            InterfaceC5108 interfaceC5108 = (InterfaceC5108) obj;
            InterfaceC5087 type = interfaceC5108 != null ? interfaceC5108.getType() : null;
            if (type != null && (clsM1144 = AbstractC0455.m1144(type)) != null) {
                return AbstractC0455.m1170(clsM1144, interfaceC5064).invoke(objMo9945, null);
            }
        }
        return objMo9945;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m10050(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            C6263.m11778(AbstractC8405.m13972(21), file.getAbsolutePath());
        } else if (file.isDirectory()) {
            C6263.m11778(AbstractC8405.m13972(22), file.getAbsolutePath());
        } else {
            m10051(new File(str2), new FileInputStream(file));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m10051(File file, InputStream inputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.createNewFile()) {
                C6263.m11778(AbstractC8405.m13972(24), file.getAbsolutePath());
                return;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m10052(File file) {
        try {
            if (file.isFile()) {
                file.delete();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m10052(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            file.delete();
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4490 m10053(ProtoBuf$Visibility protoBuf$Visibility) {
        switch (protoBuf$Visibility == null ? -1 : AbstractC4805.f14011[protoBuf$Visibility.ordinal()]) {
            case 1:
                C4490 c4490 = AbstractC4489.f13117;
                c4490.getClass();
                return c4490;
            case 2:
                C4490 c44902 = AbstractC4489.f13120;
                c44902.getClass();
                return c44902;
            case 3:
                C4490 c44903 = AbstractC4489.f13119;
                c44903.getClass();
                return c44903;
            case 4:
                C4490 c44904 = AbstractC4489.f13118;
                c44904.getClass();
                return c44904;
            case 5:
                C4490 c44905 = AbstractC4489.f13116;
                c44905.getClass();
                return c44905;
            case 6:
                C4490 c44906 = AbstractC4489.f13115;
                c44906.getClass();
                return c44906;
            default:
                C4490 c44907 = AbstractC4489.f13120;
                c44907.getClass();
                return c44907;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m10054(File file, InputStream inputStream) throws IOException {
        BufferedWriter bufferedWriter;
        if (file == null) {
            C5925.m11307(AbstractC8405.m13972(23));
            return;
        }
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.createNewFile()) {
                C6263.m11778(AbstractC8405.m13972(24), file.getAbsolutePath());
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
            } finally {
            }
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                } finally {
                }
            }
            if (sb.length() > 1) {
                sb.deleteCharAt(sb.length() - 1);
            }
            bufferedWriter.write(sb.toString());
            bufferedWriter.close();
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m10055(InterfaceC5087 interfaceC5087) {
        Class clsM6756 = AbstractC3057.m6756(AbstractC5081.m10092(interfaceC5087));
        if (clsM6756.isArray()) {
            Object objNewInstance = Array.newInstance(clsM6756.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsM6756.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m10056(String str, String str2, boolean z) {
        File file = new File(str);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, z), StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(str2);
                bufferedWriter.close();
            } finally {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract C3762 mo10057(Activity activity);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract int mo10058(boolean z);
}
