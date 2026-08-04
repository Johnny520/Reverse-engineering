.class Lorg/simpleframework/xml/stream/StreamReader;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lorg/simpleframework/xml/stream/EventReader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/simpleframework/xml/stream/StreamReader$End;,
        Lorg/simpleframework/xml/stream/StreamReader$Text;,
        Lorg/simpleframework/xml/stream/StreamReader$Start;,
        Lorg/simpleframework/xml/stream/StreamReader$Entry;
    }
.end annotation


# instance fields
.field private peek:Lorg/simpleframework/xml/stream/EventNode;

.field private reader:Lyyds/ᛸᛴᛳᛶ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᛴᛳᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private attribute(Lyyds/ᲀᛳᲁᛳ;)Lorg/simpleframework/xml/stream/StreamReader$Entry;
    .locals 0

    .line 1
    new-instance p0, Lorg/simpleframework/xml/stream/StreamReader$Entry;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/simpleframework/xml/stream/StreamReader$Entry;-><init>(Lyyds/ᲀᛳᲁᛳ;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method private build(Lorg/simpleframework/xml/stream/StreamReader$Start;)Lorg/simpleframework/xml/stream/StreamReader$Start;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lorg/simpleframework/xml/stream/StreamReader$Start;->getAttributes()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, v2}, Lorg/simpleframework/xml/stream/StreamReader;->attribute(Lyyds/ᲀᛳᲁᛳ;)Lorg/simpleframework/xml/stream/StreamReader$Entry;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Lorg/simpleframework/xml/stream/StreamReader$Entry;->isReserved()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_2
    return-object p1
.end method

.method private end()Lorg/simpleframework/xml/stream/StreamReader$End;
    .locals 1

    .line 1
    new-instance p0, Lorg/simpleframework/xml/stream/StreamReader$End;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lorg/simpleframework/xml/stream/StreamReader$End;-><init>(Lorg/simpleframework/xml/stream/StreamReader$1;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method private read()Lorg/simpleframework/xml/stream/EventNode;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method private start(Lyyds/ᲀᲀᲈᛴ;)Lorg/simpleframework/xml/stream/StreamReader$Start;
    .locals 1

    .line 1
    new-instance v0, Lorg/simpleframework/xml/stream/StreamReader$Start;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/simpleframework/xml/stream/StreamReader$Start;-><init>(Lyyds/ᲀᲀᲈᛴ;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lorg/simpleframework/xml/stream/StreamReader;->build(Lorg/simpleframework/xml/stream/StreamReader$Start;)Lorg/simpleframework/xml/stream/StreamReader$Start;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0
.end method

.method private text(Lyyds/ᲀᲀᲈᛴ;)Lorg/simpleframework/xml/stream/StreamReader$Text;
    .locals 0

    .line 1
    new-instance p0, Lorg/simpleframework/xml/stream/StreamReader$Text;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/simpleframework/xml/stream/StreamReader$Text;-><init>(Lyyds/ᲀᲀᲈᛴ;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public next()Lorg/simpleframework/xml/stream/EventNode;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader;->peek:Lorg/simpleframework/xml/stream/EventNode;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/simpleframework/xml/stream/StreamReader;->read()Lorg/simpleframework/xml/stream/EventNode;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lorg/simpleframework/xml/stream/StreamReader;->peek:Lorg/simpleframework/xml/stream/EventNode;

    .line 12
    .line 13
    return-object v0
.end method

.method public peek()Lorg/simpleframework/xml/stream/EventNode;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader;->peek:Lorg/simpleframework/xml/stream/EventNode;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/simpleframework/xml/stream/StreamReader;->next()Lorg/simpleframework/xml/stream/EventNode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lorg/simpleframework/xml/stream/StreamReader;->peek:Lorg/simpleframework/xml/stream/EventNode;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method
