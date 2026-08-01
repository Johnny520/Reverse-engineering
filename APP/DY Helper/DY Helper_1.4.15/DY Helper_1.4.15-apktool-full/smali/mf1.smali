.class public final synthetic Lmf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:La80;

.field public final synthetic ι:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(ZLum1;Landroid/app/Activity;La80;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lmf1;->ε:Z

    .line 5
    .line 6
    iput-object p2, p0, Lmf1;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p3, p0, Lmf1;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lmf1;->θ:La80;

    .line 11
    .line 12
    iput-object p5, p0, Lmf1;->ι:Landroid/app/AlertDialog;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lmf1;->ε:Z

    .line 2
    .line 3
    iget-object v0, p0, Lmf1;->ζ:Lum1;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p1, "\u8bf7\u9009\u62e9\u4e00\u79cd\u98df\u7269"

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iget-object p0, p0, Lmf1;->η:Landroid/app/Activity;

    .line 21
    .line 22
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

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
    iget-object p1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v0, p0, Lmf1;->θ:La80;

    .line 33
    .line 34
    invoke-interface {v0, p1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lmf1;->ι:Landroid/app/AlertDialog;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
