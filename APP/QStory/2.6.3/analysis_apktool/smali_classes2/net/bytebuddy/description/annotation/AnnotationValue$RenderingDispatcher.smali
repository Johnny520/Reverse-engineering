.class public abstract enum Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "RenderingDispatcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field private static final ARRAY_PREFIX:Ljava/lang/String; = "Array with component tag: "

.field public static final CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field public static final enum JAVA_14_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field public static final enum JAVA_17_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field public static final enum JAVA_19_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field public static final enum JAVA_9_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

.field public static final enum LEGACY_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;


# instance fields
.field private final closingBrace:C

.field private final componentAsInteger:Z

.field private final openingBrace:C


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$1;

    .line 2
    .line 3
    const/16 v4, 0x5d

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const-string v1, "LEGACY_VM"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/16 v3, 0x5b

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$1;-><init>(Ljava/lang/String;ICCZ)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->LEGACY_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 15
    .line 16
    new-instance v1, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$2;

    .line 17
    .line 18
    const/16 v5, 0x7d

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    const-string v2, "JAVA_9_CAPABLE_VM"

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const/16 v4, 0x7b

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$2;-><init>(Ljava/lang/String;ICCZ)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->JAVA_9_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 30
    .line 31
    new-instance v2, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$3;

    .line 32
    .line 33
    const/16 v6, 0x7d

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    const-string v3, "JAVA_14_CAPABLE_VM"

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    const/16 v5, 0x7b

    .line 40
    .line 41
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$3;-><init>(Ljava/lang/String;ICCZ)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->JAVA_14_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 45
    .line 46
    new-instance v3, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$4;

    .line 47
    .line 48
    const/16 v7, 0x7d

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const-string v4, "JAVA_17_CAPABLE_VM"

    .line 52
    .line 53
    const/4 v5, 0x3

    .line 54
    const/16 v6, 0x7b

    .line 55
    .line 56
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$4;-><init>(Ljava/lang/String;ICCZ)V

    .line 57
    .line 58
    .line 59
    sput-object v3, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->JAVA_17_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 60
    .line 61
    new-instance v4, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$5;

    .line 62
    .line 63
    sget-object v10, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 64
    .line 65
    invoke-static {v10}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v11, Lnet/bytebuddy/ClassFileVersion;->JAVA_V17:Lnet/bytebuddy/ClassFileVersion;

    .line 70
    .line 71
    invoke-virtual {v5, v11}, Lnet/bytebuddy/ClassFileVersion;->isLessThan(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    const-string v5, "JAVA_19_CAPABLE_VM"

    .line 76
    .line 77
    const/4 v6, 0x4

    .line 78
    const/16 v7, 0x7b

    .line 79
    .line 80
    const/16 v8, 0x7d

    .line 81
    .line 82
    invoke-direct/range {v4 .. v9}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher$5;-><init>(Ljava/lang/String;ICCZ)V

    .line 83
    .line 84
    .line 85
    sput-object v4, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->JAVA_19_CAPABLE_VM:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 86
    .line 87
    const/4 v5, 0x5

    .line 88
    new-array v5, v5, [Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 89
    .line 90
    const/4 v6, 0x0

    .line 91
    aput-object v0, v5, v6

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    aput-object v1, v5, v6

    .line 95
    .line 96
    const/4 v6, 0x2

    .line 97
    aput-object v2, v5, v6

    .line 98
    .line 99
    const/4 v6, 0x3

    .line 100
    aput-object v3, v5, v6

    .line 101
    .line 102
    const/4 v6, 0x4

    .line 103
    aput-object v4, v5, v6

    .line 104
    .line 105
    sput-object v5, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->$VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 106
    .line 107
    invoke-static {v10}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/ClassFileVersion;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    sget-object v6, Lnet/bytebuddy/ClassFileVersion;->JAVA_V19:Lnet/bytebuddy/ClassFileVersion;

    .line 112
    .line 113
    invoke-virtual {v5, v6}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_0

    .line 118
    .line 119
    sput-object v4, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 120
    .line 121
    return-void

    .line 122
    :cond_0
    invoke-virtual {v5, v11}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_1

    .line 127
    .line 128
    sput-object v3, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 129
    .line 130
    return-void

    .line 131
    :cond_1
    sget-object v3, Lnet/bytebuddy/ClassFileVersion;->JAVA_V14:Lnet/bytebuddy/ClassFileVersion;

    .line 132
    .line 133
    invoke-virtual {v5, v3}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_2

    .line 138
    .line 139
    sput-object v2, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 140
    .line 141
    return-void

    .line 142
    :cond_2
    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V9:Lnet/bytebuddy/ClassFileVersion;

    .line 143
    .line 144
    invoke-virtual {v5, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_3

    .line 149
    .line 150
    sput-object v1, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 151
    .line 152
    return-void

    .line 153
    :cond_3
    sput-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->CURRENT:Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 154
    .line 155
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ICCZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(CCZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-char p3, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->openingBrace:C

    .line 5
    .line 6
    iput-char p4, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->closingBrace:C

    .line 7
    .line 8
    iput-boolean p5, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->componentAsInteger:Z

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ICCZLnet/bytebuddy/description/annotation/AnnotationValue$1;)V
    .locals 0

    .line 11
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;-><init>(Ljava/lang/String;ICCZ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->$VALUES:[Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toArrayErrorString(Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Array with component tag: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->componentAsInteger:Z

    .line 9
    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->isDefined()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->getTag()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-char p0, p0

    .line 24
    invoke-static {p0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$Sort;->getTag()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public toSourceString(B)Ljava/lang/String;
    .locals 0

    .line 50
    invoke-static {p1}, Ljava/lang/Byte;->toString(B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract toSourceString(C)Ljava/lang/String;
.end method

.method public abstract toSourceString(D)Ljava/lang/String;
.end method

.method public abstract toSourceString(F)Ljava/lang/String;
.end method

.method public toSourceString(I)Ljava/lang/String;
    .locals 0

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public abstract toSourceString(J)Ljava/lang/String;
.end method

.method public abstract toSourceString(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public toSourceString(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-char v1, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->openingBrace:C

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const-string v3, ", "

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-char p0, p0, Lnet/bytebuddy/description/annotation/AnnotationValue$RenderingDispatcher;->closingBrace:C

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public abstract toSourceString(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/String;
.end method

.method public toSourceString(S)Ljava/lang/String;
    .locals 0

    .line 51
    invoke-static {p1}, Ljava/lang/Short;->toString(S)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toSourceString(Z)Ljava/lang/String;
    .locals 0

    .line 49
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public toTypeErrorString(Ljava/lang/Class;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
