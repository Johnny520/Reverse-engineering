.class public final Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;
.super Ljava/lang/Object;
.source "ISerializable.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/wrap/ISerializable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
