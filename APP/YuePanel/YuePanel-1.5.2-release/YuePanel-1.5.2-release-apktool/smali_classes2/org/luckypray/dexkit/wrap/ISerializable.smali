.class public interface abstract Lorg/luckypray/dexkit/wrap/ISerializable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/ISerializable;",
        "",
        "serialize",
        "",
        "Companion",
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

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/ISerializable$Companion;,
        Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->$$INSTANCE:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    sput-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    return-void
.end method

.method public static deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    move-result-object p0

    return-object p0
.end method

.method public static deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract serialize()Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method
