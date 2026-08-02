.class public final Lf8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Laa0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf8;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lf8;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, Lf8;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lf8;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Ly33;

    .line 10
    .line 11
    invoke-virtual {p0}, Ly33;->i()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Lxk1;

    .line 16
    .line 17
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lz22;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0, v1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_1
    check-cast p0, Le81;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Le81;->f:Z

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    check-cast p0, Lj81;

    .line 36
    .line 37
    iget-object v0, p0, Lj81;->c:Lf90;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    iput-boolean v2, v0, Lf90;->a:Z

    .line 43
    .line 44
    :cond_1
    iput-object v1, p0, Lj81;->c:Lf90;

    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_3
    check-cast p0, Ly71;

    .line 48
    .line 49
    iput-object v1, p0, Ly71;->d:Lkw;

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    check-cast p0, Lb03;

    .line 53
    .line 54
    invoke-virtual {p0}, Lb03;->o()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    check-cast p0, Lda0;

    .line 59
    .line 60
    iget-object p0, p0, Lda0;->i:Lea0;

    .line 61
    .line 62
    invoke-virtual {p0}, Lea0;->a()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_6
    check-cast p0, Lgk;

    .line 67
    .line 68
    iget-object p0, p0, Lgk;->c:Lnx1;

    .line 69
    .line 70
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lfk;

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Lfk;->close()V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void

    .line 82
    :pswitch_7
    check-cast p0, Lnb;

    .line 83
    .line 84
    iget-object v0, p0, Lnb;->e:Lts2;

    .line 85
    .line 86
    iget-object v2, v0, Lts2;->h:Lrl1;

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v2}, Lrl1;->a()V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v0}, Lts2;->a()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lnb;->h:Landroid/view/ActionMode;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 101
    .line 102
    .line 103
    :cond_4
    iput-object v1, p0, Lnb;->h:Landroid/view/ActionMode;

    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_8
    check-cast p0, Ld22;

    .line 107
    .line 108
    invoke-virtual {p0}, Lo2;->f()V

    .line 109
    .line 110
    .line 111
    const v0, 0x79080080

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Ld22;->w:Landroid/view/WindowManager;

    .line 118
    .line 119
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_9
    check-cast p0, Lp80;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 126
    .line 127
    .line 128
    iget-object p0, p0, Lp80;->o:Lm80;

    .line 129
    .line 130
    invoke-virtual {p0}, Lo2;->f()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
