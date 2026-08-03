package Yue;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5252<T> extends WeakReference<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC5568
    public final int f1368;

    public C5252(T t, @InterfaceC6489 ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        this.f1368 = t != null ? t.hashCode() : 0;
    }
}
