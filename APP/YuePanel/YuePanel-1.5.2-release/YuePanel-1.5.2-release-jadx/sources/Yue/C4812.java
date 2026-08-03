package Yue;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4812 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final FileChannel f1130;

    public C4812(@InterfaceC6399 FileChannel fileChannel) {
        C5499.m17103(fileChannel, "fileChannel");
        this.f1130 = fileChannel;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m1719(long j, @InterfaceC6399 C3600 c3600, long j2) throws IOException {
        C5499.m17103(c3600, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferTo = this.f1130.transferTo(j, j2, c3600);
            j += jTransferTo;
            j2 -= jTransferTo;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m1720(long j, @InterfaceC6399 C3600 c3600, long j2) throws IOException {
        C5499.m17103(c3600, "source");
        if (j2 < 0 || j2 > c3600.m9684()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferFrom = this.f1130.transferFrom(c3600, j, j2);
            j += jTransferFrom;
            j2 -= jTransferFrom;
        }
    }
}
