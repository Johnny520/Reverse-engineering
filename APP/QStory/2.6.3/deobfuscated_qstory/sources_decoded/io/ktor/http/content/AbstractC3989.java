package io.ktor.http.content;

import io.ktor.http.cio.C3961;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import p034.AbstractC6344;
import p052.InterfaceC6543;
import p236.AbstractC8115;
import p236.C8110;
import p236.C8113;
import p236.C8123;
import p236.C8125;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3989 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f12242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3961 f12243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6543 f12244;

    public AbstractC3989(InterfaceC6543 interfaceC6543, C3961 c3961) {
        this.f12244 = interfaceC6543;
        this.f12243 = c3961;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.f12242 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3989 f12245;

            {
                this.f12245 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i2 = i;
                AbstractC3989 abstractC3989 = this.f12245;
                switch (i2) {
                    case 0:
                        C3961 c39612 = abstractC3989.f12243;
                        String[] strArr = AbstractC8115.f22413;
                        String strMo8356 = c39612.mo8356("Content-Disposition");
                        if (strMo8356 == null) {
                            return null;
                        }
                        int i3 = C8110.f22403;
                        C8123 c8123 = (C8123) AbstractC4344.m8808(AbstractC6344.m11876(strMo8356));
                        return new C8110(c8123.f22422, c8123.f22421);
                    default:
                        C3961 c39613 = abstractC3989.f12243;
                        String[] strArr2 = AbstractC8115.f22413;
                        String strMo83562 = c39613.mo8356("Content-Type");
                        if (strMo83562 == null) {
                            return null;
                        }
                        C8125 c8125 = C8125.f22424;
                        return C8113.m13582(strMo83562);
                }
            }
        });
        final int i2 = 1;
        AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3989 f12245;

            {
                this.f12245 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i22 = i2;
                AbstractC3989 abstractC3989 = this.f12245;
                switch (i22) {
                    case 0:
                        C3961 c39612 = abstractC3989.f12243;
                        String[] strArr = AbstractC8115.f22413;
                        String strMo8356 = c39612.mo8356("Content-Disposition");
                        if (strMo8356 == null) {
                            return null;
                        }
                        int i3 = C8110.f22403;
                        C8123 c8123 = (C8123) AbstractC4344.m8808(AbstractC6344.m11876(strMo8356));
                        return new C8110(c8123.f22422, c8123.f22421);
                    default:
                        C3961 c39613 = abstractC3989.f12243;
                        String[] strArr2 = AbstractC8115.f22413;
                        String strMo83562 = c39613.mo8356("Content-Type");
                        if (strMo83562 == null) {
                            return null;
                        }
                        C8125 c8125 = C8125.f22424;
                        return C8113.m13582(strMo83562);
                }
            }
        });
    }
}
