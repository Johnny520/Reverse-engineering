.class public final Lb41;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Lb41;

.field public static final b:Lap2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lb41;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lb41;->a:Lb41;

    .line 7
    .line 8
    sget-object v0, Lcp2;->g:Lcp2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Lyo2;

    .line 12
    .line 13
    const-string v2, "kotlinx.serialization.json.JsonNull"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lup0;->j(Ljava/lang/String;Ls11;[Lyo2;)Lap2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lb41;->b:Lap2;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lrg3;->o(Ly40;)Lcv2;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ly40;->g()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lz31;->INSTANCE:Lz31;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lh31;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "Expected \'null\' literal"

    .line 18
    .line 19
    invoke-static {p1, v1, v0, v0, v0}, Lp7;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Ls31;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lz31;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lrg3;->m(Lve0;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lve0;->c()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lb41;->b:Lap2;

    .line 2
    .line 3
    return-object p0
.end method
