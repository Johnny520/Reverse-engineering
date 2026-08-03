.class public final synthetic Ltm;
.super Lpj;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LCx;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, LF6;->b:Ljava/lang/Object;

    check-cast v0, Lum;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p2}, LCx;->k(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p1, p2}, LCx;->j(I)LCx;

    move-result-object p1

    invoke-interface {p1}, LCx;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Lum;->b:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
