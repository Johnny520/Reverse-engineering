.class public final Lc31;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Lc31;

.field public static final b:Lb31;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc31;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc31;->a:Lc31;

    .line 7
    .line 8
    sget-object v0, Lb31;->b:Lb31;

    .line 9
    .line 10
    sput-object v0, Lc31;->b:Lb31;

    .line 11
    .line 12
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
    new-instance p0, Lz21;

    .line 5
    .line 6
    sget-object v0, Lo31;->a:Lo31;

    .line 7
    .line 8
    new-instance v1, Lcg;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcg;-><init>(Lw41;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ll2;->j(Ly40;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lz21;-><init>(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p2, Lz21;

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
    sget-object p0, Lo31;->a:Lo31;

    .line 10
    .line 11
    new-instance v0, Lbg;

    .line 12
    .line 13
    invoke-interface {p0}, Lw41;->e()Lyo2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v0, v1, v2}, Lbg;-><init>(Lyo2;I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {p1, v0}, Lve0;->b(Lyo2;)Lwx;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :goto_0
    if-ge v2, v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v4, p1

    .line 43
    check-cast v4, Ldv2;

    .line 44
    .line 45
    invoke-virtual {v4, v0, v2, p0, v3}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {p1, v0}, Lwx;->a(Lyo2;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lc31;->b:Lb31;

    .line 2
    .line 3
    return-object p0
.end method
