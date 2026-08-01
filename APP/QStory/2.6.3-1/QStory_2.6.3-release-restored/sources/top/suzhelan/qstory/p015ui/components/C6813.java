package top.suzhelan.qstory.p015ui.components;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import java.util.List;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p366.C9684;
import p366.C9687;
import p366.InterfaceC9683;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6813 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2962 f16596;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f16597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6000 f16598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f16599;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC9683 f16600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f16601;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f16602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16603;

    public /* synthetic */ C6813(InterfaceC9683 interfaceC9683, List list, int i, boolean z, InterfaceC2962 interfaceC2962, InterfaceC6000 interfaceC6000, int i2, int i3) {
        this.f16603 = i3;
        this.f16600 = interfaceC9683;
        this.f16601 = list;
        this.f16602 = i;
        this.f16597 = z;
        this.f16596 = interfaceC2962;
        this.f16598 = interfaceC6000;
        this.f16599 = i2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16603;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f16599;
        InterfaceC6000 interfaceC6000 = this.f16598;
        InterfaceC9683 interfaceC9683 = this.f16600;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(i2 | 1);
                AbstractC6799.m11904((C9687) interfaceC9683, this.f16601, this.f16602, this.f16597, this.f16596, (InterfaceC7372) interfaceC6000, (InterfaceC2208) obj, iM3031);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(i2 | 1);
                AbstractC6799.m11909((C9684) interfaceC9683, this.f16601, this.f16602, this.f16597, this.f16596, (InterfaceC7383) interfaceC6000, (InterfaceC2208) obj, iM30312);
                break;
        }
        return c6008;
    }
}
