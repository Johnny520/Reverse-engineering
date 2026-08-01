package org.apache.commons.compress.compressors.pack200;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.pack200.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5623 extends AbstractC5624 {
    public C5623() throws IOException {
        super(null);
        Path pathCreateTempFile = Files.createTempFile("commons-compress", "packtemp", new FileAttribute[0]);
        pathCreateTempFile.toFile().deleteOnExit();
        ((FilterOutputStream) this).out = Files.newOutputStream(pathCreateTempFile, new OpenOption[0]);
    }
}
