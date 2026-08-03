.class public abstract Lh/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    shl-long v2, v0, v2

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v4

    .line 14
    or-long/2addr v0, v2

    .line 15
    sput-wide v0, Lh/d0;->a:J

    .line 16
    .line 17
    return-void
.end method

.method public static a(Ly0/o;)Ly0/o;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    int-to-long v1, v0

    .line 3
    const/16 v3, 0x20

    .line 4
    .line 5
    shl-long v3, v1, v3

    .line 6
    .line 7
    const-wide v5, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v5

    .line 13
    or-long/2addr v1, v3

    .line 14
    new-instance v3, Lu2/l;

    .line 15
    .line 16
    invoke-direct {v3, v1, v2}, Lu2/l;-><init>(J)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/high16 v2, 0x43c80000    # 400.0f

    .line 21
    .line 22
    invoke-static {v1, v2, v3, v0}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p0}, Lc1/h;->c(Ly0/o;)Ly0/o;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v1, Lh/z0;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lh/z0;-><init>(Li/r0;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p0, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
