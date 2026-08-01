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
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0099;
import androidx.appcompat.widget.C0137;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC0808;
import androidx.compose.foundation.text.contextmenu.provider.C0829;
import androidx.compose.foundation.text.contextmenu.provider.C0830;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.semantics.C1945;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.core.view.AbstractC2226;
import com.alibaba.fastjson2.InterfaceC2916;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.server.response.InterfaceC4136;
import io.ktor.util.C4211;
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
import kotlin.collections.C4328;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4639;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.text.AbstractC5144;
import kotlin.text.C5146;
import kotlin.text.C5148;
import kotlin.text.C5151;
import kotlin.text.InterfaceC5150;
import org.apache.commons.lang3.AbstractC5686;
import p007.C6144;
import p009.AbstractC6183;
import p033.AbstractC6337;
import p052.InterfaceC6558;
import p067.C6886;
import p067.C6887;
import p085.C7052;
import p085.C7055;
import p085.C7056;
import p085.C7057;
import p086.C7063;
import p101.C7253;
import p101.C7255;
import p101.InterfaceC7254;
import p103.C7274;
import p230.C8049;
import p251.AbstractC8175;
import p251.C8169;
import p251.C8170;
import p251.C8171;
import p251.C8172;
import p251.C8174;
import p251.C8177;
import p251.C8180;
import p251.C8181;
import p251.C8183;
import p251.C8184;
import p251.SharedPreferencesC8176;
import p284.InterfaceC8385;
import p284.InterfaceC8386;
import p287.AbstractC8405;
import p332.C8785;
import p332.C8786;
import p352.RunnableC8868;
import p391.AbstractC9097;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String f9759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Context f9760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C1543 f9761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static AtomicBoolean f9762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C0325 f9763;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m6675(SharedPreferencesC8176 sharedPreferencesC8176) {
        sharedPreferencesC8176.f22517 = 12;
        sharedPreferencesC8176.f22516 = 0L;
        sharedPreferencesC8176.f22535.clear();
        sharedPreferencesC8176.f22532 = 0;
        sharedPreferencesC8176.f22533.clear();
        C0137 c0137 = sharedPreferencesC8176.f22538;
        if (c0137 == null || ((byte[]) c0137.f594).length != SharedPreferencesC8176.f22512) {
            sharedPreferencesC8176.f22538 = new C0137(SharedPreferencesC8176.f22512);
        } else {
            c0137.m575(4, 0L);
        }
        sharedPreferencesC8176.f22538.m574(0, sharedPreferencesC8176.f22518 != null ? 1073741824 : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m6676(SharedPreferencesC8176 sharedPreferencesC8176) {
        File[] fileArrListFiles;
        MappedByteBuffer mappedByteBuffer;
        C8177 c8177;
        C8177[] c8177Arr = (C8177[]) sharedPreferencesC8176.f22519.values().toArray(new C8177[sharedPreferencesC8176.f22519.size()]);
        String str = "temp_" + sharedPreferencesC8176.f22520;
        SharedPreferencesC8176 sharedPreferencesC81762 = new SharedPreferencesC8176(sharedPreferencesC8176.f22521, str, c8177Arr, sharedPreferencesC8176.f22518, 2);
        synchronized (sharedPreferencesC81762) {
            sharedPreferencesC81762.f22515 = false;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : sharedPreferencesC8176.f22535.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof C8184) {
                C8184 c8184 = (C8184) value;
                boolean z = c8184.f22553;
                Object obj = c8184.f22556;
                if (z) {
                    arrayList.add((String) obj);
                    String strM6710 = m6710(sharedPreferencesC8176, c8184, null);
                    if (strM6710 != null) {
                        sharedPreferencesC81762.putString(str2, strM6710);
                    }
                } else {
                    sharedPreferencesC81762.putString(str2, (String) obj);
                }
            } else if (value instanceof C8172) {
                sharedPreferencesC81762.putBoolean(str2, ((C8172) value).f22507);
            } else if (value instanceof C8169) {
                sharedPreferencesC81762.putInt(str2, ((C8169) value).f22504);
            } else if (value instanceof C8181) {
                sharedPreferencesC81762.putLong(str2, ((C8181) value).f22546);
            } else if (value instanceof C8170) {
                sharedPreferencesC81762.putFloat(str2, ((C8170) value).f22505);
            } else if (value instanceof C8171) {
                sharedPreferencesC81762.m13668(str2, ((C8171) value).f22506);
            } else if (value instanceof C8174) {
                C8174 c8174 = (C8174) value;
                boolean z2 = c8174.f22553;
                Object obj2 = c8174.f22556;
                if (z2) {
                    arrayList.add((String) obj2);
                    byte[] bArrM6715 = m6715(sharedPreferencesC8176, c8174, null);
                    if (bArrM6715 != null) {
                        sharedPreferencesC81762.m13664(str2, bArrM6715);
                    }
                } else {
                    sharedPreferencesC81762.m13664(str2, (byte[]) obj2);
                }
            } else if (value instanceof C8180) {
                C8180 c8180 = (C8180) value;
                if (c8180.f22553) {
                    arrayList.add((String) c8180.f22556);
                    LinkedHashSet linkedHashSetM6709 = m6709(sharedPreferencesC8176, c8180, null);
                    if (linkedHashSetM6709 != null && (c8177 = c8180.f22545) != null) {
                        sharedPreferencesC81762.m13669(str2, linkedHashSetM6709, c8177);
                    }
                } else {
                    C8177 c81772 = c8180.f22545;
                    if (c81772 != null) {
                        sharedPreferencesC81762.m13669(str2, c8180.f22556, c81772);
                    }
                }
            }
        }
        sharedPreferencesC81762.contains("");
        sharedPreferencesC8176.f22538 = sharedPreferencesC81762.f22538;
        sharedPreferencesC8176.f22516 = sharedPreferencesC81762.f22516;
        sharedPreferencesC8176.f22517 = sharedPreferencesC81762.f22517;
        sharedPreferencesC8176.f22532 = 0;
        sharedPreferencesC8176.f22533.clear();
        sharedPreferencesC8176.f22535.clear();
        sharedPreferencesC8176.f22535.putAll(sharedPreferencesC81762.f22535);
        C0137 c0137 = sharedPreferencesC81762.f22538;
        if (sharedPreferencesC8176.f22525 == 0) {
            int length = ((byte[]) c0137.f594).length;
            MappedByteBuffer mappedByteBuffer2 = sharedPreferencesC8176.f22526;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = sharedPreferencesC8176.f22527) != null && mappedByteBuffer.capacity() == length) {
                sharedPreferencesC8176.f22526.position(0);
                sharedPreferencesC8176.f22526.put((byte[]) c0137.f594, 0, sharedPreferencesC8176.f22517);
                sharedPreferencesC8176.f22527.position(0);
                sharedPreferencesC8176.f22527.put((byte[]) c0137.f594, 0, sharedPreferencesC8176.f22517);
            } else if (!m6725(sharedPreferencesC8176, c0137)) {
                sharedPreferencesC8176.f22525 = 1;
            }
        }
        if (sharedPreferencesC8176.f22525 != 0) {
            m6724(sharedPreferencesC8176);
        }
        File file = new File(sharedPreferencesC8176.f22521, str);
        String str3 = sharedPreferencesC8176.f22521 + sharedPreferencesC8176.f22520;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                try {
                    AbstractC3065.m6809(file2, new File(str3, file2.getName()));
                } catch (Exception unused) {
                }
            }
        }
        AbstractC3065.m6831(file);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC3065.m6831(new File(str3, (String) it.next()));
        }
        sharedPreferencesC8176.f22529 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static MappedByteBuffer m6677(FileChannel fileChannel, int i) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static int m6678(InterfaceC8386 interfaceC8386, int i, boolean z) {
        int i2 = 0;
        if (z) {
            while (i >= 0) {
                i2 = ((interfaceC8386.readByte() & DefaultClassResolver.NAME) << 24) | (i2 >>> 8);
                i--;
            }
            return i2;
        }
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC8386.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >>> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static void m6679(SharedPreferencesC8176 sharedPreferencesC8176, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM6677;
        int iCapacity = mappedByteBuffer.capacity();
        int i = SharedPreferencesC8176.f22512;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC8176.f22526 ? sharedPreferencesC8176.f22523 : sharedPreferencesC8176.f22522;
            try {
                fileChannel.truncate(i);
                mappedByteBufferM6677 = m6677(fileChannel, i);
            } catch (IOException unused) {
                mappedByteBufferM6677 = null;
            }
            if (mappedByteBufferM6677 == null) {
                C5925.m11307("Failed to truncate and remap buffer");
                return;
            }
            if (mappedByteBuffer == sharedPreferencesC8176.f22526) {
                sharedPreferencesC8176.f22526 = mappedByteBufferM6677;
            } else {
                sharedPreferencesC8176.f22527 = mappedByteBufferM6677;
            }
            mappedByteBuffer = mappedByteBufferM6677;
        }
        mappedByteBuffer.putInt(0, sharedPreferencesC8176.f22518 != null ? 1073741824 : 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static void m6680() {
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C8183 c8183 = new C8183(C8049.f22218, strM13973);
        c8183.f22550 = new C4485();
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = c8183.m13673();
        String strM139732 = AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        sharedPreferencesC8176M13673.remove(strM139732);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static int m6681(InterfaceC8386 interfaceC8386, int i) {
        int i2 = 0;
        for (int i3 = i; i3 >= 0; i3--) {
            i2 = (i2 >>> 8) | ((interfaceC8386.readByte() & DefaultClassResolver.NAME) << 24);
        }
        return i2 >> ((3 - i) * 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String m6682(InputStreamReader inputStreamReader) throws IOException {
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
    public static int m6683(int i, Rect rect, Rect rect2) {
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
                C5925.m11310("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static boolean m6684(SharedPreferencesC8176 sharedPreferencesC8176, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i = (int) length;
            int iM6705 = m6705(SharedPreferencesC8176.f22512, i);
            C0137 c0137 = sharedPreferencesC8176.f22538;
            if (c0137 == null || ((byte[]) c0137.f594).length != iM6705) {
                c0137 = new C0137(new byte[iM6705], 0);
                sharedPreferencesC8176.f22538 = c0137;
            } else {
                c0137.f596 = 0;
            }
            AbstractC3065.m6816(file, (byte[]) c0137.f594, i);
            int iM565 = c0137.m565();
            if (iM565 >= 0) {
                int i2 = (-1073741825) & iM565;
                boolean z = (iM565 & 1073741824) != 0;
                long jM581 = c0137.m581(c0137.f596);
                c0137.f596 += 8;
                sharedPreferencesC8176.f22517 = i2 + 12;
                if (i2 >= 0 && i2 <= i - 12 && jM581 == c0137.m566(12, i2) && AbstractC3057.m6748(sharedPreferencesC8176, z)) {
                    sharedPreferencesC8176.f22516 = jM581;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static void m6685(SharedPreferencesC8176 sharedPreferencesC8176, long j, long j2) {
        long j3;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC8176.f22526;
        String str = sharedPreferencesC8176.f22520;
        int i = mappedByteBuffer.getInt();
        int i2 = i & (-1073741825);
        boolean z = (i & 1073741824) != 0;
        long j4 = sharedPreferencesC8176.f22526.getLong();
        int i3 = sharedPreferencesC8176.f22527.getInt();
        int i4 = (-1073741825) & i3;
        boolean z2 = (1073741824 & i3) != 0;
        long j5 = sharedPreferencesC8176.f22527.getLong();
        if (i2 < 0) {
            j3 = 12;
        } else if (i2 <= j - 12) {
            sharedPreferencesC8176.f22517 = i2 + 12;
            sharedPreferencesC8176.f22526.rewind();
            j3 = 12;
            sharedPreferencesC8176.f22526.get((byte[]) sharedPreferencesC8176.f22538.f594, 0, sharedPreferencesC8176.f22517);
            if (j4 == sharedPreferencesC8176.f22538.m566(12, i2) && AbstractC3057.m6748(sharedPreferencesC8176, z)) {
                sharedPreferencesC8176.f22516 = j4;
                if (j == j2) {
                    byte[] bArr = new byte[sharedPreferencesC8176.f22517];
                    sharedPreferencesC8176.f22527.rewind();
                    sharedPreferencesC8176.f22527.get(bArr, 0, sharedPreferencesC8176.f22517);
                    byte[] bArr2 = (byte[]) sharedPreferencesC8176.f22538.f594;
                    for (int i5 = 0; i5 < sharedPreferencesC8176.f22517; i5++) {
                        if (bArr2[i5] == bArr[i5]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m6721(sharedPreferencesC8176, sharedPreferencesC8176.f22526, sharedPreferencesC8176.f22527, sharedPreferencesC8176.f22517);
                return;
            }
        } else {
            j3 = 12;
        }
        if (i4 >= 0 && i4 <= j2 - j3) {
            sharedPreferencesC8176.f22535.clear();
            sharedPreferencesC8176.f22532 = 0;
            sharedPreferencesC8176.f22533.clear();
            sharedPreferencesC8176.f22517 = i4 + 12;
            if (((byte[]) sharedPreferencesC8176.f22538.f594).length != sharedPreferencesC8176.f22527.capacity()) {
                sharedPreferencesC8176.f22538 = new C0137(sharedPreferencesC8176.f22527.capacity());
            }
            sharedPreferencesC8176.f22527.rewind();
            sharedPreferencesC8176.f22527.get((byte[]) sharedPreferencesC8176.f22538.f594, 0, sharedPreferencesC8176.f22517);
            if (j5 == sharedPreferencesC8176.f22538.m566(12, i4) && AbstractC3057.m6748(sharedPreferencesC8176, z2)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m6721(sharedPreferencesC8176, sharedPreferencesC8176.f22527, sharedPreferencesC8176.f22526, sharedPreferencesC8176.f22517);
                sharedPreferencesC8176.f22516 = j5;
                return;
            }
        }
        AbstractC3066.m6866(sharedPreferencesC8176, "both files error");
        m6699(sharedPreferencesC8176);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m6686(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C5925.m11310("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static void m6687(Context context) {
        String str = f9759;
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC3933.m8310(resources, str);
            return;
        }
        if (AbstractC3933.f12150 == null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
                try {
                    ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(parcelFileDescriptorOpen);
                    AbstractC9097.m14683();
                    ResourcesLoader resourcesLoaderM4079 = AbstractC2226.m4079();
                    resourcesLoaderM4079.addProvider(resourcesProviderLoadFromApk);
                    AbstractC3933.f12150 = resourcesLoaderM4079;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                } finally {
                }
            } catch (IOException unused) {
                return;
            }
        }
        AbstractC3933.m8301(new RunnableC8868(resources, 7, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static C0325 m6688() {
        C0325 c0325;
        C0325 c03252 = f9763;
        if (c03252 != null) {
            return c03252;
        }
        Object obj = null;
        try {
            c0325 = new C0325(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
        } catch (NoSuchMethodException unused) {
            c0325 = new C0325(obj, obj, obj, obj, 7);
        }
        f9763 = c0325;
        return c0325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final void m6689(InterfaceC4136 interfaceC4136, String str, String str2) {
        interfaceC4136.getClass();
        str2.getClass();
        interfaceC4136.mo383().m289(str, str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m6690(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            C5925.m11310("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m6697(b2)) {
            C5925.m11310("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m6691(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m6697(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m6697(b3)))) {
            C5925.m11310("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m6692(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m6697(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m6697(b3) && !m6697(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        C5925.m11310("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Boolean m6693(Class cls) throws IllegalAccessException, InvocationTargetException {
        cls.getClass();
        Method method = (Method) m6688().f1095;
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(cls, null);
        objInvoke.getClass();
        return (Boolean) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m6694(SharedPreferencesC8176 sharedPreferencesC8176) {
        String str = sharedPreferencesC8176.f22521;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC8176.f22520;
        File file = new File(str, AbstractC0053.m151(sb, str2, ".kvc"));
        File file2 = new File(str, AbstractC0053.m136(str2, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m6684(sharedPreferencesC8176, file)) {
                    m6675(sharedPreferencesC8176);
                    m6719(sharedPreferencesC8176);
                    return false;
                }
                if (sharedPreferencesC8176.f22525 == 0) {
                    if (!m6725(sharedPreferencesC8176, sharedPreferencesC8176.f22538)) {
                        sharedPreferencesC8176.f22525 = 1;
                        return false;
                    }
                    AbstractC3066.m6855(sharedPreferencesC8176, "recover from c file");
                    try {
                        m6719(sharedPreferencesC8176);
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        Log.e("FastKV", str2, e);
                        return z;
                    }
                }
            } else if (sharedPreferencesC8176.f22525 != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m6731(sharedPreferencesC8176, file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static void m6695(SharedPreferencesC8176 sharedPreferencesC8176) {
        long j;
        String str = sharedPreferencesC8176.f22521;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC8176.f22520;
        File file = new File(str, AbstractC0053.m151(sb, str2, ".kva"));
        File file2 = new File(str, AbstractC0053.m136(str2, ".kvb"));
        try {
            if (AbstractC3065.m6810(file) && AbstractC3065.m6810(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC8176.f22523 = randomAccessFile.getChannel();
                sharedPreferencesC8176.f22522 = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC8176.f22523;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC8176.f22512);
                    sharedPreferencesC8176.f22526 = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC8176.f22522;
                    if (length2 > 0) {
                        j = length2;
                    } else {
                        j = SharedPreferencesC8176.f22512;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j);
                    sharedPreferencesC8176.f22527 = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC8176.f22538 = new C0137(sharedPreferencesC8176.f22526.capacity());
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC8176.f22517 = 12;
                        return;
                    } else {
                        m6685(sharedPreferencesC8176, length, length2);
                        return;
                    }
                } catch (IOException e) {
                    Log.e("FastKV", str2, e);
                    m6726(sharedPreferencesC8176);
                    m6731(sharedPreferencesC8176, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m6726(sharedPreferencesC8176);
        } catch (Exception e2) {
            Log.e("FastKV", str2, e2);
            m6675(sharedPreferencesC8176);
            m6726(sharedPreferencesC8176);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m6696() {
        AtomicBoolean atomicBoolean = f9762;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        f9762 = new AtomicBoolean();
        try {
            AbstractC6337.m11866(AbstractC8405.m13972(65));
            f9762.set(false);
        } catch (Exception unused) {
            f9762.set(true);
        }
        return f9762.get();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m6697(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m6698(int i, Rect rect, Rect rect2) {
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
                C5925.m11310("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
    public static void m6699(SharedPreferencesC8176 sharedPreferencesC8176) {
        if (sharedPreferencesC8176.f22525 == 0) {
            try {
                m6679(sharedPreferencesC8176, sharedPreferencesC8176.f22526);
                m6679(sharedPreferencesC8176, sharedPreferencesC8176.f22527);
            } catch (Exception unused) {
                m6726(sharedPreferencesC8176);
            }
        }
        m6675(sharedPreferencesC8176);
        AbstractC3065.m6831(new File(sharedPreferencesC8176.f22521 + sharedPreferencesC8176.f22520));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m6700(Throwable th) {
        boolean z = (th == null || (th instanceof Error) || (th instanceof RuntimeException)) ? false : true;
        Object[] objArr = {th};
        if (z) {
        } else {
            throw new IllegalArgumentException(AbstractC5686.m11052(objArr) ? "Not a checked exception: %s" : String.format("Not a checked exception: %s", objArr));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m6701(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        C5925.m11310("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6702(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m6701(r9, r10, r11)
            boolean r1 = m6701(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            top.suzhelan.qstory.hook.item.C5925.m11310(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = m6683(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            top.suzhelan.qstory.hook.item.C5925.m11310(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3056.m6702(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0830 m6703(C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((C1324) interfaceC1373).m2360(c1242)) || (i & 6) == 4;
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (z || objM2345 == c1353) {
            objM2345 = new C0830(c1242);
            c1324.m2386(objM2345);
        }
        C0830 c0830 = (C0830) objM2345;
        boolean zM2360 = c1324.m2360(c0830);
        Object objM23452 = c1324.m2345();
        if (zM2360 || objM23452 == c1353) {
            objM23452 = new C1067(c0830, 10);
            c1324.m2386(objM23452);
        }
        AbstractC1367.m2484(c0830, (InterfaceC6558) objM23452, c1324);
        return c0830;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m6704(InterfaceC2129 interfaceC2129, AbstractC1390 abstractC1390, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-714464401);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(abstractC1390) ? 32 : 16;
        }
        int i3 = i & 384;
        C1242 c12422 = AbstractC0808.f2307;
        if (i3 == 0) {
            i2 |= c1324.m2378(c12422) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2378(c1242) ? 2048 : 1024;
        }
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = AbstractC1367.m2475(null, C1353.f3920);
                c1324.m2386(objM2345);
            }
            C0830 c0830M6703 = m6703(c12422, c1324, (i2 >> 6) & 14);
            AbstractC1367.m2487(abstractC1390.mo2428(c0830M6703), AbstractC1254.m2189(274270255, new C0829(interfaceC2129, (InterfaceC1395) objM2345, c1242, c0830M6703), c1324), c1324, 56);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(interfaceC2129, abstractC1390, c1242, i, 3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static int m6705(int i, int i2) {
        if (i2 >= 268435456) {
            C5925.m11311("data size out of limit");
            return 0;
        }
        int i3 = SharedPreferencesC8176.f22512;
        if (i2 <= i3) {
            return i3;
        }
        while (i < i2) {
            i <<= 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C7052 m6706(C4536 c4536) {
        c4536.getClass();
        C7063 c7063 = C7052.f18938;
        c7063.getClass();
        return (C7052) AbstractC3055.m6635(c4536.f13221, c7063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static C8786 m6707() {
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C8183 c8183 = new C8183(C8049.f22218, strM13973);
        c8183.f22550 = new C4485();
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = c8183.m13673();
        String strM139732 = AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜");
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜");
        String string = sharedPreferencesC8176M13673.getString(strM139732, "");
        return (C8786) ((string == null || string.length() == 0) ? null : InterfaceC2916.m6369(string, C8786.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static C8785 m6708() {
        C8785 c8785 = new C8785();
        c8785.f24742 = AbstractC8405.m13973("喵呜喵喵喵喵呜呜");
        c8785.f24741 = AbstractC8405.m13972(1491);
        c8785.f24740 = 0;
        c8785.f24739 = AbstractC8405.m13972(1491);
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜");
        C8183 c8183 = new C8183(C8049.f22218, strM13973);
        c8183.f22550 = new C4485();
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = c8183.m13673();
        String strM13972 = AbstractC8405.m13972(1490);
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜");
        String string = sharedPreferencesC8176M13673.getString(strM13972, "");
        C8785 c87852 = (C8785) ((string == null || string.length() == 0) ? null : InterfaceC2916.m6369(string, C8785.class));
        return c87852 == null ? c8785 : c87852;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static LinkedHashSet m6709(SharedPreferencesC8176 sharedPreferencesC8176, C8180 c8180, C4485 c4485) {
        String str = sharedPreferencesC8176.f22520;
        try {
            byte[] bArrM6833 = AbstractC3065.m6833(new File(sharedPreferencesC8176.f22521 + str, (String) c8180.f22556));
            if (bArrM6833 == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            if (c4485 != null) {
                bArrM6833 = c4485.m9057(bArrM6833);
            }
            int i = bArrM6833[0] & DefaultClassResolver.NAME;
            String strM568 = sharedPreferencesC8176.f22538.m568(1, bArrM6833, i);
            C8177 c8177 = (C8177) sharedPreferencesC8176.f22519.get(strM568);
            if (c8177 == null) {
                Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM568)));
                return null;
            }
            c8180.f22545 = c8177;
            int i2 = i + 1;
            return C8177.m13671(i2, bArrM6833, bArrM6833.length - i2);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m6710(SharedPreferencesC8176 sharedPreferencesC8176, C8184 c8184, C4485 c4485) {
        String str = sharedPreferencesC8176.f22520;
        try {
            byte[] bArrM6833 = AbstractC3065.m6833(new File(sharedPreferencesC8176.f22521 + str, (String) c8184.f22556));
            if (bArrM6833 == null) {
                return null;
            }
            if (c4485 != null) {
                bArrM6833 = c4485.m9057(bArrM6833);
            }
            return new String(bArrM6833, StandardCharsets.UTF_8);
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C6144 m6711(String str) {
        str.getClass();
        InterfaceC5150 interfaceC5150MatchAt = C6144.f16859.matchAt(str, 0);
        if (interfaceC5150MatchAt == null) {
            C5925.m11310(AbstractC6183.m11590('\"', "No subtype found for: \"", str));
            return null;
        }
        C5148 c5148 = (C5148) interfaceC5150MatchAt;
        String str2 = (String) ((C4328) c5148.m10181()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((C4328) c5148.m10181()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i = c5148.m10180().f17816;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new C6144(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            InterfaceC5150 interfaceC5150MatchAt2 = C6144.f16858.matchAt(str, i2);
            if (interfaceC5150MatchAt2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i2) + "\" for: \"" + str + '\"').toString());
            }
            C5148 c51482 = (C5148) interfaceC5150MatchAt2;
            C5151 c5151 = c51482.f14697;
            C5146 c5146M10182 = c5151.m10182(1);
            String str3 = c5146M10182 != null ? c5146M10182.f14690 : null;
            if (str3 == null) {
                i = c51482.m10180().f17816;
            } else {
                C5146 c5146M101822 = c5151.m10182(2);
                String strM161 = c5146M101822 != null ? c5146M101822.f14690 : null;
                if (strM161 == null) {
                    C5146 c5146M101823 = c5151.m10182(3);
                    c5146M101823.getClass();
                    strM161 = c5146M101823.f14690;
                } else if (AbstractC5144.m10146(strM161, '\'') && AbstractC5144.m10159(strM161, '\'') && strM161.length() > 2) {
                    strM161 = AbstractC0053.m161(1, 1, strM161);
                }
                arrayList.add(str3);
                arrayList.add(strM161);
                i = c51482.m10180().f17816;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C4639 m6712(AbstractC4922 abstractC4922) {
        if (abstractC4922 instanceof C6886) {
            C6886 c6886 = (C6886) abstractC4922;
            String str = c6886.f18334;
            String str2 = c6886.f18333;
            str.getClass();
            str2.getClass();
            return new C4639(str.concat(str2));
        }
        if (!(abstractC4922 instanceof C6887)) {
            C4211.m8611();
            return null;
        }
        C6887 c6887 = (C6887) abstractC4922;
        String str3 = c6887.f18336;
        String str4 = c6887.f18335;
        str3.getClass();
        str4.getClass();
        return new C4639(AbstractC0053.m164('#', str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C7056 m6713(C4530 c4530) {
        c4530.getClass();
        C7063 c7063 = C7056.f18949;
        c7063.getClass();
        return (C7056) AbstractC3055.m6635(c4530.f13195, c7063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7055 m6714(C4538 c4538) {
        c4538.getClass();
        C7063 c7063 = C7055.f18947;
        c7063.getClass();
        return (C7055) AbstractC3055.m6635(c4538.f13240, c7063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static byte[] m6715(SharedPreferencesC8176 sharedPreferencesC8176, C8174 c8174, C4485 c4485) {
        String str = sharedPreferencesC8176.f22520;
        try {
            byte[] bArrM6833 = AbstractC3065.m6833(new File(sharedPreferencesC8176.f22521 + str, (String) c8174.f22556));
            if (bArrM6833 != null) {
                return c4485 != null ? c4485.m9057(bArrM6833) : bArrM6833;
            }
            return null;
        } catch (Exception e) {
            Log.e("FastKV", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7057 m6716(C4549 c4549) {
        c4549.getClass();
        C7063 c7063 = C7057.f18951;
        c7063.getClass();
        return (C7057) AbstractC3055.m6635(c4549.f13293, c7063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m6717(Comparable comparable, Comparable comparable2) {
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
    public static C1945 m6718(InterfaceC6558... interfaceC6558Arr) {
        if (interfaceC6558Arr.length > 0) {
            return new C1945(interfaceC6558Arr, 2);
        }
        C5925.m11310("Failed requirement.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m6719(SharedPreferencesC8176 sharedPreferencesC8176) {
        String str = sharedPreferencesC8176.f22520;
        String str2 = sharedPreferencesC8176.f22521;
        try {
            AbstractC3065.m6831(new File(str2, str + ".kvc"));
            AbstractC3065.m6831(new File(str2, str + ".tmp"));
        } catch (Exception e) {
            Log.e("FastKV", str, e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final float m6720(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m6721(SharedPreferencesC8176 sharedPreferencesC8176, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM6677 = m6677(mappedByteBuffer2 == sharedPreferencesC8176.f22527 ? sharedPreferencesC8176.f22522 : sharedPreferencesC8176.f22523, mappedByteBuffer.capacity());
            if (mappedByteBufferM6677 == null) {
                Log.e("FastKV", sharedPreferencesC8176.f22520, new Exception("map failed"));
                m6726(sharedPreferencesC8176);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC8176.f22527) {
                    sharedPreferencesC8176.f22527 = mappedByteBufferM6677;
                } else {
                    sharedPreferencesC8176.f22526 = mappedByteBufferM6677;
                }
                mappedByteBuffer2 = mappedByteBufferM6677;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static InterfaceC7254 m6722(String str, List list) {
        C7255 c7255;
        list.getClass();
        C7274 c7274 = new C7274();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c7255 = C7255.f19336;
            if (!zHasNext) {
                break;
            }
            InterfaceC7254 interfaceC7254 = (InterfaceC7254) it.next();
            if (interfaceC7254 != c7255) {
                if (interfaceC7254 instanceof C7253) {
                    InterfaceC7254[] interfaceC7254Arr = ((C7253) interfaceC7254).f19333;
                    interfaceC7254Arr.getClass();
                    List listAsList = Arrays.asList(interfaceC7254Arr);
                    listAsList.getClass();
                    c7274.addAll(listAsList);
                } else {
                    c7274.add(interfaceC7254);
                }
            }
        }
        int i = c7274.f19374;
        return i != 0 ? i != 1 ? new C7253(str, (InterfaceC7254[]) c7274.toArray(new InterfaceC7254[0])) : (InterfaceC7254) c7274.get(0) : c7255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public static void m6723(InterfaceC8385 interfaceC8385, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        interfaceC8385.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC8385.writeByte((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public static boolean m6724(SharedPreferencesC8176 sharedPreferencesC8176) {
        String str = sharedPreferencesC8176.f22520;
        String str2 = sharedPreferencesC8176.f22521;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC3065.m6810(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC8176.f22517);
                randomAccessFile.write((byte[]) sharedPreferencesC8176.f22538.f594, 0, sharedPreferencesC8176.f22517);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC8176.f22537;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC8175.m13635().execute(new RunnableC0099(sharedPreferencesC8176, 22, (String) it.next()));
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
    public static boolean m6725(SharedPreferencesC8176 sharedPreferencesC8176, C0137 c0137) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = sharedPreferencesC8176.f22520;
        String str2 = sharedPreferencesC8176.f22521;
        try {
            int length = ((byte[]) c0137.f594).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC3065.m6810(file) || !AbstractC3065.m6810(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            try {
                randomAccessFile.setLength(j);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC8176.f22523 = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j);
                sharedPreferencesC8176.f22526 = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC8176.f22526.put((byte[]) c0137.f594, 0, sharedPreferencesC8176.f22517);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e) {
                e = e;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j);
                FileChannel channel2 = randomAccessFile2.getChannel();
                sharedPreferencesC8176.f22522 = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
                sharedPreferencesC8176.f22527 = map2;
                map2.order(byteOrder);
                sharedPreferencesC8176.f22527.put((byte[]) c0137.f594, 0, sharedPreferencesC8176.f22517);
                return true;
            } catch (Exception e2) {
                e = e2;
                AbstractC3065.m6840(randomAccessFile);
                AbstractC3065.m6840(randomAccessFile2);
                sharedPreferencesC8176.f22523 = null;
                sharedPreferencesC8176.f22522 = null;
                sharedPreferencesC8176.f22526 = null;
                sharedPreferencesC8176.f22527 = null;
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
    public static void m6726(SharedPreferencesC8176 sharedPreferencesC8176) {
        sharedPreferencesC8176.f22525 = 1;
        AbstractC3065.m6840(sharedPreferencesC8176.f22523);
        AbstractC3065.m6840(sharedPreferencesC8176.f22522);
        sharedPreferencesC8176.f22523 = null;
        sharedPreferencesC8176.f22522 = null;
        sharedPreferencesC8176.f22526 = null;
        sharedPreferencesC8176.f22527 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static long m6727(int i, long j) {
        int i2 = (i & 7) << 3;
        return (j >>> (64 - i2)) | (j << i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static void m6728(InterfaceC8385 interfaceC8385, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        interfaceC8385.writeByte(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            interfaceC8385.writeByte((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static void m6729(InterfaceC8385 interfaceC8385, int i, long j) {
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((j >> 63) ^ j)) >> 3;
        interfaceC8385.writeByte(i | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            interfaceC8385.writeByte((byte) j);
            j >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static final ExtractedText m6730(C2013 c2013) {
        ExtractedText extractedText = new ExtractedText();
        String str = c2013.f5947.f6129;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c2013.f5946;
        extractedText.selectionStart = C2035.m3757(j);
        extractedText.selectionEnd = C2035.m3750(j);
        extractedText.flags = !AbstractC5144.m10163(c2013.f5947.f6129, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static void m6731(SharedPreferencesC8176 sharedPreferencesC8176, File file, File file2) {
        String str = sharedPreferencesC8176.f22520;
        try {
            if (m6684(sharedPreferencesC8176, file)) {
                return;
            }
        } catch (IOException e) {
            Log.w("FastKV", str, e);
        }
        m6675(sharedPreferencesC8176);
        try {
            if (m6684(sharedPreferencesC8176, file2)) {
                return;
            }
        } catch (IOException e2) {
            Log.w("FastKV", str, e2);
        }
        m6675(sharedPreferencesC8176);
    }
}
