package p007;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.compose.C0002;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.view.main.MainSettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6133 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ TextView f16716;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ TextView f16717;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ MainSettingActivity f16718;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Dialog f16719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f16720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f16721;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f16722;

    public C6133(ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, MainSettingActivity mainSettingActivity, Dialog dialog) {
        this.f16722 = imageView;
        this.f16720 = linearLayout;
        this.f16721 = recyclerView;
        this.f16717 = textView;
        this.f16716 = textView2;
        this.f16718 = mainSettingActivity;
        this.f16719 = dialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = AbstractC5143.m10150(String.valueOf(editable)).toString();
        this.f16722.setVisibility(string.length() > 0 ? 0 : 8);
        int length = string.length();
        TextView textView = this.f16716;
        TextView textView2 = this.f16717;
        RecyclerView recyclerView = this.f16721;
        LinearLayout linearLayout = this.f16720;
        if (length <= 0) {
            linearLayout.setVisibility(0);
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        C6132.f16715.getClass();
        List listM11525 = C6132.m11525(string);
        textView2.getClass();
        textView.getClass();
        if (listM11525.isEmpty()) {
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(0);
        } else {
            textView2.setVisibility(0);
            recyclerView.setVisibility(0);
            textView.setVisibility(8);
            recyclerView.setAdapter(new C6135(listM11525, new C0002(this.f16719, 29, this.f16718)));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
