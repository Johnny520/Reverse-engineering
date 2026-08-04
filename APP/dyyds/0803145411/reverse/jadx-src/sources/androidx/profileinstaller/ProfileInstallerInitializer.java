package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import yyds.C0805;
import yyds.InterfaceC1283;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1283 {
    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final List mo116() {
        return Collections.EMPTY_LIST;
    }

    @Override // yyds.InterfaceC1283
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo117(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: yyds.ᲇᛵᛸᛷ
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
                int iNextInt = new Random().nextInt(Math.max(1000, 1));
                handlerCreateAsync.postDelayed(new RunnableC1520(applicationContext, 1), iNextInt + 5000);
            }
        });
        return new C0805(22);
    }
}
