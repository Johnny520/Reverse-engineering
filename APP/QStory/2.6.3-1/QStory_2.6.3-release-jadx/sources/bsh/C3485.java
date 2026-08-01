package bsh;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3485 implements InterfaceC3476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3485 f8282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3485 f8283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3485 f8284;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3485 f8285;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3485 f8286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Types f8287;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ClassGenerator$ClassNodeFilter$Context f8288;

    static {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = ClassGenerator$ClassNodeFilter$Types.FIELDS;
        f8285 = new C3485(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types);
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.METHODS;
        f8284 = new C3485(classGenerator$ClassNodeFilter$Context, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.INSTANCE;
        f8283 = new C3485(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types);
        f8282 = new C3485(classGenerator$ClassNodeFilter$Context2, classGenerator$ClassNodeFilter$Types2);
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context3 = ClassGenerator$ClassNodeFilter$Context.CLASSES;
        C3485 c3485 = new C3485();
        c3485.f8287 = ClassGenerator$ClassNodeFilter$Types.ALL;
        c3485.f8288 = classGenerator$ClassNodeFilter$Context3;
        f8286 = c3485;
    }

    public C3485(ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context, ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types) {
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types2 = ClassGenerator$ClassNodeFilter$Types.ALL;
        this.f8288 = classGenerator$ClassNodeFilter$Context;
        this.f8287 = classGenerator$ClassNodeFilter$Types;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5917(InterfaceC3452 interfaceC3452) {
        if ((interfaceC3452.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) interfaceC3452.jjtGetParent().jjtGetParent()).type == ClassGenerator$Type.INTERFACE) {
            return true;
        }
        if (interfaceC3452 instanceof BSHTypedVariableDeclaration) {
            return ((BSHTypedVariableDeclaration) interfaceC3452).modifiers.hasModifier("static");
        }
        if (interfaceC3452 instanceof BSHBlock) {
            return ((BSHBlock) interfaceC3452).isStatic;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m5918(InterfaceC3452 interfaceC3452) {
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context = this.f8288;
        if (classGenerator$ClassNodeFilter$Context == ClassGenerator$ClassNodeFilter$Context.CLASSES) {
            return interfaceC3452 instanceof BSHClassDeclaration;
        }
        if (interfaceC3452 instanceof BSHClassDeclaration) {
            return false;
        }
        ClassGenerator$ClassNodeFilter$Context classGenerator$ClassNodeFilter$Context2 = ClassGenerator$ClassNodeFilter$Context.STATIC;
        ClassGenerator$ClassNodeFilter$Types classGenerator$ClassNodeFilter$Types = this.f8287;
        if (classGenerator$ClassNodeFilter$Context == classGenerator$ClassNodeFilter$Context2) {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                return m5917(interfaceC3452);
            }
            if (interfaceC3452 instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) interfaceC3452).modifiers.hasModifier("static");
            }
        } else {
            if (classGenerator$ClassNodeFilter$Types != ClassGenerator$ClassNodeFilter$Types.METHODS) {
                if (interfaceC3452 instanceof BSHMethodDeclaration) {
                    return false;
                }
                return !m5917(interfaceC3452);
            }
            if (interfaceC3452 instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) interfaceC3452).modifiers.hasModifier("static");
            }
        }
        return false;
    }
}
