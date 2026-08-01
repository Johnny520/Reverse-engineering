package p031;

import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import java.time.format.DateTimeFormatter;
import java.util.List;
import p000.AbstractC6087;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p230.C8048;
import p257.C8197;
import p257.C8207;
import p335.AbstractC8804;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6309 implements InterfaceC5794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8207 f17388;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17389;

    public C6309(C8207 c8207, C8048 c8048) {
        this.f17389 = 2;
        this.f17388 = c8207;
    }

    @Override // retrofit2.InterfaceC5794
    public final void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        switch (this.f17389) {
            case 0:
                "p0";
                "p1";
                String message = th.getMessage();
                message.getClass();
                AbstractC6154.m11561(message);
                break;
            case 1:
                "p0";
                "p1";
                String message2 = th.getMessage();
                message2.getClass();
                AbstractC6154.m11561(message2);
                break;
            default:
                "call";
                "t";
                C8197.m13693();
                AbstractC6154.m11561("\u67e5\u8be2\u652f\u4ed8\u7ed3\u679c\u5931\u8d25,\u8bf7\u91cd\u8bd5");
                AbstractC6157.m11573(th, "\u67e5\u8be2\u652f\u4ed8\u7ed3\u679c\u5931\u8d25");
                break;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public final void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        List<Notice> list;
        int i = this.f17389;
        final C8207 c8207 = this.f17388;
        "call";
        "response";
        switch (i) {
            case 0:
                QSResult qSResult = (QSResult) c5754.f15756;
                list = qSResult != null ? (List) qSResult.getData() : null;
                if (list != null) {
                    "dialog";
                    "updateInfoList";
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy\u5e74MM\u6708dd\u65e5 HH:mm");
                    final StringBuilder sb = new StringBuilder();
                    for (UpdateInfo updateInfo : list) {
                        sb.append("v");
                        sb.append(updateInfo.getVersionName());
                        sb.append(" - ");
                        sb.append(updateInfo.getTime().format(dateTimeFormatterOfPattern));
                        sb.append("\n");
                        sb.append(updateInfo.getUpdateLog());
                        sb.append("\n---------------\n");
                    }
                    final int i2 = 0;
                    AbstractC6087.m11424(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            StringBuilder sb2 = sb;
                            C8207 c82072 = c8207;
                            switch (i3) {
                                case 0:
                                    c82072.mo13705(sb2.toString());
                                    break;
                                default:
                                    c82072.mo13705(sb2.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                QSResult qSResult2 = (QSResult) c5754.f15756;
                list = qSResult2 != null ? (List) qSResult2.getData() : null;
                if (list != null) {
                    "dialog";
                    "noticeList";
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("yyyy\u5e74MM\u6708dd\u65e5 HH:mm");
                    final StringBuilder sb2 = new StringBuilder();
                    for (Notice notice : list) {
                        sb2.append(notice.getTitle());
                        sb2.append("\n");
                        sb2.append(notice.getContent());
                        sb2.append("\n");
                        sb2.append(notice.getCreateTime().format(dateTimeFormatterOfPattern2));
                        sb2.append(" by ");
                        sb2.append(notice.getOperator());
                        sb2.append("\n---------------\n");
                    }
                    final int i3 = 1;
                    AbstractC6087.m11424(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            StringBuilder sb22 = sb2;
                            C8207 c82072 = c8207;
                            switch (i32) {
                                case 0:
                                    c82072.mo13705(sb22.toString());
                                    break;
                                default:
                                    c82072.mo13705(sb22.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                C8197.m13693();
                QSResult qSResult3 = (QSResult) c5754.f15756;
                if (qSResult3 == null) {
                    AbstractC6154.m11561("\u67e5\u8be2\u652f\u4ed8\u7ed3\u679c\u5931\u8d25,\u60a8\u53ef\u5c1d\u8bd5\u518d\u6b21\u67e5\u8be2");
                } else if (qSResult3.isSuccess()) {
                    c8207.m13713();
                    AbstractC6154.m11561(qSResult3.getMsg());
                    C8197.m13690("\u66f4\u65b0\u7528\u6237\u4fe1\u606f\u4e2d");
                    AbstractC8804.f24777.execute(new RunnableC1898(19));
                } else {
                    AbstractC6154.m11561(qSResult3.getMsg());
                }
                break;
        }
    }

    public /* synthetic */ C6309(Object obj, C8207 c8207, int i) {
        this.f17389 = i;
        this.f17388 = c8207;
    }
}
