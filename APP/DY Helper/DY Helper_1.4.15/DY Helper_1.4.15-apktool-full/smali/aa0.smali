.class public final synthetic Laa0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Lcom/example/dyhelper/ui/GestureAreaView;

.field public final synthetic η:Landroid/widget/Switch;

.field public final synthetic θ:Landroid/widget/LinearLayout;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Lxx;

.field public final synthetic ξ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/Switch;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laa0;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Laa0;->ζ:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 7
    .line 8
    iput-object p3, p0, Laa0;->η:Landroid/widget/Switch;

    .line 9
    .line 10
    iput-object p4, p0, Laa0;->θ:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    iput-object p5, p0, Laa0;->ι:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p6, p0, Laa0;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Laa0;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Laa0;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Laa0;->ν:Lxx;

    .line 21
    .line 22
    iput-object p10, p0, Laa0;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 10

    .line 1
    const-string p1, "volume_key_enabled"

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    invoke-static {p1, p2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v0, p0, Laa0;->ε:Landroid/app/Activity;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    const-string p1, "share_panel_enabled"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "\u8bf7\u5148\u5f00\u542f\u97f3\u91cf\u952e\u6216\u5206\u4eab\u83dc\u5355\uff0c\u518d\u91cd\u7f6e\u624b\u52bf\u6a21\u5757\u83dc\u5355"

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :goto_0
    iget-object v2, p0, Laa0;->ζ:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/example/dyhelper/ui/GestureAreaView;->β()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, v2, Lcom/example/dyhelper/ui/GestureAreaView;->κ:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/example/dyhelper/ui/GestureAreaView;->ζ()V

    .line 44
    .line 45
    .line 46
    const-string p1, "gesture_video_speed"

    .line 47
    .line 48
    const/high16 p2, 0x40000000    # 2.0f

    .line 49
    .line 50
    invoke-static {p1, p2}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 51
    .line 52
    .line 53
    const-string p1, "gesture_enabled"

    .line 54
    .line 55
    invoke-static {p1, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, Laa0;->η:Landroid/widget/Switch;

    .line 59
    .line 60
    invoke-virtual {v6, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 61
    .line 62
    .line 63
    const/16 p1, 0x8

    .line 64
    .line 65
    iget-object p2, p0, Laa0;->θ:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v3, p0, Laa0;->ι:Landroid/widget/TextView;

    .line 71
    .line 72
    iget-object v4, p0, Laa0;->κ:Landroid/widget/TextView;

    .line 73
    .line 74
    iget-object v5, p0, Laa0;->λ:Landroid/widget/TextView;

    .line 75
    .line 76
    iget-object v7, p0, Laa0;->μ:Landroid/widget/TextView;

    .line 77
    .line 78
    iget-object v8, p0, Laa0;->ν:Lxx;

    .line 79
    .line 80
    iget-object v9, p0, Laa0;->ξ:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-static/range {v2 .. v9}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 83
    .line 84
    .line 85
    const-string p0, "\u5df2\u91cd\u7f6e\u624b\u52bf\u914d\u7f6e"

    .line 86
    .line 87
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

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
.end method
