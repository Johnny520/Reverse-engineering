package io.ktor.util.cio;

import androidx.compose.foundation.C1030;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.C4247;
import io.ktor.utils.io.InterfaceC4251;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5459;
import p095.C7206;
import p095.ExecutorC7207;

/* JADX INFO: renamed from: io.ktor.util.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4184 {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (r2 == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        if (r10 == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d3, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f6 -> B:43:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01d1 -> B:75:0x01d4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8560(java.nio.channels.SeekableByteChannel r20, io.ktor.utils.io.C4225 r21, long r22, long r24, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.AbstractC4184.m8560(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.飘花落叶言子世楪兰苏哲, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4251 m8561(Path path) throws IOException {
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207 executorC7207 = ExecutorC7207.f19230;
        path.getClass();
        executorC7207.getClass();
        return AbstractC4245.m8707(AbstractC5398.m10485(executorC7207), new C5401("file-reader").plus(executorC7207), new FileChannelsAtNioPathKt$readChannel$1(0L, -1L, Files.size(path), path, null)).f12724;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC4251 m8562(File file) {
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207 executorC7207 = ExecutorC7207.f19230;
        file.getClass();
        executorC7207.getClass();
        long length = file.length();
        InterfaceC5183 interfaceC5183M10210 = AbstractC5186.m10210(new C1030(file, 15));
        C4226 c4226M8707 = AbstractC4245.m8707(AbstractC5398.m10485(executorC7207), new C5401("file-reader").plus(executorC7207), new FileChannelsKt$readChannel$writer$1(0L, -1L, length, interfaceC5183M10210, null));
        C1030 c1030 = new C1030(interfaceC5183M10210, 16);
        ((C5459) c4226M8707.mo8656()).mo10554(new C4247(c1030, 0));
        return c4226M8707.f12724;
    }
}
