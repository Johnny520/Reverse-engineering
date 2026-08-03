.class public final Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuexin/panel/utils/CrashMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;->ۥ:Ljava/lang/String;

    invoke-static {p2}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;->ۥ۟:Ljava/lang/String;

    iput-wide p3, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;->ۥ۟۟:J

    return-void
.end method
