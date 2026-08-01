package p355;

import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p257.C8208;
import p287.AbstractC8405;
import p354.C8877;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8208 f25061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8877 f25062 = new C8877();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Handler f25060 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14540(TextView textView, Button button) {
        int i;
        LinkedHashMap linkedHashMap = this.f25062.f25029;
        if (linkedHashMap.isEmpty()) {
            i = 0;
        } else {
            Iterator it = linkedHashMap.entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    i++;
                }
            }
        }
        textView.setText(AbstractC8405.m13972(3104) + i);
        button.setText(AbstractC8405.m13972(3105) + i + ')');
        button.setEnabled(i > 0);
        button.setAlpha(i > 0 ? 1.0f : 0.5f);
    }
}
