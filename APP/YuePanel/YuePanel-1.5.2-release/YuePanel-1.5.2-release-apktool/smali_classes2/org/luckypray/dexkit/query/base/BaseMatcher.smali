.class public abstract Lorg/luckypray/dexkit/query/base/BaseMatcher;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/QueryComponent;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H$\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/base/BaseMatcher;",
        "Lorg/luckypray/dexkit/query/base/QueryComponent;",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic build$dexkit_android_release(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 1

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/base/BaseMatcher;->innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I

    move-result p1

    return p1
.end method

.method public abstract innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
.end method
