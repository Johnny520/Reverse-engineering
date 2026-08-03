.class final Lx2/m;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Ls1/b0;


# direct methods
.method public constructor <init>(Ls1/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/m;->a:Ls1/b0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lx2/m;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lx2/m;

    .line 8
    .line 9
    iget-object p1, p1, Lx2/m;->a:Ls1/b0;

    .line 10
    .line 11
    iget-object v0, p0, Lx2/m;->a:Ls1/b0;

    .line 12
    .line 13
    if-ne v0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lx2/n;

    .line 2
    .line 3
    iget-object v1, p0, Lx2/m;->a:Ls1/b0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lx2/n;-><init>(Ls1/b0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 2

    .line 1
    check-cast p1, Lx2/n;

    .line 2
    .line 3
    iget-object v0, p0, Lx2/m;->a:Ls1/b0;

    .line 4
    .line 5
    iput-object v0, p1, Lx2/n;->u:Ls1/b0;

    .line 6
    .line 7
    iget-boolean v1, p1, Ly0/n;->t:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lx2/n;->v:Lb1/f;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ls1/b0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/m;->a:Ls1/b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
