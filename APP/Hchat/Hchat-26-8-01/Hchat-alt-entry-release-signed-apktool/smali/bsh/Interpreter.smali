.class public Lbsh/Interpreter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/io/Serializable;
.implements Lbsh/BshClassManager$Listener;


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

.field public static final VERSION:Ljava/lang/String; = "3.0.0.beta12"

.field public static final mainSecurityGuard:Lbsh/security/MainSecurityGuard;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private EOF:Z

.field private compatibility:Z

.field console:Lbsh/ConsoleAssignable;

.field protected evalOnly:Z

.field private exitOnEOF:Z

.field globalNameSpace:Lbsh/NameSpace;

.field protected interactive:Z

.field parent:Lbsh/Interpreter;

.field transient parser:Lbsh/Parser;

.field private showResults:Z

.field sourceFileInfo:Ljava/lang/String;

.field private strictJava:Z

.field private yield_for:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbsh/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbsh/h;-><init>(I)V

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
    invoke-direct {v0, v2, v2, v1}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

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
    new-instance v0, Lbsh/security/MainSecurityGuard;

    .line 28
    .line 29
    invoke-direct {v0}, Lbsh/security/MainSecurityGuard;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

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

.method public constructor <init>(Lbsh/ConsoleAssignable;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V
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
    iget-object v3, p4, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 52
    .line 53
    iput-object v3, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

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
    invoke-static {p0}, Lbsh/BshClassManager;->createClassManager(Lbsh/Interpreter;)Lbsh/BshClassManager;

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
    invoke-direct {p5, p3, p4, v3}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object p3, p5

    .line 75
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->setConsole(Lbsh/ConsoleAssignable;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p3}, Lbsh/Interpreter;->setNameSpace(Lbsh/NameSpace;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, p0}, Lbsh/BshClassManager;->addListener(Lbsh/BshClassManager$Listener;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 105
    .line 106
    .line 107
    move-result-wide p2

    .line 108
    sub-long/2addr p2, v1

    .line 109
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    const-string p3, " nanoseconds."

    .line 114
    .line 115
    const-string p4, "Time to initialize interpreter: interactive="

    .line 116
    .line 117
    const-string p5, " "

    .line 118
    .line 119
    filled-new-array {p4, p1, p5, p2, p3}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    return-void
.end method

.method public constructor <init>(Lbsh/ConsoleInterface;)V
    .locals 1

    const/4 v0, 0x0

    .line 135
    invoke-direct {p0, p1, v0, v0}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleInterface;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/ConsoleInterface;Lbsh/Interpreter;)V
    .locals 1

    .line 133
    iget-object v0, p2, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-direct {p0, p1, v0, p2}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleInterface;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/ConsoleInterface;Lbsh/NameSpace;)V
    .locals 1

    const/4 v0, 0x0

    .line 134
    invoke-direct {p0, p1, p2, v0}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleInterface;Lbsh/NameSpace;Lbsh/Interpreter;)V

    return-void
.end method

.method public constructor <init>(Lbsh/ConsoleInterface;Lbsh/NameSpace;Lbsh/Interpreter;)V
    .locals 6

    .line 130
    new-instance v1, Lbsh/Interpreter$Console;

    invoke-direct {v1, p1}, Lbsh/Interpreter$Console;-><init>(Lbsh/ConsoleInterface;)V

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
    invoke-direct/range {v0 .. v5}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleAssignable;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lbsh/Interpreter;)V
    .locals 6

    .line 144
    iget-object v1, p1, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    iget-boolean v2, p1, Lbsh/Interpreter;->interactive:Z

    iget-object v3, p1, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    iget-object v5, p1, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleAssignable;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

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

    const/4 p1, 0x1

    .line 142
    iput-boolean p1, v0, Lbsh/Interpreter;->evalOnly:Z

    .line 143
    const-string p1, "bsh.evalOnly"

    sget-object p2, Lbsh/Primitive;->TRUE:Lbsh/Primitive;

    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, p1, v0, p2}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

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

    move-object v0, p2

    .line 127
    new-instance p2, Lbsh/Interpreter$Console;

    invoke-direct {p2, p1, v0, p3}, Lbsh/Interpreter$Console;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;)V

    move-object p1, p0

    move p3, p4

    move-object p4, p5

    move-object p5, p6

    move-object p6, p7

    invoke-direct/range {p1 .. p6}, Lbsh/Interpreter;-><init>(Lbsh/ConsoleAssignable;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    return-void
.end method

.method private _yield()V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/Interpreter;->yield_for:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    int-to-long v0, v0

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

.method public static synthetic a()Ljava/lang/Boolean;
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
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/String;
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
    return-object v3

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    :try_start_1
    const-string v0, "bsh % "
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    sget-object v2, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-object v0

    .line 46
    :goto_0
    if-eqz v2, :cond_3

    .line 47
    .line 48
    sget-object v2, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    throw v0
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
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 2
    .line 3
    iget-object v0, v0, Lbsh/Parser;->jjtree:Lbsh/JJTParserState;

    .line 4
    .line 5
    return-object v0
.end method

.method private initRootSystemObject()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

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
    invoke-direct {v1, v3, v0, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

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
    invoke-direct {v1, v3, v0, v2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

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
    const-string v1, "3.0.0.beta12"

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
    invoke-static {p0, v2, v0, v1}, Lbsh/Reflect;->resolveJavaMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/Invocable;

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
    invoke-virtual {p0, v0, p1}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

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
    new-instance p0, Lbsh/FileReader;

    .line 199
    .line 200
    sget-object v0, Ljava/lang/System;->in:Ljava/io/InputStream;

    .line 201
    .line 202
    invoke-direct {p0, v0}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 203
    .line 204
    .line 205
    :try_start_4
    new-instance v0, Lbsh/CommandLineReader;

    .line 206
    .line 207
    invoke-direct {v0, p0}, Lbsh/CommandLineReader;-><init>(Ljava/io/Reader;)V
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
    .locals 0

    .line 1
    invoke-static {p1}, Lbsh/preprocess/AnnotationIgnorePreprocess;->rewrite(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lbsh/preprocess/DefaultArgsDesugar;->rewrite(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lbsh/preprocess/KtStringTemplate;->rewrite(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lbsh/preprocess/ImplicitDefaultConstructorPreprocess;->rewrite(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method private readLine()Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbsh/Parser;->Line()Z

    .line 4
    .line 5
    .line 6
    move-result v0
    :try_end_0
    .catch Lbsh/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    invoke-direct {p0}, Lbsh/Interpreter;->_yield()V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, p0, Lbsh/Interpreter;->EOF:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

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
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x400

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0x1000

    .line 9
    .line 10
    new-array v1, v1, [C

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/Reader;->read([C)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, -0x1

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    return-object p1

    .line 31
    :goto_1
    new-instance v0, Lbsh/EvalError;

    .line 32
    .line 33
    const-string v1, "Sourced file: "

    .line 34
    .line 35
    const-string v2, " read error: "

    .line 36
    .line 37
    invoke-static {v1, p2, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {v0, p2, v1, v1, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v0
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
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v0
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

.method private stripSnapshotRuntimeState(Lbsh/Node;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    add-int/lit8 p1, p1, -0x1

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lbsh/Node;

    .line 29
    .line 30
    instance-of v1, p1, Lbsh/SimpleNode;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    check-cast p1, Lbsh/SimpleNode;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-object v1, p1, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 38
    .line 39
    iput-object v1, p1, Lbsh/SimpleNode;->lastToken:Lbsh/Token;

    .line 40
    .line 41
    iput-object v1, p1, Lbsh/SimpleNode;->parser:Lbsh/Parser;

    .line 42
    .line 43
    invoke-virtual {p1}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/Node;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    array-length v1, p1

    .line 48
    const/4 v2, 0x0

    .line 49
    :goto_0
    if-ge v2, v1, :cond_1

    .line 50
    .line 51
    aget-object v3, p1, v2

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->addClassLoader(Ljava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public classLoaderChanged()V
    .locals 1

    .line 1
    sget-object v0, Lbsh/Reflect;->instanceCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public compileSnapshot(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;
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
    new-instance v2, Lbsh/Interpreter;

    .line 12
    .line 13
    new-instance v3, Ljava/io/StringReader;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v3, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Interpreter;->getOut()Ljava/io/PrintStream;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {p0}, Lbsh/Interpreter;->getErr()Ljava/io/PrintStream;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v8, p0

    .line 32
    move-object v7, p2

    .line 33
    move-object v9, p3

    .line 34
    invoke-direct/range {v2 .. v9}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    move p3, p2

    .line 44
    :goto_0
    if-nez p3, :cond_1

    .line 45
    .line 46
    const/4 p3, 0x0

    .line 47
    :try_start_0
    invoke-direct {v2}, Lbsh/Interpreter;->readLine()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Lbsh/JJTParserState;->nodeArity()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-lez v3, :cond_0

    .line 60
    .line 61
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Lbsh/JJTParserState;->rootNode()Lbsh/Node;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v3, v9}, Lbsh/Node;->setSourceFile(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, v3}, Lbsh/Interpreter;->stripSnapshotRuntimeState(Lbsh/Node;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lbsh/ParseException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lbsh/InterpreterError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lbsh/TokenMgrException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move-object p1, v0

    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :catch_0
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    goto :goto_2

    .line 86
    :catch_1
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    goto :goto_3

    .line 89
    :catch_2
    move-exception v0

    .line 90
    move-object p1, v0

    .line 91
    goto :goto_4

    .line 92
    :catch_3
    move-exception v0

    .line 93
    move-object p1, v0

    .line 94
    goto :goto_5

    .line 95
    :cond_0
    :goto_1
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-virtual {p3}, Lbsh/JJTParserState;->reset()V

    .line 100
    .line 101
    .line 102
    move p3, v0

    .line 103
    goto :goto_0

    .line 104
    :goto_2
    :try_start_1
    new-instance p2, Lbsh/EvalError;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, " unknown error: "

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-direct {p2, v0, p3, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw p2

    .line 137
    :goto_3
    new-instance p2, Lbsh/EvalError;

    .line 138
    .line 139
    new-instance v0, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, " Token Parsing Error: "

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Lbsh/TokenMgrException;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {p2, v0, p3, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    throw p2

    .line 170
    :goto_4
    new-instance p2, Lbsh/EvalError;

    .line 171
    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v1, " internal Error: "

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p2, v0, p3, p3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw p2

    .line 203
    :goto_5
    invoke-virtual {p1, v9}, Lbsh/ParseException;->setErrorSourceFile(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    :goto_6
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {p2}, Lbsh/JJTParserState;->reset()V

    .line 212
    .line 213
    .line 214
    throw p1

    .line 215
    :cond_1
    new-instance p3, Lbsh/snapshot/BshSnapshot;

    .line 216
    .line 217
    new-array p2, p2, [Lbsh/Node;

    .line 218
    .line 219
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    check-cast p1, [Lbsh/Node;

    .line 224
    .line 225
    invoke-direct {p3, p1}, Lbsh/snapshot/BshSnapshot;-><init>([Lbsh/Node;)V

    .line 226
    .line 227
    .line 228
    return-object p3
.end method

.method public compileSnapshot(Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;
    .locals 1

    .line 230
    const-string v0, "snapshot string"

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->compileSnapshot(Ljava/lang/String;Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;

    move-result-object p1

    return-object p1
.end method

.method public compileSnapshot(Ljava/lang/String;Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;
    .locals 1

    .line 229
    new-instance v0, Ljava/io/StringReader;

    invoke-virtual {p0, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, v0, p1, p2}, Lbsh/Interpreter;->compileSnapshot(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;

    move-result-object p1

    return-object p1
.end method

.method public compileSnapshot(Ljava/lang/String;Ljava/lang/String;Ljavax/crypto/SecretKey;)V
    .locals 2

    .line 231
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Lbsh/FileReader;

    invoke-direct {v1, p1}, Lbsh/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 232
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    :try_start_1
    iget-object p2, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, v0, p2, p1}, Lbsh/Interpreter;->compileSnapshot(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Lbsh/snapshot/BshSnapshot;

    move-result-object p1

    invoke-static {p1, v1, p3}, Lbsh/snapshot/BshSnapshotHelper;->writeEncrypted(Lbsh/snapshot/BshSnapshot;Ljava/io/OutputStream;Ljavax/crypto/SecretKey;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 234
    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 235
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 236
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 237
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 238
    :goto_0
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 239
    throw p1
.end method

.method public final error(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleInterface;->error(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public eval(Ljava/io/Reader;)Ljava/lang/Object;
    .locals 2

    .line 473
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    iget-object v1, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "eval stream"

    :cond_0
    invoke-virtual {p0, p1, v0, v1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    new-instance p1, Lbsh/CallStack;

    .line 47
    .line 48
    invoke-direct {p1, v7}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 49
    .line 50
    .line 51
    const/4 p2, 0x0

    .line 52
    const/4 p3, 0x0

    .line 53
    move v0, p3

    .line 54
    move-object p3, p2

    .line 55
    :cond_0
    :goto_0
    if-nez v0, :cond_a

    .line 56
    .line 57
    const/4 v3, 0x1

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
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Lbsh/JJTParserState;->nodeArity()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-lez v4, :cond_3

    .line 71
    .line 72
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Lbsh/JJTParserState;->rootNode()Lbsh/Node;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-interface {p3, v9}, Lbsh/Node;->setSourceFile(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sget-boolean p2, Lbsh/Interpreter;->TRACE:Z

    .line 84
    .line 85
    if-eqz p2, :cond_1

    .line 86
    .line 87
    new-instance p2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v4, "// "

    .line 93
    .line 94
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-interface {p3}, Lbsh/Node;->getText()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p0, p2}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception v0

    .line 113
    move-object p2, v0

    .line 114
    goto/16 :goto_8

    .line 115
    .line 116
    :catch_0
    move-exception v0

    .line 117
    move-object p2, v0

    .line 118
    goto :goto_2

    .line 119
    :catch_1
    move-exception v0

    .line 120
    move-object p2, v0

    .line 121
    goto/16 :goto_3

    .line 122
    .line 123
    :catch_2
    move-exception v0

    .line 124
    move-object p2, v0

    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :catch_3
    move-exception v0

    .line 128
    move-object p2, v0

    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :catch_4
    move-exception v0

    .line 132
    move-object p2, v0

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :catch_5
    move-exception v0

    .line 136
    move-object p2, v0

    .line 137
    goto/16 :goto_7

    .line 138
    .line 139
    :cond_1
    :goto_1
    invoke-interface {p3, p1, v2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {p1}, Lbsh/CallStack;->depth()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-gt v4, v3, :cond_2

    .line 148
    .line 149
    instance-of v4, p2, Lbsh/ReturnControl;

    .line 150
    .line 151
    if-eqz v4, :cond_3

    .line 152
    .line 153
    check-cast p2, Lbsh/ReturnControl;

    .line 154
    .line 155
    iget-object p2, p2, Lbsh/ReturnControl;->value:Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/ParseException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Lbsh/InterpreterError; {:try_start_0 .. :try_end_0} :catch_4
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lbsh/TokenMgrException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    invoke-virtual {p3}, Lbsh/JJTParserState;->reset()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Lbsh/CallStack;->depth()I

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-le p3, v3, :cond_a

    .line 169
    .line 170
    invoke-virtual {p1}, Lbsh/CallStack;->clear()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 174
    .line 175
    .line 176
    goto/16 :goto_9

    .line 177
    .line 178
    :cond_2
    :try_start_1
    new-instance p2, Lbsh/InterpreterError;

    .line 179
    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    const-string v4, "Callstack growing: "

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-direct {p2, v0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p2
    :try_end_1
    .catch Lbsh/ParseException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lbsh/InterpreterError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/TokenMgrException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    :cond_3
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1}, Lbsh/CallStack;->depth()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    if-le v4, v3, :cond_0

    .line 213
    .line 214
    invoke-virtual {p1}, Lbsh/CallStack;->clear()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :goto_2
    :try_start_2
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_4

    .line 235
    .line 236
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 237
    .line 238
    .line 239
    :cond_4
    new-instance v0, Lbsh/EvalError;

    .line 240
    .line 241
    new-instance v4, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, " unknown error: "

    .line 253
    .line 254
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-direct {v0, v1, p3, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :goto_3
    new-instance v0, Lbsh/EvalError;

    .line 273
    .line 274
    new-instance v4, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v1, " Token Parsing Error: "

    .line 286
    .line 287
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Lbsh/TokenMgrException;->getMessage()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-direct {v0, v1, p3, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :goto_4
    sget-object v0, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_5

    .line 318
    .line 319
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 320
    .line 321
    .line 322
    :cond_5
    invoke-virtual {p2}, Lbsh/EvalError;->getNode()Lbsh/Node;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    if-nez v0, :cond_6

    .line 327
    .line 328
    invoke-virtual {p2, p3}, Lbsh/EvalError;->setNode(Lbsh/Node;)V

    .line 329
    .line 330
    .line 331
    :cond_6
    new-instance p3, Ljava/lang/StringBuilder;

    .line 332
    .line 333
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p3

    .line 346
    invoke-virtual {p2, p3}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    throw p2

    .line 351
    :goto_5
    invoke-virtual {p2}, Lbsh/EvalError;->getNode()Lbsh/Node;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-nez v0, :cond_7

    .line 356
    .line 357
    invoke-virtual {p2, p3}, Lbsh/EvalError;->setNode(Lbsh/Node;)V

    .line 358
    .line 359
    .line 360
    :cond_7
    new-instance p3, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p3

    .line 375
    invoke-virtual {p2, p3}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 376
    .line 377
    .line 378
    move-result-object p2

    .line 379
    throw p2

    .line 380
    :goto_6
    new-instance v0, Lbsh/EvalError;

    .line 381
    .line 382
    new-instance v4, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v1, " internal Error: "

    .line 394
    .line 395
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-direct {v0, v1, p3, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 410
    .line 411
    .line 412
    throw v0

    .line 413
    :goto_7
    sget-object p3, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 414
    .line 415
    invoke-virtual {p3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/lang/Boolean;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_8

    .line 426
    .line 427
    invoke-virtual {p3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object p3

    .line 431
    check-cast p3, Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 434
    .line 435
    .line 436
    move-result p3

    .line 437
    invoke-virtual {p2, p3}, Lbsh/ParseException;->getMessage(Z)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p3

    .line 441
    invoke-virtual {p0, p3}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    :cond_8
    invoke-virtual {p2, v9}, Lbsh/ParseException;->setErrorSourceFile(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 448
    :goto_8
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 449
    .line 450
    .line 451
    move-result-object p3

    .line 452
    invoke-virtual {p3}, Lbsh/JJTParserState;->reset()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {p1}, Lbsh/CallStack;->depth()I

    .line 456
    .line 457
    .line 458
    move-result p3

    .line 459
    if-le p3, v3, :cond_9

    .line 460
    .line 461
    invoke-virtual {p1}, Lbsh/CallStack;->clear()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {p1, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 465
    .line 466
    .line 467
    :cond_9
    throw p2

    .line 468
    :cond_a
    :goto_9
    invoke-static {p2}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    return-object p1
.end method

.method public eval(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 474
    const-string v0, "eval(String): "

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 475
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    const-string v1, "eval string"

    invoke-virtual {p0, p1, v0, v1}, Lbsh/Interpreter;->eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 478
    new-instance v0, Ljava/io/StringReader;

    .line 479
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 480
    invoke-virtual {p0, v0, p2, p3}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public eval(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 476
    const-string v0, "eval(String,String): "

    filled-new-array {v0, p1, p2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0, p2}, Lbsh/Interpreter;->eval(Ljava/lang/String;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evalSnapshot(Lbsh/snapshot/BshSnapshot;)Ljava/lang/Object;
    .locals 2

    .line 297
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    const-string v1, "snapshot"

    invoke-virtual {p0, p1, v0, v1}, Lbsh/Interpreter;->evalSnapshot(Lbsh/snapshot/BshSnapshot;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evalSnapshot(Lbsh/snapshot/BshSnapshot;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v1, "Snapshot: "

    .line 2
    .line 3
    new-instance v2, Lbsh/Interpreter;

    .line 4
    .line 5
    new-instance v3, Ljava/io/StringReader;

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    invoke-direct {v3, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/Interpreter;->getOut()Ljava/io/PrintStream;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {p0}, Lbsh/Interpreter;->getErr()Ljava/io/PrintStream;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v8, p0

    .line 22
    move-object v7, p2

    .line 23
    move-object v9, p3

    .line 24
    invoke-direct/range {v2 .. v9}, Lbsh/Interpreter;-><init>(Ljava/io/Reader;Ljava/io/PrintStream;Ljava/io/PrintStream;ZLbsh/NameSpace;Lbsh/Interpreter;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lbsh/CallStack;

    .line 28
    .line 29
    invoke-direct {p2, v7}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lbsh/snapshot/BshSnapshot;->getNodes()[Lbsh/Node;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    array-length p3, p1

    .line 37
    const/4 v0, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-ge v3, p3, :cond_6

    .line 40
    .line 41
    aget-object v4, p1, v3

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    :try_start_0
    invoke-interface {v4, v9}, Lbsh/Node;->setSourceFile(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v4, p2, v2}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p2}, Lbsh/CallStack;->depth()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-gt v6, v5, :cond_2

    .line 56
    .line 57
    instance-of v6, v0, Lbsh/ReturnControl;

    .line 58
    .line 59
    if-eqz v6, :cond_0

    .line 60
    .line 61
    check-cast v0, Lbsh/ReturnControl;

    .line 62
    .line 63
    iget-object v0, v0, Lbsh/ReturnControl;->value:Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/InterpreterError; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lbsh/TargetError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Lbsh/JJTParserState;->reset()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lbsh/CallStack;->depth()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-le p1, v5, :cond_6

    .line 77
    .line 78
    invoke-virtual {p2}, Lbsh/CallStack;->clear()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p1, v0

    .line 88
    goto/16 :goto_5

    .line 89
    .line 90
    :catch_0
    move-exception v0

    .line 91
    move-object p1, v0

    .line 92
    goto :goto_1

    .line 93
    :catch_1
    move-exception v0

    .line 94
    move-object p1, v0

    .line 95
    goto :goto_2

    .line 96
    :catch_2
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    goto :goto_3

    .line 99
    :catch_3
    move-exception v0

    .line 100
    move-object p1, v0

    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_0
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Lbsh/CallStack;->depth()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-le v4, v5, :cond_1

    .line 115
    .line 116
    invoke-virtual {p2}, Lbsh/CallStack;->clear()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    :try_start_1
    new-instance p1, Lbsh/InterpreterError;

    .line 126
    .line 127
    new-instance p3, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v0, "Callstack growing: "

    .line 133
    .line 134
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    invoke-direct {p1, p3}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p1
    :try_end_1
    .catch Lbsh/InterpreterError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :goto_1
    :try_start_2
    new-instance p3, Lbsh/EvalError;

    .line 149
    .line 150
    new-instance v0, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, " unknown error: "

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {p3, v0, v4, p2, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    throw p3

    .line 181
    :goto_2
    invoke-virtual {p1}, Lbsh/EvalError;->getNode()Lbsh/Node;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    if-nez p3, :cond_3

    .line 186
    .line 187
    invoke-virtual {p1, v4}, Lbsh/EvalError;->setNode(Lbsh/Node;)V

    .line 188
    .line 189
    .line 190
    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p3

    .line 205
    invoke-virtual {p1, p3}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    throw p1

    .line 210
    :goto_3
    invoke-virtual {p1}, Lbsh/EvalError;->getNode()Lbsh/Node;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    if-nez p3, :cond_4

    .line 215
    .line 216
    invoke-virtual {p1, v4}, Lbsh/EvalError;->setNode(Lbsh/Node;)V

    .line 217
    .line 218
    .line 219
    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    invoke-virtual {p1, p3}, Lbsh/EvalError;->reThrow(Ljava/lang/String;)Lbsh/EvalError;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    throw p1

    .line 239
    :goto_4
    new-instance p3, Lbsh/EvalError;

    .line 240
    .line 241
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v1, " internal Error: "

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-direct {p3, v0, v4, p2, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 272
    :goto_5
    invoke-direct {v2}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 273
    .line 274
    .line 275
    move-result-object p3

    .line 276
    invoke-virtual {p3}, Lbsh/JJTParserState;->reset()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p2}, Lbsh/CallStack;->depth()I

    .line 280
    .line 281
    .line 282
    move-result p3

    .line 283
    if-le p3, v5, :cond_5

    .line 284
    .line 285
    invoke-virtual {p2}, Lbsh/CallStack;->clear()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2, v7}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 289
    .line 290
    .line 291
    :cond_5
    throw p1

    .line 292
    :cond_6
    :goto_6
    invoke-static {v0}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    return-object p1
.end method

.method public evalSnapshot(Ljava/io/File;Ljavax/crypto/SecretKey;)Ljava/lang/Object;
    .locals 1

    .line 300
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 301
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lbsh/Interpreter;->evalSnapshot(Ljava/io/InputStream;Ljavax/crypto/SecretKey;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 303
    throw p1
.end method

.method public evalSnapshot(Ljava/io/InputStream;Ljavax/crypto/SecretKey;)Ljava/lang/Object;
    .locals 1

    .line 299
    const-string v0, "snapshot stream"

    invoke-virtual {p0, p1, p2, v0}, Lbsh/Interpreter;->evalSnapshot(Ljava/io/InputStream;Ljavax/crypto/SecretKey;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evalSnapshot(Ljava/io/InputStream;Ljavax/crypto/SecretKey;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 298
    invoke-static {p1, p2}, Lbsh/snapshot/BshSnapshotHelper;->readEncrypted(Ljava/io/InputStream;Ljavax/crypto/SecretKey;)Lbsh/snapshot/BshSnapshot;

    move-result-object p1

    iget-object p2, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, p2, p3}, Lbsh/Interpreter;->evalSnapshot(Lbsh/snapshot/BshSnapshot;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public evalSnapshot(Ljava/lang/String;Ljavax/crypto/SecretKey;)Ljava/lang/Object;
    .locals 0

    .line 304
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->pathToFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->evalSnapshot(Ljava/io/File;Ljavax/crypto/SecretKey;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p0}, Lbsh/NameSpace;->get(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    sget-object v0, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 14
    .line 15
    new-instance v1, Lbsh/CallStack;

    .line 16
    .line 17
    invoke-direct {v1}, Lbsh/CallStack;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    throw p1
.end method

.method public getClassManager()Lbsh/BshClassManager;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getNameSpace()Lbsh/NameSpace;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getCompatibility()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/Interpreter;->compatibility:Z

    .line 2
    .line 3
    return v0
.end method

.method public getErr()Ljava/io/PrintStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0}, Lbsh/ConsoleInterface;->getErr()Ljava/io/PrintStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getIn()Ljava/io/Reader;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0}, Lbsh/ConsoleInterface;->getIn()Ljava/io/Reader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lbsh/This;->getInterface(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public getNameSpace()Lbsh/NameSpace;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOut()Ljava/io/PrintStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0}, Lbsh/ConsoleInterface;->getOut()Ljava/io/PrintStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getParent()Lbsh/Interpreter;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->parent:Lbsh/Interpreter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowResults()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/Interpreter;->showResults:Z

    .line 2
    .line 3
    return v0
.end method

.method public getSourceFileInfo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "<unknown source>"

    .line 7
    .line 8
    return-object v0
.end method

.method public getStrictJava()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/Interpreter;->strictJava:Z

    .line 2
    .line 3
    return v0
.end method

.method public getu(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    const-string v0, "set: "

    .line 8
    .line 9
    invoke-static {v0, p1}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public installModule(Lbsh/module/BshModule;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lbsh/module/BshModule;->install(Lbsh/Interpreter;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public varargs installModules([Lbsh/module/BshModule;)V
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-interface {v2, p0}, Lbsh/module/BshModule;->install(Lbsh/Interpreter;)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
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
    move-exception v0

    .line 36
    const-string v1, "Could not find rc file: "

    .line 37
    .line 38
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public pathToFile(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    const-string v0, "bsh.cwd"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lbsh/Interpreter;->getu(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Ljava/io/File;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/io/File;->isAbsolute()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/io/File;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v0, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    new-instance p1, Ljava/io/File;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1
.end method

.method public final print(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleInterface;->print(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final println(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleInterface;->println(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/BshClassManager;->reset()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbsh/NameSpace;->clear()V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lbsh/Name;->clearParts()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lbsh/Reflect;->instanceCache:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Map;->clear()V

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
    const-string v0, "BeanShell 3.0.0.beta12"

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
    iget-object v4, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 53
    .line 54
    invoke-direct {p0}, Lbsh/Interpreter;->getBshPrompt()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v4, v5}, Lbsh/ConsoleInterface;->prompt(Ljava/lang/String;)V

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
    invoke-virtual {v4}, Lbsh/JJTParserState;->rootNode()Lbsh/Node;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v5, p0, Lbsh/Interpreter;->sourceFileInfo:Ljava/lang/String;

    .line 108
    .line 109
    invoke-interface {v4, v5}, Lbsh/Node;->setSourceFile(Ljava/lang/String;)V

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
    invoke-interface {v4, v5}, Lbsh/Node;->dump(Ljava/lang/String;)V

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
    invoke-interface {v4}, Lbsh/Node;->getText()Ljava/lang/String;

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
    invoke-interface {v4, v0, p0}, Lbsh/Node;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

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
    instance-of v5, v4, Lbsh/ReturnControl;

    .line 170
    .line 171
    if-eqz v5, :cond_5

    .line 172
    .line 173
    check-cast v4, Lbsh/ReturnControl;

    .line 174
    .line 175
    iget-object v4, v4, Lbsh/ReturnControl;->value:Ljava/lang/Object;

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
    invoke-static {v4}, Lbsh/StringUtil;->typeValueString(Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_6
    iget-boolean v4, p0, Lbsh/Interpreter;->showResults:Z

    .line 254
    .line 255
    if-eqz v4, :cond_8

    .line 256
    .line 257
    const-string v4, "--> void"

    .line 258
    .line 259
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->println(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_7
    new-instance v4, Lbsh/InterpreterError;

    .line 264
    .line 265
    new-instance v5, Ljava/lang/StringBuilder;

    .line 266
    .line 267
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 268
    .line 269
    .line 270
    const-string v6, "Callstack growing: "

    .line 271
    .line 272
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-direct {v4, v5}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw v4
    :try_end_1
    .catch Lbsh/ParseException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Lbsh/InterpreterError; {:try_start_1 .. :try_end_1} :catch_5
    .catch Lbsh/TargetError; {:try_start_1 .. :try_end_1} :catch_4
    .catch Lbsh/EvalError; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lbsh/TokenMgrException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    :cond_8
    :goto_3
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-le v4, v3, :cond_1

    .line 298
    .line 299
    :goto_4
    invoke-virtual {v0}, Lbsh/CallStack;->clear()V

    .line 300
    .line 301
    .line 302
    iget-object v3, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 303
    .line 304
    invoke-virtual {v0, v3}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 305
    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :goto_5
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v6, "Unknown error: "

    .line 315
    .line 316
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 330
    .line 331
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    check-cast v5, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_9

    .line 342
    .line 343
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 344
    .line 345
    .line 346
    :cond_9
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 347
    .line 348
    if-nez v4, :cond_a

    .line 349
    .line 350
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 351
    .line 352
    :cond_a
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-le v4, v3, :cond_1

    .line 364
    .line 365
    goto :goto_4

    .line 366
    :goto_6
    :try_start_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const-string v6, "Error parsing input: "

    .line 372
    .line 373
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    iget-object v4, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 387
    .line 388
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    invoke-virtual {v4, v5}, Lbsh/Parser;->reInitTokenInput(Ljava/io/Reader;)V

    .line 393
    .line 394
    .line 395
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 396
    .line 397
    if-nez v4, :cond_b

    .line 398
    .line 399
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 400
    .line 401
    :cond_b
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-le v4, v3, :cond_1

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :goto_7
    :try_start_4
    iget-boolean v5, p0, Lbsh/Interpreter;->interactive:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 416
    .line 417
    const-string v6, "Evaluation Error: "

    .line 418
    .line 419
    if-eqz v5, :cond_c

    .line 420
    .line 421
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Lbsh/EvalError;->getMessage()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_c
    new-instance v5, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v4}, Lbsh/EvalError;->getRawMessage()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    :goto_8
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 467
    .line 468
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    check-cast v5, Ljava/lang/Boolean;

    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    if-eqz v5, :cond_d

    .line 479
    .line 480
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 481
    .line 482
    .line 483
    :cond_d
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 484
    .line 485
    if-nez v4, :cond_e

    .line 486
    .line 487
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 488
    .line 489
    :cond_e
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-le v4, v3, :cond_1

    .line 501
    .line 502
    goto/16 :goto_4

    .line 503
    .line 504
    :goto_9
    :try_start_6
    new-instance v5, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 507
    .line 508
    .line 509
    const-string v6, "Target Exception: "

    .line 510
    .line 511
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4}, Lbsh/TargetError;->getMessage()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v4}, Lbsh/TargetError;->inNativeCode()Z

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    if-eqz v5, :cond_f

    .line 533
    .line 534
    sget-object v5, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 535
    .line 536
    invoke-virtual {v5}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    check-cast v5, Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    invoke-virtual {p0}, Lbsh/Interpreter;->getErr()Ljava/io/PrintStream;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    invoke-virtual {v4, v5, v6}, Lbsh/TargetError;->printStackTrace(ZLjava/io/PrintStream;)V

    .line 551
    .line 552
    .line 553
    :cond_f
    iget-boolean v5, p0, Lbsh/Interpreter;->interactive:Z

    .line 554
    .line 555
    if-nez v5, :cond_10

    .line 556
    .line 557
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z

    .line 558
    .line 559
    :cond_10
    const-string v5, "$_e"

    .line 560
    .line 561
    invoke-virtual {v4}, Lbsh/TargetError;->getTarget()Ljava/lang/Throwable;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    invoke-virtual {p0, v5, v4}, Lbsh/Interpreter;->setu(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 566
    .line 567
    .line 568
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 576
    .line 577
    .line 578
    move-result v4

    .line 579
    if-le v4, v3, :cond_1

    .line 580
    .line 581
    goto/16 :goto_4

    .line 582
    .line 583
    :goto_a
    :try_start_7
    new-instance v5, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 586
    .line 587
    .line 588
    const-string v6, "Internal Error: "

    .line 589
    .line 590
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v4

    .line 604
    invoke-virtual {p0, v4}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 608
    .line 609
    if-nez v4, :cond_11

    .line 610
    .line 611
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 612
    .line 613
    :cond_11
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    if-le v4, v3, :cond_1

    .line 625
    .line 626
    goto/16 :goto_4

    .line 627
    .line 628
    :goto_b
    :try_start_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    const-string v6, "Parser Error: "

    .line 634
    .line 635
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    sget-object v6, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 639
    .line 640
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v7

    .line 644
    check-cast v7, Ljava/lang/Boolean;

    .line 645
    .line 646
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    invoke-virtual {v4, v7}, Lbsh/ParseException;->getMessage(Z)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-virtual {p0, v5}, Lbsh/Interpreter;->error(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    check-cast v5, Ljava/lang/Boolean;

    .line 669
    .line 670
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    if-eqz v5, :cond_12

    .line 675
    .line 676
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    .line 677
    .line 678
    .line 679
    :cond_12
    iget-boolean v4, p0, Lbsh/Interpreter;->interactive:Z

    .line 680
    .line 681
    if-nez v4, :cond_13

    .line 682
    .line 683
    iput-boolean v3, p0, Lbsh/Interpreter;->EOF:Z

    .line 684
    .line 685
    :cond_13
    iget-object v4, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 686
    .line 687
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    invoke-virtual {v4, v5}, Lbsh/Parser;->reInitInput(Ljava/io/Reader;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 692
    .line 693
    .line 694
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    invoke-virtual {v4}, Lbsh/JJTParserState;->reset()V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    if-le v4, v3, :cond_1

    .line 706
    .line 707
    goto/16 :goto_4

    .line 708
    .line 709
    :goto_c
    invoke-direct {p0}, Lbsh/Interpreter;->get_jjtree()Lbsh/JJTParserState;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-virtual {v2}, Lbsh/JJTParserState;->reset()V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0}, Lbsh/CallStack;->depth()I

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    if-le v2, v3, :cond_14

    .line 721
    .line 722
    invoke-virtual {v0}, Lbsh/CallStack;->clear()V

    .line 723
    .line 724
    .line 725
    iget-object v2, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 726
    .line 727
    invoke-virtual {v0, v2}, Lbsh/CallStack;->push(Lbsh/NameSpace;)V

    .line 728
    .line 729
    .line 730
    :cond_14
    throw v1

    .line 731
    :cond_15
    iget-boolean v0, p0, Lbsh/Interpreter;->interactive:Z

    .line 732
    .line 733
    if-eqz v0, :cond_16

    .line 734
    .line 735
    iget-boolean v0, p0, Lbsh/Interpreter;->exitOnEOF:Z

    .line 736
    .line 737
    if-eqz v0, :cond_16

    .line 738
    .line 739
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 740
    .line 741
    .line 742
    :cond_16
    return-void

    .line 743
    :cond_17
    const-string v0, "bsh Interpreter: No stream"

    .line 744
    .line 745
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 746
    .line 747
    .line 748
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
    move-result-object p1

    .line 25
    invoke-virtual {p1, p2, v3}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception p1

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
    sget-object p2, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 36
    .line 37
    invoke-virtual {p1, p2, v0}, Lbsh/UtilEvalError;->toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    throw p1
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
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 6
    .line 7
    .line 8
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

.method public setConsole(Lbsh/ConsoleAssignable;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    iget-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

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
    iget-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 27
    .line 28
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p1, v0}, Lbsh/Parser;->ReInit(Ljava/io/Reader;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    :goto_0
    new-instance p1, Lbsh/Parser;

    .line 37
    .line 38
    invoke-virtual {p0}, Lbsh/Interpreter;->getIn()Ljava/io/Reader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {p1, v0}, Lbsh/Parser;-><init>(Ljava/io/Reader;)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lbsh/Interpreter;->parser:Lbsh/Parser;

    .line 46
    .line 47
    return-void
.end method

.method public setConsole(Lbsh/ConsoleInterface;)V
    .locals 1

    .line 48
    new-instance v0, Lbsh/Interpreter$Console;

    invoke-direct {v0, p1}, Lbsh/Interpreter$Console;-><init>(Lbsh/ConsoleInterface;)V

    invoke-virtual {p0, v0}, Lbsh/Interpreter;->setConsole(Lbsh/ConsoleAssignable;)V

    return-void
.end method

.method public setErr(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleAssignable;->setErr(Ljava/io/PrintStream;)V

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
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleAssignable;->setIn(Ljava/io/Reader;)V

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
    move-exception p1

    .line 27
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_0
    return-void
.end method

.method public setOut(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Interpreter;->console:Lbsh/ConsoleAssignable;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lbsh/ConsoleAssignable;->setOut(Ljava/io/PrintStream;)V

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
    move-exception p1

    .line 6
    const-string p2, "set: "

    .line 7
    .line 8
    invoke-static {p2, p1}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public showEvalString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x50

    .line 6
    .line 7
    if-le v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v0, " . . . "

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :cond_0
    const-string v0, " of: ``"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/16 v0, 0xa

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const/16 v0, 0xd

    .line 35
    .line 36
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "\'\'"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public source(Ljava/io/File;)Ljava/lang/Object;
    .locals 1

    .line 71
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;
    .locals 2

    .line 64
    const-string v0, "Sourcing file: "

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 65
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Lbsh/FileReader;

    invoke-direct {v1, p1}, Lbsh/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 66
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 68
    throw p1
.end method

.method public source(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 72
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public source(Ljava/lang/String;Lbsh/NameSpace;)Ljava/lang/Object;
    .locals 0

    .line 69
    invoke-virtual {p0, p1}, Lbsh/Interpreter;->pathToFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lbsh/Interpreter;->source(Ljava/io/File;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public source(Ljava/net/URL;)Ljava/lang/Object;
    .locals 1

    .line 70
    iget-object v0, p0, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    invoke-virtual {p0, p1, v0}, Lbsh/Interpreter;->source(Ljava/net/URL;Lbsh/NameSpace;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    new-instance v0, Lbsh/FileReader;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lbsh/FileReader;-><init>(Ljava/io/InputStream;)V

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
    move-result-object p1
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
    return-object p1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p1

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
    move-exception p2

    .line 51
    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    throw p1
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
    move-exception p2

    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    throw p1
.end method

.method public terminatedScript(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public unset(Ljava/lang/String;)V
    .locals 4

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
    move-result-object v1

    .line 18
    iget v2, v1, Lbsh/LHS;->type:I

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iget-object p1, v1, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 23
    .line 24
    invoke-virtual {v1}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Lbsh/NameSpace;->unsetVariable(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, Lbsh/EvalError;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget-object v0, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 49
    .line 50
    new-instance v2, Lbsh/CallStack;

    .line 51
    .line 52
    invoke-direct {v2}, Lbsh/CallStack;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p1, v0, v2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 56
    .line 57
    .line 58
    throw v1
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    :goto_0
    new-instance v0, Lbsh/EvalError;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 66
    .line 67
    new-instance v3, Lbsh/CallStack;

    .line 68
    .line 69
    invoke-direct {v3}, Lbsh/CallStack;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1, v2, v3, p1}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v0
.end method
