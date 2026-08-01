package p232;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.app.C0076;
import androidx.collection.C0263;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.foundation.text.C1012;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1636;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.C3004;
import com.bumptech.glide.request.InterfaceC3051;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4622;
import kotlin.reflect.jvm.internal.impl.load.java.C4612;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852;
import p066.C6872;
import p066.C6873;
import p167.C7712;
import p222.InterfaceC7987;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8065 implements InterfaceC7987, InterfaceC4852 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static volatile C8065 f22243;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f22244;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f22246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22247;

    public C8065(Context context) {
        this.f22247 = 0;
        this.f22244 = new HashSet();
        this.f22246 = new C0734(new C3004(new C7712(context, 10)), new C8063(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C8065 m13547(Context context) {
        if (f22243 == null) {
            synchronized (C8065.class) {
                try {
                    if (f22243 == null) {
                        f22243 = new C8065(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f22243;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13548(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // p222.InterfaceC7987
    public Object get() {
        if (this.f22245) {
            C5925.m11311("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        AbstractC8175.m13651("Glide registry");
        this.f22245 = true;
        try {
            return AbstractC0455.m1177((ComponentCallbacks2C3058) this.f22246, (ArrayList) this.f22244);
        } finally {
            this.f22245 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        int i = this.f22247;
        Object obj = this.f22244;
        Object obj2 = this.f22246;
        switch (i) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f22245 + ", crossed=" + m13553() + ", info=\n\t" + ((C0920) obj) + ')';
            case 2:
            case 3:
            case 6:
            default:
                return super.toString();
            case 4:
                return ((Map) obj2).toString();
            case 5:
                return "JavaTypeEnhancementState(jsr305=" + ((C4612) obj2) + ", getReportLevelForAnnotation=" + ((C1012) obj) + ')';
            case 7:
                return super.toString() + "{numRequests=" + ((Set) obj2).size() + ", isPaused=" + this.f22245 + "}";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.InterfaceC3238 m13549(p260.C8246 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p232.C8065.m13549(飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰, boolean):com.google.gson.internal.飘花落叶言子楪苏兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m13550(InterfaceC3051 interfaceC3051) {
        boolean z = true;
        if (interfaceC3051 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f22246).remove(interfaceC3051);
        if (!((HashSet) this.f22244).remove(interfaceC3051) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC3051.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m13551(long j) {
        Object obj;
        List list = (List) ((C0076) this.f22244).f227;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC1646.m3026(((C1636) obj).f4785, j)) {
                break;
            }
            i++;
        }
        C1636 c1636 = (C1636) obj;
        if (c1636 != null) {
            return c1636.f4787;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9590(InterfaceC4873 interfaceC4873, InterfaceC4873 interfaceC48732) {
        boolean z = this.f22245;
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) this.f22246;
        InterfaceC4481 interfaceC44812 = (InterfaceC4481) this.f22244;
        interfaceC4873.getClass();
        interfaceC48732.getClass();
        if (interfaceC4873.equals(interfaceC48732)) {
            return true;
        }
        InterfaceC4477 interfaceC4477Mo9211 = interfaceC4873.mo9211();
        InterfaceC4477 interfaceC4477Mo92112 = interfaceC48732.mo9211();
        if (!(interfaceC4477Mo9211 instanceof InterfaceC4463) || !(interfaceC4477Mo92112 instanceof InterfaceC4463)) {
            return false;
        }
        C6873 c6873 = new C6873(interfaceC4481, interfaceC44812);
        return C6872.f18313.m12121((InterfaceC4463) interfaceC4477Mo9211, (InterfaceC4463) interfaceC4477Mo92112, z, c6873);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m13552() {
        if (this.f22245 || ((HashSet) this.f22244).isEmpty()) {
            return;
        }
        C0734 c0734 = (C0734) this.f22246;
        C3004 c3004 = (C3004) c0734.f2070;
        boolean z = false;
        c0734.f2072 = ((ConnectivityManager) c3004.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c3004.get()).registerDefaultNetworkCallback((C8068) c0734.f2069);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f22245 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public CrossStatus m13553() {
        C0920 c0920 = (C0920) this.f22244;
        int i = c0920.f2613;
        int i2 = c0920.f2612;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public C8065(C4612 c4612, C1012 c1012) {
        this.f22247 = 5;
        this.f22246 = c4612;
        this.f22244 = c1012;
        this.f22245 = c4612.f13473 || c1012.invoke(AbstractC4622.f13531) == ReportLevel.IGNORE;
    }

    public C8065() {
        this.f22247 = 7;
        this.f22246 = Collections.newSetFromMap(new WeakHashMap());
        this.f22244 = new HashSet();
    }

    public C8065(C0263 c0263, C0076 c0076) {
        this.f22247 = 2;
        this.f22246 = c0263;
        this.f22244 = c0076;
    }

    public C8065(Map map, boolean z, List list) {
        this.f22247 = 4;
        this.f22246 = map;
        this.f22245 = z;
        this.f22244 = list;
    }

    public /* synthetic */ C8065(int i, Object obj, Object obj2, boolean z) {
        this.f22247 = i;
        this.f22245 = z;
        this.f22246 = obj;
        this.f22244 = obj2;
    }

    public C8065(ComponentCallbacks2C3058 componentCallbacks2C3058, ArrayList arrayList, AbstractC3065 abstractC3065) {
        this.f22247 = 3;
        this.f22246 = componentCallbacks2C3058;
        this.f22244 = arrayList;
    }
}
