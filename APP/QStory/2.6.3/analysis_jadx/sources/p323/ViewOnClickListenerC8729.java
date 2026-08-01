package p323;

import android.view.View;
import android.widget.EditText;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.javaplugin.view.C5549;
import lin.xposed.hook.util.qq.QQEnvTool;
import org.json.JSONException;
import p075.C6961;
import p257.C8212;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8687;
import p321.C8688;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8729 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8710 f24600;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8240 f24601;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ File f24604;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24605;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f24606;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24608;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f24609;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24610 = 1;

    public /* synthetic */ ViewOnClickListenerC8729(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, File file, String str, C8240 c8240, C8710 c8710) {
        this.f24608 = editText;
        this.f24609 = editText2;
        this.f24603 = arrayList;
        this.f24602 = editText3;
        this.f24606 = editText4;
        this.f24607 = ref$ObjectRef;
        this.f24604 = file;
        this.f24605 = str;
        this.f24601 = c8240;
        this.f24600 = c8710;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, IOException {
        int i = this.f24610;
        C8710 c8710 = this.f24600;
        C8240 c8240 = this.f24601;
        String str = this.f24605;
        File file = this.f24604;
        Ref$ObjectRef ref$ObjectRef = this.f24607;
        EditText editText = this.f24606;
        EditText editText2 = this.f24602;
        ArrayList arrayList = this.f24603;
        EditText editText3 = this.f24609;
        EditText editText4 = this.f24608;
        switch (i) {
            case 0:
                String string = AbstractC5144.m10155(editText4.getText().toString()).toString();
                if (string.length() != 0) {
                    Integer numM10140 = AbstractC5139.m10140(AbstractC5144.m10155(editText3.getText().toString()).toString());
                    C8687 c8687 = new C8687(string, AbstractC4344.m8797(arrayList), AbstractC5144.m10155(editText2.getText().toString()).toString(), AbstractC5144.m10155(editText.getText().toString()).toString(), numM10140 != null ? numM10140.intValue() : 1, (String) ref$ObjectRef.element);
                    if (string.equals(str)) {
                        C8687.f24498.getClass();
                        C6961.m12273(file, c8687);
                    } else {
                        C8688.f24506.getClass();
                        if (C8688.m14416().contains(string)) {
                            C8212.m13737(string.concat(AbstractC8405.m13972(2738))).m13741();
                        } else {
                            File file2 = new File(C8688.m14410(), string);
                            if (!file.renameTo(file2)) {
                                C8212.m13737(AbstractC8405.m13972(2739)).m13741();
                            } else {
                                C8687.f24498.getClass();
                                C6961.m12273(file2, c8687);
                            }
                        }
                    }
                    c8240.m13764();
                    C8212.m13737(AbstractC8405.m13972(244)).m13740();
                    c8710.invoke();
                } else {
                    C8212.m13737(AbstractC8405.m13972(2737)).m13741();
                }
                break;
            default:
                String string2 = AbstractC5144.m10155(editText4.getText().toString()).toString();
                if (string2.length() != 0) {
                    Integer numM101402 = AbstractC5139.m10140(AbstractC5144.m10155(editText3.getText().toString()).toString());
                    C8687 c86872 = new C8687(string2, AbstractC4344.m8797(arrayList), AbstractC5144.m10155(editText2.getText().toString()).toString(), AbstractC5144.m10155(editText.getText().toString()).toString(), numM101402 != null ? numM101402.intValue() : 1, (String) ref$ObjectRef.element);
                    if (!string2.equals(str)) {
                        C8688.f24506.getClass();
                        if (C8688.m14416().contains(string2)) {
                            C8212.m13737(string2.concat(AbstractC8405.m13972(2738))).m13741();
                        } else {
                            File file3 = new File(C8688.m14410(), string2);
                            if (!file.renameTo(file3)) {
                                C8212.m13737(AbstractC8405.m13972(2739)).m13741();
                            } else {
                                file = file3;
                            }
                        }
                    }
                    C8687.f24498.getClass();
                    C6961.m12273(file, c86872);
                    c8240.m13764();
                    if (StickerSdkConfig.getSTICKER_DIR().length() == 0) {
                        C8688.f24506.getClass();
                        StickerSdkConfig.setSTICKER_DIR(C8688.m14410());
                    }
                    if (StickerSdkConfig.getUSER_UIN().length() == 0) {
                        String currentUin = QQEnvTool.getCurrentUin();
                        AbstractC8405.m13972(1263);
                        currentUin.getClass();
                        StickerSdkConfig.setUSER_UIN(currentUin);
                        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
                        AbstractC8405.m13972(1264);
                        currentAccountNickName.getClass();
                        StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
                    }
                    String name = file.getName();
                    AbstractC8405.m13972(1820);
                    name.getClass();
                    AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
                    C8688.f24506.getClass();
                    File file4 = new File(C8688.m14410(), name);
                    if (file4.exists()) {
                        List listM12270 = C6961.m12270(file4);
                        if (listM12270.isEmpty()) {
                            C8212.m13737(AbstractC8405.m13972(2779)).m13741();
                        } else {
                            C8687 c8687M12272 = C6961.m12272(file4);
                            C8240 c8240M13759 = C8240.m13759();
                            c8240M13759.f22761 = AbstractC8405.m13972(2780);
                            c8240M13759.m13763();
                            c8240M13759.f22760 = AbstractC8405.m13972(2781) + name + AbstractC8405.m13972(2782);
                            c8240M13759.m13763();
                            c8240M13759.f22764 = new C8724(name, listM12270, c8687M12272, file4);
                            c8240M13759.m13763();
                            String strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
                            C5549 c5549 = new C5549(3);
                            c8240M13759.f22763 = strM13973;
                            c8240M13759.f22759 = c5549;
                            c8240M13759.m13763();
                            c8240M13759.m13760();
                        }
                    } else {
                        C8212.m13737(AbstractC8405.m13972(2778)).m13741();
                    }
                    c8710.invoke();
                } else {
                    C8212.m13737(AbstractC8405.m13972(2740)).m13741();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC8729(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, String str, File file, C8240 c8240, C8710 c8710) {
        this.f24608 = editText;
        this.f24609 = editText2;
        this.f24603 = arrayList;
        this.f24602 = editText3;
        this.f24606 = editText4;
        this.f24607 = ref$ObjectRef;
        this.f24605 = str;
        this.f24604 = file;
        this.f24601 = c8240;
        this.f24600 = c8710;
    }
}
