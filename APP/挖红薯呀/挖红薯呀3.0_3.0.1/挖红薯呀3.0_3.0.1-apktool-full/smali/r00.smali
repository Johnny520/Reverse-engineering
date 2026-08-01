.class public final Lr00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static j:I

.field public static final k:Lr3;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:F

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:Lhb1;

.field public final g:J

.field public final h:I

.field public final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr00;->k:Lr3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;FFFFLhb1;JI)V
    .locals 3

    .line 1
    sget-object v0, Lr00;->k:Lr3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget v1, Lr00;->j:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    sput v2, Lr00;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lr00;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput p2, p0, Lr00;->b:F

    .line 17
    .line 18
    iput p3, p0, Lr00;->c:F

    .line 19
    .line 20
    iput p4, p0, Lr00;->d:F

    .line 21
    .line 22
    iput p5, p0, Lr00;->e:F

    .line 23
    .line 24
    iput-object p6, p0, Lr00;->f:Lhb1;

    .line 25
    .line 26
    iput-wide p7, p0, Lr00;->g:J

    .line 27
    .line 28
    iput p9, p0, Lr00;->h:I

    .line 29
    .line 30
    iput v1, p0, Lr00;->i:I

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    monitor-exit v0

    .line 35
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lr00;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lr00;

    .line 11
    .line 12
    iget-object v1, p1, Lr00;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p0, Lr00;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget v1, p0, Lr00;->b:F

    .line 24
    .line 25
    iget v2, p1, Lr00;->b:F

    .line 26
    .line 27
    invoke-static {v1, v2}, Lnp;->b(FF)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget v1, p0, Lr00;->c:F

    .line 35
    .line 36
    iget v2, p1, Lr00;->c:F

    .line 37
    .line 38
    invoke-static {v1, v2}, Lnp;->b(FF)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget v1, p0, Lr00;->d:F

    .line 46
    .line 47
    iget v2, p1, Lr00;->d:F

    .line 48
    .line 49
    cmpg-float v1, v1, v2

    .line 50
    .line 51
    if-nez v1, :cond_7

    .line 52
    .line 53
    iget v1, p0, Lr00;->e:F

    .line 54
    .line 55
    iget v2, p1, Lr00;->e:F

    .line 56
    .line 57
    cmpg-float v1, v1, v2

    .line 58
    .line 59
    if-nez v1, :cond_7

    .line 60
    .line 61
    iget-object v1, p0, Lr00;->f:Lhb1;

    .line 62
    .line 63
    iget-object v2, p1, Lr00;->f:Lhb1;

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lhb1;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    iget-wide v1, p0, Lr00;->g:J

    .line 73
    .line 74
    iget-wide v3, p1, Lr00;->g:J

    .line 75
    .line 76
    invoke-static {v1, v2, v3, v4}, Lff;->c(JJ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_6

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_6
    iget p0, p0, Lr00;->h:I

    .line 84
    .line 85
    iget p1, p1, Lr00;->h:I

    .line 86
    .line 87
    if-ne p0, p1, :cond_7

    .line 88
    .line 89
    return v0

    .line 90
    :cond_7
    :goto_0
    const/4 p0, 0x0

    .line 91
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lr00;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget v2, p0, Lr00;->b:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lr00;->c:F

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lr00;->d:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lr00;->e:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Lt1;->a(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lr00;->f:Lhb1;

    .line 35
    .line 36
    invoke-virtual {v2}, Lhb1;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    sget v0, Lff;->h:I

    .line 43
    .line 44
    iget-wide v3, p0, Lr00;->g:J

    .line 45
    .line 46
    invoke-static {v3, v4, v2, v1}, Lt1;->d(JII)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget p0, p0, Lr00;->h:I

    .line 51
    .line 52
    invoke-static {p0, v0, v1}, Lt1;->b(III)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v0, p0

    .line 62
    return v0
.end method
