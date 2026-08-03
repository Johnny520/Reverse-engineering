.class public final Lorg/luckypray/dexkit/result/FieldData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/FieldData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/FieldData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "fieldMeta",
        "Lorg/luckypray/dexkit/schema/-FieldMeta;",
        "Lorg/luckypray/dexkit/InnerFieldMeta;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

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

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;
    .locals 10
    .param p1    # Lorg/luckypray/dexkit/DexKitBridge;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Lorg/luckypray/dexkit/schema/-FieldMeta;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldMeta"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getId-pVg5ArA()I

    move-result v3

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getDexId-pVg5ArA()I

    move-result v4

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getClassId-pVg5ArA()I

    move-result v5

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getAccessFlags-pVg5ArA()I

    move-result v6

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getDexDescriptor()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-FieldMeta;->getTypeId-pVg5ArA()I

    move-result v8

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method
