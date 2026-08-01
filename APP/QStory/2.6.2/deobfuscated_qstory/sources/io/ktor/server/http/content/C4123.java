package io.ktor.server.http.content;

import android.widget.ProgressBar;
import androidx.compose.foundation.lazy.C0756;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.server.application.InterfaceC4056;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.bean.MessageData;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6557;
import p088.C7151;
import p088.C7156;
import p217.AbstractC7968;
import p315.C8671;
import p325.C8758;
import p325.C8766;
import p326.C8770;
import p341.C8816;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4123 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12511;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f12512;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f12513;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12515 = 0;

    public /* synthetic */ C4123(String str, InterfaceC4056 interfaceC4056, String str2, InterfaceC6557 interfaceC6557) {
        this.f12513 = str;
        this.f12512 = interfaceC4056;
        this.f12514 = str2;
        this.f12511 = interfaceC6557;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12515;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f12511;
        String str = this.f12513;
        Object obj3 = this.f12512;
        Object obj4 = this.f12514;
        switch (i) {
            case 0:
                CompressedFileType compressedFileType = (CompressedFileType) obj;
                compressedFileType.getClass();
                String str2 = str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + compressedFileType.getExtension();
                Pair pairM8530 = AbstractC4122.m8530(((InterfaceC4056) obj3).mo8470(), str2, (String) obj4, new C0756(str2, str, (InterfaceC6557) obj2, 6));
                if (pairM8530 != null) {
                    break;
                }
                break;
            case 1:
                MessageData messageData = (MessageData) obj4;
                C7151 c7151 = (C7151) obj3;
                C8770 c8770 = (C8770) obj2;
                C8758 c8758 = (C8758) obj;
                c8758.m14434(Long.valueOf(messageData.MessageTime), AbstractC2442.m4573(-3937791360413992359L, c8758, -3937823980690605479L));
                String strM6668 = "content";
                String strM66682 = messageData.MessageContent;
                if (strM66682 == null) {
                    strM66682 = "";
                }
                c8758.m14434(strM66682, strM6668);
                c8758.m14434(Integer.valueOf(messageData.MessageType), "message_type");
                c8758.m14434(str, "sender_uin");
                c8758.m14434(messageData.SenderNickName, "sender_nickname");
                String strM66683 = "file_name";
                String strM66684 = messageData.FileName;
                if (strM66684 == null) {
                    strM66684 = "";
                }
                c8758.m14434(strM66684, strM66683);
                c8758.m14434(messageData.FileUrl, "file_url");
                c8758.m14434(Long.valueOf(messageData.FileSize), "file_size");
                String strM66685 = "local_path";
                String strM66686 = messageData.LocalPath;
                if (strM66686 == null) {
                    strM66686 = "";
                }
                c8758.m14434(strM66686, strM66685);
                String strM66687 = "reply_to_uin";
                String strM66688 = messageData.ReplyTo;
                if (strM66688 == null) {
                    strM66688 = "";
                }
                c8758.m14434(strM66688, strM66687);
                String strM66689 = "at_list";
                "block";
                C8766 c8766 = new C8766();
                "$this$jsonArray";
                String[] strArr = messageData.AtList;
                List listM8850 = strArr != null ? AbstractC4346.m8850(strArr) : null;
                if (listM8850 == null) {
                    listM8850 = EmptyList.INSTANCE;
                }
                c8766.m14435(listM8850);
                c8758.m14434(new C7156(c8766.f24693), strM66689);
                String strM666810 = "pic_url_list";
                "block";
                C8766 c87662 = new C8766();
                "$this$jsonArray";
                ArrayList<String> arrayList = messageData.PicUrlList;
                List listM8804 = arrayList != null ? AbstractC4343.m8804(arrayList) : null;
                if (listM8804 == null) {
                    listM8804 = EmptyList.INSTANCE;
                }
                c87662.m14435(listM8804);
                c8758.m14434(new C7156(c87662.f24693), strM666810);
                c8758.m14434(c7151, "reply_message");
                String str3 = c8770.f24707;
                String str4 = c8770.f24706;
                if (!AbstractC4394.m8917(str3, "group")) {
                    c8758.m14434(str4, "friend_uin");
                } else {
                    c8758.m14434(str4, "group_uin");
                }
                break;
            default:
                C8671 c8671 = (C8671) obj3;
                ProgressBar progressBar = (ProgressBar) obj2;
                List list = (List) obj;
                list.getClass();
                AbstractC7968.m13430((C8816) obj4, list);
                if (list.isEmpty()) {
                    c8671.m14341(R.id.tv_page_title, str + " ，暂无表情包");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c5175;
    }

    public /* synthetic */ C4123(MessageData messageData, String str, C7151 c7151, C8770 c8770) {
        this.f12514 = messageData;
        this.f12513 = str;
        this.f12512 = c7151;
        this.f12511 = c8770;
    }

    public /* synthetic */ C4123(C8816 c8816, C8671 c8671, String str, ProgressBar progressBar) {
        this.f12514 = c8816;
        this.f12512 = c8671;
        this.f12513 = str;
        this.f12511 = progressBar;
    }
}
