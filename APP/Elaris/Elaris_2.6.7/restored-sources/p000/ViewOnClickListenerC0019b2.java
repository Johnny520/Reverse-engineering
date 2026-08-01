package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0019b2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0019b2(Object obj, Object obj2, int i) {
        this.f54a = i;
        this.f55b = obj;
        this.f56c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f54a) {
            case 0:
                C0193e2 c0193e2 = (C0193e2) this.f55b;
                EditText editText = (EditText) this.f56c;
                AbstractC0225g2.m424j(c0193e2, editText.getText() == null ? "" : editText.getText().toString());
                break;
            case 1:
                AbstractC0225g2.m429o((C0193e2) this.f55b, (C0307l1) this.f56c);
                break;
            default:
                C0507ve c0507ve = (C0507ve) this.f55b;
                c0507ve.f977a = true;
                Thread thread = c0507ve.f978b;
                if (thread != null) {
                    thread.interrupt();
                }
                try {
                    ((Dialog) this.f56c).dismiss();
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }
}
