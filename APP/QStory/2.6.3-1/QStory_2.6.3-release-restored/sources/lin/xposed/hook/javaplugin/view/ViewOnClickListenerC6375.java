package lin.xposed.hook.javaplugin.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.AbstractC0900;
import androidx.compose.animation.C1272;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.util.C4603;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;
import lin.xposed.hook.util.p011qq.CreateElement;
import lin.xposed.hook.util.p011qq.LegacyQQSendTool;
import lin.xposed.hook.util.p011qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import net.bytebuddy.utility.JavaConstant;
import p026.AbstractC7014;
import p038.AbstractC7135;
import p044.DialogC7148;
import p052.AbstractC7187;
import p056.C7266;
import p103.C7897;
import p209.C8657;
import p246.C8882;
import p273.C9037;
import p273.C9069;
import p331.C9492;
import p339.C9539;
import p339.C9548;
import p339.C9559;
import p346.C9606;
import p352.C9622;
import p401.C9895;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6375 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15643;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15645;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15646;

    public /* synthetic */ ViewOnClickListenerC6375(EditText editText, File file, DialogC7148 dialogC7148) {
        this.f15646 = 2;
        this.f15645 = editText;
        this.f15644 = file;
        this.f15643 = dialogC7148;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        List listM9337;
        int i = this.f15646;
        int i2 = 5;
        int i3 = 0;
        Object obj = this.f15644;
        Object obj2 = this.f15643;
        Object obj3 = this.f15645;
        switch (i) {
            case 0:
                ((PluginItemView) obj3).lambda$bindPluginInfoData$7((PluginInfo) obj2, (File) obj, view);
                break;
            case 1:
                File file = (File) obj;
                final Dialog dialog = (Dialog) obj3;
                final Context context = (Context) obj2;
                if (!file.isFile()) {
                    dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏世兰哲
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            if (AbstractC7135.f17759.get() || AbstractC7135.f17758.equals("/storage/emulated")) {
                                return;
                            }
                            String str = AbstractC7135.f17758;
                            Dialog dialog2 = dialog;
                            dialog2.setContentView(AbstractC7135.m12386(dialog2, context, str));
                            dialog2.show();
                        }
                    });
                    dialog.setContentView(AbstractC7135.m12386(dialog, context, file.getAbsolutePath()));
                } else if (AbstractC3888.m7256()) {
                    QQNTSendMsgUtils.sendVoice(QQSessionUtils.getCurrentContact(), file.getAbsolutePath());
                } else {
                    LegacyQQSendTool.sendVoice(QQSessionUtils.getCurrentSessionInfo(), file.getAbsolutePath());
                }
                break;
            case 2:
                File file2 = (File) obj;
                DialogC7148 dialogC7148 = (DialogC7148) obj2;
                if (file2.renameTo(new File(file2.getParentFile() + "/" + ((EditText) obj3).getText().toString()))) {
                    dialogC7148.dismiss();
                } else {
                    AbstractC7014.m12151("重命名失败 可能已经有重名文件");
                }
                break;
            case 3:
                ((PluginMenuGroupView) obj3).lambda$new$1((String) obj2, (PluginLoader) obj, view);
                break;
            case 4:
                C7266 c7266 = (C7266) obj3;
                c7266.f17979.m12395(((EditText) obj2).getText().toString(), "summary");
                c7266.f17979.mo12394();
                ((DialogC7148) obj).dismiss();
                AbstractC7014.m12151("已保存");
                break;
            case 5:
                String str = (String) obj3;
                int color = AbstractC7187.f17852.getColor(C0328R.color.warning);
                C9037 c9037M14288 = C9037.m14288("确定要删除 \"" + str + "\" 吗？这将无法还原", "删除文件夹");
                c9037M14288.mo14278("删除", new C9559(i3, str, (C9069) obj2, (C9539) obj));
                C4603 c4603 = new C4603();
                c4603.f12087 = color;
                c4603.f12086 = true;
                c9037M14288.f22969 = c4603;
                c9037M14288.mo14280();
                String strM14532 = "取消";
                C6380 c6380 = new C6380(i2);
                c9037M14288.f22974 = strM14532;
                c9037M14288.f22967 = c6380;
                c9037M14288.mo14280();
                break;
            case 6:
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                String str2 = (String) obj;
                customMaterialCheckBox.setChecked(!customMaterialCheckBox.isChecked);
                if (customMaterialCheckBox.isChecked) {
                    linkedHashSet.add(str2);
                } else {
                    linkedHashSet.remove(str2);
                }
                break;
            case 7:
                EditText editText = (EditText) obj2;
                DialogC7148 dialogC71482 = (DialogC7148) obj;
                String string = ((EditText) obj3).getText().toString();
                if (TextUtils.isEmpty(string)) {
                    string = "@全体成员";
                }
                String string2 = editText.getText().toString();
                ArrayList arrayList = new ArrayList();
                arrayList.add(CreateElement.createAtTextElement(AbstractC0900.m717("̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶̶", string), "0", 1));
                arrayList.add(CreateElement.createTextElement(string2));
                QQNTSendMsgUtils.sendMsg(QQSessionUtils.getCurrentContact(), arrayList);
                dialogC71482.dismiss();
                break;
            case 8:
                C8657 c8657 = (C8657) obj3;
                Context context2 = (Context) c8657.f21713;
                C7897 c7897 = new C7897((C9069) obj, 7, c8657);
                C8882 c8882 = new C8882(context2, (String) obj2, c7897);
                String sticker_dir = StickerSdkConfig.getSTICKER_DIR();
                if (sticker_dir.length() == 0) {
                    c7897.invoke("");
                } else {
                    File[] fileArrListFiles = new File(sticker_dir).listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (File file3 : fileArrListFiles) {
                            if (file3.isDirectory()) {
                                arrayList2.add(file3);
                            }
                        }
                        listM9337 = AbstractC5176.m9337(arrayList2, new C1272(19));
                        if (listM9337 == null) {
                            listM9337 = EmptyList.INSTANCE;
                        }
                    }
                    C9069 c9069M14318 = C9069.m14318();
                    c9069M14318.f11927 = DialogX$THEME.AUTO;
                    c9069M14318.f23106 = "选择下载位置";
                    c9069M14318.m14322();
                    c9069M14318.f23109 = new C9606(c8882, listM9337);
                    c9069M14318.m14322();
                    c9069M14318.f23117 = false;
                    c9069M14318.m14319();
                }
                break;
            case 9:
                C9069 c9069 = (C9069) obj2;
                C8882 c88822 = (C8882) obj;
                String string3 = AbstractC5976.m10714(((EditText) obj3).getText().toString()).toString();
                if (string3.length() != 0) {
                    String strReplace = new Regex("[\\\\/:*?\"<>|]").replace(string3, JavaConstant.Dynamic.DEFAULT_NAME);
                    if (strReplace.length() != 0) {
                        c9069.m14323();
                        ((C7897) c88822.f22569).invoke(strReplace);
                        break;
                    }
                }
                break;
            default:
                C9895 c9895 = (C9895) obj2;
                Context context3 = ((C9492) obj3).itemView.getContext();
                context3.getClass();
                String str3 = c9895.getPluginInfo().getName() + " v" + c9895.getPluginInfo().getVersion() + "的预览";
                ImageView imageView = new ImageView(context3);
                int i4 = (int) ((10.0f * context3.getResources().getDisplayMetrics().density) + 0.5f);
                imageView.setPadding(i4, 0, i4, 0);
                ((C3894) ComponentCallbacks2C3890.m7324(imageView).m7356((String) obj).m7174()).m7349(imageView);
                C9037 c9037M142882 = C9037.m14288(str3, "预览图");
                c9037M142882.f22961 = new C9548(imageView, 2);
                c9037M142882.mo14280();
                c9037M142882.mo14278("确定", new C6380(i2));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6375(File file, Dialog dialog, Context context) {
        this.f15646 = 1;
        this.f15644 = file;
        this.f15645 = dialog;
        this.f15643 = context;
    }

    public /* synthetic */ ViewOnClickListenerC6375(Object obj, Object obj2, Object obj3, int i) {
        this.f15646 = i;
        this.f15645 = obj;
        this.f15643 = obj2;
        this.f15644 = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC6375(C9622 c9622, EditText editText, EditText editText2, DialogC7148 dialogC7148) {
        this.f15646 = 7;
        this.f15645 = editText;
        this.f15643 = editText2;
        this.f15644 = dialogC7148;
    }
}
