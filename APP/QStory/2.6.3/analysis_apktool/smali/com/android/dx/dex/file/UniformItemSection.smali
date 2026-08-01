.class public abstract Lcom/android/dx/dex/file/UniformItemSection;
.super Lcom/android/dx/dex/file/Section;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/dex/file/Section;-><init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract get(Lcom/android/dx/rop/cst/Constant;)Lcom/android/dx/dex/file/IndexedItem;
.end method

.method public final getAbsoluteItemOffset(Lcom/android/dx/dex/file/Item;)I
    .locals 1

    .line 1
    check-cast p1, Lcom/android/dx/dex/file/IndexedItem;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/file/IndexedItem;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/dex/file/Item;->writeSize()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    mul-int/2addr p1, v0

    .line 12
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/Section;->getAbsoluteOffset(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public abstract orderItems()V
.end method

.method public final prepare0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/UniformItemSection;->orderItems()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/android/dx/dex/file/Item;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/file/Item;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final writeSize()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lcom/android/dx/dex/file/Item;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Item;->writeSize()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    mul-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public final writeTo0(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getFile()Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->getAlignment()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->items()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/android/dx/dex/file/Item;

    .line 28
    .line 29
    invoke-virtual {v2, v0, p1}, Lcom/android/dx/dex/file/Item;->writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->alignTo(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method
