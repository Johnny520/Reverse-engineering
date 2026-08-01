.class public final synthetic Lv61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/AlertDialog;

.field public final synthetic β:Ln;

.field public final synthetic γ:Landroid/widget/TextView;

.field public final synthetic δ:Landroid/widget/TextView;

.field public final synthetic ε:Landroid/widget/ProgressBar;


# direct methods
.method public synthetic constructor <init>(Ln;Landroid/app/AlertDialog;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lv61;->α:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p1, p0, Lv61;->β:Ln;

    .line 7
    .line 8
    iput-object p4, p0, Lv61;->γ:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p5, p0, Lv61;->δ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p3, p0, Lv61;->ε:Landroid/widget/ProgressBar;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    const/4 p1, -0x2

    .line 2
    iget-object v2, p0, Lv61;->α:Landroid/app/AlertDialog;

    .line 3
    .line 4
    invoke-virtual {v2, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lg90;

    .line 9
    .line 10
    iget-object v1, p0, Lv61;->β:Ln;

    .line 11
    .line 12
    iget-object v3, p0, Lv61;->ε:Landroid/widget/ProgressBar;

    .line 13
    .line 14
    iget-object v4, p0, Lv61;->γ:Landroid/widget/TextView;

    .line 15
    .line 16
    iget-object v5, p0, Lv61;->δ:Landroid/widget/TextView;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, Lg90;-><init>(Ln;Landroid/app/AlertDialog;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
