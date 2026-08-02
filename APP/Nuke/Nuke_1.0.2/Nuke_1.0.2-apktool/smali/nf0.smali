.class public abstract Lnf0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ln43;

.field public static final b:Lqt2;

.field public static final c:Lqt2;

.field public static final d:Lqt2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    sget-object v0, Lv6;->H:Lv6;

    .line 2
    .line 3
    sget-object v1, Lv6;->I:Lv6;

    .line 4
    .line 5
    new-instance v2, Ln43;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Ln43;-><init>(Lin0;Lin0;)V

    .line 8
    .line 9
    .line 10
    sput-object v2, Lnf0;->a:Ln43;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/high16 v1, 0x43c80000    # 400.0f

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x5

    .line 17
    invoke-static {v0, v1, v2, v3}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sput-object v4, Lnf0;->b:Lqt2;

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lvb3;->a:Ljava/util/Map;

    .line 27
    .line 28
    new-instance v2, Lz01;

    .line 29
    .line 30
    const-wide v3, 0x100000001L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-direct {v2, v3, v4}, Lz01;-><init>(J)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-static {v0, v1, v2, v5}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sput-object v2, Lnf0;->c:Lqt2;

    .line 44
    .line 45
    new-instance v2, Lh11;

    .line 46
    .line 47
    invoke-direct {v2, v3, v4}, Lh11;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1, v2, v5}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lnf0;->d:Lqt2;

    .line 55
    .line 56
    return-void
.end method

.method public static a(Lm43;I)Lsf0;
    .locals 6

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x43c80000    # 400.0f

    .line 6
    .line 7
    const/4 p1, 0x5

    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, v1, p1}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    new-instance p1, Lsf0;

    .line 15
    .line 16
    new-instance v0, Lz33;

    .line 17
    .line 18
    new-instance v1, Luh0;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Luh0;-><init>(Lfj0;)V

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/16 v5, 0x7e

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct/range {v0 .. v5}, Lz33;-><init>(Luh0;Lt11;Lcd2;Ljava/util/LinkedHashMap;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, v0}, Lsf0;-><init>(Lz33;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method
