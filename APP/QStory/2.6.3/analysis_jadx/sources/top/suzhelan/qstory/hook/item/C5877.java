package top.suzhelan.qstory.hook.item;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.text.AbstractC5144;
import p193.C7828;
import p287.AbstractC8405;
import p354.C8877;
import p354.C8886;
import p355.C8890;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5877 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f16050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16051;

    public /* synthetic */ C5877(int i, View view, Object obj) {
        this.f16051 = i;
        this.f16049 = obj;
        this.f16050 = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f16051) {
            case 0:
                if (((C5953) this.f16049).f17425.booleanValue() && String.valueOf(editable).equals(AbstractC8405.m13972(1939))) {
                    Object parent = ((TextView) this.f16050).getParent();
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
        int i4 = this.f16051;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f16051;
        int i5 = 8;
        View view = this.f16050;
        Object obj = this.f16049;
        switch (i4) {
            case 0:
                break;
            case 1:
                C8877 c8877 = ((C8890) obj).f25062;
                String strValueOf = String.valueOf(charSequence);
                c8877.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵喵");
                c8877.f25027 = AbstractC5144.m10155(strValueOf).toString();
                c8877.m14537();
                ImageView imageView = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                break;
            default:
                C8886 c8886 = (C8886) ((C7828) obj).f21368;
                String strValueOf2 = String.valueOf(charSequence);
                c8886.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜喵喵");
                c8886.f25049 = AbstractC5144.m10155(strValueOf2).toString();
                c8886.m14538();
                ImageView imageView2 = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView2.setVisibility(i5);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m11282(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m11283(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m11278(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m11279(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m11280(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m11281(int i, int i2, int i3, CharSequence charSequence) {
    }
}
