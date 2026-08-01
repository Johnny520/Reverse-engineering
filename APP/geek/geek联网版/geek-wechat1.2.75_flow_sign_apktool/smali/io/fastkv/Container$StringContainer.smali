.class Lio/fastkv/Container$StringContainer;
.super Lio/fastkv/Container$VarContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/Container;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StringContainer"
.end annotation


# direct methods
.method public constructor <init>(IILjava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lio/fastkv/Container$VarContainer;-><init>(IILjava/lang/Object;IZ)V

    .line 2
    .line 3
    .line 4
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
    const/4 v1, 0x6

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    check-cast p1, Lio/fastkv/Container$StringContainer;

    .line 9
    .line 10
    iget-boolean v0, p1, Lio/fastkv/Container$VarContainer;->external:Z

    .line 11
    .line 12
    iget-boolean v1, p0, Lio/fastkv/Container$VarContainer;->external:Z

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, p0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    return p1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    return p1
.end method

.method public getType()B
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    return v0
.end method
