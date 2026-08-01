.class public interface abstract Lorg/luckypray/dexkit/wrap/ISerializable;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/ISerializable$Companion;,
        Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->$$INSTANCE:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 2
    .line 3
    sput-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 4
    .line 5
    return-void
.end method

.method public static deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lorg/luckypray/dexkit/wrap/ISerializable;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/wrap/ISerializable;->Companion:Lorg/luckypray/dexkit/wrap/ISerializable$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/ISerializable$Companion;->deserializeAs(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/ISerializable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public abstract serialize()Ljava/lang/String;
.end method
