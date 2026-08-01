package com.bumptech.glide;

import androidx.compose.ui.graphics.vector.C1562;
import androidx.core.util.C2184;
import com.bumptech.glide.load.data.C2968;
import com.bumptech.glide.load.data.InterfaceC2960;
import com.bumptech.glide.load.data.InterfaceC2961;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p075.C6958;
import p075.C6961;
import p193.C7828;
import p222.AbstractC7989;
import p223.C7992;
import p223.C7993;
import p223.C7994;
import p223.C7995;
import p228.C8025;
import p228.C8026;
import p228.C8027;
import p228.C8030;
import p228.InterfaceC8033;
import p228.InterfaceC8034;
import p233.C8076;
import p233.InterfaceC8077;
import p286.InterfaceC8396;
import p286.InterfaceC8400;
import p286.InterfaceC8401;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1562 f9803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2968 f9804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1562 f9805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4871 f9806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1562 f9807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8025 f9808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1562 f9810;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7828 f9812;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4871 f9809 = new C4871(27);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7994 f9811 = new C7994();

    public C3067() {
        C7828 c7828 = new C7828(new C2184(20), new C6958(11), new C6961(11));
        this.f9812 = c7828;
        this.f9808 = new C8025(c7828);
        this.f9807 = new C1562(7, false);
        this.f9806 = new C4871(28);
        this.f9805 = new C1562(9, false);
        this.f9804 = new C2968();
        this.f9803 = new C1562(10, false);
        this.f9810 = new C1562(8, false);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C4871 c4871 = this.f9806;
        synchronized (c4871) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c4871.f14164);
                ((ArrayList) c4871.f14164).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c4871.f14164).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c4871.f14164).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m6875(Object obj) {
        List listUnmodifiableList;
        C8025 c8025 = this.f9808;
        c8025.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c8025) {
            C8026 c8026 = (C8026) c8025.f22159.f9826.get(cls);
            listUnmodifiableList = c8026 == null ? null : c8026.f22161;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c8025.f22160.m13512(cls));
                if (((C8026) c8025.f22159.f9826.put(cls, new C8026(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj);
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC8033 interfaceC8033 = (InterfaceC8033) listUnmodifiableList.get(i);
            if (interfaceC8033.mo13501(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC8033);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj, (List<InterfaceC8033>) listUnmodifiableList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m6876() {
        ArrayList arrayList;
        C1562 c1562 = this.f9810;
        synchronized (c1562) {
            arrayList = c1562.f4600;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6877(String str, Class cls, Class cls2, InterfaceC8400 interfaceC8400) {
        C4871 c4871 = this.f9806;
        synchronized (c4871) {
            c4871.m9758(str).add(new C7993(cls, cls2, interfaceC8400));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6878(Class cls, InterfaceC8401 interfaceC8401) {
        C1562 c1562 = this.f9805;
        synchronized (c1562) {
            c1562.f4600.add(new C7992(cls, interfaceC8401));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6879(Class cls, InterfaceC8396 interfaceC8396) {
        C1562 c1562 = this.f9807;
        synchronized (c1562) {
            c1562.f4600.add(new C7995(cls, interfaceC8396));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6880(Class cls, Class cls2, InterfaceC8034 interfaceC8034) {
        C8025 c8025 = this.f9808;
        synchronized (c8025) {
            C8027 c8027 = c8025.f22160;
            synchronized (c8027) {
                try {
                    C8030 c8030 = new C8030(cls, cls2, interfaceC8034);
                    ArrayList arrayList = c8027.f22167;
                    arrayList.add(arrayList.size(), c8030);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8025.f22159.f9826.clear();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m6881(InterfaceC2961 interfaceC2961) {
        C2968 c2968 = this.f9804;
        synchronized (c2968) {
            ((HashMap) c2968.f9385).put(interfaceC2961.mo6429(), interfaceC2961);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2960 m6882(Object obj) {
        InterfaceC2960 interfaceC2960Mo6428;
        C2968 c2968 = this.f9804;
        synchronized (c2968) {
            try {
                AbstractC7989.m13470(obj);
                InterfaceC2961 interfaceC2961 = (InterfaceC2961) ((HashMap) c2968.f9385).get(obj.getClass());
                if (interfaceC2961 == null) {
                    Iterator it = ((HashMap) c2968.f9385).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC2961 interfaceC29612 = (InterfaceC2961) it.next();
                        if (interfaceC29612.mo6429().isAssignableFrom(obj.getClass())) {
                            interfaceC2961 = interfaceC29612;
                            break;
                        }
                    }
                }
                if (interfaceC2961 == null) {
                    interfaceC2961 = C2968.f9384;
                }
                interfaceC2960Mo6428 = interfaceC2961.mo6428(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2960Mo6428;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6883(Class cls, Class cls2, InterfaceC8077 interfaceC8077) {
        C1562 c1562 = this.f9803;
        synchronized (c1562) {
            c1562.f4600.add(new C8076(cls, cls2, interfaceC8077));
        }
    }
}
