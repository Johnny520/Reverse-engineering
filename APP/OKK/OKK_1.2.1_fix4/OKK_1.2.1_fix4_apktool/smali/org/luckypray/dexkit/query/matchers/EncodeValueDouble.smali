.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput-wide p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;->value:D

    return-void
.end method


# virtual methods
.method public final getValue()D
    .locals 2

    iget-wide v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;->value:D

    return-wide v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 3

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueDouble$Companion;

    iget-wide v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;->value:D

    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble$Companion;->createEncodeValueDouble(Lcom/google/flatbuffers/b;D)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
