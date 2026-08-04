.class public abstract Lyyds/ᛱᛸᛳᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛲᲇ:Ljava/util/List;


# instance fields
.field public ᛱᛳᲇ:Z

.field public ᛱᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

.field public ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Landroid/view/View;

.field public ᛳᲁᲁᲇ:I

.field public ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

.field public ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

.field public ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

.field public ᛶᛷᛲᲁ:Lyyds/ᛱᛸᛳᛵ;

.field public ᛷᛲᲈᛱ:Ljava/util/List;

.field public ᛷᛵᲇᲀ:I

.field public ᛷᲈᲈᲁ:Ljava/util/ArrayList;

.field public ᲀᛲᛳᲀ:I

.field public ᲇᛱᛲ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    sput-object v0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛲᲇ:Ljava/util/List;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 6
    .line 7
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 15
    .line 16
    iput-object v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 17
    .line 18
    iput-object v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ:Ljava/util/ArrayList;

    .line 19
    .line 20
    iput-object v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ:Ljava/util/List;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 24
    .line 25
    iput-object v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 26
    .line 27
    iput-boolean v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 28
    .line 29
    iput v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛳᲁᲁᲇ:I

    .line 30
    .line 31
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ:I

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iput-object p1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "itemView may not be null"

    .line 39
    .line 40
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "ViewHolder"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "{"

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, " position="

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, " id=-1, oldPos="

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ:I

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", pLpos:"

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    const-string v0, " scrap "

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-boolean v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛱᛳᲇ:Z

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    const-string v0, "[changeScrap]"

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const-string v0, "[attachedScrap]"

    .line 101
    .line 102
    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    const-string v0, " invalid"

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    const-string v0, " unbound"

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_4
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 128
    .line 129
    and-int/lit8 v0, v0, 0x2

    .line 130
    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    const-string v0, " update"

    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    const-string v0, " removed"

    .line 145
    .line 146
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    :cond_6
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_7

    .line 154
    .line 155
    const-string v0, " ignored"

    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    :cond_7
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    const-string v0, " tmpDetached"

    .line 167
    .line 168
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    :cond_8
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛱᲈᲁ()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    const-string v2, " not recyclable("

    .line 180
    .line 181
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ")"

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    :cond_9
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 202
    .line 203
    and-int/lit16 v0, v0, 0x200

    .line 204
    .line 205
    if-nez v0, :cond_a

    .line 206
    .line 207
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_b

    .line 212
    .line 213
    :cond_a
    const-string v0, " undefined adapter position"

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    :cond_b
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    if-nez p0, :cond_c

    .line 225
    .line 226
    const-string p0, " no parent"

    .line 227
    .line 228
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    :cond_c
    const-string p0, "}"

    .line 232
    .line 233
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0
.end method

.method public final ᛱᛳᲇ()V
    .locals 3

    .line 1
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Attempting to reset temp-detached ViewHolder: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, ". ViewHolders should be fully detached before resetting."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 38
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 39
    .line 40
    const/4 v1, -0x1

    .line 41
    iput v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 42
    .line 43
    iput v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ:I

    .line 44
    .line 45
    iput v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 46
    .line 47
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    iput-object v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 51
    .line 52
    iput-object v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛸᛳᛵ;

    .line 53
    .line 54
    iget-object v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    :cond_2
    iget v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 62
    .line 63
    and-int/lit16 v2, v2, -0x401

    .line 64
    .line 65
    iput v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 66
    .line 67
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛳᲁᲁᲇ:I

    .line 68
    .line 69
    iput v1, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᛱᛲ:I

    .line 70
    .line 71
    invoke-static {p0}, Lyyds/ᛵᲇᛲᛱ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛸᛳᛵ;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final ᛱᲈᲁ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->hasTransientState()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final ᛲᛲᲈᲈ(IZ)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 15
    .line 16
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    add-int/2addr v0, p1

    .line 21
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 22
    .line 23
    :cond_2
    iget p2, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 24
    .line 25
    add-int/2addr p2, p1

    .line 26
    iput p2, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lyyds/ᲇᲁᛲᲀ;

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lyyds/ᲇᲁᛲᲀ;->ᲀᛲᛳᲀ:Z

    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public final ᛲᛳᛶᲁ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x8

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᛲᛴᛳᛲ()Ljava/util/List;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x400

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᲈᲈᲁ:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛲᲈᛱ:Ljava/util/List;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    sget-object p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛲᲇ:Ljava/util/List;

    .line 22
    .line 23
    return-object p0
.end method

.method public final ᛲᲈᲁ(I)V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 5
    .line 6
    return-void
.end method

.method public final ᛳᲁᲁᲇ(Z)V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-int/2addr v0, v1

    .line 9
    :goto_0
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 10
    .line 11
    if-gez v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛷᛵᲇᲀ:I

    .line 15
    .line 16
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 17
    .line 18
    const-string v1, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "View"

    .line 35
    .line 36
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 41
    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    if-nez p1, :cond_3

    .line 59
    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 63
    .line 64
    or-int/lit8 v0, v0, 0x10

    .line 65
    .line 66
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    if-eqz p1, :cond_4

    .line 70
    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 74
    .line 75
    and-int/lit8 v0, v0, -0x11

    .line 76
    .line 77
    iput v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 78
    .line 79
    :cond_4
    :goto_1
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛷᛶᛲ:Z

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v1, "setIsRecyclable val:"

    .line 86
    .line 87
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, ":"

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "RecyclerView"

    .line 106
    .line 107
    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {v0, p0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᛱᲁᛳ(Lyyds/ᛱᛸᛳᛵ;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᛶᛳᛶᛵ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x20

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x4

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᛷᛲᲈᛱ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x100

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᛷᛵᲇᲀ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᛷᲈᲈᲁ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛲᲈᲈ:Lyyds/ᲈᲈᲁᛱ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getAdapter()Lyyds/ᛲᛵᲇᛳ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    return v1

    .line 19
    :cond_2
    iget-object v2, p0, Lyyds/ᛱᛸᛳᛵ;->ᛶᛳᛶᛵ:Lyyds/ᛵᲇᛲᛱ;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᛱᲁᛳ(Lyyds/ᛱᛸᛳᛵ;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ne v2, v1, :cond_3

    .line 26
    .line 27
    return v1

    .line 28
    :cond_3
    iget-object p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛵᛶᛲᲀ:Lyyds/ᛲᛵᲇᛳ;

    .line 29
    .line 30
    if-ne p0, v0, :cond_4

    .line 31
    .line 32
    return v2

    .line 33
    :cond_4
    return v1
.end method

.method public final ᲇᛱᛲ()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0x80

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final ᲇᲇᲇᛱ()Z
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᛲᛳᛶᲁ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p0, v0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final ᲇᲈᛵᛷ()I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget p0, p0, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    return v0
.end method
