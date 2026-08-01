package p352;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.lazy.C0755;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import java.util.ArrayList;
import java.util.Map;
import p007.ViewOnClickListenerC6139;
import p257.C8207;
import p356.C8898;
import top.suzhelan.qstory.hook.item.C5871;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪世子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8874 extends AbstractC3748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f25012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8873 f25014;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8874(C8873 c8873, ArrayList arrayList, Map map) {
        super(R.layout.dialog_manage_friends);
        this.f25014 = c8873;
        this.f25013 = arrayList;
        this.f25012 = map;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3748
    public final void onBind(Object obj, View view) {
        "dialog";
        ((C8207) obj).getClass();
        "v";
        view.getClass();
        EditText editText = (EditText) view.findViewById(R.id.et_search);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_clear);
        TextView textView = (TextView) view.findViewById(R.id.tv_selected_count);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) view.findViewById(R.id.rv_friend_list);
        Button button = (Button) view.findViewById(R.id.btn_delete);
        C8873 c8873 = this.f25014;
        editText.addTextChangedListener(new C5871(1, imageView, c8873));
        imageView.setOnClickListener(new ViewOnClickListenerC6139(editText, 1));
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(1));
        C8898 c8898 = c8873.f25011;
        dialogXRecycleView.setAdapter(c8898);
        c8898.f25067 = new C0755(c8873, textView, button, 11);
        "friends";
        ArrayList arrayList = this.f25013;
        arrayList.getClass();
        "categoryMap";
        Map map = this.f25012;
        map.getClass();
        c8898.f25069 = arrayList;
        c8898.f25065 = map;
        c8898.m14527();
        button.setOnClickListener(new ViewOnClickListenerC3182(c8873, 27));
        textView.getClass();
        c8873.m14521(textView, button);
    }
}
