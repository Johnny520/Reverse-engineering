package p339;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.window.area.AbstractC3400;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p025.AbstractC7012;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9516;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC6662;
import top.suzhelan.qstory.p015ui.views.CustomChipGroup;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9549 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C9539 f24910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ List f24911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C9516 f24912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f24913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ File f24914;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9549(View view, File file, String str, C9516 c9516, List list, C9539 c9539) {
        super(view);
        this.f24914 = file;
        this.f24913 = str;
        this.f24912 = c9516;
        this.f24911 = list;
        this.f24910 = c9539;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏兰哲世] */
    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    public final void onBind(Object obj, View view) {
        C9069 c9069 = (C9069) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
        c9069.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
        view.getClass();
        EditText editText = (EditText) AbstractC7012.m12129(view, C0328R.id.et_dir_name, 1280);
        C9516 c9516 = this.f24912;
        editText.setText(c9516.f24849);
        View viewFindViewById = view.findViewById(C0328R.id.chip_group_tags);
        AbstractC9234.m14531(1280);
        viewFindViewById.getClass();
        CustomChipGroup customChipGroup = (CustomChipGroup) viewFindViewById;
        EditText editText2 = (EditText) AbstractC7012.m12129(view, C0328R.id.et_tag_input, 1280);
        View viewM12129 = AbstractC7012.m12129(view, C0328R.id.btn_add_tag, 1280);
        ArrayList arrayListM9345 = AbstractC5176.m9345(c9516.f24848);
        AbstractC3400.m5633(customChipGroup, arrayListM9345, view);
        viewM12129.setOnClickListener(new ViewOnClickListenerC6662(editText2, arrayListM9345, customChipGroup, view, 2));
        EditText editText3 = (EditText) AbstractC7012.m12129(view, C0328R.id.et_description, 1280);
        editText3.setText(c9516.f24847);
        View viewFindViewById2 = view.findViewById(C0328R.id.et_author);
        AbstractC9234.m14531(1280);
        viewFindViewById2.getClass();
        EditText editText4 = (EditText) viewFindViewById2;
        String currentAccountNickName = c9516.f24846;
        if (AbstractC5976.m10731(currentAccountNickName)) {
            currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        }
        editText4.setText(currentAccountNickName);
        View viewFindViewById3 = view.findViewById(C0328R.id.et_version);
        AbstractC9234.m14531(1280);
        viewFindViewById3.getClass();
        EditText editText5 = (EditText) viewFindViewById3;
        editText5.setText(String.valueOf(c9516.f24845));
        View viewFindViewById4 = view.findViewById(C0328R.id.iv_cover_preview);
        AbstractC9234.m14531(1280);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        ImageView imageView2 = (ImageView) AbstractC7012.m12129(view, C0328R.id.iv_cover_arrow, 1280);
        View viewM121292 = AbstractC7012.m12129(view, C0328R.id.ll_cover_preview, 1280);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) AbstractC7012.m12129(view, C0328R.id.rv_cover_list, 1280);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = c9516.f24844;
        File file = this.f24914;
        AbstractC3400.m5634(ref$ObjectRef, imageView, file, view);
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(0));
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? c9557 = new C9557(this.f24911, (String) ref$ObjectRef.element, new C9554(ref$ObjectRef, dialogXRecycleView, imageView2, ref$ObjectRef2, imageView, file, view));
        ref$ObjectRef2.element = c9557;
        dialogXRecycleView.setAdapter(c9557);
        viewM121292.setOnClickListener(new ViewOnClickListenerC6392(dialogXRecycleView, 10, imageView2));
        TextView textView = (TextView) view.findViewById(C0328R.id.tv_save);
        String str = this.f24913;
        C9539 c9539 = this.f24910;
        textView.setOnClickListener(new ViewOnClickListenerC9558(editText, editText5, arrayListM9345, editText3, editText4, ref$ObjectRef, str, file, c9069, c9539));
        view.findViewById(C0328R.id.btn_upload).setOnClickListener(new ViewOnClickListenerC9558(editText, editText5, arrayListM9345, editText3, editText4, ref$ObjectRef, file, str, c9069, c9539));
        ((TextView) view.findViewById(C0328R.id.tv_delete)).setOnClickListener(new ViewOnClickListenerC6375(str, c9069, c9539, 5));
    }
}
