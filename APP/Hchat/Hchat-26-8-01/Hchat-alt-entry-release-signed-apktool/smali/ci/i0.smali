.class final Lci/i0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Ln/k;

.field public final b:Lk/y0;

.field public final c:Z


# direct methods
.method public constructor <init>(Ln/k;Lk/y0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci/i0;->a:Ln/k;

    .line 5
    .line 6
    iput-object p2, p0, Lci/i0;->b:Lk/y0;

    .line 7
    .line 8
    iput-boolean p3, p0, Lci/i0;->c:Z

    .line 9
    .line 10
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
    instance-of v0, p1, Lci/i0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lci/i0;

    .line 10
    .line 11
    iget-object v0, p0, Lci/i0;->a:Ln/k;

    .line 12
    .line 13
    iget-object v1, p1, Lci/i0;->a:Ln/k;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lci/i0;->b:Lk/y0;

    .line 23
    .line 24
    iget-object v1, p1, Lci/i0;->b:Lk/y0;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-boolean v0, p0, Lci/i0;->c:Z

    .line 34
    .line 35
    iget-boolean p1, p1, Lci/i0;->c:Z

    .line 36
    .line 37
    if-eq v0, p1, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1

    .line 41
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 42
    return p1
.end method

.method public final f()Ly0/n;
    .locals 4

    .line 1
    new-instance v0, Lci/l0;

    .line 2
    .line 3
    iget-object v1, p0, Lci/i0;->b:Lk/y0;

    .line 4
    .line 5
    iget-boolean v2, p0, Lci/i0;->c:Z

    .line 6
    .line 7
    iget-object v3, p0, Lci/i0;->a:Ln/k;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lci/l0;-><init>(Ln/k;Lk/y0;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 6

    .line 1
    check-cast p1, Lci/l0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lci/l0;->C:Ln/k;

    .line 7
    .line 8
    iget-object v1, p0, Lci/i0;->a:Ln/k;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lci/l0;->o1()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p1, Lci/l0;->C:Ln/k;

    .line 22
    .line 23
    iput-object v1, p1, Lci/l0;->w:Ln/k;

    .line 24
    .line 25
    move v0, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v3

    .line 28
    :goto_0
    iget-object v1, p1, Lci/l0;->x:Lk/y0;

    .line 29
    .line 30
    iget-object v4, p0, Lci/i0;->b:Lk/y0;

    .line 31
    .line 32
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    iput-object v4, p1, Lci/l0;->x:Lk/y0;

    .line 39
    .line 40
    move v0, v2

    .line 41
    :cond_1
    iget-boolean v1, p1, Lci/l0;->y:Z

    .line 42
    .line 43
    iget-boolean v4, p0, Lci/i0;->c:Z

    .line 44
    .line 45
    if-eq v1, v4, :cond_3

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1}, Lci/l0;->o1()V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lx1/k;->n(Lx1/z1;)V

    .line 53
    .line 54
    .line 55
    iput-boolean v4, p1, Lci/l0;->y:Z

    .line 56
    .line 57
    :cond_3
    iget-boolean v1, p1, Lci/l0;->D:Z

    .line 58
    .line 59
    iget-object v4, p1, Lci/l0;->C:Ln/k;

    .line 60
    .line 61
    if-nez v4, :cond_4

    .line 62
    .line 63
    iget-object v5, p1, Lci/l0;->x:Lk/y0;

    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    move v5, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    move v5, v3

    .line 70
    :goto_1
    if-eq v1, v5, :cond_6

    .line 71
    .line 72
    if-nez v4, :cond_5

    .line 73
    .line 74
    iget-object v1, p1, Lci/l0;->x:Lk/y0;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    move v3, v2

    .line 79
    :cond_5
    iput-boolean v3, p1, Lci/l0;->D:Z

    .line 80
    .line 81
    if-nez v3, :cond_6

    .line 82
    .line 83
    iget-object v1, p1, Lci/l0;->A:Lx1/i;

    .line 84
    .line 85
    if-nez v1, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    move v2, v0

    .line 89
    :goto_2
    if-eqz v2, :cond_9

    .line 90
    .line 91
    iget-object v0, p1, Lci/l0;->A:Lx1/i;

    .line 92
    .line 93
    if-nez v0, :cond_7

    .line 94
    .line 95
    iget-boolean v1, p1, Lci/l0;->D:Z

    .line 96
    .line 97
    if-nez v1, :cond_9

    .line 98
    .line 99
    :cond_7
    if-eqz v0, :cond_8

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lx1/j;->l1(Lx1/i;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    const/4 v0, 0x0

    .line 105
    iput-object v0, p1, Lci/l0;->A:Lx1/i;

    .line 106
    .line 107
    invoke-virtual {p1}, Lci/l0;->p1()V

    .line 108
    .line 109
    .line 110
    :cond_9
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lci/i0;->a:Ln/k;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lci/i0;->b:Lk/y0;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-interface {v2}, Lk/y0;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_1
    add-int/2addr v1, v0

    .line 24
    mul-int/lit8 v1, v1, 0x1f

    .line 25
    .line 26
    iget-boolean v0, p0, Lci/i0;->c:Z

    .line 27
    .line 28
    const/16 v2, 0x3c1

    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Leh/a;->h(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PressableElement(interactionSource="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lci/i0;->a:Ln/k;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", indicationNodeFactory="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lci/i0;->b:Lk/y0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", enabled="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", role=null, delay=null)"

    .line 29
    .line 30
    iget-boolean v2, p0, Lci/i0;->c:Z

    .line 31
    .line 32
    invoke-static {v1, v0, v2}, Lp/a;->m(Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
