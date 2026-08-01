.class public final synthetic Lr0/G1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Landroid/app/AlertDialog;

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:Lr0/M1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/app/Activity;Lr0/M1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/G1;->a:Landroid/app/AlertDialog;

    iput-object p2, p0, Lr0/G1;->b:Landroid/widget/EditText;

    iput-object p3, p0, Lr0/G1;->c:Landroid/app/Activity;

    iput-object p4, p0, Lr0/G1;->d:Lr0/M1;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    iget-object v4, p0, Lr0/G1;->a:Landroid/app/AlertDialog;

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    invoke-virtual {v4, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lr0/L;

    .line 9
    .line 10
    iget-object v1, p0, Lr0/G1;->b:Landroid/widget/EditText;

    .line 11
    .line 12
    iget-object v2, p0, Lr0/G1;->c:Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v3, p0, Lr0/G1;->d:Lr0/M1;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    invoke-direct/range {v0 .. v5}, Lr0/L;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
