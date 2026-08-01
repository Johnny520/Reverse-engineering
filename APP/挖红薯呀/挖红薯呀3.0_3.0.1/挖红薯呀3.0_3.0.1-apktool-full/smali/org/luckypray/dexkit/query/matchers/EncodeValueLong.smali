.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;->value:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getValue()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;->value:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public innerBuild(Lxt;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;

    .line 5
    .line 6
    iget-wide v1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;->value:J

    .line 7
    .line 8
    invoke-virtual {v0, p1, v1, v2}, Lorg/luckypray/dexkit/schema/-EncodeValueLong$Companion;->createEncodeValueLong(Lxt;J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {p1, p0}, Lxt;->n(I)V

    .line 13
    .line 14
    .line 15
    return p0
.end method
