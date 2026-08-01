package kotlin.reflect.jvm.internal.impl.storage;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import androidx.core.view.C2242;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.AbstractC5143;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4844 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4839 f14119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f14120;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14121;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4840 f14122;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4841 f14123;

    static {
        String canonicalName = C4844.class.getCanonicalName();
        canonicalName.getClass();
        int iM10166 = AbstractC5143.m10166(0, 6, canonicalName, ".");
        f14120 = iM10166 == -1 ? "" : canonicalName.substring(0, iM10166);
        f14119 = new C4839("NO_LOCKS", C4840.f14113);
    }

    public C4844(String str) {
        this(str, new C2242(new ReentrantLock(), 24));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m9586(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f14120)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9587(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.C4844.m9587(int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC0053.m146(sb, this.f14121, ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C0064 mo9583(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : AbstractC0053.m153(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        m9586(assertionError);
        throw assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 m9588(InterfaceC6557 interfaceC6557) {
        return new C4847(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4836 m9589(InterfaceC6557 interfaceC6557) {
        return new C4836(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6557, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4846 m9590(InterfaceC6542 interfaceC6542) {
        return new C4846(this, interfaceC6542);
    }

    public C4844(String str, InterfaceC4841 interfaceC4841) {
        C4840 c4840 = C4840.f14112;
        this.f14123 = interfaceC4841;
        this.f14122 = c4840;
        this.f14121 = str;
    }
}
