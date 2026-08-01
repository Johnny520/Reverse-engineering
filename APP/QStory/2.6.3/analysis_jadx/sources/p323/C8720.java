package p323;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.window.area.AbstractC2567;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p009.AbstractC6183;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8687;
import top.suzhelan.qstory.hook.item.chat.ViewOnClickListenerC5832;
import top.suzhelan.qstory.ui.views.CustomChipGroup;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8720 extends AbstractC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8710 f24565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ List f24566;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C8687 f24567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f24568;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ File f24569;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8720(View view, File file, String str, C8687 c8687, List list, C8710 c8710) {
        super(view);
        this.f24569 = file;
        this.f24568 = str;
        this.f24567 = c8687;
        this.f24566 = list;
        this.f24565 = c8710;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v32, types: [T, androidx.recyclerview.widget.飘花落叶言子世兰哲楪苏, 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏兰哲世] */
    @Override // com.kongzue.dialogx.interfaces.AbstractC3749
    public final void onBind(Object obj, View view) {
        C8240 c8240 = (C8240) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
        c8240.getClass();
        AbstractC8405.m13973("喵喵喵喵喵呜喵呜");
        view.getClass();
        EditText editText = (EditText) AbstractC6183.m11570(view, R.id.et_dir_name, 1280);
        C8687 c8687 = this.f24567;
        editText.setText(c8687.f24504);
        View viewFindViewById = view.findViewById(R.id.chip_group_tags);
        AbstractC8405.m13972(1280);
        viewFindViewById.getClass();
        CustomChipGroup customChipGroup = (CustomChipGroup) viewFindViewById;
        EditText editText2 = (EditText) AbstractC6183.m11570(view, R.id.et_tag_input, 1280);
        View viewM11570 = AbstractC6183.m11570(view, R.id.btn_add_tag, 1280);
        ArrayList arrayListM8786 = AbstractC4344.m8786(c8687.f24503);
        AbstractC2567.m5073(customChipGroup, arrayListM8786, view);
        viewM11570.setOnClickListener(new ViewOnClickListenerC5832(editText2, arrayListM8786, customChipGroup, view, 2));
        EditText editText3 = (EditText) AbstractC6183.m11570(view, R.id.et_description, 1280);
        editText3.setText(c8687.f24502);
        View viewFindViewById2 = view.findViewById(R.id.et_author);
        AbstractC8405.m13972(1280);
        viewFindViewById2.getClass();
        EditText editText4 = (EditText) viewFindViewById2;
        String currentAccountNickName = c8687.f24501;
        if (AbstractC5144.m10172(currentAccountNickName)) {
            currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
        }
        editText4.setText(currentAccountNickName);
        View viewFindViewById3 = view.findViewById(R.id.et_version);
        AbstractC8405.m13972(1280);
        viewFindViewById3.getClass();
        EditText editText5 = (EditText) viewFindViewById3;
        editText5.setText(String.valueOf(c8687.f24500));
        View viewFindViewById4 = view.findViewById(R.id.iv_cover_preview);
        AbstractC8405.m13972(1280);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        ImageView imageView2 = (ImageView) AbstractC6183.m11570(view, R.id.iv_cover_arrow, 1280);
        View viewM115702 = AbstractC6183.m11570(view, R.id.ll_cover_preview, 1280);
        DialogXRecycleView dialogXRecycleView = (DialogXRecycleView) AbstractC6183.m11570(view, R.id.rv_cover_list, 1280);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = c8687.f24499;
        File file = this.f24569;
        AbstractC2567.m5074(ref$ObjectRef, imageView, file, view);
        view.getContext();
        dialogXRecycleView.setLayoutManager(new LinearLayoutManager(0));
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        ?? c8728 = new C8728(this.f24566, (String) ref$ObjectRef.element, new C8725(ref$ObjectRef, dialogXRecycleView, imageView2, ref$ObjectRef2, imageView, file, view));
        ref$ObjectRef2.element = c8728;
        dialogXRecycleView.setAdapter(c8728);
        viewM115702.setOnClickListener(new ViewOnClickListenerC5562(dialogXRecycleView, 10, imageView2));
        TextView textView = (TextView) view.findViewById(R.id.tv_save);
        String str = this.f24568;
        C8710 c8710 = this.f24565;
        textView.setOnClickListener(new ViewOnClickListenerC8729(editText, editText5, arrayListM8786, editText3, editText4, ref$ObjectRef, str, file, c8240, c8710));
        view.findViewById(R.id.btn_upload).setOnClickListener(new ViewOnClickListenerC8729(editText, editText5, arrayListM8786, editText3, editText4, ref$ObjectRef, file, str, c8240, c8710));
        ((TextView) view.findViewById(R.id.tv_delete)).setOnClickListener(new ViewOnClickListenerC5544(str, c8240, c8710, 5));
    }
}
