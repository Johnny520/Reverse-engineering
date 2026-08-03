package Yue;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6683 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f17161;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ ImageView f17162;

    static {
        NativeUtil.classesInit0(751);
    }

    public /* synthetic */ ViewOnClickListenerC6683(MediaPlayer mediaPlayer, ImageView imageView) {
        this.f17161 = mediaPlayer;
        this.f17162 = imageView;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
