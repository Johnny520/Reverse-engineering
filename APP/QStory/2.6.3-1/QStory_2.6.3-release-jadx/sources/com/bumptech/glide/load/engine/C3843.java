package com.bumptech.glide.load.engine;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.vector.C2397;
import com.bumptech.glide.C3899;
import com.bumptech.glide.C3901;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry$MissingComponentException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p238.C8820;
import p239.C8822;
import p239.C8823;
import p239.C8824;
import p242.C8833;
import p244.C8865;
import p244.InterfaceC8862;
import p249.C8904;
import p249.C8905;
import p249.InterfaceC8906;
import p302.C9226;
import p302.InterfaceC9222;
import p302.InterfaceC9225;
import p302.InterfaceC9228;
import p352.C9620;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3843 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9902;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f9903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f9904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3901 f9905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC9222 f9908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f9909;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f9910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Priority f9912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3845 f9913;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3836 f9914;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Class f9915;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Class f9916;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f9917;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C9226 f9918;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Map f9919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9907 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f9906 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC9228 m7063(Class cls) {
        InterfaceC9228 interfaceC9228 = (InterfaceC9228) this.f9919.get(cls);
        if (interfaceC9228 == null) {
            Iterator it = this.f9919.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC9228 = (InterfaceC9228) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC9228 != null) {
            return interfaceC9228;
        }
        if (!this.f9919.isEmpty() || !this.f9910) {
            return C8833.f22450;
        }
        C9620.m15031(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.f22430;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC9225 m7064(Object obj) {
        InterfaceC9225 interfaceC9225;
        C2397 c2397 = this.f9905.m7444().f10152;
        Class<?> cls = obj.getClass();
        synchronized (c2397) {
            Iterator it = c2397.f4945.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC9225 = null;
                    break;
                }
                C8824 c8824 = (C8824) it.next();
                if (c8824.f22431.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (interfaceC9225 != null) {
            return interfaceC9225;
        }
        final Class<?> cls2 = obj.getClass();
        throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            {
                super(AbstractC0900.m714(cls2, "Failed to find source encoder for data class: "));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3833 m7065(Class cls) {
        C3833 c3833;
        Class cls2;
        Class cls3;
        Class cls4;
        C3833 c38332;
        ArrayList arrayList;
        InterfaceC8906 interfaceC8906;
        Class cls5 = cls;
        C3899 c3899M7444 = this.f9905.m7444();
        Class cls6 = this.f9915;
        Class cls7 = this.f9916;
        C8823 c8823 = c3899M7444.f10156;
        C8820 c8820 = (C8820) c8823.f22428.getAndSet(null);
        if (c8820 == null) {
            c8820 = new C8820();
        }
        c8820.f22421 = cls5;
        c8820.f22420 = cls6;
        c8820.f22419 = cls7;
        synchronized (c8823.f22429) {
            c3833 = (C3833) c8823.f22429.get(c8820);
        }
        c8823.f22428.set(c8820);
        c3899M7444.f10156.getClass();
        if (C8823.f22427.equals(c3833)) {
            return null;
        }
        if (c3833 != null) {
            return c3833;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c3899M7444.f10151.m10316(cls5, cls6)) {
            for (Class cls9 : c3899M7444.f10148.m3410(cls8, cls7)) {
                C5703 c5703 = c3899M7444.f10151;
                synchronized (c5703) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c5703.f14509).iterator();
                    while (it.hasNext()) {
                        List<C8822> list = (List) ((HashMap) c5703.f14510).get((String) it.next());
                        if (list != null) {
                            for (C8822 c8822 : list) {
                                if (c8822.f22426.isAssignableFrom(cls5) && cls8.isAssignableFrom(c8822.f22425)) {
                                    arrayList.add(c8822.f22424);
                                }
                            }
                        }
                    }
                }
                C2397 c2397 = c3899M7444.f10148;
                synchronized (c2397) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C8905 c8905 : c2397.f4945) {
                            if (c8905.f22610.isAssignableFrom(cls8) && cls9.isAssignableFrom(c8905.f22609)) {
                                interfaceC8906 = c8905.f22608;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC8906 = C8904.f22606;
                }
                arrayList2.add(new C3844(cls5, cls8, cls9, arrayList, interfaceC8906, c3899M7444.f10157));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c38332 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c38332 = new C3833(cls2, cls3, cls4, arrayList2, c3899M7444.f10157);
        }
        C8823 c88232 = c3899M7444.f10156;
        synchronized (c88232.f22429) {
            c88232.f22429.put(new C8820(cls2, cls3, cls4), c38332 != null ? c38332 : C8823.f22427);
        }
        return c38332;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m7066() {
        boolean z = this.f9917;
        ArrayList arrayList = this.f9907;
        if (!z) {
            this.f9917 = true;
            arrayList.clear();
            List listM7435 = this.f9905.m7444().m7435(this.f9904);
            int size = listM7435.size();
            for (int i = 0; i < size; i++) {
                C8865 c8865Mo14061 = ((InterfaceC8862) listM7435.get(i)).mo14061(this.f9904, this.f9903, this.f9902, this.f9918);
                if (c8865Mo14061 != null) {
                    arrayList.add(c8865Mo14061);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m7067() {
        boolean z = this.f9909;
        ArrayList arrayList = this.f9906;
        if (!z) {
            this.f9909 = true;
            arrayList.clear();
            ArrayList arrayListM7066 = m7066();
            int size = arrayListM7066.size();
            for (int i = 0; i < size; i++) {
                C8865 c8865 = (C8865) arrayListM7066.get(i);
                InterfaceC9222 interfaceC9222 = c8865.f22533;
                List list = c8865.f22532;
                if (!arrayList.contains(interfaceC9222)) {
                    arrayList.add(c8865.f22533);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC9222) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }
}
