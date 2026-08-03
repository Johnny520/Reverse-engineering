package Yue;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
public final class C4327 implements Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final Long f8873;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f8874;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f8875;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f8876;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f8877;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6489
    public final String f8878;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<StackTraceElement> f8879;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final long f8880;

    public C4327(@InterfaceC6399 C4310 c4310, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        Thread.State state;
        C4237 c4237 = (C4237) interfaceC4225.get(C4237.f8590);
        this.f8873 = c4237 != null ? Long.valueOf(c4237.m12182()) : null;
        InterfaceC4202 interfaceC4202 = (InterfaceC4202) interfaceC4225.get(InterfaceC4202.f8519);
        this.f8874 = interfaceC4202 != null ? interfaceC4202.toString() : null;
        C4238 c4238 = (C4238) interfaceC4225.get(C4238.f8592);
        this.f8875 = c4238 != null ? c4238.m12188() : null;
        this.f8876 = c4310.m12451();
        Thread thread = c4310.f8837;
        this.f8877 = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = c4310.f8837;
        this.f8878 = thread2 != null ? thread2.getName() : null;
        this.f8879 = c4310.m12452();
        this.f8880 = c4310.f814;
    }

    @InterfaceC6489
    public final String getName() {
        return this.f8875;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Long m1291() {
        return this.f8873;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m1292() {
        return this.f8874;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<StackTraceElement> m12515() {
        return this.f8879;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m12516() {
        return this.f8878;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final String m12517() {
        return this.f8877;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m12518() {
        return this.f8880;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final String m12519() {
        return this.f8876;
    }
}
