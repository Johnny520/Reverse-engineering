package p152k3;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: k3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3949c {
    /* JADX INFO: renamed from: a */
    public static final void m15653a(Appendable appendable, Object obj, InterfaceC0184l interfaceC0184l) throws IOException {
        if (interfaceC0184l != null) {
            appendable.append((CharSequence) interfaceC0184l.mo27m(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Appendable m15654b(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) throws IOException {
        appendable.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            m15653a(appendable, obj, interfaceC0184l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: c */
    public static final String m15655c(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        return ((StringBuilder) m15654b(list, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC0184l)).toString();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m15656d(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m15655c(list, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: e */
    public static final Void m15657e(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: f */
    public static final void m15658f(String str) {
        throw new UnsupportedOperationException(str);
    }
}
