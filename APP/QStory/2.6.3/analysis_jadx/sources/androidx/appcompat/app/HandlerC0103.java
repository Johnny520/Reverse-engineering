package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import p032.DialogC6331;
import p032.DialogC6332;
import p287.AbstractC8405;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0103 extends Handler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f285 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0103(DialogC6331 dialogC6331, Looper looper) {
        super(looper);
        this.f284 = dialogC6331;
        new SimpleDateFormat(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵呜呜喵~喵呜喵呜喵呜喵喵~喵喵呜呜呜喵呜呜~喵喵呜呜喵呜呜喵~喵喵呜呜呜呜呜呜"));
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
                DialogC6332 dialogC6332 = (DialogC6332) this.f284;
                super.handleMessage(message);
                Object obj = message.obj;
                if (obj instanceof String) {
                    String str = (String) obj;
                    int iHashCode = str.hashCode();
                    if (iHashCode == 68795) {
                        if (str.equals(AbstractC8405.m13973("喵喵呜呜喵呜呜喵~喵喵呜呜呜喵呜呜~喵喵呜呜呜呜呜喵"))) {
                            dialogC6332.dismiss();
                        }
                    } else if (iHashCode == 79219778 && str.equals(AbstractC8405.m13973("喵喵呜喵喵喵喵喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜"))) {
                        dialogC6332.show();
                    }
                    dialogC6332.f17455.setText(str);
                    break;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    ProgressBar progressBar = dialogC6332.f17454;
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
                DialogC6331 dialogC6331 = (DialogC6331) this.f284;
                long j = dialogC6331.f17449 - jLongValue;
                long j2 = j / 1000;
                dialogC6331.f17452.setText(Math.abs(j2) + AbstractC8405.m13973("喵呜喵呜呜呜喵呜") + Math.abs(j - (1000 * j2)) + AbstractC8405.m13973("喵喵喵喵喵喵喵喵"));
                break;
        }
    }

    public /* synthetic */ HandlerC0103() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0103(Looper looper, DialogC6332 dialogC6332) {
        super(looper);
        this.f284 = dialogC6332;
    }
}
