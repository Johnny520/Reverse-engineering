.class public abstract Lbi/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/m2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbi/c;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Li0/m2;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Li0/p1;-><init>(Lfg/a;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lbi/k;->a:Li0/m2;

    .line 13
    .line 14
    return-void
.end method

.method public static final a(Li0/h0;)Lf1/r0;
    .locals 3

    .line 1
    sget-object v0, Lbi/k;->a:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Li0/h0;->g(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Li0/l;->a:Li0/e;

    .line 24
    .line 25
    if-ne v2, v1, :cond_2

    .line 26
    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lz6/a;

    .line 30
    .line 31
    invoke-direct {v0}, Lz6/a;-><init>()V

    .line 32
    .line 33
    .line 34
    :goto_0
    move-object v2, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sget-object v0, Lv/e;->a:Lv/d;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    invoke-virtual {p0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    check-cast v2, Lf1/r0;

    .line 43
    .line 44
    return-object v2
.end method

.method public static final b(FLi0/h0;I)Lf1/r0;
    .locals 3

    .line 1
    sget-object v0, Lbi/k;->a:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    and-int/lit8 v1, p2, 0xe

    .line 14
    .line 15
    xor-int/lit8 v1, v1, 0x6

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Li0/h0;->c(F)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    :cond_0
    and-int/lit8 p2, p2, 0x6

    .line 27
    .line 28
    if-ne p2, v2, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 p2, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p2, 0x0

    .line 33
    :goto_0
    invoke-virtual {p1, v0}, Li0/h0;->g(Z)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    or-int/2addr p2, v1

    .line 38
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez p2, :cond_3

    .line 43
    .line 44
    sget-object p2, Li0/l;->a:Li0/e;

    .line 45
    .line 46
    if-ne v1, p2, :cond_5

    .line 47
    .line 48
    :cond_3
    if-eqz v0, :cond_4

    .line 49
    .line 50
    new-instance p2, Lz6/d;

    .line 51
    .line 52
    invoke-direct {p2, p0}, Lz6/d;-><init>(F)V

    .line 53
    .line 54
    .line 55
    move-object v1, p2

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    invoke-static {p0}, Lv/e;->a(F)Lv/d;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    move-object v1, p0

    .line 62
    :goto_1
    invoke-virtual {p1, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    check-cast v1, Lf1/r0;

    .line 66
    .line 67
    return-object v1
.end method
