.class public Lbsh/Variable;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;
.implements Lbsh/飘花落叶言子楪苏世哲兰;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ASSIGNMENT:I = 0x1

.field public static final DECLARATION:I


# instance fields
.field lhs:Lbsh/LHS;

.field modifiers:Lbsh/Modifiers;

.field name:Ljava/lang/String;

.field type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field typeDescriptor:Ljava/lang/String;

.field value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/LHS;",
            ")V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lbsh/Variable;->name:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lbsh/Variable;->lhs:Lbsh/LHS;

    .line 22
    iput-object p2, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Lbsh/Modifiers;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/Variable;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-direct {p0, p4}, Lbsh/Variable;->setModifiers(Lbsh/Modifiers;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p3, p1}, Lbsh/Variable;->setValue(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;Lbsh/Modifiers;)V
    .locals 1

    const/4 v0, 0x0

    .line 16
    invoke-direct {p0, p1, v0, p2, p3}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lbsh/Modifiers;)V
    .locals 1

    const/4 v0, 0x0

    .line 17
    invoke-direct {p0, p1, v0, p3, p4}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 18
    iput-object p2, p0, Lbsh/Variable;->typeDescriptor:Ljava/lang/String;

    return-void
.end method

.method private setModifiers(Lbsh/Modifiers;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public classLoaderChanged()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    iget-object v0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lbsh/NameSpace;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lbsh/Variable;->type:Ljava/lang/Class;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    :catch_0
    :cond_0
    return-void
.end method

.method public clone()Lbsh/Variable;
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lbsh/Variable;

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lbsh/Modifiers;->clone()Lbsh/Modifiers;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iput-object v0, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 31
    invoke-virtual {p0}, Lbsh/Variable;->clone()Lbsh/Variable;

    move-result-object p0

    return-object p0
.end method

.method public getModifiers()Lbsh/Modifiers;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbsh/Modifiers;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, v1}, Lbsh/Modifiers;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lbsh/Variable;->setModifiers(Lbsh/Modifiers;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lbsh/Variable;->modifiers:Lbsh/Modifiers;

    .line 15
    .line 16
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Variable;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Variable;->typeDescriptor:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-class v0, Ljava/lang/Object;

    .line 10
    .line 11
    :cond_0
    invoke-static {v0}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lbsh/Variable;->typeDescriptor:Ljava/lang/String;

    .line 16
    .line 17
    :cond_1
    iget-object p0, p0, Lbsh/Variable;->typeDescriptor:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Variable;->lhs:Lbsh/LHS;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lbsh/LHS;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object p0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, p0}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    iget-object p0, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 26
    .line 27
    return-object p0
.end method

.method public hasModifier(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/Variable;->getModifiers()Lbsh/Modifiers;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lbsh/Modifiers;->hasModifier(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public setConstant()V
    .locals 2

    .line 1
    const-string v0, "private"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "protected"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/Variable;->getModifiers()Lbsh/Modifiers;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lbsh/Modifiers;->setConstant()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, ". Only public static & final are permitted."

    .line 30
    .line 31
    const-string v1, "Illegal modifier for interface field "

    .line 32
    .line 33
    invoke-static {p0, v1, v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setValue(Ljava/lang/Object;I)V
    .locals 3

    .line 1
    const-string v0, "final"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    new-instance p1, Lbsh/UtilEvalError;

    .line 17
    .line 18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot re-assign final variable "

    .line 21
    .line 22
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lbsh/Variable;->name:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, "."

    .line 28
    .line 29
    invoke-static {p2, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {p1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    iget-object v0, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-class v2, Ljava/lang/Object;

    .line 43
    .line 44
    if-eq v0, v2, :cond_3

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    move v2, v1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const/4 v2, 0x1

    .line 53
    :goto_0
    invoke-static {p1, v0, v2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 58
    .line 59
    :cond_3
    iput-object p1, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 60
    .line 61
    if-nez p1, :cond_4

    .line 62
    .line 63
    if-eqz p2, :cond_4

    .line 64
    .line 65
    iget-object p1, p0, Lbsh/Variable;->type:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {p1}, Lbsh/Primitive;->getDefaultValue(Ljava/lang/Class;)Lbsh/Primitive;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 72
    .line 73
    :cond_4
    iget-object p1, p0, Lbsh/Variable;->lhs:Lbsh/LHS;

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    iget-object p2, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {p1, p2, v1}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 84
    .line 85
    :cond_5
    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Variable: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏(Lbsh/Variable;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", value:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", lhs = "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lbsh/Variable;->lhs:Lbsh/LHS;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public validateFinalIsSet(Z)V
    .locals 2

    .line 1
    const-string v0, "final"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lbsh/Variable;->value:Ljava/lang/Object;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-string v0, "static"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne p1, v0, :cond_2

    .line 21
    .line 22
    new-instance v0, Ljava/lang/RuntimeException;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-string p1, "Static f"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-string p1, "F"

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, "inal variable "

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lbsh/Variable;->name:Ljava/lang/String;

    .line 45
    .line 46
    const-string p1, " is not initialized."

    .line 47
    .line 48
    invoke-static {v1, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_2
    :goto_1
    return-void
.end method
