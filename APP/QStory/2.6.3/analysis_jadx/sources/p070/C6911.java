package p070;

import io.ktor.util.C4211;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6911 implements InterfaceC6908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable f18425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ProtoBuf$StringTable f18426;

    public C6911(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f18426 = protoBuf$StringTable;
        this.f18425 = protoBuf$QualifiedNameTable;
    }

    @Override // p070.InterfaceC6908
    public final String getString(int i) {
        String string = this.f18426.getString(i);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Triple m12203(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f18425.getQualifiedName(i);
            String string = this.f18426.getString(qualifiedName.getShortName());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i2 = AbstractC6907.f18423[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    C4211.m8611();
                    return null;
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // p070.InterfaceC6908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12164(int i) {
        return ((Boolean) m12203(i).getThird()).booleanValue();
    }

    @Override // p070.InterfaceC6908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12165(int i) throws IOException {
        Triple tripleM12203 = m12203(i);
        List list = (List) tripleM12203.component1();
        String strM8810 = AbstractC4344.m8810((List) tripleM12203.component2(), ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM8810;
        }
        return AbstractC4344.m8810(list, "/", null, null, null, 62) + '/' + strM8810;
    }
}
