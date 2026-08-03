package Yue;

import android.app.Activity;
import android.content.Intent;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7195 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Intent f21705;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Activity f21706;

    static {
        NativeUtil.classesInit0(460);
    }

    public /* synthetic */ RunnableC7195(Intent intent, Activity activity) {
        this.f21705 = intent;
        this.f21706 = activity;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
