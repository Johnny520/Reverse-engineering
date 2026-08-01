package p345;

import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import com.alibaba.fastjson2.AbstractC3738;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.util.Map;
import kotlin.C6008;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.javaplugin.api.QQNTPluginMethod;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p104.AbstractC8005;
import p104.C7981;
import p273.AbstractC9040;
import p273.C9027;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.p015ui.components.AbstractC6799;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9599 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25051;

    public /* synthetic */ C9599(int i) {
        this.f25051 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25051;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                C7981 c7981 = (C7981) obj;
                AbstractC8005 abstractC8005 = (AbstractC8005) obj2;
                "args";
                c7981.getClass();
                int iM15014 = AbstractC9594.m15014("count", c7981);
                Integer numValueOf = iM15014 > 0 ? Integer.valueOf(iM15014) : null;
                AbstractC9590.m15009().sendLike(AbstractC3738.m6899("user_uin", c7981), numValueOf != null ? numValueOf.intValue() : 20);
                break;
            case 1:
                C7981 c79812 = (C7981) obj;
                AbstractC7012.m12142("args", c79812).sendProto(AbstractC3738.m6899("cmd", c79812), AbstractC3738.m6899("json_body", c79812));
                break;
            case 2:
                C7981 c79813 = (C7981) obj;
                AbstractC8005 abstractC80052 = (AbstractC8005) obj2;
                QQNTPluginMethod qQNTPluginMethodM12142 = AbstractC7012.m12142("args", c79813);
                String strM15021 = AbstractC9594.m15021("group_uin", c79813);
                String string = strM15021 != null ? AbstractC5976.m10714(strM15021).toString() : null;
                if (string == null) {
                    string = "";
                }
                qQNTPluginMethodM12142.sendPai(string, AbstractC3738.m6899("uin", c79813));
                break;
            case 3:
                C7981 c79814 = (C7981) obj;
                AbstractC8005 abstractC80053 = (AbstractC8005) obj2;
                "args";
                c79814.getClass();
                String strM6899 = AbstractC3738.m6899("url", c79814);
                String strM14532 = "data";
                "<this>";
                "name";
                C7981 c7981M15013 = AbstractC9594.m15013(strM14532, c79814);
                if (c7981M15013 == null) {
                    C6755.m11869(strM14532.concat(" 不能为空"));
                } else {
                    Map<String, String> mapM15020 = AbstractC9594.m15020(c7981M15013);
                    Map<String, String> mapM15019 = AbstractC9594.m15019(AbstractC9594.m15013("headers", c79814));
                    String strHttpPost = mapM15019.isEmpty() ? AbstractC9590.m15009().httpPost(strM6899, mapM15020) : AbstractC9590.m15009().httpPost(strM6899, mapM15019, mapM15020);
                    strHttpPost.getClass();
                }
                break;
            case 4:
                C7981 c79815 = (C7981) obj;
                AbstractC8005 abstractC80054 = (AbstractC8005) obj2;
                "args";
                c79815.getClass();
                String strM68992 = AbstractC3738.m6899("url", c79815);
                String strM68993 = AbstractC3738.m6899("path", c79815);
                Map<String, String> mapM150192 = AbstractC9594.m15019(AbstractC9594.m15013("headers", c79815));
                if (mapM150192.isEmpty()) {
                    AbstractC9590.m15009().httpDownload(strM68992, strM68993);
                } else {
                    AbstractC9590.m15009().httpDownload(strM68992, strM68993, mapM150192);
                }
                break;
            case 5:
                C7981 c79816 = (C7981) obj;
                AbstractC8005 abstractC80055 = (AbstractC8005) obj2;
                "args";
                c79816.getClass();
                String strM68994 = AbstractC3738.m6899("url", c79816);
                Map<String, String> mapM150193 = AbstractC9594.m15019(AbstractC9594.m15013("headers", c79816));
                String strHttpGet = mapM150193.isEmpty() ? AbstractC9590.m15009().httpGet(strM68994) : AbstractC9590.m15009().httpGet(strM68994, mapM150193);
                strHttpGet.getClass();
                break;
            case 6:
                C7981 c79817 = (C7981) obj;
                AbstractC8005 abstractC80056 = (AbstractC8005) obj2;
                "args";
                c79817.getClass();
                String strM68995 = AbstractC3738.m6899("url", c79817);
                String strM68996 = AbstractC3738.m6899("json_body", c79817);
                Map<String, String> mapM150194 = AbstractC9594.m15019(AbstractC9594.m15013("headers", c79817));
                String strHttpPostJson = mapM150194.isEmpty() ? AbstractC9590.m15009().httpPostJson(strM68995, strM68996) : AbstractC9590.m15009().httpPostJson(strM68995, mapM150194, strM68996);
                strHttpPostJson.getClass();
                break;
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                C9027.m14269();
                if (!zBooleanValue) {
                    AbstractC9040.m14294(str, WaitDialog$TYPE.ERROR);
                } else {
                    AbstractC9040.m14294(str, WaitDialog$TYPE.SUCCESS);
                }
                break;
            default:
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (!c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c2159.m2899();
                } else {
                    AbstractC6799.f16528.invoke(c2159, 0);
                }
                break;
        }
        return c6008;
    }
}
