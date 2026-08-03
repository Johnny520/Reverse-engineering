.class public Lbsh/org/objectweb/asm/ClassWriter;
.super Lbsh/org/objectweb/asm/ClassVisitor;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final COMPUTE_FRAMES:I = 0x2

.field public static final COMPUTE_MAXS:I = 0x1


# instance fields
.field private accessFlags:I

.field private compute:I

.field private debugExtension:Lbsh/org/objectweb/asm/ByteVector;

.field private enclosingClassIndex:I

.field private enclosingMethodIndex:I

.field private firstAttribute:Lbsh/org/objectweb/asm/Attribute;

.field private firstField:Lbsh/org/objectweb/asm/FieldWriter;

.field private firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

.field private innerClasses:Lbsh/org/objectweb/asm/ByteVector;

.field private interfaceCount:I

.field private interfaces:[I

.field private lastField:Lbsh/org/objectweb/asm/FieldWriter;

.field private lastMethod:Lbsh/org/objectweb/asm/MethodWriter;

.field private numberOfInnerClasses:I

.field private signatureIndex:I

.field private sourceFileIndex:I

.field private superClass:I

.field private final symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

.field private thisClass:I

.field private version:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/high16 v0, 0x60000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lbsh/org/objectweb/asm/ClassVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lbsh/org/objectweb/asm/SymbolTable;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lbsh/org/objectweb/asm/SymbolTable;-><init>(Lbsh/org/objectweb/asm/ClassWriter;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 12
    .line 13
    and-int/lit8 v0, p1, 0x2

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 v0, 0x1

    .line 22
    and-int/2addr p1, v0

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iput v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 30
    .line 31
    return-void
.end method

.method private getAttributePrototypes()[Lbsh/org/objectweb/asm/Attribute;
    .locals 2

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/Attribute$Set;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/org/objectweb/asm/Attribute$Set;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/Attribute$Set;->addAttributes(Lbsh/org/objectweb/asm/Attribute;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 12
    .line 13
    :goto_0
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/FieldWriter;->collectAttributePrototypes(Lbsh/org/objectweb/asm/Attribute$Set;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 19
    .line 20
    check-cast v1, Lbsh/org/objectweb/asm/FieldWriter;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 24
    .line 25
    :goto_1
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/MethodWriter;->collectAttributePrototypes(Lbsh/org/objectweb/asm/Attribute$Set;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 31
    .line 32
    check-cast v1, Lbsh/org/objectweb/asm/MethodWriter;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/Attribute$Set;->toArray()[Lbsh/org/objectweb/asm/Attribute;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method private replaceAsmInstructions([BZ)[B
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/org/objectweb/asm/ClassWriter;->getAttributePrototypes()[Lbsh/org/objectweb/asm/Attribute;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 6
    .line 7
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 8
    .line 9
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 10
    .line 11
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 12
    .line 13
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/org/objectweb/asm/ClassWriter;->toByteArray()[B

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method


# virtual methods
.method public getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x2e

    .line 10
    .line 11
    const/16 v2, 0x2f

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-static {v3, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    :try_start_1
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    :goto_0
    const-string p1, "java/lang/Object"

    .line 77
    .line 78
    return-object p1

    .line 79
    :catch_0
    move-exception p1

    .line 80
    new-instance v0, Ljava/lang/TypeNotPresentException;

    .line 81
    .line 82
    invoke-direct {v0, p2, p1}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :catch_1
    move-exception p2

    .line 87
    new-instance v0, Ljava/lang/TypeNotPresentException;

    .line 88
    .line 89
    invoke-direct {v0, p1, p2}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw v0
.end method

.method public newClass(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newConst(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :goto_0
    move-object v1, p0

    .line 7
    move v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move v6, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/ClassWriter;->newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 6

    .line 20
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    move-result-object p1

    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    return p1
.end method

.method public varargs newInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lbsh/org/objectweb/asm/Handle;[Ljava/lang/Object;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newMethodType(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantMethodType(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newModule(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newNameType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public newPackage(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantPackage(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    return p1
.end method

.method public newUTF8(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public toByteArray()[B
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->interfaceCount:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    mul-int/2addr v1, v2

    .line 7
    add-int/lit8 v1, v1, 0x18

    .line 8
    .line 9
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    :goto_0
    if-eqz v3, :cond_0

    .line 13
    .line 14
    add-int/lit8 v5, v5, 0x1

    .line 15
    .line 16
    invoke-virtual {v3}, Lbsh/org/objectweb/asm/FieldWriter;->computeFieldInfoSize()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    add-int/2addr v1, v6

    .line 21
    iget-object v3, v3, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 22
    .line 23
    check-cast v3, Lbsh/org/objectweb/asm/FieldWriter;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    :goto_1
    if-eqz v3, :cond_1

    .line 30
    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    invoke-virtual {v3}, Lbsh/org/objectweb/asm/MethodWriter;->computeMethodInfoSize()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    add-int/2addr v1, v7

    .line 38
    iget-object v3, v3, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 39
    .line 40
    check-cast v3, Lbsh/org/objectweb/asm/MethodWriter;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 44
    .line 45
    const-string v7, "InnerClasses"

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    add-int/2addr v1, v3

    .line 54
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 55
    .line 56
    invoke-virtual {v3, v7}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/4 v3, 0x0

    .line 62
    :goto_2
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingClassIndex:I

    .line 63
    .line 64
    const-string v9, "EnclosingMethod"

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0xa

    .line 71
    .line 72
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 73
    .line 74
    invoke-virtual {v8, v9}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    :cond_3
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 78
    .line 79
    const/16 v10, 0x1000

    .line 80
    .line 81
    and-int/2addr v8, v10

    .line 82
    const-string v11, "Synthetic"

    .line 83
    .line 84
    const/16 v12, 0x31

    .line 85
    .line 86
    const v13, 0xffff

    .line 87
    .line 88
    .line 89
    if-eqz v8, :cond_4

    .line 90
    .line 91
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->version:I

    .line 92
    .line 93
    and-int/2addr v8, v13

    .line 94
    if-ge v8, v12, :cond_4

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x6

    .line 99
    .line 100
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 101
    .line 102
    invoke-virtual {v8, v11}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_4
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->signatureIndex:I

    .line 106
    .line 107
    const-string v14, "Signature"

    .line 108
    .line 109
    if-eqz v8, :cond_5

    .line 110
    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x8

    .line 114
    .line 115
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 116
    .line 117
    invoke-virtual {v8, v14}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_5
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->sourceFileIndex:I

    .line 121
    .line 122
    const-string v15, "SourceFile"

    .line 123
    .line 124
    if-eqz v8, :cond_6

    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x8

    .line 129
    .line 130
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 131
    .line 132
    invoke-virtual {v8, v15}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_6
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->debugExtension:Lbsh/org/objectweb/asm/ByteVector;

    .line 136
    .line 137
    move/from16 v16, v2

    .line 138
    .line 139
    const-string v2, "SourceDebugExtension"

    .line 140
    .line 141
    if-eqz v8, :cond_7

    .line 142
    .line 143
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    iget v8, v8, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 146
    .line 147
    add-int/lit8 v8, v8, 0x6

    .line 148
    .line 149
    add-int/2addr v1, v8

    .line 150
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 151
    .line 152
    invoke-virtual {v8, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_7
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 156
    .line 157
    const/high16 v17, 0x20000

    .line 158
    .line 159
    and-int v8, v8, v17

    .line 160
    .line 161
    const-string v10, "Deprecated"

    .line 162
    .line 163
    if-eqz v8, :cond_8

    .line 164
    .line 165
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    add-int/lit8 v1, v1, 0x6

    .line 168
    .line 169
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 170
    .line 171
    invoke-virtual {v8, v10}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    :cond_8
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 175
    .line 176
    invoke-virtual {v8}, Lbsh/org/objectweb/asm/SymbolTable;->computeBootstrapMethodsSize()I

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-lez v8, :cond_9

    .line 181
    .line 182
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 185
    .line 186
    invoke-virtual {v8}, Lbsh/org/objectweb/asm/SymbolTable;->computeBootstrapMethodsSize()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    add-int/2addr v1, v8

    .line 191
    :cond_9
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 192
    .line 193
    if-eqz v8, :cond_a

    .line 194
    .line 195
    invoke-virtual {v8}, Lbsh/org/objectweb/asm/Attribute;->getAttributeCount()I

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    add-int/2addr v3, v8

    .line 200
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 201
    .line 202
    iget-object v4, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 203
    .line 204
    invoke-virtual {v8, v4}, Lbsh/org/objectweb/asm/Attribute;->computeAttributesSize(Lbsh/org/objectweb/asm/SymbolTable;)I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    add-int/2addr v1, v4

    .line 209
    :cond_a
    iget-object v4, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 210
    .line 211
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/SymbolTable;->getConstantPoolLength()I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    add-int/2addr v1, v4

    .line 216
    iget-object v4, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 217
    .line 218
    invoke-virtual {v4}, Lbsh/org/objectweb/asm/SymbolTable;->getConstantPoolCount()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-gt v4, v13, :cond_18

    .line 223
    .line 224
    new-instance v4, Lbsh/org/objectweb/asm/ByteVector;

    .line 225
    .line 226
    invoke-direct {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;-><init>(I)V

    .line 227
    .line 228
    .line 229
    const v1, -0x35014542    # -8346975.0f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->version:I

    .line 237
    .line 238
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 239
    .line 240
    .line 241
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 242
    .line 243
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/SymbolTable;->putConstantPool(Lbsh/org/objectweb/asm/ByteVector;)V

    .line 244
    .line 245
    .line 246
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->version:I

    .line 247
    .line 248
    and-int/2addr v1, v13

    .line 249
    if-ge v1, v12, :cond_b

    .line 250
    .line 251
    const/16 v1, 0x1000

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_b
    const/4 v1, 0x0

    .line 255
    :goto_3
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 256
    .line 257
    not-int v1, v1

    .line 258
    and-int/2addr v1, v8

    .line 259
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->thisClass:I

    .line 264
    .line 265
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->superClass:I

    .line 270
    .line 271
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 272
    .line 273
    .line 274
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->interfaceCount:I

    .line 275
    .line 276
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 277
    .line 278
    .line 279
    const/4 v1, 0x0

    .line 280
    :goto_4
    iget v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->interfaceCount:I

    .line 281
    .line 282
    if-ge v1, v8, :cond_c

    .line 283
    .line 284
    iget-object v8, v0, Lbsh/org/objectweb/asm/ClassWriter;->interfaces:[I

    .line 285
    .line 286
    aget v8, v8, v1

    .line 287
    .line 288
    invoke-virtual {v4, v8}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 289
    .line 290
    .line 291
    add-int/lit8 v1, v1, 0x1

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_c
    invoke-virtual {v4, v5}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 295
    .line 296
    .line 297
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 298
    .line 299
    :goto_5
    if-eqz v1, :cond_d

    .line 300
    .line 301
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/FieldWriter;->putFieldInfo(Lbsh/org/objectweb/asm/ByteVector;)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v1, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 305
    .line 306
    check-cast v1, Lbsh/org/objectweb/asm/FieldWriter;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_d
    invoke-virtual {v4, v6}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 310
    .line 311
    .line 312
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 313
    .line 314
    const/4 v5, 0x0

    .line 315
    const/4 v6, 0x0

    .line 316
    :goto_6
    if-eqz v1, :cond_e

    .line 317
    .line 318
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/MethodWriter;->hasFrames()Z

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    or-int/2addr v5, v8

    .line 323
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/MethodWriter;->hasAsmInstructions()Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    or-int/2addr v6, v8

    .line 328
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/MethodWriter;->putMethodInfo(Lbsh/org/objectweb/asm/ByteVector;)V

    .line 329
    .line 330
    .line 331
    iget-object v1, v1, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 332
    .line 333
    check-cast v1, Lbsh/org/objectweb/asm/MethodWriter;

    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_e
    invoke-virtual {v4, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 337
    .line 338
    .line 339
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 340
    .line 341
    if-eqz v1, :cond_f

    .line 342
    .line 343
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 344
    .line 345
    invoke-virtual {v1, v7}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 354
    .line 355
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 356
    .line 357
    add-int/lit8 v3, v3, 0x2

    .line 358
    .line 359
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    iget v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->numberOfInnerClasses:I

    .line 364
    .line 365
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 370
    .line 371
    iget-object v7, v3, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 372
    .line 373
    iget v3, v3, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 374
    .line 375
    const/4 v8, 0x0

    .line 376
    invoke-virtual {v1, v7, v8, v3}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 377
    .line 378
    .line 379
    :cond_f
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingClassIndex:I

    .line 380
    .line 381
    if-eqz v1, :cond_10

    .line 382
    .line 383
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 384
    .line 385
    invoke-virtual {v1, v9}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    const/4 v3, 0x4

    .line 394
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iget v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingClassIndex:I

    .line 399
    .line 400
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingMethodIndex:I

    .line 405
    .line 406
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 407
    .line 408
    .line 409
    :cond_10
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 410
    .line 411
    const/16 v3, 0x1000

    .line 412
    .line 413
    and-int/2addr v1, v3

    .line 414
    if-eqz v1, :cond_11

    .line 415
    .line 416
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->version:I

    .line 417
    .line 418
    and-int/2addr v1, v13

    .line 419
    if-ge v1, v12, :cond_11

    .line 420
    .line 421
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 422
    .line 423
    invoke-virtual {v1, v11}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    const/4 v8, 0x0

    .line 432
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 433
    .line 434
    .line 435
    :cond_11
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->signatureIndex:I

    .line 436
    .line 437
    if-eqz v1, :cond_12

    .line 438
    .line 439
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 440
    .line 441
    invoke-virtual {v1, v14}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    move/from16 v3, v16

    .line 450
    .line 451
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    iget v7, v0, Lbsh/org/objectweb/asm/ClassWriter;->signatureIndex:I

    .line 456
    .line 457
    invoke-virtual {v1, v7}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 458
    .line 459
    .line 460
    goto :goto_7

    .line 461
    :cond_12
    move/from16 v3, v16

    .line 462
    .line 463
    :goto_7
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->sourceFileIndex:I

    .line 464
    .line 465
    if-eqz v1, :cond_13

    .line 466
    .line 467
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 468
    .line 469
    invoke-virtual {v1, v15}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    iget v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->sourceFileIndex:I

    .line 482
    .line 483
    invoke-virtual {v1, v3}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 484
    .line 485
    .line 486
    :cond_13
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->debugExtension:Lbsh/org/objectweb/asm/ByteVector;

    .line 487
    .line 488
    if-eqz v1, :cond_14

    .line 489
    .line 490
    iget v1, v1, Lbsh/org/objectweb/asm/ByteVector;->length:I

    .line 491
    .line 492
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 493
    .line 494
    invoke-virtual {v3, v2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    invoke-virtual {v4, v2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    iget-object v3, v0, Lbsh/org/objectweb/asm/ClassWriter;->debugExtension:Lbsh/org/objectweb/asm/ByteVector;

    .line 507
    .line 508
    iget-object v3, v3, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 509
    .line 510
    const/4 v8, 0x0

    .line 511
    invoke-virtual {v2, v3, v8, v1}, Lbsh/org/objectweb/asm/ByteVector;->putByteArray([BII)Lbsh/org/objectweb/asm/ByteVector;

    .line 512
    .line 513
    .line 514
    goto :goto_8

    .line 515
    :cond_14
    const/4 v8, 0x0

    .line 516
    :goto_8
    iget v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 517
    .line 518
    and-int v1, v1, v17

    .line 519
    .line 520
    if-eqz v1, :cond_15

    .line 521
    .line 522
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 523
    .line 524
    invoke-virtual {v1, v10}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual {v4, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v1, v8}, Lbsh/org/objectweb/asm/ByteVector;->putInt(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 533
    .line 534
    .line 535
    :cond_15
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 536
    .line 537
    invoke-virtual {v1, v4}, Lbsh/org/objectweb/asm/SymbolTable;->putBootstrapMethods(Lbsh/org/objectweb/asm/ByteVector;)V

    .line 538
    .line 539
    .line 540
    iget-object v1, v0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 541
    .line 542
    if-eqz v1, :cond_16

    .line 543
    .line 544
    iget-object v2, v0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 545
    .line 546
    invoke-virtual {v1, v2, v4}, Lbsh/org/objectweb/asm/Attribute;->putAttributes(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/ByteVector;)V

    .line 547
    .line 548
    .line 549
    :cond_16
    iget-object v1, v4, Lbsh/org/objectweb/asm/ByteVector;->data:[B

    .line 550
    .line 551
    if-eqz v6, :cond_17

    .line 552
    .line 553
    invoke-direct {v0, v1, v5}, Lbsh/org/objectweb/asm/ClassWriter;->replaceAsmInstructions([BZ)[B

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    :cond_17
    return-object v1

    .line 558
    :cond_18
    const-string v1, "Class file too large!"

    .line 559
    .line 560
    invoke-static {v1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    const/4 v1, 0x0

    .line 564
    return-object v1
.end method

.method public final visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->version:I

    .line 2
    .line 3
    iput p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->accessFlags:I

    .line 4
    .line 5
    iget-object p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 6
    .line 7
    const v0, 0xffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, v0

    .line 11
    invoke-virtual {p2, p1, p3}, Lbsh/org/objectweb/asm/SymbolTable;->setMajorVersionAndClassName(ILjava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->thisClass:I

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 20
    .line 21
    invoke-virtual {p2, p4}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->signatureIndex:I

    .line 26
    .line 27
    :cond_0
    const/4 p2, 0x0

    .line 28
    if-nez p5, :cond_1

    .line 29
    .line 30
    move p3, p2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 33
    .line 34
    invoke-virtual {p3, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    iget p3, p3, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 39
    .line 40
    :goto_0
    iput p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->superClass:I

    .line 41
    .line 42
    if-eqz p6, :cond_2

    .line 43
    .line 44
    array-length p3, p6

    .line 45
    if-lez p3, :cond_2

    .line 46
    .line 47
    array-length p3, p6

    .line 48
    iput p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->interfaceCount:I

    .line 49
    .line 50
    new-array p3, p3, [I

    .line 51
    .line 52
    iput-object p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->interfaces:[I

    .line 53
    .line 54
    :goto_1
    iget p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->interfaceCount:I

    .line 55
    .line 56
    if-ge p2, p3, :cond_2

    .line 57
    .line 58
    iget-object p3, p0, Lbsh/org/objectweb/asm/ClassWriter;->interfaces:[I

    .line 59
    .line 60
    iget-object p4, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 61
    .line 62
    aget-object p5, p6, p2

    .line 63
    .line 64
    invoke-virtual {p4, p5}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    iget p4, p4, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 69
    .line 70
    aput p4, p3, p2

    .line 71
    .line 72
    add-int/lit8 p2, p2, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iget p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 76
    .line 77
    const/4 p3, 0x1

    .line 78
    if-ne p2, p3, :cond_3

    .line 79
    .line 80
    const/16 p2, 0x33

    .line 81
    .line 82
    if-lt p1, p2, :cond_3

    .line 83
    .line 84
    const/4 p1, 0x2

    .line 85
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 86
    .line 87
    :cond_3
    return-void
.end method

.method public final visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lbsh/org/objectweb/asm/Attribute;->nextAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstAttribute:Lbsh/org/objectweb/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public final visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public final visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbsh/org/objectweb/asm/FieldVisitor;
    .locals 7

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/FieldWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 4
    .line 5
    move v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-direct/range {v0 .. v6}, Lbsh/org/objectweb/asm/FieldWriter;-><init>(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 21
    .line 22
    iput-object v0, p1, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 23
    .line 24
    :goto_0
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastField:Lbsh/org/objectweb/asm/FieldWriter;

    .line 25
    .line 26
    return-object v0
.end method

.method public final visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/org/objectweb/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget v0, p1, Lbsh/org/objectweb/asm/Symbol;->info:I

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->numberOfInnerClasses:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->numberOfInnerClasses:I

    .line 27
    .line 28
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    move p2, v1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v2, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 43
    .line 44
    invoke-virtual {v2, p2}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget p2, p2, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v0, p2}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 54
    .line 55
    if-nez p3, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 59
    .line 60
    invoke-virtual {v0, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    :goto_1
    invoke-virtual {p2, v1}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->innerClasses:Lbsh/org/objectweb/asm/ByteVector;

    .line 68
    .line 69
    invoke-virtual {p2, p4}, Lbsh/org/objectweb/asm/ByteVector;->putShort(I)Lbsh/org/objectweb/asm/ByteVector;

    .line 70
    .line 71
    .line 72
    iget p2, p0, Lbsh/org/objectweb/asm/ClassWriter;->numberOfInnerClasses:I

    .line 73
    .line 74
    iput p2, p1, Lbsh/org/objectweb/asm/Symbol;->info:I

    .line 75
    .line 76
    :cond_3
    return-void
.end method

.method public final visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;
    .locals 8

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/MethodWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 4
    .line 5
    iget v7, p0, Lbsh/org/objectweb/asm/ClassWriter;->compute:I

    .line 6
    .line 7
    move v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v6, p5

    .line 12
    invoke-direct/range {v0 .. v7}, Lbsh/org/objectweb/asm/MethodWriter;-><init>(Lbsh/org/objectweb/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->firstMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 23
    .line 24
    iput-object v0, p1, Lbsh/org/objectweb/asm/MethodVisitor;->mv:Lbsh/org/objectweb/asm/MethodVisitor;

    .line 25
    .line 26
    :goto_0
    iput-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->lastMethod:Lbsh/org/objectweb/asm/MethodWriter;

    .line 27
    .line 28
    return-object v0
.end method

.method public final visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lbsh/org/objectweb/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lbsh/org/objectweb/asm/Symbol;->index:I

    .line 8
    .line 9
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingClassIndex:I

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 16
    .line 17
    invoke-virtual {p1, p2, p3}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->enclosingMethodIndex:I

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassWriter;->symbolTable:Lbsh/org/objectweb/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->sourceFileIndex:I

    .line 10
    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    new-instance p1, Lbsh/org/objectweb/asm/ByteVector;

    .line 14
    .line 15
    invoke-direct {p1}, Lbsh/org/objectweb/asm/ByteVector;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2, v0, v1}, Lbsh/org/objectweb/asm/ByteVector;->encodeUTF8(Ljava/lang/String;II)Lbsh/org/objectweb/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lbsh/org/objectweb/asm/ClassWriter;->debugExtension:Lbsh/org/objectweb/asm/ByteVector;

    .line 27
    .line 28
    :cond_1
    return-void
.end method
