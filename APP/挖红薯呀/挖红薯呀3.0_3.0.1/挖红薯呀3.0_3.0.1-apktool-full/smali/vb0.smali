.class public final Lvb0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lym;


# instance fields
.field public d:Z

.field public e:J

.field public f:J

.field public final synthetic g:Lyb0;


# direct methods
.method public constructor <init>(Lyb0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvb0;->g:Lyb0;

    .line 5
    .line 6
    const-wide v0, 0x7fffffff7fffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lvb0;->e:J

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    iput-wide v0, p0, Lvb0;->f:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Li50;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lvb0;->d:Z

    .line 3
    .line 4
    iget-object v0, p0, Lvb0;->g:Lyb0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lyb0;->l0()Li50;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-wide v2, p0, Lvb0;->e:J

    .line 11
    .line 12
    const-wide v4, 0x7fffffff7fffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3, v4, v5}, Lw20;->a(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-interface {v1, v2, v3}, Li50;->d(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-static {v2, v3}, Li4;->D(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    iput-wide v2, p0, Lvb0;->e:J

    .line 34
    .line 35
    invoke-interface {v1}, Li50;->G()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    iput-wide v2, p0, Lvb0;->f:J

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v0}, Lyb0;->n0()Lb60;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p0, p0, Lb60;->J:Lf60;

    .line 46
    .line 47
    invoke-virtual {p0}, Lf60;->b()V

    .line 48
    .line 49
    .line 50
    return-object v1
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lvb0;->g:Lyb0;

    .line 2
    .line 3
    invoke-interface {p0}, Lym;->b()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final d(Lez;F)V
    .locals 4

    .line 1
    iget-object p0, p0, Lvb0;->g:Lyb0;

    .line 2
    .line 3
    iget-object v0, p0, Lyb0;->p:Llw0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Llw0;

    .line 8
    .line 9
    invoke-direct {v0}, Llw0;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyb0;->p:Llw0;

    .line 13
    .line 14
    :cond_0
    iget-object p0, v0, Llw0;->b:[Lez;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lf9;->l0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-gez p0, :cond_2

    .line 22
    .line 23
    iget p0, v0, Llw0;->a:I

    .line 24
    .line 25
    iget-object v2, v0, Llw0;->b:[Lez;

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    if-ne p0, v3, :cond_1

    .line 29
    .line 30
    mul-int/lit8 v3, p0, 0x2

    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, [Lez;

    .line 37
    .line 38
    iput-object v2, v0, Llw0;->b:[Lez;

    .line 39
    .line 40
    iget-object v2, v0, Llw0;->c:[F

    .line 41
    .line 42
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([FI)[F

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-object v2, v0, Llw0;->c:[F

    .line 47
    .line 48
    iget-object v2, v0, Llw0;->d:[B

    .line 49
    .line 50
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iput-object v2, v0, Llw0;->d:[B

    .line 55
    .line 56
    :cond_1
    iget-object v2, v0, Llw0;->b:[Lez;

    .line 57
    .line 58
    aput-object p1, v2, p0

    .line 59
    .line 60
    iget-object p1, v0, Llw0;->d:[B

    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    aput-byte v2, p1, p0

    .line 64
    .line 65
    iget-object p1, v0, Llw0;->c:[F

    .line 66
    .line 67
    aput p2, p1, p0

    .line 68
    .line 69
    iget p0, v0, Llw0;->a:I

    .line 70
    .line 71
    add-int/2addr p0, v1

    .line 72
    iput p0, v0, Llw0;->a:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    iget-object p1, v0, Llw0;->c:[F

    .line 76
    .line 77
    aget v2, p1, p0

    .line 78
    .line 79
    cmpg-float v2, v2, p2

    .line 80
    .line 81
    if-nez v2, :cond_4

    .line 82
    .line 83
    iget-object p1, v0, Llw0;->d:[B

    .line 84
    .line 85
    aget-byte p2, p1, p0

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    if-ne p2, v0, :cond_3

    .line 89
    .line 90
    const/4 p2, 0x0

    .line 91
    aput-byte p2, p1, p0

    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :cond_4
    aput p2, p1, p0

    .line 95
    .line 96
    iget-object p1, v0, Llw0;->d:[B

    .line 97
    .line 98
    aput-byte v1, p1, p0

    .line 99
    .line 100
    return-void
.end method

.method public final h()F
    .locals 0

    .line 1
    iget-object p0, p0, Lvb0;->g:Lyb0;

    .line 2
    .line 3
    invoke-interface {p0}, Lym;->h()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
