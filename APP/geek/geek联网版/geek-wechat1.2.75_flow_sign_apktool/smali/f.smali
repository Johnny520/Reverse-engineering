.class public final synthetic Lf;
.super Ljava/lang/Object;

# interfaces
.implements Lum;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lf;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lf;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/app/Dialog;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    int-to-float v2, p1

    .line 27
    const/high16 v3, 0x42c80000    # 100.0f

    .line 28
    .line 29
    div-float/2addr v2, v3

    .line 30
    const/16 v3, 0x96

    .line 31
    .line 32
    int-to-float v3, v3

    .line 33
    mul-float/2addr v2, v3

    .line 34
    float-to-int v2, v2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-ge v2, v3, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    invoke-static {v1, v2}, Lz7;->n(Landroid/view/WindowManager$LayoutParams;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/Window;->addFlags(I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    const-string p1, "n0SPeCfEiwiTY5d5PPqeHA==\n"

    .line 57
    .line 58
    const-string v0, "zCH7DE6q7Hs=\n"

    .line 59
    .line 60
    invoke-static {p1, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string v0, "tw==\n"

    .line 65
    .line 66
    const-string v1, "0vI8ySRxU5w=\n"

    .line 67
    .line 68
    const-string v2, "06ke\n"

    .line 69
    .line 70
    const-string v3, "p8h5VTpLcuY=\n"

    .line 71
    .line 72
    invoke-static {v2, v3, p1, v0, v1}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_1
    sget-object p1, Lxh;->n:Lxh;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_0
    iget-object v0, p0, Lf;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Landroid/widget/TextView;

    .line 81
    .line 82
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    const-string v1, "hOF7nHnENFg=\n"

    .line 85
    .line 86
    const-string v2, "6oQMyhioQT0=\n"

    .line 87
    .line 88
    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    sget-object p1, Lxh;->n:Lxh;

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_1
    iget-object v0, p0, Lf;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Le30;

    .line 104
    .line 105
    check-cast p1, Ljava/lang/String;

    .line 106
    .line 107
    sget-object v1, Lo9;->b:Landroid/os/Handler;

    .line 108
    .line 109
    new-instance v2, Lt5;

    .line 110
    .line 111
    const/4 v3, 0x2

    .line 112
    invoke-direct {v2, v0, v3, p1}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :pswitch_2
    iget-object v0, p0, Lf;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Ll;

    .line 122
    .line 123
    if-ne p1, v0, :cond_3

    .line 124
    .line 125
    const-string p1, "(this Collection)"

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :goto_3
    return-object p1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
