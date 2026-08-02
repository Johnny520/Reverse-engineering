.class public final Llj;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Laa0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Llj;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Llj;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Llj;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Llj;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Llj;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Llj;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lff3;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    iget v0, p0, Lff3;->t:I

    .line 15
    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    iput v0, p0, Lff3;->t:I

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget v0, Lwa3;->a:I

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-static {v1, v0}, Lra3;->b(Landroid/view/View;Lgt1;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lwa3;->b(Landroid/view/View;Lwd3;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lff3;->u:Lc01;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_0
    check-cast p0, Ly33;

    .line 38
    .line 39
    check-cast v1, Lu33;

    .line 40
    .line 41
    iget-object v0, v1, Lu33;->b:Lnx1;

    .line 42
    .line 43
    invoke-virtual {v0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lt33;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, v0, Lt33;->h:Lw33;

    .line 52
    .line 53
    iget-object p0, p0, Ly33;->i:Lps2;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lps2;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void

    .line 59
    :pswitch_1
    check-cast p0, Ly33;

    .line 60
    .line 61
    check-cast v1, Ly33;

    .line 62
    .line 63
    iget-object p0, p0, Ly33;->j:Lps2;

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lps2;->remove(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    check-cast p0, Lgj;

    .line 70
    .line 71
    check-cast v1, Lyw;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lgj;->b(Lv3;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_3
    check-cast p0, Lg91;

    .line 78
    .line 79
    iget-object p0, p0, Lg91;->j:Lsk1;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Lsk1;->k(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_4
    check-cast p0, Lcz0;

    .line 86
    .line 87
    check-cast v1, Laz0;

    .line 88
    .line 89
    iget-object p0, p0, Lcz0;->a:Lzk1;

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lzk1;->j(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_5
    check-cast p0, Lgj;

    .line 96
    .line 97
    check-cast v1, Lsw;

    .line 98
    .line 99
    invoke-virtual {p0, v1}, Lgj;->b(Lv3;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
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
