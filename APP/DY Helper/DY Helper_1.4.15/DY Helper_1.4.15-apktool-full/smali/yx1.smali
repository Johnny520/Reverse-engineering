.class public final synthetic Lyx1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:Landroid/text/Spannable;

.field public final synthetic ζ:Lv2;


# direct methods
.method public synthetic constructor <init>(Landroid/text/Spannable;Lv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyx1;->ε:Landroid/text/Spannable;

    .line 5
    .line 6
    iput-object p2, p0, Lyx1;->ζ:Lv2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lux1;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    new-instance v0, Li50;

    .line 16
    .line 17
    iget-object v1, p1, Lux1;->ζ:Lbr;

    .line 18
    .line 19
    iget-object v2, p1, Lux1;->γ:Ld60;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    sget-object v2, Ld60;->η:Ld60;

    .line 24
    .line 25
    :cond_0
    iget-object v3, p1, Lux1;->δ:Lb60;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iget v3, v3, Lb60;->α:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v3, 0x0

    .line 33
    :goto_0
    iget-object p1, p1, Lux1;->ε:Lc60;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget p1, p1, Lc60;->α:I

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const p1, 0xffff

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object v4, p0, Lyx1;->ζ:Lv2;

    .line 44
    .line 45
    iget-object v4, v4, Lv2;->ε:Lw2;

    .line 46
    .line 47
    iget-object v5, v4, Lw2;->ε:Lf50;

    .line 48
    .line 49
    check-cast v5, Lg50;

    .line 50
    .line 51
    invoke-virtual {v5, v1, v2, v3, p1}, Lg50;->β(Lbr;Ld60;II)Ln62;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    instance-of v1, p1, Ln62;

    .line 56
    .line 57
    if-nez v1, :cond_3

    .line 58
    .line 59
    new-instance v1, Lm6;

    .line 60
    .line 61
    iget-object v2, v4, Lw2;->κ:Lm6;

    .line 62
    .line 63
    invoke-direct {v1, p1, v2}, Lm6;-><init>(Ln62;Lm6;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, v4, Lw2;->κ:Lm6;

    .line 67
    .line 68
    iget-object p1, v1, Lm6;->θ:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast p1, Landroid/graphics/Typeface;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    iget-object p1, p1, Ln62;->ε:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    check-cast p1, Landroid/graphics/Typeface;

    .line 82
    .line 83
    :goto_2
    const/4 v1, 0x1

    .line 84
    invoke-direct {v0, v1, p1}, Li50;-><init>(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const/16 p1, 0x21

    .line 88
    .line 89
    iget-object p0, p0, Lyx1;->ε:Landroid/text/Spannable;

    .line 90
    .line 91
    invoke-interface {p0, v0, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Ls62;->α:Ls62;

    .line 95
    .line 96
    return-object p0
.end method
