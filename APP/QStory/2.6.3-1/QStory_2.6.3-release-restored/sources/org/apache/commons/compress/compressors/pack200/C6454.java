package org.apache.commons.compress.compressors.pack200;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.pack200.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6454 extends AbstractC6455 {
    public C6454() throws IOException {
        super(null);
        Path pathCreateTempFile = Files.createTempFile("commons-compress", "packtemp", new FileAttribute[0]);
        pathCreateTempFile.toFile().deleteOnExit();
        ((FilterOutputStream) this).out = Files.newOutputStream(pathCreateTempFile, new OpenOption[0]);
    }
}
