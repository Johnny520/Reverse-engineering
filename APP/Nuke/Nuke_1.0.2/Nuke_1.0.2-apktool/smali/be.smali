.class public final synthetic Lbe;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lbe;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbe;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbe;->a:Lbe;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.chat.AntiRevoke.AntiRevokeConf"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "pattern"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "timeFormat"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lbe;->descriptor:Lyo2;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, Lbe;->descriptor:Lyo2;

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
    move v4, v0

    .line 11
    move v5, v1

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    if-eqz v4, :cond_3

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
    if-eq v6, v7, :cond_2

    .line 21
    .line 22
    if-eqz v6, :cond_1

    .line 23
    .line 24
    if-ne v6, v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1, p0, v0}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    or-int/lit8 v5, v5, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Le83;

    .line 34
    .line 35
    invoke-direct {p0, v6}, Le83;-><init>(I)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    invoke-interface {p1, p0, v1}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    or-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v4, v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lde;

    .line 52
    .line 53
    invoke-direct {p0, v5, v2, v3}, Lde;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 2

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [Lw41;

    .line 3
    .line 4
    sget-object v0, Lnv2;->a:Lnv2;

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
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lde;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lde;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p2, p2, Lde;->a:Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, Lbe;->descriptor:Lyo2;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lve0;->b(Lyo2;)Lwx;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1, v0}, Lwx;->d(Lyo2;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v1, "\"$sender\"\u5c1d\u8bd5\u64a4\u56de\u4e00\u6761\u6d88\u606f"

    .line 24
    .line 25
    invoke-static {p2, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    :goto_0
    move-object v1, p1

    .line 32
    check-cast v1, Ldv2;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-virtual {v1, v0, v2, p2}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-interface {p1, v0}, Lwx;->d(Lyo2;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string p2, "yyyy/MM/dd HH:mm:ss"

    .line 46
    .line 47
    invoke-static {p0, p2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_3

    .line 52
    .line 53
    :goto_1
    move-object p2, p1

    .line 54
    check-cast p2, Ldv2;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-virtual {p2, v0, v1, p0}, Ldv2;->x(Lyo2;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-interface {p1, v0}, Lwx;->a(Lyo2;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lbe;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
