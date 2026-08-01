.class public final LH/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/e;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, LH/a;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, LH/a;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LH/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput-object p1, p0, LH/a;->b:Ljava/lang/Object;

    iput-object p2, p0, LH/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    iput-object p1, p0, LH/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Landroidx/emoji2/text/v;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Landroidx/emoji2/text/v;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method


# virtual methods
.method public b(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->b(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/fragment/app/o;->e:Le/i;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LH/a;->c(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    throw v0

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    return-void
.end method

.method public d(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->d(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->e(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public f(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->f(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public g(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->g(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public h(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/fragment/app/o;->e:Le/i;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LH/a;->h(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    throw v0

    .line 47
    :cond_1
    throw v0

    .line 48
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    return-void
.end method

.method public i(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->i(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :cond_0
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lcom/lu/wxmask/ui/WebViewActivity;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    return-void
.end method

.method public k(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->k(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public l(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->l(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public m(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->m(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public n(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->n(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public o(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->o(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public p(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/fragment/app/z;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/l;->g()Landroidx/fragment/app/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    iget-object v0, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, LH/a;->p(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    throw v0

    .line 43
    :cond_1
    throw v0

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_3
    return-void
.end method

.method public q(Ljava/lang/CharSequence;IILandroidx/emoji2/text/n;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget v1, p4, Landroidx/emoji2/text/n;->c:I

    .line 3
    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    iget-object v1, p0, LH/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/emoji2/text/e;

    .line 11
    .line 12
    invoke-virtual {p4}, Landroidx/emoji2/text/n;->b()LG/a;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    const/16 v5, 0x8

    .line 17
    .line 18
    invoke-virtual {v4, v5}, LG/c;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    iget-object v6, v4, LG/c;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    iget v4, v4, LG/c;->a:I

    .line 29
    .line 30
    add-int/2addr v5, v4

    .line 31
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    sget-object v4, Landroidx/emoji2/text/e;->b:Ljava/lang/ThreadLocal;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-nez v5, :cond_1

    .line 44
    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 60
    .line 61
    .line 62
    :goto_0
    if-ge p2, p3, :cond_2

    .line 63
    .line 64
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    add-int/2addr p2, v0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    iget-object p1, v1, Landroidx/emoji2/text/e;->a:Landroid/text/TextPaint;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    sget p3, Lr/e;->a:I

    .line 80
    .line 81
    invoke-static {p1, p2}, Lr/d;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    move p1, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    move p1, v0

    .line 90
    :goto_1
    iput p1, p4, Landroidx/emoji2/text/n;->c:I

    .line 91
    .line 92
    :cond_4
    iget p1, p4, Landroidx/emoji2/text/n;->c:I

    .line 93
    .line 94
    if-ne p1, v2, :cond_5

    .line 95
    .line 96
    return v0

    .line 97
    :cond_5
    return v3
.end method

.method public r(Lg/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/emoji2/text/s;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/s;->a(Lg/a;)Lg/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, v0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LH/a;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Le/u;

    .line 19
    .line 20
    iget-object v0, p1, Le/u;->q:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, Le/u;->f:Landroid/view/Window;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Le/u;->r:Le/l;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Le/u;->s:Ly/S;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ly/S;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Le/u;->p:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-static {v0}, Ly/L;->a(Landroid/view/View;)Ly/S;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Ly/S;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Le/u;->s:Ly/S;

    .line 57
    .line 58
    new-instance v1, Le/n;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, v2, p0}, Le/n;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ly/S;->d(Ly/T;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    iput-object v0, p1, Le/u;->o:Lg/a;

    .line 69
    .line 70
    iget-object p1, p1, Le/u;->u:Landroid/view/ViewGroup;

    .line 71
    .line 72
    sget-object v0, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-static {p1}, Ly/z;->c(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public s(Lg/a;Lh/m;)Z
    .locals 4

    .line 1
    iget-object v0, p0, LH/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le/u;

    .line 4
    .line 5
    iget-object v0, v0, Le/u;->u:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-static {v0}, Ly/z;->c(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LH/a;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/emoji2/text/s;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/s;->a(Lg/a;)Lg/f;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v1, v0, Landroidx/emoji2/text/s;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ll/k;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v1, p2, v2}, Ll/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroid/view/Menu;

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    new-instance v2, Lh/C;

    .line 34
    .line 35
    iget-object v3, v0, Landroidx/emoji2/text/s;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v2, v3, p2}, Lh/C;-><init>(Landroid/content/Context;Lh/m;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, p2, v2}, Ll/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object p2, v0, Landroidx/emoji2/text/s;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Landroid/view/ActionMode$Callback;

    .line 48
    .line 49
    invoke-interface {p2, p1, v2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    return p1
.end method

.method public t(Lv/f;)V
    .locals 4

    .line 1
    iget v0, p1, Lv/f;->b:I

    .line 2
    .line 3
    iget-object v1, p0, LH/a;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v2, p0, LH/a;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, LC/j;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lo/a;

    .line 14
    .line 15
    iget-object p1, p1, Lv/f;->a:Landroid/graphics/Typeface;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v0, v2, p1, v3}, Lo/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance p1, LD/b;

    .line 26
    .line 27
    invoke-direct {p1, v2, v0}, LD/b;-><init>(LC/j;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method
