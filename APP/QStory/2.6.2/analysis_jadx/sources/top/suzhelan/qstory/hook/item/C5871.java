package top.suzhelan.qstory.hook.item;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import kotlin.text.AbstractC5143;
import p193.C7827;
import p352.C8873;
import p356.C8898;
import p356.C8907;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5871 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16042;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f16043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16044;

    public /* synthetic */ C5871(int i, View view, Object obj) {
        this.f16044 = i;
        this.f16042 = obj;
        this.f16043 = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f16044) {
            case 0:
                if (((C5872) this.f16042).f17376.booleanValue() && String.valueOf(editable).equals(AbstractC3056.m6668(-3937761050829784487L))) {
                    Object parent = ((TextView) this.f16043).getParent();
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
        int i4 = this.f16044;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f16044;
        int i5 = 8;
        View view = this.f16043;
        Object obj = this.f16042;
        switch (i4) {
            case 0:
                break;
            case 1:
                C8898 c8898 = ((C8873) obj).f25011;
                String strValueOf = String.valueOf(charSequence);
                c8898.getClass();
                AbstractC3056.m6668(-3937297129937307047L);
                c8898.f25066 = AbstractC5143.m10150(strValueOf).toString();
                c8898.m14527();
                ImageView imageView = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView.setVisibility(i5);
                break;
            default:
                C8907 c8907 = (C8907) ((C7827) obj).f21371;
                String strValueOf2 = String.valueOf(charSequence);
                c8907.getClass();
                AbstractC3056.m6668(-3937297129937307047L);
                c8907.f25088 = AbstractC5143.m10150(strValueOf2).toString();
                c8907.m14528();
                ImageView imageView2 = (ImageView) view;
                if (charSequence != null && charSequence.length() != 0) {
                    i5 = 0;
                }
                imageView2.setVisibility(i5);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    private final void m11220(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    private final void m11221(Editable editable) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    private final void m11216(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    private final void m11217(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    private final void m11218(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    private final void m11219(int i, int i2, int i3, CharSequence charSequence) {
    }
}
