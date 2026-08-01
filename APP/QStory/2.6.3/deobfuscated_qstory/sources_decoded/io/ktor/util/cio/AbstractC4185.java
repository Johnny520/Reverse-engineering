package io.ktor.util.cio;

import androidx.compose.foundation.C1030;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4227;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.InterfaceC4252;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5460;
import p095.C7207;
import p095.ExecutorC7208;

/* JADX INFO: renamed from: io.ktor.util.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4185 {
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
    public static final java.lang.Object m8550(java.nio.channels.SeekableByteChannel r20, io.ktor.utils.io.C4226 r21, long r22, long r24, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.AbstractC4185.m8550(java.nio.channels.SeekableByteChannel, io.ktor.utils.io.飘花落叶言子世楪兰苏哲, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC4252 m8551(Path path) throws IOException {
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208 executorC7208 = ExecutorC7208.f19225;
        path.getClass();
        executorC7208.getClass();
        return AbstractC4246.m8697(AbstractC5399.m10489(executorC7208), new C5402("file-reader").plus(executorC7208), new FileChannelsAtNioPathKt$readChannel$1(0L, -1L, Files.size(path), path, null)).f12728;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC4252 m8552(File file) {
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208 executorC7208 = ExecutorC7208.f19225;
        file.getClass();
        executorC7208.getClass();
        long length = file.length();
        InterfaceC5184 interfaceC5184M10214 = AbstractC5187.m10214(new C1030(file, 15));
        C4227 c4227M8697 = AbstractC4246.m8697(AbstractC5399.m10489(executorC7208), new C5402("file-reader").plus(executorC7208), new FileChannelsKt$readChannel$writer$1(0L, -1L, length, interfaceC5184M10214, null));
        C1030 c1030 = new C1030(interfaceC5184M10214, 16);
        ((C5460) c4227M8697.mo8646()).mo10559(new C4248(c1030, 0));
        return c4227M8697.f12728;
    }
}
