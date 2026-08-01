.class public final synthetic Lla2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lpa2;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p6, p0, Lla2;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lla2;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lla2;->η:Lum1;

    .line 6
    .line 7
    iput-object p3, p0, Lla2;->θ:Lpa2;

    .line 8
    .line 9
    iput-object p4, p0, Lla2;->ι:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p5, p0, Lla2;->κ:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lla2;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lla2;->κ:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object v4, p0, Lla2;->ι:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v5, p0, Lla2;->θ:Lpa2;

    .line 11
    .line 12
    iget-object v6, p0, Lla2;->η:Lum1;

    .line 13
    .line 14
    iget-object p0, p0, Lla2;->ζ:Landroid/app/Activity;

    .line 15
    .line 16
    check-cast p1, Lqa2;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_0
    sget-object v0, Lib2;->α:Lib2;

    .line 25
    .line 26
    invoke-static {}, Lib2;->χ()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    move v8, v2

    .line 35
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_2

    .line 40
    .line 41
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    check-cast v9, Lqa2;

    .line 46
    .line 47
    iget-object v9, v9, Lqa2;->γ:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v10, p1, Lqa2;->γ:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v8, -0x1

    .line 62
    :goto_1
    if-ltz v8, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0, v8, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-static {v0}, Lib2;->Η(Ljava/util/ArrayList;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v6, v5, v4, v3, v0}, Lib2;->Κ(Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Lqa2;->β:Ljava/lang/String;

    .line 78
    .line 79
    const-string v0, "\u5df2\u6dfb\u52a0: "

    .line 80
    .line 81
    invoke-static {v2, p0, v0, p1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_3
    return-object v1

    .line 85
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v0, Lib2;->α:Lib2;

    .line 89
    .line 90
    invoke-static {}, Lib2;->χ()Ljava/util/ArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v7, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_5

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    move-object v9, v8

    .line 114
    check-cast v9, Lqa2;

    .line 115
    .line 116
    iget-object v9, v9, Lqa2;->γ:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v10, p1, Lqa2;->γ:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    if-nez v9, :cond_4

    .line 125
    .line 126
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0}, Lib2;->Η(Ljava/util/ArrayList;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v6, v5, v4, v3, v0}, Lib2;->Κ(Lum1;Lpa2;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/List;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p1, Lqa2;->β:Ljava/lang/String;

    .line 142
    .line 143
    const-string v0, "\u5df2\u5220\u9664: "

    .line 144
    .line 145
    invoke-static {v2, p0, v0, p1}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
