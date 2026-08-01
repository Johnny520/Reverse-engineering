.class public final synthetic Lcz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Lxx;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/view/View;

.field public final synthetic μ:Lqm1;

.field public final synthetic ν:Landroid/widget/Switch;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/view/View;

.field public final synthetic π:Landroid/view/View;

.field public final synthetic ρ:Landroid/widget/TextView;

.field public final synthetic σ:Landroid/view/LayoutInflater;

.field public final synthetic τ:Landroid/widget/LinearLayout;

.field public final synthetic υ:Lum1;


# direct methods
.method public synthetic constructor <init>(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcz1;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p11, p0, Lcz1;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p1, p0, Lcz1;->η:Lxx;

    .line 9
    .line 10
    iput-object p12, p0, Lcz1;->θ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p13, p0, Lcz1;->ι:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p14, p0, Lcz1;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p6, p0, Lcz1;->λ:Landroid/view/View;

    .line 17
    .line 18
    iput-object p2, p0, Lcz1;->μ:Lqm1;

    .line 19
    .line 20
    iput-object p10, p0, Lcz1;->ν:Landroid/widget/Switch;

    .line 21
    .line 22
    iput-object p15, p0, Lcz1;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p7, p0, Lcz1;->ο:Landroid/view/View;

    .line 25
    .line 26
    iput-object p8, p0, Lcz1;->π:Landroid/view/View;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lcz1;->ρ:Landroid/widget/TextView;

    .line 31
    .line 32
    iput-object p5, p0, Lcz1;->σ:Landroid/view/LayoutInflater;

    .line 33
    .line 34
    iput-object p9, p0, Lcz1;->τ:Landroid/widget/LinearLayout;

    .line 35
    .line 36
    iput-object p3, p0, Lcz1;->υ:Lum1;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lry1;->α:Lry1;

    .line 4
    .line 5
    sget-object v1, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lry1;->υ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lry1;->Τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 18
    .line 19
    .line 20
    const-string v1, "\u706b\u82b1\u6570\u636e\u5df2\u6e05\u9664\uff0c\u7b49\u5f85\u91cd\u65b0\u6536\u96c6"

    .line 21
    .line 22
    invoke-static {v1}, Lry1;->ю(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "\u8bf7\u8fd4\u56de\u6d88\u606f\u5217\u8868\u5e76\u91cd\u65b0\u8fdb\u5165\u4ee5\u5237\u65b0"

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    iget-object v6, v0, Lcz1;->ε:Landroid/app/Activity;

    .line 29
    .line 30
    invoke-static {v6, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    iget-object v3, v0, Lcz1;->η:Lxx;

    .line 38
    .line 39
    iget-object v4, v0, Lcz1;->μ:Lqm1;

    .line 40
    .line 41
    iget-object v5, v0, Lcz1;->υ:Lum1;

    .line 42
    .line 43
    iget-object v7, v0, Lcz1;->σ:Landroid/view/LayoutInflater;

    .line 44
    .line 45
    iget-object v8, v0, Lcz1;->λ:Landroid/view/View;

    .line 46
    .line 47
    iget-object v9, v0, Lcz1;->ο:Landroid/view/View;

    .line 48
    .line 49
    iget-object v10, v0, Lcz1;->π:Landroid/view/View;

    .line 50
    .line 51
    iget-object v11, v0, Lcz1;->τ:Landroid/widget/LinearLayout;

    .line 52
    .line 53
    iget-object v12, v0, Lcz1;->ν:Landroid/widget/Switch;

    .line 54
    .line 55
    iget-object v13, v0, Lcz1;->ζ:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object v14, v0, Lcz1;->θ:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v15, v0, Lcz1;->ι:Landroid/widget/TextView;

    .line 60
    .line 61
    iget-object v1, v0, Lcz1;->κ:Landroid/widget/TextView;

    .line 62
    .line 63
    iget-object v2, v0, Lcz1;->ξ:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v0, v0, Lcz1;->ρ:Landroid/widget/TextView;

    .line 66
    .line 67
    move-object/from16 v18, v0

    .line 68
    .line 69
    move-object/from16 v16, v1

    .line 70
    .line 71
    move-object/from16 v17, v2

    .line 72
    .line 73
    invoke-static/range {v3 .. v18}, Ljz1;->ο(Lxx;Lqm1;Lum1;Landroid/app/Activity;Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/Switch;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
