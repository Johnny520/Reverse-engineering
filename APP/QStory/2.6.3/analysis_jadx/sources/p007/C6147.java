package p007;

import com.bumptech.glide.AbstractC3056;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import p004.C6092;
import p004.InterfaceC6111;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6147 extends AbstractC6133 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6144 f16867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f16868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f16869;

    static {
        Regex regex = C6144.f16859;
        f16867 = AbstractC3056.m6711("application/x-www-form-urlencoded");
    }

    public C6147(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.f16869 = AbstractC6230.m11703(arrayList);
        this.f16868 = AbstractC6230.m11703(arrayList2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m11530(InterfaceC6111 interfaceC6111, boolean z) throws EOFException {
        C6092 c6092Mo11476;
        if (z) {
            c6092Mo11476 = new C6092();
        } else {
            interfaceC6111.getClass();
            c6092Mo11476 = interfaceC6111.mo11476();
        }
        List list = this.f16869;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c6092Mo11476.m11470(38);
            }
            c6092Mo11476.m11491((String) list.get(i));
            c6092Mo11476.m11470(61);
            c6092Mo11476.m11491((String) this.f16868.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = c6092Mo11476.f16647;
        c6092Mo11476.m11475();
        return j;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11152(InterfaceC6111 interfaceC6111) throws EOFException {
        m11530(interfaceC6111, false);
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C6144 mo11153() {
        return f16867;
    }

    @Override // p007.AbstractC6133
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final long mo11154() {
        return m11530(null, true);
    }
}
