.class public final Lwv;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/util/SparseArray;

.field public b:I

.field public c:Ljava/util/Set;


# virtual methods
.method public final a(I)Lvv;
    .locals 2

    iget-object v0, p0, Lwv;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvv;

    if-nez v1, :cond_0

    new-instance v1, Lvv;

    invoke-direct {v1}, Lvv;-><init>()V

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method
