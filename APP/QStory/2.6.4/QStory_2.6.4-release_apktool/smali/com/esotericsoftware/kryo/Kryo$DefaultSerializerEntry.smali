.class final Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
