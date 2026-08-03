package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4741 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f15045;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f15046;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final android.content.Intent f15047;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f15048;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.os.Bundle f15049;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public final android.app.PendingIntent f15050;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean f15051;

    public C4741(@Yue.InterfaceC4410 android.content.Context r1, int r2, @Yue.InterfaceC4410 android.content.Intent r3, int r4, @Yue.InterfaceC4544 android.os.Bundle r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.f15045 = r1
            r0.f15046 = r2
            r0.f15047 = r3
            r0.f15048 = r4
            r0.f15049 = r5
            r0.f15051 = r6
            android.app.PendingIntent r1 = r0.m18904()
            r0.f15050 = r1
            return
    }

    public C4741(@Yue.InterfaceC4410 android.content.Context r8, int r9, @Yue.InterfaceC4410 android.content.Intent r10, int r11, boolean r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.app.PendingIntent m18904() {
            r6 = this;
            android.os.Bundle r4 = r6.f15049
            if (r4 != 0) goto L13
            android.content.Context r0 = r6.f15045
            int r1 = r6.f15046
            android.content.Intent r2 = r6.f15047
            int r3 = r6.f15048
            boolean r4 = r6.f15051
            android.app.PendingIntent r0 = Yue.C4742.m18916(r0, r1, r2, r3, r4)
            return r0
        L13:
            android.content.Context r0 = r6.f15045
            int r1 = r6.f15046
            android.content.Intent r2 = r6.f15047
            int r3 = r6.f15048
            boolean r5 = r6.f15051
            android.app.PendingIntent r0 = Yue.C4742.m18915(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.content.Context m18905() {
            r1 = this;
            android.content.Context r0 = r1.f15045
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m18906() {
            r1 = this;
            int r0 = r1.f15048
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.Intent m18907() {
            r1 = this;
            android.content.Intent r0 = r1.f15047
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.os.Bundle m18908() {
            r1 = this;
            android.os.Bundle r0 = r1.f15049
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.app.PendingIntent m18909() {
            r1 = this;
            android.app.PendingIntent r0 = r1.f15050
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m18910() {
            r1 = this;
            int r0 = r1.f15046
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m18911() {
            r1 = this;
            boolean r0 = r1.f15051
            return r0
    }
}
