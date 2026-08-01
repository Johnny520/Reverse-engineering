.class public abstract Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final classFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field protected final frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

.field protected final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 9
    .line 10
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
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lnet/bytebuddy/ClassFileVersion;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 19
    .line 20
    invoke-virtual {v2}, Lnet/bytebuddy/ClassFileVersion;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method
