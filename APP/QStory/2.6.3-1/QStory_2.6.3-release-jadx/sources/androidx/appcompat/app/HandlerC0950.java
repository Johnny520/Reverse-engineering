package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import p048.DialogC7160;
import p048.DialogC7161;
import p303.AbstractC9234;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class HandlerC0950 extends Handler {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f630 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0950(DialogC7160 dialogC7160, Looper looper) {
        super(looper);
        this.f629 = dialogC7160;
        new SimpleDateFormat(AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵喵喵呜呜喵~喵呜喵呜喵呜喵喵~喵喵呜呜呜喵呜呜~喵喵呜呜喵呜呜喵~喵喵呜呜呜呜呜呜"));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f630) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f629).get(), message.what);
                    break;
                } else if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            case 1:
                DialogC7161 dialogC7161 = (DialogC7161) this.f629;
                super.handleMessage(message);
                Object obj = message.obj;
                if (obj instanceof String) {
                    String str = (String) obj;
                    int iHashCode = str.hashCode();
                    if (iHashCode == 68795) {
                        if (str.equals(AbstractC9234.m14532("喵喵呜呜喵呜呜喵~喵喵呜呜呜喵呜呜~喵喵呜呜呜呜呜喵"))) {
                            dialogC7161.dismiss();
                        }
                    } else if (iHashCode == 79219778 && str.equals(AbstractC9234.m14532("喵喵呜喵喵喵喵喵~喵喵呜喵喵喵喵呜~喵喵呜呜呜喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜"))) {
                        dialogC7161.show();
                    }
                    dialogC7161.f17800.setText(str);
                    break;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    ProgressBar progressBar = dialogC7161.f17799;
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
                DialogC7160 dialogC7160 = (DialogC7160) this.f629;
                long j = dialogC7160.f17794 - jLongValue;
                long j2 = j / 1000;
                dialogC7160.f17797.setText(Math.abs(j2) + AbstractC9234.m14532("喵呜喵呜呜呜喵呜") + Math.abs(j - (1000 * j2)) + AbstractC9234.m14532("喵喵喵喵喵喵喵喵"));
                break;
        }
    }

    public /* synthetic */ HandlerC0950() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0950(Looper looper, DialogC7161 dialogC7161) {
        super(looper);
        this.f629 = dialogC7161;
    }
}
