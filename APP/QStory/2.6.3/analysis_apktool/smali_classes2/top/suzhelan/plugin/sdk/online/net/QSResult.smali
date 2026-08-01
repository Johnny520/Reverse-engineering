.class public final Ltop/suzhelan/plugin/sdk/online/net/QSResult;
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
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0008\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J4\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u00d6\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0004H\u00d6\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0007H\u00d6\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/net/QSResult;",
        "T",
        "",
        "status",
        "",
        "data",
        "message",
        "",
        "<init>",
        "(ILjava/lang/Object;Ljava/lang/String;)V",
        "getStatus",
        "()I",
        "getData",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "getMessage",
        "()Ljava/lang/String;",
        "isSuccess",
        "",
        "isError",
        "component1",
        "component2",
        "component3",
        "copy",
        "(ILjava/lang/Object;Ljava/lang/String;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "online-plugin-sdk_release"
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


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 8
    .line 9
    iput-object p2, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic copy$default(Ltop/suzhelan/plugin/sdk/online/net/QSResult;ILjava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget p1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->copy(ILjava/lang/Object;Ljava/lang/String;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(ILjava/lang/Object;Ljava/lang/String;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;",
            "Ljava/lang/String;",
            ")",
            "Ltop/suzhelan/plugin/sdk/online/net/QSResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Ltop/suzhelan/plugin/sdk/online/net/QSResult;-><init>(ILjava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
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
    instance-of v1, p1, Ltop/suzhelan/plugin/sdk/online/net/QSResult;

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
    check-cast p1, Ltop/suzhelan/plugin/sdk/online/net/QSResult;

    .line 12
    .line 13
    iget v1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 14
    .line 15
    iget v3, p1, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v3, p1, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

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
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
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
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    add-int/2addr v0, v1

    .line 20
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public final isError()Z
    .locals 1

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    const/16 v0, 0xc8

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final isSuccess()Z
    .locals 1

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    const/16 v0, 0xc8

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->status:I

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->data:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/net/QSResult;->message:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "QSResult(status="

    .line 10
    .line 11
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", data="

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", message="

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ")"

    .line 31
    .line 32
    invoke-static {v2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
