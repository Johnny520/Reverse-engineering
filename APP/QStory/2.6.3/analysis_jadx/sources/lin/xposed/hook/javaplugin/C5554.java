package lin.xposed.hook.javaplugin;

import de.robv.android.xposed.XC_MethodHook;
import p010.InterfaceC6190;
import p010.InterfaceC6192;
import p026.InterfaceC6312;
import p287.AbstractC8405;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5554 implements InterfaceC6190, InterfaceC6312, InterfaceC6192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15320;

    public /* synthetic */ C5554(int i) {
        this.f15320 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10865(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m10866(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10867(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m10868(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m10869(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m10870() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m10871(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10872(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* synthetic */ void m10873(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* synthetic */ void m10874(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static /* synthetic */ void m10875(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* synthetic */ void m10876(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m10877(StringBuilder sb, Object obj, int i, Object obj2) {
        sb.append(obj);
        sb.append(i);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m10878(StringBuilder sb, Object obj, int i, int i2) {
        sb.append(obj);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(" defined");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static /* synthetic */ void m10879(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m10880(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is bound to both ");
        sb.append(obj2);
        sb.append((Object) " and ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m10881(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m10882() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m10883(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10884(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m10885(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m10886(StringBuilder sb, Object obj, int i) {
        sb.append(obj);
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m10887(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m10888(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    @Override // p010.InterfaceC6190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8621(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f15320) {
            case 0:
                OnMsgMenuCreateAPI.lambda$loadHook$2(methodHookParam);
                break;
            case 25:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                AbstractC8405.m13972(1559);
                obj.getClass();
                String str = (String) obj;
                Object obj2 = methodHookParam.args[1];
                AbstractC8405.m13972(1560);
                obj2.getClass();
                if (!str.equals(AbstractC8405.m13972(1561)) && str.equals(AbstractC8405.m13972(311))) {
                    AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
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

    @Override // p010.InterfaceC6192
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo10889(XC_MethodHook.MethodHookParam methodHookParam) {
        return (String) methodHookParam.args[1];
    }
}
