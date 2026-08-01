.class Lio/fastkv/Container$ObjectContainer;
.super Lio/fastkv/Container$VarContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/Container;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ObjectContainer"
.end annotation


# instance fields
.field encoder:Lio/fastkv/interfaces/FastEncoder;


# direct methods
.method public constructor <init>(IILjava/lang/Object;IZ)V
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
    const/16 v1, 0x8

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    check-cast p1, Lio/fastkv/Container$ObjectContainer;

    .line 10
    .line 11
    iget-object p1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, p0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public getType()B
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    return v0
.end method
