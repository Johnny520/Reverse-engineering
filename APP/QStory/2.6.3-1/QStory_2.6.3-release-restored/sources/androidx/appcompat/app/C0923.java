package androidx.appcompat.app;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1081;
import androidx.collection.C1083;
import androidx.collection.C1090;
import androidx.collection.C1099;
import androidx.collection.C1115;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.foundation.lazy.layout.C1552;
import androidx.compose.foundation.text.C1850;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.C2549;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2552;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2624;
import androidx.compose.p001ui.node.InterfaceC2617;
import androidx.compose.p001ui.node.LayoutNode$LayoutState;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2853;
import androidx.compose.p001ui.text.input.C2857;
import androidx.compose.p001ui.text.input.InterfaceC2839;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2187;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.C3115;
import androidx.core.view.InterfaceC3038;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.engine.bitmap_recycle.C3809;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3812;
import com.bumptech.glide.load.resource.bitmap.C3858;
import com.bumptech.glide.load.resource.bitmap.C3860;
import com.bumptech.glide.load.resource.bitmap.C3865;
import com.bumptech.glide.load.resource.bitmap.InterfaceC3868;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C3990;
import com.typesafe.config.impl.AbstractC4675;
import com.typesafe.config.impl.C4679;
import com.typesafe.config.impl.C4681;
import com.typesafe.config.impl.C4684;
import com.typesafe.config.impl.InterfaceC4677;
import io.ktor.http.UnsafeHeaderException;
import io.ktor.server.cio.C4917;
import io.ktor.util.C5043;
import java.io.File;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.AbstractC5835;
import kotlin.reflect.jvm.internal.C5775;
import kotlin.reflect.jvm.internal.C5776;
import kotlin.reflect.jvm.internal.C5781;
import kotlin.reflect.jvm.internal.C5782;
import kotlin.reflect.jvm.internal.C5789;
import kotlin.reflect.jvm.internal.C5851;
import kotlin.reflect.jvm.internal.C5852;
import kotlin.reflect.jvm.internal.C5854;
import kotlin.reflect.jvm.internal.C5858;
import kotlin.reflect.jvm.internal.C5883;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.InterfaceC5446;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5480;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5483;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5663;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.text.AbstractC5971;
import p068.InterfaceC7387;
import p086.C7727;
import p091.C7790;
import p093.C7799;
import p093.C7800;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.AbstractC7843;
import p095.C7808;
import p095.C7817;
import p095.C7819;
import p095.C7820;
import p095.C7821;
import p095.C7833;
import p095.C7835;
import p095.C7847;
import p123.C8141;
import p180.C8494;
import p208.AbstractC8639;
import p208.InterfaceC8640;
import p238.C8810;
import p252.AbstractC8944;
import p302.C9226;
import p302.InterfaceC9230;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C0923 implements InterfaceC8640, InterfaceC2552, InterfaceC2187, InterfaceC9230, InterfaceC3868, InterfaceC3038, InterfaceC4677, InterfaceC5329, InterfaceC5446, InterfaceC5662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f572;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f573;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f574;

    public C0923(int i) {
        this.f574 = i;
        switch (i) {
            case 3:
                this.f572 = new C1083();
                this.f573 = new C1083();
                break;
            case 8:
                this.f572 = new C2059(0, new C2583[16]);
                break;
            case 9:
                this.f572 = new C2059(0, new Reference[16]);
                this.f573 = new ReferenceQueue();
                break;
            case 10:
                this.f572 = new C7790(9);
                this.f573 = new C1115(16);
                break;
            case 15:
                this.f572 = new C3809(null);
                this.f573 = new HashMap();
                break;
            default:
                this.f572 = new C8141();
                this.f573 = new C8141();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m815(C2583 c2583) {
        if (c2583.f5472 > 0) {
            if (c2583.f5477.f5504 == LayoutNode$LayoutState.Idle && !c2583.m3822() && !c2583.m3819() && !c2583.f5471 && c2583.m3802()) {
                AbstractC2961 abstractC2961 = c2583.f5439.f5628;
                if ((abstractC2961.f6630 & 256) != 0) {
                    while (abstractC2961 != null) {
                        if ((abstractC2961.f6636 & 256) != 0) {
                            ?? M3899 = abstractC2961;
                            ?? c2059 = 0;
                            while (M3899 != 0) {
                                if (M3899 instanceof InterfaceC2617) {
                                    InterfaceC2617 interfaceC2617 = (InterfaceC2617) M3899;
                                    interfaceC2617.mo2198(AbstractC2620.m3908(interfaceC2617, 256));
                                } else if ((M3899.f6636 & 256) != 0 && (M3899 instanceof AbstractC2623)) {
                                    AbstractC2961 abstractC29612 = ((AbstractC2623) M3899).f5571;
                                    int i = 0;
                                    M3899 = M3899;
                                    c2059 = c2059;
                                    while (abstractC29612 != null) {
                                        if ((abstractC29612.f6636 & 256) != 0) {
                                            i++;
                                            c2059 = c2059;
                                            if (i == 1) {
                                                M3899 = abstractC29612;
                                            } else {
                                                if (c2059 == 0) {
                                                    c2059 = new C2059(0, new AbstractC2961[16]);
                                                }
                                                if (M3899 != 0) {
                                                    c2059.m2607(M3899);
                                                    M3899 = 0;
                                                }
                                                c2059.m2607(abstractC29612);
                                            }
                                        }
                                        abstractC29612 = abstractC29612.f6633;
                                        M3899 = M3899;
                                        c2059 = c2059;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M3899 = AbstractC2620.m3899(c2059);
                            }
                        }
                        if ((abstractC2961.f6630 & 256) == 0) {
                            break;
                        } else {
                            abstractC2961 = abstractC2961.f6633;
                        }
                    }
                }
            }
            c2583.f5473 = false;
            C2059 c2059M3799 = c2583.m3799();
            Object[] objArr = c2059M3799.f3866;
            int i2 = c2059M3799.f3865;
            for (int i3 = 0; i3 < i2; i3++) {
                m815((C2583) objArr[i3]);
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2187
    public void cancel() {
        if (((AtomicInt) this.f573).compareAndSet(1, 1)) {
            return;
        }
        ((C1596) this.f572).invoke();
    }

    public String toString() {
        switch (this.f574) {
            case 12:
                return "Bounds{lower=" + ((C8494) this.f572) + " upper=" + ((C8494) this.f573) + "}";
            case 15:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C3809 c3809 = (C3809) this.f572;
                C3809 c38092 = c3809.f9758;
                boolean z = false;
                while (!c38092.equals(c3809)) {
                    sb.append('{');
                    sb.append(c38092.f9760);
                    sb.append(':');
                    ArrayList arrayList = c38092.f9759;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c38092 = c38092.f9758;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 19:
                StringBuilder sb2 = new StringBuilder("RomInfo{name=");
                sb2.append((String) this.f572);
                sb2.append(", version=");
                return AbstractC0900.m711(sb2, (String) this.f573, "}");
            case 20:
                StringBuffer stringBuffer = new StringBuffer("[");
                C0923 c0923 = (C0923) this.f573;
                if (c0923 != null) {
                    int i = 20;
                    this = new C0923(this.f572, i, (Object) null);
                    while (c0923 != null) {
                        C0923 c09232 = new C0923(c0923.f572, i, this);
                        c0923 = (C0923) c0923.f573;
                        this = c09232;
                    }
                }
                while (this != null) {
                    C0923 c09233 = (C0923) this.f573;
                    stringBuffer.append(this.f572.toString());
                    if (c09233 != null) {
                        stringBuffer.append(" <= ");
                    }
                    this = c09233;
                }
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void m816(InterfaceC3812 interfaceC3812, Object obj) {
        HashMap map = (HashMap) this.f573;
        C3809 c3809 = (C3809) map.get(interfaceC3812);
        if (c3809 == null) {
            c3809 = new C3809(interfaceC3812);
            c3809.f9757 = c3809;
            C3809 c38092 = (C3809) this.f572;
            c3809.f9757 = c38092.f9757;
            c3809.f9758 = c38092;
            c38092.f9757 = c3809;
            c3809.f9757.f9758 = c3809;
            map.put(interfaceC3812, c3809);
        } else {
            interfaceC3812.mo7011();
        }
        if (c3809.f9759 == null) {
            c3809.f9759 = new ArrayList();
        }
        c3809.f9759.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public Object m817() {
        C3809 c3809 = (C3809) this.f572;
        C3809 c38092 = c3809.f9757;
        while (true) {
            boolean zEquals = c38092.equals(c3809);
            Object obj = c38092.f9760;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c38092.f9759;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c38092.f9759.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C3809 c38093 = c38092.f9757;
            c38093.f9758 = c38092.f9758;
            c38092.f9758.f9757 = c38093;
            ((HashMap) this.f573).remove(obj);
            ((InterfaceC3812) obj).mo7011();
            c38092 = c38092.f9757;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public Object m818(InterfaceC3812 interfaceC3812) {
        HashMap map = (HashMap) this.f573;
        C3809 c3809 = (C3809) map.get(interfaceC3812);
        if (c3809 == null) {
            c3809 = new C3809(interfaceC3812);
            map.put(interfaceC3812, c3809);
        } else {
            interfaceC3812.mo7011();
        }
        C3809 c38092 = c3809.f9757;
        c38092.f9758 = c3809.f9758;
        c3809.f9758.f9757 = c38092;
        C3809 c38093 = (C3809) this.f572;
        c3809.f9757 = c38093;
        C3809 c38094 = c38093.f9758;
        c3809.f9758 = c38094;
        c38094.f9757 = c3809;
        c3809.f9757.f9758 = c3809;
        ArrayList arrayList = c3809.f9759;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c3809.f9759.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public void m819(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m819(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public InterfaceC2493 m820() {
        return (InterfaceC2493) ((AbstractC2182) ((InterfaceC2230) this.f573)).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public String m821(String str) {
        List listM2976 = ((C4917) this.f573).f12756.m2976(str);
        if (listM2976 == null) {
            listM2976 = EmptyList.INSTANCE;
        }
        return (String) AbstractC5176.m9374(listM2976);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public void m822(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m822(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public void m823(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m823(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public void m824(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m824(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public void m825(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m825(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public void m826(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m826(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public void m827(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m827(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m828(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m828(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public Object mo829(C7819 c7819, Object obj) {
        return mo854(c7819, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m830() {
        Object[] objArr;
        C2059 c2059 = (C2059) this.f572;
        Arrays.sort(c2059.f3866, 0, c2059.f3865, C2624.f5572);
        int i = c2059.f3865;
        C2583[] c2583Arr = (C2583[]) this.f573;
        if (c2583Arr != null) {
            int length = c2583Arr.length;
            objArr = c2583Arr;
            if (length < i) {
                objArr = new C2583[Math.max(16, i)];
            }
        }
        this.f573 = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c2059.f3866[i2];
        }
        c2059.m2612();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f573 = objArr;
                return;
            }
            C2583 c2583 = objArr[i];
            c2583.getClass();
            if (c2583.f5473) {
                m815(c2583);
            }
            objArr[i] = 0;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Object mo831(C7808 c7808, Object obj) {
        return null;
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean mo832(AbstractC8639 abstractC8639, Menu menu) {
        return ((InterfaceC8640) this.f572).mo832(abstractC8639, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public void m833(boolean z) {
        AbstractC3146 abstractC3146 = (AbstractC3146) this.f573;
        FragmentActivity fragmentActivity = abstractC3146.f7136.f7161;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = abstractC3146.f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m833(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public void m834(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m834(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public void m835(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m835(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m836(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m836(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m837(boolean z) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = ((AbstractC3146) this.f573).f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m837(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m838(boolean z) {
        AbstractC3146 abstractC3146 = (AbstractC3146) this.f573;
        FragmentActivity fragmentActivity = abstractC3146.f7136.f7161;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = abstractC3146.f7134;
        if (abstractComponentCallbacksC3171 != null) {
            abstractComponentCallbacksC3171.m5019().f7139.m838(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f572).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo839(AbstractC8639 abstractC8639) {
        ((InterfaceC8640) this.f572).mo839(abstractC8639);
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) this.f573;
        if (layoutInflaterFactory2C0915.f506 != null) {
            layoutInflaterFactory2C0915.f513.getDecorView().removeCallbacks(layoutInflaterFactory2C0915.f509);
        }
        if (layoutInflaterFactory2C0915.f507 != null) {
            C3115 c3115 = layoutInflaterFactory2C0915.f508;
            if (c3115 != null) {
                c3115.m4831();
            }
            C3115 c3115M4797 = AbstractC3103.m4797(layoutInflaterFactory2C0915.f507);
            c3115M4797.m4832(0.0f);
            layoutInflaterFactory2C0915.f508 = c3115M4797;
            c3115M4797.m4829(new C0940(this, 2));
        }
        layoutInflaterFactory2C0915.f511.onSupportActionModeFinished(layoutInflaterFactory2C0915.f516);
        layoutInflaterFactory2C0915.f516 = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0915.f505;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C0915.m781();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2552
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo840(Object obj, Object obj2) {
        C1552 c1552 = (C1552) this.f572;
        return AbstractC5227.m9466(c1552.m2066(obj), c1552.m2066(obj2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object mo841(AbstractC7815 abstractC7815, Object obj) {
        return null;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3868
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo842(Bitmap bitmap, InterfaceC3811 interfaceC3811) throws IOException {
        IOException iOException = ((C8810) this.f573).f22401;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC3811.mo7015(bitmap);
            throw iOException;
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2552
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo843(C2549 c2549) {
        C1099 c1099 = (C1099) this.f573;
        c1099.m1367();
        C1090 c1090 = c2549.f5330;
        Object[] objArr = c1090.f1357;
        long[] jArr = c1090.f1356;
        int i = c1090.f1354;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objM2066 = ((C1552) this.f572).m2066(obj);
            int iM1364 = c1099.m1364(objM2066);
            int i3 = iM1364 >= 0 ? c1099.f1261[iM1364] : 0;
            if (i3 == 7) {
                c2549.remove(obj);
            } else {
                c1099.m1368(i3 + 1, objM2066);
            }
            i = i2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo844(C7833 c7833, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object mo845(C7847 c7847, Object obj) {
        return mo854(c7847, obj);
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean mo846(AbstractC8639 abstractC8639, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0915) this.f573).f505;
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        viewGroup.requestApplyInsets();
        return ((InterfaceC8640) this.f572).mo846(abstractC8639, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public C2847 m847(List list) throws IOException {
        InterfaceC2839 interfaceC2839;
        final InterfaceC2839 interfaceC28392 = null;
        try {
            int size = list.size();
            int i = 0;
            InterfaceC2839 interfaceC28393 = null;
            while (i < size) {
                try {
                    interfaceC2839 = (InterfaceC2839) list.get(i);
                } catch (Exception e) {
                    e = e;
                    interfaceC28392 = interfaceC28393;
                }
                try {
                    interfaceC2839.mo2252((C2857) this.f573);
                    i++;
                    interfaceC28393 = interfaceC2839;
                } catch (Exception e2) {
                    e = e2;
                    interfaceC28392 = interfaceC2839;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((C2853) ((C2857) this.f573).f6308).m4280());
                    sb2.append(", composition=");
                    sb2.append(((C2857) this.f573).m4290());
                    sb2.append(", selection=");
                    C2857 c2857 = (C2857) this.f573;
                    sb2.append((Object) C2869.m4318(AbstractC2882.m4330(c2857.f6309, c2857.f6310)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC5176.m9368(list, sb, "\n", null, null, new InterfaceC7387(this) { // from class: androidx.compose.ui.text.input.飘花落叶言子楪苏世哲兰
                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj) {
                            String strConcat;
                            StringBuilder sb3;
                            int i2;
                            InterfaceC2839 interfaceC28394 = (InterfaceC2839) obj;
                            String str = this.f6312 == interfaceC28394 ? " > " : "   ";
                            if (interfaceC28394 instanceof C2844) {
                                sb3 = new StringBuilder("CommitTextCommand(text.length=");
                                C2844 c2844 = (C2844) interfaceC28394;
                                sb3.append(c2844.f6279.f6474.length());
                                sb3.append(", newCursorPosition=");
                                i2 = c2844.f6278;
                            } else {
                                if (!(interfaceC28394 instanceof C2849)) {
                                    if (interfaceC28394 instanceof C2845) {
                                        strConcat = ((C2845) interfaceC28394).toString();
                                    } else if (interfaceC28394 instanceof C2841) {
                                        strConcat = ((C2841) interfaceC28394).toString();
                                    } else if (interfaceC28394 instanceof C2840) {
                                        strConcat = ((C2840) interfaceC28394).toString();
                                    } else if (interfaceC28394 instanceof C2850) {
                                        strConcat = ((C2850) interfaceC28394).toString();
                                    } else if (interfaceC28394 instanceof C2861) {
                                        strConcat = "FinishComposingTextCommand()";
                                    } else if (interfaceC28394 instanceof C2842) {
                                        strConcat = "DeleteAllCommand()";
                                    } else {
                                        String simpleName = AbstractC5228.f13320.mo9476(interfaceC28394.getClass()).getSimpleName();
                                        if (simpleName == null) {
                                            simpleName = "{anonymous EditCommand}";
                                        }
                                        strConcat = "Unknown EditCommand: ".concat(simpleName);
                                    }
                                    return str.concat(strConcat);
                                }
                                sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                                C2849 c2849 = (C2849) interfaceC28394;
                                sb3.append(c2849.f6296.f6474.length());
                                sb3.append(", newCursorPosition=");
                                i2 = c2849.f6295;
                            }
                            strConcat = AbstractC0900.m716(sb3, i2, ')');
                            return str.concat(strConcat);
                        }
                    }, 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            C2857 c28572 = (C2857) this.f573;
            c28572.getClass();
            C2902 c2902 = new C2902(((C2853) c28572.f6308).toString());
            C2857 c28573 = (C2857) this.f573;
            long jM4330 = AbstractC2882.m4330(c28573.f6309, c28573.f6310);
            C2869 c2869 = C2869.m4316(((C2847) this.f572).f6291) ? null : new C2869(jM4330);
            C2847 c2847 = new C2847(c2902, c2869 != null ? c2869.f6349 : AbstractC2882.m4330(C2869.m4310(jM4330), C2869.m4317(jM4330)), ((C2857) this.f573).m4290());
            this.f572 = c2847;
            return c2847;
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public Object mo848(Object obj, C7817 c7817) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m849(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (((EmptySet) this.f572).contains(str)) {
            return;
        }
        if (z) {
            String[] strArr = AbstractC8944.f22758;
            for (int i = 0; i < 2; i++) {
                if (AbstractC5971.m10689(strArr[i], str)) {
                    throw new UnsafeHeaderException(str);
                }
            }
        }
        AbstractC8944.m14143(str);
        AbstractC8944.m14142(str2);
        ((C4917) this.f573).f12756.mo2983(str, str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public Object mo850(C7835 c7835, Object obj) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5662
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C5663 mo851(C5520 c5520) {
        c5520.getClass();
        C7800 c7800 = (C7800) this.f572;
        C5483 c5483 = (C5483) this.f573;
        c5483.m9815().f14435.getClass();
        C7799 c7799M7314 = AbstractC3889.m7314(c7800, c5520, C7727.f18701);
        if (c7799M7314 == null) {
            return null;
        }
        AbstractC5263.m9536(c7799M7314.f19006).equals(c5520);
        return c5483.m9818(c7799M7314);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Object mo852(AbstractC7825 abstractC7825, Object obj) {
        return null;
    }

    @Override // p302.InterfaceC9230
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public EncodeStrategy mo853(C9226 c9226) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object mo854(InterfaceC5316 interfaceC5316, Object obj) {
        return new C5858((AbstractC5835) this.f572, interfaceC5316);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Object mo855(AbstractC7818 abstractC7818, Object obj) {
        return null;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3868
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void mo856() {
        C3865 c3865 = (C3865) this.f572;
        synchronized (c3865) {
            c3865.f10007 = c3865.f10008.length;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object mo857(C7820 c7820, Object obj) {
        return mo854(c7820, obj);
    }

    @Override // p208.InterfaceC8640
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo858(AbstractC8639 abstractC8639, MenuItem menuItem) {
        return ((InterfaceC8640) this.f572).mo858(abstractC8639, menuItem);
    }

    @Override // p302.InterfaceC9225
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean mo859(Object obj, File file, C9226 c9226) {
        return ((C3860) this.f573).mo859(new C3858(((BitmapDrawable) ((InterfaceC3821) obj).get()).getBitmap(), (InterfaceC3811) this.f572), file, c9226);
    }

    @Override // com.typesafe.config.impl.InterfaceC4677
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public AbstractC4675 mo860(AbstractC4675 abstractC4675, String str) {
        C4684 c4684M8783 = ((C4679) this.f572).m8783(abstractC4675, (C4681) this.f573);
        this.f572 = c4684M8783.f12424;
        return c4684M8783.f12423;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo861(C7821 c7821, Object obj) {
        int i;
        AbstractC5835 abstractC5835 = (AbstractC5835) this.f573;
        c7821.getClass();
        List listMo9596 = c7821.mo9596();
        listMo9596.getClass();
        if (listMo9596.isEmpty()) {
            i = (c7821.f19066 != null ? 1 : 0) + (c7821.f19065 != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (c7821.f19073) {
            if (i == -1) {
                return new C5789(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 0) {
                return new C5851(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 1) {
                return new C5854(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 2) {
                return new C5852(abstractC5835, c7821, C5883.f14920);
            }
        } else {
            if (i == -1) {
                return new C5776(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 0) {
                return new C5781(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 1) {
                return new C5782(abstractC5835, c7821, C5883.f14920);
            }
            if (i == 2) {
                return new C5775(abstractC5835, c7821, C5883.f14920);
            }
        }
        C5043.m9154(c7821, "Unsupported property: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object mo862(AbstractC7843 abstractC7843, Object obj) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3058 mo863(View view, C3058 c3058) {
        boolean z;
        C0911 c0911 = (C0911) this.f572;
        C3990 c3990 = (C3990) this.f573;
        int i = c3990.f10857;
        int i2 = c3990.f10856;
        int i3 = c3990.f10855;
        C3071 c3071 = c3058.f6866;
        C8494 c8494Mo4612 = c3071.mo4612(519);
        C8494 c8494Mo46122 = c3071.mo4612(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0911.f484;
        int i4 = c8494Mo4612.f21154;
        int i5 = c8494Mo4612.f21153;
        int i6 = c8494Mo4612.f21155;
        bottomSheetBehavior.f10398 = i4;
        boolean z2 = true;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f10406;
        if (z4) {
            int iM4628 = c3058.m4628();
            bottomSheetBehavior.f10397 = iM4628;
            paddingBottom = iM4628 + i3;
        }
        if (bottomSheetBehavior.f10403) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.f10404) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f10395 || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.f10399 && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.f10400) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = c8494Mo4612.f21154;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        boolean z5 = c0911.f483;
        if (z5) {
            bottomSheetBehavior.f10401 = c8494Mo46122.f21152;
        }
        if (!z4 && !z5) {
            return c3058;
        }
        bottomSheetBehavior.m7571();
        return c3058;
    }

    public /* synthetic */ C0923(Object obj, int i, Object obj2) {
        this.f574 = i;
        this.f572 = obj;
        this.f573 = obj2;
    }

    public C0923(C4917 c4917) {
        this.f574 = 22;
        this.f573 = c4917;
        this.f572 = EmptySet.INSTANCE;
    }

    public C0923(AbstractC5835 abstractC5835) {
        this.f574 = 23;
        abstractC5835.getClass();
        this.f572 = abstractC5835;
        this.f573 = abstractC5835;
    }

    public /* synthetic */ C0923(int i, boolean z) {
        this.f574 = i;
    }

    public C0923(Object obj) {
        this.f574 = 29;
        this.f572 = obj;
        this.f573 = Thread.currentThread();
    }

    public C0923(C2583 c2583, InterfaceC2493 interfaceC2493) {
        this.f574 = 6;
        this.f572 = c2583;
        this.f573 = AbstractC2202.m3034(interfaceC2493);
    }

    public C0923(C1596 c1596) {
        this.f574 = 4;
        this.f572 = c1596;
        this.f573 = new AtomicInt(0);
    }

    public C0923(String str, Set set) {
        this.f574 = 24;
        str.getClass();
        set.getClass();
        this.f572 = str;
        this.f573 = set;
    }

    public C0923(AbstractC3146 abstractC3146) {
        this.f574 = 14;
        this.f572 = new CopyOnWriteArrayList();
        this.f573 = abstractC3146;
    }

    public C0923(C5480 c5480, HashMap map, HashMap map2) {
        this.f574 = 27;
        this.f572 = c5480;
        this.f573 = map;
    }

    public C0923(Map map) {
        this.f574 = 26;
        this.f572 = map;
        this.f573 = new C5677("Java nullability annotation states").m10137(new C1850(this, 7));
    }

    public C0923(C1552 c1552) {
        this.f574 = 2;
        this.f572 = c1552;
        C1099 c1099 = AbstractC1081.f1219;
        this.f573 = new C1099();
    }

    public C0923(Animation animation) {
        this.f574 = 13;
        this.f572 = animation;
        this.f573 = null;
    }

    public C0923(Animator animator) {
        this.f574 = 13;
        this.f572 = null;
        this.f573 = animator;
    }

    public C0923(WindowInsetsAnimation.Bounds bounds) {
        this.f574 = 12;
        this.f572 = C8494.m13497(bounds.getLowerBound());
        this.f573 = C8494.m13497(bounds.getUpperBound());
    }

    public C0923(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, InterfaceC8640 interfaceC8640) {
        this.f574 = 0;
        this.f573 = layoutInflaterFactory2C0915;
        this.f572 = interfaceC8640;
    }
}
