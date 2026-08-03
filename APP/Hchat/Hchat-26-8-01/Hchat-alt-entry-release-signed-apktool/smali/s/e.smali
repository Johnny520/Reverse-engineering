.class public final Ls/e;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public a:Ls/d;

.field public b:Lqg/l;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method

.method public final f()Ly0/n;
    .locals 1

    .line 1
    new-instance v0, Ls/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ls/d;-><init>(Ls/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final bridge synthetic g(Ly0/n;)V
    .locals 0

    .line 1
    check-cast p1, Ls/d;

    .line 2
    .line 3
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/16 v0, 0xea

    .line 2
    .line 3
    return v0
.end method
