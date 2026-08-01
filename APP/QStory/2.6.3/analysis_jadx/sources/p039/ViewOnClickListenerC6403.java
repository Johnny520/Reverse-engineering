package p039;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.dx.io.Opcodes;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6403 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Activity f17567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17568;

    public /* synthetic */ ViewOnClickListenerC6403(String str, Activity activity, int i) {
        this.f17568 = i;
        this.f17566 = str;
        this.f17567 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17568;
        Activity activity = this.f17567;
        String str = this.f17566;
        switch (i) {
            case 0:
                activity.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR).concat(str))));
                break;
            default:
                activity.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR).concat(str))));
                break;
        }
    }
}
