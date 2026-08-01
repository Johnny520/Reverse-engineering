package p018b3;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: b3.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0952g0 extends C0944d0 {
    public C0952g0(InputConnection inputConnection, InterfaceC0184l interfaceC0184l) {
        super(inputConnection, interfaceC0184l);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnectionM3458c = m3458c();
        if (inputConnectionM3458c != null) {
            inputConnectionM3458c.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection inputConnectionM3458c = m3458c();
        if (inputConnectionM3458c != null) {
            return inputConnectionM3458c.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
