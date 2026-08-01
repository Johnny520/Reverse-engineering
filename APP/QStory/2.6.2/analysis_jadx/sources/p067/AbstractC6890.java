package p067;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import net.bytebuddy.asm.Advice;
import p070.InterfaceC6907;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6890 implements InterfaceC6907 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List f18347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f18348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set f18349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f18350;

    static {
        String strM8813 = AbstractC4343.m8813(AbstractC8189.m13659('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);
        List listM13659 = AbstractC8189.m13659(strM8813.concat("/Any"), strM8813.concat("/Nothing"), strM8813.concat("/Unit"), strM8813.concat("/Throwable"), strM8813.concat("/Number"), strM8813.concat("/Byte"), strM8813.concat("/Double"), strM8813.concat("/Float"), strM8813.concat("/Int"), strM8813.concat("/Long"), strM8813.concat("/Short"), strM8813.concat("/Boolean"), strM8813.concat("/Char"), strM8813.concat("/CharSequence"), strM8813.concat("/String"), strM8813.concat("/Comparable"), strM8813.concat("/Enum"), strM8813.concat("/Array"), strM8813.concat("/ByteArray"), strM8813.concat("/DoubleArray"), strM8813.concat("/FloatArray"), strM8813.concat("/IntArray"), strM8813.concat("/LongArray"), strM8813.concat("/ShortArray"), strM8813.concat("/BooleanArray"), strM8813.concat("/CharArray"), strM8813.concat("/Cloneable"), strM8813.concat("/Annotation"), strM8813.concat("/collections/Iterable"), strM8813.concat("/collections/MutableIterable"), strM8813.concat("/collections/Collection"), strM8813.concat("/collections/MutableCollection"), strM8813.concat("/collections/List"), strM8813.concat("/collections/MutableList"), strM8813.concat("/collections/Set"), strM8813.concat("/collections/MutableSet"), strM8813.concat("/collections/Map"), strM8813.concat("/collections/MutableMap"), strM8813.concat("/collections/Map.Entry"), strM8813.concat("/collections/MutableMap.MutableEntry"), strM8813.concat("/collections/Iterator"), strM8813.concat("/collections/MutableIterator"), strM8813.concat("/collections/ListIterator"), strM8813.concat("/collections/MutableListIterator"));
        f18347 = listM13659;
        C4341 c4341M8796 = AbstractC4343.m8796(listM13659);
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(c4341M8796, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        Iterator it = c4341M8796.iterator();
        while (true) {
            C4337 c4337 = (C4337) it;
            if (!c4337.f12915.hasNext()) {
                return;
            }
            C4340 c4340 = (C4340) c4337.next();
            linkedHashMap.put((String) c4340.f12919, Integer.valueOf(c4340.f12920));
        }
    }

    public AbstractC6890(String[] strArr, Set set, ArrayList arrayList) {
        strArr.getClass();
        set.getClass();
        this.f18350 = strArr;
        this.f18349 = set;
        this.f18348 = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // p070.InterfaceC6907
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067.AbstractC6890.getString(int):java.lang.String");
    }

    @Override // p070.InterfaceC6907
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo12136(int i) {
        return this.f18349.contains(Integer.valueOf(i));
    }

    @Override // p070.InterfaceC6907
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo12137(int i) {
        return getString(i);
    }
}
