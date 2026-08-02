.class public final synthetic Lz63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lz63;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lz63;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz63;->a:Lz63;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.ui.model.UIConfig.ThemeConfig"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "accentColorHex"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "recentAccentColorHexes"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lz63;->descriptor:Lyo2;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object p0, Lz63;->descriptor:Lyo2;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ly40;->b(Lyo2;)Lvx;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lb73;->c:[Lj71;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v5, v1

    .line 13
    move v6, v2

    .line 14
    move-object v4, v3

    .line 15
    :goto_0
    if-eqz v5, :cond_3

    .line 16
    .line 17
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/4 v8, -0x1

    .line 22
    if-eq v7, v8, :cond_2

    .line 23
    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    if-ne v7, v1, :cond_0

    .line 27
    .line 28
    aget-object v7, v0, v1

    .line 29
    .line 30
    invoke-interface {v7}, Lj71;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Lw41;

    .line 35
    .line 36
    invoke-interface {p1, p0, v1, v7, v4}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Ljava/util/List;

    .line 41
    .line 42
    or-int/lit8 v6, v6, 0x2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p0, Le83;

    .line 46
    .line 47
    invoke-direct {p0, v7}, Le83;-><init>(I)V

    .line 48
    .line 49
    .line 50
    throw p0

    .line 51
    :cond_1
    sget-object v7, Lnv2;->a:Lnv2;

    .line 52
    .line 53
    invoke-interface {p1, p0, v2, v3}, Lvx;->x(Lyo2;ILjava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    or-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move v5, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, Lb73;

    .line 68
    .line 69
    invoke-direct {p0, v6, v3, v4}, Lb73;-><init>(ILjava/lang/String;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 3

    .line 1
    sget-object p0, Lb73;->c:[Lj71;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Lw41;

    .line 5
    .line 6
    sget-object v1, Lnv2;->a:Lnv2;

    .line 7
    .line 8
    invoke-static {v1}, Lse;->D(Lw41;)Lw41;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aget-object p0, p0, v1

    .line 17
    .line 18
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    aput-object p0, v0, v1

    .line 23
    .line 24
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lb73;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lb73;->b:Ljava/util/List;

    .line 7
    .line 8
    iget-object p2, p2, Lb73;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, Lz63;->descriptor:Lyo2;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lve0;->b(Lyo2;)Lwx;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, Lb73;->c:[Lj71;

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lwx;->d(Lyo2;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_0
    sget-object v2, Lnv2;->a:Lnv2;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {p1, v0, v2, p2}, Lwx;->h(Lyo2;ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-interface {p1, v0}, Lwx;->d(Lyo2;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    sget-object p2, Lbe0;->h:Lbe0;

    .line 41
    .line 42
    invoke-static {p0, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_3

    .line 47
    .line 48
    :goto_1
    const/4 p2, 0x1

    .line 49
    aget-object v1, v1, p2

    .line 50
    .line 51
    invoke-interface {v1}, Lj71;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lw41;

    .line 56
    .line 57
    move-object v2, p1

    .line 58
    check-cast v2, Ldv2;

    .line 59
    .line 60
    invoke-virtual {v2, v0, p2, v1, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-interface {p1, v0}, Lwx;->a(Lyo2;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lz63;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
