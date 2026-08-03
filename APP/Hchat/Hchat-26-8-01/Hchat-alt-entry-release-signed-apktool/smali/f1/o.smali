.class final Lf1/o;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
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
    iput-object p1, p0, Lf1/o;->a:Lfg/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lf1/o;

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
    check-cast p1, Lf1/o;

    .line 12
    .line 13
    iget-object p1, p1, Lf1/o;->a:Lfg/l;

    .line 14
    .line 15
    iget-object v1, p0, Lf1/o;->a:Lfg/l;

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
    .locals 2

    .line 1
    new-instance v0, Lf1/q;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/o;->a:Lfg/l;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf1/q;-><init>(Lfg/l;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 2

    .line 1
    check-cast p1, Lf1/q;

    .line 2
    .line 3
    iget-object v0, p0, Lf1/o;->a:Lfg/l;

    .line 4
    .line 5
    iput-object v0, p1, Lf1/q;->u:Lfg/l;

    .line 6
    .line 7
    iget-object v1, p1, Ly0/n;->g:Ly0/n;

    .line 8
    .line 9
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    invoke-static {p1, v1}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, Lx1/i1;->v:Lx1/i1;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {p1, v0, v1}, Lx1/i1;->Q1(Lfg/l;Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/o;->a:Lfg/l;

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
