.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TypeExtractor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$RecordComponentExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;,
        Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;
    }
.end annotation


# static fields
.field private static final REAL_MODIFIER_MASK:I = 0xffff

.field private static final SUPER_CLASS_INDEX:I = -0x1


# instance fields
.field private actualModifiers:I

.field private final annotationTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;"
        }
    .end annotation
.end field

.field private anonymousType:Z

.field private classFileVersion:Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final declaredTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private declaringTypeName:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final fieldTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$FieldToken;",
            ">;"
        }
    .end annotation
.end field

.field private genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private interfaceName:[Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private internalName:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final methodTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;",
            ">;"
        }
    .end annotation
.end field

.field private modifiers:I

.field private moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private nestHost:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final nestMembers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final permittedSubclasses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final recordComponentTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;",
            ">;"
        }
    .end annotation
.end field

.field private superClassName:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final superTypeAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/pool/TypePool$Default;

.field private typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

.field private final typeVariableAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final typeVariableBoundsAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superTypeAnnotationTokens:Ljava/util/Map;

    .line 14
    .line 15
    new-instance p1, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 21
    .line 22
    new-instance p1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableBoundsAnnotationTokens:Ljava/util/Map;

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->annotationTokens:Ljava/util/List;

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->fieldTokens:Ljava/util/List;

    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->methodTokens:Ljava/util/List;

    .line 49
    .line 50
    new-instance p1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->recordComponentTokens:Ljava/util/List;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    iput-boolean p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->anonymousType:Z

    .line 59
    .line 60
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$SelfContained;

    .line 61
    .line 62
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->nestMembers:Ljava/util/List;

    .line 70
    .line 71
    new-instance p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->declaredTypes:Ljava/util/List;

    .line 77
    .line 78
    new-instance p1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->permittedSubclasses:Ljava/util/List;

    .line 84
    .line 85
    return-void
.end method

.method public static synthetic access$4802(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$4900(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->fieldTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5000(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->methodTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$5100(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->recordComponentTokens:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public toTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->internalName:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superTypeAnnotationTokens:Ljava/util/Map;

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/util/Map;

    .line 23
    .line 24
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;

    .line 25
    .line 26
    iget-object v3, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 27
    .line 28
    iget v4, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->actualModifiers:I

    .line 29
    .line 30
    iget v5, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->modifiers:I

    .line 31
    .line 32
    iget-object v6, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->internalName:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v7, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superClassName:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v8, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->interfaceName:[Ljava/lang/String;

    .line 37
    .line 38
    iget-object v9, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->genericSignature:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v10, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 41
    .line 42
    iget-object v11, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->declaringTypeName:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v12, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->declaredTypes:Ljava/util/List;

    .line 45
    .line 46
    iget-boolean v13, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->anonymousType:Z

    .line 47
    .line 48
    iget-object v14, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->nestHost:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v15, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->nestMembers:Ljava/util/List;

    .line 51
    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 55
    .line 56
    :cond_0
    move-object/from16 v16, v1

    .line 57
    .line 58
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superTypeAnnotationTokens:Ljava/util/Map;

    .line 59
    .line 60
    move-object/from16 v17, v1

    .line 61
    .line 62
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 63
    .line 64
    move-object/from16 v18, v1

    .line 65
    .line 66
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableBoundsAnnotationTokens:Ljava/util/Map;

    .line 67
    .line 68
    move-object/from16 v19, v1

    .line 69
    .line 70
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->annotationTokens:Ljava/util/List;

    .line 71
    .line 72
    move-object/from16 v20, v1

    .line 73
    .line 74
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->moduleToken:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;

    .line 75
    .line 76
    move-object/from16 v21, v1

    .line 77
    .line 78
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->fieldTokens:Ljava/util/List;

    .line 79
    .line 80
    move-object/from16 v22, v1

    .line 81
    .line 82
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->methodTokens:Ljava/util/List;

    .line 83
    .line 84
    move-object/from16 v23, v1

    .line 85
    .line 86
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->recordComponentTokens:Ljava/util/List;

    .line 87
    .line 88
    move-object/from16 v24, v1

    .line 89
    .line 90
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->permittedSubclasses:Ljava/util/List;

    .line 91
    .line 92
    iget-object v0, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 93
    .line 94
    move-object/from16 v26, v0

    .line 95
    .line 96
    move-object/from16 v25, v1

    .line 97
    .line 98
    invoke-direct/range {v2 .. v26}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;-><init>(Lnet/bytebuddy/pool/TypePool;IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$ModuleToken;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/ClassFileVersion;)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    :cond_1
    const-string v0, "Internal name or class file version were not set"

    .line 103
    .line 104
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    return-object v0
.end method

.method public visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const v0, 0xffff

    .line 2
    .line 3
    .line 4
    and-int/2addr v0, p2

    .line 5
    iput v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->modifiers:I

    .line 6
    .line 7
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->actualModifiers:I

    .line 8
    .line 9
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->internalName:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->genericSignature:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superClassName:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p6, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->interfaceName:[Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p1}, Lnet/bytebuddy/ClassFileVersion;->ofMinorMajor(I)Lnet/bytebuddy/ClassFileVersion;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 22
    .line 23
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->annotationTokens:Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 6
    .line 7
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 8
    .line 9
    invoke-direct {v1, v2, p1}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p2, p0, p1, v0, v1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 13
    .line 14
    .line 15
    return-object p2
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    move p5, p1

    .line 2
    move-object p1, p0

    .line 3
    new-instance p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;

    .line 4
    .line 5
    const v0, 0xffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p5, v0

    .line 9
    move-object v1, p3

    .line 10
    move-object p3, p2

    .line 11
    move p2, p5

    .line 12
    move-object p5, p4

    .line 13
    move-object p4, v1

    .line 14
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$FieldExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->internalName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->declaringTypeName:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 14
    .line 15
    invoke-interface {p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;->isSelfContained()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinType;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p1, p2, v0}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinType;-><init>(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 28
    .line 29
    :cond_0
    if-nez p3, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 32
    .line 33
    invoke-interface {p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;->isSelfContained()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    iput-boolean p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->anonymousType:Z

    .line 41
    .line 42
    :cond_1
    const p1, 0xffff

    .line 43
    .line 44
    .line 45
    and-int/2addr p1, p4

    .line 46
    iput p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->modifiers:I

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    if-eqz p2, :cond_3

    .line 50
    .line 51
    if-eqz p3, :cond_3

    .line 52
    .line 53
    iget-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->internalName:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->declaredTypes:Ljava/util/List;

    .line 62
    .line 63
    new-instance p2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string p3, "L"

    .line 66
    .line 67
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, ";"

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 7
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    const-string v0, "<clinit>"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/pool/TypePool$Default;->access$4100()Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;

    .line 15
    .line 16
    const v1, 0xffff

    .line 17
    .line 18
    .line 19
    and-int v2, p1, v1

    .line 20
    .line 21
    move-object v1, p0

    .line 22
    move-object v3, p2

    .line 23
    move-object v4, p3

    .line 24
    move-object v5, p4

    .line 25
    move-object v6, p5

    .line 26
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public visitModule(Ljava/lang/String;ILjava/lang/String;)Lnet/bytebuddy/jar/asm/ModuleVisitor;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$ModuleExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public visitNestHost(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->nestHost:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public visitNestMember(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->nestMembers:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "<clinit>"

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinMethod;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinType;

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    invoke-direct {p2, p1, p3}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment$WithinType;-><init>(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeContainment:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$TypeContainment;

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public visitPermittedSubclass(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->permittedSubclasses:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public visitRecordComponent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$RecordComponentExtractor;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$RecordComponentExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 7
    .param p2    # Lnet/bytebuddy/jar/asm/TypePath;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    new-instance p4, Lnet/bytebuddy/jar/asm/TypeReference;

    .line 2
    .line 3
    invoke-direct {p4, p1}, Lnet/bytebuddy/jar/asm/TypeReference;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSort()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/16 v0, 0x11

    .line 17
    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed;

    .line 21
    .line 22
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterBoundIndex()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterIndex()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    iget-object v6, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableBoundsAnnotationTokens:Ljava/util/Map;

    .line 31
    .line 32
    move-object v3, p2

    .line 33
    move-object v2, p3

    .line 34
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;IILjava/util/Map;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Unexpected type reference: "

    .line 39
    .line 40
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSort()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_1
    move-object v3, p2

    .line 50
    move-object v2, p3

    .line 51
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;

    .line 52
    .line 53
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSuperTypeIndex()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->superTypeAnnotationTokens:Ljava/util/Map;

    .line 58
    .line 59
    invoke-direct {v1, v2, v3, p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;ILjava/util/Map;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object v3, p2

    .line 64
    move-object v2, p3

    .line 65
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;

    .line 66
    .line 67
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterIndex()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 72
    .line 73
    invoke-direct {v1, v2, v3, p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;ILjava/util/Map;)V

    .line 74
    .line 75
    .line 76
    :goto_0
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 77
    .line 78
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 79
    .line 80
    iget-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 81
    .line 82
    invoke-direct {p2, p3, v2}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p1, p0, v1, p2}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 86
    .line 87
    .line 88
    return-object p1
.end method
