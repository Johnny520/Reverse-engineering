.class public Lcom/esotericsoftware/kryo/io/KryoObjectOutput;
.super Lcom/esotericsoftware/kryo/io/KryoDataOutput;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/ObjectOutput;


# instance fields
.field private final kryo:Lcom/esotericsoftware/kryo/Kryo;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/io/KryoDataOutput;-><init>(Lcom/esotericsoftware/kryo/io/Output;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoObjectOutput;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Output;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeObject(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/KryoObjectOutput;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataOutput;->output:Lcom/esotericsoftware/kryo/io/Output;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
