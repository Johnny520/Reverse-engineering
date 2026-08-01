package p355;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.lazy.C0755;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import java.util.ArrayList;
import java.util.Map;
import p009.ViewOnClickListenerC6181;
import p257.C8208;
import p287.AbstractC8405;
import p354.C8877;
import top.suzhelan.qstory.hook.item.C5877;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8891 extends AbstractC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Map f25063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f25064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8890 f25065;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8891(C8890 c8890, ArrayList arrayList, Map map) {
        super(R.layout.dialog_manage_friends);
        this.f25065 = c8890;
        this.f25064 = arrayList;
        this.f25063 = map;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3749
    public final void onBind(Object obj, View view) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
        ((C8208) obj).getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
        view.getClass();
        EditText editText = (EditText) view.findViewById(R.id.et_search);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_clear);
        TextView textView = (TextView) view.findViewById(R.id.tv_selected_count);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) view.findViewById(R.id.rv_friend_list);
        Button button = (Button) view.findViewById(R.id.btn_delete);
        C8890 c8890 = this.f25065;
        editText.addTextChangedListener(new C5877(1, imageView, c8890));
        imageView.setOnClickListener(new ViewOnClickListenerC6181(editText, 1));
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(1));
        C8877 c8877 = c8890.f25062;
        dialogXRecycleView.setAdapter(c8877);
        c8877.f25028 = new C0755(c8890, textView, button, 11);
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵喵~喵喵喵呜喵喵呜喵");
        ArrayList arrayList = this.f25064;
        arrayList.getClass();
        AbstractC8405.m13972(2920);
        Map map = this.f25063;
        map.getClass();
        c8877.f25030 = arrayList;
        c8877.f25026 = map;
        c8877.m14537();
        button.setOnClickListener(new ViewOnClickListenerC3183(c8890, 28));
        textView.getClass();
        c8890.m14540(textView, button);
    }
}
