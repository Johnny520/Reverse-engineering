.class public final synthetic Lr61;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/AlertDialog;

.field public final synthetic β:Landroid/widget/EditText;

.field public final synthetic γ:Landroid/widget/EditText;

.field public final synthetic δ:Landroid/app/Activity;

.field public final synthetic ε:Z

.field public final synthetic ζ:Lhh0;


# direct methods
.method public synthetic constructor <init>(Lhh0;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/widget/EditText;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lr61;->α:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p4, p0, Lr61;->β:Landroid/widget/EditText;

    .line 7
    .line 8
    iput-object p5, p0, Lr61;->γ:Landroid/widget/EditText;

    .line 9
    .line 10
    iput-object p2, p0, Lr61;->δ:Landroid/app/Activity;

    .line 11
    .line 12
    iput-boolean p6, p0, Lr61;->ε:Z

    .line 13
    .line 14
    iput-object p1, p0, Lr61;->ζ:Lhh0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 7

    .line 1
    const/4 p1, -0x1

    .line 2
    iget-object v3, p0, Lr61;->α:Landroid/app/AlertDialog;

    .line 3
    .line 4
    invoke-virtual {v3, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lw61;

    .line 9
    .line 10
    iget-object v1, p0, Lr61;->ζ:Lhh0;

    .line 11
    .line 12
    iget-object v2, p0, Lr61;->δ:Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v4, p0, Lr61;->β:Landroid/widget/EditText;

    .line 15
    .line 16
    iget-object v5, p0, Lr61;->γ:Landroid/widget/EditText;

    .line 17
    .line 18
    iget-boolean v6, p0, Lr61;->ε:Z

    .line 19
    .line 20
    invoke-direct/range {v0 .. v6}, Lw61;-><init>(Lhh0;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/widget/EditText;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
