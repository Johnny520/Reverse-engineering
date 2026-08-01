.class public final Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/DexKitCacheBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "QuerySuccessEvent"
.end annotation


# instance fields
.field private final appTag:Ljava/lang/String;

.field private final matchCount:I

.field private final queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

.field private final requestKey:Ljava/lang/String;

.field private final source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 16
    .line 17
    iput-object p3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 20
    .line 21
    iput p5, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic copy$default(Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;IILjava/lang/Object;)Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 20
    .line 21
    if-eqz p7, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    iget p5, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 30
    .line 31
    :cond_4
    move-object p6, p4

    .line 32
    move p7, p5

    .line 33
    move-object p4, p2

    .line 34
    move-object p5, p3

    .line 35
    move-object p2, p0

    .line 36
    move-object p3, p1

    .line 37
    invoke-virtual/range {p2 .. p7}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->copy(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p5}, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;-><init>(Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;Ljava/lang/String;Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;I)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;

    .line 12
    .line 13
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 25
    .line 26
    iget-object v3, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Li5;->p(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 43
    .line 44
    iget-object v3, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 50
    .line 51
    iget p1, p1, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 52
    .line 53
    if-eq p0, p1, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    return v0
.end method

.method public final getAppTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMatchCount()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getQueryKind()Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRequestKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    add-int/2addr v1, v0

    .line 29
    mul-int/lit8 v1, v1, 0x1f

    .line 30
    .line 31
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->appTag:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->queryKind:Lorg/luckypray/dexkit/DexKitCacheBridge$QueryKind;

    .line 4
    .line 5
    iget-object v2, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->requestKey:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->source:Lorg/luckypray/dexkit/DexKitCacheBridge$ResultSource;

    .line 8
    .line 9
    iget p0, p0, Lorg/luckypray/dexkit/DexKitCacheBridge$QuerySuccessEvent;->matchCount:I

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "QuerySuccessEvent(appTag="

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", queryKind="

    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", requestKey="

    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", source="

    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", matchCount="

    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
