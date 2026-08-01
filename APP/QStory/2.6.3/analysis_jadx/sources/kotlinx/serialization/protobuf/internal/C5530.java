package kotlinx.serialization.protobuf.internal;

import androidx.collection.C0276;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlinx.serialization.SerializationException;
import p031.C6327;
import p031.InterfaceC6326;
import p090.InterfaceC7189;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5530 extends C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f15275;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f15276;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15277;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5530(C6327 c6327, C5525 c5525, long j, InterfaceC7191 interfaceC7191) {
        super(c6327, c5525, interfaceC7191);
        interfaceC7191.getClass();
        this.f15277 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo10775(long j) {
        Object next;
        String strMo12382;
        if (j != 19501) {
            return super.mo10775(j);
        }
        C1245 c1245 = this.f15263.f17436;
        int i = (int) (this.f15277 & 2147483647L);
        InterfaceC7191 interfaceC7191 = this.f15257;
        interfaceC7191.getClass();
        c1245.getClass();
        Iterator it = AbstractC0455.m1172(interfaceC7191, c1245).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((int) (AbstractC0455.m1176((InterfaceC7191) next, 0) & 2147483647L)) == i) {
                break;
            }
        }
        InterfaceC7191 interfaceC71912 = (InterfaceC7191) next;
        if (interfaceC71912 != null && (strMo12382 = interfaceC71912.mo12382()) != null) {
            return strMo12382;
        }
        throw new SerializationException("Cannot find a subclass of " + interfaceC7191.mo12382() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10761(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        if (i == 0) {
            return 19501L;
        }
        return AbstractC0455.m1176(interfaceC7191, 0);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (interfaceC7191.equals(this.f15257)) {
            return this;
        }
        C5527 c5527 = new C5527(this.f15263, this.f15258, interfaceC7191);
        if (interfaceC7191.mo12380() != 1) {
            C4211.m8600(interfaceC7191.mo12380(), interfaceC7191.mo12382(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listMo12384 = interfaceC7191.mo12384(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12384) {
            if (obj instanceof InterfaceC6326) {
                arrayList.add(obj);
            }
        }
        InterfaceC6326 interfaceC6326 = (InterfaceC6326) AbstractC4344.m8781(arrayList);
        if (interfaceC6326 != null) {
            interfaceC6326.number();
            return c5527;
        }
        C0276.m849(interfaceC7191.mo12382(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (!this.f15276) {
            this.f15276 = true;
            return 0;
        }
        if (this.f15275) {
            return -1;
        }
        this.f15275 = true;
        return 1;
    }
}
