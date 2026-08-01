package p028;

import androidx.compose.foundation.lazy.layout.C1575;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5227;
import p023.C6954;
import p023.C6960;
import p023.C6978;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p027.C7032;
import p027.C7035;
import p027.InterfaceC7039;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7050 implements InterfaceC6970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6954 f17489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1575 f17490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7032 f17493;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f17494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f17495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f17496;

    public C7050(C7032 c7032, ArrayList arrayList, int i, C1575 c1575, C6954 c6954, int i2, int i3, int i4) {
        this.f17493 = c7032;
        this.f17492 = arrayList;
        this.f17491 = i;
        this.f17490 = c1575;
        this.f17489 = c6954;
        this.f17488 = i2;
        this.f17495 = i3;
        this.f17494 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7050 m12231(C7050 c7050, int i, C1575 c1575, C6954 c6954, int i2) {
        if ((i2 & 1) != 0) {
            i = c7050.f17491;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c1575 = c7050.f17490;
        }
        C1575 c15752 = c1575;
        if ((i2 & 4) != 0) {
            c6954 = c7050.f17489;
        }
        C6954 c69542 = c6954;
        int i4 = c7050.f17488;
        int i5 = c7050.f17495;
        int i6 = c7050.f17494;
        c69542.getClass();
        return new C7050(c7050.f17493, c7050.f17492, i3, c15752, c69542, i4, i5, i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6960 m12232(C6954 c6954) {
        c6954.getClass();
        ArrayList arrayList = this.f17492;
        int size = arrayList.size();
        int i = this.f17491;
        if (i >= size) {
            C6755.m11870("Check failed.");
            return null;
        }
        this.f17496++;
        C1575 c1575 = this.f17490;
        if (c1575 != null) {
            C7035 c7035Mo11820 = ((InterfaceC7039) c1575.f2415).mo11820();
            C6978 c6978 = c6954.f17061;
            c7035Mo11820.getClass();
            c6978.getClass();
            C6978 c69782 = c7035Mo11820.f17452.f17160;
            if (c6978.f17225 != c69782.f17225 || !AbstractC5227.m9466(c6978.f17226, c69782.f17226)) {
                C6755.m11862(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
            if (this.f17496 != 1) {
                C6755.m11862(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        C7050 c7050M12231 = m12231(this, i2, null, c6954, 58);
        InterfaceC6969 interfaceC6969 = (InterfaceC6969) arrayList.get(i);
        C6960 c6960Intercept = interfaceC6969.intercept(c7050M12231);
        if (c6960Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC6969 + " returned null");
        }
        if (c1575 == null || i2 >= arrayList.size() || c7050M12231.f17496 == 1) {
            return c6960Intercept;
        }
        C6755.m11862(interfaceC6969, "network interceptor ", " must call proceed() exactly once");
        return null;
    }
}
