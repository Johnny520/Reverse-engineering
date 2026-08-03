.class public final Lc0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:J

.field public static volatile b:Lc0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lc0/x;

    const/4 v5, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lc0/x;-><init>(ZZZZZ)V

    sput-object v6, Lc0/r;->b:Lc0/x;

    return-void
.end method

.method public static a()Lc0/x;
    .locals 9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lc0/r;->a:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0xbb8

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    sget-object v0, Lc0/r;->b:Lc0/x;

    goto :goto_0

    :cond_0
    sput-wide v0, Lc0/r;->a:J

    new-instance v0, Lc0/x;

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "auto_login_win_enabled"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v3

    const-string v1, "auto_login_win_sync_msg"

    const/4 v4, 0x1

    invoke-static {v1, v4}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v5

    const-string v1, "auto_login_win_show_device"

    invoke-static {v1, v4}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v6

    const-string v1, "auto_login_win_auto_device"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v7

    const-string v1, "auto_login_win_auto_click"

    invoke-static {v1, v4}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v8

    move-object v1, v0

    move v2, v3

    move v3, v5

    move v4, v6

    move v5, v7

    move v6, v8

    invoke-direct/range {v1 .. v6}, Lc0/x;-><init>(ZZZZZ)V

    sput-object v0, Lc0/r;->b:Lc0/x;

    sget-object v0, Lc0/r;->b:Lc0/x;

    :goto_0
    return-object v0
.end method
