package p339;

import android.view.View;
import android.widget.EditText;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.view.C6380;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import org.json.JSONException;
import p091.C7790;
import p273.C9041;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9516;
import p337.C9517;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9558 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9539 f24945;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C9069 f24946;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24947;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24948;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ File f24949;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24950;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f24951;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f24954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24955 = 1;

    public /* synthetic */ ViewOnClickListenerC9558(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, File file, String str, C9069 c9069, C9539 c9539) {
        this.f24953 = editText;
        this.f24954 = editText2;
        this.f24948 = arrayList;
        this.f24947 = editText3;
        this.f24951 = editText4;
        this.f24952 = ref$ObjectRef;
        this.f24949 = file;
        this.f24950 = str;
        this.f24946 = c9069;
        this.f24945 = c9539;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, IOException {
        int i = this.f24955;
        C9539 c9539 = this.f24945;
        C9069 c9069 = this.f24946;
        String str = this.f24950;
        File file = this.f24949;
        Ref$ObjectRef ref$ObjectRef = this.f24952;
        EditText editText = this.f24951;
        EditText editText2 = this.f24947;
        ArrayList arrayList = this.f24948;
        EditText editText3 = this.f24954;
        EditText editText4 = this.f24953;
        switch (i) {
            case 0:
                String string = AbstractC5976.m10714(editText4.getText().toString()).toString();
                if (string.length() != 0) {
                    Integer numM10699 = AbstractC5971.m10699(AbstractC5976.m10714(editText3.getText().toString()).toString());
                    C9516 c9516 = new C9516(string, AbstractC5176.m9356(arrayList), AbstractC5976.m10714(editText2.getText().toString()).toString(), AbstractC5976.m10714(editText.getText().toString()).toString(), numM10699 != null ? numM10699.intValue() : 1, (String) ref$ObjectRef.element);
                    if (string.equals(str)) {
                        C9516.f24843.getClass();
                        C7790.m12832(file, c9516);
                    } else {
                        C9517.f24851.getClass();
                        if (C9517.m14975().contains(string)) {
                            C9041.m14296(string.concat(AbstractC9234.m14531(2738))).m14300();
                        } else {
                            File file2 = new File(C9517.m14969(), string);
                            if (!file.renameTo(file2)) {
                                C9041.m14296(AbstractC9234.m14531(2739)).m14300();
                            } else {
                                C9516.f24843.getClass();
                                C7790.m12832(file2, c9516);
                            }
                        }
                    }
                    c9069.m14323();
                    C9041.m14296(AbstractC9234.m14531(244)).m14299();
                    c9539.invoke();
                } else {
                    C9041.m14296(AbstractC9234.m14531(2737)).m14300();
                }
                break;
            default:
                String string2 = AbstractC5976.m10714(editText4.getText().toString()).toString();
                if (string2.length() != 0) {
                    Integer numM106992 = AbstractC5971.m10699(AbstractC5976.m10714(editText3.getText().toString()).toString());
                    C9516 c95162 = new C9516(string2, AbstractC5176.m9356(arrayList), AbstractC5976.m10714(editText2.getText().toString()).toString(), AbstractC5976.m10714(editText.getText().toString()).toString(), numM106992 != null ? numM106992.intValue() : 1, (String) ref$ObjectRef.element);
                    if (!string2.equals(str)) {
                        C9517.f24851.getClass();
                        if (C9517.m14975().contains(string2)) {
                            C9041.m14296(string2.concat(AbstractC9234.m14531(2738))).m14300();
                        } else {
                            File file3 = new File(C9517.m14969(), string2);
                            if (!file.renameTo(file3)) {
                                C9041.m14296(AbstractC9234.m14531(2739)).m14300();
                            } else {
                                file = file3;
                            }
                        }
                    }
                    C9516.f24843.getClass();
                    C7790.m12832(file, c95162);
                    c9069.m14323();
                    if (StickerSdkConfig.getSTICKER_DIR().length() == 0) {
                        C9517.f24851.getClass();
                        StickerSdkConfig.setSTICKER_DIR(C9517.m14969());
                    }
                    if (StickerSdkConfig.getUSER_UIN().length() == 0) {
                        String currentUin = QQEnvTool.getCurrentUin();
                        AbstractC9234.m14531(1263);
                        currentUin.getClass();
                        StickerSdkConfig.setUSER_UIN(currentUin);
                        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
                        AbstractC9234.m14531(1264);
                        currentAccountNickName.getClass();
                        StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
                    }
                    String name = file.getName();
                    AbstractC9234.m14531(1820);
                    name.getClass();
                    AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
                    C9517.f24851.getClass();
                    File file4 = new File(C9517.m14969(), name);
                    if (file4.exists()) {
                        List listM12829 = C7790.m12829(file4);
                        if (listM12829.isEmpty()) {
                            C9041.m14296(AbstractC9234.m14531(2779)).m14300();
                        } else {
                            C9516 c9516M12831 = C7790.m12831(file4);
                            C9069 c9069M14318 = C9069.m14318();
                            c9069M14318.f23106 = AbstractC9234.m14531(2780);
                            c9069M14318.m14322();
                            c9069M14318.f23105 = AbstractC9234.m14531(2781) + name + AbstractC9234.m14531(2782);
                            c9069M14318.m14322();
                            c9069M14318.f23109 = new C9553(name, listM12829, c9516M12831, file4);
                            c9069M14318.m14322();
                            String strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
                            C6380 c6380 = new C6380(3);
                            c9069M14318.f23108 = strM14532;
                            c9069M14318.f23104 = c6380;
                            c9069M14318.m14322();
                            c9069M14318.m14319();
                        }
                    } else {
                        C9041.m14296(AbstractC9234.m14531(2778)).m14300();
                    }
                    c9539.invoke();
                } else {
                    C9041.m14296(AbstractC9234.m14531(2740)).m14300();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC9558(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, String str, File file, C9069 c9069, C9539 c9539) {
        this.f24953 = editText;
        this.f24954 = editText2;
        this.f24948 = arrayList;
        this.f24947 = editText3;
        this.f24951 = editText4;
        this.f24952 = ref$ObjectRef;
        this.f24950 = str;
        this.f24949 = file;
        this.f24946 = c9069;
        this.f24945 = c9539;
    }
}
