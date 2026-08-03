.class public final Lg3/a;
.super Landroid/view/View$AccessibilityDelegate;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lg3/b;


# direct methods
.method public constructor <init>(Lg3/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg3/a;->a:Lg3/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg3/b;->a(Landroid/view/View;)Landroidx/lifecycle/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

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
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 8

    .line 1
    new-instance v0, Lh3/g;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lh3/g;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    sget v1, Lg3/q;->a:I

    .line 7
    .line 8
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-class v3, Ljava/lang/Boolean;

    .line 12
    .line 13
    const/16 v4, 0x1c

    .line 14
    .line 15
    if-lt v1, v4, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Lg3/o;->c(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const v5, 0x7f060068

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v5, v2

    .line 41
    :goto_0
    check-cast v5, Ljava/lang/Boolean;

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    const/4 v7, 0x0

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    move v5, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v5, v7

    .line 56
    :goto_1
    if-lt v1, v4, :cond_3

    .line 57
    .line 58
    invoke-static {p2, v5}, Lb0/b0;->u(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-virtual {v0, v6, v5}, Lh3/g;->f(IZ)V

    .line 63
    .line 64
    .line 65
    :goto_2
    if-lt v1, v4, :cond_4

    .line 66
    .line 67
    invoke-static {p1}, Lg3/o;->b(Landroid/view/View;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    const v5, 0x7f060062

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    move-object v3, v5

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-object v3, v2

    .line 92
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    .line 93
    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_6
    move v6, v7

    .line 104
    :goto_4
    if-lt v1, v4, :cond_7

    .line 105
    .line 106
    invoke-static {p2, v6}, Lh3/c;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_7
    const/4 v3, 0x2

    .line 111
    invoke-virtual {v0, v3, v6}, Lh3/g;->f(IZ)V

    .line 112
    .line 113
    .line 114
    :goto_5
    const-class v3, Ljava/lang/CharSequence;

    .line 115
    .line 116
    if-lt v1, v4, :cond_8

    .line 117
    .line 118
    invoke-static {p1}, Lg3/o;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    goto :goto_6

    .line 123
    :cond_8
    const v5, 0x7f060063

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_9

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_9
    move-object v5, v2

    .line 138
    :goto_6
    check-cast v5, Ljava/lang/CharSequence;

    .line 139
    .line 140
    if-lt v1, v4, :cond_a

    .line 141
    .line 142
    invoke-static {p2, v5}, Lh3/c;->j(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_a
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    .line 151
    .line 152
    invoke-virtual {v4, v6, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    :goto_7
    const/16 v4, 0x1e

    .line 156
    .line 157
    if-lt v1, v4, :cond_b

    .line 158
    .line 159
    invoke-static {p1}, Lg3/p;->a(Landroid/view/View;)Ljava/lang/CharSequence;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    goto :goto_8

    .line 164
    :cond_b
    const v5, 0x7f060069

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_c

    .line 176
    .line 177
    move-object v2, v5

    .line 178
    :cond_c
    :goto_8
    check-cast v2, Ljava/lang/CharSequence;

    .line 179
    .line 180
    if-lt v1, v4, :cond_d

    .line 181
    .line 182
    invoke-static {p2, v2}, Lb2/b;->g(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_d
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const-string v3, "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"

    .line 191
    .line 192
    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 193
    .line 194
    .line 195
    :goto_9
    iget-object v1, p0, Lg3/a;->a:Lg3/b;

    .line 196
    .line 197
    invoke-virtual {v1, p1, v0}, Lg3/b;->b(Landroid/view/View;Lh3/g;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 201
    .line 202
    .line 203
    const p2, 0x7f060060

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, Ljava/util/List;

    .line 211
    .line 212
    if-nez p1, :cond_e

    .line 213
    .line 214
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 215
    .line 216
    :cond_e
    :goto_a
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-ge v7, p2, :cond_f

    .line 221
    .line 222
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    check-cast p2, Lh3/e;

    .line 227
    .line 228
    invoke-virtual {v0, p2}, Lh3/g;->a(Lh3/e;)V

    .line 229
    .line 230
    .line 231
    add-int/lit8 v7, v7, 0x1

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_f
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const v1, 0x7f060060

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/util/List;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ge v3, v4, :cond_2

    .line 26
    .line 27
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lh3/e;

    .line 32
    .line 33
    iget-object v4, v4, Lh3/e;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 36
    .line 37
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-ne v4, p2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    const/high16 v1, 0x7f060000

    .line 56
    .line 57
    if-ne p2, v1, :cond_6

    .line 58
    .line 59
    if-eqz p3, :cond_6

    .line 60
    .line 61
    const-string p2, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    .line 62
    .line 63
    const/4 v0, -0x1

    .line 64
    invoke-virtual {p3, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    const p3, 0x7f060061

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, Landroid/util/SparseArray;

    .line 76
    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    invoke-virtual {p3, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Landroid/text/style/ClickableSpan;

    .line 92
    .line 93
    if-eqz p2, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/view/View;->createAccessibilityNodeInfo()Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    instance-of v0, p3, Landroid/text/Spanned;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    move-object v0, p3

    .line 108
    check-cast v0, Landroid/text/Spanned;

    .line 109
    .line 110
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    const-class v1, Landroid/text/style/ClickableSpan;

    .line 115
    .line 116
    invoke-interface {v0, v2, p3, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p3, [Landroid/text/style/ClickableSpan;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    const/4 p3, 0x0

    .line 124
    :goto_2
    move v0, v2

    .line 125
    :goto_3
    if-eqz p3, :cond_5

    .line 126
    .line 127
    array-length v1, p3

    .line 128
    if-ge v0, v1, :cond_5

    .line 129
    .line 130
    aget-object v1, p3, v0

    .line 131
    .line 132
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_4

    .line 137
    .line 138
    invoke-virtual {p2, p1}, Landroid/text/style/ClickableSpan;->onClick(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    const/4 p1, 0x1

    .line 142
    return p1

    .line 143
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_5
    return v2

    .line 147
    :cond_6
    return v0
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/a;->a:Lg3/b;

    .line 2
    .line 3
    iget-object v0, v0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
