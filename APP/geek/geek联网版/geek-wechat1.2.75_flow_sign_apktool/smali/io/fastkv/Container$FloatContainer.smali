.class Lio/fastkv/Container$FloatContainer;
.super Lio/fastkv/Container$BaseContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/Container;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FloatContainer"
.end annotation


# instance fields
.field value:F


# direct methods
.method public constructor <init>(IF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/Container$BaseContainer;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 5
    .line 6
    iput p2, p0, Lio/fastkv/Container$FloatContainer;->value:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equalTo(Lio/fastkv/Container$BaseContainer;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    check-cast p1, Lio/fastkv/Container$FloatContainer;

    .line 9
    .line 10
    iget p1, p1, Lio/fastkv/Container$FloatContainer;->value:F

    .line 11
    .line 12
    iget v0, p0, Lio/fastkv/Container$FloatContainer;->value:F

    .line 13
    .line 14
    cmpl-float p1, p1, v0

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public getType()B
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    return v0
.end method
