.class final Lc0/b;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lb0/q;


# direct methods
.method public constructor <init>(Lb0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/b;->a:Lb0/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lc0/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lc0/b;

    .line 10
    .line 11
    iget-object p1, p1, Lc0/b;->a:Lb0/q;

    .line 12
    .line 13
    iget-object v0, p0, Lc0/b;->a:Lb0/q;

    .line 14
    .line 15
    if-eq v0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 20
    return p1
.end method

.method public final f()Ly0/n;
    .locals 4

    .line 1
    new-instance v0, Lc0/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lx1/j;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lc0/b;->a:Lb0/q;

    .line 7
    .line 8
    iput-object v1, v0, Lc0/c;->w:Lb0/q;

    .line 9
    .line 10
    new-instance v1, Lc0/a;

    .line 11
    .line 12
    new-instance v2, Lb0/d0;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v2, v0, v3}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Ly0/n;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v2, v1, Lc0/a;->u:Lb0/d0;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lc0/c;

    .line 2
    .line 3
    iget-object v0, p0, Lc0/b;->a:Lb0/q;

    .line 4
    .line 5
    iput-object v0, p1, Lc0/c;->w:Lb0/q;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/b;->a:Lb0/q;

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
