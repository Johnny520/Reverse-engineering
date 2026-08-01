package p038;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6388 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17534;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Context f17535;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17536;

    public /* synthetic */ ViewOnClickListenerC6388(Context context, String str, int i) {
        this.f17536 = i;
        this.f17535 = context;
        this.f17534 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17536;
        Context context = this.f17535;
        String str = this.f17534;
        switch (i) {
            case 0:
                String strM6668 = "android.intent.action.VIEW";
                StringBuilder sb = new StringBuilder();
                AbstractC6136.m11544(-3937587375237236135L, sb, str);
                sb.append("&card_type=group&source=qrcode");
                context.startActivity(new Intent(strM6668, Uri.parse(sb.toString())));
                break;
            case 1:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC6136.m11557(-3937572780938364327L, new StringBuilder(), str))));
                break;
            case 2:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC6136.m11557(-3937572780938364327L, new StringBuilder(), str))));
                break;
            case 3:
                String strM66682 = "android.intent.action.VIEW";
                StringBuilder sb2 = new StringBuilder();
                AbstractC6136.m11544(-3937587375237236135L, sb2, str);
                sb2.append("&card_type=group&source=qrcode");
                context.startActivity(new Intent(strM66682, Uri.parse(sb2.toString())));
                break;
            case 4:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC6136.m11557(-3937572780938364327L, new StringBuilder(), str))));
                break;
            default:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC6136.m11557(-3937572780938364327L, new StringBuilder(), str))));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6388(String str, Context context, int i) {
        this.f17536 = i;
        this.f17534 = str;
        this.f17535 = context;
    }
}
