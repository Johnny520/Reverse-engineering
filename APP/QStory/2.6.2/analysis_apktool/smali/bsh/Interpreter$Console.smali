.class public Lbsh/Interpreter$Console;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lbsh/飘花落叶言子世楪兰苏哲;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/Interpreter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Console"
.end annotation


# static fields
.field public static transient debug:Ljava/io/PrintStream; = null

.field private static final serialVersionUID:J = 0x1L

.field public static systemLineSeparator:Ljava/lang/String; = "\n"


# instance fields
.field private console:Lbsh/飘花落叶言子世楪兰哲苏;

.field private transient err:Ljava/io/PrintStream;

.field private transient in:Ljava/io/Reader;

.field private transient out:Ljava/io/PrintStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    sput-object v0, Lbsh/Interpreter$Console;->debug:Ljava/io/PrintStream;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰哲苏;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 5
    .line 6
    invoke-interface {p1}, Lbsh/飘花落叶言子世楪兰哲苏;->getIn()Ljava/io/Reader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lbsh/Interpreter$Console;->in:Ljava/io/Reader;

    .line 11
    .line 12
    invoke-interface {p1}, Lbsh/飘花落叶言子世楪兰哲苏;->getOut()Ljava/io/PrintStream;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-interface {p1}, Lbsh/飘花落叶言子世楪兰哲苏;->getErr()Ljava/io/PrintStream;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 23
    .line 24
    sput-object p1, Lbsh/Interpreter$Console;->debug:Ljava/io/PrintStream;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 29
    iput-object p1, p0, Lbsh/Interpreter$Console;->in:Ljava/io/Reader;

    .line 30
    iput-object p2, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 31
    iput-object p3, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 32
    sput-object p3, Lbsh/Interpreter$Console;->debug:Ljava/io/PrintStream;

    return-void
.end method


# virtual methods
.method public error(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    const-string v1, "// Error: "

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    sget-object p1, Lbsh/Interpreter$Console;->systemLineSeparator:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v0, p0}, Lbsh/飘花落叶言子世楪兰哲苏;->error(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p0, p1}, Lbsh/Interpreter$Console;->println(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public getErr()Ljava/io/PrintStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    return-object p0
.end method

.method public getIn()Ljava/io/Reader;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter$Console;->in:Ljava/io/Reader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOut()Ljava/io/PrintStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 6
    .line 7
    iput-object v0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 8
    .line 9
    :cond_0
    iget-object p0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 10
    .line 11
    return-object p0
.end method

.method public print(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->print(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/io/PrintStream;->flush()V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public println(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->println(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    sget-object p1, Lbsh/Interpreter$Console;->systemLineSeparator:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lbsh/Interpreter$Console;->print(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public prompt(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter$Console;->console:Lbsh/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->prompt(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lbsh/Interpreter$Console;->print(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setErr(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/Interpreter$Console;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    return-void
.end method

.method public setIn(Ljava/io/Reader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/Interpreter$Console;->in:Ljava/io/Reader;

    .line 2
    .line 3
    return-void
.end method

.method public setOut(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/Interpreter$Console;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    return-void
.end method
