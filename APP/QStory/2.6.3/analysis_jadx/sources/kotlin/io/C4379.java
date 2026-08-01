package kotlin.io;

import io.ktor.util.C4211;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.AbstractC4334;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4379 extends AbstractC4334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C4380 f12957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayDeque f12958;

    public C4379(C4380 c4380) {
        this.f12957 = c4380;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12958 = arrayDeque;
        File file = (File) c4380.f12960;
        if (file.isDirectory()) {
            arrayDeque.push(m8869(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C4374(file));
        } else {
            this.f12918 = 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4376 m8869(File file) {
        int i = AbstractC4372.f12945[((FileWalkDirection) this.f12957.f12959).ordinal()];
        if (i == 1) {
            return new C4373(file);
        }
        if (i == 2) {
            return new C4375(file);
        }
        C4211.m8611();
        return null;
    }

    @Override // kotlin.collections.AbstractC4334
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8760() {
        File file;
        File fileMo8868;
        while (true) {
            ArrayDeque arrayDeque = this.f12958;
            AbstractC4378 abstractC4378 = (AbstractC4378) arrayDeque.peek();
            if (abstractC4378 == null) {
                file = null;
                break;
            }
            fileMo8868 = abstractC4378.mo8868();
            if (fileMo8868 == null) {
                arrayDeque.pop();
            } else if (fileMo8868.equals(abstractC4378.f12956) || !fileMo8868.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m8869(fileMo8868));
            }
        }
        file = fileMo8868;
        if (file == null) {
            this.f12918 = 2;
        } else {
            this.f12917 = file;
            this.f12918 = 1;
        }
    }
}
