package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4790 implements android.media.MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ android.widget.SeekBar f15154;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ android.widget.TextView f15155;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ android.widget.ImageView f15156;

    static {
            r0 = 749(0x2ed, float:1.05E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public /* synthetic */ C4790(android.widget.SeekBar r1, android.widget.TextView r2, android.widget.ImageView r3) {
            r0 = this;
            r0.<init>()
            r0.f15154 = r1
            r0.f15155 = r2
            r0.f15156 = r3
            return
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final native void onCompletion(android.media.MediaPlayer r1);
}
