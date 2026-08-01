package kotlin.reflect.jvm.internal.types;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.activity.result.ActivityResult;
import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1315;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.tooling.C1300;
import androidx.core.os.AbstractC2171;
import bsh.C2632;
import com.alibaba.fastjson2.AbstractC2904;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.routing.AbstractC4164;
import io.ktor.server.routing.C4142;
import io.ktor.server.routing.C4144;
import io.ktor.server.routing.C4147;
import io.ktor.server.routing.C4148;
import io.ktor.server.routing.C4151;
import io.ktor.server.routing.C4153;
import io.ktor.server.routing.C4157;
import io.ktor.server.routing.C4158;
import io.ktor.server.routing.C4165;
import io.ktor.server.routing.C4166;
import io.ktor.server.routing.C4169;
import io.ktor.util.C4210;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.AbstractC5002;
import kotlin.reflect.jvm.internal.AbstractC5066;
import kotlin.reflect.jvm.internal.C5003;
import kotlin.reflect.jvm.internal.InterfaceC5063;
import kotlin.reflect.jvm.internal.InterfaceC5074;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4576;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4638;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.sequences.AbstractC5121;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.type.TypeDescription;
import org.apache.commons.compress.compressors.deflate64.HuffmanState;
import org.slf4j.Marker;
import p000.AbstractC6087;
import p012.AbstractC6167;
import p012.C6165;
import p033.AbstractC6325;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p067.C6885;
import p067.C6886;
import p082.C7033;
import p087.C7102;
import p087.C7134;
import p088.C7161;
import p088.C7166;
import p089.C7179;
import p112.C7326;
import p153.C7601;
import p161.C7638;
import p164.AbstractC7666;
import p204.AbstractC7890;
import p204.InterfaceC7891;
import p205.C7893;
import p205.C7899;
import p236.C8098;
import p236.C8119;
import p236.C8122;
import p251.AbstractC8174;
import p251.C8182;
import p251.SharedPreferencesC8175;
import p263.AbstractC8255;
import p263.C8254;
import p390.AbstractC9113;
import p390.C9107;
import p390.C9110;
import p391.C9114;
import p392.AbstractC9121;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean f14249 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Field f14250 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean f14251 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14252;

    public AbstractC4921() {
        this.f14252 = 16;
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final Class m9871(InterfaceC5086 interfaceC5086) {
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086 != null ? interfaceC5086.mo8909() : null;
        InterfaceC5092 interfaceC5092 = interfaceC5091Mo8909 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091Mo8909 : null;
        if (interfaceC5092 != null && interfaceC5092.mo8894()) {
            if (!AbstractC5066.m10074(interfaceC5086)) {
                return AbstractC6560.m12029(interfaceC5092);
            }
            InterfaceC5086 interfaceC5086M10066 = AbstractC5066.m10066(interfaceC5086);
            if (interfaceC5086M10066 != null && !AbstractC5066.m10074(interfaceC5086M10066) && !m9878(interfaceC5086M10066)) {
                return AbstractC6560.m12029(interfaceC5092);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static C7033 m9872(TypeUsage typeUsage, boolean z, C4576 c4576, int i) {
        boolean z2 = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        if ((i & 4) != 0) {
            c4576 = null;
        }
        typeUsage.getClass();
        return new C7033(typeUsage, z3, z2, c4576 != null ? AbstractC0455.m1140(c4576) : null, 34);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.tooling.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final ArrayList m9873(C1234 c1234, int i, Integer num) {
        ?? c1300 = new C1300(c1234);
        int iM2069 = c1234.m2069(i);
        C1230 c1230M2063 = c1234.m2063(i);
        while (i >= 0) {
            c1300.m2292(c1234.m2077(i), c1234.m2075(i) ? c1234.m2072(c1234.f3553, i) : C1369.f3973, c1234.f3554.m2056(i), num);
            if (iM2069 >= 0) {
                C1230 c1230 = c1230M2063;
                c1230M2063 = c1234.m2063(iM2069);
                i = iM2069;
                iM2069 = c1234.m2069(iM2069);
                num = c1230;
            } else {
                i = iM2069;
                num = c1230M2063;
            }
        }
        return c1300.f3782;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m9874(String str, ArrayList arrayList) {
        String strM11854 = AbstractC6325.m11854(str);
        C7161 c7161M1152 = AbstractC0455.m1152(new C7179(25));
        if (C9114.f25484.length() == 0) {
            C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC8175 sharedPreferencesC8175M13649 = new C8182(C9114.f25484, "DexKitCache").m13649();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                sharedPreferencesC8175M13649.putString(strM11854, c7161M1152.m12397(new C7102(C7134.f19094, 0), arrayList2));
                return;
            }
            Method method = (Method) it.next();
            C7161 c7161 = AbstractC9113.f25483;
            method.getClass();
            method.setAccessible(true);
            C7161 c71612 = AbstractC9113.f25483;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            name2.getClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            ArrayList arrayList3 = new ArrayList(parameterTypes.length);
            for (Class<?> cls : parameterTypes) {
                arrayList3.add(cls.getName());
            }
            C9107 c9107 = new C9107(name, name2, method.getReturnType().getName(), arrayList3);
            c71612.getClass();
            arrayList2.add(c71612.m12397(C9107.Companion.serializer(), c9107));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final C4153 m9875(C4144 c4144, String str, C8098 c8098, InterfaceC6557 interfaceC6557) {
        AbstractC3932 c4166;
        AbstractC3932 c4148;
        c4144.getClass();
        c8098.getClass();
        C4151 c4151 = new C4151(c8098);
        C4157 c4157 = C4157.f12592;
        List list = AbstractC6087.m11390(str).f12593;
        int size = list.size();
        int i = 0;
        C4153 c4153M8547 = c4144;
        while (i < size) {
            C4158 c4158 = (C4158) list.get(i);
            String str2 = c4158.f12595;
            int i2 = AbstractC4164.f12616[c4158.f12594.ordinal()];
            if (i2 == 1) {
                str2.getClass();
                int iM10151 = AbstractC5143.m10151(str2, '{', 0, 6);
                int iM10165 = AbstractC5143.m10165(str2, '}', 0, 6);
                String strSubstring = iM10151 == 0 ? null : str2.substring(0, iM10151);
                String strSubstring2 = iM10165 == str2.length() - 1 ? null : str2.substring(iM10165 + 1);
                String strSubstring3 = str2.substring(iM10151 + 1, iM10165);
                if (strSubstring3.endsWith(TypeDescription.Generic.OfWildcardType.SYMBOL)) {
                    c4166 = new C4147(AbstractC5143.m10170(1, strSubstring3), strSubstring, strSubstring2);
                } else if (!strSubstring3.endsWith("...")) {
                    c4166 = new C4166(strSubstring3, strSubstring, strSubstring2);
                } else {
                    if (strSubstring2 != null && strSubstring2.length() != 0) {
                        C5919.m11249("Suffix after tailcard is not supported");
                        return null;
                    }
                    String strM10170 = AbstractC5143.m10170(3, strSubstring3);
                    if (strSubstring == null) {
                        strSubstring = "";
                    }
                    c4166 = new C4165(strM10170, strSubstring);
                }
                c4148 = c4166;
            } else {
                if (i2 != 2) {
                    C4210.m8621();
                    return null;
                }
                str2.getClass();
                c4148 = str2.equals(Marker.ANY_MARKER) ? C4169.f12624 : new C4148(str2);
            }
            i++;
            c4153M8547 = c4153M8547.m8547(c4148);
        }
        C4153 c4153M85472 = c4153M8547;
        if (str.endsWith("/")) {
            c4153M85472 = c4153M8547.m8547(C4142.f12556);
        }
        C4153 c4153M85473 = c4153M85472.m8547(c4151);
        interfaceC6557.invoke(c4153M85473);
        return c4153M85473;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m9876(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? context.getColor(i) : typedValue.data;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final boolean m9877(C7326 c7326) {
        long j = c7326.f19534;
        return (j >>> 32) == (4294967295L & j) && j == c7326.f19533 && j == c7326.f19540 && j == c7326.f19539;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final boolean m9878(InterfaceC5086 interfaceC5086) {
        if (interfaceC5086.mo8906()) {
            return false;
        }
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        InterfaceC5092 interfaceC5092 = interfaceC5091Mo8909 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091Mo8909 : null;
        Class clsM12027 = interfaceC5092 != null ? AbstractC6560.m12027(interfaceC5092) : null;
        return (clsM12027 == null || clsM12027.equals(Void.TYPE)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m9879(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = AbstractC7666.f20816;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            C5919.m11249("outXyz must have a length of 3.");
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

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Object m9880(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2171.m3944(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m9881(String str, ArrayList arrayList) {
        String strM11854 = AbstractC6325.m11854(str);
        C7161 c7161M1152 = AbstractC0455.m1152(new C7179(25));
        if (C9114.f25484.length() == 0) {
            C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC8175 sharedPreferencesC8175M13649 = new C8182(C9114.f25484, "DexKitCache").m13649();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            C7161 c7161 = AbstractC9113.f25483;
            cls.getClass();
            C7161 c71612 = AbstractC9113.f25483;
            C9110 c9110 = new C9110(cls.getName());
            c71612.getClass();
            arrayList2.add(c71612.m12397(C9110.Companion.serializer(), c9110));
        }
        sharedPreferencesC8175M13649.putString(strM11854, c7161M1152.m12397(new C7102(C7134.f19094, 0), arrayList2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final void m9882(InterfaceC5183 interfaceC5183, String str, int i, int i2, String str2) {
        String string = AbstractC5143.m10150(str.substring(i, i2)).toString();
        if (string.length() == 0) {
            return;
        }
        ((ArrayList) interfaceC5183.getValue()).add(new C8119(string, str2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final List m9883(String str) {
        int i;
        Pair pair;
        Pair pair2;
        if (str == null) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5183 interfaceC5183M10211 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C7166(13));
        for (int i2 = 0; i2 <= str.length() - 1; i2 = i) {
            InterfaceC5183 interfaceC5183M102112 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C7166(14));
            Integer numValueOf = null;
            i = i2;
            while (true) {
                if (i <= str.length() - 1) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == ',') {
                        ((ArrayList) interfaceC5183M10211.getValue()).add(new C8122(AbstractC5143.m10150(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC5183M102112.isInitialized() ? (List) interfaceC5183M102112.getValue() : EmptyList.INSTANCE));
                        i++;
                    } else if (cCharAt != ';') {
                        i++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i);
                        }
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 <= AbstractC5143.m10154(str)) {
                            char cCharAt2 = str.charAt(i4);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                m9882(interfaceC5183M102112, str, i3, i4, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i4++;
                            } else {
                                int i5 = i4 + 1;
                                if (str.length() == i5) {
                                    pair2 = new Pair(Integer.valueOf(i5), "");
                                } else {
                                    if (str.charAt(i5) == '\"') {
                                        int i6 = i4 + 2;
                                        StringBuilder sb = new StringBuilder();
                                        while (i6 <= str.length() - 1) {
                                            char cCharAt3 = str.charAt(i6);
                                            if (cCharAt3 == '\"') {
                                                int i7 = i6 + 1;
                                                int i8 = i7;
                                                while (i8 < str.length() && str.charAt(i8) == ' ') {
                                                    i8++;
                                                }
                                                if (i8 == str.length() || str.charAt(i8) == ';') {
                                                    pair = new Pair(Integer.valueOf(i7), sb.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i6 >= str.length() - 3) {
                                                sb.append(cCharAt3);
                                                i6++;
                                            } else {
                                                sb.append(str.charAt(i6 + 1));
                                                i6 += 2;
                                            }
                                        }
                                        pair = new Pair(Integer.valueOf(i6), "\"".concat(sb.toString()));
                                    } else {
                                        int i9 = i5;
                                        while (i9 <= str.length() - 1) {
                                            char cCharAt4 = str.charAt(i9);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                pair = new Pair(Integer.valueOf(i9), AbstractC5143.m10150(str.substring(i5, i9)).toString());
                                                break;
                                            }
                                            i9++;
                                        }
                                        pair = new Pair(Integer.valueOf(i9), AbstractC5143.m10150(str.substring(i5, i9)).toString());
                                    }
                                    pair2 = pair;
                                }
                                int iIntValue = ((Number) pair2.component1()).intValue();
                                m9882(interfaceC5183M102112, str, i3, i4, (String) pair2.component2());
                                i = iIntValue;
                            }
                        }
                        m9882(interfaceC5183M102112, str, i3, i4, "");
                        i = i4;
                    }
                } else {
                    ((ArrayList) interfaceC5183M10211.getValue()).add(new C8122(AbstractC5143.m10150(str.substring(i2, numValueOf != null ? numValueOf.intValue() : i)).toString(), interfaceC5183M102112.isInitialized() ? (List) interfaceC5183M102112.getValue() : EmptyList.INSTANCE));
                }
            }
        }
        return interfaceC5183M10211.isInitialized() ? (List) interfaceC5183M10211.getValue() : EmptyList.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static int m9884(int i, float f, int i2) {
        return AbstractC7666.m12946(AbstractC7666.m12944(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final boolean m9885(InterfaceC5074 interfaceC5074) {
        C4548 c4548M9985;
        interfaceC5074.getClass();
        List listMo9964 = interfaceC5074.mo9964();
        if (listMo9964 == null || !listMo9964.isEmpty()) {
            Iterator it = listMo9964.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5107) it.next()).getKind() != KParameter$Kind.INSTANCE) {
                    return false;
                }
            }
        }
        String name = interfaceC5074.getName();
        AbstractC5002 abstractC5002Mo9946 = interfaceC5074.mo9946();
        String str = null;
        C5003 c5003 = abstractC5002Mo9946 instanceof C5003 ? (C5003) abstractC5002Mo9946 : null;
        if (c5003 != null && (c4548M9985 = c5003.m9985()) != null) {
            str = c4548M9985.f13287;
        }
        return AbstractC4394.m8917(name, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final List m9886(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        return AbstractC5121.m10106(AbstractC5121.m10109(AbstractC5121.m10112(interfaceC5092, C4922.f14253), C4922.f14254));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9887(Logger logger, AbstractC6167 abstractC6167, C6165 c6165, String str) {
        logger.fine(c6165.f16808 + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC6167.f16815);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7326 m9888(float f, float f2, float f3, float f4, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        return new C7326(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7893 m9889(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        InterfaceC7891 interfaceC7891M13288 = AbstractC7890.m13288(f);
        if (interfaceC7891M13288 == null) {
            interfaceC7891M13288 = new C7899(f);
        }
        return new C7893(f2, f, interfaceC7891M13288);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m9890(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return true;
        }
        Class cls3 = null;
        try {
            if (cls2.equals(Boolean.class)) {
                cls3 = Boolean.TYPE;
            } else if (cls2.equals(Integer.class)) {
                cls3 = Integer.TYPE;
            } else if (cls2.equals(Long.class)) {
                cls3 = Long.TYPE;
            } else if (cls2.equals(Byte.class)) {
                cls3 = Byte.TYPE;
            } else if (cls2.equals(Short.class)) {
                cls3 = Short.TYPE;
            } else if (cls2.equals(Float.class)) {
                cls3 = Float.TYPE;
            } else if (cls2.equals(Double.class)) {
                cls3 = Double.TYPE;
            } else if (cls2.equals(Character.class)) {
                cls3 = Character.TYPE;
            }
        } catch (Exception unused) {
        }
        if (cls.equals(cls3)) {
            return true;
        }
        return cls.isAssignableFrom(cls2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C4638 m9891(AbstractC2904 abstractC2904) {
        if (abstractC2904 instanceof C6885) {
            C6885 c6885 = (C6885) abstractC2904;
            String str = c6885.f18339;
            String str2 = c6885.f18338;
            str.getClass();
            str2.getClass();
            return new C4638(str.concat(str2));
        }
        if (!(abstractC2904 instanceof C6886)) {
            C4210.m8621();
            return null;
        }
        C6886 c6886 = (C6886) abstractC2904;
        String str3 = c6886.f18341;
        String str4 = c6886.f18340;
        str3.getClass();
        str4.getClass();
        return new C4638(AbstractC0053.m163('#', str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static String m9892(int i) {
        if (i >= 1024) {
            return i < 1048576 ? String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i) / 1024.0d)}, 1)).concat(" KB") : String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) i) / 1048576.0d)}, 1)).concat(" MB");
        }
        return i + " B";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Integer m9893(Context context, int i) {
        TypedValue typedValueM13597 = AbstractC8174.m13597(context.getTheme(), i);
        if (typedValueM13597 != null) {
            return Integer.valueOf(m9876(context, typedValueM13597));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final Method m9894(Class cls, InterfaceC5063 interfaceC5063) {
        interfaceC5063.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            C4210.m8623("No unbox method found in inline class: ", cls, " (calling ", interfaceC5063);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList m9895(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C4429(annotation));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static ArrayList m9896(String str) {
        String strM11854 = AbstractC6325.m11854(str);
        C7161 c7161M1152 = AbstractC0455.m1152(new C7179(25));
        if (C9114.f25484.length() == 0) {
            C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return null;
        }
        SharedPreferencesC8175 sharedPreferencesC8175M13649 = new C8182(C9114.f25484, "DexKitCache").m13649();
        if (!sharedPreferencesC8175M13649.contains(strM11854)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferencesC8175M13649.getString(strM11854, "");
        for (String str2 : (string == null || string.length() == 0) ? new ArrayList() : AbstractC4343.m8799((Collection) c7161M1152.m12399(string, new C7102(C7134.f19094, 0)))) {
            C7161 c7161 = AbstractC9113.f25483;
            str2.getClass();
            C7161 c71612 = AbstractC9113.f25483;
            c71612.getClass();
            Class clsM14657 = AbstractC9121.m14657(((C9110) c71612.m12399(str2, C9110.Companion.serializer())).f25481);
            clsM14657.getClass();
            arrayList.add(clsM14657);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.InterfaceC6488 m9897(java.util.List r2, kotlin.reflect.jvm.internal.InterfaceC5063 r3, p047.InterfaceC6488 r4, boolean r5) {
        /*
            r3.getClass()
            r2.getClass()
            java.util.List r0 = r3.getParameters()
            if (r0 == 0) goto L13
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L13
            goto L2e
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            kotlin.reflect.飘花落叶言子楪哲苏兰世 r1 = (kotlin.reflect.InterfaceC5107) r1
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r1 = r1.getType()
            boolean r1 = kotlin.reflect.jvm.internal.AbstractC5066.m10069(r1)
            if (r1 == 0) goto L17
            goto L38
        L2e:
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r0 = r3.getReturnType()
            boolean r0 = kotlin.reflect.jvm.internal.AbstractC5066.m10069(r0)
            if (r0 == 0) goto L3e
        L38:
            飘花落叶言世子兰楪哲苏.飘花落叶言子世楪苏哲兰 r0 = new 飘花落叶言世子兰楪哲苏.飘花落叶言子世楪苏哲兰
            r0.<init>(r2, r3, r4, r5)
            return r0
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.types.AbstractC4921.m9897(java.util.List, kotlin.reflect.jvm.internal.飘花落叶言楪子世苏兰哲, 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C8254 m9898(C8254 c8254) {
        c8254.getClass();
        double dRint = Math.rint(c8254.f22857);
        return (((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(c8254.f22856) > 16.0d ? 1 : (Math.rint(c8254.f22856) == 16.0d ? 0 : -1)) > 0) && (Math.rint(c8254.f22855) < 65.0d)) ? AbstractC8255.m13806(c8254.f22857, c8254.f22856, 70.0d) : c8254;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String m9899(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C4429 m9900(Annotation[] annotationArr, C4686 c4686) {
        Annotation annotation;
        annotationArr.getClass();
        c4686.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (AbstractC4394.m8917(AbstractC4430.m8987(AbstractC6560.m12029(AbstractC6560.m12033(annotation))).m9337(), c4686)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C4429(annotation);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Integer m9901(C1234 c1234, AbstractC1372 abstractC1372, int i, int i2) {
        Integer numM9901;
        int[] iArr = c1234.f3553;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (c1234.m2078(i) && c1234.m2077(i) == 206 && AbstractC4394.m8917(c1234.m2072(iArr, i), AbstractC1374.f3974)) {
                Object objM2073 = c1234.m2073(i, 0);
                C1320 c1320 = objM2073 instanceof C1320 ? (C1320) objM2073 : null;
                InterfaceC1339 interfaceC1339 = c1320 != null ? c1320.f3823 : null;
                C1315 c1315 = interfaceC1339 instanceof C1315 ? (C1315) interfaceC1339 : null;
                if (c1315 != null && c1315.f3817 == abstractC1372) {
                    return Integer.valueOf(i);
                }
            }
            if (c1234.m2060(i) && (numM9901 = m9901(c1234, abstractC1372, i + 1, i3)) != null) {
                return Integer.valueOf(numM9901.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m9902(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.tooling.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final List m9903(C1235 c1235, Integer num, int i, Integer num2) {
        int iM2102;
        int iM2110;
        C0244 c0244;
        if (c1235.f3571 || c1235.m2120() == 0) {
            return EmptyList.INSTANCE;
        }
        ?? c1300 = new C1300(c1235);
        if (num2 != null) {
            iM2102 = num2.intValue();
        } else {
            iM2102 = c1235.f3574;
            if (iM2102 < 0) {
                iM2102 = c1235.m2102(c1235.f3567, i);
            }
        }
        if (num == 0) {
            int iM2090 = c1235.f3585 - c1235.m2090(c1235.f3567, c1235.m2118(i));
            C0246 c0246 = c1235.f3570;
            num = Integer.valueOf(iM2090 + ((c0246 == null || (c0244 = (C0244) c0246.m832(i)) == null) ? 0 : c0244.f1004));
        }
        int iM2118 = c1235.m2118(i) * 5;
        int[] iArr = c1235.f3567;
        if (iM2118 < iArr.length) {
            iM2110 = c1235.m2110(i);
        } else {
            int iM21022 = iM2102 >= 0 ? c1235.m2102(iArr, iM2102) : iM2102;
            iM2110 = c1235.m2110(iM2102);
            int i2 = iM2102;
            iM2102 = iM21022;
            i = i2;
        }
        while (i >= 0) {
            c1300.m2292(iM2110, (c1235.f3567[(c1235.m2118(i) * 5) + 1] & 536870912) != 0 ? c1235.m2109(i) : C1369.f3973, c1235.m2086(i), num);
            num = c1235.m2107(i);
            if (iM2102 >= 0) {
                int iM21023 = c1235.m2102(c1235.f3567, iM2102);
                iM2110 = c1235.m2110(iM2102);
                int i3 = iM2102;
                iM2102 = iM21023;
                i = i3;
            } else {
                i = iM2102;
            }
        }
        return c1300.f3782;
    }

    public int hashCode() {
        switch (this.f14252) {
            case 13:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f14252) {
            case 13:
                String simpleName = AbstractC4395.f12971.mo8927(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void mo9904(View view, float f) {
        if (f14251) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f14251 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public abstract HuffmanState mo9905();

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public abstract int mo9906(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract boolean mo9907();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float mo9908(View view) {
        if (f14251) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f14251 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public abstract int mo9909(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract DialogXStyle$PopTipSettings$ALIGN mo9910();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public abstract Typeface mo9911(Context context, Resources resources, int i, String str);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo9912();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public abstract Typeface mo9913(Context context, C7601[] c7601Arr, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Typeface mo9914(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Typeface mo9915(Context context, C7638 c7638, Resources resources, int i);

    public /* synthetic */ AbstractC4921(int i) {
        this.f14252 = i;
    }
}
