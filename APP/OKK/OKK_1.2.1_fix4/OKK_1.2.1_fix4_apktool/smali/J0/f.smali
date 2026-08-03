.class public abstract LJ0/f;
.super LJ0/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(LH0/a;)V
    .locals 1

    invoke-direct {p0, p1}, LJ0/a;-><init>(LH0/a;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, LH0/a;->c()LH0/d;

    move-result-object p1

    sget-object v0, LH0/e;->a:LH0/e;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final c()LH0/d;
    .locals 1

    sget-object v0, LH0/e;->a:LH0/e;

    return-object v0
.end method
