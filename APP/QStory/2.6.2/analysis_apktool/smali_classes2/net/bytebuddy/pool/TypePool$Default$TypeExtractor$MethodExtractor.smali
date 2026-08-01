.class public Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MethodExtractor"
.end annotation


# instance fields
.field private final annotationTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;"
        }
    .end annotation
.end field

.field private defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final descriptor:Ljava/lang/String;

.field private final exceptionName:[Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final exceptionTypeAnnotationTokens:Ljava/util/Map;
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

.field private firstLabel:Lnet/bytebuddy/jar/asm/Label;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final internalName:Ljava/lang/String;

.field private invisibleParameterShift:I

.field private final legacyParameterBag:Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;

.field private final modifiers:I

.field private final parameterAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;"
        }
    .end annotation
.end field

.field private final parameterTokens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken;",
            ">;"
        }
    .end annotation
.end field

.field private final parameterTypeAnnotationTokens:Ljava/util/Map;
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

.field private final receiverTypeAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;"
        }
    .end annotation
.end field

.field private final returnTypeAnnotationTokens:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

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

.field private final typeVariableBoundAnnotationTokens:Ljava/util/Map;
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

.field private visibleParameterShift:I


# direct methods
.method public constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    sget p1, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->modifiers:I

    .line 9
    .line 10
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->internalName:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->genericSignature:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p6, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->exceptionName:[Ljava/lang/String;

    .line 17
    .line 18
    new-instance p1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 24
    .line 25
    new-instance p1, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 45
    .line 46
    new-instance p1, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 52
    .line 53
    new-instance p1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->annotationTokens:Ljava/util/List;

    .line 66
    .line 67
    new-instance p1, Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterAnnotationTokens:Ljava/util/Map;

    .line 73
    .line 74
    new-instance p1, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTokens:Ljava/util/List;

    .line 80
    .line 81
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;

    .line 82
    .line 83
    invoke-static {p4}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-direct {p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;-><init>([Lnet/bytebuddy/jar/asm/Type;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->legacyParameterBag:Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;

    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 0

    .line 1
    return-void
.end method

.method public register(Ljava/lang/String;Lnet/bytebuddy/description/annotation/AnnotationValue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 2
    .line 3
    return-void
.end method

.method public visitAnnotableParameterCount(IZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    array-length p2, p2

    .line 14
    sub-int/2addr p2, p1

    .line 15
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->visibleParameterShift:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/Type;->getArgumentTypes()[Lnet/bytebuddy/jar/asm/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    array-length p2, p2

    .line 27
    sub-int/2addr p2, p1

    .line 28
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->invisibleParameterShift:I

    .line 29
    .line 30
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 3

    .line 1
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->annotationTokens:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 8
    .line 9
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 10
    .line 11
    invoke-direct {v1, v2, p1}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p2, v0, p1, p0, v1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 15
    .line 16
    .line 17
    return-object p2
.end method

.method public visitAnnotationDefault()Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForArrayType;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->descriptor:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v2, v3}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForArrayType;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, p0, v2}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public visitEnd()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->access$5000(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;

    .line 10
    .line 11
    iget-object v3, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->internalName:Ljava/lang/String;

    .line 12
    .line 13
    iget v4, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->modifiers:I

    .line 14
    .line 15
    iget-object v5, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->descriptor:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v6, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->genericSignature:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v7, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->exceptionName:[Ljava/lang/String;

    .line 20
    .line 21
    iget-object v8, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 22
    .line 23
    iget-object v9, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 24
    .line 25
    iget-object v10, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v11, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 28
    .line 29
    iget-object v12, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 30
    .line 31
    iget-object v13, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 32
    .line 33
    iget-object v14, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->annotationTokens:Ljava/util/List;

    .line 34
    .line 35
    iget-object v15, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterAnnotationTokens:Ljava/util/Map;

    .line 36
    .line 37
    move-object/from16 v16, v2

    .line 38
    .line 39
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTokens:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->legacyParameterBag:Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;

    .line 48
    .line 49
    move-object/from16 v17, v3

    .line 50
    .line 51
    iget v3, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->modifiers:I

    .line 52
    .line 53
    and-int/lit8 v3, v3, 0x8

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v3, 0x0

    .line 60
    :goto_0
    invoke-virtual {v2, v3}, Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;->resolve(Z)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object/from16 v17, v3

    .line 66
    .line 67
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTokens:Ljava/util/List;

    .line 68
    .line 69
    :goto_1
    iget-object v0, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 70
    .line 71
    move-object/from16 v3, v16

    .line 72
    .line 73
    move-object/from16 v16, v2

    .line 74
    .line 75
    move-object v2, v3

    .line 76
    move-object/from16 v3, v17

    .line 77
    .line 78
    move-object/from16 v17, v0

    .line 79
    .line 80
    invoke-direct/range {v2 .. v17}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public visitLabel(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    iget-object v0, v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 4
    .line 5
    iget-object v0, v0, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 6
    .line 7
    invoke-virtual {v0}, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->isExtended()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->firstLabel:Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->firstLabel:Lnet/bytebuddy/jar/asm/Label;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public visitLocalVariable(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Label;Lnet/bytebuddy/jar/asm/Label;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 2
    .line 3
    iget-object p2, p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 4
    .line 5
    iget-object p2, p2, Lnet/bytebuddy/pool/TypePool$Default;->readerMode:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 6
    .line 7
    invoke-virtual {p2}, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->isExtended()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->firstLabel:Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    if-ne p4, p2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->legacyParameterBag:Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;

    .line 18
    .line 19
    invoke-virtual {p0, p6, p1}, Lnet/bytebuddy/pool/TypePool$Default$ParameterBag;->register(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public visitParameter(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTokens:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken;

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public visitParameterAnnotation(ILjava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->visibleParameterShift:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->invisibleParameterShift:I

    .line 11
    .line 12
    :goto_0
    add-int v3, p1, p3

    .line 13
    .line 14
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterAnnotationTokens:Ljava/util/Map;

    .line 15
    .line 16
    new-instance v5, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 17
    .line 18
    iget-object p0, v1, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 19
    .line 20
    invoke-direct {v5, p0, p2}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    move-object v2, p2

    .line 24
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Ljava/lang/String;ILjava/util/Map;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 6
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

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
    const/4 v0, 0x1

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const-string p0, "Unexpected type reference on method: "

    .line 21
    .line 22
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getSort()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1, p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;

    .line 32
    .line 33
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getExceptionIndex()I

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 38
    .line 39
    invoke-direct {p1, p3, p2, p4, v0}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;ILjava/util/Map;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    move-object v1, p3

    .line 43
    goto :goto_1

    .line 44
    :pswitch_1
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;

    .line 45
    .line 46
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getFormalParameterIndex()I

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 51
    .line 52
    invoke-direct {p1, p3, p2, p4, v0}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;ILjava/util/Map;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_2
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;

    .line 57
    .line 58
    iget-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 59
    .line 60
    invoke-direct {p1, p3, p2, p4}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_3
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;

    .line 65
    .line 66
    iget-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 67
    .line 68
    invoke-direct {p1, p3, p2, p4}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_4
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed;

    .line 73
    .line 74
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterBoundIndex()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterIndex()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 83
    .line 84
    move-object v2, p2

    .line 85
    move-object v1, p3

    .line 86
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex$DoubleIndexed;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;IILjava/util/Map;)V

    .line 87
    .line 88
    .line 89
    move-object p1, v0

    .line 90
    goto :goto_1

    .line 91
    :cond_0
    :pswitch_5
    const/4 p0, 0x0

    .line 92
    return-object p0

    .line 93
    :cond_1
    move-object v2, p2

    .line 94
    move-object v1, p3

    .line 95
    new-instance p1, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;

    .line 96
    .line 97
    invoke-virtual {p4}, Lnet/bytebuddy/jar/asm/TypeReference;->getTypeParameterIndex()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    iget-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 102
    .line 103
    invoke-direct {p1, v1, v2, p2, p3}, Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant$ForTypeVariable$WithIndex;-><init>(Ljava/lang/String;Lnet/bytebuddy/jar/asm/TypePath;ILjava/util/Map;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    new-instance p2, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;

    .line 107
    .line 108
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$MethodExtractor;->this$1:Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;

    .line 109
    .line 110
    new-instance p3, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;

    .line 111
    .line 112
    iget-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;->this$0:Lnet/bytebuddy/pool/TypePool$Default;

    .line 113
    .line 114
    invoke-direct {p3, p4, v1}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$ForAnnotationProperty;-><init>(Lnet/bytebuddy/pool/TypePool;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p2, p0, p1, p3}, Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor$AnnotationExtractor;-><init>(Lnet/bytebuddy/pool/TypePool$Default$TypeExtractor;Lnet/bytebuddy/pool/TypePool$Default$AnnotationRegistrant;Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;)V

    .line 118
    .line 119
    .line 120
    return-object p2

    .line 121
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
