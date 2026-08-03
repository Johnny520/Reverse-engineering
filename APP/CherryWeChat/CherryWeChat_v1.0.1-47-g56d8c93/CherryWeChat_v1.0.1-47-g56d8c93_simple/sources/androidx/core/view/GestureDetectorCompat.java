package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class GestureDetectorCompat {

    /* JADX INFO: renamed from: a */
    public final GestureDetector f3928a;

    public GestureDetectorCompat(Context r2, GestureDetector.OnGestureListener r3) {
        this(r2, r3, null);
    }

    public GestureDetectorCompat(Context r2, GestureDetector.OnGestureListener r3, Handler r4) {
        this.f3928a = new GestureDetector(r2, r3, r4);
    }
}
