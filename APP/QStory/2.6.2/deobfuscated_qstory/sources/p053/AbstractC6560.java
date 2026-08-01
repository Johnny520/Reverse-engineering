package p053;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import android.text.InputFilter;
import android.util.Log;
import android.view.InputDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.platform.AbstractC1835;
import bsh.C2632;
import com.android.dx.cf.direct.DirectClassFile;
import com.android.dx.cf.direct.StdAttributeFactory;
import com.android.dx.command.dexer.DxContext;
import com.android.dx.dex.DexOptions;
import com.android.dx.dex.cf.CfOptions;
import com.android.dx.dex.cf.CfTranslator;
import com.android.dx.dex.file.DexFile;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.google.protobuf.DescriptorProtos$Edition;
import com.kongzue.dialogx.util.C3763;
import dalvik.system.InMemoryDexClassLoader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.InterfaceC4386;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC4952;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4513;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4514;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4519;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4520;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4521;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.renderer.AbstractC4737;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4827;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5429;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C5359;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.pool.TypePool;
import org.json.JSONObject;
import p032.AbstractC6318;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p066.C6876;
import p070.C6897;
import p079.AbstractC6988;
import p079.AbstractC7008;
import p079.C7017;
import p084.C7046;
import p175.AbstractC7738;
import p236.AbstractC8110;
import p236.C8104;
import p236.C8112;
import p236.C8117;
import p236.InterfaceC8094;
import p251.AbstractC8174;
import p263.AbstractC8255;
import p263.C8254;
import p266.C8262;
import p266.C8263;
import p305.C8632;
import p305.C8644;
import p305.C8649;
import p305.C8651;
import p312.C8667;
import p345.AbstractC8840;
import p345.C8835;
import p345.C8839;
import p345.C8843;
import p345.C8846;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: 飘花落叶言世子哲苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1543 f17940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AtomicBoolean f17941;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final int m11997(int i, int i2, String str) {
        while (i2 > i && AbstractC3056.m6673(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final int m11998(int i, int i2, String str) {
        while (i < i2 && AbstractC3056.m6673(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final Object m11999(C5359 c5359, boolean z, C5359 c53592, InterfaceC6553 interfaceC6553) throws Throwable {
        Object c5429;
        Object objM10586;
        try {
            if (interfaceC6553 instanceof BaseContinuationImpl) {
                AbstractC4387.m8898(2, interfaceC6553);
                c5429 = interfaceC6553.invoke(c53592, c5359);
            } else {
                c5429 = AbstractC3054.m6574(interfaceC6553, c53592, c5359);
            }
        } catch (DispatchException e) {
            c5359.m10585(new C5429(e.getCause(), false));
            throw e.getCause();
        } catch (Throwable th) {
            c5429 = new C5429(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c5429 == coroutineSingletons || (objM10586 = c5359.m10586(c5429)) == AbstractC5398.f15034) {
            return coroutineSingletons;
        }
        c5359.mo10381();
        if (!(objM10586 instanceof C5429)) {
            return AbstractC5398.m10476(objM10586);
        }
        if (!z) {
            Throwable th2 = ((C5429) objM10586).f15075;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == c5359) {
                if (c5429 instanceof C5429) {
                    throw ((C5429) c5429).f15075;
                }
                return c5429;
            }
        }
        throw ((C5429) objM10586).f15075;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static void m12000(View view, C8651 c8651) {
        C8667 c8667 = c8651.f24333.f24291;
        if (c8667 == null || !c8667.f24419) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        C8649 c8649 = c8651.f24333;
        if (c8649.f24300 != elevation) {
            c8649.f24300 = elevation;
            c8651.m14308();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static final long m12001(long j, double d) {
        C8254 c8254 = new C8254(AbstractC1581.m2863(j));
        return AbstractC1581.m2872(AbstractC8255.m13806(c8254.f22857, c8254.f22856, d).f22858);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final long m12002(Context context, int i) {
        return AbstractC1581.m2872(context.getResources().getColor(i, context.getTheme()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static LinkedHashSet m12003(AbstractCollection abstractCollection, Collection collection, C4690 c4690, InterfaceC4827 interfaceC4827, C6876 c6876, AbstractC6988 abstractC6988) {
        if (c4690 == null) {
            m12024(6);
            throw null;
        }
        if (collection == null) {
            m12024(7);
            throw null;
        }
        if (abstractC6988 == null) {
            m12024(9);
            throw null;
        }
        if (interfaceC4827 == null) {
            m12024(10);
            throw null;
        }
        if (c6876 != null) {
            return m12013(c4690, collection, abstractCollection, abstractC6988, interfaceC4827, c6876, true);
        }
        m12024(11);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static LinkedHashSet m12004(AbstractCollection abstractCollection, Collection collection, C4690 c4690, InterfaceC4827 interfaceC4827, C6876 c6876, AbstractC6988 abstractC6988) {
        if (c4690 == null) {
            m12024(0);
            throw null;
        }
        if (collection == null) {
            m12024(2);
            throw null;
        }
        if (abstractC6988 == null) {
            m12024(3);
            throw null;
        }
        if (interfaceC4827 == null) {
            m12024(4);
            throw null;
        }
        if (c6876 != null) {
            return m12013(c4690, abstractCollection, collection, abstractC6988, interfaceC4827, c6876, false);
        }
        m12024(5);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static long m12005(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C5919.m11249("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m12006(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C5919.m11249("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C8839 m12007(boolean z, InterfaceC1373 interfaceC1373) {
        boolean z2;
        C8843 c8843;
        C8843 c88432;
        long jM12002;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2382(1238673096);
        Context context = (Context) c1324.m2373(AbstractC1835.f5335);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i >= 33) {
            C8846 c8846 = null;
            try {
                String string = Settings.Secure.getString(context.getContentResolver(), "theme_customization_overlay_packages");
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("android.theme.customization.system_palette", "");
                    strOptString.getClass();
                    if (AbstractC5143.m10164(strOptString)) {
                        jM12002 = m12002(context, R.color.system_accent1_500);
                    } else {
                        if (!AbstractC5138.m10125(strOptString, "#", false)) {
                            strOptString = "#".concat(strOptString);
                        }
                        jM12002 = AbstractC1581.m2872(Color.parseColor(strOptString));
                    }
                    String strOptString2 = jSONObject.optString("android.theme.customization.theme_style", "TONAL_SPOT");
                    strOptString2.getClass();
                    c8846 = new C8846(jM12002, m12010(strOptString2), i >= 36 ? ThemeColorSpec.Spec2025 : ThemeColorSpec.Spec2021);
                }
            } catch (Exception unused) {
            }
            Log.d("DynamicColors", "System palette info: " + c8846);
            if (c8846 != null) {
                C8839 c8839M14476 = AbstractC8840.m14476(c8846.f24937, c8846.f24935, c8846.f24936, z);
                c1324.m2367(false);
                return c8839M14476;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            C1334 c1334 = AbstractC8840.f24903;
            C8839 c8839M144762 = AbstractC8840.m14476(AbstractC1581.m2870(4284960932L), ThemeColorSpec.Spec2021, ThemePaletteStyle.TonalSpot, z);
            c1324.m2367(false);
            return c8839M144762;
        }
        Integer numValueOf = Integer.valueOf(DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        C8835 c8835 = new C8835(context, i2);
        C8835 c88352 = new C8835(context, 1);
        C8835 c88353 = new C8835(context, 2);
        C8835 c88354 = new C8835(context, 3);
        C8835 c88355 = new C8835(context, 4);
        boolean z3 = i3 >= 34;
        if (z) {
            if (!z3) {
                long j = ((C1599) c88355.invoke(600)).f4699;
                long jM12001 = m12001(j, 6.0d);
                long jM120012 = m12001(j, 12.0d);
                long jM120013 = m12001(j, 17.0d);
                long jM120014 = m12001(j, 22.0d);
                long j2 = ((C1599) c88355.invoke(100)).f4699;
                C8843 c88433 = new C8843(((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(800)).f4699, ((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(800)).f4699, AbstractC1581.m2870(4289930782L), AbstractC1581.m2870(4294967295L), AbstractC1581.m2870(4287372568L), AbstractC1581.m2870(4294565596L), ((C1599) c8835.invoke(700)).f4699, ((C1599) c8835.invoke(100)).f4699, ((C1599) c88352.invoke(200)).f4699, ((C1599) c88352.invoke(800)).f4699, ((C1599) c88352.invoke(700)).f4699, ((C1599) c88352.invoke(100)).f4699, ((C1599) c88353.invoke(700)).f4699, ((C1599) c88353.invoke(100)).f4699, jM12001, j2, jM12001, j2, ((C1599) c88355.invoke(700)).f4699, jM120012, jM120013, jM120014, ((C1599) c88355.invoke(400)).f4699, ((C1599) c88355.invoke(700)).f4699, ((C1599) c88355.invoke(200)).f4699);
                z2 = z;
                c8843 = c88433;
                C8839 c8839M13612 = AbstractC8174.m13612(c8843, z2);
                c1324.m2367(false);
                return c8839M13612;
            }
            c88432 = new C8843(((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(800)).f4699, ((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(800)).f4699, AbstractC1581.m2870(4289930782L), AbstractC1581.m2870(4294967295L), AbstractC1581.m2870(4287372568L), AbstractC1581.m2870(4294565596L), ((C1599) c8835.invoke(700)).f4699, ((C1599) c8835.invoke(100)).f4699, ((C1599) c88352.invoke(200)).f4699, ((C1599) c88352.invoke(800)).f4699, ((C1599) c88352.invoke(700)).f4699, ((C1599) c88352.invoke(100)).f4699, ((C1599) c88353.invoke(700)).f4699, ((C1599) c88353.invoke(100)).f4699, m12001(((C1599) c88354.invoke(10)).f4699, 6.0d), m12001(((C1599) c88354.invoke(10)).f4699, 90.0d), m12001(((C1599) c88354.invoke(10)).f4699, 6.0d), m12001(((C1599) c88354.invoke(10)).f4699, 90.0d), m12001(((C1599) c88355.invoke(700)).f4699, 30.0d), m12001(((C1599) c88354.invoke(10)).f4699, 12.0d), m12001(((C1599) c88354.invoke(10)).f4699, 17.0d), m12001(((C1599) c88354.invoke(10)).f4699, 22.0d), m12001(((C1599) c88355.invoke(700)).f4699, 60.0d), m12001(((C1599) c88355.invoke(700)).f4699, 30.0d), m12001(((C1599) c88355.invoke(700)).f4699, 80.0d));
        } else if (z3) {
            c88432 = new C8843(((C1599) c8835.invoke(600)).f4699, ((C1599) c8835.invoke(0)).f4699, ((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(0)).f4699, AbstractC1581.m2870(4289930782L), AbstractC1581.m2870(4294967295L), AbstractC1581.m2870(4294565596L), AbstractC1581.m2870(4282453515L), ((C1599) c8835.invoke(100)).f4699, ((C1599) c8835.invoke(numValueOf)).f4699, ((C1599) c88352.invoke(600)).f4699, ((C1599) c88352.invoke(0)).f4699, ((C1599) c88352.invoke(100)).f4699, ((C1599) c88352.invoke(numValueOf)).f4699, ((C1599) c88353.invoke(100)).f4699, ((C1599) c88353.invoke(numValueOf)).f4699, m12001(((C1599) c88354.invoke(100)).f4699, 98.0d), m12001(((C1599) c88354.invoke(100)).f4699, 10.0d), m12001(((C1599) c88354.invoke(100)).f4699, 98.0d), m12001(((C1599) c88354.invoke(100)).f4699, 10.0d), m12001(((C1599) c88355.invoke(200)).f4699, 90.0d), m12001(((C1599) c88354.invoke(100)).f4699, 94.0d), m12001(((C1599) c88354.invoke(100)).f4699, 92.0d), m12001(((C1599) c88354.invoke(100)).f4699, 90.0d), m12001(((C1599) c88355.invoke(200)).f4699, 50.0d), m12001(((C1599) c88355.invoke(200)).f4699, 80.0d), m12001(((C1599) c88355.invoke(200)).f4699, 30.0d));
        } else {
            long j3 = ((C1599) c88355.invoke(600)).f4699;
            long jM120015 = m12001(j3, 98.0d);
            long jM120016 = m12001(j3, 94.0d);
            long jM120017 = m12001(j3, 92.0d);
            long j4 = ((C1599) c88355.invoke(numValueOf)).f4699;
            c88432 = new C8843(((C1599) c8835.invoke(600)).f4699, ((C1599) c8835.invoke(0)).f4699, ((C1599) c8835.invoke(200)).f4699, ((C1599) c8835.invoke(0)).f4699, AbstractC1581.m2870(4289930782L), AbstractC1581.m2870(4294967295L), AbstractC1581.m2870(4294565596L), AbstractC1581.m2870(4282453515L), ((C1599) c8835.invoke(100)).f4699, ((C1599) c8835.invoke(numValueOf)).f4699, ((C1599) c88352.invoke(600)).f4699, ((C1599) c88352.invoke(0)).f4699, ((C1599) c88352.invoke(100)).f4699, ((C1599) c88352.invoke(numValueOf)).f4699, ((C1599) c88353.invoke(100)).f4699, ((C1599) c88353.invoke(numValueOf)).f4699, jM120015, j4, jM120015, j4, ((C1599) c88355.invoke(100)).f4699, jM120016, jM120017, ((C1599) c88355.invoke(100)).f4699, ((C1599) c88355.invoke(500)).f4699, ((C1599) c88355.invoke(200)).f4699, ((C1599) c88355.invoke(700)).f4699);
        }
        z2 = z;
        c8843 = c88432;
        C8839 c8839M136122 = AbstractC8174.m13612(c8843, z2);
        c1324.m2367(false);
        return c8839M136122;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static InterfaceC8094 m12008(int i, int i2, String str) {
        String str2;
        int i3;
        int i4;
        int i5 = 0;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        boolean z = (i2 & 8) != 0;
        str.getClass();
        if (i > str.length() - 1) {
            InterfaceC8094.f22340.getClass();
            return C8117.f22416;
        }
        C8112 c8112 = InterfaceC8094.f22340;
        C8104 c8104 = new C8104(2);
        int length = str.length() - 1;
        if (i <= length) {
            i3 = i;
            int i6 = i3;
            i4 = -1;
            while (i5 != 1000) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == '&') {
                    str2 = str;
                    m12020(c8104, str2, i3, i4, i6, z);
                    i5++;
                    i3 = i6 + 1;
                    i4 = -1;
                } else if (cCharAt == '=' && i4 == -1) {
                    str2 = str;
                    i4 = i6;
                } else {
                    str2 = str;
                }
                if (i6 != length) {
                    i6++;
                    str = str2;
                }
            }
            return c8104.build();
        }
        str2 = str;
        i3 = i;
        i4 = -1;
        if (i5 != 1000) {
            m12020(c8104, str2, i3, i4, str2.length(), z);
        }
        return c8104.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m12009(int r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p053.AbstractC6560.m12009(int, java.lang.String):long");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final ThemePaletteStyle m12010(String str) {
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
    public static boolean m12011() {
        AtomicBoolean atomicBoolean = f17941;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        f17941 = new AtomicBoolean();
        try {
            AbstractC6318.m11838("com.tencent.mobileqq.startup.step.LoadData");
            f17941.set(false);
        } catch (Exception unused) {
            f17941.set(true);
        }
        return f17941.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m12012(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i && inputDevice.getMotionRange(0, i) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static LinkedHashSet m12013(C4690 c4690, Collection collection, Collection collection2, AbstractC6988 abstractC6988, InterfaceC4827 interfaceC4827, C6876 c6876, boolean z) {
        if (c4690 == null) {
            m12024(12);
            throw null;
        }
        if (collection == null) {
            m12024(13);
            throw null;
        }
        if (collection2 == null) {
            m12024(14);
            throw null;
        }
        if (abstractC6988 == null) {
            m12024(15);
            throw null;
        }
        if (interfaceC4827 == null) {
            m12024(16);
            throw null;
        }
        if (c6876 == null) {
            m12024(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c6876.m12125(c4690, collection, collection2, abstractC6988, new C7046(interfaceC4827, linkedHashSet, z));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final String m12014(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        if (!AbstractC5138.m10125(str, str2, false) || !AbstractC5138.m10125(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (m12042(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final String m12015(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4690 c4690 = (C4690) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m12017(c4690));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final String m12016(String str, String str2, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422, InterfaceC6557 interfaceC6557) {
        str.getClass();
        str2.getClass();
        interfaceC6557.getClass();
        String str3 = (String) interfaceC6542.invoke();
        String strM12014 = m12014(str, AbstractC0053.m136(str3, "Mutable"), str2, str3, AbstractC0053.m136(str3, "(Mutable)"));
        if (strM12014 != null) {
            return strM12014;
        }
        String strM120142 = m12014(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strM120142 != null) {
            return strM120142;
        }
        String str4 = (String) interfaceC65422.invoke();
        StringBuilder sbM149 = AbstractC0053.m149(str4);
        sbM149.append((String) interfaceC6557.invoke("Array<"));
        String string = sbM149.toString();
        StringBuilder sbM1492 = AbstractC0053.m149(str4);
        sbM1492.append((String) interfaceC6557.invoke("Array<out "));
        String string2 = sbM1492.toString();
        StringBuilder sbM1493 = AbstractC0053.m149(str4);
        sbM1493.append((String) interfaceC6557.invoke("Array<(out) "));
        String strM120143 = m12014(str, string, str2, string2, sbM1493.toString());
        if (strM120143 != null) {
            return strM120143;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m12017(C4690 c4690) {
        c4690.getClass();
        String strM9345 = c4690.m9345();
        strM9345.getClass();
        if (!AbstractC4737.f13827.contains(strM9345)) {
            int i = 0;
            while (true) {
                if (i < strM9345.length()) {
                    char cCharAt = strM9345.charAt(i);
                    if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                        break;
                    }
                    i++;
                } else if (strM9345.length() != 0 && Character.isJavaIdentifierStart(strM9345.codePointAt(0))) {
                    return strM9345;
                }
            }
        }
        return "`".concat(strM9345).concat("`");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static AbstractC7738 m12018(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            C5919.m11249("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        C6897 c6897 = new C6897(metadata.mv(), (metadata.xi() & 8) != 0);
        boolean zM12156 = c6897.m12156(1, 1, 0);
        if (!zM12156) {
            if (zM12156) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(c6897.f18362 ? C6897.f18361 : C6897.f18360);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            C5553.m10817("Provided Metadata instance has version ", c6897, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new C4514(metadata);
            }
            if (iK == 2) {
                return new C4513(metadata);
            }
            if (iK == 3) {
                return new C4521(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new C4519(metadata);
                }
                C4521 c4521 = new C4521();
                new C4516(metadata.mv());
                metadata.xi();
                return c4521;
            }
            String[] strArrD1 = metadata.d1();
            strArrD1.getClass();
            List listAsList = Arrays.asList(strArrD1);
            listAsList.getClass();
            new C4516(metadata.mv());
            metadata.xi();
            C4520 c4520 = new C4520();
            c4520.f13166 = listAsList;
            return c4520;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m12019(String str, boolean z) {
        if (z) {
            return;
        }
        C5919.m11249(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m12020(C8104 c8104, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            int iM11998 = m11998(i, i3, str);
            int iM11997 = m11997(iM11998, i3, str);
            if (iM11997 > iM11998) {
                c8104.mo2399(z ? AbstractC8110.m13548(iM11998, iM11997, str, 12) : str.substring(iM11998, iM11997), EmptyList.INSTANCE);
                return;
            }
            return;
        }
        int iM119982 = m11998(i, i2, str);
        int iM119972 = m11997(iM119982, i2, str);
        if (iM119972 > iM119982) {
            String strM13548 = z ? AbstractC8110.m13548(iM119982, iM119972, str, 12) : str.substring(iM119982, iM119972);
            int iM119983 = m11998(i2 + 1, i3, str);
            int iM119973 = m11997(iM119983, i3, str);
            c8104.mo2413(strM13548, z ? AbstractC8110.m13548(iM119983, iM119973, str, 8) : str.substring(iM119983, iM119973));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m12021(DxContext dxContext, CfOptions cfOptions, DexOptions dexOptions, DexFile dexFile, InputStream inputStream) throws IOException {
        DxContext dxContext2;
        CfOptions cfOptions2;
        DexOptions dexOptions2;
        DexFile dexFile2;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        int i = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return i;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (!name.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) || name.startsWith("META-INF/")) {
                        dxContext2 = dxContext;
                        cfOptions2 = cfOptions;
                        dexOptions2 = dexOptions;
                        dexFile2 = dexFile;
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i2 = zipInputStream.read(bArr);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        DirectClassFile directClassFile = new DirectClassFile(byteArray, name, true);
                        directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
                        dxContext2 = dxContext;
                        cfOptions2 = cfOptions;
                        dexOptions2 = dexOptions;
                        dexFile2 = dexFile;
                        dexFile2.add(CfTranslator.translate(dxContext2, directClassFile, byteArray, cfOptions2, dexOptions2, dexFile2));
                        i++;
                    }
                    dxContext = dxContext2;
                    cfOptions = cfOptions2;
                    dexOptions = dexOptions2;
                    dexFile = dexFile2;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.InterfaceC6488 m12022(kotlin.reflect.jvm.internal.AbstractC4952 r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p053.AbstractC6560.m12022(kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m12023(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12024(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static InterfaceC4455 m12025(C4690 c4690, AbstractC6988 abstractC6988) {
        if (c4690 == null) {
            m12024(19);
            throw null;
        }
        if (abstractC6988 == null) {
            m12024(20);
            throw null;
        }
        Collection collectionMo9017 = abstractC6988.mo9017();
        if (collectionMo9017.size() != 1) {
            return null;
        }
        for (InterfaceC4455 interfaceC4455 : ((C7017) collectionMo9017.iterator().next()).mo9045()) {
            if (((AbstractC7008) interfaceC4455).getName().equals(c4690)) {
                return interfaceC4455;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final Class m12026(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        Class clsMo8889 = ((InterfaceC4386) interfaceC5092).mo8889();
        if (clsMo8889.isPrimitive()) {
            String name = clsMo8889.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo8889;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Class m12027(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        Class clsMo8889 = ((InterfaceC4386) interfaceC5092).mo8889();
        if (clsMo8889.isPrimitive()) {
            return clsMo8889;
        }
        String name = clsMo8889.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static LayoutInflater m12028(Context context) {
        return LayoutInflater.from(context).cloneInContext(new C3763(context, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Class m12029(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        Class clsMo8889 = ((InterfaceC4386) interfaceC5092).mo8889();
        clsMo8889.getClass();
        return clsMo8889;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static AbstractC6325 m12030(int i) {
        return i != 0 ? i != 1 ? new C8644() : new C8632() : new C8644();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static InMemoryDexClassLoader m12031(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            int iM12021 = m12021(dxContext, cfOptions, dexOptions, dexFile, fileInputStream);
            fileInputStream.close();
            if (iM12021 == 0) {
                C5919.m11246(AbstractC0053.m152("No class file found in jar ", str));
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dexFile.writeTo(byteArrayOutputStream, null, true);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C8262 m12032(double d, double d2) {
        C8254 c8254M13806;
        C8263 c8263 = new C8263(d, d2);
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                c8254M13806 = AbstractC8255.m13806(c8263.f22882, c8263.f22881, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            int i4 = i3 + 1;
            boolean z = c8263.m13811(i3) < c8263.m13811(i4);
            if (c8263.m13811(i3) >= c8263.f22881 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    i = i3;
                } else {
                    if (i2 == i3) {
                        c8254M13806 = AbstractC8255.m13806(c8263.f22882, c8263.f22881, i2);
                        break;
                    }
                    i2 = i3;
                }
            } else if (z) {
                i2 = i4;
            } else {
                i = i3;
            }
        }
        return new C8262(d, d2, c8254M13806);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5092 m12033(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return AbstractC4395.f12971.mo8927(clsAnnotationType);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static int m12034(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.luckypray.dexkit.result.C5719 m12035(org.luckypray.dexkit.DexKitBridge r11, p396.C9137 r12) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p053.AbstractC6560.m12035(org.luckypray.dexkit.DexKitBridge, 飘花落叶言苏楪子世哲兰.飘花落叶言子楪世苏兰哲):org.luckypray.dexkit.result.飘花落叶言子楪世哲兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m12036(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C2632.m5298(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m12037(int i) {
        if (i >= 0) {
            return;
        }
        C5919.m11245();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static InMemoryDexClassLoader m12038(ClassLoader classLoader, String str) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        DexFile dexFile = new DexFile(dexOptions);
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        int iM12021 = 0;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                if (!nextEntry.isDirectory()) {
                    String name = nextEntry.getName();
                    if (name.equals("classes.jar") || (name.startsWith("libs/") && name.endsWith(".jar"))) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i = zipInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        iM12021 += m12021(dxContext, cfOptions, dexOptions, dexFile, new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    }
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        zipInputStream.close();
        if (iM12021 == 0) {
            C5919.m11246(AbstractC0053.m152("No class file found in aar ", str));
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            dexFile.writeTo(byteArrayOutputStream2, null, true);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static InMemoryDexClassLoader m12039(String str, byte[] bArr, ClassLoader classLoader) throws IOException {
        DexOptions dexOptions = new DexOptions();
        CfOptions cfOptions = new CfOptions();
        DxContext dxContext = new DxContext();
        String strM136 = AbstractC0053.m136(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), ClassFileLocator.CLASS_FILE_EXTENSION);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DexFile dexFile = new DexFile(dexOptions);
            DirectClassFile directClassFile = new DirectClassFile(bArr, strM136, true);
            directClassFile.setAttributeFactory(StdAttributeFactory.THE_ONE);
            dexFile.add(CfTranslator.translate(dxContext, directClassFile, bArr, cfOptions, dexOptions, dexFile));
            dexFile.writeTo(byteArrayOutputStream, null, true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return new InMemoryDexClassLoader(ByteBuffer.wrap(byteArray), classLoader);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.AbstractC6493 m12040(kotlin.reflect.jvm.internal.AbstractC4952 r5, boolean r6, java.lang.reflect.Field r7) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p053.AbstractC6560.m12040(kotlin.reflect.jvm.internal.飘花落叶言子世楪兰苏哲, boolean, java.lang.reflect.Field):飘花落叶言世子兰楪哲苏.飘花落叶言子楪兰世哲苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m12041(AbstractC4952 abstractC4952) {
        return !AbstractC4916.m9850(abstractC4952.mo9952().mo9945().getType());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final boolean m12042(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(AbstractC5138.m10128(str2, TypeDescription.Generic.OfWildcardType.SYMBOL, ""))) {
            return true;
        }
        if (str2.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL) && str.concat(TypeDescription.Generic.OfWildcardType.SYMBOL).equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public abstract void mo12043(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public abstract void mo12044(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public abstract InputFilter[] mo12045(InputFilter[] inputFilterArr);
}
