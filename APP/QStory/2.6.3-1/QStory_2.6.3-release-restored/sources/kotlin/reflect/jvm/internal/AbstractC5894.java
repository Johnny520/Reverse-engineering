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
import androidx.activity.AbstractC0900;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2080;
import androidx.core.os.AbstractC3004;
import androidx.core.os.AbstractC3006;
import androidx.core.widget.AbstractC3124;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3889;
import com.google.protobuf.DescriptorProtos$Edition;
import com.kongzue.dialogx.util.views.C4594;
import de.robv.android.xposed.XposedBridge;
import io.ktor.util.C5043;
import io.ktor.util.internal.C5021;
import io.ktor.util.internal.C5022;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5291;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5302;
import kotlin.reflect.jvm.internal.impl.descriptors.C5315;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5637;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C6558;
import p026.C7020;
import p026.InterfaceC7019;
import p034.AbstractC7082;
import p035.C7092;
import p050.AbstractC7173;
import p063.AbstractC7323;
import p063.C7324;
import p063.C7326;
import p063.C7327;
import p063.C7328;
import p063.C7329;
import p063.C7330;
import p063.C7331;
import p063.C7332;
import p063.C7334;
import p063.C7335;
import p063.C7338;
import p063.C7339;
import p063.C7340;
import p063.InterfaceC7318;
import p065.AbstractC7355;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p082.AbstractC7699;
import p082.AbstractC7708;
import p083.C7715;
import p083.C7722;
import p086.InterfaceC7737;
import p095.AbstractC7818;
import p103.AbstractC7973;
import p105.C8011;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8018;
import p180.AbstractC8496;
import p210.C8661;
import p210.C8662;
import p221.C8728;
import p221.C8730;
import p221.InterfaceC8725;
import p279.AbstractC9085;
import p279.C9084;
import p360.AbstractC9655;
import p360.C9650;
import p360.C9654;
import p360.C9658;
import p360.C9661;
import p380.C9770;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5894 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final C5022 m10569(Object obj) {
        obj.getClass();
        C5021 c5021 = obj instanceof C5021 ? (C5021) obj : null;
        return c5021 != null ? c5021.f13001 : (C5022) obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m10570(String str, byte[] bArr) {
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
            C6755.m11872(e2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final long m10571(Context context, int i) {
        return AbstractC2416.m3442(context.getResources().getColor(i, context.getTheme()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m10572(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final long m10573(long j, double d) {
        C9084 c9084 = new C9084(AbstractC2416.m3433(j));
        return AbstractC2416.m3442(AbstractC9085.m14382(c9084.f23201, c9084.f23200, d).f23202);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final String m10574(String str) {
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
    public static final void m10575(Spannable spannable, C8661 c8661, int i, int i2) {
        if (c8661 != null) {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c8661, 10));
            Iterator it = c8661.f21719.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8662) it.next()).f21720);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static void m10576(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC3124.m4864(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m10577(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC2416.m3433(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final float m10578(long j, float f, InterfaceC8725 interfaceC8725) {
        float fM13902;
        long jM13903 = C8728.m13903(j);
        if (C8730.m13905(jM13903, 4294967296L)) {
            if (interfaceC8725.mo1817() <= 1.05d) {
                return interfaceC8725.mo1895(j);
            }
            fM13902 = C8728.m13902(j) / C8728.m13902(interfaceC8725.mo1894(f));
        } else {
            if (!C8730.m13905(jM13903, 8589934592L)) {
                return Float.NaN;
            }
            fM13902 = C8728.m13902(j);
        }
        return fM13902 * f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m10579(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC3006.m4516(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            AbstractC3006.m4516(editorInfo, charSequence);
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
            m10572(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            m10572(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m10572(editorInfo, charSequence, i4, i2);
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
        m10572(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + iMin2), charSequence.subSequence(i2, iMin + i2)) : charSequence.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m10580(Spannable spannable, long j, InterfaceC8725 interfaceC8725, int i, int i2) {
        long jM13903 = C8728.m13903(j);
        if (C8730.m13905(jM13903, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC7390.m12617(interfaceC8725.mo1895(j)), false), i, i2, 33);
        } else if (C8730.m13905(jM13903, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C8728.m13902(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final CallableMemberDescriptor$Kind m10581(ProtoBuf$MemberKind protoBuf$MemberKind) {
        int i = protoBuf$MemberKind == null ? -1 : AbstractC5637.f14357[protoBuf$MemberKind.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? CallableMemberDescriptor$Kind.DECLARATION : CallableMemberDescriptor$Kind.SYNTHESIZED : CallableMemberDescriptor$Kind.DELEGATION : CallableMemberDescriptor$Kind.FAKE_OVERRIDE : CallableMemberDescriptor$Kind.DECLARATION;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ThemePaletteStyle m10582(String str) {
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
    public static int m10583(int i, float f, int i2) {
        return AbstractC8496.m13534(AbstractC8496.m13532(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m10584(int i, String str) {
        char cCharAt = str.charAt(i);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static int m10585(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final boolean m10586(AbstractC5714 abstractC5714) {
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        if (interfaceC5309Mo9770 != null) {
            if (AbstractC7708.m12715(interfaceC5309Mo9770) && AbstractC7708.m12714(interfaceC5309Mo9770) && !AbstractC5605.m10064((AbstractC7818) interfaceC5309Mo9770).equals(AbstractC7355.f18195)) {
                return true;
            }
            InterfaceC5309 interfaceC5309Mo97702 = abstractC5714.mo10281().mo9770();
            if (interfaceC5309Mo97702 != null && (interfaceC5309Mo97702 instanceof AbstractC7818) && (((AbstractC7818) interfaceC5309Mo97702).mo9579() instanceof C5302) && !AbstractC5749.m10403(abstractC5714)) {
                return true;
            }
        }
        InterfaceC5309 interfaceC5309Mo97703 = abstractC5714.mo10281().mo9770();
        InterfaceC5295 interfaceC5295 = interfaceC5309Mo97703 instanceof InterfaceC5295 ? (InterfaceC5295) interfaceC5309Mo97703 : null;
        return interfaceC5295 != null && m10586(AbstractC3738.m6859(interfaceC5295));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static String m10587(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            C7092.m12337("path No exists :", file.getAbsolutePath());
            return null;
        }
        if (file.isDirectory()) {
            C7092.m12337("Non-file type :", file.getAbsolutePath());
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
                sb.append("\n");
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
    public static byte[] m10588(File file) {
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
            C6755.m11872(e2);
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
            C6755.m11872(e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final void m10589(C2070 c2070, InterfaceC2191 interfaceC2191, int i) {
        while (true) {
            int i2 = c2070.f3920;
            if (i > i2 && i < c2070.f3919) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            c2070.m2661();
            if (c2070.m2666(c2070.f3920)) {
                interfaceC2191.mo1506();
            }
            c2070.m2695();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C9654 m10590(boolean z, InterfaceC2208 interfaceC2208) {
        boolean z2;
        C9658 c9658;
        C9658 c96582;
        long jM10571;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2952(1238673096);
        Context context = (Context) c2159.m2943(AbstractC2670.f5681);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 33) {
            C9661 c9661 = null;
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "theme_customization_overlay_packages");
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("android.theme.customization.system_palette", "");
                    strOptString.getClass();
                    if (AbstractC5976.m10731(strOptString)) {
                        jM10571 = m10571(context, R.color.system_accent1_500);
                    } else {
                        if (!AbstractC5971.m10698(strOptString, "#", false)) {
                            strOptString = "#".concat(strOptString);
                        }
                        jM10571 = AbstractC2416.m3442(Color.parseColor(strOptString));
                    }
                    String strOptString2 = jSONObject.optString("android.theme.customization.theme_style", "TONAL_SPOT");
                    strOptString2.getClass();
                    c9661 = new C9661(jM10571, m10582(strOptString2), i >= 36 ? ThemeColorSpec.Spec2025 : ThemeColorSpec.Spec2021);
                }
            } catch (Exception unused) {
            }
            Log.d("DynamicColors", "System palette info: " + c9661);
            if (c9661 != null) {
                C9654 c9654M15046 = AbstractC9655.m15046(c9661.f25265, c9661.f25263, c9661.f25264, z);
                c2159.m2937(false);
                return c9654M15046;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            C2169 c2169 = AbstractC9655.f25231;
            C9654 c9654M150462 = AbstractC9655.m15046(AbstractC2416.m3440(4284960932L), ThemeColorSpec.Spec2021, ThemePaletteStyle.TonalSpot, z);
            c2159.m2937(false);
            return c9654M150462;
        }
        Integer numValueOf = Integer.valueOf(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        C9650 c9650 = new C9650(context, i2);
        C9650 c96502 = new C9650(context, 1);
        C9650 c96503 = new C9650(context, 2);
        C9650 c96504 = new C9650(context, 3);
        C9650 c96505 = new C9650(context, 4);
        boolean z3 = i3 >= 34;
        if (z) {
            if (!z3) {
                long j = ((C2434) c96505.invoke(600)).f5045;
                long jM10573 = m10573(j, 6.0d);
                long jM105732 = m10573(j, 12.0d);
                long jM105733 = m10573(j, 17.0d);
                long jM105734 = m10573(j, 22.0d);
                long j2 = ((C2434) c96505.invoke(100)).f5045;
                C9658 c96583 = new C9658(((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(800)).f5045, ((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(800)).f5045, AbstractC2416.m3440(4289930782L), AbstractC2416.m3440(4294967295L), AbstractC2416.m3440(4287372568L), AbstractC2416.m3440(4294565596L), ((C2434) c9650.invoke(700)).f5045, ((C2434) c9650.invoke(100)).f5045, ((C2434) c96502.invoke(200)).f5045, ((C2434) c96502.invoke(800)).f5045, ((C2434) c96502.invoke(700)).f5045, ((C2434) c96502.invoke(100)).f5045, ((C2434) c96503.invoke(700)).f5045, ((C2434) c96503.invoke(100)).f5045, jM10573, j2, jM10573, j2, ((C2434) c96505.invoke(700)).f5045, jM105732, jM105733, jM105734, ((C2434) c96505.invoke(400)).f5045, ((C2434) c96505.invoke(700)).f5045, ((C2434) c96505.invoke(200)).f5045);
                z2 = z;
                c9658 = c96583;
                C9654 c9654M12312 = AbstractC7082.m12312(c9658, z2);
                c2159.m2937(false);
                return c9654M12312;
            }
            c96582 = new C9658(((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(800)).f5045, ((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(800)).f5045, AbstractC2416.m3440(4289930782L), AbstractC2416.m3440(4294967295L), AbstractC2416.m3440(4287372568L), AbstractC2416.m3440(4294565596L), ((C2434) c9650.invoke(700)).f5045, ((C2434) c9650.invoke(100)).f5045, ((C2434) c96502.invoke(200)).f5045, ((C2434) c96502.invoke(800)).f5045, ((C2434) c96502.invoke(700)).f5045, ((C2434) c96502.invoke(100)).f5045, ((C2434) c96503.invoke(700)).f5045, ((C2434) c96503.invoke(100)).f5045, m10573(((C2434) c96504.invoke(10)).f5045, 6.0d), m10573(((C2434) c96504.invoke(10)).f5045, 90.0d), m10573(((C2434) c96504.invoke(10)).f5045, 6.0d), m10573(((C2434) c96504.invoke(10)).f5045, 90.0d), m10573(((C2434) c96505.invoke(700)).f5045, 30.0d), m10573(((C2434) c96504.invoke(10)).f5045, 12.0d), m10573(((C2434) c96504.invoke(10)).f5045, 17.0d), m10573(((C2434) c96504.invoke(10)).f5045, 22.0d), m10573(((C2434) c96505.invoke(700)).f5045, 60.0d), m10573(((C2434) c96505.invoke(700)).f5045, 30.0d), m10573(((C2434) c96505.invoke(700)).f5045, 80.0d));
        } else if (z3) {
            c96582 = new C9658(((C2434) c9650.invoke(600)).f5045, ((C2434) c9650.invoke(0)).f5045, ((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(0)).f5045, AbstractC2416.m3440(4289930782L), AbstractC2416.m3440(4294967295L), AbstractC2416.m3440(4294565596L), AbstractC2416.m3440(4282453515L), ((C2434) c9650.invoke(100)).f5045, ((C2434) c9650.invoke(numValueOf)).f5045, ((C2434) c96502.invoke(600)).f5045, ((C2434) c96502.invoke(0)).f5045, ((C2434) c96502.invoke(100)).f5045, ((C2434) c96502.invoke(numValueOf)).f5045, ((C2434) c96503.invoke(100)).f5045, ((C2434) c96503.invoke(numValueOf)).f5045, m10573(((C2434) c96504.invoke(100)).f5045, 98.0d), m10573(((C2434) c96504.invoke(100)).f5045, 10.0d), m10573(((C2434) c96504.invoke(100)).f5045, 98.0d), m10573(((C2434) c96504.invoke(100)).f5045, 10.0d), m10573(((C2434) c96505.invoke(200)).f5045, 90.0d), m10573(((C2434) c96504.invoke(100)).f5045, 94.0d), m10573(((C2434) c96504.invoke(100)).f5045, 92.0d), m10573(((C2434) c96504.invoke(100)).f5045, 90.0d), m10573(((C2434) c96505.invoke(200)).f5045, 50.0d), m10573(((C2434) c96505.invoke(200)).f5045, 80.0d), m10573(((C2434) c96505.invoke(200)).f5045, 30.0d));
        } else {
            long j3 = ((C2434) c96505.invoke(600)).f5045;
            long jM105735 = m10573(j3, 98.0d);
            long jM105736 = m10573(j3, 94.0d);
            long jM105737 = m10573(j3, 92.0d);
            long j4 = ((C2434) c96505.invoke(numValueOf)).f5045;
            c96582 = new C9658(((C2434) c9650.invoke(600)).f5045, ((C2434) c9650.invoke(0)).f5045, ((C2434) c9650.invoke(200)).f5045, ((C2434) c9650.invoke(0)).f5045, AbstractC2416.m3440(4289930782L), AbstractC2416.m3440(4294967295L), AbstractC2416.m3440(4294565596L), AbstractC2416.m3440(4282453515L), ((C2434) c9650.invoke(100)).f5045, ((C2434) c9650.invoke(numValueOf)).f5045, ((C2434) c96502.invoke(600)).f5045, ((C2434) c96502.invoke(0)).f5045, ((C2434) c96502.invoke(100)).f5045, ((C2434) c96502.invoke(numValueOf)).f5045, ((C2434) c96503.invoke(100)).f5045, ((C2434) c96503.invoke(numValueOf)).f5045, jM105735, j4, jM105735, j4, ((C2434) c96505.invoke(100)).f5045, jM105736, jM105737, ((C2434) c96505.invoke(100)).f5045, ((C2434) c96505.invoke(500)).f5045, ((C2434) c96505.invoke(200)).f5045, ((C2434) c96505.invoke(700)).f5045);
        }
        z2 = z;
        c9658 = c96582;
        C9654 c9654M123122 = AbstractC7082.m12312(c9658, z2);
        c2159.m2937(false);
        return c9654M123122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m10591(AbstractC5785 abstractC5785) {
        return !AbstractC5749.m10403(abstractC5785.mo10508().mo10501().getType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC7323 m10592(AbstractC5785 abstractC5785, boolean z, Field field) {
        InterfaceC5305 interfaceC5305M10496 = abstractC5785.mo10508().mo10501();
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5305M10496.mo9587();
        interfaceC5331Mo9587.getClass();
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (AbstractC7699.m12674(interfaceC5331Mo9587)) {
            InterfaceC5331 interfaceC5331Mo95872 = interfaceC5331Mo9587.mo9587();
            if ((AbstractC7699.m12675(interfaceC5331Mo95872, ClassKind.INTERFACE) || AbstractC7699.m12675(interfaceC5331Mo95872, ClassKind.ANNOTATION_CLASS)) && (!(interfaceC5305M10496 instanceof C5625) || !C7722.m12727(((C5625) interfaceC5305M10496).f14312))) {
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (abstractC5785.mo10508().mo10501().getAnnotations().mo10077(AbstractC5899.f14953)) {
                return z ? m10601(abstractC5785) ? new C7339(field, false) : new C7340(field, c4 == true ? 1 : 0, c3 == true ? 1 : 0) : m10601(abstractC5785) ? new C7330(field, m10591(abstractC5785), false) : new C7329(field, m10591(abstractC5785), c2 == true ? 1 : 0, c == true ? 1 : 0);
            }
            int i2 = 2;
            return z ? new C7340(field, objArr2 == true ? 1 : 0, i2) : new C7329(field, m10591(abstractC5785), objArr == true ? 1 : 0, i2);
        }
        return z ? m10601(abstractC5785) ? new C7335(field, m10608(abstractC5785.mo10508())) : new C7340(field, z2, i) : m10601(abstractC5785) ? new C7338(field, m10591(abstractC5785), m10608(abstractC5785.mo10508())) : new C7329(field, m10591(abstractC5785), c5 == true ? 1 : 0, objArr3 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String m10593(String str) {
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
    public static final String m10594(String str) {
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
    */
    public static final InterfaceC7318 m10595(AbstractC5785 abstractC5785, boolean z) {
        C5868 c5868;
        Method method;
        InterfaceC7318 c7334;
        JvmProtoBuf$JvmMethodSignature setter;
        Method methodM10536;
        InterfaceC7318 c7332;
        AbstractC7818 abstractC7818;
        if (AbstractC5835.f14767.matches(abstractC5785.mo10508().f14652)) {
            return C7326.f18149;
        }
        C5520 c5520 = AbstractC5900.f14954;
        AbstractC7173 abstractC7173M10639 = AbstractC5900.m10639(abstractC5785.mo10508().mo10501());
        int i = 6;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Class clsM10631 = null;
        if (abstractC7173M10639 instanceof C5881) {
            C5881 c5881 = (C5881) abstractC7173M10639;
            InterfaceC7737 interfaceC7737 = c5881.f14912;
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = c5881.f14913;
            if (z) {
                setter = jvmProtoBuf$JvmPropertySignature.hasGetter() ? jvmProtoBuf$JvmPropertySignature.getGetter() : null;
                methodM10536 = setter == null ? abstractC5785.mo10508().f14653.m10536(interfaceC7737.getString(setter.getName()), interfaceC7737.getString(setter.getDesc())) : null;
                if (methodM10536 != null) {
                    InterfaceC5305 interfaceC5305M10496 = abstractC5785.mo10508().mo10501();
                    int i3 = AbstractC7708.f18668;
                    if (interfaceC5305M10496.mo9591() == null && interfaceC5305M10496.mo9596().isEmpty()) {
                        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5305M10496.mo9587();
                        AbstractC7818 abstractC78182 = interfaceC5331Mo9587 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331Mo9587 : null;
                        if (abstractC78182 != null) {
                            int i4 = AbstractC5605.f14254;
                            AbstractC5291 abstractC5291Mo9579 = abstractC78182.mo9579();
                            C5315 c5315 = abstractC5291Mo9579 instanceof C5315 ? (C5315) abstractC5291Mo9579 : null;
                            C5523 c5523 = c5315 != null ? c5315.f13457 : null;
                            if (AbstractC5227.m9466(c5523, interfaceC5305M10496.getName()) && AbstractC5227.m9466(abstractC5785.mo10508().mo10501().getVisibility(), AbstractC5321.f13462)) {
                                InterfaceC5331 interfaceC5331Mo95872 = abstractC5785.mo10508().mo10501().mo9587();
                                if ((interfaceC5331Mo95872 instanceof AbstractC7818) && AbstractC7708.m12715(interfaceC5331Mo95872) && (clsM10631 = AbstractC5899.m10631((abstractC7818 = (AbstractC7818) interfaceC5331Mo95872))) == null) {
                                    StringBuilder sb = new StringBuilder("Class object for the class ");
                                    sb.append(abstractC7818.getName());
                                    C5520 c5520M10057 = AbstractC5605.m10057((InterfaceC5309) interfaceC5331Mo95872);
                                    sb.append(" cannot be found (classId=");
                                    sb.append(c5520M10057);
                                    sb.append(')');
                                    throw new KotlinReflectionInternalError(sb.toString());
                                }
                                if (clsM10631 == null) {
                                    throw new KotlinReflectionInternalError("Underlying property of inline class " + abstractC5785.mo10508() + " should have a field");
                                }
                                Method methodM1730 = AbstractC1298.m1730(clsM10631, abstractC5785.mo10508());
                                c7334 = m10601(abstractC5785) ? new C7327(methodM1730, m10608(abstractC5785.mo10508())) : new C7328(methodM1730);
                            }
                        }
                    } else {
                        Field fieldMo10499 = abstractC5785.mo10508().mo10499();
                        if (fieldMo10499 == null) {
                            C5043.m9153(abstractC5785.mo10508(), "No accessors or field is found for property ");
                            return null;
                        }
                        c7334 = m10592(abstractC5785, z, fieldMo10499);
                    }
                } else {
                    if (!Modifier.isStatic(methodM10536.getModifiers())) {
                        c7332 = m10601(abstractC5785) ? new C7334(methodM10536, m10608(abstractC5785.mo10508())) : new C7324(i, i2, methodM10536, objArr7 == true ? 1 : 0);
                    } else if (abstractC5785.mo10508().mo10501().getAnnotations().mo10077(AbstractC5899.f14953)) {
                        int i5 = 4;
                        c7332 = m10601(abstractC5785) ? new C7331(methodM10536, objArr6 == true ? 1 : 0, i5) : new C7324(i5, 1, methodM10536, 1 == true ? 1 : 0);
                    } else {
                        c7332 = m10601(abstractC5785) ? new C7332(methodM10536, false, m10608(abstractC5785.mo10508())) : new C7324(i, 2, methodM10536, objArr5 == true ? 1 : 0);
                    }
                    c7334 = c7332;
                }
            } else {
                if (jvmProtoBuf$JvmPropertySignature.hasSetter()) {
                    setter = jvmProtoBuf$JvmPropertySignature.getSetter();
                }
                if (setter == null) {
                }
                if (methodM10536 != null) {
                }
            }
        } else if (abstractC7173M10639 instanceof C5884) {
            c7334 = m10592(abstractC5785, z, ((C5884) abstractC7173M10639).f14929);
        } else {
            if (!(abstractC7173M10639 instanceof C5885)) {
                if (!(abstractC7173M10639 instanceof C5880)) {
                    C5043.m9170();
                    return null;
                }
                if (z) {
                    c5868 = ((C5880) abstractC7173M10639).f14910;
                } else {
                    c5868 = ((C5880) abstractC7173M10639).f14909;
                    if (c5868 == null) {
                        C5043.m9153(abstractC5785.mo10508(), "No setter found for property ");
                        return null;
                    }
                }
                AbstractC5835 abstractC5835 = abstractC5785.mo10508().f14653;
                C7715 c7715 = c5868.f14866;
                Method methodM105362 = abstractC5835.m10536(c7715.f18679, c7715.f18678);
                if (methodM105362 != null) {
                    Modifier.isStatic(methodM105362.getModifiers());
                    return m10601(abstractC5785) ? new C7334(methodM105362, m10608(abstractC5785.mo10508())) : new C7324(i, objArr2 == true ? 1 : 0, methodM105362, objArr == true ? 1 : 0);
                }
                C5043.m9153(abstractC5785.mo10508(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((C5885) abstractC7173M10639).f14931;
            } else {
                C5885 c5885 = (C5885) abstractC7173M10639;
                method = c5885.f14930;
                if (method == null) {
                    C5043.m9153(c5885.f14931, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            c7334 = m10601(abstractC5785) ? new C7334(method, m10608(abstractC5785.mo10508())) : new C7324(i, objArr4 == true ? 1 : 0, method, objArr3 == true ? 1 : 0);
        }
        return AbstractC1298.m1738(EmptyList.INSTANCE, abstractC5785, c7334, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m10596(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final boolean m10597(InterfaceC5896 interfaceC5896) {
        interfaceC5896.getClass();
        return m10599(interfaceC5896) && interfaceC5896.mo10502().mo9438().isAnnotation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m10598(Method method, InterfaceC7019 interfaceC7019) {
        XposedBridge.hookMethod(method, new C7020(interfaceC7019, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final boolean m10599(InterfaceC5896 interfaceC5896) {
        interfaceC5896.getClass();
        return AbstractC5227.m9466(interfaceC5896.getName(), MethodDescription.CONSTRUCTOR_INTERNAL_NAME);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m10600(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final boolean m10601(InterfaceC5896 interfaceC5896) {
        interfaceC5896.getClass();
        return interfaceC5896.mo10504() != CallableReference.NO_RECEIVER;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static boolean m10602(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC8496.f21156;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            C6755.m11869("outXyz must have a length of 3.");
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
    public static final InterfaceC8013 m10603(C8011 c8011, InterfaceC8015 interfaceC8015, Object obj) {
        c8011.getClass();
        obj.getClass();
        C2080 c2080Mo11205 = interfaceC8015.mo11205();
        InterfaceC5925 interfaceC5925 = c8011.f19514;
        InterfaceC8013 interfaceC8013M2717 = c2080Mo11205.m2717(interfaceC5925, obj);
        if (interfaceC8013M2717 != null) {
            return interfaceC8013M2717;
        }
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(obj.getClass());
        String simpleName = interfaceC5925Mo9476.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(interfaceC5925Mo9476);
        }
        AbstractC7973.m12980(simpleName, interfaceC5925);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC8013 m10604(C8011 c8011, InterfaceC8018 interfaceC8018, String str) {
        InterfaceC8013 interfaceC8013;
        c8011.getClass();
        C2080 c2080Mo11236 = interfaceC8018.mo11236();
        InterfaceC5925 interfaceC5925 = c8011.f19514;
        c2080Mo11236.getClass();
        interfaceC5925.getClass();
        Map map = (Map) ((Map) c2080Mo11236.f3962).get(interfaceC5925);
        InterfaceC8013 interfaceC80132 = map != null ? (InterfaceC8013) map.get(str) : null;
        if (!(interfaceC80132 instanceof InterfaceC8013)) {
            interfaceC80132 = null;
        }
        if (interfaceC80132 != null) {
            interfaceC8013 = interfaceC80132;
        } else {
            Object obj = ((Map) c2080Mo11236.f3964).get(interfaceC5925);
            InterfaceC7387 interfaceC7387 = AbstractC5220.m9453(1, obj) ? (InterfaceC7387) obj : null;
            interfaceC8013 = interfaceC7387 != null ? (InterfaceC8013) interfaceC7387.invoke(str) : null;
        }
        if (interfaceC8013 != null) {
            return interfaceC8013;
        }
        AbstractC7973.m12980(str, interfaceC5925);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Integer m10605(Context context, int i) {
        TypedValue typedValueM12599 = AbstractC7390.m12599(context.getTheme(), i);
        if (typedValueM12599 != null) {
            return Integer.valueOf(m10585(context, typedValueM12599));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m10606(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC3004.m4514(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C6558 m10607(DexKitBridge dexKitBridge, C9770 c9770) {
        dexKitBridge.getClass();
        int iM7848 = c9770.m7848(10);
        int i = iM7848 != 0 ? c9770.f11199.getInt(iM7848 + c9770.f11200) : 0;
        if ((i & 131072) > 0) {
            i = (i ^ 131072) | 32;
        }
        int i2 = i;
        int iM78482 = c9770.m7848(4);
        int i3 = iM78482 != 0 ? c9770.f11199.getInt(iM78482 + c9770.f11200) : 0;
        int iM78483 = c9770.m7848(6);
        int i4 = iM78483 != 0 ? c9770.f11199.getInt(iM78483 + c9770.f11200) : 0;
        int iM78484 = c9770.m7848(8);
        int i5 = iM78484 != 0 ? c9770.f11199.getInt(iM78484 + c9770.f11200) : 0;
        int iM78485 = c9770.m7848(12);
        String strM7846 = iM78485 != 0 ? c9770.m7846(iM78485 + c9770.f11200) : null;
        if (strM7846 == null) {
            strM7846 = "";
        }
        String str = strM7846;
        int iM78486 = c9770.m7848(14);
        int i6 = iM78486 != 0 ? c9770.f11199.getInt(iM78486 + c9770.f11200) : 0;
        ArrayList arrayList = new ArrayList();
        int iM78487 = c9770.m7848(16);
        int iM7844 = iM78487 != 0 ? c9770.m7844(iM78487) : 0;
        for (int i7 = 0; i7 < iM7844; i7++) {
            int iM78488 = c9770.m7848(16);
            arrayList.add(Integer.valueOf(iM78488 != 0 ? c9770.f11199.getInt((i7 * 4) + c9770.m7845(iM78488)) : 0));
        }
        return new C6558(dexKitBridge, i3, i4, i5, i2, str, i6, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object m10608(InterfaceC5896 interfaceC5896) {
        Class clsM1704;
        interfaceC5896.getClass();
        Object objMo10504 = interfaceC5896.mo10504();
        if (!(interfaceC5896 instanceof InterfaceC5907) || !AbstractC1298.m1707((InterfaceC5907) interfaceC5896)) {
            Iterator it = interfaceC5896.mo10520().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next = it.next();
                    if (((InterfaceC5940) next).getKind() != KParameter$Kind.VALUE) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            InterfaceC5940 interfaceC5940 = (InterfaceC5940) obj;
            InterfaceC5919 type = interfaceC5940 != null ? interfaceC5940.getType() : null;
            if (type != null && (clsM1704 = AbstractC1298.m1704(type)) != null) {
                return AbstractC1298.m1730(clsM1704, interfaceC5896).invoke(objMo10504, null);
            }
        }
        return objMo10504;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m10609(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            C7092.m12337("path No exists(源文件不存在) : ", file.getAbsolutePath());
        } else if (file.isDirectory()) {
            C7092.m12337("Not a file, but a directory(不是文件) : ", file.getAbsolutePath());
        } else {
            m10610(new File(str2), new FileInputStream(file));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m10610(File file, InputStream inputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.createNewFile()) {
                C7092.m12337("create File Fail :", file.getAbsolutePath());
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
    public static void m10611(File file) {
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
                    m10611(file2);
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
    public static final C5322 m10612(ProtoBuf$Visibility protoBuf$Visibility) {
        switch (protoBuf$Visibility == null ? -1 : AbstractC5637.f14356[protoBuf$Visibility.ordinal()]) {
            case 1:
                C5322 c5322 = AbstractC5321.f13462;
                c5322.getClass();
                return c5322;
            case 2:
                C5322 c53222 = AbstractC5321.f13465;
                c53222.getClass();
                return c53222;
            case 3:
                C5322 c53223 = AbstractC5321.f13464;
                c53223.getClass();
                return c53223;
            case 4:
                C5322 c53224 = AbstractC5321.f13463;
                c53224.getClass();
                return c53224;
            case 5:
                C5322 c53225 = AbstractC5321.f13461;
                c53225.getClass();
                return c53225;
            case 6:
                C5322 c53226 = AbstractC5321.f13460;
                c53226.getClass();
                return c53226;
            default:
                C5322 c53227 = AbstractC5321.f13465;
                c53227.getClass();
                return c53227;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m10613(File file, InputStream inputStream) throws IOException {
        BufferedWriter bufferedWriter;
        if (file == null) {
            C6755.m11866("targetFile , Empty File object");
            return;
        }
        if (!file.exists()) {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.createNewFile()) {
                C7092.m12337("create File Fail :", file.getAbsolutePath());
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
                    sb.append("\n");
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
    public static final Object m10614(InterfaceC5919 interfaceC5919) {
        Class clsM7316 = AbstractC3889.m7316(AbstractC5913.m10651(interfaceC5919));
        if (clsM7316.isArray()) {
            Object objNewInstance = Array.newInstance(clsM7316.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsM7316.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m10615(String str, String str2, boolean z) {
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
    public abstract C4594 mo10616(Activity activity);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract int mo10617(boolean z);
}
