package p064f0;

import android.os.Build;
import androidx.fragment.app.C0443u;
import java.util.Iterator;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0555a extends AbstractActivityC0533i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (Build.VERSION.SDK_INT >= 29) {
            Iterator itDescendingIterator = this.f898i.f908b.descendingIterator();
            while (itDescendingIterator.hasNext()) {
                if (((C0443u) itDescendingIterator.next()).f1413a) {
                    return;
                }
            }
            finishAfterTransition();
        }
    }
}
