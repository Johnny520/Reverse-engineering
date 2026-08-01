package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4576;
import java.io.File;
import kotlin.text.AbstractC5976;
import p026.AbstractC7014;
import p103.C7897;
import p273.C9041;
import p337.C9517;
import p407.C9924;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6698 implements InterfaceC4576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16371;

    public /* synthetic */ C6698(Object obj, int i) {
        this.f16371 = i;
        this.f16370 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4576
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8621(AbstractC4570 abstractC4570, View view, String str) {
        int i = this.f16371;
        Object obj = this.f16370;
        switch (i) {
            case 0:
                int i2 = C6689.f16362;
                str.getClass();
                String string = AbstractC5976.m10714(str).toString();
                int length = string.length();
                C9924 c9924 = ((C6689) obj).f16363;
                if (length != 0) {
                    c9924.m15236(string, "hint_text");
                    AbstractC7014.m12151("设置已保存: ".concat(string));
                } else {
                    c9924.m15236("Hello World.", "hint_text");
                    AbstractC7014.m12151("已恢复默认提示: Hello World.");
                }
                break;
            default:
                C7897 c7897 = (C7897) obj;
                str.getClass();
                if (str.length() != 0) {
                    C9517.f24851.getClass();
                    File file = new File(C9517.m14969(), str);
                    if (file.exists()) {
                        C9041.m14296("文件夹已存在").m14300();
                    } else if (file.mkdirs()) {
                        C9041.m14296("创建成功 ".concat(str)).m14299();
                        c7897.invoke(str);
                    }
                } else {
                    C9041.m14296("文件夹名不能为空").m14300();
                }
                break;
        }
        return false;
    }
}
