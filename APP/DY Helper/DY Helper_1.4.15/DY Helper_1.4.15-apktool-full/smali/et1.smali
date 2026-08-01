.class public final synthetic Let1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;

.field public final synthetic η:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p3, p0, Let1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Let1;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Let1;->η:Landroid/app/Activity;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Let1;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ls62;->α:Ls62;

    .line 6
    .line 7
    iget-object v4, p0, Let1;->η:Landroid/app/Activity;

    .line 8
    .line 9
    iget-object p0, p0, Let1;->ζ:Landroid/content/Context;

    .line 10
    .line 11
    check-cast p1, La80;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lx9;->θ()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string p1, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 26
    .line 27
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string p0, "\u5df2\u6253\u5f00"

    .line 36
    .line 37
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p0, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p0, Lhg1;

    .line 46
    .line 47
    const/16 p1, 0xa

    .line 48
    .line 49
    invoke-direct {p0, v4, p1}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-object v3

    .line 56
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-string p1, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528\uff0c\u8bf7\u5148\u5b8c\u6210\u5185\u6d4b\u9a8c\u8bc1"

    .line 69
    .line 70
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    new-instance p0, Lxj0;

    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-direct {p0, p1, v0}, Lxj0;-><init>(La80;I)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Lqh1;

    .line 85
    .line 86
    invoke-direct {p1, v4, v1, p0}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance p0, Lha2;

    .line 93
    .line 94
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v0, Lic;

    .line 98
    .line 99
    const/16 v1, 0xb

    .line 100
    .line 101
    invoke-direct {v0, v4, v1, p1}, Lic;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lha2;->ε:Lic;

    .line 105
    .line 106
    invoke-virtual {v4}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    const-string v0, "dyhelper_voice_replace_file"

    .line 115
    .line 116
    invoke-virtual {p1, p0, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 121
    .line 122
    .line 123
    :goto_1
    return-object v3

    .line 124
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {p0}, Lu90;->ε(Landroid/content/Context;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    sget-object v0, Lbv1;->α:Lbv1;

    .line 134
    .line 135
    new-instance v0, Lz61;

    .line 136
    .line 137
    invoke-direct {v0, p0, v1, p1}, Lz61;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const-string p0, "\u5220\u9664\u56fd\u5916\u6570\u636e\u5e93"

    .line 141
    .line 142
    const-string p1, "\u5220\u9664\u540e\u56fd\u5916\u5730\u533a\u7f16\u7801\u5c06\u65e0\u6cd5\u663e\u793a\u8be6\u7ec6\u540d\u79f0\u3002"

    .line 143
    .line 144
    const-string v1, "\u5220\u9664"

    .line 145
    .line 146
    invoke-static {v4, p0, p1, v1, v0}, Lbv1;->Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    sget-object p0, Lq71;->α:Lq71;

    .line 151
    .line 152
    new-instance p0, Lnt;

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    invoke-direct {p0, p1, v0}, Lnt;-><init>(La80;I)V

    .line 156
    .line 157
    .line 158
    invoke-static {v4, p0}, Lq71;->Ι(Landroid/app/Activity;Lnt;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    return-object v3

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
