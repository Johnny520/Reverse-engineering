.class public final synthetic LYue/ۥۣۣۢۦ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic ۥ:Ljava/util/concurrent/CompletableFuture;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39d

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/CompletableFuture;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۣۢۦ;->ۥ:Ljava/util/concurrent/CompletableFuture;

    return-void
.end method


# virtual methods
.method public final native invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end method
