.class public final synthetic Luy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldz0;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/ProgressBar;

.field public final synthetic λ:Landroid/widget/ImageView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Landroid/widget/Button;

.field public final synthetic ξ:Landroid/widget/Button;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/widget/ScrollView;

.field public final synthetic ρ:Landroid/widget/GridLayout;

.field public final synthetic σ:Landroid/widget/HorizontalScrollView;

.field public final synthetic τ:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Luy0;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Luy0;->ζ:Ldz0;

    .line 7
    .line 8
    iput-object p11, p0, Luy0;->η:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p12, p0, Luy0;->θ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p13, p0, Luy0;->ι:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p9, p0, Luy0;->κ:Landroid/widget/ProgressBar;

    .line 15
    .line 16
    iput-object p7, p0, Luy0;->λ:Landroid/widget/ImageView;

    .line 17
    .line 18
    iput-object p14, p0, Luy0;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p3, p0, Luy0;->ν:Landroid/widget/Button;

    .line 21
    .line 22
    iput-object p4, p0, Luy0;->ξ:Landroid/widget/Button;

    .line 23
    .line 24
    iput-object p15, p0, Luy0;->ο:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p10, p0, Luy0;->π:Landroid/widget/ScrollView;

    .line 27
    .line 28
    iput-object p5, p0, Luy0;->ρ:Landroid/widget/GridLayout;

    .line 29
    .line 30
    iput-object p6, p0, Luy0;->σ:Landroid/widget/HorizontalScrollView;

    .line 31
    .line 32
    iput-object p8, p0, Luy0;->τ:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v5, v0, Luy0;->σ:Landroid/widget/HorizontalScrollView;

    .line 4
    .line 5
    iget-object v7, v0, Luy0;->τ:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iget v8, v0, Luy0;->ε:I

    .line 8
    .line 9
    iget-object v1, v0, Luy0;->ζ:Ldz0;

    .line 10
    .line 11
    iget-object v2, v0, Luy0;->ν:Landroid/widget/Button;

    .line 12
    .line 13
    iget-object v3, v0, Luy0;->ξ:Landroid/widget/Button;

    .line 14
    .line 15
    iget-object v4, v0, Luy0;->ρ:Landroid/widget/GridLayout;

    .line 16
    .line 17
    iget-object v6, v0, Luy0;->λ:Landroid/widget/ImageView;

    .line 18
    .line 19
    move v9, v8

    .line 20
    iget-object v8, v0, Luy0;->κ:Landroid/widget/ProgressBar;

    .line 21
    .line 22
    move v10, v9

    .line 23
    iget-object v9, v0, Luy0;->π:Landroid/widget/ScrollView;

    .line 24
    .line 25
    move v11, v10

    .line 26
    iget-object v10, v0, Luy0;->η:Landroid/widget/TextView;

    .line 27
    .line 28
    move v12, v11

    .line 29
    iget-object v11, v0, Luy0;->θ:Landroid/widget/TextView;

    .line 30
    .line 31
    move v13, v12

    .line 32
    iget-object v12, v0, Luy0;->ι:Landroid/widget/TextView;

    .line 33
    .line 34
    move v14, v13

    .line 35
    iget-object v13, v0, Luy0;->μ:Landroid/widget/TextView;

    .line 36
    .line 37
    iget-object v0, v0, Luy0;->ο:Landroid/widget/TextView;

    .line 38
    .line 39
    move v15, v14

    .line 40
    move-object v14, v0

    .line 41
    move v0, v15

    .line 42
    invoke-static/range {v0 .. v14}, Ldz0;->κ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 43
    .line 44
    .line 45
    move v8, v0

    .line 46
    move-object v9, v1

    .line 47
    move-object v10, v2

    .line 48
    move-object v11, v3

    .line 49
    move-object v12, v13

    .line 50
    move-object v13, v14

    .line 51
    invoke-static/range {v8 .. v13}, Ldz0;->λ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    return v0
.end method
