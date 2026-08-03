package Yue;

import android.view.View;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC8089 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C8091 f23980;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ AtomicInteger f23981;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f23982;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ TextView f23983;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f23984;

    static {
        NativeUtil.classesInit0(797);
    }

    public /* synthetic */ ViewOnClickListenerC8089(C8091 c8091, AtomicInteger atomicInteger, AtomicReference atomicReference, TextView textView, AtomicReference atomicReference2) {
        this.f23980 = c8091;
        this.f23981 = atomicInteger;
        this.f23982 = atomicReference;
        this.f23983 = textView;
        this.f23984 = atomicReference2;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
