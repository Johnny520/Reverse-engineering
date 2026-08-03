.class public final Lg/B;
.super Lg/E;
.source "SourceFile"


# static fields
.field private static final j:Ljava/util/Comparator;


# instance fields
.field private final f:Ljava/util/ArrayList;

.field private final g:Ljava/util/HashMap;

.field private final h:I

.field private i:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg/A;

    invoke-direct {v0}, Lg/A;-><init>()V

    sput-object v0, Lg/B;->j:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lg/k;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg/E;-><init>(Ljava/lang/String;Lg/k;I)V

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0x64

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lg/B;->f:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lg/B;->g:Ljava/util/HashMap;

    iput p4, p0, Lg/B;->h:I

    const/4 p1, -0x1

    iput p1, p0, Lg/B;->i:I

    return-void
.end method


# virtual methods
.method public final a(Lg/s;)I
    .locals 0

    check-cast p1, Lg/C;

    invoke-virtual {p1}, Lg/C;->f()I

    move-result p1

    return p1
.end method

.method public final f()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lg/B;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected final h()V
    .locals 5

    invoke-virtual {p0}, Lg/E;->d()Lg/k;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p0, Lg/B;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v1, v3, :cond_1

    return-void

    :cond_1
    :goto_0
    if-ge v1, v3, :cond_0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg/C;

    invoke-virtual {v4, v0}, Lg/s;->a(Lg/k;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final l()I
    .locals 1

    invoke-virtual {p0}, Lg/E;->j()V

    iget v0, p0, Lg/B;->i:I

    return v0
.end method

.method protected final n(Ln/d;)V
    .locals 10

    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v0

    invoke-virtual {p0}, Lg/E;->d()Lg/k;

    move-result-object v1

    iget-object v2, p0, Lg/B;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v6, v3

    move v5, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg/C;

    if-eqz v0, :cond_1

    if-eqz v6, :cond_0

    move v6, v4

    goto :goto_1

    :cond_0
    const-string v8, "\n"

    invoke-virtual {p1, v4, v8}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    :goto_1
    invoke-virtual {v7}, Lg/C;->g()I

    move-result v8

    sub-int/2addr v8, v3

    add-int v9, v5, v8

    not-int v8, v8

    and-int/2addr v8, v9

    if-eq v5, v8, :cond_2

    sub-int v5, v8, v5

    invoke-virtual {p1, v5}, Ln/d;->u(I)V

    move v5, v8

    :cond_2
    invoke-virtual {v7, v1, p1}, Lg/C;->d(Lg/k;Ln/d;)V

    invoke-virtual {v7}, Lg/C;->c()I

    move-result v7

    add-int/2addr v5, v7

    goto :goto_0

    :cond_3
    iget p1, p0, Lg/B;->i:I

    if-ne v5, p1, :cond_4

    return-void

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "output size mismatch"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o(Lg/C;)V
    .locals 2

    invoke-virtual {p0}, Lg/E;->k()V

    :try_start_0
    invoke-virtual {p1}, Lg/C;->g()I

    move-result v0

    invoke-virtual {p0}, Lg/E;->c()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lg/B;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "incompatible item alignment"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "item == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized p(Lg/C;)Lg/C;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lg/E;->k()V

    iget-object v0, p0, Lg/B;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/C;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lg/B;->o(Lg/C;)V

    iget-object v0, p0, Lg/B;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final q()V
    .locals 6

    invoke-virtual {p0}, Lg/E;->j()V

    iget v0, p0, Lg/B;->h:I

    invoke-static {v0}, Le/q;->b(I)I

    move-result v0

    iget-object v1, p0, Lg/B;->f:Ljava/util/ArrayList;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lg/B;->j:Ljava/util/Comparator;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    if-ge v2, v0, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg/C;

    :try_start_0
    invoke-virtual {v4, p0, v3}, Lg/C;->i(Lg/E;I)I

    move-result v5

    if-lt v5, v3, :cond_2

    invoke-virtual {v4}, Lg/C;->c()I

    move-result v3

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bogus place() result for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "...while placing "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object v0

    throw v0

    :cond_3
    iput v3, p0, Lg/B;->i:I

    return-void
.end method
