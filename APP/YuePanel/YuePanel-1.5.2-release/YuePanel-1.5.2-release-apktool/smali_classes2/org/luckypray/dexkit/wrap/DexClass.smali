.class public final Lorg/luckypray/dexkit/wrap/DexClass;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0013\u0008\u0016\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\u000c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0012\u0010\u0015\u001a\u0006\u0012\u0002\u0008\u00030\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0008\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\u0008\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\n\u00a8\u0006\u001c"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/DexClass;",
        "Lorg/luckypray/dexkit/wrap/ISerializable;",
        "descriptor",
        "",
        "(Ljava/lang/String;)V",
        "clazz",
        "Ljava/lang/Class;",
        "(Ljava/lang/Class;)V",
        "className",
        "getClassName",
        "()Ljava/lang/String;",
        "isArray",
        "",
        "()Z",
        "simpleName",
        "getSimpleName",
        "typeName",
        "getTypeName",
        "equals",
        "other",
        "",
        "getInstance",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "hashCode",
        "",
        "toString",
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
        Lorg/luckypray/dexkit/wrap/DexClass$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private final typeName:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexClass$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/wrap/DexClass;->Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    return-void
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/DexClass;->Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexClass$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lorg/luckypray/dexkit/wrap/DexClass;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    check-cast p1, Lorg/luckypray/dexkit/wrap/DexClass;

    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2e

    invoke-static {v0, v3, v1, v2, v1}, LYue/ۥۢ۠ۢۥ;->ۥ۟ۡۨۢ(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isArray()Z
    .locals 5

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "[]"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۡ(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public serialize()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
