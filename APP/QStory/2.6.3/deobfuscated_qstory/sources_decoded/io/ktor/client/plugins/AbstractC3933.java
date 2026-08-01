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
import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0171;
import androidx.compose.foundation.C1067;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.concurrent.futures.AbstractFutureC2143;
import androidx.concurrent.futures.C2136;
import androidx.concurrent.futures.C2139;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import com.materialkolor.dynamiccolor.C3807;
import io.ktor.server.application.C4058;
import io.ktor.server.routing.C4158;
import io.ktor.util.C4211;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5081;
import kotlin.reflect.jvm.internal.AbstractC5035;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.AbstractC5067;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4548;
import kotlin.reflect.jvm.internal.impl.km.C4543;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4514;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4517;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4520;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4521;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4522;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.compress.archivers.zip.C5585;
import org.apache.commons.compress.archivers.zip.C5593;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.result.C5727;
import p036.AbstractC6358;
import p070.C6898;
import p070.InterfaceC6908;
import p087.C7142;
import p089.InterfaceC7184;
import p101.C7255;
import p101.InterfaceC7254;
import p103.C7274;
import p164.AbstractC7666;
import p252.AbstractC8187;
import p287.AbstractC8405;
import p299.AbstractC8599;
import p316.C8667;
import p364.C8940;
import p376.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ResourcesLoader f12150;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static void m8289(String str, String str2) throws Exception {
        C5593 c5593;
        File file = new File(str2);
        if (!file.exists() && !file.mkdirs()) {
            throw new Exception("创建解压目标文件夹失败");
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            try {
                c5593 = new C5593(bufferedInputStream);
            } finally {
            }
            while (true) {
                try {
                    C5585 c5585M10957 = c5593.m10957();
                    if (c5585M10957 == null) {
                        c5593.close();
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    String str3 = str2 + File.separator + c5585M10957.getName();
                    if (c5585M10957.isDirectory()) {
                        m8297(new File(str3));
                    } else {
                        m8297(new File(str3).getParentFile());
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                        try {
                            AbstractC8985.m14586(c5593, bufferedOutputStream);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.types.AbstractC4926 m8290(kotlin.reflect.jvm.internal.impl.km.C4534 r21, java.lang.ClassLoader r22, kotlin.reflect.jvm.internal.C5070 r23, p052.InterfaceC6543 r24) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3933.m8290(kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏兰哲楪, java.lang.ClassLoader, kotlin.reflect.jvm.internal.飘花落叶言楪子哲兰世苏, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final C4688 m8291(String str) {
        str.getClass();
        boolean zM10139 = AbstractC5139.m10139(str, ".", false);
        if (zM10139) {
            str = str.substring(1);
        }
        int iM10165 = AbstractC5144.m10165(str, '/', 0, 6);
        String strReplace = (iM10165 == -1 ? "" : str.substring(0, iM10165)).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        strReplace.getClass();
        return new C4688(new C4687(strReplace), new C4687(AbstractC5144.m10142(str, '/')), zM10139);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final KVisibility m8292(Visibility visibility) {
        visibility.getClass();
        switch (AbstractC5035.f14518[visibility.ordinal()]) {
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
                C4211.m8611();
            case 6:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final KVariance m8293(KmVariance kmVariance) {
        kmVariance.getClass();
        int i = AbstractC5035.f14519[kmVariance.ordinal()];
        if (i == 1) {
            return KVariance.IN;
        }
        if (i == 2) {
            return KVariance.OUT;
        }
        if (i == 3) {
            return KVariance.INVARIANT;
        }
        C4211.m8611();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m8294(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(AbstractC0053.m153(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                m8300(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m8300(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m8300(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m8300(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static C4158 m8295(String str) {
        str.getClass();
        if (str.equals("/")) {
            return C4158.f12596;
        }
        int i = 23;
        return new C4158(AbstractC5122.m10110(AbstractC5122.m10111(new C5115(AbstractC5122.m10111(AbstractC5144.m10166(str, new String[]{"/"}, 0), new C1067(str, i)), true, new C3807(22)), new C3807(i))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static List m8296(C1235 c1235, int i, C1235 c12352, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iM2123 = c1235.m2123(i);
        int i4 = i + iM2123;
        int iM2113 = c1235.m2113(i);
        int iM21132 = c1235.m2113(i4);
        int i5 = iM21132 - iM2113;
        boolean z5 = i >= 0 && (c1235.f3568[(c1235.m2128(i) * 5) + 1] & 201326592) != 0;
        c12352.m2121(iM2123);
        c12352.m2122(i5, c12352.f3570);
        if (c1235.f3583 < i4) {
            c1235.m2104(i4);
        }
        if (c1235.f3584 < iM21132) {
            c1235.m2103(iM21132, i4);
        }
        int[] iArr = c12352.f3568;
        int i6 = c12352.f3570;
        int i7 = i6 * 5;
        AbstractC4347.m8836(i7, i * 5, i4 * 5, c1235.f3568, iArr);
        Object[] objArr = c12352.f3567;
        int i8 = c12352.f3586;
        System.arraycopy(c1235.f3567, iM2113, objArr, i8, i5);
        int i9 = c12352.f3575;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iM2123;
        int iM2132 = i8 - c12352.m2132(iArr, i6);
        int i12 = c12352.f3577;
        int i13 = c12352.f3585;
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
            int iM21322 = c12352.m2132(iArr, i15) + iM2132;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = c12352.f3584;
            }
            iArr2[(i15 * 5) + 4] = C1235.m2090(iM21322, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c12352.f3577 = i14;
        int iM2141 = AbstractC1238.m2141(c1235.f3566, i, c1235.m2130());
        int iM21412 = AbstractC1238.m2141(c1235.f3566, i4, c1235.m2130());
        if (iM2141 < iM21412) {
            ArrayList arrayList = c1235.f3566;
            ArrayList arrayList2 = new ArrayList(iM21412 - iM2141);
            for (int i17 = iM2141; i17 < iM21412; i17++) {
                C1230 c1230 = (C1230) arrayList.get(i17);
                c1230.f3534 += i10;
                arrayList2.add(c1230);
            }
            c12352.f3566.addAll(AbstractC1238.m2141(c12352.f3566, c12352.f3570, c12352.m2130()), arrayList2);
            arrayList.subList(iM2141, iM21412).clear();
            list = arrayList2;
        } else {
            list = EmptyList.INSTANCE;
        }
        if (!list.isEmpty()) {
            HashMap map = c1235.f3565;
            HashMap map2 = c12352.f3565;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = c12352.f3575;
        c12352.m2096(i9);
        int iM2112 = c1235.m2112(c1235.f3568, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iM2112 >= 0;
            if (z7) {
                c1235.m2097();
                c1235.m2118(iM2112 - c1235.f3570);
                c1235.m2097();
            }
            c1235.m2118(i - c1235.f3570);
            boolean zM2109 = c1235.m2109();
            if (z7) {
                c1235.m2101();
                c1235.m2135();
                c1235.m2101();
                c1235.m2135();
            }
            z4 = zM2109;
        } else {
            boolean zM2108 = c1235.m2108(i, iM2123);
            c1235.m2107(iM2113, i5, i - 1);
            z4 = zM2108;
        }
        if (z4) {
            AbstractC1374.m2507("Unexpectedly removed anchors");
        }
        int i20 = c12352.f3580;
        int i21 = iArr3[i7 + 1];
        c12352.f3580 = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            c12352.f3570 = i11;
            c12352.f3586 = i8 + i5;
        }
        if (z6) {
            c12352.m2094(i9);
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m8297(File file) {
        if (file == null || file.exists()) {
            return;
        }
        m8297(file.getParentFile());
        file.mkdir();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8298(kotlin.reflect.jvm.internal.impl.km.AbstractC4548 r8, java.lang.String r9, java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3933.m8298(kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰哲世苏, java.lang.String, java.lang.String, java.lang.ClassLoader):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final Annotation m8299(C4543 c4543, ClassLoader classLoader) {
        c4543.getClass();
        String str = c4543.f13251;
        Class clsM10075 = AbstractC5067.m10075(classLoader, m8291(str), 0);
        if (clsM10075 == null) {
            throw new KotlinReflectionInternalError("Annotation class not found: ".concat(str));
        }
        Map map = c4543.f13250;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4339.m8772(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), m8298((AbstractC4548) entry.getValue(), str, (String) entry.getKey(), classLoader));
        }
        return (Annotation) C8667.m14380(clsM10075, linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m8300(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC0053.m154(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static void m8301(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static AbstractC5062 m8302(Metadata metadata) {
        String string;
        if (metadata.mv().length == 0) {
            C5925.m11310("Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.");
            return null;
        }
        C6898 c6898 = new C6898(metadata.mv(), (metadata.xi() & 8) != 0);
        boolean zM12184 = c6898.m12184(1, 1, 0);
        if (!zM12184) {
            if (zM12184) {
                StringBuilder sb = new StringBuilder("while maximum supported version is ");
                sb.append(c6898.f18357 ? C6898.f18356 : C6898.f18355);
                sb.append(". To support newer versions, update the kotlin-metadata-jvm library.");
                string = sb.toString();
            } else {
                string = "while minimum supported version is 1.1.0 (Kotlin 1.0).";
            }
            C5554.m10874("Provided Metadata instance has version ", c6898, ", ", string);
            return null;
        }
        try {
            int iK = metadata.k();
            if (iK == 1) {
                return new C4515(metadata);
            }
            if (iK == 2) {
                return new C4514(metadata);
            }
            if (iK == 3) {
                return new C4522(metadata);
            }
            if (iK != 4) {
                if (iK == 5) {
                    return new C4520(metadata);
                }
                C4522 c4522 = new C4522();
                new C4517(metadata.mv());
                metadata.xi();
                return c4522;
            }
            String[] strArrD1 = metadata.d1();
            strArrD1.getClass();
            List listAsList = Arrays.asList(strArrD1);
            listAsList.getClass();
            new C4517(metadata.mv());
            metadata.xi();
            C4521 c4521 = new C4521();
            c4521.f13170 = listAsList;
            return c4521;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static BitmapDrawable m8303(Context context, String str) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m8304(kotlin.reflect.jvm.internal.impl.km.C4536 r6, kotlin.reflect.jvm.internal.AbstractC5003 r7) {
        /*
            飘花落叶言世楪苏子兰哲.飘花落叶言子楪世兰哲苏 r0 = com.bumptech.glide.AbstractC3056.m6706(r6)
            kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世哲兰苏 r0 = r0.f18942
            if (r0 == 0) goto Ld
            java.lang.String r6 = r0.toString()
            return r6
        Ld:
            飘花落叶言世楪苏子兰哲.飘花落叶言子楪世兰哲苏 r0 = com.bumptech.glide.AbstractC3056.m6706(r6)
            kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世苏兰哲 r0 = r0.f18943
            r1 = 0
            if (r0 == 0) goto La5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f13166
            java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.java.AbstractC4611.m9230(r3)
            r2.append(r3)
            kotlin.reflect.jvm.internal.impl.km.Visibility r3 = kotlin.reflect.jvm.internal.impl.km.AbstractC4545.m9132(r6)
            kotlin.reflect.jvm.internal.impl.km.Visibility r4 = kotlin.reflect.jvm.internal.impl.km.Visibility.INTERNAL
            java.lang.String r5 = "$"
            if (r3 != r4) goto L59
            boolean r3 = r7 instanceof kotlin.reflect.jvm.internal.C5004
            if (r3 == 0) goto L59
            kotlin.reflect.jvm.internal.飘花落叶言子哲楪苏世兰 r7 = (kotlin.reflect.jvm.internal.C5004) r7
            kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰哲苏世 r6 = r7.m9982()
            if (r6 == 0) goto L40
            飘花落叶言世楪苏子兰哲.飘花落叶言子楪世苏哲兰 r6 = com.bumptech.glide.AbstractC3056.m6716(r6)
            java.lang.String r1 = r6.f18953
        L40:
            if (r1 != 0) goto L44
            java.lang.String r1 = "main"
        L44:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            kotlin.text.Regex r7 = kotlin.reflect.jvm.internal.impl.name.AbstractC4690.f13703
            java.lang.String r3 = "_"
            java.lang.String r7 = r7.replace(r1, r3)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L93
        L59:
            kotlin.reflect.jvm.internal.impl.km.Visibility r6 = kotlin.reflect.jvm.internal.impl.km.AbstractC4545.m9132(r6)
            kotlin.reflect.jvm.internal.impl.km.Visibility r3 = kotlin.reflect.jvm.internal.impl.km.Visibility.PRIVATE
            if (r6 != r3) goto L91
            boolean r6 = r7 instanceof kotlin.reflect.jvm.internal.C4992
            if (r6 == 0) goto L91
            kotlin.reflect.jvm.internal.飘花落叶言子哲世苏兰楪 r7 = (kotlin.reflect.jvm.internal.C4992) r7
            kotlin.飘花落叶言子楪苏世哲兰 r6 = r7.f14405
            java.lang.Object r6 = r6.getValue()
            kotlin.reflect.jvm.internal.飘花落叶言子哲世苏楪兰 r6 = (kotlin.reflect.jvm.internal.C4993) r6
            kotlin.reflect.jvm.internal.飘花落叶言楪子苏世兰哲 r6 = r6.f14409
            kotlin.reflect.飘花落叶言子世楪苏哲兰[] r3 = kotlin.reflect.jvm.internal.C4993.f14406
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r6 = r6.invoke()
            飘花落叶言世楪子哲兰苏.飘花落叶言子楪世哲苏兰 r6 = (p077.C6970) r6
            if (r6 == 0) goto L82
            飘花落叶言世楪哲子兰苏.飘花落叶言子楪世苏兰哲 r6 = r6.f18660
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r1 = r6.f18473
        L82:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind.MULTIFILE_CLASS_PART
            if (r1 != r6) goto L91
            java.lang.Class r6 = r7.f14404
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r6 = r5.concat(r6)
            goto L93
        L91:
            java.lang.String r6 = ""
        L93:
            r2.append(r6)
            java.lang.String r6 = "()"
            r2.append(r6)
            java.lang.String r6 = r0.f13165
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            return r6
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AbstractC3933.m8304(kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏哲兰楪, kotlin.reflect.jvm.internal.飘花落叶言子哲楪兰苏世):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8305(Object obj, InterfaceC5110 interfaceC5110, C4058 c4058) throws Throwable {
        Object obj2;
        List parameters = interfaceC5110.getParameters();
        ArrayList<InterfaceC5108> arrayList = new ArrayList();
        for (Object obj3 : parameters) {
            if (!((InterfaceC5108) obj3).mo9954()) {
                arrayList.add(obj3);
            }
        }
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayList, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (InterfaceC5108 interfaceC5108 : arrayList) {
            if (interfaceC5108.getKind() == KParameter$Kind.INSTANCE) {
                obj2 = obj;
            } else if (AbstractC8187.m13674(interfaceC5108, AbstractC8187.f22559)) {
                obj2 = c4058.f12341;
            } else {
                Class cls = AbstractC8187.f22558;
                if (!AbstractC8187.m13674(interfaceC5108, cls)) {
                    if (!AbstractC5144.m10176(interfaceC5108.getType().toString(), "Application", false)) {
                        StringBuilder sb = new StringBuilder("Parameter type '");
                        sb.append(interfaceC5108.getType());
                        sb.append("' of parameter '");
                        String name = interfaceC5108.getName();
                        if (name == null) {
                            name = "<receiver>";
                        }
                        throw new IllegalArgumentException(AbstractC0053.m151(sb, name, "' is not supported"));
                    }
                    Type typeM10094 = AbstractC5081.m10094(interfaceC5108.getType());
                    Class cls2 = typeM10094 instanceof Class ? (Class) typeM10094 : null;
                    ClassLoader classLoader = cls2 != null ? cls2.getClassLoader() : null;
                    StringBuilder sb2 = new StringBuilder("Parameter type ");
                    sb2.append(interfaceC5108.getType());
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
                obj2 = c4058;
            }
            linkedHashMap.put(interfaceC5108, obj2);
        }
        try {
            return interfaceC5110.callBy(linkedHashMap);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final int m8306(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int m8307(int i, int i2, int i3) {
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
                C5925.m11310("Step is zero.");
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
    public static final C7274 m8308(ArrayList arrayList) {
        C7274 c7274 = new C7274();
        for (Object obj : arrayList) {
            InterfaceC7254 interfaceC7254 = (InterfaceC7254) obj;
            if (interfaceC7254 != null && interfaceC7254 != C7255.f19336) {
                c7274.add(obj);
            }
        }
        return c7274;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC5093 m8309(ClassLoader classLoader, String str) {
        str.getClass();
        Class clsM10075 = AbstractC5067.m10075(classLoader, m8291(str), 0);
        if (clsM10075 != null) {
            return AbstractC4396.f12975.mo8917(clsM10075);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static void m8310(Resources resources, String str) {
        try {
            AssetManager assets = resources.getAssets();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(assets, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static String m8311(String str) {
        File file = new File(m8315() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜呜喵") + str); /* decoded-inline: /cache/ */
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Drawable m8312(Context context, int i) {
        return C0171.m631().m634(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final InterfaceC7184 m8313(InterfaceC7184 interfaceC7184) {
        interfaceC7184.getClass();
        return interfaceC7184.getDescriptor().mo12410() ? interfaceC7184 : new C7142(interfaceC7184);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ViewParent m8314(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m8315() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(858) + AbstractC6358.f17512 + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵喵~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"); /* decoded: m13972(858)=/Android/data/ */ /* decoded-inline: /QStory */
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4691 m8316(InterfaceC6908 interfaceC6908, int i) {
        interfaceC6908.getClass();
        return C4691.m9331(interfaceC6908.getString(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m8317(Drawable drawable, String str, Bitmap.CompressFormat compressFormat) {
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
    public static final Collection m8318(Collection collection, Collection collection2) {
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
    public static final C4688 m8319(InterfaceC6908 interfaceC6908, int i) {
        interfaceC6908.getClass();
        return AbstractC4684.m9305(interfaceC6908.mo12165(i), interfaceC6908.mo12164(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ColorStateList m8320(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC7666.m12947(drawable)) {
            return null;
        }
        return AbstractC8599.m14237(drawable).getColorStateList();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5727 m8321(DexKitBridge dexKitBridge, C8940 c8940) {
        dexKitBridge.getClass();
        int iM7289 = c8940.m7289(4);
        int i = iM7289 != 0 ? c8940.f10854.getInt(iM7289 + c8940.f10855) : 0;
        int iM72892 = c8940.m7289(6);
        int i2 = iM72892 != 0 ? c8940.f10854.getInt(iM72892 + c8940.f10855) : 0;
        int iM72893 = c8940.m7289(8);
        int i3 = iM72893 != 0 ? c8940.f10854.getInt(iM72893 + c8940.f10855) : 0;
        int iM72894 = c8940.m7289(10);
        int i4 = iM72894 != 0 ? c8940.f10854.getInt(iM72894 + c8940.f10855) : 0;
        int iM72895 = c8940.m7289(12);
        String strM7287 = iM72895 != 0 ? c8940.m7287(iM72895 + c8940.f10855) : null;
        strM7287.getClass();
        int iM72896 = c8940.m7289(14);
        return new C5727(dexKitBridge, i, i2, i3, i4, strM7287, iM72896 != 0 ? c8940.f10854.getInt(iM72896 + c8940.f10855) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static ArrayList m8322(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                arrayList.add(childAt);
                arrayList.addAll(m8322(childAt));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract void mo3868(C2136 c2136, Thread thread);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract void mo3869(C2136 c2136, C2136 c21362);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract boolean mo3870(AbstractFutureC2143 abstractFutureC2143, C2136 c2136, C2136 c21362);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract boolean mo3871(AbstractFutureC2143 abstractFutureC2143, Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo3872(AbstractFutureC2143 abstractFutureC2143, C2139 c2139);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract DialogXStyle$PopTipSettings$ALIGN mo8323();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract int mo8324(boolean z);
}
