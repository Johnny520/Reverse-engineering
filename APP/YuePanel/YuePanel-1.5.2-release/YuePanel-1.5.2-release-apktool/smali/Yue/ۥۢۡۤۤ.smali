.class public final synthetic LYue/ۥۢۡۤۤ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x79

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡۤۤ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p2, p0, LYue/ۥۢۡۤۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۧ۠;

    iput-object p3, p0, LYue/ۥۢۡۤۤ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
