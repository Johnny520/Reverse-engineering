.class public Ld6/f;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Ljava/lang/StringBuffer;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const/4 p2, 0x0

    .line 16
    :goto_0
    invoke-direct {p0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    instance-of p2, p1, Ld6/f;

    .line 20
    .line 21
    const/16 p3, 0xc8

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    check-cast p1, Ld6/f;

    .line 26
    .line 27
    iget-object p1, p1, Ld6/f;->g:Ljava/lang/StringBuffer;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance p2, Ljava/lang/StringBuffer;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, p3

    .line 40
    invoke-direct {p2, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Ld6/f;->g:Ljava/lang/StringBuffer;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance p1, Ljava/lang/StringBuffer;

    .line 50
    .line 51
    invoke-direct {p1, p3}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ld6/f;->g:Ljava/lang/StringBuffer;

    .line 55
    .line 56
    return-void
.end method

.method public static varargs a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ld6/f;
    .locals 3

    .line 1
    instance-of v0, p0, Ld6/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ld6/f;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ld6/f;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, p0, v2, v1}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, Ld6/f;->g:Ljava/lang/StringBuffer;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 25
    .line 26
    .line 27
    const-string v0, "\n"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/16 p1, 0xa

    .line 36
    .line 37
    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final printStackTrace(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ld6/f;->g:Ljava/lang/StringBuffer;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final printStackTrace(Ljava/io/PrintWriter;)V
    .locals 1

    .line 10
    invoke-super {p0, p1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 11
    iget-object v0, p0, Ld6/f;->g:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    return-void
.end method
