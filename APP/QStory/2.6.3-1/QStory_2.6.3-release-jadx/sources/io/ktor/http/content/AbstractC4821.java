package io.ktor.http.content;

import io.ktor.http.cio.C4793;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import p050.AbstractC7173;
import p068.InterfaceC7372;
import p252.AbstractC8944;
import p252.C8939;
import p252.C8942;
import p252.C8952;
import p252.C8954;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f12587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4793 f12588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7372 f12589;

    public AbstractC4821(InterfaceC7372 interfaceC7372, C4793 c4793) {
        this.f12589 = interfaceC7372;
        this.f12588 = c4793;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.f12587 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC4821 f12590;

            {
                this.f12590 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i2 = i;
                AbstractC4821 abstractC4821 = this.f12590;
                switch (i2) {
                    case 0:
                        C4793 c47932 = abstractC4821.f12588;
                        String[] strArr = AbstractC8944.f22758;
                        String strMo8915 = c47932.mo8915("Content-Disposition");
                        if (strMo8915 == null) {
                            return null;
                        }
                        int i3 = C8939.f22748;
                        C8952 c8952 = (C8952) AbstractC5176.m9367(AbstractC7173.m12435(strMo8915));
                        return new C8939(c8952.f22767, c8952.f22766);
                    default:
                        C4793 c47933 = abstractC4821.f12588;
                        String[] strArr2 = AbstractC8944.f22758;
                        String strMo89152 = c47933.mo8915("Content-Type");
                        if (strMo89152 == null) {
                            return null;
                        }
                        C8954 c8954 = C8954.f22769;
                        return C8942.m14141(strMo89152);
                }
            }
        });
        final int i2 = 1;
        AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC4821 f12590;

            {
                this.f12590 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i22 = i2;
                AbstractC4821 abstractC4821 = this.f12590;
                switch (i22) {
                    case 0:
                        C4793 c47932 = abstractC4821.f12588;
                        String[] strArr = AbstractC8944.f22758;
                        String strMo8915 = c47932.mo8915("Content-Disposition");
                        if (strMo8915 == null) {
                            return null;
                        }
                        int i3 = C8939.f22748;
                        C8952 c8952 = (C8952) AbstractC5176.m9367(AbstractC7173.m12435(strMo8915));
                        return new C8939(c8952.f22767, c8952.f22766);
                    default:
                        C4793 c47933 = abstractC4821.f12588;
                        String[] strArr2 = AbstractC8944.f22758;
                        String strMo89152 = c47933.mo8915("Content-Type");
                        if (strMo89152 == null) {
                            return null;
                        }
                        C8954 c8954 = C8954.f22769;
                        return C8942.m14141(strMo89152);
                }
            }
        });
    }
}
