.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueString;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "SourceFile"


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    return-object v0
.end method

.method public innerBuild(Lcom/google/flatbuffers/b;)I
    .locals 2

    const-string v0, "fbb"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueString;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueString$Companion;

    iget-object v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/b;->j(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/schema/-EncodeValueString$Companion;->createEncodeValueString(Lcom/google/flatbuffers/b;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/b;->n(I)V

    return v0
.end method
