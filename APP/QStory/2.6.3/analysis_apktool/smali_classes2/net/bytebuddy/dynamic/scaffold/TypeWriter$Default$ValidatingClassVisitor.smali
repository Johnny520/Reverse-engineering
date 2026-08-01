.class public Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ValidatingClassVisitor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingMethodVisitor;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingFieldVisitor;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;
    }
.end annotation


# static fields
.field private static final IGNORE_FIELD:Lnet/bytebuddy/jar/asm/FieldVisitor; = null
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor; = null
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final NO_PARAMETERS:Ljava/lang/String; = "()"

.field private static final RETURNS_VOID:Ljava/lang/String; = "V"

.field private static final STRING_DESCRIPTOR:Ljava/lang/String; = "Ljava/lang/String;"


# instance fields
.field private constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;
    .annotation runtime Lnet/bytebuddy/utility/nullability/UnknownNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static of(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    return-object p0
.end method


# virtual methods
.method public visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 5
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/ClassFileVersion;->ofMinorMajor(I)Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClassFileVersion;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    const-string v2, "module-info"

    .line 19
    .line 20
    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForModuleType;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForModuleType;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    const-string v2, "/package-info"

    .line 33
    .line 34
    invoke-virtual {p3, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForPackageType;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    and-int/lit16 v2, p2, 0x2000

    .line 47
    .line 48
    if-eqz v2, :cond_4

    .line 49
    .line 50
    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V5:Lnet/bytebuddy/ClassFileVersion;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V8:Lnet/bytebuddy/ClassFileVersion;

    .line 59
    .line 60
    invoke-virtual {v0, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation;->JAVA_8:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation;->CLASSIC:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForAnnotation;

    .line 70
    .line 71
    :goto_0
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const-string p0, "Cannot define an annotation type for class file version "

    .line 76
    .line 77
    invoke-static {v0, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    and-int/lit16 v2, p2, 0x200

    .line 82
    .line 83
    if-eqz v2, :cond_6

    .line 84
    .line 85
    sget-object v2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V8:Lnet/bytebuddy/ClassFileVersion;

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface;->JAVA_8:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_5
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface;->CLASSIC:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForInterface;

    .line 97
    .line 98
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    and-int/lit16 v0, p2, 0x400

    .line 103
    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass;->ABSTRACT:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass;

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass;->MANIFEST:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForClass;

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :goto_2
    const/high16 v0, 0x10000

    .line 118
    .line 119
    and-int/2addr v0, p2

    .line 120
    const/4 v2, 0x0

    .line 121
    const/4 v3, 0x1

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$ForRecord;

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move v0, v3

    .line 130
    goto :goto_3

    .line 131
    :cond_8
    move v0, v2

    .line 132
    :goto_3
    new-instance v4, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound;

    .line 133
    .line 134
    invoke-direct {v4, v1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint$Compound;-><init>(Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    iput-object v4, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 138
    .line 139
    if-eqz p6, :cond_9

    .line 140
    .line 141
    move v1, v3

    .line 142
    goto :goto_4

    .line 143
    :cond_9
    move v1, v2

    .line 144
    :goto_4
    if-eqz p4, :cond_a

    .line 145
    .line 146
    move v2, v3

    .line 147
    :cond_a
    invoke-interface {v4, p2, p5, v1, v2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertType(ILjava/lang/String;ZZ)V

    .line 148
    .line 149
    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 153
    .line 154
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertRecord()V

    .line 155
    .line 156
    .line 157
    :cond_b
    invoke-super/range {p0 .. p6}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertAnnotation()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 13
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    move-object/from16 v6, p3

    .line 2
    .line 3
    move-object/from16 v7, p5

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v7, :cond_8

    .line 8
    .line 9
    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v4, 0x46

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const-class v8, Ljava/lang/Integer;

    .line 17
    .line 18
    const/16 v9, 0x5a

    .line 19
    .line 20
    const/16 v10, 0x53

    .line 21
    .line 22
    if-eq v3, v4, :cond_3

    .line 23
    .line 24
    if-eq v3, v10, :cond_2

    .line 25
    .line 26
    if-eq v3, v9, :cond_2

    .line 27
    .line 28
    const/16 v4, 0x49

    .line 29
    .line 30
    if-eq v3, v4, :cond_2

    .line 31
    .line 32
    const/16 v4, 0x4a

    .line 33
    .line 34
    if-eq v3, v4, :cond_1

    .line 35
    .line 36
    packed-switch v3, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    const-string v3, "Ljava/lang/String;"

    .line 40
    .line 41
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    const-class v3, Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p0, "Cannot define a default value for type of field "

    .line 51
    .line 52
    invoke-static {p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :pswitch_0
    const-class v3, Ljava/lang/Double;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const-class v3, Ljava/lang/Long;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    :pswitch_1
    move-object v3, v8

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const-class v3, Ljava/lang/Float;

    .line 69
    .line 70
    :goto_0
    invoke-virtual {v3, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const-string v11, " defines an incompatible default value "

    .line 75
    .line 76
    const-string v12, "Field "

    .line 77
    .line 78
    if-eqz v4, :cond_a

    .line 79
    .line 80
    if-ne v3, v8, :cond_8

    .line 81
    .line 82
    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const/16 v4, 0x42

    .line 87
    .line 88
    if-eq v3, v4, :cond_7

    .line 89
    .line 90
    const/16 v4, 0x43

    .line 91
    .line 92
    if-eq v3, v4, :cond_6

    .line 93
    .line 94
    if-eq v3, v10, :cond_5

    .line 95
    .line 96
    if-eq v3, v9, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    move-object v3, v7

    .line 100
    check-cast v3, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-ltz v4, :cond_9

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-gt v3, v0, :cond_9

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    move-object v3, v7

    .line 116
    check-cast v3, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    const/16 v8, -0x8000

    .line 123
    .line 124
    if-lt v4, v8, :cond_9

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    const/16 v4, 0x7fff

    .line 131
    .line 132
    if-gt v3, v4, :cond_9

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_6
    move-object v3, v7

    .line 136
    check-cast v3, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-ltz v4, :cond_9

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    const v4, 0xffff

    .line 149
    .line 150
    .line 151
    if-gt v3, v4, :cond_9

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    move-object v3, v7

    .line 155
    check-cast v3, Ljava/lang/Integer;

    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    const/16 v8, -0x80

    .line 162
    .line 163
    if-lt v4, v8, :cond_9

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    const/16 v4, 0x7f

    .line 170
    .line 171
    if-gt v3, v4, :cond_9

    .line 172
    .line 173
    :cond_8
    :goto_1
    move v3, v0

    .line 174
    goto :goto_2

    .line 175
    :cond_9
    invoke-static {v12, p2, v11, v7}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object v5

    .line 179
    :cond_a
    new-instance p0, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p0, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    const-string v0, ")"

    .line 202
    .line 203
    const-string v1, " ("

    .line 204
    .line 205
    invoke-static {p0, v1, p1, v0}, Landroidx/fragment/app/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-object v5

    .line 209
    :goto_2
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 210
    .line 211
    and-int/lit8 v4, p1, 0x1

    .line 212
    .line 213
    if-eqz v4, :cond_b

    .line 214
    .line 215
    move v4, v2

    .line 216
    move v2, v3

    .line 217
    goto :goto_3

    .line 218
    :cond_b
    move v4, v2

    .line 219
    :goto_3
    and-int/lit8 v5, p1, 0x8

    .line 220
    .line 221
    if-eqz v5, :cond_c

    .line 222
    .line 223
    move v5, v3

    .line 224
    goto :goto_4

    .line 225
    :cond_c
    move v5, v3

    .line 226
    move v3, v4

    .line 227
    :goto_4
    and-int/lit8 v8, p1, 0x10

    .line 228
    .line 229
    if-eqz v8, :cond_d

    .line 230
    .line 231
    move v8, v4

    .line 232
    move v4, v5

    .line 233
    goto :goto_5

    .line 234
    :cond_d
    move v8, v4

    .line 235
    :goto_5
    if-eqz p4, :cond_e

    .line 236
    .line 237
    :goto_6
    move-object v1, p2

    .line 238
    goto :goto_7

    .line 239
    :cond_e
    move v5, v8

    .line 240
    goto :goto_6

    .line 241
    :goto_7
    invoke-interface/range {v0 .. v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertField(Ljava/lang/String;ZZZZ)V

    .line 242
    .line 243
    .line 244
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-nez p1, :cond_f

    .line 249
    .line 250
    sget-object p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->IGNORE_FIELD:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 251
    .line 252
    return-object p0

    .line 253
    :cond_f
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingFieldVisitor;

    .line 254
    .line 255
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingFieldVisitor;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;Lnet/bytebuddy/jar/asm/FieldVisitor;)V

    .line 256
    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 10
    .param p4    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # [Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    and-int/lit16 v1, p1, 0x400

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v1, v2

    .line 13
    :goto_0
    and-int/lit8 v4, p1, 0x1

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    move v4, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v4, v3

    .line 20
    move v3, v1

    .line 21
    :goto_1
    and-int/lit8 v5, p1, 0x2

    .line 22
    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    move v5, v4

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v5, v4

    .line 28
    move v4, v1

    .line 29
    :goto_2
    and-int/lit8 v6, p1, 0x8

    .line 30
    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    move v6, v5

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    move v6, v5

    .line 36
    move v5, v1

    .line 37
    :goto_3
    const-string v7, "<init>"

    .line 38
    .line 39
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_4

    .line 44
    .line 45
    const-string v8, "<clinit>"

    .line 46
    .line 47
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-nez v8, :cond_4

    .line 52
    .line 53
    and-int/lit8 v8, p1, 0xa

    .line 54
    .line 55
    if-nez v8, :cond_4

    .line 56
    .line 57
    move v8, v6

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move v8, v6

    .line 60
    move v6, v1

    .line 61
    :goto_4
    invoke-virtual {p2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v9, "()"

    .line 66
    .line 67
    invoke-virtual {p3, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_6

    .line 72
    .line 73
    const-string v9, "V"

    .line 74
    .line 75
    invoke-virtual {p3, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_5

    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_5
    move v9, v8

    .line 83
    move v8, v1

    .line 84
    goto :goto_6

    .line 85
    :cond_6
    :goto_5
    move v9, v8

    .line 86
    :goto_6
    if-eqz p4, :cond_7

    .line 87
    .line 88
    :goto_7
    move-object v1, p2

    .line 89
    goto :goto_8

    .line 90
    :cond_7
    move v9, v1

    .line 91
    goto :goto_7

    .line 92
    :goto_8
    invoke-interface/range {v0 .. v9}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertMethod(Ljava/lang/String;ZZZZZZZZ)V

    .line 93
    .line 94
    .line 95
    move-object p2, v1

    .line 96
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-nez p1, :cond_8

    .line 101
    .line 102
    sget-object p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->IGNORE_METHOD:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_8
    new-instance p3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingMethodVisitor;

    .line 106
    .line 107
    invoke-direct {p3, p0, p1, p2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$ValidatingMethodVisitor;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object p3
.end method

.method public visitNestHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertNestMate()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public visitNestMember(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertNestMate()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public visitPermittedSubclass(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertPermittedSubclass()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 1
    .param p2    # Lnet/bytebuddy/jar/asm/TypePath;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->constraint:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor$Constraint;->assertTypeAnnotation()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
