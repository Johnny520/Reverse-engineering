package io.ktor.client.plugins;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0984;
import androidx.appcompat.widget.C1018;
import androidx.compose.foundation.C1905;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.composer.gapbuffer.AbstractC2073;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.concurrent.futures.AbstractFutureC2976;
import androidx.concurrent.futures.C2969;
import androidx.concurrent.futures.C2972;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.server.application.C4890;
import io.ktor.server.routing.C4990;
import io.ktor.util.C5043;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.p008io.C5212;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5867;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.AbstractC5904;
import kotlin.reflect.jvm.internal.C5820;
import kotlin.reflect.jvm.internal.C5824;
import kotlin.reflect.jvm.internal.C5825;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5848;
import kotlin.reflect.jvm.internal.C5862;
import kotlin.reflect.jvm.internal.C5890;
import kotlin.reflect.jvm.internal.C5902;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5522;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5380;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5388;
import kotlin.reflect.jvm.internal.impl.p009km.C5363;
import kotlin.reflect.jvm.internal.impl.p009km.C5364;
import kotlin.reflect.jvm.internal.impl.p009km.C5365;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5371;
import kotlin.reflect.jvm.internal.impl.p009km.C5372;
import kotlin.reflect.jvm.internal.impl.p009km.C5373;
import kotlin.reflect.jvm.internal.impl.p009km.C5374;
import kotlin.reflect.jvm.internal.impl.p009km.C5375;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.C5384;
import kotlin.reflect.jvm.internal.impl.p009km.C5392;
import kotlin.reflect.jvm.internal.impl.p009km.KmVariance;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5346;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5347;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5349;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5350;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5352;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5353;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5354;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5759;
import kotlin.reflect.jvm.internal.types.C5761;
import kotlin.reflect.jvm.internal.types.C5771;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.pool.TypePool;
import net.bytebuddy.utility.JavaConstant;
import org.apache.commons.compress.archivers.zip.C6415;
import org.apache.commons.compress.archivers.zip.C6423;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C6557;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p052.AbstractC7187;
import p068.InterfaceC7372;
import p086.C7727;
import p086.InterfaceC7737;
import p093.C7799;
import p101.C7888;
import p102.C7892;
import p103.C7971;
import p105.InterfaceC8013;
import p117.C8084;
import p117.InterfaceC8083;
import p119.C8103;
import p180.AbstractC8495;
import p268.AbstractC9016;
import p315.AbstractC9428;
import p332.C9496;
import p380.C9769;
import p392.AbstractC9814;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ResourcesLoader f12495;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m8848(String str, String str2) throws Exception {
        C6423 c6423;
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            throw new Exception("创建解压目标文件夹失败");
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                c6423 = new C6423(bufferedInputStream);
            } finally {
            }
            while (true) {
                try {
                    C6415 c6415M11516 = c6423.m11516();
                    if (c6415M11516 == null) {
                        c6423.close();
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    String str3 = str2 + File.separator + c6415M11516.getName();
                    if (c6415M11516.isDirectory()) {
                        m8856(new File(str3));
                    } else {
                        m8856(new File(str3).getParentFile());
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                        try {
                            AbstractC9814.m15145(c6423, bufferedOutputStream);
                            bufferedOutputStream.close();
                        } finally {
                        }
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, kotlin.reflect.jvm.internal.types.飘花落叶言子楪兰世苏哲] */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC5758 m8849(C5366 c5366, ClassLoader classLoader, C5902 c5902, InterfaceC7372 interfaceC7372) {
        InterfaceC5924 interfaceC5924M10649;
        C5761 c5761M12456;
        InterfaceC7372 interfaceC73722;
        T c5759;
        InterfaceC5919 interfaceC5919;
        C5917 c5917;
        InterfaceC5919 interfaceC59192;
        String str;
        c5366.getClass();
        ArrayList arrayList = c5366.f13554;
        c5902.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        List listM10669 = AbstractC5954.m10669(new C5212(AbstractC5954.m10672(AbstractC5954.m10674(c5366, C5848.f14805), C5848.f14804), 2, new C5862(classLoader, c5902, interfaceC7372, ref$ObjectRef)));
        AbstractC3898 abstractC3898M9690 = c5366.m9690();
        if (abstractC3898M9690 instanceof C5365) {
            String str2 = ((C5365) abstractC3898M9690).f13547;
            if (AbstractC5227.m9466(str2, "kotlin/Array")) {
                InterfaceC5919 interfaceC59193 = ((C5917) AbstractC5176.m9338(listM10669)).f14982;
                if (interfaceC59193 == null) {
                    interfaceC59193 = AbstractC5904.f14964;
                }
                interfaceC5924M10649 = AbstractC5228.f13320.mo9476(AbstractC5899.m10621(AbstractC3889.m7316(AbstractC5913.m10651(interfaceC59193))));
            } else {
                interfaceC5924M10649 = m8868(classLoader, str2);
                if (interfaceC5924M10649 == null) {
                    throw new KotlinReflectionInternalError("Class not found: ".concat(str2));
                }
            }
        } else if (abstractC3898M9690 instanceof C5364) {
            interfaceC5924M10649 = new C5820(m8850(((C5364) abstractC3898M9690).f13546).m9886());
        } else {
            if (!(abstractC3898M9690 instanceof C5363)) {
                C5043.m9170();
                return null;
            }
            int i = ((C5363) abstractC3898M9690).f13545;
            interfaceC5924M10649 = c5902.m10649(i);
            if (interfaceC5924M10649 == null) {
                interfaceC5924M10649 = new C5890(i);
            }
        }
        boolean zM1137 = AbstractC5377.f13602.m1137(c5366, AbstractC5377.f13608[49]);
        C7892 c7892 = C7888.f19302;
        c7892.getClass();
        ArrayList arrayList2 = ((C7888) AbstractC3887.m7195(arrayList, c7892)).f19303;
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(m8858((C5375) it.next(), classLoader));
        }
        C5366 c53662 = c5366.f13550;
        AbstractC5758 abstractC5758M8849 = c53662 != null ? m8849(c53662, classLoader, c5902, null) : null;
        C0984 c0984 = AbstractC5377.f13600;
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        boolean zM11372 = c0984.m1137(c5366, interfaceC5920Arr[51]);
        AbstractC3898 abstractC3898M96902 = c5366.m9690();
        C5365 c5365 = abstractC3898M96902 instanceof C5365 ? (C5365) abstractC3898M96902 : null;
        boolean zM9466 = AbstractC5227.m9466(c5365 != null ? c5365.f13547 : null, "kotlin/Nothing");
        C0984 c09842 = AbstractC5377.f13601;
        boolean zM11373 = c09842.m1137(c5366, interfaceC5920Arr[50]);
        AbstractC3898 abstractC3898M96903 = c5366.m9690();
        C5365 c53652 = abstractC3898M96903 instanceof C5365 ? (C5365) abstractC3898M96903 : null;
        if (c53652 == null || (str = c53652.f13547) == null) {
            c5761M12456 = null;
        } else {
            C5520 c5520M8850 = m8850(str);
            if (C5242.f13339.containsKey(c5520M8850)) {
                c5761M12456 = AbstractC7176.m12456((InterfaceC5925) interfaceC5924M10649, c5520M8850.m9886());
            }
        }
        ref$ObjectRef.element = new C5759(interfaceC5924M10649, listM10669, zM1137, arrayList3, abstractC5758M8849, zM11372, zM9466, zM11373, c5761M12456, interfaceC7372);
        if (c09842.m1137(c5366, interfaceC5920Arr[50])) {
            T t = ref$ObjectRef.element;
            if (t == 0) {
                AbstractC5227.m9467("result");
                throw null;
            }
            C5759 c57592 = (C5759) t;
            boolean z = c57592.f14613;
            List list = c57592.f14617;
            if (!z) {
                C6385.m11431(c57592, "Not a suspend function type: ");
                return null;
            }
            C5917 c59172 = (C5917) AbstractC5176.m9377(list.size() - 2, list);
            if (c59172 == null || (interfaceC5919 = c59172.f14982) == null || !AbstractC5227.m9466(interfaceC5919.mo9458(), AbstractC5228.f13320.mo9476(InterfaceC5189.class)) || (c5917 = (C5917) AbstractC5176.m9340(interfaceC5919.mo9457())) == null || (interfaceC59192 = c5917.f14982) == null) {
                interfaceC73722 = interfaceC7372;
                c5759 = 0;
            } else {
                InterfaceC5924 interfaceC5924 = c57592.f14616;
                List listM9360 = AbstractC5176.m9360(2, list);
                C5917 c59173 = C5917.f14981;
                interfaceC73722 = interfaceC7372;
                c5759 = new C5759(interfaceC5924, AbstractC5176.m9353(listM9360, AbstractC5922.m10659(interfaceC59192)), c57592.f14611, c57592.f14610, c57592.f14614, c57592.f14615, c57592.f14612, true, c57592.f14609, interfaceC73722);
            }
            if (c5759 == 0) {
                StringBuilder sb = new StringBuilder("Invalid suspend function type: ");
                Object obj = ref$ObjectRef.element;
                if (obj == null) {
                    AbstractC5227.m9467("result");
                    throw null;
                }
                sb.append((C5759) obj);
                throw new KotlinReflectionInternalError(sb.toString());
            }
            ref$ObjectRef.element = c5759;
        } else {
            interfaceC73722 = interfaceC7372;
        }
        C5371 c5371 = c5366.f13548;
        if (c5371 == null || !AbstractC5227.m9466(c5371.f13588, "kotlin.jvm.PlatformType")) {
            T t2 = ref$ObjectRef.element;
            if (t2 != 0) {
                return (C5759) t2;
            }
            AbstractC5227.m9467("result");
            throw null;
        }
        T t3 = ref$ObjectRef.element;
        if (t3 == 0) {
            AbstractC5227.m9467("result");
            throw null;
        }
        C5759 c57593 = (C5759) t3;
        AbstractC5758 abstractC5758M88492 = m8849(c5371.f13589, classLoader, c5902, null);
        abstractC5758M88492.getClass();
        C5759 c57594 = (C5759) abstractC5758M88492;
        C7892 c78922 = C7888.f19302;
        c78922.getClass();
        return c57593.equals(c57594) ? c57593 : new C5771(c57593, c57594, ((C7888) AbstractC3887.m7195(arrayList, c78922)).f19304, interfaceC73722);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C5520 m8850(String str) {
        str.getClass();
        boolean zM10698 = AbstractC5971.m10698(str, ".", false);
        if (zM10698) {
            str = str.substring(1);
        }
        int iM10724 = AbstractC5976.m10724(str, '/', 0, 6);
        String strReplace = (iM10724 == -1 ? "" : str.substring(0, iM10724)).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        strReplace.getClass();
        return new C5520(new C5519(strReplace), new C5519(AbstractC5976.m10701(str, '/')), zM10698);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final KVisibility m8851(Visibility visibility) {
        visibility.getClass();
        switch (AbstractC5867.f14863[visibility.ordinal()]) {
            case 1:
                return KVisibility.INTERNAL;
            case 2:
                return KVisibility.PRIVATE;
            case 3:
                return KVisibility.PROTECTED;
            case 4:
                return KVisibility.PUBLIC;
            case 5:
                return KVisibility.PRIVATE;
            default:
                C5043.m9170();
            case 6:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final KVariance m8852(KmVariance kmVariance) {
        kmVariance.getClass();
        int i = AbstractC5867.f14864[kmVariance.ordinal()];
        if (i == 1) {
            return KVariance.f304IN;
        }
        if (i == 2) {
            return KVariance.OUT;
        }
        if (i == 3) {
            return KVariance.INVARIANT;
        }
        C5043.m9170();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m8853(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(AbstractC0900.m713(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                m8859(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m8859(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m8859(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m8859(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C4990 m8854(String str) {
        str.getClass();
        if (str.equals("/")) {
            return C4990.f12941;
        }
        int i = 23;
        return new C4990(AbstractC5954.m10669(AbstractC5954.m10670(new C5947(AbstractC5954.m10670(AbstractC5976.m10725(str, new String[]{"/"}, 0), new C1905(str, i)), true, new C4639(22)), new C4639(i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static List m8855(C2070 c2070, int i, C2070 c20702, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iM2683 = c2070.m2683(i);
        int i4 = i + iM2683;
        int iM2673 = c2070.m2673(i);
        int iM26732 = c2070.m2673(i4);
        int i5 = iM26732 - iM2673;
        boolean z5 = i >= 0 && (c2070.f3913[(c2070.m2688(i) * 5) + 1] & 201326592) != 0;
        c20702.m2681(iM2683);
        c20702.m2682(i5, c20702.f3915);
        if (c2070.f3928 < i4) {
            c2070.m2664(i4);
        }
        if (c2070.f3929 < iM26732) {
            c2070.m2663(iM26732, i4);
        }
        int[] iArr = c20702.f3913;
        int i6 = c20702.f3915;
        int i7 = i6 * 5;
        AbstractC5179.m9395(i7, i * 5, i4 * 5, c2070.f3913, iArr);
        Object[] objArr = c20702.f3912;
        int i8 = c20702.f3931;
        System.arraycopy(c2070.f3912, iM2673, objArr, i8, i5);
        int i9 = c20702.f3920;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iM2683;
        int iM2692 = i8 - c20702.m2692(iArr, i6);
        int i12 = c20702.f3922;
        int i13 = c20702.f3930;
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
            int iM26922 = c20702.m2692(iArr, i15) + iM2692;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = c20702.f3929;
            }
            iArr2[(i15 * 5) + 4] = C2070.m2650(iM26922, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c20702.f3922 = i14;
        int iM2701 = AbstractC2073.m2701(c2070.f3911, i, c2070.m2690());
        int iM27012 = AbstractC2073.m2701(c2070.f3911, i4, c2070.m2690());
        if (iM2701 < iM27012) {
            ArrayList arrayList = c2070.f3911;
            ArrayList arrayList2 = new ArrayList(iM27012 - iM2701);
            for (int i17 = iM2701; i17 < iM27012; i17++) {
                C2065 c2065 = (C2065) arrayList.get(i17);
                c2065.f3879 += i10;
                arrayList2.add(c2065);
            }
            c20702.f3911.addAll(AbstractC2073.m2701(c20702.f3911, c20702.f3915, c20702.m2690()), arrayList2);
            arrayList.subList(iM2701, iM27012).clear();
            list = arrayList2;
        } else {
            list = EmptyList.INSTANCE;
        }
        if (!list.isEmpty()) {
            HashMap map = c2070.f3910;
            HashMap map2 = c20702.f3910;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = c20702.f3920;
        c20702.m2656(i9);
        int iM2672 = c2070.m2672(c2070.f3913, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM2672 >= 0;
            if (z7) {
                c2070.m2657();
                c2070.m2678(iM2672 - c2070.f3915);
                c2070.m2657();
            }
            c2070.m2678(i - c2070.f3915);
            boolean zM2669 = c2070.m2669();
            if (z7) {
                c2070.m2661();
                c2070.m2695();
                c2070.m2661();
                c2070.m2695();
            }
            z4 = zM2669;
        } else {
            boolean zM2668 = c2070.m2668(i, iM2683);
            c2070.m2667(iM2673, i5, i - 1);
            z4 = zM2668;
        }
        if (z4) {
            AbstractC2209.m3067("Unexpectedly removed anchors");
        }
        int i20 = c20702.f3925;
        int i21 = iArr3[i7 + 1];
        c20702.f3925 = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            c20702.f3915 = i11;
            c20702.f3931 = i8 + i5;
        }
        if (z6) {
            c20702.m2654(i9);
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m8856(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m8856(file.getParentFile());
        file.mkdir();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8857(AbstractC5380 abstractC5380, String str, String str2, ClassLoader classLoader) {
        List parameters;
        InterfaceC5919 type;
        if (abstractC5380 instanceof C5374) {
            return m8858(((C5374) abstractC5380).f13594, classLoader);
        }
        int i = 0;
        if (abstractC5380 instanceof C5373) {
            C5373 c5373 = (C5373) abstractC5380;
            String str3 = c5373.f13593;
            InterfaceC5925 interfaceC5925M8868 = m8868(classLoader, str3);
            if (interfaceC5925M8868 == null) {
                throw new KotlinReflectionInternalError("Unresolved class: ".concat(str3));
            }
            Class clsM7316 = AbstractC3889.m7316(interfaceC5925M8868);
            int i2 = c5373.f13592;
            while (i < i2) {
                clsM7316 = AbstractC5899.m10621(clsM7316);
                i++;
            }
            return clsM7316;
        }
        Object obj = null;
        if (abstractC5380 instanceof C5372) {
            InterfaceC5925 interfaceC5925M88682 = m8868(classLoader, str);
            if (interfaceC5925M88682 != null) {
                if (!AbstractC3889.m7316(interfaceC5925M88682).isAnnotation()) {
                    interfaceC5925M88682 = null;
                }
                if (interfaceC5925M88682 != null) {
                    InterfaceC5942 interfaceC5942 = (InterfaceC5942) AbstractC5176.m9341(interfaceC5925M88682.mo9442());
                    if (interfaceC5942 != null && (parameters = interfaceC5942.getParameters()) != null) {
                        Iterator it = parameters.iterator();
                        boolean z = false;
                        Object obj2 = null;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!z) {
                                    break;
                                }
                            } else {
                                Object next = it.next();
                                if (AbstractC5227.m9466(((InterfaceC5940) next).getName(), str2)) {
                                    if (z) {
                                        break;
                                    }
                                    z = true;
                                    obj2 = next;
                                }
                            }
                        }
                        InterfaceC5940 interfaceC5940 = (InterfaceC5940) obj2;
                        if (interfaceC5940 != null && (type = interfaceC5940.getType()) != null) {
                            InterfaceC5924 interfaceC5924Mo9458 = type.mo9458();
                            InterfaceC5925 interfaceC5925 = interfaceC5924Mo9458 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924Mo9458 : null;
                            if (interfaceC5925 == null) {
                                C5043.m9154(type, "Array parameter type is not a class: ");
                                return null;
                            }
                            Class clsM73162 = AbstractC3889.m7316(interfaceC5925);
                            Class<?> componentType = AbstractC5227.m9466(clsM73162.getComponentType(), InterfaceC5925.class) ? Class.class : clsM73162.getComponentType();
                            ArrayList arrayList = ((C5372) abstractC5380).f13590;
                            Object objNewInstance = Array.newInstance(componentType, arrayList.size());
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Array.set(objNewInstance, i, m8857((AbstractC5380) it2.next(), str, null, classLoader));
                                i++;
                            }
                            objNewInstance.getClass();
                            return objNewInstance;
                        }
                    }
                    throw new KotlinReflectionInternalError(AbstractC7012.m12140("No parameter ", str2, " found in annotation constructor of ", str));
                }
            }
            throw new KotlinReflectionInternalError("Not an annotation class: ".concat(str));
        }
        if (!(abstractC5380 instanceof C5392)) {
            if (!(abstractC5380 instanceof C5384)) {
                if (abstractC5380 instanceof AbstractC5388) {
                    return ((AbstractC5388) abstractC5380).mo9693();
                }
                C5043.m9170();
                return null;
            }
            String str4 = ((C5384) abstractC5380).f13649;
            Class clsM10634 = AbstractC5899.m10634(classLoader, m8850(str4), 0);
            if (clsM10634 != null) {
                return clsM10634;
            }
            throw new KotlinReflectionInternalError("Unresolved class: ".concat(str4));
        }
        C5392 c5392 = (C5392) abstractC5380;
        String str5 = c5392.f13656;
        String str6 = c5392.f13657;
        Class clsM106342 = AbstractC5899.m10634(classLoader, m8850(str6), 0);
        if (clsM106342 == null) {
            throw new KotlinReflectionInternalError("Unresolved enum class: ".concat(str6));
        }
        Object[] enumConstants = clsM106342.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (i < length) {
                Object obj4 = enumConstants[i];
                obj4.getClass();
                if (AbstractC5227.m9466(((Enum) obj4).name(), str5)) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    obj3 = obj4;
                }
                i++;
            } else if (z2) {
                obj = obj3;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new KotlinReflectionInternalError("Unresolved enum entry: " + str6 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final Annotation m8858(C5375 c5375, ClassLoader classLoader) {
        c5375.getClass();
        String str = c5375.f13596;
        Class clsM10634 = AbstractC5899.m10634(classLoader, m8850(str), 0);
        if (clsM10634 == null) {
            throw new KotlinReflectionInternalError("Annotation class not found: ".concat(str));
        }
        Map map = c5375.f13595;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5171.m9331(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), m8857((AbstractC5380) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) C9496.m14939(clsM10634, linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m8859(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC0900.m714(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m8860(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static AbstractC5894 m8861(Metadata metadata) {
        String string;
        if (metadata.m153mv().length == 0) {
            C6755.m11869("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        C7727 c7727 = new C7727(metadata.m153mv(), (metadata.m155xi() & 8) != 0);
        boolean zM12743 = c7727.m12743(1, 1, 0);
        if (!zM12743) {
            if (zM12743) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(c7727.f18702 ? C7727.f18701 : C7727.f18700);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            C6385.m11433("Provided Metadata instance has version ", c7727, ", ", string);
            return null;
        }
        try {
            int iM152k = metadata.m152k();
            if (iM152k == 1) {
                return new C5347(metadata);
            }
            if (iM152k == 2) {
                return new C5346(metadata);
            }
            if (iM152k == 3) {
                return new C5354(metadata);
            }
            if (iM152k != 4) {
                if (iM152k == 5) {
                    return new C5352(metadata);
                }
                C5354 c5354 = new C5354();
                new C5349(metadata.m153mv());
                metadata.m155xi();
                return c5354;
            }
            String[] strArrM150d1 = metadata.m150d1();
            strArrM150d1.getClass();
            List listAsList = Arrays.asList(strArrM150d1);
            listAsList.getClass();
            new C5349(metadata.m153mv());
            metadata.m155xi();
            C5353 c5353 = new C5353();
            c5353.f13515 = listAsList;
            return c5353;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static BitmapDrawable m8862(Context context, String str) {
        BitmapDrawable bitmapDrawable = null;
        if (str != null && !str.isEmpty()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(fileInputStream));
                try {
                    fileInputStream.close();
                    return bitmapDrawable2;
                } catch (IOException e) {
                    try {
                        throw new RuntimeException(e);
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        bitmapDrawable = bitmapDrawable2;
                        e.printStackTrace();
                        return bitmapDrawable;
                    }
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            }
        }
        return bitmapDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m8863(C5368 c5368, AbstractC5835 abstractC5835) {
        String strConcat;
        C5348 c5348 = AbstractC3888.m7266(c5368).f19287;
        if (c5348 != null) {
            return c5348.toString();
        }
        C5350 c5350 = AbstractC3888.m7266(c5368).f19288;
        if (c5350 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC5443.m9789(c5350.f13511));
        if (AbstractC5377.m9691(c5368) == Visibility.INTERNAL && (abstractC5835 instanceof C5836)) {
            C5381 c5381M10541 = ((C5836) abstractC5835).m10541();
            String str = c5381M10541 != null ? AbstractC3888.m7276(c5381M10541).f19298 : null;
            if (str == null) {
                str = "main";
            }
            strConcat = "$" + AbstractC5522.f14048.replace(str, JavaConstant.Dynamic.DEFAULT_NAME);
        } else if (AbstractC5377.m9691(c5368) == Visibility.PRIVATE && (abstractC5835 instanceof C5824)) {
            C5824 c5824 = (C5824) abstractC5835;
            C5906 c5906 = ((C5825) c5824.f14750.getValue()).f14754;
            InterfaceC5920 interfaceC5920 = C5825.f14751[0];
            C7799 c7799 = (C7799) c5906.invoke();
            if ((c7799 != null ? c7799.f19005.f18818 : null) == KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) {
                strConcat = "$".concat(c5824.f14749.getSimpleName());
            }
        } else {
            strConcat = "";
        }
        sb.append(strConcat);
        sb.append("()");
        sb.append(c5350.f13510);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8864(Object obj, InterfaceC5942 interfaceC5942, C4890 c4890) throws Throwable {
        Object obj2;
        List parameters = interfaceC5942.getParameters();
        ArrayList<InterfaceC5940> arrayList = new ArrayList();
        for (Object obj3 : parameters) {
            if (!((InterfaceC5940) obj3).mo10513()) {
                arrayList.add(obj3);
            }
        }
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayList, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (InterfaceC5940 interfaceC5940 : arrayList) {
            if (interfaceC5940.getKind() == KParameter$Kind.INSTANCE) {
                obj2 = obj;
            } else if (AbstractC9016.m14233(interfaceC5940, AbstractC9016.f22904)) {
                obj2 = c4890.f12686;
            } else {
                Class cls = AbstractC9016.f22903;
                if (!AbstractC9016.m14233(interfaceC5940, cls)) {
                    if (!AbstractC5976.m10735(interfaceC5940.getType().toString(), "Application", false)) {
                        StringBuilder sb = new StringBuilder("Parameter type '");
                        sb.append(interfaceC5940.getType());
                        sb.append("' of parameter '");
                        String name = interfaceC5940.getName();
                        if (name == null) {
                            name = "<receiver>";
                        }
                        throw new IllegalArgumentException(AbstractC0900.m711(sb, name, "' is not supported"));
                    }
                    Type typeM10653 = AbstractC5913.m10653(interfaceC5940.getType());
                    Class cls2 = typeM10653 instanceof Class ? (Class) typeM10653 : null;
                    ClassLoader classLoader = cls2 != null ? cls2.getClassLoader() : null;
                    StringBuilder sb2 = new StringBuilder("Parameter type ");
                    sb2.append(interfaceC5940.getType());
                    sb2.append(":{");
                    sb2.append(classLoader);
                    sb2.append("} is not supported.Application is loaded as ");
                    sb2.append(cls);
                    ClassLoader classLoader2 = cls.getClassLoader();
                    sb2.append(":{");
                    sb2.append(classLoader2);
                    sb2.append('}');
                    throw new IllegalArgumentException(sb2.toString());
                }
                obj2 = c4890;
            }
            linkedHashMap.put(interfaceC5940, obj2);
        }
        try {
            return interfaceC5942.callBy(linkedHashMap);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final int m8865(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int m8866(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                C6755.m11869("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8103 m8867(ArrayList arrayList) {
        C8103 c8103 = new C8103();
        for (Object obj : arrayList) {
            InterfaceC8083 interfaceC8083 = (InterfaceC8083) obj;
            if (interfaceC8083 != null && interfaceC8083 != C8084.f19681) {
                c8103.add(obj);
            }
        }
        return c8103;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC5925 m8868(ClassLoader classLoader, String str) {
        str.getClass();
        Class clsM10634 = AbstractC5899.m10634(classLoader, m8850(str), 0);
        if (clsM10634 != null) {
            return AbstractC5228.f13320.mo9476(clsM10634);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m8869(Resources resources, String str) {
        try {
            AssetManager assets = resources.getAssets();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(assets, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static String m8870(String str) {
        File file = new File(m8874() + "/cache/" + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Drawable m8871(Context context, int i) {
        return C1018.m1191().m1194(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC8013 m8872(InterfaceC8013 interfaceC8013) {
        interfaceC8013.getClass();
        return interfaceC8013.getDescriptor().mo12969() ? interfaceC8013 : new C7971(interfaceC8013);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ViewParent m8873(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C0328R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m8874() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + AbstractC7187.f17857 + "/QStory";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5523 m8875(InterfaceC7737 interfaceC7737, int i) {
        interfaceC7737.getClass();
        return C5523.m9890(interfaceC7737.getString(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m8876(Drawable drawable, String str, Bitmap.CompressFormat compressFormat) {
        if (drawable == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ((BitmapDrawable) drawable).getBitmap().compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final Collection m8877(Collection collection, Collection collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C5520 m8878(InterfaceC7737 interfaceC7737, int i) {
        interfaceC7737.getClass();
        return AbstractC5516.m9864(interfaceC7737.mo12724(i), interfaceC7737.mo12723(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ColorStateList m8879(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC8495.m13506(drawable)) {
            return null;
        }
        return AbstractC9428.m14796(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6557 m8880(DexKitBridge dexKitBridge, C9769 c9769) {
        dexKitBridge.getClass();
        int iM7848 = c9769.m7848(4);
        int i = iM7848 != 0 ? c9769.f11199.getInt(iM7848 + c9769.f11200) : 0;
        int iM78482 = c9769.m7848(6);
        int i2 = iM78482 != 0 ? c9769.f11199.getInt(iM78482 + c9769.f11200) : 0;
        int iM78483 = c9769.m7848(8);
        int i3 = iM78483 != 0 ? c9769.f11199.getInt(iM78483 + c9769.f11200) : 0;
        int iM78484 = c9769.m7848(10);
        int i4 = iM78484 != 0 ? c9769.f11199.getInt(iM78484 + c9769.f11200) : 0;
        int iM78485 = c9769.m7848(12);
        String strM7846 = iM78485 != 0 ? c9769.m7846(iM78485 + c9769.f11200) : null;
        strM7846.getClass();
        int iM78486 = c9769.m7848(14);
        return new C6557(dexKitBridge, i, i2, i3, i4, strM7846, iM78486 != 0 ? c9769.f11199.getInt(iM78486 + c9769.f11200) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static ArrayList m8881(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m8881(childAt));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract void mo4428(C2969 c2969, Thread thread);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract void mo4429(C2969 c2969, C2969 c29692);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract boolean mo4430(AbstractFutureC2976 abstractFutureC2976, C2969 c2969, C2969 c29692);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract boolean mo4431(AbstractFutureC2976 abstractFutureC2976, Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo4432(AbstractFutureC2976 abstractFutureC2976, C2972 c2972);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract DialogXStyle$PopTipSettings$ALIGN mo8882();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract int mo8883(boolean z);
}
