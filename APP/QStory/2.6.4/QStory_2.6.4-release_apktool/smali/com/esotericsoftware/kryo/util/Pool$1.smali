.class Lcom/esotericsoftware/kryo/util/Pool$1;
.super Ljava/util/concurrent/LinkedBlockingQueue;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/esotericsoftware/kryo/util/Pool;-><init>(ZZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/LinkedBlockingQueue<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/esotericsoftware/kryo/util/Pool;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/util/Pool;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/Pool$1;->this$0:Lcom/esotericsoftware/kryo/util/Pool;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
