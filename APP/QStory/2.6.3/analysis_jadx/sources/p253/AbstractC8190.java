package p253;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Build;
import android.text.InputFilter;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0753;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.runtime.AbstractC1332;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1244;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.core.view.C2242;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.compose.AbstractC2362;
import androidx.lifecycle.compose.C2363;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.android.dx.io.Opcodes;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.http.cio.C3971;
import io.ktor.http.cio.internals.C3954;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C5179;
import kotlin.C5181;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C4356;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4355;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.AbstractC4942;
import kotlin.reflect.jvm.internal.AbstractC5003;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.InterfaceC5075;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4572;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.C5435;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p034.AbstractC6344;
import p037.AbstractC6370;
import p046.InterfaceC6478;
import p046.InterfaceC6481;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p079.AbstractC7008;
import p079.AbstractC7009;
import p079.C6979;
import p101.InterfaceC7254;
import p175.AbstractC7739;
import p236.C8092;
import p236.C8093;
import p236.C8101;
import p236.C8105;
import p236.InterfaceC8102;
import p251.AbstractC8175;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8190 implements InterfaceC8102 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22564;

    public /* synthetic */ AbstractC8190(int i) {
        this.f22564 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final C5181 m13678(String str) {
        int i;
        AbstractC7739.m13083(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4395.m8905(cCharAt, 48) < 0) {
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
        return new C5181(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m13679(C8101 c8101, C8093 c8093) {
        c8101.getClass();
        c8101.f22379 = c8093.f22332;
        String str = c8093.f22329;
        str.getClass();
        c8101.f22382 = str;
        c8101.m13570(c8093.m13567());
        AbstractC8175.m13627(c8101, (String) c8093.f22337.getValue());
        c8101.f22378 = (String) c8093.f22335.getValue();
        c8101.f22377 = (String) c8093.f22331.getValue();
        C8105 c8105 = new C8105(2);
        c8105.m2425(AbstractC7739.m13061(0, 6, (String) c8093.f22334.getValue()));
        c8101.f22385 = c8105;
        c8101.f22386 = new C8092(c8105);
        String str2 = (String) c8093.f22330.getValue();
        str2.getClass();
        c8101.f22384 = str2;
        c8101.f22381 = c8093.f22325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static long m13680(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            C5925.m11314(AbstractC6183.m11591(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            C5925.m11309(AbstractC0053.m150(length, "endIndex > string.length: ", " > "), str.length());
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
    public static final long m13681(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final boolean m13682(String str, InterfaceC6543 interfaceC6543) {
        try {
            boolean zBooleanValue = ((Boolean) interfaceC6543.invoke()).booleanValue();
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
    public static final C5179 m13683(String str) {
        str.getClass();
        AbstractC7739.m13083(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC4395.m8905(cCharAt, 48) < 0) {
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
        return new C5179(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static InterfaceC6478 m13684(InterfaceC6481 interfaceC6481, C4687 c4687) {
        Object next;
        c4687.getClass();
        Iterator it = interfaceC6481.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4395.m8907(((InterfaceC6478) next).mo9178(), c4687)) {
                break;
            }
        }
        return (InterfaceC6478) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p077.C6970 m13685(java.lang.Class r15) throws java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p253.AbstractC8190.m13685(java.lang.Class):飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ArrayList m13686(ArrayList arrayList, List list, InterfaceC4484 interfaceC4484) {
        AbstractC4882 abstractC4882M12024;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<Pair> arrayListM8821 = AbstractC4344.m8821(arrayList, list);
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayListM8821, 10));
        for (Pair pair : arrayListM8821) {
            AbstractC4882 abstractC4882 = (AbstractC4882) pair.component1();
            Object obj = (InterfaceC4456) pair.component2();
            int i = ((C6979) obj).f18674;
            InterfaceC6481 annotations = ((AbstractC1332) obj).getAnnotations();
            C4691 name = ((AbstractC7009) obj).getName();
            name.getClass();
            C6979 c6979 = (C6979) obj;
            boolean zM12290 = c6979.m12290();
            boolean z = c6979.f18672;
            boolean z2 = c6979.f18673;
            if (c6979.f18671 != null) {
                int i2 = AbstractC4773.f13909;
                InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(interfaceC4484);
                interfaceC4486M12104.getClass();
                abstractC4882M12024 = interfaceC4486M12104.mo9061().m12024(abstractC4882);
            } else {
                abstractC4882M12024 = null;
            }
            AbstractC4882 abstractC48822 = abstractC4882M12024;
            InterfaceC4462 interfaceC4462Mo9026 = ((AbstractC7008) obj).mo9026();
            interfaceC4462Mo9026.getClass();
            arrayList2.add(new C6979(interfaceC4484, null, i, annotations, name, abstractC4882, zM12290, z, z2, abstractC48822, interfaceC4462Mo9026));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Bitmap m13687(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = AbstractC1581.m2873(AbstractC1581.m2881(i2 & Opcodes.CONST_METHOD_TYPE, (i2 >> 8) & Opcodes.CONST_METHOD_TYPE, (i2 >> 16) & Opcodes.CONST_METHOD_TYPE, (i2 >> 24) & Opcodes.CONST_METHOD_TYPE));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13688(InterfaceC2388 interfaceC2388, C2363 c2363, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(228371534);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(interfaceC2388) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(c2363) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(interfaceC6558) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            boolean zM2378 = c1324.m2378(c2363) | ((i2 & 896) == 256) | c1324.m2378(interfaceC2388);
            Object objM2345 = c1324.m2345();
            if (zM2378 || objM2345 == C1369.f3974) {
                objM2345 = new C0756(interfaceC2388, c2363, interfaceC6558, 5);
                c1324.m2386(objM2345);
            }
            AbstractC1367.m2485(interfaceC2388, c2363, (InterfaceC6558) objM2345, c1324);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(interfaceC2388, c2363, interfaceC6558, i, 6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13689(Boolean bool, Object obj, InterfaceC2388 interfaceC2388, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(696924721);
        if ((i & 6) == 0) {
            i2 = (c1324.m2378(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2378(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2378(interfaceC6558) ? 2048 : 1024;
        }
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            c1324.m2341();
            if ((i & 1) == 0 || c1324.m2353()) {
                interfaceC2388 = (InterfaceC2388) c1324.m2383(AbstractC2362.f6993);
            } else {
                c1324.m2339();
            }
            int i3 = i2 & (-897);
            c1324.m2374();
            boolean zM2360 = c1324.m2360(bool) | c1324.m2360(obj) | c1324.m2360(interfaceC2388);
            Object objM2345 = c1324.m2345();
            if (zM2360 || objM2345 == C1369.f3974) {
                objM2345 = new C2363(interfaceC2388.getLifecycle());
                c1324.m2386(objM2345);
            }
            m13688(interfaceC2388, (C2363) objM2345, interfaceC6558, c1324, (i3 >> 3) & 896);
        } else {
            c1324.m2339();
        }
        InterfaceC2388 interfaceC23882 = interfaceC2388;
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1244(bool, obj, interfaceC23882, interfaceC6558, i, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static InterfaceC4360 m13690(InterfaceC4355 interfaceC4355, InterfaceC4361 interfaceC4361) {
        interfaceC4361.getClass();
        if (!(interfaceC4361 instanceof C5435)) {
            return C4356.f12936 == interfaceC4361 ? EmptyCoroutineContext.INSTANCE : interfaceC4355;
        }
        C5435 c5435 = (C5435) interfaceC4361;
        InterfaceC4361 key = interfaceC4355.getKey();
        key.getClass();
        return ((key == c5435 || c5435.f15083 == key) && ((InterfaceC4354) c5435.f15084.invoke(interfaceC4355)) != null) ? EmptyCoroutineContext.INSTANCE : interfaceC4355;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Typeface m13691(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC6344.m11887(configuration.fontWeightAdjustment + typeface.getWeight(), 1, DescriptorProtos$Edition.EDITION_2023_VALUE), typeface.isItalic());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static String m13692(String str, boolean z) {
        if (!z) {
            return AbstractC0053.m158("\"", str, "\"");
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
    public static String m13693(String str, boolean z) {
        int i;
        char c = '$';
        if (str.indexOf(36) < 0) {
            return m13692(str, z);
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
                                int iM13703 = m13703(i9 + 1, str);
                                if (iM13703 < 0) {
                                    break;
                                }
                                i9 = iM13703 + 1;
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
                                arrayList.add(m13692(strSubstring, z));
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
                            arrayList.add(m13692(strSubstring2, z));
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
            return m13692(str, z);
        }
        String strSubstring3 = str.substring(i3);
        if (!strSubstring3.isEmpty()) {
            arrayList.add(m13692(strSubstring3, z));
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
    public static C3971 m13694(C3954 c3954) {
        int i;
        C3971 c3971 = null;
        if (c3954 == null) {
            return null;
        }
        int i2 = 9;
        List listM4141 = C2242.m4141(C3971.f12210, c3954, 0, 0, new C0753(i2), 6);
        if (listM4141.size() == 1) {
            return (C3971) ((Pair) listM4141.get(0)).getSecond();
        }
        int length = c3954.length();
        ArrayList arrayList = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                char cCharAt = c3954.charAt(i3);
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
                char cCharAt2 = c3954.charAt(i);
                if (cCharAt2 == ' ' || cCharAt2 == ',') {
                    break;
                }
                i++;
            }
            Pair pair = (Pair) AbstractC4344.m8781(C3971.f12210.m4143(c3954, i4, i, true, new C0753(i2)));
            if (pair == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3954.subSequence(i4, i).toString());
            } else if (c3971 == null) {
                c3971 = (C3971) pair.getSecond();
            } else {
                i3 = i;
                c3971 = new C3971(c3971.f12215 || ((C3971) pair.getSecond()).f12215, c3971.f12214 || ((C3971) pair.getSecond()).f12214, c3971.f12213 || ((C3971) pair.getSecond()).f12213, EmptyList.INSTANCE);
            }
            i3 = i;
        }
        if (c3971 == null) {
            c3971 = C3971.f12211;
        }
        return arrayList == null ? c3971 : new C3971(c3971.f12215, c3971.f12214, c3971.f12213, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final long m13695(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4572 m13696(AbstractC6989 abstractC6989) {
        AbstractC6989 abstractC69892;
        InterfaceC4477 interfaceC4477Mo9211;
        abstractC6989.getClass();
        int i = AbstractC4773.f13909;
        Iterator it = abstractC6989.mo9025().mo9722().mo9494().iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC69892 = null;
                break;
            }
            AbstractC4882 abstractC4882 = (AbstractC4882) it.next();
            if (!AbstractC6530.m12022(abstractC4882)) {
                interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
                int i2 = AbstractC6870.f18312;
                if (AbstractC6870.m12116(interfaceC4477Mo9211, ClassKind.CLASS) || AbstractC6870.m12116(interfaceC4477Mo9211, ClassKind.ENUM_CLASS)) {
                    break;
                }
            }
        }
        interfaceC4477Mo9211.getClass();
        abstractC69892 = (AbstractC6989) interfaceC4477Mo9211;
        if (abstractC69892 == null) {
            return null;
        }
        InterfaceC7254 interfaceC7254Mo9006 = abstractC69892.mo9006();
        C4572 c4572 = interfaceC7254Mo9006 instanceof C4572 ? (C4572) interfaceC7254Mo9006 : null;
        return c4572 == null ? m13696(abstractC69892) : c4572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final String m13697(C8093 c8093) {
        StringBuilder sb = new StringBuilder();
        String str = (String) c8093.f22337.getValue();
        String str2 = (String) c8093.f22334.getValue();
        boolean z = c8093.f22325;
        str.getClass();
        str2.getClass();
        if (!AbstractC5144.m10172(str) && !AbstractC5139.m10139(str, "/", false)) {
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
    public static final boolean m13698(InterfaceC5075 interfaceC5075) {
        interfaceC5075.getClass();
        return AbstractC5003.f14422.matches(interfaceC5075.getSignature());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m13699(int i, String str) {
        int i2 = i + 2;
        return i2 < str.length() && str.charAt(i) == '\"' && str.charAt(i + 1) == '\"' && str.charAt(i2) == '\"';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m13700(InterfaceC6481 interfaceC6481, C4687 c4687) {
        c4687.getClass();
        return interfaceC6481.mo9517(c4687) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m13701(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC4354 m13702(InterfaceC4355 interfaceC4355, InterfaceC4361 interfaceC4361) {
        InterfaceC4354 interfaceC4354;
        interfaceC4361.getClass();
        if (interfaceC4361 instanceof C5435) {
            C5435 c5435 = (C5435) interfaceC4361;
            InterfaceC4361 key = interfaceC4355.getKey();
            key.getClass();
            if ((key == c5435 || c5435.f15083 == key) && (interfaceC4354 = (InterfaceC4354) c5435.f15084.invoke(interfaceC4355)) != null) {
                return interfaceC4354;
            }
        } else if (C4356.f12936 == interfaceC4361) {
            return interfaceC4355;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m13703(int i, String str) {
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
    public static final Object m13704(InterfaceC5075 interfaceC5075, Member member, Object obj, Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            AbstractC4942.f14302.getClass();
            Object obj3 = AbstractC4942.f14303;
            if (obj == obj3 || obj2 == obj3) {
                List parameters = interfaceC5075.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC5108) it.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                        }
                    }
                }
                throw new RuntimeException('\'' + interfaceC5075 + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objM10049 = AbstractC5062.m10042(interfaceC5075) ? AbstractC5062.m10049(interfaceC5075) : obj;
            AbstractC4942.f14302.getClass();
            Object obj4 = AbstractC4942.f14303;
            if (objM10049 == obj4) {
                objM10049 = null;
            }
            if (!AbstractC5062.m10042(interfaceC5075)) {
                obj = obj2;
            }
            if (obj == obj4) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(AbstractC5081.m10099(interfaceC5075));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objM10049);
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
                if (objM10049 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    cls.getClass();
                    objM10049 = AbstractC5067.m10061(cls);
                }
                return method.invoke(null, objM10049);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                cls2.getClass();
                obj = AbstractC5067.m10061(cls2);
            }
            return method2.invoke(null, objM10049, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final long m13705(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static android.util.Pair m13706() {
        JSONObject jSONObjectM6374;
        try {
            jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6370.m11950(AbstractC8405.m13972(1236)));
        } catch (Exception unused) {
            jSONObjectM6374 = null;
        }
        if (jSONObjectM6374 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        JSONObject jSONObject = jSONObjectM6374.getJSONObject(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
        JSONArray jSONArray = jSONObject.getJSONArray(AbstractC8405.m13972(1235));
        String string = jSONObject.getString(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵呜喵呜"));
        for (int i = 0; i < jSONArray.size(); i++) {
            sb.append(jSONArray.getString(i));
            if (i != jSONArray.size() - 1) {
                sb.append(AbstractC8405.m13973("喵呜喵呜呜呜呜喵"));
            }
        }
        return new android.util.Pair(string, sb.toString());
    }

    public int hashCode() {
        switch (this.f22564) {
            case 12:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f22564) {
            case 12:
                String simpleName = AbstractC4396.f12975.mo8917(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract void mo12986(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract void mo12987(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public abstract InputFilter[] mo12989(InputFilter[] inputFilterArr);
}
