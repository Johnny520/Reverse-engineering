.class public final La/a7$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/a7;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/e;

.field public final synthetic b:La/a7;


# direct methods
.method public constructor <init>(La/a7;Landroidx/fragment/app/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a7$a;->b:La/a7;

    iput-object p2, p0, La/a7$a;->a:Landroidx/fragment/app/e;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, La/a7$a;->a:Landroidx/fragment/app/e;

    invoke-virtual {p1}, Landroidx/fragment/app/e;->k()V

    iget-object p1, p1, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    iget-object p1, p1, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, La/a7$a;->b:La/a7;

    iget-object v0, v0, La/a7;->a:La/e7;

    invoke-static {p1, v0}, Landroidx/fragment/app/f;->i(Landroid/view/ViewGroup;La/e7;)Landroidx/fragment/app/f;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/f;->h()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
