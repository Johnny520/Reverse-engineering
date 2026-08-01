package p288;

import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8416 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f23292;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Charset f23294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public byte[] f23295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final FileInputStream f23296;

    public C8416(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(AbstractC8415.f23291)) {
            C5919.m11249("Unsupported encoding");
            throw null;
        }
        this.f23296 = fileInputStream;
        this.f23294 = charset;
        this.f23295 = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23296) {
            try {
                if (this.f23295 != null) {
                    this.f23295 = null;
                    this.f23296.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m13957() {
        /*
            r8 = this;
            java.io.FileInputStream r0 = r8.f23296
            monitor-enter(r0)
            byte[] r1 = r8.f23295     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto La4
            int r2 = r8.f23293     // Catch: java.lang.Throwable -> L3e
            int r3 = r8.f23292     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L23
            java.io.FileInputStream r2 = r8.f23296     // Catch: java.lang.Throwable -> L3e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L3e
            int r1 = r2.read(r1, r4, r3)     // Catch: java.lang.Throwable -> L3e
            if (r1 == r5) goto L1d
            r8.f23293 = r4     // Catch: java.lang.Throwable -> L3e
            r8.f23292 = r1     // Catch: java.lang.Throwable -> L3e
            goto L23
        L1d:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r8.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        L23:
            int r1 = r8.f23293     // Catch: java.lang.Throwable -> L3e
        L25:
            int r2 = r8.f23292     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            if (r1 == r2) goto L56
            byte[] r2 = r8.f23295     // Catch: java.lang.Throwable -> L3e
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L3e
            if (r6 != r3) goto L53
            int r3 = r8.f23293     // Catch: java.lang.Throwable -> L3e
            if (r1 == r3) goto L40
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            r6 = 13
            if (r5 != r6) goto L40
            goto L41
        L3e:
            r8 = move-exception
            goto Lac
        L40:
            r4 = r1
        L41:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.f23294     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            r8.f23293 = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r5
        L53:
            int r1 = r1 + 1
            goto L25
        L56:
            飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲兰苏 r1 = new 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.f23292     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f23293     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3e
        L62:
            byte[] r2 = r8.f23295     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f23293     // Catch: java.lang.Throwable -> L3e
            int r7 = r8.f23292     // Catch: java.lang.Throwable -> L3e
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L3e
            r8.f23292 = r5     // Catch: java.lang.Throwable -> L3e
            java.io.FileInputStream r2 = r8.f23296     // Catch: java.lang.Throwable -> L3e
            byte[] r6 = r8.f23295     // Catch: java.lang.Throwable -> L3e
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3e
            int r2 = r2.read(r6, r4, r7)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r5) goto L9e
            r8.f23293 = r4     // Catch: java.lang.Throwable -> L3e
            r8.f23292 = r2     // Catch: java.lang.Throwable -> L3e
            r2 = r4
        L7e:
            int r6 = r8.f23292     // Catch: java.lang.Throwable -> L3e
            if (r2 == r6) goto L62
            byte[] r6 = r8.f23295     // Catch: java.lang.Throwable -> L3e
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L3e
            if (r7 != r3) goto L9b
            int r3 = r8.f23293     // Catch: java.lang.Throwable -> L3e
            if (r2 == r3) goto L91
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L3e
        L91:
            int r2 = r2 + 1
            r8.f23293 = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r8
        L9b:
            int r2 = r2 + 1
            goto L7e
        L9e:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r8.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        La4:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "LineReader is closed"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L3e
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p288.C8416.m13957():java.lang.String");
    }
}
