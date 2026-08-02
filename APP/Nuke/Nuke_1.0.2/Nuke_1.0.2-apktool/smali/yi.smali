.class public final Lyi;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public v:Lg23;

.field public final synthetic w:Lzi;


# direct methods
.method public constructor <init>(Lzi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyi;->w:Lzi;

    .line 2
    .line 3
    invoke-direct {p0}, Lth1;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyi;->w:Lzi;

    .line 2
    .line 3
    iput-object p0, v0, Lzi;->a:Lyi;

    .line 4
    .line 5
    iget-object v0, v0, Lzi;->b:Lhv;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyi;->M0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final F0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyi;->w:Lzi;

    .line 2
    .line 3
    iget-object v1, v0, Lzi;->a:Lyi;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, Lzi;->a:Lyi;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lyi;->v:Lg23;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lg23;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, Lyi;->v:Lg23;

    .line 18
    .line 19
    return-void
.end method

.method public final M0()V
    .locals 6

    .line 1
    new-instance v0, Ld2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    iget-object v2, p0, Lyi;->w:Lzi;

    .line 5
    .line 6
    invoke-direct {v0, v1, p0, v2}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, v1, Lr61;->i:I

    .line 14
    .line 15
    invoke-static {v1}, Lu61;->a(Lr61;)Lzv1;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lb7;

    .line 20
    .line 21
    invoke-virtual {v1}, Lb7;->getRectManager()Lq62;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lq62;->c:Lh23;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v4, v3, Lh23;->a:Lzj1;

    .line 31
    .line 32
    new-instance v5, Lg23;

    .line 33
    .line 34
    invoke-direct {v5, v3, v2, p0, v0}, Lg23;-><init>(Lh23;ILyi;Ld2;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v2}, Lx01;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4, v2, v5}, Lzj1;->h(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v0, v5

    .line 47
    :cond_0
    check-cast v0, Lg23;

    .line 48
    .line 49
    if-eq v0, v5, :cond_2

    .line 50
    .line 51
    :goto_0
    iget-object v3, v0, Lg23;->d:Lg23;

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    move-object v0, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iput-object v5, v0, Lg23;->d:Lg23;

    .line 58
    .line 59
    :cond_2
    iget-object v0, p0, Lth1;->h:Lth1;

    .line 60
    .line 61
    invoke-static {v0}, Lsp0;->c0(Lt60;)Lr61;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-boolean v0, v0, Lr61;->n:Z

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    iget-object v0, v1, Lq62;->b:Le9;

    .line 71
    .line 72
    invoke-virtual {v0, v2, v3}, Le9;->t(IZ)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iput-boolean v3, v1, Lq62;->e:Z

    .line 76
    .line 77
    invoke-virtual {v1}, Lq62;->i()V

    .line 78
    .line 79
    .line 80
    iput-object v5, p0, Lyi;->v:Lg23;

    .line 81
    .line 82
    return-void
.end method
