package p126i8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p141j8.AbstractC3628e;
import p185m8.AbstractC5109u0;
import p193n3.AbstractC5489b;
import p360yb.AbstractC9658a;
import p360yb.InterfaceC9664g;

/* JADX INFO: renamed from: i8.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3290h3 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8962b = AtomicReferenceFieldUpdater.newUpdater(C3290h3.class, Object.class, "a");

    /* JADX INFO: renamed from: a */
    public volatile /* synthetic */ Object f8963a = AbstractC9658a.m37780e(AbstractC5109u0.m20768i());

    /* JADX INFO: renamed from: a */
    public final void m12411a(String str, AbstractC3628e abstractC3628e) {
        Object obj;
        str.getClass();
        abstractC3628e.getClass();
        do {
            obj = this.f8963a;
        } while (!AbstractC5489b.m22334a(f8962b, this, obj, ((InterfaceC9664g) obj).put((Object) str, (Object) abstractC3628e)));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3628e m12412b(String str) {
        str.getClass();
        return (AbstractC3628e) ((InterfaceC9664g) this.f8963a).get(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m12413c(String str) {
        Object obj;
        str.getClass();
        do {
            obj = this.f8963a;
        } while (!AbstractC5489b.m22334a(f8962b, this, obj, ((InterfaceC9664g) obj).remove((Object) str)));
    }
}
