.class public Lbsh/Interpreter;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Serializable;
.implements Lbsh/飘花落叶言子楪苏世哲兰;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Interpreter$Console;
    }
.end annotation


# static fields
.field public static COMPATIBIILTY:Z = false

.field public static final DEBUG:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final SYSTEM_OBJECT:Lbsh/This;

.field public static TRACE:Z = false

.field public static final VERSION:Ljava/lang/String; = "3.0.0.beta11"

.field public static final mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private EOF:Z

.field private compatibility:Z

.field console:Lbsh/飘花落叶言子世楪兰苏哲;

.field protected evalOnly:Z

.field private exitOnEOF:Z

.field globalNameSpace:Lbsh/NameSpace;

.field protected interactive:Z

.field parent:Lbsh/Interpreter;

.field transient parser:Lbsh/飘花落叶言子世兰哲楪苏;

.field private showResults:Z

.field sourceFileInfo:Ljava/lang/String;

.field private strictJava:Z

.field private yield_for:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbsh/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子世苏兰哲楪;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    new-instance v0, Lbsh/NameSpace;

    .line 14
    .line 15
    const-string v1, "bsh.system"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v2, v1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Lbsh/This;->getThis(Lbsh/NameSpace;Lbsh/Interpreter;)Lbsh/This;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lbsh/Interpreter;->SYSTEM_OBJECT:Lbsh/This;

    .line 26
    .line 27
    new-instance v0, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 28
    .line 29
    invoke-direct {v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 136
    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {p0, v1, v1, v0}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    .line 137
    iput-object v1, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbsh/Interpreter;)V
    .locals 6

    .line 144
    iget-object v1, p1, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    iget-boolean v2, p1, Lbsh/Interpreter;->interactive:Z

    iget-object v3, p1, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    iget-object v5, p1, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰苏哲;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;)V
    .locals 1

    const/4 v0, 0x0

    .line 138
    invoke-direct {p0, p1, v0, v0}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Lbsh/Interpreter;)V
    .locals 1

    const/4 v0, 0x0

    .line 140
    invoke-direct {p0, p1, p2, v0}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V
    .locals 8

    .line 141
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v0 .. v7}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    const/4 p0, 0x1

    .line 142
    iput-boolean p0, v0, Lbsh/Interpreter;->evalOnly:Z

    .line 143
    const-string p0, "bsh.evalOnly"

    sget-object p1, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    invoke-virtual {v0, p0, p1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, p1, v0, p2}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰哲苏;)V
    .locals 1

    const/4 v0, 0x0

    .line 135
    invoke-direct {p0, p1, v0, v0}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/Interpreter;)V
    .locals 1

    .line 133
    iget-object v0, p2, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-direct {p0, p1, v0, p2}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/NameSpace;)V
    .locals 1

    const/4 v0, 0x0

    .line 134
    invoke-direct {p0, p1, p2, v0}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰哲苏;Lbsh/NameSpace;Lbsh/Interpreter;)V
    .locals 6

    .line 130
    new-instance v1, Lbsh/Interpreter$Console;

    invoke-direct {v1, p1}, Lbsh/Interpreter$Console;-><init>(Lbsh/飘花落叶言子世楪兰哲苏;)V

    if-nez p3, :cond_0

    const/4 p1, 0x0

    :goto_0
    move-object v5, p1

    goto :goto_1

    .line 131
    :cond_0
    iget-object p1, p3, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    goto :goto_0

    :goto_1
    const/4 v2, 0x1

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    .line 132
    invoke-direct/range {v0 .. v5}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰苏哲;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世楪兰苏哲;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/Interpreter;->strictJava:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lbsh/Interpreter;->yield_for:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lbsh/Interpreter;->exitOnEOF:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lbsh/Interpreter;->showResults:Z

    .line 14
    .line 15
    sget-boolean v0, Lbsh/Interpreter;->COMPATIBIILTY:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lbsh/Interpreter;->compatibility:Z

    .line 18
    .line 19
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-wide/16 v1, 0x0

    .line 39
    .line 40
    :goto_0
    iput-boolean p2, p0, Lbsh/Interpreter;->interactive:Z

    .line 41
    .line 42
    iput-object p4, p0, Lbsh/Interpreter;->parent:Lbsh/Interpreter;

    .line 43
    .line 44
    if-eqz p4, :cond_1

    .line 45
    .line 46
    iget-boolean v3, p4, Lbsh/Interpreter;->strictJava:Z

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lbsh/Interpreter;->setStrictJava(Z)V

    .line 49
    .line 50
    .line 51
    iget-object v3, p4, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 52
    .line 53
    iput-object v3, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 54
    .line 55
    iget-boolean p4, p4, Lbsh/Interpreter;->evalOnly:Z

    .line 56
    .line 57
    iput-boolean p4, p0, Lbsh/Interpreter;->evalOnly:Z

    .line 58
    .line 59
    :cond_1
    iput-object p5, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    .line 60
    .line 61
    if-nez p3, :cond_2

    .line 62
    .line 63
    invoke-static {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Lbsh/Interpreter;)Lbsh/飘花落叶言子楪苏哲世兰;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    new-instance p5, Lbsh/NameSpace;

    .line 68
    .line 69
    const-string v3, "global"

    .line 70
    .line 71
    invoke-direct {p5, p3, p4, v3}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object p3, p5

    .line 75
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->setConsole(Lbsh/飘花落叶言子世楪兰苏哲;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p3}, Lbsh/Interpreter;->setNameSpace(Lbsh/NameSpace;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 105
    .line 106
    .line 107
    move-result-wide p1

    .line 108
    sub-long/2addr p1, v1

    .line 109
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string p2, " nanoseconds."

    .line 114
    .line 115
    const-string p3, "Time to initialize interpreter: interactive="

    .line 116
    .line 117
    const-string p4, " "

    .line 118
    .line 119
    filled-new-array {p3, p0, p4, p1, p2}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;Z)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 129
    invoke-direct/range {v0 .. v5}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;)V
    .locals 8

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    .line 128
    invoke-direct/range {v0 .. v7}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V
    .locals 1

    move-object v0, p1

    .line 127
    new-instance p1, Lbsh/Interpreter$Console;

    invoke-direct {p1, v0, p2, p3}, Lbsh/Interpreter$Console;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;)V

    move p2, p4

    move-object p3, p5

    move-object p4, p6

    move-object p5, p7

    invoke-direct/range {p0 .. p5}, Lbsh/Interpreter;-><init>(Lbsh/飘花落叶言子世楪兰苏哲;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method private _yield()V
    .locals 2

    .line 1
    iget p0, p0, Lbsh/Interpreter;->yield_for:I

    .line 2
    .line 3
    if-gez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    int-to-long v0, p0

    .line 7
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    :goto_0
    return-void
.end method

.method public static final varargs debug([Ljava/lang/Object;)V
    .locals 4

    .line 1
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    array-length v1, p0

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_0

    .line 23
    .line 24
    aget-object v3, p0, v2

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p0, Lbsh/Interpreter$Console;->debug:Ljava/io/PrintStream;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "// Debug: "

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method private getBshPrompt()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :try_start_0
    const-string v3, "getBshPrompt()"

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    :try_start_1
    const-string p0, "bsh % "
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object p0

    .line 46
    :goto_0
    if-eqz v2, :cond_3

    .line 47
    .line 48
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    throw p0
.end method

.method public static getSaveClasses()Z
    .locals 1

    .line 1
    invoke-static {}, Lbsh/Interpreter;->getSaveClassesDir()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lbsh/Interpreter;->getSaveClassesDir()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public static getSaveClassesDir()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "bsh.debugClasses"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private get_jjtree()Lbsh/JJTParserState;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 2
    .line 3
    iget-object p0, p0, Lbsh/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世:Lbsh/JJTParserState;

    .line 4
    .line 5
    return-object p0
.end method

.method private initRootSystemObject()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lbsh/NameSpace;

    .line 6
    .line 7
    const-string v2, "Bsh Object"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v3, v0, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "bsh"

    .line 18
    .line 19
    invoke-virtual {p0, v2, v1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lbsh/Interpreter;->SYSTEM_OBJECT:Lbsh/This;

    .line 23
    .line 24
    const-string v2, "bsh.system"

    .line 25
    .line 26
    invoke-virtual {p0, v2, v1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const-string v2, "bsh.shared"

    .line 30
    .line 31
    invoke-virtual {p0, v2, v1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lbsh/NameSpace;

    .line 35
    .line 36
    const-string v2, "Bsh Command Help Text"

    .line 37
    .line 38
    invoke-direct {v1, v3, v0, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/飘花落叶言子楪苏哲世兰;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "bsh.help"

    .line 46
    .line 47
    invoke-virtual {p0, v1, v0}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const-string v0, "user.dir"

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "bsh.cwd"

    .line 57
    .line 58
    invoke-virtual {p0, v1, v0}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-boolean v0, p0, Lbsh/Interpreter;->interactive:Z

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    sget-object v0, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    sget-object v0, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 69
    .line 70
    :goto_0
    const-string v1, "bsh.interactive"

    .line 71
    .line 72
    invoke-virtual {p0, v1, v0}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const-string v0, "bsh.evalOnly"

    .line 76
    .line 77
    sget-object v1, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    .line 78
    .line 79
    invoke-virtual {p0, v0, v1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string v0, "bsh.version"

    .line 83
    .line 84
    const-string v1, "3.0.0.beta11"

    .line 85
    .line 86
    invoke-virtual {p0, v0, v1}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static invokeMain(Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    const-class v0, [Ljava/lang/String;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const-string v2, "main"

    .line 9
    .line 10
    invoke-static {p0, v2, v0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪哲兰(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/飘花落叶言子世哲苏楪兰;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, v0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private static synthetic lambda$static$0()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "Class: "

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-lez v1, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    aget-object v3, p0, v1

    .line 9
    .line 10
    array-length v4, p0

    .line 11
    if-le v4, v2, :cond_0

    .line 12
    .line 13
    array-length v4, p0

    .line 14
    sub-int/2addr v4, v2

    .line 15
    new-array v4, v4, [Ljava/lang/String;

    .line 16
    .line 17
    array-length v5, p0

    .line 18
    sub-int/2addr v5, v2

    .line 19
    invoke-static {p0, v2, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-array v4, v1, [Ljava/lang/String;

    .line 24
    .line 25
    :goto_0
    :try_start_0
    new-instance p0, Lbsh/Interpreter;

    .line 26
    .line 27
    invoke-direct {p0}, Lbsh/Interpreter;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v1, "bsh.args"

    .line 31
    .line 32
    invoke-virtual {p0, v1, v4}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 36
    .line 37
    invoke-virtual {p0, v3, v1}, Lbsh/Interpreter;->source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of v1, p0, Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :try_start_1
    move-object v1, p0

    .line 46
    check-cast v1, Ljava/lang/Class;

    .line 47
    .line 48
    invoke-static {v1, v4}, Lbsh/Interpreter;->invokeMain(Ljava/lang/Class;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :catch_0
    move-exception v1

    .line 54
    :try_start_2
    instance-of v2, v1, Ljava/lang/reflect/InvocationTargetException;

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :cond_1
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 63
    .line 64
    new-instance v3, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p0, " main method threw exception:"

    .line 73
    .line 74
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v2, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Lbsh/TargetError; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 85
    .line 86
    .line 87
    goto/16 :goto_4

    .line 88
    .line 89
    :catch_1
    move-exception p0

    .line 90
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 91
    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v2, "I/O Error: "

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :catch_2
    move-exception p0

    .line 112
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 113
    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v2, "Evaluation Error: "

    .line 117
    .line 118
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :catch_3
    move-exception p0

    .line 134
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 135
    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v2, "Script threw exception: "

    .line 139
    .line 140
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lbsh/TargetError;->inNativeCode()Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 172
    .line 173
    invoke-virtual {p0, v0, v1}, Lbsh/TargetError;->printStackTrace(ZLjava/io/PrintStream;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :catch_4
    move-exception p0

    .line 178
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "File not found: "

    .line 183
    .line 184
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_2
    :try_start_3
    new-instance p0, Lbsh/飘花落叶言子世苏哲兰楪;

    .line 199
    .line 200
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 201
    .line 202
    invoke-direct {p0, v0}, Lbsh/飘花落叶言子世苏哲兰楪;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 203
    .line 204
    .line 205
    :try_start_4
    new-instance v0, Lbsh/飘花落叶言子世楪哲兰苏;

    .line 206
    .line 207
    invoke-direct {v0, p0}, Lbsh/飘花落叶言子世楪哲兰苏;-><init>(Lbsh/飘花落叶言子世苏哲兰楪;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 208
    .line 209
    .line 210
    :try_start_5
    new-instance v1, Lbsh/Interpreter;

    .line 211
    .line 212
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 213
    .line 214
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 215
    .line 216
    invoke-direct {v1, v0, v3, v4, v2}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Lbsh/Interpreter;->run()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 220
    .line 221
    .line 222
    :try_start_6
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 223
    .line 224
    .line 225
    :try_start_7
    invoke-virtual {p0}, Ljava/io/Reader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :catchall_0
    move-exception v0

    .line 230
    goto :goto_2

    .line 231
    :catchall_1
    move-exception v1

    .line 232
    :try_start_8
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :catchall_2
    move-exception v0

    .line 237
    :try_start_9
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    :goto_1
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 241
    :goto_2
    :try_start_a
    invoke-virtual {p0}, Ljava/io/Reader;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :catchall_3
    move-exception p0

    .line 246
    :try_start_b
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    :goto_3
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_5

    .line 250
    :catch_5
    move-exception p0

    .line 251
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 252
    .line 253
    new-instance v1, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v2, "I/O Error closing command line reader: "

    .line 256
    .line 257
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_3
    :goto_4
    return-void
.end method

.method private preprocessScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    const/16 v2, 0x29

    .line 8
    .line 9
    const/16 v3, 0x28

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/16 v8, 0x40

    .line 16
    .line 17
    invoke-virtual {v0, v8}, Ljava/lang/String;->indexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    if-gez v9, :cond_1

    .line 22
    .line 23
    :cond_0
    const/16 v16, 0x1

    .line 24
    .line 25
    goto/16 :goto_f

    .line 26
    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v9

    .line 31
    new-instance v10, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    :cond_2
    :goto_0
    if-ge v11, v9, :cond_20

    .line 38
    .line 39
    invoke-static {v11, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    if-le v12, v11, :cond_3

    .line 44
    .line 45
    invoke-virtual {v10, v0, v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :goto_1
    move v11, v12

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    if-eq v12, v8, :cond_4

    .line 55
    .line 56
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v12

    .line 60
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v11, v11, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    add-int/lit8 v13, v11, 0x1

    .line 71
    .line 72
    if-ge v13, v12, :cond_8

    .line 73
    .line 74
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 75
    .line 76
    .line 77
    move-result v14

    .line 78
    const/16 v15, 0x5f

    .line 79
    .line 80
    if-eq v14, v15, :cond_5

    .line 81
    .line 82
    invoke-static {v14}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-eqz v14, :cond_8

    .line 87
    .line 88
    :cond_5
    move v14, v13

    .line 89
    :goto_2
    if-ge v14, v12, :cond_7

    .line 90
    .line 91
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eq v5, v15, :cond_6

    .line 96
    .line 97
    invoke-static {v5}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_7

    .line 102
    .line 103
    :cond_6
    add-int/lit8 v14, v14, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_7
    invoke-virtual {v0, v13, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    sget-object v15, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 111
    .line 112
    invoke-virtual {v15, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_9

    .line 117
    .line 118
    :cond_8
    :goto_3
    const/4 v12, -0x1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ge v14, v12, :cond_a

    .line 121
    .line 122
    invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    invoke-static {v5}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_a

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_a
    move v12, v14

    .line 134
    :goto_4
    if-le v12, v11, :cond_b

    .line 135
    .line 136
    invoke-virtual {v10, v0, v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    const/16 v12, 0x9

    .line 145
    .line 146
    const/16 v14, 0x20

    .line 147
    .line 148
    if-ge v13, v5, :cond_c

    .line 149
    .line 150
    invoke-virtual {v0, v13}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    invoke-static {v15}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 155
    .line 156
    .line 157
    move-result v15

    .line 158
    if-nez v15, :cond_d

    .line 159
    .line 160
    :cond_c
    const/16 v16, 0x1

    .line 161
    .line 162
    goto :goto_6

    .line 163
    :cond_d
    move v15, v13

    .line 164
    :goto_5
    if-ge v15, v5, :cond_e

    .line 165
    .line 166
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 167
    .line 168
    .line 169
    move-result v16

    .line 170
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 171
    .line 172
    .line 173
    move-result v16

    .line 174
    if-eqz v16, :cond_e

    .line 175
    .line 176
    add-int/lit8 v15, v15, 0x1

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_e
    const/16 v16, 0x1

    .line 180
    .line 181
    invoke-virtual {v0, v13, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    const-string v6, "interface"

    .line 186
    .line 187
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_10

    .line 192
    .line 193
    :cond_f
    :goto_6
    const/4 v15, -0x1

    .line 194
    goto/16 :goto_c

    .line 195
    .line 196
    :cond_10
    if-ge v15, v5, :cond_12

    .line 197
    .line 198
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v6

    .line 202
    const/16 v7, 0x2e

    .line 203
    .line 204
    if-ne v6, v7, :cond_12

    .line 205
    .line 206
    add-int/lit8 v15, v15, 0x1

    .line 207
    .line 208
    if-ge v15, v5, :cond_f

    .line 209
    .line 210
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    invoke-static {v6}, Ljava/lang/Character;->isJavaIdentifierStart(C)Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-nez v6, :cond_11

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_11
    :goto_7
    if-ge v15, v5, :cond_10

    .line 222
    .line 223
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    invoke-static {v6}, Ljava/lang/Character;->isJavaIdentifierPart(C)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-eqz v6, :cond_10

    .line 232
    .line 233
    add-int/lit8 v15, v15, 0x1

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_12
    :goto_8
    if-ge v15, v5, :cond_14

    .line 237
    .line 238
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eq v6, v14, :cond_13

    .line 243
    .line 244
    if-eq v6, v12, :cond_13

    .line 245
    .line 246
    const/16 v7, 0xc

    .line 247
    .line 248
    if-ne v6, v7, :cond_14

    .line 249
    .line 250
    :cond_13
    add-int/lit8 v15, v15, 0x1

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_14
    if-ge v15, v5, :cond_1a

    .line 254
    .line 255
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-ne v5, v3, :cond_1a

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    const/4 v6, 0x0

    .line 266
    :goto_9
    if-ge v15, v5, :cond_18

    .line 267
    .line 268
    invoke-static {v15, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/String;)I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-le v7, v15, :cond_15

    .line 273
    .line 274
    add-int/lit8 v15, v7, -0x1

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_15
    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-ne v7, v3, :cond_16

    .line 282
    .line 283
    add-int/lit8 v6, v6, 0x1

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_16
    if-ne v7, v2, :cond_17

    .line 287
    .line 288
    add-int/lit8 v6, v6, -0x1

    .line 289
    .line 290
    if-nez v6, :cond_17

    .line 291
    .line 292
    goto :goto_b

    .line 293
    :cond_17
    :goto_a
    add-int/lit8 v15, v15, 0x1

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_18
    const/4 v15, -0x1

    .line 297
    :goto_b
    if-gez v15, :cond_19

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_19
    add-int/lit8 v15, v15, 0x1

    .line 301
    .line 302
    :cond_1a
    :goto_c
    if-le v15, v11, :cond_1f

    .line 303
    .line 304
    :goto_d
    if-ge v11, v15, :cond_1d

    .line 305
    .line 306
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eq v5, v4, :cond_1b

    .line 311
    .line 312
    if-ne v5, v1, :cond_1c

    .line 313
    .line 314
    :cond_1b
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    :cond_1c
    add-int/lit8 v11, v11, 0x1

    .line 318
    .line 319
    goto :goto_d

    .line 320
    :cond_1d
    move v11, v15

    .line 321
    :goto_e
    if-ge v11, v9, :cond_2

    .line 322
    .line 323
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-eq v5, v14, :cond_1e

    .line 328
    .line 329
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-ne v5, v12, :cond_2

    .line 334
    .line 335
    :cond_1e
    add-int/lit8 v11, v11, 0x1

    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_1f
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    move v11, v13

    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_20
    const/16 v16, 0x1

    .line 345
    .line 346
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    :goto_f
    sget-object v5, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 351
    .line 352
    if-eqz v0, :cond_3b

    .line 353
    .line 354
    const/16 v5, 0x3d

    .line 355
    .line 356
    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(I)I

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-ltz v5, :cond_3b

    .line 361
    .line 362
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-gez v5, :cond_21

    .line 367
    .line 368
    goto/16 :goto_1d

    .line 369
    .line 370
    :cond_21
    new-instance v5, Ljava/util/HashSet;

    .line 371
    .line 372
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    const/4 v7, 0x0

    .line 380
    :goto_10
    if-ge v7, v6, :cond_25

    .line 381
    .line 382
    invoke-static {v7, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-le v8, v7, :cond_22

    .line 387
    .line 388
    move v7, v8

    .line 389
    goto :goto_10

    .line 390
    :cond_22
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    if-eq v8, v3, :cond_24

    .line 395
    .line 396
    :cond_23
    add-int/lit8 v7, v7, 0x1

    .line 397
    .line 398
    goto :goto_10

    .line 399
    :cond_24
    invoke-static {v7, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    if-eqz v8, :cond_23

    .line 404
    .line 405
    iget-object v7, v8, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v7, Ljava/lang/String;

    .line 408
    .line 409
    iget-object v9, v8, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 412
    .line 413
    iget-object v9, v9, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    invoke-static {v10, v7, v9}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    iget v7, v8, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:I

    .line 427
    .line 428
    goto :goto_10

    .line 429
    :cond_25
    new-instance v6, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    add-int/lit16 v7, v7, 0x80

    .line 436
    .line 437
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 441
    .line 442
    .line 443
    move-result v7

    .line 444
    const/4 v8, 0x0

    .line 445
    const/4 v9, 0x0

    .line 446
    :goto_11
    if-ge v8, v7, :cond_3a

    .line 447
    .line 448
    invoke-static {v8, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(ILjava/lang/String;)I

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    if-le v10, v8, :cond_26

    .line 453
    .line 454
    move v8, v10

    .line 455
    goto :goto_11

    .line 456
    :cond_26
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 457
    .line 458
    .line 459
    move-result v10

    .line 460
    if-eq v10, v3, :cond_27

    .line 461
    .line 462
    add-int/lit8 v8, v8, 0x1

    .line 463
    .line 464
    goto :goto_11

    .line 465
    :cond_27
    invoke-static {v8, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 466
    .line 467
    .line 468
    move-result-object v10

    .line 469
    if-nez v10, :cond_29

    .line 470
    .line 471
    :cond_28
    :goto_12
    move/from16 v19, v7

    .line 472
    .line 473
    move/from16 v18, v8

    .line 474
    .line 475
    const/4 v11, 0x0

    .line 476
    goto/16 :goto_1b

    .line 477
    .line 478
    :cond_29
    iget-object v12, v10, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;

    .line 481
    .line 482
    iget-boolean v13, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 483
    .line 484
    if-eqz v13, :cond_28

    .line 485
    .line 486
    iget-boolean v13, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 487
    .line 488
    if-eqz v13, :cond_28

    .line 489
    .line 490
    iget-boolean v13, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 491
    .line 492
    if-nez v13, :cond_2a

    .line 493
    .line 494
    goto :goto_12

    .line 495
    :cond_2a
    iget v13, v10, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:I

    .line 496
    .line 497
    invoke-static {v0, v8, v3, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I

    .line 498
    .line 499
    .line 500
    move-result v14

    .line 501
    invoke-virtual {v0, v13, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v15

    .line 505
    add-int/lit8 v14, v14, 0x1

    .line 506
    .line 507
    invoke-static {v14, v0}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    if-gez v11, :cond_2b

    .line 512
    .line 513
    goto :goto_12

    .line 514
    :cond_2b
    invoke-virtual {v0, v14, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v14

    .line 518
    const/16 v1, 0x7d

    .line 519
    .line 520
    const/16 v4, 0x7b

    .line 521
    .line 522
    invoke-static {v0, v11, v4, v1}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;ICC)I

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    add-int/lit8 v1, v1, 0x1

    .line 527
    .line 528
    invoke-virtual {v0, v11, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v11

    .line 532
    iget-object v10, v10, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v10, Ljava/lang/String;

    .line 535
    .line 536
    new-instance v4, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 539
    .line 540
    .line 541
    move-result v17

    .line 542
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 543
    .line 544
    .line 545
    move-result v18

    .line 546
    add-int v2, v18, v17

    .line 547
    .line 548
    add-int/lit16 v2, v2, 0x80

    .line 549
    .line 550
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    iget-object v2, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 560
    .line 561
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    invoke-static {v3, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(ILjava/util/ArrayList;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    const/16 v3, 0x29

    .line 573
    .line 574
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v15}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v3, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 588
    .line 589
    .line 590
    move-result v11

    .line 591
    if-nez v11, :cond_2c

    .line 592
    .line 593
    move/from16 v19, v7

    .line 594
    .line 595
    move/from16 v18, v8

    .line 596
    .line 597
    :goto_13
    const/4 v8, 0x0

    .line 598
    goto :goto_16

    .line 599
    :cond_2c
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 600
    .line 601
    .line 602
    move-result v11

    .line 603
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 604
    .line 605
    .line 606
    move-result v18

    .line 607
    sub-int v11, v11, v18

    .line 608
    .line 609
    move/from16 v18, v8

    .line 610
    .line 611
    const/4 v8, 0x0

    .line 612
    invoke-virtual {v3, v8, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 621
    .line 622
    .line 623
    move-result v8

    .line 624
    if-eqz v8, :cond_2d

    .line 625
    .line 626
    move/from16 v19, v7

    .line 627
    .line 628
    goto :goto_13

    .line 629
    :cond_2d
    const-string v8, "\\s+"

    .line 630
    .line 631
    invoke-virtual {v3, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    move/from16 v19, v7

    .line 636
    .line 637
    const/4 v8, 0x0

    .line 638
    const/4 v11, 0x0

    .line 639
    :goto_14
    array-length v7, v3

    .line 640
    if-ge v8, v7, :cond_30

    .line 641
    .line 642
    aget-object v7, v3, v8

    .line 643
    .line 644
    move-object/from16 v20, v3

    .line 645
    .line 646
    const-string v3, "@"

    .line 647
    .line 648
    invoke-virtual {v7, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    if-eqz v3, :cond_2e

    .line 653
    .line 654
    goto :goto_15

    .line 655
    :cond_2e
    sget-object v3, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

    .line 656
    .line 657
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    if-eqz v3, :cond_2f

    .line 662
    .line 663
    goto :goto_15

    .line 664
    :cond_2f
    move-object v11, v7

    .line 665
    :goto_15
    add-int/lit8 v8, v8, 0x1

    .line 666
    .line 667
    move-object/from16 v3, v20

    .line 668
    .line 669
    goto :goto_14

    .line 670
    :cond_30
    if-nez v11, :cond_31

    .line 671
    .line 672
    goto :goto_13

    .line 673
    :cond_31
    const-string v3, "void"

    .line 674
    .line 675
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    xor-int/lit8 v8, v3, 0x1

    .line 680
    .line 681
    :goto_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    add-int/lit8 v3, v3, -0x1

    .line 686
    .line 687
    :goto_17
    iget v7, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:I

    .line 688
    .line 689
    if-lt v3, v7, :cond_38

    .line 690
    .line 691
    invoke-static {v3, v10, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v7

    .line 695
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    if-eqz v11, :cond_32

    .line 700
    .line 701
    move-object/from16 v20, v2

    .line 702
    .line 703
    move/from16 v21, v3

    .line 704
    .line 705
    move/from16 p1, v8

    .line 706
    .line 707
    goto/16 :goto_1a

    .line 708
    .line 709
    :cond_32
    const/16 v11, 0xa

    .line 710
    .line 711
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    const/16 v11, 0x28

    .line 718
    .line 719
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-static {v3, v2}, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(ILjava/util/ArrayList;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v11

    .line 726
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    const/16 v11, 0x29

    .line 730
    .line 731
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    const/16 v11, 0x7b

    .line 738
    .line 739
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    if-eqz v8, :cond_33

    .line 743
    .line 744
    const-string v11, "return "

    .line 745
    .line 746
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    :cond_33
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 750
    .line 751
    .line 752
    const/16 v11, 0x28

    .line 753
    .line 754
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    new-instance v11, Ljava/lang/StringBuilder;

    .line 758
    .line 759
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 760
    .line 761
    .line 762
    move-object/from16 v20, v2

    .line 763
    .line 764
    move/from16 p1, v8

    .line 765
    .line 766
    const/4 v2, 0x0

    .line 767
    :goto_18
    const-string v8, ", "

    .line 768
    .line 769
    if-ge v2, v3, :cond_35

    .line 770
    .line 771
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 772
    .line 773
    .line 774
    move-result v21

    .line 775
    if-lez v21, :cond_34

    .line 776
    .line 777
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    :cond_34
    iget-object v8, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 781
    .line 782
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v8

    .line 786
    check-cast v8, Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    add-int/lit8 v2, v2, 0x1

    .line 792
    .line 793
    goto :goto_18

    .line 794
    :cond_35
    move v2, v3

    .line 795
    move/from16 v21, v2

    .line 796
    .line 797
    :goto_19
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    .line 798
    .line 799
    .line 800
    move-result v3

    .line 801
    if-ge v2, v3, :cond_37

    .line 802
    .line 803
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    if-lez v3, :cond_36

    .line 808
    .line 809
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    :cond_36
    iget-object v3, v12, L飘花落叶言楪子世苏兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 813
    .line 814
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    check-cast v3, Ljava/lang/String;

    .line 819
    .line 820
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    add-int/lit8 v2, v2, 0x1

    .line 824
    .line 825
    goto :goto_19

    .line 826
    :cond_37
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    .line 833
    const-string v2, ");}"

    .line 834
    .line 835
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    :goto_1a
    add-int/lit8 v3, v21, -0x1

    .line 842
    .line 843
    move/from16 v8, p1

    .line 844
    .line 845
    move-object/from16 v2, v20

    .line 846
    .line 847
    goto/16 :goto_17

    .line 848
    .line 849
    :cond_38
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    new-instance v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;

    .line 854
    .line 855
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 856
    .line 857
    .line 858
    iput v13, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 859
    .line 860
    iput v1, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 861
    .line 862
    iput-object v2, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 863
    .line 864
    :goto_1b
    if-eqz v11, :cond_39

    .line 865
    .line 866
    iget v1, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 867
    .line 868
    invoke-virtual {v6, v0, v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    iget-object v1, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v1, Ljava/lang/String;

    .line 874
    .line 875
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    iget v9, v11, Landroidx/compose/animation/core/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 879
    .line 880
    move v8, v9

    .line 881
    :goto_1c
    move/from16 v7, v19

    .line 882
    .line 883
    const/16 v1, 0xd

    .line 884
    .line 885
    const/16 v2, 0x29

    .line 886
    .line 887
    const/16 v3, 0x28

    .line 888
    .line 889
    const/16 v4, 0xa

    .line 890
    .line 891
    goto/16 :goto_11

    .line 892
    .line 893
    :cond_39
    add-int/lit8 v8, v18, 0x1

    .line 894
    .line 895
    goto :goto_1c

    .line 896
    :cond_3a
    move v1, v7

    .line 897
    invoke-virtual {v6, v0, v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    :cond_3b
    :goto_1d
    if-eqz v0, :cond_52

    .line 905
    .line 906
    const/16 v1, 0x24

    .line 907
    .line 908
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    if-ltz v1, :cond_52

    .line 913
    .line 914
    const/16 v1, 0x22

    .line 915
    .line 916
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 917
    .line 918
    .line 919
    move-result v2

    .line 920
    if-gez v2, :cond_3c

    .line 921
    .line 922
    goto/16 :goto_2a

    .line 923
    .line 924
    :cond_3c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    new-instance v3, Ljava/lang/StringBuilder;

    .line 929
    .line 930
    add-int/lit8 v4, v2, 0x20

    .line 931
    .line 932
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 933
    .line 934
    .line 935
    const/4 v8, 0x0

    .line 936
    :goto_1e
    if-ge v8, v2, :cond_51

    .line 937
    .line 938
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-ne v4, v1, :cond_45

    .line 943
    .line 944
    invoke-static {v8, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;)Z

    .line 945
    .line 946
    .line 947
    move-result v4

    .line 948
    if-eqz v4, :cond_40

    .line 949
    .line 950
    add-int/lit8 v4, v8, 0x3

    .line 951
    .line 952
    move v5, v4

    .line 953
    :goto_1f
    add-int/lit8 v6, v5, 0x2

    .line 954
    .line 955
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 956
    .line 957
    .line 958
    move-result v7

    .line 959
    if-ge v6, v7, :cond_3e

    .line 960
    .line 961
    invoke-static {v5, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;)Z

    .line 962
    .line 963
    .line 964
    move-result v6

    .line 965
    if-eqz v6, :cond_3d

    .line 966
    .line 967
    goto :goto_20

    .line 968
    :cond_3d
    add-int/lit8 v5, v5, 0x1

    .line 969
    .line 970
    goto :goto_1f

    .line 971
    :cond_3e
    const/4 v5, -0x1

    .line 972
    :goto_20
    if-gez v5, :cond_3f

    .line 973
    .line 974
    invoke-virtual {v3, v0, v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    goto/16 :goto_29

    .line 978
    .line 979
    :cond_3f
    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v4

    .line 983
    move/from16 v6, v16

    .line 984
    .line 985
    invoke-static {v4, v6}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;Z)Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 990
    .line 991
    .line 992
    add-int/lit8 v8, v5, 0x3

    .line 993
    .line 994
    const/16 v16, 0x1

    .line 995
    .line 996
    goto :goto_1e

    .line 997
    :cond_40
    add-int/lit8 v4, v8, 0x1

    .line 998
    .line 999
    move v5, v4

    .line 1000
    :goto_21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1001
    .line 1002
    .line 1003
    move-result v6

    .line 1004
    if-ge v5, v6, :cond_43

    .line 1005
    .line 1006
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 1007
    .line 1008
    .line 1009
    move-result v6

    .line 1010
    const/16 v7, 0x5c

    .line 1011
    .line 1012
    if-ne v6, v7, :cond_41

    .line 1013
    .line 1014
    add-int/lit8 v5, v5, 0x1

    .line 1015
    .line 1016
    const/16 v16, 0x1

    .line 1017
    .line 1018
    goto :goto_22

    .line 1019
    :cond_41
    const/16 v16, 0x1

    .line 1020
    .line 1021
    if-ne v6, v1, :cond_42

    .line 1022
    .line 1023
    goto :goto_23

    .line 1024
    :cond_42
    :goto_22
    add-int/lit8 v5, v5, 0x1

    .line 1025
    .line 1026
    goto :goto_21

    .line 1027
    :cond_43
    const/4 v5, -0x1

    .line 1028
    const/16 v16, 0x1

    .line 1029
    .line 1030
    :goto_23
    if-gez v5, :cond_44

    .line 1031
    .line 1032
    invoke-virtual {v3, v0, v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_29

    .line 1036
    .line 1037
    :cond_44
    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    const/4 v6, 0x0

    .line 1042
    invoke-static {v4, v6}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪兰哲(Ljava/lang/String;Z)Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v4

    .line 1046
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1047
    .line 1048
    .line 1049
    add-int/lit8 v8, v5, 0x1

    .line 1050
    .line 1051
    goto :goto_1e

    .line 1052
    :cond_45
    const/4 v6, 0x0

    .line 1053
    const/16 v5, 0x27

    .line 1054
    .line 1055
    if-ne v4, v5, :cond_47

    .line 1056
    .line 1057
    add-int/lit8 v4, v8, 0x1

    .line 1058
    .line 1059
    invoke-static {v4, v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)I

    .line 1060
    .line 1061
    .line 1062
    move-result v4

    .line 1063
    if-gez v4, :cond_46

    .line 1064
    .line 1065
    invoke-virtual {v3, v0, v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    goto/16 :goto_29

    .line 1069
    .line 1070
    :cond_46
    add-int/lit8 v4, v4, 0x1

    .line 1071
    .line 1072
    invoke-virtual {v3, v0, v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    :goto_24
    move v8, v4

    .line 1076
    goto/16 :goto_1e

    .line 1077
    .line 1078
    :cond_47
    const/16 v5, 0x2f

    .line 1079
    .line 1080
    if-ne v4, v5, :cond_4f

    .line 1081
    .line 1082
    add-int/lit8 v7, v8, 0x1

    .line 1083
    .line 1084
    if-ge v7, v2, :cond_4f

    .line 1085
    .line 1086
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 1087
    .line 1088
    .line 1089
    move-result v7

    .line 1090
    if-ne v7, v5, :cond_4b

    .line 1091
    .line 1092
    add-int/lit8 v4, v8, 0x2

    .line 1093
    .line 1094
    :goto_25
    if-ge v4, v2, :cond_49

    .line 1095
    .line 1096
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 1097
    .line 1098
    .line 1099
    move-result v5

    .line 1100
    const/16 v11, 0xa

    .line 1101
    .line 1102
    const/16 v9, 0xd

    .line 1103
    .line 1104
    if-eq v5, v11, :cond_4a

    .line 1105
    .line 1106
    if-ne v5, v9, :cond_48

    .line 1107
    .line 1108
    goto :goto_26

    .line 1109
    :cond_48
    add-int/lit8 v4, v4, 0x1

    .line 1110
    .line 1111
    goto :goto_25

    .line 1112
    :cond_49
    const/16 v9, 0xd

    .line 1113
    .line 1114
    const/16 v11, 0xa

    .line 1115
    .line 1116
    :cond_4a
    :goto_26
    invoke-virtual {v3, v0, v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    .line 1119
    goto :goto_24

    .line 1120
    :cond_4b
    const/16 v9, 0xd

    .line 1121
    .line 1122
    const/16 v11, 0xa

    .line 1123
    .line 1124
    const/16 v10, 0x2a

    .line 1125
    .line 1126
    if-ne v7, v10, :cond_50

    .line 1127
    .line 1128
    add-int/lit8 v4, v8, 0x2

    .line 1129
    .line 1130
    :goto_27
    add-int/lit8 v7, v4, 0x1

    .line 1131
    .line 1132
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1133
    .line 1134
    .line 1135
    move-result v12

    .line 1136
    if-ge v7, v12, :cond_4d

    .line 1137
    .line 1138
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 1139
    .line 1140
    .line 1141
    move-result v12

    .line 1142
    if-ne v12, v10, :cond_4c

    .line 1143
    .line 1144
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 1145
    .line 1146
    .line 1147
    move-result v12

    .line 1148
    if-ne v12, v5, :cond_4c

    .line 1149
    .line 1150
    goto :goto_28

    .line 1151
    :cond_4c
    move v4, v7

    .line 1152
    goto :goto_27

    .line 1153
    :cond_4d
    const/4 v4, -0x1

    .line 1154
    :goto_28
    if-gez v4, :cond_4e

    .line 1155
    .line 1156
    invoke-virtual {v3, v0, v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    .line 1159
    goto :goto_29

    .line 1160
    :cond_4e
    add-int/lit8 v4, v4, 0x2

    .line 1161
    .line 1162
    invoke-virtual {v3, v0, v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    goto :goto_24

    .line 1166
    :cond_4f
    const/16 v9, 0xd

    .line 1167
    .line 1168
    const/16 v11, 0xa

    .line 1169
    .line 1170
    :cond_50
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    .line 1173
    add-int/lit8 v8, v8, 0x1

    .line 1174
    .line 1175
    goto/16 :goto_1e

    .line 1176
    .line 1177
    :cond_51
    :goto_29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    :cond_52
    :goto_2a
    return-object v0
.end method

.method private readLine()Z
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/飘花落叶言子世兰哲楪苏;->飘花落叶言子世楪哲兰苏()Z

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Lbsh/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-direct {p0}, Lbsh/Interpreter;->_yield()V

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, Lbsh/Interpreter;->EOF:Z

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    throw v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->setOut(Ljava/io/PrintStream;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->setErr(Ljava/io/PrintStream;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private readSource(Ljava/io/Reader;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v0, 0x400

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v0, 0x1000

    .line 9
    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/Reader;->read([C)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, -0x1

    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {p0, v0, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-object p0

    .line 31
    :goto_1
    new-instance p1, Lbsh/EvalError;

    .line 32
    .line 33
    const-string v0, "Sourced file: "

    .line 34
    .line 35
    const-string v1, " read error: "

    .line 36
    .line 37
    invoke-static {v0, p2, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p1, p2, v0, v0, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw p1
.end method

.method public static redirectOutputToFile(Ljava/lang/String;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/PrintStream;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileOutputStream;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v2, "UTF-8"

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    invoke-direct {v0, v1, v3, v2}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/System;->setOut(Ljava/io/PrintStream;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/System;->setErr(Ljava/io/PrintStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Can\'t redirect output to file: "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static setShutdownOnExit(Z)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lbsh/Interpreter;->SYSTEM_OBJECT:Lbsh/This;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "shutdownOnExit"

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v0, v1, p0, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    move-exception p0

    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static staticInit()V
    .locals 4

    .line 1
    :try_start_0
    const-string v0, "line.separator"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/Interpreter$Console;->systemLineSeparator:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 10
    .line 11
    sput-object v0, Lbsh/Interpreter$Console;->debug:Ljava/io/PrintStream;

    .line 12
    .line 13
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    const-string v1, "debug"

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "trace"

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sput-boolean v0, Lbsh/Interpreter;->TRACE:Z

    .line 35
    .line 36
    const-string v0, "bsh.compatibility"

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sput-boolean v0, Lbsh/Interpreter;->COMPATIBIILTY:Z

    .line 43
    .line 44
    const-string v0, "outfile"

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-static {v0}, Lbsh/Interpreter;->redirectOutputToFile(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v3, "Could not init static(3):"

    .line 62
    .line 63
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "Could not init static(2):"

    .line 83
    .line 84
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catch_1
    move-exception v0

    .line 99
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v3, "Could not init static:"

    .line 104
    .line 105
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_0
    :goto_0
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰()Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {}, Lbsh/Interpreter;->lambda$static$0()Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public classLoaderChanged()V
    .locals 0

    .line 1
    sget-object p0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/WeakHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final error(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->error(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public eval(Ljava/io/Reader;)Ljava/lang/Object;
    .locals 2

    .line 475
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    iget-object v1, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "eval stream"

    :cond_0
    invoke-virtual {p0, p1, v0, v1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v1, "Sourced file: "

    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Lbsh/Interpreter;->readSource(Ljava/io/Reader;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lbsh/Interpreter;->preprocessScript(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "eval: nameSpace = "

    .line 12
    .line 13
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v2, Lbsh/Interpreter;

    .line 21
    .line 22
    new-instance v3, Ljava/io/StringReader;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lbsh/Interpreter;->getOut()Ljava/io/PrintStream;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p0}, Lbsh/Interpreter;->getErr()Ljava/io/PrintStream;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/4 v6, 0x0

    .line 40
    move-object v8, p0

    .line 41
    move-object v7, p2

    .line 42
    move-object v9, p3

    .line 43
    invoke-direct/range {v2 .. v9}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lbsh/CallStack;

    .line 47
    .line 48
    invoke-direct {p0, v7}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    const/4 p2, 0x0

    .line 53
    move p3, p2

    .line 54
    move-object p2, p1

    .line 55
    :goto_0
    if-nez p3, :cond_a

    .line 56
    .line 57
    const/4 p3, 0x1

    .line 58
    :try_start_0
    invoke-direct {v2}, Lbsh/Interpreter;->readLine()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeArity()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-lez v3, :cond_2

    .line 71
    .line 72
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lbsh/JJTParserState;->rootNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-interface {p2, v9}, Lbsh/飘花落叶言子世兰苏楪哲;->setSourceFile(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sget-boolean p1, Lbsh/Interpreter;->TRACE:Z

    .line 84
    .line 85
    if-eqz p1, :cond_0

    .line 86
    .line 87
    new-instance p1, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v3, "// "

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-interface {p2}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v8, p1}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    move-object p1, v0

    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :catch_0
    move-exception v0

    .line 117
    move-object p1, v0

    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :catch_1
    move-exception v0

    .line 121
    move-object p1, v0

    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :catch_2
    move-exception v0

    .line 125
    move-object p1, v0

    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :catch_3
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :catch_4
    move-exception v0

    .line 133
    move-object p1, v0

    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :catch_5
    move-exception v0

    .line 137
    move-object p1, v0

    .line 138
    goto/16 :goto_7

    .line 139
    .line 140
    :cond_0
    :goto_1
    invoke-interface {p2, p0, v2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0}, Lbsh/CallStack;->depth()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-gt v3, p3, :cond_1

    .line 149
    .line 150
    instance-of v3, p1, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 151
    .line 152
    if-eqz v3, :cond_2

    .line 153
    .line 154
    check-cast p1, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 155
    .line 156
    iget-object p1, p1, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/ParseException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lbsh/InterpreterError; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lbsh/TokenMgrException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p2}, Lbsh/JJTParserState;->reset()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lbsh/CallStack;->depth()I

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-le p2, p3, :cond_a

    .line 170
    .line 171
    invoke-virtual {p0}, Lbsh/CallStack;->clear()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_9

    .line 178
    .line 179
    :cond_1
    :try_start_1
    new-instance p1, Lbsh/InterpreterError;

    .line 180
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v3, "Callstack growing: "

    .line 187
    .line 188
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {p1, v0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1
    :try_end_1
    .catch Lbsh/ParseException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lbsh/InterpreterError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/TokenMgrException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 202
    :cond_2
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-virtual {v3}, Lbsh/JJTParserState;->reset()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0}, Lbsh/CallStack;->depth()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-le v3, p3, :cond_3

    .line 214
    .line 215
    invoke-virtual {p0}, Lbsh/CallStack;->clear()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 219
    .line 220
    .line 221
    :cond_3
    move p3, v0

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :goto_2
    :try_start_2
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, Ljava/lang/Boolean;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_4

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 239
    .line 240
    .line 241
    :cond_4
    new-instance v0, Lbsh/EvalError;

    .line 242
    .line 243
    new-instance v3, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, " unknown error: "

    .line 255
    .line 256
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-direct {v0, v1, p2, p0, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    throw v0

    .line 274
    :goto_3
    new-instance v0, Lbsh/EvalError;

    .line 275
    .line 276
    new-instance v3, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v1, " Token Parsing Error: "

    .line 288
    .line 289
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lbsh/TokenMgrException;->getMessage()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-direct {v0, v1, p2, p0, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :goto_4
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, Ljava/lang/Boolean;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_5

    .line 320
    .line 321
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 322
    .line 323
    .line 324
    :cond_5
    invoke-virtual {p1}, Lbsh/EvalError;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    if-nez v0, :cond_6

    .line 329
    .line 330
    invoke-virtual {p1, p2}, Lbsh/EvalError;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 331
    .line 332
    .line 333
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p2

    .line 348
    invoke-virtual {p1, p2}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    throw p1

    .line 353
    :goto_5
    invoke-virtual {p1}, Lbsh/EvalError;->getNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    if-nez v0, :cond_7

    .line 358
    .line 359
    invoke-virtual {p1, p2}, Lbsh/EvalError;->setNode(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 360
    .line 361
    .line 362
    :cond_7
    new-instance p2, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {p2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p2

    .line 377
    invoke-virtual {p1, p2}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    throw p1

    .line 382
    :goto_6
    new-instance v0, Lbsh/EvalError;

    .line 383
    .line 384
    new-instance v3, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v1, " internal Error: "

    .line 396
    .line 397
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-direct {v0, v1, p2, p0, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :goto_7
    sget-object p2, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 416
    .line 417
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_8

    .line 428
    .line 429
    invoke-virtual {p2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object p2

    .line 433
    check-cast p2, Ljava/lang/Boolean;

    .line 434
    .line 435
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 436
    .line 437
    .line 438
    move-result p2

    .line 439
    invoke-virtual {p1, p2}, Lbsh/ParseException;->getMessage(Z)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p2

    .line 443
    invoke-virtual {v8, p2}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :cond_8
    invoke-virtual {p1, v9}, Lbsh/ParseException;->setErrorSourceFile(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 450
    :goto_8
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 451
    .line 452
    .line 453
    move-result-object p2

    .line 454
    invoke-virtual {p2}, Lbsh/JJTParserState;->reset()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0}, Lbsh/CallStack;->depth()I

    .line 458
    .line 459
    .line 460
    move-result p2

    .line 461
    if-le p2, p3, :cond_9

    .line 462
    .line 463
    invoke-virtual {p0}, Lbsh/CallStack;->clear()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p0, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 467
    .line 468
    .line 469
    :cond_9
    throw p1

    .line 470
    :cond_a
    :goto_9
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    return-object p0
.end method

.method public eval(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 476
    const-string v0, "eval(String): "

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    const-string v1, "eval string"

    invoke-virtual {p0, p1, v0, v1}, Lbsh/Interpreter;->eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 480
    new-instance v0, Ljava/io/StringReader;

    .line 481
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 482
    invoke-virtual {p0, v0, p2, p3}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public eval(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 478
    const-string v0, "eval(String,String): "

    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 479
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0, p2}, Lbsh/Interpreter;->eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p0}, Lbsh/NameSpace;->get(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p0

    .line 12
    :catch_0
    move-exception p0

    .line 13
    sget-object p1, Lbsh/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 14
    .line 15
    new-instance v0, Lbsh/CallStack;

    .line 16
    .line 17
    invoke-direct {v0}, Lbsh/CallStack;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    throw p0
.end method

.method public getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lbsh/NameSpace;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getCompatibility()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/Interpreter;->compatibility:Z

    .line 2
    .line 3
    return p0
.end method

.method public getErr()Ljava/io/PrintStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0}, Lbsh/飘花落叶言子世楪兰哲苏;->getErr()Ljava/io/PrintStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getIn()Ljava/io/Reader;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0}, Lbsh/飘花落叶言子世楪兰哲苏;->getIn()Ljava/io/Reader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getInterface(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->getThis(Lbsh/Interpreter;)Lbsh/This;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Lbsh/This;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getNameSpace()Lbsh/NameSpace;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOut()Ljava/io/PrintStream;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0}, Lbsh/飘花落叶言子世楪兰哲苏;->getOut()Ljava/io/PrintStream;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getParent()Lbsh/Interpreter;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->parent:Lbsh/Interpreter;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShowResults()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/Interpreter;->showResults:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSourceFileInfo()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "<unknown source>"

    .line 7
    .line 8
    return-object p0
.end method

.method public getStrictJava()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/Interpreter;->strictJava:Z

    .line 2
    .line 3
    return p0
.end method

.method public getu(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const-string p1, "set: "

    .line 8
    .line 9
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public installModule(L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-interface {p1}, L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public varargs installModules([L飘花落叶言子兰哲苏世楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    array-length p0, p1

    .line 2
    if-gtz p0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    aget-object p0, p1, p0

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    throw p0
.end method

.method public loadRCFiles()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "user.home"

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ".bshrc"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Lbsh/Interpreter;->source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p0

    .line 36
    const-string v0, "Could not find rc file: "

    .line 37
    .line 38
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public pathToFile(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    const-string v0, "bsh.cwd"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->getu(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, v1, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    new-instance p0, Ljava/io/File;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public final print(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->print(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final println(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰哲苏;->println(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲世苏兰()V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/NameSpace;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lbsh/Name;->clearParts()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/WeakHashMap;->clear()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public run()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lbsh/Interpreter;->evalOnly:Z

    .line 2
    .line 3
    if-nez v0, :cond_17

    .line 4
    .line 5
    iget-boolean v0, p0, Lbsh/Interpreter;->interactive:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lbsh/Interpreter;->getParent()Lbsh/Interpreter;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    const-string v0, "printBanner();"

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->eval(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    const-string v0, "BeanShell 3.0.0.beta11"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    :goto_0
    new-instance v0, Lbsh/CallStack;

    .line 27
    .line 28
    iget-object v1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    iput-boolean v1, p0, Lbsh/Interpreter;->EOF:Z

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    :cond_1
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_15

    .line 42
    .line 43
    iget-boolean v3, p0, Lbsh/Interpreter;->EOF:Z

    .line 44
    .line 45
    if-nez v3, :cond_15

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    :try_start_1
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iget-object v4, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 53
    .line 54
    invoke-direct {p0}, Lbsh/Interpreter;->getBshPrompt()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v4, v5}, Lbsh/飘花落叶言子世楪兰哲苏;->prompt(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    goto/16 :goto_c

    .line 64
    .line 65
    :catch_1
    move-exception v4

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :catch_2
    move-exception v4

    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :catch_3
    move-exception v4

    .line 72
    goto/16 :goto_7

    .line 73
    .line 74
    :catch_4
    move-exception v4

    .line 75
    goto/16 :goto_9

    .line 76
    .line 77
    :catch_5
    move-exception v4

    .line 78
    goto/16 :goto_a

    .line 79
    .line 80
    :catch_6
    move-exception v4

    .line 81
    goto/16 :goto_b

    .line 82
    .line 83
    :cond_2
    :goto_2
    invoke-direct {p0}, Lbsh/Interpreter;->readLine()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    iput-boolean v4, p0, Lbsh/Interpreter;->EOF:Z

    .line 88
    .line 89
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeArity()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-lez v4, :cond_8

    .line 98
    .line 99
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Lbsh/JJTParserState;->rootNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v5, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    .line 108
    .line 109
    invoke-interface {v4, v5}, Lbsh/飘花落叶言子世兰苏楪哲;->setSourceFile(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 113
    .line 114
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    const-string v5, ">"

    .line 127
    .line 128
    invoke-interface {v4, v5}, Lbsh/飘花落叶言子世兰苏楪哲;->dump(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_3
    sget-boolean v5, Lbsh/Interpreter;->TRACE:Z

    .line 132
    .line 133
    if-eqz v5, :cond_4

    .line 134
    .line 135
    new-instance v5, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v6, "// "

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-interface {v4}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_4
    invoke-interface {v4, v0, p0}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-gt v5, v3, :cond_7

    .line 168
    .line 169
    instance-of v5, v4, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 170
    .line 171
    if-eqz v5, :cond_5

    .line 172
    .line 173
    check-cast v4, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 174
    .line 175
    iget-object v4, v4, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 176
    .line 177
    :cond_5
    iget-boolean v5, p0, Lbsh/Interpreter;->interactive:Z

    .line 178
    .line 179
    if-eqz v5, :cond_8

    .line 180
    .line 181
    sget-object v5, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 182
    .line 183
    if-eq v4, v5, :cond_6

    .line 184
    .line 185
    const-string v5, "$_"

    .line 186
    .line 187
    invoke-virtual {p0, v5, v4}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    new-instance v5, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v6, "$"

    .line 196
    .line 197
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    add-int/lit8 v2, v2, 0x1

    .line 201
    .line 202
    rem-int/lit8 v6, v2, 0xa

    .line 203
    .line 204
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {p0, v5, v4}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-boolean v5, p0, Lbsh/Interpreter;->showResults:Z

    .line 215
    .line 216
    if-eqz v5, :cond_8

    .line 217
    .line 218
    new-instance v5, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string v6, "--> $"

    .line 224
    .line 225
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    rem-int/lit8 v6, v2, 0xa

    .line 229
    .line 230
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v6, " = "

    .line 234
    .line 235
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    new-instance v6, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-static {v4}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const-string v7, " :"

    .line 248
    .line 249
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-static {v4}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_6
    iget-boolean v4, p0, Lbsh/Interpreter;->showResults:Z

    .line 275
    .line 276
    if-eqz v4, :cond_8

    .line 277
    .line 278
    const-string v4, "--> void"

    .line 279
    .line 280
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_7
    new-instance v4, Lbsh/InterpreterError;

    .line 285
    .line 286
    new-instance v5, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 289
    .line 290
    .line 291
    const-string v6, "Callstack growing: "

    .line 292
    .line 293
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-direct {v4, v5}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v4
    :try_end_1
    .catch Lbsh/ParseException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lbsh/InterpreterError; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lbsh/TokenMgrException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 307
    :cond_8
    :goto_3
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-le v4, v3, :cond_1

    .line 319
    .line 320
    :goto_4
    invoke-virtual {v0}, Lbsh/CallStack;->clear()V

    .line 321
    .line 322
    .line 323
    iget-object v3, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :goto_5
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v6, "Unknown error: "

    .line 336
    .line 337
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 351
    .line 352
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    check-cast v5, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    if-eqz v5, :cond_9

    .line 363
    .line 364
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 365
    .line 366
    .line 367
    :cond_9
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 368
    .line 369
    if-nez v4, :cond_a

    .line 370
    .line 371
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 372
    .line 373
    :cond_a
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    if-le v4, v3, :cond_1

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :goto_6
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v6, "Error parsing input: "

    .line 393
    .line 394
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    iget-object v4, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 408
    .line 409
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    invoke-virtual {v4, v5}, Lbsh/飘花落叶言子世兰哲楪苏;->飘花落叶言楪子苏哲世兰(Ljava/io/Reader;)V

    .line 414
    .line 415
    .line 416
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 417
    .line 418
    if-nez v4, :cond_b

    .line 419
    .line 420
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 421
    .line 422
    :cond_b
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    if-le v4, v3, :cond_1

    .line 434
    .line 435
    goto :goto_4

    .line 436
    :goto_7
    :try_start_4
    iget-boolean v5, p0, Lbsh/Interpreter;->interactive:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 437
    .line 438
    const-string v6, "Evaluation Error: "

    .line 439
    .line 440
    if-eqz v5, :cond_c

    .line 441
    .line 442
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_c
    new-instance v5, Ljava/lang/StringBuilder;

    .line 466
    .line 467
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v4}, Lbsh/EvalError;->getRawMessage()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    :goto_8
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 488
    .line 489
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    check-cast v5, Ljava/lang/Boolean;

    .line 494
    .line 495
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    if-eqz v5, :cond_d

    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 502
    .line 503
    .line 504
    :cond_d
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 505
    .line 506
    if-nez v4, :cond_e

    .line 507
    .line 508
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 509
    .line 510
    :cond_e
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-le v4, v3, :cond_1

    .line 522
    .line 523
    goto/16 :goto_4

    .line 524
    .line 525
    :goto_9
    :try_start_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 526
    .line 527
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 528
    .line 529
    .line 530
    const-string v6, "Target Exception: "

    .line 531
    .line 532
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v4}, Lbsh/TargetError;->getMessage()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4}, Lbsh/TargetError;->inNativeCode()Z

    .line 550
    .line 551
    .line 552
    move-result v5

    .line 553
    if-eqz v5, :cond_f

    .line 554
    .line 555
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 556
    .line 557
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    check-cast v5, Ljava/lang/Boolean;

    .line 562
    .line 563
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 564
    .line 565
    .line 566
    move-result v5

    .line 567
    invoke-virtual {p0}, Lbsh/Interpreter;->getErr()Ljava/io/PrintStream;

    .line 568
    .line 569
    .line 570
    move-result-object v6

    .line 571
    invoke-virtual {v4, v5, v6}, Lbsh/TargetError;->printStackTrace(ZLjava/io/PrintStream;)V

    .line 572
    .line 573
    .line 574
    :cond_f
    iget-boolean v5, p0, Lbsh/Interpreter;->interactive:Z

    .line 575
    .line 576
    if-nez v5, :cond_10

    .line 577
    .line 578
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z

    .line 579
    .line 580
    :cond_10
    const-string v5, "$_e"

    .line 581
    .line 582
    invoke-virtual {v4}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-virtual {p0, v5, v4}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 587
    .line 588
    .line 589
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    if-le v4, v3, :cond_1

    .line 601
    .line 602
    goto/16 :goto_4

    .line 603
    .line 604
    :goto_a
    :try_start_7
    new-instance v5, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 607
    .line 608
    .line 609
    const-string v6, "Internal Error: "

    .line 610
    .line 611
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v4

    .line 625
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 629
    .line 630
    if-nez v4, :cond_11

    .line 631
    .line 632
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 633
    .line 634
    :cond_11
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 635
    .line 636
    .line 637
    move-result-object v4

    .line 638
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    if-le v4, v3, :cond_1

    .line 646
    .line 647
    goto/16 :goto_4

    .line 648
    .line 649
    :goto_b
    :try_start_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 650
    .line 651
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 652
    .line 653
    .line 654
    const-string v6, "Parser Error: "

    .line 655
    .line 656
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    sget-object v6, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 660
    .line 661
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v7

    .line 665
    check-cast v7, Ljava/lang/Boolean;

    .line 666
    .line 667
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 668
    .line 669
    .line 670
    move-result v7

    .line 671
    invoke-virtual {v4, v7}, Lbsh/ParseException;->getMessage(Z)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v5

    .line 689
    check-cast v5, Ljava/lang/Boolean;

    .line 690
    .line 691
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-eqz v5, :cond_12

    .line 696
    .line 697
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 698
    .line 699
    .line 700
    :cond_12
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 701
    .line 702
    if-nez v4, :cond_13

    .line 703
    .line 704
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z

    .line 705
    .line 706
    :cond_13
    iget-object v4, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 707
    .line 708
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    invoke-virtual {v4, v5}, Lbsh/飘花落叶言子世兰哲楪苏;->飘花落叶言楪子苏世兰哲(Ljava/io/Reader;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 713
    .line 714
    .line 715
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 716
    .line 717
    .line 718
    move-result-object v4

    .line 719
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 723
    .line 724
    .line 725
    move-result v4

    .line 726
    if-le v4, v3, :cond_1

    .line 727
    .line 728
    goto/16 :goto_4

    .line 729
    .line 730
    :goto_c
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-virtual {v2}, Lbsh/JJTParserState;->reset()V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 738
    .line 739
    .line 740
    move-result v2

    .line 741
    if-le v2, v3, :cond_14

    .line 742
    .line 743
    invoke-virtual {v0}, Lbsh/CallStack;->clear()V

    .line 744
    .line 745
    .line 746
    iget-object p0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 747
    .line 748
    invoke-virtual {v0, p0}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 749
    .line 750
    .line 751
    :cond_14
    throw v1

    .line 752
    :cond_15
    iget-boolean v0, p0, Lbsh/Interpreter;->interactive:Z

    .line 753
    .line 754
    if-eqz v0, :cond_16

    .line 755
    .line 756
    iget-boolean p0, p0, Lbsh/Interpreter;->exitOnEOF:Z

    .line 757
    .line 758
    if-eqz p0, :cond_16

    .line 759
    .line 760
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 761
    .line 762
    .line 763
    :cond_16
    return-void

    .line 764
    :cond_17
    const-string p0, "bsh Interpreter: No stream"

    .line 765
    .line 766
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    return-void
.end method

.method public set(Ljava/lang/String;D)V
    .locals 1

    .line 44
    new-instance v0, Lbsh/Primitive;

    invoke-direct {v0, p2, p3}, Lbsh/Primitive;-><init>(D)V

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public set(Ljava/lang/String;F)V
    .locals 1

    .line 45
    new-instance v0, Lbsh/Primitive;

    invoke-direct {v0, p2}, Lbsh/Primitive;-><init>(F)V

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public set(Ljava/lang/String;I)V
    .locals 1

    .line 43
    new-instance v0, Lbsh/Primitive;

    invoke-direct {v0, p2}, Lbsh/Primitive;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public set(Ljava/lang/String;J)V
    .locals 1

    .line 42
    new-instance v0, Lbsh/Primitive;

    invoke-direct {v0, p2, p3}, Lbsh/Primitive;-><init>(J)V

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    .line 1
    new-instance v0, Lbsh/CallStack;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {p1}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    iget-object v2, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v2, p1}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, v0, p0}, Lbsh/Name;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0, p2, v3}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v2, p1, p2, v3}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V
    :try_end_1
    .catch Lbsh/UtilEvalError; {:try_start_1 .. :try_end_1} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_0
    sget-object p1, Lbsh/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 36
    .line 37
    invoke-virtual {p0, p1, v0}, Lbsh/UtilEvalError;->toEvalError(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    throw p0
.end method

.method public set(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 46
    sget-object p2, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    goto :goto_0

    :cond_0
    sget-object p2, Lbsh/Primitive;->FALSE:Lbsh/Primitive;

    :goto_0
    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public setClassLoader(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iput-object p1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setCompatibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/Interpreter;->compatibility:Z

    .line 2
    .line 3
    return-void
.end method

.method public setConsole(Lbsh/飘花落叶言子世楪兰哲苏;)V
    .locals 1

    .line 48
    new-instance v0, Lbsh/Interpreter$Console;

    invoke-direct {v0, p1}, Lbsh/Interpreter$Console;-><init>(Lbsh/飘花落叶言子世楪兰哲苏;)V

    invoke-virtual {p0, v0}, Lbsh/Interpreter;->setConsole(Lbsh/飘花落叶言子世楪兰苏哲;)V

    return-void
.end method

.method public setConsole(Lbsh/飘花落叶言子世楪兰苏哲;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    iget-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lbsh/JJTParserState;->nodeArity()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Lbsh/Interpreter;->parent:Lbsh/Interpreter;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-boolean p1, p1, Lbsh/Interpreter;->interactive:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 27
    .line 28
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, p0}, Lbsh/飘花落叶言子世兰哲楪苏;->飘花落叶言子世哲苏楪兰(Ljava/io/Reader;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    :goto_0
    new-instance p1, Lbsh/飘花落叶言子世兰哲楪苏;

    .line 37
    .line 38
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Lbsh/飘花落叶言子世兰哲楪苏;-><init>(Ljava/io/Reader;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/飘花落叶言子世兰哲楪苏;

    .line 46
    .line 47
    return-void
.end method

.method public setErr(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰苏哲;->setErr(Ljava/io/PrintStream;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setExitOnEOF(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/Interpreter;->exitOnEOF:Z

    .line 2
    .line 3
    return-void
.end method

.method public setIn(Ljava/io/Reader;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰苏哲;->setIn(Ljava/io/Reader;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNameSpace(Lbsh/NameSpace;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v0, "bsh"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of p1, p1, Lbsh/This;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lbsh/Interpreter;->initRootSystemObject()V

    .line 16
    .line 17
    .line 18
    iget-boolean p1, p0, Lbsh/Interpreter;->interactive:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Interpreter;->loadRCFiles()V
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public setOut(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/Interpreter;->console:Lbsh/飘花落叶言子世楪兰苏哲;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lbsh/飘花落叶言子世楪兰苏哲;->setOut(Ljava/io/PrintStream;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowResults(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/Interpreter;->showResults:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStrictJava(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/Interpreter;->strictJava:Z

    .line 2
    .line 3
    return-void
.end method

.method public setYieldDelay(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbsh/Interpreter;->yield_for:I

    .line 2
    .line 3
    return-void
.end method

.method public setu(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p0

    .line 6
    const-string p1, "set: "

    .line 7
    .line 8
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showEvalString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x50

    .line 6
    .line 7
    if-le p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {p2, p0, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p2, " . . . "

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    const-string p0, " of: ``"

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    const/16 v0, 0x20

    .line 29
    .line 30
    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 p2, 0xd

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "\'\'"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public source(Ljava/io/File;)Ljava/lang/Object;
    .locals 1

    .line 73
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;
    .locals 3

    .line 64
    const-string v0, "Sourcing file: "

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 65
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Lbsh/飘花落叶言子世苏哲兰楪;

    .line 66
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Lbsh/飘花落叶言子世苏哲兰楪;-><init>(Ljava/io/InputStream;)V

    .line 67
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 68
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 70
    throw p0
.end method

.method public source(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 74
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;
    .locals 0

    .line 71
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->pathToFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public source(Ljava/net/URL;)Ljava/lang/Object;
    .locals 1

    .line 72
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/net/URL;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public source(Ljava/net/URL;Lbsh/NameSpace;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-string v0, "Sourcing file: "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lbsh/飘花落叶言子世苏哲兰楪;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子世苏哲兰楪;-><init>(Ljava/io/InputStream;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, v1, p2, p1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :try_start_2
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p0

    .line 46
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_2
    move-exception p1

    .line 51
    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 55
    :goto_1
    :try_start_5
    invoke-virtual {v0}, Ljava/io/Reader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_3
    move-exception p1

    .line 60
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    throw p0
.end method

.method public terminatedScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string p0, ";"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public unset(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "Can\'t unset, not a variable: "

    .line 2
    .line 3
    new-instance v1, Lbsh/CallStack;

    .line 4
    .line 5
    invoke-direct {v1}, Lbsh/CallStack;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v2, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Lbsh/NameSpace;->getNameResolver(Ljava/lang/String;)Lbsh/Name;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, v1, p0}, Lbsh/Name;->toLHS(Lbsh/CallStack;Lbsh/Interpreter;)Lbsh/LHS;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget v1, p0, Lbsh/LHS;->type:I

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 23
    .line 24
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->unsetVariable(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p0, Lbsh/EvalError;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lbsh/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 47
    .line 48
    new-instance v1, Lbsh/CallStack;

    .line 49
    .line 50
    invoke-direct {v1}, Lbsh/CallStack;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0, p1, v0, v1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 54
    .line 55
    .line 56
    throw p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance p1, Lbsh/EvalError;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, Lbsh/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 65
    .line 66
    new-instance v2, Lbsh/CallStack;

    .line 67
    .line 68
    invoke-direct {v2}, Lbsh/CallStack;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, v0, v1, v2, p0}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
