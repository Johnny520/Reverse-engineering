.class public final synthetic Lnd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/Activity;

.field public final synthetic β:Landroid/app/AlertDialog;

.field public final synthetic γ:Lum1;

.field public final synthetic δ:Landroid/widget/TextView;

.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Landroid/widget/RadioGroup;

.field public final synthetic η:Landroid/widget/TextView;

.field public final synthetic θ:I

.field public final synthetic ι:Ljava/util/Set;

.field public final synthetic κ:Lec1;

.field public final synthetic λ:Lxx;


# direct methods
.method public synthetic constructor <init>(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Lnd1;->α:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p6, p0, Lnd1;->β:Landroid/app/AlertDialog;

    .line 7
    .line 8
    iput-object p4, p0, Lnd1;->γ:Lum1;

    .line 9
    .line 10
    iput-object p8, p0, Lnd1;->δ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p9, p0, Lnd1;->ε:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p7, p0, Lnd1;->ζ:Landroid/widget/RadioGroup;

    .line 15
    .line 16
    iput-object p10, p0, Lnd1;->η:Landroid/widget/TextView;

    .line 17
    .line 18
    iput p1, p0, Lnd1;->θ:I

    .line 19
    .line 20
    iput-object p11, p0, Lnd1;->ι:Ljava/util/Set;

    .line 21
    .line 22
    iput-object p3, p0, Lnd1;->κ:Lec1;

    .line 23
    .line 24
    iput-object p2, p0, Lnd1;->λ:Lxx;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 12

    .line 1
    sget-object p1, Lxd1;->α:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    iget-object v5, p0, Lnd1;->β:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v4, p0, Lnd1;->α:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {v4, v5}, Lxd1;->γ(Landroid/app/Activity;Landroid/app/AlertDialog;)V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lnd1;->γ:Lum1;

    .line 14
    .line 15
    iget-object p1, v3, Lum1;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    iget v0, p0, Lnd1;->θ:I

    .line 27
    .line 28
    iget-object v1, p0, Lnd1;->λ:Lxx;

    .line 29
    .line 30
    iget-object v2, p0, Lnd1;->κ:Lec1;

    .line 31
    .line 32
    iget-object v6, p0, Lnd1;->ζ:Landroid/widget/RadioGroup;

    .line 33
    .line 34
    iget-object v7, p0, Lnd1;->δ:Landroid/widget/TextView;

    .line 35
    .line 36
    iget-object v8, p0, Lnd1;->ε:Landroid/widget/TextView;

    .line 37
    .line 38
    iget-object v9, p0, Lnd1;->η:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v10, p0, Lnd1;->ι:Ljava/util/Set;

    .line 41
    .line 42
    invoke-static/range {v0 .. v11}, Lxd1;->λ(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;Z)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method
