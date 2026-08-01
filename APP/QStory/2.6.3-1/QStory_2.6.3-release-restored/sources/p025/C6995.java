package p025;

import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.compose.C0849;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.view.main.MainSettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6995 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ TextView f17300;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ TextView f17301;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ MainSettingActivity f17302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Dialog f17303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f17304;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f17305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f17306;

    public C6995(ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, MainSettingActivity mainSettingActivity, Dialog dialog) {
        this.f17306 = imageView;
        this.f17304 = linearLayout;
        this.f17305 = recyclerView;
        this.f17301 = textView;
        this.f17300 = textView2;
        this.f17302 = mainSettingActivity;
        this.f17303 = dialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = AbstractC5976.m10714(String.valueOf(editable)).toString();
        this.f17306.setVisibility(string.length() > 0 ? 0 : 8);
        int length = string.length();
        TextView textView = this.f17300;
        TextView textView2 = this.f17301;
        RecyclerView recyclerView = this.f17305;
        LinearLayout linearLayout = this.f17304;
        if (length <= 0) {
            linearLayout.setVisibility(0);
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(8);
        C6999.f17312.getClass();
        List listM12122 = C6999.m12122(string);
        textView2.getClass();
        textView.getClass();
        if (listM12122.isEmpty()) {
            textView2.setVisibility(8);
            recyclerView.setVisibility(8);
            textView.setVisibility(0);
        } else {
            textView2.setVisibility(0);
            recyclerView.setVisibility(0);
            textView.setVisibility(8);
            recyclerView.setAdapter(new C6998(listM12122, new C0849(this.f17303, 29, this.f17302)));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
