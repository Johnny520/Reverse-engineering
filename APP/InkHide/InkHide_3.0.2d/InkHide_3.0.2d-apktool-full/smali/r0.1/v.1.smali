.class public final Lr0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Landroid/widget/EditText;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr0/A1;Ljava/lang/Object;Landroid/widget/EditText;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lr0/v;->b:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lr0/v;->e:Ljava/lang/Object;

    iput-object p2, p0, Lr0/v;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/v;->d:Landroid/widget/EditText;

    return-void
.end method

.method public constructor <init>(Lr0/w;Landroid/widget/EditText;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lr0/v;->b:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr0/v;->e:Ljava/lang/Object;

    iput-object p2, p0, Lr0/v;->d:Landroid/widget/EditText;

    iput-object p3, p0, Lr0/v;->c:Ljava/lang/Object;

    return-void
.end method

.method private final a(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(IIILjava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lr0/v;->e:Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lr0/v;->b:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v3, v0

    .line 9
    check-cast v3, Lr0/A1;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object p1, v0

    .line 33
    :goto_0
    if-nez p1, :cond_1

    .line 34
    .line 35
    const-string p1, ""

    .line 36
    .line 37
    :cond_1
    move-object v8, p1

    .line 38
    sget-boolean p1, Lz0/i;->a:Z

    .line 39
    .line 40
    invoke-static {}, Lz0/g;->s()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_9

    .line 45
    .line 46
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getEnableSearchCommand()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_9

    .line 55
    .line 56
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getSearchCommandText()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    const-string p1, "#hide"

    .line 79
    .line 80
    :cond_2
    invoke-virtual {v8, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/OptionData;->getSearchListCommandText()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_3

    .line 105
    .line 106
    const-string v1, "#list"

    .line 107
    .line 108
    :cond_3
    invoke-virtual {v8, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez p1, :cond_4

    .line 113
    .line 114
    if-nez v7, :cond_4

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    iget-object v5, p0, Lr0/v;->d:Landroid/widget/EditText;

    .line 118
    .line 119
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :goto_1
    instance-of v1, p1, Landroid/content/ContextWrapper;

    .line 124
    .line 125
    if-eqz v1, :cond_7

    .line 126
    .line 127
    instance-of v1, p1, Landroid/app/Activity;

    .line 128
    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    move-object v0, p1

    .line 132
    check-cast v0, Landroid/app/Activity;

    .line 133
    .line 134
    :cond_5
    :goto_2
    move-object v4, v0

    .line 135
    goto :goto_3

    .line 136
    :cond_6
    check-cast p1, Landroid/content/ContextWrapper;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    instance-of v1, p1, Landroid/app/Activity;

    .line 144
    .line 145
    if-eqz v1, :cond_5

    .line 146
    .line 147
    move-object v0, p1

    .line 148
    check-cast v0, Landroid/app/Activity;

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :goto_3
    if-nez v4, :cond_8

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_8
    new-instance v2, Lr0/r0;

    .line 155
    .line 156
    iget-object v6, p0, Lr0/v;->c:Ljava/lang/Object;

    .line 157
    .line 158
    invoke-direct/range {v2 .. v8}, Lr0/r0;-><init>(Lr0/A1;Landroid/app/Activity;Landroid/widget/EditText;Ljava/lang/Object;ZLjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 162
    .line 163
    .line 164
    :cond_9
    :goto_4
    return-void

    .line 165
    :pswitch_0
    if-nez p1, :cond_a

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_a
    check-cast v0, Lr0/w;

    .line 169
    .line 170
    iget-object v1, p0, Lr0/v;->d:Landroid/widget/EditText;

    .line 171
    .line 172
    iget-object v2, p0, Lr0/v;->c:Ljava/lang/Object;

    .line 173
    .line 174
    invoke-virtual {v0, v1, p1, v2}, Lr0/w;->h(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :goto_5
    return-void

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p1, p0, Lr0/v;->b:I

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget p1, p0, Lr0/v;->b:I

    return-void
.end method
