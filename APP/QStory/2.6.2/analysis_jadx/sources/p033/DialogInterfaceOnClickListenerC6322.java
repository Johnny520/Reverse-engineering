package p033;

import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.io.IOException;
import p010.AbstractC6154;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC6322 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6329 f17420;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f17421;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17422 = 0;

    public /* synthetic */ DialogInterfaceOnClickListenerC6322(C6329 c6329, String str) {
        this.f17420 = c6329;
        this.f17421 = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f17422;
        C6329 c6329 = this.f17420;
        Object obj = this.f17421;
        switch (i2) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(AbstractC6333.f17448)) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937590093951534503L));
                } else if (TextUtils.isEmpty(c6329.f17444)) {
                    AbstractC6154.m11561(AbstractC3056.m6668(-3937590111131403687L));
                } else {
                    try {
                        String str2 = c6329.f17444;
                        StringBuilder sb = new StringBuilder();
                        String str3 = AbstractC6328.f17440;
                        sb.append(str3);
                        sb.append(AbstractC6333.f17448);
                        sb.append(AbstractC3056.m6668(-3937561854541563303L));
                        sb.append(str);
                        AbstractC0455.m1170(str2, sb.toString());
                        AbstractC6154.m11561(AbstractC3056.m6668(-3937590068181730727L) + str3 + AbstractC6333.f17448 + AbstractC3056.m6668(-3937561854541563303L) + str);
                    } catch (IOException e) {
                        C5919.m11252(e);
                        return;
                    }
                }
                break;
            default:
                new File(c6329.f17444).delete();
                ((C6331) obj).f17446.m11883(C6327.f17432);
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC6322(C6331 c6331, C6329 c6329) {
        this.f17421 = c6331;
        this.f17420 = c6329;
    }
}
