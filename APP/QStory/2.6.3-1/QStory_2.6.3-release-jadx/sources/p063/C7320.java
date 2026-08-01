package p063;

import androidx.activity.AbstractC0900;
import java.util.Arrays;
import java.util.Map;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世子兰楪哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7320 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C7320 f18128 = new C7320();

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            string.getClass();
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            string.getClass();
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            string.getClass();
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            string.getClass();
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            string.getClass();
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            string.getClass();
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            string.getClass();
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            string.getClass();
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            string.getClass();
        } else {
            string = value.toString();
        }
        return AbstractC0900.m724(SignatureVisitor.INSTANCEOF, str, string);
    }
}
