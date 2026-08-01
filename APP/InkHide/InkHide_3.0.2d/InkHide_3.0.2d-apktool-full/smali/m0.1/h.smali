.class public final synthetic Lm0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lm0/h;->b:I

    iput-object p2, p0, Lm0/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lm0/h;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lt0/e;

    .line 9
    .line 10
    invoke-virtual {p1}, Lt0/c;->a()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const-string p1, "\u672a\u8bc6\u522b"

    .line 15
    .line 16
    iget-object v0, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0, p1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const-string p1, "\u6682\u672a\u8bc6\u522b\u5230\u672c\u673a\u5fae\u4fe1id\uff0c\u8bf7\u8fdb\u5165\u5fae\u4fe1\u540e\u518d\u67e5\u770b"

    .line 27
    .line 28
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, Lz0/r;->f(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, "\u5df2\u590d\u5236\u672c\u673a\u5fae\u4fe1\u8bc6\u522bid:"

    .line 41
    .line 42
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-string p1, "\u590d\u5236\u5931\u8d25"

    .line 57
    .line 58
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :pswitch_1
    iget-object p1, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ls0/I;

    .line 65
    .line 66
    invoke-virtual {p1}, Lt0/c;->a()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    iget-object p1, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ls0/l;

    .line 73
    .line 74
    iget-object v0, p1, Ls0/l;->o:Lt0/e;

    .line 75
    .line 76
    invoke-virtual {v0}, Lt0/c;->a()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ls0/l;->d()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_3
    const/4 p1, 0x0

    .line 84
    iget-object v0, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    new-instance p1, Ls0/J;

    .line 93
    .line 94
    iget-object v0, p0, Lm0/h;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Landroid/app/Activity;

    .line 97
    .line 98
    invoke-direct {p1, v0}, Ls0/J;-><init>(Landroid/content/Context;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lt0/c;->g()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
