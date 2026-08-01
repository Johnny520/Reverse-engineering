package androidx.compose.ui.layout;

import java.io.Serializable;
import kotlin.collections.AbstractC4346;
import p007.AbstractC6136;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1700 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Serializable f4961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1696 f4962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1678 f4963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1696 f4964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1678 f4965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f4966;

    /* JADX WARN: Multi-variable type inference failed */
    public C1700(C1700[] c1700Arr) {
        this.f4966 = 0;
        this.f4961 = c1700Arr;
        int length = c1700Arr.length;
        final C1678[] c1678Arr = new C1678[length];
        for (int i = 0; i < length; i++) {
            c1678Arr[i] = ((C1700[]) this.f4961)[i].m3112();
        }
        this.f4965 = new C1678(new InterfaceC6553() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC1708) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC1708 abstractC1708, float f) {
                return Float.valueOf(AbstractC1670.m3091(abstractC1708, true, c1678Arr, f));
            }
        });
        int length2 = ((C1700[]) this.f4961).length;
        final C1696[] c1696Arr = new C1696[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            c1696Arr[i2] = ((C1700[]) this.f4961)[i2].m3110();
        }
        this.f4964 = new C1696(new InterfaceC6553() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC1708) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC1708 abstractC1708, float f) {
                return Float.valueOf(AbstractC1670.m3091(abstractC1708, true, c1696Arr, f));
            }
        });
        int length3 = ((C1700[]) this.f4961).length;
        final C1678[] c1678Arr2 = new C1678[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c1678Arr2[i3] = ((C1700[]) this.f4961)[i3].m3111();
        }
        this.f4963 = new C1678(new InterfaceC6553() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC1708) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC1708 abstractC1708, float f) {
                return Float.valueOf(AbstractC1670.m3091(abstractC1708, false, c1678Arr2, f));
            }
        });
        int length4 = ((C1700[]) this.f4961).length;
        final C1696[] c1696Arr2 = new C1696[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            c1696Arr2[i4] = ((C1700[]) this.f4961)[i4].m3113();
        }
        this.f4962 = new C1696(new InterfaceC6553() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC1708) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC1708 abstractC1708, float f) {
                return Float.valueOf(AbstractC1670.m3091(abstractC1708, false, c1696Arr2, f));
            }
        });
    }

    public final String toString() {
        int i = this.f4966;
        Object obj = this.f4961;
        switch (i) {
            case 0:
                return AbstractC4346.m8856((C1700[]) obj, "innermostOf(", ")", null, 57);
            default:
                return AbstractC6136.m11558(')', "RectRulers(", (String) obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1696 m3110() {
        int i = this.f4966;
        return this.f4964;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1678 m3111() {
        int i = this.f4966;
        return this.f4963;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1678 m3112() {
        int i = this.f4966;
        return this.f4965;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1696 m3113() {
        int i = this.f4966;
        return this.f4962;
    }

    public C1700(String str) {
        this.f4966 = 1;
        this.f4961 = str;
        this.f4965 = new C1678(null);
        this.f4964 = new C1696(null);
        this.f4963 = new C1678(null);
        this.f4962 = new C1696(null);
    }
}
