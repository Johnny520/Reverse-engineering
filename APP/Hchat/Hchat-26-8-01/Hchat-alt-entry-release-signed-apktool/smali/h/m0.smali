.class public abstract Lh/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/m1;

.field public static final b:Li/r0;

.field public static final c:Li/r0;

.field public static final d:Li/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    sget-object v0, Lh/c;->k:Lh/c;

    .line 2
    .line 3
    sget-object v1, Lh/c;->l:Lh/c;

    .line 4
    .line 5
    new-instance v2, Li/m1;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Li/m1;-><init>(Lfg/l;Lfg/l;)V

    .line 8
    .line 9
    .line 10
    sput-object v2, Lh/m0;->a:Li/m1;

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
    invoke-static {v0, v1, v2, v3}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    sput-object v4, Lh/m0;->b:Li/r0;

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    int-to-long v3, v2

    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    shl-long v5, v3, v5

    .line 31
    .line 32
    const-wide v7, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v3, v7

    .line 38
    or-long/2addr v3, v5

    .line 39
    new-instance v5, Lu2/j;

    .line 40
    .line 41
    invoke-direct {v5, v3, v4}, Lu2/j;-><init>(J)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v5, v2}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sput-object v5, Lh/m0;->c:Li/r0;

    .line 49
    .line 50
    new-instance v5, Lu2/l;

    .line 51
    .line 52
    invoke-direct {v5, v3, v4}, Lu2/l;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1, v5, v2}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lh/m0;->d:Li/r0;

    .line 60
    .line 61
    return-void
.end method

.method public static a(Li/y;I)Lh/r0;
    .locals 7

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
    invoke-static {v0, p0, v1, p1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    new-instance p1, Lh/r0;

    .line 15
    .line 16
    new-instance v0, Lh/h1;

    .line 17
    .line 18
    new-instance v1, Lh/t0;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lh/t0;-><init>(Li/y;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/16 v6, 0x7e

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct/range {v0 .. v6}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Lh/r0;-><init>(Lh/h1;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public static b(Li/l1;I)Lh/s0;
    .locals 7

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
    invoke-static {v0, p0, v1, p1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    new-instance p1, Lh/s0;

    .line 15
    .line 16
    new-instance v0, Lh/h1;

    .line 17
    .line 18
    new-instance v1, Lh/t0;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lh/t0;-><init>(Li/y;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/16 v6, 0x7e

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-direct/range {v0 .. v6}, Lh/h1;-><init>(Lh/t0;Lh/f1;Lh/a0;Lh/a0;Ljava/util/LinkedHashMap;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Lh/s0;-><init>(Lh/h1;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method
