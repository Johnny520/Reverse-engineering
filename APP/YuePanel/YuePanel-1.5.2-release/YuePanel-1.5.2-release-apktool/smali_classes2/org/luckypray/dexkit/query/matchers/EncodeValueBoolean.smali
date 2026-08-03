.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;",
        "Lorg/luckypray/dexkit/query/matchers/EncodeValue;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "value",
        "",
        "(Z)V",
        "getValue",
        "()Z",
        "innerBuild",
        "",
        "fbb",
        "Lcom/google/flatbuffers/FlatBufferBuilder;",
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


# instance fields
.field private final value:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput-boolean p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;->value:Z

    return-void
.end method


# virtual methods
.method public final getValue()Z
    .locals 1

    iget-boolean v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;->value:Z

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p1    # Lcom/google/flatbuffers/FlatBufferBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "fbb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;

    iget-boolean v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;->value:Z

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;->createEncodeValueBoolean(Lcom/google/flatbuffers/FlatBufferBuilder;Z)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    return v0
.end method
