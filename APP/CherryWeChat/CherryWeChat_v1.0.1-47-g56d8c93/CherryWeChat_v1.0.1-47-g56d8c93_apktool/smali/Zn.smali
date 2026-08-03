.class public final LZn;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:LPn;

.field public b:LUn;


# virtual methods
.method public final a(LYn;LOn;)V
    .locals 3

    invoke-virtual {p2}, LOn;->a()LPn;

    move-result-object v0

    iget-object v1, p0, LZn;->a:LPn;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    move-object v1, v0

    :cond_0
    iput-object v1, p0, LZn;->a:LPn;

    iget-object v1, p0, LZn;->b:LUn;

    invoke-interface {v1, p1, p2}, LUn;->onStateChanged(LYn;LOn;)V

    iput-object v0, p0, LZn;->a:LPn;

    return-void
.end method
