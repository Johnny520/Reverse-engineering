.class Lbsh/ReturnControl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;


# instance fields
.field public kind:I

.field public label:Ljava/lang/String;

.field public returnPoint:Lbsh/Node;

.field public value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Object;Lbsh/Node;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 20
    sget-object v0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 21
    iput p1, p0, Lbsh/ReturnControl;->kind:I

    .line 22
    iput-object p2, p0, Lbsh/ReturnControl;->value:Ljava/lang/Object;

    .line 23
    iput-object p3, p0, Lbsh/ReturnControl;->returnPoint:Lbsh/Node;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lbsh/Node;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/ReturnControl;->value:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Lbsh/ReturnControl;->kind:I

    .line 12
    .line 13
    iput-object p2, p0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p3, p0, Lbsh/ReturnControl;->returnPoint:Lbsh/Node;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ReturnControl: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lbsh/ReturnControl;->kind:I

    .line 9
    .line 10
    const/16 v2, 0xd

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    const-string v1, "BREAK "

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v2, 0x2f

    .line 18
    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    const-string v1, "RETURN "

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/16 v2, 0x14

    .line 25
    .line 26
    if-ne v1, v2, :cond_2

    .line 27
    .line 28
    const-string v1, "CONTINUE "

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "DUNNO?? "

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget v2, p0, Lbsh/ReturnControl;->kind:I

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lbsh/ReturnControl;->label:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ": from: "

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lbsh/ReturnControl;->returnPoint:Lbsh/Node;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
