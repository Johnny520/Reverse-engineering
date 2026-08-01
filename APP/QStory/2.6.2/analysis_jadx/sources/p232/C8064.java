package p232;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import androidx.appcompat.app.C0076;
import androidx.collection.C0263;
import androidx.compose.foundation.lazy.layout.C0734;
import androidx.compose.foundation.text.C1012;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1636;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.C3003;
import com.bumptech.glide.request.InterfaceC3050;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4621;
import kotlin.reflect.jvm.internal.impl.load.java.C4611;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851;
import p000.AbstractC6087;
import p066.C6871;
import p066.C6872;
import p167.C7711;
import p222.InterfaceC7986;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8064 implements InterfaceC7986, InterfaceC4851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static volatile C8064 f22245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f22246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f22247;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f22248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22249;

    public C8064(Context context) {
        this.f22249 = 0;
        this.f22246 = new HashSet();
        this.f22248 = new C0734(new C3003(new C7711(context, 10)), new C8062(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C8064 m13518(Context context) {
        if (f22245 == null) {
            synchronized (C8064.class) {
                try {
                    if (f22245 == null) {
                        f22245 = new C8064(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f22245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13519(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    @Override // p222.InterfaceC7986
    public Object get() {
        if (this.f22247) {
            C5919.m11250("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        AbstractC6087.m11401("Glide registry");
        this.f22247 = true;
        try {
            return AbstractC2904.m6269((ComponentCallbacks2C3057) this.f22248, (ArrayList) this.f22246);
        } finally {
            this.f22247 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        int i = this.f22249;
        Object obj = this.f22246;
        Object obj2 = this.f22248;
        switch (i) {
            case 1:
                return "SingleSelectionLayout(isStartHandle=" + this.f22247 + ", crossed=" + m13524() + ", info=\n\t" + ((C0920) obj) + ')';
            case 2:
            case 3:
            case 6:
            default:
                return super.toString();
            case 4:
                return ((Map) obj2).toString();
            case 5:
                return "JavaTypeEnhancementState(jsr305=" + ((C4611) obj2) + ", getReportLevelForAnnotation=" + ((C1012) obj) + ')';
            case 7:
                return super.toString() + "{numRequests=" + ((Set) obj2).size() + ", isPaused=" + this.f22247 + "}";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.gson.internal.InterfaceC3237 m13520(p260.C8245 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p232.C8064.m13520(飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰, boolean):com.google.gson.internal.飘花落叶言子楪苏兰哲世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean m13521(InterfaceC3050 interfaceC3050) {
        boolean z = true;
        if (interfaceC3050 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f22248).remove(interfaceC3050);
        if (!((HashSet) this.f22246).remove(interfaceC3050) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC3050.clear();
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean m13522(long j) {
        Object obj;
        List list = (List) ((C0076) this.f22246).f227;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (AbstractC1646.m3016(((C1636) obj).f4784, j)) {
                break;
            }
            i++;
        }
        C1636 c1636 = (C1636) obj;
        if (c1636 != null) {
            return c1636.f4786;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9600(InterfaceC4872 interfaceC4872, InterfaceC4872 interfaceC48722) {
        boolean z = this.f22247;
        InterfaceC4480 interfaceC4480 = (InterfaceC4480) this.f22248;
        InterfaceC4480 interfaceC44802 = (InterfaceC4480) this.f22246;
        interfaceC4872.getClass();
        interfaceC48722.getClass();
        if (interfaceC4872.equals(interfaceC48722)) {
            return true;
        }
        InterfaceC4476 interfaceC4476Mo9221 = interfaceC4872.mo9221();
        InterfaceC4476 interfaceC4476Mo92212 = interfaceC48722.mo9221();
        if (!(interfaceC4476Mo9221 instanceof InterfaceC4462) || !(interfaceC4476Mo92212 instanceof InterfaceC4462)) {
            return false;
        }
        C6872 c6872 = new C6872(interfaceC4480, interfaceC44802);
        return C6871.f18318.m12093((InterfaceC4462) interfaceC4476Mo9221, (InterfaceC4462) interfaceC4476Mo92212, z, c6872);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m13523() {
        if (this.f22247 || ((HashSet) this.f22246).isEmpty()) {
            return;
        }
        C0734 c0734 = (C0734) this.f22248;
        C3003 c3003 = (C3003) c0734.f2069;
        boolean z = false;
        c0734.f2071 = ((ConnectivityManager) c3003.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c3003.get()).registerDefaultNetworkCallback((C8067) c0734.f2068);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.f22247 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public CrossStatus m13524() {
        C0920 c0920 = (C0920) this.f22246;
        int i = c0920.f2612;
        int i2 = c0920.f2611;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public C8064(C4611 c4611, C1012 c1012) {
        this.f22249 = 5;
        this.f22248 = c4611;
        this.f22246 = c1012;
        this.f22247 = c4611.f13469 || c1012.invoke(AbstractC4621.f13527) == ReportLevel.IGNORE;
    }

    public C8064() {
        this.f22249 = 7;
        this.f22248 = Collections.newSetFromMap(new WeakHashMap());
        this.f22246 = new HashSet();
    }

    public C8064(C0263 c0263, C0076 c0076) {
        this.f22249 = 2;
        this.f22248 = c0263;
        this.f22246 = c0076;
    }

    public C8064(Map map, boolean z, List list) {
        this.f22249 = 4;
        this.f22248 = map;
        this.f22247 = z;
        this.f22246 = list;
    }

    public /* synthetic */ C8064(int i, Object obj, Object obj2, boolean z) {
        this.f22249 = i;
        this.f22247 = z;
        this.f22248 = obj;
        this.f22246 = obj2;
    }

    public C8064(ComponentCallbacks2C3057 componentCallbacks2C3057, ArrayList arrayList, AbstractC3054 abstractC3054) {
        this.f22249 = 3;
        this.f22248 = componentCallbacks2C3057;
        this.f22246 = arrayList;
    }
}
