package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p177.AbstractC8471;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1079 extends AbstractC8471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f1209;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ C1059 f1210;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f1211;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f1212;

    public C1079(C1059 c1059, int i, int i2, WeakReference weakReference) {
        this.f1210 = c1059;
        this.f1209 = i;
        this.f1211 = i2;
        this.f1212 = weakReference;
    }

    @Override // p177.AbstractC8471
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo1296(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f1209) != -1) {
            typeface = AbstractC1060.m1276(typeface, i, (this.f1211 & 2) != 0);
        }
        C1059 c1059 = this.f1210;
        if (c1059.f1165) {
            c1059.f1169 = typeface;
            TextView textView = (TextView) this.f1212.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c1059.f1171;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC1076(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // p177.AbstractC8471
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1295(int i) {
    }
}
