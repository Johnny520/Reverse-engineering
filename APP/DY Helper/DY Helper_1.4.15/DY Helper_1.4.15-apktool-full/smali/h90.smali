.class public final synthetic Lh90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/app/AlertDialog;

.field public final synthetic ζ:Lqm1;

.field public final synthetic η:Ljava/lang/Throwable;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Landroid/widget/ProgressBar;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Lxx;

.field public final synthetic μ:Landroid/widget/LinearLayout;

.field public final synthetic ν:Landroid/widget/Button;

.field public final synthetic ξ:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Lqm1;Ljava/lang/Throwable;Lum1;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh90;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p2, p0, Lh90;->ζ:Lqm1;

    .line 7
    .line 8
    iput-object p3, p0, Lh90;->η:Ljava/lang/Throwable;

    .line 9
    .line 10
    iput-object p4, p0, Lh90;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, Lh90;->ι:Landroid/widget/ProgressBar;

    .line 13
    .line 14
    iput-object p6, p0, Lh90;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lh90;->λ:Lxx;

    .line 17
    .line 18
    iput-object p8, p0, Lh90;->μ:Landroid/widget/LinearLayout;

    .line 19
    .line 20
    iput-object p9, p0, Lh90;->ν:Landroid/widget/Button;

    .line 21
    .line 22
    iput-object p10, p0, Lh90;->ξ:Landroid/widget/Button;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lh90;->ε:Landroid/app/AlertDialog;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lh90;->ζ:Lqm1;

    .line 10
    .line 11
    iget-boolean v0, v0, Lqm1;->ε:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lh90;->θ:Lum1;

    .line 16
    .line 17
    iget-object v2, p0, Lh90;->ι:Landroid/widget/ProgressBar;

    .line 18
    .line 19
    iget-object v3, p0, Lh90;->κ:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v4, p0, Lh90;->λ:Lxx;

    .line 22
    .line 23
    iget-object v5, p0, Lh90;->μ:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    iget-object v6, p0, Lh90;->ν:Landroid/widget/Button;

    .line 26
    .line 27
    iget-object v7, p0, Lh90;->ξ:Landroid/widget/Button;

    .line 28
    .line 29
    iget-object v8, p0, Lh90;->η:Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-static/range {v1 .. v8}, Lyh;->с(Lum1;Landroid/widget/ProgressBar;Landroid/widget/TextView;Lxx;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
