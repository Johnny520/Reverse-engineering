package p319;

import android.view.View;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.view.C5548;
import lin.xposed.hook.util.qq.QQEnvTool;
import org.json.JSONException;
import p007.AbstractC6136;
import p075.C6957;
import p257.C8211;
import p257.C8239;
import p324.C8737;
import p324.C8738;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8706 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8687 f24550;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C8239 f24551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f24553;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ File f24554;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ EditText f24556;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f24558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f24559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24560 = 1;

    public /* synthetic */ ViewOnClickListenerC8706(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, File file, String str, C8239 c8239, C8687 c8687) {
        this.f24558 = editText;
        this.f24559 = editText2;
        this.f24553 = arrayList;
        this.f24552 = editText3;
        this.f24556 = editText4;
        this.f24557 = ref$ObjectRef;
        this.f24554 = file;
        this.f24555 = str;
        this.f24551 = c8239;
        this.f24550 = c8687;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, IOException {
        int i = this.f24560;
        C8687 c8687 = this.f24550;
        C8239 c8239 = this.f24551;
        String str = this.f24555;
        File file = this.f24554;
        Ref$ObjectRef ref$ObjectRef = this.f24557;
        EditText editText = this.f24556;
        EditText editText2 = this.f24552;
        ArrayList arrayList = this.f24553;
        EditText editText3 = this.f24559;
        EditText editText4 = this.f24558;
        switch (i) {
            case 0:
                String string = AbstractC5143.m10150(editText4.getText().toString()).toString();
                if (string.length() != 0) {
                    Integer numM10136 = AbstractC5138.m10136(AbstractC5143.m10150(editText3.getText().toString()).toString());
                    C8737 c8737 = new C8737(string, AbstractC4343.m8804(arrayList), AbstractC5143.m10150(editText2.getText().toString()).toString(), AbstractC5143.m10150(editText.getText().toString()).toString(), numM10136 != null ? numM10136.intValue() : 1, (String) ref$ObjectRef.element);
                    if (string.equals(str)) {
                        C8737.f24631.getClass();
                        C6957.m12234(file, c8737);
                    } else {
                        C8738.f24639.getClass();
                        if (C8738.m14411().contains(string)) {
                            C8211.m13720(string.concat(AbstractC3056.m6668(-3937830620710045095L))).m13724();
                        } else {
                            File file2 = new File(C8738.m14405(), string);
                            if (!file.renameTo(file2)) {
                                C8211.m13720(AbstractC3056.m6668(-3937830655069783463L)).m13724();
                            } else {
                                C8737.f24631.getClass();
                                C6957.m12234(file2, c8737);
                            }
                        }
                    }
                    c8239.m13747();
                    C8211.m13720(AbstractC3056.m6668(-3937585270703261095L)).m13723();
                    c8687.invoke();
                } else {
                    C8211.m13720(AbstractC3056.m6668(-3937830728084227495L)).m13724();
                }
                break;
            default:
                String string2 = AbstractC5143.m10150(editText4.getText().toString()).toString();
                if (string2.length() != 0) {
                    Integer numM101362 = AbstractC5138.m10136(AbstractC5143.m10150(editText3.getText().toString()).toString());
                    C8737 c87372 = new C8737(string2, AbstractC4343.m8804(arrayList), AbstractC5143.m10150(editText2.getText().toString()).toString(), AbstractC5143.m10150(editText.getText().toString()).toString(), numM101362 != null ? numM101362.intValue() : 1, (String) ref$ObjectRef.element);
                    if (!string2.equals(str)) {
                        C8738.f24639.getClass();
                        if (C8738.m14411().contains(string2)) {
                            C8211.m13720(string2.concat(AbstractC3056.m6668(-3937830620710045095L))).m13724();
                        } else {
                            File file3 = new File(C8738.m14405(), string2);
                            if (!file.renameTo(file3)) {
                                C8211.m13720(AbstractC3056.m6668(-3937830655069783463L)).m13724();
                            } else {
                                file = file3;
                            }
                        }
                    }
                    C8737.f24631.getClass();
                    C6957.m12234(file, c87372);
                    c8239.m13747();
                    if (StickerSdkConfig.getSTICKER_DIR().length() == 0) {
                        C8738.f24639.getClass();
                        StickerSdkConfig.setSTICKER_DIR(C8738.m14405());
                    }
                    if (StickerSdkConfig.getUSER_UIN().length() == 0) {
                        String currentUin = QQEnvTool.getCurrentUin();
                        AbstractC3056.m6668(-3937693259065984423L);
                        currentUin.getClass();
                        StickerSdkConfig.setUSER_UIN(currentUin);
                        String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
                        AbstractC3056.m6668(-3937693203231409575L);
                        currentAccountNickName.getClass();
                        StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
                    }
                    String name = file.getName();
                    AbstractC3056.m6668(-3937741817966232999L);
                    name.getClass();
                    AbstractC3056.m6668(-3937817920491750823L);
                    C8738.f24639.getClass();
                    File file4 = new File(C8738.m14405(), name);
                    if (file4.exists()) {
                        List listM12233 = C6957.m12233(file4);
                        if (listM12233.isEmpty()) {
                            C8211.m13720(AbstractC3056.m6668(-3937828748104304039L)).m13724();
                        } else {
                            C8737 c8737M12232 = C6957.m12232(file4);
                            C8239 c8239M13743 = C8239.m13743();
                            c8239M13743.f22762 = AbstractC3056.m6668(-3937828687974761895L);
                            c8239M13743.m13746();
                            StringBuilder sb = new StringBuilder();
                            AbstractC6136.m11544(-3937828679384827303L, sb, name);
                            sb.append(AbstractC3056.m6668(-3937828705154631079L));
                            c8239M13743.f22761 = sb.toString();
                            c8239M13743.m13746();
                            c8239M13743.f22765 = new C8698(name, listM12233, c8737M12232, file4);
                            c8239M13743.m13746();
                            String strM6668 = AbstractC3056.m6668(-3937640040126219687L);
                            C5548 c5548 = new C5548(3);
                            c8239M13743.f22764 = strM6668;
                            c8239M13743.f22760 = c5548;
                            c8239M13743.m13746();
                            c8239M13743.m13744();
                        }
                    } else {
                        C8211.m13720(AbstractC3056.m6668(-3937828872658355623L)).m13724();
                    }
                    c8687.invoke();
                } else {
                    C8211.m13720(AbstractC3056.m6668(-3937830543400633767L)).m13724();
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC8706(EditText editText, EditText editText2, ArrayList arrayList, EditText editText3, EditText editText4, Ref$ObjectRef ref$ObjectRef, String str, File file, C8239 c8239, C8687 c8687) {
        this.f24558 = editText;
        this.f24559 = editText2;
        this.f24553 = arrayList;
        this.f24552 = editText3;
        this.f24556 = editText4;
        this.f24557 = ref$ObjectRef;
        this.f24555 = str;
        this.f24554 = file;
        this.f24551 = c8239;
        this.f24550 = c8687;
    }
}
