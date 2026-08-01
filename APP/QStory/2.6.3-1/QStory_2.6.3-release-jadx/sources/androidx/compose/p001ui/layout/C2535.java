package androidx.compose.p001ui.layout;

import java.io.Serializable;
import kotlin.collections.AbstractC5179;
import p025.AbstractC7012;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Serializable f5307;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2531 f5308;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2513 f5309;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2531 f5310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2513 f5311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f5312;

    /* JADX WARN: Multi-variable type inference failed */
    public C2535(C2535[] c2535Arr) {
        this.f5312 = 0;
        this.f5307 = c2535Arr;
        int length = c2535Arr.length;
        final C2513[] c2513Arr = new C2513[length];
        for (int i = 0; i < length; i++) {
            c2513Arr[i] = ((C2535[]) this.f5307)[i].m3682();
        }
        this.f5311 = new C2513(new InterfaceC7383() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC2543) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC2543 abstractC2543, float f) {
                return Float.valueOf(AbstractC2505.m3661(abstractC2543, true, c2513Arr, f));
            }
        });
        int length2 = ((C2535[]) this.f5307).length;
        final C2531[] c2531Arr = new C2531[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            c2531Arr[i2] = ((C2535[]) this.f5307)[i2].m3680();
        }
        this.f5310 = new C2531(new InterfaceC7383() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$maxOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC2543) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC2543 abstractC2543, float f) {
                return Float.valueOf(AbstractC2505.m3661(abstractC2543, true, c2531Arr, f));
            }
        });
        int length3 = ((C2535[]) this.f5307).length;
        final C2513[] c2513Arr2 = new C2513[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c2513Arr2[i3] = ((C2535[]) this.f5307)[i3].m3681();
        }
        this.f5309 = new C2513(new InterfaceC7383() { // from class: androidx.compose.ui.layout.VerticalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC2543) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC2543 abstractC2543, float f) {
                return Float.valueOf(AbstractC2505.m3661(abstractC2543, false, c2513Arr2, f));
            }
        });
        int length4 = ((C2535[]) this.f5307).length;
        final C2531[] c2531Arr2 = new C2531[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            c2531Arr2[i4] = ((C2535[]) this.f5307)[i4].m3683();
        }
        this.f5308 = new C2531(new InterfaceC7383() { // from class: androidx.compose.ui.layout.HorizontalRuler$Companion$minOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((AbstractC2543) obj, ((Number) obj2).floatValue());
            }

            public final Float invoke(AbstractC2543 abstractC2543, float f) {
                return Float.valueOf(AbstractC2505.m3661(abstractC2543, false, c2531Arr2, f));
            }
        });
    }

    public final String toString() {
        int i = this.f5312;
        Object obj = this.f5307;
        switch (i) {
            case 0:
                return AbstractC5179.m9415((C2535[]) obj, "innermostOf(", ")", null, 57);
            default:
                return AbstractC7012.m12149(')', "RectRulers(", (String) obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2531 m3680() {
        int i = this.f5312;
        return this.f5310;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2513 m3681() {
        int i = this.f5312;
        return this.f5309;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2513 m3682() {
        int i = this.f5312;
        return this.f5311;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2531 m3683() {
        int i = this.f5312;
        return this.f5308;
    }

    public C2535(String str) {
        this.f5312 = 1;
        this.f5307 = str;
        this.f5311 = new C2513(null);
        this.f5310 = new C2531(null);
        this.f5309 = new C2513(null);
        this.f5308 = new C2531(null);
    }
}
