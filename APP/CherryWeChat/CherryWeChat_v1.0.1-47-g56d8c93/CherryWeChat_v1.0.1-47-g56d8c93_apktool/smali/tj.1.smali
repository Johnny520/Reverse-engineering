.class public abstract Ltj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LKr;
.implements Ljava/lang/Cloneable;


# instance fields
.field public final a:Lvj;

.field public b:Lvj;


# direct methods
.method public constructor <init>(Lvj;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltj;->a:Lvj;

    invoke-virtual {p1}, Lvj;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lvj;->q()Lvj;

    move-result-object p1

    iput-object p1, p0, Ltj;->b:Lvj;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, LHu;->c:LHu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lmx;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()Lvj;
    .locals 2

    invoke-virtual {p0}, Ltj;->c()Lvj;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lvj;->m(Lvj;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LRC;

    invoke-direct {v0}, LRC;-><init>()V

    throw v0
.end method

.method public final c()Lvj;
    .locals 3

    iget-object v0, p0, Ltj;->b:Lvj;

    invoke-virtual {v0}, Lvj;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltj;->b:Lvj;

    return-object v0

    :cond_0
    iget-object v0, p0, Ltj;->b:Lvj;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LHu;->c:LHu;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, LHu;->a(Ljava/lang/Class;)Lmx;

    move-result-object v1

    invoke-interface {v1, v0}, Lmx;->d(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lvj;->o()V

    iget-object v0, p0, Ltj;->b:Lvj;

    return-object v0
.end method

.method public final d()Ltj;
    .locals 2

    iget-object v0, p0, Ltj;->a:Lvj;

    invoke-virtual {v0}, Lvj;->p()Ltj;

    move-result-object v0

    invoke-virtual {p0}, Ltj;->c()Lvj;

    move-result-object v1

    iput-object v1, v0, Ltj;->b:Lvj;

    return-object v0
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ltj;->b:Lvj;

    invoke-virtual {v0}, Lvj;->n()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltj;->a:Lvj;

    invoke-virtual {v0}, Lvj;->q()Lvj;

    move-result-object v0

    iget-object v1, p0, Ltj;->b:Lvj;

    invoke-static {v0, v1}, Ltj;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Ltj;->b:Lvj;

    :cond_0
    return-void
.end method
