package p208n4;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: n4.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2708g extends InterfaceC2722u, ReadableByteChannel {
    /* JADX INFO: renamed from: B */
    InputStream mo4700B();

    /* JADX INFO: renamed from: g */
    C2709h mo4714g(long j5);

    /* JADX INFO: renamed from: i */
    int mo4716i(C2714m c2714m);

    /* JADX INFO: renamed from: o */
    String mo4722o(long j5);

    /* JADX INFO: renamed from: q */
    long mo4723q(C2706e c2706e);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j5);

    /* JADX INFO: renamed from: u */
    void mo4727u(long j5);

    /* JADX INFO: renamed from: z */
    String mo4731z(Charset charset);
}
