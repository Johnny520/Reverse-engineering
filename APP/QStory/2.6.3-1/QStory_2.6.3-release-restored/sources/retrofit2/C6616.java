package retrofit2;

import java.io.IOException;
import p020.AbstractC6941;
import p020.C6921;
import p020.InterfaceC6939;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6616 extends AbstractC6941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6600 f16226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6616(C6600 c6600, InterfaceC6939 interfaceC6939) {
        super(interfaceC6939);
        this.f16226 = c6600;
    }

    @Override // p020.InterfaceC6930
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final long mo11491(C6921 c6921, long j) throws IOException {
        try {
            c6921.getClass();
            return this.f17038.mo11491(c6921, 8192L);
        } catch (IOException e) {
            this.f16226.f16184 = e;
            throw e;
        }
    }
}
