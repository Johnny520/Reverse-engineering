.class public final synthetic Lr1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Le2;

.field public final synthetic d:Ll1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Dialog;Le2;Ll1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lr1;->b:Landroid/app/Dialog;

    .line 4
    .line 5
    iput-object p2, p0, Lr1;->c:Le2;

    .line 6
    .line 7
    iput-object p3, p0, Lr1;->d:Ll1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Lr1;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lr1;->d:Ll1;

    .line 4
    .line 5
    iget-object v1, p0, Lr1;->c:Le2;

    .line 6
    .line 7
    iget-object p0, p0, Lr1;->b:Landroid/app/Dialog;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 14
    .line 15
    .line 16
    iget-object p0, v1, Le2;->b:Landroid/app/Activity;

    .line 17
    .line 18
    iget-object p1, v0, Ll1;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const-string p1, "\u786e\u5b9a\u4e3e\u62a5\u8fd9\u4e2a\u8868\u60c5\u5417\uff1f"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v4, "\u786e\u5b9a\u4e3e\u62a5\u201c"

    .line 32
    .line 33
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, "\u201d\u5417\uff1f"

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    const-string v3, "\u4e3e\u62a5\u8868\u60c5"

    .line 49
    .line 50
    invoke-static {p0, v3, p1}, Lg2;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Ly;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v3, p1, Ly;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Landroid/app/Dialog;

    .line 57
    .line 58
    iget-object p1, p1, Ly;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Landroid/widget/LinearLayout;

    .line 61
    .line 62
    new-instance v4, Landroid/widget/LinearLayout;

    .line 63
    .line 64
    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    const/16 v5, 0x10

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 70
    .line 71
    .line 72
    const-string v5, "\u53d6\u6d88"

    .line 73
    .line 74
    invoke-static {p0, v5}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    const-string v6, "\u4e3e\u62a5"

    .line 79
    .line 80
    invoke-static {p0, v6}, Lg2;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 85
    .line 86
    const/high16 v8, 0x42280000    # 42.0f

    .line 87
    .line 88
    invoke-static {p0, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    const/high16 v10, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-direct {v7, v2, v9, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 101
    .line 102
    invoke-static {p0, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-direct {v7, v2, v8, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 107
    .line 108
    .line 109
    const/high16 v8, 0x41200000    # 10.0f

    .line 110
    .line 111
    invoke-static {p0, v8}, Lg2;->g(Landroid/content/Context;F)I

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 116
    .line 117
    invoke-virtual {v4, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p0}, Lg2;->c(Landroid/content/Context;)Landroid/widget/LinearLayout$LayoutParams;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {p1, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    new-instance p1, Lq1;

    .line 128
    .line 129
    invoke-direct {p1, v3, v2}, Lq1;-><init>(Landroid/app/Dialog;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    .line 134
    .line 135
    new-instance p1, Lr1;

    .line 136
    .line 137
    invoke-direct {p1, v3, v1, v0, v2}, Lr1;-><init>(Landroid/app/Dialog;Le2;Ll1;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3, p0}, Lg2;->p(Landroid/app/Dialog;Landroid/app/Activity;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :pswitch_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v0}, Lg2;->o(Le2;Ll1;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 155
    .line 156
    .line 157
    sget-object p0, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 158
    .line 159
    new-instance p1, Ls1;

    .line 160
    .line 161
    invoke-direct {p1, v1, v0, v2}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
