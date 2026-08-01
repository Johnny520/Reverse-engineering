package p319;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p007.AbstractC6136;
import p257.C8239;
import p324.C8737;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5839;
import top.suzhelan.qstory.ui.views.CustomChipGroup;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8697 extends AbstractC3748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8687 f24517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ List f24518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8737 f24519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f24520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ File f24521;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8697(View view, File file, String str, C8737 c8737, List list, C8687 c8687) {
        super(view);
        this.f24521 = file;
        this.f24520 = str;
        this.f24519 = c8737;
        this.f24518 = list;
        this.f24517 = c8687;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.String] */
    @Override // com.kongzue.dialogx.interfaces.AbstractC3748
    public final void onBind(Object obj, View view) {
        C8239 c8239 = (C8239) obj;
        "dialog";
        c8239.getClass();
        "v";
        view.getClass();
        EditText editText = (EditText) AbstractC6136.m11537(view, R.id.et_dir_name, -3937691541079066023L);
        C8737 c8737 = this.f24519;
        editText.setText(c8737.f24637);
        CustomChipGroup customChipGroup = (CustomChipGroup) AbstractC6136.m11537(view, R.id.chip_group_tags, -3937691541079066023L);
        EditText editText2 = (EditText) AbstractC6136.m11537(view, R.id.et_tag_input, -3937691541079066023L);
        View viewM11537 = AbstractC6136.m11537(view, R.id.btn_add_tag, -3937691541079066023L);
        ArrayList arrayListM8799 = AbstractC4343.m8799(c8737.f24636);
        AbstractC2904.m6252(customChipGroup, arrayListM8799, view);
        viewM11537.setOnClickListener(new ViewOnClickListenerC5839(editText2, arrayListM8799, customChipGroup, view, 2));
        EditText editText3 = (EditText) AbstractC6136.m11537(view, R.id.et_description, -3937691541079066023L);
        editText3.setText(c8737.f24635);
        EditText editText4 = (EditText) AbstractC6136.m11537(view, R.id.et_author, -3937691541079066023L);
        String currentAccountNickName = c8737.f24634;
        if (AbstractC5143.m10164(currentAccountNickName)) {
            currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        }
        editText4.setText(currentAccountNickName);
        EditText editText5 = (EditText) AbstractC6136.m11537(view, R.id.et_version, -3937691541079066023L);
        editText5.setText(String.valueOf(c8737.f24633));
        View viewFindViewById = view.findViewById(R.id.iv_cover_preview);
        "findViewById(...)";
        viewFindViewById.getClass();
        ImageView imageView = (ImageView) viewFindViewById;
        ImageView imageView2 = (ImageView) AbstractC6136.m11537(view, R.id.iv_cover_arrow, -3937691541079066023L);
        View viewM115372 = AbstractC6136.m11537(view, R.id.ll_cover_preview, -3937691541079066023L);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) AbstractC6136.m11537(view, R.id.rv_cover_list, -3937691541079066023L);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = c8737.f24632;
        File file = this.f24521;
        AbstractC2904.m6253(ref$ObjectRef, imageView, file, view);
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(0));
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? c8705 = new C8705(this.f24518, (String) ref$ObjectRef.element, new C8702(ref$ObjectRef, dialogXRecycleView, imageView2, ref$ObjectRef2, imageView, file, view));
        ref$ObjectRef2.element = c8705;
        dialogXRecycleView.setAdapter(c8705);
        viewM115372.setOnClickListener(new ViewOnClickListenerC5561(dialogXRecycleView, 10, imageView2));
        TextView textView = (TextView) view.findViewById(R.id.tv_save);
        String str = this.f24520;
        C8687 c8687 = this.f24517;
        textView.setOnClickListener(new ViewOnClickListenerC8706(editText, editText5, arrayListM8799, editText3, editText4, ref$ObjectRef, str, file, c8239, c8687));
        view.findViewById(R.id.btn_upload).setOnClickListener(new ViewOnClickListenerC8706(editText, editText5, arrayListM8799, editText3, editText4, ref$ObjectRef, file, str, c8239, c8687));
        ((TextView) view.findViewById(R.id.tv_delete)).setOnClickListener(new ViewOnClickListenerC5543(str, c8239, c8687, 5));
    }
}
