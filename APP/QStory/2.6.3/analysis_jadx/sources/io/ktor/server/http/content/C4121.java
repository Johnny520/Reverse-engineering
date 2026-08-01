package io.ktor.server.http.content;

import io.ktor.http.content.AbstractC3984;
import io.ktor.http.content.AbstractC3994;
import io.ktor.http.content.C3978;
import io.ktor.util.C4209;
import io.ktor.util.cio.AbstractC4185;
import io.ktor.utils.io.InterfaceC4252;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import p019.C6263;
import p236.C8125;
import p243.AbstractC8150;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4121 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8125 f12511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12512;

    public C4121(File file, C8125 c8125) throws IOException {
        file.getClass();
        c8125.getClass();
        this.f12512 = file;
        this.f12511 = c8125;
        if (!file.exists()) {
            C6263.m11777(file.getAbsolutePath(), "No such file ");
            throw null;
        }
        long jLastModified = file.lastModified();
        C4209 c4209 = AbstractC3984.f12237;
        Collection collection = (List) mo8281(c4209);
        mo8279(c4209, AbstractC4344.m8794(collection == null ? EmptyList.INSTANCE : collection, new C3978(AbstractC8150.m13600(Long.valueOf(jLastModified)))));
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12511;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        return Long.valueOf(this.f12512.length());
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4252 mo8286() {
        return AbstractC4185.m8552(this.f12512);
    }
}
