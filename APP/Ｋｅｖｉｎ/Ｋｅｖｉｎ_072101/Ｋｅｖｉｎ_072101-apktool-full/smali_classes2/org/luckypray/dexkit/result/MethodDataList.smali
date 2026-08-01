.class public final Lorg/luckypray/dexkit/result/MethodDataList;
.super Lorg/luckypray/dexkit/result/BaseDataList;
.source "DataCollections.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/luckypray/dexkit/result/BaseDataList<",
        "Lorg/luckypray/dexkit/result/MethodData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0015\u0008\u0016\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ%\u0010\n\u001a\u00020\u00002\u0017\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0008\u000fH\u0087\u0008\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0010"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/MethodDataList;",
        "Lorg/luckypray/dexkit/result/BaseDataList;",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "()V",
        "initialCapacity",
        "",
        "(I)V",
        "elements",
        "",
        "(Ljava/util/Collection;)V",
        "findMethod",
        "Lorg/luckypray/dexkit/query/FindMethod;",
        "init",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ExtensionFunctionType;",
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

    .line 252
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0
    .param p1, "initialCapacity"    # I

    .line 253
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 1
    .param p1, "elements"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/luckypray/dexkit/result/MethodData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method private final findMethod(Lkotlin/jvm/functions/Function1;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1
    .param p1, "init"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lorg/luckypray/dexkit/query/FindMethod;",
            "Lkotlin/Unit;",
            ">;)",
            "Lorg/luckypray/dexkit/result/MethodDataList;"
        }
    .end annotation

    const-string v0, "init"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    new-instance v0, Lorg/luckypray/dexkit/query/FindMethod;

    invoke-direct {v0}, Lorg/luckypray/dexkit/query/FindMethod;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/MethodDataList;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 251
    instance-of v0, p1, Lorg/luckypray/dexkit/result/MethodData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/MethodDataList;->contains(Lorg/luckypray/dexkit/result/MethodData;)Z

    move-result v0

    return v0
.end method

.method public bridge contains(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/result/MethodData;

    .line 251
    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 2
    .param p1, "findMethod"    # Lorg/luckypray/dexkit/query/FindMethod;

    const-string v0, "findMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/luckypray/dexkit/result/MethodDataList;

    invoke-direct {v0}, Lorg/luckypray/dexkit/result/MethodDataList;-><init>()V

    return-object v0

    .line 266
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodDataList;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/MethodData;->getBridge$dexkit_android_release()Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    .line 267
    .local v0, "bridge":Lorg/luckypray/dexkit/DexKitBridge;
    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {p1, v1}, Lorg/luckypray/dexkit/query/FindMethod;->searchInMethod(Ljava/util/Collection;)Lorg/luckypray/dexkit/query/FindMethod;

    .line 268
    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;

    move-result-object v1

    return-object v1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 251
    instance-of v0, p1, Lorg/luckypray/dexkit/result/MethodData;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/MethodDataList;->indexOf(Lorg/luckypray/dexkit/result/MethodData;)I

    move-result v0

    return v0
.end method

.method public bridge indexOf(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/result/MethodData;

    .line 251
    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 251
    instance-of v0, p1, Lorg/luckypray/dexkit/result/MethodData;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/MethodDataList;->lastIndexOf(Lorg/luckypray/dexkit/result/MethodData;)I

    move-result v0

    return v0
.end method

.method public bridge lastIndexOf(Lorg/luckypray/dexkit/result/MethodData;)I
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/result/MethodData;

    .line 251
    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final bridge remove(I)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1
    .param p1, "index"    # I

    .line 251
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/MethodDataList;->removeAt(I)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v0

    return-object v0
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "element"    # Ljava/lang/Object;

    .line 251
    instance-of v0, p1, Lorg/luckypray/dexkit/result/MethodData;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    move-object v0, p1

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/result/MethodDataList;->remove(Lorg/luckypray/dexkit/result/MethodData;)Z

    move-result v0

    return v0
.end method

.method public bridge remove(Lorg/luckypray/dexkit/result/MethodData;)Z
    .locals 1
    .param p1, "element"    # Lorg/luckypray/dexkit/result/MethodData;

    .line 251
    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge removeAt(I)Lorg/luckypray/dexkit/result/MethodData;
    .locals 1
    .param p1, "p0"    # I

    .line 251
    invoke-super {p0, p1}, Lorg/luckypray/dexkit/result/BaseDataList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    return-object v0
.end method
