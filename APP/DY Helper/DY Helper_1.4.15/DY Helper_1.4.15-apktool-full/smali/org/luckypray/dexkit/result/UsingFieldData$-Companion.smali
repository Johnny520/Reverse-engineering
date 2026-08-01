.class public final Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/UsingFieldData;
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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-UsingFieldMeta;)Lorg/luckypray/dexkit/result/UsingFieldData;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getField()Lorg/luckypray/dexkit/schema/-FieldMeta;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getUsingType()B

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    const/4 v0, 0x1

    .line 25
    if-ne p1, v0, :cond_0

    .line 26
    .line 27
    sget-object p1, Lorg/luckypray/dexkit/result/FieldUsingType;->Read:Lorg/luckypray/dexkit/result/FieldUsingType;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    sget-object p1, Lorg/luckypray/dexkit/result/FieldUsingType;->Write:Lorg/luckypray/dexkit/result/FieldUsingType;

    .line 34
    .line 35
    :goto_0
    new-instance p2, Lorg/luckypray/dexkit/result/UsingFieldData;

    .line 36
    .line 37
    invoke-direct {p2, p0, p1}, Lorg/luckypray/dexkit/result/UsingFieldData;-><init>(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_1
    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-UsingFieldMeta;->getUsingType()B

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    const-string p1, "Unknown using type: "

    .line 46
    .line 47
    invoke-static {p1, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method
