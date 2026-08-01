package p098x0;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.AbstractC0460L;
import p001A0.DialogInterfaceOnClickListenerC0046s;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p088s0.DialogInterfaceOnClickListenerC0986h;
import p102z0.C1119b;

/* JADX INFO: renamed from: x0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1036b extends AbstractC0460L {

    /* JADX INFO: renamed from: d */
    public boolean f3652d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2224c(Context context, C1119b c1119b) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (activity.isFinishing() || activity.isDestroyed())) {
            this.f3652d = false;
            return;
        }
        String str = c1119b.f3768b;
        if (AbstractC0307q.m534d0(str)) {
            str = "服务暂不可用";
        }
        new AlertDialog.Builder(context).setTitle("服务提示").setMessage(str).setPositiveButton("确定", (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC1035a(1, this)).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2225d(Context context, C1119b c1119b, boolean z2) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (activity.isFinishing() || activity.isDestroyed())) {
            this.f3652d = false;
            return;
        }
        AlertDialog.Builder title = new AlertDialog.Builder(context).setTitle("更新提示");
        StringBuilder sb = new StringBuilder("检查到新版本：");
        String strValueOf = c1119b.f3772f;
        if (AbstractC0307q.m534d0(strValueOf)) {
            strValueOf = String.valueOf(c1119b.f3771e);
        }
        sb.append(strValueOf);
        sb.append("，是否更新？");
        String str = c1119b.f3774h;
        if (!AbstractC0307q.m534d0(str)) {
            sb.append("\n\n");
            sb.append(str);
        }
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        AlertDialog.Builder onDismissListener = title.setMessage(string).setPositiveButton("更新", new DialogInterfaceOnClickListenerC0986h(this, context, c1119b, 1)).setOnDismissListener(new DialogInterfaceOnDismissListenerC1035a(0, this));
        boolean z3 = c1119b.f3773g;
        AlertDialog.Builder cancelable = onDismissListener.setCancelable(!z3);
        if (!z3) {
            cancelable.setNegativeButton("取消", (DialogInterface.OnClickListener) null);
            if (z2) {
                cancelable.setNeutralButton("不再提示", new DialogInterfaceOnClickListenerC0046s(3));
            }
        }
        cancelable.show();
    }
}
