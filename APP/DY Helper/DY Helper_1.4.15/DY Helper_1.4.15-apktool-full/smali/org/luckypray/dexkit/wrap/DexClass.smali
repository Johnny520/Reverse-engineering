.class public final Lorg/luckypray/dexkit/wrap/DexClass;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/DexClass$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;


# instance fields
.field private final typeName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexClass$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/wrap/DexClass;->Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/wrap/DexClass;->Companion:Lorg/luckypray/dexkit/wrap/DexClass$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexClass$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexClass;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Lorg/luckypray/dexkit/wrap/DexClass;

    .line 14
    .line 15
    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final getSimpleName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v0, 0x2e

    .line 4
    .line 5
    invoke-static {p0, v0, p0}, Lq02;->ц(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isArray()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "[]"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p0, v0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public serialize()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexClass;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
