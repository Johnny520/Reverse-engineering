.class public final synthetic La8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lb8;


# direct methods
.method public synthetic constructor <init>(IILb8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La8;->a:I

    iput p2, p0, La8;->b:I

    iput-object p3, p0, La8;->c:Lb8;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget v0, p0, La8;->a:I

    iget v1, p0, La8;->b:I

    iget-object v2, p0, La8;->c:Lb8;

    if-eq v0, v1, :cond_3

    iget-object v3, v2, Lb8;->c:Ljava/util/ArrayList;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-wide v5, -0x51d1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Lve;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v5, v2, Lb8;->b:Landroid/widget/LinearLayout;

    const/4 v6, 0x0

    if-nez v5, :cond_1

    const-wide v7, -0x51dafffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-object v5, v6

    :cond_1
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v3, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object v0, v2, Lb8;->b:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-wide v7, -0x51e9fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_2
    move-object v6, v0

    :goto_0
    invoke-virtual {v6, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_3
    :goto_1
    iget-object v0, v2, Lb8;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lve;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setTranslationY(F)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setScaleY(F)V

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lve;->setDragging(Z)V

    goto :goto_2

    :cond_4
    const/4 v0, -0x1

    iput v0, v2, Lb8;->e:I

    iput v0, v2, Lb8;->f:I

    invoke-virtual {v2}, Lb8;->f()V

    return-void
.end method
