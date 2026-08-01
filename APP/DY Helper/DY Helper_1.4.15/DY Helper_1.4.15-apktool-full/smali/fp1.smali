.class public abstract Lfp1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lgp1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgp1;

    .line 2
    .line 3
    sget-object v1, Lu6;->α:Li2;

    .line 4
    .line 5
    sget-object v1, Lx;->ο:Lz9;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lgp1;-><init>(Lz9;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lfp1;->α:Lgp1;

    .line 11
    .line 12
    return-void
.end method

.method public static final α(Lv80;)Lgp1;
    .locals 4

    .line 1
    sget-object v0, Lu6;->α:Li2;

    .line 2
    .line 3
    sget-object v1, Lx;->π:Lz9;

    .line 4
    .line 5
    invoke-virtual {v0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    sget-object v2, Lx;->ο:Lz9;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lz9;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const v0, -0x40015a57

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lv80;->Φ(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v3}, Lv80;->ο(Z)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lfp1;->α:Lgp1;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const v2, -0x400093a0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lv80;->Φ(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0}, Lv80;->Λ()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    sget-object v0, Lqn;->α:Li2;

    .line 49
    .line 50
    if-ne v2, v0, :cond_2

    .line 51
    .line 52
    :cond_1
    new-instance v2, Lgp1;

    .line 53
    .line 54
    invoke-direct {v2, v1}, Lgp1;-><init>(Lz9;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    check-cast v2, Lgp1;

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lv80;->ο(Z)V

    .line 63
    .line 64
    .line 65
    return-object v2
.end method
