package p009;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.compose.C0002;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.view.main.MainSettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6166 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ TextView f16955;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ TextView f16956;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ MainSettingActivity f16957;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Dialog f16958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f16959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f16960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f16961;

    public C6166(ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, MainSettingActivity mainSettingActivity, Dialog dialog) {
        this.f16961 = imageView;
        this.f16959 = linearLayout;
        this.f16960 = recyclerView;
        this.f16956 = textView;
        this.f16955 = textView2;
        this.f16957 = mainSettingActivity;
        this.f16958 = dialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = AbstractC5144.m10155(String.valueOf(editable)).toString();
        this.f16961.setVisibility(string.length() > 0 ? 0 : 8);
        int length = string.length();
        TextView textView = this.f16955;
        TextView textView2 = this.f16956;
        RecyclerView recyclerView = this.f16960;
        LinearLayout linearLayout = this.f16959;
        if (length <= 0) {
            linearLayout.setVisibility(0);
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        C6170.f16967.getClass();
        List listM11563 = C6170.m11563(string);
        textView2.getClass();
        textView.getClass();
        if (listM11563.isEmpty()) {
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(0);
        } else {
            textView2.setVisibility(0);
            recyclerView.setVisibility(0);
            textView.setVisibility(8);
            recyclerView.setAdapter(new C6169(listM11563, new C0002(this.f16958, 29, this.f16957)));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
