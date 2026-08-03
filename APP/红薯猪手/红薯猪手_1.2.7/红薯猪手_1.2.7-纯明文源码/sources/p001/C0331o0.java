package p001;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001.AbstractC0162c;

/* JADX INFO: renamed from: ۟.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0331o0 extends C0317n0 {
    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static final <T> T m1176(List<? extends T> list) {
        C0237h4.m1090("<this>", list);
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static String m1177(Iterable iterable, String str, String str2, String str3, AbstractC0162c.a aVar, int i) {
        CharSequence charSequenceValueOf;
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        int i2 = 0;
        int i3 = (i & 8) != 0 ? -1 : 0;
        String str4 = (i & 16) != 0 ? "..." : null;
        if ((i & 32) != 0) {
            aVar = null;
        }
        C0237h4.m1090("<this>", iterable);
        C0237h4.m1090("prefix", str2);
        C0237h4.m1090("postfix", str3);
        C0237h4.m1090("truncated", str4);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (i3 >= 0 && i2 > i3) {
                break;
            }
            if (aVar != null) {
                next = aVar.mo984(next);
            } else {
                if (!(next != null ? next instanceof CharSequence : true)) {
                    if (next instanceof Character) {
                        sb.append(((Character) next).charValue());
                    } else {
                        charSequenceValueOf = String.valueOf(next);
                        sb.append(charSequenceValueOf);
                    }
                }
            }
            charSequenceValueOf = (CharSequence) next;
            sb.append(charSequenceValueOf);
        }
        if (i3 >= 0 && i2 > i3) {
            sb.append((CharSequence) str4);
        }
        sb.append((CharSequence) str3);
        String string = sb.toString();
        C0237h4.m1089("toString(...)", string);
        return string;
    }
}
