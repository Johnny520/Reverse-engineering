package Yue;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5917 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ EditText f14787;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Context f14788;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f14789;

    static {
        NativeUtil.classesInit0(454);
    }

    public /* synthetic */ ViewOnClickListenerC5917(EditText editText, Context context, LinearLayout linearLayout) {
        this.f14787 = editText;
        this.f14788 = context;
        this.f14789 = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
