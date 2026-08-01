package p086r0;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: r0.z1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0961z1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0822A1 f3455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EditText f3457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3458d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f3459e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f3460f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0961z1(C0822A1 c0822a1, Object obj, EditText editText, int i2, Activity activity, boolean z2) {
        this.f3455a = c0822a1;
        this.f3456b = obj;
        this.f3457c = editText;
        this.f3458d = i2;
        this.f3459e = activity;
        this.f3460f = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Editable text;
        C0822A1 c0822a1 = this.f3455a;
        c0822a1.getClass();
        EditText editText = this.f3457c;
        boolean zIsAttachedToWindow = editText.isAttachedToWindow();
        Object obj = this.f3456b;
        Activity activity = this.f3459e;
        boolean z2 = this.f3460f;
        if (!zIsAttachedToWindow || !editText.isShown() || (!editText.hasFocus() && ((text = editText.getText()) == null || text.length() <= 0))) {
            View view = obj instanceof View ? (View) obj : null;
            if (view != null && view.isAttachedToWindow() && view.isShown() && view.hasWindowFocus()) {
                int i2 = this.f3458d;
                if (i2 < 8) {
                    C0822A1.m1497a(activity, obj, editText);
                    int i3 = i2 + 1;
                    c0822a1.f2742c.postDelayed(new RunnableC0961z1(c0822a1, obj, editText, i3, activity, z2), i3 == 0 ? 220L : 120L);
                    return;
                }
            }
        }
        c0822a1.m1501d(activity, z2);
    }
}
