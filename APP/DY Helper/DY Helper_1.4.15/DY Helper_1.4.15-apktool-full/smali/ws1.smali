.class public final Lws1;
.super LΣ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ζ:Lws1;


# instance fields
.field public final ε:Lzw0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lws1;

    .line 2
    .line 3
    sget-object v1, Lzw0;->σ:Lzw0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lws1;-><init>(Lzw0;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lws1;->ζ:Lws1;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lzw0;

    .line 2
    .line 3
    invoke-direct {v0}, Lzw0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lws1;->ε:Lzw0;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lzw0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 13
    iput-object p1, p0, Lws1;->ε:Lzw0;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzw0;->α(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lws1;->ε:Lzw0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lzw0;->γ()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzw0;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lzw0;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzw0;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lww0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p0, v1}, Lww0;-><init>(Lzw0;I)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzw0;->γ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lzw0;->η(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-gez p1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lzw0;->λ(I)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lws1;->ε:Lzw0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lzw0;->γ()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lws1;->ε:Lzw0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lzw0;->γ()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget-object p0, p0, Lws1;->ε:Lzw0;

    .line 2
    .line 3
    iget p0, p0, Lzw0;->ν:I

    .line 4
    .line 5
    return p0
.end method
