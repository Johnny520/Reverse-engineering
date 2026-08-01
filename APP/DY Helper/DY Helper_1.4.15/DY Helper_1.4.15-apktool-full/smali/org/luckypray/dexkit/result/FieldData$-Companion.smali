.class public final Lorg/luckypray/dexkit/result/FieldData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/FieldData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/luckypray/dexkit/result/FieldData;

    .line 8
    .line 9
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getId-pVg5ArA()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getDexId-pVg5ArA()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getClassId-pVg5ArA()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getAccessFlags-pVg5ArA()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getDexDescriptor()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getTypeId-pVg5ArA()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, 0x0

    .line 37
    move-object v1, p1

    .line 38
    invoke-direct/range {v0 .. v8}, Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILzq;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method
