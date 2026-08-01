.class public final synthetic Lya;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lya;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lya;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lya;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lya;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lux;

    .line 9
    .line 10
    iget-object v0, p1, Lux;->f:Landroid/widget/EditText;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p1, Lux;->f:Landroid/widget/EditText;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, p1, Lux;->f:Landroid/widget/EditText;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, p1, Lux;->f:Landroid/widget/EditText;

    .line 39
    .line 40
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    if-ltz v0, :cond_2

    .line 48
    .line 49
    iget-object v1, p1, Lux;->f:Landroid/widget/EditText;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {p1}, Lhj;->p()V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    :pswitch_0
    iget-object p1, p0, Lya;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Leu;

    .line 61
    .line 62
    invoke-virtual {p1}, Leu;->E()V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    throw p1

    .line 67
    :pswitch_1
    iget-object v0, p0, Lya;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lcom/ljx/wechatmod/ui/MainActivity;

    .line 70
    .line 71
    invoke-static {v0, p1}, Lcom/ljx/wechatmod/ui/MainActivity;->f(Lcom/ljx/wechatmod/ui/MainActivity;Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    iget-object v0, p0, Lya;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/widget/TextView;

    .line 78
    .line 79
    sget-object v1, Lkn;->a:Lkn;

    .line 80
    .line 81
    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    invoke-static {p1, v1}, Lkn;->i(Landroid/view/View;I)V

    .line 89
    .line 90
    .line 91
    const-string p1, "NbwH8r7BKmlq\n"

    .line 92
    .line 93
    const-string v1, "0Au1FAZEzcA=\n"

    .line 94
    .line 95
    invoke-static {p1, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_3
    iget-object p1, p0, Lya;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Landroid/widget/FrameLayout;

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_4
    iget-object p1, p0, Lya;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lrh;

    .line 114
    .line 115
    invoke-virtual {p1}, Lrh;->t()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_5
    iget-object p1, p0, Lya;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p1, Lcb;

    .line 122
    .line 123
    iget-object v0, p1, Lcb;->i:Landroid/widget/EditText;

    .line 124
    .line 125
    if-nez v0, :cond_3

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-virtual {p1}, Lhj;->p()V

    .line 138
    .line 139
    .line 140
    :goto_2
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
