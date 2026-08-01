.class public final Ltop/suzhelan/sticker/sdk/net/StickerResult;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\t\u0010\u0018\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J>\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00162\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00d6\u0083\u0004J\n\u0010 \u001a\u00020\u0004H\u00d6\u0081\u0004J\n\u0010!\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\""
    }
    d2 = {
        "Ltop/suzhelan/sticker/sdk/net/StickerResult;",
        "T",
        "",
        "status",
        "",
        "message",
        "",
        "timestamp",
        "",
        "data",
        "<init>",
        "(ILjava/lang/String;JLjava/lang/Object;)V",
        "getStatus",
        "()I",
        "getMessage",
        "()Ljava/lang/String;",
        "getTimestamp",
        "()J",
        "getData",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "isSuccess",
        "",
        "isError",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ILjava/lang/String;JLjava/lang/Object;)Ltop/suzhelan/sticker/sdk/net/StickerResult;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "online-sticker-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final message:Ljava/lang/String;

.field private final status:I

.field private final timestamp:J


# direct methods
.method public constructor <init>(ILjava/lang/String;JLjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "JTT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 8
    .line 9
    iput-object p2, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p3, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 12
    .line 13
    iput-object p5, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic copy$default(Ltop/suzhelan/sticker/sdk/net/StickerResult;ILjava/lang/String;JLjava/lang/Object;ILjava/lang/Object;)Ltop/suzhelan/sticker/sdk/net/StickerResult;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget p1, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-wide p3, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 20
    .line 21
    if-eqz p6, :cond_3

    .line 22
    .line 23
    iget-object p5, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 24
    .line 25
    :cond_3
    move-object p7, p5

    .line 26
    move-wide p5, p3

    .line 27
    move p3, p1

    .line 28
    move-object p4, p2

    .line 29
    move-object p2, p0

    .line 30
    invoke-virtual/range {p2 .. p7}, Ltop/suzhelan/sticker/sdk/net/StickerResult;->copy(ILjava/lang/String;JLjava/lang/Object;)Ltop/suzhelan/sticker/sdk/net/StickerResult;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component4()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(ILjava/lang/String;JLjava/lang/Object;)Ltop/suzhelan/sticker/sdk/net/StickerResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "JTT;)",
            "Ltop/suzhelan/sticker/sdk/net/StickerResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;

    .line 5
    .line 6
    invoke-direct/range {p0 .. p5}, Ltop/suzhelan/sticker/sdk/net/StickerResult;-><init>(ILjava/lang/String;JLjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;

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
    check-cast p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;

    .line 12
    .line 13
    iget v1, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 14
    .line 15
    iget v3, p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 32
    .line 33
    iget-wide v5, p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 34
    .line 35
    cmp-long v1, v3, v5

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    return v2

    .line 40
    :cond_4
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object p1, p1, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    return v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    :goto_0
    add-int/2addr v0, p0

    .line 33
    return v0
.end method

.method public final isError()Z
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final isSuccess()Z
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->status:I

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->message:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->timestamp:J

    .line 6
    .line 7
    iget-object p0, p0, Ltop/suzhelan/sticker/sdk/net/StickerResult;->data:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v5, "StickerResult(status="

    .line 12
    .line 13
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", message="

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", timestamp="

    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", data="

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
