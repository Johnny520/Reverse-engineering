.class public final LOd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:LNd;

.field public final synthetic b:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(LNd;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LOd;->a:LNd;

    iput-object p2, p0, LOd;->b:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, LOd;->a:LNd;

    if-eqz p1, :cond_0

    iget-object p2, p0, LOd;->b:Landroid/widget/EditText;

    invoke-interface {p1, p2}, LNd;->r(Landroid/widget/EditText;)V

    :cond_0
    return-void
.end method
