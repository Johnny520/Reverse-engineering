package io.ktor.server.cio;

import androidx.compose.runtime.internal.C1245;
import io.ktor.http.cio.C3961;
import io.ktor.http.cio.C3966;
import io.ktor.http.cio.C3974;
import io.ktor.http.cio.internals.C3954;
import io.ktor.server.engine.AbstractC4089;
import io.ktor.server.request.C4126;
import io.ktor.utils.io.InterfaceC4252;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5144;
import p052.InterfaceC6543;
import p175.AbstractC7739;
import p236.AbstractC8111;
import p236.AbstractC8115;
import p236.C8099;
import p236.C8104;
import p236.C8105;
import p236.C8118;
import p236.InterfaceC8095;
import p236.InterfaceC8102;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4079 extends AbstractC4089 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1245 f12382;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f12383;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C3966 f12384;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5184 f12385;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5184 f12386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4252 f12387;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3961 f12388;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4079(C4083 c4083, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC4252 interfaceC4252, C3966 c3966) {
        super(c4083);
        interfaceC4252.getClass();
        c3966.getClass();
        this.f12384 = c3966;
        final int i = 0;
        this.f12383 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4079 f12389;

            {
                this.f12389 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                ?? arrayList;
                int i2 = i;
                C4079 c4079 = this.f12389;
                switch (i2) {
                    case 0:
                        return new C4126(c4079);
                    case 1:
                        InterfaceC8095 interfaceC8095Mo377 = c4079.mo377();
                        interfaceC8095Mo377.getClass();
                        ?? c8105 = new C8105(2);
                        for (String str : c4079.mo377().names()) {
                            List listMo8354 = interfaceC8095Mo377.mo8354(str);
                            if (listMo8354 != null) {
                                arrayList = new ArrayList(AbstractC4345.m8822(listMo8354, 10));
                                Iterator it = listMo8354.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8111.m13577(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8105.mo2409(AbstractC8111.m13577(0, 0, str, 15), arrayList);
                        }
                        return new C4078((C8104) c8105.build());
                    default:
                        String string = c4079.f12384.f12203.toString();
                        int iM10171 = AbstractC5144.m10171(string, '?', 0, 6);
                        Integer numValueOf = iM10171 != -1 ? Integer.valueOf(iM10171) : null;
                        if (numValueOf != null) {
                            return AbstractC7739.m13061(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8095.f22338.getClass();
                        return C8118.f22414;
                }
            }
        });
        this.f12387 = interfaceC4252;
        C3974 c3974 = c3966.f12217;
        this.f12388 = new C3961(c3974);
        final int i2 = 1;
        this.f12385 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4079 f12389;

            {
                this.f12389 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                ?? arrayList;
                int i22 = i2;
                C4079 c4079 = this.f12389;
                switch (i22) {
                    case 0:
                        return new C4126(c4079);
                    case 1:
                        InterfaceC8095 interfaceC8095Mo377 = c4079.mo377();
                        interfaceC8095Mo377.getClass();
                        ?? c8105 = new C8105(2);
                        for (String str : c4079.mo377().names()) {
                            List listMo8354 = interfaceC8095Mo377.mo8354(str);
                            if (listMo8354 != null) {
                                arrayList = new ArrayList(AbstractC4345.m8822(listMo8354, 10));
                                Iterator it = listMo8354.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8111.m13577(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8105.mo2409(AbstractC8111.m13577(0, 0, str, 15), arrayList);
                        }
                        return new C4078((C8104) c8105.build());
                    default:
                        String string = c4079.f12384.f12203.toString();
                        int iM10171 = AbstractC5144.m10171(string, '?', 0, 6);
                        Integer numValueOf = iM10171 != -1 ? Integer.valueOf(iM10171) : null;
                        if (numValueOf != null) {
                            return AbstractC7739.m13061(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8095.f22338.getClass();
                        return C8118.f22414;
                }
            }
        });
        final int i3 = 2;
        this.f12386 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: io.ktor.server.cio.飘花落叶言子楪世哲兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C4079 f12389;

            {
                this.f12389 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.runtime.飘花落叶言子哲世苏楪兰, 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏楪哲兰] */
            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v1 */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                ?? arrayList;
                int i22 = i3;
                C4079 c4079 = this.f12389;
                switch (i22) {
                    case 0:
                        return new C4126(c4079);
                    case 1:
                        InterfaceC8095 interfaceC8095Mo377 = c4079.mo377();
                        interfaceC8095Mo377.getClass();
                        ?? c8105 = new C8105(2);
                        for (String str : c4079.mo377().names()) {
                            List listMo8354 = interfaceC8095Mo377.mo8354(str);
                            if (listMo8354 != null) {
                                arrayList = new ArrayList(AbstractC4345.m8822(listMo8354, 10));
                                Iterator it = listMo8354.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(AbstractC8111.m13577(0, 0, (String) it.next(), 11));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = EmptyList.INSTANCE;
                            }
                            c8105.mo2409(AbstractC8111.m13577(0, 0, str, 15), arrayList);
                        }
                        return new C4078((C8104) c8105.build());
                    default:
                        String string = c4079.f12384.f12203.toString();
                        int iM10171 = AbstractC5144.m10171(string, '?', 0, 6);
                        Integer numValueOf = iM10171 != -1 ? Integer.valueOf(iM10171) : null;
                        if (numValueOf != null) {
                            return AbstractC7739.m13061(numValueOf.intValue() + 1, 4, string);
                        }
                        InterfaceC8095.f22338.getClass();
                        return C8118.f22414;
                }
            }
        });
        String string = c3966.f12202.toString();
        String string2 = c3966.f12203.toString();
        String[] strArr = AbstractC8115.f22413;
        C3954 c3954M8380 = c3974.m8380("Host");
        if (c3954M8380 != null) {
            c3954M8380.toString();
        }
        C8099 c8099 = C8099.f22370;
        String str = c3966.f12204.f22374;
        str.getClass();
        C8099 c80992 = C8099.f22370;
        if (!str.equals(c80992.f22374)) {
            c80992 = C8099.f22369;
            if (!str.equals(c80992.f22374)) {
                c80992 = C8099.f22368;
                if (!str.equals(c80992.f22374)) {
                    c80992 = C8099.f22367;
                    if (!str.equals(c80992.f22374)) {
                        c80992 = C8099.f22366;
                        if (!str.equals(c80992.f22374)) {
                            c80992 = C8099.f22372;
                            if (!str.equals(c80992.f22374)) {
                                c80992 = C8099.f22371;
                                if (!str.equals(c80992.f22374)) {
                                    c80992 = new C8099(str);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f12382 = new C1245(inetSocketAddress, inetSocketAddress2, string, string2, c80992);
    }

    @Override // io.ktor.server.request.InterfaceC4129
    public final C4126 getCookies() {
        return (C4126) this.f12383.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8095 mo377() {
        return (InterfaceC8095) this.f12386.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8102 mo378() {
        return this.f12382;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8095 mo400() {
        return (InterfaceC8095) this.f12385.getValue();
    }
}
