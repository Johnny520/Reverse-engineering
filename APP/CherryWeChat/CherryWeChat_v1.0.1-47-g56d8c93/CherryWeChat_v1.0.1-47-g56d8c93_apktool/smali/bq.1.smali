.class public final synthetic Lbq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/app/AlertDialog;

.field public final synthetic b:Ljq;

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Ljq;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq;->a:Landroid/app/AlertDialog;

    iput-object p2, p0, Lbq;->b:Ljq;

    iput-object p3, p0, Lbq;->c:Ljava/util/ArrayList;

    iput p4, p0, Lbq;->d:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lbq;->a:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    iget p1, p0, Lbq;->d:I

    add-int/lit8 p1, p1, 0x1

    iget-object p2, p0, Lbq;->b:Ljq;

    iget-object v0, p0, Lbq;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, v0, p1}, Ljq;->l(Ljava/util/ArrayList;I)V

    return-void
.end method
