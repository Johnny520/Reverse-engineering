.class public final Lv;
.super Landroid/view/View$AccessibilityDelegate;


# instance fields
.field public final a:Lx;


# direct methods
.method public constructor <init>(Lx;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv;->a:Lx;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx;->b(Landroid/view/View;)Ll0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 11

    .line 1
    new-instance v0, Lj0;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lj0;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lja0;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/16 v3, 0x1c

    .line 12
    .line 13
    const-class v4, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-lt v1, v3, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lca0;->d(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v1, 0x7f090188

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v2

    .line 41
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    move v1, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v1, v5

    .line 56
    :goto_1
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY"

    .line 59
    .line 60
    if-lt v7, v3, :cond_3

    .line 61
    .line 62
    invoke-static {p2, v1}, Lc0;->p(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-eqz v9, :cond_4

    .line 71
    .line 72
    invoke-virtual {v9, v8, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    and-int/lit8 v10, v10, -0x2

    .line 77
    .line 78
    or-int/2addr v1, v10

    .line 79
    invoke-virtual {v9, v8, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 83
    .line 84
    if-lt v1, v3, :cond_5

    .line 85
    .line 86
    invoke-static {p1}, Lca0;->c(Landroid/view/View;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    const v1, 0x7f090183

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    move-object v1, v2

    .line 110
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    .line 111
    .line 112
    if-eqz v1, :cond_7

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    move v6, v5

    .line 122
    :goto_4
    if-lt v7, v3, :cond_8

    .line 123
    .line 124
    invoke-static {p2, v6}, Lc0;->y(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_8
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v1, :cond_a

    .line 133
    .line 134
    invoke-virtual {v1, v8, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    and-int/lit8 v4, v4, -0x3

    .line 139
    .line 140
    if-eqz v6, :cond_9

    .line 141
    .line 142
    const/4 v6, 0x2

    .line 143
    goto :goto_5

    .line 144
    :cond_9
    move v6, v5

    .line 145
    :goto_5
    or-int/2addr v4, v6

    .line 146
    invoke-virtual {v1, v8, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    :cond_a
    :goto_6
    invoke-static {p1}, Lja0;->d(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-lt v7, v3, :cond_b

    .line 154
    .line 155
    invoke-static {p2, v1}, Lc0;->o(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    const-string v4, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 164
    .line 165
    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    :goto_7
    const/16 v1, 0x1e

    .line 169
    .line 170
    if-lt v7, v1, :cond_c

    .line 171
    .line 172
    invoke-static {p1}, Lea0;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    goto :goto_8

    .line 177
    :cond_c
    const v3, 0x7f090189

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    const-class v4, Ljava/lang/CharSequence;

    .line 185
    .line 186
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-eqz v4, :cond_d

    .line 191
    .line 192
    move-object v2, v3

    .line 193
    :cond_d
    :goto_8
    check-cast v2, Ljava/lang/CharSequence;

    .line 194
    .line 195
    if-lt v7, v1, :cond_e

    .line 196
    .line 197
    invoke-static {p2, v2}, Ld0;->t(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_e
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 206
    .line 207
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    :goto_9
    iget-object v1, p0, Lv;->a:Lx;

    .line 211
    .line 212
    invoke-virtual {v1, p1, v0}, Lx;->d(Landroid/view/View;Lj0;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    const p2, 0x7f090181

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/util/List;

    .line 226
    .line 227
    if-nez p1, :cond_f

    .line 228
    .line 229
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 230
    .line 231
    :cond_f
    :goto_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 232
    .line 233
    .line 234
    move-result p2

    .line 235
    if-ge v5, p2, :cond_10

    .line 236
    .line 237
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    check-cast p2, Lh0;

    .line 242
    .line 243
    invoke-virtual {v0, p2}, Lj0;->b(Lh0;)V

    .line 244
    .line 245
    .line 246
    add-int/lit8 v5, v5, 0x1

    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_10
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lx;->f(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lx;->g(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx;->h(Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv;->a:Lx;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lx;->i(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
