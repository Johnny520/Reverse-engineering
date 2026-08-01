package p004C;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: C.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0061e extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0060d f304a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061e(InputConnection inputConnection, C0060d c0060d) {
        super(inputConnection, false);
        this.f304a = c0060d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        C0066j c0066j = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0066j = new C0066j(0, new C0063g(inputContentInfo));
        }
        if (this.f304a.m108a(c0066j, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
