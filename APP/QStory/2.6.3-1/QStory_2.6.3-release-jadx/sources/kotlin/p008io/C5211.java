package kotlin.p008io;

import io.ktor.util.C5043;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.AbstractC5166;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5211 extends AbstractC5166 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C5212 f13302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayDeque f13303;

    public C5211(C5212 c5212) {
        this.f13302 = c5212;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13303 = arrayDeque;
        File file = (File) c5212.f13305;
        if (file.isDirectory()) {
            arrayDeque.push(m9428(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C5206(file));
        } else {
            this.f13263 = 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5208 m9428(File file) {
        int i = AbstractC5204.f13290[((FileWalkDirection) this.f13302.f13304).ordinal()];
        if (i == 1) {
            return new C5205(file);
        }
        if (i == 2) {
            return new C5207(file);
        }
        C5043.m9170();
        return null;
    }

    @Override // kotlin.collections.AbstractC5166
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9319() {
        File file;
        File fileMo9427;
        while (true) {
            ArrayDeque arrayDeque = this.f13303;
            AbstractC5210 abstractC5210 = (AbstractC5210) arrayDeque.peek();
            if (abstractC5210 == null) {
                file = null;
                break;
            }
            fileMo9427 = abstractC5210.mo9427();
            if (fileMo9427 == null) {
                arrayDeque.pop();
            } else if (fileMo9427.equals(abstractC5210.f13301) || !fileMo9427.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m9428(fileMo9427));
            }
        }
        file = fileMo9427;
        if (file == null) {
            this.f13263 = 2;
        } else {
            this.f13262 = file;
            this.f13263 = 1;
        }
    }
}
