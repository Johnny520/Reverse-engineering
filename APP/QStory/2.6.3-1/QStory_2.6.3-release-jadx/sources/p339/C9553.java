package p339;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4581;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.internal.C6183;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p025.AbstractC7012;
import p034.AbstractC7082;
import p091.C7790;
import p273.C9037;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9516;
import top.suzhelan.qstory.hook.item.RunnableC6769;
import top.suzhelan.qstory.p015ui.components.C6797;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;
import top.suzhelan.sticker.sdk.presenter.C6814;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9553 extends AbstractC4581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f24924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ List f24927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24928 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9553(String str, List list, C9516 c9516, File file) {
        super(C0328R.layout.dialog_upload_sticker);
        this.f24926 = str;
        this.f24927 = list;
        this.f24925 = c9516;
        this.f24924 = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0155  */
    /* JADX WARN: Type inference failed for: r11v6, types: [飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰哲苏世] */
    @Override // com.kongzue.dialogx.interfaces.AbstractC4581
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBind(Object obj, View view) {
        File file;
        int i = this.f24928;
        Object obj2 = this.f24925;
        List list = this.f24927;
        Object obj3 = this.f24926;
        Serializable serializable = this.f24924;
        switch (i) {
            case 0:
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C9037) obj).getClass();
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
                view.getClass();
                LinearLayout linearLayout = (LinearLayout) view.findViewById(C0328R.id.ll_dir_list);
                ExecutorService executorService = AbstractC9550.f24916;
                ViewGroup viewGroup = (ViewGroup) view;
                C5707 c5707 = (C5707) obj2;
                LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(C0328R.id.ll_sticker_container);
                ImageView imageView = (ImageView) viewGroup.findViewById(C0328R.id.iv_single_preview);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<Map.Entry> listM9356 = AbstractC5176.m9356(((Map) obj3).entrySet());
                if (listM9356.size() == 1) {
                    linearLayout2.setVisibility(8);
                    imageView.setVisibility(0);
                    linkedHashMap.put(((Map.Entry) AbstractC5176.m9379(listM9356)).getKey(), imageView);
                } else {
                    imageView.setVisibility(8);
                    linearLayout2.setVisibility(0);
                    Context context = linearLayout2.getContext();
                    int iM12313 = AbstractC7082.m12313(context, 100.0f);
                    int iM123132 = AbstractC7082.m12313(context, 2.0f);
                    Iterator it = listM9356.iterator();
                    while (it.hasNext()) {
                        String str = (String) ((Map.Entry) it.next()).getKey();
                        View imageView2 = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM12313, iM12313);
                        layoutParams.setMarginStart(iM123132);
                        layoutParams.setMarginEnd(iM123132);
                        imageView2.setLayoutParams(layoutParams);
                        linearLayout2.addView(imageView2);
                        linkedHashMap.put(str, imageView2);
                    }
                }
                for (Map.Entry entry : listM9356) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    Object obj4 = linkedHashMap.get(str2);
                    obj4.getClass();
                    AbstractC9550.f24916.submit(new RunnableC6769(str2, c5707, str3, (ImageView) obj4, 3));
                }
                ExecutorService executorService2 = AbstractC9550.f24916;
                linearLayout.getClass();
                AbstractC9550.m14988(linearLayout, list, (LinkedHashSet) serializable);
                break;
            default:
                final File file2 = (File) serializable;
                C9069 c9069 = (C9069) obj;
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                c9069.getClass();
                AbstractC9234.m14532("喵喵喵喵喵呜喵呜");
                view.getClass();
                View viewFindViewById = view.findViewById(C0328R.id.tv_upload_info);
                AbstractC9234.m14531(1280);
                viewFindViewById.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC9234.m14531(2775));
                final String str4 = (String) obj3;
                sb.append(str4);
                sb.append(AbstractC9234.m14532("喵呜喵呜喵喵呜呜~喵呜喵呜呜呜喵呜"));
                sb.append(list.size());
                sb.append(AbstractC9234.m14531(2776));
                ((TextView) viewFindViewById).setText(sb.toString());
                TextView textView = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_upload_title, 1280);
                final C9516 c9516 = (C9516) obj2;
                String str5 = c9516.f24849;
                String str6 = c9516.f24847;
                if (AbstractC5976.m10731(str5)) {
                    str5 = str4;
                }
                textView.setText(str5);
                View viewFindViewById2 = view.findViewById(C0328R.id.tv_upload_tags);
                AbstractC9234.m14531(1280);
                viewFindViewById2.getClass();
                TextView textView2 = (TextView) viewFindViewById2;
                TextView textView3 = (TextView) AbstractC7012.m12129(view, C0328R.id.label_upload_tags, 1280);
                if (!c9516.f24848.isEmpty()) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(0);
                    textView2.setText(AbstractC5176.m9369(c9516.f24848, AbstractC9234.m14532("呜喵喵呜喵喵喵喵~呜呜呜呜喵呜喵呜~呜呜呜呜呜喵呜呜"), null, null, null, 62));
                }
                TextView textView4 = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_upload_desc, 1280);
                TextView textView5 = (TextView) AbstractC7012.m12129(view, C0328R.id.label_upload_desc, 1280);
                if (!AbstractC5976.m10731(str6)) {
                    textView5.setVisibility(0);
                    textView4.setVisibility(0);
                    textView4.setText(str6);
                }
                TextView textView6 = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_upload_author, 1280);
                TextView textView7 = (TextView) AbstractC7012.m12129(view, C0328R.id.label_upload_author, 1280);
                String currentAccountNickName = c9516.f24846;
                if (AbstractC5976.m10731(currentAccountNickName)) {
                    currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
                }
                textView7.setVisibility(0);
                textView6.setVisibility(0);
                textView6.setText(currentAccountNickName);
                ((TextView) AbstractC7012.m12129(view, C0328R.id.tv_upload_version, 1280)).setText(String.valueOf(c9516.f24845));
                View viewFindViewById3 = view.findViewById(C0328R.id.iv_upload_cover);
                AbstractC9234.m14531(1280);
                viewFindViewById3.getClass();
                ImageView imageView3 = (ImageView) viewFindViewById3;
                C9516.f24843.getClass();
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵");
                AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜呜");
                String str7 = c9516.f24844;
                if (str7.length() > 0) {
                    file = new File(file2, str7);
                    if (!file.exists()) {
                        file = (File) AbstractC5176.m9374(C7790.m12829(file2));
                    }
                }
                if (file != null) {
                    ((C3894) ComponentCallbacks2C3890.m7325(view.getContext()).m7359(file).m7174()).m7349(imageView3);
                } else {
                    imageView3.setVisibility(8);
                }
                LinearLayout linearLayout3 = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.layout_upload_uin, 1280);
                final CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_upload_uin, 1280);
                LinearLayout linearLayout4 = (LinearLayout) AbstractC7012.m12129(view, C0328R.id.layout_upload_nickname, 1280);
                final CustomMaterialCheckBox customMaterialCheckBox2 = (CustomMaterialCheckBox) AbstractC7012.m12129(view, C0328R.id.cb_upload_nickname, 1280);
                customMaterialCheckBox.setCheckedImmediate(true);
                customMaterialCheckBox2.setCheckedImmediate(true);
                customMaterialCheckBox.setClickable(false);
                customMaterialCheckBox2.setClickable(false);
                linearLayout3.setOnClickListener(new ViewOnClickListenerC9544(customMaterialCheckBox, 0));
                linearLayout4.setOnClickListener(new ViewOnClickListenerC9544(customMaterialCheckBox2, 1));
                String strM14531 = AbstractC9234.m14531(2777);
                ?? r11 = new InterfaceC4582() { // from class: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰哲苏世
                    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
                    public final boolean onClick(AbstractC4570 abstractC4570, View view2) throws IOException {
                        C9516 c95162 = c9516;
                        String str8 = c95162.f24849;
                        if (AbstractC5976.m10731(str8)) {
                            str8 = str4;
                        }
                        String str9 = str8;
                        String strM9369 = AbstractC5176.m9369(c95162.f24848, AbstractC9234.m14532("喵呜喵呜呜呜呜呜"), null, null, null, 62);
                        String str10 = c95162.f24847;
                        if (AbstractC5976.m10731(str10)) {
                            str10 = null;
                        }
                        String currentAccountNickName2 = c95162.f24846;
                        if (AbstractC5976.m10731(currentAccountNickName2)) {
                            currentAccountNickName2 = QQEnvTool.getCurrentAccountNickName();
                        }
                        String str11 = currentAccountNickName2;
                        String currentUin = customMaterialCheckBox.isChecked ? QQEnvTool.getCurrentUin() : null;
                        String currentAccountNickName3 = customMaterialCheckBox2.isChecked ? QQEnvTool.getCurrentAccountNickName() : null;
                        C6183 c6183 = C6814.f16645;
                        String absolutePath = file2.getAbsolutePath();
                        AbstractC9234.m14531(2114);
                        absolutePath.getClass();
                        String str12 = AbstractC5976.m10731(strM9369) ? null : strM9369;
                        String str13 = c95162.f24844;
                        C6814.m11916(absolutePath, str9, str12, str10, currentUin, currentAccountNickName3, str11, AbstractC5976.m10731(str13) ? null : str13, new C6797((byte) 0, 6));
                        return false;
                    }
                };
                c9069.f23107 = strM14531;
                c9069.f23116 = r11;
                c9069.m14322();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9553(Map map, C5707 c5707, List list, LinkedHashSet linkedHashSet) {
        super(C0328R.layout.dialog_save_sticker);
        this.f24926 = map;
        this.f24925 = c5707;
        this.f24927 = list;
        this.f24924 = linkedHashSet;
    }
}
