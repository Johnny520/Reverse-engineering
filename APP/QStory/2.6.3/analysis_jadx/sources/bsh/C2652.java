package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652 implements InterfaceC2643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2652 f7937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2652 f7938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2652 f7939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2652 f7940;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2652 f7941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Types f7942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Context f7943;

    static {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = ClassGenerator$ClassNodeFilter$Types.FIELDS;
        f7940 = new C2652(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types);
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.METHODS;
        f7939 = new C2652(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.INSTANCE;
        f7938 = new C2652(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types);
        f7937 = new C2652(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context3 = ClassGenerator$ClassNodeFilter$Context.CLASSES;
        C2652 c2652 = new C2652();
        c2652.f7942 = ClassGenerator$ClassNodeFilter$Types.ALL;
        c2652.f7943 = classGenerator$ClassNodeFilter$Context3;
        f7941 = c2652;
    }

    public C2652(ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context, ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types) {
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.ALL;
        this.f7943 = classGenerator$ClassNodeFilter$Context;
        this.f7942 = classGenerator$ClassNodeFilter$Types;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5357(InterfaceC2619 interfaceC2619) {
        if ((interfaceC2619.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) interfaceC2619.jjtGetParent().jjtGetParent()).type == ClassGenerator$Type.INTERFACE) {
            return true;
        }
        if (interfaceC2619 instanceof BSHTypedVariableDeclaration) {
            return ((BSHTypedVariableDeclaration) interfaceC2619).modifiers.hasModifier("static");
        }
        if (interfaceC2619 instanceof BSHBlock) {
            return ((BSHBlock) interfaceC2619).isStatic;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5358(InterfaceC2619 interfaceC2619) {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = this.f7943;
        if (classGenerator$ClassNodeFilter$Context == ClassGenerator$ClassNodeFilter$Context.CLASSES) {
            return interfaceC2619 instanceof BSHClassDeclaration;
        }
        if (interfaceC2619 instanceof BSHClassDeclaration) {
            return false;
        }
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = this.f7942;
        if (classGenerator$ClassNodeFilter$Context == classGenerator$ClassNodeFilter$Context2) {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                return m5357(interfaceC2619);
            }
            if (interfaceC2619 instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) interfaceC2619).modifiers.hasModifier("static");
            }
        } else {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                if (interfaceC2619 instanceof BSHMethodDeclaration) {
                    return false;
                }
                return !m5357(interfaceC2619);
            }
            if (interfaceC2619 instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) interfaceC2619).modifiers.hasModifier("static");
            }
        }
        return false;
    }
}
