package p115X0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p051J.InputConnectionC0830v;

/* JADX INFO: renamed from: X0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1640o extends InputConnectionC1639n {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            inputConnectionC0830v.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnectionC0830v inputConnectionC0830v = this.f5635b;
        if (inputConnectionC0830v != null) {
            return inputConnectionC0830v.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
