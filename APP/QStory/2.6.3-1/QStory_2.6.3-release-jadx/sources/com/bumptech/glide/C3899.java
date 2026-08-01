package com.bumptech.glide;

import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.core.util.C3017;
import com.bumptech.glide.load.data.C3800;
import com.bumptech.glide.load.data.InterfaceC3792;
import com.bumptech.glide.load.data.InterfaceC3793;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p091.C7787;
import p091.C7790;
import p209.C8657;
import p238.AbstractC8818;
import p239.C8821;
import p239.C8822;
import p239.C8823;
import p239.C8824;
import p244.C8854;
import p244.C8855;
import p244.C8856;
import p244.C8859;
import p244.InterfaceC8862;
import p244.InterfaceC8863;
import p249.C8905;
import p249.InterfaceC8906;
import p302.InterfaceC9225;
import p302.InterfaceC9229;
import p302.InterfaceC9230;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2397 f10148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3800 f10149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2397 f10150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5703 f10151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2397 f10152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8854 f10153;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2397 f10155;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8657 f10157;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5703 f10154 = new C5703(27);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8823 f10156 = new C8823();

    public C3899() {
        C8657 c8657 = new C8657(new C3017(20), new C7787(11), new C7790(11));
        this.f10157 = c8657;
        this.f10153 = new C8854(c8657);
        this.f10152 = new C2397(7, false);
        this.f10151 = new C5703(28);
        this.f10150 = new C2397(9, false);
        this.f10149 = new C3800();
        this.f10148 = new C2397(10, false);
        this.f10155 = new C2397(8, false);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C5703 c5703 = this.f10151;
        synchronized (c5703) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c5703.f14509);
                ((ArrayList) c5703.f14509).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c5703.f14509).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c5703.f14509).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List m7435(Object obj) {
        List listUnmodifiableList;
        C8854 c8854 = this.f10153;
        c8854.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c8854) {
            C8855 c8855 = (C8855) c8854.f22504.f10171.get(cls);
            listUnmodifiableList = c8855 == null ? null : c8855.f22506;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(c8854.f22505.m14071(cls));
                if (((C8855) c8854.f22504.f10171.put(cls, new C8855(listUnmodifiableList))) != null) {
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
            InterfaceC8862 interfaceC8862 = (InterfaceC8862) listUnmodifiableList.get(i);
            if (interfaceC8862.mo14060(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC8862);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj, (List<InterfaceC8862>) listUnmodifiableList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList m7436() {
        ArrayList arrayList;
        C2397 c2397 = this.f10155;
        synchronized (c2397) {
            arrayList = c2397.f4945;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m7437(String str, Class cls, Class cls2, InterfaceC9229 interfaceC9229) {
        C5703 c5703 = this.f10151;
        synchronized (c5703) {
            c5703.m10317(str).add(new C8822(cls, cls2, interfaceC9229));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m7438(Class cls, InterfaceC9230 interfaceC9230) {
        C2397 c2397 = this.f10150;
        synchronized (c2397) {
            c2397.f4945.add(new C8821(cls, interfaceC9230));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7439(Class cls, InterfaceC9225 interfaceC9225) {
        C2397 c2397 = this.f10152;
        synchronized (c2397) {
            c2397.f4945.add(new C8824(cls, interfaceC9225));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7440(Class cls, Class cls2, InterfaceC8863 interfaceC8863) {
        C8854 c8854 = this.f10153;
        synchronized (c8854) {
            C8856 c8856 = c8854.f22505;
            synchronized (c8856) {
                try {
                    C8859 c8859 = new C8859(cls, cls2, interfaceC8863);
                    ArrayList arrayList = c8856.f22512;
                    arrayList.add(arrayList.size(), c8859);
                } catch (Throwable th) {
                    throw th;
                }
            }
            c8854.f22504.f10171.clear();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7441(InterfaceC3793 interfaceC3793) {
        C3800 c3800 = this.f10149;
        synchronized (c3800) {
            ((HashMap) c3800.f9730).put(interfaceC3793.mo6989(), interfaceC3793);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3792 m7442(Object obj) {
        InterfaceC3792 interfaceC3792Mo6988;
        C3800 c3800 = this.f10149;
        synchronized (c3800) {
            try {
                AbstractC8818.m14029(obj);
                InterfaceC3793 interfaceC3793 = (InterfaceC3793) ((HashMap) c3800.f9730).get(obj.getClass());
                if (interfaceC3793 == null) {
                    Iterator it = ((HashMap) c3800.f9730).values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC3793 interfaceC37932 = (InterfaceC3793) it.next();
                        if (interfaceC37932.mo6989().isAssignableFrom(obj.getClass())) {
                            interfaceC3793 = interfaceC37932;
                            break;
                        }
                    }
                }
                if (interfaceC3793 == null) {
                    interfaceC3793 = C3800.f9729;
                }
                interfaceC3792Mo6988 = interfaceC3793.mo6988(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC3792Mo6988;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m7443(Class cls, Class cls2, InterfaceC8906 interfaceC8906) {
        C2397 c2397 = this.f10148;
        synchronized (c2397) {
            c2397.f4945.add(new C8905(cls, cls2, interfaceC8906));
        }
    }
}
