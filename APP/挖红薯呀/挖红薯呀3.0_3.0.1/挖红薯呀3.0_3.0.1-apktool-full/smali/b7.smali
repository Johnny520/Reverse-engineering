.class public final Lb7;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Lq91;

.field public final b:Ljava/lang/Object;

.field public final c:Lw7;

.field public final d:Lgp0;

.field public final e:Lgp0;

.field public final f:Lbi0;

.field public final g:Lb8;

.field public final h:Lb8;

.field public final i:Lb8;

.field public final j:Lb8;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lq91;Ljava/lang/Float;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 104
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lb7;-><init>(Ljava/lang/Object;Lq91;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lq91;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lb7;->a:Lq91;

    .line 5
    .line 6
    iput-object p3, p0, Lb7;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lw7;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/16 v2, 0x3c

    .line 12
    .line 13
    invoke-direct {v0, p2, p1, v1, v2}, Lw7;-><init>(Lq91;Ljava/lang/Object;Lb8;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lb7;->c:Lw7;

    .line 17
    .line 18
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {p2}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lb7;->d:Lgp0;

    .line 25
    .line 26
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lb7;->e:Lgp0;

    .line 31
    .line 32
    new-instance p1, Lbi0;

    .line 33
    .line 34
    invoke-direct {p1}, Lbi0;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lb7;->f:Lbi0;

    .line 38
    .line 39
    new-instance p1, Lo31;

    .line 40
    .line 41
    const/high16 p2, 0x3f800000    # 1.0f

    .line 42
    .line 43
    const v1, 0x44bb8000    # 1500.0f

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, p2, v1, p3}, Lo31;-><init>(FFLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, v0, Lw7;->f:Lb8;

    .line 50
    .line 51
    instance-of p2, p1, Lx7;

    .line 52
    .line 53
    if-eqz p2, :cond_0

    .line 54
    .line 55
    sget-object p3, Lkl;->e:Lx7;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    instance-of p3, p1, Ly7;

    .line 59
    .line 60
    if-eqz p3, :cond_1

    .line 61
    .line 62
    sget-object p3, Lkl;->f:Ly7;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    instance-of p3, p1, Lz7;

    .line 66
    .line 67
    if-eqz p3, :cond_2

    .line 68
    .line 69
    sget-object p3, Lkl;->g:Lz7;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    sget-object p3, Lkl;->h:La8;

    .line 73
    .line 74
    :goto_0
    iput-object p3, p0, Lb7;->g:Lb8;

    .line 75
    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    sget-object p1, Lkl;->a:Lx7;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    instance-of p2, p1, Ly7;

    .line 82
    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    sget-object p1, Lkl;->b:Ly7;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    instance-of p1, p1, Lz7;

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    sget-object p1, Lkl;->c:Lz7;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    sget-object p1, Lkl;->d:La8;

    .line 96
    .line 97
    :goto_1
    iput-object p1, p0, Lb7;->h:Lb8;

    .line 98
    .line 99
    iput-object p3, p0, Lb7;->i:Lb8;

    .line 100
    .line 101
    iput-object p1, p0, Lb7;->j:Lb8;

    .line 102
    .line 103
    return-void
.end method

.method public static final a(Lb7;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lb7;->a:Lq91;

    .line 2
    .line 3
    iget-object v1, p0, Lb7;->j:Lb8;

    .line 4
    .line 5
    iget-object v2, p0, Lb7;->i:Lb8;

    .line 6
    .line 7
    iget-object v3, p0, Lb7;->g:Lb8;

    .line 8
    .line 9
    invoke-static {v2, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lb7;->h:Lb8;

    .line 16
    .line 17
    invoke-static {v1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object p0, v0, Lq91;->a:Lsw;

    .line 25
    .line 26
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lb8;

    .line 31
    .line 32
    invoke-virtual {p0}, Lb8;->b()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v4, v3, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lb8;->a(I)F

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-virtual {v2, v4}, Lb8;->a(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    cmpg-float v6, v6, v7

    .line 49
    .line 50
    if-ltz v6, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v4}, Lb8;->a(I)F

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-virtual {v1, v4}, Lb8;->a(I)F

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    cmpl-float v6, v6, v7

    .line 61
    .line 62
    if-lez v6, :cond_2

    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0, v4}, Lb8;->a(I)F

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v2, v4}, Lb8;->a(I)F

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-virtual {v1, v4}, Lb8;->a(I)F

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-static {v5, v6, v7}, Lw60;->m(FFF)F

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-virtual {p0, v5, v4}, Lb8;->e(FI)V

    .line 81
    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    if-eqz v5, :cond_4

    .line 88
    .line 89
    iget-object p1, v0, Lq91;->b:Lsw;

    .line 90
    .line 91
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_4
    :goto_1
    return-object p1
.end method

.method public static final b(Lb7;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb7;->c:Lw7;

    .line 2
    .line 3
    iget-object v1, v0, Lw7;->f:Lb8;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb8;->d()V

    .line 6
    .line 7
    .line 8
    const-wide/high16 v1, -0x8000000000000000L

    .line 9
    .line 10
    iput-wide v1, v0, Lw7;->g:J

    .line 11
    .line 12
    iget-object p0, p0, Lb7;->d:Lgp0;

    .line 13
    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static c(Lb7;Ljava/lang/Object;Lv7;Lsw;Lm51;I)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lb7;->a:Lq91;

    .line 2
    .line 3
    iget-object v0, v0, Lq91;->b:Lsw;

    .line 4
    .line 5
    iget-object v2, p0, Lb7;->c:Lw7;

    .line 6
    .line 7
    iget-object v2, v2, Lw7;->f:Lb8;

    .line 8
    .line 9
    invoke-interface {v0, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    and-int/lit8 v0, p5, 0x8

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    move-object v6, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object/from16 v6, p3

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lb7;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    iget-object v9, p0, Lb7;->a:Lq91;

    .line 27
    .line 28
    new-instance v3, Ln61;

    .line 29
    .line 30
    iget-object v0, v9, Lq91;->a:Lsw;

    .line 31
    .line 32
    invoke-interface {v0, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v12, v0

    .line 37
    check-cast v12, Lb8;

    .line 38
    .line 39
    move-object v11, p1

    .line 40
    move-object v8, p2

    .line 41
    move-object v7, v3

    .line 42
    invoke-direct/range {v7 .. v12}, Ln61;-><init>(Lv7;Lq91;Ljava/lang/Object;Ljava/lang/Object;Lb8;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lb7;->c:Lw7;

    .line 46
    .line 47
    iget-wide v4, v0, Lw7;->g:J

    .line 48
    .line 49
    iget-object v8, p0, Lb7;->f:Lbi0;

    .line 50
    .line 51
    new-instance v0, Lz6;

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    move-object v1, p0

    .line 55
    invoke-direct/range {v0 .. v7}, Lz6;-><init>(Lb7;Ljava/lang/Object;Ln61;JLsw;Lik;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    move-object/from16 v0, p4

    .line 60
    .line 61
    invoke-static {v8, v1, v0}, Lbi0;->a(Lbi0;Lsw;Lm51;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lb7;->c:Lw7;

    .line 2
    .line 3
    iget-object p0, p0, Lw7;->e:Lgp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final e(Ljava/lang/Object;Lm51;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La7;-><init>(Lb7;Ljava/lang/Object;Lik;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lb7;->f:Lbi0;

    .line 8
    .line 9
    invoke-static {p0, v0, p2}, Lbi0;->a(Lbi0;Lsw;Lm51;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lzk;->d:Lzk;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 19
    .line 20
    return-object p0
.end method
