.class public final synthetic LYue/ۥۢۤ۠ۢ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:[Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x128

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>([Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۤ۠ۢ;->ۥۣ۟۟۠:[Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۢۤ۠ۢ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, LYue/ۥۢۤ۠ۢ;->ۥ۟۟۠ۥ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
