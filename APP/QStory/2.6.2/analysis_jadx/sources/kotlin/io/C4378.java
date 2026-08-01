package kotlin.io;

import io.ktor.util.C4210;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.AbstractC4333;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4378 extends AbstractC4333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C4379 f12953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayDeque f12954;

    public C4378(C4379 c4379) {
        this.f12953 = c4379;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12954 = arrayDeque;
        File file = (File) c4379.f12956;
        if (file.isDirectory()) {
            arrayDeque.push(m8879(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C4373(file));
        } else {
            this.f12914 = 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4375 m8879(File file) {
        int i = AbstractC4371.f12941[((FileWalkDirection) this.f12953.f12955).ordinal()];
        if (i == 1) {
            return new C4372(file);
        }
        if (i == 2) {
            return new C4374(file);
        }
        C4210.m8621();
        return null;
    }

    @Override // kotlin.collections.AbstractC4333
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8770() {
        File file;
        File fileMo8878;
        while (true) {
            ArrayDeque arrayDeque = this.f12954;
            AbstractC4377 abstractC4377 = (AbstractC4377) arrayDeque.peek();
            if (abstractC4377 == null) {
                file = null;
                break;
            }
            fileMo8878 = abstractC4377.mo8878();
            if (fileMo8878 == null) {
                arrayDeque.pop();
            } else if (fileMo8878.equals(abstractC4377.f12952) || !fileMo8878.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m8879(fileMo8878));
            }
        }
        file = fileMo8878;
        if (file == null) {
            this.f12914 = 2;
        } else {
            this.f12913 = file;
            this.f12914 = 1;
        }
    }
}
