.class public final Lda;
.super Lmv;
.source ""


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lda;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;LAv;)V
    .locals 2

    iget p4, p0, Lda;->a:I

    packed-switch p4, :pswitch_data_0

    const-wide v0, -0x1b9dcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1b9e4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1b9e9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1b9f0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/16 p4, 0x8

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, LGu;->i(Ljava/lang/Number;)I

    move-result p4

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object p3

    instance-of v0, p3, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of v0, p2, Lbk;

    if-eqz v0, :cond_0

    check-cast p2, Lbk;

    iget v1, p2, Lbk;->e:I

    :cond_0
    check-cast p3, Landroidx/recyclerview/widget/GridLayoutManager;

    iget p2, p3, Landroidx/recyclerview/widget/GridLayoutManager;->b:I

    iput p4, p1, Landroid/graphics/Rect;->top:I

    iput p4, p1, Landroid/graphics/Rect;->bottom:I

    if-nez v1, :cond_1

    move p3, p4

    goto :goto_0

    :cond_1
    div-int/lit8 p3, p4, 0x2

    :goto_0
    iput p3, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p2, p2, -0x1

    if-ne v1, p2, :cond_2

    goto :goto_1

    :cond_2
    div-int/lit8 p4, p4, 0x2

    :goto_1
    iput p4, p1, Landroid/graphics/Rect;->right:I

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v1, p4, v1, p4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_2
    return-void

    :pswitch_0
    const-wide v0, -0x1bc5ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1bc67fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1bc6cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1bc73fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/16 p4, 0x8

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, LGu;->i(Ljava/lang/Number;)I

    move-result p4

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object p3

    instance-of p3, p3, Landroidx/recyclerview/widget/GridLayoutManager;

    if-eqz p3, :cond_6

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of p3, p2, Lbk;

    if-eqz p3, :cond_4

    check-cast p2, Lbk;

    iget p2, p2, Lbk;->e:I

    goto :goto_3

    :cond_4
    const/4 p2, 0x0

    :goto_3
    iput p4, p1, Landroid/graphics/Rect;->top:I

    iput p4, p1, Landroid/graphics/Rect;->bottom:I

    if-nez p2, :cond_5

    iput p4, p1, Landroid/graphics/Rect;->left:I

    div-int/lit8 p4, p4, 0x2

    iput p4, p1, Landroid/graphics/Rect;->right:I

    goto :goto_4

    :cond_5
    div-int/lit8 p2, p4, 0x2

    iput p2, p1, Landroid/graphics/Rect;->left:I

    iput p4, p1, Landroid/graphics/Rect;->right:I

    goto :goto_4

    :cond_6
    invoke-virtual {p1, p4, p4, p4, p4}, Landroid/graphics/Rect;->set(IIII)V

    :goto_4
    return-void

    :pswitch_1
    const-wide p2, -0x4d09fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x4d11fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x4d16fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x4d1dfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const/16 p2, 0x8

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p3

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    const/4 p4, 0x0

    invoke-virtual {p1, p4, p3, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    :pswitch_2
    const-wide p2, -0x5047fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x504ffffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x5054fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x505bfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const/16 p2, 0x8

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p3

    invoke-static {p2}, LGu;->i(Ljava/lang/Number;)I

    move-result p2

    const/4 p4, 0x0

    invoke-virtual {p1, p4, p3, p4, p2}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
