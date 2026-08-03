.class public final synthetic LYue/ۥۣۡ۟;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a9

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡ۟;->ۥۣ۟۟۠:LYue/ۥۣۡ۟ۢ$ۥۣ۟۟۟;

    iput-object p2, p0, LYue/ۥۣۡ۟;->ۥ۟۟۠ۤ:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
