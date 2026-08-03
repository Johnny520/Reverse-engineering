.class public final Lba;
.super Landroidx/recyclerview/widget/o;
.source ""


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final synthetic b:Lca;


# direct methods
.method public constructor <init>(Lca;LS6;)V
    .locals 4

    const-wide v0, -0x5d53fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, Lba;->b:Lca;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout;

    iget-object p1, p1, Lca;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 p1, 0x10

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result v1

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {p1}, LGu;->i(Ljava/lang/Number;)I

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, p0, Lba;->a:Landroid/widget/LinearLayout;

    return-void
.end method
