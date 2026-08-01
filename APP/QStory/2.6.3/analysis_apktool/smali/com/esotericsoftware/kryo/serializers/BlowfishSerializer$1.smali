.class Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer$1;
.super Lcom/esotericsoftware/kryo/io/Output;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;Ljava/io/OutputStream;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer$1;->this$0:Lcom/esotericsoftware/kryo/serializers/BlowfishSerializer;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lcom/esotericsoftware/kryo/io/Output;-><init>(Ljava/io/OutputStream;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
.end method
