.class public final synthetic Lo70$a;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqo0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo70;
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

.field public static final INSTANCE:Lo70$a;

.field private static final descriptor:Lyo2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lo70$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lo70$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo70$a;->INSTANCE:Lo70$a;

    .line 7
    .line 8
    new-instance v1, Lb12;

    .line 9
    .line 10
    const-string v2, "nuke.data.model.DeviceInfo"

    .line 11
    .line 12
    const/4 v3, 0x5

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lb12;-><init>(Ljava/lang/String;Lqo0;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "abi"

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "sdk"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    const-string v0, "release"

    .line 28
    .line 29
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    const-string v0, "brand"

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v0, "model"

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lb12;->l(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lo70$a;->descriptor:Lyo2;

    .line 43
    .line 44
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
    invoke-virtual {p0, p1}, Lo70$a;->f(Ly40;)Lo70;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()[Lw41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lw41;"
        }
    .end annotation

    .line 1
    const/4 p0, 0x5

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
    sget-object v1, Lf11;->a:Lf11;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, p0, v2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    aput-object v1, p0, v2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    aput-object v0, p0, v1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    aput-object v0, p0, v1

    .line 22
    .line 23
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
    check-cast p2, Lo70;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lo70$a;->g(Lve0;Lo70;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lo70$a;->descriptor:Lyo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Ly40;)Lo70;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lo70$a;->descriptor:Lyo2;

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
    move v4, v1

    .line 14
    move v6, v4

    .line 15
    move v7, v6

    .line 16
    move-object v5, v2

    .line 17
    move-object v8, v5

    .line 18
    move-object v9, v8

    .line 19
    move v2, v0

    .line 20
    :goto_0
    if-eqz v2, :cond_6

    .line 21
    .line 22
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v10, -0x1

    .line 27
    if-eq v3, v10, :cond_5

    .line 28
    .line 29
    if-eqz v3, :cond_4

    .line 30
    .line 31
    if-eq v3, v0, :cond_3

    .line 32
    .line 33
    const/4 v10, 0x2

    .line 34
    if-eq v3, v10, :cond_2

    .line 35
    .line 36
    const/4 v10, 0x3

    .line 37
    if-eq v3, v10, :cond_1

    .line 38
    .line 39
    const/4 v9, 0x4

    .line 40
    if-ne v3, v9, :cond_0

    .line 41
    .line 42
    invoke-interface {p1, p0, v9}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    or-int/lit8 v4, v4, 0x10

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance p0, Le83;

    .line 50
    .line 51
    invoke-direct {p0, v3}, Le83;-><init>(I)V

    .line 52
    .line 53
    .line 54
    throw p0

    .line 55
    :cond_1
    invoke-interface {p1, p0, v10}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    or-int/lit8 v4, v4, 0x8

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-interface {p1, p0, v10}, Lvx;->u(Lyo2;I)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    or-int/lit8 v4, v4, 0x4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-interface {p1, p0, v0}, Lvx;->u(Lyo2;I)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    or-int/lit8 v4, v4, 0x2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-interface {p1, p0, v1}, Lvx;->n(Lyo2;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    or-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    move v2, v1

    .line 84
    goto :goto_0

    .line 85
    :cond_6
    invoke-interface {p1, p0}, Lvx;->a(Lyo2;)V

    .line 86
    .line 87
    .line 88
    new-instance v3, Lo70;

    .line 89
    .line 90
    const/4 v10, 0x0

    .line 91
    invoke-direct/range {v3 .. v10}, Lo70;-><init>(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ldp2;)V

    .line 92
    .line 93
    .line 94
    return-object v3
.end method

.method public final g(Lve0;Lo70;)V
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
    sget-object p0, Lo70$a;->descriptor:Lyo2;

    .line 8
    .line 9
    invoke-interface {p1, p0}, Lve0;->b(Lyo2;)Lwx;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p2, p1, p0}, Lo70;->m(Lo70;Lwx;Lyo2;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
