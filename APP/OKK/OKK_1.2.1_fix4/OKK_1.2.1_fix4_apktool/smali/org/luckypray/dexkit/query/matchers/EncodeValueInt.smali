.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;->value:I

    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;->value:I

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 2

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueInt$Companion;

    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;->value:I

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt$Companion;->createEncodeValueInt(Lcom/google/flatbuffers/b;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
