package p299ub;

import java.io.IOException;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: ub.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8635q {
    /* JADX INFO: renamed from: a */
    public static void m33234a(Appendable appendable, Object obj, InterfaceC0184l interfaceC0184l) throws IOException {
        appendable.getClass();
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
}
