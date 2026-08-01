package p032;

import androidx.compose.ui.platform.RunnableC1898;
import io.ktor.client.plugins.AbstractC3933;
import java.time.format.DateTimeFormatter;
import java.util.List;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p230.C8049;
import p257.C8198;
import p257.C8208;
import p287.AbstractC8405;
import p335.AbstractC8789;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.Notice;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6328 implements InterfaceC5795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8208 f17437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17438;

    public C6328(C8208 c8208, C8049 c8049) {
        this.f17438 = 2;
        this.f17437 = c8208;
    }

    @Override // retrofit2.InterfaceC5795
    public final void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        switch (this.f17438) {
            case 0:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
                String message = th.getMessage();
                message.getClass();
                AbstractC6185.m11592(message);
                break;
            case 1:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵呜喵喵喵呜喵喵");
                String message2 = th.getMessage();
                message2.getClass();
                AbstractC6185.m11592(message2);
                break;
            default:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
                AbstractC8405.m13973("喵喵喵喵喵呜呜呜");
                C8198.m13710();
                AbstractC6185.m11592(AbstractC8405.m13972(3138));
                AbstractC6188.m11604(th, AbstractC8405.m13972(3139));
                break;
        }
    }

    @Override // retrofit2.InterfaceC5795
    public final void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        List<Notice> list;
        int i = this.f17438;
        final C8208 c8208 = this.f17437;
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13972(1239);
        switch (i) {
            case 0:
                QSResult qSResult = (QSResult) c5755.f15756;
                list = qSResult != null ? (List) qSResult.getData() : null;
                if (list != null) {
                    AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                    AbstractC8405.m13972(1242);
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(AbstractC8405.m13972(1243));
                    final StringBuilder sb = new StringBuilder();
                    for (UpdateInfo updateInfo : list) {
                        sb.append(AbstractC8405.m13973("喵喵喵喵喵呜喵呜"));
                        sb.append(updateInfo.getVersionName());
                        sb.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵呜喵呜呜喵喵喵~喵呜喵呜呜喵呜喵"));
                        sb.append(updateInfo.getTime().format(dateTimeFormatterOfPattern));
                        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                        sb.append(updateInfo.getUpdateLog());
                        sb.append(AbstractC8405.m13972(1244));
                    }
                    final int i2 = 0;
                    AbstractC3933.m8301(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            StringBuilder sb2 = sb;
                            C8208 c82082 = c8208;
                            switch (i3) {
                                case 0:
                                    c82082.mo13722(sb2.toString());
                                    break;
                                default:
                                    c82082.mo13722(sb2.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            case 1:
                QSResult qSResult2 = (QSResult) c5755.f15756;
                list = qSResult2 != null ? (List) qSResult2.getData() : null;
                if (list != null) {
                    AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                    AbstractC8405.m13972(3132);
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(AbstractC8405.m13972(1243));
                    final StringBuilder sb2 = new StringBuilder();
                    for (Notice notice : list) {
                        sb2.append(notice.getTitle());
                        sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                        sb2.append(notice.getContent());
                        sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                        sb2.append(notice.getCreateTime().format(dateTimeFormatterOfPattern2));
                        sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵喵呜呜~喵呜喵喵呜喵喵喵"));
                        sb2.append(notice.getOperator());
                        sb2.append(AbstractC8405.m13972(1244));
                    }
                    final int i3 = 1;
                    AbstractC3933.m8301(new Runnable() { // from class: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲兰苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            StringBuilder sb22 = sb2;
                            C8208 c82082 = c8208;
                            switch (i32) {
                                case 0:
                                    c82082.mo13722(sb22.toString());
                                    break;
                                default:
                                    c82082.mo13722(sb22.toString());
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                C8198.m13710();
                QSResult qSResult3 = (QSResult) c5755.f15756;
                if (qSResult3 == null) {
                    AbstractC6185.m11592(AbstractC8405.m13972(3137));
                } else if (qSResult3.isSuccess()) {
                    c8208.m13730();
                    AbstractC6185.m11592(qSResult3.getMsg());
                    C8198.m13707(AbstractC8405.m13972(3147));
                    AbstractC8789.f24756.execute(new RunnableC1898(19));
                } else {
                    AbstractC6185.m11592(qSResult3.getMsg());
                }
                break;
        }
    }

    public /* synthetic */ C6328(Object obj, C8208 c8208, int i) {
        this.f17438 = i;
        this.f17437 = c8208;
    }
}
