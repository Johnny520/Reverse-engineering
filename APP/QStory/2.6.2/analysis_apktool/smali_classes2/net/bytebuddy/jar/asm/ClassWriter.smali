.class public Lnet/bytebuddy/jar/asm/ClassWriter;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final COMPUTE_FRAMES:I = 0x2

.field public static final COMPUTE_MAXS:I = 0x1


# instance fields
.field private accessFlags:I

.field private compute:I

.field private debugExtension:Lnet/bytebuddy/jar/asm/ByteVector;

.field private enclosingClassIndex:I

.field private enclosingMethodIndex:I

.field private firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

.field private firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

.field private firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

.field private firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

.field private final flags:I

.field private innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

.field private interfaceCount:I

.field private interfaces:[I

.field private lastField:Lnet/bytebuddy/jar/asm/FieldWriter;

.field private lastMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

.field private lastRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

.field private lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

.field private moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

.field private nestHostClassIndex:I

.field private nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

.field private numberOfInnerClasses:I

.field private numberOfNestMemberClasses:I

.field private numberOfPermittedSubclasses:I

.field private permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

.field private signatureIndex:I

.field private sourceFileIndex:I

.field private superClass:I

.field private final symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

.field private thisClass:I

.field private version:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassWriter;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;I)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassReader;I)V
    .locals 1

    .line 1
    const/high16 v0, 0x90000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->flags:I

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lnet/bytebuddy/jar/asm/SymbolTable;-><init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;-><init>(Lnet/bytebuddy/jar/asm/ClassWriter;Lnet/bytebuddy/jar/asm/ClassReader;)V

    .line 19
    .line 20
    .line 21
    move-object p1, v0

    .line 22
    :goto_0
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lnet/bytebuddy/jar/asm/ClassWriter;->setFlags(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private getAttributePrototypes()[Lnet/bytebuddy/jar/asm/Attribute;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Attribute$Set;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Attribute$Set;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/Attribute$Set;->addAttributes(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 12
    .line 13
    :goto_0
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/FieldWriter;->collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/FieldVisitor;->fv:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 19
    .line 20
    check-cast v1, Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 24
    .line 25
    :goto_1
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/MethodWriter;->collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 31
    .line 32
    check-cast v1, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 36
    .line 37
    :goto_2
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->collectAttributePrototypes(Lnet/bytebuddy/jar/asm/Attribute$Set;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 43
    .line 44
    check-cast p0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Attribute$Set;->toArray()[Lnet/bytebuddy/jar/asm/Attribute;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method

.method private replaceAsmInstructions([BZ)[B
    .locals 3

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/jar/asm/ClassWriter;->getAttributePrototypes()[Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 7
    .line 8
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 9
    .line 10
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 11
    .line 12
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 13
    .line 14
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 19
    .line 20
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    iput v2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestHostClassIndex:I

    .line 26
    .line 27
    iput v2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfNestMemberClasses:I

    .line 28
    .line 29
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 30
    .line 31
    iput v2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfPermittedSubclasses:I

    .line 32
    .line 33
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 34
    .line 35
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 36
    .line 37
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 38
    .line 39
    iput-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 40
    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v2

    .line 46
    :goto_0
    iput v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

    .line 47
    .line 48
    new-instance v1, Lnet/bytebuddy/jar/asm/ClassReader;

    .line 49
    .line 50
    invoke-direct {v1, p1, v2, v2}, Lnet/bytebuddy/jar/asm/ClassReader;-><init>([BIZ)V

    .line 51
    .line 52
    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    const/16 v2, 0x8

    .line 56
    .line 57
    :cond_1
    or-int/lit16 p1, v2, 0x100

    .line 58
    .line 59
    invoke-virtual {v1, p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;[Lnet/bytebuddy/jar/asm/Attribute;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getCommonSuperClass(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassWriter;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2e

    .line 6
    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v2, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    :try_start_1
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v4, v3, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_3
    :goto_0
    const-string p0, "java/lang/Object"

    .line 73
    .line 74
    return-object p0

    .line 75
    :catch_0
    move-exception p0

    .line 76
    new-instance p1, Ljava/lang/TypeNotPresentException;

    .line 77
    .line 78
    invoke-direct {p1, p2, p0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :catch_1
    move-exception p0

    .line 83
    new-instance p2, Ljava/lang/TypeNotPresentException;

    .line 84
    .line 85
    invoke-direct {p2, p1, p0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    throw p2
.end method

.method public hasFlags(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->flags:I

    .line 2
    .line 3
    and-int/2addr p0, p1

    .line 4
    if-ne p0, p1, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public newClass(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newConst(Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstant(Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public varargs newConstantDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantFieldref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
        forRemoval = false
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
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/ClassWriter;->newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public newHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 0

    .line 20
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    invoke-virtual/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodHandle(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    move-result-object p0

    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    return p0
.end method

.method public varargs newInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantInvokeDynamic(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newMethod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodref(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newMethodType(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newModule(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newNameType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public newPackage(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantPackage(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    return p0
.end method

.method public newUTF8(Ljava/lang/String;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final setFlags(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    and-int/2addr p1, v0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iput v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

    .line 18
    .line 19
    return-void
.end method

.method public toByteArray()[B
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaceCount:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    mul-int/2addr v1, v2

    .line 7
    add-int/lit8 v1, v1, 0x18

    .line 8
    .line 9
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

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
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/FieldWriter;->computeFieldInfoSize()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    add-int/2addr v1, v6

    .line 21
    iget-object v3, v3, Lnet/bytebuddy/jar/asm/FieldVisitor;->fv:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 22
    .line 23
    check-cast v3, Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

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
    invoke-virtual {v3}, Lnet/bytebuddy/jar/asm/MethodWriter;->computeMethodInfoSize()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    add-int/2addr v1, v7

    .line 38
    iget-object v3, v3, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 39
    .line 40
    check-cast v3, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 44
    .line 45
    const-string v7, "InnerClasses"

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 50
    .line 51
    add-int/lit8 v3, v3, 0x8

    .line 52
    .line 53
    add-int/2addr v1, v3

    .line 54
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 55
    .line 56
    invoke-virtual {v3, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

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
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingClassIndex:I

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
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 73
    .line 74
    invoke-virtual {v8, v9}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    :cond_3
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

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
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->version:I

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
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 101
    .line 102
    invoke-virtual {v8, v11}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    :cond_4
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->signatureIndex:I

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
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 116
    .line 117
    invoke-virtual {v8, v14}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    :cond_5
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->sourceFileIndex:I

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
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 131
    .line 132
    invoke-virtual {v8, v15}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    :cond_6
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->debugExtension:Lnet/bytebuddy/jar/asm/ByteVector;

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
    iget v8, v8, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 146
    .line 147
    add-int/lit8 v8, v8, 0x6

    .line 148
    .line 149
    add-int/2addr v1, v8

    .line 150
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 151
    .line 152
    invoke-virtual {v8, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_7
    iget v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

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
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 170
    .line 171
    invoke-virtual {v8, v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    :cond_8
    iget-object v8, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 175
    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    add-int/lit8 v3, v3, 0x1

    .line 179
    .line 180
    const-string v4, "RuntimeVisibleAnnotations"

    .line 181
    .line 182
    invoke-virtual {v8, v4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    add-int/2addr v1, v4

    .line 187
    :cond_9
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 188
    .line 189
    if-eqz v4, :cond_a

    .line 190
    .line 191
    add-int/lit8 v3, v3, 0x1

    .line 192
    .line 193
    const-string v8, "RuntimeInvisibleAnnotations"

    .line 194
    .line 195
    invoke-virtual {v4, v8}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    add-int/2addr v1, v4

    .line 200
    :cond_a
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 201
    .line 202
    if-eqz v4, :cond_b

    .line 203
    .line 204
    add-int/lit8 v3, v3, 0x1

    .line 205
    .line 206
    const-string v8, "RuntimeVisibleTypeAnnotations"

    .line 207
    .line 208
    invoke-virtual {v4, v8}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    add-int/2addr v1, v4

    .line 213
    :cond_b
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 214
    .line 215
    if-eqz v4, :cond_c

    .line 216
    .line 217
    add-int/lit8 v3, v3, 0x1

    .line 218
    .line 219
    const-string v8, "RuntimeInvisibleTypeAnnotations"

    .line 220
    .line 221
    invoke-virtual {v4, v8}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->computeAnnotationsSize(Ljava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    add-int/2addr v1, v4

    .line 226
    :cond_c
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 227
    .line 228
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->computeBootstrapMethodsSize()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-lez v4, :cond_d

    .line 233
    .line 234
    add-int/lit8 v3, v3, 0x1

    .line 235
    .line 236
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 237
    .line 238
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->computeBootstrapMethodsSize()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    add-int/2addr v1, v4

    .line 243
    :cond_d
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 244
    .line 245
    if-eqz v4, :cond_e

    .line 246
    .line 247
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/ModuleWriter;->getAttributeCount()I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    add-int/2addr v3, v4

    .line 252
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 253
    .line 254
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/ModuleWriter;->computeAttributesSize()I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    add-int/2addr v1, v4

    .line 259
    :cond_e
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestHostClassIndex:I

    .line 260
    .line 261
    const-string v8, "NestHost"

    .line 262
    .line 263
    if-eqz v4, :cond_f

    .line 264
    .line 265
    add-int/lit8 v3, v3, 0x1

    .line 266
    .line 267
    add-int/lit8 v1, v1, 0x8

    .line 268
    .line 269
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 270
    .line 271
    invoke-virtual {v4, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    :cond_f
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 275
    .line 276
    const-string v12, "NestMembers"

    .line 277
    .line 278
    if-eqz v4, :cond_10

    .line 279
    .line 280
    add-int/lit8 v3, v3, 0x1

    .line 281
    .line 282
    iget v4, v4, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 283
    .line 284
    add-int/lit8 v4, v4, 0x8

    .line 285
    .line 286
    add-int/2addr v1, v4

    .line 287
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 288
    .line 289
    invoke-virtual {v4, v12}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    :cond_10
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 293
    .line 294
    const-string v13, "PermittedSubclasses"

    .line 295
    .line 296
    if-eqz v4, :cond_11

    .line 297
    .line 298
    add-int/lit8 v3, v3, 0x1

    .line 299
    .line 300
    iget v4, v4, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 301
    .line 302
    add-int/lit8 v4, v4, 0x8

    .line 303
    .line 304
    add-int/2addr v1, v4

    .line 305
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 306
    .line 307
    invoke-virtual {v4, v13}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    :cond_11
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 311
    .line 312
    const/high16 v19, 0x10000

    .line 313
    .line 314
    and-int v4, v4, v19

    .line 315
    .line 316
    move/from16 v20, v1

    .line 317
    .line 318
    const-string v1, "Record"

    .line 319
    .line 320
    if-nez v4, :cond_13

    .line 321
    .line 322
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 323
    .line 324
    if-eqz v4, :cond_12

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_12
    move/from16 v22, v20

    .line 328
    .line 329
    const/16 v21, 0x0

    .line 330
    .line 331
    move/from16 v20, v3

    .line 332
    .line 333
    const/4 v3, 0x0

    .line 334
    goto :goto_5

    .line 335
    :cond_13
    :goto_3
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 336
    .line 337
    const/16 v21, 0x0

    .line 338
    .line 339
    const/16 v22, 0x0

    .line 340
    .line 341
    :goto_4
    if-eqz v4, :cond_14

    .line 342
    .line 343
    add-int/lit8 v22, v22, 0x1

    .line 344
    .line 345
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->computeRecordComponentInfoSize()I

    .line 346
    .line 347
    .line 348
    move-result v23

    .line 349
    add-int v21, v21, v23

    .line 350
    .line 351
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 352
    .line 353
    check-cast v4, Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 354
    .line 355
    goto :goto_4

    .line 356
    :cond_14
    add-int/lit8 v3, v3, 0x1

    .line 357
    .line 358
    add-int/lit8 v4, v21, 0x8

    .line 359
    .line 360
    add-int v4, v4, v20

    .line 361
    .line 362
    move/from16 v20, v3

    .line 363
    .line 364
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 365
    .line 366
    invoke-virtual {v3, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    move/from16 v3, v22

    .line 370
    .line 371
    move/from16 v22, v4

    .line 372
    .line 373
    :goto_5
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 374
    .line 375
    if-eqz v4, :cond_15

    .line 376
    .line 377
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/Attribute;->getAttributeCount()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    add-int v4, v4, v20

    .line 382
    .line 383
    move/from16 v20, v4

    .line 384
    .line 385
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 386
    .line 387
    move/from16 v23, v3

    .line 388
    .line 389
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 390
    .line 391
    invoke-virtual {v4, v3}, Lnet/bytebuddy/jar/asm/Attribute;->computeAttributesSize(Lnet/bytebuddy/jar/asm/SymbolTable;)I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    add-int v4, v3, v22

    .line 396
    .line 397
    move/from16 v3, v20

    .line 398
    .line 399
    move/from16 v20, v4

    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_15
    move/from16 v23, v3

    .line 403
    .line 404
    move/from16 v3, v20

    .line 405
    .line 406
    move/from16 v20, v22

    .line 407
    .line 408
    :goto_6
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 409
    .line 410
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/SymbolTable;->getConstantPoolLength()I

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    add-int v4, v20, v4

    .line 415
    .line 416
    move-object/from16 v20, v1

    .line 417
    .line 418
    iget-object v1, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 419
    .line 420
    invoke-virtual {v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->getConstantPoolCount()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    move-object/from16 v22, v13

    .line 425
    .line 426
    const v13, 0xffff

    .line 427
    .line 428
    .line 429
    if-gt v1, v13, :cond_29

    .line 430
    .line 431
    new-instance v1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 432
    .line 433
    invoke-direct {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>(I)V

    .line 434
    .line 435
    .line 436
    const v4, -0x35014542    # -8346975.0f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    move/from16 v18, v13

    .line 444
    .line 445
    iget v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->version:I

    .line 446
    .line 447
    invoke-virtual {v4, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 448
    .line 449
    .line 450
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 451
    .line 452
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->putConstantPool(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 453
    .line 454
    .line 455
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->version:I

    .line 456
    .line 457
    and-int v4, v4, v18

    .line 458
    .line 459
    const/16 v13, 0x31

    .line 460
    .line 461
    if-ge v4, v13, :cond_16

    .line 462
    .line 463
    const/16 v4, 0x1000

    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_16
    const/4 v4, 0x0

    .line 467
    :goto_7
    iget v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 468
    .line 469
    not-int v4, v4

    .line 470
    and-int/2addr v4, v13

    .line 471
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    iget v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->thisClass:I

    .line 476
    .line 477
    invoke-virtual {v4, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    iget v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->superClass:I

    .line 482
    .line 483
    invoke-virtual {v4, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 484
    .line 485
    .line 486
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaceCount:I

    .line 487
    .line 488
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 489
    .line 490
    .line 491
    const/4 v4, 0x0

    .line 492
    :goto_8
    iget v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaceCount:I

    .line 493
    .line 494
    if-ge v4, v13, :cond_17

    .line 495
    .line 496
    iget-object v13, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaces:[I

    .line 497
    .line 498
    aget v13, v13, v4

    .line 499
    .line 500
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 501
    .line 502
    .line 503
    add-int/lit8 v4, v4, 0x1

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_17
    invoke-virtual {v1, v5}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 507
    .line 508
    .line 509
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 510
    .line 511
    :goto_9
    if-eqz v4, :cond_18

    .line 512
    .line 513
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/FieldWriter;->putFieldInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 514
    .line 515
    .line 516
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/FieldVisitor;->fv:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 517
    .line 518
    check-cast v4, Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_18
    invoke-virtual {v1, v6}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 522
    .line 523
    .line 524
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 525
    .line 526
    const/4 v5, 0x0

    .line 527
    const/4 v6, 0x0

    .line 528
    :goto_a
    if-eqz v4, :cond_19

    .line 529
    .line 530
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/MethodWriter;->hasFrames()Z

    .line 531
    .line 532
    .line 533
    move-result v13

    .line 534
    or-int/2addr v5, v13

    .line 535
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/MethodWriter;->hasAsmInstructions()Z

    .line 536
    .line 537
    .line 538
    move-result v13

    .line 539
    or-int/2addr v6, v13

    .line 540
    invoke-virtual {v4, v1}, Lnet/bytebuddy/jar/asm/MethodWriter;->putMethodInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 541
    .line 542
    .line 543
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 544
    .line 545
    check-cast v4, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 546
    .line 547
    goto :goto_a

    .line 548
    :cond_19
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 549
    .line 550
    .line 551
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 552
    .line 553
    if-eqz v3, :cond_1a

    .line 554
    .line 555
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 556
    .line 557
    invoke-virtual {v3, v7}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 566
    .line 567
    iget v4, v4, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 568
    .line 569
    add-int/lit8 v4, v4, 0x2

    .line 570
    .line 571
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfInnerClasses:I

    .line 576
    .line 577
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 582
    .line 583
    iget-object v7, v4, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 584
    .line 585
    iget v4, v4, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 586
    .line 587
    const/4 v13, 0x0

    .line 588
    invoke-virtual {v3, v7, v13, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 589
    .line 590
    .line 591
    :cond_1a
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingClassIndex:I

    .line 592
    .line 593
    if-eqz v3, :cond_1b

    .line 594
    .line 595
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 596
    .line 597
    invoke-virtual {v3, v9}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    const/4 v4, 0x4

    .line 606
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingClassIndex:I

    .line 611
    .line 612
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingMethodIndex:I

    .line 617
    .line 618
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 619
    .line 620
    .line 621
    :cond_1b
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 622
    .line 623
    const/16 v4, 0x1000

    .line 624
    .line 625
    and-int/2addr v3, v4

    .line 626
    if-eqz v3, :cond_1c

    .line 627
    .line 628
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->version:I

    .line 629
    .line 630
    const v18, 0xffff

    .line 631
    .line 632
    .line 633
    and-int v3, v3, v18

    .line 634
    .line 635
    const/16 v13, 0x31

    .line 636
    .line 637
    if-ge v3, v13, :cond_1c

    .line 638
    .line 639
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 640
    .line 641
    invoke-virtual {v3, v11}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    const/4 v13, 0x0

    .line 650
    invoke-virtual {v3, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 651
    .line 652
    .line 653
    :cond_1c
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->signatureIndex:I

    .line 654
    .line 655
    if-eqz v3, :cond_1d

    .line 656
    .line 657
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 658
    .line 659
    invoke-virtual {v3, v14}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 660
    .line 661
    .line 662
    move-result v3

    .line 663
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    move/from16 v4, v16

    .line 668
    .line 669
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    iget v7, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->signatureIndex:I

    .line 674
    .line 675
    invoke-virtual {v3, v7}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 676
    .line 677
    .line 678
    goto :goto_b

    .line 679
    :cond_1d
    move/from16 v4, v16

    .line 680
    .line 681
    :goto_b
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->sourceFileIndex:I

    .line 682
    .line 683
    if-eqz v3, :cond_1e

    .line 684
    .line 685
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 686
    .line 687
    invoke-virtual {v3, v15}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 692
    .line 693
    .line 694
    move-result-object v3

    .line 695
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    iget v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->sourceFileIndex:I

    .line 700
    .line 701
    invoke-virtual {v3, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 702
    .line 703
    .line 704
    :cond_1e
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->debugExtension:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 705
    .line 706
    if-eqz v3, :cond_1f

    .line 707
    .line 708
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 709
    .line 710
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 711
    .line 712
    invoke-virtual {v4, v2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 713
    .line 714
    .line 715
    move-result v2

    .line 716
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->debugExtension:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 725
    .line 726
    iget-object v4, v4, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 727
    .line 728
    const/4 v13, 0x0

    .line 729
    invoke-virtual {v2, v4, v13, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 730
    .line 731
    .line 732
    goto :goto_c

    .line 733
    :cond_1f
    const/4 v13, 0x0

    .line 734
    :goto_c
    iget v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 735
    .line 736
    and-int v2, v2, v17

    .line 737
    .line 738
    if-eqz v2, :cond_20

    .line 739
    .line 740
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 741
    .line 742
    invoke-virtual {v2, v10}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-virtual {v2, v13}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 751
    .line 752
    .line 753
    :cond_20
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 754
    .line 755
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 756
    .line 757
    iget-object v4, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 758
    .line 759
    iget-object v7, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 760
    .line 761
    iget-object v9, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 762
    .line 763
    move-object/from16 v29, v1

    .line 764
    .line 765
    move-object/from16 v24, v2

    .line 766
    .line 767
    move-object/from16 v25, v3

    .line 768
    .line 769
    move-object/from16 v26, v4

    .line 770
    .line 771
    move-object/from16 v27, v7

    .line 772
    .line 773
    move-object/from16 v28, v9

    .line 774
    .line 775
    invoke-static/range {v24 .. v29}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->putAnnotations(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/AnnotationWriter;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 776
    .line 777
    .line 778
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 779
    .line 780
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/SymbolTable;->putBootstrapMethods(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 781
    .line 782
    .line 783
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 784
    .line 785
    if-eqz v2, :cond_21

    .line 786
    .line 787
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/ModuleWriter;->putAttributes(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 788
    .line 789
    .line 790
    :cond_21
    iget v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestHostClassIndex:I

    .line 791
    .line 792
    if-eqz v2, :cond_22

    .line 793
    .line 794
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 795
    .line 796
    invoke-virtual {v2, v8}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const/4 v4, 0x2

    .line 805
    invoke-virtual {v2, v4}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestHostClassIndex:I

    .line 810
    .line 811
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 812
    .line 813
    .line 814
    :cond_22
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 815
    .line 816
    if-eqz v2, :cond_23

    .line 817
    .line 818
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 819
    .line 820
    invoke-virtual {v2, v12}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 821
    .line 822
    .line 823
    move-result v2

    .line 824
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 829
    .line 830
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 831
    .line 832
    const/16 v16, 0x2

    .line 833
    .line 834
    add-int/lit8 v3, v3, 0x2

    .line 835
    .line 836
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfNestMemberClasses:I

    .line 841
    .line 842
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 847
    .line 848
    iget-object v4, v3, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 849
    .line 850
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 851
    .line 852
    const/4 v13, 0x0

    .line 853
    invoke-virtual {v2, v4, v13, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 854
    .line 855
    .line 856
    :cond_23
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 857
    .line 858
    if-eqz v2, :cond_24

    .line 859
    .line 860
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 861
    .line 862
    move-object/from16 v3, v22

    .line 863
    .line 864
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 865
    .line 866
    .line 867
    move-result v2

    .line 868
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 873
    .line 874
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 875
    .line 876
    const/16 v16, 0x2

    .line 877
    .line 878
    add-int/lit8 v3, v3, 0x2

    .line 879
    .line 880
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    iget v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfPermittedSubclasses:I

    .line 885
    .line 886
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 891
    .line 892
    iget-object v4, v3, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 893
    .line 894
    iget v3, v3, Lnet/bytebuddy/jar/asm/ByteVector;->length:I

    .line 895
    .line 896
    const/4 v13, 0x0

    .line 897
    invoke-virtual {v2, v4, v13, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putByteArray([BII)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 898
    .line 899
    .line 900
    :cond_24
    iget v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 901
    .line 902
    and-int v2, v2, v19

    .line 903
    .line 904
    if-nez v2, :cond_25

    .line 905
    .line 906
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 907
    .line 908
    if-eqz v2, :cond_26

    .line 909
    .line 910
    :cond_25
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 911
    .line 912
    move-object/from16 v3, v20

    .line 913
    .line 914
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    const/16 v16, 0x2

    .line 923
    .line 924
    add-int/lit8 v3, v21, 0x2

    .line 925
    .line 926
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putInt(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    move/from16 v3, v23

    .line 931
    .line 932
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 933
    .line 934
    .line 935
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 936
    .line 937
    :goto_d
    if-eqz v2, :cond_26

    .line 938
    .line 939
    invoke-virtual {v2, v1}, Lnet/bytebuddy/jar/asm/RecordComponentWriter;->putRecordComponentInfo(Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 940
    .line 941
    .line 942
    iget-object v2, v2, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 943
    .line 944
    check-cast v2, Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 945
    .line 946
    goto :goto_d

    .line 947
    :cond_26
    iget-object v2, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 948
    .line 949
    if-eqz v2, :cond_27

    .line 950
    .line 951
    iget-object v3, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 952
    .line 953
    invoke-virtual {v2, v3, v1}, Lnet/bytebuddy/jar/asm/Attribute;->putAttributes(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/ByteVector;)V

    .line 954
    .line 955
    .line 956
    :cond_27
    iget-object v1, v1, Lnet/bytebuddy/jar/asm/ByteVector;->data:[B

    .line 957
    .line 958
    if-eqz v6, :cond_28

    .line 959
    .line 960
    invoke-direct {v0, v1, v5}, Lnet/bytebuddy/jar/asm/ClassWriter;->replaceAsmInstructions([BZ)[B

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    return-object v0

    .line 965
    :cond_28
    return-object v1

    .line 966
    :cond_29
    new-instance v2, Lnet/bytebuddy/jar/asm/ClassTooLargeException;

    .line 967
    .line 968
    iget-object v0, v0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 969
    .line 970
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/SymbolTable;->getClassName()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-direct {v2, v0, v1}, Lnet/bytebuddy/jar/asm/ClassTooLargeException;-><init>(Ljava/lang/String;I)V

    .line 975
    .line 976
    .line 977
    throw v2
.end method

.method public final visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 1
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->version:I

    .line 2
    .line 3
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->accessFlags:I

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 6
    .line 7
    const v0, 0xffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, v0

    .line 11
    invoke-virtual {p2, p1, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->setMajorVersionAndClassName(ILjava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->thisClass:I

    .line 16
    .line 17
    if-eqz p4, :cond_0

    .line 18
    .line 19
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 20
    .line 21
    invoke-virtual {p2, p4}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->signatureIndex:I

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
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 33
    .line 34
    invoke-virtual {p3, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    iget p3, p3, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 39
    .line 40
    :goto_0
    iput p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->superClass:I

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
    iput p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaceCount:I

    .line 49
    .line 50
    new-array p3, p3, [I

    .line 51
    .line 52
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaces:[I

    .line 53
    .line 54
    :goto_1
    iget p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaceCount:I

    .line 55
    .line 56
    if-ge p2, p3, :cond_2

    .line 57
    .line 58
    iget-object p3, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->interfaces:[I

    .line 59
    .line 60
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 61
    .line 62
    aget-object p5, p6, p2

    .line 63
    .line 64
    invoke-virtual {p4, p5}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    iget p4, p4, Lnet/bytebuddy/jar/asm/Symbol;->index:I

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
    iget p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

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
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

    .line 86
    .line 87
    :cond_3
    return-void
.end method

.method public final visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method

.method public final visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 2
    .line 3
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/Attribute;->nextAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 4
    .line 5
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstAttribute:Lnet/bytebuddy/jar/asm/Attribute;

    .line 6
    .line 7
    return-void
.end method

.method public final visitEnd()V
    .locals 0

    .line 1
    return-void
.end method

.method public final visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

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
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/jar/asm/FieldWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 21
    .line 22
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/FieldVisitor;->fv:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 23
    .line 24
    :goto_0
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastField:Lnet/bytebuddy/jar/asm/FieldWriter;

    .line 25
    .line 26
    return-object v0
.end method

.method public final visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget v0, p1, Lnet/bytebuddy/jar/asm/Symbol;->info:I

    .line 19
    .line 20
    if-nez v0, :cond_3

    .line 21
    .line 22
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfInnerClasses:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfInnerClasses:I

    .line 27
    .line 28
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    iget v1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

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
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 43
    .line 44
    invoke-virtual {v2, p2}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iget p2, p2, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 49
    .line 50
    :goto_0
    invoke-virtual {v0, p2}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 54
    .line 55
    if-nez p3, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 59
    .line 60
    invoke-virtual {v0, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    :goto_1
    invoke-virtual {p2, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->innerClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 68
    .line 69
    invoke-virtual {p2, p4}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 70
    .line 71
    .line 72
    iget p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfInnerClasses:I

    .line 73
    .line 74
    iput p0, p1, Lnet/bytebuddy/jar/asm/Symbol;->info:I

    .line 75
    .line 76
    :cond_3
    return-void
.end method

.method public final visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    iget v7, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->compute:I

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
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/MethodWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 23
    .line 24
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 25
    .line 26
    :goto_0
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastMethod:Lnet/bytebuddy/jar/asm/MethodWriter;

    .line 27
    .line 28
    return-object v0
.end method

.method public final visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantModule(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 10
    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v2, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 16
    .line 17
    invoke-virtual {v2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    :goto_0
    invoke-direct {v0, v1, p1, p2, p3}, Lnet/bytebuddy/jar/asm/ModuleWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;III)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->moduleWriter:Lnet/bytebuddy/jar/asm/ModuleWriter;

    .line 25
    .line 26
    return-object v0
.end method

.method public final visitNestHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestHostClassIndex:I

    .line 10
    .line 11
    return-void
.end method

.method public final visitNestMember(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfNestMemberClasses:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfNestMemberClasses:I

    .line 17
    .line 18
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->nestMemberClasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget p1, p1, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 8
    .line 9
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingClassIndex:I

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 16
    .line 17
    invoke-virtual {p1, p2, p3}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantNameAndType(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->enclosingMethodIndex:I

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final visitPermittedSubclass(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 6
    .line 7
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfPermittedSubclasses:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    iput v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->numberOfPermittedSubclasses:I

    .line 17
    .line 18
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->permittedSubclasses:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantClass(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Symbol;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget p0, p0, Lnet/bytebuddy/jar/asm/Symbol;->index:I

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lnet/bytebuddy/jar/asm/ByteVector;->putShort(I)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, Lnet/bytebuddy/jar/asm/RecordComponentWriter;-><init>(Lnet/bytebuddy/jar/asm/SymbolTable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->firstRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 16
    .line 17
    iput-object v0, p1, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 18
    .line 19
    :goto_0
    iput-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRecordComponent:Lnet/bytebuddy/jar/asm/RecordComponentWriter;

    .line 20
    .line 21
    return-object v0
.end method

.method public final visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lnet/bytebuddy/jar/asm/SymbolTable;->addConstantUtf8(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->sourceFileIndex:I

    .line 10
    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    new-instance p1, Lnet/bytebuddy/jar/asm/ByteVector;

    .line 14
    .line 15
    invoke-direct {p1}, Lnet/bytebuddy/jar/asm/ByteVector;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2, v0, v1}, Lnet/bytebuddy/jar/asm/ByteVector;->encodeUtf8(Ljava/lang/String;II)Lnet/bytebuddy/jar/asm/ByteVector;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->debugExtension:Lnet/bytebuddy/jar/asm/ByteVector;

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->symbolTable:Lnet/bytebuddy/jar/asm/SymbolTable;

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 6
    .line 7
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeVisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 15
    .line 16
    invoke-static {v0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/AnnotationWriter;->create(Lnet/bytebuddy/jar/asm/SymbolTable;ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Lnet/bytebuddy/jar/asm/AnnotationWriter;)Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassWriter;->lastRuntimeInvisibleTypeAnnotation:Lnet/bytebuddy/jar/asm/AnnotationWriter;

    .line 21
    .line 22
    return-object p1
.end method
