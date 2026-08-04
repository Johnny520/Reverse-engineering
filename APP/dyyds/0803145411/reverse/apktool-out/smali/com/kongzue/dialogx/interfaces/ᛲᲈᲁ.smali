.class public abstract Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᲇᛴᲀ;


# static fields
.field public static ᛲᛶᛱᲈ:Ljava/util/HashMap;

.field public static ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

.field public static ᛶᲈᛴᲈ:Ljava/lang/Thread;

.field public static ᲈᲀᛲᲀ:Ljava/lang/ref/WeakReference;


# instance fields
.field public final ᛱᛳᲇ:Z

.field public final ᛱᲈᲁ:Z

.field public final ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

.field public final ᛲᛳᛶᲁ:[I

.field public ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

.field public final ᛳᛸᛴᛶ:I

.field public ᛳᲁᲁᲇ:J

.field public ᛵᛶᛲᲀ:Z

.field public final ᛶᛳᛶᛵ:[I

.field public ᛶᛷᛲᲁ:Lyyds/ᛱᲈᛲ;

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:Z

.field public ᛷᲈᲈᲁ:Landroid/content/Context;

.field public final ᲀᛲᛲᲇ:I

.field public ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

.field public final ᲇᛱᛲ:J

.field public final ᲇᲇᲇᛱ:Landroidx/lifecycle/ᛲᲈᲁ;

.field public ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ᛲᲈᲁ;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Landroidx/lifecycle/ᛲᲈᲁ;-><init>(Lyyds/ᲁᲇᛴᲀ;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ:Z

    .line 17
    .line 18
    new-instance v1, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    new-array v1, v1, [I

    .line 25
    .line 26
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ:[I

    .line 27
    .line 28
    const-wide/16 v1, -0x1

    .line 29
    .line 30
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 31
    .line 32
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ:J

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    new-array v3, v3, [I

    .line 36
    .line 37
    iput-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ:[I

    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 40
    .line 41
    sget-object v3, Lyyds/ᛷᲁᲇᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᲁᲈ;

    .line 42
    .line 43
    iput-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 44
    .line 45
    sget v3, Lyyds/ᛷᲁᲇᲇ;->ᛷᲈᲈᲁ:I

    .line 46
    .line 47
    iput v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ:I

    .line 48
    .line 49
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 50
    .line 51
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ:J

    .line 52
    .line 53
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ:Z

    .line 54
    .line 55
    sget-boolean v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᛳᛶᲁ:Z

    .line 56
    .line 57
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ:Z

    .line 58
    .line 59
    return-void
.end method

.method public static ᛱᛳᛶᛳ(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const-string v0, ">>>"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Landroid/widget/FrameLayout;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static ᛱᛸᲁᲇ(Landroid/view/View;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 10
    .line 11
    if-eqz v0, :cond_10

    .line 12
    .line 13
    iget-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "\u5df2\u5904\u4e8e\u663e\u793a\u72b6\u6001\uff0c\u8bf7\u52ff\u91cd\u590d\u6267\u884c show() \u6307\u4ee4\u3002"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 53
    .line 54
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v3, ".show on "

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᛵᛸ()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const-string v3, "window"

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 97
    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 106
    .line 107
    :cond_4
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    iget v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 111
    .line 112
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    const/4 v3, 0x1

    .line 117
    if-eq v1, v3, :cond_f

    .line 118
    .line 119
    const/4 v3, 0x2

    .line 120
    const/4 v4, 0x0

    .line 121
    if-eq v1, v3, :cond_d

    .line 122
    .line 123
    const/4 v3, 0x3

    .line 124
    if-eq v1, v3, :cond_6

    .line 125
    .line 126
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-nez v1, :cond_5

    .line 131
    .line 132
    goto/16 :goto_4

    .line 133
    .line 134
    :cond_5
    new-instance v1, Lyyds/ᛶᛳᛸᲀ;

    .line 135
    .line 136
    invoke-direct {v1, p0, v0, v2}, Lyyds/ᛶᛳᛸᲀ;-><init>(Landroid/view/View;Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ:Ljava/util/HashMap;

    .line 144
    .line 145
    if-nez p0, :cond_7

    .line 146
    .line 147
    new-instance p0, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    sput-object p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ:Ljava/util/HashMap;

    .line 153
    .line 154
    :cond_7
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v3, Lyyds/ᛷᛶᲇᲁ;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-interface {p0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    sget-object p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;

    .line 167
    .line 168
    if-nez p0, :cond_8

    .line 169
    .line 170
    move-object p0, v4

    .line 171
    goto :goto_1

    .line 172
    :cond_8
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 177
    .line 178
    :goto_1
    if-nez p0, :cond_c

    .line 179
    .line 180
    new-instance p0, Landroid/content/Intent;

    .line 181
    .line 182
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ()Landroid/content/ContextWrapper;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-class v3, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 187
    .line 188
    invoke-direct {p0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    if-nez v1, :cond_9

    .line 196
    .line 197
    const/high16 v1, 0x10000000

    .line 198
    .line 199
    invoke-virtual {p0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    :cond_9
    const-string v1, "dialogXKey"

    .line 203
    .line 204
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {p0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    if-nez v1, :cond_a

    .line 216
    .line 217
    :goto_2
    move v1, v2

    .line 218
    goto :goto_3

    .line 219
    :cond_a
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    if-nez v1, :cond_b

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_b
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    :goto_3
    const-string v3, "fromActivityUiStatus"

    .line 243
    .line 244
    invoke-virtual {p0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 245
    .line 246
    .line 247
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ()Landroid/content/ContextWrapper;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    const-string v3, "from"

    .line 256
    .line 257
    invoke-virtual {p0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ()Landroid/content/ContextWrapper;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    if-eqz p0, :cond_10

    .line 272
    .line 273
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :cond_c
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 286
    .line 287
    .line 288
    throw v4

    .line 289
    :cond_d
    new-instance v1, Lyyds/ᛴᛲᛳᲈ;

    .line 290
    .line 291
    invoke-direct {v1, v0, p0}, Lyyds/ᛴᛲᛳᲈ;-><init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    instance-of p0, p0, Landroidx/appcompat/app/AppCompatActivity;

    .line 299
    .line 300
    if-nez p0, :cond_e

    .line 301
    .line 302
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 303
    .line 304
    const-string p0, ">>>"

    .line 305
    .line 306
    const-string v2, "DialogX.DialogFragment \u6a21\u5f0f\u65e0\u6cd5\u652f\u6301\u975e AppCompatActivity \u542f\u52a8\u3002"

    .line 307
    .line 308
    invoke-static {p0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 312
    .line 313
    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 317
    .line 318
    return-void

    .line 319
    :cond_e
    throw v4

    .line 320
    :cond_f
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0, p0}, Lyyds/ᛲᛸᲈᲈ;->ᛷᛵᲇᲀ(Landroid/app/Activity;Landroid/view/View;)V

    .line 325
    .line 326
    .line 327
    :cond_10
    :goto_4
    return-void
.end method

.method public static ᛲᛱᲁᛳ(Landroid/app/Activity;Landroid/view/View;)V
    .locals 6

    .line 1
    if-eqz p0, :cond_10

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 35
    .line 36
    if-eqz v0, :cond_10

    .line 37
    .line 38
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string p1, "\u5df2\u5904\u4e8e\u663e\u793a\u72b6\u6001\uff0c\u8bf7\u52ff\u91cd\u590d\u6267\u884c show() \u6307\u4ee4\u3002"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const-string p1, ".show ERROR: activity is Destroyed."

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 110
    .line 111
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 115
    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v3, ".show on "

    .line 125
    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 140
    .line 141
    if-nez v1, :cond_6

    .line 142
    .line 143
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 144
    .line 145
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 149
    .line 150
    :cond_6
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    iget v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 154
    .line 155
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    const/4 v3, 0x1

    .line 160
    if-eq v1, v3, :cond_f

    .line 161
    .line 162
    const/4 v3, 0x2

    .line 163
    const/4 v4, 0x0

    .line 164
    if-eq v1, v3, :cond_d

    .line 165
    .line 166
    const/4 v3, 0x3

    .line 167
    if-eq v1, v3, :cond_8

    .line 168
    .line 169
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-nez p0, :cond_7

    .line 174
    .line 175
    goto/16 :goto_2

    .line 176
    .line 177
    :cond_7
    new-instance v1, Lyyds/ᛱᛱᛶᛸ;

    .line 178
    .line 179
    invoke-direct {v1, p1, v0, p0, v2}, Lyyds/ᛱᛱᛶᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_8
    sget-object p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ:Ljava/util/HashMap;

    .line 187
    .line 188
    if-nez p1, :cond_9

    .line 189
    .line 190
    new-instance p1, Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 193
    .line 194
    .line 195
    sput-object p1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ:Ljava/util/HashMap;

    .line 196
    .line 197
    :cond_9
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    new-instance v3, Lyyds/ᛱᛵᲈᲁ;

    .line 202
    .line 203
    const/16 v5, 0x8

    .line 204
    .line 205
    invoke-direct {v3, v5}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    sget-object p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;->ᲇᲇᲇᛱ:Ljava/lang/ref/WeakReference;

    .line 212
    .line 213
    if-nez p1, :cond_a

    .line 214
    .line 215
    move-object p1, v4

    .line 216
    goto :goto_0

    .line 217
    :cond_a
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 222
    .line 223
    :goto_0
    if-nez p1, :cond_c

    .line 224
    .line 225
    new-instance p1, Landroid/content/Intent;

    .line 226
    .line 227
    const-class v1, Lcom/kongzue/dialogx/util/DialogXFloatingWindowActivity;

    .line 228
    .line 229
    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 230
    .line 231
    .line 232
    const-string v1, "dialogXKey"

    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 239
    .line 240
    .line 241
    const-string v0, "from"

    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 248
    .line 249
    .line 250
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-nez v0, :cond_b

    .line 255
    .line 256
    move v0, v2

    .line 257
    goto :goto_1

    .line 258
    :cond_b
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    :goto_1
    const-string v1, "fromActivityUiStatus"

    .line 267
    .line 268
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, v2, v2}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 279
    .line 280
    .line 281
    throw v4

    .line 282
    :cond_d
    new-instance v1, Lyyds/ᛴᛲᛳᲈ;

    .line 283
    .line 284
    invoke-direct {v1, v0, p1}, Lyyds/ᛴᛲᛳᲈ;-><init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V

    .line 285
    .line 286
    .line 287
    instance-of p0, p0, Landroidx/appcompat/app/AppCompatActivity;

    .line 288
    .line 289
    if-nez p0, :cond_e

    .line 290
    .line 291
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 292
    .line 293
    const-string p0, ">>>"

    .line 294
    .line 295
    const-string p1, "DialogX.DialogFragment \u6a21\u5f0f\u65e0\u6cd5\u652f\u6301\u975e AppCompatActivity \u542f\u52a8\u3002"

    .line 296
    .line 297
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 301
    .line 302
    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 306
    .line 307
    return-void

    .line 308
    :cond_e
    throw v4

    .line 309
    :cond_f
    invoke-static {p0, p1}, Lyyds/ᛲᛸᲈᲈ;->ᛷᛵᲇᲀ(Landroid/app/Activity;Landroid/view/View;)V

    .line 310
    .line 311
    .line 312
    :cond_10
    :goto_2
    return-void
.end method

.method public static ᛲᛳᛶᲁ(Landroid/view/View;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, ".dismiss"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᛶᛳ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛱᲈᛲ;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {v1, v0}, Lyyds/ᛱᲈᛲ;->ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 46
    .line 47
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x1

    .line 52
    if-eq v1, v2, :cond_6

    .line 53
    .line 54
    const/4 v3, 0x2

    .line 55
    if-eq v1, v3, :cond_5

    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    if-eq v1, v3, :cond_4

    .line 59
    .line 60
    new-instance v1, Lyyds/ᛶᛳᛸᲀ;

    .line 61
    .line 62
    invoke-direct {v1, p0, v0, v2}, Lyyds/ᛶᛳᛸᲀ;-><init>(Landroid/view/View;Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ()Landroid/os/Handler;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void

    .line 73
    :cond_5
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    if-eqz p0, :cond_7

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_7

    .line 82
    .line 83
    iget-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Lyyds/ᛴᛲᛳᲈ;

    .line 90
    .line 91
    invoke-virtual {p0}, Lyyds/ᲁᛵᛷᛲ;->ᛶᛷᛲᲁ()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 100
    .line 101
    if-eqz v0, :cond_7

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "window"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroid/view/WindowManager;

    .line 120
    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Landroid/view/View;

    .line 126
    .line 127
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    :goto_0
    return-void
.end method

.method public static ᛲᛶᛱᲈ(Landroid/content/Context;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛵᛸᛸᛷ()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    instance-of v0, p0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᲀᛲᲀ(Landroid/app/Activity;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, Lyyds/ᛲᛶᛵᛲ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛴᛲᛷᛸ;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static ᛵᛶᛲᲀ()Landroid/content/ContextWrapper;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, "DialogX \u672a\u521d\u59cb\u5316(E2)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 14
    .line 15
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :cond_0
    return-object v0
.end method

.method public static ᛶᛸᲀᲁ(Landroid/view/View;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-boolean v0, Lyyds/ᛷᲁᲇᲇ;->ᲀᛲᛳᲀ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public static ᛶᲈᛴᲈ()Landroid/app/Activity;
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/app/Activity;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/app/Activity;

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_3
    :goto_1
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛵᛸᛸᛷ()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static ᛷᛲᲈᛱ(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ(Landroid/view/View;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Thread;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Thread;

    .line 16
    .line 17
    :cond_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Thread;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Thread;

    .line 36
    .line 37
    :cond_1
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ()Landroid/os/Handler;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static ᛷᛸᲇᛶ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string p0, "null"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-string p0, "(null)"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static ᛷᲇᛲᛱ(Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᛱᛲ()Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static ᛷᲈᲈᲁ(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const-string v0, ">>>"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static ᛸᛴᛵᛶ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛸᲇᛶ(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/16 p1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static ᲀᛲᛱᛱ(Landroid/app/Activity;)V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    sget-object v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-ne v3, p0, :cond_0

    .line 36
    .line 37
    iget-object v3, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->clear()V

    .line 42
    .line 43
    .line 44
    :cond_1
    iput-object v1, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 45
    .line 46
    iput-object v1, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    sget-object v3, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    instance-of v3, v2, Lyyds/ᛷᲀᛳᛱ;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    check-cast v2, Lyyds/ᛷᲀᛳᛱ;

    .line 58
    .line 59
    invoke-virtual {v2}, Lyyds/ᛷᲀᛳᛱ;->ᛶᲀᲈᲇ()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-ne p0, v0, :cond_4

    .line 68
    .line 69
    sget-object p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 70
    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_3
    sput-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public static ᲁᛶᛴᛸ(Landroid/widget/TextView;Lyyds/ᲇᲇᛱᲇ;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-nez p0, :cond_1

    .line 5
    .line 6
    :goto_0
    return-void

    .line 7
    :cond_1
    iget v0, p1, Lyyds/ᲇᲇᛱᲇ;->ᛲᲈᲁ:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-lez v0, :cond_2

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 14
    .line 15
    .line 16
    :cond_2
    iget v0, p1, Lyyds/ᲇᲇᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    .line 23
    :cond_3
    iget v0, p1, Lyyds/ᲇᲇᛱᲇ;->ᛵᛸᛸᛷ:I

    .line 24
    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    :cond_4
    iget-boolean v0, p1, Lyyds/ᲇᲇᛱᲇ;->ᲇᲇᲇᛱ:Z

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_5
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    iget v0, p1, Lyyds/ᲇᲇᛱᲇ;->ᛲᛴᛳᛲ:I

    .line 46
    .line 47
    if-eq v0, v1, :cond_6

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_6
    const v0, 0x7fffffff

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 57
    .line 58
    .line 59
    :goto_2
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-boolean p1, p1, Lyyds/ᲇᲇᛱᲇ;->ᲇᲈᛵᛷ:Z

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static ᲇᛱᛲ()Landroid/os/Handler;
    .locals 3

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᲀᛲᲀ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᲀᛲᲀ:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/os/Handler;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    new-instance v1, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᲀᛲᲀ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Landroid/os/Handler;

    .line 41
    .line 42
    return-object v0
.end method

.method public static ᲈᲀᛲᲀ(Landroid/app/Activity;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᛴᛳᛲ:[Ljava/lang/String;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_2

    .line 9
    .line 10
    aget-object v3, v0, v2

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    :goto_1
    return-void

    .line 27
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Thread;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛸᲀᲁ:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    return-void

    .line 48
    :catch_0
    move-exception p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    const-string p0, "DialogX.init: \u521d\u59cb\u5316\u5f02\u5e38\uff0c\u627e\u4e0d\u5230Activity\u7684\u6839\u5e03\u5c40"

    .line 53
    .line 54
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public final ᛲᛲᲈᲈ(Z)I
    .locals 0

    .line 1
    xor-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method

.method public ᛲᛳᛴᛸ()Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᛸᛴᛶ:I

    .line 4
    .line 5
    if-ne v2, v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    if-ne v2, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 25
    .line 26
    and-int/lit8 p0, p0, 0x30

    .line 27
    .line 28
    const/16 v0, 0x10

    .line 29
    .line 30
    if-ne p0, v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    if-ne v2, v1, :cond_2

    .line 34
    .line 35
    :goto_0
    return v1

    .line 36
    :cond_2
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public final ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛳᛸᛴᛶ()Landroid/widget/FrameLayout;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᛵᛸ()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p0, "DialogX \u9519\u8bef\uff1a\u5728 getRootFrameLayout() \u65f6\u65e0\u6cd5\u83b7\u53d6\u7ed1\u5b9a\u7684 activity\uff0c\u8bf7\u786e\u8ba4\u662f\u5426\u6b63\u786e\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u6216\u8005\u4f7f\u7528 .show(activity) \u542f\u52a8\u5bf9\u8bdd\u6846\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 21
    .line 22
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    :cond_1
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛳᲇ(Landroid/app/Activity;)Landroid/widget/FrameLayout;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Landroid/widget/FrameLayout;

    .line 47
    .line 48
    :goto_0
    if-nez p0, :cond_3

    .line 49
    .line 50
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v1, "DialogX \u9519\u8bef\uff1a\u5728 getRootFrameLayout() \u65f6\u65e0\u6cd5\u83b7 activity("

    .line 53
    .line 54
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ") \u7684 decorView\uff0c\u8bf7\u68c0\u67e5\u8be5 activity \u662f\u5426\u6b63\u5e38\u663e\u793a\u4e14\u53ef\u4ee5\u4f7f DialogX \u57fa\u4e8e\u5176\u663e\u793a\u3002\n\u82e5\u8be5 activity \u4e0d\u53ef\u7528\uff0c\u53ef\u901a\u8fc7\u4ee5\u4e0b\u4ee3\u7801\u914d\u7f6e\u8c41\u514d DialogX \u5bf9\u8bdd\u6846\u7ed1\u5b9a\u81f3\u8be5 activity\uff0c\u4f8b\u5982\uff1a\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_3
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Landroid/widget/FrameLayout;

    .line 83
    .line 84
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/View;

    .line 12
    .line 13
    return-object p0
.end method

.method public final ᛵᲀᛵᛸ()Z
    .locals 2

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne p0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    :goto_0
    return v0
.end method

.method public final ᛵᲀᲈᛴ(Landroid/widget/EditText;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "input_method"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final ᛶᛳᛶᛵ()Landroid/app/Activity;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    :cond_1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Landroid/app/Activity;

    .line 29
    .line 30
    return-object p0
.end method

.method public abstract ᛶᛷᛲᲁ()Ljava/lang/String;
.end method

.method public final ᛷᛵᲇᲀ(I)I
    .locals 1

    .line 1
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E7)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 8
    .line 9
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/high16 p0, -0x1000000

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0
.end method

.method public ᛸᛸᛷᛱ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲀᛲᛲᲇ()Landroid/content/res/Resources;
    .locals 1

    .line 1
    invoke-static {}, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-nez p0, :cond_4

    .line 56
    .line 57
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :cond_4
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᛶᛲᲀ:Z

    .line 3
    .line 4
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᛵᛸ()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛶᛱᲈ(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E5)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 38
    .line 39
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    iget v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛲᲇ:I

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    if-eq v0, v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    instance-of v0, v0, Lyyds/ᲁᲇᛴᲀ;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lyyds/ᲁᲇᛴᲀ;

    .line 61
    .line 62
    invoke-interface {v0}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v1, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;

    .line 67
    .line 68
    invoke-direct {v1, p0}, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;-><init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string v1, "input_method"

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const/4 v1, 0x2

    .line 101
    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 102
    .line 103
    .line 104
    :cond_2
    return-void
.end method

.method public abstract ᲀᛴᲁᲈ()V
.end method

.method public final ᲇᲇᲇᛱ(Landroid/content/Context;I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᛵᛸ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E3)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 15
    .line 16
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    move-object p1, p0

    .line 25
    :cond_1
    invoke-static {p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 35
    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    move-object p1, p0

    .line 39
    :cond_3
    invoke-static {p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᛵᛸ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string p0, "DialogX \u672a\u521d\u59cb\u5316(E3)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 15
    .line 16
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 39
    .line 40
    if-eqz p0, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_1
    invoke-static {p0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲇᲇᛱ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛶᛷᛲᲁ(Lyyds/ᛶᲈᛷᛸ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    return-void
.end method
