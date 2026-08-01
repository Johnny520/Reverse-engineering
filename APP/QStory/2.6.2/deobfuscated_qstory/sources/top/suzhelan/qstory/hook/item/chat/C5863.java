package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import java.io.File;
import kotlin.text.AbstractC5143;
import p010.AbstractC6154;
import p087.C7067;
import p257.C8211;
import p324.C8738;
import p391.C9114;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5863 implements InterfaceC3743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16019;

    public /* synthetic */ C5863(Object obj, int i) {
        this.f16019 = i;
        this.f16018 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3743
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8075(AbstractC3737 abstractC3737, View view, String str) {
        int i = this.f16019;
        Object obj = this.f16018;
        switch (i) {
            case 0:
                int i2 = C5854.f16010;
                str.getClass();
                String string = AbstractC5143.m10150(str).toString();
                int length = string.length();
                C9114 c9114 = ((C5854) obj).f16011;
                if (length != 0) {
                    c9114.m14640(string, "hint_text");
                    AbstractC6154.m11561("\u8bbe\u7f6e\u5df2\u4fdd\u5b58: ".concat(string));
                } else {
                    c9114.m14640("Hello World.", "hint_text");
                    AbstractC6154.m11561("\u5df2\u6062\u590d\u9ed8\u8ba4\u63d0\u793a: Hello World.");
                }
                break;
            default:
                C7067 c7067 = (C7067) obj;
                str.getClass();
                if (str.length() != 0) {
                    C8738.f24639.getClass();
                    File file = new File(C8738.m14405(), str);
                    if (file.exists()) {
                        C8211.m13720("\u6587\u4ef6\u5939\u5df2\u5b58\u5728").m13724();
                    } else if (file.mkdirs()) {
                        C8211.m13720("\u521b\u5efa\u6210\u529f ".concat(str)).m13723();
                        c7067.invoke(str);
                    }
                } else {
                    C8211.m13720("\u6587\u4ef6\u5939\u540d\u4e0d\u80fd\u4e3a\u7a7a").m13724();
                }
                break;
        }
        return false;
    }
}
