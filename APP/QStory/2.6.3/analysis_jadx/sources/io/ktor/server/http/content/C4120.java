package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3984;
import io.ktor.http.content.AbstractC3994;
import io.ktor.http.content.C3978;
import io.ktor.util.C4209;
import io.ktor.util.cio.AbstractC4185;
import io.ktor.utils.io.InterfaceC4252;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import p144.C7547;
import p236.C8125;
import p243.AbstractC8150;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4120 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8125 f12509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Path f12510;

    public C4120(Path path, C8125 c8125) throws IOException {
        path.getClass();
        c8125.getClass();
        this.f12510 = path;
        this.f12509 = c8125;
        if (!Files.exists(path, new LinkOption[0])) {
            C7547.m12769(path, "No such path ");
            throw null;
        }
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, new LinkOption[0]);
        C4209 c4209 = AbstractC3984.f12237;
        Collection collection = (List) mo8281(c4209);
        collection = collection == null ? EmptyList.INSTANCE : collection;
        lastModifiedTime.getClass();
        mo8279(c4209, AbstractC4344.m8794(collection, new C3978(AbstractC8150.m13600(Long.valueOf(lastModifiedTime.toMillis())))));
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12509;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return Long.valueOf(Files.size(this.f12510));
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4252 mo8286() {
        return AbstractC4185.m8551(this.f12510);
    }
}
