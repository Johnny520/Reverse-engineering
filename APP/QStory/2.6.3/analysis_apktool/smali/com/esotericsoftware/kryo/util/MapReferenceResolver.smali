.class public Lcom/esotericsoftware/kryo/util/MapReferenceResolver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/esotericsoftware/kryo/ReferenceResolver;


# static fields
.field private static final DEFAULT_CAPACITY:I = 0x800


# instance fields
.field protected kryo:Lcom/esotericsoftware/kryo/Kryo;

.field private final maximumCapacity:I

.field protected final readObjects:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field protected final writtenObjects:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x800

    .line 21
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->writtenObjects:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput p1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->maximumCapacity:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public addWrittenObject(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->writtenObjects:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 2
    .line 3
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->put(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return v0
.end method

.method public getReadObject(Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getWrittenId(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->writtenObjects:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;->get(Ljava/lang/Object;I)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public nextReadId(Ljava/lang/Class;)I
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return p1
.end method

.method public reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->maximumCapacity:I

    .line 13
    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget v1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->maximumCapacity:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->writtenObjects:Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;

    .line 29
    .line 30
    iget p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->maximumCapacity:I

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->clear(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setKryo(Lcom/esotericsoftware/kryo/Kryo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 2
    .line 3
    return-void
.end method

.method public setReadObject(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;->readObjects:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public useReferences(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->isWrapperClass(Ljava/lang/Class;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->isEnum(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method
