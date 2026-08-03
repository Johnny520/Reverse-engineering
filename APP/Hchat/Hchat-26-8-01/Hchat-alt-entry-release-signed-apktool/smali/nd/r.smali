.class public abstract Lnd/r;
.super Lmd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public i:I

.field public j:I


# virtual methods
.method public final H(Lud/p;)V
    .locals 1

    .line 1
    iget v0, p0, Lnd/r;->i:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget p1, p1, Lnd/r;->i:I

    .line 6
    .line 7
    iput p1, p0, Lnd/r;->i:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final t(I)V
    .locals 0

    .line 1
    iput p1, p0, Lnd/r;->j:I

    .line 2
    .line 3
    return-void
.end method
