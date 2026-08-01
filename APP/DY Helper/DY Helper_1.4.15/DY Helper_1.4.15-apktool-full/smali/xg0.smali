.class public final synthetic Lxg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Z

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/io/Serializable;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;ZLky1;La80;)V
    .locals 1

    .line 18
    const/4 v0, 0x2

    iput v0, p0, Lxg0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg0;->η:Ljava/lang/Object;

    iput-object p2, p0, Lxg0;->θ:Ljava/io/Serializable;

    iput-boolean p3, p0, Lxg0;->ζ:Z

    iput-object p4, p0, Lxg0;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lxg0;->κ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V
    .locals 0

    .line 19
    const/4 p6, 0x0

    iput p6, p0, Lxg0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg0;->η:Ljava/lang/Object;

    iput-object p2, p0, Lxg0;->θ:Ljava/io/Serializable;

    iput-object p3, p0, Lxg0;->κ:Ljava/lang/Object;

    iput-object p4, p0, Lxg0;->ι:Ljava/lang/Object;

    iput-boolean p5, p0, Lxg0;->ζ:Z

    return-void
.end method

.method public synthetic constructor <init>(Lum1;Lum1;Landroid/app/Activity;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxg0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxg0;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lxg0;->θ:Ljava/io/Serializable;

    .line 10
    .line 11
    iput-object p3, p0, Lxg0;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lxg0;->κ:Ljava/lang/Object;

    .line 14
    .line 15
    iput-boolean p5, p0, Lxg0;->ζ:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lxg0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "DYHelper"

    .line 5
    .line 6
    iget-object v3, p0, Lxg0;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lxg0;->ι:Ljava/lang/Object;

    .line 9
    .line 10
    iget-boolean v5, p0, Lxg0;->ζ:Z

    .line 11
    .line 12
    iget-object v6, p0, Lxg0;->θ:Ljava/io/Serializable;

    .line 13
    .line 14
    iget-object p0, p0, Lxg0;->η:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p0, Landroid/app/Activity;

    .line 20
    .line 21
    check-cast v6, Ljava/lang/String;

    .line 22
    .line 23
    check-cast v4, Lky1;

    .line 24
    .line 25
    check-cast v3, La80;

    .line 26
    .line 27
    :try_start_0
    sget-object v0, Lpf1;->α:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, v6, v5, v4, v3}, Lpf1;->ε(Landroid/app/Activity;Ljava/lang/String;ZLky1;La80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    const-string v1, "\u6253\u5f00\u98df\u7269\u9009\u62e9\u5f39\u7a97\u5931\u8d25"

    .line 35
    .line 36
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    const-string v0, ""

    .line 46
    .line 47
    :cond_0
    const-string v1, "\u6253\u5f00\u98df\u7269\u9009\u62e9\u5f39\u7a97\u5931\u8d25: "

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-static {v2, p0, v1, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :pswitch_0
    check-cast p0, Lum1;

    .line 55
    .line 56
    check-cast v6, Lum1;

    .line 57
    .line 58
    check-cast v4, Landroid/app/Activity;

    .line 59
    .line 60
    check-cast v3, Ljava/util/List;

    .line 61
    .line 62
    sget-object v0, Lq71;->α:Lq71;

    .line 63
    .line 64
    :try_start_1
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0, v3, v5, v4}, Lq71;->γ(Lf8;Ljava/util/List;ZLandroid/app/Activity;)Ljava/util/ArrayList;

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    goto :goto_1

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    new-instance v3, Leo1;

    .line 75
    .line 76
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object v0, v3

    .line 80
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    const-string v4, "\u5237\u65b0\u64cd\u4f5c\u9762\u677f\u4e66\u7b7e\u72b6\u6001\u5931\u8d25"

    .line 87
    .line 88
    invoke-static {v2, v4, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-object v2, p0, Lum1;->ε:Ljava/lang/Object;

    .line 92
    .line 93
    instance-of v3, v0, Leo1;

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    move-object v0, v2

    .line 98
    :cond_2
    iput-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 99
    .line 100
    iget-object p0, v6, Lum1;->ε:Ljava/lang/Object;

    .line 101
    .line 102
    if-eqz p0, :cond_3

    .line 103
    .line 104
    check-cast p0, La80;

    .line 105
    .line 106
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    const-string p0, "renderUi"

    .line 113
    .line 114
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :pswitch_1
    check-cast p0, Landroid/view/View;

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    check-cast v4, Ljava/lang/String;

    .line 123
    .line 124
    const v0, 0x7e34000c

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    const v0, 0x7e340002

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_4

    .line 148
    .line 149
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 150
    .line 151
    invoke-static {p0, v3, v4, v5, v6}, Lah0;->а(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;

    .line 152
    .line 153
    .line 154
    :cond_4
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
