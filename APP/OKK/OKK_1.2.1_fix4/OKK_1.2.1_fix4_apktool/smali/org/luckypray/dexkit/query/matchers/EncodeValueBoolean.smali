.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;


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

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 2

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;

    iget-boolean v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueBoolean;->value:Z

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean$Companion;->createEncodeValueBoolean(Lcom/google/flatbuffers/b;Z)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
