.class final Los0;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Lm13;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lm13;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Los0;->a:Lm13;

    .line 5
    .line 6
    iput p2, p0, Los0;->b:I

    .line 7
    .line 8
    iput p3, p0, Los0;->c:I

    .line 9
    .line 10
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
    instance-of v1, p1, Los0;

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
    check-cast p1, Los0;

    .line 12
    .line 13
    iget-object v1, p1, Los0;->a:Lm13;

    .line 14
    .line 15
    iget-object v3, p0, Los0;->a:Lm13;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, Los0;->b:I

    .line 25
    .line 26
    iget v3, p1, Los0;->b:I

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget p0, p0, Los0;->c:I

    .line 32
    .line 33
    iget p1, p1, Los0;->c:I

    .line 34
    .line 35
    if-eq p0, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final f()Lth1;
    .locals 2

    .line 1
    new-instance v0, Lqs0;

    .line 2
    .line 3
    invoke-direct {v0}, Lth1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Los0;->a:Lm13;

    .line 7
    .line 8
    iput-object v1, v0, Lqs0;->v:Lm13;

    .line 9
    .line 10
    iget v1, p0, Los0;->b:I

    .line 11
    .line 12
    iput v1, v0, Lqs0;->w:I

    .line 13
    .line 14
    iget p0, p0, Los0;->c:I

    .line 15
    .line 16
    iput p0, v0, Lqs0;->x:I

    .line 17
    .line 18
    const/4 p0, -0x1

    .line 19
    iput p0, v0, Lqs0;->z:I

    .line 20
    .line 21
    iput p0, v0, Lqs0;->A:I

    .line 22
    .line 23
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 3

    .line 1
    check-cast p1, Lqs0;

    .line 2
    .line 3
    iget-object v0, p1, Lqs0;->v:Lm13;

    .line 4
    .line 5
    iget-object v1, p0, Los0;->a:Lm13;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Los0;->b:I

    .line 12
    .line 13
    iget p0, p0, Los0;->c:I

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget v0, p1, Lqs0;->w:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget v0, p1, Lqs0;->x:I

    .line 22
    .line 23
    if-eq v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    :goto_0
    iput-object v1, p1, Lqs0;->v:Lm13;

    .line 28
    .line 29
    iput v2, p1, Lqs0;->w:I

    .line 30
    .line 31
    iput p0, p1, Lqs0;->x:I

    .line 32
    .line 33
    invoke-static {p1}, Lsp0;->c0(Lt60;)Lr61;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, Lr61;->G:Ld61;

    .line 38
    .line 39
    invoke-static {v1, p0}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iput-object p0, p1, Lqs0;->B:Lm13;

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    iput-boolean p0, p1, Lqs0;->y:Z

    .line 47
    .line 48
    invoke-static {p1}, Lgf1;->A(Lj61;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Los0;->a:Lm13;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm13;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Los0;->b:I

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget p0, p0, Los0;->c:I

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method
