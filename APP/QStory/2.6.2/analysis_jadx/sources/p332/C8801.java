package p332;

import androidx.compose.runtime.C1334;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.C1988;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p052.InterfaceC6542;
import p087.C7102;
import p087.C7117;
import p087.C7134;
import p333.AbstractC8802;
import p345.AbstractC8838;
import p345.AbstractC8840;
import p345.AbstractC8842;
import p345.C8847;
import p346.AbstractC8850;
import p346.AbstractC8851;
import p351.AbstractC8871;
import p383.C9001;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9125;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;
import top.suzhelan.qstory.entity.proto.QQMessage;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8801 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24773;

    public /* synthetic */ C8801(int i) {
        this.f24773 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        boolean zBooleanValue;
        switch (this.f24773) {
            case 0:
                return InfoSyncPush.SyncContent.GroupSyncContent._childSerializers$_anonymous_();
            case 1:
                return InfoSyncPush.SyncRecallOperateInfo._childSerializers$_anonymous_();
            case 2:
                return InfoSyncPush.SyncRecallOperateInfo.SyncInfoBody._childSerializers$_anonymous_();
            case 3:
                return QQMessage.MessageBody.RichMsg._childSerializers$_anonymous_();
            case 4:
                for (GroupInfo groupInfo : AbstractC9124.m14671()) {
                    String str = groupInfo.GroupUin;
                    int i = AbstractC8850.f24956;
                    String strM11557 = AbstractC6136.m11557(-3937678772141295015L, new StringBuilder(), str);
                    if (AbstractC8851.m14491(str) && AbstractC8851.f24959.m14643(String.class, strM11557).contains(QQEnvTool.getCurrentUin())) {
                        zBooleanValue = true;
                    } else {
                        Object objM14669 = AbstractC9124.m14669(str);
                        C9125 c9125M14679 = C9125.m14679(objM14669);
                        c9125M14679.f25504 = AbstractC3056.m6668(-3937678578867766695L);
                        c9125M14679.f25506 = Boolean.TYPE;
                        zBooleanValue = ((Boolean) c9125M14679.m14682(objM14669, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        ArrayList arrayList = AbstractC8802.f24774;
                        String str2 = groupInfo.GroupUin;
                        AbstractC3056.m6668(-3937706844047541671L);
                        str2.getClass();
                        arrayList.add(str2);
                    }
                }
                return C5175.f14739;
            case 5:
                return AbstractC8838.m14475();
            case 6:
                C1334 c1334 = AbstractC8842.f24905;
                return Boolean.TRUE;
            case 7:
                return new C8847(new C2031(0L, AbstractC9124.m14670(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(17), null, 0L, 0L, 0, AbstractC9124.m14667(1.2f, 8589934592L), 16646141), new C2031(0L, AbstractC9124.m14670(16), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(14), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(13), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(11), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(17), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(16), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(14), C1988.f5872, 0L, 0L, 0, 0L, 16777209), new C2031(0L, AbstractC9124.m14670(32), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(24), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(20), null, 0L, 0L, 0, 0L, 16777213), new C2031(0L, AbstractC9124.m14670(18), null, 0L, 0L, 0, 0L, 16777213));
            case 8:
                C1334 c13342 = AbstractC8840.f24903;
                return null;
            case 9:
                Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937275509071938983L));
                clsM14657.getClass();
                Object qRouteApi = QQEnvTool.getQRouteApi(clsM14657);
                qRouteApi.getClass();
                return (String) AbstractC5061.m10031(qRouteApi, AbstractC3056.m6668(-3937275285733639591L), new Object[0]);
            case 10:
                return AbstractC8871.f25006;
            case 11:
                return new C7102(C7117.f19059, 0);
            case 12:
                return new C7102(C9001.f25293, 0);
            default:
                return new C7102(C7134.f19094, 0);
        }
    }
}
