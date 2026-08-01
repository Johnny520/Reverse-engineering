package p333;

import androidx.compose.runtime.C1334;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.C1988;
import androidx.window.area.AbstractC2567;
import com.bumptech.glide.AbstractC3065;
import lin.xposed.hook.util.qq.QQEnvTool;
import p052.InterfaceC6543;
import p087.C7103;
import p087.C7118;
import p087.C7135;
import p287.AbstractC8405;
import p344.AbstractC8824;
import p344.AbstractC8826;
import p344.AbstractC8828;
import p344.C8833;
import p351.AbstractC8863;
import p384.C9011;
import p389.AbstractC9090;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;
import top.suzhelan.qstory.entity.proto.QQMessage;

/* JADX INFO: renamed from: 飘花落叶言苏世子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8787 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24754;

    public /* synthetic */ C8787(int i) {
        this.f24754 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f24754) {
            case 0:
                return InfoSyncPush.SyncContent.GroupSyncContent._childSerializers$_anonymous_();
            case 1:
                return InfoSyncPush.SyncRecallOperateInfo._childSerializers$_anonymous_();
            case 2:
                return InfoSyncPush.SyncRecallOperateInfo.SyncInfoBody._childSerializers$_anonymous_();
            case 3:
                return QQMessage.MessageBody.RichMsg._childSerializers$_anonymous_();
            case 4:
                return AbstractC8824.m14486();
            case 5:
                C1334 c1334 = AbstractC8828.f24888;
                return Boolean.TRUE;
            case 6:
                return new C8833(new C2031(0L, AbstractC2567.m5080(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(17), null, 0L, 0L, 0, AbstractC2567.m5062(1.2f, 8589934592L), 16646141), new C2031(0L, AbstractC2567.m5080(16), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(14), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(13), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(11), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(16), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(14), C1988.f5873, 0L, 0L, 0, 0L, 16777209), new C2031(0L, AbstractC2567.m5080(32), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(24), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(20), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC2567.m5080(18), null, 0L, 0L, 0, 0L, 16777213));
            case 7:
                C1334 c13342 = AbstractC8826.f24886;
                return null;
            case 8:
                Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2853));
                clsM14669.getClass();
                Object qRouteApi = QQEnvTool.getQRouteApi(clsM14669);
                qRouteApi.getClass();
                return (String) AbstractC3065.m6837(qRouteApi, AbstractC8405.m13972(2854), new Object[0]);
            case 9:
                return AbstractC8863.f25004;
            case 10:
                return new C7103(C7118.f19054, 0);
            case 11:
                return new C7103(C9011.f25288, 0);
            default:
                return new C7103(C7135.f19089, 0);
        }
    }
}
