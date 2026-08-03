package Yue;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5916 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Context f14784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f14785;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ EditText f14786;

    static {
        NativeUtil.classesInit0(35);
    }

    public /* synthetic */ ViewOnClickListenerC5916(Context context, LinearLayout linearLayout, EditText editText) {
        this.f14784 = context;
        this.f14785 = linearLayout;
        this.f14786 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
