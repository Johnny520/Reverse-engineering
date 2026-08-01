.class public abstract Lak1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lrq0;


# direct methods
.method public constructor <init>(Lp70;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrq0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lrq0;-><init>(Lp70;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lak1;->α:Lrq0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract α(Ljava/lang/Object;)Lq4;
.end method

.method public final β(Lq4;Li72;)Li72;
    .locals 2

    .line 1
    instance-of p0, p2, Lzx;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    iget-boolean p0, p1, Lq4;->δ:Z

    .line 7
    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lzx;

    .line 12
    .line 13
    iget-object p0, v0, Lzx;->α:Lx91;

    .line 14
    .line 15
    invoke-virtual {p1}, Lq4;->γ()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p0, p2}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of p0, p2, Ln02;

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    iget-boolean p0, p1, Lq4;->γ:Z

    .line 28
    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    iget-object p0, p1, Lq4;->β:Ljava/lang/Object;

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    :cond_1
    iget-boolean p0, p1, Lq4;->δ:Z

    .line 36
    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Lq4;->γ()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p2, Ln02;

    .line 44
    .line 45
    iget-object v1, p2, Ln02;->α:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    move-object v0, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of p0, p2, Lgo;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_0
    if-nez v0, :cond_6

    .line 63
    .line 64
    iget-boolean p0, p1, Lq4;->δ:Z

    .line 65
    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    new-instance p0, Lzx;

    .line 69
    .line 70
    iget-object p2, p1, Lq4;->β:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object p1, p1, Lq4;->α:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lxn0;

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    sget-object p1, Lxn0;->Δ:Lxn0;

    .line 79
    .line 80
    :cond_4
    new-instance v0, Lx91;

    .line 81
    .line 82
    invoke-direct {v0, p2, p1}, Lx91;-><init>(Ljava/lang/Object;Lxn0;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, v0}, Lzx;-><init>(Lx91;)V

    .line 86
    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_5
    new-instance p0, Ln02;

    .line 90
    .line 91
    invoke-virtual {p1}, Lq4;->γ()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p0, p1}, Ln02;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_6
    return-object v0
.end method
