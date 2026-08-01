package p227;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p228.C8036;
import p228.C8037;
import p228.InterfaceC8033;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8008 implements InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8033 f22113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22114;

    public /* synthetic */ C8008(InterfaceC8033 interfaceC8033, int i) {
        this.f22114 = i;
        this.f22113 = interfaceC8033;
    }

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ boolean mo13501(Object obj) {
        switch (this.f22114) {
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
    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8036 mo13502(Object obj, int i, int i2, C8397 c8397) {
        Uri uriFromFile;
        int i3 = this.f22114;
        InterfaceC8033 interfaceC8033 = this.f22113;
        switch (i3) {
            case 0:
                return interfaceC8033.mo13502(new C8037((URL) obj), i, i2, c8397);
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
                if (uriFromFile == null || !interfaceC8033.mo13501(uriFromFile)) {
                    return null;
                }
                return interfaceC8033.mo13502(uriFromFile, i, i2, c8397);
        }
    }
}
