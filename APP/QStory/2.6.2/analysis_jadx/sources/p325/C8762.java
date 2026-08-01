package p325;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.Map;
import kotlin.C5175;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import p007.AbstractC6136;
import p052.InterfaceC6553;
import p088.AbstractC7175;
import p088.C7151;
import p257.AbstractC8210;
import p257.C8197;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.ui.components.AbstractC5963;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8762 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24681;

    public /* synthetic */ C8762(int i) {
        this.f24681 = i;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24681;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                C7151 c7151 = (C7151) obj;
                AbstractC7175 abstractC7175 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937732158584784295L);
                c7151.getClass();
                int iM14421 = AbstractC8757.m14421(c7151, AbstractC3056.m6668(-3937814823820330407L));
                Integer numValueOf = iM14421 > 0 ? Integer.valueOf(iM14421) : null;
                AbstractC8753.m14416().sendLike(AbstractC3056.m6713(c7151, AbstractC3056.m6668(-3937817284836591015L)), numValueOf != null ? numValueOf.intValue() : 20);
                break;
            case 1:
                C7151 c71512 = (C7151) obj;
                AbstractC6136.m11543(-3937732158584784295L, c71512).sendProto(AbstractC3056.m6713(c71512, AbstractC3056.m6668(-3937601411190359463L)), AbstractC3056.m6713(c71512, AbstractC3056.m6668(-3937809729989117351L)));
                break;
            case 2:
                C7151 c71513 = (C7151) obj;
                AbstractC7175 abstractC71752 = (AbstractC7175) obj2;
                QQNTPluginMethod qQNTPluginMethodM11543 = AbstractC6136.m11543(-3937732158584784295L, c71513);
                String strM14428 = AbstractC8757.m14428(c71513, AbstractC3056.m6668(-3937799847269369255L));
                String string = strM14428 != null ? AbstractC5143.m10150(strM14428).toString() : null;
                if (string == null) {
                    string = AbstractC3056.m6668(-3937561979095614887L);
                }
                qQNTPluginMethodM11543.sendPai(string, AbstractC3056.m6713(c71513, AbstractC3056.m6668(-3937586675157566887L)));
                break;
            case 3:
                C7151 c71514 = (C7151) obj;
                AbstractC7175 abstractC71753 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937732158584784295L);
                c71514.getClass();
                String strM6713 = AbstractC3056.m6713(c71514, AbstractC3056.m6668(-3937610245938087335L));
                String strM6668 = AbstractC3056.m6668(-3937589565670557095L);
                AbstractC3056.m6668(-3937687825932354983L);
                AbstractC3056.m6668(-3937597717518484903L);
                C7151 c7151M14420 = AbstractC8757.m14420(c71514, strM6668);
                if (c7151M14420 == null) {
                    C5919.m11249(strM6668.concat(AbstractC3056.m6668(-3937799997593224615L)));
                } else {
                    Map<String, String> mapM14427 = AbstractC8757.m14427(c7151M14420);
                    Map<String, String> mapM14426 = AbstractC8757.m14426(AbstractC8757.m14420(c71514, AbstractC3056.m6668(-3937808776506377639L)));
                    String strHttpPost = mapM14426.isEmpty() ? AbstractC8753.m14416().httpPost(strM6713, mapM14427) : AbstractC8753.m14416().httpPost(strM6713, mapM14426, mapM14427);
                    strHttpPost.getClass();
                }
                break;
            case 4:
                C7151 c71515 = (C7151) obj;
                AbstractC7175 abstractC71754 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937732158584784295L);
                c71515.getClass();
                String strM67132 = AbstractC3056.m6713(c71515, AbstractC3056.m6668(-3937610245938087335L));
                String strM67133 = AbstractC3056.m6713(c71515, AbstractC3056.m6668(-3937816627706594727L));
                Map<String, String> mapM144262 = AbstractC8757.m14426(AbstractC8757.m14420(c71515, AbstractC3056.m6668(-3937808776506377639L)));
                if (mapM144262.isEmpty()) {
                    AbstractC8753.m14416().httpDownload(strM67132, strM67133);
                } else {
                    AbstractC8753.m14416().httpDownload(strM67132, strM67133, mapM144262);
                }
                break;
            case 5:
                C7151 c71516 = (C7151) obj;
                AbstractC7175 abstractC71755 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937732158584784295L);
                c71516.getClass();
                String strM67134 = AbstractC3056.m6713(c71516, AbstractC3056.m6668(-3937610245938087335L));
                Map<String, String> mapM144263 = AbstractC8757.m14426(AbstractC8757.m14420(c71516, AbstractC3056.m6668(-3937808776506377639L)));
                String strHttpGet = mapM144263.isEmpty() ? AbstractC8753.m14416().httpGet(strM67134) : AbstractC8753.m14416().httpGet(strM67134, mapM144263);
                strHttpGet.getClass();
                break;
            case 6:
                C7151 c71517 = (C7151) obj;
                AbstractC7175 abstractC71756 = (AbstractC7175) obj2;
                AbstractC3056.m6668(-3937732158584784295L);
                c71517.getClass();
                String strM67135 = AbstractC3056.m6713(c71517, AbstractC3056.m6668(-3937610245938087335L));
                String strM67136 = AbstractC3056.m6713(c71517, AbstractC3056.m6668(-3937809729989117351L));
                Map<String, String> mapM144264 = AbstractC8757.m14426(AbstractC8757.m14420(c71517, AbstractC3056.m6668(-3937808776506377639L)));
                String strHttpPostJson = mapM144264.isEmpty() ? AbstractC8753.m14416().httpPostJson(strM67135, strM67136) : AbstractC8753.m14416().httpPostJson(strM67135, mapM144264, strM67136);
                strHttpPostJson.getClass();
                break;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                C8197.m13693();
                if (!zBooleanValue) {
                    AbstractC8210.m13718(str, WaitDialog$TYPE.ERROR);
                } else {
                    AbstractC8210.m13718(str, WaitDialog$TYPE.SUCCESS);
                }
                break;
            default:
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (!c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c1324.m2329();
                } else {
                    AbstractC5963.f16174.invoke(c1324, 0);
                }
                break;
        }
        return c5175;
    }
}
