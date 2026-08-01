package p048;

import androidx.compose.p001ui.platform.RunnableC2733;
import io.ktor.client.plugins.AbstractC4765;
import java.time.format.DateTimeFormatter;
import java.util.List;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p246.C8878;
import p273.C9027;
import p273.C9037;
import p351.AbstractC9618;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7157 implements InterfaceC6625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9037 f17782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17783;

    public C7157(C9037 c9037, C8878 c8878) {
        this.f17783 = 2;
        this.f17782 = c9037;
    }

    @Override // retrofit2.InterfaceC6625
    public final void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        switch (this.f17783) {
            case 0:
                "p0";
                "p1";
                String message = th.getMessage();
                message.getClass();
                AbstractC7014.m12151(message);
                break;
            case 1:
                "p0";
                "p1";
                String message2 = th.getMessage();
                message2.getClass();
                AbstractC7014.m12151(message2);
                break;
            default:
                "call";
                "t";
                C9027.m14269();
                AbstractC7014.m12151("查询支付结果失败,请重试");
                AbstractC7017.m12163(th, "查询支付结果失败");
                break;
        }
    }

    @Override // retrofit2.InterfaceC6625
    public final void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        List<Notice> list;
        int i = this.f17783;
        final C9037 c9037 = this.f17782;
        "call";
        "response";
        switch (i) {
            case 0:
                QSResult qSResult = (QSResult) c6585.f16101;
                list = qSResult != null ? (List) qSResult.getData() : null;
                if (list != null) {
                    "dialog";
                    "updateInfoList";
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");
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
                    AbstractC4765.m8860(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            StringBuilder sb2 = sb;
                            C9037 c90372 = c9037;
                            switch (i3) {
                                case 0:
                                    c90372.mo14281(sb2.toString());
                                    break;
                                default:
                                    c90372.mo14281(sb2.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                QSResult qSResult2 = (QSResult) c6585.f16101;
                list = qSResult2 != null ? (List) qSResult2.getData() : null;
                if (list != null) {
                    "dialog";
                    "noticeList";
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm");
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
                    AbstractC4765.m8860(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            StringBuilder sb22 = sb2;
                            C9037 c90372 = c9037;
                            switch (i32) {
                                case 0:
                                    c90372.mo14281(sb22.toString());
                                    break;
                                default:
                                    c90372.mo14281(sb22.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                C9027.m14269();
                QSResult qSResult3 = (QSResult) c6585.f16101;
                if (qSResult3 == null) {
                    AbstractC7014.m12151("查询支付结果失败,您可尝试再次查询");
                } else if (qSResult3.isSuccess()) {
                    c9037.m14289();
                    AbstractC7014.m12151(qSResult3.getMsg());
                    C9027.m14266("更新用户信息中");
                    AbstractC9618.f25101.execute(new RunnableC2733(19));
                } else {
                    AbstractC7014.m12151(qSResult3.getMsg());
                }
                break;
        }
    }

    public /* synthetic */ C7157(Object obj, C9037 c9037, int i) {
        this.f17783 = i;
        this.f17782 = c9037;
    }
}
