.class public abstract Luv0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;

.field public static final b:Lwv0;

.field public static final c:Lwv0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lus0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lej;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Luv0;->a:Lej;

    .line 13
    .line 14
    new-instance v0, Lwv0;

    .line 15
    .line 16
    sget-wide v1, Lff;->g:J

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 20
    .line 21
    invoke-direct {v0, v3, v4, v1, v2}, Lwv0;-><init>(ZFJ)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Luv0;->b:Lwv0;

    .line 25
    .line 26
    new-instance v0, Lwv0;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v3, v4, v1, v2}, Lwv0;-><init>(ZFJ)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Luv0;->c:Lwv0;

    .line 33
    .line 34
    return-void
.end method

.method public static a(FI)Lwv0;
    .locals 4

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move p0, v1

    .line 15
    :cond_1
    sget-wide v2, Lff;->g:J

    .line 16
    .line 17
    invoke-static {p0, v1}, Lnp;->b(FF)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    invoke-static {v2, v3, v2, v3}, Lff;->c(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Luv0;->b:Lwv0;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object p0, Luv0;->c:Lwv0;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p1, Lwv0;

    .line 38
    .line 39
    invoke-direct {p1, v0, p0, v2, v3}, Lwv0;-><init>(ZFJ)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method
