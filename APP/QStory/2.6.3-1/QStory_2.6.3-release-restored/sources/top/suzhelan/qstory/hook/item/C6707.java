package top.suzhelan.qstory.hook.item;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.text.AbstractC5976;
import p209.C8657;
import p370.C9706;
import p370.C9715;
import p371.C9719;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6707 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f16395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16396;

    public /* synthetic */ C6707(int i, View view, Object obj) {
        this.f16396 = i;
        this.f16394 = obj;
        this.f16395 = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f16396) {
            case 0:
                if (((C6783) this.f16394).f17770.booleanValue() && String.valueOf(editable).equals("送礼物")) {
                    Object parent = ((TextView) this.f16395).getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f16396;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f16396;
        int i5 = 8;
        View view = this.f16395;
        Object obj = this.f16394;
        switch (i4) {
            case 0:
                break;
            case 1:
                C9706 c9706 = ((C9719) obj).f25407;
                String strValueOf = String.valueOf(charSequence);
                c9706.getClass();
                "query";
                c9706.f25372 = AbstractC5976.m10714(strValueOf).toString();
                c9706.m15096();
                ImageView imageView = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                break;
            default:
                C9715 c9715 = (C9715) ((C8657) obj).f21713;
                String strValueOf2 = String.valueOf(charSequence);
                c9715.getClass();
                "query";
                c9715.f25394 = AbstractC5976.m10714(strValueOf2).toString();
                c9715.m15097();
                ImageView imageView2 = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView2.setVisibility(i5);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m11841(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m11842(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m11837(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m11838(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m11839(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m11840(int i, int i2, int i3, CharSequence charSequence) {
    }
}
