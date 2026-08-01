.class Lcom/android/dx/command/dexer/Main$ClassParserTask;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ClassParserTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/android/dx/cf/direct/DirectClassFile;",
        ">;"
    }
.end annotation


# instance fields
.field bytes:[B

.field name:Ljava/lang/String;

.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[B)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->bytes:[B

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/android/dx/command/dexer/Main$ClassParserTask;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[B)V

    return-void
.end method


# virtual methods
.method public call()Lcom/android/dx/cf/direct/DirectClassFile;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$ClassParserTask;->bytes:[B

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Lcom/android/dx/command/dexer/Main;->access$1600(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[B)Lcom/android/dx/cf/direct/DirectClassFile;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$ClassParserTask;->call()Lcom/android/dx/cf/direct/DirectClassFile;

    move-result-object p0

    return-object p0
.end method
