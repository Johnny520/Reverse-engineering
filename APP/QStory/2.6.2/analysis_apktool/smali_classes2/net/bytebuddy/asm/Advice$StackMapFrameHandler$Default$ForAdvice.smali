.class public Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ForAdvice"
.end annotation


# instance fields
.field protected final endTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

.field private intermediate:Z

.field private final intermediateTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final startTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

.field protected final translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

.field protected final typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
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
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediate:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 8
    .line 9
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v2, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, p0, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget v0, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediate:Z

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v2, 0x4

    .line 39
    if-ge v0, v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v8, p1

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediate:Z

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    :cond_3
    move-object v8, p1

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    new-array v5, v4, [Ljava/lang/Object;

    .line 65
    .line 66
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 83
    .line 84
    add-int/lit8 v2, v1, 0x1

    .line 85
    .line 86
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    aput-object v0, v5, v1

    .line 93
    .line 94
    move v1, v2

    .line 95
    goto :goto_1

    .line 96
    :cond_5
    sget-object v7, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 97
    .line 98
    array-length v6, v7

    .line 99
    const/4 v3, 0x1

    .line 100
    move-object v2, p1

    .line 101
    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :goto_2
    sget-object v11, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 106
    .line 107
    array-length v10, v11

    .line 108
    array-length v12, v11

    .line 109
    const/4 v9, 0x3

    .line 110
    move-object v13, v11

    .line 111
    invoke-virtual/range {v8 .. v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :goto_3
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 116
    .line 117
    iget p1, p1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 118
    .line 119
    const/4 v0, 0x3

    .line 120
    if-ge p1, v0, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_6

    .line 129
    .line 130
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 131
    .line 132
    iget v10, p1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 133
    .line 134
    sget-object v11, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 135
    .line 136
    array-length v12, v11

    .line 137
    const/4 v9, 0x2

    .line 138
    move-object v13, v11

    .line 139
    invoke-virtual/range {v8 .. v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 143
    .line 144
    iput v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 148
    .line 149
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 150
    .line 151
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 152
    .line 153
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 154
    .line 155
    invoke-static {v1, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 160
    .line 161
    invoke-virtual {p1, v8, v0, p0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public injectExceptionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 4
    .line 5
    const-class v2, Ljava/lang/Throwable;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v5, v6

    .line 16
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    const/4 v4, 0x4

    .line 25
    const/4 v7, 0x1

    .line 26
    move-object v3, p1

    .line 27
    invoke-virtual/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    move-object v3, p1

    .line 32
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 33
    .line 34
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v3, p1, p0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public injectIntermediateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    iget-boolean v3, v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 4
    .line 5
    if-eqz v3, :cond_0

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 10
    .line 11
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v2, p1, v3, v4, p2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :cond_0
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediate:Z

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-ge v2, v3, :cond_2

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 41
    .line 42
    array-length v2, v3

    .line 43
    array-length v4, v3

    .line 44
    const/4 v1, 0x3

    .line 45
    move-object v5, v3

    .line 46
    move-object v0, p1

    .line 47
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_1
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 53
    .line 54
    array-length v2, v3

    .line 55
    sget-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 56
    .line 57
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const/4 v1, 0x4

    .line 72
    const/4 v4, 0x1

    .line 73
    move-object v0, p1

    .line 74
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_1

    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 80
    .line 81
    iget v0, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 82
    .line 83
    if-nez v0, :cond_7

    .line 84
    .line 85
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v2, 0x4

    .line 92
    if-ge v0, v2, :cond_7

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-ge v0, v3, :cond_7

    .line 105
    .line 106
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    :cond_3
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 129
    .line 130
    array-length v2, v3

    .line 131
    array-length v4, v3

    .line 132
    const/4 v1, 0x3

    .line 133
    move-object v5, v3

    .line 134
    move-object v0, p1

    .line 135
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :cond_4
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 141
    .line 142
    array-length v2, v3

    .line 143
    sget-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 144
    .line 145
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const/4 v1, 0x4

    .line 160
    const/4 v4, 0x1

    .line 161
    move-object v0, p1

    .line 162
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    new-array v3, v2, [Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-eqz v1, :cond_6

    .line 185
    .line 186
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    .line 191
    .line 192
    add-int/lit8 v5, v4, 0x1

    .line 193
    .line 194
    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 195
    .line 196
    invoke-virtual {v6, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    aput-object v1, v3, v4

    .line 201
    .line 202
    move v4, v5

    .line 203
    goto :goto_0

    .line 204
    :cond_6
    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 205
    .line 206
    array-length v4, v5

    .line 207
    const/4 v1, 0x1

    .line 208
    move-object v0, p1

    .line 209
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_7
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 214
    .line 215
    iget v0, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 216
    .line 217
    const/4 v2, 0x3

    .line 218
    if-ge v0, v2, :cond_8

    .line 219
    .line 220
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 221
    .line 222
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_8

    .line 233
    .line 234
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 235
    .line 236
    iget v2, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 237
    .line 238
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 239
    .line 240
    array-length v4, v3

    .line 241
    const/4 v1, 0x2

    .line 242
    move-object v5, v3

    .line 243
    move-object v0, p1

    .line 244
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 249
    .line 250
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 251
    .line 252
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 253
    .line 254
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 255
    .line 256
    invoke-static {v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v2, p1, v3, v4, p2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 261
    .line 262
    .line 263
    :goto_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 264
    .line 265
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    .line 272
    .line 273
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    sub-int/2addr v1, v2

    .line 278
    iput v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 279
    .line 280
    const/4 v0, 0x1

    .line 281
    iput-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediate:Z

    .line 282
    .line 283
    return-void
.end method

.method public injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    .line 4
    .line 5
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 14
    .line 15
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v4, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 26
    .line 27
    array-length v3, v4

    .line 28
    array-length v5, v4

    .line 29
    const/4 v2, 0x3

    .line 30
    move-object v6, v4

    .line 31
    move-object v1, p1

    .line 32
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    move-object v1, p1

    .line 37
    sget-object v10, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    .line 38
    .line 39
    array-length v9, v10

    .line 40
    sget-object p1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 41
    .line 42
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 43
    .line 44
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    const/4 v8, 0x4

    .line 57
    const/4 v11, 0x1

    .line 58
    move-object v7, v1

    .line 59
    invoke-virtual/range {v7 .. v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    move-object v1, p1

    .line 64
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 65
    .line 66
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 67
    .line 68
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 69
    .line 70
    invoke-virtual {v4}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-interface {v4, v2}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_2

    .line 79
    .line 80
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 84
    .line 85
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    :goto_0
    invoke-virtual {v0, v1, p1, v3, p0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 11
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    .line 2
    .line 3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

    .line 4
    .line 5
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 6
    .line 7
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    move-object v1, p1

    .line 11
    move v6, p2

    .line 12
    move v7, p3

    .line 13
    move-object v8, p4

    .line 14
    move/from16 v9, p5

    .line 15
    .line 16
    move-object/from16 v10, p6

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v10}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;ZLnet/bytebuddy/description/method/MethodDescription$TypeToken;Ljava/util/List;II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
