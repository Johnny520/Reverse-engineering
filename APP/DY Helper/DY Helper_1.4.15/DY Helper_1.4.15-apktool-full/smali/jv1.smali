.class public final Ljv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liv1;


# instance fields
.field public final synthetic α:Lkv1;


# direct methods
.method public constructor <init>(Lkv1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljv1;->α:Lkv1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(JLnp0;Lyr;)Lu81;
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ljv1;->α:Lkv1;

    .line 8
    .line 9
    iget-object v0, p0, Lkv1;->α:Lp70;

    .line 10
    .line 11
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Liv1;

    .line 16
    .line 17
    iget-object v1, p0, Lkv1;->β:Liv1;

    .line 18
    .line 19
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iput-object v0, p0, Lkv1;->β:Liv1;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, Lkv1;->γ:Lu81;

    .line 29
    .line 30
    :cond_0
    iget-object v1, p0, Lkv1;->γ:Lu81;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-wide v1, p0, Lkv1;->δ:J

    .line 35
    .line 36
    invoke-static {v1, v2, p1, p2}, Ljw1;->α(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lkv1;->ε:Lnp0;

    .line 43
    .line 44
    if-ne v1, p3, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lkv1;->ζ:Ljava/lang/Float;

    .line 47
    .line 48
    invoke-interface {p4}, Lyr;->β()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    cmpl-float v1, v1, v2

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iput-wide p1, p0, Lkv1;->δ:J

    .line 64
    .line 65
    iput-object p3, p0, Lkv1;->ε:Lnp0;

    .line 66
    .line 67
    invoke-interface {p4}, Lyr;->β()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, p0, Lkv1;->ζ:Ljava/lang/Float;

    .line 76
    .line 77
    invoke-interface {v0, p1, p2, p3, p4}, Liv1;->α(JLnp0;Lyr;)Lu81;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, Lkv1;->γ:Lu81;

    .line 82
    .line 83
    :goto_0
    iget-object p0, p0, Lkv1;->γ:Lu81;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    return-object p0
.end method
