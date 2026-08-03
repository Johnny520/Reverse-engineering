.class public LYue/ۥۡۦ۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢ۠ۥ;


# instance fields
.field public ۥ:[Ljava/lang/String;

.field public ۥ۟:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;[Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, p3, [Ljava/lang/String;

    iput-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    new-array p3, p3, [Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length p3, v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length p3, p1

    invoke-static {p2, v1, p1, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static ۥ۟۟۟۟([Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨۤۥ;

    invoke-direct {v0}, LYue/ۥ۠ۨۤۥ;-><init>()V

    new-instance v1, Ljava/io/FileReader;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥ۠ۨۤۥ;->ۥ۟۠ۡۧ(Ljava/io/Reader;)V

    :goto_0
    invoke-virtual {v0}, LYue/ۥ۠ۨۤۥ;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۠ۨۤۥ;->ۥ۟۟۟ۨ()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "context["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, LYue/ۥ۠ۨۤۥ;->ۥ۟()LYue/ۥۡۢ۠ۥ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-virtual {v0}, LYue/ۥ۠ۨۤۥ;->ۥ۟()LYue/ۥۡۢ۠ۥ;

    move-result-object p0

    const-string v1, "a"

    invoke-interface {p0, v1}, LYue/ۥۡۢ۠ۥ;->ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Found prefix:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LYue/ۥ۠ۨۤۥ;->next()I

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_6

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v1, v1, v0

    if-nez v1, :cond_2

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_1
    if-le v1, v0, :cond_1

    iget-object v2, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v2, v2, v1

    if-nez v2, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_1
    const-string p1, ""

    return-object p1

    :cond_2
    iget-object v2, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-le v2, v0, :cond_4

    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_4
    return-object v1

    :cond_5
    :goto_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_6
    const-string v0, "http://www.w3.org/XML/1998/namespace"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p1, "xml"

    return-object p1

    :cond_7
    const-string v0, "http://www.w3.org/2000/xmlns/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "xmlns"

    return-object p1

    :cond_8
    const/4 p1, 0x0

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uri may not be empty string"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uri may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {p0, v3}, LYue/ۥۡۦ۟ۤ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "<->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public ۥ۟()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v1, v1, v0

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const-string v0, "xml"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "http://www.w3.org/XML/1998/namespace"

    return-object p1

    :cond_2
    const-string v0, "xmlns"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "http://www.w3.org/2000/xmlns/"

    return-object p1

    :cond_3
    iget-object p1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_5

    iget-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v0, v0, p1

    if-nez v0, :cond_4

    iget-object v0, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Prefix may not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 5

    if-eqz p1, :cond_8

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_6

    iget-object v2, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {p0, v2}, LYue/ۥۡۦ۟ۤ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    :goto_1
    if-le v3, v1, :cond_4

    iget-object v4, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v4, v4, v3

    if-nez v4, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    iget-object v3, p0, LYue/ۥۡۦ۟ۤ;->ۥ۟:[Ljava/lang/String;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    :goto_2
    if-le v3, v1, :cond_4

    iget-object v4, p0, LYue/ۥۡۦ۟ۤ;->ۥ:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uri may not be empty string"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "uri may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
