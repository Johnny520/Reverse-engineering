package p050;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p026.AbstractC7014;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC7170 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7177 f17814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17816 = 0;

    public /* synthetic */ DialogInterfaceOnClickListenerC7170(C7177 c7177, String str) {
        this.f17814 = c7177;
        this.f17815 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17816;
        C7177 c7177 = this.f17814;
        Object obj = this.f17815;
        switch (i2) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(AbstractC7176.f17827)) {
                    AbstractC7014.m12151(AbstractC9234.m14531(357));
                } else if (TextUtils.isEmpty(c7177.f17831)) {
                    AbstractC7014.m12151(AbstractC9234.m14531(358));
                } else {
                    try {
                        String str2 = c7177.f17831;
                        StringBuilder sb = new StringBuilder();
                        String str3 = AbstractC7174.f17823;
                        sb.append(str3);
                        sb.append(AbstractC7176.f17827);
                        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜喵喵"));
                        sb.append(str);
                        AbstractC5894.m10609(str2, sb.toString());
                        AbstractC7014.m12151(AbstractC9234.m14531(359) + str3 + AbstractC7176.f17827 + AbstractC9234.m14532("喵呜喵呜呜呜喵喵") + str);
                    } catch (IOException e) {
                        C6755.m11872(e);
                        return;
                    }
                }
                break;
            default:
                new File(c7177.f17831).delete();
                ((C7181) obj).f17844.m12495(C7179.f17833);
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC7170(C7181 c7181, C7177 c7177) {
        this.f17815 = c7181;
        this.f17814 = c7177;
    }
}
