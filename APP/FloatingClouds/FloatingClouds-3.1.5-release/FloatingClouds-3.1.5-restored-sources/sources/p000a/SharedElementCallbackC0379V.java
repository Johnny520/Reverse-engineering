package p000a;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: a.V */
/* JADX INFO: loaded from: classes.dex */
public final class SharedElementCallbackC0379V extends SharedElementCallback {
    public SharedElementCallbackC0379V(AbstractC0484ae abstractC0484ae) {
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List<View> list) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        throw null;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        throw null;
    }
}
