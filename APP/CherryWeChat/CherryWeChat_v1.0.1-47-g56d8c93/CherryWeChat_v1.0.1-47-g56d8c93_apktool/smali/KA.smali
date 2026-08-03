.class public final LKA;
.super Landroidx/recyclerview/widget/o;
.source ""


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;)V
    .locals 2

    const-wide v0, -0x1bfa3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1bfadfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LKA;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, LKA;->b:Landroid/widget/ImageView;

    return-void
.end method
