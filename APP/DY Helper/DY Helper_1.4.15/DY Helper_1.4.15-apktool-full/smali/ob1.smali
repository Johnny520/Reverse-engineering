.class public final synthetic Lob1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lob1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lob1;->η:Landroid/view/View;

    .line 8
    .line 9
    iput-object p1, p0, Lob1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/View;I)V
    .locals 0

    .line 12
    iput p3, p0, Lob1;->ε:I

    iput-object p1, p0, Lob1;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Lob1;->η:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget p1, p0, Lob1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Lob1;->η:Landroid/view/View;

    .line 5
    .line 6
    iget-object v2, p0, Lob1;->ζ:Landroid/app/Activity;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p0, Lod;->η:Lod;

    .line 12
    .line 13
    invoke-static {v2, v1, p0}, Lxn0;->н(Landroid/app/Activity;Landroid/view/View;Lod;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget-object p0, Lod;->ζ:Lod;

    .line 18
    .line 19
    invoke-static {v2, v1, p0}, Lxn0;->н(Landroid/app/Activity;Landroid/view/View;Lod;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    sget-object p0, Lod;->ε:Lod;

    .line 24
    .line 25
    invoke-static {v2, v1, p0}, Lxn0;->н(Landroid/app/Activity;Landroid/view/View;Lod;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    sget-object p1, Ljc1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 32
    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x1

    .line 36
    iget-object v1, p0, Lob1;->ζ:Landroid/app/Activity;

    .line 37
    .line 38
    iget-object v2, p0, Lob1;->η:Landroid/view/View;

    .line 39
    .line 40
    const-string v3, "\u6b63\u5728\u505c\u6b62\u4efb\u52a1"

    .line 41
    .line 42
    const-string v4, "\u5f53\u524d\u8bf7\u6c42\u5b8c\u6210\u540e\u5c06\u505c\u6b62\u5269\u4f59\u4eba\u5458\u4e0e\u5199\u64cd\u4f5c"

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    invoke-static/range {v1 .. v11}, Lxn0;->Р(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;IIIIIIZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_3
    invoke-static {}, Lx9;->ζ()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {v2, v1, v0}, Lxn0;->З(Landroid/app/Activity;Landroid/view/View;Z)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const-string p0, "\u6b63\u5728\u5237\u65b0\u8425\u5730"

    .line 68
    .line 69
    const-string p1, "\u6b63\u5728\u51c6\u5907\u6700\u65b0\u8425\u5730\u72b6\u6001"

    .line 70
    .line 71
    invoke-static {v2, v1, p0, p1}, Lxn0;->ξ(Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    new-instance p0, Lmb1;

    .line 77
    .line 78
    const/4 p1, 0x2

    .line 79
    invoke-direct {p0, v2, v1, p1}, Lmb1;-><init>(Landroid/app/Activity;Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    new-instance p1, Lmb1;

    .line 83
    .line 84
    const/4 v0, 0x3

    .line 85
    invoke-direct {p1, v2, v1, v0}, Lmb1;-><init>(Landroid/app/Activity;Landroid/view/View;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, p0, p1}, Ljc1;->ν(Landroid/app/Activity;La80;La80;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-void

    .line 92
    :pswitch_4
    invoke-static {}, Lxn0;->Υ()Lyd1;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {v1, p0}, Lxn0;->у(Landroid/view/View;Lyd1;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance p1, Lii0;

    .line 103
    .line 104
    const/16 v0, 0x9

    .line 105
    .line 106
    invoke-direct {p1, v2, v0, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
