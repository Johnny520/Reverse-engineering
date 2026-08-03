.class public interface abstract LwE;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public a(Ljava/lang/Class;)LuE;
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/Class;Lts;)LuE;
    .locals 0

    invoke-interface {p0, p1}, LwE;->a(Ljava/lang/Class;)LuE;

    move-result-object p1

    return-object p1
.end method
