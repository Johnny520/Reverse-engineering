.class public final Lg41;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Lg41;

.field public static final b:Lf41;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg41;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg41;->a:Lg41;

    .line 7
    .line 8
    sget-object v0, Lf41;->b:Lf41;

    .line 9
    .line 10
    sput-object v0, Lg41;->b:Lf41;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lrg3;->o(Ly40;)Lcv2;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ld41;

    .line 5
    .line 6
    sget-object v0, Lnv2;->a:Lnv2;

    .line 7
    .line 8
    sget-object v0, Lo31;->a:Lo31;

    .line 9
    .line 10
    new-instance v0, Lhb1;

    .line 11
    .line 12
    invoke-direct {v0}, Lhb1;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ll2;->a(Ly40;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/util/Map;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ld41;-><init>(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ld41;

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
    sget-object p0, Lnv2;->a:Lnv2;

    .line 10
    .line 11
    sget-object p0, Lo31;->a:Lo31;

    .line 12
    .line 13
    new-instance p0, Lhb1;

    .line 14
    .line 15
    invoke-direct {p0}, Lhb1;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lhb1;->d(Lve0;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lg41;->b:Lf41;

    .line 2
    .line 3
    return-object p0
.end method
