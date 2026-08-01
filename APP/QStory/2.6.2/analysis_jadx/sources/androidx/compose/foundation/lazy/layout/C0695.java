package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0762;
import androidx.compose.foundation.text.contextmenu.internal.AbstractC0802;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import androidx.compose.foundation.text.selection.AbstractC0895;
import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.InterfaceC2129;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.compose.C2363;
import com.bumptech.glide.AbstractC3055;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p116.C7338;
import p121.InterfaceC7391;
import p177.AbstractC7748;
import p177.C7745;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0695 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1950;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1951;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1954;

    public /* synthetic */ C0695(InterfaceC2129 interfaceC2129, C7745 c7745, InterfaceC6557 interfaceC6557, int i, int i2) {
        this.f1954 = 8;
        this.f1951 = interfaceC2129;
        this.f1952 = c7745;
        this.f1950 = interfaceC6557;
        this.f1953 = i2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1954;
        int i2 = this.f1953;
        Object obj3 = this.f1950;
        Object obj4 = this.f1952;
        C5175 c5175 = C5175.f14739;
        Object obj5 = this.f1951;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2460 = AbstractC1367.m2460(1);
                AbstractC0722.m1508((C0762) obj5, this.f1952, this.f1953, this.f1950, (InterfaceC1373) obj, iM2460);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0683) obj5).mo1472(obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC0802.m1618((InterfaceC7391) obj5, (InterfaceC0827) obj4, (InterfaceC6542) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC3055.m6633((InterfaceC2129) obj5, (AbstractC1390) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0895.m1796((InterfaceC0918) obj5, (InterfaceC2118) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C1242) obj5).m2134(obj4, obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2) | 1);
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC0455.m1150((InterfaceC2388) obj5, (C2363) obj4, (InterfaceC6557) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C7338) obj5).mo1472(obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC7748.m13079((InterfaceC2129) obj5, (C7745) obj4, (InterfaceC6557) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(1), this.f1953);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC7748.m13080((C7745) obj5, (InterfaceC2129) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2460(i2 | 1));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0695(C0762 c0762, Object obj, int i, Object obj2, int i2) {
        this.f1954 = 0;
        this.f1951 = c0762;
        this.f1952 = obj;
        this.f1953 = i;
        this.f1950 = obj2;
    }

    public /* synthetic */ C0695(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f1954 = i2;
        this.f1951 = obj;
        this.f1952 = obj2;
        this.f1950 = obj3;
        this.f1953 = i;
    }
}
