.class public final Lh22;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:I


# direct methods
.method public constructor <init>(I)V
    .locals 7

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :cond_0
    move v2, v0

    const/4 v6, 0x1

    .line 47
    sget-object v5, Lkm2;->h:Lkm2;

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v1, p0

    .line 48
    invoke-direct/range {v1 .. v6}, Lh22;-><init>(ZZZLkm2;Z)V

    return-void
.end method

.method public constructor <init>(ZZZLkm2;Z)V
    .locals 1

    .line 1
    sget-object v0, Lpa;->a:Lmy;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const p1, 0x40008

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/high16 p1, 0x40000

    .line 10
    .line 11
    :goto_0
    sget-object v0, Lkm2;->i:Lkm2;

    .line 12
    .line 13
    if-ne p4, v0, :cond_1

    .line 14
    .line 15
    or-int/lit16 p1, p1, 0x2000

    .line 16
    .line 17
    :cond_1
    if-nez p5, :cond_2

    .line 18
    .line 19
    or-int/lit16 p1, p1, 0x200

    .line 20
    .line 21
    :cond_2
    sget-object p5, Lkm2;->h:Lkm2;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    if-ne p4, p5, :cond_3

    .line 25
    .line 26
    move p4, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_3
    const/4 p4, 0x0

    .line 29
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput p1, p0, Lh22;->a:I

    .line 33
    .line 34
    iput-boolean p4, p0, Lh22;->b:Z

    .line 35
    .line 36
    iput-boolean p2, p0, Lh22;->c:Z

    .line 37
    .line 38
    iput-boolean p3, p0, Lh22;->d:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lh22;->e:Z

    .line 41
    .line 42
    const/16 p1, 0x3ea

    .line 43
    .line 44
    iput p1, p0, Lh22;->f:I

    .line 45
    .line 46
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
    instance-of v0, p1, Lh22;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lh22;

    .line 10
    .line 11
    iget v0, p1, Lh22;->a:I

    .line 12
    .line 13
    iget v1, p0, Lh22;->a:I

    .line 14
    .line 15
    if-eq v1, v0, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Lh22;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Lh22;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-boolean v0, p0, Lh22;->c:Z

    .line 26
    .line 27
    iget-boolean v1, p1, Lh22;->c:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-boolean v0, p0, Lh22;->d:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lh22;->d:Z

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-boolean v0, p0, Lh22;->e:Z

    .line 40
    .line 41
    iget-boolean v1, p1, Lh22;->e:Z

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget p0, p0, Lh22;->f:I

    .line 47
    .line 48
    iget p1, p1, Lh22;->f:I

    .line 49
    .line 50
    if-eq p0, p1, :cond_7

    .line 51
    .line 52
    :goto_0
    const/4 p0, 0x0

    .line 53
    return p0

    .line 54
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 55
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lh22;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    iget-boolean v2, p0, Lh22;->b:Z

    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-boolean v2, p0, Lh22;->c:Z

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lh22;->d:Z

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, Lh22;->e:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {v0, v1, v2}, Lhk1;->d(IIZ)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget p0, p0, Lh22;->f:I

    .line 36
    .line 37
    add-int/2addr v0, p0

    .line 38
    mul-int/2addr v0, v1

    .line 39
    return v0
.end method
