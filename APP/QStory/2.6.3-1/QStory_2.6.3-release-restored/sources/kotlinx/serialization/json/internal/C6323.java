package kotlinx.serialization.json.internal;

import androidx.compose.runtime.internal.C2080;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p069.AbstractC7390;
import p104.C7990;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6323 extends AbstractC7390 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object f15518;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ String f15519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15520 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6331 f15521;

    public C6323(C6331 c6331, String str) {
        this.f15521 = c6331;
        this.f15519 = str;
        this.f15518 = c6331.f15555.f19472;
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo11204(int i) {
        switch (this.f15520) {
            case 1:
                m11209(Integer.toUnsignedString(i));
                break;
            default:
                super.mo11204(i);
                break;
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2080 mo11205() {
        switch (this.f15520) {
            case 0:
                return this.f15521.f15555.f19472;
            default:
                return (C2080) this.f15518;
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void mo11206(byte b) {
        switch (this.f15520) {
            case 1:
                m11209(String.valueOf(b & DefaultClassResolver.NAME));
                break;
            default:
                super.mo11206(b);
                break;
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo11207(short s) {
        switch (this.f15520) {
            case 1:
                m11209(String.valueOf(s & 65535));
                break;
            default:
                super.mo11207(s);
                break;
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public void mo11208(String str) {
        switch (this.f15520) {
            case 0:
                str.getClass();
                this.f15521.mo11287(this.f15519, new C7990(str, false, (InterfaceC8020) this.f15518));
                break;
            default:
                super.mo11208(str);
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public void m11209(String str) {
        str.getClass();
        this.f15521.mo11287(this.f15519, new C7990(str, false, null));
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public void mo11210(long j) {
        switch (this.f15520) {
            case 1:
                m11209(Long.toUnsignedString(j));
                break;
            default:
                super.mo11210(j);
                break;
        }
    }

    public C6323(C6331 c6331, String str, InterfaceC8020 interfaceC8020) {
        this.f15521 = c6331;
        this.f15519 = str;
        this.f15518 = interfaceC8020;
    }
}
