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
import androidx.appcompat.widget.C1041;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.compose.foundation.AbstractC1910;
import androidx.compose.foundation.AbstractC1919;
import androidx.compose.foundation.AbstractC1930;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2207;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2150;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2174;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.tooling.C2135;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bsh.C3466;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import com.bumptech.glide.load.engine.C3837;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.application.AbstractC4886;
import io.ktor.server.application.C4890;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import io.ktor.util.C5043;
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
import kotlin.C6008;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.sequences.AbstractC5954;
import kotlinx.serialization.SerializationException;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p090.AbstractC7774;
import p090.C7775;
import p103.AbstractC7953;
import p103.AbstractC7973;
import p103.C7899;
import p103.C7906;
import p103.C7932;
import p103.C7960;
import p103.C7964;
import p103.C7969;
import p104.C7991;
import p105.C8009;
import p105.InterfaceC8013;
import p120.InterfaceC8109;
import p142.C8252;
import p177.AbstractC8475;
import p208.C8637;
import p212.AbstractC8666;
import p228.AbstractC8778;
import p267.C9012;
import p267.SharedPreferencesC9005;
import p270.C9020;
import p345.C9599;
import p360.AbstractC9653;
import p360.AbstractC9655;
import p360.AbstractC9657;
import p360.AbstractC9659;
import p360.AbstractC9660;
import p360.C9654;
import p360.C9662;
import p405.AbstractC9919;
import p407.C9924;
import p409.AbstractC9938;
import p409.C9932;
import p409.C9935;
import top.yukonga.miuix.kmp.theme.ColorSchemeMode;
import top.yukonga.miuix.kmp.utils.C6889;
import top.yukonga.miuix.kmp.utils.C6908;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile boolean f14598 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f14599;

    public /* synthetic */ AbstractC5754(int i) {
        this.f14599 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.tooling.飘花落叶言子楪世苏兰哲, androidx.compose.runtime.tooling.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static final ArrayList m10424(C2069 c2069, int i, Integer num) {
        ?? c2135 = new C2135(c2069);
        int iM2639 = c2069.m2639(i);
        C2065 c2065M2633 = c2069.m2633(i);
        while (i >= 0) {
            c2135.m2862(c2069.m2647(i), c2069.m2645(i) ? c2069.m2642(c2069.f3899, i) : C2204.f4319, c2069.f3900.m2626(i), num);
            if (iM2639 >= 0) {
                C2065 c2065 = c2065M2633;
                c2065M2633 = c2069.m2633(iM2639);
                i = iM2639;
                iM2639 = c2069.m2639(iM2639);
                num = c2065;
            } else {
                i = iM2639;
                num = c2065M2633;
            }
        }
        return c2135.f4128;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final void m10425(C8252 c8252, int i, Object obj) {
        c8252.f20463[(c8252.f20465 - c8252.f20468[c8252.f20466 - 1].f18748) + i] = obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final ArrayList m10426(C2080 c2080, List list, boolean z) {
        c2080.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m10428(c2080, (InterfaceC5919) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC5919 interfaceC5919 = (InterfaceC5919) it2.next();
            interfaceC5919.getClass();
            InterfaceC8013 interfaceC8013M12437 = AbstractC7173.m12437(c2080, interfaceC5919, false);
            if (interfaceC8013M12437 == null) {
                return null;
            }
            arrayList2.add(interfaceC8013M12437);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static final void m10427(C8252 c8252, int i, Object obj, int i2, Object obj2) {
        int i3 = c8252.f20465 - c8252.f20468[c8252.f20466 - 1].f18748;
        Object[] objArr = c8252.f20463;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final InterfaceC8013 m10428(C2080 c2080, InterfaceC5919 interfaceC5919) {
        c2080.getClass();
        interfaceC5919.getClass();
        InterfaceC8013 interfaceC8013M12437 = AbstractC7173.m12437(c2080, interfaceC5919, true);
        if (interfaceC8013M12437 != null) {
            return interfaceC8013M12437;
        }
        throw new SerializationException(AbstractC7973.m12976(AbstractC7973.m12977(interfaceC5919)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final InterfaceC8013 m10429(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        InterfaceC8013 interfaceC8013M12972 = AbstractC7973.m12972(AbstractC3889.m7316(interfaceC5925), (InterfaceC8013[]) Arrays.copyOf(new InterfaceC8013[0], 0));
        return interfaceC8013M12972 == null ? (InterfaceC8013) AbstractC7953.f19406.get(interfaceC5925) : interfaceC8013M12972;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static void m10430(String str, ArrayList arrayList) {
        String strM10593 = AbstractC5894.m10593(str);
        C7991 c7991M7383 = AbstractC3897.m7383(new C8009(24));
        if (C9924.f25833.length() == 0) {
            C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = new C9012(C9924.f25833, "DexKitCache").m14232();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            C7991 c7991 = AbstractC9938.f25881;
            cls.getClass();
            C7991 c79912 = AbstractC9938.f25881;
            C9935 c9935 = new C9935(cls.getName());
            c79912.getClass();
            arrayList2.add(c79912.m12983(C9935.Companion.serializer(), c9935));
        }
        sharedPreferencesC9005M14232.putString(strM10593, c7991M7383.m12983(new C7932(C7964.f19434, 0), arrayList2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final InterfaceC8013 m10431(C2080 c2080, Type type) {
        c2080.getClass();
        InterfaceC8013 interfaceC8013M12304 = AbstractC7082.m12304(c2080, type, true);
        if (interfaceC8013M12304 != null) {
            return interfaceC8013M12304;
        }
        Class clsM12303 = AbstractC7082.m12303(type);
        clsM12303.getClass();
        throw new SerializationException(AbstractC7973.m12976(AbstractC5228.f13320.mo9476(clsM12303)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static void m10432(String str, ArrayList arrayList) {
        String strM10593 = AbstractC5894.m10593(str);
        C7991 c7991M7383 = AbstractC3897.m7383(new C8009(24));
        if (C9924.f25833.length() == 0) {
            C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return;
        }
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = new C9012(C9924.f25833, "DexKitCache").m14232();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                sharedPreferencesC9005M14232.putString(strM10593, c7991M7383.m12983(new C7932(C7964.f19434, 0), arrayList2));
                return;
            }
            Method method = (Method) it.next();
            C7991 c7991 = AbstractC9938.f25881;
            method.getClass();
            method.setAccessible(true);
            C7991 c79912 = AbstractC9938.f25881;
            String name = method.getDeclaringClass().getName();
            String name2 = method.getName();
            name2.getClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            ArrayList arrayList3 = new ArrayList(parameterTypes.length);
            for (Class<?> cls : parameterTypes) {
                arrayList3.add(cls.getName());
            }
            C9932 c9932 = new C9932(name, name2, method.getReturnType().getName(), arrayList3);
            c79912.getClass();
            arrayList2.add(c79912.m12983(C9932.Companion.serializer(), c9932));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static String m10433(InterfaceC8109 interfaceC8109, C5397 c5397) {
        if (interfaceC8109.mo13056(c5397)) {
            return null;
        }
        return interfaceC8109.mo13057();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final boolean m10434(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final InterfaceC8013 m10435(InterfaceC5925 interfaceC5925, ArrayList arrayList, InterfaceC7372 interfaceC7372) {
        InterfaceC8013 c7932;
        InterfaceC8013 c7969;
        interfaceC5925.getClass();
        C5229 c5229 = AbstractC5228.f13320;
        if (interfaceC5925.equals(c5229.mo9476(Collection.class)) || interfaceC5925.equals(c5229.mo9476(List.class)) || interfaceC5925.equals(c5229.mo9476(List.class)) || interfaceC5925.equals(c5229.mo9476(ArrayList.class))) {
            c7932 = new C7932((InterfaceC8013) arrayList.get(0), 0);
        } else if (interfaceC5925.equals(c5229.mo9476(HashSet.class))) {
            c7932 = new C7932((InterfaceC8013) arrayList.get(0), 1);
        } else if (interfaceC5925.equals(c5229.mo9476(Set.class)) || interfaceC5925.equals(c5229.mo9476(Set.class)) || interfaceC5925.equals(c5229.mo9476(LinkedHashSet.class))) {
            c7932 = new C7932((InterfaceC8013) arrayList.get(0), 2);
        } else if (interfaceC5925.equals(c5229.mo9476(HashMap.class))) {
            c7932 = new C7906((InterfaceC8013) arrayList.get(0), (InterfaceC8013) arrayList.get(1), 0);
        } else if (interfaceC5925.equals(c5229.mo9476(Map.class)) || interfaceC5925.equals(c5229.mo9476(Map.class)) || interfaceC5925.equals(c5229.mo9476(LinkedHashMap.class))) {
            c7932 = new C7906((InterfaceC8013) arrayList.get(0), (InterfaceC8013) arrayList.get(1), 1);
        } else {
            if (interfaceC5925.equals(c5229.mo9476(Map.Entry.class))) {
                InterfaceC8013 interfaceC8013 = (InterfaceC8013) arrayList.get(0);
                InterfaceC8013 interfaceC80132 = (InterfaceC8013) arrayList.get(1);
                interfaceC8013.getClass();
                interfaceC80132.getClass();
                c7969 = new C7899(interfaceC8013, interfaceC80132, 0);
            } else if (interfaceC5925.equals(c5229.mo9476(Pair.class))) {
                InterfaceC8013 interfaceC80133 = (InterfaceC8013) arrayList.get(0);
                InterfaceC8013 interfaceC80134 = (InterfaceC8013) arrayList.get(1);
                interfaceC80133.getClass();
                interfaceC80134.getClass();
                c7969 = new C7899(interfaceC80133, interfaceC80134, 1);
            } else if (interfaceC5925.equals(c5229.mo9476(Triple.class))) {
                InterfaceC8013 interfaceC80135 = (InterfaceC8013) arrayList.get(0);
                InterfaceC8013 interfaceC80136 = (InterfaceC8013) arrayList.get(1);
                InterfaceC8013 interfaceC80137 = (InterfaceC8013) arrayList.get(2);
                interfaceC80135.getClass();
                interfaceC80136.getClass();
                interfaceC80137.getClass();
                c7932 = new C7960(interfaceC80135, interfaceC80136, interfaceC80137);
            } else if (AbstractC3889.m7316(interfaceC5925).isArray()) {
                Object objInvoke = interfaceC7372.invoke();
                objInvoke.getClass();
                InterfaceC8013 interfaceC80138 = (InterfaceC8013) arrayList.get(0);
                interfaceC80138.getClass();
                c7969 = new C7969((InterfaceC5925) objInvoke, interfaceC80138);
            } else {
                c7932 = null;
            }
            c7932 = c7969;
        }
        if (c7932 != null) {
            return c7932;
        }
        InterfaceC8013[] interfaceC8013Arr = (InterfaceC8013[]) arrayList.toArray(new InterfaceC8013[0]);
        InterfaceC8013[] interfaceC8013Arr2 = (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr, interfaceC8013Arr.length);
        return AbstractC7973.m12972(AbstractC3889.m7316(interfaceC5925), (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr2, interfaceC8013Arr2.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Drawable m10436(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C8637 c8637 = new C8637(context);
            c8637.f21633 = theme;
            c8637.m13730(theme.getResources().getConfiguration());
            context = c8637;
        }
        return AbstractC4765.m8871(context, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Bundle m10437(Pair... pairArr) {
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
    public static final List m10438(C2070 c2070, Integer num, int i, Integer num2) {
        int iM2672;
        int iM2680;
        C1091 c1091;
        if (c2070.f3917 || c2070.m2690() == 0) {
            return EmptyList.INSTANCE;
        }
        ?? c2135 = new C2135(c2070);
        if (num2 != null) {
            iM2672 = num2.intValue();
        } else {
            iM2672 = c2070.f3920;
            if (iM2672 < 0) {
                iM2672 = c2070.m2672(c2070.f3913, i);
            }
        }
        if (num == 0) {
            int iM2660 = c2070.f3931 - c2070.m2660(c2070.f3913, c2070.m2688(i));
            C1093 c1093 = c2070.f3916;
            num = Integer.valueOf(iM2660 + ((c1093 == null || (c1091 = (C1091) c1093.m1393(i)) == null) ? 0 : c1091.f1349));
        }
        int iM2688 = c2070.m2688(i) * 5;
        int[] iArr = c2070.f3913;
        if (iM2688 < iArr.length) {
            iM2680 = c2070.m2680(i);
        } else {
            int iM26722 = iM2672 >= 0 ? c2070.m2672(iArr, iM2672) : iM2672;
            iM2680 = c2070.m2680(iM2672);
            int i2 = iM2672;
            iM2672 = iM26722;
            i = i2;
        }
        while (i >= 0) {
            c2135.m2862(iM2680, (c2070.f3913[(c2070.m2688(i) * 5) + 1] & 536870912) != 0 ? c2070.m2679(i) : C2204.f4319, c2070.m2656(i), num);
            num = c2070.m2677(i);
            if (iM2672 >= 0) {
                int iM26723 = c2070.m2672(c2070.f3913, iM2672);
                iM2680 = c2070.m2680(iM2672);
                int i3 = iM2672;
                iM2672 = iM26723;
                i = i3;
            } else {
                i = iM2672;
            }
        }
        return c2135.f4128;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m10439(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        return AbstractC5954.m10669(AbstractC5954.m10672(AbstractC5954.m10674(interfaceC5925, C5755.f14600), C5755.f14601));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5519 m10440(String str, C5519 c5519) {
        return c5519.m9880(C5523.m9889(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m10441(final C3837 c3837, C9662 c9662, boolean z, InterfaceC2208 interfaceC2208, final int i) {
        final C9662 c96622;
        final boolean z2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        InterfaceC2230 interfaceC2230 = (InterfaceC2230) c3837.f9882;
        InterfaceC2230 interfaceC22302 = (InterfaceC2230) c3837.f9883;
        InterfaceC2230 interfaceC22303 = (InterfaceC2230) c3837.f9881;
        InterfaceC2230 interfaceC22304 = (InterfaceC2230) c3837.f9884;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1319431875);
        int i2 = (c2159.m2920(c3837) ? 4 : 2) | i | 400;
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            c2159.m2901();
            if ((i & 1) == 0 || c2159.m2913()) {
                c96622 = (C9662) c2159.m2943(AbstractC9659.f25261);
                z2 = true;
            } else {
                c2159.m2899();
                c96622 = c9662;
                z2 = z;
            }
            c2159.m2934();
            int i3 = AbstractC9660.f25262[((ColorSchemeMode) ((AbstractC2182) interfaceC22304).getValue()).ordinal()];
            C9654 c9654M10590 = null;
            C2188 c2188 = C2204.f4319;
            switch (i3) {
                case 1:
                    c2159.m2952(-472105063);
                    Boolean bool = (Boolean) ((AbstractC2182) interfaceC22303).getValue();
                    if (bool == null) {
                        c2159.m2952(677508490);
                        zBooleanValue = AbstractC1910.m2549(c2159);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(677508180);
                        c2159.m2937(false);
                        zBooleanValue = bool.booleanValue();
                    }
                    c9654M10590 = zBooleanValue ? (C9654) ((AbstractC2182) interfaceC22302).getValue() : (C9654) ((AbstractC2182) interfaceC2230).getValue();
                    c2159.m2937(false);
                    break;
                case 2:
                    c2159.m2952(677512192);
                    c2159.m2937(false);
                    c9654M10590 = (C9654) ((AbstractC2182) interfaceC2230).getValue();
                    break;
                case 3:
                    c2159.m2952(677513631);
                    c2159.m2937(false);
                    c9654M10590 = (C9654) ((AbstractC2182) interfaceC22302).getValue();
                    break;
                case 4:
                    c2159.m2952(-471854118);
                    Boolean bool2 = (Boolean) ((AbstractC2182) interfaceC22303).getValue();
                    if (bool2 == null) {
                        c2159.m2952(677516394);
                        zBooleanValue2 = AbstractC1910.m2549(c2159);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(677516084);
                        c2159.m2937(false);
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    C2434 c2434M7049 = c3837.m7049();
                    if (c2434M7049 == null) {
                        c2159.m2952(-471779688);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(-471779687);
                        long j = c2434M7049.f5045;
                        boolean zM2920 = c2159.m2920(c3837.m7049()) | c2159.m2939(zBooleanValue2) | c2159.m2922(c3837.m7050().ordinal()) | c2159.m2922(c3837.m7053().ordinal());
                        Object objM2905 = c2159.m2905();
                        if (zM2920 || objM2905 == c2188) {
                            objM2905 = AbstractC9655.m15046(j, c3837.m7050(), c3837.m7053(), zBooleanValue2);
                            c2159.m2946(objM2905);
                        }
                        c9654M10590 = (C9654) objM2905;
                        c2159.m2937(false);
                    }
                    if (c9654M10590 == null) {
                        c2159.m2952(677523703);
                        C9654 c9654M105902 = AbstractC5894.m10590(zBooleanValue2, c2159);
                        c2159.m2937(false);
                        c9654M10590 = c9654M105902;
                    } else {
                        c2159.m2952(677517689);
                        c2159.m2937(false);
                    }
                    c2159.m2937(false);
                    break;
                case 5:
                    c2159.m2952(-471498579);
                    C2434 c2434M70492 = c3837.m7049();
                    if (c2434M70492 == null) {
                        c2159.m2952(-471490179);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(-471490178);
                        long j2 = c2434M70492.f5045;
                        boolean zM29202 = c2159.m2920(c3837.m7049()) | c2159.m2922(c3837.m7050().ordinal()) | c2159.m2922(c3837.m7053().ordinal());
                        Object objM29052 = c2159.m2905();
                        if (zM29202 || objM29052 == c2188) {
                            objM29052 = AbstractC9655.m15046(j2, c3837.m7050(), c3837.m7053(), false);
                            c2159.m2946(objM29052);
                        }
                        c9654M10590 = (C9654) objM29052;
                        c2159.m2937(false);
                    }
                    if (c9654M10590 == null) {
                        c2159.m2952(677532888);
                        C9654 c9654M105903 = AbstractC5894.m10590(false, c2159);
                        c2159.m2937(false);
                        c9654M10590 = c9654M105903;
                    } else {
                        c2159.m2952(677527029);
                        c2159.m2937(false);
                    }
                    c2159.m2937(false);
                    break;
                case 6:
                    c2159.m2952(-471213937);
                    C2434 c2434M70493 = c3837.m7049();
                    if (c2434M70493 == null) {
                        c2159.m2952(-471205506);
                        c2159.m2937(false);
                    } else {
                        c2159.m2952(-471205505);
                        long j3 = c2434M70493.f5045;
                        boolean zM29203 = c2159.m2920(c3837.m7049()) | c2159.m2922(c3837.m7050().ordinal()) | c2159.m2922(c3837.m7053().ordinal());
                        Object objM29053 = c2159.m2905();
                        if (zM29203 || objM29053 == c2188) {
                            objM29053 = AbstractC9655.m15046(j3, c3837.m7050(), c3837.m7053(), true);
                            c2159.m2946(objM29053);
                        }
                        c9654M10590 = (C9654) objM29053;
                        c2159.m2937(false);
                    }
                    if (c9654M10590 == null) {
                        c2159.m2952(677542039);
                        c9654M10590 = AbstractC5894.m10590(true, c2159);
                    } else {
                        c2159.m2952(677536211);
                    }
                    c2159.m2937(false);
                    c2159.m2937(false);
                    break;
                default:
                    c2159.m2952(677506653);
                    c2159.m2937(false);
                    C5043.m9170();
                    return;
            }
            Object objM29054 = c2159.m2905();
            if (objM29054 == c2188) {
                C9654 c9654 = new C9654(((C2434) ((AbstractC2182) c9654M10590.f25207).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25206).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25205).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25204).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25203).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25202).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25221).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25220).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25224).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25225).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25222).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25223).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25215).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25214).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25218).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25219).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25216).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25217).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25209).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25208).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25212).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25213).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25210).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25211).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25195).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25194).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25193).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25192).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25191).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25190).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25201).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25200).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25199).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25198).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25197).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25196).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25187).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25186).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25189).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25188).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25184).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25185).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25181).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25180).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25183).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25182).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25178).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25179).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25227).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25226).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25229).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25230).getValue()).f5045, ((C2434) ((AbstractC2182) c9654M10590.f25228).getValue()).f5045);
                c2159.m2946(c9654);
                objM29054 = c9654;
            }
            C9654 c96542 = (C9654) objM29054;
            C2169 c2169 = AbstractC9653.f25177;
            c96542.getClass();
            InterfaceC2230 interfaceC22305 = c96542.f25200;
            c9654M10590.getClass();
            ((AbstractC2182) c96542.f25207).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25207).getValue()).f5045));
            ((AbstractC2182) c96542.f25206).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25206).getValue()).f5045));
            ((AbstractC2182) c96542.f25205).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25205).getValue()).f5045));
            ((AbstractC2182) c96542.f25204).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25204).getValue()).f5045));
            ((AbstractC2182) c96542.f25203).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25203).getValue()).f5045));
            ((AbstractC2182) c96542.f25202).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25202).getValue()).f5045));
            ((AbstractC2182) c96542.f25221).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25221).getValue()).f5045));
            ((AbstractC2182) c96542.f25220).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25220).getValue()).f5045));
            ((AbstractC2182) c96542.f25224).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25224).getValue()).f5045));
            ((AbstractC2182) c96542.f25225).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25225).getValue()).f5045));
            ((AbstractC2182) c96542.f25222).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25222).getValue()).f5045));
            ((AbstractC2182) c96542.f25223).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25223).getValue()).f5045));
            ((AbstractC2182) c96542.f25215).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25215).getValue()).f5045));
            ((AbstractC2182) c96542.f25214).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25214).getValue()).f5045));
            ((AbstractC2182) c96542.f25218).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25218).getValue()).f5045));
            ((AbstractC2182) c96542.f25219).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25219).getValue()).f5045));
            ((AbstractC2182) c96542.f25216).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25216).getValue()).f5045));
            ((AbstractC2182) c96542.f25217).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25217).getValue()).f5045));
            ((AbstractC2182) c96542.f25209).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25209).getValue()).f5045));
            ((AbstractC2182) c96542.f25208).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25208).getValue()).f5045));
            ((AbstractC2182) c96542.f25212).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25212).getValue()).f5045));
            ((AbstractC2182) c96542.f25213).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25213).getValue()).f5045));
            ((AbstractC2182) c96542.f25210).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25210).getValue()).f5045));
            ((AbstractC2182) c96542.f25211).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25211).getValue()).f5045));
            ((AbstractC2182) c96542.f25195).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25195).getValue()).f5045));
            ((AbstractC2182) c96542.f25194).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25194).getValue()).f5045));
            ((AbstractC2182) c96542.f25193).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25193).getValue()).f5045));
            ((AbstractC2182) c96542.f25192).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25192).getValue()).f5045));
            ((AbstractC2182) c96542.f25191).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25191).getValue()).f5045));
            ((AbstractC2182) c96542.f25190).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25190).getValue()).f5045));
            ((AbstractC2182) c96542.f25201).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25201).getValue()).f5045));
            ((AbstractC2182) interfaceC22305).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25200).getValue()).f5045));
            ((AbstractC2182) c96542.f25199).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25199).getValue()).f5045));
            ((AbstractC2182) c96542.f25198).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25198).getValue()).f5045));
            ((AbstractC2182) c96542.f25197).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25197).getValue()).f5045));
            ((AbstractC2182) c96542.f25196).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25196).getValue()).f5045));
            ((AbstractC2182) c96542.f25187).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25187).getValue()).f5045));
            ((AbstractC2182) c96542.f25186).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25186).getValue()).f5045));
            ((AbstractC2182) c96542.f25189).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25189).getValue()).f5045));
            ((AbstractC2182) c96542.f25188).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25188).getValue()).f5045));
            ((AbstractC2182) c96542.f25184).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25184).getValue()).f5045));
            ((AbstractC2182) c96542.f25185).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25185).getValue()).f5045));
            ((AbstractC2182) c96542.f25181).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25181).getValue()).f5045));
            ((AbstractC2182) c96542.f25180).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25180).getValue()).f5045));
            ((AbstractC2182) c96542.f25183).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25183).getValue()).f5045));
            ((AbstractC2182) c96542.f25182).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25182).getValue()).f5045));
            ((AbstractC2182) c96542.f25178).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25178).getValue()).f5045));
            ((AbstractC2182) c96542.f25179).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25179).getValue()).f5045));
            ((AbstractC2182) c96542.f25227).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25227).getValue()).f5045));
            ((AbstractC2182) c96542.f25226).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25226).getValue()).f5045));
            ((AbstractC2182) c96542.f25229).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25229).getValue()).f5045));
            ((AbstractC2182) c96542.f25230).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25230).getValue()).f5045));
            ((AbstractC2182) c96542.f25228).setValue(new C2434(((C2434) ((AbstractC2182) c9654M10590.f25228).getValue()).f5045));
            Object objM29055 = c2159.m2905();
            if (objM29055 == c2188) {
                C2865 c2865 = (C2865) ((AbstractC2182) c96622.f25271).getValue();
                C2865 c28652 = (C2865) ((AbstractC2182) c96622.f25270).getValue();
                C2865 c28653 = (C2865) ((AbstractC2182) c96622.f25269).getValue();
                C2865 c28654 = (C2865) ((AbstractC2182) c96622.f25268).getValue();
                C2865 c28655 = (C2865) ((AbstractC2182) c96622.f25267).getValue();
                C2865 c28656 = (C2865) ((AbstractC2182) c96622.f25266).getValue();
                C2865 c28657 = (C2865) ((AbstractC2182) c96622.f25275).getValue();
                C2865 c28658 = (C2865) ((AbstractC2182) c96622.f25274).getValue();
                C2865 c28659 = (C2865) ((AbstractC2182) c96622.f25278).getValue();
                C2865 c286510 = (C2865) ((AbstractC2182) c96622.f25279).getValue();
                C2865 c286511 = (C2865) ((AbstractC2182) c96622.f25276).getValue();
                C2865 c286512 = (C2865) ((AbstractC2182) c96622.f25277).getValue();
                C2865 c286513 = (C2865) ((AbstractC2182) c96622.f25273).getValue();
                C2865 c286514 = (C2865) ((AbstractC2182) c96622.f25272).getValue();
                c2865.getClass();
                c28652.getClass();
                c28653.getClass();
                c28654.getClass();
                c28655.getClass();
                c28656.getClass();
                c28657.getClass();
                c28658.getClass();
                c28659.getClass();
                c286510.getClass();
                c286511.getClass();
                c286512.getClass();
                c286513.getClass();
                c286514.getClass();
                C9662 c96623 = new C9662(c2865, c28652, c28653, c28654, c28655, c28656, c28657, c28658, c28659, c286510, c286511, c286512, c286513, c286514);
                c2159.m2946(c96623);
                objM29055 = c96623;
            }
            C9662 c96624 = (C9662) objM29055;
            C2169 c21692 = AbstractC9659.f25261;
            c96624.getClass();
            c96622.getClass();
            C2865 c286515 = (C2865) ((AbstractC2182) c96622.f25271).getValue();
            c286515.getClass();
            ((AbstractC2182) c96624.f25271).setValue(c286515);
            C2865 c286516 = (C2865) ((AbstractC2182) c96622.f25270).getValue();
            c286516.getClass();
            ((AbstractC2182) c96624.f25270).setValue(c286516);
            C2865 c286517 = (C2865) ((AbstractC2182) c96622.f25269).getValue();
            c286517.getClass();
            ((AbstractC2182) c96624.f25269).setValue(c286517);
            C2865 c286518 = (C2865) ((AbstractC2182) c96622.f25268).getValue();
            c286518.getClass();
            ((AbstractC2182) c96624.f25268).setValue(c286518);
            C2865 c286519 = (C2865) ((AbstractC2182) c96622.f25267).getValue();
            c286519.getClass();
            ((AbstractC2182) c96624.f25267).setValue(c286519);
            C2865 c286520 = (C2865) ((AbstractC2182) c96622.f25266).getValue();
            c286520.getClass();
            ((AbstractC2182) c96624.f25266).setValue(c286520);
            C2865 c286521 = (C2865) ((AbstractC2182) c96622.f25275).getValue();
            c286521.getClass();
            ((AbstractC2182) c96624.f25275).setValue(c286521);
            C2865 c286522 = (C2865) ((AbstractC2182) c96622.f25274).getValue();
            c286522.getClass();
            ((AbstractC2182) c96624.f25274).setValue(c286522);
            C2865 c286523 = (C2865) ((AbstractC2182) c96622.f25278).getValue();
            c286523.getClass();
            ((AbstractC2182) c96624.f25278).setValue(c286523);
            C2865 c286524 = (C2865) ((AbstractC2182) c96622.f25279).getValue();
            c286524.getClass();
            ((AbstractC2182) c96624.f25279).setValue(c286524);
            C2865 c286525 = (C2865) ((AbstractC2182) c96622.f25276).getValue();
            c286525.getClass();
            ((AbstractC2182) c96624.f25276).setValue(c286525);
            C2865 c286526 = (C2865) ((AbstractC2182) c96622.f25277).getValue();
            c286526.getClass();
            ((AbstractC2182) c96624.f25277).setValue(c286526);
            C2865 c286527 = (C2865) ((AbstractC2182) c96622.f25273).getValue();
            c286527.getClass();
            ((AbstractC2182) c96624.f25273).setValue(c286527);
            C2865 c286528 = (C2865) ((AbstractC2182) c96622.f25272).getValue();
            c286528.getClass();
            ((AbstractC2182) c96624.f25272).setValue(c286528);
            boolean zM2921 = c2159.m2921(((C2434) ((AbstractC2182) interfaceC22305).getValue()).f5045);
            Object objM29056 = c2159.m2905();
            if (zM2921 || objM29056 == c2188) {
                objM29056 = new C6889(((C2434) ((AbstractC2182) interfaceC22305).getValue()).f5045);
                c2159.m2946(objM29056);
            }
            AbstractC2202.m3046(new C1041[]{AbstractC9653.f25177.mo2988(c96542), AbstractC9659.f25261.mo2988(c96624), AbstractC1930.f3566.mo2988((C6889) objM29056), AbstractC9655.f25231.mo2988((ColorSchemeMode) ((AbstractC2182) interfaceC22304).getValue()), AbstractC1919.f3556.mo2988(C6908.f16972), AbstractC9657.f25233.mo2988(Boolean.valueOf(z2))}, AbstractC2089.m2749(797156861, new C9599(8), c2159), c2159, 56);
        } else {
            c2159.m2899();
            c96622 = c9662;
            z2 = z;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(c96622, z2, i) { // from class: 飘花落叶言苏哲兰子世楪.飘花落叶言子楪世兰哲苏

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C9662 f25170;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ boolean f25171;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(3073);
                    AbstractC5754.m10441(this.f25172, this.f25170, this.f25171, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C9020 m10442(C4890 c4890) {
        C9020 c9020;
        c4890.getClass();
        Iterator it = AbstractC5176.m9356(AbstractC4886.m9016(c4890).m9147().keySet()).iterator();
        do {
            c9020 = null;
            if (!it.hasNext()) {
                break;
            }
            C5041 c5041 = (C5041) it.next();
            C5036 c5036M9016 = AbstractC4886.m9016(c4890);
            c5041.getClass();
            Object obj = c5036M9016.m9147().get(c5041);
            if (obj instanceof C9020) {
                c9020 = (C9020) obj;
            }
        } while (c9020 == null);
        return c9020 == null ? C9020.f22910 : c9020;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Drawable m10443(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f14598) {
                return m10436(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            f14598 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = AbstractC8475.f21101;
        return resources.getDrawable(i, theme);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static ArrayList m10444(String str) {
        String strM10593 = AbstractC5894.m10593(str);
        C7991 c7991M7383 = AbstractC3897.m7383(new C8009(24));
        if (C9924.f25833.length() == 0) {
            C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            return null;
        }
        SharedPreferencesC9005 sharedPreferencesC9005M14232 = new C9012(C9924.f25833, "DexKitCache").m14232();
        if (!sharedPreferencesC9005M14232.contains(strM10593)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String string = sharedPreferencesC9005M14232.getString(strM10593, "");
        for (String str2 : (string == null || string.length() == 0) ? new ArrayList() : AbstractC5176.m9345((Collection) c7991M7383.m12985(string, new C7932(C7964.f19434, 0)))) {
            C7991 c7991 = AbstractC9938.f25881;
            str2.getClass();
            C7991 c79912 = AbstractC9938.f25881;
            c79912.getClass();
            Class clsM15228 = AbstractC9919.m15228(((C9935) c79912.m12985(str2, C9935.Companion.serializer())).f25879);
            clsM15228.getClass();
            arrayList.add(clsM15228);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final float m10445(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC8778.f22344;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC8666.f21723[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final float m10446(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC8778.f22344;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC8666.f21723[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static String m10447(ByteBuffer byteBuffer) throws UTFDataFormatException {
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
    public static final Integer m10448(C2069 c2069, AbstractC2207 abstractC2207, int i, int i2) {
        Integer numM10448;
        int[] iArr = c2069.f3899;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (c2069.m2648(i) && c2069.m2647(i) == 206 && AbstractC5227.m9466(c2069.m2642(iArr, i), AbstractC2209.f4320)) {
                Object objM2643 = c2069.m2643(i, 0);
                C2155 c2155 = objM2643 instanceof C2155 ? (C2155) objM2643 : null;
                InterfaceC2174 interfaceC2174 = c2155 != null ? c2155.f4169 : null;
                C2150 c2150 = interfaceC2174 instanceof C2150 ? (C2150) interfaceC2174 : null;
                if (c2150 != null && c2150.f4163 == abstractC2207) {
                    return Integer.valueOf(i);
                }
            }
            if (c2069.m2630(i) && (numM10448 = m10448(c2069, abstractC2207, i + 1, i3)) != null) {
                return Integer.valueOf(numM10448.intValue());
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static boolean m10449(Context context, String str) {
        try {
            ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C5610 m10450(C5519 c5519, C5677 c5677, InterfaceC5318 interfaceC5318, InputStream inputStream) throws IOException {
        ProtoBuf$PackageFragment from;
        c5519.getClass();
        interfaceC5318.getClass();
        try {
            C7775 c7775 = C7775.f18883;
            C7775 c7775M12602 = AbstractC7390.m12602(inputStream);
            C7775 c77752 = C7775.f18883;
            int i = c7775M12602.f18754;
            c77752.getClass();
            int i2 = c77752.f18754;
            int i3 = c7775M12602.f18755;
            int i4 = c77752.f18755;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    C5558 c5558 = new C5558();
                    AbstractC7774.m12796(c5558);
                    from = ProtoBuf$PackageFragment.parseFrom(inputStream, c5558);
                }
                from = null;
            } else if (i3 != i4 || i > i2) {
                from = null;
            } else {
                C5558 c55582 = new C5558();
                AbstractC7774.m12796(c55582);
                from = ProtoBuf$PackageFragment.parseFrom(inputStream, c55582);
            }
            Pair pair = new Pair(from, c7775M12602);
            inputStream.close();
            ProtoBuf$PackageFragment protoBuf$PackageFragment = (ProtoBuf$PackageFragment) pair.component1();
            C7775 c77753 = (C7775) pair.component2();
            if (protoBuf$PackageFragment != null) {
                return new C5610(c5519, c5677, interfaceC5318, protoBuf$PackageFragment, c77753);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c77752 + ", actual " + c77753 + ". Please update Kotlin");
        } finally {
        }
    }

    public String toString() {
        switch (this.f14599) {
            case 11:
                return mo10462();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public abstract void mo10451(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public abstract boolean mo10452(View view, float f);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public abstract AbstractC4765 mo10453();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract int mo10454(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public abstract boolean mo10455(float f, float f2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public abstract boolean mo10456(View view);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract boolean mo10457(float f);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public abstract int[] mo10458();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public abstract AbstractC5894 mo10459();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public abstract AbstractC3897 mo10460();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract AbstractC3898 mo10461();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract String mo10462();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public abstract int mo10463();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract int mo10464(CoordinatorLayout coordinatorLayout);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public abstract int mo10465();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public abstract int mo10466();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public abstract int mo10467(View view);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public abstract int mo10468();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public abstract int mo10469();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract float mo10470(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract int mo10471(ViewGroup.MarginLayoutParams marginLayoutParams);
}
