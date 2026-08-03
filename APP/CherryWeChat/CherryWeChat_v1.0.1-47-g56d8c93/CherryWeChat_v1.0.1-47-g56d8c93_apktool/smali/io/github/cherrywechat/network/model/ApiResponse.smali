.class public final Lio/github/cherrywechat/network/model/ApiResponse;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/network/model/ApiResponse$$serializer;,
        Lio/github/cherrywechat/network/model/ApiResponse$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final $cachedDescriptor:LCx;

.field public static final Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;


# instance fields
.field private final code:I

.field private final data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final message:Ljava/lang/String;

.field private final msg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;-><init>(LOc;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    new-instance v0, LSt;

    const-string v2, "io.github.cherrywechat.network.model.ApiResponse"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v1, v3}, LSt;-><init>(Ljava/lang/String;Lwj;I)V

    const-string v1, "code"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "msg"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "message"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    const-string v1, "data"

    invoke-virtual {v0, v1}, LSt;->l(Ljava/lang/String;)V

    sput-object v0, Lio/github/cherrywechat/network/model/ApiResponse;->$cachedDescriptor:LCx;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lio/github/cherrywechat/network/model/ApiResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILOc;)V

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;LGx;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    if-nez p6, :cond_0

    const/4 p2, -0x1

    :cond_0
    iput p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    and-int/lit8 p2, p1, 0x2

    const-string p6, ""

    if-nez p2, :cond_1

    iput-object p6, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    return-void

    :cond_3
    iput-object p5, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    .line 5
    iput-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILOc;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    const-string v0, ""

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/ApiResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/network/model/ApiResponse;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Lio/github/cherrywechat/network/model/ApiResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/ApiResponse;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/github/cherrywechat/network/model/ApiResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$app_release(Lio/github/cherrywechat/network/model/ApiResponse;LWa;LCx;LQm;)V
    .locals 1

    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    :goto_0
    iget p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    invoke-interface {p1}, LWa;->e()V

    :cond_1
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    const-string v0, ""

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    :goto_1
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_3
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    invoke-static {p2, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    :goto_2
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    invoke-interface {p1}, LWa;->d()V

    :cond_5
    invoke-interface {p1}, LWa;->g()Z

    move-result p2

    if-eqz p2, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    if-eqz p2, :cond_7

    :goto_3
    check-cast p3, LQm;

    iget-object p0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    invoke-interface {p1}, LWa;->f()V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lio/github/cherrywechat/network/model/ApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "TT;)",
            "Lio/github/cherrywechat/network/model/ApiResponse<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/github/cherrywechat/network/model/ApiResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/network/model/ApiResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/network/model/ApiResponse;

    iget v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    iget v3, p1, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    iget-object p1, p1, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCode()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    return v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ApiResponse(code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->code:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", msg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->msg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/network/model/ApiResponse;->data:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
