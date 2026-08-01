package io.ktor.server.http.content;

import androidx.activity.AbstractC0053;
import io.ktor.http.content.AbstractC3984;
import io.ktor.http.content.AbstractC3994;
import io.ktor.http.content.C3978;
import io.ktor.util.C4209;
import io.ktor.util.cio.AbstractC4186;
import io.ktor.utils.io.InterfaceC4252;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.attribute.FileTime;
import java.util.Collection;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.io.AbstractC4381;
import kotlin.text.AbstractC5139;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p236.C8125;
import p243.AbstractC8150;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4113 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f12492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8125 f12494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final File f12496;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f12497;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5184 f12498;

    public C4113(File file, String str, C8125 c8125) {
        c8125.getClass();
        this.f12496 = file;
        this.f12495 = str;
        this.f12494 = c8125;
        String string = AbstractC4381.m8871(new File(str)).toString();
        string.getClass();
        String strReplace = string.replace(File.separatorChar, '/');
        strReplace.getClass();
        this.f12493 = strReplace;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        InterfaceC5184 interfaceC5184M10215 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4113 f12499;

            {
                this.f12499 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i2 = i;
                C4113 c4113 = this.f12499;
                switch (i2) {
                    case 0:
                        return ((JarFile) c4113.f12498.getValue()).getJarEntry(c4113.f12495);
                    case 1:
                        return new JarFile(c4113.f12496);
                    default:
                        JarEntry jarEntry = (JarEntry) c4113.f12492.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        this.f12492 = interfaceC5184M10215;
        final int i2 = 1;
        this.f12498 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4113 f12499;

            {
                this.f12499 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i22 = i2;
                C4113 c4113 = this.f12499;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4113.f12498.getValue()).getJarEntry(c4113.f12495);
                    case 1:
                        return new JarFile(c4113.f12496);
                    default:
                        JarEntry jarEntry = (JarEntry) c4113.f12492.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        final int i3 = 2;
        this.f12497 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: io.ktor.server.http.content.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4113 f12499;

            {
                this.f12499 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i22 = i3;
                C4113 c4113 = this.f12499;
                switch (i22) {
                    case 0:
                        return ((JarFile) c4113.f12498.getValue()).getJarEntry(c4113.f12495);
                    case 1:
                        return new JarFile(c4113.f12496);
                    default:
                        JarEntry jarEntry = (JarEntry) c4113.f12492.getValue();
                        return Boolean.valueOf((jarEntry == null || jarEntry.isDirectory()) ? false : true);
                }
            }
        });
        if (AbstractC5139.m10139(strReplace, "..", false)) {
            C5925.m11314("Bad resource relative path ".concat(str));
            throw null;
        }
        JarEntry jarEntry = (JarEntry) interfaceC5184M10215.getValue();
        if (jarEntry != null) {
            C4209 c4209 = AbstractC3984.f12237;
            Collection collection = (List) mo8281(c4209);
            collection = collection == null ? EmptyList.INSTANCE : collection;
            FileTime lastModifiedTime = jarEntry.getLastModifiedTime();
            lastModifiedTime.getClass();
            mo8279(c4209, AbstractC4344.m8794(collection, new C3978(AbstractC8150.m13600(Long.valueOf(lastModifiedTime.toMillis())))));
        }
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C8125 mo8283() {
        return this.f12494;
    }

    @Override // io.ktor.http.content.AbstractC3987
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Long mo8284() {
        JarEntry jarEntry = (JarEntry) this.f12492.getValue();
        if (jarEntry != null) {
            return Long.valueOf(jarEntry.getSize());
        }
        return null;
    }

    @Override // io.ktor.http.content.AbstractC3994
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4252 mo8286() throws IOException {
        JarEntry jarEntry = (JarEntry) this.f12492.getValue();
        if (jarEntry == null) {
            C5925.m11307(AbstractC0053.m151(new StringBuilder("Resource "), this.f12493, " not found"));
            return null;
        }
        InputStream inputStream = ((JarFile) this.f12498.getValue()).getInputStream(jarEntry);
        inputStream.getClass();
        return AbstractC6253.m11746(inputStream, AbstractC4186.f12654);
    }
}
