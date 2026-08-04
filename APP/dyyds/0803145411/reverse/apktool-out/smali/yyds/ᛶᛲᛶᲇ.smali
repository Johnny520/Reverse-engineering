.class public final Lyyds/ᛶᛲᛶᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:I

.field public final ᲀᛲᛳᲀ:I


# direct methods
.method public constructor <init>(Lyyds/ᛳᲈᛷᛳ;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lyyds/ᛳᲈᛷᛳ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 5
    .line 6
    iget v1, p1, Lyyds/ᛳᲈᛷᛳ;->ᲇᲈᛵᛷ:F

    .line 7
    .line 8
    iget-object v2, p1, Lyyds/ᛳᲈᛷᛳ;->ᛵᛸᛸᛷ:Landroid/app/ActivityManager;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/high16 v3, 0x200000

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/high16 v3, 0x400000

    .line 20
    .line 21
    :goto_0
    iput v3, p0, Lyyds/ᛶᛲᛶᲇ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/high16 v5, 0x100000

    .line 28
    .line 29
    mul-int/2addr v4, v5

    .line 30
    invoke-virtual {v2}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    int-to-float v4, v4

    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    const v5, 0x3ea8f5c3    # 0.33f

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const v5, 0x3ecccccd    # 0.4f

    .line 42
    .line 43
    .line 44
    :goto_1
    mul-float/2addr v4, v5

    .line 45
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget-object p1, p1, Lyyds/ᛳᲈᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᲁᛴ;

    .line 50
    .line 51
    iget-object p1, p1, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Landroid/util/DisplayMetrics;

    .line 54
    .line 55
    iget v5, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 56
    .line 57
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 58
    .line 59
    mul-int/2addr v5, p1

    .line 60
    mul-int/lit8 v5, v5, 0x4

    .line 61
    .line 62
    int-to-float p1, v5

    .line 63
    mul-float v5, p1, v1

    .line 64
    .line 65
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/high16 v6, 0x40000000    # 2.0f

    .line 70
    .line 71
    mul-float/2addr p1, v6

    .line 72
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    sub-int v7, v4, v3

    .line 77
    .line 78
    add-int v8, p1, v5

    .line 79
    .line 80
    if-gt v8, v7, :cond_2

    .line 81
    .line 82
    iput p1, p0, Lyyds/ᛶᛲᛶᲇ;->ᛵᛸᛸᛷ:I

    .line 83
    .line 84
    iput v5, p0, Lyyds/ᛶᛲᛶᲇ;->ᛲᲈᲁ:I

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    int-to-float p1, v7

    .line 88
    add-float v5, v1, v6

    .line 89
    .line 90
    div-float/2addr p1, v5

    .line 91
    mul-float/2addr v6, p1

    .line 92
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    iput v5, p0, Lyyds/ᛶᛲᛶᲇ;->ᛵᛸᛸᛷ:I

    .line 97
    .line 98
    mul-float/2addr p1, v1

    .line 99
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iput p1, p0, Lyyds/ᛶᛲᛶᲇ;->ᛲᲈᲁ:I

    .line 104
    .line 105
    move v9, v5

    .line 106
    move v5, p1

    .line 107
    move p1, v9

    .line 108
    :goto_2
    const/4 p0, 0x3

    .line 109
    const-string v1, "MemorySizeCalculator"

    .line 110
    .line 111
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-eqz p0, :cond_4

    .line 116
    .line 117
    new-instance p0, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v6, "Calculation complete, Calculated memory cache size: "

    .line 120
    .line 121
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    int-to-long v6, p1

    .line 125
    invoke-static {v0, v6, v7}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string p1, ", pool size: "

    .line 133
    .line 134
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    int-to-long v5, v5

    .line 138
    invoke-static {v0, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p1, ", byte array size: "

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    int-to-long v5, v3

    .line 151
    invoke-static {v0, v5, v6}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p1, ", memory class limited? "

    .line 159
    .line 160
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    if-le v8, v4, :cond_3

    .line 164
    .line 165
    const/4 p1, 0x1

    .line 166
    goto :goto_3

    .line 167
    :cond_3
    const/4 p1, 0x0

    .line 168
    :goto_3
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p1, ", max size: "

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    int-to-long v3, v4

    .line 177
    invoke-static {v0, v3, v4}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p1, ", memoryClass: "

    .line 185
    .line 186
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string p1, ", isLowMemoryDevice: "

    .line 197
    .line 198
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_4
    return-void
.end method
