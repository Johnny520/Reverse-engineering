package top.yukonga.miuix.kmp.utils;

import android.util.Log;
import android.view.VelocityTracker;
import android.widget.EditText;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.profileinstaller.AbstractC2442;
import androidx.recyclerview.widget.AbstractC2464;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2473;
import com.bumptech.glide.AbstractC3056;
import io.modelcontextprotocol.kotlin.sdk.server.C4292;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p052.InterfaceC6557;
import p087.C7130;
import p087.C7134;
import p087.C7145;
import p088.C7151;
import p088.C7156;
import p089.C7181;
import p091.C7194;
import p091.C7196;
import p091.InterfaceC7190;
import p116.C7338;
import p116.InterfaceC7344;
import p236.AbstractC8110;
import p249.C8158;
import p325.AbstractC8757;
import p325.C8758;
import p325.C8766;
import p329.C8787;
import p342.RunnableC8819;
import p388.C9105;
import p392.AbstractC9124;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6051 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16544;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16545;

    public /* synthetic */ C6051(Object obj, int i) {
        this.f16545 = i;
        this.f16544 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16545;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f16544;
        switch (i) {
            case 0:
                C6050 c6050 = (C6050) obj2;
                InterfaceC1580 interfaceC1580 = (InterfaceC1580) obj;
                interfaceC1580.getClass();
                C1573 c1573 = (C1573) interfaceC1580;
                c1573.m2853(((Number) c6050.f16538.m1032()).floatValue());
                c1573.m2857(((Number) c6050.f16536.m1032()).floatValue());
                c1573.m2843(c1573.f4642.mo1246() * 12.0f);
                c1573.m2851(c6050.f16541);
                return c5175;
            case 1:
                C7194 c7194 = (C7194) obj;
                c7194.getClass();
                List list = ((C7145) obj2).f19113;
                list.getClass();
                c7194.f19207 = list;
                return c5175;
            case 2:
                InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return interfaceC7190.mo12352(iIntValue) + ": " + interfaceC7190.mo12356(iIntValue).mo12355();
            case 3:
                C7130 c7130 = (C7130) obj2;
                C7194 c71942 = (C7194) obj;
                c71942.getClass();
                C7194.m12410(c71942, "first", c7130.f19087.getDescriptor());
                C7194.m12410(c71942, "second", c7130.f19086.getDescriptor());
                C7194.m12410(c71942, "third", c7130.f19085.getDescriptor());
                return c5175;
            case 4:
                C7181 c7181 = (C7181) obj2;
                C7194 c71943 = (C7194) obj;
                c71943.getClass();
                C7194.m12410(c71943, "type", C7134.f19093);
                C7194.m12410(c71943, "value", AbstractC5061.m10032("kotlinx.serialization.Polymorphic<" + c7181.f19174.getSimpleName() + '>', C7196.f19211, new InterfaceC7190[0]));
                EmptyList emptyList = c7181.f19173;
                emptyList.getClass();
                c71943.f19207 = emptyList;
                return c5175;
            case 5:
                InterfaceC7344 interfaceC7344 = ((C7338) obj2).f19558;
                return Boolean.valueOf(interfaceC7344 != null ? interfaceC7344.mo1475(obj) : true);
            case 6:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (AbstractC8110.f22410.contains(b) || AbstractC8110.f22408.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(AbstractC8110.m13552(bByteValue));
                }
                return c5175;
            case 7:
                C8158 c8158 = (C8158) obj;
                c8158.getClass();
                c8158.f22501 = AbstractC9124.m14659((C4292) obj2);
                return c5175;
            case 8:
                C8758 c8758 = (C8758) obj;
                "$this$jsonObject";
                c8758.getClass();
                for (C7151 c7151 : (List) obj2) {
                    String strM14428 = AbstractC8757.m14428(c7151, "name");
                    if (strM14428 == null) {
                        strM14428 = "";
                    }
                    c8758.m14434(c7151, strM14428);
                }
                return c5175;
            case 9:
                FriendInfo friendInfo = (FriendInfo) obj2;
                C8758 c87582 = (C8758) obj;
                c87582.m14434(friendInfo.uin, AbstractC2442.m4573(-3937791360413992359L, c87582, -3937813243272365479L));
                c87582.m14434(friendInfo.remark, "\u5907\u6ce8");
                c87582.m14434(friendInfo.name, "\u6635\u79f0");
                c87582.m14434(Boolean.valueOf(friendInfo.isVip), "\u4f1a\u5458");
                c87582.m14434(Integer.valueOf(friendInfo.vipLevel), "\u4f1a\u5458\u7b49\u7ea7");
                return c5175;
            case 10:
                GroupInfo groupInfo = (GroupInfo) obj2;
                C8758 c87583 = (C8758) obj;
                c87583.m14434(groupInfo.GroupUin, AbstractC2442.m4573(-3937791360413992359L, c87583, -3937812809480668583L));
                c87583.m14434(groupInfo.GroupName, "\u7fa4\u540d");
                c87583.m14434(groupInfo.GroupOwner, "\u7fa4\u4e3b");
                String strM6668 = "\u7ba1\u7406\u5458";
                "block";
                C8766 c8766 = new C8766();
                "$this$jsonArray";
                ArrayList<String> arrayList = groupInfo.AdminList;
                "AdminList";
                arrayList.getClass();
                c8766.m14435(arrayList);
                c87583.m14434(new C7156(c8766.f24693), strM6668);
                return c5175;
            case 11:
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj2;
                C8758 c87584 = (C8758) obj;
                c87584.m14434(newFriendInfo.uin, AbstractC2442.m4573(-3937791360413992359L, c87584, -3937813243272365479L));
                c87584.m14434(newFriendInfo.remark, "\u5907\u6ce8");
                c87584.m14434(newFriendInfo.nickname, "\u6635\u79f0");
                c87584.m14434(Integer.valueOf(newFriendInfo.sex), "\u6027\u522b");
                c87584.m14434(Integer.valueOf(newFriendInfo.age), "\u5e74\u9f84");
                return c5175;
            case 12:
                MessageData messageData = (MessageData) obj2;
                C8758 c87585 = (C8758) obj;
                c87585.m14434(messageData.UserUin, AbstractC2442.m4573(-3937791360413992359L, c87585, -3937823817481848231L));
                c87585.m14434(messageData.SenderNickName, "sender_nickname");
                c87585.m14434(Long.valueOf(messageData.MessageTime), "message_time");
                c87585.m14434(messageData.MessageContent, "content");
                c87585.m14434(Integer.valueOf(messageData.MessageType), "message_type");
                return c5175;
            case 13:
                C2473 c2473 = (C2473) obj2;
                AbstractC2484 abstractC2484 = (AbstractC2484) obj;
                "holder";
                abstractC2484.getClass();
                C8787 c8787 = c2473.f7404;
                DialogXRecycleView dialogXRecycleView = c2473.f7406;
                c8787.getClass();
                if ((AbstractC2464.m4856(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) == 0) {
                    Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                } else if (abstractC2484.itemView.getParent() != c2473.f7406) {
                    Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                } else {
                    VelocityTracker velocityTracker = c2473.f7397;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    c2473.f7397 = VelocityTracker.obtain();
                    c2473.f7413 = 0.0f;
                    c2473.f7409 = 0.0f;
                    c2473.m4874(abstractC2484, 2);
                }
                return c5175;
            default:
                C1251 c1251 = (C1251) obj2;
                C9105 c9105 = (C9105) obj;
                c9105.getClass();
                ((C5806) c1251.f3628).f15924 = c9105;
                EditText editText = (EditText) c1251.f3635;
                if (editText == null) {
                    AbstractC4394.m8918("inputEdit");
                    throw null;
                }
                editText.setHint("回复：@" + c9105.getNickname() + ":\n" + c9105.getContent());
                EditText editText2 = (EditText) c1251.f3635;
                if (editText2 != null) {
                    editText2.postDelayed(new RunnableC8819(c1251, 3), 200L);
                    return c5175;
                }
                AbstractC4394.m8918("inputEdit");
                throw null;
        }
    }
}
