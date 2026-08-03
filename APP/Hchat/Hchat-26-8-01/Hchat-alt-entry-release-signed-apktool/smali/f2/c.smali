.class public final Lf2/c;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf2/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;",
        "Lf2/n;"
    }
.end annotation


# instance fields
.field public final a:Lfg/l;


# direct methods
.method public constructor <init>(Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/c;->a:Lfg/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e()Lf2/m;
    .locals 2

    .line 1
    new-instance v0, Lf2/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/m;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lf2/m;->i:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, v0, Lf2/m;->j:Z

    .line 11
    .line 12
    iget-object v1, p0, Lf2/c;->a:Lfg/l;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lf2/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lf2/c;

    .line 12
    .line 13
    iget-object p1, p1, Lf2/c;->a:Lfg/l;

    .line 14
    .line 15
    iget-object v1, p0, Lf2/c;->a:Lfg/l;

    .line 16
    .line 17
    if-eq v1, p1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    return v0
.end method

.method public final f()Ly0/n;
    .locals 4

    .line 1
    new-instance v0, Lf2/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lf2/c;->a:Lfg/l;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v3, v1, v2}, Lf2/e;-><init>(ZZLfg/l;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lf2/e;

    .line 2
    .line 3
    iget-object v0, p0, Lf2/c;->a:Lfg/l;

    .line 4
    .line 5
    iput-object v0, p1, Lf2/e;->w:Lfg/l;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/c;->a:Lfg/l;

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
