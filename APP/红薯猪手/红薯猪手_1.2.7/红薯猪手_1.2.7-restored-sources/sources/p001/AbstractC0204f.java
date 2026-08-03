package p001;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204f<T> {

    /* JADX INFO: renamed from: ۥ */
    public final C0481z7 f773;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0443w8 f774;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final a f1426;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f1427;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final String f1432;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public boolean f1434;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public boolean f1435;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final int f1428 = 0;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final int f1429 = 0;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f1430 = 0;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final Drawable f1431 = null;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final Object f1433 = this;

    /* JADX INFO: renamed from: ۟.f$a */
    public static class a<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: ۥ */
        public final AbstractC0204f f775;

        public a(AbstractC0204f abstractC0204f, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f775 = abstractC0204f;
        }
    }

    public AbstractC0204f(C0481z7 c0481z7, Object obj, C0443w8 c0443w8, String str, boolean z) {
        this.f773 = c0481z7;
        this.f774 = c0443w8;
        this.f1426 = new a(this, obj, c0481z7.f1913);
        this.f1427 = z;
        this.f1432 = str;
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo819() {
        this.f1435 = true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo820(Bitmap bitmap, C0481z7.e eVar);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract void mo1011();

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final T m1061() {
        a aVar = this.f1426;
        if (aVar == null) {
            return null;
        }
        return (T) aVar.get();
    }
}
