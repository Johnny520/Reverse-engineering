.class final Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/Kryo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultSerializerEntry"
.end annotation


# instance fields
.field final serializerFactory:Lcom/esotericsoftware/kryo/SerializerFactory;

.field final type:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->type:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->serializerFactory:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 7
    .line 8
    return-void
.end method
