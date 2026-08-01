.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueString;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public innerBuild(Lxt;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueString;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueString$Companion;

    .line 5
    .line 6
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueString;->value:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Lxt;->j(Ljava/lang/CharSequence;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/schema/-EncodeValueString$Companion;->createEncodeValueString(Lxt;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {p1, p0}, Lxt;->n(I)V

    .line 17
    .line 18
    .line 19
    return p0
.end method
