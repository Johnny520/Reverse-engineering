.class public final LYue/ۥۢۢۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation build LYue/ۥ۠ۡۥۣ;
.end annotation

.annotation runtime LYue/ۥ۠ۦۡ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢۥۦ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:[B
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    return-void
.end method

.method public static final synthetic ۥ۟([B)LYue/ۥۢۢۥۦ;
    .locals 1

    new-instance v0, LYue/ۥۢۢۥۦ;

    invoke-direct {v0, p0}, LYue/ۥۢۢۥۦ;-><init>([B)V

    return-object v0
.end method

.method public static ۥ۟۟(I)[B
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-array p0, p0, [B

    invoke-static {p0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟([B)[B
    .locals 1
    .param p0    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    const-string v0, "storage"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ۥ۟۟۟۠([BB)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۢ([BB)Z

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۢ([BLjava/util/Collection;)Z
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, LYue/ۥۢۢۥۥ;

    if-eqz v2, :cond_1

    check-cast v0, LYue/ۥۢۢۥۥ;

    invoke-virtual {v0}, LYue/ۥۢۢۥۥ;->ۥ۟۟ۤۡ()B

    move-result v0

    invoke-static {p0, v0}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۢ([BB)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_1
    return v1
.end method

.method public static ۥۣ۟۟۟([BLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۥۦ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥۢۢۥۦ;

    invoke-virtual {p1}, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠()[B

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۟ۤ([B[B)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۥ([BI)B
    .locals 0

    aget-byte p0, p0, p1

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۧ([B)I
    .locals 0

    array-length p0, p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۨ()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static ۥ۟۟۠([B)I
    .locals 0

    invoke-static {p0}, Ljava/util/Arrays;->hashCode([B)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠۟([B)Z
    .locals 0

    array-length p0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۠۠([B)Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۢۥۦ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۢۥۦ$ۥ;-><init>([B)V

    return-object v0
.end method

.method public static final ۥ۟۟۠ۡ([BIB)V
    .locals 0

    aput-byte p2, p0, p1

    return-void
.end method

.method public static ۥ۟۟۠ۢ([B)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UByteArray(storage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public clear()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LYue/ۥۢۢۥۥ;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۥۥ;

    invoke-virtual {p1}, LYue/ۥۢۢۥۥ;->ۥ۟۟ۤۡ()B

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟۟(B)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0, p1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۢ([BLjava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0, p1}, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۟([BLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۠([B)I

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۠۟([B)Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۠۠([B)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic size()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۦ()I

    move-result v0

    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, LYue/ۥ۟ۥۡ۟;->ۥ(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 2
    const-string v0, "array"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥ۟ۥۡ۟;->ۥ۟(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۠ۢ([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(B)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۟(B)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0, p1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟۠([BB)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۦ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۧ([B)I

    move-result v0

    return v0
.end method

.method public final synthetic ۥۣ۟۟۠()[B
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۦ;->ۥۣ۟۟۠:[B

    return-object v0
.end method
