.class Lcom/android/dx/command/dexer/Main$DexWriter;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DexWriter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "[B>;"
    }
.end annotation


# instance fields
.field private final dexFile:Lcom/android/dx/dex/file/DexFile;

.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$DexWriter;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dexer/Main$DexWriter;->dexFile:Lcom/android/dx/dex/file/DexFile;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/android/dx/command/dexer/Main$DexWriter;-><init>(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 10
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$DexWriter;->call()[B

    move-result-object p0

    return-object p0
.end method

.method public call()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DexWriter;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$DexWriter;->dexFile:Lcom/android/dx/dex/file/DexFile;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/android/dx/command/dexer/Main;->access$3000(Lcom/android/dx/command/dexer/Main;Lcom/android/dx/dex/file/DexFile;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
