package p242q8;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p125i8.C2002f;

/* JADX INFO: renamed from: q8.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3460o {

    /* JADX INFO: renamed from: a */
    public final C2002f f11225a;

    /* JADX INFO: renamed from: b */
    public volatile WeakReference f11226b = new WeakReference(null);

    /* JADX INFO: renamed from: c */
    public volatile boolean f11227c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3460o(C2002f c2002f) {
        this.f11225a = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Activity m7263a() {
        WeakReference weakReference = this.f11226b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }
}
