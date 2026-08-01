.class public Lnet/bytebuddy/dynamic/DynamicType$Default;
.super Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/DynamicType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/DynamicType$Default$Loaded;,
        Lnet/bytebuddy/dynamic/DynamicType$Default$Unloaded;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final auxiliaryTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end field

.field protected final binaryRepresentation:[B

.field protected final loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

.field protected final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;[BLnet/bytebuddy/implementation/LoadedTypeInitializer;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/DynamicType$Default;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 43
    .line 44
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    return v0
.end method

.method public getAuxiliaries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBytes()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getLoadedTypeInitializer()Lnet/bytebuddy/implementation/LoadedTypeInitializer;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/DynamicType$AbstractBase;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1f

    .line 6
    .line 7
    mul-int/2addr v0, v1

    .line 8
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->binaryRepresentation:[B

    .line 15
    .line 16
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v0

    .line 21
    mul-int/2addr v2, v1

    .line 22
    iget-object v0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->loadedTypeInitializer:Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v2

    .line 29
    mul-int/2addr v0, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/dynamic/DynamicType$Default;->auxiliaryTypes:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method
