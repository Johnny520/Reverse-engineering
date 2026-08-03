.class public abstract Lbc;
.super Lv;
.source ""

# interfaces
.implements LYb;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lgf;->b:Lgf;

    invoke-direct {p0, v0}, Lv;-><init>(LZb;)V

    return-void
.end method


# virtual methods
.method public final m(LZb;)LYb;
    .locals 2

    instance-of v0, p1, Lw;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lw;

    iget-object v0, p0, Lv;->a:LZb;

    if-eq v0, p1, :cond_0

    return-object v1

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    sget-object v0, Lgf;->b:Lgf;

    if-ne v0, p1, :cond_2

    return-object p0

    :cond_2
    return-object v1
.end method

.method public final s(LZb;)Lac;
    .locals 1

    instance-of v0, p1, Lw;

    if-eqz v0, :cond_1

    check-cast p1, Lw;

    iget-object v0, p0, Lv;->a:LZb;

    if-eq v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    sget-object v0, Lgf;->b:Lgf;

    if-ne v0, p1, :cond_2

    sget-object p1, LIf;->a:LIf;

    return-object p1

    :cond_2
    return-object p0
.end method

.method public abstract t(Lac;Ljava/lang/Runnable;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LDc;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Lac;)Z
    .locals 0

    instance-of p1, p0, LuC;

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public v(I)Lbc;
    .locals 1

    invoke-static {p1}, LOj;->i(I)V

    new-instance v0, Leo;

    invoke-direct {v0, p0, p1}, Leo;-><init>(Lbc;I)V

    return-object v0
.end method
