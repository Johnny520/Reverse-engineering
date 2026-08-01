.class public final synthetic Lz71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ld81;


# direct methods
.method public synthetic constructor <init>(Ld81;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz71;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lz71;->ζ:Ld81;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lz71;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lw71;->α:Ljava/util/List;

    .line 7
    .line 8
    invoke-static {v0}, Lxh;->ｇ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lz71;->ζ:Ld81;

    .line 13
    .line 14
    iput-object v0, p0, Ld81;->κ:Ljava/util/List;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Ld81;->λ:I

    .line 18
    .line 19
    invoke-static {v0}, Le81;->π(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ld81;->γ()V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    iget-object p0, p0, Lz71;->ζ:Ld81;

    .line 29
    .line 30
    invoke-virtual {p0}, Ld81;->β()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-gt v0, v1, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget v0, p0, Ld81;->λ:I

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    mul-int/2addr v0, v2

    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    iget-object v4, p0, Ld81;->κ:Ljava/util/List;

    .line 44
    .line 45
    if-ge v3, v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v4, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-static {v4}, Le81;->π(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    iget v0, p0, Ld81;->λ:I

    .line 57
    .line 58
    invoke-virtual {p0}, Ld81;->β()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    sub-int/2addr v2, v1

    .line 63
    if-le v0, v2, :cond_2

    .line 64
    .line 65
    move v0, v2

    .line 66
    :cond_2
    iput v0, p0, Ld81;->λ:I

    .line 67
    .line 68
    invoke-virtual {p0}, Ld81;->γ()V

    .line 69
    .line 70
    .line 71
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_1
    iget-object p0, p0, Lz71;->ζ:Ld81;

    .line 75
    .line 76
    invoke-virtual {p0}, Ld81;->β()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x6

    .line 81
    const/4 v2, 0x0

    .line 82
    if-lt v0, v1, :cond_3

    .line 83
    .line 84
    iget-object p0, p0, Ld81;->α:Landroid/app/Activity;

    .line 85
    .line 86
    const-string v0, "\u6700\u591a\u53ef\u6dfb\u52a0 6 \u7ec4"

    .line 87
    .line 88
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    iget-object v0, p0, Ld81;->κ:Ljava/util/List;

    .line 97
    .line 98
    new-instance v1, Ljava/util/ArrayList;

    .line 99
    .line 100
    const/4 v3, 0x4

    .line 101
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    :goto_2
    if-ge v2, v3, :cond_4

    .line 105
    .line 106
    const-string v4, ""

    .line 107
    .line 108
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Ld81;->κ:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v0}, Le81;->π(Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Ld81;->β()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    add-int/lit8 v0, v0, -0x1

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Ld81;->α(I)Z

    .line 129
    .line 130
    .line 131
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
