package io.ktor.server.cio;

import androidx.compose.runtime.internal.C2080;
import io.ktor.http.cio.C4793;
import io.ktor.http.cio.C4798;
import io.ktor.http.cio.C4806;
import io.ktor.http.cio.internals.C4786;
import io.ktor.server.engine.AbstractC4921;
import io.ktor.server.request.C4958;
import io.ktor.utils.p007io.InterfaceC5084;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import p068.InterfaceC7372;
import p191.AbstractC8568;
import p252.AbstractC8940;
import p252.AbstractC8944;
import p252.C8928;
import p252.C8933;
import p252.C8934;
import p252.C8947;
import p252.InterfaceC8924;
import p252.InterfaceC8931;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C2080 f12727;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f12728;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4798 f12729;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC6016 f12730;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC6016 f12731;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5084 f12732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C4793 f12733;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4911(C4915 c4915, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC5084 interfaceC5084, C4798 c4798) {
        super(c4915);
        interfaceC5084.getClass();
        c4798.getClass();
        this.f12729 = c4798;
        final int i = 0;
        this.f12728 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4911 f12734;

            {
                this.f12734 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                ?? arrayList;
                int i2 = i;
                C4911 c4911 = this.f12734;
                switch (i2) {
                    case 0:
                        return new C4958(c4911);
                    case 1:
                        InterfaceC8924 interfaceC8924Mo937 = c4911.mo937();
                        interfaceC8924Mo937.getClass();
                        ?? c8934 = new C8934(2);
                        for (String str : c4911.mo937().names()) {
                            List listMo8913 = interfaceC8924Mo937.mo8913(str);
                            if (listMo8913 != null) {
                                arrayList = new ArrayList(AbstractC5177.m9381(listMo8913, 10));
                                Iterator it = listMo8913.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8940.m14136(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8934.mo2969(AbstractC8940.m14136(0, 0, str, 15), arrayList);
                        }
                        return new C4910((C8933) c8934.build());
                    default:
                        String string = c4911.f12729.f12548.toString();
                        int iM10730 = AbstractC5976.m10730(string, '?', 0, 6);
                        Integer numValueOf = iM10730 != -1 ? Integer.valueOf(iM10730) : null;
                        if (numValueOf != null) {
                            return AbstractC8568.m13620(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8924.f22683.getClass();
                        return C8947.f22759;
                }
            }
        });
        this.f12732 = interfaceC5084;
        C4806 c4806 = c4798.f12562;
        this.f12733 = new C4793(c4806);
        final int i2 = 1;
        this.f12730 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4911 f12734;

            {
                this.f12734 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                ?? arrayList;
                int i22 = i2;
                C4911 c4911 = this.f12734;
                switch (i22) {
                    case 0:
                        return new C4958(c4911);
                    case 1:
                        InterfaceC8924 interfaceC8924Mo937 = c4911.mo937();
                        interfaceC8924Mo937.getClass();
                        ?? c8934 = new C8934(2);
                        for (String str : c4911.mo937().names()) {
                            List listMo8913 = interfaceC8924Mo937.mo8913(str);
                            if (listMo8913 != null) {
                                arrayList = new ArrayList(AbstractC5177.m9381(listMo8913, 10));
                                Iterator it = listMo8913.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8940.m14136(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8934.mo2969(AbstractC8940.m14136(0, 0, str, 15), arrayList);
                        }
                        return new C4910((C8933) c8934.build());
                    default:
                        String string = c4911.f12729.f12548.toString();
                        int iM10730 = AbstractC5976.m10730(string, '?', 0, 6);
                        Integer numValueOf = iM10730 != -1 ? Integer.valueOf(iM10730) : null;
                        if (numValueOf != null) {
                            return AbstractC8568.m13620(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8924.f22683.getClass();
                        return C8947.f22759;
                }
            }
        });
        final int i3 = 2;
        this.f12731 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4911 f12734;

            {
                this.f12734 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                ?? arrayList;
                int i22 = i3;
                C4911 c4911 = this.f12734;
                switch (i22) {
                    case 0:
                        return new C4958(c4911);
                    case 1:
                        InterfaceC8924 interfaceC8924Mo937 = c4911.mo937();
                        interfaceC8924Mo937.getClass();
                        ?? c8934 = new C8934(2);
                        for (String str : c4911.mo937().names()) {
                            List listMo8913 = interfaceC8924Mo937.mo8913(str);
                            if (listMo8913 != null) {
                                arrayList = new ArrayList(AbstractC5177.m9381(listMo8913, 10));
                                Iterator it = listMo8913.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8940.m14136(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8934.mo2969(AbstractC8940.m14136(0, 0, str, 15), arrayList);
                        }
                        return new C4910((C8933) c8934.build());
                    default:
                        String string = c4911.f12729.f12548.toString();
                        int iM10730 = AbstractC5976.m10730(string, '?', 0, 6);
                        Integer numValueOf = iM10730 != -1 ? Integer.valueOf(iM10730) : null;
                        if (numValueOf != null) {
                            return AbstractC8568.m13620(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8924.f22683.getClass();
                        return C8947.f22759;
                }
            }
        });
        String string = c4798.f12547.toString();
        String string2 = c4798.f12548.toString();
        String[] strArr = AbstractC8944.f22758;
        C4786 c4786M8939 = c4806.m8939("Host");
        if (c4786M8939 != null) {
            c4786M8939.toString();
        }
        C8928 c8928 = C8928.f22715;
        String str = c4798.f12549.f22719;
        str.getClass();
        C8928 c89282 = C8928.f22715;
        if (!str.equals(c89282.f22719)) {
            c89282 = C8928.f22714;
            if (!str.equals(c89282.f22719)) {
                c89282 = C8928.f22713;
                if (!str.equals(c89282.f22719)) {
                    c89282 = C8928.f22712;
                    if (!str.equals(c89282.f22719)) {
                        c89282 = C8928.f22711;
                        if (!str.equals(c89282.f22719)) {
                            c89282 = C8928.f22717;
                            if (!str.equals(c89282.f22719)) {
                                c89282 = C8928.f22716;
                                if (!str.equals(c89282.f22719)) {
                                    c89282 = new C8928(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f12727 = new C2080(inetSocketAddress, inetSocketAddress2, string, string2, c89282);
    }

    @Override // io.ktor.server.request.InterfaceC4961
    public final C4958 getCookies() {
        return (C4958) this.f12728.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8924 mo937() {
        return (InterfaceC8924) this.f12731.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8931 mo938() {
        return this.f12727;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8924 mo960() {
        return (InterfaceC8924) this.f12730.getValue();
    }
}
