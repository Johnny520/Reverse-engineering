.class public final synthetic Ln90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Landroid/app/AlertDialog;

.field public final synthetic η:Lqm1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Lxx;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Lp70;


# direct methods
.method public synthetic constructor <init>(Lxx;Lp70;Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Ln90;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p6, p0, Ln90;->ζ:Landroid/app/AlertDialog;

    .line 7
    .line 8
    iput-object p3, p0, Ln90;->η:Lqm1;

    .line 9
    .line 10
    iput-object p4, p0, Ln90;->θ:Lum1;

    .line 11
    .line 12
    iput-object p7, p0, Ln90;->ι:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p1, p0, Ln90;->κ:Lxx;

    .line 15
    .line 16
    iput-object p8, p0, Ln90;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p2, p0, Ln90;->μ:Lp70;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v0, Ld9;

    .line 2
    .line 3
    iget-object v1, p0, Ln90;->κ:Lxx;

    .line 4
    .line 5
    iget-object v2, p0, Ln90;->μ:Lp70;

    .line 6
    .line 7
    iget-object v3, p0, Ln90;->η:Lqm1;

    .line 8
    .line 9
    iget-object v4, p0, Ln90;->θ:Lum1;

    .line 10
    .line 11
    iget-object v5, p0, Ln90;->ε:Landroid/app/Activity;

    .line 12
    .line 13
    iget-object v6, p0, Ln90;->ζ:Landroid/app/AlertDialog;

    .line 14
    .line 15
    iget-object v7, p0, Ln90;->ι:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v8, p0, Ln90;->λ:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-direct/range {v0 .. v8}, Ld9;-><init>(Lxx;Lp70;Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    return-object p0
.end method
