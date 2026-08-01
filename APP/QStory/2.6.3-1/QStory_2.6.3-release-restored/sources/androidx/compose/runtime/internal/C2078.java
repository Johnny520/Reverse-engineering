package androidx.compose.runtime.internal;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2078 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3948;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3949;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3950;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f3951;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f3952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f3953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3955 = 1;

    public /* synthetic */ C2078(C2077 c2077, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f3953 = c2077;
        this.f3954 = obj;
        this.f3950 = bool;
        this.f3949 = obj2;
        this.f3948 = obj3;
        this.f3951 = obj4;
        this.f3952 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3955;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f3952;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(i2) | 1;
                this.f3953.m2709(this.f3954, this.f3949, this.f3948, this.f3951, this.f3950, (InterfaceC2208) obj, iM3031);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(i2) | 1;
                this.f3953.m2705(this.f3954, (Boolean) this.f3950, this.f3949, this.f3948, this.f3951, (InterfaceC2208) obj, iM30312);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C2078(C2077 c2077, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f3953 = c2077;
        this.f3954 = obj;
        this.f3949 = obj2;
        this.f3948 = obj3;
        this.f3951 = obj4;
        this.f3950 = obj5;
        this.f3952 = i;
    }
}
