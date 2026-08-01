package com.bumptech.glide;

import androidx.compose.ui.graphics.vector.C1562;
import androidx.core.util.C2184;
import com.bumptech.glide.load.data.C2967;
import com.bumptech.glide.load.data.InterfaceC2959;
import com.bumptech.glide.load.data.InterfaceC2960;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p075.C6957;
import p075.C6960;
import p193.C7827;
import p222.AbstractC7988;
import p223.C7991;
import p223.C7992;
import p223.C7993;
import p223.C7994;
import p228.C8024;
import p228.C8025;
import p228.C8026;
import p228.C8029;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import p233.C8075;
import p233.InterfaceC8076;
import p286.InterfaceC8395;
import p286.InterfaceC8399;
import p286.InterfaceC8400;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1562 f9798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2967 f9799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1562 f9800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4870 f9801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1562 f9802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8024 f9803;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1562 f9805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7827 f9807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4870 f9804 = new C4870(27);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7993 f9806 = new C7993();

    public C3066() {
        int i = 11;
        C7827 c7827 = new C7827(new C2184(20), new C6957(i), new C6960(i));
        this.f9807 = c7827;
        this.f9803 = new C8024(c7827);
        this.f9802 = new C1562(7, false);
        this.f9801 = new C4870(28);
        this.f9800 = new C1562(9, false);
        this.f9799 = new C2967();
        this.f9798 = new C1562(10, false);
        this.f9805 = new C1562(8, false);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C4870 c4870 = this.f9801;
        synchronized (c4870) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c4870.f14160);
                ((ArrayList) c4870.f14160).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c4870.f14160).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c4870.f14160).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m6888(Object obj) {
        List listUnmodifiableList;
        C8024 c8024 = this.f9803;
        c8024.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c8024) {
            C8025 c8025 = (C8025) c8024.f22162.f9821.get(cls);
            listUnmodifiableList = c8025 == null ? null : c8025.f22164;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c8024.f22163.m13484(cls));
                if (((C8025) c8024.f22162.f9821.put(cls, new C8025(listUnmodifiableList))) != null) {
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
            InterfaceC8032 interfaceC8032 = (InterfaceC8032) listUnmodifiableList.get(i);
            if (interfaceC8032.mo13473(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC8032);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj, (List<InterfaceC8032>) listUnmodifiableList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m6889() {
        ArrayList arrayList;
        C1562 c1562 = this.f9805;
        synchronized (c1562) {
            arrayList = c1562.f4599;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6890(String str, Class cls, Class cls2, InterfaceC8399 interfaceC8399) {
        C4870 c4870 = this.f9801;
        synchronized (c4870) {
            c4870.m9766(str).add(new C7992(cls, cls2, interfaceC8399));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6891(Class cls, InterfaceC8400 interfaceC8400) {
        C1562 c1562 = this.f9800;
        synchronized (c1562) {
            c1562.f4599.add(new C7991(cls, interfaceC8400));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6892(Class cls, InterfaceC8395 interfaceC8395) {
        C1562 c1562 = this.f9802;
        synchronized (c1562) {
            c1562.f4599.add(new C7994(cls, interfaceC8395));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m6893(Class cls, Class cls2, InterfaceC8033 interfaceC8033) {
        C8024 c8024 = this.f9803;
        synchronized (c8024) {
            C8026 c8026 = c8024.f22163;
            synchronized (c8026) {
                try {
                    C8029 c8029 = new C8029(cls, cls2, interfaceC8033);
                    ArrayList arrayList = c8026.f22170;
                    arrayList.add(arrayList.size(), c8029);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8024.f22162.f9821.clear();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m6894(InterfaceC2960 interfaceC2960) {
        C2967 c2967 = this.f9799;
        synchronized (c2967) {
            ((HashMap) c2967.f9383).put(interfaceC2960.mo6371(), interfaceC2960);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2959 m6895(Object obj) {
        InterfaceC2959 interfaceC2959Mo6370;
        C2967 c2967 = this.f9799;
        synchronized (c2967) {
            try {
                AbstractC7988.m13442(obj);
                InterfaceC2960 interfaceC2960 = (InterfaceC2960) ((HashMap) c2967.f9383).get(obj.getClass());
                if (interfaceC2960 == null) {
                    Iterator it = ((HashMap) c2967.f9383).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC2960 interfaceC29602 = (InterfaceC2960) it.next();
                        if (interfaceC29602.mo6371().isAssignableFrom(obj.getClass())) {
                            interfaceC2960 = interfaceC29602;
                            break;
                        }
                    }
                }
                if (interfaceC2960 == null) {
                    interfaceC2960 = C2967.f9382;
                }
                interfaceC2959Mo6370 = interfaceC2960.mo6370(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2959Mo6370;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6896(Class cls, Class cls2, InterfaceC8076 interfaceC8076) {
        C1562 c1562 = this.f9798;
        synchronized (c1562) {
            c1562.f4599.add(new C8075(cls, cls2, interfaceC8076));
        }
    }
}
