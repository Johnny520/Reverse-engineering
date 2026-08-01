.class public abstract Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;
.super Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForInlining"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$WithDecorationOnly;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$WithFullProcessing;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final IGNORE_FIELD:Lnet/bytebuddy/jar/asm/FieldVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final IGNORE_RECORD_COMPONENT:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field


# instance fields
.field protected final classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field protected final originalType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;Ljava/util/List;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/type/RecordComponentList;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/pool/TypePool;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p21}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;Ljava/util/List;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/type/RecordComponentList;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;)V

    .line 2
    .line 3
    .line 4
    move-object/from16 p1, p22

    .line 5
    .line 6
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    move-object/from16 p1, p23

    .line 9
    .line 10
    iput-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic access$400()Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->IGNORE_ANNOTATION:Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$500()Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->IGNORE_RECORD_COMPONENT:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$600()Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->IGNORE_FIELD:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$700()Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public create(Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ClassDumpAction$Dispatcher;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ClassDumpAction$Dispatcher;",
            ")",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default<",
            "TU;>.UnresolvedType;"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeWriter(I)I

    .line 5
    .line 6
    .line 7
    move-result v6

    .line 8
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeReader(I)I

    .line 11
    .line 12
    .line 13
    move-result v7

    .line 14
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 15
    .line 16
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 17
    .line 18
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v0, v1}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-interface {p2, v1, v2, v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ClassDumpAction$Dispatcher;->dump(Lnet/bytebuddy/description/type/TypeDescription;Z[B)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classReaderFactory:Lnet/bytebuddy/utility/AsmClassReader$Factory;

    .line 37
    .line 38
    invoke-interface {p2, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([B)Lnet/bytebuddy/utility/AsmClassReader;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 43
    .line 44
    iget-object v1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 45
    .line 46
    invoke-interface {v0, v6, p2, v1}, Lnet/bytebuddy/utility/AsmClassWriter$Factory;->make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    new-instance v5, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;

    .line 51
    .line 52
    invoke-direct {v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Lnet/bytebuddy/utility/AsmClassWriter;->getVisitor()Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 60
    .line 61
    invoke-static {v1, v2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->of(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    move-object v2, p0

    .line 66
    move-object v4, p1

    .line 67
    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->writeTo(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;II)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p2, p0, v7}, Lnet/bytebuddy/utility/AsmClassReader;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;

    .line 75
    .line 76
    invoke-interface {v0}, Lnet/bytebuddy/utility/AsmClassWriter;->getBinaryRepresentation()[B

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;->getAuxiliaryTypes()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-direct {p0, v2, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;[BLjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :catch_0
    move-exception v0

    .line 89
    move-object p0, v0

    .line 90
    const-string p1, "The class file could not be written"

    .line 91
    .line 92
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->originalType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->classFileLocator:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    add-int/2addr p0, v0

    .line 21
    return p0
.end method

.method public wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 7

    .line 1
    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;

    .line 2
    .line 3
    invoke-direct {v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v6, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;

    .line 7
    .line 8
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->of(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 15
    .line 16
    iget-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeWriter(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    iget-object p1, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 23
    .line 24
    invoke-interface {p1, p3}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeReader(I)I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    move-object v0, p0

    .line 29
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;->writeTo(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;II)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v6, v0, p0, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$RegistryContextClassVisitor;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;)V

    .line 34
    .line 35
    .line 36
    return-object v6
.end method

.method public abstract writeTo(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForInlining$ContextRegistry;II)Lnet/bytebuddy/jar/asm/ClassVisitor;
.end method
