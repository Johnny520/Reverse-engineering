.class public final Lwv0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lf10;


# instance fields
.field public final a:Z

.field public final b:F

.field public final c:J


# direct methods
.method public constructor <init>(ZFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwv0;->a:Z

    .line 5
    .line 6
    iput p2, p0, Lwv0;->b:F

    .line 7
    .line 8
    iput-wide p3, p0, Lwv0;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lg30;)Lrm;
    .locals 3

    .line 1
    new-instance v0, Lx1;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1, p0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lum;

    .line 9
    .line 10
    iget-boolean v2, p0, Lwv0;->a:Z

    .line 11
    .line 12
    iget p0, p0, Lwv0;->b:F

    .line 13
    .line 14
    invoke-direct {v1, p1, v2, p0, v0}, Lum;-><init>(Lg30;ZFLx1;)V

    .line 15
    .line 16
    .line 17
    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lwv0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lwv0;

    .line 11
    .line 12
    iget-boolean v0, p1, Lwv0;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p0, Lwv0;->a:Z

    .line 15
    .line 16
    if-eq v1, v0, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget v0, p0, Lwv0;->b:F

    .line 20
    .line 21
    iget v1, p1, Lwv0;->b:F

    .line 22
    .line 23
    invoke-static {v0, v1}, Lnp;->b(FF)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0

    .line 31
    :cond_3
    iget-wide v0, p0, Lwv0;->c:J

    .line 32
    .line 33
    iget-wide p0, p1, Lwv0;->c:J

    .line 34
    .line 35
    invoke-static {v0, v1, p0, p1}, Lff;->c(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lwv0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lwv0;->b:F

    .line 10
    .line 11
    const/16 v2, 0x3c1

    .line 12
    .line 13
    invoke-static {v1, v0, v2}, Lt1;->a(FII)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget v1, Lff;->h:I

    .line 18
    .line 19
    iget-wide v1, p0, Lwv0;->c:J

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/2addr p0, v0

    .line 26
    return p0
.end method
