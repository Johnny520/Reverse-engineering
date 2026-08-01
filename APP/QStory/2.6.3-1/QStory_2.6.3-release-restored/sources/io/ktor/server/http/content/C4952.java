package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC4816;
import io.ktor.http.content.AbstractC4826;
import io.ktor.http.content.C4810;
import io.ktor.util.C5041;
import io.ktor.util.cio.AbstractC5017;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import p160.C8376;
import p252.C8954;
import p259.AbstractC8979;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4952 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12854;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Path f12855;

    public C4952(Path path, C8954 c8954) throws IOException {
        path.getClass();
        c8954.getClass();
        this.f12855 = path;
        this.f12854 = c8954;
        if (!Files.exists(path, new LinkOption[0])) {
            C8376.m13328(path, "No such path ");
            throw null;
        }
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, new LinkOption[0]);
        C5041 c5041 = AbstractC4816.f12582;
        Collection collection = (List) mo8840(c5041);
        collection = collection == null ? EmptyList.INSTANCE : collection;
        lastModifiedTime.getClass();
        mo8838(c5041, AbstractC5176.m9353(collection, new C4810(AbstractC8979.m14159(Long.valueOf(lastModifiedTime.toMillis())))));
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12854;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return Long.valueOf(Files.size(this.f12855));
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5084 mo8845() {
        return AbstractC5017.m9110(this.f12855);
    }
}
