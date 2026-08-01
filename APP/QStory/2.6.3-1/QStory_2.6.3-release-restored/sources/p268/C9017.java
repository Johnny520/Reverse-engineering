package p268;

import androidx.profileinstaller.AbstractC3275;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import io.ktor.server.engine.C4931;
import java.io.File;
import kotlin.C6008;
import p068.InterfaceC7387;
import p104.C7981;
import p273.AbstractC9040;
import p273.C9027;
import p345.C9595;
import p345.C9603;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9017 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f22906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22907;

    public /* synthetic */ C9017(String str, int i) {
        this.f22907 = i;
        this.f22906 = str;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f22907;
        C6008 c6008 = C6008.f15084;
        String str = this.f22906;
        switch (i) {
            case 0:
                C4931 c4931 = (C4931) obj;
                c4931.getClass();
                c4931.f12791 = str;
                break;
            case 1:
                C9603 c9603 = (C9603) obj;
                "$this$jsonArray";
                c9603.getClass();
                "block";
                C9595 c9595 = new C9595();
                "$this$jsonObject";
                c9595.m15027("text", "type");
                c9595.m15027(str, "text");
                c9603.m15029(new C7981(c9595.f25048));
                break;
            case 2:
                C9595 c95952 = (C9595) obj;
                c95952.m15027("integer", AbstractC3275.m5142(2295, c95952, "type"));
                c95952.m15027(str, "description");
                break;
            default:
                ((Boolean) obj).getClass();
                C9027.m14269();
                AbstractC9040.m14294("安装成功!可在本地脚本查看", WaitDialog$TYPE.SUCCESS);
                new File(str).delete();
                break;
        }
        return c6008;
    }
}
