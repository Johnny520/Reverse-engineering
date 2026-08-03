.class public final synthetic LYue/ۥۡۦۢۡ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۤ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:J

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3fc

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۡۦۢۤ;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۢۡ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۤ;

    iput-object p2, p0, LYue/ۥۡۦۢۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-wide p3, p0, LYue/ۥۡۦۢۡ;->ۥ۟۟۠ۥ:J

    iput-object p5, p0, LYue/ۥۡۦۢۡ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
