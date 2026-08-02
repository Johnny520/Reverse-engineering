.class public final Ls6;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lb7;


# direct methods
.method public synthetic constructor <init>(Lb7;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls6;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Ls6;->j:Lb7;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ls6;->i:I

    .line 2
    .line 3
    iget-object p0, p0, Ls6;->j:Lb7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lb7;->h(Lb7;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    iget-object v0, p0, Lb7;->D0:Landroid/view/MotionEvent;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x7

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/16 v1, 0x9

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p0, Lb7;->E0:J

    .line 34
    .line 35
    iget-object v0, p0, Lb7;->J0:Ly4;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    invoke-virtual {p0}, Lb7;->getConfiguration()Landroid/content/res/Configuration;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance v0, Llc1;

    .line 52
    .line 53
    new-instance v1, Lmc1;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lmc1;-><init>(Landroid/os/LocaleList;)V

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Llc1;-><init>(Lmc1;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance v0, Llc1;

    .line 72
    .line 73
    new-instance v1, Lmc1;

    .line 74
    .line 75
    invoke-direct {v1, p0}, Lmc1;-><init>(Landroid/os/LocaleList;)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1}, Llc1;-><init>(Lmc1;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object p0, v0, Llc1;->a:Lmc1;

    .line 82
    .line 83
    iget-object p0, p0, Lmc1;->a:Landroid/os/LocaleList;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/os/LocaleList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    new-instance v1, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    :goto_1
    if-ge v2, v0, :cond_3

    .line 96
    .line 97
    new-instance v3, Ljc1;

    .line 98
    .line 99
    invoke-virtual {p0, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-direct {v3, v4}, Ljc1;-><init>(Ljava/util/Locale;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    new-instance p0, Lkc1;

    .line 116
    .line 117
    invoke-direct {p0, v1}, Lkc1;-><init>(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_2
    iget-object p0, p0, Lb7;->x:Lnx1;

    .line 122
    .line 123
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Ljava/lang/Boolean;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
