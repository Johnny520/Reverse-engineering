.class public abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForField"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Resolved;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField$Unresolved;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final FIELD_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FIELD_READ_ONLY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FIELD_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final FIELD_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# instance fields
.field private final readOnly:Z

.field private final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$FieldValue;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "value"

    .line 12
    .line 13
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 22
    .line 23
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 28
    .line 29
    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    const-string v1, "declaringType"

    .line 32
    .line 33
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 42
    .line 43
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 48
    .line 49
    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 50
    .line 51
    const-string v1, "readOnly"

    .line 52
    .line 53
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lnet/bytebuddy/description/method/MethodList;

    .line 62
    .line 63
    invoke-interface {v1}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 68
    .line 69
    sput-object v1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_READ_ONLY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 70
    .line 71
    const-string v1, "typing"

    .line 72
    .line 73
    invoke-static {v1}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lnet/bytebuddy/description/method/MethodList;

    .line 82
    .line 83
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 88
    .line 89
    sput-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 90
    .line 91
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 5
    .line 6
    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic access$1300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_READ_ONLY:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_TYPING:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1500()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_VALUE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$1600()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->FIELD_DECLARING_TYPE:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    return-object v0
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p4, :cond_1

    .line 11
    .line 12
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-nez p4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "Cannot access non-static field "

    .line 20
    .line 21
    const-string p3, " from static method "

    .line 22
    .line 23
    invoke-static {p0, p1, p3, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p5, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->isPremature(Lnet/bytebuddy/description/method/MethodDescription;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    const-string p4, " to "

    .line 32
    .line 33
    const-string p5, "Cannot assign "

    .line 34
    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_4

    .line 42
    .line 43
    iget-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 44
    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 48
    .line 49
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 54
    .line 55
    invoke-interface {p3, p2, v1, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz p3, :cond_2

    .line 64
    .line 65
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;

    .line 66
    .line 67
    invoke-interface {p1}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription;

    .line 72
    .line 73
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 78
    .line 79
    invoke-static {p5, p0, p4, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    const-string p0, "Cannot read "

    .line 84
    .line 85
    const-string p2, " before super constructor call"

    .line 86
    .line 87
    invoke-static {p1, p0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 96
    .line 97
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 98
    .line 99
    invoke-interface {p3, p2, v1, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    iget-boolean v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->readOnly:Z

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadOnly;

    .line 114
    .line 115
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadOnly;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 116
    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_5
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 120
    .line 121
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 126
    .line 127
    invoke-interface {p3, v1, v2, v3}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-interface {p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;

    .line 138
    .line 139
    invoke-interface {p1}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription;

    .line 144
    .line 145
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 150
    .line 151
    invoke-static {p5, p0, p4, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {p2, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForField;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 164
    .line 165
    invoke-static {p2, p4, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object v0
.end method

.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;
.end method
