package p352;

import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p257.C8207;
import p356.C8898;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8873 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8207 f25010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8898 f25011 = new C8898();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Handler f25009 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14521(TextView textView, Button button) {
        int i;
        LinkedHashMap linkedHashMap = this.f25011.f25068;
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
        textView.setText(AbstractC3056.m6668(-3937328173960922535L) + i);
        button.setText(AbstractC3056.m6668(-3937328161076020647L) + i + ')');
        button.setEnabled(i > 0);
        button.setAlpha(i > 0 ? 1.0f : 0.5f);
    }
}
