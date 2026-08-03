.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueNull;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    return-void
.end method


# virtual methods
.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 2

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueNull;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueNull$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueNull$Companion;->createEncodeValueNull(Lcom/google/flatbuffers/b;B)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
