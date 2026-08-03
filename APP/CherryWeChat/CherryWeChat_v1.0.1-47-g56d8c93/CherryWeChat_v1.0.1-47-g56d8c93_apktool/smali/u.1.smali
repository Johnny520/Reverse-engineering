.class public abstract Lu;
.super Lkm;
.source ""

# interfaces
.implements LEb;
.implements Lfc;


# instance fields
.field public final c:Lac;


# direct methods
.method public constructor <init>(Lac;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lkm;-><init>(Z)V

    sget-object p2, Lgf;->f:Lgf;

    invoke-interface {p1, p2}, Lac;->m(LZb;)LYb;

    move-result-object p2

    check-cast p2, Ldm;

    invoke-virtual {p0, p2}, Lkm;->B(Ldm;)V

    invoke-interface {p1, p0}, Lac;->l(Lac;)Lac;

    move-result-object p1

    iput-object p1, p0, Lu;->c:Lac;

    return-void
.end method


# virtual methods
.method public final A(LFa;)V
    .locals 1

    iget-object v0, p0, Lu;->c:Lac;

    invoke-static {v0, p1}, LOj;->B(Lac;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final H(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, LEa;

    if-eqz v0, :cond_0

    check-cast p1, LEa;

    sget-object v0, LEa;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    :cond_0
    return-void
.end method

.method public final a()Lac;
    .locals 1

    iget-object v0, p0, Lu;->c:Lac;

    return-object v0
.end method

.method public final e()Lac;
    .locals 1

    iget-object v0, p0, Lu;->c:Lac;

    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LEa;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LEa;-><init>(Ljava/lang/Throwable;Z)V

    :goto_0
    invoke-virtual {p0, p1}, Lkm;->E(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LGu;->c:Lv1;

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lu;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
