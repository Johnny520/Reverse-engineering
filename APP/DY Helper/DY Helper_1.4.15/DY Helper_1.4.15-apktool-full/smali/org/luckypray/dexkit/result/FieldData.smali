.class public final Lorg/luckypray/dexkit/result/FieldData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/FieldData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;


# instance fields
.field private final annotations$delegate:Loq0;

.field private final classId:I

.field private final declaredClass$delegate:Loq0;

.field private final descriptor:Ljava/lang/String;

.field private final dexField$delegate:Loq0;

.field private final modifiers:I

.field private final readers$delegate:Loq0;

.field private final type$delegate:Loq0;

.field private final typeId:I

.field private final writers$delegate:Loq0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/FieldData$-Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData;->classId:I

    .line 5
    .line 6
    iput p5, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    .line 7
    .line 8
    iput-object p6, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    .line 9
    .line 10
    iput p7, p0, Lorg/luckypray/dexkit/result/FieldData;->typeId:I

    .line 11
    .line 12
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$dexField$2;

    .line 13
    .line 14
    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/FieldData$dexField$2;-><init>(Lorg/luckypray/dexkit/result/FieldData;)V

    .line 15
    .line 16
    .line 17
    new-instance p5, Lh22;

    .line 18
    .line 19
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 20
    .line 21
    .line 22
    iput-object p5, p0, Lorg/luckypray/dexkit/result/FieldData;->dexField$delegate:Loq0;

    .line 23
    .line 24
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$declaredClass$2;

    .line 25
    .line 26
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/FieldData$declaredClass$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;I)V

    .line 27
    .line 28
    .line 29
    new-instance p5, Lh22;

    .line 30
    .line 31
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 32
    .line 33
    .line 34
    iput-object p5, p0, Lorg/luckypray/dexkit/result/FieldData;->declaredClass$delegate:Loq0;

    .line 35
    .line 36
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$type$2;

    .line 37
    .line 38
    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/FieldData$type$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;I)V

    .line 39
    .line 40
    .line 41
    new-instance p5, Lh22;

    .line 42
    .line 43
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 44
    .line 45
    .line 46
    iput-object p5, p0, Lorg/luckypray/dexkit/result/FieldData;->type$delegate:Loq0;

    .line 47
    .line 48
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$annotations$2;

    .line 49
    .line 50
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    .line 51
    .line 52
    .line 53
    new-instance p5, Lh22;

    .line 54
    .line 55
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 56
    .line 57
    .line 58
    iput-object p5, p0, Lorg/luckypray/dexkit/result/FieldData;->annotations$delegate:Loq0;

    .line 59
    .line 60
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$readers$2;

    .line 61
    .line 62
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$readers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    .line 63
    .line 64
    .line 65
    new-instance p5, Lh22;

    .line 66
    .line 67
    invoke-direct {p5, p4}, Lh22;-><init>(Lp70;)V

    .line 68
    .line 69
    .line 70
    iput-object p5, p0, Lorg/luckypray/dexkit/result/FieldData;->readers$delegate:Loq0;

    .line 71
    .line 72
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$writers$2;

    .line 73
    .line 74
    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$writers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lh22;

    .line 78
    .line 79
    invoke-direct {p1, p4}, Lh22;-><init>(Lp70;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData;->writers$delegate:Loq0;

    .line 83
    .line 84
    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILzq;)V
    .locals 0

    .line 85
    invoke-direct/range {p0 .. p7}, Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getClassId$p(Lorg/luckypray/dexkit/result/FieldData;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->classId:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$getTypeId$p(Lorg/luckypray/dexkit/result/FieldData;)I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->typeId:I

    .line 2
    .line 3
    return p0
.end method

.method private final getDexField()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->dexField$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/wrap/DexField;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/FieldData;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lorg/luckypray/dexkit/result/FieldData;

    .line 10
    .line 11
    iget-object p1, p1, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->annotations$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
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
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getDeclaredClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->declaredClass$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/wrap/DexField;->getFieldInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final getFieldName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getReaders()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->readers$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getType()Lorg/luckypray/dexkit/result/ClassData;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->type$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 8
    .line 9
    return-object p0
.end method

.method public final getTypeInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
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
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getTypeSign()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getWriters()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->writers$delegate:Loq0;

    .line 2
    .line 3
    invoke-interface {p0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

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

.method public final toDexField()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    .line 7
    .line 8
    const-string v2, " "

    .line 9
    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, "."

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
