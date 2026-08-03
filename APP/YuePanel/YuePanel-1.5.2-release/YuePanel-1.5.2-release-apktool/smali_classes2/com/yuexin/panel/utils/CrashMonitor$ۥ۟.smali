.class public final Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yuexin/panel/utils/CrashMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟۠:Ljava/lang/String;

.field public final ۥ۟۟۟ۡ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xfc

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ:Ljava/lang/String;

    invoke-static {p2}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟:Ljava/lang/String;

    invoke-static {p3}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟۟:Ljava/lang/String;

    invoke-static {p4}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟۟۟:Ljava/lang/String;

    invoke-static {p5}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟۟۟۟:Ljava/lang/String;

    invoke-static {p6}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟۟۟۠:Ljava/lang/String;

    invoke-static {p7}, Lcom/yuexin/panel/utils/CrashMonitor;->access$300(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/lang/String;)Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;
.end method

.method public static native ۥ۟(Ljava/lang/String;)Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;
.end method
