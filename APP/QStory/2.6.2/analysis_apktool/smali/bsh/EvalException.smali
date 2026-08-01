.class public Lbsh/EvalException;
.super Lbsh/EvalError;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic reThrow(Ljava/lang/String;)Lbsh/EvalError;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lbsh/EvalException;->reThrow(Ljava/lang/String;)Lbsh/EvalException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public reThrow(Ljava/lang/String;)Lbsh/EvalException;
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lbsh/EvalError;->prependMessage(Ljava/lang/String;)V

    return-object p0
.end method
