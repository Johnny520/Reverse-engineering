.class public Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecordComponentToken"
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

.field private final descriptor:Ljava/lang/String;

.field private final genericSignature:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

.field private final typeAnnotationTokens:Ljava/util/Map;
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


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;>;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$AnnotationToken;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->descriptor:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->genericSignature:Ljava/lang/String;

    .line 9
    .line 10
    sget-boolean p1, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$Raw;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p3}, Lnet/bytebuddy/pool/TypePool$Default$GenericTypeExtractor$ForSignature$OfRecordComponent;->extract(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 22
    .line 23
    iput-object p4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->typeAnnotationTokens:Ljava/util/Map;

    .line 24
    .line 25
    iput-object p5, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->annotationTokens:Ljava/util/List;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic access$1900(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->toRecordComponentDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private toRecordComponentDescription(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;)Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyRecordComponentDescription;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->name:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->descriptor:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->genericSignature:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 13
    .line 14
    iget-object v6, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->typeAnnotationTokens:Ljava/util/Map;

    .line 15
    .line 16
    iget-object v7, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->annotationTokens:Ljava/util/List;

    .line 17
    .line 18
    const/4 v8, 0x0

    .line 19
    move-object v1, p1

    .line 20
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$LazyRecordComponentDescription;-><init>(Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;Ljava/util/Map;Ljava/util/List;Lnet/bytebuddy/pool/TypePool$1;)V

    .line 21
    .line 22
    .line 23
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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->descriptor:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->descriptor:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->genericSignature:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->genericSignature:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->typeAnnotationTokens:Ljava/util/Map;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->typeAnnotationTokens:Ljava/util/Map;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->annotationTokens:Ljava/util/List;

    .line 78
    .line 79
    iget-object p1, p1, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->annotationTokens:Ljava/util/List;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
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
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->descriptor:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->genericSignature:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->signatureResolution:Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$GenericTypeToken$Resolution$ForRecordComponent;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    mul-int/2addr v2, v1

    .line 38
    iget-object v0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->typeAnnotationTokens:Ljava/util/Map;

    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, Lnet/bytebuddy/pool/TypePool$Default$LazyTypeDescription$RecordComponentToken;->annotationTokens:Ljava/util/List;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p0, v0

    .line 51
    return p0
.end method
