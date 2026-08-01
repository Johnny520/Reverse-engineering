package com.bumptech.glide.load.engine;

import androidx.collection.C0257;
import com.bumptech.glide.C3067;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import lin.xposed.hook.javaplugin.C5554;
import p222.C7991;
import p228.C8025;
import p228.C8036;
import p228.InterfaceC8033;
import p286.InterfaceC8393;
import p286.InterfaceC8399;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2988 implements InterfaceC2992, InterfaceC2963 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C2987 f9451;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8393 f9452;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9453 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8036 f9454;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9455;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9456;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3011 f9458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RunnableC3015 f9460;

    public C2988(C3011 c3011, RunnableC3015 runnableC3015) {
        this.f9458 = c3011;
        this.f9460 = runnableC3015;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    public final void cancel() {
        C8036 c8036 = this.f9454;
        if (c8036 != null) {
            c8036.f22186.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6434(Object obj) {
        this.f9460.mo6475(this.f9452, obj, this.f9454.f22186, DataSource.RESOURCE_DISK_CACHE, this.f9451);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6435(Exception exc) {
        this.f9460.mo6476(this.f9451, exc, this.f9454.f22186, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo6469() {
        List list;
        ArrayList arrayListM13510;
        ArrayList arrayListM6507 = this.f9458.m6507();
        boolean z = false;
        if (!arrayListM6507.isEmpty()) {
            C3011 c3011 = this.f9458;
            C3067 c3067M6884 = c3011.f9560.m6884();
            Class<?> cls = c3011.f9559.getClass();
            Class cls2 = c3011.f9570;
            Class cls3 = c3011.f9571;
            C4871 c4871 = c3067M6884.f9809;
            C7991 c7991 = (C7991) ((AtomicReference) c4871.f14164).getAndSet(null);
            if (c7991 == null) {
                c7991 = new C7991(cls, cls2, cls3);
            } else {
                c7991.f22076 = cls;
                c7991.f22075 = cls2;
                c7991.f22074 = cls3;
            }
            synchronized (((C0257) c4871.f14165)) {
                list = (List) ((C0257) c4871.f14165).get(c7991);
            }
            ((AtomicReference) c4871.f14164).set(c7991);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C8025 c8025 = c3067M6884.f9808;
                synchronized (c8025) {
                    arrayListM13510 = c8025.f22160.m13510(cls);
                }
                Iterator it = arrayListM13510.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c3067M6884.f9806.m9757((Class) it.next(), cls2)) {
                        if (!c3067M6884.f9803.m2850(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C4871 c48712 = c3067M6884.f9809;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0257) c48712.f14165)) {
                    ((C0257) c48712.f14165).put(new C7991(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f9456;
                    if (list3 != null && this.f9457 < list3.size()) {
                        this.f9454 = null;
                        while (!z && this.f9457 < this.f9456.size()) {
                            List list4 = this.f9456;
                            int i = this.f9457;
                            this.f9457 = i + 1;
                            InterfaceC8033 interfaceC8033 = (InterfaceC8033) list4.get(i);
                            File file = this.f9455;
                            C3011 c30112 = this.f9458;
                            this.f9454 = interfaceC8033.mo13502(file, c30112.f9558, c30112.f9557, c30112.f9573);
                            if (this.f9454 != null && this.f9458.m6505(this.f9454.f22186.mo6433()) != null) {
                                this.f9454.f22186.mo6430(this.f9458.f9567, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f9453 + 1;
                    this.f9453 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f9459 + 1;
                        this.f9459 = i3;
                        if (i3 >= arrayListM6507.size()) {
                            break;
                        }
                        this.f9453 = 0;
                    }
                    InterfaceC8393 interfaceC8393 = (InterfaceC8393) arrayListM6507.get(this.f9459);
                    Class cls5 = (Class) list2.get(this.f9453);
                    InterfaceC8399 interfaceC8399M6503 = this.f9458.m6503(cls5);
                    C3011 c30113 = this.f9458;
                    this.f9451 = new C2987(c30113.f9560.f9821, interfaceC8393, c30113.f9563, c30113.f9558, c30113.f9557, interfaceC8399M6503, cls5, c30113.f9573);
                    File fileMo11654 = c30113.f9569.m6486().mo11654(this.f9451);
                    this.f9455 = fileMo11654;
                    if (fileMo11654 != null) {
                        this.f9452 = interfaceC8393;
                        this.f9456 = this.f9458.f9560.m6884().m6875(fileMo11654);
                        this.f9457 = 0;
                    }
                }
            } else if (!File.class.equals(this.f9458.f9571)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.f9458.f9559.getClass());
                C5554.m10881(sb, " to ", this.f9458.f9571);
                return false;
            }
        }
        return false;
    }
}
