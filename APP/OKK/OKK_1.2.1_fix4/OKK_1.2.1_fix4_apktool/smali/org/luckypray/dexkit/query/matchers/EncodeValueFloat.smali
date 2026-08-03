.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;->value:F

    return-void
.end method


# virtual methods
.method public final getValue()F
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;->value:F

    return v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 2

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;

    iget v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;->value:F

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat$Companion;->createEncodeValueFloat(Lcom/google/flatbuffers/b;F)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
