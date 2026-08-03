.class public final Lr2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Lv2;

.field public final synthetic b:Ls2;


# direct methods
.method public constructor <init>(Ls2;Lv2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr2;->b:Ls2;

    iput-object p2, p0, Lr2;->a:Lv2;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, Lr2;->b:Ls2;

    iget-object p2, p1, Ls2;->l:Landroid/content/DialogInterface$OnClickListener;

    iget-object p4, p0, Lr2;->a:Lv2;

    iget-object p5, p4, Lv2;->b:Lx2;

    invoke-interface {p2, p5, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-boolean p1, p1, Ls2;->n:Z

    if-nez p1, :cond_0

    iget-object p1, p4, Lv2;->b:Lx2;

    invoke-virtual {p1}, Lx2;->dismiss()V

    :cond_0
    return-void
.end method
