package p248;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.app.C0923;
import androidx.collection.C1110;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.compose.foundation.text.C1850;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2471;
import androidx.fragment.app.C3191;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.C3836;
import com.bumptech.glide.request.InterfaceC3883;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter$FilterResult;
import com.google.gson.internal.AbstractC4053;
import com.google.gson.internal.AbstractC4065;
import com.google.gson.internal.C4056;
import com.google.gson.internal.InterfaceC4070;
import com.google.gson.internal.LinkedTreeMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5454;
import kotlin.reflect.jvm.internal.impl.load.java.C5444;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684;
import p082.C7701;
import p082.C7702;
import p183.C8541;
import p191.AbstractC8568;
import p238.InterfaceC8816;
import p267.AbstractC9004;
import p276.C9075;
import p285.AbstractC9097;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8894 implements InterfaceC8816, InterfaceC5684 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static volatile C8894 f22588;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f22589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f22591;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22592;

    public C8894(Context context) {
        this.f22592 = 0;
        this.f22589 = new HashSet();
        this.f22591 = new C1575(new C3836(new C8541(context, 10)), new C8892(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C8894 m14106(Context context) {
        if (f22588 == null) {
            synchronized (C8894.class) {
                try {
                    if (f22588 == null) {
                        f22588 = new C8894(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f22588;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m14107(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // p238.InterfaceC8816
    public Object get() {
        if (this.f22590) {
            C6755.m11870("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        AbstractC9004.m14210("Glide registry");
        this.f22590 = true;
        try {
            return AbstractC1298.m1737((ComponentCallbacks2C3890) this.f22591, (ArrayList) this.f22589);
        } finally {
            this.f22590 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        int i = this.f22592;
        Object obj = this.f22589;
        Object obj2 = this.f22591;
        switch (i) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f22590 + ", crossed=" + m14112() + ", info=\n\t" + ((C1758) obj) + ')';
            case 2:
            case 3:
            case 6:
            default:
                return super.toString();
            case 4:
                return ((Map) obj2).toString();
            case 5:
                return "JavaTypeEnhancementState(jsr305=" + ((C5444) obj2) + ", getReportLevelForAnnotation=" + ((C1850) obj) + ')';
            case 7:
                return super.toString() + "{numRequests=" + ((Set) obj2).size() + ", isPaused=" + this.f22590 + "}";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC4070 m14108(C9075 c9075, boolean z) {
        final String str;
        InterfaceC4070 c3191;
        final Type type = c9075.f23159;
        Class cls = c9075.f23160;
        Map map = (Map) this.f22591;
        C3775 c3775 = null;
        if (map.get(type) != null) {
            C3775.m6954();
            return null;
        }
        if (map.get(cls) != null) {
            C3775.m6954();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        InterfaceC4070 interfaceC4070 = EnumSet.class.isAssignableFrom(cls) ? new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏哲兰
            @Override // com.google.gson.internal.InterfaceC4070
            /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
            public final Object mo5042() {
                int i3 = i2;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            C3775.m6956(type2, "Invalid EnumSet type: ");
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                C3775.m6956(type2, "Invalid EnumSet type: ");
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            C3775.m6956(type2, "Invalid EnumMap type: ");
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                C3775.m6956(type2, "Invalid EnumMap type: ");
                            }
                        }
                        break;
                }
                return null;
            }
        } : cls == EnumMap.class ? new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏哲兰
            @Override // com.google.gson.internal.InterfaceC4070
            /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
            public final Object mo5042() {
                int i3 = i;
                Type type2 = type;
                switch (i3) {
                    case 0:
                        if (!(type2 instanceof ParameterizedType)) {
                            C3775.m6956(type2, "Invalid EnumSet type: ");
                        } else {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type3 instanceof Class)) {
                                C3775.m6956(type2, "Invalid EnumSet type: ");
                            }
                        }
                        break;
                    default:
                        if (!(type2 instanceof ParameterizedType)) {
                            C3775.m6956(type2, "Invalid EnumMap type: ");
                        } else {
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (!(type4 instanceof Class)) {
                                C3775.m6956(type2, "Invalid EnumMap type: ");
                            }
                        }
                        break;
                }
                return null;
            }
        } : null;
        if (interfaceC4070 != null) {
            return interfaceC4070;
        }
        ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResultM7867 = AbstractC4053.m7867((List) this.f22589);
        final int i3 = 5;
        if (Modifier.isAbstract(cls.getModifiers())) {
            c3191 = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                ReflectionAccessFilter$FilterResult reflectionAccessFilter$FilterResult = ReflectionAccessFilter$FilterResult.ALLOW;
                if (reflectionAccessFilter$FilterResultM7867 != reflectionAccessFilter$FilterResult && (!AbstractC4065.f11236.mo7884(null, declaredConstructor) || (reflectionAccessFilter$FilterResultM7867 == ReflectionAccessFilter$FilterResult.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    final String str2 = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                    c3191 = new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
                        @Override // com.google.gson.internal.InterfaceC4070
                        /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
                        public final Object mo5042() {
                            int i4 = i2;
                            String str3 = str2;
                            switch (i4) {
                                case 0:
                                    throw new JsonIOException(str3);
                                case 1:
                                    throw new JsonIOException(str3);
                                case 2:
                                    throw new JsonIOException(str3);
                                case 3:
                                    throw new JsonIOException(str3);
                                case 4:
                                    throw new JsonIOException(str3);
                                default:
                                    throw new JsonIOException(str3);
                            }
                        }
                    };
                } else if (reflectionAccessFilter$FilterResultM7867 == reflectionAccessFilter$FilterResult) {
                    AbstractC8568 abstractC8568 = AbstractC9097.f23229;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e) {
                        str = "Failed making constructor '" + AbstractC9097.m14394(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + AbstractC9097.m14391(e);
                    }
                    c3191 = str != null ? new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
                        @Override // com.google.gson.internal.InterfaceC4070
                        /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
                        public final Object mo5042() {
                            int i4 = i;
                            String str3 = str;
                            switch (i4) {
                                case 0:
                                    throw new JsonIOException(str3);
                                case 1:
                                    throw new JsonIOException(str3);
                                case 2:
                                    throw new JsonIOException(str3);
                                case 3:
                                    throw new JsonIOException(str3);
                                case 4:
                                    throw new JsonIOException(str3);
                                default:
                                    throw new JsonIOException(str3);
                            }
                        }
                    } : new C3191(declaredConstructor, i3);
                }
            } catch (NoSuchMethodException unused) {
                c3191 = null;
            }
        }
        if (c3191 != null) {
            return c3191;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c3775 = new C3775(22);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c3775 = new C3775(23);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c3775 = new C3775(24);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c3775 = new C3775(25);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(LinkedTreeMap.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length != 0 && AbstractC4053.m7873(actualTypeArguments[0]) == String.class) {
                    }
                }
                c3775 = new C3775(17);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c3775 = new C3775(18);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c3775 = new C3775(19);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c3775 = new C3775(20);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c3775 = new C3775(21);
            }
        }
        if (c3775 != null) {
            return c3775;
        }
        final String strM14107 = m14107(cls);
        if (strM14107 != null) {
            final int i4 = 2;
            return new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
                @Override // com.google.gson.internal.InterfaceC4070
                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
                public final Object mo5042() {
                    int i42 = i4;
                    String str3 = strM14107;
                    switch (i42) {
                        case 0:
                            throw new JsonIOException(str3);
                        case 1:
                            throw new JsonIOException(str3);
                        case 2:
                            throw new JsonIOException(str3);
                        case 3:
                            throw new JsonIOException(str3);
                        case 4:
                            throw new JsonIOException(str3);
                        default:
                            throw new JsonIOException(str3);
                    }
                }
            };
        }
        if (!z) {
            final String str3 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
            final int i5 = 3;
            return new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
                @Override // com.google.gson.internal.InterfaceC4070
                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
                public final Object mo5042() {
                    int i42 = i5;
                    String str32 = str3;
                    switch (i42) {
                        case 0:
                            throw new JsonIOException(str32);
                        case 1:
                            throw new JsonIOException(str32);
                        case 2:
                            throw new JsonIOException(str32);
                        case 3:
                            throw new JsonIOException(str32);
                        case 4:
                            throw new JsonIOException(str32);
                        default:
                            throw new JsonIOException(str32);
                    }
                }
            };
        }
        if (reflectionAccessFilter$FilterResultM7867 != ReflectionAccessFilter$FilterResult.ALLOW) {
            final String str4 = "Unable to create instance of " + cls + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
            final int i6 = 4;
            return new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
                @Override // com.google.gson.internal.InterfaceC4070
                /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
                public final Object mo5042() {
                    int i42 = i6;
                    String str32 = str4;
                    switch (i42) {
                        case 0:
                            throw new JsonIOException(str32);
                        case 1:
                            throw new JsonIOException(str32);
                        case 2:
                            throw new JsonIOException(str32);
                        case 3:
                            throw new JsonIOException(str32);
                        case 4:
                            throw new JsonIOException(str32);
                        default:
                            throw new JsonIOException(str32);
                    }
                }
            };
        }
        if (this.f22590) {
            return new C4056(cls);
        }
        final String strConcat = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            strConcat = strConcat.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new InterfaceC4070() { // from class: com.google.gson.internal.飘花落叶言子楪世苏兰哲
            @Override // com.google.gson.internal.InterfaceC4070
            /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
            public final Object mo5042() {
                int i42 = i3;
                String str32 = strConcat;
                switch (i42) {
                    case 0:
                        throw new JsonIOException(str32);
                    case 1:
                        throw new JsonIOException(str32);
                    case 2:
                        throw new JsonIOException(str32);
                    case 3:
                        throw new JsonIOException(str32);
                    case 4:
                        throw new JsonIOException(str32);
                    default:
                        throw new JsonIOException(str32);
                }
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m14109(InterfaceC3883 interfaceC3883) {
        boolean z = true;
        if (interfaceC3883 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f22591).remove(interfaceC3883);
        if (!((HashSet) this.f22589).remove(interfaceC3883) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC3883.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m14110(long j) {
        Object obj;
        List list = (List) ((C0923) this.f22589).f572;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC2481.m3586(((C2471) obj).f5130, j)) {
                break;
            }
            i++;
        }
        C2471 c2471 = (C2471) obj;
        if (c2471 != null) {
            return c2471.f5132;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo10149(InterfaceC5705 interfaceC5705, InterfaceC5705 interfaceC57052) {
        boolean z = this.f22590;
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) this.f22591;
        InterfaceC5313 interfaceC53132 = (InterfaceC5313) this.f22589;
        interfaceC5705.getClass();
        interfaceC57052.getClass();
        if (interfaceC5705.equals(interfaceC57052)) {
            return true;
        }
        InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705.mo9770();
        InterfaceC5309 interfaceC5309Mo97702 = interfaceC57052.mo9770();
        if (!(interfaceC5309Mo9770 instanceof InterfaceC5295) || !(interfaceC5309Mo97702 instanceof InterfaceC5295)) {
            return false;
        }
        C7702 c7702 = new C7702(interfaceC5313, interfaceC53132);
        return C7701.f18658.m12680((InterfaceC5295) interfaceC5309Mo9770, (InterfaceC5295) interfaceC5309Mo97702, z, c7702);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m14111() {
        if (this.f22590 || ((HashSet) this.f22589).isEmpty()) {
            return;
        }
        C1575 c1575 = (C1575) this.f22591;
        C3836 c3836 = (C3836) c1575.f2415;
        boolean z = false;
        c1575.f2417 = ((ConnectivityManager) c3836.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c3836.get()).registerDefaultNetworkCallback((C8897) c1575.f2414);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f22590 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public CrossStatus m14112() {
        C1758 c1758 = (C1758) this.f22589;
        int i = c1758.f2958;
        int i2 = c1758.f2957;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public C8894(C5444 c5444, C1850 c1850) {
        this.f22592 = 5;
        this.f22591 = c5444;
        this.f22589 = c1850;
        this.f22590 = c5444.f13818 || c1850.invoke(AbstractC5454.f13876) == ReportLevel.IGNORE;
    }

    public C8894() {
        this.f22592 = 7;
        this.f22591 = Collections.newSetFromMap(new WeakHashMap());
        this.f22589 = new HashSet();
    }

    public C8894(C1110 c1110, C0923 c0923) {
        this.f22592 = 2;
        this.f22591 = c1110;
        this.f22589 = c0923;
    }

    public C8894(Map map, boolean z, List list) {
        this.f22592 = 4;
        this.f22591 = map;
        this.f22590 = z;
        this.f22589 = list;
    }

    public /* synthetic */ C8894(int i, Object obj, Object obj2, boolean z) {
        this.f22592 = i;
        this.f22590 = z;
        this.f22591 = obj;
        this.f22589 = obj2;
    }

    public C8894(ComponentCallbacks2C3890 componentCallbacks2C3890, ArrayList arrayList, AbstractC3897 abstractC3897) {
        this.f22592 = 3;
        this.f22591 = componentCallbacks2C3890;
        this.f22589 = arrayList;
    }
}
