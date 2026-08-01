package kotlinx.serialization.json.internal;

import androidx.compose.runtime.internal.C1245;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p053.AbstractC6561;
import p088.C7161;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5491 extends AbstractC6561 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object f15173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f15174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15175 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5499 f15176;

    public C5491(C5499 c5499, String str) {
        this.f15176 = c5499;
        this.f15174 = str;
        this.f15173 = c5499.f15210.f19127;
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo10645(int i) {
        switch (this.f15175) {
            case 1:
                m10650(Integer.toUnsignedString(i));
                break;
            default:
                super.mo10645(i);
                break;
        }
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 mo10646() {
        switch (this.f15175) {
            case 0:
                return this.f15176.f15210.f19127;
            default:
                return (C1245) this.f15173;
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo10647(byte b) {
        switch (this.f15175) {
            case 1:
                m10650(String.valueOf(b & DefaultClassResolver.NAME));
                break;
            default:
                super.mo10647(b);
                break;
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo10648(short s) {
        switch (this.f15175) {
            case 1:
                m10650(String.valueOf(s & 65535));
                break;
            default:
                super.mo10648(s);
                break;
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo10649(String str) {
        switch (this.f15175) {
            case 0:
                str.getClass();
                this.f15176.mo10728(this.f15174, new C7161(str, false, (InterfaceC7191) this.f15173));
                break;
            default:
                super.mo10649(str);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public void m10650(String str) {
        str.getClass();
        this.f15176.mo10728(this.f15174, new C7161(str, false, null));
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public void mo10651(long j) {
        switch (this.f15175) {
            case 1:
                m10650(Long.toUnsignedString(j));
                break;
            default:
                super.mo10651(j);
                break;
        }
    }

    public C5491(C5499 c5499, String str, InterfaceC7191 interfaceC7191) {
        this.f15176 = c5499;
        this.f15174 = str;
        this.f15173 = interfaceC7191;
    }
}
