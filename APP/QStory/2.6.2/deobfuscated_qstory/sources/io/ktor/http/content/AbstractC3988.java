package io.ktor.http.content;

import io.ktor.http.cio.C3960;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p052.InterfaceC6542;
import p236.AbstractC8114;
import p236.C8109;
import p236.C8112;
import p236.C8122;
import p236.C8124;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3988 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f12238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3960 f12239;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6542 f12240;

    public AbstractC3988(InterfaceC6542 interfaceC6542, C3960 c3960) {
        this.f12240 = interfaceC6542;
        this.f12239 = c3960;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.f12238 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3988 f12241;

            {
                this.f12241 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i2 = i;
                AbstractC3988 abstractC3988 = this.f12241;
                switch (i2) {
                    case 0:
                        C3960 c39602 = abstractC3988.f12239;
                        String[] strArr = AbstractC8114.f22415;
                        String strMo8366 = c39602.mo8366("Content-Disposition");
                        if (strMo8366 == null) {
                            return null;
                        }
                        int i3 = C8109.f22405;
                        C8122 c8122 = (C8122) AbstractC4343.m8811(AbstractC4921.m9883(strMo8366));
                        return new C8109(c8122.f22424, c8122.f22423);
                    default:
                        C3960 c39603 = abstractC3988.f12239;
                        String[] strArr2 = AbstractC8114.f22415;
                        String strMo83662 = c39603.mo8366("Content-Type");
                        if (strMo83662 == null) {
                            return null;
                        }
                        C8124 c8124 = C8124.f22426;
                        return C8112.m13553(strMo83662);
                }
            }
        });
        final int i2 = 1;
        AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: io.ktor.http.content.飘花落叶言子楪哲苏世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ AbstractC3988 f12241;

            {
                this.f12241 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i22 = i2;
                AbstractC3988 abstractC3988 = this.f12241;
                switch (i22) {
                    case 0:
                        C3960 c39602 = abstractC3988.f12239;
                        String[] strArr = AbstractC8114.f22415;
                        String strMo8366 = c39602.mo8366("Content-Disposition");
                        if (strMo8366 == null) {
                            return null;
                        }
                        int i3 = C8109.f22405;
                        C8122 c8122 = (C8122) AbstractC4343.m8811(AbstractC4921.m9883(strMo8366));
                        return new C8109(c8122.f22424, c8122.f22423);
                    default:
                        C3960 c39603 = abstractC3988.f12239;
                        String[] strArr2 = AbstractC8114.f22415;
                        String strMo83662 = c39603.mo8366("Content-Type");
                        if (strMo83662 == null) {
                            return null;
                        }
                        C8124 c8124 = C8124.f22426;
                        return C8112.m13553(strMo83662);
                }
            }
        });
    }
}
