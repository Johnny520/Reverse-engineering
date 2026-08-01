package lin.xposed.hook.javaplugin;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import p010.InterfaceC6159;
import p010.InterfaceC6161;
import p026.InterfaceC6294;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5553 implements InterfaceC6159, InterfaceC6294, InterfaceC6161 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15320;

    public /* synthetic */ C5553(int i) {
        this.f15320 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10808(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m10809(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10810(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m10811(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m10812(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m10813() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m10814(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10815(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* synthetic */ void m10816(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* synthetic */ void m10817(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static /* synthetic */ void m10818(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* synthetic */ void m10819(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m10820(StringBuilder sb, Object obj, int i, Object obj2) {
        sb.append(obj);
        sb.append(i);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m10821(StringBuilder sb, Object obj, int i, int i2) {
        sb.append(obj);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(" defined");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static /* synthetic */ void m10822(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m10823(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is bound to both ");
        sb.append(obj2);
        sb.append((Object) " and ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m10824(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m10825() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m10826(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10827(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m10828(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m10829(StringBuilder sb, Object obj, int i) {
        sb.append(obj);
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m10830(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m10831(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    @Override // p010.InterfaceC6159
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8631(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f15320) {
            case 0:
                OnMsgMenuCreateAPI.lambda$loadHook$2(methodHookParam);
                break;
            case 25:
                AbstractC3056.m6668(-3937697365054719399L);
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                AbstractC3056.m6668(-3937713569966327207L);
                obj.getClass();
                String str = (String) obj;
                Object obj2 = methodHookParam.args[1];
                AbstractC3056.m6668(-3937713411052537255L);
                obj2.getClass();
                if (!str.equals(AbstractC3056.m6668(-3937713196304172455L)) && str.equals(AbstractC3056.m6668(-3937595844912743847L))) {
                    AbstractC3056.m6668(-3937697472428901799L);
                    break;
                }
                break;
            case 26:
                methodHookParam.setResult(Boolean.TRUE);
                break;
            case 28:
                methodHookParam.setResult((Object) null);
                break;
            default:
                methodHookParam.setResult((Object) null);
                break;
        }
    }

    @Override // p010.InterfaceC6161
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo10832(XC_MethodHook.MethodHookParam methodHookParam) {
        return (String) methodHookParam.args[1];
    }
}
