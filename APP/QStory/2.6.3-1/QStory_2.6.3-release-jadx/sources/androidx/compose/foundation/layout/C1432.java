package androidx.compose.foundation.layout;

import androidx.compose.material3.AbstractC1996;
import androidx.compose.material3.C1982;
import androidx.compose.material3.C2001;
import androidx.compose.material3.C2027;
import androidx.compose.material3.C2054;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import top.yukonga.miuix.kmp.basic.AbstractC6862;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1432 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2004;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2005;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2006;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ Object f2007;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2077 f2008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2009;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2010;

    public /* synthetic */ C1432(C2077 c2077, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2010 = 2;
        this.f2008 = c2077;
        this.f2005 = obj;
        this.f2004 = obj2;
        this.f2006 = obj3;
        this.f2007 = obj4;
        this.f2009 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2010;
        Object obj3 = this.f2007;
        Object obj4 = this.f2006;
        Object obj5 = this.f2004;
        Object obj6 = this.f2005;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f2009;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM3031 = AbstractC2202.m3031(i2 | 1);
                AbstractC1469.m1986((InterfaceC2962) obj6, (InterfaceC1486) obj5, (InterfaceC1491) obj4, (C1429) obj3, this.f2008, (InterfaceC2208) obj, iM3031);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM30312 = AbstractC2202.m3031(i2 | 1);
                AbstractC1996.m2584((C2027) obj6, (C1982) obj5, (C2054) obj4, (C2001) obj3, this.f2008, (InterfaceC2208) obj, iM30312);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM30313 = AbstractC2202.m3031(i2) | 1;
                this.f2008.m2702(this.f2005, this.f2004, this.f2006, this.f2007, (InterfaceC2208) obj, iM30313);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM30314 = AbstractC2202.m3031(i2 | 1);
                AbstractC6862.m11946((InterfaceC2962) obj6, (InterfaceC7380) obj5, (InterfaceC1505) obj4, (InterfaceC7372) obj3, this.f2008, (InterfaceC2208) obj, iM30314);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1432(Object obj, Object obj2, Object obj3, Object obj4, C2077 c2077, int i, int i2) {
        this.f2010 = i2;
        this.f2005 = obj;
        this.f2004 = obj2;
        this.f2006 = obj3;
        this.f2007 = obj4;
        this.f2008 = c2077;
        this.f2009 = i;
    }
}
