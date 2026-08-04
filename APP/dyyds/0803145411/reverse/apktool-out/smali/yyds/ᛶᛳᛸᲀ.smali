.class public final Lyyds/ᛶᛳᛸᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛶᛳᛸᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛶᛳᛸᲀ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛶᛳᛸᲀ;->ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛶᛳᛸᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛶᛳᛸᲀ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛶᛳᛸᲀ;->ᛲᛴᛳᛲ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 54
    .line 55
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 56
    .line 57
    invoke-direct {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/lit8 v0, v0, -0x1

    .line 65
    .line 66
    :goto_2
    if-ltz v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-ne v2, v3, :cond_3

    .line 83
    .line 84
    iget-boolean v2, v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const v2, 0x660900af

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    instance-of v2, v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 111
    .line 112
    iget-boolean v2, v2, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛲᛴᛳᛲ:Z

    .line 113
    .line 114
    if-eqz v2, :cond_3

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    :goto_3
    return-void

    .line 124
    :pswitch_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-ne v0, v2, :cond_5

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const-string v0, "\u5df2\u5904\u4e8e\u663e\u793a\u72b6\u6001\uff0c\u8bf7\u52ff\u91cd\u590d\u6267\u884c show() \u6307\u4ee4\u3002"

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_6

    .line 159
    .line 160
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Landroid/view/ViewGroup;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    :goto_4
    return-void

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
