.class public final synthetic LYue/ۥ۠ۦۦ۟;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۦۦۢ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f7

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۠ۦۦۢ;Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۦۦ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۦۦۢ;

    iput-object p2, p0, LYue/ۥ۠ۦۦ۟;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
