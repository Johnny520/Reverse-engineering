.class public final synthetic Lp61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/CheckBox;

.field public final synthetic θ:Landroid/widget/RadioButton;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/CheckBox;Landroid/widget/RadioButton;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp61;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lp61;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lp61;->η:Landroid/widget/CheckBox;

    .line 6
    .line 7
    iput-object p3, p0, Lp61;->θ:Landroid/widget/RadioButton;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    .line 1
    iget p1, p0, Lp61;->ε:I

    .line 2
    .line 3
    sget-object p2, Lhh0;->ι:Lhh0;

    .line 4
    .line 5
    sget-object v0, Lhh0;->θ:Lhh0;

    .line 6
    .line 7
    iget-object v1, p0, Lp61;->θ:Landroid/widget/RadioButton;

    .line 8
    .line 9
    iget-object v2, p0, Lp61;->η:Landroid/widget/CheckBox;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object p1, Lq71;->α:Lq71;

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 17
    .line 18
    .line 19
    move-result v9

    .line 20
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    move-object v4, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v4, p2

    .line 29
    :goto_0
    iget-object v5, p0, Lp61;->ζ:Landroid/app/Activity;

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    invoke-static {v5, p0}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/16 p2, 0x14

    .line 37
    .line 38
    invoke-static {v5, p2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/16 v1, 0xc

    .line 43
    .line 44
    invoke-static {v5, v1}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-static {v5, p2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-static {v5, v2}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {p1, v0, v1, p2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-direct {p2, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    const-string v0, "\u8bf7\u8f93\u5165\u65e5\u671f\u533a\u95f4\uff0c\u683c\u5f0f\uff1ayyyy-MM-dd\n\u7ed3\u675f\u65e5\u671f\u4f1a\u81ea\u52a8\u5305\u542b\u5f53\u5929 23:59:59"

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 73
    .line 74
    .line 75
    const v0, -0x777778

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 79
    .line 80
    .line 81
    const/16 v0, 0xa

    .line 82
    .line 83
    invoke-static {v5, v0}, Lq71;->ξ(Landroid/app/Activity;I)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-virtual {p2, v1, v1, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 89
    .line 90
    .line 91
    new-instance v7, Landroid/widget/EditText;

    .line 92
    .line 93
    invoke-direct {v7, v5}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    const-string v0, "\u5f00\u59cb\u65e5\u671f,\u4f8b\u5982 2024-01-01"

    .line 97
    .line 98
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 105
    .line 106
    .line 107
    new-instance v8, Landroid/widget/EditText;

    .line 108
    .line 109
    invoke-direct {v8, v5}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 110
    .line 111
    .line 112
    const-string v0, "\u7ed3\u675f\u65e5\u671f,\u4f8b\u5982 2024-12-31"

    .line 113
    .line 114
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    new-instance p0, Landroid/app/AlertDialog$Builder;

    .line 133
    .line 134
    invoke-direct {p0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    const-string p2, "\u9009\u62e9\u65e5\u671f\u8303\u56f4"

    .line 138
    .line 139
    invoke-virtual {p0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string p1, "\u5f00\u59cb\u5bfc\u51fa"

    .line 148
    .line 149
    const/4 p2, 0x0

    .line 150
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    const-string p1, "\u53d6\u6d88"

    .line 155
    .line 156
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    new-instance v3, Lr61;

    .line 165
    .line 166
    invoke-direct/range {v3 .. v9}, Lr61;-><init>(Lhh0;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/widget/EditText;Z)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_0
    sget-object p1, Lq71;->α:Lq71;

    .line 177
    .line 178
    new-instance v3, Lih0;

    .line 179
    .line 180
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_1

    .line 189
    .line 190
    move-object v7, v0

    .line 191
    goto :goto_1

    .line 192
    :cond_1
    move-object v7, p2

    .line 193
    :goto_1
    const/16 v8, 0x36

    .line 194
    .line 195
    const/4 v5, 0x0

    .line 196
    const/4 v6, 0x0

    .line 197
    invoke-direct/range {v3 .. v8}, Lih0;-><init>(ZLjava/lang/Long;Ljava/lang/Long;Lhh0;I)V

    .line 198
    .line 199
    .line 200
    iget-object p0, p0, Lp61;->ζ:Landroid/app/Activity;

    .line 201
    .line 202
    invoke-static {p0, v3}, Lq71;->Ν(Landroid/app/Activity;Lih0;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    nop

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
