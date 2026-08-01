package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3983;
import io.ktor.http.content.AbstractC3993;
import io.ktor.http.content.C3977;
import io.ktor.util.C4208;
import io.ktor.util.cio.AbstractC4184;
import io.ktor.utils.io.InterfaceC4251;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import p022.C6267;
import p236.C8124;
import p243.AbstractC8149;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4120 extends AbstractC3993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8124 f12507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12508;

    public C4120(File file, C8124 c8124) throws IOException {
        file.getClass();
        c8124.getClass();
        this.f12508 = file;
        this.f12507 = c8124;
        if (!file.exists()) {
            C6267.m11760(file.getAbsolutePath(), "No such file ");
            throw null;
        }
        long jLastModified = file.lastModified();
        C4208 c4208 = AbstractC3983.f12233;
        Collection collection = (List) mo8291(c4208);
        mo8289(c4208, AbstractC4343.m8821(collection == null ? EmptyList.INSTANCE : collection, new C3977(AbstractC8149.m13571(Long.valueOf(jLastModified)))));
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12507;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        return Long.valueOf(this.f12508.length());
    }

    @Override // io.ktor.http.content.AbstractC3993
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4251 mo8296() {
        return AbstractC4184.m8562(this.f12508);
    }
}
