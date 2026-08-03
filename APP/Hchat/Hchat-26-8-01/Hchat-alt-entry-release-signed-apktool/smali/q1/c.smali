.class final Lq1/c;
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

.field public final b:Lfg/l;


# direct methods
.method public constructor <init>(Lfg/l;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq1/c;->a:Lfg/l;

    .line 5
    .line 6
    iput-object p2, p0, Lq1/c;->b:Lfg/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lq1/c;

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
    check-cast p1, Lq1/c;

    .line 12
    .line 13
    iget-object v1, p1, Lq1/c;->a:Lfg/l;

    .line 14
    .line 15
    iget-object v3, p0, Lq1/c;->a:Lfg/l;

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, Lq1/c;->b:Lfg/l;

    .line 21
    .line 22
    iget-object p1, p1, Lq1/c;->b:Lfg/l;

    .line 23
    .line 24
    if-eq v1, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lq1/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lq1/c;->a:Lfg/l;

    .line 7
    .line 8
    iput-object v1, v0, Lq1/f;->u:Lfg/l;

    .line 9
    .line 10
    iget-object v1, p0, Lq1/c;->b:Lfg/l;

    .line 11
    .line 12
    iput-object v1, v0, Lq1/f;->v:Lfg/l;

    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lq1/f;

    .line 2
    .line 3
    iget-object v0, p0, Lq1/c;->a:Lfg/l;

    .line 4
    .line 5
    iput-object v0, p1, Lq1/f;->u:Lfg/l;

    .line 6
    .line 7
    iget-object v0, p0, Lq1/c;->b:Lfg/l;

    .line 8
    .line 9
    iput-object v0, p1, Lq1/f;->v:Lfg/l;

    .line 10
    .line 11
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lq1/c;->a:Lfg/l;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lq1/c;->b:Lfg/l;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :cond_1
    add-int/2addr v1, v0

    .line 23
    return v1
.end method
