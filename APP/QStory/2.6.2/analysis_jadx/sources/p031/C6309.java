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
                AbstractC3056.m6668(-3937677187298362791L);
                AbstractC3056.m6668(-3937677097104049575L);
                String message = th.getMessage();
                message.getClass();
                AbstractC6154.m11561(message);
                break;
            case 1:
                AbstractC3056.m6668(-3937677187298362791L);
                AbstractC3056.m6668(-3937677097104049575L);
                String message2 = th.getMessage();
                message2.getClass();
                AbstractC6154.m11561(message2);
                break;
            default:
                AbstractC3056.m6668(-3937677161528559015L);
                AbstractC3056.m6668(-3937694049339966887L);
                C8197.m13693();
                AbstractC6154.m11561(AbstractC3056.m6668(-3937326868290864551L));
                AbstractC6157.m11573(th, AbstractC3056.m6668(-3937326752326747559L));
                break;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public final void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        List<Notice> list;
        int i = this.f17389;
        final C8207 c8207 = this.f17388;
        AbstractC3056.m6668(-3937677161528559015L);
        AbstractC3056.m6668(-3937677148643657127L);
        switch (i) {
            case 0:
                QSResult qSResult = (QSResult) c5754.f15756;
                list = qSResult != null ? (List) qSResult.getData() : null;
                if (list != null) {
                    AbstractC3056.m6668(-3937677032679540135L);
                    AbstractC3056.m6668(-3937677062744311207L);
                    DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(AbstractC3056.m6668(-3937676989729867175L));
                    final StringBuilder sb = new StringBuilder();
                    for (UpdateInfo updateInfo : list) {
                        sb.append(AbstractC3056.m6668(-3937602712565450151L));
                        sb.append(updateInfo.getVersionName());
                        sb.append(AbstractC3056.m6668(-3937676929600325031L));
                        sb.append(updateInfo.getTime().format(dateTimeFormatterOfPattern));
                        sb.append(AbstractC3056.m6668(-3937560690605426087L));
                        sb.append(updateInfo.getUpdateLog());
                        sb.append(AbstractC3056.m6668(-3937676912420455847L));
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
                    AbstractC3056.m6668(-3937677032679540135L);
                    AbstractC3056.m6668(-3937327100219098535L);
                    DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(AbstractC3056.m6668(-3937676989729867175L));
                    final StringBuilder sb2 = new StringBuilder();
                    for (Notice notice : list) {
                        sb2.append(notice.getTitle());
                        sb2.append(AbstractC3056.m6668(-3937560690605426087L));
                        sb2.append(notice.getContent());
                        sb2.append(AbstractC3056.m6668(-3937560690605426087L));
                        sb2.append(notice.getCreateTime().format(dateTimeFormatterOfPattern2));
                        sb2.append(AbstractC3056.m6668(-3937676706262025639L));
                        sb2.append(notice.getOperator());
                        sb2.append(AbstractC3056.m6668(-3937676912420455847L));
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
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937326894060668327L));
                } else if (qSResult3.isSuccess()) {
                    c8207.m13713();
                    AbstractC6154.m11561(qSResult3.getMsg());
                    C8197.m13690(AbstractC3056.m6668(-3937326078016882087L));
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
