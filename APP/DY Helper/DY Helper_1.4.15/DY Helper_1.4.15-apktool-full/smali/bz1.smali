.class public final synthetic Lbz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic α:Lqm1;

.field public final synthetic β:Landroid/app/Activity;

.field public final synthetic γ:Landroid/widget/TextView;

.field public final synthetic δ:Lxx;

.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Landroid/view/View;

.field public final synthetic ι:Landroid/widget/Switch;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/view/View;

.field public final synthetic μ:Landroid/view/View;

.field public final synthetic ν:Landroid/widget/TextView;

.field public final synthetic ξ:Landroid/view/LayoutInflater;

.field public final synthetic ο:Landroid/widget/LinearLayout;

.field public final synthetic π:Lum1;


# direct methods
.method public synthetic constructor <init>(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lbz1;->α:Lqm1;

    .line 5
    .line 6
    iput-object p4, p0, Lbz1;->β:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p11, p0, Lbz1;->γ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p1, p0, Lbz1;->δ:Lxx;

    .line 11
    .line 12
    iput-object p12, p0, Lbz1;->ε:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p13, p0, Lbz1;->ζ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p14, p0, Lbz1;->η:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p6, p0, Lbz1;->θ:Landroid/view/View;

    .line 19
    .line 20
    iput-object p10, p0, Lbz1;->ι:Landroid/widget/Switch;

    .line 21
    .line 22
    iput-object p15, p0, Lbz1;->κ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p7, p0, Lbz1;->λ:Landroid/view/View;

    .line 25
    .line 26
    iput-object p8, p0, Lbz1;->μ:Landroid/view/View;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lbz1;->ν:Landroid/widget/TextView;

    .line 31
    .line 32
    iput-object p5, p0, Lbz1;->ξ:Landroid/view/LayoutInflater;

    .line 33
    .line 34
    iput-object p9, p0, Lbz1;->ο:Landroid/widget/LinearLayout;

    .line 35
    .line 36
    iput-object p3, p0, Lbz1;->π:Lum1;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lbz1;->α:Lqm1;

    .line 9
    .line 10
    iget-boolean v3, v2, Lqm1;->ε:Z

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string v3, "spark_custom_renew_enabled"

    .line 16
    .line 17
    invoke-static {v3, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const-string v1, "\u5df2\u5f00\u542f\u81ea\u5b9a\u4e49\u7eed\u706b"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v1, "\u5df2\u5173\u95ed\u81ea\u5b9a\u4e49\u7eed\u706b"

    .line 26
    .line 27
    :goto_0
    const/4 v3, 0x0

    .line 28
    iget-object v4, v0, Lbz1;->β:Landroid/app/Activity;

    .line 29
    .line 30
    invoke-static {v4, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    iget-object v1, v0, Lbz1;->δ:Lxx;

    .line 38
    .line 39
    move-object v3, v1

    .line 40
    move-object v1, v2

    .line 41
    iget-object v2, v0, Lbz1;->π:Lum1;

    .line 42
    .line 43
    move-object v5, v3

    .line 44
    move-object v3, v4

    .line 45
    iget-object v4, v0, Lbz1;->ξ:Landroid/view/LayoutInflater;

    .line 46
    .line 47
    move-object v6, v5

    .line 48
    iget-object v5, v0, Lbz1;->θ:Landroid/view/View;

    .line 49
    .line 50
    move-object v7, v6

    .line 51
    iget-object v6, v0, Lbz1;->λ:Landroid/view/View;

    .line 52
    .line 53
    move-object v8, v7

    .line 54
    iget-object v7, v0, Lbz1;->μ:Landroid/view/View;

    .line 55
    .line 56
    move-object v9, v8

    .line 57
    iget-object v8, v0, Lbz1;->ο:Landroid/widget/LinearLayout;

    .line 58
    .line 59
    move-object v10, v9

    .line 60
    iget-object v9, v0, Lbz1;->ι:Landroid/widget/Switch;

    .line 61
    .line 62
    move-object v11, v10

    .line 63
    iget-object v10, v0, Lbz1;->γ:Landroid/widget/TextView;

    .line 64
    .line 65
    move-object v12, v11

    .line 66
    iget-object v11, v0, Lbz1;->ε:Landroid/widget/TextView;

    .line 67
    .line 68
    move-object v13, v12

    .line 69
    iget-object v12, v0, Lbz1;->ζ:Landroid/widget/TextView;

    .line 70
    .line 71
    move-object v14, v13

    .line 72
    iget-object v13, v0, Lbz1;->η:Landroid/widget/TextView;

    .line 73
    .line 74
    move-object v15, v14

    .line 75
    iget-object v14, v0, Lbz1;->κ:Landroid/widget/TextView;

    .line 76
    .line 77
    iget-object v0, v0, Lbz1;->ν:Landroid/widget/TextView;

    .line 78
    .line 79
    move-object/from16 v16, v15

    .line 80
    .line 81
    move-object v15, v0

    .line 82
    move-object/from16 v0, v16

    .line 83
    .line 84
    invoke-static/range {v0 .. v15}, Ljz1;->ο(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
