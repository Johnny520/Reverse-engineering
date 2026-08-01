.class Lcom/android/dx/cf/code/Ropper$CatchInfo;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CatchInfo"
.end annotation


# instance fields
.field private final setups:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/android/dx/rop/type/Type;",
            "Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/android/dx/cf/code/Ropper;


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/code/Ropper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$1;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper$CatchInfo;-><init>(Lcom/android/dx/cf/code/Ropper;)V

    return-void
.end method


# virtual methods
.method public getSetup(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->this$0:Lcom/android/dx/cf/code/Ropper;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/android/dx/cf/code/Ropper;->access$000(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;->getNextLabel()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v1, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;-><init>(Lcom/android/dx/rop/type/Type;I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_0
    return-object v0
.end method

.method public getSetups()Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$CatchInfo;->setups:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
