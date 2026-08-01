package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ProgressBar;
import com.bumptech.glide.AbstractC3056;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import p031.DialogC6312;
import p031.DialogC6313;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0103 extends Handler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f285 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0103(DialogC6312 dialogC6312, Looper looper) {
        super(looper);
        this.f284 = dialogC6312;
        new SimpleDateFormat("ss.SSS");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f285) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f284).get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                DialogC6313 dialogC6313 = (DialogC6313) this.f284;
                super.handleMessage(message);
                Object obj = message.obj;
                if (obj instanceof String) {
                    String str = (String) obj;
                    int iHashCode = str.hashCode();
                    if (iHashCode == 68795) {
                        if (str.equals("END")) {
                            dialogC6313.dismiss();
                        }
                    } else if (iHashCode == 79219778 && str.equals("START")) {
                        dialogC6313.show();
                    }
                    dialogC6313.f17406.setText(str);
                    break;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    ProgressBar progressBar = dialogC6313.f17405;
                    if (progressBar != null && i3 > 0) {
                        progressBar.setMax(i3);
                        progressBar.setProgress(i2);
                        break;
                    }
                }
                break;
            default:
                super.handleMessage(message);
                long jLongValue = ((Long) message.obj).longValue();
                DialogC6312 dialogC6312 = (DialogC6312) this.f284;
                long j = dialogC6312.f17400 - jLongValue;
                long j2 = j / 1000;
                dialogC6312.f17403.setText(Math.abs(j2) + "." + Math.abs(j - (1000 * j2)) + "s");
                break;
        }
    }

    public /* synthetic */ HandlerC0103() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0103(Looper looper, DialogC6313 dialogC6313) {
        super(looper);
        this.f284 = dialogC6313;
    }
}
