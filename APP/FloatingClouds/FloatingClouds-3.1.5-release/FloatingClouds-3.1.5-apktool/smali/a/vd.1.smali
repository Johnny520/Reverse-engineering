.class public abstract La/vd;
.super La/W1;
.source "SourceFile"


# direct methods
.method public constructor <init>(La/a4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a4<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, La/W1;-><init>(La/a4;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, La/a4;->c()La/x4;

    move-result-object p1

    sget-object v0, La/W5;->a:La/W5;

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
.method public final c()La/x4;
    .locals 1

    sget-object v0, La/W5;->a:La/W5;

    return-object v0
.end method
