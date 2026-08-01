package p070;

import io.ktor.util.C4210;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6910 implements InterfaceC6907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable f18430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ProtoBuf$StringTable f18431;

    public C6910(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f18431 = protoBuf$StringTable;
        this.f18430 = protoBuf$QualifiedNameTable;
    }

    @Override // p070.InterfaceC6907
    public final String getString(int i) {
        String string = this.f18431.getString(i);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Triple m12175(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f18430.getQualifiedName(i);
            String string = this.f18431.getString(qualifiedName.getShortName());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i2 = AbstractC6906.f18428[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    C4210.m8621();
                    return null;
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // p070.InterfaceC6907
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12136(int i) {
        return ((Boolean) m12175(i).getThird()).booleanValue();
    }

    @Override // p070.InterfaceC6907
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12137(int i) throws IOException {
        Triple tripleM12175 = m12175(i);
        List list = (List) tripleM12175.component1();
        String strM8813 = AbstractC4343.m8813((List) tripleM12175.component2(), ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM8813;
        }
        return AbstractC4343.m8813(list, "/", null, null, null, 62) + '/' + strM8813;
    }
}
