.class public abstract Lqi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lsi;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lsi;

    .line 2
    .line 3
    sget-object v1, Lu6;->β:Li2;

    .line 4
    .line 5
    sget-object v2, Lx;->ρ:Ly9;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lsi;-><init>(Lt6;Ly9;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lqi;->α:Lsi;

    .line 11
    .line 12
    return-void
.end method

.method public static final α(Ls6;Lv80;)Lsi;
    .locals 4

    .line 1
    sget-object v0, Lx;->σ:Ly9;

    .line 2
    .line 3
    sget-object v1, Lu6;->β:Li2;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ls6;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lx;->ρ:Ly9;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ly9;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const p0, -0x56396ed8

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lv80;->Φ(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lv80;->ο(Z)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lqi;->α:Lsi;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const v1, -0x56389c81

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lv80;->Φ(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lv80;->Λ()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v3, Lqn;->α:Li2;

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    new-instance v1, Lsi;

    .line 47
    .line 48
    invoke-direct {v1, p0, v0}, Lsi;-><init>(Lt6;Ly9;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Lv80;->е(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    check-cast v1, Lsi;

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Lv80;->ο(Z)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method
