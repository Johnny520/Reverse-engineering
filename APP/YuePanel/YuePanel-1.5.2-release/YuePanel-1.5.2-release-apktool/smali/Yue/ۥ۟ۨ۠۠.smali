.class public LYue/ۥ۟ۨ۠۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۡۧ;


# instance fields
.field public ۥ:Ljava/lang/String;

.field public ۥ۟:Ljava/util/Vector;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    .line 5
    new-instance p1, Ljava/util/Vector;

    invoke-direct {p1}, Ljava/util/Vector;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LYue/ۥ۟ۨ۠۠;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    check-cast p1, LYue/ۥ۟ۨ۠۠;

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v2, p1, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    if-eqz v2, :cond_2

    return v1

    :cond_2
    if-eqz v0, :cond_3

    iget-object v2, p1, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    iget-object p1, p1, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ(Ljava/io/PrintWriter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "<!ATTLIST "

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "           "

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۨ۠ۡ;

    invoke-virtual {v1, p1}, LYue/ۥ۟ۨ۠ۡ;->ۥ(Ljava/io/PrintWriter;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/io/PrintWriter;->println()V

    goto :goto_0

    :cond_0
    const-string v1, ">"

    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟(I)LYue/ۥ۟ۨ۠ۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۨ۠ۡ;

    return-object p1
.end method

.method public ۥ۟۟()[LYue/ۥ۟ۨ۠ۡ;
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v0, v0, [LYue/ۥ۟ۨ۠ۡ;

    iget-object v1, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->copyInto([Ljava/lang/Object;)V

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۟ۨ۠ۡ;I)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    invoke-virtual {v0, p1, p2}, Ljava/util/Vector;->setElementAt(Ljava/lang/Object;I)V

    return-void
.end method

.method public ۥ۟۟۟۠([LYue/ۥ۟ۨ۠ۡ;)V
    .locals 3

    new-instance v0, Ljava/util/Vector;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥ۟ۨ۠۠;->ۥ۟:Ljava/util/Vector;

    aget-object v2, p1, v0

    invoke-virtual {v1, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۨ۠۠;->ۥ:Ljava/lang/String;

    return-void
.end method
