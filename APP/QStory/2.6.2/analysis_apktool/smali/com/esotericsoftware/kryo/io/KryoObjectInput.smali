.class public Lcom/esotericsoftware/kryo/io/KryoObjectInput;
.super Lcom/esotericsoftware/kryo/io/KryoDataInput;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/ObjectInput;


# instance fields
.field private final kryo:Lcom/esotericsoftware/kryo/Kryo;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/esotericsoftware/kryo/io/KryoDataInput;-><init>(Lcom/esotericsoftware/kryo/io/Input;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/io/KryoObjectInput;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public available()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public read()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/io/Input;->read()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public read([B)I
    .locals 0

    .line 8
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/io/Input;->read([B)I

    move-result p0

    return p0
.end method

.method public read([BII)I
    .locals 0

    .line 9
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/io/Input;->read([BII)I

    move-result p0

    return p0
.end method

.method public readObject()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/io/KryoObjectInput;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/kryo/Kryo;->readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public skip(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/io/KryoDataInput;->input:Lcom/esotericsoftware/kryo/io/Input;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/io/Input;->skip(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
