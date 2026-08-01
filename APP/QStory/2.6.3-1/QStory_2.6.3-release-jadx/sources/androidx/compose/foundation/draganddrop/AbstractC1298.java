package androidx.compose.foundation.draganddrop;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.activity.InterfaceC0865;
import androidx.activity.compose.AbstractC0857;
import androidx.activity.compose.C0848;
import androidx.activity.compose.C0849;
import androidx.activity.compose.C0850;
import androidx.activity.compose.C0851;
import androidx.activity.compose.C0852;
import androidx.activity.compose.C0858;
import androidx.activity.compose.C0859;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0954;
import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.graphics.vector.C2378;
import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.C3075;
import androidx.navigationevent.compose.AbstractC3271;
import androidx.profileinstaller.AbstractC3275;
import androidx.recyclerview.widget.C3328;
import androidx.window.area.AbstractC3400;
import bsh.C3466;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.C3899;
import com.bumptech.glide.C3901;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.data.C3801;
import com.bumptech.glide.load.data.C3803;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.load.resource.bitmap.C3849;
import com.bumptech.glide.load.resource.bitmap.C3854;
import com.bumptech.glide.load.resource.bitmap.C3856;
import com.bumptech.glide.load.resource.bitmap.C3859;
import com.bumptech.glide.load.resource.bitmap.C3860;
import com.bumptech.glide.load.resource.bitmap.C3861;
import com.bumptech.glide.load.resource.bitmap.C3863;
import com.bumptech.glide.load.resource.bitmap.C3872;
import com.bumptech.glide.load.resource.bitmap.C3875;
import com.bumptech.glide.load.resource.bitmap.C3877;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.flatbuffers.C4051;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.client.plugins.api.C4718;
import io.ktor.http.cio.internals.C4787;
import io.ktor.util.C5043;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5836;
import kotlin.reflect.jvm.internal.C5848;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.InterfaceC5896;
import kotlin.reflect.jvm.internal.InterfaceC5907;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5310;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlinx.coroutines.AbstractC6261;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import lin.xposed.hook.util.p011qq.C6388;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import okio.ByteString;
import p020.C6943;
import p026.AbstractC7014;
import p047.InterfaceC7152;
import p047.InterfaceC7153;
import p047.InterfaceC7154;
import p047.InterfaceC7155;
import p052.AbstractC7187;
import p062.InterfaceC7310;
import p063.C7316;
import p063.InterfaceC7318;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p091.C7787;
import p091.C7790;
import p099.C7870;
import p099.InterfaceC7866;
import p105.InterfaceC8013;
import p107.C8021;
import p107.C8022;
import p107.InterfaceC8020;
import p160.C8376;
import p160.C8379;
import p160.InterfaceC8378;
import p183.C8541;
import p189.C8563;
import p191.AbstractC8568;
import p209.C8657;
import p243.C8840;
import p244.C8845;
import p244.C8847;
import p244.C8848;
import p244.C8853;
import p244.C8857;
import p244.C8866;
import p246.C8882;
import p249.C8904;
import p250.C8911;
import p250.C8912;
import p250.C8916;
import p251.C8917;
import p251.C8918;
import p269.AbstractC9019;
import p301.C9216;
import p302.InterfaceC9229;
import p303.AbstractC9234;
import p321.C9452;
import p332.C9496;
import p405.AbstractC9919;
import p405.C9917;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2378 f1751;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final long m1700(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final String m1701(InterfaceC7372 interfaceC7372) {
        interfaceC7372.getClass();
        try {
            return String.valueOf(interfaceC7372.invoke());
        } catch (Exception e) {
            return "Log message invocation failed: " + e;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m1702(InterfaceC5189 interfaceC5189, AbstractC6261 abstractC6261) throws Throwable {
        try {
            AbstractC6185.m10929(Result.m9304constructorimpl(C6008.f15084), AbstractC3400.m5624(interfaceC5189));
        } catch (Throwable th) {
            m1735(th, abstractC6261);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static void m1703(String str, Set set) {
        try {
            AbstractC5894.m10615(m1726().concat(str), new JSONArray(set.toArray()).toString(), false);
        } catch (Exception e) {
            AbstractC7014.m12151(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final Class m1704(InterfaceC5919 interfaceC5919) {
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919 != null ? interfaceC5919.mo9458() : null;
        InterfaceC5925 interfaceC5925 = interfaceC5924Mo9458 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924Mo9458 : null;
        if (interfaceC5925 != null && interfaceC5925.mo9443()) {
            if (!AbstractC5899.m10637(interfaceC5919)) {
                return AbstractC3889.m7316(interfaceC5925);
            }
            InterfaceC5919 interfaceC5919M10629 = AbstractC5899.m10629(interfaceC5919);
            if (interfaceC5919M10629 != null && !AbstractC5899.m10637(interfaceC5919M10629) && !m1708(interfaceC5919M10629)) {
                return AbstractC3889.m7316(interfaceC5925);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m1705(InterfaceC7383 interfaceC7383, Object obj, InterfaceC5189 interfaceC5189) {
        try {
            AbstractC6185.m10929(Result.m9304constructorimpl(C6008.f15084), AbstractC3400.m5624(AbstractC3400.m5651(interfaceC7383, obj, interfaceC5189)));
        } catch (Throwable th) {
            m1735(th, interfaceC5189);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static InterfaceC5192 m1706(InterfaceC5186 interfaceC5186, InterfaceC5193 interfaceC5193) {
        interfaceC5193.getClass();
        return AbstractC5227.m9466(interfaceC5186.getKey(), interfaceC5193) ? EmptyCoroutineContext.INSTANCE : interfaceC5186;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final boolean m1707(InterfaceC5907 interfaceC5907) {
        C5381 c5381M10541;
        interfaceC5907.getClass();
        List listMo10520 = interfaceC5907.mo10520();
        if (listMo10520 == null || !listMo10520.isEmpty()) {
            Iterator it = listMo10520.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5940) it.next()).getKind() != KParameter$Kind.INSTANCE) {
                    return false;
                }
            }
        }
        String name = interfaceC5907.getName();
        AbstractC5835 abstractC5835Mo10502 = interfaceC5907.mo10502();
        String str = null;
        C5836 c5836 = abstractC5835Mo10502 instanceof C5836 ? (C5836) abstractC5835Mo10502 : null;
        if (c5836 != null && (c5381M10541 = c5836.m10541()) != null) {
            str = c5381M10541.f13636;
        }
        return AbstractC5227.m9466(name, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final boolean m1708(InterfaceC5919 interfaceC5919) {
        if (interfaceC5919.mo9455()) {
            return false;
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        InterfaceC5925 interfaceC5925 = interfaceC5924Mo9458 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924Mo9458 : null;
        Class clsM7310 = interfaceC5925 != null ? AbstractC3889.m7310(interfaceC5925) : null;
        return (clsM7310 == null || clsM7310.equals(Void.TYPE)) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m1709(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return !interfaceC8020.isInline() ? !(interfaceC8020.getKind() instanceof C8021) || AbstractC5227.m9466(interfaceC8020.getKind(), C8021.f19529) : !(interfaceC8020.mo12939() == 1 && m1709(interfaceC8020.mo12942(0)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m1710(long j) {
        return (j & 68719476736L) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static void m1711(String str, HashMap map) {
        try {
            AbstractC5894.m10615(m1726().concat(str), JSONObject.toJSONString(map, new JSONWriter$Feature[0]), false);
        } catch (Exception e) {
            AbstractC7014.m12151(e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final void m1712(String str, byte[] bArr) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵");
        str.getClass();
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜");
        bArr.getClass();
        Class clsM15228 = AbstractC7187.f17853 >= 12290 ? AbstractC9919.m15228(AbstractC9234.m14531(2815)) : AbstractC9919.m15228(AbstractC9234.m14531(2816));
        Class clsM152282 = AbstractC9919.m15228(AbstractC9234.m14531(422));
        Class clsM152283 = AbstractC9919.m15228(AbstractC9234.m14531(401));
        C9917 c9917 = new C9917();
        c9917.f25616 = clsM152283;
        if (c9917.f25615 == null) {
            c9917.f25615 = clsM152283.getName();
        }
        c9917.f25819 = new Class[]{Context.class, Class.class};
        c9917.f25818 = 2;
        Object objM15227 = c9917.m15227(QQEnvTool.getAppInterfaceContext(), clsM15228);
        AbstractC9234.m14531(1918);
        objM15227.getClass();
        Intent intent = (Intent) objM15227;
        intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜呜喵"), str);
        intent.putExtra(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"), bArr);
        int i = C9921.f25825;
        C9921 c9921M15231 = C9921.m15231(intent.getClass());
        c9921M15231.f25826 = AbstractC9234.m14531(421);
        c9921M15231.m15234(clsM152282);
        Object objNewProxyInstance = Proxy.newProxyInstance(AbstractC9919.f25822, new Class[]{AbstractC9919.m15228(AbstractC9234.m14531(422))}, new C6388(2));
        AbstractC9234.m14531(1582);
        objNewProxyInstance.getClass();
        c9921M15231.m15235(intent, objNewProxyInstance);
        Object objWaitAppInterface = QQEnvTool.waitAppInterface();
        C9921 c9921M15230 = C9921.m15230(objWaitAppInterface);
        c9921M15230.f25826 = AbstractC9234.m14531(423);
        c9921M15230.m15234(clsM152283);
        c9921M15230.m15235(objWaitAppInterface, intent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static byte[] m1713(File file) {
        if (!file.exists()) {
            C8376.m13324(file, ": file not found");
            return null;
        }
        if (!file.isFile()) {
            C8376.m13324(file, ": not a file");
            return null;
        }
        if (!file.canRead()) {
            C8376.m13324(file, ": file not readable");
            return null;
        }
        long length = file.length();
        int i = (int) length;
        if (i != length) {
            C8376.m13324(file, ": file too long");
            return null;
        }
        byte[] bArr = new byte[i];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = 0;
            while (i > 0) {
                int i3 = fileInputStream.read(bArr, i2, i);
                if (i3 == -1) {
                    throw new RuntimeException(file + ": unexpected EOF");
                }
                i2 += i3;
                i -= i3;
            }
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(file + ": trouble reading", e);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static InterfaceC5192 m1714(InterfaceC5192 interfaceC5192, InterfaceC5186 interfaceC5186) {
        interfaceC5192.getClass();
        return C9496.m14924(interfaceC5186, interfaceC5192);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static String m1715(X509Certificate x509Certificate) {
        x509Certificate.getClass();
        StringBuilder sb = new StringBuilder("sha256/");
        C6943 c6943 = ByteString.Companion;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        c6943.getClass();
        int length = encoded.length;
        AbstractC8568.m13625(encoded.length, 0L, length);
        sb.append(new ByteString(AbstractC5179.m9391(0, encoded, length)).sha256().base64());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m1716(int i, int i2, InterfaceC8020 interfaceC8020) {
        if (i > 0) {
            return;
        }
        throw new SerializationException(i + " is not allowed in ProtoNumber for property '" + interfaceC8020.mo12938(i2) + "' of '" + interfaceC8020.mo12941() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m1717(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m1718(ArrayList arrayList, List list, int i, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) interfaceC7383.invoke(obj, Integer.valueOf(i));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i2 = i + 1;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (((Number) interfaceC7387.invoke(obj2)).intValue() > i2) {
                    arrayList4.add(obj2);
                }
            }
            m1718(arrayList3, arrayList4, i2, interfaceC7387, interfaceC7383);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) interfaceC7387.invoke(obj3)).intValue() == i2) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new C4787(cCharValue, arrayList5, arrayList3));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3075 m1719(List list, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) interfaceC7387.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) interfaceC7387.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next == null) {
            C5043.m9176("Unable to build char tree from an empty list");
            return null;
        }
        ((Number) interfaceC7387.invoke(next)).intValue();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) interfaceC7387.invoke(it2.next())).intValue() == 0) {
                    C6755.m11869("There should be no empty entries");
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        m1718(arrayList, list, 0, interfaceC7387, interfaceC7383);
        arrayList.trimToSize();
        return new C3075(new C4787((char) 0, EmptyList.INSTANCE, arrayList), 15);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m1720(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(AbstractC5179.m9415(parameterTypes, "(", ")", C5848.f14796, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(AbstractC5263.m9535(returnType));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1721(boolean z, InterfaceC7372 interfaceC7372, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-361453782);
        int i2 = (c2159.m2939(z) ? 4 : 2) | i | (c2159.m2938(interfaceC7372) ? 32 : 16);
        int i3 = 0;
        if (c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (InterfaceC8378) c2159.m2943(AbstractC3271.f7446);
            if (obj == null) {
                c2159.m2952(950836184);
                View view = (View) c2159.m2943(AbstractC2670.f5677);
                view.getClass();
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(C0328R.id.view_tree_navigation_event_dispatcher_owner);
                    InterfaceC8378 interfaceC8378 = tag instanceof InterfaceC8378 ? (InterfaceC8378) tag : null;
                    if (interfaceC8378 != null) {
                        obj = interfaceC8378;
                        break;
                    } else {
                        Object objM8873 = AbstractC4765.m8873(view);
                        view = objM8873 instanceof View ? (View) objM8873 : null;
                    }
                }
                c2159.m2937(false);
            } else {
                c2159.m2952(950834231);
                c2159.m2937(false);
            }
            if (obj == null) {
                c2159.m2952(535274673);
                obj = (InterfaceC0865) c2159.m2943(AbstractC0857.f365);
                if (obj == null) {
                    c2159.m2952(1208426157);
                    View view2 = (View) c2159.m2943(AbstractC2670.f5677);
                    view2.getClass();
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(C0328R.id.view_tree_on_back_pressed_dispatcher_owner);
                        InterfaceC0865 interfaceC0865 = tag2 instanceof InterfaceC0865 ? (InterfaceC0865) tag2 : null;
                        if (interfaceC0865 != null) {
                            obj = interfaceC0865;
                            break;
                        } else {
                            Object objM88732 = AbstractC4765.m8873(view2);
                            view2 = objM88732 instanceof View ? (View) objM88732 : null;
                        }
                    }
                } else {
                    c2159.m2952(1208423708);
                }
                c2159.m2937(false);
                if (obj == null) {
                    c2159.m2952(1208428160);
                    Object baseContext = (Context) c2159.m2943(AbstractC2670.f5681);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof InterfaceC0865) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    obj = (InterfaceC0865) baseContext;
                } else {
                    c2159.m2952(1208423789);
                }
                c2159.m2937(false);
            } else {
                c2159.m2952(535271790);
            }
            c2159.m2937(false);
            if (obj == null) {
                C6755.m11870("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM2920 = c2159.m2920(obj);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2920 || objM2905 == c2188) {
                InterfaceC8378 interfaceC83782 = obj instanceof InterfaceC8378 ? (InterfaceC8378) obj : null;
                C8379 navigationEventDispatcher = interfaceC83782 != null ? interfaceC83782.getNavigationEventDispatcher() : null;
                InterfaceC0865 interfaceC08652 = obj instanceof InterfaceC0865 ? (InterfaceC0865) obj : null;
                objM2905 = new C8563(navigationEventDispatcher, interfaceC08652 != null ? interfaceC08652.getOnBackPressedDispatcher() : null);
                c2159.m2946(objM2905);
            }
            C8563 c8563 = (C8563) objM2905;
            long j = c2159.f4182;
            boolean zM29202 = c2159.m2920(c8563) | c2159.m2921(j);
            Object objM29052 = c2159.m2905();
            Object obj2 = objM29052;
            if (zM29202 || objM29052 == c2188) {
                C0859 c0859 = new C0859(new C0852(obj, j));
                c0859.f367 = new C0858(i3);
                c2159.m2946(c0859);
                obj2 = c0859;
            }
            C0859 c08592 = (C0859) obj2;
            c2159.m2952(-585307852);
            boolean zM2938 = ((i2 & 112) == 32) | c2159.m2938(c08592);
            Object objM29053 = c2159.m2905();
            if (zM2938 || objM29053 == c2188) {
                objM29053 = new C0851(c08592, i3, interfaceC7372);
                c2159.m2946(objM29053);
            }
            AbstractC2202.m3062((InterfaceC7372) objM29053, c2159);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i2 & 14;
            boolean zM29382 = c2159.m2938(c08592) | (i4 == 4);
            Object objM29054 = c2159.m2905();
            if (zM29382 || objM29054 == c2188) {
                objM29054 = new C0850(c08592, i3, z);
                c2159.m2946(objM29054);
            }
            AbstractC9019.m14248(boolValueOf, c08592, null, (InterfaceC7387) objM29054, c2159, i4);
            boolean zM29383 = c2159.m2938(c8563) | c2159.m2938(c08592);
            Object objM29055 = c2159.m2905();
            if (zM29383 || objM29055 == c2188) {
                objM29055 = new C0849(c8563, i3, c08592);
                c2159.m2946(objM29055);
            }
            AbstractC2202.m3045(c8563, c08592, (InterfaceC7387) objM29055, c2159);
            c2159.m2937(false);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C0848(z, interfaceC7372, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static HashMap m1722(String str) {
        try {
            HashMap map = (HashMap) JSONObject.parseObject(AbstractC5894.m10587(m1726().concat(str)), HashMap.class);
            return map == null ? new HashMap() : map;
        } catch (Exception unused) {
            return new HashMap();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ProtoIntegerType m1723(long j) {
        long j2 = j & 25769803776L;
        ProtoIntegerType protoIntegerType = ProtoIntegerType.DEFAULT;
        if (j2 == protoIntegerType.getSignature()) {
            return protoIntegerType;
        }
        ProtoIntegerType protoIntegerType2 = ProtoIntegerType.SIGNED;
        return j2 == protoIntegerType2.getSignature() ? protoIntegerType2 : ProtoIntegerType.FIXED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Set m1724(String str) {
        try {
            Set set = (Set) JSONObject.parseObject(AbstractC5894.m10587(m1726().concat(str)), Set.class);
            return set == null ? new HashSet() : set;
        } catch (Exception unused) {
            return new HashSet();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String m1725(String str) {
        FileInputStream fileInputStream;
        MessageDigest messageDigest;
        byte[] bArr;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception e) {
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                String strM1717 = m1717(messageDigest.digest());
                fileInputStream.close();
                return strM1717;
            }
            messageDigest.update(bArr, 0, i);
            System.err.println("[BeanShell] GetMd5ByFilePath: " + e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m1726() {
        return AbstractC4765.m8874().concat(AbstractC9234.m14531(5));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Object m1727(InterfaceC5186 interfaceC5186, Object obj, InterfaceC7383 interfaceC7383) {
        interfaceC7383.getClass();
        return interfaceC7383.invoke(obj, interfaceC5186);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int m1728(InterfaceC8020 interfaceC8020, int i, boolean z) {
        interfaceC8020.getClass();
        List listMo12943 = interfaceC8020.mo12943(i);
        if (!z) {
            i++;
        }
        int size = listMo12943.size();
        for (int i2 = 0; i2 < size; i2++) {
            Annotation annotation = (Annotation) listMo12943.get(i2);
            if (annotation instanceof InterfaceC7154) {
                return -2;
            }
            if (annotation instanceof InterfaceC7155) {
                i = ((InterfaceC7155) annotation).number();
                if (!z) {
                    m1716(i, i2, interfaceC8020);
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final int m1729(C2822 c2822, int i) {
        boolean z = c2822.compareTo(C2822.f6220) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Method m1730(Class cls, InterfaceC5896 interfaceC5896) {
        interfaceC5896.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            C5043.m9172("No unbox method found in inline class: ", cls, " (calling ", interfaceC5896);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static InterfaceC5186 m1731(InterfaceC5186 interfaceC5186, InterfaceC5193 interfaceC5193) {
        interfaceC5193.getClass();
        if (AbstractC5227.m9466(interfaceC5186.getKey(), interfaceC5193)) {
            return interfaceC5186;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, java.util.List] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final List m1732(InterfaceC8020 interfaceC8020, C2080 c2080) {
        ?? M9356;
        interfaceC8020.getClass();
        c2080.getClass();
        AbstractC9019 kind = interfaceC8020.getKind();
        if (AbstractC5227.m9466(kind, C8022.f19538)) {
            InterfaceC5925 interfaceC5925M13639 = AbstractC8568.m13639(interfaceC8020);
            if (interfaceC5925M13639 == null) {
                M9356 = EmptyList.INSTANCE;
            } else {
                Map map = (Map) ((Map) c2080.f3966).get(interfaceC5925M13639);
                Collection collectionValues = map != null ? map.values() : null;
                if (collectionValues == null) {
                    collectionValues = EmptyList.INSTANCE;
                }
                Collection collection = collectionValues;
                M9356 = new ArrayList(AbstractC5177.m9381(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    M9356.add(((InterfaceC8013) it.next()).getDescriptor());
                }
            }
        } else {
            if (!AbstractC5227.m9466(kind, C8022.f19539)) {
                C3466.m5900(interfaceC8020.mo12941(), "Class ", " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
                return null;
            }
            InterfaceC8020 interfaceC8020Mo12942 = interfaceC8020.mo12942(1);
            interfaceC8020Mo12942.getClass();
            M9356 = AbstractC5176.m9356(new C5174(interfaceC8020Mo12942, 3));
        }
        for (InterfaceC8020 interfaceC80202 : M9356) {
            List listMo12943 = interfaceC80202.mo12943(0);
            if (listMo12943 == null || !listMo12943.isEmpty()) {
                Iterator it2 = listMo12943.iterator();
                while (it2.hasNext()) {
                    if (((Annotation) it2.next()) instanceof InterfaceC7155) {
                        break;
                    }
                }
            }
            throw new IllegalArgumentException(interfaceC80202.mo12941() + " implementing oneOf type " + interfaceC8020.mo12941() + " should have @ProtoNumber annotation in its single property.");
        }
        return M9356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1171 m1733(C1171 c1171, InterfaceC7310 interfaceC7310) {
        c1171.getClass();
        interfaceC7310.getClass();
        return interfaceC7310.isEmpty() ? c1171 : new C1171((C7870) c1171.f1440, (InterfaceC7866) c1171.f1441, AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C5860(c1171, 22, interfaceC7310)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C1171 m1734(C1171 c1171, InterfaceC5310 interfaceC5310, C5284 c5284, int i) {
        if ((i & 2) != 0) {
            c5284 = null;
        }
        c1171.getClass();
        return new C1171((C7870) c1171.f1440, c5284 != null ? new C3328(c1171, interfaceC5310, c5284, 0) : (InterfaceC7866) c1171.f1441, AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C5860(c1171, 21, interfaceC5310)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m1735(Throwable th, InterfaceC5189 interfaceC5189) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        interfaceC5189.resumeWith(Result.m9304constructorimpl(AbstractC6017.m10770(th)));
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m1736(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        List listMo12943 = interfaceC8020.mo12943(i);
        int i2 = i + 1;
        ProtoIntegerType protoIntegerTypeType = ProtoIntegerType.DEFAULT;
        int size = listMo12943.size();
        int iNumber = i2;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            Annotation annotation = (Annotation) listMo12943.get(i3);
            if (annotation instanceof InterfaceC7155) {
                iNumber = ((InterfaceC7155) annotation).number();
                m1716(iNumber, i3, interfaceC8020);
            } else if (annotation instanceof InterfaceC7152) {
                protoIntegerTypeType = ((InterfaceC7152) annotation).type();
            } else if (annotation instanceof InterfaceC7153) {
                z2 = true;
            } else if (annotation instanceof InterfaceC7154) {
                z = true;
            }
        }
        if (!z) {
            i2 = iNumber;
        }
        return ((long) i2) | (z ? 68719476736L : 0L) | (z2 ? 4294967296L : 0L) | protoIntegerTypeType.getSignature();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03ec  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3899 m1737(ComponentCallbacks2C3890 componentCallbacks2C3890, ArrayList arrayList) {
        InterfaceC3811 interfaceC3811;
        InterfaceC9229 c3861;
        InterfaceC9229 c3875;
        int i;
        Class cls;
        String str;
        String str2;
        Class cls2;
        Iterator it;
        InterfaceC3811 interfaceC38112 = componentCallbacks2C3890.f10119;
        C3806 c3806 = componentCallbacks2C3890.f10114;
        C3901 c3901 = componentCallbacks2C3890.f10118;
        Context applicationContext = c3901.getApplicationContext();
        C3075 c3075 = c3901.f10167;
        C3899 c3899 = new C3899();
        Class<InputStream> cls3 = InputStream.class;
        C3877 c3877 = new C3877();
        C2397 c2397 = c3899.f10155;
        synchronized (c2397) {
            c2397.f4945.add(c3877);
        }
        C3863 c3863 = new C3863();
        C2397 c23972 = c3899.f10155;
        synchronized (c23972) {
            c23972.f4945.add(c3863);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM7436 = c3899.m7436();
        C8912 c8912 = new C8912(applicationContext, arrayListM7436, interfaceC38112, c3806);
        C3854 c3854 = new C3854(interfaceC38112, new C4718(19));
        C3872 c3872 = new C3872(c3899.m7436(), resources.getDisplayMetrics(), interfaceC38112, c3806);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            interfaceC3811 = interfaceC38112;
            if (((Map) c3075.f6882).containsKey(AbstractC3889.class)) {
                C3875 c38752 = new C3875(1);
                c3875 = new C3875(0);
                c3861 = c38752;
            }
            if (i2 < 28) {
                i = i2;
                cls = ParcelFileDescriptor.class;
                c3899.m7437("Animation", InputStream.class, Drawable.class, new C8918(new C8882(arrayListM7436, c3806), 1));
                c3899.m7437("Animation", ByteBuffer.class, Drawable.class, new C8918(new C8882(arrayListM7436, c3806), 0));
            } else {
                i = i2;
                cls = ParcelFileDescriptor.class;
            }
            C8917 c8917 = new C8917(applicationContext);
            C3860 c3860 = new C3860(c3806);
            C0954 c0954 = new C0954();
            C8904 c8904 = new C8904(1);
            ContentResolver contentResolver = applicationContext.getContentResolver();
            c3899.m7439(ByteBuffer.class, new C8847(5));
            c3899.m7439(InputStream.class, new C6686(c3806, 29));
            c3899.m7437("Bitmap", ByteBuffer.class, Bitmap.class, c3875);
            c3899.m7437("Bitmap", InputStream.class, Bitmap.class, c3861);
            str = Build.FINGERPRINT;
            if ("robolectric".equals(str)) {
                str2 = str;
                cls2 = cls;
                c3899.m7437("Bitmap", cls2, Bitmap.class, new C3856(c3872, 1));
            } else {
                str2 = str;
                cls2 = cls;
            }
            InterfaceC3811 interfaceC38113 = interfaceC3811;
            c3899.m7437("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C3854(interfaceC38113, new C9452(17)));
            c3899.m7437("Bitmap", cls2, Bitmap.class, c3854);
            C8847 c8847 = C8847.f22488;
            c3899.m7440(Bitmap.class, Bitmap.class, c8847);
            c3899.m7437("Bitmap", Bitmap.class, Bitmap.class, new C3849(0));
            c3899.m7438(Bitmap.class, c3860);
            c3899.m7437("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C3861(resources, c3875));
            c3899.m7437("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C3861(resources, c3861));
            c3899.m7437("BitmapDrawable", cls2, BitmapDrawable.class, new C3861(resources, c3854));
            c3899.m7438(BitmapDrawable.class, new C0923(interfaceC38113, 16, c3860));
            c3899.m7437("Animation", InputStream.class, C8911.class, new C8916(arrayListM7436, c8912, c3806));
            c3899.m7437("Animation", ByteBuffer.class, C8911.class, c8912);
            c3899.m7438(C8911.class, new C7787(18));
            c3899.m7440(C9216.class, C9216.class, c8847);
            c3899.m7437("Bitmap", C9216.class, Bitmap.class, new C3859(interfaceC38113));
            c3899.m7437("legacy_append", Uri.class, Drawable.class, c8917);
            c3899.m7437("legacy_append", Uri.class, Bitmap.class, new C3861(c8917, 1, interfaceC38113));
            c3899.m7441(new C3801(2));
            c3899.m7440(File.class, ByteBuffer.class, new C8847(6));
            c3899.m7440(File.class, InputStream.class, new C8848(new C8847(9)));
            c3899.m7437("legacy_append", File.class, File.class, new C3849(1));
            c3899.m7440(File.class, cls2, new C8848(new C8847(8)));
            c3899.m7440(File.class, File.class, c8847);
            c3899.m7441(new C3803(c3806));
            if (!"robolectric".equals(str2)) {
                c3899.m7441(new C3801(1));
            }
            C8541 c8541 = new C8541(applicationContext, 5);
            C8541 c85412 = new C8541(applicationContext, 3);
            C8541 c85413 = new C8541(applicationContext, 4);
            Class cls4 = Integer.TYPE;
            c3899.m7440(cls4, InputStream.class, c8541);
            c3899.m7440(Integer.class, InputStream.class, c8541);
            c3899.m7440(cls4, AssetFileDescriptor.class, c85412);
            c3899.m7440(Integer.class, AssetFileDescriptor.class, c85412);
            c3899.m7440(cls4, Drawable.class, c85413);
            c3899.m7440(Integer.class, Drawable.class, c85413);
            c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, 8));
            c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8541(applicationContext, 7));
            C8857 c8857 = new C8857(resources, 2);
            C8857 c88572 = new C8857(resources, 0);
            C8857 c88573 = new C8857(resources, 1);
            c3899.m7440(Integer.class, Uri.class, c8857);
            c3899.m7440(cls4, Uri.class, c8857);
            c3899.m7440(Integer.class, AssetFileDescriptor.class, c88572);
            c3899.m7440(cls4, AssetFileDescriptor.class, c88572);
            c3899.m7440(Integer.class, InputStream.class, c88573);
            c3899.m7440(cls4, InputStream.class, c88573);
            c3899.m7440(String.class, InputStream.class, new C6686(27));
            c3899.m7440(Uri.class, InputStream.class, new C6686(27));
            c3899.m7440(String.class, InputStream.class, new C8847(13));
            int i3 = 12;
            c3899.m7440(String.class, cls2, new C8847(i3));
            c3899.m7440(String.class, AssetFileDescriptor.class, new C8847(11));
            int i4 = 1;
            c3899.m7440(Uri.class, InputStream.class, new C8853(applicationContext.getAssets(), i4));
            c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8853(applicationContext.getAssets(), 0));
            c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, i4));
            c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, 2));
            if (i >= 29) {
                int i5 = 5;
                c3899.m7440(Uri.class, InputStream.class, new C8840(applicationContext, i5, cls3));
                c3899.m7440(Uri.class, cls2, new C8840(applicationContext, i5, cls2));
            }
            boolean zContainsKey = ((Map) c3075.f6882).containsKey(AbstractC3897.class);
            c3899.m7440(Uri.class, InputStream.class, new C8845(contentResolver, zContainsKey, 2));
            c3899.m7440(Uri.class, cls2, new C8845(contentResolver, zContainsKey, 1));
            c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8845(contentResolver, zContainsKey, 0));
            c3899.m7440(Uri.class, InputStream.class, new C8847(14));
            c3899.m7440(URL.class, InputStream.class, new C7790(i3));
            c3899.m7440(Uri.class, File.class, new C8541(applicationContext, 6));
            c3899.m7440(C8866.class, InputStream.class, new C6686(26));
            int i6 = 2;
            c3899.m7440(byte[].class, ByteBuffer.class, new C8847(i6));
            c3899.m7440(byte[].class, InputStream.class, new C8847(4));
            c3899.m7440(Uri.class, Uri.class, c8847);
            c3899.m7440(Drawable.class, Drawable.class, c8847);
            c3899.m7437("legacy_append", Drawable.class, Drawable.class, new C3849(i6));
            c3899.m7443(Bitmap.class, BitmapDrawable.class, new C8857(resources, 3));
            c3899.m7443(Bitmap.class, byte[].class, c0954);
            C8657 c8657 = new C8657();
            c8657.f21713 = interfaceC38113;
            c8657.f21711 = c0954;
            c8657.f21712 = c8904;
            c3899.m7443(Drawable.class, byte[].class, c8657);
            c3899.m7443(C8911.class, byte[].class, c8904);
            C3854 c38542 = new C3854(interfaceC38113, new C4718(18));
            c3899.m7437("legacy_append", ByteBuffer.class, Bitmap.class, c38542);
            c3899.m7437("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C3861(resources, c38542));
            it = arrayList.iterator();
            if (it.hasNext()) {
                return c3899;
            }
            throw AbstractC3275.m5138(it);
        }
        interfaceC3811 = interfaceC38112;
        C3856 c3856 = new C3856(c3872, 0);
        c3861 = new C3861(c3872, 2, c3806);
        c3875 = c3856;
        if (i2 < 28) {
        }
        C8917 c89172 = new C8917(applicationContext);
        C3860 c38602 = new C3860(c3806);
        C0954 c09542 = new C0954();
        C8904 c89042 = new C8904(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        c3899.m7439(ByteBuffer.class, new C8847(5));
        c3899.m7439(InputStream.class, new C6686(c3806, 29));
        c3899.m7437("Bitmap", ByteBuffer.class, Bitmap.class, c3875);
        c3899.m7437("Bitmap", InputStream.class, Bitmap.class, c3861);
        str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
        }
        InterfaceC3811 interfaceC381132 = interfaceC3811;
        c3899.m7437("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C3854(interfaceC381132, new C9452(17)));
        c3899.m7437("Bitmap", cls2, Bitmap.class, c3854);
        C8847 c88472 = C8847.f22488;
        c3899.m7440(Bitmap.class, Bitmap.class, c88472);
        c3899.m7437("Bitmap", Bitmap.class, Bitmap.class, new C3849(0));
        c3899.m7438(Bitmap.class, c38602);
        c3899.m7437("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C3861(resources, c3875));
        c3899.m7437("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C3861(resources, c3861));
        c3899.m7437("BitmapDrawable", cls2, BitmapDrawable.class, new C3861(resources, c3854));
        c3899.m7438(BitmapDrawable.class, new C0923(interfaceC381132, 16, c38602));
        c3899.m7437("Animation", InputStream.class, C8911.class, new C8916(arrayListM7436, c8912, c3806));
        c3899.m7437("Animation", ByteBuffer.class, C8911.class, c8912);
        c3899.m7438(C8911.class, new C7787(18));
        c3899.m7440(C9216.class, C9216.class, c88472);
        c3899.m7437("Bitmap", C9216.class, Bitmap.class, new C3859(interfaceC381132));
        c3899.m7437("legacy_append", Uri.class, Drawable.class, c89172);
        c3899.m7437("legacy_append", Uri.class, Bitmap.class, new C3861(c89172, 1, interfaceC381132));
        c3899.m7441(new C3801(2));
        c3899.m7440(File.class, ByteBuffer.class, new C8847(6));
        c3899.m7440(File.class, InputStream.class, new C8848(new C8847(9)));
        c3899.m7437("legacy_append", File.class, File.class, new C3849(1));
        c3899.m7440(File.class, cls2, new C8848(new C8847(8)));
        c3899.m7440(File.class, File.class, c88472);
        c3899.m7441(new C3803(c3806));
        if (!"robolectric".equals(str2)) {
        }
        C8541 c85414 = new C8541(applicationContext, 5);
        C8541 c854122 = new C8541(applicationContext, 3);
        C8541 c854132 = new C8541(applicationContext, 4);
        Class cls42 = Integer.TYPE;
        c3899.m7440(cls42, InputStream.class, c85414);
        c3899.m7440(Integer.class, InputStream.class, c85414);
        c3899.m7440(cls42, AssetFileDescriptor.class, c854122);
        c3899.m7440(Integer.class, AssetFileDescriptor.class, c854122);
        c3899.m7440(cls42, Drawable.class, c854132);
        c3899.m7440(Integer.class, Drawable.class, c854132);
        c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, 8));
        c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8541(applicationContext, 7));
        C8857 c88574 = new C8857(resources, 2);
        C8857 c885722 = new C8857(resources, 0);
        C8857 c885732 = new C8857(resources, 1);
        c3899.m7440(Integer.class, Uri.class, c88574);
        c3899.m7440(cls42, Uri.class, c88574);
        c3899.m7440(Integer.class, AssetFileDescriptor.class, c885722);
        c3899.m7440(cls42, AssetFileDescriptor.class, c885722);
        c3899.m7440(Integer.class, InputStream.class, c885732);
        c3899.m7440(cls42, InputStream.class, c885732);
        c3899.m7440(String.class, InputStream.class, new C6686(27));
        c3899.m7440(Uri.class, InputStream.class, new C6686(27));
        c3899.m7440(String.class, InputStream.class, new C8847(13));
        int i32 = 12;
        c3899.m7440(String.class, cls2, new C8847(i32));
        c3899.m7440(String.class, AssetFileDescriptor.class, new C8847(11));
        int i42 = 1;
        c3899.m7440(Uri.class, InputStream.class, new C8853(applicationContext.getAssets(), i42));
        c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8853(applicationContext.getAssets(), 0));
        c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, i42));
        c3899.m7440(Uri.class, InputStream.class, new C8541(applicationContext, 2));
        if (i >= 29) {
        }
        boolean zContainsKey2 = ((Map) c3075.f6882).containsKey(AbstractC3897.class);
        c3899.m7440(Uri.class, InputStream.class, new C8845(contentResolver2, zContainsKey2, 2));
        c3899.m7440(Uri.class, cls2, new C8845(contentResolver2, zContainsKey2, 1));
        c3899.m7440(Uri.class, AssetFileDescriptor.class, new C8845(contentResolver2, zContainsKey2, 0));
        c3899.m7440(Uri.class, InputStream.class, new C8847(14));
        c3899.m7440(URL.class, InputStream.class, new C7790(i32));
        c3899.m7440(Uri.class, File.class, new C8541(applicationContext, 6));
        c3899.m7440(C8866.class, InputStream.class, new C6686(26));
        int i62 = 2;
        c3899.m7440(byte[].class, ByteBuffer.class, new C8847(i62));
        c3899.m7440(byte[].class, InputStream.class, new C8847(4));
        c3899.m7440(Uri.class, Uri.class, c88472);
        c3899.m7440(Drawable.class, Drawable.class, c88472);
        c3899.m7437("legacy_append", Drawable.class, Drawable.class, new C3849(i62));
        c3899.m7443(Bitmap.class, BitmapDrawable.class, new C8857(resources, 3));
        c3899.m7443(Bitmap.class, byte[].class, c09542);
        C8657 c86572 = new C8657();
        c86572.f21713 = interfaceC381132;
        c86572.f21711 = c09542;
        c86572.f21712 = c89042;
        c3899.m7443(Drawable.class, byte[].class, c86572);
        c3899.m7443(C8911.class, byte[].class, c89042);
        C3854 c385422 = new C3854(interfaceC381132, new C4718(18));
        c3899.m7437("legacy_append", ByteBuffer.class, Bitmap.class, c385422);
        c3899.m7437("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C3861(resources, c385422));
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC7318 m1738(List list, InterfaceC5896 interfaceC5896, InterfaceC7318 interfaceC7318, boolean z) {
        interfaceC5896.getClass();
        list.getClass();
        List parameters = interfaceC5896.getParameters();
        if (parameters == null || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (AbstractC5899.m10632(((InterfaceC5940) it.next()).getType())) {
                    break;
                }
            }
            if (!AbstractC5899.m10632(interfaceC5896.getReturnType())) {
                return interfaceC7318;
            }
        } else if (!AbstractC5899.m10632(interfaceC5896.getReturnType())) {
        }
        return new C7316(list, interfaceC5896, interfaceC7318, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract void mo1739(Throwable th);

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public abstract void mo1740(C1171 c1171);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract int mo1741(C4051 c4051);
}
