package com.bumptech.glide.load.engine;

import androidx.compose.ui.graphics.vector.C1562;
import com.bumptech.glide.C3067;
import com.bumptech.glide.C3069;
import com.bumptech.glide.Priority;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p222.C7991;
import p223.C7993;
import p223.C7994;
import p226.C8004;
import p228.C8036;
import p228.InterfaceC8033;
import p233.C8075;
import p233.C8076;
import p233.InterfaceC8077;
import p286.C8397;
import p286.InterfaceC8393;
import p286.InterfaceC8399;
import p336.C8791;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3011 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f9557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f9558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f9559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3069 f9560;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public InterfaceC8393 f9563;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f9564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f9565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f9566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public Priority f9567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C3013 f9568;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C3004 f9569;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Class f9570;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Class f9571;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f9572;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8397 f9573;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Map f9574;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9562 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f9561 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC8399 m6503(Class cls) {
        InterfaceC8399 interfaceC8399 = (InterfaceC8399) this.f9574.get(cls);
        if (interfaceC8399 == null) {
            Iterator it = this.f9574.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC8399 = (InterfaceC8399) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC8399 != null) {
            return interfaceC8399;
        }
        if (!this.f9574.isEmpty() || !this.f9565) {
            return C8004.f22105;
        }
        C8791.m14472(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.f22085;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p286.InterfaceC8396 m6504(java.lang.Object r5) {
        /*
            r4 = this;
            com.bumptech.glide.飘花落叶言子楪苏哲世兰 r4 = r4.f9560
            com.bumptech.glide.飘花落叶言子楪苏兰世哲 r4 = r4.m6884()
            androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰 r4 = r4.f9807
            java.lang.Class r0 = r5.getClass()
            monitor-enter(r4)
            java.util.ArrayList r1 = r4.f4600     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            飘花落叶言楪世哲子兰苏.飘花落叶言子楪世苏哲兰 r2 = (p223.C7995) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r3 = r2.f22086     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L13
            飘花落叶言楪子兰哲苏世.飘花落叶言子楪世苏哲兰 r0 = r2.f22085     // Catch: java.lang.Throwable -> L2b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C3011.m6504(java.lang.Object):飘花落叶言楪子兰哲苏世.飘花落叶言子楪世苏哲兰");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3001 m6505(Class cls) {
        C3001 c3001;
        Class cls2;
        Class cls3;
        Class cls4;
        C3001 c30012;
        ArrayList arrayList;
        InterfaceC8077 interfaceC8077;
        Class cls5 = cls;
        C3067 c3067M6884 = this.f9560.m6884();
        Class cls6 = this.f9570;
        Class cls7 = this.f9571;
        C7994 c7994 = c3067M6884.f9811;
        C7991 c7991 = (C7991) c7994.f22083.getAndSet(null);
        if (c7991 == null) {
            c7991 = new C7991();
        }
        c7991.f22076 = cls5;
        c7991.f22075 = cls6;
        c7991.f22074 = cls7;
        synchronized (c7994.f22084) {
            c3001 = (C3001) c7994.f22084.get(c7991);
        }
        c7994.f22083.set(c7991);
        c3067M6884.f9811.getClass();
        if (C7994.f22082.equals(c3001)) {
            return null;
        }
        if (c3001 != null) {
            return c3001;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : c3067M6884.f9806.m9757(cls5, cls6)) {
            for (Class cls9 : c3067M6884.f9803.m2850(cls8, cls7)) {
                C4871 c4871 = c3067M6884.f9806;
                synchronized (c4871) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) c4871.f14164).iterator();
                    while (it.hasNext()) {
                        List<C7993> list = (List) ((HashMap) c4871.f14165).get((String) it.next());
                        if (list != null) {
                            for (C7993 c7993 : list) {
                                if (c7993.f22081.isAssignableFrom(cls5) && cls8.isAssignableFrom(c7993.f22080)) {
                                    arrayList.add(c7993.f22079);
                                }
                            }
                        }
                    }
                }
                C1562 c1562 = c3067M6884.f9803;
                synchronized (c1562) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (C8076 c8076 : c1562.f4600) {
                            if (c8076.f22265.isAssignableFrom(cls8) && cls9.isAssignableFrom(c8076.f22264)) {
                                interfaceC8077 = c8076.f22263;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    interfaceC8077 = C8075.f22261;
                }
                arrayList2.add(new C3012(cls5, cls8, cls9, arrayList, interfaceC8077, c3067M6884.f9812));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c30012 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            c30012 = new C3001(cls2, cls3, cls4, arrayList2, c3067M6884.f9812);
        }
        C7994 c79942 = c3067M6884.f9811;
        synchronized (c79942.f22084) {
            c79942.f22084.put(new C7991(cls2, cls3, cls4), c30012 != null ? c30012 : C7994.f22082);
        }
        return c30012;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m6506() {
        boolean z = this.f9572;
        ArrayList arrayList = this.f9562;
        if (!z) {
            this.f9572 = true;
            arrayList.clear();
            List listM6875 = this.f9560.m6884().m6875(this.f9559);
            int size = listM6875.size();
            for (int i = 0; i < size; i++) {
                C8036 c8036Mo13502 = ((InterfaceC8033) listM6875.get(i)).mo13502(this.f9559, this.f9558, this.f9557, this.f9573);
                if (c8036Mo13502 != null) {
                    arrayList.add(c8036Mo13502);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList m6507() {
        boolean z = this.f9564;
        ArrayList arrayList = this.f9561;
        if (!z) {
            this.f9564 = true;
            arrayList.clear();
            ArrayList arrayListM6506 = m6506();
            int size = arrayListM6506.size();
            for (int i = 0; i < size; i++) {
                C8036 c8036 = (C8036) arrayListM6506.get(i);
                InterfaceC8393 interfaceC8393 = c8036.f22188;
                List list = c8036.f22187;
                if (!arrayList.contains(interfaceC8393)) {
                    arrayList.add(c8036.f22188);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((InterfaceC8393) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }
}
