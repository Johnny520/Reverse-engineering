.class public final synthetic Lpt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Lwu1;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lpt1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt1;->η:Landroid/app/Activity;

    iput-object p2, p0, Lpt1;->ζ:Lum1;

    iput-object p3, p0, Lpt1;->θ:Lwu1;

    iput-object p4, p0, Lpt1;->ι:Landroid/widget/TextView;

    iput-object p5, p0, Lpt1;->κ:Landroid/widget/TextView;

    iput-object p6, p0, Lpt1;->λ:Landroid/widget/TextView;

    iput-object p7, p0, Lpt1;->μ:Landroid/widget/TextView;

    return-void
.end method

.method public synthetic constructor <init>(Lum1;Landroid/app/Activity;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lpt1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpt1;->ζ:Lum1;

    .line 8
    .line 9
    iput-object p2, p0, Lpt1;->η:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p3, p0, Lpt1;->θ:Lwu1;

    .line 12
    .line 13
    iput-object p4, p0, Lpt1;->ι:Landroid/widget/TextView;

    .line 14
    .line 15
    iput-object p5, p0, Lpt1;->κ:Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object p6, p0, Lpt1;->λ:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p7, p0, Lpt1;->μ:Landroid/widget/TextView;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget p1, p0, Lpt1;->ε:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpt1;->ζ:Lum1;

    .line 7
    .line 8
    iget-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v6, p0, Lpt1;->η:Landroid/app/Activity;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p0, "\u5f53\u524d\u6ca1\u6709\u7b5b\u9009\u6761\u4ef6"

    .line 22
    .line 23
    invoke-static {v6, p0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p1, ""

    .line 32
    .line 33
    iput-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p0, Lpt1;->θ:Lwu1;

    .line 36
    .line 37
    iget-object v2, p0, Lpt1;->ι:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v3, p0, Lpt1;->κ:Landroid/widget/TextView;

    .line 40
    .line 41
    iget-object v4, p0, Lpt1;->λ:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v5, p0, Lpt1;->μ:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-static/range {v0 .. v5}, Lbv1;->Ξ(Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "\u5df2\u6e05\u9664\u7b5b\u9009"

    .line 49
    .line 50
    invoke-static {v6, p0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void

    .line 58
    :pswitch_0
    const/4 p1, 0x0

    .line 59
    const/4 v0, 0x4

    .line 60
    const-string v1, "DYHelper"

    .line 61
    .line 62
    const-string v2, "\u5237\u65b0 DyLog \u65e5\u5fd7\u67e5\u770b\u5668"

    .line 63
    .line 64
    invoke-static {v1, v2, p1, v0, p1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Lpt1;->ζ:Lum1;

    .line 68
    .line 69
    iget-object v4, p0, Lpt1;->θ:Lwu1;

    .line 70
    .line 71
    iget-object v5, p0, Lpt1;->ι:Landroid/widget/TextView;

    .line 72
    .line 73
    iget-object v6, p0, Lpt1;->κ:Landroid/widget/TextView;

    .line 74
    .line 75
    iget-object v7, p0, Lpt1;->λ:Landroid/widget/TextView;

    .line 76
    .line 77
    iget-object v8, p0, Lpt1;->μ:Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-static/range {v3 .. v8}, Lbv1;->Ξ(Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 80
    .line 81
    .line 82
    const-string p1, "\u5df2\u5237\u65b0\u65e5\u5fd7"

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    iget-object p0, p0, Lpt1;->η:Landroid/app/Activity;

    .line 86
    .line 87
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
