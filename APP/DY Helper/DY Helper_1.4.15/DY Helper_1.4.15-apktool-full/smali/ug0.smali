.class public final synthetic Lug0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/String;

.field public final synthetic κ:Z

.field public final synthetic λ:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZI)V
    .locals 0

    .line 1
    iput p7, p0, Lug0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lug0;->ζ:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, Lug0;->η:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lug0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lug0;->ι:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p5, p0, Lug0;->κ:Z

    .line 12
    .line 13
    iput-boolean p6, p0, Lug0;->λ:Z

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lug0;->ε:I

    .line 2
    .line 3
    const v1, 0x7e34000b

    .line 4
    .line 5
    .line 6
    sget-object v2, Lyg0;->ε:Lyg0;

    .line 7
    .line 8
    const v3, 0x7e340002

    .line 9
    .line 10
    .line 11
    const v4, 0x7e340003

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v7, p0, Lug0;->ζ:Landroid/view/View;

    .line 19
    .line 20
    invoke-virtual {v7, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v8, p0, Lug0;->η:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {v7}, Landroid/view/View;->isAttachedToWindow()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 40
    .line 41
    iget-object v9, p0, Lug0;->θ:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v10, p0, Lug0;->ι:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v11, p0, Lug0;->κ:Z

    .line 46
    .line 47
    invoke-static {v7, v9, v10, v11, v8}, Lah0;->а(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-boolean v12, p0, Lug0;->λ:Z

    .line 52
    .line 53
    if-ne v0, v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v7, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of p0, p0, Landroid/view/View$OnLayoutChangeListener;

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    new-instance v6, Lwg0;

    .line 68
    .line 69
    invoke-direct/range {v6 .. v12}, Lwg0;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v1, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v7, v6}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    sget-object p0, Lyg0;->ζ:Lyg0;

    .line 80
    .line 81
    if-eq v0, p0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v7, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance v6, Lug0;

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    invoke-direct/range {v6 .. v13}, Lug0;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZI)V

    .line 91
    .line 92
    .line 93
    const-wide/16 v0, 0xa0

    .line 94
    .line 95
    invoke-virtual {v7, v6, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    :goto_0
    invoke-virtual {v7, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :goto_1
    return-void

    .line 103
    :pswitch_0
    iget-object v9, p0, Lug0;->ζ:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v9, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v10, p0, Lug0;->η:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v0, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    invoke-virtual {v9}, Landroid/view/View;->isAttachedToWindow()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 124
    .line 125
    iget-object v11, p0, Lug0;->θ:Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v12, p0, Lug0;->ι:Ljava/lang/String;

    .line 128
    .line 129
    iget-boolean v13, p0, Lug0;->κ:Z

    .line 130
    .line 131
    invoke-static {v9, v11, v12, v13, v10}, Lah0;->а(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-ne v0, v2, :cond_6

    .line 136
    .line 137
    invoke-virtual {v9, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    instance-of v0, v0, Landroid/view/View$OnLayoutChangeListener;

    .line 142
    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    new-instance v8, Lwg0;

    .line 147
    .line 148
    iget-boolean v14, p0, Lug0;->λ:Z

    .line 149
    .line 150
    invoke-direct/range {v8 .. v14}, Lwg0;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZ)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9, v1, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9, v8}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 157
    .line 158
    .line 159
    :cond_6
    :goto_2
    invoke-virtual {v9, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_7

    .line 168
    .line 169
    invoke-virtual {v9, v4, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
