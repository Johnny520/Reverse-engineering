.class public abstract Lk/m1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li0/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2/z;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2/z;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Li0/u;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Li0/u;-><init>(Lfg/l;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lk/m1;->a:Li0/u;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(Li0/h0;)Lk/k1;
    .locals 4

    .line 1
    const v0, 0x10dd5ab0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Li0/h0;->a0(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lk/m1;->a:Li0/u;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lk/l1;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Li0/h0;->p(Z)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p0, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    sget-object v2, Li0/l;->a:Li0/e;

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    :cond_1
    invoke-interface {v0}, Lk/l1;->a()Lk/k1;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    check-cast v3, Lk/k1;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Li0/h0;->p(Z)V

    .line 47
    .line 48
    .line 49
    return-object v3
.end method
