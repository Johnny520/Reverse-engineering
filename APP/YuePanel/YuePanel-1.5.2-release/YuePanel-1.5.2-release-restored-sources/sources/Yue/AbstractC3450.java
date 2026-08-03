package Yue;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public abstract class AbstractC3450<T> extends AbstractC6567 {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f297 = AtomicReferenceFieldUpdater.newUpdater(AbstractC3450.class, Object.class, "_consensus");

    @InterfaceC6399
    private volatile /* synthetic */ Object _consensus = C3449.f295;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟ۢ۠<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.AbstractC6567
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public AbstractC3450<?> mo528() {
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.AbstractC6567
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Object mo9118(@InterfaceC6489 Object obj) {
        Object objM9120 = this._consensus;
        if (objM9120 == C3449.f295) {
            objM9120 = m9120(mo5762(obj));
        }
        mo9119(obj, objM9120);
        return objM9120;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo9119(T t, @InterfaceC6489 Object obj);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Object m9120(@InterfaceC6489 Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C3449.f295;
        return obj2 != obj3 ? obj2 : C3008.m74(f297, this, obj3, obj) ? obj : this._consensus;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Object m9121() {
        return this._consensus;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public long mo9122() {
        return 0L;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m9123() {
        return this._consensus != C3449.f295;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public abstract Object mo5762(T t);
}
