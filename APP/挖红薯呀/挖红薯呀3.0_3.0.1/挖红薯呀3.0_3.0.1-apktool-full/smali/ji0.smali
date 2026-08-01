.class public final synthetic Lji0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lxq0;

.field public final synthetic e:Z

.field public final synthetic f:F

.field public final synthetic g:Lxq0;

.field public final synthetic h:I

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:Lxq0;

.field public final synthetic l:I

.field public final synthetic m:F

.field public final synthetic n:Lxq0;

.field public final synthetic o:I

.field public final synthetic p:F

.field public final synthetic q:I

.field public final synthetic r:Lzd0;


# direct methods
.method public synthetic constructor <init>(Lxq0;ZFLxq0;IFFLxq0;IFLxq0;IFILzd0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji0;->d:Lxq0;

    iput-boolean p2, p0, Lji0;->e:Z

    iput p3, p0, Lji0;->f:F

    iput-object p4, p0, Lji0;->g:Lxq0;

    iput p5, p0, Lji0;->h:I

    iput p6, p0, Lji0;->i:F

    iput p7, p0, Lji0;->j:F

    iput-object p8, p0, Lji0;->k:Lxq0;

    iput p9, p0, Lji0;->l:I

    iput p10, p0, Lji0;->m:F

    iput-object p11, p0, Lji0;->n:Lxq0;

    iput p12, p0, Lji0;->o:I

    iput p13, p0, Lji0;->p:F

    iput p14, p0, Lji0;->q:I

    iput-object p15, p0, Lji0;->r:Lzd0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lwq0;

    .line 2
    .line 3
    iget-object v0, p0, Lji0;->d:Lxq0;

    .line 4
    .line 5
    iget v1, p0, Lji0;->j:F

    .line 6
    .line 7
    iget v2, p0, Lji0;->m:F

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v3, v0, Lxq0;->d:I

    .line 12
    .line 13
    iget v4, p0, Lji0;->q:I

    .line 14
    .line 15
    sub-int/2addr v4, v3

    .line 16
    div-int/lit8 v4, v4, 0x2

    .line 17
    .line 18
    sget v3, Loi0;->e:F

    .line 19
    .line 20
    iget-object v5, p0, Lji0;->r:Lzd0;

    .line 21
    .line 22
    invoke-interface {v5, v3}, Lym;->F(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    int-to-float v3, v3

    .line 27
    sub-float v3, v2, v3

    .line 28
    .line 29
    add-float/2addr v3, v1

    .line 30
    invoke-static {v3}, Lrd0;->Q(F)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {p1, v0, v4, v3}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-boolean v0, p0, Lji0;->e:Z

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iget v3, p0, Lji0;->f:F

    .line 43
    .line 44
    cmpg-float v0, v3, v0

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget v0, p0, Lji0;->i:F

    .line 50
    .line 51
    add-float/2addr v0, v1

    .line 52
    invoke-static {v0}, Lrd0;->Q(F)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v3, p0, Lji0;->g:Lxq0;

    .line 57
    .line 58
    iget v4, p0, Lji0;->h:I

    .line 59
    .line 60
    invoke-static {p1, v3, v4, v0}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 61
    .line 62
    .line 63
    :goto_0
    add-float/2addr v2, v1

    .line 64
    invoke-static {v2}, Lrd0;->Q(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, Lji0;->k:Lxq0;

    .line 69
    .line 70
    iget v3, p0, Lji0;->l:I

    .line 71
    .line 72
    invoke-static {p1, v2, v3, v0}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 73
    .line 74
    .line 75
    iget v0, p0, Lji0;->p:F

    .line 76
    .line 77
    add-float/2addr v0, v1

    .line 78
    invoke-static {v0}, Lrd0;->Q(F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v1, p0, Lji0;->n:Lxq0;

    .line 83
    .line 84
    iget p0, p0, Lji0;->o:I

    .line 85
    .line 86
    invoke-static {p1, v1, p0, v0}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lna1;->a:Lna1;

    .line 90
    .line 91
    return-object p0
.end method
