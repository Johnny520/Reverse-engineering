.class public abstract Lg/v;
.super Lg/q;
.source "SourceFile"


# instance fields
.field private final c:Lk/p;


# direct methods
.method public constructor <init>(Lk/p;)V
    .locals 1

    invoke-virtual {p1}, Lk/p;->g()Lk/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lg/q;-><init>(Lk/u;)V

    iput-object p1, p0, Lg/v;->c:Lk/p;

    return-void
.end method


# virtual methods
.method public a(Lg/k;)V
    .locals 1

    invoke-super {p0, p1}, Lg/q;->a(Lg/k;)V

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object p1

    iget-object v0, p0, Lg/v;->c:Lk/p;

    invoke-virtual {v0}, Lk/p;->h()Lk/r;

    move-result-object v0

    invoke-virtual {v0}, Lk/r;->h()Lk/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg/x;->u(Lk/t;)V

    return-void
.end method

.method public final c()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 5

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object v1

    iget-object v2, p0, Lg/v;->c:Lk/p;

    invoke-virtual {v2}, Lk/p;->h()Lk/r;

    move-result-object v3

    invoke-virtual {p0}, Lg/q;->i()Lk/u;

    move-result-object v4

    invoke-virtual {v0, v4}, Lg/x;->r(Lk/u;)I

    move-result v0

    invoke-virtual {v3}, Lk/r;->h()Lk/t;

    move-result-object v3

    invoke-virtual {v1, v3}, Lg/x;->q(Lk/t;)I

    move-result v1

    invoke-virtual {p0, p1}, Lg/v;->k(Lg/k;)I

    move-result p1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/r;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lk/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v0}, La/b;->q(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "  class_idx: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {p2, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/v;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, La/b;->q(I)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    const-string v4, "  %-10s %s"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "  name_idx:  "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p2, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p2, v0}, Ln/d;->r(I)V

    invoke-virtual {p2, p1}, Ln/d;->r(I)V

    invoke-virtual {p2, v1}, Ln/d;->q(I)V

    return-void
.end method

.method public final j()Lk/p;
    .locals 1

    iget-object v0, p0, Lg/v;->c:Lk/p;

    return-object v0
.end method

.method protected abstract k(Lg/k;)I
.end method

.method protected abstract l()Ljava/lang/String;
.end method
