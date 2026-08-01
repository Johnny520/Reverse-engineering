package io.ktor.client.plugins;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.Pair;
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0137;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.input.C2013;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import io.ktor.server.routing.AbstractC4159;
import io.ktor.server.routing.C4141;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4433;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4635;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4642;
import kotlin.reflect.jvm.internal.impl.load.kotlin.InterfaceC4643;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.protobuf.internal.C5524;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.pool.TypePool;
import okhttp3.Protocol;
import p035.AbstractC6340;
import p036.AbstractC6353;
import p046.InterfaceC6477;
import p046.InterfaceC6480;
import p049.AbstractC6526;
import p053.AbstractC6560;
import p077.AbstractC6968;
import p077.C6971;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p087.C7140;
import p091.C7193;
import p091.InterfaceC7190;
import p161.AbstractC7645;
import p192.C7807;
import p197.InterfaceC7845;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3932 implements InterfaceC7845 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static volatile boolean f12145 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static C4433 f12146;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m8299(InterfaceC4642 interfaceC4642, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                C4690 c4690M9340 = C4690.m9340(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    interfaceC4642.mo979(c4690M9340, m8305((Class) objInvoke));
                } else if (AbstractC6968.f18664.contains(enclosingClass)) {
                    interfaceC4642.mo987(c4690M9340, objInvoke);
                } else {
                    List list = AbstractC4430.f13051;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        interfaceC4642.mo990(c4690M9340, AbstractC4430.m8987(enclosingClass), C4690.m9340(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) AbstractC4346.m8853(interfaces);
                        cls2.getClass();
                        InterfaceC4642 interfaceC4642Mo989 = interfaceC4642.mo989(AbstractC4430.m8987(cls2), c4690M9340);
                        if (interfaceC4642Mo989 != null) {
                            m8299(interfaceC4642Mo989, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        InterfaceC4643 interfaceC4643Mo983 = interfaceC4642.mo983(c4690M9340);
                        if (interfaceC4643Mo983 != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                C4687 c4687M8987 = AbstractC4430.m8987(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    interfaceC4643Mo983.mo985(c4687M8987, C4690.m9340(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    interfaceC4643Mo983.mo981(m8305((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    InterfaceC4642 interfaceC4642Mo986 = interfaceC4643Mo983.mo986(AbstractC4430.m8987(componentType));
                                    if (interfaceC4642Mo986 != null) {
                                        obj3.getClass();
                                        m8299(interfaceC4642Mo986, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    interfaceC4643Mo983.mo984(obj4);
                                }
                            }
                            interfaceC4643Mo983.mo980();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC4642.mo980();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m8300(InterfaceC4635 interfaceC4635, Annotation annotation) throws InvocationTargetException {
        Class clsM12029 = AbstractC6560.m12029(AbstractC6560.m12033(annotation));
        InterfaceC4642 interfaceC4642Mo988 = interfaceC4635.mo988(AbstractC4430.m8987(clsM12029), new C6971(annotation));
        if (interfaceC4642Mo988 != null) {
            m8299(interfaceC4642Mo988, annotation, clsM12029);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C0137 m8301(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (AbstractC5138.m10125(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (AbstractC5138.m10125(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            if (!AbstractC5138.m10125(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM10136 = AbstractC5138.m10136(str.substring(i, i2));
        if (numM10136 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM10136.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C0137(protocol, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final String m8302(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final String m8303(InputStreamReader inputStreamReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = inputStreamReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = inputStreamReader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final String m8304(AbstractC6988 abstractC6988, C4651 c4651) {
        abstractC6988.getClass();
        c4651.getClass();
        InterfaceC4498 interfaceC4498Mo9038 = abstractC6988.mo9038();
        interfaceC4498Mo9038.getClass();
        C4690 name = abstractC6988.getName();
        C4690 c4690 = AbstractC4691.f13707;
        if (name == null || name.f13700) {
            name = AbstractC4691.f13705;
        }
        String strM9344 = name.m9344();
        if (!(interfaceC4498Mo9038 instanceof InterfaceC4465)) {
            AbstractC6988 abstractC69882 = interfaceC4498Mo9038 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4498Mo9038 : null;
            if (abstractC69882 != null) {
                return AbstractC0053.m163('$', m8304(abstractC69882, c4651), strM9344);
            }
            C5553.m10817("Unexpected container: ", interfaceC4498Mo9038, " for ", abstractC6988);
            return null;
        }
        C4686 c4686 = ((AbstractC6985) ((InterfaceC4465) interfaceC4498Mo9038)).f18692;
        if (c4686.f13692.m9324()) {
            return strM9344;
        }
        return AbstractC5138.m10129(c4686.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + '/' + strM9344;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4748 m8305(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            C4687 c4687M8987 = AbstractC4430.m8987(cls);
            String str = C4409.f12983;
            C4687 c4687M8956 = C4409.m8956(c4687M8987.m9337());
            if (c4687M8956 != null) {
                c4687M8987 = c4687M8956;
            }
            return new C4748(c4687M8987, i);
        }
        if (cls.equals(Void.TYPE)) {
            C4686 c4686M9329 = AbstractC6526.f17886.m9329();
            return new C4748(new C4687(c4686M9329.m9330(), c4686M9329.f13692.m9328()), i);
        }
        PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
        primitiveType.getClass();
        if (i > 0) {
            C4686 arrayTypeFqName = primitiveType.getArrayTypeFqName();
            arrayTypeFqName.getClass();
            return new C4748(new C4687(arrayTypeFqName.m9330(), arrayTypeFqName.f13692.m9328()), i - 1);
        }
        C4686 typeFqName = primitiveType.getTypeFqName();
        typeFqName.getClass();
        return new C4748(new C4687(typeFqName.m9330(), typeFqName.f13692.m9328()), i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m8306(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5524 m8307(C5524 c5524, long j) {
        return new C5524(j == 19500 ? c5524.m10730() : c5524.m10731());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m8308(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m8309(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m8309(file.getParentFile());
        file.mkdir();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be A[EDGE_INSN: B:19:0x00be->B:81:0x020f BREAK  A[LOOP:1: B:75:0x01ef->B:159:?]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8310(kotlin.reflect.jvm.internal.impl.types.AbstractC4881 r12, kotlin.reflect.jvm.internal.impl.load.kotlin.C4637 r13, p052.InterfaceC6550 r14) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3932.m8310(kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰哲苏世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static List m8311(C1235 c1235, int i, C1235 c12352, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iM2113 = c1235.m2113(i);
        int i4 = i + iM2113;
        int iM2103 = c1235.m2103(i);
        int iM21032 = c1235.m2103(i4);
        int i5 = iM21032 - iM2103;
        boolean z5 = i >= 0 && (c1235.f3567[(c1235.m2118(i) * 5) + 1] & 201326592) != 0;
        c12352.m2111(iM2113);
        c12352.m2112(i5, c12352.f3569);
        if (c1235.f3582 < i4) {
            c1235.m2094(i4);
        }
        if (c1235.f3583 < iM21032) {
            c1235.m2093(iM21032, i4);
        }
        int[] iArr = c12352.f3567;
        int i6 = c12352.f3569;
        int i7 = i6 * 5;
        AbstractC4346.m8842(i7, i * 5, i4 * 5, c1235.f3567, iArr);
        Object[] objArr = c12352.f3566;
        int i8 = c12352.f3585;
        System.arraycopy(c1235.f3566, iM2103, objArr, i8, i5);
        int i9 = c12352.f3574;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iM2113;
        int iM2122 = i8 - c12352.m2122(iArr, i6);
        int i12 = c12352.f3576;
        int i13 = c12352.f3584;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iM21222 = c12352.m2122(iArr, i15) + iM2122;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = c12352.f3583;
            }
            iArr2[(i15 * 5) + 4] = C1235.m2080(iM21222, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c12352.f3576 = i14;
        int iM2131 = AbstractC1238.m2131(c1235.f3565, i, c1235.m2120());
        int iM21312 = AbstractC1238.m2131(c1235.f3565, i4, c1235.m2120());
        if (iM2131 < iM21312) {
            ArrayList arrayList = c1235.f3565;
            ArrayList arrayList2 = new ArrayList(iM21312 - iM2131);
            for (int i17 = iM2131; i17 < iM21312; i17++) {
                C1230 c1230 = (C1230) arrayList.get(i17);
                c1230.f3533 += i10;
                arrayList2.add(c1230);
            }
            c12352.f3565.addAll(AbstractC1238.m2131(c12352.f3565, c12352.f3569, c12352.m2120()), arrayList2);
            arrayList.subList(iM2131, iM21312).clear();
            list = arrayList2;
        } else {
            list = EmptyList.INSTANCE;
        }
        if (!list.isEmpty()) {
            HashMap map = c1235.f3564;
            HashMap map2 = c12352.f3564;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = c12352.f3574;
        c12352.m2086(i9);
        int iM2102 = c1235.m2102(c1235.f3567, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM2102 >= 0;
            if (z7) {
                c1235.m2087();
                c1235.m2108(iM2102 - c1235.f3569);
                c1235.m2087();
            }
            c1235.m2108(i - c1235.f3569);
            boolean zM2099 = c1235.m2099();
            if (z7) {
                c1235.m2091();
                c1235.m2125();
                c1235.m2091();
                c1235.m2125();
            }
            z4 = zM2099;
        } else {
            boolean zM2098 = c1235.m2098(i, iM2113);
            c1235.m2097(iM2103, i5, i - 1);
            z4 = zM2098;
        }
        if (z4) {
            AbstractC1374.m2497("Unexpectedly removed anchors");
        }
        int i20 = c12352.f3579;
        int i21 = iArr3[i7 + 1];
        c12352.f3579 = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            c12352.f3569 = i11;
            c12352.f3585 = i8 + i5;
        }
        if (z6) {
            c12352.m2084(i9);
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2068 m8312(C2013 c2013) {
        C2068 c2068 = c2013.f5946;
        long j = c2013.f5945;
        c2068.getClass();
        return c2068.subSequence(C2035.m3747(j), C2035.m3740(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m8313() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + AbstractC6340.f17465 + "/QStory";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m8314(InterfaceC6480 interfaceC6480, C4686 c4686) {
        c4686.getClass();
        return interfaceC6480.mo9527(c4686) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Drawable m8315(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C7807 c7807 = new C7807(context);
            c7807.f21291 = theme;
            c7807.m13143(theme.getResources().getConfiguration());
            context = c7807;
        }
        return AbstractC3054.m6607(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2068 m8316(C2013 c2013, int i) {
        C2068 c2068 = c2013.f5946;
        C2068 c20682 = c2013.f5946;
        long j = c2013.f5945;
        int iM3740 = C2035.m3740(j);
        int iM37402 = C2035.m3740(j);
        int length = iM37402 + i;
        if (((i ^ length) & (iM37402 ^ length)) < 0) {
            length = c20682.f6128.length();
        }
        return c2068.subSequence(iM3740, Math.min(length, c20682.f6128.length()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2068 m8317(C2013 c2013, int i) {
        C2068 c2068 = c2013.f5946;
        long j = c2013.f5945;
        int iM3747 = C2035.m3747(j);
        int i2 = iM3747 - i;
        if (((iM3747 ^ i2) & (i ^ iM3747)) < 0) {
            i2 = 0;
        }
        return c2068.subSequence(Math.max(0, i2), C2035.m3747(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC6477 m8318(InterfaceC6480 interfaceC6480, C4686 c4686) {
        Object next;
        c4686.getClass();
        Iterator it = interfaceC6480.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4394.m8917(((InterfaceC6477) next).mo9188(), c4686)) {
                break;
            }
        }
        return (InterfaceC6477) next;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m8319(int i) {
        switch (i) {
            case 0:
                return "fieldReader0";
            case 1:
                return "fieldReader1";
            case 2:
                return "fieldReader2";
            case 3:
                return "fieldReader3";
            case 4:
                return "fieldReader4";
            case 5:
                return "fieldReader5";
            case 6:
                return "fieldReader6";
            case 7:
                return "fieldReader7";
            case 8:
                return "fieldReader8";
            case 9:
                return "fieldReader9";
            case 10:
                return "fieldReader10";
            case 11:
                return "fieldReader11";
            case 12:
                return "fieldReader12";
            case 13:
                return "fieldReader13";
            case 14:
                return "fieldReader14";
            case 15:
                return "fieldReader15";
            default:
                char[] cArr = new char[AbstractC2848.m5711(i) + 11];
                "fieldReader".getChars(0, 11, cArr, 0);
                AbstractC2848.m5707(cArr, 11, i);
                return new String(cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Drawable m8320(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f12145) {
                return m8315(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f12145 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC7645.f20761;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m8321(String str) {
        File file = new File(m8313() + "/cache/" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC5092 m8322(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (interfaceC7190 instanceof C7193) {
            return ((C7193) interfaceC7190).f19201;
        }
        if (interfaceC7190 instanceof C7140) {
            return m8322(((C7140) interfaceC7190).f19102);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Pair m8323() {
        JSONObject jSONObjectM6316;
        try {
            jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6353.m11902("https://myip.ipip.net/json"));
        } catch (Exception unused) {
            jSONObjectM6316 = null;
        }
        if (jSONObjectM6316 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject = jSONObjectM6316.getJSONObject("data");
        JSONArray jSONArray = jSONObject.getJSONArray("location");
        String string = jSONObject.getString("ip");
        for (int i = 0; i < jSONArray.size(); i++) {
            sb.append(jSONArray.getString(i));
            if (i != jSONArray.size() - 1) {
                sb.append("-");
            }
        }
        return new Pair(string, sb.toString());
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int mo8324(int i) {
        int iMo8332 = mo8332(i);
        if (iMo8332 == -1 || mo8332(iMo8332) == -1) {
            return -1;
        }
        return iMo8332;
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public int mo8325(int i) {
        int iMo8326 = mo8326(i);
        if (iMo8326 == -1 || mo8326(iMo8326) == -1) {
            return -1;
        }
        return iMo8326;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract int mo8326(int i);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public abstract int mo8327(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract int mo8328(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract AbstractC4159 mo8329(C4141 c4141, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract int mo8330(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract int mo8331(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract int mo8332(int i);

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public int mo8333(int i) {
        return mo8332(i);
    }

    @Override // p197.InterfaceC7845
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public int mo8334(int i) {
        return mo8326(i);
    }
}
