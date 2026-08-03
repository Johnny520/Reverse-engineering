.class public final synthetic Lr9/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lgg/q;

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Lr9/d0;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Lgg/u;

.field public final synthetic g:Landroid/widget/TextView;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lgg/q;Landroid/widget/EditText;Lr9/d0;Landroid/content/Context;Landroid/widget/TextView;Lgg/u;Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/i;->a:Lgg/q;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/i;->b:Landroid/widget/EditText;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/i;->c:Lr9/d0;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/i;->d:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Lr9/i;->e:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Lr9/i;->f:Lgg/u;

    .line 15
    .line 16
    iput-object p7, p0, Lr9/i;->g:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Lr9/i;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lr9/i;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lr9/i;->a:Lgg/q;

    .line 2
    .line 3
    iget-boolean p1, p1, Lgg/q;->g:Z

    .line 4
    .line 5
    iget-object v0, p0, Lr9/i;->d:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lr9/i;->f:Lgg/u;

    .line 8
    .line 9
    iget-object v2, p0, Lr9/i;->h:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "dialog"

    .line 12
    .line 13
    const-string v4, "\u5df2\u590d\u5236\u9009\u4e2d\u5185\u5bb9"

    .line 14
    .line 15
    const-string v5, ""

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz p1, :cond_8

    .line 20
    .line 21
    iget-object p1, p0, Lr9/i;->b:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v8, v7

    .line 35
    :goto_0
    if-nez v8, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v5, v8

    .line 39
    :goto_1
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-gez v8, :cond_2

    .line 52
    .line 53
    move v8, v6

    .line 54
    :cond_2
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    if-le v9, v10, :cond_3

    .line 71
    .line 72
    move v9, v10

    .line 73
    :cond_3
    if-le v9, v8, :cond_4

    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    :cond_4
    if-eqz v6, :cond_5

    .line 77
    .line 78
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    iget-object v5, p0, Lr9/i;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v8, p0, Lr9/i;->c:Lr9/d0;

    .line 86
    .line 87
    invoke-static {p1, v5, v2, v8}, Lr9/d0;->G0(Landroid/widget/EditText;Ljava/lang/String;Ljava/lang/String;Lr9/d0;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_2
    invoke-static {v0, p1}, Lr9/d0;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    iget-object p1, p0, Lr9/i;->e:Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_6
    iget-object p1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    check-cast p1, Landroid/app/AlertDialog;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v7

    .line 116
    :cond_8
    iget-object p1, p0, Lr9/i;->g:Landroid/widget/TextView;

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-eqz v8, :cond_9

    .line 123
    .line 124
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    goto :goto_3

    .line 129
    :cond_9
    move-object v8, v7

    .line 130
    :goto_3
    if-nez v8, :cond_a

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_a
    move-object v5, v8

    .line 134
    :goto_4
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-gez v8, :cond_b

    .line 147
    .line 148
    move v8, v6

    .line 149
    :cond_b
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionStart()I

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    invoke-static {v9, p1}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-le p1, v9, :cond_c

    .line 166
    .line 167
    move p1, v9

    .line 168
    :cond_c
    if-le p1, v8, :cond_d

    .line 169
    .line 170
    invoke-virtual {v5, v8, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {v0, p1}, Lr9/d0;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v4, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_d
    invoke-static {v0, v2}, Lr9/d0;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iget-object p1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 189
    .line 190
    if-eqz p1, :cond_e

    .line 191
    .line 192
    check-cast p1, Landroid/app/AlertDialog;

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_e
    invoke-static {v3}, Lgg/l;->g(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v7
.end method
