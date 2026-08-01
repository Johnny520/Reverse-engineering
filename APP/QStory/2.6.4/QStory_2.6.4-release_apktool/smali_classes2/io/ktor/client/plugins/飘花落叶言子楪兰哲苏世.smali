.class public final Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

.field public 飘花落叶言子楪世苏哲兰:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const-class v1, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    const-string v0, "TimeoutConfiguration"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲兰世苏楪(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string v0, "Name can\'t be blank"

    .line 21
    .line 22
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 11
    .line 12
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 13
    .line 14
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 18
    .line 19
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 20
    .line 21
    iput-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 22
    .line 23
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Long;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p0, v0, v2

    .line 10
    .line 11
    if-lez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS"

    .line 15
    .line 16
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    const-class v2, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;

    .line 18
    .line 19
    iget-object v2, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 20
    .line 21
    iget-object v3, p1, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v2, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 31
    .line 32
    iget-object v3, p1, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    iget-object p0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 42
    .line 43
    iget-object p1, p1, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 44
    .line 45
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_4

    .line 50
    .line 51
    return v1

    .line 52
    :cond_4
    return v0

    .line 53
    :cond_5
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Ljava/lang/Long;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Long;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, Lio/ktor/client/plugins/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Long;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :cond_2
    add-int/2addr v0, v1

    .line 36
    return v0
.end method
