package Yue;

import android.media.MediaPlayer;
import android.view.View;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6675 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ View f17142;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ String f17143;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ String f17144;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ BottomDialog f17145;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f17146;

    static {
        NativeUtil.classesInit0(468);
    }

    public /* synthetic */ RunnableC6675(View view, String str, String str2, BottomDialog bottomDialog, MediaPlayer mediaPlayer) {
        this.f17142 = view;
        this.f17143 = str;
        this.f17144 = str2;
        this.f17145 = bottomDialog;
        this.f17146 = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
