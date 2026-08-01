.class public final Lyu1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Lzc0;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Lqm1;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/view/View;

.field public final synthetic ρ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lum1;Lum1;Lum1;Lum1;Lzc0;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/LinkedHashSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyu1;->ε:Lum1;

    .line 5
    .line 6
    iput-object p2, p0, Lyu1;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p3, p0, Lyu1;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Lyu1;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, Lyu1;->ι:Lzc0;

    .line 13
    .line 14
    iput-object p6, p0, Lyu1;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lyu1;->λ:Lqm1;

    .line 17
    .line 18
    iput-object p8, p0, Lyu1;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Lyu1;->ν:Lum1;

    .line 21
    .line 22
    iput-object p10, p0, Lyu1;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p11, p0, Lyu1;->ο:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p12, p0, Lyu1;->π:Landroid/view/View;

    .line 27
    .line 28
    iput-object p13, p0, Lyu1;->ρ:Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-nez v1, :cond_1

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    :cond_1
    move-object v14, v1

    .line 16
    iget-object v1, v0, Lyu1;->ε:Lum1;

    .line 17
    .line 18
    iget-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Runnable;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    sget-object v3, Lbv1;->α:Lbv1;

    .line 25
    .line 26
    sget-object v3, Lbv1;->π:Lh22;

    .line 27
    .line 28
    invoke-virtual {v3}, Lh22;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    new-instance v2, Lxu1;

    .line 38
    .line 39
    iget-object v3, v0, Lyu1;->ι:Lzc0;

    .line 40
    .line 41
    iget-object v4, v0, Lyu1;->λ:Lqm1;

    .line 42
    .line 43
    iget-object v5, v0, Lyu1;->ζ:Lum1;

    .line 44
    .line 45
    iget-object v6, v0, Lyu1;->η:Lum1;

    .line 46
    .line 47
    iget-object v7, v0, Lyu1;->θ:Lum1;

    .line 48
    .line 49
    iget-object v8, v0, Lyu1;->ν:Lum1;

    .line 50
    .line 51
    iget-object v9, v0, Lyu1;->π:Landroid/view/View;

    .line 52
    .line 53
    iget-object v10, v0, Lyu1;->κ:Landroid/widget/TextView;

    .line 54
    .line 55
    iget-object v11, v0, Lyu1;->μ:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object v12, v0, Lyu1;->ξ:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v13, v0, Lyu1;->ο:Landroid/widget/TextView;

    .line 60
    .line 61
    iget-object v15, v0, Lyu1;->ρ:Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    invoke-direct/range {v2 .. v15}, Lxu1;-><init>(Lzc0;Lqm1;Lum1;Lum1;Lum1;Lum1;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 67
    .line 68
    sget-object v0, Lbv1;->α:Lbv1;

    .line 69
    .line 70
    sget-object v0, Lbv1;->π:Lh22;

    .line 71
    .line 72
    invoke-virtual {v0}, Lh22;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroid/os/Handler;

    .line 77
    .line 78
    const-wide/16 v3, 0xa0

    .line 79
    .line 80
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 81
    .line 82
    .line 83
    return-void
.end method
