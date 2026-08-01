package androidx.activity.compose;

import androidx.activity.C0869;
import androidx.lifecycle.compose.C3196;
import kotlin.C6008;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p068.InterfaceC7387;
import p189.C8564;
import p252.AbstractC8940;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0850 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f353;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f355;

    public /* synthetic */ C0850(Object obj, int i, boolean z) {
        this.f355 = i;
        this.f354 = obj;
        this.f353 = z;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f355;
        boolean z = this.f353;
        Object obj2 = this.f354;
        switch (i) {
            case 0:
                C0859 c0859 = (C0859) obj2;
                ((C0869) c0859.f576).m624(z);
                ((C8564) c0859.f577).m13341(z);
                return new C0847((C3196) obj, c0859);
            default:
                StringBuilder sb = (StringBuilder) obj2;
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                if (AbstractC8940.f22753.contains(b) || AbstractC8940.f22749.contains(b)) {
                    sb.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb.append(SignatureVisitor.EXTENDS);
                } else {
                    sb.append(AbstractC8940.m14140(bByteValue));
                }
                return C6008.f15084;
        }
    }
}
