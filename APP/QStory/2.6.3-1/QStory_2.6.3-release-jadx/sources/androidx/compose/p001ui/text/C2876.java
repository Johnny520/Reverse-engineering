package androidx.compose.p001ui.text;

import kotlin.reflect.jvm.internal.impl.types.C5703;
import p050.AbstractC7176;
import p068.InterfaceC7383;
import p132.C8170;
import p225.C8747;
import p225.C8754;
import p225.C8755;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2876 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6389;

    public /* synthetic */ C2876(int i) {
        this.f6389 = i;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        C8170 c8170 = (C8170) obj;
        switch (this.f6389) {
            case 0:
                C2870 c2870 = (C2870) obj2;
                C2881 c2881 = c2870.f6353;
                C5703 c5703 = AbstractC2871.f6378;
                return AbstractC7176.m12471(AbstractC2871.m4319(c2881, c5703, c8170), AbstractC2871.m4319(c2870.f6352, c5703, c8170), AbstractC2871.m4319(c2870.f6351, c5703, c8170), AbstractC2871.m4319(c2870.f6350, c5703, c8170));
            case 1:
                C2889 c2889 = (C2889) obj2;
                Boolean boolValueOf = Boolean.valueOf(c2889.f6436);
                C5703 c57032 = AbstractC2871.f6365;
                return AbstractC7176.m12471(boolValueOf, AbstractC2871.m4319(new C2905(c2889.f6435), AbstractC2882.f6416, c8170));
            case 2:
                return Integer.valueOf(((C2905) obj2).f6479);
            case 3:
                return Integer.valueOf(((C8747) obj2).f22284);
            case 4:
                C8755 c8755 = (C8755) obj2;
                return AbstractC7176.m12471(AbstractC2871.m4319(new C8754(c8755.f22295), AbstractC2882.f6413, c8170), Boolean.valueOf(c8755.f22294));
            default:
                return Integer.valueOf(((C8754) obj2).f22291);
        }
    }
}
