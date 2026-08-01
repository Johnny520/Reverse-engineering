package p175;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.draganddrop.C1431;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1771;
import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.client.plugins.api.AbstractC3885;
import io.ktor.client.plugins.api.C3886;
import io.ktor.util.C4211;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC4978;
import kotlin.reflect.jvm.internal.C4992;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4602;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4606;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4607;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4609;
import kotlin.reflect.jvm.internal.impl.load.java.C4608;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.C5554;
import okio.internal.AbstractC5571;
import p007.C6127;
import p007.C6143;
import p007.C6144;
import p007.C6148;
import p007.C6149;
import p007.InterfaceC6155;
import p013.AbstractC6225;
import p013.AbstractC6230;
import p014.C6232;
import p014.C6233;
import p048.C6519;
import p049.AbstractC6530;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p076.C6965;
import p079.AbstractC6986;
import p079.AbstractC6994;
import p087.C7141;
import p091.C7194;
import p091.InterfaceC7191;
import p112.C7328;
import p162.AbstractC7653;
import p205.C7895;
import p236.AbstractC8111;
import p236.C8105;
import p236.C8113;
import p236.C8118;
import p236.InterfaceC8095;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f20998 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field f20999 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean f21000 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final int m13049(int i, int i2, String str) {
        while (i2 > i && m13064(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final String m13050(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC5571.f15352;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return AbstractC5139.m10134(i2, 8, cArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final int m13051(int i, int i2, String str) {
        while (i < i2 && m13064(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static int m13052(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static LinkedHashSet m13053(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4339.m8772(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static LinkedHashSet m13054(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC4339.m8772(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC4344.m8804(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static Set m13055(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m13056(C6965 c6965, NoLookupLocation noLookupLocation, InterfaceC4466 interfaceC4466, C4691 c4691) {
        c6965.getClass();
        noLookupLocation.getClass();
        interfaceC4466.getClass();
        c4691.getClass();
        String str = ((AbstractC6986) interfaceC4466).f18687.f13696.f13693;
        c4691.m9335().getClass();
        str.getClass();
        if (c6965 == C6965.f18654) {
            return;
        }
        noLookupLocation.getLocation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m13057(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                m13083(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(AbstractC6225.m11688(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m13058(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C5925.m11310("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                m13083(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x013e, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        return !p049.AbstractC6530.m12012(r13);
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m13059(p079.AbstractC6989 r13, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480 r14) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p175.AbstractC7739.m13059(飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲苏兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static File m13060(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static InterfaceC8095 m13061(int i, int i2, String str) {
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
            InterfaceC8095.f22338.getClass();
            return C8118.f22414;
        }
        C8113 c8113 = InterfaceC8095.f22338;
        C8105 c8105 = new C8105(2);
        int length = str.length() - 1;
        if (i <= length) {
            i3 = i;
            int i6 = i3;
            i4 = -1;
            while (i5 != 1000) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == '&') {
                    str2 = str;
                    m13068(c8105, str2, i3, i4, i6, z);
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
            return c8105.build();
        }
        str2 = str;
        i3 = i;
        i4 = -1;
        if (i5 != 1000) {
            m13068(c8105, str2, i3, i4, str2.length(), z);
        }
        return c8105.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static MappedByteBuffer m13062(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static Set m13063(Set set, AbstractSet abstractSet) {
        abstractSet.getClass();
        if (abstractSet.isEmpty()) {
            return AbstractC4344.m8788(set);
        }
        if (!(abstractSet instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(abstractSet);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!abstractSet.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m13064(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m13065(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13066(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13067(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m13068(C8105 c8105, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            int iM13051 = m13051(i, i3, str);
            int iM13049 = m13049(iM13051, i3, str);
            if (iM13049 > iM13051) {
                c8105.mo2409(z ? AbstractC8111.m13577(iM13051, iM13049, str, 12) : str.substring(iM13051, iM13049), EmptyList.INSTANCE);
                return;
            }
            return;
        }
        int iM130512 = m13051(i, i2, str);
        int iM130492 = m13049(iM130512, i2, str);
        if (iM130492 > iM130512) {
            String strM13577 = z ? AbstractC8111.m13577(iM130512, iM130492, str, 12) : str.substring(iM130512, iM130492);
            int iM130513 = m13051(i2 + 1, i3, str);
            int iM130493 = m13049(iM130513, i3, str);
            c8105.mo2423(strM13577, z ? AbstractC8111.m13577(iM130513, iM130493, str, 8) : str.substring(iM130513, iM130493));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13069(C1431 c1431, long j) {
        if (!c1431.f6292.f6279) {
            return false;
        }
        C1771 c1771 = AbstractC1785.m3346(c1431).f5094.f5286;
        if (!c1771.f5203.f6279) {
            return false;
        }
        long jMo3076 = c1771.mo3076(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3076 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3076 & 4294967295L));
        long j2 = c1431.f4112;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7328 m13070(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C7328(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7895 m13071() {
        return new C7895(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ColorStateList m13072(Context context, C0108 c0108, int i) {
        int resourceId;
        ColorStateList colorStateListM12919;
        TypedArray typedArray = (TypedArray) c0108.f320;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12919 = AbstractC7653.m12919(context, resourceId)) == null) ? c0108.m385(i) : colorStateListM12919;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static ColorStateList m13073(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM12919;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM12919 = AbstractC7653.m12919(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM12919;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterfaceC4480 m13074(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        if (!AbstractC4602.f13448.contains(interfaceC4480.getName()) && !AbstractC4606.f13454.contains(AbstractC4773.m9506(interfaceC4480).getName())) {
            return null;
        }
        if ((interfaceC4480 instanceof InterfaceC4473) || (interfaceC4480 instanceof AbstractC6994)) {
            return AbstractC4773.m9502(interfaceC4480, C4608.f13462);
        }
        if (interfaceC4480 instanceof InterfaceC4471) {
            return AbstractC4773.m9502(interfaceC4480, C4608.f13463);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC4480 m13075(InterfaceC4480 interfaceC4480) {
        interfaceC4480.getClass();
        InterfaceC4480 interfaceC4480M13074 = m13074(interfaceC4480);
        if (interfaceC4480M13074 != null) {
            return interfaceC4480M13074;
        }
        int i = AbstractC4607.f13458;
        C4691 name = interfaceC4480.getName();
        name.getClass();
        if (AbstractC4602.f13439.contains(name)) {
            return AbstractC4773.m9502(interfaceC4480, C4608.f13461);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Drawable m13076(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM8312;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM8312 = AbstractC3933.m8312(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM8312;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String m13077(InterfaceC4484 interfaceC4484) {
        C4691 c4691;
        InterfaceC4480 interfaceC4480M13074 = AbstractC6530.m12012(interfaceC4484) ? m13074(interfaceC4484) : null;
        if (interfaceC4480M13074 != null) {
            InterfaceC4480 interfaceC4480M9506 = AbstractC4773.m9506(interfaceC4480M13074);
            if (interfaceC4480M9506 instanceof InterfaceC4473) {
                AbstractC6530.m12012(interfaceC4480M9506);
                InterfaceC4480 interfaceC4480M9502 = AbstractC4773.m9502(AbstractC4773.m9506(interfaceC4480M9506), C4608.f13460);
                if (interfaceC4480M9502 != null && (c4691 = (C4691) AbstractC4606.f13457.get(AbstractC4773.m9505(interfaceC4480M9502))) != null) {
                    return c4691.m9335();
                }
            } else if (interfaceC4480M9506 instanceof InterfaceC4471) {
                int i = AbstractC4609.f13467;
                LinkedHashMap linkedHashMap = AbstractC4602.f13447;
                String strM6659 = AbstractC3055.m6659((InterfaceC4471) interfaceC4480M9506);
                C4691 c46912 = strM6659 == null ? null : (C4691) linkedHashMap.get(strM6659);
                if (c46912 != null) {
                    return c46912.m9335();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final boolean m13078(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C6232 m13079(String str, List list) {
        List listM8846;
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵呜喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵喵喵");
        AbstractC8405.m13972(2870);
        list.getClass();
        C6143 c6143 = new C6143();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c6143.f16842 = AbstractC6230.m11697(3L, timeUnit);
        timeUnit.getClass();
        c6143.f16843 = AbstractC6230.m11697(3L, timeUnit);
        c6143.f16833 = AbstractC6230.m11697(3L, timeUnit);
        C6127 c6127 = new C6127(c6143);
        C6148 c6148 = new C6148(0);
        c6148.m11538(null, str);
        C6149 c6149M11535 = c6148.m11535();
        if (list.isEmpty()) {
            listM8846 = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(InetAddress.getByName((String) it.next()));
            }
            InetAddress[] inetAddressArr = (InetAddress[]) arrayList.toArray(new InetAddress[0]);
            listM8846 = AbstractC4347.m8846((InetAddress[]) Arrays.copyOf(inetAddressArr, inetAddressArr.length));
        }
        C6143 c6143M11517 = c6127.m11517();
        C6144 c6144 = C6232.f17169;
        InterfaceC6155 c6233 = listM8846 != null ? new C6233(c6149M11535.f16881, listM8846) : InterfaceC6155.f16922;
        if (!c6233.equals(c6143M11517.f16855)) {
            c6143M11517.f16829 = null;
        }
        c6143M11517.f16855 = c6233;
        return new C6232(new C6127(c6143M11517), c6149M11535);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5093 m13080(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (interfaceC7191 instanceof C7194) {
            return ((C7194) interfaceC7191).f19196;
        }
        if (interfaceC7191 instanceof C7141) {
            return m13080(((C7141) interfaceC7191).f19097);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m13081(byte[] bArr) {
        byte[] bArr2 = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AbstractC8405.m13973("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵呜呜呜呜"));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (true) {
                int i = byteArrayInputStream.read(bArr2, 0, 1024);
                if (i == -1) {
                    byteArrayInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16).toUpperCase();
                }
                messageDigest.update(bArr2, 0, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m13082(C1562 c1562, String str, String str2) {
        c1562.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = c1562.f4600;
        arrayList.add(str);
        arrayList.add(AbstractC5144.m10155(str2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m13083(int i) {
        if (2 > i || i >= 37) {
            C4211.m8603(new C6519(2, 36, 1), AbstractC0053.m150(i, "radix ", " was not in valid range "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m13084(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C3886 m13085(String str, InterfaceC6543 interfaceC6543, InterfaceC6558 interfaceC6558) {
        interfaceC6543.getClass();
        C3886 c3886 = new C3886(0);
        C4397 c4397 = AbstractC4396.f12975;
        c4397.mo8917(AbstractC3885.class);
        try {
            C5085 c5085 = C5085.f14636;
            AbstractC4394 abstractC4394Mo8921 = c4397.mo8921(c4397.mo8917(C3886.class), KVariance.INVARIANT);
            c4397.mo8920(abstractC4394Mo8921, Collections.singletonList(AbstractC4396.m8912(Object.class)));
            AbstractC4396.m8911(AbstractC3885.class, AbstractC5090.m10100(c4397.mo8919(abstractC4394Mo8921, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (!AbstractC5144.m10172(str)) {
            return c3886;
        }
        C5925.m11310("Name can't be blank");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p047.InterfaceC6489 m13086(kotlin.reflect.jvm.internal.AbstractC4978 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p175.AbstractC7739.m13086(kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲世苏, boolean):飘花落叶言世子兰楪哲苏.飘花落叶言子楪世兰苏哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13087(AbstractC4978 abstractC4978) {
        if (abstractC4978.mo9959().f14384 instanceof C4992) {
            return;
        }
        C5554.m10872(abstractC4978, "Only top-level properties are supported for now: ");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public void mo12694(View view, float f) {
        if (f21000) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f21000 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public float mo12695(View view) {
        if (f21000) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f21000 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract String[] mo13088(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract boolean mo13089(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract Constructor mo13090(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract Method mo13091(Class cls, Field field);
}
