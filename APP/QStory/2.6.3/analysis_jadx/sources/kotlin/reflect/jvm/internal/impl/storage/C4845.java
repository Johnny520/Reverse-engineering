package kotlin.reflect.jvm.internal.impl.storage;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0064;
import androidx.core.view.C2242;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.AbstractC5144;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4845 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4840 f14123;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f14124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f14125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4841 f14126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4842 f14127;

    static {
        String canonicalName = C4845.class.getCanonicalName();
        canonicalName.getClass();
        int iM10169 = AbstractC5144.m10169(0, 6, canonicalName, ".");
        f14124 = iM10169 == -1 ? "" : canonicalName.substring(0, iM10169);
        f14123 = new C4840("NO_LOCKS", C4841.f14117);
    }

    public C4845(String str) {
        this(str, new C2242(new ReentrantLock(), 24));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m9576(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f14124)) {
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
    public static /* synthetic */ void m9577(int r13) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.C4845.m9577(int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC0053.m151(sb, this.f14125, ")");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C0064 mo9573(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : AbstractC0053.m153(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        m9576(assertionError);
        throw assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4848 m9578(InterfaceC6558 interfaceC6558) {
        return new C4848(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4837 m9579(InterfaceC6558 interfaceC6558) {
        return new C4837(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC6558, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4847 m9580(InterfaceC6543 interfaceC6543) {
        return new C4847(this, interfaceC6543);
    }

    public C4845(String str, InterfaceC4842 interfaceC4842) {
        C4841 c4841 = C4841.f14116;
        this.f14127 = interfaceC4842;
        this.f14126 = c4841;
        this.f14125 = str;
    }
}
