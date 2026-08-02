.class public final Lv63;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Lv63;

.field public static final b:Lgz0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv63;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv63;->a:Lv63;

    .line 7
    .line 8
    const-string v0, "kotlin.UByte"

    .line 9
    .line 10
    sget-object v1, Lmo;->a:Lmo;

    .line 11
    .line 12
    invoke-static {v1, v0}, Lqp0;->b(Lw41;Ljava/lang/String;)Lgz0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lv63;->b:Lgz0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lv63;->b:Lgz0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Ly40;->s(Lyo2;)Ly40;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ly40;->r()B

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    new-instance p1, Ls63;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Ls63;-><init>(B)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ls63;

    .line 2
    .line 3
    iget-byte p0, p2, Ls63;->h:B

    .line 4
    .line 5
    sget-object p2, Lv63;->b:Lgz0;

    .line 6
    .line 7
    invoke-interface {p1, p2}, Lve0;->k(Lyo2;)Lve0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p0}, Lve0;->i(B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Lv63;->b:Lgz0;

    .line 2
    .line 3
    return-object p0
.end method
