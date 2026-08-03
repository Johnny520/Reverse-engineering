.class public final LEp;
.super LCp;
.source ""


# instance fields
.field public d:Lcg;


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lpw;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-interface {p1}, Lpw;->b()I

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, LSm;

    check-cast p2, Lpw;

    iget-object p1, p0, LEp;->d:Lcg;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object p1, p1, Lcg;->e:LY5;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, LY5;->d(Lpw;Z)V

    :cond_0
    return-void
.end method
