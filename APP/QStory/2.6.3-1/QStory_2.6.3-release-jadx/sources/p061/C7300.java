package p061;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.text.AbstractC5971;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7300 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7300 f18096 = new C7300(AbstractC7176.m12490(C7291.f18079, C7301.f18099, C7298.f18093, C7297.f18092));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f18097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18098;

    public C7300(List list) {
        list.getClass();
        this.f18098 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C5519 c5519 = ((AbstractC7302) obj).f18102;
            Object arrayList = linkedHashMap.get(c5519);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c5519, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f18097 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7299 m12550(String str, C5519 c5519) {
        Integer numValueOf;
        c5519.getClass();
        str.getClass();
        List<AbstractC7302> list = (List) this.f18097.get(c5519);
        if (list != null) {
            for (AbstractC7302 abstractC7302 : list) {
                if (AbstractC5971.m10698(str, abstractC7302.f18101, false)) {
                    String strSubstring = str.substring(abstractC7302.f18101.length());
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        if (numValueOf == null) {
                            return new C7299(abstractC7302, numValueOf.intValue());
                        }
                    } else {
                        int length = strSubstring.length();
                        int i = 0;
                        for (int i2 = 0; i2 < length; i2++) {
                            int iCharAt = strSubstring.charAt(i2) - '0';
                            if (iCharAt < 0 || iCharAt >= 10) {
                                numValueOf = null;
                                break;
                            }
                            i = (i * 10) + iCharAt;
                        }
                        numValueOf = Integer.valueOf(i);
                        if (numValueOf == null) {
                        }
                    }
                }
            }
        }
        return null;
    }
}
