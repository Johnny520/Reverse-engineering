package kotlin.reflect.jvm.internal.types;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0194;
import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.AbstractC1081;
import androidx.compose.foundation.AbstractC1092;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1372;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1315;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.runtime.tooling.C1300;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.text.C2031;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bsh.C2633;
import com.bumptech.glide.AbstractC3057;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.AbstractC3066;
import com.bumptech.glide.load.engine.C3005;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.server.application.AbstractC4054;
import io.ktor.server.application.C4058;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import io.ktor.util.C4211;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UTFDataFormatException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5176;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4778;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlin.sequences.AbstractC5122;
import kotlinx.serialization.SerializationException;
import p018.AbstractC6253;
import p034.AbstractC6344;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p053.AbstractC6561;
import p074.AbstractC6945;
import p074.C6946;
import p087.AbstractC7124;
import p087.AbstractC7144;
import p087.C7070;
import p087.C7077;
import p087.C7103;
import p087.C7131;
import p087.C7135;
import p087.C7140;
import p088.C7162;
import p089.C7180;
import p089.InterfaceC7184;
import p104.InterfaceC7280;
import p126.C7423;
import p161.AbstractC7646;
import p192.C7808;
import p196.AbstractC7837;
import p212.AbstractC7949;
import p251.C8183;
import p251.SharedPreferencesC8176;
import p254.C8191;
import p287.AbstractC8405;
import p329.C8770;
import p344.AbstractC8824;
import p344.AbstractC8826;
import p344.AbstractC8828;
import p344.AbstractC8830;
import p344.AbstractC8831;
import p344.C8825;
import p344.C8833;
import p389.AbstractC9090;
import p391.C9095;
import p393.AbstractC9109;
import p393.C9103;
import p393.C9106;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.utils.C6060;
import top.yukonga.miuix.kmp.utils.C6079;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile boolean f14253 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14254;

    public /* synthetic */ AbstractC4922(int i) {
        this.f14254 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.tooling.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final ArrayList m9865(C1234 c1234, int i, Integer num) {
        ?? c1300 = new C1300(c1234);
        int iM2079 = c1234.m2079(i);
        C1230 c1230M2073 = c1234.m2073(i);
        while (i >= 0) {
            c1300.m2302(c1234.m2087(i), c1234.m2085(i) ? c1234.m2082(c1234.f3554, i) : C1369.f3974, c1234.f3555.m2066(i), num);
            if (iM2079 >= 0) {
                C1230 c1230 = c1230M2073;
                c1230M2073 = c1234.m2073(iM2079);
                i = iM2079;
                iM2079 = c1234.m2079(iM2079);
                num = c1230;
            } else {
                i = iM2079;
                num = c1230M2073;
            }
        }
        return c1300.f3783;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final void m9866(C7423 c7423, int i, Object obj) {
        c7423.f20118[(c7423.f20120 - c7423.f20123[c7423.f20121 - 1].f18403) + i] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final ArrayList m9867(C1245 c1245, List list, boolean z) {
        c1245.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m9869(c1245, (InterfaceC5087) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC5087 interfaceC5087 = (InterfaceC5087) it2.next();
            interfaceC5087.getClass();
            InterfaceC7184 interfaceC7184M11878 = AbstractC6344.m11878(c1245, interfaceC5087, false);
            if (interfaceC7184M11878 == null) {
                return null;
            }
            arrayList2.add(interfaceC7184M11878);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final void m9868(C7423 c7423, int i, Object obj, int i2, Object obj2) {
        int i3 = c7423.f20120 - c7423.f20123[c7423.f20121 - 1].f18403;
        Object[] objArr = c7423.f20118;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final InterfaceC7184 m9869(C1245 c1245, InterfaceC5087 interfaceC5087) {
        c1245.getClass();
        interfaceC5087.getClass();
        InterfaceC7184 interfaceC7184M11878 = AbstractC6344.m11878(c1245, interfaceC5087, true);
        if (interfaceC7184M11878 != null) {
            return interfaceC7184M11878;
        }
        throw new SerializationException(AbstractC7144.m12417(AbstractC7144.m12418(interfaceC5087)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final InterfaceC7184 m9870(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        InterfaceC7184 interfaceC7184M12413 = AbstractC7144.m12413(AbstractC3057.m6756(interfaceC5093), (InterfaceC7184[]) Arrays.copyOf(new InterfaceC7184[0], 0));
        return interfaceC7184M12413 == null ? (InterfaceC7184) AbstractC7124.f19061.get(interfaceC5093) : interfaceC7184M12413;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m9871(String str, ArrayList arrayList) {
        String strM10034 = AbstractC5062.m10034(str);
        C7162 c7162M6823 = AbstractC3065.m6823(new C7180(24));
        if (C9095.f25488.length() == 0) {
            C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = new C8183(C9095.f25488, "DexKitCache").m13673();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            C7162 c7162 = AbstractC9109.f25536;
            cls.getClass();
            C7162 c71622 = AbstractC9109.f25536;
            C9106 c9106 = new C9106(cls.getName());
            c71622.getClass();
            arrayList2.add(c71622.m12424(C9106.Companion.serializer(), c9106));
        }
        sharedPreferencesC8176M13673.putString(strM10034, c7162M6823.m12424(new C7103(C7135.f19089, 0), arrayList2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final InterfaceC7184 m9872(C1245 c1245, Type type) {
        c1245.getClass();
        InterfaceC7184 interfaceC7184M11745 = AbstractC6253.m11745(c1245, type, true);
        if (interfaceC7184M11745 != null) {
            return interfaceC7184M11745;
        }
        Class clsM11744 = AbstractC6253.m11744(type);
        clsM11744.getClass();
        throw new SerializationException(AbstractC7144.m12417(AbstractC4396.f12975.mo8917(clsM11744)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static void m9873(String str, ArrayList arrayList) {
        String strM10034 = AbstractC5062.m10034(str);
        C7162 c7162M6823 = AbstractC3065.m6823(new C7180(24));
        if (C9095.f25488.length() == 0) {
            C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = new C8183(C9095.f25488, "DexKitCache").m13673();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                sharedPreferencesC8176M13673.putString(strM10034, c7162M6823.m12424(new C7103(C7135.f19089, 0), arrayList2));
                return;
            }
            Method method = (Method) it.next();
            C7162 c7162 = AbstractC9109.f25536;
            method.getClass();
            method.setAccessible(true);
            C7162 c71622 = AbstractC9109.f25536;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            name2.getClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            ArrayList arrayList3 = new ArrayList(parameterTypes.length);
            for (Class<?> cls : parameterTypes) {
                arrayList3.add(cls.getName());
            }
            C9103 c9103 = new C9103(name, name2, method.getReturnType().getName(), arrayList3);
            c71622.getClass();
            arrayList2.add(c71622.m12424(C9103.Companion.serializer(), c9103));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static String m9874(InterfaceC7280 interfaceC7280, C4565 c4565) {
        if (interfaceC7280.mo12497(c4565)) {
            return null;
        }
        return interfaceC7280.mo12498();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final boolean m9875(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final InterfaceC7184 m9876(InterfaceC5093 interfaceC5093, ArrayList arrayList, InterfaceC6543 interfaceC6543) {
        InterfaceC7184 c7103;
        InterfaceC7184 c7140;
        interfaceC5093.getClass();
        C4397 c4397 = AbstractC4396.f12975;
        if (interfaceC5093.equals(c4397.mo8917(Collection.class)) || interfaceC5093.equals(c4397.mo8917(List.class)) || interfaceC5093.equals(c4397.mo8917(List.class)) || interfaceC5093.equals(c4397.mo8917(ArrayList.class))) {
            c7103 = new C7103((InterfaceC7184) arrayList.get(0), 0);
        } else if (interfaceC5093.equals(c4397.mo8917(HashSet.class))) {
            c7103 = new C7103((InterfaceC7184) arrayList.get(0), 1);
        } else if (interfaceC5093.equals(c4397.mo8917(Set.class)) || interfaceC5093.equals(c4397.mo8917(Set.class)) || interfaceC5093.equals(c4397.mo8917(LinkedHashSet.class))) {
            c7103 = new C7103((InterfaceC7184) arrayList.get(0), 2);
        } else if (interfaceC5093.equals(c4397.mo8917(HashMap.class))) {
            c7103 = new C7077((InterfaceC7184) arrayList.get(0), (InterfaceC7184) arrayList.get(1), 0);
        } else if (interfaceC5093.equals(c4397.mo8917(Map.class)) || interfaceC5093.equals(c4397.mo8917(Map.class)) || interfaceC5093.equals(c4397.mo8917(LinkedHashMap.class))) {
            c7103 = new C7077((InterfaceC7184) arrayList.get(0), (InterfaceC7184) arrayList.get(1), 1);
        } else {
            if (interfaceC5093.equals(c4397.mo8917(Map.Entry.class))) {
                InterfaceC7184 interfaceC7184 = (InterfaceC7184) arrayList.get(0);
                InterfaceC7184 interfaceC71842 = (InterfaceC7184) arrayList.get(1);
                interfaceC7184.getClass();
                interfaceC71842.getClass();
                c7140 = new C7070(interfaceC7184, interfaceC71842, 0);
            } else if (interfaceC5093.equals(c4397.mo8917(Pair.class))) {
                InterfaceC7184 interfaceC71843 = (InterfaceC7184) arrayList.get(0);
                InterfaceC7184 interfaceC71844 = (InterfaceC7184) arrayList.get(1);
                interfaceC71843.getClass();
                interfaceC71844.getClass();
                c7140 = new C7070(interfaceC71843, interfaceC71844, 1);
            } else if (interfaceC5093.equals(c4397.mo8917(Triple.class))) {
                InterfaceC7184 interfaceC71845 = (InterfaceC7184) arrayList.get(0);
                InterfaceC7184 interfaceC71846 = (InterfaceC7184) arrayList.get(1);
                InterfaceC7184 interfaceC71847 = (InterfaceC7184) arrayList.get(2);
                interfaceC71845.getClass();
                interfaceC71846.getClass();
                interfaceC71847.getClass();
                c7103 = new C7131(interfaceC71845, interfaceC71846, interfaceC71847);
            } else if (AbstractC3057.m6756(interfaceC5093).isArray()) {
                Object objInvoke = interfaceC6543.invoke();
                objInvoke.getClass();
                InterfaceC7184 interfaceC71848 = (InterfaceC7184) arrayList.get(0);
                interfaceC71848.getClass();
                c7140 = new C7140((InterfaceC5093) objInvoke, interfaceC71848);
            } else {
                c7103 = null;
            }
            c7103 = c7140;
        }
        if (c7103 != null) {
            return c7103;
        }
        InterfaceC7184[] interfaceC7184Arr = (InterfaceC7184[]) arrayList.toArray(new InterfaceC7184[0]);
        InterfaceC7184[] interfaceC7184Arr2 = (InterfaceC7184[]) Arrays.copyOf(interfaceC7184Arr, interfaceC7184Arr.length);
        return AbstractC7144.m12413(AbstractC3057.m6756(interfaceC5093), (InterfaceC7184[]) Arrays.copyOf(interfaceC7184Arr2, interfaceC7184Arr2.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Drawable m9877(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C7808 c7808 = new C7808(context);
            c7808.f21288 = theme;
            c7808.m13171(theme.getResources().getConfiguration());
            context = c7808;
        }
        return AbstractC3933.m8312(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Bundle m9878(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                bundle.putString(str, null);
            } else if (objComponent2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof Byte) {
                bundle.putByte(str, ((Number) objComponent2).byteValue());
            } else if (objComponent2 instanceof Character) {
                bundle.putChar(str, ((Character) objComponent2).charValue());
            } else if (objComponent2 instanceof Double) {
                bundle.putDouble(str, ((Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof Float) {
                bundle.putFloat(str, ((Number) objComponent2).floatValue());
            } else if (objComponent2 instanceof Integer) {
                bundle.putInt(str, ((Number) objComponent2).intValue());
            } else if (objComponent2 instanceof Long) {
                bundle.putLong(str, ((Number) objComponent2).longValue());
            } else if (objComponent2 instanceof Short) {
                bundle.putShort(str, ((Number) objComponent2).shortValue());
            } else if (objComponent2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objComponent2);
            } else if (objComponent2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objComponent2);
            } else if (objComponent2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objComponent2);
            } else if (objComponent2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objComponent2);
            } else if (objComponent2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objComponent2);
            } else if (objComponent2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objComponent2);
            } else if (objComponent2 instanceof Object[]) {
                Class<?> componentType = objComponent2.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) objComponent2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) objComponent2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) objComponent2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objComponent2);
                }
            } else if (objComponent2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objComponent2);
            } else if (objComponent2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objComponent2);
            } else if (objComponent2 instanceof Size) {
                bundle.putSize(str, (Size) objComponent2);
            } else {
                if (!(objComponent2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) objComponent2);
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.tooling.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final List m9879(C1235 c1235, Integer num, int i, Integer num2) {
        int iM2112;
        int iM2120;
        C0244 c0244;
        if (c1235.f3572 || c1235.m2130() == 0) {
            return EmptyList.INSTANCE;
        }
        ?? c1300 = new C1300(c1235);
        if (num2 != null) {
            iM2112 = num2.intValue();
        } else {
            iM2112 = c1235.f3575;
            if (iM2112 < 0) {
                iM2112 = c1235.m2112(c1235.f3568, i);
            }
        }
        if (num == 0) {
            int iM2100 = c1235.f3586 - c1235.m2100(c1235.f3568, c1235.m2128(i));
            C0246 c0246 = c1235.f3571;
            num = Integer.valueOf(iM2100 + ((c0246 == null || (c0244 = (C0244) c0246.m833(i)) == null) ? 0 : c0244.f1004));
        }
        int iM2128 = c1235.m2128(i) * 5;
        int[] iArr = c1235.f3568;
        if (iM2128 < iArr.length) {
            iM2120 = c1235.m2120(i);
        } else {
            int iM21122 = iM2112 >= 0 ? c1235.m2112(iArr, iM2112) : iM2112;
            iM2120 = c1235.m2120(iM2112);
            int i2 = iM2112;
            iM2112 = iM21122;
            i = i2;
        }
        while (i >= 0) {
            c1300.m2302(iM2120, (c1235.f3568[(c1235.m2128(i) * 5) + 1] & 536870912) != 0 ? c1235.m2119(i) : C1369.f3974, c1235.m2096(i), num);
            num = c1235.m2117(i);
            if (iM2112 >= 0) {
                int iM21123 = c1235.m2112(c1235.f3568, iM2112);
                iM2120 = c1235.m2120(iM2112);
                int i3 = iM2112;
                iM2112 = iM21123;
                i = i3;
            } else {
                i = iM2112;
            }
        }
        return c1300.f3783;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m9880(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        return AbstractC5122.m10110(AbstractC5122.m10113(AbstractC5122.m10115(interfaceC5093, C4923.f14255), C4923.f14256));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687 m9881(String str, C4687 c4687) {
        return c4687.m9321(C4691.m9330(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m9882(final C3005 c3005, C8833 c8833, boolean z, InterfaceC1373 interfaceC1373, final int i) {
        final C8833 c88332;
        final boolean z2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) c3005.f9537;
        InterfaceC1395 interfaceC13952 = (InterfaceC1395) c3005.f9538;
        InterfaceC1395 interfaceC13953 = (InterfaceC1395) c3005.f9536;
        InterfaceC1395 interfaceC13954 = (InterfaceC1395) c3005.f9539;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1319431875);
        int i2 = (c1324.m2360(c3005) ? 4 : 2) | i | 400;
        if (c1324.m2343(i2 & 1, (i2 & 1171) != 1170)) {
            c1324.m2341();
            if ((i & 1) == 0 || c1324.m2353()) {
                c88332 = (C8833) c1324.m2383(AbstractC8830.f24916);
                z2 = true;
            } else {
                c1324.m2339();
                c88332 = c8833;
                z2 = z;
            }
            c1324.m2374();
            int i3 = AbstractC8831.f24917[((ColorSchemeMode) ((AbstractC1347) interfaceC13954).getValue()).ordinal()];
            C8825 c8825M10031 = null;
            C1353 c1353 = C1369.f3974;
            switch (i3) {
                case 1:
                    c1324.m2392(-472105063);
                    Boolean bool = (Boolean) ((AbstractC1347) interfaceC13953).getValue();
                    if (bool == null) {
                        c1324.m2392(677508490);
                        zBooleanValue = AbstractC1072.m1989(c1324);
                        c1324.m2377(false);
                    } else {
                        c1324.m2392(677508180);
                        c1324.m2377(false);
                        zBooleanValue = bool.booleanValue();
                    }
                    c8825M10031 = zBooleanValue ? (C8825) ((AbstractC1347) interfaceC13952).getValue() : (C8825) ((AbstractC1347) interfaceC1395).getValue();
                    c1324.m2377(false);
                    break;
                case 2:
                    c1324.m2392(677512192);
                    c1324.m2377(false);
                    c8825M10031 = (C8825) ((AbstractC1347) interfaceC1395).getValue();
                    break;
                case 3:
                    c1324.m2392(677513631);
                    c1324.m2377(false);
                    c8825M10031 = (C8825) ((AbstractC1347) interfaceC13952).getValue();
                    break;
                case 4:
                    c1324.m2392(-471854118);
                    Boolean bool2 = (Boolean) ((AbstractC1347) interfaceC13953).getValue();
                    if (bool2 == null) {
                        c1324.m2392(677516394);
                        zBooleanValue2 = AbstractC1072.m1989(c1324);
                        c1324.m2377(false);
                    } else {
                        c1324.m2392(677516084);
                        c1324.m2377(false);
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    C1599 c1599M6489 = c3005.m6489();
                    if (c1599M6489 == null) {
                        c1324.m2392(-471779688);
                        c1324.m2377(false);
                    } else {
                        c1324.m2392(-471779687);
                        long j = c1599M6489.f4700;
                        boolean zM2360 = c1324.m2360(c3005.m6489()) | c1324.m2379(zBooleanValue2) | c1324.m2362(c3005.m6490().ordinal()) | c1324.m2362(c3005.m6493().ordinal());
                        Object objM2345 = c1324.m2345();
                        if (zM2360 || objM2345 == c1353) {
                            objM2345 = AbstractC8826.m14487(j, c3005.m6490(), c3005.m6493(), zBooleanValue2);
                            c1324.m2386(objM2345);
                        }
                        c8825M10031 = (C8825) objM2345;
                        c1324.m2377(false);
                    }
                    if (c8825M10031 == null) {
                        c1324.m2392(677523703);
                        C8825 c8825M100312 = AbstractC5062.m10031(zBooleanValue2, c1324);
                        c1324.m2377(false);
                        c8825M10031 = c8825M100312;
                    } else {
                        c1324.m2392(677517689);
                        c1324.m2377(false);
                    }
                    c1324.m2377(false);
                    break;
                case 5:
                    c1324.m2392(-471498579);
                    C1599 c1599M64892 = c3005.m6489();
                    if (c1599M64892 == null) {
                        c1324.m2392(-471490179);
                        c1324.m2377(false);
                    } else {
                        c1324.m2392(-471490178);
                        long j2 = c1599M64892.f4700;
                        boolean zM23602 = c1324.m2360(c3005.m6489()) | c1324.m2362(c3005.m6490().ordinal()) | c1324.m2362(c3005.m6493().ordinal());
                        Object objM23452 = c1324.m2345();
                        if (zM23602 || objM23452 == c1353) {
                            objM23452 = AbstractC8826.m14487(j2, c3005.m6490(), c3005.m6493(), false);
                            c1324.m2386(objM23452);
                        }
                        c8825M10031 = (C8825) objM23452;
                        c1324.m2377(false);
                    }
                    if (c8825M10031 == null) {
                        c1324.m2392(677532888);
                        C8825 c8825M100313 = AbstractC5062.m10031(false, c1324);
                        c1324.m2377(false);
                        c8825M10031 = c8825M100313;
                    } else {
                        c1324.m2392(677527029);
                        c1324.m2377(false);
                    }
                    c1324.m2377(false);
                    break;
                case 6:
                    c1324.m2392(-471213937);
                    C1599 c1599M64893 = c3005.m6489();
                    if (c1599M64893 == null) {
                        c1324.m2392(-471205506);
                        c1324.m2377(false);
                    } else {
                        c1324.m2392(-471205505);
                        long j3 = c1599M64893.f4700;
                        boolean zM23603 = c1324.m2360(c3005.m6489()) | c1324.m2362(c3005.m6490().ordinal()) | c1324.m2362(c3005.m6493().ordinal());
                        Object objM23453 = c1324.m2345();
                        if (zM23603 || objM23453 == c1353) {
                            objM23453 = AbstractC8826.m14487(j3, c3005.m6490(), c3005.m6493(), true);
                            c1324.m2386(objM23453);
                        }
                        c8825M10031 = (C8825) objM23453;
                        c1324.m2377(false);
                    }
                    if (c8825M10031 == null) {
                        c1324.m2392(677542039);
                        c8825M10031 = AbstractC5062.m10031(true, c1324);
                    } else {
                        c1324.m2392(677536211);
                    }
                    c1324.m2377(false);
                    c1324.m2377(false);
                    break;
                default:
                    c1324.m2392(677506653);
                    c1324.m2377(false);
                    C4211.m8611();
                    return;
            }
            Object objM23454 = c1324.m2345();
            if (objM23454 == c1353) {
                C8825 c8825 = new C8825(((C1599) ((AbstractC1347) c8825M10031.f24862).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24861).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24860).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24859).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24858).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24857).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24876).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24875).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24879).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24880).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24877).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24878).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24870).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24869).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24873).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24874).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24871).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24872).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24864).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24863).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24867).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24868).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24865).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24866).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24850).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24849).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24848).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24847).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24846).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24845).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24856).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24855).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24854).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24853).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24852).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24851).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24842).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24841).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24844).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24843).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24839).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24840).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24836).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24835).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24838).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24837).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24833).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24834).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24882).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24881).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24884).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24885).getValue()).f4700, ((C1599) ((AbstractC1347) c8825M10031.f24883).getValue()).f4700);
                c1324.m2386(c8825);
                objM23454 = c8825;
            }
            C8825 c88252 = (C8825) objM23454;
            C1334 c1334 = AbstractC8824.f24832;
            c88252.getClass();
            InterfaceC1395 interfaceC13955 = c88252.f24855;
            c8825M10031.getClass();
            ((AbstractC1347) c88252.f24862).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24862).getValue()).f4700));
            ((AbstractC1347) c88252.f24861).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24861).getValue()).f4700));
            ((AbstractC1347) c88252.f24860).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24860).getValue()).f4700));
            ((AbstractC1347) c88252.f24859).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24859).getValue()).f4700));
            ((AbstractC1347) c88252.f24858).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24858).getValue()).f4700));
            ((AbstractC1347) c88252.f24857).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24857).getValue()).f4700));
            ((AbstractC1347) c88252.f24876).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24876).getValue()).f4700));
            ((AbstractC1347) c88252.f24875).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24875).getValue()).f4700));
            ((AbstractC1347) c88252.f24879).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24879).getValue()).f4700));
            ((AbstractC1347) c88252.f24880).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24880).getValue()).f4700));
            ((AbstractC1347) c88252.f24877).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24877).getValue()).f4700));
            ((AbstractC1347) c88252.f24878).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24878).getValue()).f4700));
            ((AbstractC1347) c88252.f24870).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24870).getValue()).f4700));
            ((AbstractC1347) c88252.f24869).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24869).getValue()).f4700));
            ((AbstractC1347) c88252.f24873).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24873).getValue()).f4700));
            ((AbstractC1347) c88252.f24874).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24874).getValue()).f4700));
            ((AbstractC1347) c88252.f24871).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24871).getValue()).f4700));
            ((AbstractC1347) c88252.f24872).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24872).getValue()).f4700));
            ((AbstractC1347) c88252.f24864).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24864).getValue()).f4700));
            ((AbstractC1347) c88252.f24863).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24863).getValue()).f4700));
            ((AbstractC1347) c88252.f24867).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24867).getValue()).f4700));
            ((AbstractC1347) c88252.f24868).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24868).getValue()).f4700));
            ((AbstractC1347) c88252.f24865).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24865).getValue()).f4700));
            ((AbstractC1347) c88252.f24866).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24866).getValue()).f4700));
            ((AbstractC1347) c88252.f24850).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24850).getValue()).f4700));
            ((AbstractC1347) c88252.f24849).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24849).getValue()).f4700));
            ((AbstractC1347) c88252.f24848).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24848).getValue()).f4700));
            ((AbstractC1347) c88252.f24847).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24847).getValue()).f4700));
            ((AbstractC1347) c88252.f24846).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24846).getValue()).f4700));
            ((AbstractC1347) c88252.f24845).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24845).getValue()).f4700));
            ((AbstractC1347) c88252.f24856).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24856).getValue()).f4700));
            ((AbstractC1347) interfaceC13955).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24855).getValue()).f4700));
            ((AbstractC1347) c88252.f24854).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24854).getValue()).f4700));
            ((AbstractC1347) c88252.f24853).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24853).getValue()).f4700));
            ((AbstractC1347) c88252.f24852).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24852).getValue()).f4700));
            ((AbstractC1347) c88252.f24851).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24851).getValue()).f4700));
            ((AbstractC1347) c88252.f24842).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24842).getValue()).f4700));
            ((AbstractC1347) c88252.f24841).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24841).getValue()).f4700));
            ((AbstractC1347) c88252.f24844).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24844).getValue()).f4700));
            ((AbstractC1347) c88252.f24843).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24843).getValue()).f4700));
            ((AbstractC1347) c88252.f24839).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24839).getValue()).f4700));
            ((AbstractC1347) c88252.f24840).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24840).getValue()).f4700));
            ((AbstractC1347) c88252.f24836).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24836).getValue()).f4700));
            ((AbstractC1347) c88252.f24835).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24835).getValue()).f4700));
            ((AbstractC1347) c88252.f24838).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24838).getValue()).f4700));
            ((AbstractC1347) c88252.f24837).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24837).getValue()).f4700));
            ((AbstractC1347) c88252.f24833).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24833).getValue()).f4700));
            ((AbstractC1347) c88252.f24834).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24834).getValue()).f4700));
            ((AbstractC1347) c88252.f24882).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24882).getValue()).f4700));
            ((AbstractC1347) c88252.f24881).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24881).getValue()).f4700));
            ((AbstractC1347) c88252.f24884).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24884).getValue()).f4700));
            ((AbstractC1347) c88252.f24885).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24885).getValue()).f4700));
            ((AbstractC1347) c88252.f24883).setValue(new C1599(((C1599) ((AbstractC1347) c8825M10031.f24883).getValue()).f4700));
            Object objM23455 = c1324.m2345();
            if (objM23455 == c1353) {
                C2031 c2031 = (C2031) ((AbstractC1347) c88332.f24926).getValue();
                C2031 c20312 = (C2031) ((AbstractC1347) c88332.f24925).getValue();
                C2031 c20313 = (C2031) ((AbstractC1347) c88332.f24924).getValue();
                C2031 c20314 = (C2031) ((AbstractC1347) c88332.f24923).getValue();
                C2031 c20315 = (C2031) ((AbstractC1347) c88332.f24922).getValue();
                C2031 c20316 = (C2031) ((AbstractC1347) c88332.f24921).getValue();
                C2031 c20317 = (C2031) ((AbstractC1347) c88332.f24930).getValue();
                C2031 c20318 = (C2031) ((AbstractC1347) c88332.f24929).getValue();
                C2031 c20319 = (C2031) ((AbstractC1347) c88332.f24933).getValue();
                C2031 c203110 = (C2031) ((AbstractC1347) c88332.f24934).getValue();
                C2031 c203111 = (C2031) ((AbstractC1347) c88332.f24931).getValue();
                C2031 c203112 = (C2031) ((AbstractC1347) c88332.f24932).getValue();
                C2031 c203113 = (C2031) ((AbstractC1347) c88332.f24928).getValue();
                C2031 c203114 = (C2031) ((AbstractC1347) c88332.f24927).getValue();
                c2031.getClass();
                c20312.getClass();
                c20313.getClass();
                c20314.getClass();
                c20315.getClass();
                c20316.getClass();
                c20317.getClass();
                c20318.getClass();
                c20319.getClass();
                c203110.getClass();
                c203111.getClass();
                c203112.getClass();
                c203113.getClass();
                c203114.getClass();
                C8833 c88333 = new C8833(c2031, c20312, c20313, c20314, c20315, c20316, c20317, c20318, c20319, c203110, c203111, c203112, c203113, c203114);
                c1324.m2386(c88333);
                objM23455 = c88333;
            }
            C8833 c88334 = (C8833) objM23455;
            C1334 c13342 = AbstractC8830.f24916;
            c88334.getClass();
            c88332.getClass();
            C2031 c203115 = (C2031) ((AbstractC1347) c88332.f24926).getValue();
            c203115.getClass();
            ((AbstractC1347) c88334.f24926).setValue(c203115);
            C2031 c203116 = (C2031) ((AbstractC1347) c88332.f24925).getValue();
            c203116.getClass();
            ((AbstractC1347) c88334.f24925).setValue(c203116);
            C2031 c203117 = (C2031) ((AbstractC1347) c88332.f24924).getValue();
            c203117.getClass();
            ((AbstractC1347) c88334.f24924).setValue(c203117);
            C2031 c203118 = (C2031) ((AbstractC1347) c88332.f24923).getValue();
            c203118.getClass();
            ((AbstractC1347) c88334.f24923).setValue(c203118);
            C2031 c203119 = (C2031) ((AbstractC1347) c88332.f24922).getValue();
            c203119.getClass();
            ((AbstractC1347) c88334.f24922).setValue(c203119);
            C2031 c203120 = (C2031) ((AbstractC1347) c88332.f24921).getValue();
            c203120.getClass();
            ((AbstractC1347) c88334.f24921).setValue(c203120);
            C2031 c203121 = (C2031) ((AbstractC1347) c88332.f24930).getValue();
            c203121.getClass();
            ((AbstractC1347) c88334.f24930).setValue(c203121);
            C2031 c203122 = (C2031) ((AbstractC1347) c88332.f24929).getValue();
            c203122.getClass();
            ((AbstractC1347) c88334.f24929).setValue(c203122);
            C2031 c203123 = (C2031) ((AbstractC1347) c88332.f24933).getValue();
            c203123.getClass();
            ((AbstractC1347) c88334.f24933).setValue(c203123);
            C2031 c203124 = (C2031) ((AbstractC1347) c88332.f24934).getValue();
            c203124.getClass();
            ((AbstractC1347) c88334.f24934).setValue(c203124);
            C2031 c203125 = (C2031) ((AbstractC1347) c88332.f24931).getValue();
            c203125.getClass();
            ((AbstractC1347) c88334.f24931).setValue(c203125);
            C2031 c203126 = (C2031) ((AbstractC1347) c88332.f24932).getValue();
            c203126.getClass();
            ((AbstractC1347) c88334.f24932).setValue(c203126);
            C2031 c203127 = (C2031) ((AbstractC1347) c88332.f24928).getValue();
            c203127.getClass();
            ((AbstractC1347) c88334.f24928).setValue(c203127);
            C2031 c203128 = (C2031) ((AbstractC1347) c88332.f24927).getValue();
            c203128.getClass();
            ((AbstractC1347) c88334.f24927).setValue(c203128);
            boolean zM2361 = c1324.m2361(((C1599) ((AbstractC1347) interfaceC13955).getValue()).f4700);
            Object objM23456 = c1324.m2345();
            if (zM2361 || objM23456 == c1353) {
                objM23456 = new C6060(((C1599) ((AbstractC1347) interfaceC13955).getValue()).f4700);
                c1324.m2386(objM23456);
            }
            AbstractC1367.m2486(new C0194[]{AbstractC8824.f24832.mo2428(c88252), AbstractC8830.f24916.mo2428(c88334), AbstractC1092.f3221.mo2428((C6060) objM23456), AbstractC8826.f24886.mo2428((ColorSchemeMode) ((AbstractC1347) interfaceC13954).getValue()), AbstractC1081.f3211.mo2428(C6079.f16627), AbstractC8828.f24888.mo2428(Boolean.valueOf(z2))}, AbstractC1254.m2189(797156861, new C8770(8), c1324), c1324, 56);
        } else {
            c1324.m2339();
            c88332 = c8833;
            z2 = z;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(c88332, z2, i) { // from class: 飘花落叶言苏哲兰子世楪.飘花落叶言子楪世兰哲苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C8833 f24825;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ boolean f24826;

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(3073);
                    AbstractC4922.m9882(this.f24827, this.f24825, this.f24826, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8191 m9883(C4058 c4058) {
        C8191 c8191;
        c4058.getClass();
        Iterator it = AbstractC4344.m8797(AbstractC4054.m8457(c4058).m8588().keySet()).iterator();
        do {
            c8191 = null;
            if (!it.hasNext()) {
                break;
            }
            C4209 c4209 = (C4209) it.next();
            C4204 c4204M8457 = AbstractC4054.m8457(c4058);
            c4209.getClass();
            Object obj = c4204M8457.m8588().get(c4209);
            if (obj instanceof C8191) {
                c8191 = (C8191) obj;
            }
        } while (c8191 == null);
        return c8191 == null ? C8191.f22565 : c8191;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Drawable m9884(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f14253) {
                return m9877(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f14253 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC7646.f20756;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static ArrayList m9885(String str) {
        String strM10034 = AbstractC5062.m10034(str);
        C7162 c7162M6823 = AbstractC3065.m6823(new C7180(24));
        if (C9095.f25488.length() == 0) {
            C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return null;
        }
        SharedPreferencesC8176 sharedPreferencesC8176M13673 = new C8183(C9095.f25488, "DexKitCache").m13673();
        if (!sharedPreferencesC8176M13673.contains(strM10034)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferencesC8176M13673.getString(strM10034, "");
        for (String str2 : (string == null || string.length() == 0) ? new ArrayList() : AbstractC4344.m8786((Collection) c7162M6823.m12426(string, new C7103(C7135.f19089, 0)))) {
            C7162 c7162 = AbstractC9109.f25536;
            str2.getClass();
            C7162 c71622 = AbstractC9109.f25536;
            c71622.getClass();
            Class clsM14669 = AbstractC9090.m14669(((C9106) c71622.m12426(str2, C9106.Companion.serializer())).f25534);
            clsM14669.getClass();
            arrayList.add(clsM14669);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final float m9886(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC7949.f21999;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC7837.f21378[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final float m9887(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC7949.f21999;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC7837.f21378[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m9888(ByteBuffer byteBuffer) throws UTFDataFormatException {
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining()) {
            char c = (char) (byteBuffer.get() & DefaultClassResolver.NAME);
            if (c == 0) {
                return sb.toString();
            }
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & 63)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Integer m9889(C1234 c1234, AbstractC1372 abstractC1372, int i, int i2) {
        Integer numM9889;
        int[] iArr = c1234.f3554;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (c1234.m2088(i) && c1234.m2087(i) == 206 && AbstractC4395.m8907(c1234.m2082(iArr, i), AbstractC1374.f3975)) {
                Object objM2083 = c1234.m2083(i, 0);
                C1320 c1320 = objM2083 instanceof C1320 ? (C1320) objM2083 : null;
                InterfaceC1339 interfaceC1339 = c1320 != null ? c1320.f3824 : null;
                C1315 c1315 = interfaceC1339 instanceof C1315 ? (C1315) interfaceC1339 : null;
                if (c1315 != null && c1315.f3818 == abstractC1372) {
                    return Integer.valueOf(i);
                }
            }
            if (c1234.m2070(i) && (numM9889 = m9889(c1234, abstractC1372, i + 1, i3)) != null) {
                return Integer.valueOf(numM9889.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m9890(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService(AbstractC8405.m13972(46))).setPrimaryClip(ClipData.newPlainText(AbstractC8405.m13973("喵喵呜呜呜呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵喵呜"), str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C4778 m9891(C4687 c4687, C4845 c4845, InterfaceC4486 interfaceC4486, InputStream inputStream) throws IOException {
        ProtoBuf$PackageFragment from;
        c4687.getClass();
        interfaceC4486.getClass();
        try {
            C6946 c6946 = C6946.f18538;
            C6946 c6946M12043 = AbstractC6561.m12043(inputStream);
            C6946 c69462 = C6946.f18538;
            int i = c6946M12043.f18409;
            c69462.getClass();
            int i2 = c69462.f18409;
            int i3 = c6946M12043.f18410;
            int i4 = c69462.f18410;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    C4726 c4726 = new C4726();
                    AbstractC6945.m12237(c4726);
                    from = ProtoBuf$PackageFragment.parseFrom(inputStream, c4726);
                }
                from = null;
            } else if (i3 != i4 || i > i2) {
                from = null;
            } else {
                C4726 c47262 = new C4726();
                AbstractC6945.m12237(c47262);
                from = ProtoBuf$PackageFragment.parseFrom(inputStream, c47262);
            }
            Pair pair = new Pair(from, c6946M12043);
            inputStream.close();
            ProtoBuf$PackageFragment protoBuf$PackageFragment = (ProtoBuf$PackageFragment) pair.component1();
            C6946 c69463 = (C6946) pair.component2();
            if (protoBuf$PackageFragment != null) {
                return new C4778(c4687, c4845, interfaceC4486, protoBuf$PackageFragment, c69463);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c69462 + ", actual " + c69463 + ". Please update Kotlin");
        } finally {
        }
    }

    public String toString() {
        switch (this.f14254) {
            case 11:
                return mo9903();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public abstract void mo9892(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public abstract boolean mo9893(View view, float f);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract AbstractC3933 mo9894();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo9895(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract boolean mo9896(float f, float f2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract boolean mo9897(View view);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract boolean mo9898(float f);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract int[] mo9899();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public abstract AbstractC5062 mo9900();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public abstract AbstractC3065 mo9901();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract AbstractC3066 mo9902();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract String mo9903();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public abstract int mo9904();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract int mo9905(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract int mo9906();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public abstract int mo9907();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract int mo9908(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo9909();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public abstract int mo9910();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract float mo9911(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo9912(ViewGroup.MarginLayoutParams marginLayoutParams);
}
