.class public abstract Lorg/luckypray/dexkit/result/BaseDataList;
.super Ljava/util/ArrayList;
.source "DataCollections.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/ArrayList<",
        "TT;>;",
        "Lorg/luckypray/dexkit/query/base/IQuery;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0005\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\u0008\u0012\u0004\u0012\u0002H\u0001`\u00032\u00020\u0004B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0005B\u000f\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008B\u0015\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u000c\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000c\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0013\u001a\u00028\u00002\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010\u0018\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\r\u0010\u0019\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u0019\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u001a\u001a\u00028\u00002\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/BaseDataList;",
        "T",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "initialCapacity",
        "",
        "(I)V",
        "elements",
        "",
        "(Ljava/util/Collection;)V",
        "first",
        "()Ljava/lang/Object;",
        "predicate",
        "Lkotlin/Function1;",
        "",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "firstOrNull",
        "firstOrThrow",
        "exceptionSupplier",
        "Lkotlin/Function0;",
        "",
        "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;",
        "single",
        "singleOrNull",
        "singleOrThrow",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 36
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public final first()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 70
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "list is empty"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final first(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .local v1, "element":Ljava/lang/Object;
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .end local v1    # "element":Ljava/lang/Object;
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    const-string v1, "No element matching predicate was found."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final firstOrNull()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 47
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final firstOrNull(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .local v1, "element":Ljava/lang/Object;
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 59
    .end local v1    # "element":Ljava/lang/Object;
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final firstOrThrow(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 1
    .param p1, "exceptionSupplier"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "exceptionSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public bridge getSize()I
    .locals 1

    .line 34
    invoke-super {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 34
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->removeAt(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge removeAt(I)Ljava/lang/Object;
    .locals 1
    .param p1, "p0"    # I

    .line 34
    invoke-super {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final single()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 137
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 138
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 139
    .local v0, "t":Ljava/lang/Object;
    const/4 v1, 0x1

    .local v1, "i":I
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 140
    invoke-virtual {p0, v1}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 139
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 141
    :cond_0
    new-instance v2, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;-><init>(I)V

    throw v2

    .line 144
    .end local v1    # "i":I
    :cond_1
    return-object v0

    .line 137
    .end local v0    # "t":Ljava/lang/Object;
    :cond_2
    new-instance v0, Lorg/luckypray/dexkit/exceptions/NoResultException;

    const-string v1, "No result found for query"

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/exceptions/NoResultException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final single(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 5
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v0

    const-string v1, "No result found for query"

    if-eqz v0, :cond_5

    .line 154
    const/4 v0, 0x0

    .line 155
    .local v0, "t":Ljava/lang/Object;
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 156
    .local v3, "element":Ljava/lang/Object;
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 157
    if-eqz v0, :cond_2

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 158
    :cond_1
    new-instance v1, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Lorg/luckypray/dexkit/exceptions/NonUniqueResultException;-><init>(I)V

    throw v1

    .line 160
    :cond_2
    :goto_1
    move-object v0, v3

    .end local v3    # "element":Ljava/lang/Object;
    goto :goto_0

    .line 163
    :cond_3
    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    new-instance v2, Lorg/luckypray/dexkit/exceptions/NoResultException;

    invoke-direct {v2, v1}, Lorg/luckypray/dexkit/exceptions/NoResultException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 153
    .end local v0    # "t":Ljava/lang/Object;
    :cond_5
    new-instance v0, Lorg/luckypray/dexkit/exceptions/NoResultException;

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/exceptions/NoResultException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final singleOrNull()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 102
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 103
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 104
    .local v0, "t":Ljava/lang/Object;
    const/4 v2, 0x1

    .local v2, "i":I
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    .line 105
    invoke-virtual {p0, v2}, Lorg/luckypray/dexkit/result/BaseDataList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 106
    return-object v1

    .line 104
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 109
    .end local v2    # "i":I
    :cond_2
    return-object v0
.end method

.method public final singleOrNull(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 5
    .param p1, "predicate"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 119
    :cond_0
    const/4 v0, 0x0

    .line 120
    .local v0, "t":Ljava/lang/Object;
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 121
    .local v3, "element":Ljava/lang/Object;
    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 122
    if-eqz v0, :cond_2

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 123
    return-object v1

    .line 125
    :cond_2
    move-object v0, v3

    .end local v3    # "element":Ljava/lang/Object;
    goto :goto_0

    .line 128
    :cond_3
    return-object v0
.end method

.method public final singleOrThrow(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    .locals 1
    .param p1, "exceptionSupplier"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)TT;"
        }
    .end annotation

    const-string v0, "exceptionSupplier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->singleOrNull()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final bridge size()I
    .locals 1

    .line 34
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->getSize()I

    move-result v0

    return v0
.end method
