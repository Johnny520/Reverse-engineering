.class public abstract Lm/s0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lm/r0;

.field public static final b:Lm/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm/r0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v2, v3, v1}, Lm/r0;-><init>(ILwf/c;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lm/s0;->a:Lm/r0;

    .line 10
    .line 11
    new-instance v0, Lm/r0;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v2, v3, v1}, Lm/r0;-><init>(ILwf/c;I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lm/s0;->b:Lm/r0;

    .line 18
    .line 19
    return-void
.end method

.method public static a(Ly0/o;Lm/n;Lfg/q;Lfg/q;)Ly0/o;
    .locals 1

    .line 1
    new-instance v0, Lm/q0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lm/q0;-><init>(Lm/n;Lfg/q;Lfg/q;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final b(Lfg/l;Li0/h0;)Lm/n;
    .locals 2

    .line 1
    invoke-static {p0, p1}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Li0/l;->a:Li0/e;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lb0/l;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lb0/l;-><init>(Li0/a1;I)V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lm/n;

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lm/n;-><init>(Lb0/l;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v0, p0

    .line 29
    :cond_0
    check-cast v0, Lm/n;

    .line 30
    .line 31
    return-object v0
.end method

.method public static final c(J)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lu2/q;->b(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, p1}, Lu2/q;->b(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    invoke-static {p0, p1}, Lu2/q;->c(J)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p0, p1}, Lu2/q;->c(J)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    invoke-static {v0, v1}, La/a;->d(FF)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    return-wide p0
.end method
