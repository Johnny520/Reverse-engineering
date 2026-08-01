package com.bumptech.glide;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.LocaleList;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1632;
import androidx.compose.ui.input.pointer.C1643;
import androidx.core.view.AbstractC2226;
import com.alibaba.fastjson2.C2942;
import com.android.dex.DexException;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC5186;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.AbstractC5071;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.C5069;
import kotlin.reflect.jvm.internal.InterfaceC5010;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4523;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.text.AbstractC5128;
import kotlin.text.AbstractC5143;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p007.ViewOnClickListenerC6138;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p017.AbstractC6233;
import p027.DialogC6300;
import p033.AbstractC6325;
import p038.C6397;
import p040.C6433;
import p040.C6435;
import p048.C6516;
import p048.C6518;
import p053.AbstractC6560;
import p074.C6945;
import p087.C7126;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import p107.C7311;
import p107.C7313;
import p112.C7328;
import p144.C7546;
import p175.AbstractC7738;
import p194.C7831;
import p194.C7832;
import p205.C7898;
import p205.C7900;
import p205.InterfaceC7895;
import p210.AbstractC7935;
import p253.AbstractC8189;
import p284.InterfaceC8384;
import p284.InterfaceC8385;
import p342.RunnableC8820;
import p383.AbstractC9032;
import p391.AbstractC9116;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3065 implements InterfaceC7186, InterfaceC7188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Context f9795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String f9796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static DialogC6300 f9797;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final void m6818(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC3056.m6677(16);
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
                sb.append(AbstractC6233.m11698(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final void m6819(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C5919.m11249("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC3056.m6677(16);
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

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m6820(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m6857(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m6857(b3)))) {
            C5919.m11249("Invalid UTF-8");
        } else {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static void m6821(byte b, byte b2, char[] cArr, int i) {
        if (b < -62) {
            C5919.m11249("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m6857(b2)) {
            C5919.m11249("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static RelativeLayout m6822(Context context, String str) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.save_voice_layout, (ViewGroup) null, false);
        EditText editText = (EditText) relativeLayout.findViewById(R.id.voice_name);
        editText.setText(AbstractC3056.m6668(-3937561979095614887L));
        editText.addTextChangedListener(new C6435(str));
        ((Button) relativeLayout.findViewById(R.id.yes_save_voice)).setOnClickListener(new ViewOnClickListenerC6138(editText, str, 1));
        ((Button) relativeLayout.findViewById(R.id.save_voice_close)).setOnClickListener(new ViewOnClickListenerC5532(15));
        return relativeLayout;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static byte[] m6823(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            C7546.m12735(file.getPath(), "file too large, path:");
            return null;
        }
        int i = (int) length;
        byte[] bArr = new byte[i];
        m6842(file, bArr, i);
        return bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final void m6824(int i, int i2, int i3, long j, byte[] bArr) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC5128.f14673[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m6825(String str, String str2) {
        String str3 = C6397.f17549 + str2 + AbstractC3056.m6668(-3937620631169009063L);
        while (new File(str3).exists()) {
            str3 = C6397.f17549 + str2 + AbstractC3056.m6668(-3937587577100699047L) + (Integer.parseInt(str3.substring(str3.lastIndexOf(AbstractC3056.m6668(-3937587577100699047L)) + 1, str3.lastIndexOf(AbstractC3056.m6668(-3937587482611418535L)))) + 1) + AbstractC3056.m6668(-3937587482611418535L);
        }
        try {
            AbstractC0455.m1170(str, str3);
            AbstractC6154.m11561(AbstractC3056.m6668(-3937620545269663143L) + str3);
        } catch (IOException e) {
            C5919.m11252(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m6826(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m6857(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m6857(b3) && !m6857(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        C5919.m11249("Invalid UTF-8");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static void m6827(InterfaceC8384 interfaceC8384, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            interfaceC8384.writeByte((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public static final void m6828(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public static void m6829(InterfaceC8384 interfaceC8384, int i) {
        while (true) {
            int i2 = i;
            i >>>= 7;
            if (i == 0) {
                interfaceC8384.writeByte((byte) (i2 & 127));
                return;
            }
            interfaceC8384.writeByte((byte) ((i2 & 127) | 128));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m6830(C5851 c5851, C1643 c1643, long j) {
        C2942 c2942 = (C2942) c5851.f16007;
        c2942.getClass();
        C7311 c7311 = (C7311) c2942.f9316;
        C7311 c73112 = (C7311) c2942.f9317;
        boolean zM3019 = AbstractC1646.m3019(c1643);
        long j2 = c1643.f4807;
        if (zM3019) {
            C7313[] c7313Arr = c73112.f19502;
            AbstractC4346.m8861(0, c7313Arr.length, null, c7313Arr);
            c73112.f19501 = 0;
            C7313[] c7313Arr2 = c7311.f19502;
            AbstractC4346.m8861(0, c7313Arr2.length, null, c7313Arr2);
            c7311.f19501 = 0;
            c2942.f9318 = 0L;
        }
        if (!AbstractC1646.m3017(c1643)) {
            List listM3013 = c1643.m3013();
            int i = 0;
            for (int size = listM3013.size(); i < size; size = size) {
                C1632 c1632 = (C1632) listM3013.get(i);
                c2942.m6355(c1632.f4777, C7328.m12498(c1632.f4773, j));
                i++;
            }
            c2942.m6355(j2, C7328.m12498(c1643.f4809, j));
        }
        if (AbstractC1646.m3017(c1643) && j2 - c2942.f9318 > 40) {
            C7313[] c7313Arr3 = c73112.f19502;
            AbstractC4346.m8861(0, c7313Arr3.length, null, c7313Arr3);
            c73112.f19501 = 0;
            C7313[] c7313Arr4 = c7311.f19502;
            AbstractC4346.m8861(0, c7313Arr4.length, null, c7313Arr4);
            c7311.f19501 = 0;
            c2942.f9318 = 0L;
        }
        c2942.f9318 = j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static void m6831(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m6831(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m6832(File file) {
        try {
            if (file.exists()) {
                m6831(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final float m6833(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static byte[] m6834(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 4);
        try {
            try {
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    try {
                        try {
                            dataOutputStream.writeInt(bArr.length + 4);
                            dataOutputStream.write(bArr);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            dataOutputStream.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (Exception unused) {
                            dataOutputStream.close();
                            byteArrayOutputStream.close();
                            return null;
                        }
                    } finally {
                    }
                } catch (Exception unused2) {
                    byteArrayOutputStream.close();
                    dataOutputStream.close();
                    dataOutputStream.close();
                    byteArrayOutputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            C5919.m11252(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m6835(Context context, String str) {
        m6858(context);
        try {
            f9797 = new DialogC6300(context);
            f9797.setContentView(m6822(context, str));
            f9797.show();
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937620970471425447L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C5069 m6836(List list, C5069 c5069, InterfaceC5010 interfaceC5010, ClassLoader classLoader) {
        list.getClass();
        ArrayList<C4988> arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4523 c4523 = (C4523) it.next();
            String str = c4523.f13174;
            KVariance kVarianceM11842 = AbstractC6325.m11842(c4523.f13172);
            AbstractC4544.f13250.m576(c4523, AbstractC4544.f13259[52]);
            arrayList.add(new C4988(interfaceC5010, str, kVarianceM11842));
        }
        C4341 c4341M8796 = AbstractC4343.m8796(list);
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(c4341M8796, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        Iterator it2 = c4341M8796.iterator();
        while (true) {
            C4337 c4337 = (C4337) it2;
            if (!c4337.f12915.hasNext()) {
                break;
            }
            C4340 c4340 = (C4340) c4337.next();
            Pair pair = new Pair(Integer.valueOf(((C4523) c4340.f12919).f13173), arrayList.get(c4340.f12920));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        C5069 c50692 = new C5069(arrayList, linkedHashMap, c5069);
        int i = 0;
        for (C4988 c4988 : arrayList) {
            int i2 = i + 1;
            ArrayList arrayList2 = ((C4523) list.get(i)).f13171;
            ?? arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(AbstractC6325.m11846((C4533) it3.next(), classLoader, c50692, null));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = AbstractC8189.m13660(AbstractC5071.f14618);
            }
            c4988.getClass();
            c4988.f14394 = arrayList3;
            i = i2;
        }
        return c50692;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p236.C8124 m6837(io.ktor.server.application.InterfaceC4056 r0, p236.C8124 r1) {
        /*
            r0.getClass()
            if (r1 != 0) goto L25
            io.ktor.server.response.飘花落叶言子楪世苏哲兰 r0 = r0.mo8471()
            androidx.appcompat.app.飘花落叶言子世楪苏兰哲 r0 = r0.mo382()
            java.lang.String[] r1 = p236.AbstractC8114.f22415
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = r0.m260(r1)
            if (r0 == 0) goto L23
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = p236.C8124.f22426     // Catch: io.ktor.http.BadContentTypeFormatException -> L1f
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r0 = p236.C8112.m13553(r0)     // Catch: io.ktor.http.BadContentTypeFormatException -> L1f
        L1d:
            r1 = r0
            goto L21
        L1f:
            r0 = 0
            goto L1d
        L21:
            if (r1 != 0) goto L25
        L23:
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = p236.AbstractC8105.f22392
        L25:
            java.nio.charset.Charset r0 = kotlin.reflect.jvm.internal.AbstractC5061.m10050(r1)
            if (r0 != 0) goto L39
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r0 = p236.AbstractC8105.f22393
            boolean r0 = r1.m13560(r0)
            if (r0 == 0) goto L39
            java.nio.charset.Charset r0 = kotlin.text.AbstractC5131.f14688
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰 r1 = kotlin.reflect.jvm.internal.AbstractC5061.m10013(r1, r0)
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.AbstractC3065.m6837(io.ktor.server.application.飘花落叶言子楪世苏兰哲, 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰):飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m6838(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final void m6839(C1562 c1562, String str, String str2) {
        c1562.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = c1562.f4599;
        arrayList.add(str);
        arrayList.add(AbstractC5143.m10150(str2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1230 m6840(C1230 c1230) {
        if (c1230 == null) {
            c1230 = null;
        }
        if (c1230 != null) {
            return c1230;
        }
        AbstractC1374.m2496("Inconsistent composition");
        C4210.m8612();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m6841(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC5186.m10212(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public static void m6842(File file, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i2 = 0;
        while (i2 < i) {
            try {
                int i3 = randomAccessFile.read(bArr, i2, i - i2);
                if (i3 < 0) {
                    break;
                } else {
                    i2 += i3;
                }
            } finally {
                m6838(randomAccessFile);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public static final void m6843(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            AbstractC7935.m13397("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fM6833 = m6833(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fM6833);
                }
            }
            float fSqrt = (float) Math.sqrt(m6833(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : m6833(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fM68332 = m6833(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fM68332 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fM68332 / fArr11[i14];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static void m6844(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(AbstractC0053.m153(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                m6848(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                m6848(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m6848(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m6848(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public static long m6845(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            C5919.m11253(AbstractC6136.m11559(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            C5919.m11248(AbstractC0053.m148(length, "endIndex > string.length: ", " > "), str.length());
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

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public static final void m6846(Spannable spannable, C7831 c7831, int i, int i2) {
        if (c7831 != null) {
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c7831, 10));
            Iterator it = c7831.f21377.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7832) it.next()).f21378);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public static int m6847(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public static void m6848(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(AbstractC9032.m14590(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static final void m6849(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC1581.m2863(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static final void m6850(Spannable spannable, long j, InterfaceC7895 interfaceC7895, int i, int i2) {
        long jM13316 = C7898.m13316(j);
        if (C7900.m13318(jM13316, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC6560.m12006(interfaceC7895.mo1325(j)), false), i, i2, 33);
        } else if (C7900.m13318(jM13316, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C7898.m13315(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static void m6851(final String str, final String str2) {
        Activity activityM13031 = AbstractC7738.m13031();
        final DialogC6300 dialogC6300 = new DialogC6300(activityM13031);
        final int i = 0;
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(activityM13031).inflate(R.layout.save_voice_layout, (ViewGroup) null, false);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.save_voice_title);
        textView.setText(AbstractC3056.m6668(-3937620682708616615L) + str2);
        textView.setTextColor(activityM13031.getColor(R.color.____res_0x2406048a));
        EditText editText = (EditText) relativeLayout.findViewById(R.id.voice_name);
        editText.setText(str2);
        Button button = (Button) relativeLayout.findViewById(R.id.yes_save_voice);
        button.setText(AbstractC3056.m6668(-3937620704183453095L));
        button.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏哲世兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                DialogC6300 dialogC63002 = dialogC6300;
                String str3 = str2;
                String str4 = str;
                switch (i2) {
                    case 0:
                        try {
                            AbstractC0455.m1170(str4, C6397.f17549 + str3);
                            dialogC63002.dismiss();
                            AbstractC6154.m11561(AbstractC3056.m6668(-3937620553859597735L));
                        } catch (IOException e) {
                            C5919.m11252(e);
                            return;
                        }
                        break;
                    default:
                        AbstractC3065.m6825(str4, str3);
                        dialogC63002.dismiss();
                        break;
                }
            }
        });
        Button button2 = (Button) relativeLayout.findViewById(R.id.save_voice_close);
        button2.setText(AbstractC3056.m6668(-3937620601104237991L));
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏哲世兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                DialogC6300 dialogC63002 = dialogC6300;
                String str3 = str2;
                String str4 = str;
                switch (i22) {
                    case 0:
                        try {
                            AbstractC0455.m1170(str4, C6397.f17549 + str3);
                            dialogC63002.dismiss();
                            AbstractC6154.m11561(AbstractC3056.m6668(-3937620553859597735L));
                        } catch (IOException e) {
                            C5919.m11252(e);
                            return;
                        }
                        break;
                    default:
                        AbstractC3065.m6825(str4, str3);
                        dialogC63002.dismiss();
                        break;
                }
            }
        });
        editText.addTextChangedListener(new C6433(editText, str, dialogC6300, button, button2));
        dialogC6300.setContentView(relativeLayout);
        dialogC6300.show();
        f9797.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static int m6852(InterfaceC8385 interfaceC8385) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            byte b = interfaceC8385.readByte();
            i2 |= (b & 127) << (i3 * 7);
            i3++;
            i = b & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return i2;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static void m6853(String str, String str2) {
        if (!new File(str).exists()) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937620897456981415L));
            return;
        }
        if (str2.trim().equals(AbstractC3056.m6668(-3937561979095614887L))) {
            str2 = new SimpleDateFormat(AbstractC3056.m6668(-3937620807262668199L)).format(new Date());
        } else if (new File(AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620790082799015L)), str2).exists()) {
            m6851(str, str2);
            return;
        }
        new Thread(new RunnableC0099(str, 16, str2)).start();
        f9797.dismiss();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final float m6854(long j, float f, InterfaceC7895 interfaceC7895) {
        float fM13315;
        long jM13316 = C7898.m13316(j);
        if (C7900.m13318(jM13316, 4294967296L)) {
            if (interfaceC7895.mo1247() <= 1.05d) {
                return interfaceC7895.mo1325(j);
            }
            fM13315 = C7898.m13315(j) / C7898.m13315(interfaceC7895.mo1324(f));
        } else {
            if (!C7900.m13318(jM13316, 8589934592L)) {
                return Float.NaN;
            }
            fM13315 = C7898.m13315(j);
        }
        return fM13315 * f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static C6945 m6855(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C6518 c6518 = new C6518(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c6518, 10));
        Iterator it = c6518.iterator();
        while (true) {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                int[] iArrM8807 = AbstractC4343.m8807(arrayList);
                int[] iArrCopyOf = Arrays.copyOf(iArrM8807, iArrM8807.length);
                return new C6945(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
            }
            c6516.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static int m6856(InterfaceC8385 interfaceC8385) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        do {
            byte b = interfaceC8385.readByte();
            i2 |= (b & 127) << (i4 * 7);
            i3 <<= 7;
            i4++;
            i = b & 128;
            if (i != 128) {
                break;
            }
        } while (i4 < 5);
        if (i != 128) {
            return ((i3 >> 1) & i2) != 0 ? i2 | i3 : i2;
        }
        throw new DexException("invalid LEB128 sequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static boolean m6857(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static void m6858(Context context) {
        String str = f9796;
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC6087.m11397(resources, str);
            return;
        }
        if (AbstractC6087.f16639 == null) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(str), 268435456);
                try {
                    ResourcesProvider resourcesProviderLoadFromApk = ResourcesProvider.loadFromApk(parcelFileDescriptorOpen);
                    AbstractC9116.m14646();
                    ResourcesLoader resourcesLoaderM4069 = AbstractC2226.m4069();
                    resourcesLoaderM4069.addProvider(resourcesProviderLoadFromApk);
                    AbstractC6087.f16639 = resourcesLoaderM4069;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                } finally {
                }
            } catch (IOException unused) {
                return;
            }
        }
        AbstractC6087.m11424(new RunnableC8820(resources, 7, str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static void m6859(File file, File file2) {
        if (!file.exists() || file2.exists() || file.renameTo(file2)) {
            return;
        }
        byte[] bArrM6823 = m6823(file);
        try {
            int length = bArrM6823.length;
            File file3 = new File(file2.getParent(), file2.getName() + ".tmp");
            if (m6860(file3)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    randomAccessFile.setLength(length);
                    randomAccessFile.write(bArrM6823, 0, length);
                    randomAccessFile.getFD().sync();
                    randomAccessFile.close();
                    if (!file3.renameTo(file2) && (!file2.exists() || file2.delete())) {
                        file3.renameTo(file2);
                    }
                } finally {
                }
            } else {
                new Exception("create file failed");
            }
        } catch (Exception e) {
            new Exception("save bytes failed", e);
        }
        m6832(file);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static boolean m6860(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean mo6861(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo6882();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public byte mo6862(C7126 c7126, int i) {
        c7126.getClass();
        return mo6887();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public InterfaceC7186 mo6863(C7126 c7126, int i) {
        c7126.getClass();
        return mo6880(c7126.mo12356(i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public double mo6864(C7126 c7126, int i) {
        c7126.getClass();
        return mo6883();
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean mo6865() {
        return true;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public char mo6866(C7126 c7126, int i) {
        c7126.getClass();
        return mo6881();
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public String mo6867() {
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public abstract int mo6868();

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public abstract long mo6869();

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public short mo6870(C7126 c7126, int i) {
        c7126.getClass();
        return mo6885();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float mo6871(C7126 c7126, int i) {
        c7126.getClass();
        return mo6884();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int mo6872(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo6868();
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int mo6873(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object mo6874(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        interfaceC7183.getClass();
        return mo10644(interfaceC7183);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object mo6875(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        if (interfaceC7183.getDescriptor().mo12383() || mo6865()) {
            return mo10644(interfaceC7183);
        }
        return null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo6877(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public String mo6878(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo6867();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m6879() {
        throw new SerializationException(AbstractC4395.f12971.mo8927(getClass()) + " can't retrieve untyped values");
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7186 mo6880(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public char mo6881() {
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo6882() {
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public double mo6883() {
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public float mo6884() {
        m6879();
        throw null;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public abstract short mo6885();

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public long mo6886(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo6869();
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public abstract byte mo6887();
}
