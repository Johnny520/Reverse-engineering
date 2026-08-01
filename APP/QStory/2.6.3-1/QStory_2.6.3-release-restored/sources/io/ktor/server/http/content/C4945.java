package io.ktor.server.http.content;

import androidx.activity.AbstractC0900;
import io.ktor.http.content.AbstractC4816;
import io.ktor.http.content.AbstractC4826;
import io.ktor.http.content.C4810;
import io.ktor.util.C5041;
import io.ktor.util.cio.AbstractC5018;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.util.Collection;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.p008io.AbstractC5213;
import kotlin.text.AbstractC5971;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p252.C8954;
import p259.AbstractC8979;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4945 extends AbstractC4826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f12837;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8954 f12839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12841;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f12842;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6016 f12843;

    public C4945(File file, String str, C8954 c8954) {
        c8954.getClass();
        this.f12841 = file;
        this.f12840 = str;
        this.f12839 = c8954;
        String string = AbstractC5213.m9430(new File(str)).toString();
        string.getClass();
        String strReplace = string.replace(File.separatorChar, '/');
        strReplace.getClass();
        this.f12838 = strReplace;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        InterfaceC6016 interfaceC6016M10774 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4945 f12844;

            {
                this.f12844 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i2 = i;
                C4945 c4945 = this.f12844;
                switch (i2) {
                    case 0:
                        return ((JarFile) c4945.f12843.getValue()).getJarEntry(c4945.f12840);
                    case 1:
                        return new JarFile(c4945.f12841);
                    default:
                        JarEntry jarEntry = (JarEntry) c4945.f12837.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        this.f12837 = interfaceC6016M10774;
        final int i2 = 1;
        this.f12843 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4945 f12844;

            {
                this.f12844 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i22 = i2;
                C4945 c4945 = this.f12844;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4945.f12843.getValue()).getJarEntry(c4945.f12840);
                    case 1:
                        return new JarFile(c4945.f12841);
                    default:
                        JarEntry jarEntry = (JarEntry) c4945.f12837.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        final int i3 = 2;
        this.f12842 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4945 f12844;

            {
                this.f12844 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i22 = i3;
                C4945 c4945 = this.f12844;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4945.f12843.getValue()).getJarEntry(c4945.f12840);
                    case 1:
                        return new JarFile(c4945.f12841);
                    default:
                        JarEntry jarEntry = (JarEntry) c4945.f12837.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        if (AbstractC5971.m10698(strReplace, "..", false)) {
            C6755.m11873("Bad resource relative path ".concat(str));
            throw null;
        }
        JarEntry jarEntry = (JarEntry) interfaceC6016M10774.getValue();
        if (jarEntry != null) {
            C5041 c5041 = AbstractC4816.f12582;
            Collection collection = (List) mo8840(c5041);
            collection = collection == null ? EmptyList.INSTANCE : collection;
            FileTime lastModifiedTime = jarEntry.getLastModifiedTime();
            lastModifiedTime.getClass();
            mo8838(c5041, AbstractC5176.m9353(collection, new C4810(AbstractC8979.m14159(Long.valueOf(lastModifiedTime.toMillis())))));
        }
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8954 mo8842() {
        return this.f12839;
    }

    @Override // io.ktor.http.content.AbstractC4819
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8843() {
        JarEntry jarEntry = (JarEntry) this.f12837.getValue();
        if (jarEntry != null) {
            return Long.valueOf(jarEntry.getSize());
        }
        return null;
    }

    @Override // io.ktor.http.content.AbstractC4826
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC5084 mo8845() throws IOException {
        JarEntry jarEntry = (JarEntry) this.f12837.getValue();
        if (jarEntry == null) {
            C6755.m11866(AbstractC0900.m711(new StringBuilder("Resource "), this.f12838, " not found"));
            return null;
        }
        InputStream inputStream = ((JarFile) this.f12843.getValue()).getInputStream(jarEntry);
        inputStream.getClass();
        return AbstractC7082.m12305(inputStream, AbstractC5018.f12999);
    }
}
