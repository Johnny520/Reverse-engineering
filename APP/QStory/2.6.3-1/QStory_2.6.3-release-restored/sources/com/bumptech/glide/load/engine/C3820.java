package com.bumptech.glide.load.engine;

import androidx.collection.C1104;
import com.bumptech.glide.C3899;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import lin.xposed.hook.javaplugin.C6385;
import p238.C8820;
import p244.C8854;
import p244.C8865;
import p244.InterfaceC8862;
import p302.InterfaceC9222;
import p302.InterfaceC9228;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3820 implements InterfaceC3824, InterfaceC3795 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C3819 f9796;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC9222 f9797;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9798 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8865 f9799;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9800;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9801;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3843 f9803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RunnableC3847 f9805;

    public C3820(C3843 c3843, RunnableC3847 runnableC3847) {
        this.f9803 = c3843;
        this.f9805 = runnableC3847;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    public final void cancel() {
        C8865 c8865 = this.f9799;
        if (c8865 != null) {
            c8865.f22531.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6994(Object obj) {
        this.f9805.mo7035(this.f9797, obj, this.f9799.f22531, DataSource.RESOURCE_DISK_CACHE, this.f9796);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6995(Exception exc) {
        this.f9805.mo7036(this.f9796, exc, this.f9799.f22531, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo7029() {
        List list;
        ArrayList arrayListM14069;
        ArrayList arrayListM7067 = this.f9803.m7067();
        boolean z = false;
        if (!arrayListM7067.isEmpty()) {
            C3843 c3843 = this.f9803;
            C3899 c3899M7444 = c3843.f9905.m7444();
            Class<?> cls = c3843.f9904.getClass();
            Class cls2 = c3843.f9915;
            Class cls3 = c3843.f9916;
            C5703 c5703 = c3899M7444.f10154;
            C8820 c8820 = (C8820) ((AtomicReference) c5703.f14509).getAndSet(null);
            if (c8820 == null) {
                c8820 = new C8820(cls, cls2, cls3);
            } else {
                c8820.f22421 = cls;
                c8820.f22420 = cls2;
                c8820.f22419 = cls3;
            }
            synchronized (((C1104) c5703.f14510)) {
                list = (List) ((C1104) c5703.f14510).get(c8820);
            }
            ((AtomicReference) c5703.f14509).set(c8820);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C8854 c8854 = c3899M7444.f10153;
                synchronized (c8854) {
                    arrayListM14069 = c8854.f22505.m14069(cls);
                }
                Iterator it = arrayListM14069.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c3899M7444.f10151.m10316((Class) it.next(), cls2)) {
                        if (!c3899M7444.f10148.m3410(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C5703 c57032 = c3899M7444.f10154;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C1104) c57032.f14510)) {
                    ((C1104) c57032.f14510).put(new C8820(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f9801;
                    if (list3 != null && this.f9802 < list3.size()) {
                        this.f9799 = null;
                        while (!z && this.f9802 < this.f9801.size()) {
                            List list4 = this.f9801;
                            int i = this.f9802;
                            this.f9802 = i + 1;
                            InterfaceC8862 interfaceC8862 = (InterfaceC8862) list4.get(i);
                            File file = this.f9800;
                            C3843 c38432 = this.f9803;
                            this.f9799 = interfaceC8862.mo14061(file, c38432.f9903, c38432.f9902, c38432.f9918);
                            if (this.f9799 != null && this.f9803.m7065(this.f9799.f22531.mo6993()) != null) {
                                this.f9799.f22531.mo6990(this.f9803.f9912, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f9798 + 1;
                    this.f9798 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f9804 + 1;
                        this.f9804 = i3;
                        if (i3 >= arrayListM7067.size()) {
                            break;
                        }
                        this.f9798 = 0;
                    }
                    InterfaceC9222 interfaceC9222 = (InterfaceC9222) arrayListM7067.get(this.f9804);
                    Class cls5 = (Class) list2.get(this.f9798);
                    InterfaceC9228 interfaceC9228M7063 = this.f9803.m7063(cls5);
                    C3843 c38433 = this.f9803;
                    this.f9796 = new C3819(c38433.f9905.f10166, interfaceC9222, c38433.f9908, c38433.f9903, c38433.f9902, interfaceC9228M7063, cls5, c38433.f9918);
                    File fileMo12213 = c38433.f9914.m7046().mo12213(this.f9796);
                    this.f9800 = fileMo12213;
                    if (fileMo12213 != null) {
                        this.f9797 = interfaceC9222;
                        this.f9801 = this.f9803.f9905.m7444().m7435(fileMo12213);
                        this.f9802 = 0;
                    }
                }
            } else if (!File.class.equals(this.f9803.f9916)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.f9803.f9904.getClass());
                C6385.m11440(sb, " to ", this.f9803.f9916);
                return false;
            }
        }
        return false;
    }
}
