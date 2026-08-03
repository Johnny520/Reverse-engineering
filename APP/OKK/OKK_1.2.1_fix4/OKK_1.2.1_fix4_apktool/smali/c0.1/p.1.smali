.class public final Lc0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:J

.field public static volatile b:Lc0/q;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v11, Lc0/q;

    const/4 v10, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lc0/q;-><init>(ZZZLjava/lang/String;ZZZZZZ)V

    sput-object v11, Lc0/p;->b:Lc0/q;

    return-void
.end method

.method public static a()Lc0/q;
    .locals 13

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lc0/p;->a:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1388

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    sget-object v0, Lc0/p;->b:Lc0/q;

    goto :goto_0

    :cond_0
    sput-wide v0, Lc0/p;->a:J

    new-instance v0, Lc0/q;

    sget-object v1, Lc0/h1;->a:Lc0/h1;

    const-string v1, "anti_revoke"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v3

    const-string v1, "revoke_notice_enabled"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v4

    const-string v1, "anti_revoke_keep_self"

    const/4 v5, 0x0

    invoke-static {v1, v5}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v5

    const-string v1, "anti_revoke_notice_text"

    const-string v6, "{name}\u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f"

    invoke-static {v1, v6}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "media_protect_enabled"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v7

    const-string v1, "anti_moments_delete"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v8

    const-string v1, "swipe_quote"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v9

    const-string v1, "bubble_enabled"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v10

    const-string v1, "settings_entry_enabled"

    invoke-static {v1, v2}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v11

    const/4 v12, 0x0

    move-object v1, v0

    move v2, v3

    move v3, v4

    move v4, v5

    move-object v5, v6

    move v6, v7

    move v7, v8

    move v8, v9

    move v9, v12

    invoke-direct/range {v1 .. v11}, Lc0/q;-><init>(ZZZLjava/lang/String;ZZZZZZ)V

    sput-object v0, Lc0/p;->b:Lc0/q;

    sget-object v0, Lc0/p;->b:Lc0/q;

    :goto_0
    return-object v0
.end method
