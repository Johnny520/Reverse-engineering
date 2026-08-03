package Yue;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5915 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Context f14781;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f14782;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ EditText f14783;

    static {
        NativeUtil.classesInit0(405);
    }

    public /* synthetic */ ViewOnClickListenerC5915(Context context, LinearLayout linearLayout, EditText editText) {
        this.f14781 = context;
        this.f14782 = linearLayout;
        this.f14783 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
