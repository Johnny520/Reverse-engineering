package androidx.compose.foundation.lazy.layout;

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
import com.bumptech.glide.AbstractC3056;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p116.C7339;
import p121.InterfaceC7392;
import p177.AbstractC7749;
import p177.C7746;
import p253.AbstractC8190;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0695 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1951;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1952;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1953;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1955;

    public /* synthetic */ C0695(InterfaceC2129 interfaceC2129, C7746 c7746, InterfaceC6558 interfaceC6558, int i, int i2) {
        this.f1955 = 8;
        this.f1952 = interfaceC2129;
        this.f1953 = c7746;
        this.f1951 = interfaceC6558;
        this.f1954 = i2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1955;
        int i2 = this.f1954;
        Object obj3 = this.f1951;
        Object obj4 = this.f1953;
        C5176 c5176 = C5176.f14739;
        Object obj5 = this.f1952;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM2471 = AbstractC1367.m2471(1);
                AbstractC0722.m1518((C0762) obj5, this.f1953, this.f1954, this.f1951, (InterfaceC1373) obj, iM2471);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C0683) obj5).mo1482(obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC0802.m1628((InterfaceC7392) obj5, (InterfaceC0827) obj4, (InterfaceC6543) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC3056.m6704((InterfaceC2129) obj5, (AbstractC1390) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0895.m1806((InterfaceC0918) obj5, (InterfaceC2118) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((C1242) obj5).m2144(obj4, obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2) | 1);
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC8190.m13688((InterfaceC2388) obj5, (C2363) obj4, (InterfaceC6558) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C7339) obj5).mo1482(obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC7749.m13107((InterfaceC2129) obj5, (C7746) obj4, (InterfaceC6558) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(1), this.f1954);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC7749.m13108((C7746) obj5, (InterfaceC2129) obj4, (C1242) obj3, (InterfaceC1373) obj, AbstractC1367.m2471(i2 | 1));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0695(C0762 c0762, Object obj, int i, Object obj2, int i2) {
        this.f1955 = 0;
        this.f1952 = c0762;
        this.f1953 = obj;
        this.f1954 = i;
        this.f1951 = obj2;
    }

    public /* synthetic */ C0695(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f1955 = i2;
        this.f1952 = obj;
        this.f1953 = obj2;
        this.f1951 = obj3;
        this.f1954 = i;
    }
}
