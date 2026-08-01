package lin.xposed.hook.javaplugin.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import java.io.File;
import p028.DialogC6319;
import p336.C8793;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5544 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15301;

    public /* synthetic */ ViewOnClickListenerC5544(EditText editText, File file, DialogC6319 dialogC6319) {
        this.f15301 = 2;
        this.f15300 = editText;
        this.f15299 = file;
        this.f15298 = dialogC6319;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544.onClick(android.view.View):void");
    }

    public /* synthetic */ ViewOnClickListenerC5544(File file, Dialog dialog, Context context) {
        this.f15301 = 1;
        this.f15299 = file;
        this.f15300 = dialog;
        this.f15298 = context;
    }

    public /* synthetic */ ViewOnClickListenerC5544(Object obj, Object obj2, Object obj3, int i) {
        this.f15301 = i;
        this.f15300 = obj;
        this.f15298 = obj2;
        this.f15299 = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC5544(C8793 c8793, EditText editText, EditText editText2, DialogC6319 dialogC6319) {
        this.f15301 = 7;
        this.f15300 = editText;
        this.f15298 = editText2;
        this.f15299 = dialogC6319;
    }
}
