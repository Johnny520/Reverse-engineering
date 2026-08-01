.class public abstract Lorg/luckypray/dexkit/query/base/BaseQuery;
.super Ljava/lang/Object;
.source "BaseQuery.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IQuery;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0081\u0008\u00a2\u0006\u0002\u0008\u0007J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/base/BaseQuery;",
        "Lorg/luckypray/dexkit/query/base/IQuery;",
        "()V",
        "build",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
        "build$dexkit_android_release",
        "innerBuild",
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

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p0, "$this"    # Lorg/luckypray/dexkit/query/base/BaseQuery;
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    .line 26
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method

.method private final build$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-static {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseQuery;->access$innerBuild(Lorg/luckypray/dexkit/query/base/BaseQuery;Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result v0

    return v0
.end method


# virtual methods
.method protected abstract innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
.end method
