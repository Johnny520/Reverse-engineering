.class public final synthetic Luc3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lvn0;


# virtual methods
.method public final a()Lyn0;
    .locals 8

    .line 1
    new-instance v0, Lyn0;

    .line 2
    .line 3
    sget-object v2, Lgd3;->i:Lgd3;

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    const-class v3, Lgd3;

    .line 9
    .line 10
    const-string v4, "sendText"

    .line 11
    .line 12
    const-string v5, "sendText(Ljava/lang/String;Ljava/lang/String;)Lnuke/module/wechat/sdk/SendMsgResult;"

    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lyn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Luc3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Luc3;->a()Lyn0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, Lvn0;

    .line 10
    .line 11
    invoke-interface {p1}, Lvn0;->a()Lyn0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lyn0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Luc3;->a()Lyn0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lyn0;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
