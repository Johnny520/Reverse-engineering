package p191;

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
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.draganddrop.C2266;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2606;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.client.plugins.api.AbstractC4717;
import io.ktor.client.plugins.api.C4718;
import io.ktor.util.C5043;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.AbstractSet;
import java.util.ArrayDeque;
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
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.AbstractC5810;
import kotlin.reflect.jvm.internal.AbstractC5814;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5824;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5434;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5438;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5439;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5441;
import kotlin.reflect.jvm.internal.impl.load.java.C5440;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.ClassKind;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.AbstractC5351;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5701;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import kotlin.reflect.jvm.internal.impl.types.checker.C5691;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.C6385;
import okio.internal.AbstractC6401;
import p023.C6956;
import p023.C6972;
import p023.C6973;
import p023.C6977;
import p023.C6978;
import p023.InterfaceC6984;
import p029.AbstractC7054;
import p029.AbstractC7059;
import p030.C7061;
import p030.C7062;
import p034.AbstractC7082;
import p063.C7324;
import p063.C7326;
import p063.C7327;
import p063.C7328;
import p063.C7329;
import p063.C7332;
import p063.C7334;
import p063.C7335;
import p063.C7338;
import p063.C7340;
import p063.InterfaceC7318;
import p064.C7348;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p082.AbstractC7699;
import p092.C7794;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.AbstractC7823;
import p103.C7970;
import p107.C8023;
import p107.InterfaceC8020;
import p128.C8157;
import p178.AbstractC8482;
import p221.C8724;
import p252.AbstractC8940;
import p252.C8934;
import p252.C8942;
import p252.C8947;
import p252.InterfaceC8924;
import p269.AbstractC9019;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8568 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f21343 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field f21344 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean f21345 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final int m13608(int i, int i2, String str) {
        while (i2 > i && m13623(str.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final String m13609(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC6401.f15697;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return AbstractC5971.m10693(i2, 8, cArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final int m13610(int i, int i2, String str) {
        while (i < i2 && m13623(str.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static int m13611(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static LinkedHashSet m13612(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5171.m9331(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static LinkedHashSet m13613(Set set, Iterable iterable) {
        set.getClass();
        iterable.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC5171.m9331(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC5176.m9363(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static Set m13614(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m13615(C7794 c7794, NoLookupLocation noLookupLocation, InterfaceC5298 interfaceC5298, C5523 c5523) {
        c7794.getClass();
        noLookupLocation.getClass();
        interfaceC5298.getClass();
        c5523.getClass();
        String str = ((AbstractC7815) interfaceC5298).f19032.f14041.f14038;
        c5523.m9894().getClass();
        str.getClass();
        if (c7794 == C7794.f18999) {
            return;
        }
        noLookupLocation.getLocation();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final void m13616(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                m13642(16);
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
                sb.append(AbstractC7054.m12247(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final void m13617(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C6755.m11869("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                m13642(16);
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
    
        return !p065.AbstractC7359.m12571(r13);
     */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m13618(AbstractC7818 abstractC7818, InterfaceC5312 interfaceC5312) {
        abstractC7818.getClass();
        interfaceC5312.getClass();
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5312.mo9587();
        interfaceC5331Mo9587.getClass();
        AbstractC5710 abstractC5710Mo9584 = ((AbstractC7818) interfaceC5331Mo9587).mo9584();
        abstractC5710Mo9584.getClass();
        AbstractC7818 abstractC7818M12676 = AbstractC7699.m12676(abstractC7818);
        while (abstractC7818M12676 != null) {
            if (!(abstractC7818M12676 instanceof C5432)) {
                AbstractC5710 abstractC5710Mo95842 = abstractC7818M12676.mo9584();
                if (abstractC5710Mo95842 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                AbstractC5746 abstractC5746M10409 = null;
                arrayDeque.add(new C5691(abstractC5710Mo95842, null));
                InterfaceC5705 interfaceC5705Mo10281 = abstractC5710Mo9584.mo10281();
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    C5691 c5691 = (C5691) arrayDeque.poll();
                    AbstractC5714 abstractC5714M10420 = c5691.f14487;
                    InterfaceC5705 interfaceC5705Mo102812 = abstractC5714M10420.mo10281();
                    if (interfaceC5705Mo102812 == null) {
                        AbstractC5692.m10252(3);
                        throw null;
                    }
                    if (interfaceC5705Mo10281 == null) {
                        AbstractC5692.m10252(4);
                        throw null;
                    }
                    if (interfaceC5705Mo102812.equals(interfaceC5705Mo10281)) {
                        boolean zMo10284 = abstractC5714M10420.mo10284();
                        for (C5691 c56912 = c5691.f14486; c56912 != null; c56912 = c56912.f14486) {
                            AbstractC5714 abstractC5714 = c56912.f14487;
                            List listMo10285 = abstractC5714.mo10285();
                            C5723 c5723 = AbstractC5701.f14508;
                            if (listMo10285 == null || !listMo10285.isEmpty()) {
                                Iterator it = listMo10285.iterator();
                                while (it.hasNext()) {
                                    Variance varianceMo10301 = ((AbstractC5702) it.next()).mo10301();
                                    Variance variance = Variance.INVARIANT;
                                    if (varianceMo10301 != variance) {
                                        abstractC5714M10420 = (AbstractC5714) AbstractC7082.m12302(new C5751(AbstractC7082.m12294(c5723.m10355(abstractC5714.mo10281(), abstractC5714.mo10285()))).m10420(abstractC5714M10420, variance)).f19792;
                                        break;
                                    }
                                }
                                abstractC5714M10420 = new C5751(c5723.m10355(abstractC5714.mo10281(), abstractC5714.mo10285())).m10420(abstractC5714M10420, Variance.INVARIANT);
                            } else {
                                abstractC5714M10420 = new C5751(c5723.m10355(abstractC5714.mo10281(), abstractC5714.mo10285())).m10420(abstractC5714M10420, Variance.INVARIANT);
                            }
                            zMo10284 = zMo10284 || abstractC5714.mo10284();
                        }
                        InterfaceC5705 interfaceC5705Mo102813 = abstractC5714M10420.mo10281();
                        if (interfaceC5705Mo102813 == null) {
                            AbstractC5692.m10252(3);
                            throw null;
                        }
                        if (!interfaceC5705Mo102813.equals(interfaceC5705Mo10281)) {
                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + AbstractC5692.m10259(interfaceC5705Mo102813) + ", \n\nsupertype: " + AbstractC5692.m10259(interfaceC5705Mo10281) + " \n" + interfaceC5705Mo102813.equals(interfaceC5705Mo10281));
                        }
                        abstractC5746M10409 = AbstractC5749.m10409(abstractC5714M10420, zMo10284);
                    } else {
                        for (AbstractC5714 abstractC57142 : interfaceC5705Mo102812.mo10053()) {
                            abstractC57142.getClass();
                            arrayDeque.add(new C5691(abstractC57142, c5691));
                        }
                    }
                }
            }
            abstractC7818M12676 = AbstractC7699.m12676(abstractC7818M12676);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static File m13619(Context context) {
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
    public static InterfaceC8924 m13620(int i, int i2, String str) {
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
            InterfaceC8924.f22683.getClass();
            return C8947.f22759;
        }
        C8942 c8942 = InterfaceC8924.f22683;
        C8934 c8934 = new C8934(2);
        int length = str.length() - 1;
        if (i <= length) {
            i3 = i;
            int i6 = i3;
            i4 = -1;
            while (i5 != 1000) {
                char cCharAt = str.charAt(i6);
                if (cCharAt == '&') {
                    str2 = str;
                    m13627(c8934, str2, i3, i4, i6, z);
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
            return c8934.build();
        }
        str2 = str;
        i3 = i;
        i4 = -1;
        if (i5 != 1000) {
            m13627(c8934, str2, i3, i4, str2.length(), z);
        }
        return c8934.build();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static MappedByteBuffer m13621(Context context, Uri uri) {
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
    public static Set m13622(Set set, AbstractSet abstractSet) {
        abstractSet.getClass();
        if (abstractSet.isEmpty()) {
            return AbstractC5176.m9347(set);
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
    public static boolean m13623(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m13624(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m13625(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final boolean m13626(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m13627(C8934 c8934, String str, int i, int i2, int i3, boolean z) {
        if (i2 == -1) {
            int iM13610 = m13610(i, i3, str);
            int iM13608 = m13608(iM13610, i3, str);
            if (iM13608 > iM13610) {
                c8934.mo2969(z ? AbstractC8940.m14136(iM13610, iM13608, str, 12) : str.substring(iM13610, iM13608), EmptyList.INSTANCE);
                return;
            }
            return;
        }
        int iM136102 = m13610(i, i2, str);
        int iM136082 = m13608(iM136102, i2, str);
        if (iM136082 > iM136102) {
            String strM14136 = z ? AbstractC8940.m14136(iM136102, iM136082, str, 12) : str.substring(iM136102, iM136082);
            int iM136103 = m13610(i2 + 1, i3, str);
            int iM136083 = m13608(iM136103, i3, str);
            c8934.mo2983(strM14136, z ? AbstractC8940.m14136(iM136103, iM136083, str, 8) : str.substring(iM136103, iM136083));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m13628(C2266 c2266, long j) {
        if (!c2266.f6637.f6624) {
            return false;
        }
        C2606 c2606 = AbstractC2620.m3906(c2266).f5439.f5631;
        if (!c2606.f5548.f6624) {
            return false;
        }
        long jMo3636 = c2606.mo3636(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo3636 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo3636 & 4294967295L));
        long j2 = c2266.f4457;
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
    public static final C8157 m13629(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C8157(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8724 m13630() {
        return new C8724(1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ColorStateList m13631(Context context, C0955 c0955, int i) {
        int resourceId;
        ColorStateList colorStateListM13478;
        TypedArray typedArray = (TypedArray) c0955.f665;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM13478 = AbstractC8482.m13478(context, resourceId)) == null) ? c0955.m945(i) : colorStateListM13478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static ColorStateList m13632(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM13478;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM13478 = AbstractC8482.m13478(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM13478;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterfaceC5312 m13633(InterfaceC5312 interfaceC5312) {
        interfaceC5312.getClass();
        if (!AbstractC5434.f13793.contains(interfaceC5312.getName()) && !AbstractC5438.f13799.contains(AbstractC5605.m10065(interfaceC5312).getName())) {
            return null;
        }
        if ((interfaceC5312 instanceof InterfaceC5305) || (interfaceC5312 instanceof AbstractC7823)) {
            return AbstractC5605.m10061(interfaceC5312, C5440.f13807);
        }
        if (interfaceC5312 instanceof InterfaceC5303) {
            return AbstractC5605.m10061(interfaceC5312, C5440.f13808);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC5312 m13634(InterfaceC5312 interfaceC5312) {
        interfaceC5312.getClass();
        InterfaceC5312 interfaceC5312M13633 = m13633(interfaceC5312);
        if (interfaceC5312M13633 != null) {
            return interfaceC5312M13633;
        }
        int i = AbstractC5439.f13803;
        C5523 name = interfaceC5312.getName();
        name.getClass();
        if (AbstractC5434.f13784.contains(name)) {
            return AbstractC5605.m10061(interfaceC5312, C5440.f13806);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Drawable m13635(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM8871;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM8871 = AbstractC4765.m8871(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM8871;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final String m13636(InterfaceC5316 interfaceC5316) {
        C5523 c5523;
        InterfaceC5312 interfaceC5312M13633 = AbstractC7359.m12571(interfaceC5316) ? m13633(interfaceC5316) : null;
        if (interfaceC5312M13633 != null) {
            InterfaceC5312 interfaceC5312M10065 = AbstractC5605.m10065(interfaceC5312M13633);
            if (interfaceC5312M10065 instanceof InterfaceC5305) {
                AbstractC7359.m12571(interfaceC5312M10065);
                InterfaceC5312 interfaceC5312M10061 = AbstractC5605.m10061(AbstractC5605.m10065(interfaceC5312M10065), C5440.f13805);
                if (interfaceC5312M10061 != null && (c5523 = (C5523) AbstractC5438.f13802.get(AbstractC5605.m10064(interfaceC5312M10061))) != null) {
                    return c5523.m9894();
                }
            } else if (interfaceC5312M10065 instanceof InterfaceC5303) {
                int i = AbstractC5441.f13812;
                LinkedHashMap linkedHashMap = AbstractC5434.f13792;
                String strM7219 = AbstractC3887.m7219((InterfaceC5303) interfaceC5312M10065);
                C5523 c55232 = strM7219 == null ? null : (C5523) linkedHashMap.get(strM7219);
                if (c55232 != null) {
                    return c55232.m9894();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final boolean m13637(char c, char c2, boolean z) {
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
    public static final C7061 m13638(String str, List list) {
        List listM9405;
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵呜喵~喵喵呜呜呜呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵喵喵");
        AbstractC9234.m14531(2870);
        list.getClass();
        C6972 c6972 = new C6972();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c6972.f17187 = AbstractC7059.m12256(3L, timeUnit);
        timeUnit.getClass();
        c6972.f17188 = AbstractC7059.m12256(3L, timeUnit);
        c6972.f17178 = AbstractC7059.m12256(3L, timeUnit);
        C6956 c6956 = new C6956(c6972);
        C6977 c6977 = new C6977(0);
        c6977.m12097(null, str);
        C6978 c6978M12094 = c6977.m12094();
        if (list.isEmpty()) {
            listM9405 = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(InetAddress.getByName((String) it.next()));
            }
            InetAddress[] inetAddressArr = (InetAddress[]) arrayList.toArray(new InetAddress[0]);
            listM9405 = AbstractC5179.m9405((InetAddress[]) Arrays.copyOf(inetAddressArr, inetAddressArr.length));
        }
        C6972 c6972M12076 = c6956.m12076();
        C6973 c6973 = C7061.f17514;
        InterfaceC6984 c7062 = listM9405 != null ? new C7062(c6978M12094.f17226, listM9405) : InterfaceC6984.f17267;
        if (!c7062.equals(c6972M12076.f17200)) {
            c6972M12076.f17174 = null;
        }
        c6972M12076.f17200 = c7062;
        return new C7061(new C6956(c6972M12076), c6978M12094);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5925 m13639(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (interfaceC8020 instanceof C8023) {
            return ((C8023) interfaceC8020).f19541;
        }
        if (interfaceC8020 instanceof C7970) {
            return m13639(((C7970) interfaceC8020).f19442);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m13640(byte[] bArr) {
        byte[] bArr2 = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AbstractC9234.m14532("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵呜呜呜呜"));
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
    public static final void m13641(C2397 c2397, String str, String str2) {
        c2397.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = c2397.f4945;
        arrayList.add(str);
        arrayList.add(AbstractC5976.m10714(str2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m13642(int i) {
        if (2 > i || i >= 37) {
            C5043.m9162(new C7348(2, 36, 1), AbstractC0900.m710(i, "radix ", " was not in valid range "));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m13643(File file, InputStream inputStream) throws Throwable {
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
    public static final C4718 m13644(String str, InterfaceC7372 interfaceC7372, InterfaceC7387 interfaceC7387) {
        interfaceC7372.getClass();
        C4718 c4718 = new C4718(0);
        C5229 c5229 = AbstractC5228.f13320;
        c5229.mo9476(AbstractC4717.class);
        try {
            C5917 c5917 = C5917.f14981;
            AbstractC5226 abstractC5226Mo9480 = c5229.mo9480(c5229.mo9476(C4718.class), KVariance.INVARIANT);
            c5229.mo9479(abstractC5226Mo9480, Collections.singletonList(AbstractC5228.m9471(Object.class)));
            AbstractC5228.m9470(AbstractC4717.class, AbstractC5922.m10659(c5229.mo9478(abstractC5226Mo9480, Collections.EMPTY_LIST, false)));
        } catch (Throwable unused) {
        }
        if (!AbstractC5976.m10731(str)) {
            return c4718;
        }
        C6755.m11869("Name can't be blank");
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
    */
    public static final InterfaceC7318 m13645(AbstractC5810 abstractC5810, boolean z) {
        C5348 c5348;
        InterfaceC7318 c7332;
        InterfaceC7318 c7327;
        boolean zM1137;
        AbstractC5814 abstractC5814Mo10518 = abstractC5810.mo10518();
        boolean zM14257 = AbstractC9019.m14257(abstractC5814Mo10518);
        C5368 c5368 = abstractC5814Mo10518.f14723;
        if (zM14257) {
            return C7326.f18149;
        }
        AbstractC5835 abstractC5835 = abstractC5814Mo10518.f14729;
        if (z) {
            c5368.getClass();
            c5348 = AbstractC3888.m7266(c5368).f19287;
        } else {
            c5368.getClass();
            c5348 = AbstractC3888.m7266(c5368).f19286;
        }
        Method methodM10536 = c5348 != null ? abstractC5835.m10536(c5348.f13506, c5348.f13505) : null;
        int i = 2;
        int i2 = 6;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (methodM10536 == null) {
            if (AbstractC1298.m1707(abstractC5814Mo10518) && abstractC5814Mo10518.getVisibility() == KVisibility.INTERNAL) {
                Class clsM1704 = AbstractC1298.m1704(((InterfaceC5940) AbstractC5176.m9338(abstractC5814Mo10518.getParameters())).getType());
                if (clsM1704 != null) {
                    Method methodM1730 = AbstractC1298.m1730(clsM1704, abstractC5814Mo10518);
                    c7327 = AbstractC5894.m10601(abstractC5810) ? new C7327(methodM1730, AbstractC5894.m10608(abstractC5810.mo10518())) : new C7328(methodM1730);
                    return AbstractC1298.m1738(EmptyList.INSTANCE, abstractC5810, c7327, false);
                }
                throw new KotlinReflectionInternalError("Underlying property of inline class " + abstractC5814Mo10518 + " should have a field");
            }
            Field fieldMo10499 = abstractC5814Mo10518.mo10499();
            if (fieldMo10499 == null) {
                C5043.m9154(abstractC5814Mo10518, "No accessors or field is found for property ");
                return null;
            }
            boolean z3 = true;
            if ((abstractC5835 instanceof C5836) && ((C5836) abstractC5835).m10544() == ClassKind.COMPANION_OBJECT) {
                Class<?> enclosingClass = AbstractC3889.m7316((InterfaceC5925) abstractC5835).getEnclosingClass();
                enclosingClass.getClass();
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(enclosingClass);
                C5836 c5836 = interfaceC5925Mo9476 instanceof C5836 ? (C5836) interfaceC5925Mo9476 : null;
                if (c5836 != null) {
                    if (c5836.m10544() == ClassKind.INTERFACE || c5836.m10544() == ClassKind.ANNOTATION_CLASS) {
                        InterfaceC5920[] interfaceC5920Arr = AbstractC5351.f13513;
                        c5368.getClass();
                        zM1137 = AbstractC5351.f13512.m1137(c5368, AbstractC5351.f13513[6]);
                    } else {
                        zM1137 = true;
                    }
                }
                if (zM1137) {
                    if (!z) {
                    }
                }
            } else {
                zM1137 = false;
                if (zM1137 && Modifier.isStatic(fieldMo10499.getModifiers())) {
                    m13646(abstractC5810);
                    c7332 = z ? new C7340(fieldMo10499, z2, i) : new C7329(fieldMo10499, !AbstractC5899.m10637(abstractC5814Mo10518.getReturnType()), objArr6 == true ? 1 : 0, i);
                } else {
                    c7332 = !z ? AbstractC5894.m10601(abstractC5810) ? new C7335(fieldMo10499, AbstractC5894.m10608(abstractC5810.mo10518())) : new C7340(fieldMo10499, z3, objArr5 == true ? 1 : 0) : AbstractC5894.m10601(abstractC5810) ? new C7338(fieldMo10499, !AbstractC5899.m10637(abstractC5814Mo10518.getReturnType()), AbstractC5894.m10608(abstractC5810.mo10518())) : new C7329(fieldMo10499, !AbstractC5899.m10637(abstractC5814Mo10518.getReturnType()), z3, objArr4 == true ? 1 : 0);
                }
            }
            return AbstractC1298.m1738(EmptyList.INSTANCE, abstractC5810, c7327, false);
        }
        if (Modifier.isStatic(methodM10536.getModifiers())) {
            m13646(abstractC5810);
            c7332 = AbstractC5894.m10601(abstractC5810) ? new C7332(methodM10536, false, AbstractC5894.m10608(abstractC5810.mo10518())) : new C7324(i2, i, methodM10536, objArr == true ? 1 : 0);
        } else {
            c7332 = AbstractC5894.m10601(abstractC5810) ? new C7334(methodM10536, AbstractC5894.m10608(abstractC5810.mo10518())) : new C7324(i2, objArr3 == true ? 1 : 0, methodM10536, objArr2 == true ? 1 : 0);
        }
        c7327 = c7332;
        return AbstractC1298.m1738(EmptyList.INSTANCE, abstractC5810, c7327, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m13646(AbstractC5810 abstractC5810) {
        if (abstractC5810.mo10518().f14729 instanceof C5824) {
            return;
        }
        C6385.m11431(abstractC5810, "Only top-level properties are supported for now: ");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public void mo13253(View view, float f) {
        if (f21345) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f21345 = false;
            }
        }
        view.setAlpha(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public float mo13254(View view) {
        if (f21345) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f21345 = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract String[] mo13647(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract boolean mo13648(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract Constructor mo13649(Class cls);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract Method mo13650(Class cls, Field field);
}
