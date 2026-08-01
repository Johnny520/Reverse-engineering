.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MethodToken"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
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

.field private final defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
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

.field private final genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field

.field private final modifiers:I

.field private final name:Ljava/lang/String;

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

.field private final signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

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


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;)V
    .locals 1
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p15    # Lnet/bytebuddy/description/annotation/AnnotationValue;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken$ParameterToken;",
            ">;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x20001

    .line 5
    .line 6
    .line 7
    and-int/2addr p2, v0

    .line 8
    iput p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->modifiers:I

    .line 9
    .line 10
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->name:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->genericSignature:Ljava/lang/String;

    .line 15
    .line 16
    sget-boolean p1, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p4}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$ForSignature$OfMethod;->extract(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 28
    .line 29
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionName:[Ljava/lang/String;

    .line 30
    .line 31
    iput-object p6, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 32
    .line 33
    iput-object p7, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 34
    .line 35
    iput-object p8, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 36
    .line 37
    iput-object p9, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 38
    .line 39
    iput-object p10, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 40
    .line 41
    iput-object p11, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 42
    .line 43
    iput-object p12, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->annotationTokens:Ljava/util/List;

    .line 44
    .line 45
    iput-object p13, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterAnnotationTokens:Ljava/util/Map;

    .line 46
    .line 47
    iput-object p14, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTokens:Ljava/util/List;

    .line 48
    .line 49
    move-object/from16 p1, p15

    .line 50
    .line 51
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 52
    .line 53
    return-void
.end method

.method public static synthetic access$1700(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->toMethodDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private toMethodDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyMethodDescription;

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->name:Ljava/lang/String;

    .line 9
    .line 10
    iget v3, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->modifiers:I

    .line 11
    .line 12
    iget-object v4, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->genericSignature:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v6, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 17
    .line 18
    iget-object v7, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionName:[Ljava/lang/String;

    .line 19
    .line 20
    iget-object v8, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 21
    .line 22
    iget-object v9, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v10, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v11, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 27
    .line 28
    iget-object v12, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 29
    .line 30
    iget-object v13, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 31
    .line 32
    iget-object v14, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->annotationTokens:Ljava/util/List;

    .line 33
    .line 34
    iget-object v15, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterAnnotationTokens:Ljava/util/Map;

    .line 35
    .line 36
    move-object/from16 v16, v1

    .line 37
    .line 38
    iget-object v1, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTokens:Ljava/util/List;

    .line 39
    .line 40
    iget-object v0, v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 41
    .line 42
    const/16 v18, 0x0

    .line 43
    .line 44
    move-object/from16 v17, v0

    .line 45
    .line 46
    move-object/from16 v0, v16

    .line 47
    .line 48
    move-object/from16 v16, v1

    .line 49
    .line 50
    move-object/from16 v1, p1

    .line 51
    .line 52
    invoke-direct/range {v0 .. v18}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyMethodDescription;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;[Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->modifiers:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->modifiers:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->name:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->name:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->descriptor:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->descriptor:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->genericSignature:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->genericSignature:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 63
    .line 64
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionName:[Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionName:[Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 85
    .line 86
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_9

    .line 93
    .line 94
    return v1

    .line 95
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 96
    .line 97
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 107
    .line 108
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_b

    .line 115
    .line 116
    return v1

    .line 117
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 118
    .line 119
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 120
    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_c

    .line 126
    .line 127
    return v1

    .line 128
    :cond_c
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 129
    .line 130
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_d

    .line 137
    .line 138
    return v1

    .line 139
    :cond_d
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 140
    .line 141
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-nez v2, :cond_e

    .line 148
    .line 149
    return v1

    .line 150
    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->annotationTokens:Ljava/util/List;

    .line 151
    .line 152
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->annotationTokens:Ljava/util/List;

    .line 153
    .line 154
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_f

    .line 159
    .line 160
    return v1

    .line 161
    :cond_f
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterAnnotationTokens:Ljava/util/Map;

    .line 162
    .line 163
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterAnnotationTokens:Ljava/util/Map;

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_10

    .line 170
    .line 171
    return v1

    .line 172
    :cond_10
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTokens:Ljava/util/List;

    .line 173
    .line 174
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTokens:Ljava/util/List;

    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_11

    .line 181
    .line 182
    return v1

    .line 183
    :cond_11
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 184
    .line 185
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p0

    .line 191
    if-nez p0, :cond_12

    .line 192
    .line 193
    return v1

    .line 194
    :cond_12
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->modifiers:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->descriptor:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->genericSignature:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForMethod;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionName:[Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableAnnotationTokens:Ljava/util/Map;

    .line 51
    .line 52
    invoke-static {v0, v2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->typeVariableBoundAnnotationTokens:Ljava/util/Map;

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->returnTypeAnnotationTokens:Ljava/util/Map;

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTypeAnnotationTokens:Ljava/util/Map;

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->exceptionTypeAnnotationTokens:Ljava/util/Map;

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->receiverTypeAnnotationTokens:Ljava/util/Map;

    .line 81
    .line 82
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->annotationTokens:Ljava/util/List;

    .line 87
    .line 88
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterAnnotationTokens:Ljava/util/Map;

    .line 93
    .line 94
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->parameterTokens:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$MethodToken;->defaultValue:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    add-int/2addr p0, v0

    .line 111
    return p0
.end method
