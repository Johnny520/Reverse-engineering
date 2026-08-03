.class public final Le/f;
.super Le/G;
.source "SourceFile"


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected final q()Ljava/lang/String;
    .locals 1

    const-string v0, "code-address"

    return-object v0
.end method

.method public final w(Lj/o;)Le/j;
    .locals 1

    new-instance p1, Le/f;

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v0

    invoke-direct {p1, v0}, Le/f;-><init>(Lj/s;)V

    return-object p1
.end method
