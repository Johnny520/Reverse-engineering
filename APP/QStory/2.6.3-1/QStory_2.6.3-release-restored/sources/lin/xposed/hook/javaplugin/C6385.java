package lin.xposed.hook.javaplugin;

import de.robv.android.xposed.XC_MethodHook;
import p026.InterfaceC7019;
import p026.InterfaceC7021;
import p042.InterfaceC7141;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6385 implements InterfaceC7019, InterfaceC7141, InterfaceC7021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15665;

    public /* synthetic */ C6385(int i) {
        this.f15665 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m11424(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11425(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11426(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11427(int i, String str) {
        throw new IllegalArgumentException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11428(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11429() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m11430(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m11431(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static /* synthetic */ void m11432(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static /* synthetic */ void m11433(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static /* synthetic */ void m11434(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static /* synthetic */ void m11435(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m11436(StringBuilder sb, Object obj, int i, Object obj2) {
        sb.append(obj);
        sb.append(i);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m11437(StringBuilder sb, Object obj, int i, int i2) {
        sb.append(obj);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(" defined");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static /* synthetic */ void m11438(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static /* synthetic */ void m11439(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " is bound to both ");
        sb.append(obj2);
        sb.append((Object) " and ");
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m11440(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m11441() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m11442(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m11443(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m11444(String str, Object obj, Throwable th) {
        throw new IllegalStateException(str + obj, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m11445(StringBuilder sb, Object obj, int i) {
        sb.append(obj);
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m11446(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m11447(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4 + obj5);
    }

    @Override // p026.InterfaceC7019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo9180(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f15665) {
            case 0:
                OnMsgMenuCreateAPI.lambda$loadHook$2(methodHookParam);
                break;
            case 25:
                "param";
                methodHookParam.getClass();
                Object obj = methodHookParam.args[0];
                "null cannot be cast to non-null type kotlin.String";
                obj.getClass();
                String str = (String) obj;
                Object obj2 = methodHookParam.args[1];
                "null cannot be cast to non-null type kotlin.ByteArray";
                obj2.getClass();
                if (!str.equals("trpc.msg.register_proxy.RegisterProxy.InfoSyncPush") && str.equals("trpc.msg.olpush.OlPushService.MsgPush")) {
                    "buffer";
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

    @Override // p026.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object mo11448(XC_MethodHook.MethodHookParam methodHookParam) {
        return (String) methodHookParam.args[1];
    }
}
