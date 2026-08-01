package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p161.AbstractC7642;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0232 extends AbstractC7642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f864;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* synthetic */ C0212 f865;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f866;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ WeakReference f867;

    public C0232(C0212 c0212, int i, int i2, WeakReference weakReference) {
        this.f865 = c0212;
        this.f864 = i;
        this.f866 = i2;
        this.f867 = weakReference;
    }

    @Override // p161.AbstractC7642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo736(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f864) != -1) {
            typeface = AbstractC0213.m716(typeface, i, (this.f866 & 2) != 0);
        }
        C0212 c0212 = this.f865;
        if (c0212.f820) {
            c0212.f824 = typeface;
            TextView textView = (TextView) this.f867.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = c0212.f826;
                if (zIsAttachedToWindow) {
                    textView.post(new RunnableC0229(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // p161.AbstractC7642
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo735(int i) {
    }
}
