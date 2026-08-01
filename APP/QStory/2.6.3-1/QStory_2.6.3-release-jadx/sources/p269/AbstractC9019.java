package p269;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.runtime.AbstractC2167;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2079;
import androidx.core.view.C3075;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.compose.AbstractC3195;
import androidx.lifecycle.compose.C3196;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.http.cio.C4803;
import io.ktor.http.cio.internals.C4786;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C6011;
import kotlin.C6013;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C5188;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5187;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.AbstractC5774;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.InterfaceC5907;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5404;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.C6267;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7173;
import p053.AbstractC7199;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p083.AbstractC7719;
import p086.C7727;
import p088.C7748;
import p088.C7750;
import p088.C7752;
import p093.C7799;
import p095.AbstractC7818;
import p095.AbstractC7837;
import p095.AbstractC7838;
import p095.C7808;
import p117.InterfaceC8083;
import p191.AbstractC8568;
import p252.C8921;
import p252.C8922;
import p252.C8930;
import p252.C8934;
import p252.InterfaceC8931;
import p267.AbstractC9004;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9019 implements InterfaceC8931 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22909;

    public /* synthetic */ AbstractC9019(int i) {
        this.f22909 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C6013 m14237(String str) {
        int i;
        AbstractC8568.m13642(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC5227.m9464(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C6013(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m14238(C8930 c8930, C8922 c8922) {
        c8930.getClass();
        c8930.f22724 = c8922.f22677;
        String str = c8922.f22674;
        str.getClass();
        c8930.f22727 = str;
        c8930.m14129(c8922.m14126());
        AbstractC9004.m14186(c8930, (String) c8922.f22682.getValue());
        c8930.f22723 = (String) c8922.f22680.getValue();
        c8930.f22722 = (String) c8922.f22676.getValue();
        C8934 c8934 = new C8934(2);
        c8934.m2985(AbstractC8568.m13620(0, 6, (String) c8922.f22679.getValue()));
        c8930.f22730 = c8934;
        c8930.f22731 = new C8921(c8934);
        String str2 = (String) c8922.f22675.getValue();
        str2.getClass();
        c8930.f22729 = str2;
        c8930.f22726 = c8922.f22670;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static long m14239(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            C6755.m11873(AbstractC7012.m12150(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            C6755.m11868(AbstractC0900.m710(length, "endIndex > string.length: ", " > "), str.length());
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final long m14240(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final boolean m14241(String str, InterfaceC7372 interfaceC7372) {
        try {
            boolean zBooleanValue = ((Boolean) interfaceC7372.invoke()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final C6011 m14242(String str) {
        str.getClass();
        AbstractC8568.m13642(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC5227.m9464(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new C6011(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC7307 m14243(InterfaceC7310 interfaceC7310, C5519 c5519) {
        Object next;
        c5519.getClass();
        Iterator it = interfaceC7310.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(((InterfaceC7307) next).mo9737(), c5519)) {
                break;
            }
        }
        return (InterfaceC7307) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7799 m14244(Class cls) throws InvocationTargetException {
        C7752 c7752;
        C7750 c7750;
        KotlinClassHeader$Kind kotlinClassHeader$Kind;
        cls.getClass();
        C7748 c7748 = new C7748();
        c7748.f18806 = null;
        c7748.f18804 = null;
        int i = 0;
        c7748.f18805 = 0;
        c7748.f18800 = null;
        c7748.f18799 = null;
        c7748.f18802 = null;
        c7748.f18803 = null;
        c7748.f18801 = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        int length = declaredAnnotations.length;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                break;
            }
            Annotation annotation = declaredAnnotations[i2];
            annotation.getClass();
            Class clsM7316 = AbstractC3889.m7316(AbstractC3889.m7319(annotation));
            C5520 c5520M9536 = AbstractC5263.m9536(clsM7316);
            C5519 c5519M9886 = c5520M9536.m9886();
            if (c5519M9886.equals(AbstractC5447.f13830)) {
                c7750 = new C7750(c7748, i);
            } else if (c5519M9886.equals(AbstractC5447.f13834)) {
                c7750 = new C7750(c7748, i3);
            } else if (C7748.f18798 || c7748.f18803 != null || (kotlinClassHeader$Kind = (KotlinClassHeader$Kind) C7748.f18797.get(c5520M9536)) == null) {
                c7750 = null;
            } else {
                c7748.f18803 = kotlinClassHeader$Kind;
                c7750 = new C7750(c7748, 2);
            }
            if (c7750 != null) {
                AbstractC9004.m14188(c7750, annotation, clsM7316);
            }
            i2++;
        }
        C7727 c7727 = C7727.f18701;
        if (c7748.f18803 == null || c7748.f18806 == null) {
            c7752 = null;
        } else {
            C7727 c77272 = new C7727(c7748.f18806, (c7748.f18805 & 8) != 0);
            c7727.getClass();
            C7727 c77273 = c77272.f18702 ? c7727 : C7727.f18700;
            int i4 = c77273.f18755;
            int i5 = c7727.f18755;
            if (i4 > i5 || (i4 >= i5 && c77273.f18754 > c7727.f18754)) {
                c7727 = c77273;
            }
            int i6 = c77272.f18754;
            int i7 = c77272.f18755;
            if ((i7 != 1 || i6 != 0) && i7 != 0) {
                int i8 = c7727.f18755;
                if (i7 > i8 || (i7 >= i8 && i6 > c7727.f18754)) {
                    i = 1;
                }
                i ^= 1;
            }
            if (i == 0) {
                c7748.f18802 = c7748.f18800;
                c7748.f18800 = null;
            } else {
                KotlinClassHeader$Kind kotlinClassHeader$Kind2 = c7748.f18803;
                if ((kotlinClassHeader$Kind2 == KotlinClassHeader$Kind.CLASS || kotlinClassHeader$Kind2 == KotlinClassHeader$Kind.FILE_FACADE || kotlinClassHeader$Kind2 == KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) && c7748.f18800 == null) {
                }
            }
            String[] strArr = c7748.f18801;
            if (strArr != null) {
                AbstractC7719.m12722(strArr);
            }
            c7752 = new C7752(c7748.f18803, c77272, c7748.f18800, c7748.f18802, c7748.f18799, c7748.f18804, c7748.f18805);
        }
        if (c7752 == null) {
            return null;
        }
        return new C7799(cls, c7752);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m14245(ArrayList arrayList, List list, InterfaceC5316 interfaceC5316) {
        AbstractC5714 abstractC5714M12583;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<Pair> arrayListM9380 = AbstractC5176.m9380(arrayList, list);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayListM9380, 10));
        for (Pair pair : arrayListM9380) {
            AbstractC5714 abstractC5714 = (AbstractC5714) pair.component1();
            Object obj = (InterfaceC5288) pair.component2();
            int i = ((C7808) obj).f19019;
            InterfaceC7310 annotations = ((AbstractC2167) obj).getAnnotations();
            C5523 name = ((AbstractC7838) obj).getName();
            name.getClass();
            C7808 c7808 = (C7808) obj;
            boolean zM12849 = c7808.m12849();
            boolean z = c7808.f19017;
            boolean z2 = c7808.f19018;
            if (c7808.f19016 != null) {
                int i2 = AbstractC5605.f14254;
                InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(interfaceC5316);
                interfaceC5318M12663.getClass();
                abstractC5714M12583 = interfaceC5318M12663.mo9620().m12583(abstractC5714);
            } else {
                abstractC5714M12583 = null;
            }
            AbstractC5714 abstractC57142 = abstractC5714M12583;
            InterfaceC5294 interfaceC5294Mo9585 = ((AbstractC7837) obj).mo9585();
            interfaceC5294Mo9585.getClass();
            arrayList2.add(new C7808(interfaceC5316, null, i, annotations, name, abstractC5714, zM12849, z, z2, abstractC57142, interfaceC5294Mo9585));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Bitmap m14246(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = AbstractC2416.m3433(AbstractC2416.m3441(i2 & Opcodes.CONST_METHOD_TYPE, (i2 >> 8) & Opcodes.CONST_METHOD_TYPE, (i2 >> 16) & Opcodes.CONST_METHOD_TYPE, (i2 >> 24) & Opcodes.CONST_METHOD_TYPE));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m14247(InterfaceC3221 interfaceC3221, C3196 c3196, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(228371534);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(interfaceC3221) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(c3196) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(interfaceC7387) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            boolean zM2938 = c2159.m2938(c3196) | ((i2 & 896) == 256) | c2159.m2938(interfaceC3221);
            Object objM2905 = c2159.m2905();
            if (zM2938 || objM2905 == C2204.f4319) {
                objM2905 = new C1597(interfaceC3221, c3196, interfaceC7387, 5);
                c2159.m2946(objM2905);
            }
            AbstractC2202.m3045(interfaceC3221, c3196, (InterfaceC7387) objM2905, c2159);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(interfaceC3221, c3196, interfaceC7387, i, 6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14248(Boolean bool, Object obj, InterfaceC3221 interfaceC3221, InterfaceC7387 interfaceC7387, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(696924721);
        if ((i & 6) == 0) {
            i2 = (c2159.m2938(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2938(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2938(interfaceC7387) ? 2048 : 1024;
        }
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                interfaceC3221 = (InterfaceC3221) c2159.m2943(AbstractC3195.f7338);
            } else {
                c2159.m2899();
            }
            int i3 = i2 & (-897);
            c2159.m2934();
            boolean zM2920 = c2159.m2920(bool) | c2159.m2920(obj) | c2159.m2920(interfaceC3221);
            Object objM2905 = c2159.m2905();
            if (zM2920 || objM2905 == C2204.f4319) {
                objM2905 = new C3196(interfaceC3221.getLifecycle());
                c2159.m2946(objM2905);
            }
            m14247(interfaceC3221, (C3196) objM2905, interfaceC7387, c2159, (i3 >> 3) & 896);
        } else {
            c2159.m2899();
        }
        InterfaceC3221 interfaceC32212 = interfaceC3221;
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C2079(bool, obj, interfaceC32212, interfaceC7387, i, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static InterfaceC5192 m14249(InterfaceC5187 interfaceC5187, InterfaceC5193 interfaceC5193) {
        interfaceC5193.getClass();
        if (!(interfaceC5193 instanceof C6267)) {
            return C5188.f13281 == interfaceC5193 ? EmptyCoroutineContext.INSTANCE : interfaceC5187;
        }
        C6267 c6267 = (C6267) interfaceC5193;
        InterfaceC5193 key = interfaceC5187.getKey();
        key.getClass();
        return ((key == c6267 || c6267.f15428 == key) && ((InterfaceC5186) c6267.f15429.invoke(interfaceC5187)) != null) ? EmptyCoroutineContext.INSTANCE : interfaceC5187;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Typeface m14250(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC7173.m12446(configuration.fontWeightAdjustment + typeface.getWeight(), 1, DescriptorProtos$Edition.EDITION_2023_VALUE), typeface.isItalic());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static String m14251(String str, boolean z) {
        if (!z) {
            return AbstractC0900.m718("\"", str, "\"");
        }
        StringBuilder sb = new StringBuilder("\"");
        StringBuilder sb2 = new StringBuilder(str.length() + 16);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb2.append("\\f");
            } else if (cCharAt == '\r') {
                sb2.append("\\r");
            } else if (cCharAt == '\"') {
                sb2.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(cCharAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb.append(sb2.toString());
        sb.append("\"");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String m14252(String str, boolean z) {
        int i;
        char c = '$';
        if (str.indexOf(36) < 0) {
            return m14251(str, z);
        }
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < length) {
            if (str.charAt(i2) == c) {
                char c2 = '\\';
                if (!z) {
                    int i4 = 0;
                    for (int i5 = i2 - 1; i5 >= 0 && str.charAt(i5) == '\\'; i5--) {
                        i4++;
                    }
                    if ((i4 & 1) == 1) {
                    }
                }
                int i6 = i2 + 1;
                if (i6 < length) {
                    char cCharAt = str.charAt(i6);
                    if (cCharAt == '{') {
                        int i7 = i2 + 2;
                        int length2 = str.length();
                        int i8 = 1;
                        int i9 = i7;
                        while (i9 < length2) {
                            char cCharAt2 = str.charAt(i9);
                            if (cCharAt2 == '\"') {
                                while (true) {
                                    i9++;
                                    if (i9 >= str.length()) {
                                        i9 = -1;
                                        break;
                                    }
                                    char cCharAt3 = str.charAt(i9);
                                    if (cCharAt3 != c2) {
                                        if (cCharAt3 == '\"') {
                                            break;
                                        }
                                    } else {
                                        i9++;
                                    }
                                }
                                if (i9 < 0) {
                                    break;
                                }
                                i9++;
                            } else if (cCharAt2 == '\'') {
                                int iM14262 = m14262(i9 + 1, str);
                                if (iM14262 < 0) {
                                    break;
                                }
                                i9 = iM14262 + 1;
                            } else {
                                if (cCharAt2 == '/' && (i = i9 + 1) < length2) {
                                    char cCharAt4 = str.charAt(i);
                                    if (cCharAt4 == '/') {
                                        i9 += 2;
                                        while (i9 < length2) {
                                            char cCharAt5 = str.charAt(i9);
                                            if (cCharAt5 == '\n' || cCharAt5 == '\r') {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        char c3 = TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH;
                                        if (cCharAt4 == '*') {
                                            int i10 = i9 + 2;
                                            while (true) {
                                                int i11 = i10 + 1;
                                                if (i11 >= str.length()) {
                                                    i10 = -1;
                                                    break;
                                                }
                                                if (str.charAt(i10) == c3 && str.charAt(i11) == '/') {
                                                    break;
                                                }
                                                i10 = i11;
                                                c3 = TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH;
                                            }
                                            if (i10 < 0) {
                                                break;
                                            }
                                            i9 = i10 + 2;
                                        }
                                    }
                                    c2 = '\\';
                                }
                                if (cCharAt2 == '{') {
                                    i8++;
                                } else if (cCharAt2 == '}' && i8 - 1 == 0) {
                                    break;
                                }
                                i9++;
                                c2 = '\\';
                            }
                        }
                        i9 = -1;
                        if (i9 < 0) {
                            i2 = i6;
                        } else {
                            String strSubstring = str.substring(i3, i2);
                            if (!strSubstring.isEmpty()) {
                                arrayList.add(m14251(strSubstring, z));
                            }
                            arrayList.add("String.valueOf(" + str.substring(i7, i9).trim() + ")");
                            i3 = i9 + 1;
                            i2 = i3;
                            z2 = true;
                        }
                        c = '$';
                    } else if (cCharAt != c && Character.isJavaIdentifierStart(cCharAt)) {
                        int i12 = i2 + 2;
                        while (i12 < length) {
                            char cCharAt6 = str.charAt(i12);
                            if (cCharAt6 == c || !Character.isJavaIdentifierPart(cCharAt6)) {
                                break;
                            }
                            i12++;
                        }
                        String strSubstring2 = str.substring(i3, i2);
                        if (!strSubstring2.isEmpty()) {
                            arrayList.add(m14251(strSubstring2, z));
                        }
                        arrayList.add("String.valueOf(" + str.substring(i6, i12) + ")");
                        i2 = i12;
                        i3 = i2;
                        z2 = true;
                    }
                }
                i2 = i6;
            }
            i2++;
        }
        if (!z2) {
            return m14251(str, z);
        }
        String strSubstring3 = str.substring(i3);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m14251(strSubstring3, z));
        }
        if (arrayList.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder("(");
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (i13 > 0) {
                sb2.append(" + ");
            }
            sb2.append((String) arrayList.get(i13));
        }
        sb.append(sb2.toString());
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C4803 m14253(C4786 c4786) {
        int i;
        C4803 c4803 = null;
        if (c4786 == null) {
            return null;
        }
        int i2 = 9;
        List listM4701 = C3075.m4701(C4803.f12555, c4786, 0, 0, new C1594(i2), 6);
        if (listM4701.size() == 1) {
            return (C4803) ((Pair) listM4701.get(0)).getSecond();
        }
        int length = c4786.length();
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                char cCharAt = c4786.charAt(i3);
                if (cCharAt != ' ' && cCharAt != ',') {
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3++;
                if (i3 >= length) {
                    i = i3;
                    break;
                }
            }
            while (i < length) {
                char cCharAt2 = c4786.charAt(i);
                if (cCharAt2 == ' ' || cCharAt2 == ',') {
                    break;
                }
                i++;
            }
            Pair pair = (Pair) AbstractC5176.m9340(C4803.f12555.m4703(c4786, i4, i, true, new C1594(i2)));
            if (pair == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4786.subSequence(i4, i).toString());
            } else if (c4803 == null) {
                c4803 = (C4803) pair.getSecond();
            } else {
                i3 = i;
                c4803 = new C4803(c4803.f12560 || ((C4803) pair.getSecond()).f12560, c4803.f12559 || ((C4803) pair.getSecond()).f12559, c4803.f12558 || ((C4803) pair.getSecond()).f12558, EmptyList.INSTANCE);
            }
            i3 = i;
        }
        if (c4803 == null) {
            c4803 = C4803.f12556;
        }
        return arrayList == null ? c4803 : new C4803(c4803.f12560, c4803.f12559, c4803.f12558, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final long m14254(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C5404 m14255(AbstractC7818 abstractC7818) {
        AbstractC7818 abstractC78182;
        InterfaceC5309 interfaceC5309Mo9770;
        abstractC7818.getClass();
        int i = AbstractC5605.f14254;
        Iterator it = abstractC7818.mo9584().mo10281().mo10053().iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC78182 = null;
                break;
            }
            AbstractC5714 abstractC5714 = (AbstractC5714) it.next();
            if (!AbstractC7359.m12581(abstractC5714)) {
                interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
                int i2 = AbstractC7699.f18657;
                if (AbstractC7699.m12675(interfaceC5309Mo9770, ClassKind.CLASS) || AbstractC7699.m12675(interfaceC5309Mo9770, ClassKind.ENUM_CLASS)) {
                    break;
                }
            }
        }
        interfaceC5309Mo9770.getClass();
        abstractC78182 = (AbstractC7818) interfaceC5309Mo9770;
        if (abstractC78182 == null) {
            return null;
        }
        InterfaceC8083 interfaceC8083Mo9565 = abstractC78182.mo9565();
        C5404 c5404 = interfaceC8083Mo9565 instanceof C5404 ? (C5404) interfaceC8083Mo9565 : null;
        return c5404 == null ? m14255(abstractC78182) : c5404;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m14256(C8922 c8922) {
        StringBuilder sb = new StringBuilder();
        String str = (String) c8922.f22682.getValue();
        String str2 = (String) c8922.f22679.getValue();
        boolean z = c8922.f22670;
        str.getClass();
        str2.getClass();
        if (!AbstractC5976.m10731(str) && !AbstractC5971.m10698(str, "/", false)) {
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
    public static final boolean m14257(InterfaceC5907 interfaceC5907) {
        interfaceC5907.getClass();
        return AbstractC5835.f14767.matches(interfaceC5907.getSignature());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m14258(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m14259(InterfaceC7310 interfaceC7310, C5519 c5519) {
        c5519.getClass();
        return interfaceC7310.mo10076(c5519) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m14260(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC5186 m14261(InterfaceC5187 interfaceC5187, InterfaceC5193 interfaceC5193) {
        InterfaceC5186 interfaceC5186;
        interfaceC5193.getClass();
        if (interfaceC5193 instanceof C6267) {
            C6267 c6267 = (C6267) interfaceC5193;
            InterfaceC5193 key = interfaceC5187.getKey();
            key.getClass();
            if ((key == c6267 || c6267.f15428 == key) && (interfaceC5186 = (InterfaceC5186) c6267.f15429.invoke(interfaceC5187)) != null) {
                return interfaceC5186;
            }
        } else if (C5188.f13281 == interfaceC5193) {
            return interfaceC5187;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m14262(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
            } else {
                if (cCharAt == '\'') {
                    return i;
                }
                if (cCharAt == '\n' || cCharAt == '\r') {
                    return -1;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m14263(InterfaceC5907 interfaceC5907, Member member, Object obj, Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            AbstractC5774.f14647.getClass();
            Object obj3 = AbstractC5774.f14648;
            if (obj == obj3 || obj2 == obj3) {
                List parameters = interfaceC5907.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC5940) it.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                        }
                    }
                }
                throw new RuntimeException('\'' + interfaceC5907 + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM10608 = AbstractC5894.m10601(interfaceC5907) ? AbstractC5894.m10608(interfaceC5907) : obj;
            AbstractC5774.f14647.getClass();
            Object obj4 = AbstractC5774.f14648;
            if (objM10608 == obj4) {
                objM10608 = null;
            }
            if (!AbstractC5894.m10601(interfaceC5907)) {
                obj = obj2;
            }
            if (obj == obj4) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC5913.m10658(interfaceC5907));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objM10608);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objM10608 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objM10608 = AbstractC5899.m10620(cls);
                }
                return method.invoke(null, objM10608);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                obj = AbstractC5899.m10620(cls2);
            }
            return method2.invoke(null, objM10608, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m14264(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static android.util.Pair m14265() {
        JSONObject jSONObjectM6934;
        try {
            jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7199.m12509(AbstractC9234.m14531(1236)));
        } catch (Exception unused) {
            jSONObjectM6934 = null;
        }
        if (jSONObjectM6934 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject = jSONObjectM6934.getJSONObject(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
        JSONArray jSONArray = jSONObject.getJSONArray(AbstractC9234.m14531(1235));
        String string = jSONObject.getString(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵呜喵呜"));
        for (int i = 0; i < jSONArray.size(); i++) {
            sb.append(jSONArray.getString(i));
            if (i != jSONArray.size() - 1) {
                sb.append(AbstractC9234.m14532("喵呜喵呜呜呜呜喵"));
            }
        }
        return new android.util.Pair(string, sb.toString());
    }

    public int hashCode() {
        switch (this.f22909) {
            case 12:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f22909) {
            case 12:
                String simpleName = AbstractC5228.f13320.mo9476(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo13545(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo13546(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract InputFilter[] mo13548(InputFilter[] inputFilterArr);
}
