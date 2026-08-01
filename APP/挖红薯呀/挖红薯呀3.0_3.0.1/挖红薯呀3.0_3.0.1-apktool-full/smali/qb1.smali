.class public final Lqb1;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lc8;
.implements Lpb1;


# instance fields
.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lpm;

    invoke-direct {v0}, Lpm;-><init>()V

    .line 29
    iput-object v0, p0, Lqb1;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLb8;)V
    .locals 1

    .line 1
    sget v0, Lnb1;->a:I

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    new-instance v0, Lx1;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2, p3}, Lx1;-><init>(FFLb8;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lx1;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lx1;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ly2;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ly2;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lqb1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lqb1;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public b(Lb8;Lb8;Lb8;)J
    .locals 0

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly2;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ly2;->b(Lb8;Lb8;Lb8;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public d(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpm;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lrb1;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Lrb1;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lrb1;->f(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Lpm;->a:Ltb1;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lrb1;->b(J)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Ltb1;->b(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object p0, p0, Lpm;->b:Ltb1;

    .line 58
    .line 59
    invoke-static {p1, p2}, Lrb1;->c(J)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0, p1}, Ltb1;->b(F)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {v0, p0}, Lg60;->b(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    return-wide p0
.end method

.method public e(JLb8;Lb8;Lb8;)Lb8;
    .locals 6

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ly2;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Ly2;->e(JLb8;Lb8;Lb8;)Lb8;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public get(I)Leu;
    .locals 0

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Leu;

    .line 4
    .line 5
    return-object p0
.end method

.method public h(JLb8;Lb8;Lb8;)Lb8;
    .locals 6

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Ly2;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Ly2;->h(JLb8;Lb8;Lb8;)Lb8;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public i(Lb8;Lb8;Lb8;)Lb8;
    .locals 0

    .line 1
    iget-object p0, p0, Lqb1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly2;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Ly2;->i(Lb8;Lb8;Lb8;)Lb8;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
