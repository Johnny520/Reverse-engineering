package Yue;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC4445 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Activity f9181;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9182;

    static {
        NativeUtil.classesInit0(79);
    }

    public /* synthetic */ ViewOnClickListenerC4445(Activity activity, TextView textView) {
        this.f9181 = activity;
        this.f9182 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
