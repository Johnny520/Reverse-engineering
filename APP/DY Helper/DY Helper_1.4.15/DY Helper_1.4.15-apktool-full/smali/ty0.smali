.class public final synthetic Lty0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:I

.field public final synthetic η:Ldz0;

.field public final synthetic θ:Landroid/widget/TextView;

.field public final synthetic ι:Landroid/widget/Button;

.field public final synthetic κ:Landroid/widget/Button;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Landroid/widget/TextView;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/ProgressBar;

.field public final synthetic π:Landroid/widget/ImageView;

.field public final synthetic ρ:Landroid/widget/ScrollView;

.field public final synthetic σ:Landroid/widget/GridLayout;

.field public final synthetic τ:Landroid/widget/HorizontalScrollView;

.field public final synthetic υ:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(ZILdz0;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/widget/ScrollView;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lty0;->ε:Z

    .line 5
    .line 6
    iput p2, p0, Lty0;->ζ:I

    .line 7
    .line 8
    iput-object p3, p0, Lty0;->η:Ldz0;

    .line 9
    .line 10
    iput-object p4, p0, Lty0;->θ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p5, p0, Lty0;->ι:Landroid/widget/Button;

    .line 13
    .line 14
    iput-object p6, p0, Lty0;->κ:Landroid/widget/Button;

    .line 15
    .line 16
    iput-object p7, p0, Lty0;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Lty0;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput-object p9, p0, Lty0;->ν:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p10, p0, Lty0;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p11, p0, Lty0;->ο:Landroid/widget/ProgressBar;

    .line 25
    .line 26
    iput-object p12, p0, Lty0;->π:Landroid/widget/ImageView;

    .line 27
    .line 28
    iput-object p13, p0, Lty0;->ρ:Landroid/widget/ScrollView;

    .line 29
    .line 30
    iput-object p14, p0, Lty0;->σ:Landroid/widget/GridLayout;

    .line 31
    .line 32
    iput-object p15, p0, Lty0;->τ:Landroid/widget/HorizontalScrollView;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lty0;->υ:Landroid/widget/LinearLayout;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lty0;->ε:Z

    .line 4
    .line 5
    iget v2, v0, Lty0;->ζ:I

    .line 6
    .line 7
    iget-object v3, v0, Lty0;->η:Ldz0;

    .line 8
    .line 9
    iget-object v15, v0, Lty0;->θ:Landroid/widget/TextView;

    .line 10
    .line 11
    iget-object v4, v0, Lty0;->ι:Landroid/widget/Button;

    .line 12
    .line 13
    iget-object v5, v0, Lty0;->κ:Landroid/widget/Button;

    .line 14
    .line 15
    iget-object v7, v0, Lty0;->λ:Landroid/widget/TextView;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move-object v6, v15

    .line 20
    invoke-static/range {v2 .. v7}, Ldz0;->λ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    move-object/from16 v16, v7

    .line 25
    .line 26
    iget-object v6, v0, Lty0;->σ:Landroid/widget/GridLayout;

    .line 27
    .line 28
    iget-object v7, v0, Lty0;->τ:Landroid/widget/HorizontalScrollView;

    .line 29
    .line 30
    iget-object v8, v0, Lty0;->π:Landroid/widget/ImageView;

    .line 31
    .line 32
    iget-object v9, v0, Lty0;->υ:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    iget-object v10, v0, Lty0;->ο:Landroid/widget/ProgressBar;

    .line 35
    .line 36
    iget-object v11, v0, Lty0;->ρ:Landroid/widget/ScrollView;

    .line 37
    .line 38
    iget-object v12, v0, Lty0;->μ:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v13, v0, Lty0;->ν:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v14, v0, Lty0;->ξ:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-static/range {v2 .. v16}, Ldz0;->κ(ILdz0;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/GridLayout;Landroid/widget/HorizontalScrollView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/ScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
