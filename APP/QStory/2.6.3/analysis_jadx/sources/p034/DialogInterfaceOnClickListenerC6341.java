package p034;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p010.AbstractC6185;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6341 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6348 f17469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17471 = 0;

    public /* synthetic */ DialogInterfaceOnClickListenerC6341(C6348 c6348, String str) {
        this.f17469 = c6348;
        this.f17470 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17471;
        C6348 c6348 = this.f17469;
        Object obj = this.f17470;
        switch (i2) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(AbstractC6347.f17482)) {
                    AbstractC6185.m11592(AbstractC8405.m13972(357));
                } else if (TextUtils.isEmpty(c6348.f17486)) {
                    AbstractC6185.m11592(AbstractC8405.m13972(358));
                } else {
                    try {
                        String str2 = c6348.f17486;
                        StringBuilder sb = new StringBuilder();
                        String str3 = AbstractC6345.f17478;
                        sb.append(str3);
                        sb.append(AbstractC6347.f17482);
                        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜喵喵"));
                        sb.append(str);
                        AbstractC5062.m10050(str2, sb.toString());
                        AbstractC6185.m11592(AbstractC8405.m13972(359) + str3 + AbstractC6347.f17482 + AbstractC8405.m13973("喵呜喵呜呜呜喵喵") + str);
                    } catch (IOException e) {
                        C5925.m11313(e);
                        return;
                    }
                }
                break;
            default:
                new File(c6348.f17486).delete();
                ((C6352) obj).f17499.m11936(C6350.f17488);
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC6341(C6352 c6352, C6348 c6348) {
        this.f17470 = c6352;
        this.f17469 = c6348;
    }
}
