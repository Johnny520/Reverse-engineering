.class public final synthetic Lqd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/AlertDialog;

.field public final synthetic β:Lxx;

.field public final synthetic γ:Landroid/widget/EditText;

.field public final synthetic δ:Lrb1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Lxx;Landroid/widget/EditText;Lrb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd1;->α:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p2, p0, Lqd1;->β:Lxx;

    .line 7
    .line 8
    iput-object p3, p0, Lqd1;->γ:Landroid/widget/EditText;

    .line 9
    .line 10
    iput-object p4, p0, Lqd1;->δ:Lrb1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lqd1;->α:Landroid/app/AlertDialog;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqd1;->β:Lxx;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    .line 12
    .line 13
    iget-object v3, v1, Lxx;->β:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, -0x2

    .line 26
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, v1, Lxx;->η:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    const/4 v0, -0x1

    .line 40
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, v1, Lxx;->ι:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lc9;

    .line 54
    .line 55
    const/16 v2, 0xa

    .line 56
    .line 57
    iget-object v3, p0, Lqd1;->γ:Landroid/widget/EditText;

    .line 58
    .line 59
    iget-object p0, p0, Lqd1;->δ:Lrb1;

    .line 60
    .line 61
    invoke-direct {v1, v3, p0, p1, v2}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
