.class public final synthetic Ld9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/AlertDialog;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;

.field public final synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Ljava/lang/Object;

.field public final synthetic ν:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Lv9;Landroid/app/Activity;Landroid/widget/LinearLayout;Li5;La80;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Ld9;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9;->ζ:Landroid/app/AlertDialog;

    iput-object p2, p0, Ld9;->θ:Ljava/lang/Object;

    iput-object p3, p0, Ld9;->η:Landroid/app/Activity;

    iput-object p4, p0, Ld9;->ι:Ljava/lang/Object;

    iput-object p5, p0, Ld9;->κ:Ljava/lang/Object;

    iput-object p6, p0, Ld9;->λ:Ljava/lang/Object;

    iput-object p7, p0, Ld9;->μ:Ljava/lang/Object;

    iput-object p8, p0, Ld9;->ν:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lxx;Lp70;Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ld9;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p6, p0, Ld9;->ζ:Landroid/app/AlertDialog;

    .line 8
    .line 9
    iput-object p3, p0, Ld9;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Ld9;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p7, p0, Ld9;->κ:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ld9;->η:Landroid/app/Activity;

    .line 16
    .line 17
    iput-object p1, p0, Ld9;->λ:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object p8, p0, Ld9;->μ:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p2, p0, Ld9;->ν:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ld9;->ε:I

    .line 4
    .line 5
    iget-object v2, v0, Ld9;->ν:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, Ld9;->μ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, Ld9;->λ:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, Ld9;->κ:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, Ld9;->ι:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, Ld9;->θ:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Lqm1;

    .line 21
    .line 22
    check-cast v6, Lum1;

    .line 23
    .line 24
    check-cast v5, Landroid/widget/TextView;

    .line 25
    .line 26
    check-cast v4, Lxx;

    .line 27
    .line 28
    check-cast v3, Landroid/widget/TextView;

    .line 29
    .line 30
    check-cast v2, Lp70;

    .line 31
    .line 32
    iget-object v1, v0, Ld9;->ζ:Landroid/app/AlertDialog;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_3

    .line 39
    .line 40
    iget-boolean v7, v7, Lqm1;->ε:Z

    .line 41
    .line 42
    if-eqz v7, :cond_0

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_0
    const/4 v7, 0x0

    .line 46
    iput-object v7, v6, Lum1;->ε:Ljava/lang/Object;

    .line 47
    .line 48
    const-string v6, "\u5df2\u4e0b\u8f7d"

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v6, v4, Lxx;->κ:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v4, v4, Lxx;->ι:Ljava/lang/String;

    .line 56
    .line 57
    const/16 v8, 0x63

    .line 58
    .line 59
    iget-object v0, v0, Ld9;->η:Landroid/app/Activity;

    .line 60
    .line 61
    invoke-static {v8, v0, v6}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v5, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 84
    .line 85
    .line 86
    const-string v0, "\u6570\u636e\u5e93\u6821\u9a8c\u5b8c\u6210"

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 92
    .line 93
    invoke-static {}, Lcom/example/dyhelper/hook/γ;->ι()V

    .line 94
    .line 95
    .line 96
    if-eqz v2, :cond_1

    .line 97
    .line 98
    :try_start_0
    invoke-interface {v2}, Lp70;->invoke()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object v7, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    new-instance v2, Leo1;

    .line 106
    .line 107
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_1
    :goto_0
    move-object v2, v7

    .line 112
    :goto_1
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_2

    .line 117
    .line 118
    const-string v2, "raf02e3c7781e553e"

    .line 119
    .line 120
    const-string v3, "\u5b89\u88c5\u5b8c\u6210\u56de\u8c03\u6267\u884c\u5931\u8d25"

    .line 121
    .line 122
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 126
    .line 127
    .line 128
    :cond_3
    :goto_2
    return-void

    .line 129
    :pswitch_0
    check-cast v7, Lv9;

    .line 130
    .line 131
    move-object v9, v6

    .line 132
    check-cast v9, Landroid/widget/LinearLayout;

    .line 133
    .line 134
    move-object v11, v5

    .line 135
    check-cast v11, Li5;

    .line 136
    .line 137
    move-object v12, v4

    .line 138
    check-cast v12, La80;

    .line 139
    .line 140
    move-object v14, v3

    .line 141
    check-cast v14, Ljava/lang/String;

    .line 142
    .line 143
    move-object v15, v2

    .line 144
    check-cast v15, Ljava/lang/String;

    .line 145
    .line 146
    iget-object v10, v0, Ld9;->ζ:Landroid/app/AlertDialog;

    .line 147
    .line 148
    invoke-virtual {v10}, Landroid/app/Dialog;->isShowing()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_4

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_4
    iget-boolean v1, v7, Lv9;->α:Z

    .line 156
    .line 157
    iget-object v8, v0, Ld9;->η:Landroid/app/Activity;

    .line 158
    .line 159
    if-eqz v1, :cond_5

    .line 160
    .line 161
    sget-object v13, Lg9;->η:Lg9;

    .line 162
    .line 163
    const-string v16, ""

    .line 164
    .line 165
    invoke-static/range {v8 .. v16}, Lh62;->у(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/app/AlertDialog;Li5;La80;Lg9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    sget-object v13, Lg9;->θ:Lg9;

    .line 170
    .line 171
    iget-object v0, v7, Lv9;->β:Ljava/lang/String;

    .line 172
    .line 173
    move-object/from16 v16, v0

    .line 174
    .line 175
    invoke-static/range {v8 .. v16}, Lh62;->у(Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/app/AlertDialog;Li5;La80;Lg9;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_3
    return-void

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
