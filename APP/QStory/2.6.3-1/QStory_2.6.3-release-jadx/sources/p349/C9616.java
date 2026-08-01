package p349;

import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.runtime.C2169;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3897;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p068.InterfaceC7372;
import p103.C7932;
import p103.C7947;
import p103.C7964;
import p303.AbstractC9234;
import p360.AbstractC9653;
import p360.AbstractC9655;
import p360.AbstractC9657;
import p360.C9662;
import p367.AbstractC9692;
import p400.C9840;
import p405.AbstractC9919;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;
import top.suzhelan.qstory.entity.proto.QQMessage;

/* JADX INFO: renamed from: 飘花落叶言苏世子哲兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9616 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25099;

    public /* synthetic */ C9616(int i) {
        this.f25099 = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        switch (this.f25099) {
            case 0:
                return InfoSyncPush.SyncContent.GroupSyncContent._childSerializers$_anonymous_();
            case 1:
                return InfoSyncPush.SyncRecallOperateInfo._childSerializers$_anonymous_();
            case 2:
                return InfoSyncPush.SyncRecallOperateInfo.SyncInfoBody._childSerializers$_anonymous_();
            case 3:
                return QQMessage.MessageBody.RichMsg._childSerializers$_anonymous_();
            case 4:
                return AbstractC9653.m15045();
            case 5:
                C2169 c2169 = AbstractC9657.f25233;
                return Boolean.TRUE;
            case 6:
                return new C9662(new C2865(0L, AbstractC3400.m5640(17), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(17), null, 0L, 0L, 0, AbstractC3400.m5622(1.2f, 8589934592L), 16646141), new C2865(0L, AbstractC3400.m5640(16), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(14), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(17), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(13), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(11), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(17), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(16), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(14), C2822.f6218, 0L, 0L, 0, 0L, 16777209), new C2865(0L, AbstractC3400.m5640(32), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(24), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(20), null, 0L, 0L, 0, 0L, 16777213), new C2865(0L, AbstractC3400.m5640(18), null, 0L, 0L, 0, 0L, 16777213));
            case 7:
                C2169 c21692 = AbstractC9655.f25231;
                return null;
            case 8:
                Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2853));
                clsM15228.getClass();
                Object qRouteApi = QQEnvTool.getQRouteApi(clsM15228);
                qRouteApi.getClass();
                return (String) AbstractC3897.m7397(qRouteApi, AbstractC9234.m14531(2854), new Object[0]);
            case 9:
                return AbstractC9692.f25349;
            case 10:
                return new C7932(C7947.f19399, 0);
            case 11:
                return new C7932(C9840.f25633, 0);
            default:
                return new C7932(C7964.f19434, 0);
        }
    }
}
