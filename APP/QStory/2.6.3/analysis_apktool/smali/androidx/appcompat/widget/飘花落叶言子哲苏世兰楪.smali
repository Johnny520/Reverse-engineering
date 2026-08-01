.class public final Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p1, v1

    .line 21
    :goto_0
    if-ltz p1, :cond_3

    .line 22
    .line 23
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 32
    .line 33
    instance-of v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v1, p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_4

    .line 65
    .line 66
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Landroid/app/Activity;

    .line 73
    .line 74
    invoke-virtual {p0, p2}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0, p2}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {p0, p2}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    :cond_4
    :goto_1
    return v2

    .line 96
    :pswitch_0
    check-cast p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 97
    .line 98
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    const/4 v0, 0x3

    .line 103
    if-eq p1, v0, :cond_5

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->getFromActivity()Landroid/app/Activity;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->getFromActivity()Landroid/app/Activity;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->getFromActivity()Landroid/app/Activity;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    instance-of p1, p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 122
    .line 123
    if-nez p1, :cond_5

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->getFromActivity()Landroid/app/Activity;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0, p2}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    :cond_5
    return v2

    .line 134
    :pswitch_1
    check-cast p1, Landroid/widget/Checkable;

    .line 135
    .line 136
    invoke-interface {p1}, Landroid/widget/Checkable;->isChecked()Z

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_6

    .line 141
    .line 142
    check-cast p0, Landroid/view/GestureDetector;

    .line 143
    .line 144
    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    :cond_6
    return v2

    .line 149
    :pswitch_2
    check-cast p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 150
    .line 151
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世苏哲楪兰:Landroidx/appcompat/widget/飘花落叶言子哲苏楪世兰;

    .line 152
    .line 153
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲楪苏兰:Landroid/os/Handler;

    .line 154
    .line 155
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    float-to-int v4, v4

    .line 166
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    float-to-int p2, p2

    .line 171
    if-nez v3, :cond_7

    .line 172
    .line 173
    if-eqz p0, :cond_7

    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_7

    .line 180
    .line 181
    if-ltz v4, :cond_7

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-ge v4, v5, :cond_7

    .line 188
    .line 189
    if-ltz p2, :cond_7

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-ge p2, p0, :cond_7

    .line 196
    .line 197
    const-wide/16 v3, 0xfa

    .line 198
    .line 199
    invoke-virtual {v0, p1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_7
    if-ne v3, v1, :cond_8

    .line 204
    .line 205
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_2
    return v2

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
