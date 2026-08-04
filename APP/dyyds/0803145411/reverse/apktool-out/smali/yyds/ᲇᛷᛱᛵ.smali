.class public abstract Lyyds/ᲇᛷᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Lyyds/ᲁᲇᛴᲀ;
.implements Lyyds/ᛳᛲᛷᛷ;
.implements Lyyds/ᲈᛵᛴᲇ;
.implements Lyyds/ᲁᛱᲀᛱ;


# static fields
.field public static final ᛲᛲᲈᲈ:Ljava/lang/Object;


# instance fields
.field public final ᛱᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

.field public ᛲᛳᛶᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᲈᲇᲀᛲ;

.field public ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

.field public final ᛷᛲᲈᛱ:Ljava/util/ArrayList;

.field public final ᛷᛵᲇᲀ:Lyyds/ᛱᛱᛴ;

.field public ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛲᲈᲈ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lyyds/ᲈᲇᲀᛲ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lyyds/ᲈᲇᲀᛲ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲇᲀᛲ;

    .line 24
    .line 25
    iput-boolean v1, p0, Lyyds/ᲇᛷᛱᛵ;->ᲇᲇᲇᛱ:Z

    .line 26
    .line 27
    new-instance v0, Lyyds/ᛴᛶᛳᛸ;

    .line 28
    .line 29
    const/16 v2, 0x8

    .line 30
    .line 31
    invoke-direct {v0, v2, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lyyds/ᛶᲈᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲈᛷᛸ;

    .line 35
    .line 36
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛱᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

    .line 37
    .line 38
    new-instance v0, Lyyds/ᲇᛸᲀᛳ;

    .line 39
    .line 40
    invoke-direct {v0}, Lyyds/ᲇᛸᲀᛳ;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v0, Lyyds/ᛱᛱᛴ;

    .line 56
    .line 57
    const/16 v2, 0x17

    .line 58
    .line 59
    invoke-direct {v0, v2, p0}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛱᛴ;

    .line 63
    .line 64
    new-instance v0, Landroidx/lifecycle/ᛲᲈᲁ;

    .line 65
    .line 66
    invoke-direct {v0, p0}, Landroidx/lifecycle/ᛲᲈᲁ;-><init>(Lyyds/ᲁᲇᛴᲀ;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛳᛶᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 70
    .line 71
    new-instance v0, Lyyds/ᛶᲁᛲᲈ;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Lyyds/ᛶᲁᛲᲈ;-><init>(Lyyds/ᲁᛱᲀᛱ;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 77
    .line 78
    iget-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᛲᲈᛱ:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v2, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛱᛴ;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-nez v3, :cond_9

    .line 87
    .line 88
    iget p0, p0, Lyyds/ᲇᛷᛱᛵ;->ᲀᛲᛳᲀ:I

    .line 89
    .line 90
    if-ltz p0, :cond_8

    .line 91
    .line 92
    iget-object p0, v2, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast p0, Lyyds/ᲇᛷᛱᛵ;

    .line 95
    .line 96
    iget-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 97
    .line 98
    invoke-virtual {v0}, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛳᛶᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 102
    .line 103
    iget-object v0, v0, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 104
    .line 105
    sget-object v2, Lyyds/ᛶᲈᛷᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 106
    .line 107
    if-eq v0, v2, :cond_1

    .line 108
    .line 109
    sget-object v2, Lyyds/ᛶᲈᛷᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛶᲈᛷᛸ;

    .line 110
    .line 111
    if-ne v0, v2, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    const-string p0, "Failed requirement."

    .line 115
    .line 116
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_5

    .line 120
    .line 121
    :cond_1
    :goto_0
    iget-object v0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 122
    .line 123
    iget-object v0, v0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Lyyds/ᛲᛴᛴᛱ;

    .line 126
    .line 127
    iget-object v0, v0, Lyyds/ᛲᛴᛴᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lyyds/ᛲᛸᛸᛶ;

    .line 130
    .line 131
    invoke-virtual {v0}, Lyyds/ᛲᛸᛸᛶ;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_2
    move-object v2, v0

    .line 136
    check-cast v2, Lyyds/ᛸᛱᛷᛱ;

    .line 137
    .line 138
    invoke-virtual {v2}, Lyyds/ᛸᛱᛷᛱ;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    const/4 v4, 0x0

    .line 143
    const-string v5, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 144
    .line 145
    if-eqz v3, :cond_3

    .line 146
    .line 147
    invoke-virtual {v2}, Lyyds/ᛸᛱᛷᛱ;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/util/Map$Entry;

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ljava/lang/String;

    .line 158
    .line 159
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Lyyds/ᛸᛶᲀᲈ;

    .line 164
    .line 165
    invoke-static {v3, v5}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_2

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    move-object v2, v4

    .line 173
    :goto_1
    if-nez v2, :cond_7

    .line 174
    .line 175
    new-instance v0, Lyyds/ᛲᲀᛸᛳ;

    .line 176
    .line 177
    iget-object v2, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 178
    .line 179
    iget-object v2, v2, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v2, Lyyds/ᛲᛴᛴᛱ;

    .line 182
    .line 183
    invoke-direct {v0, v2, p0}, Lyyds/ᛲᲀᛸᛳ;-><init>(Lyyds/ᛲᛴᛴᛱ;Lyyds/ᛳᛲᛷᛷ;)V

    .line 184
    .line 185
    .line 186
    iget-object v2, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 187
    .line 188
    iget-object v2, v2, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v2, Lyyds/ᛲᛴᛴᛱ;

    .line 191
    .line 192
    iget-object v2, v2, Lyyds/ᛲᛴᛴᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v2, Lyyds/ᛲᛸᛸᛶ;

    .line 195
    .line 196
    invoke-virtual {v2, v5}, Lyyds/ᛲᛸᛸᛶ;->ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᲈᛱᲇᲇ;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-eqz v3, :cond_4

    .line 201
    .line 202
    iget-object v1, v3, Lyyds/ᲈᛱᲇᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_4
    new-instance v3, Lyyds/ᲈᛱᲇᲇ;

    .line 206
    .line 207
    invoke-direct {v3, v5, v0}, Lyyds/ᲈᛱᲇᲇ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    iget v5, v2, Lyyds/ᛲᛸᛸᛶ;->ᲇᲇᲇᛱ:I

    .line 211
    .line 212
    add-int/2addr v5, v1

    .line 213
    iput v5, v2, Lyyds/ᛲᛸᛸᛶ;->ᲇᲇᲇᛱ:I

    .line 214
    .line 215
    iget-object v1, v2, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 216
    .line 217
    if-nez v1, :cond_5

    .line 218
    .line 219
    iput-object v3, v2, Lyyds/ᛲᛸᛸᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᲇᲇ;

    .line 220
    .line 221
    iput-object v3, v2, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_5
    iput-object v3, v1, Lyyds/ᲈᛱᲇᲇ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛱᲇᲇ;

    .line 225
    .line 226
    iput-object v1, v3, Lyyds/ᲈᛱᲇᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛱᲇᲇ;

    .line 227
    .line 228
    iput-object v3, v2, Lyyds/ᛲᛸᛸᛶ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲇᲇ;

    .line 229
    .line 230
    :goto_2
    move-object v1, v4

    .line 231
    :goto_3
    check-cast v1, Lyyds/ᛸᛶᲀᲈ;

    .line 232
    .line 233
    if-nez v1, :cond_6

    .line 234
    .line 235
    iget-object v1, p0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛳᛶᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 236
    .line 237
    new-instance v2, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 238
    .line 239
    invoke-direct {v2, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Lyyds/ᛲᲀᛸᛳ;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_6
    const-string p0, "SavedStateProvider with the given key is already registered"

    .line 247
    .line 248
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_7
    :goto_4
    iget-object p0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 253
    .line 254
    invoke-virtual {p0, v4}, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ(Landroid/os/Bundle;)V

    .line 255
    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_9
    :goto_5
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x1

    .line 6
    return p0
.end method

.method public final getActivity()Landroidx/fragment/app/FragmentActivity;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᛷᛱᛵ;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    new-instance p2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p3, "Fragment "

    .line 16
    .line 17
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, " not attached to an activity."

    .line 24
    .line 25
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public final onLowMemory()V
    .locals 0

    .line 1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "{"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "} ("

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lyyds/ᲇᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ")"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛲᛳᛶᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()Lyyds/ᛲᛴᛴᛱ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛷᛱᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛲᛴᛴᛱ;

    .line 6
    .line 7
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛳᲇᛸᲁ;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fragment "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not attached to a context."

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᲈᲇᲀᛲ;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fragment "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, " not associated with a fragment manager."

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final ᲇᲈᛵᛷ()Lyyds/ᲁᛵᛱᲇ;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Can\'t access ViewModels from detached fragment"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
