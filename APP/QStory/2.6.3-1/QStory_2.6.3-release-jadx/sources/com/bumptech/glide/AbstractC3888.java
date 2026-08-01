package com.bumptech.glide;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.graphics.Rect;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.RunnableC0946;
import androidx.appcompat.widget.C0984;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.C1905;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC1648;
import androidx.compose.foundation.text.contextmenu.provider.C1669;
import androidx.compose.foundation.text.contextmenu.provider.C1670;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.semantics.C2780;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.core.view.AbstractC3059;
import com.alibaba.fastjson2.InterfaceC3749;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.response.InterfaceC4968;
import io.ktor.util.C5043;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C5160;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5471;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5976;
import kotlin.text.C5978;
import kotlin.text.C5980;
import kotlin.text.C5983;
import kotlin.text.InterfaceC5982;
import org.apache.commons.lang3.AbstractC6516;
import p023.C6973;
import p025.AbstractC7012;
import p049.AbstractC7166;
import p068.InterfaceC7387;
import p083.C7715;
import p083.C7716;
import p101.C7881;
import p101.C7884;
import p101.C7885;
import p101.C7886;
import p102.C7892;
import p117.C8082;
import p117.C8084;
import p117.InterfaceC8083;
import p119.C8103;
import p246.C8878;
import p267.AbstractC9004;
import p267.C8998;
import p267.C8999;
import p267.C9000;
import p267.C9001;
import p267.C9003;
import p267.C9006;
import p267.C9009;
import p267.C9010;
import p267.C9012;
import p267.C9013;
import p267.SharedPreferencesC9005;
import p300.InterfaceC9214;
import p300.InterfaceC9215;
import p303.AbstractC9234;
import p348.C9614;
import p348.C9615;
import p368.RunnableC9697;
import p407.AbstractC9926;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String f10104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Context f10105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2378 f10106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AtomicBoolean f10107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1171 f10108;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m7235(SharedPreferencesC9005 sharedPreferencesC9005) {
        sharedPreferencesC9005.f22862 = 12;
        sharedPreferencesC9005.f22861 = 0L;
        sharedPreferencesC9005.f22880.clear();
        sharedPreferencesC9005.f22877 = 0;
        sharedPreferencesC9005.f22878.clear();
        C0984 c0984 = sharedPreferencesC9005.f22883;
        if (c0984 == null || ((byte[]) c0984.f939).length != SharedPreferencesC9005.f22857) {
            sharedPreferencesC9005.f22883 = new C0984(SharedPreferencesC9005.f22857);
        } else {
            c0984.m1135(4, 0L);
        }
        sharedPreferencesC9005.f22883.m1134(0, sharedPreferencesC9005.f22863 != null ? 1073741824 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m7236(SharedPreferencesC9005 sharedPreferencesC9005) {
        File[] fileArrListFiles;
        MappedByteBuffer mappedByteBuffer;
        C9006 c9006;
        C9006[] c9006Arr = (C9006[]) sharedPreferencesC9005.f22864.values().toArray(new C9006[sharedPreferencesC9005.f22864.size()]);
        String str = "temp_" + sharedPreferencesC9005.f22865;
        SharedPreferencesC9005 sharedPreferencesC90052 = new SharedPreferencesC9005(sharedPreferencesC9005.f22866, str, c9006Arr, sharedPreferencesC9005.f22863, 2);
        synchronized (sharedPreferencesC90052) {
            sharedPreferencesC90052.f22860 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sharedPreferencesC9005.f22880.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C9013) {
                C9013 c9013 = (C9013) value;
                boolean z = c9013.f22898;
                Object obj = c9013.f22901;
                if (z) {
                    arrayList.add((String) obj);
                    String strM7270 = m7270(sharedPreferencesC9005, c9013, null);
                    if (strM7270 != null) {
                        sharedPreferencesC90052.putString(str2, strM7270);
                    }
                } else {
                    sharedPreferencesC90052.putString(str2, (String) obj);
                }
            } else if (value instanceof C9001) {
                sharedPreferencesC90052.putBoolean(str2, ((C9001) value).f22852);
            } else if (value instanceof C8998) {
                sharedPreferencesC90052.putInt(str2, ((C8998) value).f22849);
            } else if (value instanceof C9010) {
                sharedPreferencesC90052.putLong(str2, ((C9010) value).f22891);
            } else if (value instanceof C8999) {
                sharedPreferencesC90052.putFloat(str2, ((C8999) value).f22850);
            } else if (value instanceof C9000) {
                sharedPreferencesC90052.m14227(str2, ((C9000) value).f22851);
            } else if (value instanceof C9003) {
                C9003 c9003 = (C9003) value;
                boolean z2 = c9003.f22898;
                Object obj2 = c9003.f22901;
                if (z2) {
                    arrayList.add((String) obj2);
                    byte[] bArrM7275 = m7275(sharedPreferencesC9005, c9003, null);
                    if (bArrM7275 != null) {
                        sharedPreferencesC90052.m14223(str2, bArrM7275);
                    }
                } else {
                    sharedPreferencesC90052.m14223(str2, (byte[]) obj2);
                }
            } else if (value instanceof C9009) {
                C9009 c9009 = (C9009) value;
                if (c9009.f22898) {
                    arrayList.add((String) c9009.f22901);
                    LinkedHashSet linkedHashSetM7269 = m7269(sharedPreferencesC9005, c9009, null);
                    if (linkedHashSetM7269 != null && (c9006 = c9009.f22890) != null) {
                        sharedPreferencesC90052.m14228(str2, linkedHashSetM7269, c9006);
                    }
                } else {
                    C9006 c90062 = c9009.f22890;
                    if (c90062 != null) {
                        sharedPreferencesC90052.m14228(str2, c9009.f22901, c90062);
                    }
                }
            }
        }
        sharedPreferencesC90052.contains("");
        sharedPreferencesC9005.f22883 = sharedPreferencesC90052.f22883;
        sharedPreferencesC9005.f22861 = sharedPreferencesC90052.f22861;
        sharedPreferencesC9005.f22862 = sharedPreferencesC90052.f22862;
        sharedPreferencesC9005.f22877 = 0;
        sharedPreferencesC9005.f22878.clear();
        sharedPreferencesC9005.f22880.clear();
        sharedPreferencesC9005.f22880.putAll(sharedPreferencesC90052.f22880);
        C0984 c0984 = sharedPreferencesC90052.f22883;
        if (sharedPreferencesC9005.f22870 == 0) {
            int length = ((byte[]) c0984.f939).length;
            MappedByteBuffer mappedByteBuffer2 = sharedPreferencesC9005.f22871;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = sharedPreferencesC9005.f22872) != null && mappedByteBuffer.capacity() == length) {
                sharedPreferencesC9005.f22871.position(0);
                sharedPreferencesC9005.f22871.put((byte[]) c0984.f939, 0, sharedPreferencesC9005.f22862);
                sharedPreferencesC9005.f22872.position(0);
                sharedPreferencesC9005.f22872.put((byte[]) c0984.f939, 0, sharedPreferencesC9005.f22862);
            } else if (!m7285(sharedPreferencesC9005, c0984)) {
                sharedPreferencesC9005.f22870 = 1;
            }
        }
        if (sharedPreferencesC9005.f22870 != 0) {
            m7284(sharedPreferencesC9005);
        }
        File file = new File(sharedPreferencesC9005.f22866, str);
        String str3 = sharedPreferencesC9005.f22866 + sharedPreferencesC9005.f22865;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    AbstractC3897.m7369(file2, new File(str3, file2.getName()));
                } catch (Exception unused) {
                }
            }
        }
        AbstractC3897.m7391(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3897.m7391(new File(str3, (String) it.next()));
        }
        sharedPreferencesC9005.f22874 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static MappedByteBuffer m7237(FileChannel fileChannel, int i) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static int m7238(InterfaceC9215 interfaceC9215, int i, boolean z) {
        int i2 = 0;
        if (z) {
            while (i >= 0) {
                i2 = ((interfaceC9215.readByte() & DefaultClassResolver.NAME) << 24) | (i2 >>> 8);
                i--;
            }
            return i2;
        }
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC9215.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >>> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m7239(SharedPreferencesC9005 sharedPreferencesC9005, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM7237;
        int iCapacity = mappedByteBuffer.capacity();
        int i = SharedPreferencesC9005.f22857;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC9005.f22871 ? sharedPreferencesC9005.f22868 : sharedPreferencesC9005.f22867;
            try {
                fileChannel.truncate(i);
                mappedByteBufferM7237 = m7237(fileChannel, i);
            } catch (IOException unused) {
                mappedByteBufferM7237 = null;
            }
            if (mappedByteBufferM7237 == null) {
                C6755.m11866("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == sharedPreferencesC9005.f22871) {
                sharedPreferencesC9005.f22871 = mappedByteBufferM7237;
            } else {
                sharedPreferencesC9005.f22872 = mappedByteBufferM7237;
            }
            mappedByteBuffer = mappedByteBufferM7237;
        }
        mappedByteBuffer.putInt(0, sharedPreferencesC9005.f22863 != null ? 1073741824 : 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static void m7240() {
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C9012 c9012 = new C9012(C8878.f22563, strM14532);
        c9012.f22895 = new C5317();
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = c9012.m14232();
        String strM145322 = AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜");
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        sharedPreferencesC9005M14232.remove(strM145322);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static int m7241(InterfaceC9215 interfaceC9215, int i) {
        int i2 = 0;
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC9215.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String m7242(InputStreamReader inputStreamReader) throws IOException {
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

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static int m7243(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m7244(SharedPreferencesC9005 sharedPreferencesC9005, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i = (int) length;
            int iM7265 = m7265(SharedPreferencesC9005.f22857, i);
            C0984 c0984 = sharedPreferencesC9005.f22883;
            if (c0984 == null || ((byte[]) c0984.f939).length != iM7265) {
                c0984 = new C0984(new byte[iM7265], 0);
                sharedPreferencesC9005.f22883 = c0984;
            } else {
                c0984.f941 = 0;
            }
            AbstractC3897.m7376(file, (byte[]) c0984.f939, i);
            int iM1125 = c0984.m1125();
            if (iM1125 >= 0) {
                int i2 = (-1073741825) & iM1125;
                boolean z = (iM1125 & 1073741824) != 0;
                long jM1141 = c0984.m1141(c0984.f941);
                c0984.f941 += 8;
                sharedPreferencesC9005.f22862 = i2 + 12;
                if (i2 >= 0 && i2 <= i - 12 && jM1141 == c0984.m1126(12, i2) && AbstractC3889.m7308(sharedPreferencesC9005, z)) {
                    sharedPreferencesC9005.f22861 = jM1141;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m7245(SharedPreferencesC9005 sharedPreferencesC9005, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC9005.f22871;
        String str = sharedPreferencesC9005.f22865;
        int i = mappedByteBuffer.getInt();
        int i2 = i & (-1073741825);
        boolean z = (i & 1073741824) != 0;
        long j4 = sharedPreferencesC9005.f22871.getLong();
        int i3 = sharedPreferencesC9005.f22872.getInt();
        int i4 = (-1073741825) & i3;
        boolean z2 = (1073741824 & i3) != 0;
        long j5 = sharedPreferencesC9005.f22872.getLong();
        if (i2 < 0) {
            j3 = 12;
        } else if (i2 <= j - 12) {
            sharedPreferencesC9005.f22862 = i2 + 12;
            sharedPreferencesC9005.f22871.rewind();
            j3 = 12;
            sharedPreferencesC9005.f22871.get((byte[]) sharedPreferencesC9005.f22883.f939, 0, sharedPreferencesC9005.f22862);
            if (j4 == sharedPreferencesC9005.f22883.m1126(12, i2) && AbstractC3889.m7308(sharedPreferencesC9005, z)) {
                sharedPreferencesC9005.f22861 = j4;
                if (j == j2) {
                    byte[] bArr = new byte[sharedPreferencesC9005.f22862];
                    sharedPreferencesC9005.f22872.rewind();
                    sharedPreferencesC9005.f22872.get(bArr, 0, sharedPreferencesC9005.f22862);
                    byte[] bArr2 = (byte[]) sharedPreferencesC9005.f22883.f939;
                    for (int i5 = 0; i5 < sharedPreferencesC9005.f22862; i5++) {
                        if (bArr2[i5] == bArr[i5]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m7281(sharedPreferencesC9005, sharedPreferencesC9005.f22871, sharedPreferencesC9005.f22872, sharedPreferencesC9005.f22862);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i4 >= 0 && i4 <= j2 - j3) {
            sharedPreferencesC9005.f22880.clear();
            sharedPreferencesC9005.f22877 = 0;
            sharedPreferencesC9005.f22878.clear();
            sharedPreferencesC9005.f22862 = i4 + 12;
            if (((byte[]) sharedPreferencesC9005.f22883.f939).length != sharedPreferencesC9005.f22872.capacity()) {
                sharedPreferencesC9005.f22883 = new C0984(sharedPreferencesC9005.f22872.capacity());
            }
            sharedPreferencesC9005.f22872.rewind();
            sharedPreferencesC9005.f22872.get((byte[]) sharedPreferencesC9005.f22883.f939, 0, sharedPreferencesC9005.f22862);
            if (j5 == sharedPreferencesC9005.f22883.m1126(12, i4) && AbstractC3889.m7308(sharedPreferencesC9005, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m7281(sharedPreferencesC9005, sharedPreferencesC9005.f22872, sharedPreferencesC9005.f22871, sharedPreferencesC9005.f22862);
                sharedPreferencesC9005.f22861 = j5;
                return;
            }
        }
        AbstractC3898.m7426(sharedPreferencesC9005, "both files error");
        m7259(sharedPreferencesC9005);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m7246(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m7247(Context context) {
        String str = f10104;
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC4765.m8869(resources, str);
            return;
        }
        if (AbstractC4765.f12495 == null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
                try {
                    ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(parcelFileDescriptorOpen);
                    AbstractC9926.m15242();
                    ResourcesLoader resourcesLoaderM4639 = AbstractC3059.m4639();
                    resourcesLoaderM4639.addProvider(resourcesProviderLoadFromApk);
                    AbstractC4765.f12495 = resourcesLoaderM4639;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                } finally {
                }
            } catch (IOException unused) {
                return;
            }
        }
        AbstractC4765.m8860(new RunnableC9697(resources, 7, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static C1171 m7248() {
        C1171 c1171;
        C1171 c11712 = f10108;
        if (c11712 != null) {
            return c11712;
        }
        Object obj = null;
        try {
            c1171 = new C1171(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
        } catch (NoSuchMethodException unused) {
            c1171 = new C1171(obj, obj, obj, obj, 7);
        }
        f10108 = c1171;
        return c1171;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final void m7249(InterfaceC4968 interfaceC4968, String str, String str2) {
        interfaceC4968.getClass();
        str2.getClass();
        interfaceC4968.mo943().m849(str, str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m7250(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            C6755.m11869("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m7257(b2)) {
            C6755.m11869("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m7251(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m7257(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m7257(b3)))) {
            C6755.m11869("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m7252(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m7257(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m7257(b3) && !m7257(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        C6755.m11869("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Boolean m7253(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method method = (Method) m7248().f1440;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m7254(SharedPreferencesC9005 sharedPreferencesC9005) {
        String str = sharedPreferencesC9005.f22866;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC9005.f22865;
        File file = new File(str, AbstractC0900.m711(sb, str2, ".kvc"));
        File file2 = new File(str, AbstractC0900.m696(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m7244(sharedPreferencesC9005, file)) {
                    m7235(sharedPreferencesC9005);
                    m7279(sharedPreferencesC9005);
                    return false;
                }
                if (sharedPreferencesC9005.f22870 == 0) {
                    if (!m7285(sharedPreferencesC9005, sharedPreferencesC9005.f22883)) {
                        sharedPreferencesC9005.f22870 = 1;
                        return false;
                    }
                    AbstractC3898.m7415(sharedPreferencesC9005, "recover from c file");
                    try {
                        m7279(sharedPreferencesC9005);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (sharedPreferencesC9005.f22870 != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m7291(sharedPreferencesC9005, file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m7255(SharedPreferencesC9005 sharedPreferencesC9005) {
        long j;
        String str = sharedPreferencesC9005.f22866;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC9005.f22865;
        File file = new File(str, AbstractC0900.m711(sb, str2, ".kva"));
        File file2 = new File(str, AbstractC0900.m696(str2, ".kvb"));
        try {
            if (AbstractC3897.m7370(file) && AbstractC3897.m7370(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC9005.f22868 = randomAccessFile.getChannel();
                sharedPreferencesC9005.f22867 = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC9005.f22868;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC9005.f22857);
                    sharedPreferencesC9005.f22871 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC9005.f22867;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = SharedPreferencesC9005.f22857;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    sharedPreferencesC9005.f22872 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC9005.f22883 = new C0984(sharedPreferencesC9005.f22871.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC9005.f22862 = 12;
                        return;
                    } else {
                        m7245(sharedPreferencesC9005, length, length2);
                        return;
                    }
                } catch (IOException e) {
                    Log.e("FastKV", str2, e);
                    m7286(sharedPreferencesC9005);
                    m7291(sharedPreferencesC9005, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m7286(sharedPreferencesC9005);
        } catch (Exception e2) {
            Log.e("FastKV", str2, e2);
            m7235(sharedPreferencesC9005);
            m7286(sharedPreferencesC9005);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m7256() {
        AtomicBoolean atomicBoolean = f10107;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        f10107 = new AtomicBoolean();
        try {
            AbstractC7166.m12425(AbstractC9234.m14531(65));
            f10107.set(false);
        } catch (Exception unused) {
            f10107.set(true);
        }
        return f10107.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m7257(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m7258(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m7259(SharedPreferencesC9005 sharedPreferencesC9005) {
        if (sharedPreferencesC9005.f22870 == 0) {
            try {
                m7239(sharedPreferencesC9005, sharedPreferencesC9005.f22871);
                m7239(sharedPreferencesC9005, sharedPreferencesC9005.f22872);
            } catch (Exception unused) {
                m7286(sharedPreferencesC9005);
            }
        }
        m7235(sharedPreferencesC9005);
        AbstractC3897.m7391(new File(sharedPreferencesC9005.f22866 + sharedPreferencesC9005.f22865));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m7260(Throwable th) {
        boolean z = (th == null || (th instanceof Error) || (th instanceof RuntimeException)) ? false : true;
        Object[] objArr = {th};
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC6516.m11611(objArr) ? "Not a checked exception: %s" : String.format("Not a checked exception: %s", objArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m7261(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
                if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m7262(int i, Rect rect, Rect rect2, Rect rect3) {
        int i2;
        int i3;
        boolean zM7261 = m7261(i, rect, rect2);
        if (!m7261(i, rect, rect3) && zM7261) {
            if (i == 17) {
                if (rect.left >= rect3.right) {
                }
                return true;
            }
            if (i == 33) {
                if (rect.top >= rect3.bottom) {
                }
                return true;
            }
            if (i == 66) {
                if (rect.right <= rect3.left) {
                }
                return true;
            }
            if (i != 130) {
                C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            if (rect.bottom <= rect3.top) {
                if (i != 17 && i != 66) {
                    int iM7243 = m7243(i, rect, rect2);
                    if (i == 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i == 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i == 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i != 130) {
                            C6755.m11869("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iM7243 < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1670 m7263(C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C2159) interfaceC2208).m2920(c2077)) || (i & 6) == 4;
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (z || objM2905 == c2188) {
            objM2905 = new C1670(c2077);
            c2159.m2946(objM2905);
        }
        C1670 c1670 = (C1670) objM2905;
        boolean zM2920 = c2159.m2920(c1670);
        Object objM29052 = c2159.m2905();
        if (zM2920 || objM29052 == c2188) {
            objM29052 = new C1905(c1670, 10);
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3044(c1670, (InterfaceC7387) objM29052, c2159);
        return c1670;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m7264(InterfaceC2962 interfaceC2962, AbstractC2225 abstractC2225, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-714464401);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(abstractC2225) ? 32 : 16;
        }
        int i3 = i & 384;
        C2077 c20772 = AbstractC1648.f2652;
        if (i3 == 0) {
            i2 |= c2159.m2938(c20772) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2938(c2077) ? 2048 : 1024;
        }
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = AbstractC2202.m3035(null, C2188.f4265);
                c2159.m2946(objM2905);
            }
            C1670 c1670M7263 = m7263(c20772, c2159, (i2 >> 6) & 14);
            AbstractC2202.m3047(abstractC2225.mo2988(c1670M7263), AbstractC2089.m2749(274270255, new C1669(interfaceC2962, (InterfaceC2230) objM2905, c2077, c1670M7263), c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(interfaceC2962, abstractC2225, c2077, i, 3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m7265(int i, int i2) {
        if (i2 >= 268435456) {
            C6755.m11870("data size out of limit");
            return 0;
        }
        int i3 = SharedPreferencesC9005.f22857;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7881 m7266(C5368 c5368) {
        c5368.getClass();
        C7892 c7892 = C7881.f19283;
        c7892.getClass();
        return (C7881) AbstractC3887.m7195(c5368.f13566, c7892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static C9615 m7267() {
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C9012 c9012 = new C9012(C8878.f22563, strM14532);
        c9012.f22895 = new C5317();
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = c9012.m14232();
        String strM145322 = AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜");
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜");
        String string = sharedPreferencesC9005M14232.getString(strM145322, "");
        return (C9615) ((string == null || string.length() == 0) ? null : InterfaceC3749.m6929(string, C9615.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C9614 m7268() {
        C9614 c9614 = new C9614();
        c9614.f25087 = AbstractC9234.m14532("喵呜喵喵喵喵呜呜");
        c9614.f25086 = AbstractC9234.m14531(1491);
        c9614.f25085 = 0;
        c9614.f25084 = AbstractC9234.m14531(1491);
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C9012 c9012 = new C9012(C8878.f22563, strM14532);
        c9012.f22895 = new C5317();
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = c9012.m14232();
        String strM14531 = AbstractC9234.m14531(1490);
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜");
        String string = sharedPreferencesC9005M14232.getString(strM14531, "");
        C9614 c96142 = (C9614) ((string == null || string.length() == 0) ? null : InterfaceC3749.m6929(string, C9614.class));
        return c96142 == null ? c9614 : c96142;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static LinkedHashSet m7269(SharedPreferencesC9005 sharedPreferencesC9005, C9009 c9009, C5317 c5317) {
        String str = sharedPreferencesC9005.f22865;
        try {
            byte[] bArrM7393 = AbstractC3897.m7393(new File(sharedPreferencesC9005.f22866 + str, (String) c9009.f22901));
            if (bArrM7393 == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            if (c5317 != null) {
                bArrM7393 = c5317.m9616(bArrM7393);
            }
            int i = bArrM7393[0] & DefaultClassResolver.NAME;
            String strM1128 = sharedPreferencesC9005.f22883.m1128(1, bArrM7393, i);
            C9006 c9006 = (C9006) sharedPreferencesC9005.f22864.get(strM1128);
            if (c9006 == null) {
                Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM1128)));
                return null;
            }
            c9009.f22890 = c9006;
            int i2 = i + 1;
            return C9006.m14230(i2, bArrM7393, bArrM7393.length - i2);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m7270(SharedPreferencesC9005 sharedPreferencesC9005, C9013 c9013, C5317 c5317) {
        String str = sharedPreferencesC9005.f22865;
        try {
            byte[] bArrM7393 = AbstractC3897.m7393(new File(sharedPreferencesC9005.f22866 + str, (String) c9013.f22901));
            if (bArrM7393 == null) {
                return null;
            }
            if (c5317 != null) {
                bArrM7393 = c5317.m9616(bArrM7393);
            }
            return new String(bArrM7393, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C6973 m7271(String str) {
        str.getClass();
        InterfaceC5982 interfaceC5982MatchAt = C6973.f17204.matchAt(str, 0);
        if (interfaceC5982MatchAt == null) {
            C6755.m11869(AbstractC7012.m12149('\"', "No subtype found for: \"", str));
            return null;
        }
        C5980 c5980 = (C5980) interfaceC5982MatchAt;
        String str2 = (String) ((C5160) c5980.m10740()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((C5160) c5980.m10740()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = c5980.m10739().f18161;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new C6973(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            InterfaceC5982 interfaceC5982MatchAt2 = C6973.f17203.matchAt(str, i2);
            if (interfaceC5982MatchAt2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            C5980 c59802 = (C5980) interfaceC5982MatchAt2;
            C5983 c5983 = c59802.f15042;
            C5978 c5978M10741 = c5983.m10741(1);
            String str3 = c5978M10741 != null ? c5978M10741.f15035 : null;
            if (str3 == null) {
                i = c59802.m10739().f18161;
            } else {
                C5978 c5978M107412 = c5983.m10741(2);
                String strM721 = c5978M107412 != null ? c5978M107412.f15035 : null;
                if (strM721 == null) {
                    C5978 c5978M107413 = c5983.m10741(3);
                    c5978M107413.getClass();
                    strM721 = c5978M107413.f15035;
                } else if (AbstractC5976.m10705(strM721, '\'') && AbstractC5976.m10718(strM721, '\'') && strM721.length() > 2) {
                    strM721 = AbstractC0900.m721(1, 1, strM721);
                }
                arrayList.add(str3);
                arrayList.add(strM721);
                i = c59802.m10739().f18161;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C5471 m7272(AbstractC5754 abstractC5754) {
        if (abstractC5754 instanceof C7715) {
            C7715 c7715 = (C7715) abstractC5754;
            String str = c7715.f18679;
            String str2 = c7715.f18678;
            str.getClass();
            str2.getClass();
            return new C5471(str.concat(str2));
        }
        if (!(abstractC5754 instanceof C7716)) {
            C5043.m9170();
            return null;
        }
        C7716 c7716 = (C7716) abstractC5754;
        String str3 = c7716.f18681;
        String str4 = c7716.f18680;
        str3.getClass();
        str4.getClass();
        return new C5471(AbstractC0900.m724('#', str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7885 m7273(C5362 c5362) {
        c5362.getClass();
        C7892 c7892 = C7885.f19294;
        c7892.getClass();
        return (C7885) AbstractC3887.m7195(c5362.f13540, c7892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7884 m7274(C5370 c5370) {
        c5370.getClass();
        C7892 c7892 = C7884.f19292;
        c7892.getClass();
        return (C7884) AbstractC3887.m7195(c5370.f13585, c7892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static byte[] m7275(SharedPreferencesC9005 sharedPreferencesC9005, C9003 c9003, C5317 c5317) {
        String str = sharedPreferencesC9005.f22865;
        try {
            byte[] bArrM7393 = AbstractC3897.m7393(new File(sharedPreferencesC9005.f22866 + str, (String) c9003.f22901));
            if (bArrM7393 != null) {
                return c5317 != null ? c5317.m9616(bArrM7393) : bArrM7393;
            }
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7886 m7276(C5381 c5381) {
        c5381.getClass();
        C7892 c7892 = C7886.f19296;
        c7892.getClass();
        return (C7886) AbstractC3887.m7195(c5381.f13638, c7892);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m7277(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C2780 m7278(InterfaceC7387... interfaceC7387Arr) {
        if (interfaceC7387Arr.length > 0) {
            return new C2780(interfaceC7387Arr, 2);
        }
        C6755.m11869("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m7279(SharedPreferencesC9005 sharedPreferencesC9005) {
        String str = sharedPreferencesC9005.f22865;
        String str2 = sharedPreferencesC9005.f22866;
        try {
            AbstractC3897.m7391(new File(str2, str + ".kvc"));
            AbstractC3897.m7391(new File(str2, str + ".tmp"));
        } catch (Exception e) {
            Log.e("FastKV", str, e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float m7280(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m7281(SharedPreferencesC9005 sharedPreferencesC9005, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM7237 = m7237(mappedByteBuffer2 == sharedPreferencesC9005.f22872 ? sharedPreferencesC9005.f22867 : sharedPreferencesC9005.f22868, mappedByteBuffer.capacity());
            if (mappedByteBufferM7237 == null) {
                Log.e("FastKV", sharedPreferencesC9005.f22865, new Exception("map failed"));
                m7286(sharedPreferencesC9005);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC9005.f22872) {
                    sharedPreferencesC9005.f22872 = mappedByteBufferM7237;
                } else {
                    sharedPreferencesC9005.f22871 = mappedByteBufferM7237;
                }
                mappedByteBuffer2 = mappedByteBufferM7237;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static InterfaceC8083 m7282(String str, List list) {
        C8084 c8084;
        list.getClass();
        C8103 c8103 = new C8103();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c8084 = C8084.f19681;
            if (!zHasNext) {
                break;
            }
            InterfaceC8083 interfaceC8083 = (InterfaceC8083) it.next();
            if (interfaceC8083 != c8084) {
                if (interfaceC8083 instanceof C8082) {
                    InterfaceC8083[] interfaceC8083Arr = ((C8082) interfaceC8083).f19678;
                    interfaceC8083Arr.getClass();
                    List listAsList = Arrays.asList(interfaceC8083Arr);
                    listAsList.getClass();
                    c8103.addAll(listAsList);
                } else {
                    c8103.add(interfaceC8083);
                }
            }
        }
        int i = c8103.f19719;
        return i != 0 ? i != 1 ? new C8082(str, (InterfaceC8083[]) c8103.toArray(new InterfaceC8083[0])) : (InterfaceC8083) c8103.get(0) : c8084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static void m7283(InterfaceC9214 interfaceC9214, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC9214.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC9214.writeByte((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static boolean m7284(SharedPreferencesC9005 sharedPreferencesC9005) {
        String str = sharedPreferencesC9005.f22865;
        String str2 = sharedPreferencesC9005.f22866;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC3897.m7370(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC9005.f22862);
                randomAccessFile.write((byte[]) sharedPreferencesC9005.f22883.f939, 0, sharedPreferencesC9005.f22862);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC9005.f22882;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC9004.m14194().execute(new RunnableC0946(sharedPreferencesC9005, 22, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } finally {
            }
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static boolean m7285(SharedPreferencesC9005 sharedPreferencesC9005, C0984 c0984) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = sharedPreferencesC9005.f22865;
        String str2 = sharedPreferencesC9005.f22866;
        try {
            int length = ((byte[]) c0984.f939).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC3897.m7370(file) || !AbstractC3897.m7370(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC9005.f22868 = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                sharedPreferencesC9005.f22871 = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC9005.f22871.put((byte[]) c0984.f939, 0, sharedPreferencesC9005.f22862);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e) {
                e = e;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j);
                FileChannel channel2 = randomAccessFile2.getChannel();
                sharedPreferencesC9005.f22867 = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                sharedPreferencesC9005.f22872 = map2;
                map2.order(byteOrder);
                sharedPreferencesC9005.f22872.put((byte[]) c0984.f939, 0, sharedPreferencesC9005.f22862);
                return true;
            } catch (Exception e2) {
                e = e2;
                AbstractC3897.m7400(randomAccessFile);
                AbstractC3897.m7400(randomAccessFile2);
                sharedPreferencesC9005.f22868 = null;
                sharedPreferencesC9005.f22867 = null;
                sharedPreferencesC9005.f22871 = null;
                sharedPreferencesC9005.f22872 = null;
                Log.e("FastKV", str, e);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static void m7286(SharedPreferencesC9005 sharedPreferencesC9005) {
        sharedPreferencesC9005.f22870 = 1;
        AbstractC3897.m7400(sharedPreferencesC9005.f22868);
        AbstractC3897.m7400(sharedPreferencesC9005.f22867);
        sharedPreferencesC9005.f22868 = null;
        sharedPreferencesC9005.f22867 = null;
        sharedPreferencesC9005.f22871 = null;
        sharedPreferencesC9005.f22872 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static long m7287(int i, long j) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m7288(InterfaceC9214 interfaceC9214, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        interfaceC9214.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC9214.writeByte((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static void m7289(InterfaceC9214 interfaceC9214, int i, long j) {
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((j >> 63) ^ j)) >> 3;
        interfaceC9214.writeByte(i | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            interfaceC9214.writeByte((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static final ExtractedText m7290(C2847 c2847) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2847.f6292.f6474;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2847.f6291;
        extractedText.selectionStart = C2869.m4317(j);
        extractedText.selectionEnd = C2869.m4310(j);
        extractedText.flags = !AbstractC5976.m10722(c2847.f6292.f6474, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static void m7291(SharedPreferencesC9005 sharedPreferencesC9005, File file, File file2) {
        String str = sharedPreferencesC9005.f22865;
        try {
            if (m7244(sharedPreferencesC9005, file)) {
                return;
            }
        } catch (IOException e) {
            Log.w("FastKV", str, e);
        }
        m7235(sharedPreferencesC9005);
        try {
            if (m7244(sharedPreferencesC9005, file2)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        m7235(sharedPreferencesC9005);
    }
}
