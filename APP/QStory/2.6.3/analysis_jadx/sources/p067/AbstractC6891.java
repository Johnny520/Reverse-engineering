package p067;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import net.bytebuddy.asm.Advice;
import p034.AbstractC6347;
import p070.InterfaceC6908;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6891 implements InterfaceC6908 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List f18342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f18343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set f18344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f18345;

    static {
        String strM8810 = AbstractC4344.m8810(AbstractC6347.m11931('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);
        List listM11931 = AbstractC6347.m11931(strM8810.concat("/Any"), strM8810.concat("/Nothing"), strM8810.concat("/Unit"), strM8810.concat("/Throwable"), strM8810.concat("/Number"), strM8810.concat("/Byte"), strM8810.concat("/Double"), strM8810.concat("/Float"), strM8810.concat("/Int"), strM8810.concat("/Long"), strM8810.concat("/Short"), strM8810.concat("/Boolean"), strM8810.concat("/Char"), strM8810.concat("/CharSequence"), strM8810.concat("/String"), strM8810.concat("/Comparable"), strM8810.concat("/Enum"), strM8810.concat("/Array"), strM8810.concat("/ByteArray"), strM8810.concat("/DoubleArray"), strM8810.concat("/FloatArray"), strM8810.concat("/IntArray"), strM8810.concat("/LongArray"), strM8810.concat("/ShortArray"), strM8810.concat("/BooleanArray"), strM8810.concat("/CharArray"), strM8810.concat("/Cloneable"), strM8810.concat("/Annotation"), strM8810.concat("/collections/Iterable"), strM8810.concat("/collections/MutableIterable"), strM8810.concat("/collections/Collection"), strM8810.concat("/collections/MutableCollection"), strM8810.concat("/collections/List"), strM8810.concat("/collections/MutableList"), strM8810.concat("/collections/Set"), strM8810.concat("/collections/MutableSet"), strM8810.concat("/collections/Map"), strM8810.concat("/collections/MutableMap"), strM8810.concat("/collections/Map.Entry"), strM8810.concat("/collections/MutableMap.MutableEntry"), strM8810.concat("/collections/Iterator"), strM8810.concat("/collections/MutableIterator"), strM8810.concat("/collections/ListIterator"), strM8810.concat("/collections/MutableListIterator"));
        f18342 = listM11931;
        C4342 c4342M8787 = AbstractC4344.m8787(listM11931);
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(c4342M8787, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        Iterator it = c4342M8787.iterator();
        while (true) {
            C4338 c4338 = (C4338) it;
            if (!c4338.f12919.hasNext()) {
                return;
            }
            C4341 c4341 = (C4341) c4338.next();
            linkedHashMap.put((String) c4341.f12923, Integer.valueOf(c4341.f12924));
        }
    }

    public AbstractC6891(String[] strArr, Set set, ArrayList arrayList) {
        strArr.getClass();
        set.getClass();
        this.f18345 = strArr;
        this.f18344 = set;
        this.f18343 = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // p070.InterfaceC6908
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067.AbstractC6891.getString(int):java.lang.String");
    }

    @Override // p070.InterfaceC6908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo12164(int i) {
        return this.f18344.contains(Integer.valueOf(i));
    }

    @Override // p070.InterfaceC6908
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo12165(int i) {
        return getString(i);
    }
}
