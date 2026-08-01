package p339x6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p193n3.AbstractC5489b;

/* JADX INFO: renamed from: x6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9452e {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32124a = AtomicReferenceFieldUpdater.newUpdater(C9452e.class, Object.class, "curRef");
    private volatile /* synthetic */ Object curRef = new C9453f(8);

    /* JADX INFO: renamed from: a */
    public final boolean m36827a(Object obj) {
        obj.getClass();
        while (true) {
            C9453f c9453f = (C9453f) this.curRef;
            int iM36831a = c9453f.m36831a(obj);
            if (iM36831a == 0) {
                return true;
            }
            if (iM36831a == 1) {
                AbstractC5489b.m22334a(f32124a, this, c9453f, c9453f.m36838h());
            } else if (iM36831a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36828b() {
        while (true) {
            C9453f c9453f = (C9453f) this.curRef;
            if (c9453f.m36834d()) {
                return;
            } else {
                AbstractC5489b.m22334a(f32124a, this, c9453f, c9453f.m36838h());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36829c() {
        return ((C9453f) this.curRef).m36836f();
    }

    /* JADX INFO: renamed from: d */
    public final Object m36830d() {
        while (true) {
            C9453f c9453f = (C9453f) this.curRef;
            Object objM36839i = c9453f.m36839i();
            if (objM36839i != C9453f.f32128g) {
                return objM36839i;
            }
            AbstractC5489b.m22334a(f32124a, this, c9453f, c9453f.m36838h());
        }
    }
}
