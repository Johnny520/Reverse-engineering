.class public final LBC;
.super Landroidx/recyclerview/widget/o;
.source ""


# instance fields
.field public final a:LKo;


# direct methods
.method public constructor <init>(Lca;LKo;)V
    .locals 2

    const-wide v0, -0x1bb06fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LBC;->a:LKo;

    new-instance v0, LGy;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p0}, LGy;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, LKo;->setOnThemeActionListener(LJo;)V

    return-void
.end method
