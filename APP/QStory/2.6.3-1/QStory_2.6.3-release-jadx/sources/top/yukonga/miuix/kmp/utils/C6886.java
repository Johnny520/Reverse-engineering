package top.yukonga.miuix.kmp.utils;

import android.util.Log;
import android.view.VelocityTracker;
import android.widget.EditText;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.runtime.internal.C2086;
import androidx.profileinstaller.AbstractC3275;
import androidx.recyclerview.widget.AbstractC3297;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3306;
import io.modelcontextprotocol.kotlin.sdk.server.C5125;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.bean.FriendInfo;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.javaplugin.bean.MessageData;
import p068.InterfaceC7387;
import p103.C7960;
import p103.C7964;
import p103.C7975;
import p104.C7986;
import p105.C8011;
import p107.C8024;
import p107.C8026;
import p107.InterfaceC8020;
import p132.C8168;
import p132.InterfaceC8174;
import p252.AbstractC8940;
import p265.C8988;
import p267.AbstractC9004;
import p303.AbstractC9234;
import p345.C9595;
import p345.C9603;
import p346.C9607;
import p368.RunnableC9696;
import p401.C9901;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6886 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16899;

    public /* synthetic */ C6886(Object obj, int i) {
        this.f16899 = i;
        this.f16898 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16899;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f16898;
        switch (i) {
            case 0:
                C6885 c6885 = (C6885) obj2;
                InterfaceC2415 interfaceC2415 = (InterfaceC2415) obj;
                interfaceC2415.getClass();
                C2408 c2408 = (C2408) interfaceC2415;
                c2408.m3423(((Number) c6885.f16892.m1593()).floatValue());
                c2408.m3427(((Number) c6885.f16890.m1593()).floatValue());
                c2408.m3413(c2408.f4988.mo1816() * 12.0f);
                c2408.m3421(c6885.f16895);
                return c6008;
            case 1:
                C8024 c8024 = (C8024) obj;
                c8024.getClass();
                List list = ((C7975) obj2).f19453;
                list.getClass();
                c8024.f19547 = list;
                return c6008;
            case 2:
                InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return interfaceC8020.mo12938(iIntValue) + ": " + interfaceC8020.mo12942(iIntValue).mo12941();
            case 3:
                C7960 c7960 = (C7960) obj2;
                C8024 c80242 = (C8024) obj;
                c80242.getClass();
                C8024.m12996(c80242, "first", c7960.f19427.getDescriptor());
                C8024.m12996(c80242, "second", c7960.f19426.getDescriptor());
                C8024.m12996(c80242, "third", c7960.f19425.getDescriptor());
                return c6008;
            case 4:
                C8011 c8011 = (C8011) obj2;
                C8024 c80243 = (C8024) obj;
                c80243.getClass();
                C8024.m12996(c80243, "type", C7964.f19433);
                C8024.m12996(c80243, "value", AbstractC9004.m14208("kotlinx.serialization.Polymorphic<" + c8011.f19514.getSimpleName() + '>', C8026.f19551, new InterfaceC8020[0]));
                EmptyList emptyList = c8011.f19513;
                emptyList.getClass();
                c80243.f19547 = emptyList;
                return c6008;
            case 5:
                InterfaceC8174 interfaceC8174 = ((C8168) obj2).f19898;
                return Boolean.valueOf(interfaceC8174 != null ? interfaceC8174.mo2045(obj) : true);
            case 6:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (bByteValue == 32) {
                    sb.append("%20");
                } else if (AbstractC8940.f22753.contains(b) || AbstractC8940.f22751.contains(b)) {
                    sb.append((char) bByteValue);
                } else {
                    sb.append(AbstractC8940.m14140(bByteValue));
                }
                return c6008;
            case 7:
                C8988 c8988 = (C8988) obj;
                c8988.getClass();
                c8988.f22844 = AbstractC1298.m1701((C5125) obj2);
                return c6008;
            case 8:
                MessageData messageData = (MessageData) obj2;
                C9595 c9595 = (C9595) obj;
                AbstractC9234.m14531(2295);
                c9595.getClass();
                c9595.m15027(messageData.UserUin, AbstractC9234.m14531(2612));
                c9595.m15027(messageData.SenderNickName, AbstractC9234.m14531(2613));
                c9595.m15027(Long.valueOf(messageData.MessageTime), AbstractC9234.m14531(2610));
                c9595.m15027(messageData.MessageContent, AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜"));
                c9595.m15027(Integer.valueOf(messageData.MessageType), AbstractC9234.m14531(2611));
                return c6008;
            case 9:
                FriendInfo friendInfo = (FriendInfo) obj2;
                C9595 c95952 = (C9595) obj;
                AbstractC9234.m14531(2295);
                c95952.getClass();
                c95952.m15027(friendInfo.uin, AbstractC9234.m14531(2499));
                c95952.m15027(friendInfo.remark, AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵呜喵喵喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵喵呜喵喵"));
                c95952.m15027(friendInfo.name, AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
                c95952.m15027(Boolean.valueOf(friendInfo.isVip), AbstractC9234.m14532("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵喵呜~呜呜呜喵喵喵喵喵~呜喵喵喵呜呜喵呜~呜呜呜呜喵呜喵喵~呜呜呜呜喵呜喵喵"));
                c95952.m15027(Integer.valueOf(friendInfo.vipLevel), AbstractC9234.m14531(2500));
                return c6008;
            case 10:
                GroupInfo groupInfo = (GroupInfo) obj2;
                C9595 c95953 = (C9595) obj;
                c95953.m15027(groupInfo.GroupUin, AbstractC3275.m5142(2295, c95953, "呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵呜呜喵呜呜"));
                c95953.m15027(groupInfo.GroupName, AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜呜喵呜喵呜~呜呜呜喵喵喵喵呜"));
                c95953.m15027(groupInfo.GroupOwner, AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵喵呜喵呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜呜喵呜~呜呜喵呜喵呜呜呜"));
                String strM14531 = AbstractC9234.m14531(2505);
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C9603 c9603 = new C9603();
                AbstractC9234.m14531(2337);
                ArrayList<String> arrayList = groupInfo.AdminList;
                AbstractC9234.m14531(2504);
                arrayList.getClass();
                c9603.m15028(arrayList);
                c95953.m15027(new C7986(c9603.f25063), strM14531);
                return c6008;
            case 11:
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj2;
                C9595 c95954 = (C9595) obj;
                AbstractC9234.m14531(2295);
                c95954.getClass();
                c95954.m15027(newFriendInfo.uin, AbstractC9234.m14531(2499));
                c95954.m15027(newFriendInfo.remark, AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵呜喵喵喵呜~呜呜呜呜呜呜喵呜~呜喵喵喵呜呜呜喵~呜呜喵呜喵呜呜喵~呜呜喵喵喵呜喵喵"));
                c95954.m15027(newFriendInfo.nickname, AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵呜呜呜呜~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵呜喵~呜呜喵呜呜呜喵喵"));
                c95954.m15027(Integer.valueOf(newFriendInfo.sex), AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜喵呜喵呜~呜呜喵呜呜呜喵呜~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜喵呜~呜呜喵喵喵呜呜呜"));
                c95954.m15027(Integer.valueOf(newFriendInfo.age), AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~呜喵喵喵喵喵喵呜~呜呜喵呜呜喵呜呜~呜呜呜喵呜喵喵喵"));
                return c6008;
            case 12:
                C3306 c3306 = (C3306) obj2;
                AbstractC3317 abstractC3317 = (AbstractC3317) obj;
                AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                abstractC3317.getClass();
                C9607 c9607 = c3306.f7750;
                DialogXRecycleView dialogXRecycleView = c3306.f7752;
                c9607.getClass();
                if ((AbstractC3297.m5426(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) == 0) {
                    Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                } else if (abstractC3317.itemView.getParent() != c3306.f7752) {
                    Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                } else {
                    VelocityTracker velocityTracker = c3306.f7743;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    c3306.f7743 = VelocityTracker.obtain();
                    c3306.f7759 = 0.0f;
                    c3306.f7755 = 0.0f;
                    c3306.m5444(abstractC3317, 2);
                }
                return c6008;
            default:
                C2086 c2086 = (C2086) obj2;
                C9901 c9901 = (C9901) obj;
                c9901.getClass();
                ((C6637) c2086.f3974).f16269 = c9901;
                EditText editText = (EditText) c2086.f3981;
                if (editText == null) {
                    AbstractC5227.m9467("inputEdit");
                    throw null;
                }
                editText.setHint("回复：@" + c9901.getNickname() + ":\n" + c9901.getContent());
                EditText editText2 = (EditText) c2086.f3981;
                if (editText2 != null) {
                    editText2.postDelayed(new RunnableC9696(c2086, 3), 200L);
                    return c6008;
                }
                AbstractC5227.m9467("inputEdit");
                throw null;
        }
    }
}
