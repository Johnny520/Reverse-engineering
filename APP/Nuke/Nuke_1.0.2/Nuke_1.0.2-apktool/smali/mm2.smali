.class public final Lmm2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Z

.field public f:Lmm2;

.field public g:Lmm2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 20
    new-array v0, v0, [B

    iput-object v0, p0, Lmm2;->a:[B

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lmm2;->e:Z

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lmm2;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lmm2;->a:[B

    .line 8
    .line 9
    iput p2, p0, Lmm2;->b:I

    .line 10
    .line 11
    iput p3, p0, Lmm2;->c:I

    .line 12
    .line 13
    iput-boolean p4, p0, Lmm2;->d:Z

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lmm2;->e:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Lmm2;
    .locals 4

    .line 1
    iget-object v0, p0, Lmm2;->f:Lmm2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    iget-object v2, p0, Lmm2;->g:Lmm2;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lmm2;->f:Lmm2;

    .line 14
    .line 15
    iput-object v3, v2, Lmm2;->f:Lmm2;

    .line 16
    .line 17
    iget-object v2, p0, Lmm2;->f:Lmm2;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lmm2;->g:Lmm2;

    .line 23
    .line 24
    iput-object v3, v2, Lmm2;->g:Lmm2;

    .line 25
    .line 26
    iput-object v1, p0, Lmm2;->f:Lmm2;

    .line 27
    .line 28
    iput-object v1, p0, Lmm2;->g:Lmm2;

    .line 29
    .line 30
    return-object v0
.end method

.method public final b(Lmm2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p0, p1, Lmm2;->g:Lmm2;

    .line 5
    .line 6
    iget-object v0, p0, Lmm2;->f:Lmm2;

    .line 7
    .line 8
    iput-object v0, p1, Lmm2;->f:Lmm2;

    .line 9
    .line 10
    iget-object v0, p0, Lmm2;->f:Lmm2;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lmm2;->g:Lmm2;

    .line 16
    .line 17
    iput-object p1, p0, Lmm2;->f:Lmm2;

    .line 18
    .line 19
    return-void
.end method

.method public final c()Lmm2;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lmm2;->d:Z

    .line 3
    .line 4
    new-instance v1, Lmm2;

    .line 5
    .line 6
    iget v2, p0, Lmm2;->b:I

    .line 7
    .line 8
    iget v3, p0, Lmm2;->c:I

    .line 9
    .line 10
    iget-object p0, p0, Lmm2;->a:[B

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3, v0}, Lmm2;-><init>([BIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public final d(Lmm2;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, Lmm2;->e:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget v5, p1, Lmm2;->c:I

    .line 9
    .line 10
    add-int v0, v5, p2

    .line 11
    .line 12
    const/16 v1, 0x2000

    .line 13
    .line 14
    if-le v0, v1, :cond_2

    .line 15
    .line 16
    iget-boolean v2, p1, Lmm2;->d:Z

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    iget v4, p1, Lmm2;->b:I

    .line 21
    .line 22
    sub-int/2addr v0, v4

    .line 23
    if-gt v0, v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p1, Lmm2;->a:[B

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v6, 0x2

    .line 29
    move-object v2, v1

    .line 30
    invoke-static/range {v1 .. v6}, Lmg;->d0([B[BIIII)V

    .line 31
    .line 32
    .line 33
    iget v0, p1, Lmm2;->c:I

    .line 34
    .line 35
    iget v1, p1, Lmm2;->b:I

    .line 36
    .line 37
    sub-int/2addr v0, v1

    .line 38
    iput v0, p1, Lmm2;->c:I

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p1, Lmm2;->b:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    :goto_0
    iget-object v0, p1, Lmm2;->a:[B

    .line 57
    .line 58
    iget v1, p1, Lmm2;->c:I

    .line 59
    .line 60
    iget v2, p0, Lmm2;->b:I

    .line 61
    .line 62
    add-int v3, v2, p2

    .line 63
    .line 64
    iget-object v4, p0, Lmm2;->a:[B

    .line 65
    .line 66
    invoke-static {v4, v0, v1, v2, v3}, Lmg;->Z([B[BIII)V

    .line 67
    .line 68
    .line 69
    iget v0, p1, Lmm2;->c:I

    .line 70
    .line 71
    add-int/2addr v0, p2

    .line 72
    iput v0, p1, Lmm2;->c:I

    .line 73
    .line 74
    iget p1, p0, Lmm2;->b:I

    .line 75
    .line 76
    add-int/2addr p1, p2

    .line 77
    iput p1, p0, Lmm2;->b:I

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    const-string p0, "only owner can write"

    .line 81
    .line 82
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
