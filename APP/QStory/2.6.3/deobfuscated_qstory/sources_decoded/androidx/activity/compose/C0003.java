package androidx.activity.compose;

import androidx.activity.C0022;
import androidx.lifecycle.compose.C2363;
import kotlin.C5176;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p052.InterfaceC6558;
import p173.C7735;
import p236.AbstractC8111;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0003 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f8;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f9;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10;

    public /* synthetic */ C0003(Object obj, int i, boolean z) {
        this.f10 = i;
        this.f9 = obj;
        this.f8 = z;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f10;
        boolean z = this.f8;
        Object obj2 = this.f9;
        switch (i) {
            case 0:
                C0012 c0012 = (C0012) obj2;
                ((C0022) c0012.f231).m64(z);
                ((C7735) c0012.f232).m12782(z);
                return new C0000((C2363) obj, c0012);
            default:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (AbstractC8111.f22408.contains(b) || AbstractC8111.f22404.contains(b)) {
                    sb.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb.append(SignatureVisitor.EXTENDS);
                } else {
                    sb.append(AbstractC8111.m13581(bByteValue));
                }
                return C5176.f14739;
        }
    }
}
