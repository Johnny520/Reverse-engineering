package kotlinx.serialization.protobuf.internal;

import androidx.collection.C1123;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.internal.C2080;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlinx.serialization.SerializationException;
import p047.C7156;
import p047.InterfaceC7155;
import p106.InterfaceC8018;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6362 extends C6353 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f15620;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f15621;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15622;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6362(C7156 c7156, C6357 c6357, long j, InterfaceC8020 interfaceC8020) {
        super(c7156, c6357, interfaceC8020);
        interfaceC8020.getClass();
        this.f15622 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo11334(long j) {
        Object next;
        String strMo12941;
        if (j != 19501) {
            return super.mo11334(j);
        }
        C2080 c2080 = this.f15608.f17781;
        int i = (int) (this.f15622 & 2147483647L);
        InterfaceC8020 interfaceC8020 = this.f15602;
        interfaceC8020.getClass();
        c2080.getClass();
        Iterator it = AbstractC1298.m1732(interfaceC8020, c2080).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((int) (AbstractC1298.m1736((InterfaceC8020) next, 0) & 2147483647L)) == i) {
                break;
            }
        }
        InterfaceC8020 interfaceC80202 = (InterfaceC8020) next;
        if (interfaceC80202 != null && (strMo12941 = interfaceC80202.mo12941()) != null) {
            return strMo12941;
        }
        throw new SerializationException("Cannot find a subclass of " + interfaceC8020.mo12941() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo11320(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        if (i == 0) {
            return 19501L;
        }
        return AbstractC1298.m1736(interfaceC8020, 0);
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (interfaceC8020.equals(this.f15602)) {
            return this;
        }
        C6359 c6359 = new C6359(this.f15608, this.f15603, interfaceC8020);
        if (interfaceC8020.mo12939() != 1) {
            C5043.m9159(interfaceC8020.mo12939(), interfaceC8020.mo12941(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listMo12943 = interfaceC8020.mo12943(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12943) {
            if (obj instanceof InterfaceC7155) {
                arrayList.add(obj);
            }
        }
        InterfaceC7155 interfaceC7155 = (InterfaceC7155) AbstractC5176.m9340(arrayList);
        if (interfaceC7155 != null) {
            interfaceC7155.number();
            return c6359;
        }
        C1123.m1409(interfaceC8020.mo12941(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6353, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (!this.f15621) {
            this.f15621 = true;
            return 0;
        }
        if (this.f15620) {
            return -1;
        }
        this.f15620 = true;
        return 1;
    }
}
