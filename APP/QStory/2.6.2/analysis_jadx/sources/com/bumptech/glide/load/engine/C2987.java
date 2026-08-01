package com.bumptech.glide.load.engine;

import androidx.collection.C0257;
import com.bumptech.glide.C3066;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import lin.xposed.hook.javaplugin.C5553;
import p222.C7990;
import p228.C8024;
import p228.C8035;
import p228.InterfaceC8032;
import p286.InterfaceC8392;
import p286.InterfaceC8398;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2987 implements InterfaceC2991, InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C2986 f9449;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8392 f9450;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9451 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8035 f9452;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9453;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9454;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3010 f9456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RunnableC3014 f9458;

    public C2987(C3010 c3010, RunnableC3014 runnableC3014) {
        this.f9456 = c3010;
        this.f9458 = runnableC3014;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    public final void cancel() {
        C8035 c8035 = this.f9452;
        if (c8035 != null) {
            c8035.f22189.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6376(Object obj) {
        this.f9458.mo6417(this.f9450, obj, this.f9452.f22189, DataSource.RESOURCE_DISK_CACHE, this.f9449);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6377(Exception exc) {
        this.f9458.mo6418(this.f9449, exc, this.f9452.f22189, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo6411() {
        List list;
        ArrayList arrayListM13482;
        ArrayList arrayListM6447 = this.f9456.m6447();
        boolean z = false;
        if (!arrayListM6447.isEmpty()) {
            C3010 c3010 = this.f9456;
            C3066 c3066M6897 = c3010.f9558.m6897();
            Class<?> cls = c3010.f9557.getClass();
            Class cls2 = c3010.f9568;
            Class cls3 = c3010.f9569;
            C4870 c4870 = c3066M6897.f9804;
            C7990 c7990 = (C7990) ((AtomicReference) c4870.f14160).getAndSet(null);
            if (c7990 == null) {
                c7990 = new C7990(cls, cls2, cls3);
            } else {
                c7990.f22079 = cls;
                c7990.f22078 = cls2;
                c7990.f22077 = cls3;
            }
            synchronized (((C0257) c4870.f14161)) {
                list = (List) ((C0257) c4870.f14161).get(c7990);
            }
            ((AtomicReference) c4870.f14160).set(c7990);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                C8024 c8024 = c3066M6897.f9803;
                synchronized (c8024) {
                    arrayListM13482 = c8024.f22163.m13482(cls);
                }
                Iterator it = arrayListM13482.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : c3066M6897.f9801.m9765((Class) it.next(), cls2)) {
                        if (!c3066M6897.f9798.m2840(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                C4870 c48702 = c3066M6897.f9804;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0257) c48702.f14161)) {
                    ((C0257) c48702.f14161).put(new C7990(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f9454;
                    if (list3 != null && this.f9455 < list3.size()) {
                        this.f9452 = null;
                        while (!z && this.f9455 < this.f9454.size()) {
                            List list4 = this.f9454;
                            int i = this.f9455;
                            this.f9455 = i + 1;
                            InterfaceC8032 interfaceC8032 = (InterfaceC8032) list4.get(i);
                            File file = this.f9453;
                            C3010 c30102 = this.f9456;
                            this.f9452 = interfaceC8032.mo13474(file, c30102.f9556, c30102.f9555, c30102.f9571);
                            if (this.f9452 != null && this.f9456.m6445(this.f9452.f22189.mo6375()) != null) {
                                this.f9452.f22189.mo6372(this.f9456.f9565, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f9451 + 1;
                    this.f9451 = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f9457 + 1;
                        this.f9457 = i3;
                        if (i3 >= arrayListM6447.size()) {
                            break;
                        }
                        this.f9451 = 0;
                    }
                    InterfaceC8392 interfaceC8392 = (InterfaceC8392) arrayListM6447.get(this.f9457);
                    Class cls5 = (Class) list2.get(this.f9451);
                    InterfaceC8398 interfaceC8398M6443 = this.f9456.m6443(cls5);
                    C3010 c30103 = this.f9456;
                    this.f9449 = new C2986(c30103.f9558.f9816, interfaceC8392, c30103.f9561, c30103.f9556, c30103.f9555, interfaceC8398M6443, cls5, c30103.f9571);
                    File fileMo11638 = c30103.f9567.m6428().mo11638(this.f9449);
                    this.f9453 = fileMo11638;
                    if (fileMo11638 != null) {
                        this.f9450 = interfaceC8392;
                        this.f9454 = this.f9456.f9558.m6897().m6888(fileMo11638);
                        this.f9455 = 0;
                    }
                }
            } else if (!File.class.equals(this.f9456.f9569)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.f9456.f9557.getClass());
                C5553.m10824(sb, " to ", this.f9456.f9569);
                return false;
            }
        }
        return false;
    }
}
