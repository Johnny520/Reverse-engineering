.class public Lbsh/RuntimeEvalError;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private error:Lbsh/EvalError;


# direct methods
.method public constructor <init>(Lbsh/EvalError;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 15
    iput-object p1, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 13
    new-instance v0, Lbsh/EvalError;

    invoke-direct {v0, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    iput-object v0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p4, Lbsh/EvalError;

    .line 5
    .line 6
    invoke-direct {p4, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 7
    .line 8
    .line 9
    iput-object p4, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getErrorLineNumber()I
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getErrorLineNumber()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getErrorSourceFile()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getErrorSourceFile()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getErrorText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getErrorText()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getRawMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getRawMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getScriptStackTrace()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/EvalError;->getScriptStackTrace()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public reThrow(Ljava/lang/String;)Lbsh/EvalError;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/RuntimeEvalError;->error:Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/EvalError;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
