package kotlinx.serialization.protobuf.internal;

import androidx.collection.C0276;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3064;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlinx.serialization.SerializationException;
import p030.C6308;
import p030.InterfaceC6307;
import p090.InterfaceC7188;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5529 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f15275;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public boolean f15276;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final long f15277;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5529(C6308 c6308, C5524 c5524, long j, InterfaceC7190 interfaceC7190) {
        super(c6308, c5524, interfaceC7190);
        interfaceC7190.getClass();
        this.f15277 = j;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final String mo10718(long j) {
        Object next;
        String strMo12355;
        if (j != 19501) {
            return super.mo10718(j);
        }
        C1245 c1245 = this.f15263.f17387;
        int i = (int) (this.f15277 & 2147483647L);
        InterfaceC7190 interfaceC7190 = this.f15257;
        interfaceC7190.getClass();
        c1245.getClass();
        Iterator it = AbstractC3064.m6763(interfaceC7190, c1245).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((int) (AbstractC3064.m6767((InterfaceC7190) next, 0) & 2147483647L)) == i) {
                break;
            }
        }
        InterfaceC7190 interfaceC71902 = (InterfaceC7190) next;
        if (interfaceC71902 != null && (strMo12355 = interfaceC71902.mo12355()) != null) {
            return strMo12355;
        }
        throw new SerializationException("Cannot find a subclass of " + interfaceC7190.mo12355() + " annotated with @ProtoNumber(" + i + ").");
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public final long mo10704(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        if (i == 0) {
            return 19501L;
        }
        return AbstractC3064.m6767(interfaceC7190, 0);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (interfaceC7190.equals(this.f15257)) {
            return this;
        }
        C5526 c5526 = new C5526(this.f15263, this.f15258, interfaceC7190);
        if (interfaceC7190.mo12353() != 1) {
            C4210.m8610(interfaceC7190.mo12353(), interfaceC7190.mo12355(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listMo12357 = interfaceC7190.mo12357(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12357) {
            if (obj instanceof InterfaceC6307) {
                arrayList.add(obj);
            }
        }
        InterfaceC6307 interfaceC6307 = (InterfaceC6307) AbstractC4343.m8815(arrayList);
        if (interfaceC6307 != null) {
            interfaceC6307.number();
            return c5526;
        }
        C0276.m848(interfaceC7190.mo12355(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
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
