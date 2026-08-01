package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC4816;
import io.ktor.http.content.AbstractC4826;
import io.ktor.http.content.C4810;
import io.ktor.util.C5041;
import io.ktor.util.cio.AbstractC5017;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import p035.C7092;
import p252.C8954;
import p259.AbstractC8979;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4953 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8954 f12856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12857;

    public C4953(File file, C8954 c8954) throws IOException {
        file.getClass();
        c8954.getClass();
        this.f12857 = file;
        this.f12856 = c8954;
        if (!file.exists()) {
            C7092.m12336(file.getAbsolutePath(), "No such file ");
            throw null;
        }
        long jLastModified = file.lastModified();
        C5041 c5041 = AbstractC4816.f12582;
        Collection collection = (List) mo8840(c5041);
        mo8838(c5041, AbstractC5176.m9353(collection == null ? EmptyList.INSTANCE : collection, new C4810(AbstractC8979.m14159(Long.valueOf(jLastModified)))));
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12856;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        return Long.valueOf(this.f12857.length());
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5084 mo8845() {
        return AbstractC5017.m9111(this.f12857);
    }
}
