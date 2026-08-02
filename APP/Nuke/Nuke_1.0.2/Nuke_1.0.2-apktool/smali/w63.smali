.class public final synthetic Lw63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lw63;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lw63;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw63;->a:Lw63;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.ui.model.UIConfig"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "appearanceMode"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "languageMode"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "clickHapticEnabled"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "theme"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lw63;->descriptor:Lyo2;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, Lw63;->descriptor:Lyo2;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ly40;->b(Lyo2;)Lvx;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v4, v1

    .line 11
    move v5, v4

    .line 12
    move v6, v5

    .line 13
    move v7, v6

    .line 14
    move-object v8, v2

    .line 15
    move v2, v0

    .line 16
    :goto_0
    if-eqz v2, :cond_5

    .line 17
    .line 18
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v9, -0x1

    .line 23
    if-eq v3, v9, :cond_4

    .line 24
    .line 25
    if-eqz v3, :cond_3

    .line 26
    .line 27
    if-eq v3, v0, :cond_2

    .line 28
    .line 29
    const/4 v9, 0x2

    .line 30
    if-eq v3, v9, :cond_1

    .line 31
    .line 32
    const/4 v9, 0x3

    .line 33
    if-ne v3, v9, :cond_0

    .line 34
    .line 35
    sget-object v3, Lz63;->a:Lz63;

    .line 36
    .line 37
    invoke-interface {p1, p0, v9, v3, v8}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v8, v3

    .line 42
    check-cast v8, Lb73;

    .line 43
    .line 44
    or-int/lit8 v4, v4, 0x8

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p0, Le83;

    .line 48
    .line 49
    invoke-direct {p0, v3}, Le83;-><init>(I)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_1
    invoke-interface {p1, p0, v9}, Lvx;->q(Lyo2;I)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    or-int/lit8 v4, v4, 0x4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {p1, p0, v0}, Lvx;->u(Lyo2;I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    or-int/lit8 v4, v4, 0x2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-interface {p1, p0, v1}, Lvx;->u(Lyo2;I)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    or-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    move v2, v1

    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Lc73;

    .line 80
    .line 81
    invoke-direct/range {v3 .. v8}, Lc73;-><init>(IIIZLb73;)V

    .line 82
    .line 83
    .line 84
    return-object v3
.end method

.method public final b()[Lw41;
    .locals 2

    .line 1
    const/4 p0, 0x4

    .line 2
    new-array p0, p0, [Lw41;

    .line 3
    .line 4
    sget-object v0, Lf11;->a:Lf11;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aput-object v0, p0, v1

    .line 11
    .line 12
    sget-object v0, Lll;->a:Lll;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    aput-object v0, p0, v1

    .line 16
    .line 17
    sget-object v0, Lz63;->a:Lz63;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    aput-object v0, p0, v1

    .line 21
    .line 22
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lc73;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lc73;->d:Lb73;

    .line 7
    .line 8
    iget-boolean v0, p2, Lc73;->c:Z

    .line 9
    .line 10
    iget v1, p2, Lc73;->b:I

    .line 11
    .line 12
    iget p2, p2, Lc73;->a:I

    .line 13
    .line 14
    sget-object v2, Lw63;->descriptor:Lyo2;

    .line 15
    .line 16
    invoke-interface {p1, v2}, Lve0;->b(Lyo2;)Lwx;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1, v2}, Lwx;->d(Lyo2;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p2, :cond_1

    .line 28
    .line 29
    :goto_0
    move-object v3, p1

    .line 30
    check-cast v3, Ldv2;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v3, v4, p2, v2}, Ldv2;->u(IILyo2;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {p1, v2}, Lwx;->d(Lyo2;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :goto_1
    move-object p2, p1

    .line 46
    check-cast p2, Ldv2;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-virtual {p2, v3, v1, v2}, Ldv2;->u(IILyo2;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-interface {p1, v2}, Lwx;->d(Lyo2;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    if-eqz v0, :cond_5

    .line 60
    .line 61
    :goto_2
    move-object p2, p1

    .line 62
    check-cast p2, Ldv2;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-virtual {p2, v2, v1, v0}, Ldv2;->r(Lyo2;IZ)V

    .line 66
    .line 67
    .line 68
    :cond_5
    invoke-interface {p1, v2}, Lwx;->d(Lyo2;)Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_6

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_6
    new-instance p2, Lb73;

    .line 76
    .line 77
    invoke-direct {p2}, Lb73;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_7

    .line 85
    .line 86
    :goto_3
    sget-object p2, Lz63;->a:Lz63;

    .line 87
    .line 88
    move-object v0, p1

    .line 89
    check-cast v0, Ldv2;

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-virtual {v0, v2, v1, p2, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-interface {p1, v2}, Lwx;->a(Lyo2;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lw63;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
