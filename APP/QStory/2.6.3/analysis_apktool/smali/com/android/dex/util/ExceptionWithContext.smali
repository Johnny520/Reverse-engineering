.class public Lcom/android/dex/util/ExceptionWithContext;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private context:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, v0}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const/4 p1, 0x0

    .line 12
    :goto_0
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, p2, Lcom/android/dex/util/ExceptionWithContext;

    .line 16
    .line 17
    const/16 v0, 0xc8

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    check-cast p2, Lcom/android/dex/util/ExceptionWithContext;

    .line 22
    .line 23
    iget-object p1, p2, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance p2, Ljava/lang/StringBuffer;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    add-int/2addr v1, v0

    .line 36
    invoke-direct {p2, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/StringBuffer;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, v0, p1}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/android/dex/util/ExceptionWithContext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lcom/android/dex/util/ExceptionWithContext;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/android/dex/util/ExceptionWithContext;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p0, v0

    .line 14
    :goto_0
    invoke-virtual {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public addContext(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    .line 7
    .line 8
    const-string v0, "\n"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 17
    .line 18
    const/16 p1, 0xa

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    const-string p0, "str == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public getContext()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public printContext(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public printContext(Ljava/io/PrintWriter;)V
    .locals 1

    .line 14
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 15
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-void
.end method

.method public printStackTrace(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public printStackTrace(Ljava/io/PrintWriter;)V
    .locals 0

    .line 10
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 11
    iget-object p0, p0, Lcom/android/dex/util/ExceptionWithContext;->context:Ljava/lang/StringBuffer;

    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    return-void
.end method
