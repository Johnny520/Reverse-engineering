package p252;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import io.ktor.server.engine.C4098;
import java.io.File;
import kotlin.C5175;
import p052.InterfaceC6557;
import p088.C7151;
import p257.AbstractC8210;
import p257.C8197;
import p325.C8758;
import p325.C8766;

/* JADX INFO: renamed from: 飘花落叶言楪兰苏世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8187 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f22562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22563;

    public /* synthetic */ C8187(String str, int i) {
        this.f22563 = i;
        this.f22562 = str;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f22563;
        C5175 c5175 = C5175.f14739;
        String str = this.f22562;
        switch (i) {
            case 0:
                C4098 c4098 = (C4098) obj;
                c4098.getClass();
                c4098.f12442 = str;
                break;
            case 1:
                C8766 c8766 = (C8766) obj;
                "$this$jsonArray";
                c8766.getClass();
                "block";
                C8758 c8758 = new C8758();
                "$this$jsonObject";
                c8758.m14434("text", "type");
                c8758.m14434(str, "text");
                c8766.m14436(new C7151(c8758.f24678));
                break;
            case 2:
                C8758 c87582 = (C8758) obj;
                c87582.m14434("integer", AbstractC2442.m4573(-3937791360413992359L, c87582, -3937627417217336743L));
                c87582.m14434(str, "description");
                break;
            default:
                ((Boolean) obj).getClass();
                C8197.m13693();
                AbstractC8210.m13718("安装成功!可在本地脚本查看", WaitDialog$TYPE.SUCCESS);
                new File(str).delete();
                break;
        }
        return c5175;
    }
}
