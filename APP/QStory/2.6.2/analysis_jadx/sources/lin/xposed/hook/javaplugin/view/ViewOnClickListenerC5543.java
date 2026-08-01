package lin.xposed.hook.javaplugin.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import java.io.File;
import p027.DialogC6300;
import p328.C8778;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5543 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f15298;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15299;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15301;

    public /* synthetic */ ViewOnClickListenerC5543(EditText editText, File file, DialogC6300 dialogC6300) {
        this.f15301 = 3;
        this.f15299 = editText;
        this.f15298 = file;
        this.f15300 = dialogC6300;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543.onClick(android.view.View):void");
    }

    public /* synthetic */ ViewOnClickListenerC5543(File file, Dialog dialog, Context context) {
        this.f15301 = 2;
        this.f15298 = file;
        this.f15299 = dialog;
        this.f15300 = context;
    }

    public /* synthetic */ ViewOnClickListenerC5543(Object obj, Object obj2, Object obj3, int i) {
        this.f15301 = i;
        this.f15299 = obj;
        this.f15300 = obj2;
        this.f15298 = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC5543(C8778 c8778, EditText editText, EditText editText2, DialogC6300 dialogC6300) {
        this.f15301 = 7;
        this.f15299 = editText;
        this.f15300 = editText2;
        this.f15298 = dialogC6300;
    }
}
