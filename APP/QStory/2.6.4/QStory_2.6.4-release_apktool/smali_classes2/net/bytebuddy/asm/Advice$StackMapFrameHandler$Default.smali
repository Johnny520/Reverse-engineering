.class public abstract Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$StackMapFrameHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$WithPreservedArguments;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Trivial;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;,
        Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;
    }
.end annotation


# static fields
.field protected static final EMPTY:[Ljava/lang/Object;


# instance fields
.field protected currentFrameDivergence:I

.field protected final expandFrames:Z

.field protected final initialTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field protected final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field protected final latentTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final postMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final preMethodTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sput-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->initialTypes:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->latentTypes:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->preMethodTypes:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->postMethodTypes:Ljava/util/List;

    .line 15
    .line 16
    iput-boolean p7, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 17
    .line 18
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLnet/bytebuddy/ClassFileVersion;II)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;ZZ",
            "Lnet/bytebuddy/ClassFileVersion;",
            "II)",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForInstrumentedMethod;"
        }
    .end annotation

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 6
    .line 7
    move-object/from16 v1, p8

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lnet/bytebuddy/ClassFileVersion;->isLessThan(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    const/4 v1, 0x1

    .line 19
    if-nez p6, :cond_2

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    new-instance p2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Trivial;

    .line 28
    .line 29
    and-int/lit8 v2, p10, 0x8

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    move v0, v1

    .line 34
    :cond_1
    invoke-direct {p2, p0, p1, p3, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Trivial;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Z)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_2
    if-eqz p7, :cond_4

    .line 39
    .line 40
    move v2, v1

    .line 41
    new-instance v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$WithPreservedArguments$WithArgumentCopy;

    .line 42
    .line 43
    and-int/lit8 v3, p10, 0x8

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    move v8, v2

    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    move-object/from16 v7, p5

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move v8, v0

    .line 57
    move-object v2, p0

    .line 58
    move-object v3, p1

    .line 59
    move-object v4, p2

    .line 60
    move-object v5, p3

    .line 61
    move-object v6, p4

    .line 62
    move-object/from16 v7, p5

    .line 63
    .line 64
    :goto_0
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$WithPreservedArguments$WithArgumentCopy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_4
    new-instance v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$WithPreservedArguments$WithoutArgumentCopy;

    .line 69
    .line 70
    and-int/lit8 v3, p10, 0x8

    .line 71
    .line 72
    if-eqz v3, :cond_5

    .line 73
    .line 74
    move v9, v1

    .line 75
    goto :goto_1

    .line 76
    :cond_5
    move v9, v0

    .line 77
    :goto_1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    xor-int/lit8 v10, v0, 0x1

    .line 82
    .line 83
    move-object v3, p0

    .line 84
    move-object v4, p1

    .line 85
    move-object v5, p2

    .line 86
    move-object v6, p3

    .line 87
    move-object v7, p4

    .line 88
    move-object/from16 v8, p5

    .line 89
    .line 90
    invoke-direct/range {v2 .. v10}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$WithPreservedArguments$WithoutArgumentCopy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V

    .line 91
    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_6
    :goto_2
    sget-object p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$NoOp;->INSTANCE:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$NoOp;

    .line 95
    .line 96
    return-object p0
.end method


# virtual methods
.method public bindEnter(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;

    .line 2
    .line 3
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->initialTypes:Ljava/util/List;

    .line 4
    .line 5
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->latentTypes:Ljava/util/List;

    .line 6
    .line 7
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->preMethodTypes:Ljava/util/List;

    .line 8
    .line 9
    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;->ENTER:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 12
    .line 13
    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->UNITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 20
    .line 21
    :goto_0
    move-object v2, p1

    .line 22
    move-object v7, v1

    .line 23
    move-object v1, p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sget-object v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;-><init>(Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public getReaderHint()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/16 p0, 0x8

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 12
    .line 13
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    xor-int/2addr v1, v2

    .line 19
    add-int/2addr v0, v1

    .line 20
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int v5, v1, v0

    .line 25
    .line 26
    new-array v6, v5, [Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 29
    .line 30
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    invoke-virtual {p2, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    aput-object p2, v6, v1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v2, v1

    .line 47
    :goto_0
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 48
    .line 49
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {p2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    add-int/lit8 v3, v2, 0x1

    .line 78
    .line 79
    sget-object v4, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 80
    .line 81
    invoke-virtual {v4, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    aput-object v0, v6, v2

    .line 86
    .line 87
    move v2, v3

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_2

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    check-cast p3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 104
    .line 105
    add-int/lit8 v0, v2, 0x1

    .line 106
    .line 107
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 108
    .line 109
    invoke-virtual {v3, p3}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    aput-object p3, v6, v2

    .line 114
    .line 115
    move v2, v0

    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    new-array v8, v7, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    move p3, v1

    .line 128
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result p4

    .line 132
    if-eqz p4, :cond_3

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p4

    .line 138
    check-cast p4, Lnet/bytebuddy/description/type/TypeDescription;

    .line 139
    .line 140
    add-int/lit8 v0, p3, 0x1

    .line 141
    .line 142
    sget-object v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 143
    .line 144
    invoke-virtual {v2, p4}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p4

    .line 148
    aput-object p4, v8, p3

    .line 149
    .line 150
    move p3, v0

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    iget-boolean p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 153
    .line 154
    if-eqz p2, :cond_4

    .line 155
    .line 156
    const/4 p2, -0x1

    .line 157
    move v4, p2

    .line 158
    :goto_4
    move-object v3, p1

    .line 159
    goto :goto_5

    .line 160
    :cond_4
    move v4, v1

    .line 161
    goto :goto_4

    .line 162
    :goto_5
    invoke-virtual/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iput v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 166
    .line 167
    return-void
.end method

.method public translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;ZLnet/bytebuddy/description/method/MethodDescription$TypeToken;Ljava/util/List;II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 11
    .param p8    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p10    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;",
            "Z",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;II[",
            "Ljava/lang/Object;",
            "I[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    move/from16 v1, p6

    .line 2
    .line 3
    move/from16 v2, p7

    .line 4
    .line 5
    move-object/from16 v3, p8

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x1

    .line 9
    if-eq v1, v4, :cond_5

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    if-eq v1, v5, :cond_3

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    if-eq v1, p2, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    if-eq v1, p0, :cond_4

    .line 20
    .line 21
    const/4 p0, 0x4

    .line 22
    if-ne v1, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "Unexpected frame type: "

    .line 26
    .line 27
    invoke-static {v1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    iget p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 36
    .line 37
    sub-int/2addr p2, v2

    .line 38
    iput p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 39
    .line 40
    if-ltz p2, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const-string p2, " implicit frames"

    .line 58
    .line 59
    const-string v0, " dropped "

    .line 60
    .line 61
    invoke-static {p1, v0, p0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    iget p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 66
    .line 67
    add-int/2addr p2, v2

    .line 68
    iput p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 69
    .line 70
    :cond_4
    :goto_0
    move-object v0, p1

    .line 71
    move/from16 v4, p9

    .line 72
    .line 73
    move-object/from16 v5, p10

    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_5
    invoke-virtual {p4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    xor-int/lit8 v6, p3, 0x1

    .line 86
    .line 87
    add-int/2addr v4, v6

    .line 88
    const-string v6, ": "

    .line 89
    .line 90
    if-gt v4, v2, :cond_c

    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    if-eqz p3, :cond_6

    .line 94
    .line 95
    move v7, v4

    .line 96
    goto :goto_1

    .line 97
    :cond_6
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 98
    .line 99
    iget-object v8, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 100
    .line 101
    aget-object v9, v3, v4

    .line 102
    .line 103
    invoke-virtual {p2, v7, v8, v9}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;->isPossibleThisFrameValue(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_b

    .line 108
    .line 109
    move v7, v5

    .line 110
    :goto_1
    invoke-virtual {p4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-ge v4, v8, :cond_8

    .line 119
    .line 120
    sget-object v8, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 121
    .line 122
    invoke-virtual {p4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Lnet/bytebuddy/description/type/TypeDescription;

    .line 131
    .line 132
    invoke-virtual {v8, v9}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    add-int v9, v4, v7

    .line 137
    .line 138
    aget-object v10, v3, v9

    .line 139
    .line 140
    invoke-virtual {v8, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_7

    .line 145
    .line 146
    add-int/lit8 v4, v4, 0x1

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    new-instance p1, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    aget-object p2, v3, v9

    .line 160
    .line 161
    const-string v0, " is inconsistent at "

    .line 162
    .line 163
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p0

    .line 183
    :cond_8
    xor-int/lit8 v4, p3, 0x1

    .line 184
    .line 185
    sub-int/2addr v2, v4

    .line 186
    invoke-virtual {p4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    sub-int/2addr v2, v4

    .line 195
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 196
    .line 197
    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    xor-int/2addr v4, v5

    .line 202
    add-int/2addr v2, v4

    .line 203
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 204
    .line 205
    invoke-interface {v4}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    add-int/2addr v4, v2

    .line 214
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    add-int/2addr v2, v4

    .line 219
    new-array v4, v2, [Ljava/lang/Object;

    .line 220
    .line 221
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 222
    .line 223
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 224
    .line 225
    invoke-virtual {p2, v6, v7, v3, v4}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;->copy(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-eqz v7, :cond_9

    .line 238
    .line 239
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    check-cast v7, Lnet/bytebuddy/description/type/TypeDescription;

    .line 244
    .line 245
    add-int/lit8 v8, p2, 0x1

    .line 246
    .line 247
    sget-object v9, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 248
    .line 249
    invoke-virtual {v9, v7}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    aput-object v7, v4, p2

    .line 254
    .line 255
    move p2, v8

    .line 256
    goto :goto_2

    .line 257
    :cond_9
    if-eq v2, p2, :cond_a

    .line 258
    .line 259
    invoke-virtual {p4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    xor-int/2addr v5, p3

    .line 268
    add-int/2addr v0, v5

    .line 269
    sub-int v5, v2, p2

    .line 270
    .line 271
    invoke-static {v3, v0, v4, p2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    .line 273
    .line 274
    :cond_a
    sub-int p2, v2, p2

    .line 275
    .line 276
    iput p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 277
    .line 278
    move-object v3, v4

    .line 279
    move-object v0, p1

    .line 280
    move-object/from16 v5, p10

    .line 281
    .line 282
    move/from16 v4, p9

    .line 283
    .line 284
    :goto_3
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    const-string p1, " is inconsistent for \'this\' reference: "

    .line 297
    .line 298
    aget-object p2, v3, v4

    .line 299
    .line 300
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    new-instance p1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string p2, "Inconsistent frame length for "

    .line 309
    .line 310
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw p0
.end method
