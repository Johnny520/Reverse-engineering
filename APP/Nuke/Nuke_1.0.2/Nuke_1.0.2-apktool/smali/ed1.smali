.class public final Led1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final a:Led1;

.field public static final b:Lg32;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Led1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Led1;->a:Led1;

    .line 7
    .line 8
    new-instance v0, Lg32;

    .line 9
    .line 10
    const-string v1, "kotlin.Long"

    .line 11
    .line 12
    sget-object v2, Lf32;->m:Lf32;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lg32;-><init>(Ljava/lang/String;Lf32;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Led1;->b:Lg32;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, Ly40;->d()J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-interface {p1, v0, v1}, Lve0;->n(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    sget-object p0, Led1;->b:Lg32;

    .line 2
    .line 3
    return-object p0
.end method
