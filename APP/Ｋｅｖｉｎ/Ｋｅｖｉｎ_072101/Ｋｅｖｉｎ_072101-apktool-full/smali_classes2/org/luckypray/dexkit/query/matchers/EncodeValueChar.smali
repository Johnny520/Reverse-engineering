.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "EncodeValues.kt"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;",
        "Lorg/luckypray/dexkit/query/matchers/EncodeValue;",
        "Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;",
        "Lorg/luckypray/dexkit/query/base/INumberEncodeValue;",
        "value",
        "",
        "(C)V",
        "getValue",
        "()C",
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
.field private final value:C


# direct methods
.method public constructor <init>(C)V
    .locals 0
    .param p1, "value"    # C

    .line 59
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput-char p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    return-void
.end method


# virtual methods
.method public final getValue()C
    .locals 1

    .line 59
    iget-char v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    return v0
.end method

.method protected innerBuild(Lcom/google/flatbuffers/FlatBufferBuilder;)I
    .locals 2
    .param p1, "fbb"    # Lcom/google/flatbuffers/FlatBufferBuilder;

    const-string v0, "fbb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueChar$Companion;

    iget-char v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    int-to-short v1, v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar$Companion;->createEncodeValueChar(Lcom/google/flatbuffers/FlatBufferBuilder;S)I

    move-result v0

    .line 62
    .local v0, "root":I
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/FlatBufferBuilder;->finish(I)V

    .line 63
    return v0
.end method
