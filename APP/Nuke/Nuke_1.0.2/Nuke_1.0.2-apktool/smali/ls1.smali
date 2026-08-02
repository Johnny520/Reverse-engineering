.class public final Lls1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# instance fields
.field public final a:Lj71;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lhn1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lhn1;-><init>(Lls1;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Li91;->h:Li91;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lls1;->a:Lj71;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lls1;->e()Lyo2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ly40;->b(Lyo2;)Lvx;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Lls1;->e()Lyo2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p1, p0}, Lvx;->j(Lyo2;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, -0x1

    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1, v0}, Lvx;->a(Lyo2;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La83;->a:La83;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p1, Lo01;

    .line 27
    .line 28
    const-string v0, "Unexpected index "

    .line 29
    .line 30
    invoke-static {v0, p0}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lls1;->e()Lyo2;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-interface {p1, p2}, Lve0;->b(Lyo2;)Lwx;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Lls1;->e()Lyo2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p1, p0}, Lwx;->a(Lyo2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lls1;->a:Lj71;

    .line 2
    .line 3
    invoke-interface {p0}, Lj71;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyo2;

    .line 8
    .line 9
    return-object p0
.end method
