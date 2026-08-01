package p227;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p228.C8035;
import p228.C8036;
import p228.InterfaceC8032;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8007 implements InterfaceC8032 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8032 f22116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22117;

    public /* synthetic */ C8007(InterfaceC8032 interfaceC8032, int i) {
        this.f22117 = i;
        this.f22116 = interfaceC8032;
    }

    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo13473(Object obj) {
        switch (this.f22117) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p228.InterfaceC8032
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8035 mo13474(Object obj, int i, int i2, C8396 c8396) {
        Uri uriFromFile;
        int i3 = this.f22117;
        InterfaceC8032 interfaceC8032 = this.f22116;
        switch (i3) {
            case 0:
                return interfaceC8032.mo13474(new C8036((URL) obj), i, i2, c8396);
            default:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null || !interfaceC8032.mo13473(uriFromFile)) {
                    return null;
                }
                return interfaceC8032.mo13474(uriFromFile, i, i2, c8396);
        }
    }
}
