package io.ktor.server.http.content;

import androidx.activity.AbstractC0053;
import io.ktor.http.content.AbstractC3983;
import io.ktor.http.content.AbstractC3993;
import io.ktor.http.content.C3977;
import io.ktor.util.C4208;
import io.ktor.util.cio.AbstractC4185;
import io.ktor.utils.io.InterfaceC4251;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.util.Collection;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.io.AbstractC4380;
import kotlin.text.AbstractC5138;
import p052.InterfaceC6542;
import p175.AbstractC7738;
import p236.C8124;
import p243.AbstractC8149;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4112 extends AbstractC3993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f12488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8124 f12490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f12493;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5183 f12494;

    public C4112(File file, String str, C8124 c8124) {
        c8124.getClass();
        this.f12492 = file;
        this.f12491 = str;
        this.f12490 = c8124;
        String string = AbstractC4380.m8880(new File(str)).toString();
        string.getClass();
        String strReplace = string.replace(File.separatorChar, '/');
        strReplace.getClass();
        this.f12489 = strReplace;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        InterfaceC5183 interfaceC5183M10211 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4112 f12495;

            {
                this.f12495 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i2 = i;
                C4112 c4112 = this.f12495;
                switch (i2) {
                    case 0:
                        return ((JarFile) c4112.f12494.getValue()).getJarEntry(c4112.f12491);
                    case 1:
                        return new JarFile(c4112.f12492);
                    default:
                        JarEntry jarEntry = (JarEntry) c4112.f12488.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        this.f12488 = interfaceC5183M10211;
        final int i2 = 1;
        this.f12494 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4112 f12495;

            {
                this.f12495 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i22 = i2;
                C4112 c4112 = this.f12495;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4112.f12494.getValue()).getJarEntry(c4112.f12491);
                    case 1:
                        return new JarFile(c4112.f12492);
                    default:
                        JarEntry jarEntry = (JarEntry) c4112.f12488.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        final int i3 = 2;
        this.f12493 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4112 f12495;

            {
                this.f12495 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i22 = i3;
                C4112 c4112 = this.f12495;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4112.f12494.getValue()).getJarEntry(c4112.f12491);
                    case 1:
                        return new JarFile(c4112.f12492);
                    default:
                        JarEntry jarEntry = (JarEntry) c4112.f12488.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        if (AbstractC5138.m10125(strReplace, "..", false)) {
            C5919.m11253("Bad resource relative path ".concat(str));
            throw null;
        }
        JarEntry jarEntry = (JarEntry) interfaceC5183M10211.getValue();
        if (jarEntry != null) {
            C4208 c4208 = AbstractC3983.f12233;
            Collection collection = (List) mo8291(c4208);
            collection = collection == null ? EmptyList.INSTANCE : collection;
            FileTime lastModifiedTime = jarEntry.getLastModifiedTime();
            lastModifiedTime.getClass();
            mo8289(c4208, AbstractC4343.m8821(collection, new C3977(AbstractC8149.m13571(Long.valueOf(lastModifiedTime.toMillis())))));
        }
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8124 mo8293() {
        return this.f12490;
    }

    @Override // io.ktor.http.content.AbstractC3986
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8294() {
        JarEntry jarEntry = (JarEntry) this.f12488.getValue();
        if (jarEntry != null) {
            return Long.valueOf(jarEntry.getSize());
        }
        return null;
    }

    @Override // io.ktor.http.content.AbstractC3993
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4251 mo8296() throws IOException {
        JarEntry jarEntry = (JarEntry) this.f12488.getValue();
        if (jarEntry == null) {
            C5919.m11246(AbstractC0053.m146(new StringBuilder("Resource "), this.f12489, " not found"));
            return null;
        }
        InputStream inputStream = ((JarFile) this.f12494.getValue()).getInputStream(jarEntry);
        inputStream.getClass();
        return AbstractC7738.m13019(inputStream, AbstractC4185.f12650);
    }
}
