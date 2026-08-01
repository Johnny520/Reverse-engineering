.class public Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation


# instance fields
.field private final implementationTitle:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final implementationVendor:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final implementationVersion:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field protected final sealBase:Ljava/net/URL;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final specificationTitle:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final specificationVendor:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final specificationVersion:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p7    # Ljava/net/URL;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationTitle:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVersion:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVendor:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationTitle:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVersion:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVendor:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 17
    .line 18
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
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_10

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eq v2, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_1
    check-cast p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;

    .line 21
    .line 22
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationTitle:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationTitle:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-nez v3, :cond_10

    .line 36
    .line 37
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVersion:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVersion:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_4
    if-nez v3, :cond_10

    .line 51
    .line 52
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVendor:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVendor:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-nez v2, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    if-nez v3, :cond_10

    .line 66
    .line 67
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationTitle:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationTitle:Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v2, :cond_8

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_9

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    if-nez v3, :cond_10

    .line 81
    .line 82
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVersion:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVersion:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v2, :cond_a

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_b

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_a
    if-nez v3, :cond_10

    .line 96
    .line 97
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVendor:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v3, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVendor:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v2, :cond_c

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_d

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_c
    if-nez v3, :cond_10

    .line 111
    .line 112
    :cond_d
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 113
    .line 114
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 115
    .line 116
    if-eqz p0, :cond_e

    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/net/URL;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_f

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_e
    if-nez p1, :cond_10

    .line 126
    .line 127
    :cond_f
    return v0

    .line 128
    :cond_10
    :goto_0
    return v1
.end method

.method public getImplementationTitle()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getImplementationVendor()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVendor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getImplementationVersion()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSealBase()Ljava/net/URL;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSpecificationTitle()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSpecificationVendor()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVendor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSpecificationVersion()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationTitle:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVersion:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v2, v1

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->specificationVendor:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v2, v1

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationTitle:Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v2, v1

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVersion:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    goto :goto_4

    .line 62
    :cond_4
    move v2, v1

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->implementationVendor:Ljava/lang/String;

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move v2, v1

    .line 76
    :goto_5
    add-int/2addr v0, v2

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/net/URL;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    :cond_6
    add-int/2addr v0, v1

    .line 88
    return v0
.end method

.method public isCompatibleTo(Ljava/lang/Package;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/PackageDefinitionStrategy$Definition$Simple;->sealBase:Ljava/net/URL;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Package;->isSealed()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    xor-int/lit8 p0, p0, 0x1

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Package;->isSealed(Ljava/net/URL;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public isDefined()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
