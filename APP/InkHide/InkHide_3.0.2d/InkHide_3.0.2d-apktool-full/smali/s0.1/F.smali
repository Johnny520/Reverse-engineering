.class public final synthetic Ls0/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/widget/EditText;

.field public final synthetic d:Ls0/J;

.field public final synthetic e:LM0/a;

.field public final synthetic f:LN0/l;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Ls0/J;LM0/a;LN0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/F;->b:Landroid/widget/EditText;

    iput-object p2, p0, Ls0/F;->c:Landroid/widget/EditText;

    iput-object p3, p0, Ls0/F;->d:Ls0/J;

    iput-object p4, p0, Ls0/F;->e:LM0/a;

    iput-object p5, p0, Ls0/F;->f:LN0/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object p1, p0, Ls0/F;->b:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p1, v0

    .line 32
    :goto_0
    if-eqz p1, :cond_6

    .line 33
    .line 34
    new-instance v1, LR0/c;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-direct {v1, v2, v3, v4}, LR0/a;-><init>(III)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v1, v2}, LR0/c;->a(I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, Ls0/F;->c:Landroid/widget/EditText;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_2

    .line 68
    .line 69
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    invoke-static {v1}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v1, v0

    .line 85
    :goto_1
    if-eqz v1, :cond_5

    .line 86
    .line 87
    new-instance v2, LR0/c;

    .line 88
    .line 89
    const/16 v3, 0xc8

    .line 90
    .line 91
    const/16 v5, 0xbb8

    .line 92
    .line 93
    invoke-direct {v2, v3, v5, v4}, LR0/a;-><init>(III)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-virtual {v2, v3}, LR0/c;->a(I)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    iget-object v2, p0, Ls0/F;->d:Ls0/J;

    .line 108
    .line 109
    iget-object v3, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v3, v4}, Lcom/lu/wxmask/bean/OptionData;->setQuickDisplayClickCount(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget-object v2, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Lcom/lu/wxmask/bean/OptionData;->setQuickDisplayLongPressMs(I)V

    .line 125
    .line 126
    .line 127
    sget-boolean v3, Lz0/i;->a:Z

    .line 128
    .line 129
    invoke-static {v2}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, p0, Ls0/F;->e:LM0/a;

    .line 133
    .line 134
    invoke-interface {v2}, LM0/a;->b()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v3, "\u5df2\u4fdd\u5b58\u5feb\u6377\u663e\u793a\uff1a"

    .line 140
    .line 141
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string p1, " \u6b21\uff0c\u957f\u6309 "

    .line 148
    .line 149
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string p1, "ms"

    .line 156
    .line 157
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Ls0/F;->f:LN0/l;

    .line 168
    .line 169
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 170
    .line 171
    if-eqz p1, :cond_4

    .line 172
    .line 173
    check-cast p1, Landroid/app/AlertDialog;

    .line 174
    .line 175
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_4
    const-string p1, "dialog"

    .line 180
    .line 181
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_5
    :goto_2
    const-string p1, "\u8bf7\u8f93\u5165 200-3000ms \u4e4b\u95f4\u7684\u957f\u6309\u65f6\u95f4"

    .line 186
    .line 187
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_6
    :goto_3
    const-string p1, "\u8bf7\u8f93\u5165 2-8 \u4e4b\u95f4\u7684\u6570\u5b57"

    .line 192
    .line 193
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method
