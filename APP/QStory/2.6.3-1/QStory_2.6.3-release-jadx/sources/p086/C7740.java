package p086;

import io.ktor.util.C5043;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7740 implements InterfaceC7737 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ProtoBuf$QualifiedNameTable f18770;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ProtoBuf$StringTable f18771;

    public C7740(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        this.f18771 = protoBuf$StringTable;
        this.f18770 = protoBuf$QualifiedNameTable;
    }

    @Override // p086.InterfaceC7737
    public final String getString(int i) {
        String string = this.f18771.getString(i);
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Triple m12762(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.f18770.getQualifiedName(i);
            String string = this.f18771.getString(qualifiedName.getShortName());
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            kind.getClass();
            int i2 = AbstractC7736.f18768[kind.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(string);
            } else if (i2 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i2 != 3) {
                    C5043.m9170();
                    return null;
                }
                linkedList2.addFirst(string);
                z = true;
            }
            i = qualifiedName.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // p086.InterfaceC7737
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo12723(int i) {
        return ((Boolean) m12762(i).getThird()).booleanValue();
    }

    @Override // p086.InterfaceC7737
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12724(int i) throws IOException {
        Triple tripleM12762 = m12762(i);
        List list = (List) tripleM12762.component1();
        String strM9369 = AbstractC5176.m9369((List) tripleM12762.component2(), ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM9369;
        }
        return AbstractC5176.m9369(list, "/", null, null, null, 62) + '/' + strM9369;
    }
}
