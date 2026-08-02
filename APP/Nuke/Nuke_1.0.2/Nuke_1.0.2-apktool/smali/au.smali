.class public abstract Lau;
.super Ll2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lw41;


# direct methods
.method public constructor <init>(Lw41;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lau;->a:Lw41;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Lve0;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Ll2;->i(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0}, Lw41;->e()Lyo2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1, v1}, Lve0;->b(Lyo2;)Lwx;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p2}, Ll2;->h(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Lw41;->e()Lyo2;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, Lau;->a:Lw41;

    .line 28
    .line 29
    check-cast v4, Lw41;

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    move-object v6, p1

    .line 36
    check-cast v6, Ldv2;

    .line 37
    .line 38
    invoke-virtual {v6, v3, v2, v4, v5}, Ldv2;->w(Lyo2;ILw41;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p1, v1}, Lwx;->a(Lyo2;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public k(Lvx;ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Lw41;->e()Lyo2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lau;->a:Lw41;

    .line 6
    .line 7
    check-cast v1, Lw41;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-interface {p1, v0, p2, v1, v2}, Lvx;->t(Lyo2;ILw41;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p2, p3, p1}, Lau;->n(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public abstract n(ILjava/lang/Object;Ljava/lang/Object;)V
.end method
