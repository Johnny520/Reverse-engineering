package kotlinx.serialization.protobuf.internal;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.core.view.C3075;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p047.C7156;
import p047.InterfaceC7155;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p107.C8022;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6358 extends C6352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3075 f15618;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6358(C7156 c7156, C3075 c3075, InterfaceC8020 interfaceC8020) {
        super(c7156, c3075, interfaceC8020);
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
        this.f15618 = c3075;
        if (interfaceC8020.getKind() instanceof C8022) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC8020.mo12941() + " should be using generic polymorphic serializer, but got " + interfaceC8020.getKind() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo11318(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC1298.m1736(interfaceC8020, i);
        }
        StringBuilder sbM710 = AbstractC0900.m710(i, "Unsupported index: ", " in a oneOf type ");
        sbM710.append(interfaceC8020.mo12941());
        sbM710.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbM710.toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (interfaceC8020.equals(this.f15599)) {
            return this;
        }
        C7156 c7156 = this.f15598;
        c7156.getClass();
        C3075 c3075 = this.f15618;
        c3075.getClass();
        C6344 c6344 = new C6344(c7156, c3075, interfaceC8020);
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
        if (((InterfaceC7155) AbstractC5176.m9340(arrayList)) != null) {
            return c6344;
        }
        C1123.m1409(interfaceC8020.mo12941(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        int i = this.f6966;
        if (i < 0) {
            throw new SerializationException("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f6965;
        this.f6966 = i - 1;
        m4826((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC1298.m1736(interfaceC8020, 0) & 2147483647L))));
        return this;
    }

    @Override // kotlinx.serialization.protobuf.internal.C6352
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo11331(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.mo11331(j, str);
        }
    }
}
