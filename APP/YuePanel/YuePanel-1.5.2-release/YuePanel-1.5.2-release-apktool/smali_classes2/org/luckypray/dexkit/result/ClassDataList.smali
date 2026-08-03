.class public final Lorg/luckypray/dexkit/result/ClassDataList;
.super Lorg/luckypray/dexkit/result/BaseDataList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/luckypray/dexkit/result/BaseDataList<",
        "Lorg/luckypray/dexkit/result/ClassData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0003\u0010\u0007B\u0017\u0008\u0016\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008\u00a2\u0006\u0004\u0008\u0003\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ&\u0010\u000c\u001a\u00020\u00002\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0016J&\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001bJ&\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0008\u0010\u00a2\u0006\u0004\u0008\u0019\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/ClassDataList;",
        "Lorg/luckypray/dexkit/result/BaseDataList;",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "<init>",
        "()V",
        "",
        "initialCapacity",
        "(I)V",
        "",
        "elements",
        "(Ljava/util/Collection;)V",
        "Lorg/luckypray/dexkit/query/FindClass;",
        "findClass",
        "(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;",
        "Lkotlin/Function1;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        "LYue/\u06e5\u06e0\u06e1\u06e5\u06e7;",
        "init",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/result/ClassDataList;",
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "findMethod",
        "Lorg/luckypray/dexkit/result/MethodDataList;",
        "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/result/MethodDataList;",
        "Lorg/luckypray/dexkit/query/FindField;",
        "findField",
        "Lorg/luckypray/dexkit/result/FieldDataList;",
        "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;",
        "(LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)Lorg/luckypray/dexkit/result/FieldDataList;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/ClassData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/ClassData;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->contains(Lorg/luckypray/dexkit/result/ClassData;)Z

    move-result p1

    return p1
.end method

.method public bridge contains(Lorg/luckypray/dexkit/result/ClassData;)Z
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic findClass(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/FindClass;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindClass;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassDataList;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p1

    return-object p1
.end method

.method public final findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/FindClass;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "findClass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lorg/luckypray/dexkit/result/ClassDataList;

    invoke-direct {p1}, Lorg/luckypray/dexkit/result/ClassDataList;-><init>()V

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    .line 3
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindClass;->searchIn(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindClass;

    .line 4
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findField(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/FindField;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindField;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassDataList;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p1

    return-object p1
.end method

.method public final findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/FindField;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "findField"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lorg/luckypray/dexkit/result/FieldDataList;

    invoke-direct {p1}, Lorg/luckypray/dexkit/result/FieldDataList;-><init>()V

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    .line 3
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindField;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindField;

    .line 4
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findField(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findMethod(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    const-string v0, "init"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/ClassDataList;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1
    .param p1    # Lorg/luckypray/dexkit/query/FindMethod;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "findMethod"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {p1}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    return-object p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/BaseDataList;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/base/BaseData;->getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    .line 3
    invoke-virtual {p1, p0}, Lorg/luckypray/dexkit/query/FindMethod;->searchInClass(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 4
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/ClassData;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->indexOf(Lorg/luckypray/dexkit/result/ClassData;)I

    move-result p1

    return p1
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/result/ClassData;)I
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/AbstractList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/luckypray/dexkit/result/ClassData;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->lastIndexOf(Lorg/luckypray/dexkit/result/ClassData;)I

    move-result p1

    return p1
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/result/ClassData;)I
    .locals 0

    .line 2
    invoke-super {p0, p1}, Ljava/util/AbstractList;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->removeAt(I)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 2
    instance-of v0, p1, Lorg/luckypray/dexkit/result/ClassData;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassDataList;->remove(Lorg/luckypray/dexkit/result/ClassData;)Z

    move-result p1

    return p1
.end method

.method public bridge remove(Lorg/luckypray/dexkit/result/ClassData;)Z
    .locals 0

    .line 3
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    return-object p1
.end method
