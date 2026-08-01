.class public final synthetic Leb2;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Landroid/view/View;

.field public final synthetic ζ:Landroid/widget/ProgressBar;

.field public final synthetic η:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/TextView;)V
    .locals 6

    .line 1
    iput-object p1, p0, Leb2;->ε:Landroid/view/View;

    .line 2
    .line 3
    iput-object p2, p0, Leb2;->ζ:Landroid/widget/ProgressBar;

    .line 4
    .line 5
    iput-object p3, p0, Leb2;->η:Landroid/widget/TextView;

    .line 6
    .line 7
    const-string v4, "showConfirmDialog$lambda$171$updateProgress(Landroid/view/View;Landroid/widget/ProgressBar;Landroid/widget/TextView;ILjava/lang/String;)V"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x2

    .line 11
    const-class v2, Lkn0;

    .line 12
    .line 13
    const-string v3, "updateProgress"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lp80;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Leb2;->ε:Landroid/view/View;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Leb2;->ζ:Landroid/widget/ProgressBar;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x64

    .line 24
    .line 25
    invoke-static {p1, v1, v2}, Lj81;->μ(III)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Leb2;->η:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Ls62;->α:Ls62;

    .line 38
    .line 39
    return-object p0
.end method
