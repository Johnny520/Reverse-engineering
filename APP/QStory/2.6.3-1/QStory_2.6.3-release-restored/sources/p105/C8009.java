package p105;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import com.bumptech.glide.AbstractC3889;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.AbstractC5049;
import io.ktor.util.internal.C5023;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.C5978;
import kotlin.text.C5980;
import kotlin.text.C5983;
import kotlin.text.InterfaceC5982;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p026.RunnableC7015;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p104.C7981;
import p104.C8003;
import p132.C8168;
import p252.AbstractC8951;
import p252.C8942;
import p252.C8954;
import p256.C8964;
import p268.AbstractC9016;
import p268.C9017;
import p345.AbstractC9590;
import p345.AbstractC9594;
import p345.C9595;
import p345.C9601;
import p345.C9603;
import p351.AbstractC9618;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8009 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19511;

    public /* synthetic */ C8009(int i) {
        this.f19511 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0382  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        int i = this.f19511;
        int i2 = 2;
        C6008 c6008 = C6008.f15084;
        z = false;
        boolean z = false;
        i = 0;
        int i3 = 0;
        z = false;
        boolean z2 = false;
        int i4 = 1;
        switch (i) {
            case 0:
                InterfaceC5925 interfaceC5925 = (InterfaceC5925) obj;
                interfaceC5925.getClass();
                InterfaceC8013 interfaceC8013M10429 = AbstractC5754.m10429(interfaceC5925);
                if (interfaceC8013M10429 == null) {
                    interfaceC8013M10429 = AbstractC3889.m7316(interfaceC5925).isInterface() ? new C8011(interfaceC5925) : null;
                }
                if (interfaceC8013M10429 != null) {
                    return AbstractC4765.m8872(interfaceC8013M10429);
                }
                return null;
            case 1:
                return new C8168((Map) obj);
            case 2:
                return obj;
            case 3:
                return Boolean.TRUE;
            case 4:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i5);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 5:
                InterfaceC5982 interfaceC5982 = (InterfaceC5982) obj;
                interfaceC5982.getClass();
                C5983 c5983 = ((C5980) interfaceC5982).f15042;
                C5978 c5978M10741 = c5983.m10741(2);
                String str2 = c5978M10741 != null ? c5978M10741.f15035 : "";
                C5978 c5978M107412 = c5983.m10741(4);
                return new Pair(str2, c5978M107412 != null ? c5978M107412.f15035 : "");
            case 6:
                ((Pair) obj).getClass();
                return Boolean.valueOf(!AbstractC5971.m10698((String) r13.getFirst(), "$", false));
            case 7:
                Pair pair = (Pair) obj;
                pair.getClass();
                if (!AbstractC5971.m10698((String) pair.getSecond(), "\"", false) || !AbstractC5971.m10690((String) pair.getSecond(), "\"")) {
                    return pair;
                }
                String strM721 = (String) pair.getSecond();
                strM721.getClass();
                if (strM721.length() >= 2 && AbstractC5976.m10702(strM721, "\"", false) && AbstractC5976.m10719(strM721, "\"")) {
                    strM721 = AbstractC0900.m721(1, 1, strM721);
                }
                return Pair.copy$default(pair, null, strM721, 1, null);
            case 8:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                return new Pair((C8954) pair2.component2(), (String) pair2.component1());
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                String string = AbstractC5976.m10714(str3).toString();
                if (string.length() == 0) {
                    return null;
                }
                int iM10730 = AbstractC5976.m10730(string, ',', 0, 6);
                String strSubstring = string.substring(0, iM10730);
                String strSubstring2 = string.substring(iM10730 + 1);
                String strM9190 = AbstractC5049.m9190(AbstractC5976.m10706(strSubstring, "."));
                InterfaceC6016 interfaceC6016 = AbstractC8951.f22764;
                try {
                    C8954 c8954 = C8954.f22769;
                    return new Pair(strM9190, C8942.m14141(strSubstring2));
                } catch (Throwable th) {
                    throw new IllegalArgumentException("Failed to parse ".concat(strSubstring2), th);
                }
            case 10:
                Pair pair3 = (Pair) obj;
                pair3.getClass();
                String str4 = (String) pair3.getFirst();
                return pair3.getSecond() == null ? str4 : AbstractC0900.m724(SignatureVisitor.INSTANCEOF, str4, String.valueOf(pair3.getSecond()));
            case 11:
                ((C8964) obj).getClass();
                return new C5023();
            case 12:
                InterfaceC5942 interfaceC5942 = (InterfaceC5942) obj;
                interfaceC5942.getClass();
                if (!interfaceC5942.getParameters().isEmpty()) {
                    InterfaceC5940 interfaceC5940 = (InterfaceC5940) interfaceC5942.getParameters().get(0);
                    interfaceC5940.getClass();
                    if (AbstractC9016.m14233(interfaceC5940, AbstractC9016.f22903)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 13:
                InterfaceC5942 interfaceC59422 = (InterfaceC5942) obj;
                interfaceC59422.getClass();
                List parameters = interfaceC59422.getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC5940) it.next()).mo10513() && (i3 = i3 + 1) < 0) {
                            AbstractC7176.m12480();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i3);
            case 14:
                InterfaceC5942 interfaceC59423 = (InterfaceC5942) obj;
                interfaceC59423.getClass();
                return Integer.valueOf(interfaceC59423.getParameters().size());
            case 15:
                File file = (File) obj;
                "it";
                file.getClass();
                if (file.isFile()) {
                    String name = file.getName();
                    "getName(...)";
                    name.getClass();
                    if (!name.endsWith(".bak")) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                C9595 c9595 = (C9595) obj;
                "$this$jsonObject";
                c9595.getClass();
                c9595.m15027(Integer.valueOf(AbstractC9590.m15009().getChatType()), "chat_type");
                return c6008;
            case 17:
                C9595 c95952 = (C9595) obj;
                c95952.m15027("object", AbstractC3275.m5142(2295, c95952, "type"));
                c95952.m15027(AbstractC9594.m15026(new C8009(18)), "properties");
                c95952.m15027(AbstractC9594.m15025(new C8009(19)), "required");
                return c6008;
            case 18:
                C9595 c95953 = (C9595) obj;
                "$this$jsonObject";
                c95953.getClass();
                String strM14531 = "chat_type";
                C9601 c9601 = C9601.f25061;
                String strM145312 = "会话类型，必填，可选 friend 或 group";
                c9601.getClass();
                "block";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                "$this$jsonObject";
                String strM14532 = "type";
                String strM145322 = "string";
                "key";
                linkedHashMap.put(strM14532, AbstractC9594.m15024(strM145322));
                String strM145313 = "description";
                "key";
                linkedHashMap.put(strM145313, AbstractC9594.m15024(strM145312));
                c95953.m15027(new C7981(linkedHashMap), strM14531);
                String strM145314 = "target_uin";
                String strM145315 = "目标好友 QQ号(uin) 或群号，必填";
                "block";
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                "$this$jsonObject";
                String strM145323 = "type";
                String strM145324 = "string";
                "key";
                linkedHashMap2.put(strM145323, AbstractC9594.m15024(strM145324));
                String strM145316 = "description";
                "key";
                linkedHashMap2.put(strM145316, AbstractC9594.m15024(strM145315));
                c95953.m15027(new C7981(linkedHashMap2), strM145314);
                c95953.m15027(AbstractC9594.m15026(new C9017("返回指定会话的消息数量，默认 20,最大无限制", i2)), "message_limit");
                return c6008;
            case 19:
                C9603 c9603 = (C9603) obj;
                "$this$jsonArray";
                c9603.getClass();
                c9603.m15029("chat_type");
                c9603.m15029("target_uin");
                return c6008;
            case 20:
                C8003 c8003 = (C8003) obj;
                "$this$Json";
                c8003.getClass();
                c8003.f19489 = true;
                c8003.f19490 = false;
                return c6008;
            case 21:
                "$this$jsonObject";
                ((C9595) obj).getClass();
                return c6008;
            case 22:
                String str5 = (String) obj;
                "location";
                str5.getClass();
                AbstractC9618.f25101.execute(new RunnableC7015(str5, i4));
                return c6008;
            case 23:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 24:
                C8003 c80032 = (C8003) obj;
                c80032.getClass();
                c80032.f19489 = true;
                c80032.f19490 = true;
                c80032.f19491 = false;
                c80032.f19487 = true;
                c80032.f19488 = false;
                return c6008;
            default:
                C8003 c80033 = (C8003) obj;
                c80033.getClass();
                c80033.f19489 = true;
                c80033.f19490 = true;
                c80033.f19491 = false;
                c80033.f19487 = true;
                c80033.f19488 = false;
                return c6008;
        }
    }
}
