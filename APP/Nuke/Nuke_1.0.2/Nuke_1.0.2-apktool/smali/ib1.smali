.class public final Lib1;
.super Lp40;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final n:Lbt;

.field public final o:Ljava/lang/Object;

.field public final p:Lp40;


# direct methods
.method public constructor <init>(Lbt;Ljava/lang/Object;Lp40;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lib1;->n:Lbt;

    .line 11
    .line 12
    iput-object p2, p0, Lib1;->o:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, Lib1;->p:Lp40;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final P(Lbt;Ljava/lang/Object;)Lp40;
    .locals 3

    .line 1
    iget-object v0, p0, Lib1;->n:Lbt;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Lib1;->p:Lp40;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v2, p1, v1}, Lp40;->P(Lbt;Ljava/lang/Object;)Lp40;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-ne v1, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v2, Lib1;

    .line 21
    .line 22
    iget-object p0, p0, Lib1;->o:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-direct {v2, v0, p0, v1}, Lib1;-><init>(Lbt;Ljava/lang/Object;Lp40;)V

    .line 25
    .line 26
    .line 27
    move-object p0, v2

    .line 28
    :goto_0
    move-object v2, p0

    .line 29
    :goto_1
    if-eqz p2, :cond_2

    .line 30
    .line 31
    new-instance p0, Lib1;

    .line 32
    .line 33
    invoke-direct {p0, p1, p2, v2}, Lib1;-><init>(Lbt;Ljava/lang/Object;Lp40;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Lnx0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnx0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lc70;

    .line 9
    .line 10
    new-instance v2, Lta;

    .line 11
    .line 12
    const/16 v3, 0x17

    .line 13
    .line 14
    invoke-direct {v2, v3, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2, v0}, Lc70;-><init>(Lxm0;Lin0;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Lwo2;->T(Luo2;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    if-gt v0, v1, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    move-object v0, p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {p0}, Ldu;->I0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :goto_1
    new-instance v4, Lnx0;

    .line 46
    .line 47
    const/16 p0, 0x13

    .line 48
    .line 49
    invoke-direct {v4, p0}, Lnx0;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const/16 v5, 0x19

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const-string v2, "{"

    .line 56
    .line 57
    const-string v3, "}"

    .line 58
    .line 59
    invoke-static/range {v0 .. v5}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final u(Lbt;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lib1;->n:Lbt;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lbt;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lib1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object p0, p0, Lib1;->p:Lp40;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lp40;->u(Lbt;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
