package top.yukonga.miuix.kmp.utils;

import android.util.Log;
import android.view.VelocityTracker;
import android.widget.EditText;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1251;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.profileinstaller.AbstractC2442;
import androidx.recyclerview.widget.AbstractC2464;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2473;
import io.modelcontextprotocol.kotlin.sdk.server.C4293;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p052.InterfaceC6558;
import p087.C7131;
import p087.C7135;
import p087.C7146;
import p088.C7157;
import p089.C7182;
import p091.C7195;
import p091.C7197;
import p091.InterfaceC7191;
import p116.C7339;
import p116.InterfaceC7345;
import p236.AbstractC8111;
import p249.C8159;
import p251.AbstractC8175;
import p287.AbstractC8405;
import p329.C8766;
import p329.C8774;
import p330.C8778;
import p352.RunnableC8867;
import p385.C9072;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6057 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16554;

    public /* synthetic */ C6057(Object obj, int i) {
        this.f16554 = i;
        this.f16553 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f16554;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f16553;
        switch (i) {
            case 0:
                C6056 c6056 = (C6056) obj2;
                InterfaceC1580 interfaceC1580 = (InterfaceC1580) obj;
                interfaceC1580.getClass();
                C1573 c1573 = (C1573) interfaceC1580;
                c1573.m2863(((Number) c6056.f16547.m1033()).floatValue());
                c1573.m2867(((Number) c6056.f16545.m1033()).floatValue());
                c1573.m2853(c1573.f4643.mo1256() * 12.0f);
                c1573.m2861(c6056.f16550);
                return c5176;
            case 1:
                C7195 c7195 = (C7195) obj;
                c7195.getClass();
                List list = ((C7146) obj2).f19108;
                list.getClass();
                c7195.f19202 = list;
                return c5176;
            case 2:
                InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return interfaceC7191.mo12379(iIntValue) + ": " + interfaceC7191.mo12383(iIntValue).mo12382();
            case 3:
                C7131 c7131 = (C7131) obj2;
                C7195 c71952 = (C7195) obj;
                c71952.getClass();
                C7195.m12437(c71952, "first", c7131.f19082.getDescriptor());
                C7195.m12437(c71952, "second", c7131.f19081.getDescriptor());
                C7195.m12437(c71952, "third", c7131.f19080.getDescriptor());
                return c5176;
            case 4:
                C7182 c7182 = (C7182) obj2;
                C7195 c71953 = (C7195) obj;
                c71953.getClass();
                C7195.m12437(c71953, "type", C7135.f19088);
                C7195.m12437(c71953, "value", AbstractC8175.m13649("kotlinx.serialization.Polymorphic<" + c7182.f19169.getSimpleName() + '>', C7197.f19206, new InterfaceC7191[0]));
                EmptyList emptyList = c7182.f19168;
                emptyList.getClass();
                c71953.f19202 = emptyList;
                return c5176;
            case 5:
                InterfaceC7345 interfaceC7345 = ((C7339) obj2).f19553;
                return Boolean.valueOf(interfaceC7345 != null ? interfaceC7345.mo1485(obj) : true);
            case 6:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (AbstractC8111.f22408.contains(b) || AbstractC8111.f22406.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(AbstractC8111.m13581(bByteValue));
                }
                return c5176;
            case 7:
                C8159 c8159 = (C8159) obj;
                c8159.getClass();
                c8159.f22499 = AbstractC0455.m1141((C4293) obj2);
                return c5176;
            case 8:
                MessageData messageData = (MessageData) obj2;
                C8766 c8766 = (C8766) obj;
                AbstractC8405.m13972(2295);
                c8766.getClass();
                c8766.m14468(messageData.UserUin, AbstractC8405.m13972(2612));
                c8766.m14468(messageData.SenderNickName, AbstractC8405.m13972(2613));
                c8766.m14468(Long.valueOf(messageData.MessageTime), AbstractC8405.m13972(2610));
                c8766.m14468(messageData.MessageContent, AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜"));
                c8766.m14468(Integer.valueOf(messageData.MessageType), AbstractC8405.m13972(2611));
                return c5176;
            case 9:
                FriendInfo friendInfo = (FriendInfo) obj2;
                C8766 c87662 = (C8766) obj;
                AbstractC8405.m13972(2295);
                c87662.getClass();
                c87662.m14468(friendInfo.uin, AbstractC8405.m13972(2499));
                c87662.m14468(friendInfo.remark, AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵呜喵喵喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵喵呜喵喵"));
                c87662.m14468(friendInfo.name, AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
                c87662.m14468(Boolean.valueOf(friendInfo.isVip), AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵喵呜~呜呜呜喵喵喵喵喵~呜喵喵喵呜呜喵呜~呜呜呜呜喵呜喵喵~呜呜呜呜喵呜喵喵"));
                c87662.m14468(Integer.valueOf(friendInfo.vipLevel), AbstractC8405.m13972(2500));
                return c5176;
            case 10:
                GroupInfo groupInfo = (GroupInfo) obj2;
                C8766 c87663 = (C8766) obj;
                c87663.m14468(groupInfo.GroupUin, AbstractC2442.m4582(2295, c87663, "呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵呜呜喵呜呜"));
                c87663.m14468(groupInfo.GroupName, AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜呜喵呜喵呜~呜呜呜喵喵喵喵呜"));
                c87663.m14468(groupInfo.GroupOwner, AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜呜喵呜~呜呜喵呜喵呜呜呜"));
                String strM13972 = AbstractC8405.m13972(2505);
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C8774 c8774 = new C8774();
                AbstractC8405.m13972(2337);
                ArrayList<String> arrayList = groupInfo.AdminList;
                AbstractC8405.m13972(2504);
                arrayList.getClass();
                c8774.m14469(arrayList);
                c87663.m14468(new C7157(c8774.f24718), strM13972);
                return c5176;
            case 11:
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj2;
                C8766 c87664 = (C8766) obj;
                AbstractC8405.m13972(2295);
                c87664.getClass();
                c87664.m14468(newFriendInfo.uin, AbstractC8405.m13972(2499));
                c87664.m14468(newFriendInfo.remark, AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵呜喵喵喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵喵呜喵喵"));
                c87664.m14468(newFriendInfo.nickname, AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
                c87664.m14468(Integer.valueOf(newFriendInfo.sex), AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜喵呜喵呜~呜呜喵呜呜呜喵呜~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵喵呜呜呜"));
                c87664.m14468(Integer.valueOf(newFriendInfo.age), AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~呜喵喵喵喵喵喵呜~呜呜喵呜呜喵呜呜~呜呜呜喵呜喵喵喵"));
                return c5176;
            case 12:
                C2473 c2473 = (C2473) obj2;
                AbstractC2484 abstractC2484 = (AbstractC2484) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                abstractC2484.getClass();
                C8778 c8778 = c2473.f7405;
                DialogXRecycleView dialogXRecycleView = c2473.f7407;
                c8778.getClass();
                if ((AbstractC2464.m4866(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) == 0) {
                    Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                } else if (abstractC2484.itemView.getParent() != c2473.f7407) {
                    Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                } else {
                    VelocityTracker velocityTracker = c2473.f7398;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    c2473.f7398 = VelocityTracker.obtain();
                    c2473.f7414 = 0.0f;
                    c2473.f7410 = 0.0f;
                    c2473.m4884(abstractC2484, 2);
                }
                return c5176;
            default:
                C1251 c1251 = (C1251) obj2;
                C9072 c9072 = (C9072) obj;
                c9072.getClass();
                ((C5807) c1251.f3629).f15924 = c9072;
                EditText editText = (EditText) c1251.f3636;
                if (editText == null) {
                    AbstractC4395.m8908("inputEdit");
                    throw null;
                }
                editText.setHint("回复：@" + c9072.getNickname() + ":\n" + c9072.getContent());
                EditText editText2 = (EditText) c1251.f3636;
                if (editText2 != null) {
                    editText2.postDelayed(new RunnableC8867(c1251, 3), 200L);
                    return c5176;
                }
                AbstractC4395.m8908("inputEdit");
                throw null;
        }
    }
}
