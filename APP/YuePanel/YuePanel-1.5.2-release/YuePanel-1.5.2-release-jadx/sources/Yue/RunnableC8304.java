package Yue;

import Yue.C8306;
import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8304 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f24772;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Activity f24773;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ float f24774;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ float f24775;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ C8306.InterfaceC1477 f24776;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final /* synthetic */ int f24777;

    static {
        NativeUtil.classesInit0(392);
    }

    public /* synthetic */ RunnableC8304(RecyclerView recyclerView, Activity activity, float f, float f2, C8306.InterfaceC1477 interfaceC1477, int i) {
        this.f24772 = recyclerView;
        this.f24773 = activity;
        this.f24774 = f;
        this.f24775 = f2;
        this.f24776 = interfaceC1477;
        this.f24777 = i;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
