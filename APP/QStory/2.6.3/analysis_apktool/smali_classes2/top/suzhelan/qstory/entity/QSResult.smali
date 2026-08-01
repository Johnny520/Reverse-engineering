.class public Ltop/suzhelan/qstory/entity/QSResult;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private action:I

.field private code:I

.field private data:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private msg:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getAction()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/QSResult;->action:I

    .line 2
    .line 3
    return p0
.end method

.method public getCode()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/QSResult;->code:I

    .line 2
    .line 3
    return p0
.end method

.method public getData()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QSResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/QSResult;->msg:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isSuccess()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/QSResult;->getCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0xc8

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public setAction(I)Ltop/suzhelan/qstory/entity/QSResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/entity/QSResult;->action:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setCode(I)Ltop/suzhelan/qstory/entity/QSResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/entity/QSResult;->code:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setData(Ljava/lang/Object;)Ltop/suzhelan/qstory/entity/QSResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QSResult;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public setMsg(Ljava/lang/String;)Ltop/suzhelan/qstory/entity/QSResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ltop/suzhelan/qstory/entity/QSResult<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/QSResult;->msg:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
