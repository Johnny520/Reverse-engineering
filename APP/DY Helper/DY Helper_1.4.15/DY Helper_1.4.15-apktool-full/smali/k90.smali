.class public final synthetic Lk90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ε:Lqm1;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk90;->ε:Lqm1;

    .line 5
    .line 6
    iput-object p2, p0, Lk90;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p3, p0, Lk90;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lk90;->θ:Landroid/app/AlertDialog;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lk90;->ε:Lqm1;

    .line 2
    .line 3
    iget-boolean v0, p1, Lqm1;->ε:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lk90;->ζ:Lum1;

    .line 8
    .line 9
    iget-object v1, p0, Lk90;->η:Landroid/app/Activity;

    .line 10
    .line 11
    iget-object p0, p0, Lk90;->θ:Landroid/app/AlertDialog;

    .line 12
    .line 13
    invoke-static {p1, v0, v1, p0}, Lyh;->р(Lqm1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
