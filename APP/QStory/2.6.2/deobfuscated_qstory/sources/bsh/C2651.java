package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2651 implements InterfaceC2642 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2651 f7935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2651 f7936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2651 f7937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2651 f7938;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2651 f7939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Types f7940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Context f7941;

    static {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = ClassGenerator$ClassNodeFilter$Types.FIELDS;
        f7938 = new C2651(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types);
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.METHODS;
        f7937 = new C2651(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.INSTANCE;
        f7936 = new C2651(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types);
        f7935 = new C2651(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context3 = ClassGenerator$ClassNodeFilter$Context.CLASSES;
        C2651 c2651 = new C2651();
        c2651.f7940 = ClassGenerator$ClassNodeFilter$Types.ALL;
        c2651.f7941 = classGenerator$ClassNodeFilter$Context3;
        f7939 = c2651;
    }

    public C2651(ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context, ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types) {
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.ALL;
        this.f7941 = classGenerator$ClassNodeFilter$Context;
        this.f7940 = classGenerator$ClassNodeFilter$Types;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5312(InterfaceC2618 interfaceC2618) {
        if ((interfaceC2618.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) interfaceC2618.jjtGetParent().jjtGetParent()).type == ClassGenerator$Type.INTERFACE) {
            return true;
        }
        if (interfaceC2618 instanceof BSHTypedVariableDeclaration) {
            return ((BSHTypedVariableDeclaration) interfaceC2618).modifiers.hasModifier("static");
        }
        if (interfaceC2618 instanceof BSHBlock) {
            return ((BSHBlock) interfaceC2618).isStatic;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5313(InterfaceC2618 interfaceC2618) {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = this.f7941;
        if (classGenerator$ClassNodeFilter$Context == ClassGenerator$ClassNodeFilter$Context.CLASSES) {
            return interfaceC2618 instanceof BSHClassDeclaration;
        }
        if (interfaceC2618 instanceof BSHClassDeclaration) {
            return false;
        }
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = this.f7940;
        if (classGenerator$ClassNodeFilter$Context == classGenerator$ClassNodeFilter$Context2) {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                return m5312(interfaceC2618);
            }
            if (interfaceC2618 instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) interfaceC2618).modifiers.hasModifier("static");
            }
        } else {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                if (interfaceC2618 instanceof BSHMethodDeclaration) {
                    return false;
                }
                return !m5312(interfaceC2618);
            }
            if (interfaceC2618 instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) interfaceC2618).modifiers.hasModifier("static");
            }
        }
        return false;
    }
}
