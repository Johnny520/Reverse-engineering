.class Lio/fastkv/Container$ArrayContainer;
.super Lio/fastkv/Container$VarContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/Container;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ArrayContainer"
.end annotation


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
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/fastkv/Container$BaseContainer;->getType()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    check-cast p1, Lio/fastkv/Container$ArrayContainer;

    .line 11
    .line 12
    iget-object p1, p1, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, p0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 15
    .line 16
    if-ne v0, p1, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_1
    if-eqz v0, :cond_3

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    instance-of v1, v0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1

    .line 33
    :cond_2
    instance-of v1, v0, [B

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    instance-of v1, p1, [B

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    check-cast v0, [B

    .line 42
    .line 43
    check-cast p1, [B

    .line 44
    .line 45
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    return v2
.end method

.method public getType()B
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    return v0
.end method
