package p023;

import com.bumptech.glide.AbstractC3888;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import p020.C6921;
import p020.InterfaceC6940;
import p029.AbstractC7059;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6976 extends AbstractC6962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6973 f17212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f17213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f17214;

    static {
        Regex regex = C6973.f17204;
        f17212 = AbstractC3888.m7271("application/x-www-form-urlencoded");
    }

    public C6976(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f17214 = AbstractC7059.m12262(arrayList);
        this.f17213 = AbstractC7059.m12262(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m12089(InterfaceC6940 interfaceC6940, boolean z) throws EOFException {
        C6921 c6921Mo12035;
        if (z) {
            c6921Mo12035 = new C6921();
        } else {
            interfaceC6940.getClass();
            c6921Mo12035 = interfaceC6940.mo12035();
        }
        List list = this.f17214;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c6921Mo12035.m12029(38);
            }
            c6921Mo12035.m12050((String) list.get(i));
            c6921Mo12035.m12029(61);
            c6921Mo12035.m12050((String) this.f17213.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c6921Mo12035.f16992;
        c6921Mo12035.m12034();
        return j;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11711(InterfaceC6940 interfaceC6940) throws EOFException {
        m12089(interfaceC6940, false);
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6973 mo11712() {
        return f17212;
    }

    @Override // p023.AbstractC6962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11713() {
        return m12089(null, true);
    }
}
