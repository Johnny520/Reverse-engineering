.class public abstract Lyw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:I

.field public ζ:I

.field public η:I

.field public θ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lzz1;->ζ:Lzz1;

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    new-instance p0, Lzz1;

    .line 9
    .line 10
    const/16 v0, 0x9

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0, v0, v1}, Lzz1;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    sput-object p0, Lzz1;->ζ:Lzz1;

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lyw0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lzw0;

    .line 6
    .line 7
    iget p0, p0, Lzw0;->κ:I

    .line 8
    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzw0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyw0;->β()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lyw0;->ζ:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lzw0;->γ()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lyw0;->ζ:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lzw0;->λ(I)V

    .line 19
    .line 20
    .line 21
    iput v2, p0, Lyw0;->ζ:I

    .line 22
    .line 23
    iget v0, v0, Lzw0;->μ:I

    .line 24
    .line 25
    iput v0, p0, Lyw0;->η:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "Call next() before removing element from the iterator."

    .line 29
    .line 30
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public α(I)I
    .locals 1

    .line 1
    iget v0, p0, Lyw0;->η:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget p0, p0, Lyw0;->ζ:I

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public β()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzw0;

    .line 4
    .line 5
    iget v0, v0, Lzw0;->μ:I

    .line 6
    .line 7
    iget p0, p0, Lyw0;->η:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public abstract γ(Landroid/view/View;)Ljava/lang/Object;
.end method

.method public abstract δ(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public ε()V
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Lyw0;->ε:I

    .line 2
    .line 3
    iget-object v1, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lzw0;

    .line 6
    .line 7
    iget v2, v1, Lzw0;->κ:I

    .line 8
    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lzw0;->η:[I

    .line 12
    .line 13
    aget v1, v1, v0

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Lyw0;->ε:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public ζ(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget v1, p0, Lyw0;->ζ:I

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lyw0;->δ(Landroid/view/View;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    iget v1, p0, Lyw0;->ζ:I

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-lt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lyw0;->γ(Landroid/view/View;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget v0, p0, Lyw0;->ε:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lyw0;->θ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move-object v0, v2

    .line 41
    :goto_0
    invoke-virtual {p0, v0, p2}, Lyw0;->η(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_d

    .line 46
    .line 47
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-static {p1}, Ly82;->α(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    instance-of v1, v0, Lо;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    check-cast v0, Lо;

    .line 61
    .line 62
    iget-object v2, v0, Lо;->α:Landroidx/core/view/α;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    new-instance v2, Landroidx/core/view/α;

    .line 66
    .line 67
    invoke-direct {v2, v0}, Landroidx/core/view/α;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    if-nez v2, :cond_5

    .line 71
    .line 72
    new-instance v2, Landroidx/core/view/α;

    .line 73
    .line 74
    invoke-direct {v2}, Landroidx/core/view/α;-><init>()V

    .line 75
    .line 76
    .line 77
    :cond_5
    invoke-static {p1, v2}, Lb92;->ζ(Landroid/view/View;Landroidx/core/view/α;)V

    .line 78
    .line 79
    .line 80
    iget v0, p0, Lyw0;->ε:I

    .line 81
    .line 82
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget p0, p0, Lyw0;->η:I

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-string v0, "accessibility"

    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Landroid/view/accessibility/AccessibilityManager;

    .line 98
    .line 99
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_6

    .line 104
    .line 105
    goto/16 :goto_5

    .line 106
    .line 107
    :cond_6
    invoke-static {p1}, Lx82;->α(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    const/4 v1, 0x1

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_7

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/view/View;->getWindowVisibility()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_7

    .line 125
    .line 126
    move v0, v1

    .line 127
    goto :goto_2

    .line 128
    :cond_7
    const/4 v0, 0x0

    .line 129
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getAccessibilityLiveRegion()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    const/16 v3, 0x20

    .line 134
    .line 135
    if-nez v2, :cond_a

    .line 136
    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    if-ne p0, v3, :cond_9

    .line 141
    .line 142
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p1}, Lx82;->α(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    if-eqz p2, :cond_d

    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    :try_start_0
    invoke-interface {p2, p1, p1, p0}, Landroid/view/ViewParent;->notifySubtreeAccessibilityStateChanged(Landroid/view/View;Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :catch_0
    move-exception p0

    .line 191
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const-string p2, " does not fully implement ViewParent"

    .line 204
    .line 205
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const-string p2, "ViewCompat"

    .line 210
    .line 211
    invoke-static {p2, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_a
    :goto_3
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_b
    const/16 v3, 0x800

    .line 223
    .line 224
    :goto_4
    invoke-virtual {p2, v3}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 228
    .line 229
    .line 230
    if-eqz v0, :cond_c

    .line 231
    .line 232
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-static {p1}, Lx82;->α(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    if-nez p0, :cond_c

    .line 248
    .line 249
    invoke-virtual {p1, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 250
    .line 251
    .line 252
    :cond_c
    invoke-virtual {p1, p2}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 253
    .line 254
    .line 255
    :cond_d
    :goto_5
    return-void
.end method

.method public abstract η(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method
