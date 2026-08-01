.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-char p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getValue()C
    .locals 0

    .line 1
    iget-char p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    .line 2
    .line 3
    return p0
.end method

.method public innerBuild(Lc5;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueChar$Companion;

    .line 5
    .line 6
    iget-char p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueChar;->value:C

    .line 7
    .line 8
    int-to-short p0, p0

    .line 9
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/schema/-EncodeValueChar$Companion;->createEncodeValueChar(Lc5;S)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p1, p0}, Lc5;->n(I)V

    .line 14
    .line 15
    .line 16
    return p0
.end method
