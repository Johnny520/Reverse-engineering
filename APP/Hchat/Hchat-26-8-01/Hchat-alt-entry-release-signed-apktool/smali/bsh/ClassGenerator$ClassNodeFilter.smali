.class Lbsh/ClassGenerator$ClassNodeFilter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/BSHBlock$NodeFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/ClassGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClassNodeFilter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/ClassGenerator$ClassNodeFilter$Types;,
        Lbsh/ClassGenerator$ClassNodeFilter$Context;
    }
.end annotation


# static fields
.field public static CLASSCLASSES:Lbsh/ClassGenerator$ClassNodeFilter;

.field public static CLASSINSTANCEFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

.field public static CLASSINSTANCEMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;

.field public static CLASSSTATICFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

.field public static CLASSSTATICMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;


# instance fields
.field context:Lbsh/ClassGenerator$ClassNodeFilter$Context;

.field types:Lbsh/ClassGenerator$ClassNodeFilter$Types;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter;

    .line 2
    .line 3
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->STATIC:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 4
    .line 5
    sget-object v2, Lbsh/ClassGenerator$ClassNodeFilter$Types;->FIELDS:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lbsh/ClassGenerator$ClassNodeFilter;-><init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;Lbsh/ClassGenerator$ClassNodeFilter$Types;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSSTATICFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 11
    .line 12
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter;

    .line 13
    .line 14
    sget-object v3, Lbsh/ClassGenerator$ClassNodeFilter$Types;->METHODS:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 15
    .line 16
    invoke-direct {v0, v1, v3}, Lbsh/ClassGenerator$ClassNodeFilter;-><init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;Lbsh/ClassGenerator$ClassNodeFilter$Types;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSSTATICMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 20
    .line 21
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter;

    .line 22
    .line 23
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->INSTANCE:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lbsh/ClassGenerator$ClassNodeFilter;-><init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;Lbsh/ClassGenerator$ClassNodeFilter$Types;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSINSTANCEFIELDS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 29
    .line 30
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter;

    .line 31
    .line 32
    invoke-direct {v0, v1, v3}, Lbsh/ClassGenerator$ClassNodeFilter;-><init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;Lbsh/ClassGenerator$ClassNodeFilter$Types;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSINSTANCEMETHODS:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 36
    .line 37
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter;

    .line 38
    .line 39
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->CLASSES:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lbsh/ClassGenerator$ClassNodeFilter;-><init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter;->CLASSCLASSES:Lbsh/ClassGenerator$ClassNodeFilter;

    .line 45
    .line 46
    return-void
.end method

.method private constructor <init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Types;->ALL:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 5
    .line 6
    iput-object v0, p0, Lbsh/ClassGenerator$ClassNodeFilter;->types:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 7
    .line 8
    iput-object p1, p0, Lbsh/ClassGenerator$ClassNodeFilter;->context:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 9
    .line 10
    return-void
.end method

.method private constructor <init>(Lbsh/ClassGenerator$ClassNodeFilter$Context;Lbsh/ClassGenerator$ClassNodeFilter$Types;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Types;->ALL:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 13
    iput-object p1, p0, Lbsh/ClassGenerator$ClassNodeFilter;->context:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 14
    iput-object p2, p0, Lbsh/ClassGenerator$ClassNodeFilter;->types:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    return-void
.end method

.method private isInstanceMethod(Lbsh/Node;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lbsh/BSHMethodDeclaration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lbsh/BSHMethodDeclaration;

    .line 6
    .line 7
    iget-object p1, p1, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 8
    .line 9
    const-string v0, "static"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    xor-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private isNonStatic(Lbsh/Node;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lbsh/BSHMethodDeclaration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lbsh/ClassGenerator$ClassNodeFilter;->isStatic(Lbsh/Node;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    xor-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    return p1
.end method

.method private isStatic(Lbsh/Node;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Lbsh/Node;->jjtGetParent()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lbsh/Node;->jjtGetParent()Lbsh/Node;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v0, v0, Lbsh/BSHClassDeclaration;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p1}, Lbsh/Node;->jjtGetParent()Lbsh/Node;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Lbsh/Node;->jjtGetParent()Lbsh/Node;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lbsh/BSHClassDeclaration;

    .line 22
    .line 23
    iget-object v0, v0, Lbsh/BSHClassDeclaration;->type:Lbsh/ClassGenerator$Type;

    .line 24
    .line 25
    sget-object v1, Lbsh/ClassGenerator$Type;->INTERFACE:Lbsh/ClassGenerator$Type;

    .line 26
    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1

    .line 31
    :cond_0
    instance-of v0, p1, Lbsh/BSHTypedVariableDeclaration;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p1, Lbsh/BSHTypedVariableDeclaration;

    .line 36
    .line 37
    iget-object p1, p1, Lbsh/BSHTypedVariableDeclaration;->modifiers:Lbsh/Modifiers;

    .line 38
    .line 39
    const-string v0, "static"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_1
    instance-of v0, p1, Lbsh/BSHBlock;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    check-cast p1, Lbsh/BSHBlock;

    .line 51
    .line 52
    iget-boolean p1, p1, Lbsh/BSHBlock;->isStatic:Z

    .line 53
    .line 54
    return p1

    .line 55
    :cond_2
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method private isStaticMethod(Lbsh/Node;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lbsh/BSHMethodDeclaration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lbsh/BSHMethodDeclaration;

    .line 6
    .line 7
    iget-object p1, p1, Lbsh/BSHMethodDeclaration;->modifiers:Lbsh/Modifiers;

    .line 8
    .line 9
    const-string v0, "static"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method


# virtual methods
.method public isVisible(Lbsh/Node;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/ClassGenerator$ClassNodeFilter;->context:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 2
    .line 3
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->CLASSES:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    instance-of p1, p1, Lbsh/BSHClassDeclaration;

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    instance-of v1, p1, Lbsh/BSHClassDeclaration;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->STATIC:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 17
    .line 18
    iget-object v2, p0, Lbsh/ClassGenerator$ClassNodeFilter;->types:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 19
    .line 20
    if-ne v0, v1, :cond_3

    .line 21
    .line 22
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Types;->METHODS:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 23
    .line 24
    if-ne v2, v0, :cond_2

    .line 25
    .line 26
    invoke-direct {p0, p1}, Lbsh/ClassGenerator$ClassNodeFilter;->isStaticMethod(Lbsh/Node;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    invoke-direct {p0, p1}, Lbsh/ClassGenerator$ClassNodeFilter;->isStatic(Lbsh/Node;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_3
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Types;->METHODS:Lbsh/ClassGenerator$ClassNodeFilter$Types;

    .line 37
    .line 38
    if-ne v2, v0, :cond_4

    .line 39
    .line 40
    invoke-direct {p0, p1}, Lbsh/ClassGenerator$ClassNodeFilter;->isInstanceMethod(Lbsh/Node;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_4
    invoke-direct {p0, p1}, Lbsh/ClassGenerator$ClassNodeFilter;->isNonStatic(Lbsh/Node;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1
.end method
