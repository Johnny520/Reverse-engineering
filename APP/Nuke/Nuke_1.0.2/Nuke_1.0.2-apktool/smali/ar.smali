.class public final synthetic Lar;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lar;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lar;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lar;->a:Lar;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.chat.ChatAutoReply.ChatAutoReplyConf"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "tasks"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lb12;->l(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lar;->descriptor:Lyo2;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object p0, Lar;->descriptor:Lyo2;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ly40;->b(Lyo2;)Lvx;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lcr;->b:[Lj71;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v1

    .line 13
    move v5, v2

    .line 14
    :goto_0
    if-eqz v4, :cond_2

    .line 15
    .line 16
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    const/4 v7, -0x1

    .line 21
    if-eq v6, v7, :cond_1

    .line 22
    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    aget-object v5, v0, v2

    .line 26
    .line 27
    invoke-interface {v5}, Lj71;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Lw41;

    .line 32
    .line 33
    invoke-interface {p1, p0, v2, v5, v3}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/util/List;

    .line 38
    .line 39
    move v5, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Le83;

    .line 42
    .line 43
    invoke-direct {p0, v6}, Le83;-><init>(I)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    move v4, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Lcr;

    .line 53
    .line 54
    invoke-direct {p0, v5, v3}, Lcr;-><init>(ILjava/util/List;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 2

    .line 1
    sget-object p0, Lcr;->b:[Lj71;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    new-array v0, v0, [Lw41;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    aput-object p0, v0, v1

    .line 14
    .line 15
    return-object v0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcr;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Lcr;->a:Ljava/util/List;

    .line 7
    .line 8
    sget-object p2, Lar;->descriptor:Lyo2;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lve0;->b(Lyo2;)Lwx;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, Lcr;->b:[Lj71;

    .line 15
    .line 16
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

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
    sget-object v1, Lbe0;->h:Lbe0;

    .line 24
    .line 25
    invoke-static {p0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    :goto_0
    const/4 v1, 0x0

    .line 32
    aget-object v0, v0, v1

    .line 33
    .line 34
    invoke-interface {v0}, Lj71;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lw41;

    .line 39
    .line 40
    move-object v2, p1

    .line 41
    check-cast v2, Ldv2;

    .line 42
    .line 43
    invoke-virtual {v2, p2, v1, v0, p0}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface {p1, p2}, Lwx;->a(Lyo2;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lar;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
