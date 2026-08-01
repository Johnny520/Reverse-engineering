.class public abstract Ln0/b;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract a(Ln0/a;ILandroid/view/ViewGroup;)V
.end method

.method public abstract b(Landroid/view/ViewGroup;)Ln0/a;
.end method

.method public final getCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p3, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p3}, Ln0/b;->b(Landroid/view/ViewGroup;)Ln0/a;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p2, Ln0/a;->a:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string v0, "null cannot be cast to non-null type VH of com.lu.wxmask.adapter.AbsListAdapter"

    .line 26
    .line 27
    invoke-static {p2, v0}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    check-cast p2, Ln0/a;

    .line 31
    .line 32
    :goto_0
    iput p1, p2, Ln0/a;->b:I

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1, p3}, Ln0/b;->a(Ln0/a;ILandroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p2, Ln0/a;->a:Landroid/view/View;

    .line 38
    .line 39
    return-object p1
.end method
