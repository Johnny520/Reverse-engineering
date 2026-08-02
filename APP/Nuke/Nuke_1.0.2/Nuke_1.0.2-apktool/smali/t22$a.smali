.class public final synthetic Lt22$a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt22;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqo0;"
    }
.end annotation

.annotation runtime Lj70;
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lt22$a;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lt22$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt22$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt22$a;->INSTANCE:Lt22$a;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.data.model.Premium"

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "isPremium"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "premiumKey"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "deadline"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "applyTime"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lt22$a;->descriptor:Lyo2;

    .line 38
    .line 39
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ly40;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt22$a;->f(Ly40;)Lt22;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x4

    .line 2
    new-array p0, p0, [Lw41;

    .line 3
    .line 4
    sget-object v0, Lll;->a:Lll;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    sget-object v0, Lnv2;->a:Lnv2;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object v0, p0, v1

    .line 13
    .line 14
    sget-object v0, Led1;->a:Led1;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    aput-object v0, p0, v1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    aput-object v0, p0, v1

    .line 21
    .line 22
    return-object p0
.end method

.method public bridge c()[Lw41;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    sget-object p0, Lp40;->l:[Lw41;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lt22;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lt22$a;->g(Lve0;Lt22;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lt22$a;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Ly40;)Lt22;
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lt22$a;->descriptor:Lyo2;

    .line 5
    .line 6
    invoke-interface {p1, p0}, Ly40;->b(Lyo2;)Lvx;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    move v6, v1

    .line 16
    move v7, v6

    .line 17
    move-object v8, v2

    .line 18
    move-wide v9, v3

    .line 19
    move-wide v11, v9

    .line 20
    move v2, v0

    .line 21
    :goto_0
    if-eqz v2, :cond_5

    .line 22
    .line 23
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, -0x1

    .line 28
    if-eq v3, v4, :cond_4

    .line 29
    .line 30
    if-eqz v3, :cond_3

    .line 31
    .line 32
    if-eq v3, v0, :cond_2

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    if-eq v3, v4, :cond_1

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    if-ne v3, v4, :cond_0

    .line 39
    .line 40
    invoke-interface {p1, p0, v4}, Lvx;->z(Lyo2;I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v11

    .line 44
    or-int/lit8 v6, v6, 0x8

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
    invoke-interface {p1, p0, v4}, Lvx;->z(Lyo2;I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    or-int/lit8 v6, v6, 0x4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-interface {p1, p0, v0}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    or-int/lit8 v6, v6, 0x2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-interface {p1, p0, v1}, Lvx;->q(Lyo2;I)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    or-int/lit8 v6, v6, 0x1

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
    new-instance v5, Lt22;

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    invoke-direct/range {v5 .. v13}, Lt22;-><init>(IZLjava/lang/String;JJLdp2;)V

    .line 83
    .line 84
    .line 85
    return-object v5
.end method

.method public final g(Lve0;Lt22;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lt22$a;->descriptor:Lyo2;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lt22;->k(Lt22;Lwx;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
