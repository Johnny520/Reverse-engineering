.class public final Ly8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public g:I

.field public final synthetic h:Ly8/d;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Ly8/d;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly8/c;->h:Ly8/d;

    .line 5
    .line 6
    iput-object p2, p0, Ly8/c;->i:Landroid/app/Activity;

    .line 7
    .line 8
    iput p3, p0, Ly8/c;->j:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-object v0, p0, Ly8/c;->h:Ly8/d;

    .line 2
    .line 3
    iget-object v1, v0, Ly8/d;->c:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v2, v0, Ly8/d;->e:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    iget-object v3, v0, Ly8/d;->f:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    iget-object v4, v0, Ly8/d;->d:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    iget-object v0, v0, Ly8/d;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v5, "auto_view_original_enable"

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v5, p0, Ly8/c;->i:Landroid/app/Activity;

    .line 21
    .line 22
    if-eqz v0, :cond_e

    .line 23
    .line 24
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_e

    .line 29
    .line 30
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_0
    invoke-virtual {v2, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/Integer;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Ly8/c;->j:I

    .line 53
    .line 54
    if-ne v0, v2, :cond_d

    .line 55
    .line 56
    invoke-virtual {v3, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/util/Set;

    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-ne v0, v7, :cond_2

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    sget-object v0, Ly8/d;->j:Ljava/util/List;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_9

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    check-cast v8, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    const-string v10, "id"

    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    invoke-virtual {v9, v8, v10, v11}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-nez v8, :cond_6

    .line 119
    .line 120
    :cond_5
    :goto_0
    move v8, v6

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    invoke-virtual {v5, v8}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    if-eqz v8, :cond_5

    .line 127
    .line 128
    invoke-virtual {v8}, Landroid/view/View;->isShown()Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v9, :cond_5

    .line 133
    .line 134
    invoke-virtual {v8}, Landroid/view/View;->isEnabled()Z

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    if-eqz v9, :cond_5

    .line 139
    .line 140
    invoke-virtual {v8}, Landroid/view/View;->hasOnClickListeners()Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-nez v9, :cond_7

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-lez v9, :cond_5

    .line 152
    .line 153
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-lez v9, :cond_5

    .line 158
    .line 159
    invoke-virtual {v8}, Landroid/view/View;->getAlpha()F

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    const/4 v10, 0x0

    .line 164
    cmpg-float v9, v9, v10

    .line 165
    .line 166
    if-gtz v9, :cond_8

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_8
    invoke-virtual {v8}, Landroid/view/View;->performClick()Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    :goto_1
    if-eqz v8, :cond_4

    .line 174
    .line 175
    move v6, v7

    .line 176
    :cond_9
    :goto_2
    if-eqz v6, :cond_b

    .line 177
    .line 178
    invoke-virtual {v3, v5}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-nez v0, :cond_a

    .line 183
    .line 184
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v5, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    :cond_a
    check-cast v0, Ljava/util/Set;

    .line 193
    .line 194
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_b
    iget v0, p0, Ly8/c;->g:I

    .line 206
    .line 207
    sget-object v2, Ly8/d;->k:[J

    .line 208
    .line 209
    array-length v3, v2

    .line 210
    if-ge v0, v3, :cond_c

    .line 211
    .line 212
    add-int/lit8 v3, v0, 0x1

    .line 213
    .line 214
    iput v3, p0, Ly8/c;->g:I

    .line 215
    .line 216
    aget-wide v3, v2, v0

    .line 217
    .line 218
    invoke-virtual {v1, p0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_c
    invoke-virtual {v4, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_d
    :goto_3
    invoke-virtual {v4, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :cond_e
    :goto_4
    invoke-virtual {v4, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, Ljava/lang/Runnable;

    .line 235
    .line 236
    if-eqz v0, :cond_f

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 239
    .line 240
    .line 241
    :cond_f
    invoke-virtual {v2, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v3, v5}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    return-void
.end method
