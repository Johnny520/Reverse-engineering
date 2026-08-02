.class public final synthetic Lzr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lzr;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lzr;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lzr;->a:Lzr;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.entertain.ChatAvatarRotator.ChatAvatarRotatorConf"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "duration"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lb12;->l(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lzr;->descriptor:Lyo2;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, Lzr;->descriptor:Lyo2;

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
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    move v4, v0

    .line 12
    move v5, v1

    .line 13
    :goto_0
    if-eqz v4, :cond_2

    .line 14
    .line 15
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/4 v7, -0x1

    .line 20
    if-eq v6, v7, :cond_1

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    invoke-interface {p1, p0, v1}, Lvx;->z(Lyo2;I)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    move v5, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p0, Le83;

    .line 31
    .line 32
    invoke-direct {p0, v6}, Le83;-><init>(I)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    move v4, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, Lbs;

    .line 42
    .line 43
    invoke-direct {p0, v2, v3, v5}, Lbs;-><init>(JI)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    new-array p0, p0, [Lw41;

    .line 3
    .line 4
    sget-object v0, Led1;->a:Led1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Lbs;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v0, p2, Lbs;->a:J

    .line 7
    .line 8
    sget-object p0, Lzr;->descriptor:Lyo2;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p0}, Lwx;->d(Lyo2;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide/16 v2, 0x3e8

    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_0
    move-object p2, p1

    .line 28
    check-cast p2, Ldv2;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {p2, p0, v2, v0, v1}, Ldv2;->v(Lyo2;IJ)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lzr;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
