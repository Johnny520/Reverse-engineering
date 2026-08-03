.class final Ls/s0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lfg/a;

.field public final b:Lr/f;

.field public final c:Lm/p1;

.field public final d:Z


# direct methods
.method public constructor <init>(Lfg/a;Lr/f;Lm/p1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/s0;->a:Lfg/a;

    .line 5
    .line 6
    iput-object p2, p0, Ls/s0;->b:Lr/f;

    .line 7
    .line 8
    iput-object p3, p0, Ls/s0;->c:Lm/p1;

    .line 9
    .line 10
    iput-boolean p4, p0, Ls/s0;->d:Z

    .line 11
    .line 12
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
    instance-of v1, p1, Ls/s0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ls/s0;

    .line 11
    .line 12
    iget-object v1, p1, Ls/s0;->a:Lfg/a;

    .line 13
    .line 14
    iget-object v2, p0, Ls/s0;->a:Lfg/a;

    .line 15
    .line 16
    if-eq v2, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v1, p0, Ls/s0;->b:Lr/f;

    .line 20
    .line 21
    iget-object v2, p1, Ls/s0;->b:Lr/f;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v1, p0, Ls/s0;->c:Lm/p1;

    .line 31
    .line 32
    iget-object v2, p1, Ls/s0;->c:Lm/p1;

    .line 33
    .line 34
    if-eq v1, v2, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-boolean v1, p0, Ls/s0;->d:Z

    .line 38
    .line 39
    iget-boolean p1, p1, Ls/s0;->d:Z

    .line 40
    .line 41
    if-eq v1, p1, :cond_5

    .line 42
    .line 43
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1

    .line 45
    :cond_5
    return v0
.end method

.method public final f()Ly0/n;
    .locals 5

    .line 1
    new-instance v0, Ls/w0;

    .line 2
    .line 3
    iget-object v1, p0, Ls/s0;->c:Lm/p1;

    .line 4
    .line 5
    iget-boolean v2, p0, Ls/s0;->d:Z

    .line 6
    .line 7
    iget-object v3, p0, Ls/s0;->a:Lfg/a;

    .line 8
    .line 9
    iget-object v4, p0, Ls/s0;->b:Lr/f;

    .line 10
    .line 11
    invoke-direct {v0, v3, v4, v1, v2}, Ls/w0;-><init>(Lfg/a;Lr/f;Lm/p1;Z)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 2

    .line 1
    check-cast p1, Ls/w0;

    .line 2
    .line 3
    iget-object v0, p0, Ls/s0;->a:Lfg/a;

    .line 4
    .line 5
    iput-object v0, p1, Ls/w0;->u:Lfg/a;

    .line 6
    .line 7
    iget-object v0, p0, Ls/s0;->b:Lr/f;

    .line 8
    .line 9
    iput-object v0, p1, Ls/w0;->v:Lr/f;

    .line 10
    .line 11
    iget-object v0, p1, Ls/w0;->w:Lm/p1;

    .line 12
    .line 13
    iget-object v1, p0, Ls/s0;->c:Lm/p1;

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    iput-object v1, p1, Ls/w0;->w:Lm/p1;

    .line 18
    .line 19
    invoke-static {p1}, Lx1/k;->n(Lx1/z1;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-boolean v0, p1, Ls/w0;->x:Z

    .line 23
    .line 24
    iget-boolean v1, p0, Ls/s0;->d:Z

    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iput-boolean v1, p1, Ls/w0;->x:Z

    .line 30
    .line 31
    invoke-virtual {p1}, Ls/w0;->k1()V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lx1/k;->n(Lx1/z1;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ls/s0;->a:Lfg/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Ls/s0;->b:Lr/f;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Ls/s0;->c:Lm/p1;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-boolean v2, p0, Ls/s0;->d:Z

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v1, v0

    .line 38
    return v1
.end method
