.class public final Lko;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lrf;
.implements Lh01;
.implements Lus1;


# instance fields
.field public final h:I

.field public i:I

.field public final j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 20
    new-array v0, v0, [Lko;

    iput-object v0, p0, Lko;->j:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lko;->h:I

    .line 22
    iput v0, p0, Lko;->i:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 6
    .line 7
    iput p1, p0, Lko;->h:I

    .line 8
    .line 9
    and-int/lit8 p1, p2, 0x7

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    const/16 p1, 0x8

    .line 14
    .line 15
    :cond_0
    iput p1, p0, Lko;->i:I

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 23
    iput-object p3, p0, Lko;->j:Ljava/lang/Object;

    iput p1, p0, Lko;->h:I

    iput p2, p0, Lko;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lrf;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko;->j:Ljava/lang/Object;

    iput p2, p0, Lko;->h:I

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrf;

    .line 4
    .line 5
    iget v1, p0, Lko;->i:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lko;->h:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrf;->a(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lko;->i:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lko;->i:I

    .line 6
    .line 7
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lrf;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lrf;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(Lj23;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lxz1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e(Lwz1;)V
    .locals 4

    .line 1
    iget-object v0, p1, Li01;->h:Lza2;

    .line 2
    .line 3
    iget v0, v0, Lza2;->a:I

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Le30;->l:Ldz;

    .line 9
    .line 10
    check-cast v0, Lg30;

    .line 11
    .line 12
    iget v0, v0, Li30;->h:I

    .line 13
    .line 14
    iget-object v1, p0, Lko;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, [Z

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    aget-boolean v3, v1, v2

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v3, p0, Lko;->h:I

    .line 24
    .line 25
    iget p0, p0, Lko;->i:I

    .line 26
    .line 27
    sub-int/2addr v3, p0

    .line 28
    add-int/2addr v3, v0

    .line 29
    iget-object p0, p1, Li01;->j:Lr72;

    .line 30
    .line 31
    iget p0, p0, Lr72;->h:I

    .line 32
    .line 33
    if-ne v3, p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p0, v2

    .line 38
    :goto_0
    aput-boolean p0, v1, v2

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public f()V
    .locals 0

    .line 1
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrf;

    .line 4
    .line 5
    invoke-interface {p0}, Lrf;->f()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(ILjava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrf;

    .line 4
    .line 5
    iget v1, p0, Lko;->i:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lko;->h:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrf;->g(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public h(Lk23;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(III)V
    .locals 1

    .line 1
    iget v0, p0, Lko;->i:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lko;->h:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lrf;

    .line 12
    .line 13
    add-int/2addr p1, v0

    .line 14
    add-int/2addr p2, v0

    .line 15
    invoke-interface {p0, p1, p2, p3}, Lrf;->j(III)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public k()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrf;

    .line 4
    .line 5
    invoke-interface {p0}, Lrf;->k()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public l(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrf;

    .line 4
    .line 5
    iget v1, p0, Lko;->i:I

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lko;->h:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    add-int/2addr p1, p0

    .line 14
    invoke-interface {v0, p1, p2}, Lrf;->l(II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public m(Lmn0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrf;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lrf;->m(Lmn0;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lus1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lus1;->n(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lko;->i:I

    .line 12
    .line 13
    if-gt p1, v1, :cond_0

    .line 14
    .line 15
    iget p0, p0, Lko;->h:I

    .line 16
    .line 17
    invoke-static {v0, p0, p1}, Ll93;->c(III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return v0
.end method

.method public o()V
    .locals 1

    .line 1
    iget v0, p0, Lko;->i:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "OffsetApplier up called with no corresponding down"

    .line 7
    .line 8
    invoke-static {v0}, Ltx;->a(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :goto_0
    iget v0, p0, Lko;->i:I

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, Lko;->i:I

    .line 16
    .line 17
    iget-object p0, p0, Lko;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lrf;

    .line 20
    .line 21
    invoke-interface {p0}, Lrf;->o()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public p(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lko;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lus1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lus1;->p(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    iget v1, p0, Lko;->h:I

    .line 12
    .line 13
    if-gt p1, v1, :cond_0

    .line 14
    .line 15
    iget p0, p0, Lko;->i:I

    .line 16
    .line 17
    invoke-static {v0, p0, p1}, Ll93;->b(III)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return v0
.end method
