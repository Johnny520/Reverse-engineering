.class public abstract Lm1/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Lfg/l;


# virtual methods
.method public abstract a(Lh1/d;)V
.end method

.method public b()Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lm1/c0;->a:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm1/c0;->b()Lfg/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Lb1/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm1/c0;->a:Lfg/l;

    .line 2
    .line 3
    return-void
.end method
