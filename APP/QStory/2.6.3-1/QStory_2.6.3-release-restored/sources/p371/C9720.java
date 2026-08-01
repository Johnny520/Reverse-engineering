package p371;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.lazy.C1596;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import java.util.ArrayList;
import java.util.Map;
import p025.ViewOnClickListenerC7010;
import p273.C9037;
import p370.C9706;
import top.suzhelan.qstory.hook.item.C6707;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9720 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f25408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C9719 f25410;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9720(C9719 c9719, ArrayList arrayList, Map map) {
        super(C0328R.layout.dialog_manage_friends);
        this.f25410 = c9719;
        this.f25409 = arrayList;
        this.f25408 = map;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    public final void onBind(Object obj, View view) {
        "dialog";
        ((C9037) obj).getClass();
        "v";
        view.getClass();
        EditText editText = (EditText) view.findViewById(C0328R.id.et_search);
        ImageView imageView = (ImageView) view.findViewById(C0328R.id.iv_clear);
        TextView textView = (TextView) view.findViewById(C0328R.id.tv_selected_count);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) view.findViewById(C0328R.id.rv_friend_list);
        Button button = (Button) view.findViewById(C0328R.id.btn_delete);
        C9719 c9719 = this.f25410;
        editText.addTextChangedListener(new C6707(1, imageView, c9719));
        imageView.setOnClickListener(new ViewOnClickListenerC7010(editText, 1));
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(1));
        C9706 c9706 = c9719.f25407;
        dialogXRecycleView.setAdapter(c9706);
        c9706.f25373 = new C1596(c9719, textView, button, 11);
        "friends";
        ArrayList arrayList = this.f25409;
        arrayList.getClass();
        "categoryMap";
        Map map = this.f25408;
        map.getClass();
        c9706.f25375 = arrayList;
        c9706.f25371 = map;
        c9706.m15096();
        button.setOnClickListener(new ViewOnClickListenerC4015(c9719, 28));
        textView.getClass();
        c9719.m15099(textView, button);
    }
}
