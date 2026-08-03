.class public final Lc0/F0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:J

.field public static volatile b:Lc0/J0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/J0;

    invoke-direct {v0}, Lc0/J0;-><init>()V

    sput-object v0, Lc0/F0;->b:Lc0/J0;

    return-void
.end method

.method public static a()Lc0/J0;
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lc0/F0;->a:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    sget-object v0, Lc0/F0;->b:Lc0/J0;

    goto :goto_0

    :cond_0
    sput-wide v0, Lc0/F0;->a:J

    new-instance v0, Lc0/J0;

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "input_stats_enabled"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v1

    const-string v3, "input_stats_count_send"

    invoke-static {v3, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v2

    const-string v3, "input_stats_template"

    const-string v4, "\u4eca\u65e5\u5df2\u53d1${totalMsg}\u6761"

    invoke-static {v3, v4}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Lc0/J0;-><init>(Ljava/lang/String;ZZ)V

    sput-object v0, Lc0/F0;->b:Lc0/J0;

    sget-object v0, Lc0/F0;->b:Lc0/J0;

    :goto_0
    return-object v0
.end method
