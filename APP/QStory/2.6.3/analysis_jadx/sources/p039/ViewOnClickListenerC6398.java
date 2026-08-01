package p039;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.dx.io.Opcodes;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6398 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Context f17562;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17563;

    public /* synthetic */ ViewOnClickListenerC6398(Context context, String str, int i) {
        this.f17563 = i;
        this.f17562 = context;
        this.f17561 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17563;
        Context context = this.f17562;
        String str = this.f17561;
        switch (i) {
            case 0:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(227) + str + AbstractC8405.m13972(228))));
                break;
            case 1:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR) + str)));
                break;
            case 2:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR) + str)));
                break;
            case 3:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(227) + str + AbstractC8405.m13972(228))));
                break;
            case 4:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR) + str)));
                break;
            default:
                context.startActivity(new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(Opcodes.REM_FLOAT_2ADDR) + str)));
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC6398(String str, Context context, int i) {
        this.f17563 = i;
        this.f17561 = str;
        this.f17562 = context;
    }
}
