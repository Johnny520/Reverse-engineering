package Yue;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4179 extends ProgressBar {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f8499 = 500;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f8500 = 500;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public long f8501;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f8502;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f8503;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f8504;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final Runnable f8505;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final Runnable f8506;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4179(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12049();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12049();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12045() {
        post(new Runnable() { // from class: Yue.ۥۣ۟ۧ۟
            @Override // java.lang.Runnable
            public final void run() {
                this.f8498.m12046();
            }
        });
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m12046() {
        this.f8504 = true;
        removeCallbacks(this.f8506);
        this.f8503 = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f8501;
        long j2 = jCurrentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else {
            if (this.f8502) {
                return;
            }
            postDelayed(this.f8505, 500 - j2);
            this.f8502 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m12047() {
        this.f8502 = false;
        this.f8501 = -1L;
        setVisibility(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final /* synthetic */ void m12048() {
        this.f8503 = false;
        if (this.f8504) {
            return;
        }
        this.f8501 = System.currentTimeMillis();
        setVisibility(0);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m12049() {
        removeCallbacks(this.f8505);
        removeCallbacks(this.f8506);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m12050() {
        post(new Runnable() { // from class: Yue.ۥۣ۟ۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f8497.m12051();
            }
        });
    }

    @InterfaceC8086
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m12051() {
        this.f8501 = -1L;
        this.f8504 = false;
        removeCallbacks(this.f8505);
        this.f8502 = false;
        if (this.f8503) {
            return;
        }
        postDelayed(this.f8506, 500L);
        this.f8503 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4179(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8501 = -1L;
        this.f8502 = false;
        this.f8503 = false;
        this.f8504 = false;
        this.f8505 = new Runnable() { // from class: Yue.ۥ۟ۧۢۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f8495.m12047();
            }
        };
        this.f8506 = new Runnable() { // from class: Yue.ۥ۟ۧۢۨ
            @Override // java.lang.Runnable
            public final void run() {
                this.f8496.m12048();
            }
        };
    }
}
