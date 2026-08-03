package p014b;

import android.os.Build;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0106k;
import androidx.lifecycle.InterfaceC0110o;
import androidx.lifecycle.InterfaceC0112q;
import ci.C0579e;
import gg.C1425u;
import java.util.ArrayList;
import okio.C3193a;
import p117i0.C1819d;
import p117i0.C1897y1;
import p136j8.C2095f;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p249qg.InterfaceC3561f;
import p276sf.C3967n;
import p357y1.AbstractC5937t2;
import tf.C4164k;
import vg.C4554c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: b.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0125d implements InterfaceC0110o {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f326g = 0;

    /* JADX INFO: renamed from: h */
    public final Object f327h;

    /* JADX INFO: renamed from: i */
    public final Object f328i;

    /* JADX INFO: renamed from: j */
    public Object f329j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f330k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0125d(C0127f c0127f, C0114s c0114s, C0128g c0128g) {
        this.f330k = c0127f;
        this.f327h = c0114s;
        this.f328i = c0128g;
        c0114s.m552a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0110o
    /* JADX INFO: renamed from: b */
    public final void mo548b(InterfaceC0112q interfaceC0112q, EnumC0106k enumC0106k) {
        boolean z9;
        switch (this.f326g) {
            case 0:
                if (enumC0106k == EnumC0106k.ON_START) {
                    C0127f c0127f = (C0127f) this.f330k;
                    C0128g c0128g = (C0128g) this.f328i;
                    ((C4164k) c0127f.f336c).addLast(c0128g);
                    C0126e c0126e = new C0126e(c0127f, c0128g);
                    c0128g.f339a.add(c0126e);
                    if (Build.VERSION.SDK_INT >= 33) {
                        c0127f.m652d();
                    }
                    this.f329j = c0126e;
                    return;
                }
                if (enumC0106k == EnumC0106k.ON_STOP) {
                    C0126e c0126e2 = (C0126e) this.f329j;
                    if (c0126e2 != null) {
                        c0126e2.cancel();
                        return;
                    }
                    return;
                }
                if (enumC0106k == EnumC0106k.ON_DESTROY) {
                    ((C0114s) this.f327h).m557f(this);
                    ((C0128g) this.f328i).f339a.remove(this);
                    C0126e c0126e3 = (C0126e) this.f329j;
                    if (c0126e3 != null) {
                        c0126e3.cancel();
                    }
                    this.f329j = null;
                    return;
                }
                return;
            default:
                InterfaceC3561f interfaceC3561fM4670y = null;
                switch (AbstractC5937t2.f24153a[enumC0106k.ordinal()]) {
                    case 1:
                        AbstractC3603v.m7563q((C4554c) this.f327h, null, new C0579e((C1425u) this.f330k, (C1897y1) this.f329j, interfaceC0112q, this, null, 13), 1);
                        return;
                    case 2:
                        C1819d c1819d = (C1819d) this.f328i;
                        if (c1819d != null) {
                            C2095f c2095f = (C2095f) c1819d.f6043i;
                            synchronized (c2095f.f7001b) {
                                try {
                                    synchronized (c2095f.f7001b) {
                                        z9 = c2095f.f7000a;
                                    }
                                    if (!z9) {
                                        ArrayList arrayList = (ArrayList) c2095f.f7002c;
                                        c2095f.f7002c = (ArrayList) c2095f.f7003d;
                                        c2095f.f7003d = arrayList;
                                        c2095f.f7000a = true;
                                        int size = arrayList.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            ((InterfaceC5557c) arrayList.get(i9)).resumeWith(C3967n.f12976a);
                                        }
                                        arrayList.clear();
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        C1897y1 c1897y1 = (C1897y1) this.f329j;
                        synchronized (c1897y1.f6305c) {
                            if (c1897y1.f6322t) {
                                c1897y1.f6322t = false;
                                interfaceC3561fM4670y = c1897y1.m4670y();
                            }
                            break;
                        }
                        if (interfaceC3561fM4670y != null) {
                            ((C3564g) interfaceC3561fM4670y).resumeWith(C3967n.f12976a);
                        }
                        break;
                    case 3:
                        C1897y1 c1897y12 = (C1897y1) this.f329j;
                        synchronized (c1897y12.f6305c) {
                            c1897y12.f6322t = true;
                            break;
                        }
                        break;
                    case 4:
                        ((C1897y1) this.f329j).m4669x();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        C3193a.m6822k();
                        break;
                }
                return;
        }
    }

    public C0125d(C4554c c4554c, C1819d c1819d, C1897y1 c1897y1, C1425u c1425u) {
        this.f327h = c4554c;
        this.f328i = c1819d;
        this.f329j = c1897y1;
        this.f330k = c1425u;
    }
}
