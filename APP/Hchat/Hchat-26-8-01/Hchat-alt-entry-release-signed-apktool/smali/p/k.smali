.class final Lp/k;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Ly0/c;

.field public final b:Z


# direct methods
.method public constructor <init>(Ly0/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/k;->a:Ly0/c;

    .line 5
    .line 6
    iput-boolean p2, p0, Lp/k;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lp/k;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lp/k;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    if-nez p1, :cond_2

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_2
    iget-object v0, p0, Lp/k;->a:Ly0/c;

    .line 16
    .line 17
    iget-object v1, p1, Lp/k;->a:Ly0/c;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-boolean v0, p0, Lp/k;->b:Z

    .line 26
    .line 27
    iget-boolean p1, p1, Lp/k;->b:Z

    .line 28
    .line 29
    if-ne v0, p1, :cond_3

    .line 30
    .line 31
    :goto_1
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lp/l;

    .line 2
    .line 3
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp/k;->a:Ly0/c;

    .line 7
    .line 8
    iput-object v1, v0, Lp/l;->u:Ly0/c;

    .line 9
    .line 10
    iget-boolean v1, p0, Lp/k;->b:Z

    .line 11
    .line 12
    iput-boolean v1, v0, Lp/l;->v:Z

    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lp/l;

    .line 2
    .line 3
    iget-object v0, p0, Lp/k;->a:Ly0/c;

    .line 4
    .line 5
    iput-object v0, p1, Lp/l;->u:Ly0/c;

    .line 6
    .line 7
    iget-boolean v0, p0, Lp/k;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p1, Lp/l;->v:Z

    .line 10
    .line 11
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lp/k;->a:Ly0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean v1, p0, Lp/k;->b:Z

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method
