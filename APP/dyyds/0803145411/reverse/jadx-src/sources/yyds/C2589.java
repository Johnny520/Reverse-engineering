package yyds;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: renamed from: yyds.ᲈᛱᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2589 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12768;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0894 f12769;

    public /* synthetic */ C2589(InterfaceC0894 interfaceC0894, int i) {
        this.f12768 = i;
        this.f12769 = interfaceC0894;
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
    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        Uri uriFromFile;
        int i3 = this.f12768;
        InterfaceC0894 interfaceC0894 = this.f12769;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null || !interfaceC0894.mo941(uriFromFile)) {
                    return null;
                }
                return interfaceC0894.mo940(uriFromFile, i, i2, c0822);
            default:
                return interfaceC0894.mo940(new C0714((URL) obj), i, i2, c0822);
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        switch (this.f12768) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
