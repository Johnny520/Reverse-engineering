package io.ktor.server.cio;

import androidx.compose.runtime.internal.C1245;
import io.ktor.http.cio.C3960;
import io.ktor.http.cio.C3965;
import io.ktor.http.cio.C3973;
import io.ktor.http.cio.internals.C3953;
import io.ktor.server.engine.AbstractC4088;
import io.ktor.server.request.C4125;
import io.ktor.utils.io.InterfaceC4251;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5143;
import p052.InterfaceC6542;
import p053.AbstractC6560;
import p236.AbstractC8110;
import p236.AbstractC8114;
import p236.C8098;
import p236.C8103;
import p236.C8104;
import p236.C8117;
import p236.InterfaceC8094;
import p236.InterfaceC8101;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4078 extends AbstractC4088 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1245 f12378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f12379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3965 f12380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5183 f12381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5183 f12382;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4251 f12383;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3960 f12384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4078(C4082 c4082, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC4251 interfaceC4251, C3965 c3965) {
        super(c4082);
        interfaceC4251.getClass();
        c3965.getClass();
        this.f12380 = c3965;
        final int i = 0;
        this.f12379 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4078 f12385;

            {
                this.f12385 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                ?? arrayList;
                int i2 = i;
                C4078 c4078 = this.f12385;
                switch (i2) {
                    case 0:
                        return new C4125(c4078);
                    case 1:
                        InterfaceC8094 interfaceC8094Mo376 = c4078.mo376();
                        interfaceC8094Mo376.getClass();
                        ?? c8104 = new C8104(2);
                        for (String str : c4078.mo376().names()) {
                            List listMo8364 = interfaceC8094Mo376.mo8364(str);
                            if (listMo8364 != null) {
                                arrayList = new ArrayList(AbstractC4344.m8832(listMo8364, 10));
                                Iterator it = listMo8364.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8110.m13548(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8104.mo2399(AbstractC8110.m13548(0, 0, str, 15), arrayList);
                        }
                        return new C4077((C8103) c8104.build());
                    default:
                        String string = c4078.f12380.f12199.toString();
                        int iM10151 = AbstractC5143.m10151(string, '?', 0, 6);
                        Integer numValueOf = iM10151 != -1 ? Integer.valueOf(iM10151) : null;
                        if (numValueOf != null) {
                            return AbstractC6560.m12008(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8094.f22340.getClass();
                        return C8117.f22416;
                }
            }
        });
        this.f12383 = interfaceC4251;
        C3973 c3973 = c3965.f12213;
        this.f12384 = new C3960(c3973);
        final int i2 = 1;
        this.f12381 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4078 f12385;

            {
                this.f12385 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                ?? arrayList;
                int i22 = i2;
                C4078 c4078 = this.f12385;
                switch (i22) {
                    case 0:
                        return new C4125(c4078);
                    case 1:
                        InterfaceC8094 interfaceC8094Mo376 = c4078.mo376();
                        interfaceC8094Mo376.getClass();
                        ?? c8104 = new C8104(2);
                        for (String str : c4078.mo376().names()) {
                            List listMo8364 = interfaceC8094Mo376.mo8364(str);
                            if (listMo8364 != null) {
                                arrayList = new ArrayList(AbstractC4344.m8832(listMo8364, 10));
                                Iterator it = listMo8364.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8110.m13548(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8104.mo2399(AbstractC8110.m13548(0, 0, str, 15), arrayList);
                        }
                        return new C4077((C8103) c8104.build());
                    default:
                        String string = c4078.f12380.f12199.toString();
                        int iM10151 = AbstractC5143.m10151(string, '?', 0, 6);
                        Integer numValueOf = iM10151 != -1 ? Integer.valueOf(iM10151) : null;
                        if (numValueOf != null) {
                            return AbstractC6560.m12008(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8094.f22340.getClass();
                        return C8117.f22416;
                }
            }
        });
        final int i3 = 2;
        this.f12382 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4078 f12385;

            {
                this.f12385 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                ?? arrayList;
                int i22 = i3;
                C4078 c4078 = this.f12385;
                switch (i22) {
                    case 0:
                        return new C4125(c4078);
                    case 1:
                        InterfaceC8094 interfaceC8094Mo376 = c4078.mo376();
                        interfaceC8094Mo376.getClass();
                        ?? c8104 = new C8104(2);
                        for (String str : c4078.mo376().names()) {
                            List listMo8364 = interfaceC8094Mo376.mo8364(str);
                            if (listMo8364 != null) {
                                arrayList = new ArrayList(AbstractC4344.m8832(listMo8364, 10));
                                Iterator it = listMo8364.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8110.m13548(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8104.mo2399(AbstractC8110.m13548(0, 0, str, 15), arrayList);
                        }
                        return new C4077((C8103) c8104.build());
                    default:
                        String string = c4078.f12380.f12199.toString();
                        int iM10151 = AbstractC5143.m10151(string, '?', 0, 6);
                        Integer numValueOf = iM10151 != -1 ? Integer.valueOf(iM10151) : null;
                        if (numValueOf != null) {
                            return AbstractC6560.m12008(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8094.f22340.getClass();
                        return C8117.f22416;
                }
            }
        });
        String string = c3965.f12198.toString();
        String string2 = c3965.f12199.toString();
        String[] strArr = AbstractC8114.f22415;
        C3953 c3953M8390 = c3973.m8390("Host");
        if (c3953M8390 != null) {
            c3953M8390.toString();
        }
        C8098 c8098 = C8098.f22372;
        String str = c3965.f12200.f22376;
        str.getClass();
        C8098 c80982 = C8098.f22372;
        if (!str.equals(c80982.f22376)) {
            c80982 = C8098.f22371;
            if (!str.equals(c80982.f22376)) {
                c80982 = C8098.f22370;
                if (!str.equals(c80982.f22376)) {
                    c80982 = C8098.f22369;
                    if (!str.equals(c80982.f22376)) {
                        c80982 = C8098.f22368;
                        if (!str.equals(c80982.f22376)) {
                            c80982 = C8098.f22374;
                            if (!str.equals(c80982.f22376)) {
                                c80982 = C8098.f22373;
                                if (!str.equals(c80982.f22376)) {
                                    c80982 = new C8098(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f12378 = new C1245(inetSocketAddress, inetSocketAddress2, string, string2, c80982);
    }

    @Override // io.ktor.server.request.InterfaceC4128
    public final C4125 getCookies() {
        return (C4125) this.f12379.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8094 mo376() {
        return (InterfaceC8094) this.f12382.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8101 mo377() {
        return this.f12378;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8094 mo399() {
        return (InterfaceC8094) this.f12381.getValue();
    }
}
