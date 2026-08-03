.class Lbsh/BSHThrowStatement;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {v0, p1, p2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    instance-of v0, p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance p2, Lbsh/EvalException;

    .line 15
    .line 16
    const-string v0, "Expression in \'throw\' must be Throwable type"

    .line 17
    .line 18
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 19
    .line 20
    .line 21
    throw p2

    .line 22
    :cond_0
    new-instance v0, Lbsh/TargetError;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Throwable;

    .line 25
    .line 26
    invoke-direct {v0, p2, p0, p1}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/Node;Lbsh/CallStack;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
