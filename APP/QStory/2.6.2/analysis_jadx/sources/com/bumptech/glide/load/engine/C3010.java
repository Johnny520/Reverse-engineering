package com.bumptech.glide.load.engine;

import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.C3066;
import com.bumptech.glide.C3068;
import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p222.C7990;
import p223.C7992;
import p223.C7993;
import p226.C8003;
import p228.C8035;
import p228.InterfaceC8032;
import p233.C8074;
import p233.C8075;
import p233.InterfaceC8076;
import p286.C8396;
import p286.InterfaceC8392;
import p286.InterfaceC8398;
import p330.C8796;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3010 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f9556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f9557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3068 f9558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC8392 f9561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f9562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f9563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Priority f9565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3012 f9566;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3003 f9567;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Class f9568;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Class f9569;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f9570;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8396 f9571;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Map f9572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9560 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f9559 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC8398 m6443(Class cls) {
        InterfaceC8398 interfaceC8398 = (InterfaceC8398) this.f9572.get(cls);
        if (interfaceC8398 == null) {
            Iterator it = this.f9572.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC8398 = (InterfaceC8398) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC8398 != null) {
            return interfaceC8398;
        }
        if (!this.f9572.isEmpty() || !this.f9563) {
            return C8003.f22108;
        }
        C8796.m14448(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.f22088;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p286.InterfaceC8395 m6444(java.lang.Object r5) {
        /*
            r4 = this;
            com.bumptech.glide.飘花落叶言子楪苏哲世兰 r4 = r4.f9558
            com.bumptech.glide.飘花落叶言子楪苏兰世哲 r4 = r4.m6897()
            androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰 r4 = r4.f9802
            java.lang.Class r0 = r5.getClass()
            monitor-enter(r4)
            java.util.ArrayList r1 = r4.f4599     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            飘花落叶言楪世哲子兰苏.飘花落叶言子楪世苏哲兰 r2 = (p223.C7994) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r3 = r2.f22089     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L13
            飘花落叶言楪子兰哲苏世.飘花落叶言子楪世苏哲兰 r0 = r2.f22088     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            goto L2f
        L2b:
            r5 = move-exception
            goto L3c
        L2d:
            monitor-exit(r4)
            r0 = 0
        L2f:
            if (r0 == 0) goto L32
            return r0
        L32:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r4 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r5 = r5.getClass()
            r4.<init>(r5)
            throw r4
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C3010.m6444(java.lang.Object):飘花落叶言楪子兰哲苏世.飘花落叶言子楪世苏哲兰");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3000 m6445(Class cls) {
        C3000 c3000;
        Class cls2;
        Class cls3;
        Class cls4;
        C3000 c30002;
        ArrayList arrayList;
        InterfaceC8076 interfaceC8076;
        Class cls5 = cls;
        C3066 c3066M6897 = this.f9558.m6897();
        Class cls6 = this.f9568;
        Class cls7 = this.f9569;
        C7993 c7993 = c3066M6897.f9806;
        C7990 c7990 = (C7990) c7993.f22086.getAndSet(null);
        if (c7990 == null) {
            c7990 = new C7990();
        }
        c7990.f22079 = cls5;
        c7990.f22078 = cls6;
        c7990.f22077 = cls7;
        synchronized (c7993.f22087) {
            c3000 = (C3000) c7993.f22087.get(c7990);
        }
        c7993.f22086.set(c7990);
        c3066M6897.f9806.getClass();
        if (C7993.f22085.equals(c3000)) {
            return null;
        }
        if (c3000 != null) {
            return c3000;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c3066M6897.f9801.m9765(cls5, cls6)) {
            for (Class cls9 : c3066M6897.f9798.m2840(cls8, cls7)) {
                C4870 c4870 = c3066M6897.f9801;
                synchronized (c4870) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c4870.f14160).iterator();
                    while (it.hasNext()) {
                        List<C7992> list = (List) ((HashMap) c4870.f14161).get((String) it.next());
                        if (list != null) {
                            for (C7992 c7992 : list) {
                                if (c7992.f22084.isAssignableFrom(cls5) && cls8.isAssignableFrom(c7992.f22083)) {
                                    arrayList.add(c7992.f22082);
                                }
                            }
                        }
                    }
                }
                C1562 c1562 = c3066M6897.f9798;
                synchronized (c1562) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C8075 c8075 : c1562.f4599) {
                            if (c8075.f22267.isAssignableFrom(cls8) && cls9.isAssignableFrom(c8075.f22266)) {
                                interfaceC8076 = c8075.f22265;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC8076 = C8074.f22263;
                }
                arrayList2.add(new C3011(cls5, cls8, cls9, arrayList, interfaceC8076, c3066M6897.f9807));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c30002 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c30002 = new C3000(cls2, cls3, cls4, arrayList2, c3066M6897.f9807);
        }
        C7993 c79932 = c3066M6897.f9806;
        synchronized (c79932.f22087) {
            c79932.f22087.put(new C7990(cls2, cls3, cls4), c30002 != null ? c30002 : C7993.f22085);
        }
        return c30002;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m6446() {
        boolean z = this.f9570;
        ArrayList arrayList = this.f9560;
        if (!z) {
            this.f9570 = true;
            arrayList.clear();
            List listM6888 = this.f9558.m6897().m6888(this.f9557);
            int size = listM6888.size();
            for (int i = 0; i < size; i++) {
                C8035 c8035Mo13474 = ((InterfaceC8032) listM6888.get(i)).mo13474(this.f9557, this.f9556, this.f9555, this.f9571);
                if (c8035Mo13474 != null) {
                    arrayList.add(c8035Mo13474);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m6447() {
        boolean z = this.f9562;
        ArrayList arrayList = this.f9559;
        if (!z) {
            this.f9562 = true;
            arrayList.clear();
            ArrayList arrayListM6446 = m6446();
            int size = arrayListM6446.size();
            for (int i = 0; i < size; i++) {
                C8035 c8035 = (C8035) arrayListM6446.get(i);
                InterfaceC8392 interfaceC8392 = c8035.f22191;
                List list = c8035.f22190;
                if (!arrayList.contains(interfaceC8392)) {
                    arrayList.add(c8035.f22191);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC8392) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }
}
