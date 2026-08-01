.class public final Ltop/suzhelan/qstory/entity/Notice;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltop/suzhelan/qstory/entity/Notice;",
        "",
        "content",
        "",
        "createTime",
        "Ljava/time/LocalDateTime;",
        "operator",
        "title",
        "version",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)V",
        "getContent",
        "()Ljava/lang/String;",
        "getCreateTime",
        "()Ljava/time/LocalDateTime;",
        "getOperator",
        "getTitle",
        "getVersion",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final content:Ljava/lang/String;

.field private final createTime:Ljava/time/LocalDateTime;

.field private final operator:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final version:I


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 72
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Ltop/suzhelan/qstory/entity/Notice;-><init>(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    const-wide v0, -0x36a50b1c051405a7L    # -2.4046094022348125E45

    const-wide v2, -0x36a58b30051405a7L    # -2.3599806892483975E45

    .line 64
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x36a58b3b051405a7L    # -2.359965716824253E45

    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v0, -0x36a58b2c051405a7L    # -2.3599861337662683E45

    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 68
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 69
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 70
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 71
    iput p5, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 4

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const-wide v0, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz p7, :cond_0

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 15
    .line 16
    if-eqz p7, :cond_1

    .line 17
    .line 18
    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-wide v2, -0x36a58b2a051405a7L    # -2.3599888560252036E45

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 34
    .line 35
    if-eqz p7, :cond_2

    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 42
    .line 43
    if-eqz p7, :cond_3

    .line 44
    .line 45
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p4

    .line 49
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 50
    .line 51
    if-eqz p6, :cond_4

    .line 52
    .line 53
    const/4 p5, 0x0

    .line 54
    :cond_4
    move-object p6, p4

    .line 55
    move p7, p5

    .line 56
    move-object p4, p2

    .line 57
    move-object p5, p3

    .line 58
    move-object p2, p0

    .line 59
    move-object p3, p1

    .line 60
    invoke-direct/range {p2 .. p7}, Ltop/suzhelan/qstory/entity/Notice;-><init>(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static synthetic copy$default(Ltop/suzhelan/qstory/entity/Notice;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ltop/suzhelan/qstory/entity/Notice;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 20
    .line 21
    if-eqz p7, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    iget p5, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

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
    invoke-virtual/range {p2 .. p7}, Ltop/suzhelan/qstory/entity/Notice;->copy(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)Ltop/suzhelan/qstory/entity/Notice;

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
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/time/LocalDateTime;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)Ltop/suzhelan/qstory/entity/Notice;
    .locals 4

    .line 1
    const-wide v0, -0x36a50b1c051405a7L    # -2.4046094022348125E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v2, -0x36a58b30051405a7L    # -2.3599806892483975E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲(JJLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x36a58b3b051405a7L    # -2.359965716824253E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-wide v0, -0x36a58b2c051405a7L    # -2.3599861337662683E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance p0, Ltop/suzhelan/qstory/entity/Notice;

    .line 40
    .line 41
    invoke-direct/range {p0 .. p5}, Ltop/suzhelan/qstory/entity/Notice;-><init>(Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
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
    instance-of v1, p1, Ltop/suzhelan/qstory/entity/Notice;

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
    check-cast p1, Ltop/suzhelan/qstory/entity/Notice;

    .line 12
    .line 13
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 25
    .line 26
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget p0, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 58
    .line 59
    iget p1, p1, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 60
    .line 61
    if-eq p0, p1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTime()Ljava/time/LocalDateTime;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOperator()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVersion()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget p0, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a58b13051405a7L    # -2.3600201620029604E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->content:Ljava/lang/String;

    .line 19
    .line 20
    const-wide v2, -0x36a58b03051405a7L    # -2.3600419400744433E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->createTime:Ljava/time/LocalDateTime;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-wide v1, -0x36a58af1051405a7L    # -2.3600664404048616E45

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->operator:Ljava/lang/String;

    .line 46
    .line 47
    const-wide v2, -0x36a58ae5051405a7L    # -2.3600827739584738E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/Notice;->title:Ljava/lang/String;

    .line 56
    .line 57
    const-wide v2, -0x36a58b4d051405a7L    # -2.3599412164938347E45

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 63
    .line 64
    .line 65
    iget p0, p0, Ltop/suzhelan/qstory/entity/Notice;->version:I

    .line 66
    .line 67
    const/16 v1, 0x29

    .line 68
    .line 69
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
