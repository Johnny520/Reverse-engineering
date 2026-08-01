package p083;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p086.InterfaceC7737;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7720 implements InterfaceC7737 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final List f18687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f18688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set f18689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f18690;

    static {
        String strM9369 = AbstractC5176.m9369(AbstractC7176.m12490('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);
        List listM12490 = AbstractC7176.m12490(strM9369.concat("/Any"), strM9369.concat("/Nothing"), strM9369.concat("/Unit"), strM9369.concat("/Throwable"), strM9369.concat("/Number"), strM9369.concat("/Byte"), strM9369.concat("/Double"), strM9369.concat("/Float"), strM9369.concat("/Int"), strM9369.concat("/Long"), strM9369.concat("/Short"), strM9369.concat("/Boolean"), strM9369.concat("/Char"), strM9369.concat("/CharSequence"), strM9369.concat("/String"), strM9369.concat("/Comparable"), strM9369.concat("/Enum"), strM9369.concat("/Array"), strM9369.concat("/ByteArray"), strM9369.concat("/DoubleArray"), strM9369.concat("/FloatArray"), strM9369.concat("/IntArray"), strM9369.concat("/LongArray"), strM9369.concat("/ShortArray"), strM9369.concat("/BooleanArray"), strM9369.concat("/CharArray"), strM9369.concat("/Cloneable"), strM9369.concat("/Annotation"), strM9369.concat("/collections/Iterable"), strM9369.concat("/collections/MutableIterable"), strM9369.concat("/collections/Collection"), strM9369.concat("/collections/MutableCollection"), strM9369.concat("/collections/List"), strM9369.concat("/collections/MutableList"), strM9369.concat("/collections/Set"), strM9369.concat("/collections/MutableSet"), strM9369.concat("/collections/Map"), strM9369.concat("/collections/MutableMap"), strM9369.concat("/collections/Map.Entry"), strM9369.concat("/collections/MutableMap.MutableEntry"), strM9369.concat("/collections/Iterator"), strM9369.concat("/collections/MutableIterator"), strM9369.concat("/collections/ListIterator"), strM9369.concat("/collections/MutableListIterator"));
        f18687 = listM12490;
        C5174 c5174M9346 = AbstractC5176.m9346(listM12490);
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(c5174M9346, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        Iterator it = c5174M9346.iterator();
        while (true) {
            C5170 c5170 = (C5170) it;
            if (!c5170.f13264.hasNext()) {
                return;
            }
            C5173 c5173 = (C5173) c5170.next();
            linkedHashMap.put((String) c5173.f13268, Integer.valueOf(c5173.f13269));
        }
    }

    public AbstractC7720(String[] strArr, Set set, ArrayList arrayList) {
        strArr.getClass();
        set.getClass();
        this.f18690 = strArr;
        this.f18689 = set;
        this.f18688 = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // p086.InterfaceC7737
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getString(int i) {
        String strReplace;
        JvmProtoBuf$StringTableTypes.Record record = (JvmProtoBuf$StringTableTypes.Record) this.f18688.get(i);
        if (record.hasString()) {
            strReplace = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List list = f18687;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            strReplace = (predefinedIndex < 0 || predefinedIndex >= size) ? this.f18690[i] : (String) list.get(record.getPredefinedIndex());
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            substringIndexList.getClass();
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            replaceCharList.getClass();
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        JvmProtoBuf$StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf$StringTableTypes.Record.Operation.NONE;
        }
        int i2 = AbstractC7721.f18691[operation.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                strReplace.getClass();
            } else {
                if (i2 != 3) {
                    C5043.m9170();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = AbstractC0900.m721(1, 1, strReplace);
                }
                strReplace = strReplace.replace('$', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }

    @Override // p086.InterfaceC7737
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo12723(int i) {
        return this.f18689.contains(Integer.valueOf(i));
    }

    @Override // p086.InterfaceC7737
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String mo12724(int i) {
        return getString(i);
    }
}
