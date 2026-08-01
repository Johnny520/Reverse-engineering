.class public final synthetic Ls0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LN0/l;


# direct methods
.method public synthetic constructor <init>(LN0/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/u;->b:I

    iput-object p1, p0, Ls0/u;->c:LN0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Ls0/u;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 7
    .line 8
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    check-cast p1, Landroid/app/AlertDialog;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "dialog"

    .line 19
    .line 20
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    throw p1

    .line 25
    :pswitch_0
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 26
    .line 27
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    check-cast p1, Landroid/app/AlertDialog;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p1, "dialog"

    .line 38
    .line 39
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :pswitch_1
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 45
    .line 46
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    check-cast p1, Landroid/app/AlertDialog;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p1, "dialog"

    .line 57
    .line 58
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    throw p1

    .line 63
    :pswitch_2
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 64
    .line 65
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    check-cast p1, Landroid/app/AlertDialog;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    const-string p1, "dialog"

    .line 76
    .line 77
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    throw p1

    .line 82
    :pswitch_3
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 83
    .line 84
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    check-cast p1, Landroid/app/AlertDialog;

    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    const-string p1, "dialog"

    .line 95
    .line 96
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x0

    .line 100
    throw p1

    .line 101
    :pswitch_4
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 102
    .line 103
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    check-cast p1, Landroid/app/AlertDialog;

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    const-string p1, "dialog"

    .line 114
    .line 115
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const/4 p1, 0x0

    .line 119
    throw p1

    .line 120
    :pswitch_5
    iget-object p1, p0, Ls0/u;->c:LN0/l;

    .line 121
    .line 122
    iget-object p1, p1, LN0/l;->a:Ljava/lang/Object;

    .line 123
    .line 124
    if-eqz p1, :cond_6

    .line 125
    .line 126
    check-cast p1, Landroid/app/AlertDialog;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_6
    const-string p1, "dialog"

    .line 133
    .line 134
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    const/4 p1, 0x0

    .line 138
    throw p1

    .line 139
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
