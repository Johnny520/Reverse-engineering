.class public final synthetic Lai1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# static fields
.field public static final a:Lai1;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lai1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lai1;->a:Lai1;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.module.wechat.item.contact.ModifyFriendsCount.ModifyFriendsCountConf"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "count"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lb12;->l(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lai1;->descriptor:Lyo2;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object p0, Lai1;->descriptor:Lyo2;

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
    move v2, v0

    .line 10
    move v3, v1

    .line 11
    move v4, v3

    .line 12
    :goto_0
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v6, -0x1

    .line 19
    if-eq v5, v6, :cond_1

    .line 20
    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    invoke-interface {p1, p0, v1}, Lvx;->u(Lyo2;I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    move v3, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p0, Le83;

    .line 30
    .line 31
    invoke-direct {p0, v5}, Le83;-><init>(I)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_1
    move v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lci1;

    .line 41
    .line 42
    invoke-direct {p0, v3, v4}, Lci1;-><init>(II)V

    .line 43
    .line 44
    .line 45
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
    sget-object v0, Lf11;->a:Lf11;

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
    .locals 2

    .line 1
    check-cast p2, Lci1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget p0, p2, Lci1;->a:I

    .line 7
    .line 8
    sget-object p2, Lai1;->descriptor:Lyo2;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Lve0;->b(Lyo2;)Lwx;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, p2}, Lwx;->d(Lyo2;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v0, 0xa

    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v0, p1

    .line 26
    check-cast v0, Ldv2;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1, p0, p2}, Ldv2;->u(IILyo2;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {p1, p2}, Lwx;->a(Lyo2;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lai1;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method
