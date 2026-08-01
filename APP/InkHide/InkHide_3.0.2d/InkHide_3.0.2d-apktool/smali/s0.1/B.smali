.class public final synthetic Ls0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LN0/l;

.field public final synthetic c:Ls0/J;


# direct methods
.method public synthetic constructor <init>(ILN0/l;Ls0/J;)V
    .locals 0

    .line 1
    iput p1, p0, Ls0/B;->a:I

    iput-object p2, p0, Ls0/B;->b:LN0/l;

    iput-object p3, p0, Ls0/B;->c:Ls0/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ls0/B;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls0/B;->b:LN0/l;

    .line 7
    .line 8
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/widget/TextView;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Ls0/B;->c:Ls0/J;

    .line 15
    .line 16
    invoke-virtual {v1}, Ls0/J;->I()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object v0, LE0/i;->a:LE0/i;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Ls0/B;->b:LN0/l;

    .line 27
    .line 28
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Ls0/B;->c:Ls0/J;

    .line 35
    .line 36
    invoke-virtual {v1}, Ls0/J;->I()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    sget-object v0, LE0/i;->a:LE0/i;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_1
    iget-object v0, p0, Ls0/B;->b:LN0/l;

    .line 47
    .line 48
    iget-object v1, p0, Ls0/B;->c:Ls0/J;

    .line 49
    .line 50
    invoke-static {v0, v1}, Ls0/J;->l(LN0/l;Ls0/J;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, LE0/i;->a:LE0/i;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_2
    iget-object v0, p0, Ls0/B;->b:LN0/l;

    .line 57
    .line 58
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    check-cast v0, Landroid/widget/PopupWindow;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Ls0/B;->c:Ls0/J;

    .line 68
    .line 69
    const-string v1, "\u6b63\u5728\u68c0\u67e5\u66f4\u65b0"

    .line 70
    .line 71
    invoke-static {v1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lz0/d;->a:Lz0/c;

    .line 75
    .line 76
    new-instance v2, Ls0/z;

    .line 77
    .line 78
    const/16 v3, 0x16

    .line 79
    .line 80
    invoke-direct {v2, v0, v3}, Ls0/z;-><init>(Ls0/J;I)V

    .line 81
    .line 82
    .line 83
    new-instance v0, LC/d;

    .line 84
    .line 85
    const/16 v3, 0xe

    .line 86
    .line 87
    invoke-direct {v0, v3, v2}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-virtual {v1, v2, v0}, Lz0/c;->h(ZLM0/l;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, LE0/i;->a:LE0/i;

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_2
    const-string v0, "popupWindow"

    .line 98
    .line 99
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    throw v0

    .line 104
    :pswitch_3
    iget-object v0, p0, Ls0/B;->b:LN0/l;

    .line 105
    .line 106
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 107
    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    check-cast v0, Landroid/widget/PopupWindow;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Ls0/B;->c:Ls0/J;

    .line 116
    .line 117
    const-string v1, "\u6b63\u5728\u83b7\u53d6\u8f6f\u4ef6\u516c\u544a"

    .line 118
    .line 119
    invoke-static {v1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v1, Lz0/d;->a:Lz0/c;

    .line 123
    .line 124
    new-instance v2, Ls0/E;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    invoke-direct {v2, v0, v3}, Ls0/E;-><init>(Ls0/J;Z)V

    .line 128
    .line 129
    .line 130
    const/4 v0, 0x1

    .line 131
    invoke-virtual {v1, v0, v2}, Lz0/c;->h(ZLM0/l;)V

    .line 132
    .line 133
    .line 134
    sget-object v0, LE0/i;->a:LE0/i;

    .line 135
    .line 136
    return-object v0

    .line 137
    :cond_3
    const-string v0, "popupWindow"

    .line 138
    .line 139
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    throw v0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
