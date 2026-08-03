.class public abstract LEw;
.super Lu5;
.source ""


# direct methods
.method public constructor <init>(LEb;)V
    .locals 1

    invoke-direct {p0, p1}, Lu5;-><init>(LEb;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, LEb;->e()Lac;

    move-result-object p1

    sget-object v0, LIf;->a:LIf;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final e()Lac;
    .locals 1

    sget-object v0, LIf;->a:LIf;

    return-object v0
.end method
