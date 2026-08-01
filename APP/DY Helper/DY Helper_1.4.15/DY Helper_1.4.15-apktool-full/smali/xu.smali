.class public final synthetic Lxu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Landroid/widget/EditText;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Landroid/widget/EditText;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/EditText;Landroid/app/Activity;Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxu;->ε:Landroid/widget/TextView;

    .line 5
    .line 6
    iput-object p2, p0, Lxu;->ζ:Landroid/widget/EditText;

    .line 7
    .line 8
    iput-object p3, p0, Lxu;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lxu;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, Lxu;->ι:Landroid/widget/EditText;

    .line 13
    .line 14
    iput-object p6, p0, Lxu;->κ:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p7, p0, Lxu;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p8, p0, Lxu;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 p1, 0x3

    .line 2
    iget-object v0, p0, Lxu;->ε:Landroid/widget/TextView;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lxu;->ζ:Landroid/widget/EditText;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 19
    .line 20
    .line 21
    new-instance p1, Lqu;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iget-object v2, p0, Lxu;->η:Landroid/app/Activity;

    .line 25
    .line 26
    invoke-direct {p1, v2, v1, v0}, Lqu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v2, 0x78

    .line 30
    .line 31
    invoke-virtual {v1, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lxu;->θ:Lum1;

    .line 35
    .line 36
    iget-object v3, p0, Lxu;->ι:Landroid/widget/EditText;

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    iget-object v5, p0, Lxu;->κ:Landroid/widget/TextView;

    .line 40
    .line 41
    iget-object v6, p0, Lxu;->λ:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v7, p0, Lxu;->μ:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-static/range {v1 .. v7}, Lh62;->Е(Landroid/widget/EditText;Lum1;Landroid/widget/EditText;Lf8;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
