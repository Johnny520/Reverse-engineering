.class final Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/dev/CherryDevServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HttpResponse"
.end annotation


# instance fields
.field private final body:Ljava/lang/String;

.field private final code:I

.field private final status:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x13904fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1390bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    iput-object p2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    iput-object p3, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->copy(ILjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 2

    const-wide v0, -0x13910fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13917fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    invoke-direct {v0, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    iget v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    iget v3, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    iget-object p1, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getCode()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    return v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1391cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->code:I

    const-wide v2, -0x1392ffffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->status:Ljava/lang/String;

    const-wide v2, -0x13939fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->body:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lph;->l(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
