.class public final Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;
.super Lorg/luckypray/dexkit/query/matchers/EncodeValue;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lorg/luckypray/dexkit/query/base/IAnnotationEncodeValue;
.implements Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# instance fields
.field private final value:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/query/matchers/EncodeValue;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-short p1, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;->value:S

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getValue()S
    .locals 0

    .line 1
    iget-short p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;->value:S

    .line 2
    .line 3
    return p0
.end method

.method public innerBuild(Lb40;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->Companion:Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;

    .line 5
    .line 6
    iget-short p0, p0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;->value:S

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort$Companion;->createEncodeValueShort(Lb40;S)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    invoke-virtual {p1, p0}, Lb40;->ξ(I)V

    .line 13
    .line 14
    .line 15
    return p0
.end method
