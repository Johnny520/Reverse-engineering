.class public final synthetic Lqv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Landroid/widget/LinearLayout;

.field public final synthetic η:Ln71;

.field public final synthetic θ:Landroid/widget/CheckBox;


# direct methods
.method public synthetic constructor <init>(ZLandroid/widget/LinearLayout;Ln71;Landroid/widget/CheckBox;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lqv1;->ε:Z

    .line 5
    .line 6
    iput-object p2, p0, Lqv1;->ζ:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iput-object p3, p0, Lqv1;->η:Ln71;

    .line 9
    .line 10
    iput-object p4, p0, Lqv1;->θ:Landroid/widget/CheckBox;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lqv1;->ε:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lqv1;->ζ:Landroid/widget/LinearLayout;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lqv1;->η:Ln71;

    .line 12
    .line 13
    iget-object p0, p0, Ln71;->β:Ljava/lang/String;

    .line 14
    .line 15
    const-string v0, "\u9700\u8981\u5185\u6d4b\u8d44\u683c"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p0, p0, Lqv1;->θ:Landroid/widget/CheckBox;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    xor-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
