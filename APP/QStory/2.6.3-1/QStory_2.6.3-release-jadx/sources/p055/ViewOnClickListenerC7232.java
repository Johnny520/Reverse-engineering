package p055;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.p002dx.p005io.Opcodes;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7232 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17911;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Activity f17912;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17913;

    public /* synthetic */ ViewOnClickListenerC7232(String str, Activity activity, int i) {
        this.f17913 = i;
        this.f17911 = str;
        this.f17912 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17913;
        Activity activity = this.f17912;
        String str = this.f17911;
        switch (i) {
            case 0:
                activity.startActivity(new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC9234.m14531(Opcodes.REM_FLOAT_2ADDR).concat(str))));
                break;
            default:
                activity.startActivity(new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC9234.m14531(Opcodes.REM_FLOAT_2ADDR).concat(str))));
                break;
        }
    }
}
