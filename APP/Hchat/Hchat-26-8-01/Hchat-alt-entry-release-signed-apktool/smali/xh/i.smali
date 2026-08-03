.class public abstract Lxh/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:J

.field public static final b:J

.field public static final synthetic c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0, v0}, Lg4/a;->d(FF)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, Lxh/i;->a:J

    .line 9
    .line 10
    const/16 v0, 0x18

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-static {v0, v0}, Lg4/a;->d(FF)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, Lxh/i;->b:J

    .line 18
    .line 19
    return-void
.end method

.method public static a(Li0/h0;)Z
    .locals 3

    .line 1
    sget-object v0, Ly1/h1;->u:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ly1/o2;

    .line 8
    .line 9
    check-cast p0, Ly1/v1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ly1/v1;->a()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Lu2/h;->b(J)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Ly1/v1;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    invoke-static {v1, v2}, Lu2/h;->a(J)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/16 v1, 0x1e0

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    invoke-static {p0, v1}, Lu2/f;->a(FF)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-ltz p0, :cond_0

    .line 35
    .line 36
    const/16 p0, 0x348

    .line 37
    .line 38
    int-to-float p0, p0

    .line 39
    invoke-static {v0, p0}, Lu2/f;->a(FF)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-ltz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method
