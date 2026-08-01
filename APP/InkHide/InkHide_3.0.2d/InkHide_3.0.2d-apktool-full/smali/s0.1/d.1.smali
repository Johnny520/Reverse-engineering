.class public final synthetic Ls0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Li/q1;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Li/q1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls0/d;->b:Li/q1;

    iput p2, p0, Ls0/d;->c:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Ls0/d;->b:Li/q1;

    .line 2
    .line 3
    iget-object p2, p1, Li/q1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Ls0/g;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const-string v1, "listAdapter"

    .line 9
    .line 10
    if-eqz p2, :cond_2

    .line 11
    .line 12
    iget-object p2, p2, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    iget v2, p0, Ls0/d;->c:I

    .line 15
    .line 16
    invoke-virtual {p2, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-boolean p2, Lz0/i;->a:Z

    .line 20
    .line 21
    iget-object p2, p1, Li/q1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p2, Ls0/g;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-object p2, p2, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-static {p2}, Lz0/g;->N(Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p1, Li/q1;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ls0/g;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_2
    invoke-static {v1}, LN0/g;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method
