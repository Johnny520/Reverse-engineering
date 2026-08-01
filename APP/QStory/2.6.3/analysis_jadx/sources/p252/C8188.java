package p252;

import androidx.profileinstaller.AbstractC2442;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import io.ktor.server.engine.C4099;
import java.io.File;
import kotlin.C5176;
import p052.InterfaceC6558;
import p088.C7152;
import p257.AbstractC8211;
import p257.C8198;
import p287.AbstractC8405;
import p329.C8766;
import p329.C8774;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8188 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f22561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22562;

    public /* synthetic */ C8188(String str, int i) {
        this.f22562 = i;
        this.f22561 = str;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f22562;
        C5176 c5176 = C5176.f14739;
        String str = this.f22561;
        switch (i) {
            case 0:
                C4099 c4099 = (C4099) obj;
                c4099.getClass();
                c4099.f12446 = str;
                break;
            case 1:
                C8774 c8774 = (C8774) obj;
                AbstractC8405.m13972(2337);
                c8774.getClass();
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C8766 c8766 = new C8766();
                AbstractC8405.m13972(2295);
                c8766.m14468(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"), AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"));
                c8766.m14468(str, AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"));
                c8774.m14470(new C7152(c8766.f24703));
                break;
            case 2:
                C8766 c87662 = (C8766) obj;
                c87662.m14468(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜"), AbstractC2442.m4582(2295, c87662, "喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"));
                c87662.m14468(str, AbstractC8405.m13972(2300));
                break;
            default:
                ((Boolean) obj).getClass();
                C8198.m13710();
                AbstractC8211.m13735("安装成功!可在本地脚本查看", WaitDialog$TYPE.SUCCESS);
                new File(str).delete();
                break;
        }
        return c5176;
    }
}
