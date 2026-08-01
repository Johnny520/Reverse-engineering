package p055;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7227 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Context f17907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17908;

    public /* synthetic */ ViewOnClickListenerC7227(Context context, String str, int i) {
        this.f17908 = i;
        this.f17907 = context;
        this.f17906 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17908;
        Context context = this.f17907;
        String str = this.f17906;
        switch (i) {
            case 0:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + str + "&card_type=group&source=qrcode")));
                break;
            case 1:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str)));
                break;
            case 2:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str)));
                break;
            case 3:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + str + "&card_type=group&source=qrcode")));
                break;
            case 4:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str)));
                break;
            default:
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str)));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC7227(String str, Context context, int i) {
        this.f17908 = i;
        this.f17906 = str;
        this.f17907 = context;
    }
}
